package o;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.provider.Settings;
import com.google.android.exoplayer2.util.MimeTypes;
import com.okinc.im.imui.messages.audio.call.ringing.RingingMode;
import com.okinc.im.imui.messages.audio.call.ringing.RingtoneDownloadManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.onX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37103onX {
    public static volatile boolean AhwBna;
    public static RingingMode KWHzl;
    public static volatile boolean copydefault;
    public static MediaPlayer djBIcL;
    public static android.os.Vibrator valueOf;
    public static final C37103onX EZpvd = new C37103onX();
    public static final AtomicBoolean AEQbTJ = new AtomicBoolean(false);
    public static final android.content.BroadcastReceiver AYXKKw = new Activity();
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.onX$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RingingMode.values().length];
            try {
                iArr[RingingMode.Incoming.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RingingMode.Outgoing.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RingingMode.IncomingCustom.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    private C37103onX() {
    }

    /* JADX INFO: renamed from: o.onX$Activity */
    public static final class Activity extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            if (C37103onX.copydefault) {
                C37103onX c37103onX = C37103onX.EZpvd;
                C37103onX.copydefault = false;
                return;
            }
            if (C37103onX.AEQbTJ.get()) {
                RingingMode ringingMode = C37103onX.KWHzl;
                RingingMode ringingMode2 = RingingMode.Incoming;
                if ((ringingMode == ringingMode2 || C37103onX.KWHzl == RingingMode.IncomingCustom) && Intrinsics.EZpvd((java.lang.Object) "android.media.RINGER_MODE_CHANGED", (java.lang.Object) intent.getAction()) && !C37127onv.AEQbTJ.AhwBna().KWHzl()) {
                    C37103onX c37103onX2 = C37103onX.EZpvd;
                    int iOLrzqt = c37103onX2.OLrzqt(context);
                    if (iOLrzqt == 0) {
                        c37103onX2.EZpvd();
                        return;
                    }
                    if (iOLrzqt == 1) {
                        c37103onX2.EZpvd();
                        c37103onX2.EZpvd(context);
                    } else {
                        if (iOLrzqt != 2) {
                            return;
                        }
                        c37103onX2.EZpvd();
                        c37103onX2.AEQbTJ(context, ringingMode2);
                        if (c37103onX2.KWHzl(context)) {
                            c37103onX2.EZpvd(context);
                        }
                    }
                }
            }
        }
    }

    public final void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context, RingingMode.Outgoing);
    }

    public final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context, RingingMode.IncomingCustom);
    }

    public final void KWHzl(android.content.Context context, RingingMode ringingMode) {
        AtomicBoolean atomicBoolean = AEQbTJ;
        if (atomicBoolean.get()) {
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.media.RINGER_MODE_CHANGED");
        copydefault = true;
        C32979mnm.EZpvd.OLrzqt().registerReceiver(AYXKKw, intentFilter);
        if (ringingMode != RingingMode.Incoming && ringingMode != RingingMode.IncomingCustom) {
            AEQbTJ(context, ringingMode);
        } else {
            int iOLrzqt = OLrzqt(context);
            if (iOLrzqt != 0) {
                if (iOLrzqt == 1) {
                    EZpvd(context);
                } else {
                    if (KWHzl(context)) {
                        EZpvd(context);
                    }
                    AEQbTJ(context, ringingMode);
                }
            }
        }
        KWHzl = ringingMode;
        atomicBoolean.set(true);
    }

    public final void AEQbTJ(android.content.Context context, RingingMode ringingMode) {
        KWHzl();
        try {
            int i = TaskDescription.copydefault[ringingMode.ordinal()];
            if (i == 1) {
                android.net.Uri defaultUri = RingtoneManager.getDefaultUri(1);
                MediaPlayer mediaPlayer = djBIcL;
                if (mediaPlayer != null) {
                    mediaPlayer.setDataSource(context, defaultUri);
                }
                EZpvd(context, ringingMode);
                return;
            }
            if (i == 2) {
                android.content.res.AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(C35399nuc.PendingIntent.KWHzl);
                MediaPlayer mediaPlayer2 = djBIcL;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                }
                assetFileDescriptorOpenRawResourceFd.close();
                EZpvd(context, ringingMode);
                return;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            RingtoneDownloadManager ringtoneDownloadManager = RingtoneDownloadManager.copydefault;
            RingtoneDownloadManager.RingtoneType ringtoneType = RingtoneDownloadManager.RingtoneType.INCOMING;
            java.io.File fileAEQbTJ = ringtoneDownloadManager.AEQbTJ(ringtoneType);
            if (fileAEQbTJ != null && fileAEQbTJ.exists()) {
                MediaPlayer mediaPlayer3 = djBIcL;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.setDataSource(fileAEQbTJ.getAbsolutePath());
                }
                EZpvd(context, ringingMode);
                return;
            }
            RingtoneDownloadManager.downloadIfNeeded$default(ringtoneDownloadManager, ringtoneType, null, 2, null);
            pUU.KWHzl("CallRingingUtil", "Custom ringtone not available, using system default");
            android.net.Uri defaultUri2 = RingtoneManager.getDefaultUri(1);
            MediaPlayer mediaPlayer4 = djBIcL;
            if (mediaPlayer4 != null) {
                mediaPlayer4.setDataSource(context, defaultUri2);
            }
            EZpvd(context, ringingMode);
        } catch (java.lang.Exception e) {
            pUU.KWHzl("CallRingingUtil", "---onOutgoingCallRinging Error---" + e.getMessage());
        }
    }

    public final void EZpvd(android.content.Context context, RingingMode ringingMode) {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(6).build();
        MediaPlayer mediaPlayer = djBIcL;
        if (mediaPlayer != null) {
            mediaPlayer.setAudioAttributes(audioAttributesBuild);
        }
        MediaPlayer mediaPlayer2 = djBIcL;
        if (mediaPlayer2 != null) {
            mediaPlayer2.prepareAsync();
        }
        java.lang.Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        Intrinsics.copydefault(systemService, "");
        AudioManager audioManager = (AudioManager) systemService;
        C37127onv.AEQbTJ.AhwBna().OLrzqt(ringingMode == RingingMode.Incoming || ringingMode == RingingMode.IncomingCustom);
        audioManager.setMode(1);
        audioManager.setStreamVolume(0, 5, 0);
    }

    public final void EZpvd() {
        AtomicBoolean atomicBoolean;
        try {
            try {
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (!AhwBna) {
                MediaPlayer mediaPlayer = djBIcL;
                if (mediaPlayer != null) {
                    Intrinsics.copydefault(mediaPlayer);
                    if (mediaPlayer.isPlaying()) {
                        MediaPlayer mediaPlayer2 = djBIcL;
                        Intrinsics.copydefault(mediaPlayer2);
                        mediaPlayer2.stop();
                    }
                }
                MediaPlayer mediaPlayer3 = djBIcL;
                if (mediaPlayer3 != null) {
                    Intrinsics.copydefault(mediaPlayer3);
                    mediaPlayer3.reset();
                }
                android.os.Vibrator vibrator = valueOf;
                if (vibrator != null) {
                    Intrinsics.copydefault(vibrator);
                    vibrator.cancel();
                }
                try {
                    C32979mnm.EZpvd.OLrzqt().unregisterReceiver(AYXKKw);
                } catch (java.lang.Exception unused) {
                }
                java.lang.Object systemService = C32979mnm.EZpvd.OLrzqt().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                Intrinsics.copydefault(systemService, "");
                ((AudioManager) systemService).setMode(3);
                atomicBoolean = AEQbTJ;
                atomicBoolean.set(false);
                KWHzl = null;
            }
            AhwBna = false;
            atomicBoolean = AEQbTJ;
            atomicBoolean.set(false);
            KWHzl = null;
        } catch (java.lang.Throwable th) {
            AEQbTJ.set(false);
            KWHzl = null;
            throw th;
        }
    }

    public final void EZpvd(android.content.Context context) {
        android.os.Vibrator vibrator = valueOf;
        if (vibrator == null) {
            java.lang.Object systemService = context.getSystemService("vibrator");
            Intrinsics.copydefault(systemService, "");
            valueOf = (android.os.Vibrator) systemService;
        } else {
            Intrinsics.copydefault(vibrator);
            vibrator.cancel();
        }
        android.os.Vibrator vibrator2 = valueOf;
        Intrinsics.copydefault(vibrator2);
        vibrator2.vibrate(new long[]{500, 1000}, 0);
    }

    public final boolean KWHzl(android.content.Context context) {
        android.content.ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        java.lang.String str = android.os.Build.MANUFACTURER;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "Xiaomi")) {
            if (Settings.System.getInt(contentResolver, "vibrate_in_normal", 0) != 1) {
                return false;
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smartisan")) {
            if (Settings.Global.getInt(contentResolver, "telephony_vibration_enabled", 0) != 1) {
                return false;
            }
        } else if (Settings.System.getInt(contentResolver, "vibrate_when_ringing", 0) != 1) {
            return false;
        }
        return true;
    }

    public final void KWHzl() {
        if (djBIcL == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            djBIcL = mediaPlayer;
            Intrinsics.copydefault(mediaPlayer);
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: o.onW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    C37103onX.OLrzqt(mediaPlayer2);
                }
            });
        }
    }

    public static final void OLrzqt(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setLooping(true);
                mediaPlayer.start();
            } catch (java.lang.IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    public final int OLrzqt(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        Intrinsics.copydefault(systemService, "");
        return ((AudioManager) systemService).getRingerMode();
    }
}
