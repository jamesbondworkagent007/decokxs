package o;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.PowerManager;
import androidx.camera.video.AudioStats;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ocE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36501ocE implements android.hardware.SensorEventListener {
    public android.hardware.SensorManager AEQbTJ;
    public WeakReference<android.app.Activity> AYXKKw;
    public final android.os.Handler AhwBna;
    public android.net.Uri AkhnZx;
    public final java.lang.Object DbNXlk;
    public InterfaceC36500ocD EZpvd;
    public PowerManager.WakeLock KWHzl;
    public android.os.PowerManager OLrzqt;
    public android.hardware.Sensor copydefault;
    public AudioManager djBIcL;
    public SimpleExoPlayer fetchVPNInfo;
    public boolean gEmmrt;
    public WeakReference<android.content.Context> isConnected;
    public AudioManager.OnAudioFocusChangeListener valueOf;
    public InterfaceC58217yxC values;

    /* JADX INFO: renamed from: o.ocE$StateListAnimator */
    public static class StateListAnimator {
        public static C36501ocE KWHzl = new C36501ocE();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ(android.content.Context context) {
        return this.gEmmrt;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    private C36501ocE() {
        this.DbNXlk = new java.lang.Object();
        this.gEmmrt = false;
        this.AhwBna = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static C36501ocE OLrzqt() {
        return StateListAnimator.KWHzl;
    }

    public final android.content.Context copydefault() {
        WeakReference<android.content.Context> weakReference = this.isConnected;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final android.app.Activity EZpvd() {
        WeakReference<android.app.Activity> weakReference = this.AYXKKw;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        synchronized (this.DbNXlk) {
            float f = sensorEvent.values[0];
            pUU.EZpvd("AudioPlayManager", "onSensorChanged. range:" + f + "; max range:" + sensorEvent.sensor.getMaximumRange());
            if (this.copydefault != null && this.fetchVPNInfo != null && this.djBIcL != null) {
                boolean zCopydefault = copydefault(sensorEvent, f, AudioStats.AUDIO_AMPLITUDE_NONE);
                if (this.fetchVPNInfo.isPlaying()) {
                    if (zCopydefault) {
                        this.fetchVPNInfo.setPlayWhenReady(false);
                        this.djBIcL.setMode(0);
                        this.djBIcL.setSpeakerphoneOn(true);
                        long currentPosition = this.fetchVPNInfo.getCurrentPosition();
                        MediaItem mediaItemFromUri = MediaItem.fromUri(this.AkhnZx);
                        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
                        this.fetchVPNInfo.setMediaItem(mediaItemFromUri);
                        this.fetchVPNInfo.setAudioAttributes(audioAttributesBuild);
                        this.fetchVPNInfo.seekTo(currentPosition);
                        this.fetchVPNInfo.prepare();
                        this.fetchVPNInfo.setPlayWhenReady(true);
                        this.fetchVPNInfo.play();
                    } else {
                        this.fetchVPNInfo.stop();
                        this.djBIcL.setMode(3);
                        this.djBIcL.setSpeakerphoneOn(false);
                        AhwBna();
                    }
                } else if (f > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    this.djBIcL.setMode(0);
                    this.djBIcL.setSpeakerphoneOn(true);
                    values();
                }
            }
        }
    }

    public final boolean copydefault(android.hardware.SensorEvent sensorEvent, float f, double d) {
        boolean z;
        synchronized (this.DbNXlk) {
            java.lang.String str = android.os.Build.BRAND;
            if (str.equalsIgnoreCase("HUAWEI")) {
                z = f >= sensorEvent.sensor.getMaximumRange();
            } else {
                if (str.equalsIgnoreCase("ZTE")) {
                    d = 1.0d;
                } else if (str.equalsIgnoreCase("nubia")) {
                    d = 3.0d;
                }
                if (f > d) {
                }
            }
        }
        return z;
    }

    public final void values() {
        synchronized (this.DbNXlk) {
            PowerManager.WakeLock wakeLock = this.KWHzl;
            if (wakeLock != null && wakeLock.isHeld()) {
                this.KWHzl.setReferenceCounted(false);
                this.KWHzl.release();
                this.KWHzl = null;
            }
        }
    }

    public final void AhwBna() {
        synchronized (this.DbNXlk) {
            if (this.fetchVPNInfo == null) {
                return;
            }
            android.content.Context contextCopydefault = copydefault();
            if (contextCopydefault == null) {
                return;
            }
            final long currentPosition = this.fetchVPNInfo.getCurrentPosition();
            this.fetchVPNInfo.release();
            this.fetchVPNInfo = new SimpleExoPlayer.Builder(contextCopydefault).build();
            this.fetchVPNInfo.setMediaItem(MediaItem.fromUri(this.AkhnZx));
            this.fetchVPNInfo.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build(), true);
            this.fetchVPNInfo.prepare();
            this.fetchVPNInfo.addListener(new Player.EventListener() { // from class: o.ocE.1
                @Override // com.google.android.exoplayer2.Player.EventListener
                public void onPlaybackStateChanged(int i) {
                    if (i == 3) {
                        try {
                            java.lang.Thread.sleep(1000L);
                        } catch (java.lang.InterruptedException e) {
                            pUU.AEQbTJ("AudioPlayManager", "replay", e);
                            java.lang.Thread.currentThread().interrupt();
                        }
                        C36501ocE.this.fetchVPNInfo.seekTo(currentPosition);
                        C36501ocE.this.fetchVPNInfo.play();
                    }
                }
            });
            this.fetchVPNInfo.setVolume(1.0f);
            this.fetchVPNInfo.setPlayWhenReady(true);
        }
    }

    public void EZpvd(android.content.Context context, android.net.Uri uri, C35254nrp c35254nrp, InterfaceC36500ocD interfaceC36500ocD) {
        android.net.Uri uri2;
        synchronized (this.DbNXlk) {
            if (context == null || uri == null) {
                pUU.copydefault("AudioPlayManager", "startPlay context or audioUri is null.");
                return;
            }
            this.isConnected = new WeakReference<>(context.getApplicationContext());
            if (context instanceof android.app.Activity) {
                this.AYXKKw = new WeakReference<>((android.app.Activity) context);
            }
            C35249nrk c35249nrkAEQbTJ = ((InterfaceC36577odb) C58113yvE.copydefault(context.getApplicationContext(), InterfaceC36577odb.class)).OJuSTm().AEQbTJ(c35254nrp.OLrzqt());
            boolean z = c35249nrkAEQbTJ != null && c35249nrkAEQbTJ.OLrzqt() == 4;
            InterfaceC36500ocD interfaceC36500ocD2 = this.EZpvd;
            if (interfaceC36500ocD2 != null && (uri2 = this.AkhnZx) != null && !z) {
                interfaceC36500ocD2.AEQbTJ(uri2);
            }
            if (!z) {
                DbNXlk();
            }
            this.valueOf = new AudioManager.OnAudioFocusChangeListener() { // from class: o.ocE.4
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public void onAudioFocusChange(int i) {
                    synchronized (C36501ocE.this.DbNXlk) {
                        pUU.EZpvd("AudioPlayManager", "OnAudioFocusChangeListener " + i);
                        if (C36501ocE.this.djBIcL != null && i == -1) {
                            C36501ocE.this.djBIcL.abandonAudioFocus(C36501ocE.this.valueOf);
                            C36501ocE.this.valueOf = null;
                            C36501ocE.this.AhwBna.post(new java.lang.Runnable() { // from class: o.ocE.4.4
                                @Override // java.lang.Runnable
                                public void run() {
                                    synchronized (C36501ocE.this.DbNXlk) {
                                        if (C36501ocE.this.EZpvd != null) {
                                            C36501ocE.this.EZpvd.KWHzl(C36501ocE.this.AkhnZx);
                                            C36501ocE.this.EZpvd = null;
                                        }
                                    }
                                }
                            });
                            C36501ocE.this.AYXKKw();
                        }
                    }
                }
            };
            android.app.Activity activityEZpvd = EZpvd();
            if (activityEZpvd != null) {
                activityEZpvd.getWindow().addFlags(128);
            }
            try {
                this.OLrzqt = (android.os.PowerManager) context.getApplicationContext().getSystemService("power");
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                this.djBIcL = audioManager;
                if (!KWHzl(audioManager)) {
                    android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getApplicationContext().getSystemService("sensor");
                    this.AEQbTJ = sensorManager;
                    if (sensorManager != null) {
                        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(8);
                        this.copydefault = defaultSensor;
                        this.AEQbTJ.registerListener(this, defaultSensor, 3);
                    }
                }
                AEQbTJ(this.djBIcL, true);
                this.EZpvd = interfaceC36500ocD;
                this.AkhnZx = uri;
                if (this.fetchVPNInfo == null) {
                    SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(context).build();
                    this.fetchVPNInfo = simpleExoPlayerBuild;
                    simpleExoPlayerBuild.setMediaItem(MediaItem.fromUri(uri));
                    this.fetchVPNInfo.addListener(new Player.EventListener() { // from class: o.ocE.5
                        @Override // com.google.android.exoplayer2.Player.EventListener
                        public void onPlayerStateChanged(boolean z2, int i) {
                            synchronized (C36501ocE.this.DbNXlk) {
                                if (C36501ocE.this.EZpvd != null) {
                                    if (i == 4) {
                                        C36501ocE.this.EZpvd.KWHzl(C36501ocE.this.AkhnZx);
                                        C36501ocE.this.EZpvd = null;
                                        C36501ocE.this.AYXKKw();
                                        android.app.Activity activityEZpvd2 = C36501ocE.this.EZpvd();
                                        if (activityEZpvd2 != null) {
                                            activityEZpvd2.getWindow().clearFlags(128);
                                        }
                                    } else if (i == 3 && z2) {
                                        long duration = C36501ocE.this.fetchVPNInfo.getDuration();
                                        if (duration > 0) {
                                            long currentPosition = C36501ocE.this.fetchVPNInfo.getCurrentPosition();
                                            C36501ocE.this.EZpvd.KWHzl(C36501ocE.this.AkhnZx, currentPosition / duration, duration - currentPosition);
                                        }
                                        pUU.KWHzl("VoiceMessage", "onPlaying->duration:" + duration);
                                    }
                                }
                            }
                        }

                        @Override // com.google.android.exoplayer2.Player.EventListener
                        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
                            synchronized (C36501ocE.this.DbNXlk) {
                                if (exoPlaybackException.type == 0) {
                                    C36501ocE.this.EZpvd.AEQbTJ(C36501ocE.this.AkhnZx, exoPlaybackException);
                                } else {
                                    C36501ocE.this.EZpvd.EZpvd(C36501ocE.this.AkhnZx, exoPlaybackException);
                                }
                                C36501ocE.this.EZpvd = null;
                                C36501ocE.this.AYXKKw();
                            }
                        }
                    });
                    this.fetchVPNInfo.prepare();
                    this.fetchVPNInfo.setPlayWhenReady(true);
                    this.fetchVPNInfo.play();
                } else {
                    this.fetchVPNInfo.seekTo((long) (this.fetchVPNInfo.getDuration() * (c35249nrkAEQbTJ == null ? 0.0f : c35249nrkAEQbTJ.EZpvd())));
                    this.fetchVPNInfo.setPlayWhenReady(true);
                }
                InterfaceC36500ocD interfaceC36500ocD3 = this.EZpvd;
                if (interfaceC36500ocD3 != null && !z) {
                    interfaceC36500ocD3.EZpvd(this.AkhnZx);
                }
                this.values = AbstractC58185ywX.EZpvd(0L, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS).KWHzl(C58266yxz.OLrzqt()).AEQbTJ(new C33031mol<java.lang.Long>() { // from class: o.ocE.2
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.C33031mol, o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public void accept(java.lang.Long l) throws java.lang.Exception {
                        if (C36501ocE.this.EZpvd == null || C36501ocE.this.fetchVPNInfo == null) {
                            return;
                        }
                        int playbackState = C36501ocE.this.fetchVPNInfo.getPlaybackState();
                        boolean playWhenReady = C36501ocE.this.fetchVPNInfo.getPlayWhenReady();
                        if (playbackState == 3 && playWhenReady) {
                            long duration = C36501ocE.this.fetchVPNInfo.getDuration();
                            if (duration > 0) {
                                long currentPosition = C36501ocE.this.fetchVPNInfo.getCurrentPosition();
                                C36501ocE.this.EZpvd.KWHzl(C36501ocE.this.AkhnZx, currentPosition / duration, duration - currentPosition);
                            }
                            pUU.KWHzl("VoiceMessage", "onPlaying->duration:" + duration);
                        }
                    }
                }, new C33027moh() { // from class: o.ocE.3
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.C33027moh, o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: OLrzqt */
                    public void accept(@NotNull java.lang.Throwable th) throws java.lang.Exception {
                        super.accept(th);
                        pUU.KWHzl("VoiceMessage", "RxError:" + th.getMessage());
                    }
                });
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("AudioPlayManager", "startPlay", e);
                InterfaceC36500ocD interfaceC36500ocD4 = this.EZpvd;
                if (interfaceC36500ocD4 != null) {
                    interfaceC36500ocD4.AEQbTJ(uri);
                    this.EZpvd = null;
                }
                AYXKKw();
            }
        }
    }

    public final boolean KWHzl(AudioManager audioManager) {
        int i;
        synchronized (this.DbNXlk) {
            if (audioManager == null) {
                return false;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(3)) {
                i = (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) ? 0 : i + 1;
                return true;
            }
            return false;
        }
    }

    public void AkhnZx() {
        android.net.Uri uri;
        synchronized (this.DbNXlk) {
            android.app.Activity activityEZpvd = EZpvd();
            if (activityEZpvd != null) {
                activityEZpvd.getWindow().clearFlags(128);
            }
            InterfaceC36500ocD interfaceC36500ocD = this.EZpvd;
            if (interfaceC36500ocD != null && (uri = this.AkhnZx) != null) {
                interfaceC36500ocD.AEQbTJ(uri);
            }
            AYXKKw();
        }
    }

    public void gEmmrt() {
        synchronized (this.DbNXlk) {
            SimpleExoPlayer simpleExoPlayer = this.fetchVPNInfo;
            if (simpleExoPlayer != null) {
                long currentPosition = simpleExoPlayer.getCurrentPosition();
                long duration = simpleExoPlayer.getDuration();
                float f = currentPosition / duration;
                if (simpleExoPlayer.getPlayWhenReady()) {
                    simpleExoPlayer.setPlayWhenReady(false);
                }
                InterfaceC36500ocD interfaceC36500ocD = this.EZpvd;
                if (interfaceC36500ocD != null) {
                    interfaceC36500ocD.AEQbTJ(this.AkhnZx, f, duration - currentPosition);
                }
            }
        }
    }

    public final void AYXKKw() {
        isConnected();
        DbNXlk();
        djBIcL();
    }

    public final void isConnected() {
        InterfaceC58217yxC interfaceC58217yxC = this.values;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
            this.values = null;
        }
    }

    public final void djBIcL() {
        AudioManager audioManager = this.djBIcL;
        if (audioManager != null) {
            audioManager.setMode(0);
            AEQbTJ(this.djBIcL, false);
        }
        if (this.AEQbTJ != null) {
            values();
            this.AEQbTJ.unregisterListener(this);
        }
        this.AEQbTJ = null;
        this.copydefault = null;
        this.OLrzqt = null;
        this.djBIcL = null;
        this.KWHzl = null;
        this.AkhnZx = null;
        this.EZpvd = null;
        this.isConnected = null;
        this.AYXKKw = null;
    }

    public final void DbNXlk() {
        synchronized (this.DbNXlk) {
            SimpleExoPlayer simpleExoPlayer = this.fetchVPNInfo;
            if (simpleExoPlayer != null) {
                try {
                    simpleExoPlayer.stop();
                    this.fetchVPNInfo.release();
                    this.fetchVPNInfo = null;
                } catch (java.lang.IllegalStateException e) {
                    pUU.AEQbTJ("AudioPlayManager", "resetMediaPlayer", e);
                }
            }
        }
    }

    public android.net.Uri AEQbTJ() {
        android.net.Uri uri;
        synchronized (this.DbNXlk) {
            uri = this.AkhnZx;
            if (uri == null) {
                uri = android.net.Uri.EMPTY;
            }
        }
        return uri;
    }

    public final void AEQbTJ(AudioManager audioManager, boolean z) {
        synchronized (this.DbNXlk) {
            try {
                if (audioManager == null) {
                    return;
                }
                if (z) {
                    audioManager.requestAudioFocus(this.valueOf, 3, 2);
                } else {
                    audioManager.abandonAudioFocus(this.valueOf);
                    this.valueOf = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public boolean OLrzqt(android.content.Context context) {
        boolean z;
        synchronized (this.DbNXlk) {
            if (this.djBIcL == null && context != null) {
                this.djBIcL = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            }
            AudioManager audioManager = this.djBIcL;
            z = audioManager != null && audioManager.getMode() == 0;
        }
        return z;
    }

    public boolean valueOf() {
        boolean z;
        synchronized (this.DbNXlk) {
            SimpleExoPlayer simpleExoPlayer = this.fetchVPNInfo;
            z = simpleExoPlayer != null && simpleExoPlayer.isPlaying();
        }
        return z;
    }

    public void KWHzl() {
        synchronized (this.DbNXlk) {
            AYXKKw();
        }
    }
}
