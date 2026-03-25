package o;

import android.os.Handler;
import com.okinc.business.defi.wallet.SignatureVerificationService;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import o.C14486dmP;
import o.C9678baC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14486dmP {
    public static volatile C14486dmP AEQbTJ;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public android.content.ServiceConnection EZpvd;
    public android.os.Handler KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dmP.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C14486dmP(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C14486dmP() {
    }

    /* JADX INFO: renamed from: o.dmP$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dmP.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C14486dmP AEQbTJ() {
            C14486dmP c14486dmP = C14486dmP.AEQbTJ;
            if (c14486dmP == null) {
                synchronized (this) {
                    c14486dmP = C14486dmP.AEQbTJ;
                    if (c14486dmP == null) {
                        c14486dmP = new C14486dmP(null);
                        TaskDescription taskDescription = C14486dmP.Companion;
                        C14486dmP.AEQbTJ = c14486dmP;
                    }
                }
            }
            return c14486dmP;
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, long j, @NotNull final Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        copydefault();
        if (!AEQbTJ()) {
            pUU.KWHzl("SecuritySignaturePermissionCheck", "disable, no need check");
            function2.invoke(java.lang.Boolean.TRUE, "disable, no need check");
            return;
        }
        this.EZpvd = new Application(function2);
        try {
            java.lang.String name = SignatureVerificationService.class.getName();
            Intrinsics.copydefault((java.lang.Object) name);
            if (name.length() == 0) {
                pUU.KWHzl("SecuritySignaturePermissionCheck", "bindService targetPackageName:" + str + " not found");
                function2.invoke(java.lang.Boolean.FALSE, "targetPackageName:" + str + " not found");
                return;
            }
            C9678baC.Activity activity = C9678baC.Companion;
            android.content.pm.PackageManager packageManager = activity.AEQbTJ().getPackageManager();
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(str, name);
            if (packageManager.resolveService(intent, 0) == null) {
                pUU.valueOf("SecuritySignaturePermissionCheck", "Service not available for package: " + str);
                copydefault();
                function2.invoke(java.lang.Boolean.FALSE, "Service not available");
                return;
            }
            copydefault(j, new Function0() { // from class: o.dmQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14486dmP.AEQbTJ(function2, this);
                }
            });
            android.app.Application applicationAEQbTJ = activity.AEQbTJ();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(str, name);
            android.content.ServiceConnection serviceConnection = this.EZpvd;
            Intrinsics.copydefault(serviceConnection);
            applicationAEQbTJ.bindService(intent2, serviceConnection, 1);
        } catch (java.lang.Exception e) {
            function2.invoke(java.lang.Boolean.FALSE, C33129mqd.gEmmrt(e));
            copydefault();
            pUU.AEQbTJ("SecuritySignaturePermissionCheck", "bindService Exception", e);
        }
    }

    /* JADX INFO: renamed from: o.dmP$Application */
    public static final class Application implements android.content.ServiceConnection {
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.String, Unit> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
            this.AEQbTJ = function2;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            C14486dmP.this.OLrzqt();
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            final Function2<java.lang.Boolean, java.lang.String, Unit> function2 = this.AEQbTJ;
            final C14486dmP c14486dmP = C14486dmP.this;
            android.os.Messenger messenger = new android.os.Messenger(new android.os.Handler(mainLooper, new Handler.Callback() { // from class: o.dmT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(android.os.Message message) {
                    return C14486dmP.Application.KWHzl(function2, c14486dmP, message);
                }
            }));
            try {
                android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, 1);
                java.lang.String packageName = C9678baC.Companion.AEQbTJ().getPackageName();
                messageObtain.replyTo = messenger;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("clientPackageName", packageName);
                bundle.putString("clientVersion", "1");
                messageObtain.setData(bundle);
                new android.os.Messenger(iBinder).send(messageObtain);
                pUU.KWHzl("SecuritySignaturePermissionCheck", "onServiceConnected send: " + messageObtain.getData() + ", packageName=" + packageName);
            } catch (java.lang.Exception unused) {
                this.AEQbTJ.invoke(java.lang.Boolean.FALSE, "Failed to send request");
                C14486dmP.this.copydefault();
                pUU.KWHzl("SecuritySignaturePermissionCheck", "onServiceConnected Failed to send request");
            }
        }

        public static final boolean KWHzl(Function2 function2, C14486dmP c14486dmP, android.os.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            if (message.what != 2) {
                return false;
            }
            java.lang.String string = message.getData().getString("token");
            java.lang.String str = string != null ? string : "";
            function2.invoke(java.lang.Boolean.valueOf(!(str.length() == 0)), str);
            c14486dmP.copydefault();
            pUU.KWHzl("SecuritySignaturePermissionCheck", "onServiceConnected get response: " + message.getData() + ", token=" + str);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            pUU.KWHzl("SecuritySignaturePermissionCheck", "onServiceDisconnected");
            C14486dmP.this.copydefault();
        }
    }

    public static final Unit AEQbTJ(Function2 function2, C14486dmP c14486dmP) {
        pUU.valueOf("SecuritySignaturePermissionCheck", "Service connection timeout - app may be killed");
        function2.invoke(java.lang.Boolean.FALSE, "Connection timeout");
        c14486dmP.copydefault();
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        try {
            OLrzqt();
            android.content.ServiceConnection serviceConnection = this.EZpvd;
            if (serviceConnection != null) {
                C9678baC.Companion.AEQbTJ().unbindService(serviceConnection);
            }
        } catch (java.lang.Exception unused) {
            pUU.copydefault("SecuritySignaturePermissionCheck", "cleanupConnection Exception");
        }
        this.EZpvd = null;
    }

    public final void copydefault(long j, final Function0<Unit> function0) {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.KWHzl = handler;
        handler.postDelayed(new java.lang.Runnable() { // from class: o.dmV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C14486dmP.KWHzl(function0);
            }
        }, j);
    }

    public static final void KWHzl(Function0 function0) {
        function0.invoke();
    }

    public final void OLrzqt() {
        android.os.Handler handler = this.KWHzl;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.KWHzl = null;
    }

    public final boolean AEQbTJ() {
        java.lang.String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_security_signature_permission_check_enabled", AmplitudeName.WEB3);
        if (strAEQbTJ == null) {
            strAEQbTJ = DebugKt.DEBUG_PROPERTY_VALUE_ON;
        }
        return android.text.TextUtils.equals(strAEQbTJ, DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }
}
