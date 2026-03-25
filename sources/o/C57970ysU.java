package o;

import com.tencent.matrix.lifecycle.MatrixLifecycleThread;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C57970ysU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57970ysU extends android.content.BroadcastReceiver {
    public static java.lang.String AEQbTJ;
    public static volatile InterfaceC57916yrT EZpvd;
    public static Function0<Unit> OLrzqt;
    public static final C57970ysU KWHzl = new C57970ysU();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0<java.lang.String>() { // from class: com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker$permission$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            String str = C57970ysU.AEQbTJ;
            Intrinsics.copydefault((Object) str);
            sb.append(str);
            sb.append(".matrix.permission.PROCESS_SUPERVISOR");
            return sb.toString();
        }
    });

    private C57970ysU() {
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) copydefault.getValue();
    }

    public final void KWHzl(android.content.Context context, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (EZpvd != null) {
            C58013ytK.OLrzqt(C57968ysS.KWHzl.gEmmrt(), "SubordinatePacemaker: already installed", new java.lang.Object[0]);
            return;
        }
        if (C57968ysS.KWHzl.values()) {
            return;
        }
        OLrzqt = function0;
        AEQbTJ = C58014ytL.copydefault(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("SUPERVISOR_INSTALLED");
        if (context != null) {
            context.registerReceiver(this, intentFilter, KWHzl(), null);
        }
        EZpvd = new Application(function0);
        InterfaceC57913yrQ interfaceC57913yrQIsConnected = C58001ysz.AEQbTJ.isConnected();
        InterfaceC57916yrT interfaceC57916yrT = EZpvd;
        Intrinsics.copydefault(interfaceC57916yrT);
        interfaceC57913yrQIsConnected.KWHzl(interfaceC57916yrT);
    }

    /* JADX INFO: renamed from: o.ysU$Application */
    public static final class Application implements InterfaceC57916yrT {
        public final /* synthetic */ Function0<Unit> copydefault;

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
        }

        public Application(Function0<Unit> function0) {
            this.copydefault = function0;
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            android.os.Handler handlerOLrzqt = MatrixLifecycleThread.EZpvd.OLrzqt();
            final Function0<Unit> function0 = this.copydefault;
            handlerOLrzqt.post(new java.lang.Runnable() { // from class: o.ysX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57970ysU.Application.copydefault(function0);
                }
            });
        }

        public static final void copydefault(Function0 function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            C58013ytK.EZpvd(C57968ysS.KWHzl.gEmmrt(), "SubordinatePacemaker: callback when foreground", new java.lang.Object[0]);
            function0.invoke();
        }
    }

    public final void AEQbTJ(android.content.Context context) {
        if (EZpvd != null) {
            InterfaceC57913yrQ interfaceC57913yrQIsConnected = C58001ysz.AEQbTJ.isConnected();
            InterfaceC57916yrT interfaceC57916yrT = EZpvd;
            Intrinsics.copydefault(interfaceC57916yrT);
            interfaceC57913yrQIsConnected.AEQbTJ(interfaceC57916yrT);
            EZpvd = null;
            java.lang.String strGEmmrt = C57968ysS.KWHzl.gEmmrt();
            if (context != null) {
                try {
                    context.unregisterReceiver(this);
                } catch (java.lang.Throwable th) {
                    C58013ytK.OLrzqt(strGEmmrt, th, "", new java.lang.Object[0]);
                }
            }
            C58013ytK.EZpvd(C57968ysS.KWHzl.gEmmrt(), "SubordinatePacemaker: uninstalled", new java.lang.Object[0]);
        }
    }

    public final void copydefault(android.content.Context context) {
        AEQbTJ = C58014ytL.copydefault(context);
        android.content.Intent intent = new android.content.Intent("SUPERVISOR_INSTALLED");
        if (context != null) {
            context.sendBroadcast(intent, KWHzl.KWHzl());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 465198915 && action.equals("SUPERVISOR_INSTALLED")) {
            MatrixLifecycleThread.EZpvd.OLrzqt().post(new java.lang.Runnable() { // from class: o.ysW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57970ysU.AEQbTJ();
                }
            });
        }
    }

    public static final void AEQbTJ() {
        C58013ytK.EZpvd(C57968ysS.KWHzl.gEmmrt(), "SubordinatePacemaker: callback when supervisor installed", new java.lang.Object[0]);
        Function0<Unit> function0 = OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
