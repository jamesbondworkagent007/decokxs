package com.okinc.im.imui.managerV2;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.okinc.im.imui.managerV2.AudioRecordManager;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.AbstractC36502ocF;
import o.AbstractC36510ocN;
import o.C36503ocG;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AudioRecordManager implements Handler.Callback {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final InterfaceC56387yDm<AudioRecordManager> OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ocI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AudioRecordManager.copydefault();
        }
    });
    public WeakReference<Context> AYXKKw;
    public boolean AhwBna;
    public Function1<? super AbstractC36502ocF, Unit> AkhnZx;
    public ActionBar DbNXlk;
    public Function1<? super Integer, Unit> EZpvd;
    public AudioManager.OnAudioFocusChangeListener djBIcL;
    public Function1<? super AbstractC36510ocN, Unit> ejfBZ;
    public long fJNWhG;
    public MediaRecorder fetchVPNInfo;
    public Uri gEmmrt;
    public Job hDKMBd;
    public int iwGUEr;
    public AudioManager valueOf;
    public final Handler values;
    public int isConnected = 60;
    public ActionBar AEQbTJ = new StateListAnimator();
    public CoroutineScope fARcdN = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    public ActionBar fIwbmz = new FragmentManager();
    public ActionBar AuCTel = new PendingIntent();
    public ActionBar copydefault = new Activity();
    public ActionBar uzCIH = new Dialog();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.isConnected = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar AuCTel() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super AbstractC36510ocN, Unit> function1) {
        this.ejfBZ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.iwGUEr = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super AbstractC36502ocF, Unit> function1) {
        this.AkhnZx = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fARcdN() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar fIwbmz() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar fetchVPNInfo() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.ocN, kotlin.Unit>, kotlin.jvm.functions.Function1<o.ocN, kotlin.Unit> */
    public final Function1<AbstractC36510ocN, Unit> isConnected() {
        return this.ejfBZ;
    }

    private AudioRecordManager() {
        pUU.EZpvd("AudioRecordManagerV2", "AudioRecordManagerV2");
        this.values = new Handler(Looper.getMainLooper(), this);
        ActionBar actionBar = this.AEQbTJ;
        this.DbNXlk = actionBar;
        actionBar.AEQbTJ();
    }

    public final Context values() {
        WeakReference<Context> weakReference = this.AYXKKw;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class StateListAnimator extends ActionBar {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
            super();
            pUU.EZpvd("AudioRecordManagerV2", "IdleState");
        }

        @Override // com.okinc.im.imui.managerV2.AudioRecordManager.ActionBar
        public void AEQbTJ() {
            super.AEQbTJ();
            if (AudioRecordManager.this.values != null) {
                AudioRecordManager.this.values.removeMessages(7);
                AudioRecordManager.this.values.removeMessages(8);
                AudioRecordManager.this.values.removeMessages(2);
                AudioRecordManager.this.values.removeMessages(10);
            }
        }

        @Override // com.okinc.im.imui.managerV2.AudioRecordManager.ActionBar
        public void copydefault(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            pUU.EZpvd("AudioRecordManagerV2", "IdleState handleMessage : " + taskDescription.KWHzl());
            if (taskDescription.KWHzl() == 1) {
                AudioRecordManager.this.hDKMBd();
                AudioRecordManager.this.uzCIH();
                AudioRecordManager.this.fJNWhG = SystemClock.elapsedRealtime();
                AudioRecordManager audioRecordManager = AudioRecordManager.this;
                audioRecordManager.DbNXlk = audioRecordManager.DbNXlk();
                AudioRecordManager.this.OLrzqt(2);
                AudioRecordManager.this.OLrzqt(10);
            }
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class FragmentManager extends ActionBar {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public FragmentManager() {
            super();
        }

        @Override // com.okinc.im.imui.managerV2.AudioRecordManager.ActionBar
        public void copydefault(@NotNull TaskDescription taskDescription) {
            boolean zBooleanValue;
            Function1<AbstractC36510ocN, Unit> function1IsConnected;
            Intrinsics.checkNotNullParameter(taskDescription, "");
            pUU.EZpvd("AudioRecordManagerV2", "RecordState handleMessage : " + taskDescription.KWHzl());
            int iKWHzl = taskDescription.KWHzl();
            if (iKWHzl == 2) {
                Handler handler = AudioRecordManager.this.values;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(2, 150L);
                    return;
                }
                return;
            }
            if (iKWHzl == 3) {
                AudioRecordManager.this.fJNWhG();
                AudioRecordManager audioRecordManager = AudioRecordManager.this;
                audioRecordManager.DbNXlk = audioRecordManager.AhwBna();
                return;
            }
            if (iKWHzl == 5) {
                final boolean zAEQbTJ = AudioRecordManager.this.AEQbTJ();
                if (taskDescription.OLrzqt() != null) {
                    Object objOLrzqt = taskDescription.OLrzqt();
                    Intrinsics.copydefault(objOLrzqt, "");
                    zBooleanValue = ((Boolean) objOLrzqt).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (zAEQbTJ && !zBooleanValue) {
                    Handler handler2 = AudioRecordManager.this.values;
                    if (handler2 != null) {
                        handler2.removeMessages(2);
                    }
                    Handler handler3 = AudioRecordManager.this.values;
                    if (handler3 != null) {
                        handler3.removeMessages(10);
                    }
                    Function1<AbstractC36510ocN, Unit> function1IsConnected2 = AudioRecordManager.this.isConnected();
                    if (function1IsConnected2 != null) {
                        function1IsConnected2.invoke(AbstractC36510ocN.Activity.OLrzqt);
                    }
                }
                if (zBooleanValue || AudioRecordManager.this.values == null) {
                    AudioRecordManager.this.getNewProxyInstance();
                    if (!zAEQbTJ && zBooleanValue) {
                        AudioRecordManager.this.ejfBZ();
                    }
                    AudioRecordManager.this.djBIcL();
                    AudioRecordManager audioRecordManager2 = AudioRecordManager.this;
                    audioRecordManager2.DbNXlk = audioRecordManager2.fetchVPNInfo();
                    return;
                }
                Handler handler4 = AudioRecordManager.this.values;
                final AudioRecordManager audioRecordManager3 = AudioRecordManager.this;
                handler4.postDelayed(new Runnable() { // from class: o.ocO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRecordManager.FragmentManager.OLrzqt(audioRecordManager3, zAEQbTJ);
                    }
                }, 500L);
                AudioRecordManager audioRecordManager4 = AudioRecordManager.this;
                audioRecordManager4.DbNXlk = audioRecordManager4.fIwbmz();
                return;
            }
            if (iKWHzl == 6) {
                AudioRecordManager.this.getNewProxyInstance();
                AudioRecordManager.this.djBIcL();
                AudioRecordManager.this.AYXKKw();
                AudioRecordManager audioRecordManager5 = AudioRecordManager.this;
                audioRecordManager5.DbNXlk = audioRecordManager5.fetchVPNInfo();
                AudioRecordManager.this.fetchVPNInfo().AEQbTJ();
                return;
            }
            if (iKWHzl != 7) {
                if (iKWHzl != 10) {
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 10;
                int iFARcdN = AudioRecordManager.this.fARcdN();
                if (iFARcdN == AudioRecordManager.this.AkhnZx() - 10 && (function1IsConnected = AudioRecordManager.this.isConnected()) != null) {
                    function1IsConnected.invoke(AbstractC36510ocN.Application.KWHzl);
                }
                AudioRecordManager.this.KWHzl(iFARcdN);
                AudioRecordManager audioRecordManager6 = AudioRecordManager.this;
                audioRecordManager6.copydefault(audioRecordManager6.fARcdN() + 1);
                messageObtain.obj = Integer.valueOf(AudioRecordManager.this.fARcdN());
                Handler handler5 = AudioRecordManager.this.values;
                Intrinsics.copydefault(handler5);
                handler5.sendMessageDelayed(messageObtain, 1000L);
                return;
            }
            Object objOLrzqt2 = taskDescription.OLrzqt();
            Intrinsics.copydefault(objOLrzqt2, "");
            int iIntValue = ((Integer) objOLrzqt2).intValue();
            AudioRecordManager audioRecordManager7 = AudioRecordManager.this;
            audioRecordManager7.DbNXlk = audioRecordManager7.AuCTel();
            if (iIntValue < 0) {
                Handler handler6 = AudioRecordManager.this.values;
                if (handler6 != null) {
                    final AudioRecordManager audioRecordManager8 = AudioRecordManager.this;
                    handler6.postDelayed(new Runnable() { // from class: o.ocQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioRecordManager.FragmentManager.OLrzqt(audioRecordManager8);
                        }
                    }, 500L);
                }
                AudioRecordManager audioRecordManager9 = AudioRecordManager.this;
                audioRecordManager9.DbNXlk = audioRecordManager9.fetchVPNInfo();
                return;
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 8;
            messageObtain2.obj = Integer.valueOf(iIntValue - 1);
            Handler handler7 = AudioRecordManager.this.values;
            if (handler7 != null) {
                handler7.sendMessageDelayed(messageObtain2, 1000L);
            }
        }

        public static final void OLrzqt(AudioRecordManager audioRecordManager, boolean z) {
            TaskDescription taskDescription = audioRecordManager.new TaskDescription();
            taskDescription.AEQbTJ(9);
            taskDescription.AEQbTJ(Boolean.valueOf(!z));
            audioRecordManager.OLrzqt(taskDescription);
        }

        public static final void OLrzqt(AudioRecordManager audioRecordManager) {
            audioRecordManager.getNewProxyInstance();
            audioRecordManager.ejfBZ();
            audioRecordManager.djBIcL();
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class PendingIntent extends ActionBar {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public PendingIntent() {
            super();
        }

        @Override // com.okinc.im.imui.managerV2.AudioRecordManager.ActionBar
        public void copydefault(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            pUU.EZpvd("AudioRecordManagerV2", "SendingState handleMessage " + taskDescription.KWHzl());
            if (taskDescription.KWHzl() == 9) {
                AudioRecordManager.this.getNewProxyInstance();
                Object objOLrzqt = taskDescription.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                if (((Boolean) objOLrzqt).booleanValue()) {
                    AudioRecordManager.this.ejfBZ();
                }
                AudioRecordManager.this.djBIcL();
                AudioRecordManager audioRecordManager = AudioRecordManager.this;
                audioRecordManager.DbNXlk = audioRecordManager.fetchVPNInfo();
            }
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class Activity extends ActionBar {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
            super();
        }

        @Override // com.okinc.im.imui.managerV2.AudioRecordManager.ActionBar
        public void copydefault(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            pUU.EZpvd("AudioRecordManagerV2", "CancelState handleMessage : " + taskDescription.KWHzl());
            int iKWHzl = taskDescription.KWHzl();
            if (iKWHzl == 4) {
                AudioRecordManager audioRecordManager = AudioRecordManager.this;
                audioRecordManager.DbNXlk = audioRecordManager.DbNXlk();
                AudioRecordManager.this.OLrzqt(2);
                return;
            }
            if (iKWHzl == 5 || iKWHzl == 6) {
                AudioRecordManager.this.getNewProxyInstance();
                AudioRecordManager.this.djBIcL();
                AudioRecordManager.this.AYXKKw();
                AudioRecordManager audioRecordManager2 = AudioRecordManager.this;
                audioRecordManager2.DbNXlk = audioRecordManager2.fetchVPNInfo();
                AudioRecordManager.this.fetchVPNInfo().AEQbTJ();
                return;
            }
            if (iKWHzl != 7) {
                if (iKWHzl != 10) {
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 10;
                AudioRecordManager.this.copydefault(AudioRecordManager.this.fARcdN() + 1);
                messageObtain.obj = Integer.valueOf(AudioRecordManager.this.fARcdN());
                Handler handler = AudioRecordManager.this.values;
                if (handler != null) {
                    handler.sendMessageDelayed(messageObtain, 1000L);
                    return;
                }
                return;
            }
            Object objOLrzqt = taskDescription.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            int iIntValue = ((Integer) objOLrzqt).intValue();
            if (iIntValue <= 0) {
                Handler handler2 = AudioRecordManager.this.values;
                if (handler2 != null) {
                    final AudioRecordManager audioRecordManager3 = AudioRecordManager.this;
                    handler2.postDelayed(new Runnable() { // from class: o.ocJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioRecordManager.Activity.copydefault(audioRecordManager3);
                        }
                    }, 500L);
                }
                AudioRecordManager audioRecordManager4 = AudioRecordManager.this;
                audioRecordManager4.DbNXlk = audioRecordManager4.fetchVPNInfo();
                AudioRecordManager.this.fetchVPNInfo().AEQbTJ();
                return;
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 8;
            messageObtain2.obj = Integer.valueOf(iIntValue - 1);
            Handler handler3 = AudioRecordManager.this.values;
            if (handler3 != null) {
                handler3.sendMessageDelayed(messageObtain2, 1000L);
            }
        }

        public static final void copydefault(AudioRecordManager audioRecordManager) {
            audioRecordManager.getNewProxyInstance();
            audioRecordManager.ejfBZ();
            audioRecordManager.djBIcL();
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class Dialog extends ActionBar {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Dialog() {
            super();
        }

        @Override // com.okinc.im.imui.managerV2.AudioRecordManager.ActionBar
        public void copydefault(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            pUU.EZpvd("AudioRecordManagerV2", "TimerState handleMessage : " + taskDescription.KWHzl());
            int iKWHzl = taskDescription.KWHzl();
            if (iKWHzl == 3) {
                AudioRecordManager.this.fJNWhG();
                AudioRecordManager audioRecordManager = AudioRecordManager.this;
                audioRecordManager.DbNXlk = audioRecordManager.AhwBna();
                return;
            }
            if (iKWHzl == 10) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 10;
                AudioRecordManager audioRecordManager2 = AudioRecordManager.this;
                audioRecordManager2.KWHzl(audioRecordManager2.fARcdN());
                AudioRecordManager.this.copydefault(AudioRecordManager.this.fARcdN() + 1);
                messageObtain.obj = Integer.valueOf(AudioRecordManager.this.fARcdN());
                Handler handler = AudioRecordManager.this.values;
                if (handler != null) {
                    handler.sendMessageDelayed(messageObtain, 1000L);
                    return;
                }
                return;
            }
            if (iKWHzl == 5) {
                Handler handler2 = AudioRecordManager.this.values;
                if (handler2 != null) {
                    final AudioRecordManager audioRecordManager3 = AudioRecordManager.this;
                    handler2.postDelayed(new Runnable() { // from class: o.ocP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioRecordManager.Dialog.KWHzl(audioRecordManager3);
                        }
                    }, 500L);
                }
                AudioRecordManager audioRecordManager4 = AudioRecordManager.this;
                audioRecordManager4.DbNXlk = audioRecordManager4.fetchVPNInfo();
                AudioRecordManager.this.fetchVPNInfo().AEQbTJ();
                return;
            }
            if (iKWHzl == 6) {
                AudioRecordManager.this.getNewProxyInstance();
                AudioRecordManager.this.djBIcL();
                AudioRecordManager.this.AYXKKw();
                AudioRecordManager audioRecordManager5 = AudioRecordManager.this;
                audioRecordManager5.DbNXlk = audioRecordManager5.fetchVPNInfo();
                AudioRecordManager.this.fetchVPNInfo().AEQbTJ();
                return;
            }
            if (iKWHzl != 7) {
                return;
            }
            Object objOLrzqt = taskDescription.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            int iIntValue = ((Integer) objOLrzqt).intValue();
            if (iIntValue < 0) {
                Handler handler3 = AudioRecordManager.this.values;
                if (handler3 != null) {
                    final AudioRecordManager audioRecordManager6 = AudioRecordManager.this;
                    handler3.postDelayed(new Runnable() { // from class: o.ocR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioRecordManager.Dialog.OLrzqt(audioRecordManager6);
                        }
                    }, 500L);
                }
                AudioRecordManager audioRecordManager7 = AudioRecordManager.this;
                audioRecordManager7.DbNXlk = audioRecordManager7.fetchVPNInfo();
                return;
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 8;
            messageObtain2.obj = Integer.valueOf(iIntValue - 1);
            Handler handler4 = AudioRecordManager.this.values;
            if (handler4 != null) {
                handler4.sendMessageDelayed(messageObtain2, 1000L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void OLrzqt(AudioRecordManager audioRecordManager) {
            audioRecordManager.getNewProxyInstance();
            audioRecordManager.ejfBZ();
            audioRecordManager.djBIcL();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KWHzl(AudioRecordManager audioRecordManager) {
            audioRecordManager.getNewProxyInstance();
            audioRecordManager.ejfBZ();
            audioRecordManager.djBIcL();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        pUU.KWHzl("AudioRecordManagerV2", "main handleMessage " + message.what);
        int i = message.what;
        if (i == 2) {
            OLrzqt(2);
            return false;
        }
        if (i == 10) {
            Object obj = message.obj;
            if (obj != null) {
                Intrinsics.copydefault(obj, "");
                ((Integer) obj).intValue();
            }
            TaskDescription taskDescription = new TaskDescription();
            taskDescription.AEQbTJ(10);
            OLrzqt(taskDescription);
            return false;
        }
        if (i == 7) {
            TaskDescription taskDescription2 = new TaskDescription();
            taskDescription2.AEQbTJ(message.what);
            taskDescription2.AEQbTJ(message.obj);
            OLrzqt(taskDescription2);
            return false;
        }
        if (i != 8) {
            return false;
        }
        TaskDescription taskDescription3 = new TaskDescription();
        taskDescription3.AEQbTJ(7);
        taskDescription3.AEQbTJ(message.obj);
        OLrzqt(taskDescription3);
        return false;
    }

    public final void hDKMBd() {
        pUU.EZpvd("AudioRecordManagerV2", "setRecordingView");
        Function1<? super AbstractC36510ocN, Unit> function1 = this.ejfBZ;
        if (function1 != null) {
            function1.invoke(AbstractC36510ocN.TaskDescription.KWHzl);
        }
    }

    public final void fJNWhG() {
        pUU.EZpvd("AudioRecordManagerV2", "setCancelView");
        Function1<? super AbstractC36510ocN, Unit> function1 = this.ejfBZ;
        if (function1 != null) {
            function1.invoke(AbstractC36510ocN.ActionBar.EZpvd);
        }
    }

    public final void KWHzl(int i) {
        pUU.EZpvd("updateTimer", String.valueOf(i));
        Function1<? super AbstractC36510ocN, Unit> function1 = this.ejfBZ;
        if (function1 != null) {
            function1.invoke(new AbstractC36510ocN.FragmentManager(i));
        }
    }

    public final void djBIcL() {
        pUU.EZpvd("AudioRecordManagerV2", "destroyView");
        Handler handler = this.values;
        if (handler != null) {
            handler.removeMessages(7);
            handler.removeMessages(8);
            handler.removeMessages(2);
            handler.removeMessages(10);
            this.iwGUEr = 0;
        }
        this.AYXKKw = null;
        Function1<? super AbstractC36510ocN, Unit> function1 = this.ejfBZ;
        if (function1 != null) {
            function1.invoke(AbstractC36510ocN.StateListAnimator.copydefault);
        }
    }

    public final void OLrzqt(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = new WeakReference<>(context.getApplicationContext());
        this.iwGUEr = 0;
        Context contextValues = values();
        Object systemService = contextValues != null ? contextValues.getSystemService(MimeTypes.BASE_TYPE_AUDIO) : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        this.valueOf = audioManager;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.djBIcL;
        if (onAudioFocusChangeListener != null) {
            if (audioManager != null) {
                audioManager.abandonAudioFocus(onAudioFocusChangeListener);
            }
            this.djBIcL = null;
        }
        this.djBIcL = new AudioManager.OnAudioFocusChangeListener() { // from class: o.ocL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                AudioRecordManager.EZpvd(this.EZpvd, i);
            }
        };
        OLrzqt(1);
    }

    public static final void EZpvd(final AudioRecordManager audioRecordManager, int i) {
        pUU.EZpvd("AudioRecordManagerV2", "OnAudioFocusChangeListener " + i);
        if (i == -1) {
            AudioManager audioManager = audioRecordManager.valueOf;
            if (audioManager != null) {
                audioManager.abandonAudioFocus(audioRecordManager.djBIcL);
            }
            audioRecordManager.djBIcL = null;
            Handler handler = audioRecordManager.values;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.ocM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRecordManager.values(this.EZpvd);
                    }
                });
            }
        }
    }

    public static final void values(AudioRecordManager audioRecordManager) {
        audioRecordManager.OLrzqt(6);
    }

    public final void getFieldNames() {
        OLrzqt(3);
    }

    public final void valueOf() {
        OLrzqt(4);
    }

    public final void iwGUEr() {
        OLrzqt(5);
    }

    public final void OLrzqt(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.DbNXlk.copydefault(taskDescription);
    }

    public final void OLrzqt(int i) {
        TaskDescription taskDescription = new TaskDescription();
        taskDescription.AEQbTJ(i);
        this.DbNXlk.copydefault(taskDescription);
    }

    public final void uzCIH() {
        pUU.EZpvd("AudioRecordManagerV2", "startRec");
        try {
            KWHzl(this.valueOf, true);
            AudioManager audioManager = this.valueOf;
            if (audioManager != null) {
                audioManager.setMode(0);
            }
            MediaRecorder mediaRecorder = new MediaRecorder();
            this.fetchVPNInfo = mediaRecorder;
            mediaRecorder.setAudioEncodingBitRate(32000);
            MediaRecorder mediaRecorder2 = this.fetchVPNInfo;
            if (mediaRecorder2 != null) {
                mediaRecorder2.setAudioChannels(1);
            }
            MediaRecorder mediaRecorder3 = this.fetchVPNInfo;
            if (mediaRecorder3 != null) {
                mediaRecorder3.setAudioSource(1);
            }
            MediaRecorder mediaRecorder4 = this.fetchVPNInfo;
            if (mediaRecorder4 != null) {
                mediaRecorder4.setOutputFormat(2);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                MediaRecorder mediaRecorder5 = this.fetchVPNInfo;
                if (mediaRecorder5 != null) {
                    mediaRecorder5.setAudioEncoder(4);
                }
            } else {
                MediaRecorder mediaRecorder6 = this.fetchVPNInfo;
                if (mediaRecorder6 != null) {
                    mediaRecorder6.setAudioEncoder(3);
                }
            }
            Context contextValues = values();
            if (contextValues == null) {
                return;
            }
            Uri uriFromFile = Uri.fromFile(new File(C36503ocG.OLrzqt(contextValues.getCacheDir()), System.currentTimeMillis() + "temp.aac"));
            this.gEmmrt = uriFromFile;
            MediaRecorder mediaRecorder7 = this.fetchVPNInfo;
            if (mediaRecorder7 != null) {
                mediaRecorder7.setOutputFile(uriFromFile != null ? uriFromFile.getPath() : null);
            }
            MediaRecorder mediaRecorder8 = this.fetchVPNInfo;
            if (mediaRecorder8 != null) {
                mediaRecorder8.prepare();
            }
            MediaRecorder mediaRecorder9 = this.fetchVPNInfo;
            if (mediaRecorder9 != null) {
                mediaRecorder9.start();
            }
            this.AhwBna = true;
            this.iwGUEr = 0;
            Message messageObtain = Message.obtain();
            messageObtain.what = 7;
            messageObtain.obj = 10;
            long j = this.isConnected;
            Handler handler = this.values;
            if (handler != null) {
                handler.sendMessageDelayed(messageObtain, (j * 1000) - WorkRequest.MIN_BACKOFF_MILLIS);
            }
            if (!CoroutineScopeKt.isActive(this.fARcdN)) {
                this.fARcdN = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
            }
            this.hDKMBd = BuildersKt__Builders_commonKt.launch$default(this.fARcdN, null, null, new AudioRecordManager$startRec$1(this, null), 3, null);
        } catch (IOException e) {
            pUU.AEQbTJ("AudioRecordManagerV2", "startRec", e);
        } catch (IllegalStateException e2) {
            pUU.AEQbTJ("AudioRecordManagerV2", "startRec", e2);
        }
    }

    public final int gEmmrt() {
        try {
            MediaRecorder mediaRecorder = this.fetchVPNInfo;
            if (mediaRecorder != null) {
                return mediaRecorder.getMaxAmplitude();
            }
        } catch (IllegalStateException e) {
            pUU.OLrzqt("AudioRecordManagerV2", "getAmplitude: recorder not in valid state", e);
        }
        return 0;
    }

    public final boolean AEQbTJ() {
        return SystemClock.elapsedRealtime() - this.fJNWhG < 1000;
    }

    public final void getNewProxyInstance() {
        pUU.EZpvd("AudioRecordManagerV2", "stopRec");
        try {
            KWHzl(this.valueOf, false);
            MediaRecorder mediaRecorder = this.fetchVPNInfo;
            if (mediaRecorder != null) {
                if (mediaRecorder != null) {
                    mediaRecorder.stop();
                }
                MediaRecorder mediaRecorder2 = this.fetchVPNInfo;
                if (mediaRecorder2 != null) {
                    mediaRecorder2.release();
                }
                this.fetchVPNInfo = null;
                this.AhwBna = false;
            }
            Function1<? super AbstractC36510ocN, Unit> function1 = this.ejfBZ;
            if (function1 != null) {
                function1.invoke(AbstractC36510ocN.StateListAnimator.copydefault);
            }
            this.iwGUEr = 0;
            Job job = this.hDKMBd;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.hDKMBd = null;
        } catch (IllegalStateException e) {
            pUU.AEQbTJ("AudioRecordManagerV2", "stopRec", e);
            Job job2 = this.hDKMBd;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.hDKMBd = null;
            Function1<? super AbstractC36510ocN, Unit> function12 = this.ejfBZ;
            if (function12 != null) {
                function12.invoke(AbstractC36510ocN.StateListAnimator.copydefault);
            }
        }
    }

    public final void AYXKKw() {
        pUU.EZpvd("AudioRecordManagerV2", "deleteAudioFile");
        Uri uri = this.gEmmrt;
        if (uri != null) {
            File file = new File(uri != null ? uri.getPath() : null);
            if (!file.exists() || file.delete()) {
                return;
            }
            Uri uri2 = this.gEmmrt;
            pUU.copydefault("AudioRecordManagerV2", "deleteAudioFile delete file failed. path :" + (uri2 != null ? uri2.getPath() : null));
        }
    }

    public final void ejfBZ() {
        this.iwGUEr = 0;
        pUU.EZpvd("AudioRecordManagerV2", "sendAudioFile path = " + this.gEmmrt);
        Uri uri = this.gEmmrt;
        String path = uri != null ? uri.getPath() : null;
        File file = path != null ? new File(path) : null;
        if (uri == null || path == null || file == null || !file.exists() || file.length() <= 0) {
            Function1<? super AbstractC36502ocF, Unit> function1 = this.AkhnZx;
            if (function1 != null) {
                function1.invoke(new AbstractC36502ocF.TaskDescription("audio file not valid"));
                return;
            }
            return;
        }
        int iElapsedRealtime = ((int) (SystemClock.elapsedRealtime() - this.fJNWhG)) / 1000;
        Function1<? super AbstractC36502ocF, Unit> function12 = this.AkhnZx;
        if (function12 != null) {
            function12.invoke(new AbstractC36502ocF.Activity(uri, iElapsedRealtime));
        }
    }

    public final void KWHzl(AudioManager audioManager, boolean z) {
        if (audioManager == null) {
            pUU.copydefault("AudioRecordManagerV2", "audioManager is null");
        } else if (z) {
            audioManager.requestAudioFocus(this.djBIcL, 3, 2);
        } else {
            audioManager.abandonAudioFocus(this.djBIcL);
            this.djBIcL = null;
        }
    }

    public final void OLrzqt() {
        pUU.EZpvd("AudioRecordManagerV2", "cleanup");
        getNewProxyInstance();
        djBIcL();
        AudioManager audioManager = this.valueOf;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.djBIcL);
        }
        this.djBIcL = null;
        this.valueOf = null;
        this.gEmmrt = null;
        MediaRecorder mediaRecorder = this.fetchVPNInfo;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        this.fetchVPNInfo = null;
        Job job = this.hDKMBd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.hDKMBd = null;
        this.EZpvd = null;
        this.ejfBZ = null;
        this.AkhnZx = null;
        this.AYXKKw = null;
        CoroutineScopeKt.cancel$default(this.fARcdN, null, 1, null);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public abstract class ActionBar {
        public void AEQbTJ() {
        }

        public abstract void copydefault(@NotNull TaskDescription taskDescription);

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class TaskDescription {
        public int AEQbTJ;
        public Object KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(int i) {
            this.AEQbTJ = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(Object obj) {
            this.KWHzl = obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class SamplingRate {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SamplingRate[] $VALUES;
        private final int value;
        public static final SamplingRate RC_SAMPLE_RATE_8000 = new SamplingRate("RC_SAMPLE_RATE_8000", 0, 8000);
        public static final SamplingRate RC_SAMPLE_RATE_16000 = new SamplingRate("RC_SAMPLE_RATE_16000", 1, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SamplingRate[] $values() {
            return new SamplingRate[]{RC_SAMPLE_RATE_8000, RC_SAMPLE_RATE_16000};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SamplingRate> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private SamplingRate(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            SamplingRate[] samplingRateArr$values = $values();
            $VALUES = samplingRateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(samplingRateArr$values);
        }

        public static SamplingRate valueOf(String str) {
            return (SamplingRate) Enum.valueOf(SamplingRate.class, str);
        }

        public static SamplingRate[] values() {
            return (SamplingRate[]) $VALUES.clone();
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.managerV2.AudioRecordManager.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final AudioRecordManager OLrzqt() {
            return (AudioRecordManager) AudioRecordManager.OLrzqt.getValue();
        }
    }

    public static final AudioRecordManager copydefault() {
        return new AudioRecordManager();
    }
}
