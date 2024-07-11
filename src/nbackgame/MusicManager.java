/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nbackgame;

import javax.sound.sampled.*;
import java.io.File;

public class MusicManager {
    private Clip clip;

    private void loadSound(String soundFileName ) {
        
        try {
            File soundFile = new File(soundFileName);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadSound(String soundFileName, int tipo){
        loadSound(soundFileName);
        // si el tipo es para música de fondo
        if (tipo==1) {
           clip.addLineListener(new LineListener() {
                @Override
                public void update(LineEvent event) {
                    if (event.getType() == LineEvent.Type.STOP) {
                        clip.setFramePosition(0); // Reiniciar al principio
                        clip.start(); // Reproducir nuevamente
                    }
                }
            });
        } 
    }
    
    public void playSound() {
        if (clip != null) {
            clip.start();
        }
    }

    public void stopSound() {
        if (clip != null) {
            clip.stop();
        }
    }

    public void setVolume(float value) {
        if (clip != null) {
            FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            volume.setValue(value); // value debe estar entre volume.getMinimum() y volume.getMaximum()
        }
    }

    public boolean isPlaying() {
        return clip != null && clip.isRunning();
    }
}
