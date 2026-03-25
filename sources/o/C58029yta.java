package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C58029yta;
import o.ServiceC58030ytb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58029yta extends android.content.BroadcastReceiver {
    public static java.lang.String AEQbTJ;
    public static volatile InterfaceC57916yrT EZpvd;
    public static final C58029yta copydefault = new C58029yta();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0<java.lang.String>() { // from class: com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker$permission$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            String str = C58029yta.AEQbTJ;
            Intrinsics.copydefault((Object) str);
            sb.append(str);
            sb.append(".matrix.permission.PROCESS_SUPERVISOR");
            return sb.toString();
        }
    });

    private C58029yta() {
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) OLrzqt.getValue();
    }

    /* JADX INFO: renamed from: o.yta$ActionBar */
    public static final class ActionBar implements InterfaceC57916yrT {
        public final /* synthetic */ android.content.Context KWHzl;

        @Override // o.InterfaceC57916yrT
        public void OLrzqt() {
        }

        public ActionBar(android.content.Context context) {
            this.KWHzl = context;
        }

        @Override // o.InterfaceC57916yrT
        public void KWHzl() {
            C57968ysS c57968ysS = C57968ysS.KWHzl;
            C58013ytK.EZpvd(c57968ysS.gEmmrt(), "pacemaker: call supervisor", new java.lang.Object[0]);
            C57974ysY c57974ysYAYXKKw = c57968ysS.AYXKKw();
            Intrinsics.copydefault(c57974ysYAYXKKw);
            if (!c57974ysYAYXKKw.AEQbTJ()) {
                C58029yta.copydefault.KWHzl(this.KWHzl);
                return;
            }
            ServiceC58030ytb.Application application = ServiceC58030ytb.Companion;
            android.content.Context context = this.KWHzl;
            Intrinsics.copydefault(context);
            application.KWHzl(context);
        }
    }

    public final void OLrzqt(android.content.Context context) {
        if (EZpvd == null) {
            EZpvd = new ActionBar(context);
            InterfaceC57913yrQ interfaceC57913yrQIsConnected = C58001ysz.AEQbTJ.isConnected();
            InterfaceC57916yrT interfaceC57916yrT = EZpvd;
            Intrinsics.copydefault(interfaceC57916yrT);
            interfaceC57913yrQIsConnected.KWHzl(interfaceC57916yrT);
            C58013ytK.EZpvd(C57968ysS.KWHzl.gEmmrt(), "pacemaker: install pacemaker", new java.lang.Object[0]);
        }
    }

    public final void OLrzqt() {
        if (EZpvd != null) {
            InterfaceC57913yrQ interfaceC57913yrQIsConnected = C58001ysz.AEQbTJ.isConnected();
            InterfaceC57916yrT interfaceC57916yrT = EZpvd;
            Intrinsics.copydefault(interfaceC57916yrT);
            interfaceC57913yrQIsConnected.AEQbTJ(interfaceC57916yrT);
            EZpvd = null;
            C58013ytK.EZpvd(C57968ysS.KWHzl.gEmmrt(), "pacemaker: uninstall pacemaker", new java.lang.Object[0]);
        }
    }

    public final void AEQbTJ(android.content.Context context) {
        AEQbTJ = C58014ytL.copydefault(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        C57968ysS c57968ysS = C57968ysS.KWHzl;
        if (c57968ysS.values()) {
            intentFilter.addAction("TELL_SUPERVISOR_FOREGROUND");
            if (context != null) {
                context.registerReceiver(this, intentFilter, AEQbTJ(), null);
            }
            C58013ytK.EZpvd(c57968ysS.gEmmrt(), "pacemaker: receiver installed", new java.lang.Object[0]);
            return;
        }
        OLrzqt(context);
    }

    public final void KWHzl(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("TELL_SUPERVISOR_FOREGROUND");
        intent.putExtra("KEY_PROCESS_NAME", C58014ytL.OLrzqt(context));
        intent.putExtra("KEY_PROCESS_PID", android.os.Process.myPid());
        if (context != null) {
            context.sendBroadcast(intent, copydefault.AEQbTJ());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull android.content.Context context, android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == -1689097108 && action.equals("TELL_SUPERVISOR_FOREGROUND")) {
            C57968ysS c57968ysS = C57968ysS.KWHzl;
            C57974ysY c57974ysYAYXKKw = c57968ysS.AYXKKw();
            if (c57974ysYAYXKKw == null || true != c57974ysYAYXKKw.copydefault()) {
                C58013ytK.OLrzqt(c57968ysS.gEmmrt(), "supervisor was disabled", new java.lang.Object[0]);
                return;
            }
            if (!c57968ysS.values()) {
                C58013ytK.OLrzqt(c57968ysS.gEmmrt(), "ERROR: this is NOT supervisor process", new java.lang.Object[0]);
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("KEY_PROCESS_NAME");
            int intExtra = intent.getIntExtra("KEY_PROCESS_PID", -1);
            C58013ytK.EZpvd(c57968ysS.gEmmrt(), "pacemaker: receive TELL_SUPERVISOR_FOREGROUND from " + intExtra + '-' + stringExtra, new java.lang.Object[0]);
            ServiceC58030ytb.Application application = ServiceC58030ytb.Companion;
            android.content.Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            application.KWHzl(applicationContext);
        }
    }
}
