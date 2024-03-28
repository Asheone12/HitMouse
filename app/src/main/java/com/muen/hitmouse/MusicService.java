package com.muen.hitmouse;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

/**
 * @author muen
 * @version 1.0
 * Create by 2024/3/28 17:03
 */
public class MusicService extends Service {

    private MediaPlayer mediaPlayerBg;       //背景音乐
//    private MediaPlayer mediaPlayerKick;
//    private MediaPlayer mediaPlayerStart;

    public MusicService() {

    }

    @Override
    public void onCreate() {
        super.onCreate();

        mediaPlayerBg = MediaPlayer.create(MusicService.this, R.raw.back);
        mediaPlayerBg.setLooping(true);  //背景音乐循环
        mediaPlayerBg.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mediaPlayerBg.release();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}