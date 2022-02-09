package com.example.kamateacchat;

import android.widget.Toast;
import android.media.MediaPlayer;

public class Utils
{
        public static void showToast(String text){
            Toast.makeText(AppBase.getContext(),text,Toast.LENGTH_LONG).show();
        }
        public static void playSound(int resId) {
            MediaPlayer mp;
            try {
                mp = MediaPlayer.create(AppBase.getContext(),resId);
                mp.setLooping(false);
                mp.setOnCompletionListener(mp1 -> {
                    try {
                        mp1.release();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                mp.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

