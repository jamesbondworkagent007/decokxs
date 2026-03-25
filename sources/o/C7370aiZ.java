package o;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: renamed from: o.aiZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7370aiZ {
    public InterfaceC7427ajd AEQbTJ;
    public AudioManager AYXKKw;
    public android.net.Uri AhwBna;
    public boolean EZpvd;
    public android.os.Handler KWHzl;
    public boolean OLrzqt;
    public AudioManager.OnAudioFocusChangeListener copydefault;
    public final java.lang.Object djBIcL;
    public InterfaceC58217yxC gEmmrt;
    public MediaPlayer valueOf;

    /* JADX INFO: renamed from: o.aiZ$ActionBar */
    /* JADX INFO: loaded from: classes22.dex */
    public static class ActionBar {
        public static C7370aiZ EZpvd = new C7370aiZ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.EZpvd;
    }

    private C7370aiZ() {
        this.djBIcL = new java.lang.Object();
        this.KWHzl = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static C7370aiZ EZpvd() {
        return ActionBar.EZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4 A[EXC_TOP_SPLITTER, PHI: r6
  0x00d4: PHI (r6v8 java.io.FileInputStream) = (r6v10 java.io.FileInputStream), (r6v13 java.io.FileInputStream) binds: [B:43:0x00f7, B:26:0x00d2] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(android.content.Context context, android.net.Uri uri, final int i, InterfaceC7427ajd interfaceC7427ajd) {
        java.lang.Throwable th;
        java.lang.Exception e;
        java.io.FileInputStream fileInputStream;
        android.net.Uri uri2;
        synchronized (this.djBIcL) {
            if (context == null || uri == null) {
                pUU.copydefault("OKAudioPlayerManager", "startPlay context or audioUri is null.");
                return;
            }
            InterfaceC7427ajd interfaceC7427ajd2 = this.AEQbTJ;
            if (interfaceC7427ajd2 != null && (uri2 = this.AhwBna) != null) {
                interfaceC7427ajd2.OLrzqt(uri2);
            }
            AhwBna();
            this.copydefault = new AudioManager.OnAudioFocusChangeListener() { // from class: o.ajb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i2) {
                    this.EZpvd.KWHzl(i2);
                }
            };
            java.io.FileInputStream fileInputStream2 = null;
            try {
                AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                this.AYXKKw = audioManager;
                copydefault(audioManager, true);
                this.AEQbTJ = interfaceC7427ajd;
                this.AhwBna = uri;
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.valueOf = mediaPlayer;
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: o.aja
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer2) {
                        this.AEQbTJ.OLrzqt(mediaPlayer2);
                    }
                });
                this.valueOf.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: o.aiZ.3
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public boolean onError(MediaPlayer mediaPlayer2, int i2, int i3) {
                        synchronized (C7370aiZ.this.djBIcL) {
                            C7370aiZ.this.AEQbTJ();
                        }
                        return true;
                    }
                });
                if (uri.toString().startsWith("file://android_asset/")) {
                    this.valueOf.setDataSource(context.getAssets().openFd(uri.toString().replaceAll("file://android_asset/", "")));
                    fileInputStream = null;
                } else {
                    fileInputStream = new java.io.FileInputStream(uri.getPath());
                    try {
                        try {
                            this.valueOf.setDataSource(fileInputStream.getFD());
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            fileInputStream2 = fileInputStream;
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (java.io.IOException e2) {
                                    pUU.AEQbTJ("OKAudioPlayerManager", "startPlay", e2);
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        pUU.AEQbTJ("OKAudioPlayerManager", "startPlay", e);
                        InterfaceC7427ajd interfaceC7427ajd3 = this.AEQbTJ;
                        if (interfaceC7427ajd3 != null) {
                            interfaceC7427ajd3.OLrzqt(uri);
                            this.AEQbTJ = null;
                        }
                        AEQbTJ();
                        if (fileInputStream != null) {
                        }
                    }
                }
                this.valueOf.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build());
                if (i > 0) {
                    this.valueOf.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: o.ajf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.media.MediaPlayer.OnPreparedListener
                        public final void onPrepared(MediaPlayer mediaPlayer2) {
                            this.EZpvd.OLrzqt(i, mediaPlayer2);
                        }
                    });
                    this.valueOf.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: o.aji
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.media.MediaPlayer.OnSeekCompleteListener
                        public final void onSeekComplete(MediaPlayer mediaPlayer2) {
                            mediaPlayer2.start();
                        }
                    });
                    this.valueOf.setLooping(this.OLrzqt);
                    this.valueOf.prepareAsync();
                } else {
                    this.valueOf.setLooping(this.OLrzqt);
                    this.valueOf.prepare();
                    this.valueOf.start();
                }
                InterfaceC7427ajd interfaceC7427ajd4 = this.AEQbTJ;
                if (interfaceC7427ajd4 != null) {
                    interfaceC7427ajd4.AEQbTJ(this.AhwBna);
                }
            } catch (java.lang.Exception e4) {
                e = e4;
                fileInputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (fileInputStream2 != null) {
                }
                throw th;
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (java.io.IOException e5) {
                    pUU.AEQbTJ("OKAudioPlayerManager", "startPlay", e5);
                }
            }
        }
    }

    public final /* synthetic */ void KWHzl(int i) {
        synchronized (this.djBIcL) {
            pUU.EZpvd("OKAudioPlayerManager", "OnAudioFocusChangeListener " + i);
            AudioManager audioManager = this.AYXKKw;
            if (audioManager != null && i == -1) {
                audioManager.abandonAudioFocus(this.copydefault);
                this.copydefault = null;
                this.KWHzl.post(new java.lang.Runnable() { // from class: o.aiZ.5
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (C7370aiZ.this.djBIcL) {
                            C7370aiZ c7370aiZ = C7370aiZ.this;
                            InterfaceC7427ajd interfaceC7427ajd = c7370aiZ.AEQbTJ;
                            if (interfaceC7427ajd != null) {
                                interfaceC7427ajd.copydefault(c7370aiZ.AhwBna);
                                C7370aiZ.this.AEQbTJ = null;
                            }
                        }
                    }
                });
                AEQbTJ();
            }
        }
    }

    public final /* synthetic */ void OLrzqt(MediaPlayer mediaPlayer) {
        synchronized (this.djBIcL) {
            InterfaceC7427ajd interfaceC7427ajd = this.AEQbTJ;
            if (interfaceC7427ajd != null) {
                interfaceC7427ajd.copydefault(this.AhwBna);
                this.AEQbTJ = null;
            }
            AEQbTJ();
        }
    }

    public final /* synthetic */ void OLrzqt(int i, MediaPlayer mediaPlayer) {
        try {
            java.lang.Thread.sleep(100L);
        } catch (java.lang.InterruptedException e) {
            pUU.AEQbTJ("OKAudioPlayerManager", "replay", e);
            java.lang.Thread.currentThread().interrupt();
        }
        int duration = this.valueOf.getDuration();
        int currentPosition = this.valueOf.getCurrentPosition();
        if (i >= duration) {
            i = currentPosition;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            mediaPlayer.seekTo(i, 3);
        } else {
            mediaPlayer.seekTo(i);
        }
    }

    public void djBIcL() {
        android.net.Uri uri;
        synchronized (this.djBIcL) {
            InterfaceC7427ajd interfaceC7427ajd = this.AEQbTJ;
            if (interfaceC7427ajd != null && (uri = this.AhwBna) != null) {
                interfaceC7427ajd.OLrzqt(uri);
            }
            AEQbTJ();
        }
    }

    public final void AEQbTJ() {
        AYXKKw();
        AhwBna();
        valueOf();
    }

    public final void AYXKKw() {
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final void valueOf() {
        AudioManager audioManager = this.AYXKKw;
        if (audioManager != null) {
            audioManager.setMode(0);
            copydefault(this.AYXKKw, false);
        }
        this.AYXKKw = null;
        this.AhwBna = null;
        this.AEQbTJ = null;
    }

    public final void AhwBna() {
        synchronized (this.djBIcL) {
            this.EZpvd = false;
            MediaPlayer mediaPlayer = this.valueOf;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.stop();
                    this.valueOf.reset();
                    this.valueOf.release();
                    this.valueOf = null;
                } catch (java.lang.IllegalStateException e) {
                    pUU.AEQbTJ("OKAudioPlayerManager", "resetMediaPlayer", e);
                }
            }
        }
    }

    public final void copydefault(AudioManager audioManager, boolean z) {
        synchronized (this.djBIcL) {
            try {
                if (audioManager == null) {
                    return;
                }
                if (z) {
                    audioManager.requestAudioFocus(this.copydefault, 3, 2);
                } else {
                    audioManager.abandonAudioFocus(this.copydefault);
                    this.copydefault = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void KWHzl(boolean z) {
        float f;
        MediaPlayer mediaPlayer = this.valueOf;
        if (mediaPlayer != null) {
            if (z) {
                this.EZpvd = true;
                f = 0.0f;
            } else {
                this.EZpvd = false;
                f = 1.0f;
            }
            mediaPlayer.setVolume(f, f);
        }
    }

    public int KWHzl() {
        MediaPlayer mediaPlayer = this.valueOf;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public void copydefault(boolean z) {
        this.OLrzqt = z;
        MediaPlayer mediaPlayer = this.valueOf;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }
}
