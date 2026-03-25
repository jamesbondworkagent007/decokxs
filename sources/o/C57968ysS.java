package o;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import com.tencent.matrix.lifecycle.MatrixLifecycleThread;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C57964ysO;
import o.C57968ysS;
import o.C57970ysU;
import o.C57978ysc;
import o.C58001ysz;
import o.C58013ytK;
import o.C58014ytL;
import o.InterfaceC57909yrM;
import o.InterfaceC57967ysR;
import o.ServiceC58030ytb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57968ysS implements InterfaceC57960ysK {
    public static final InterfaceC57912yrP AEQbTJ;
    public static final InterfaceC57913yrQ EZpvd;
    public static final InterfaceC57912yrP OLrzqt;
    public static final InterfaceC57912yrP copydefault;
    public static volatile android.app.Application djBIcL;
    public static C57974ysY gEmmrt;
    public static volatile InterfaceC57967ysR valueOf;
    public final /* synthetic */ InterfaceC57960ysK values = C57969ysT.AEQbTJ.OLrzqt();
    public static final C57968ysS KWHzl = new C57968ysS();
    public static final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0<java.lang.String>() { // from class: com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$tag$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Matrix.ProcessSupervisor_" + C57968ysS.KWHzl.isConnected();
        }
    });
    public static final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0<java.lang.Boolean>() { // from class: com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$isSupervisor$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            ServiceInfo serviceInfo;
            if (C57968ysS.djBIcL == null) {
                throw new IllegalStateException("Supervisor NOT initialized yet or Supervisor is disabled!!!");
            }
            C57968ysS c57968ysS = C57968ysS.KWHzl;
            try {
                Application application = C57968ysS.djBIcL;
                Intrinsics.copydefault(application);
                PackageManager packageManager = application.getPackageManager();
                Application application2 = C57968ysS.djBIcL;
                Intrinsics.copydefault(application2);
                ServiceInfo[] serviceInfoArr = packageManager.getPackageInfo(application2.getPackageName(), 4).services;
                Intrinsics.checkNotNullExpressionValue(serviceInfoArr, "");
                int length = serviceInfoArr.length;
                for (int i = 0; i < length; i++) {
                    serviceInfo = serviceInfoArr[i];
                    if (Intrinsics.EZpvd((Object) serviceInfo.name, (Object) ServiceC58030ytb.class.getName())) {
                        break;
                    }
                }
            } catch (Throwable th) {
                C58013ytK.OLrzqt("Matrix.ProcessSupervisor", th, "", new Object[0]);
            }
            serviceInfo = null;
            Application application3 = C57968ysS.djBIcL;
            Intrinsics.copydefault(application3);
            return Boolean.valueOf(Intrinsics.EZpvd((Object) C58014ytL.OLrzqt(application3), (Object) (serviceInfo != null ? serviceInfo.processName : null)) || ServiceC58030ytb.Companion.KWHzl());
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57912yrP AEQbTJ() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57960ysK
    public void AEQbTJ(@NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, java.lang.Boolean> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.values.AEQbTJ(yho);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57960ysK
    public void AEQbTJ(@NotNull yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Boolean, Unit> yht) {
        Intrinsics.checkNotNullParameter(yht, "");
        this.values.AEQbTJ(yht);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57974ysY AYXKKw() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57967ysR AhwBna() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57912yrP EZpvd() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InterfaceC57967ysR interfaceC57967ysR) {
        valueOf = interfaceC57967ysR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57960ysK
    public java.lang.String OLrzqt() {
        return this.values.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57912yrP copydefault() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57913yrQ valueOf() {
        return EZpvd;
    }

    private C57968ysS() {
    }

    static {
        C57978ysc.StateListAnimator stateListAnimator = C57978ysc.Companion;
        EZpvd = new Application(stateListAnimator.OLrzqt(), C58001ysz.AEQbTJ.isConnected());
        OLrzqt = new ActionBar(stateListAnimator.AEQbTJ(), C57993ysr.AEQbTJ);
        AEQbTJ = new StateListAnimator(stateListAnimator.AEQbTJ(), C57996ysu.AEQbTJ);
        copydefault = new Activity(null, 1, 0 == true ? 1 : 0);
    }

    public final java.lang.String gEmmrt() {
        return (java.lang.String) AhwBna.getValue();
    }

    public final java.lang.String isConnected() throws java.lang.Throwable {
        if (C58014ytL.AEQbTJ(djBIcL)) {
            return "Main";
        }
        java.lang.String strOLrzqt = C58014ytL.OLrzqt(djBIcL);
        Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
        java.lang.String[] strArr = (java.lang.String[]) StringsKt__StringsKt.split$default((java.lang.CharSequence) strOLrzqt, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
        return strArr.length > 1 ? strArr[1] : "unknown";
    }

    public final boolean djBIcL() {
        return EZpvd.AEQbTJ();
    }

    public final boolean values() {
        return ((java.lang.Boolean) AYXKKw.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: o.ysS$Application */
    public static final class Application extends C57964ysO implements InterfaceC57913yrQ {
        public Application(Function1<? super java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> function1, InterfaceC57913yrQ interfaceC57913yrQ) {
            super(function1, interfaceC57913yrQ, "StartedStateOwner");
        }
    }

    /* JADX INFO: renamed from: o.ysS$ActionBar */
    public static final class ActionBar extends C57964ysO implements InterfaceC57912yrP {
        public ActionBar(Function1<? super java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> function1, C57993ysr c57993ysr) {
            super(function1, c57993ysr, "ExplicitBackgroundOwner");
        }
    }

    /* JADX INFO: renamed from: o.ysS$StateListAnimator */
    public static final class StateListAnimator extends C57964ysO implements InterfaceC57912yrP {
        public StateListAnimator(Function1<? super java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> function1, C57996ysu c57996ysu) {
            super(function1, c57996ysu, "DeepBackgroundOwner");
        }
    }

    /* JADX INFO: renamed from: o.ysS$Activity */
    public static final class Activity implements InterfaceC57912yrP {
        public final C57980yse OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57915yrS
        public void AEQbTJ(@NotNull InterfaceC57916yrT interfaceC57916yrT) {
            Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
            this.OLrzqt.AEQbTJ(interfaceC57916yrT);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57914yrR
        public boolean AEQbTJ() {
            return this.OLrzqt.AEQbTJ();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57915yrS
        public void KWHzl(@NotNull InterfaceC57916yrT interfaceC57916yrT) {
            Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
            this.OLrzqt.KWHzl(interfaceC57916yrT);
        }

        /* JADX INFO: renamed from: o.ysS$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5 extends C57980yse implements InterfaceC57909yrM {
            public AnonymousClass5(Function1<? super java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> function1, InterfaceC57918yrV[] interfaceC57918yrVArr) {
                super(function1, interfaceC57918yrVArr);
            }

            /* JADX DEBUG: Possible override for method o.yse.copydefault()V */
            @Override // o.InterfaceC57909yrM
            public boolean copydefault() {
                return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
            }
        }

        public Activity(@NotNull C57980yse c57980yse) {
            Intrinsics.checkNotNullParameter(c57980yse, "");
            this.OLrzqt = c57980yse;
        }

        public /* synthetic */ Activity(C57980yse c57980yse, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                Function1<java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> function1AEQbTJ = C57978ysc.Companion.AEQbTJ();
                C57968ysS c57968ysS = C57968ysS.KWHzl;
                c57980yse = new AnonymousClass5(function1AEQbTJ, new InterfaceC57918yrV[]{C57985ysj.OLrzqt((InterfaceC57918yrV) c57968ysS.AEQbTJ(), true), C57985ysj.OLrzqt(C57985ysj.EZpvd(c57968ysS.EZpvd()), true)});
            }
            this(c57980yse);
        }
    }

    public final boolean KWHzl(@NotNull android.app.Application application, C57974ysY c57974ysY) {
        Intrinsics.checkNotNullParameter(application, "");
        gEmmrt = c57974ysY;
        if (c57974ysY == null || true != c57974ysY.copydefault()) {
            C58013ytK.EZpvd("Matrix.ProcessSupervisor", "Supervisor is disabled", new java.lang.Object[0]);
            return false;
        }
        djBIcL = application;
        if (values()) {
            EZpvd(application);
        }
        KWHzl(c57974ysY.AEQbTJ(), application);
        return values();
    }

    public final void EZpvd(android.app.Application application) {
        ServiceC58030ytb.Companion.KWHzl(application);
        C58013ytK.EZpvd(gEmmrt(), "initSupervisor", new java.lang.Object[0]);
    }

    public final void KWHzl(boolean z, android.app.Application application) {
        android.content.Intent intent = new android.content.Intent(application, (java.lang.Class<?>) ServiceC58030ytb.class);
        gEmmrt();
        C58029yta.copydefault.AEQbTJ(application);
        application.bindService(intent, new TaskDescription(application, intent), z ? 1 : 32);
        C58013ytK.EZpvd(gEmmrt(), "inCharge", new java.lang.Object[0]);
    }

    /* JADX INFO: renamed from: o.ysS$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class TaskDescription implements android.content.ServiceConnection {
        public final /* synthetic */ android.app.Application OLrzqt;
        public final /* synthetic */ android.content.Intent copydefault;

        public TaskDescription(android.app.Application application, android.content.Intent intent) {
            this.OLrzqt = application;
            this.copydefault = intent;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, final android.os.IBinder iBinder) {
            android.os.Handler handlerOLrzqt = MatrixLifecycleThread.EZpvd.OLrzqt();
            final android.app.Application application = this.OLrzqt;
            handlerOLrzqt.post(new java.lang.Runnable() { // from class: o.ysP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57968ysS.TaskDescription.KWHzl(application, iBinder);
                }
            });
        }

        public static final void KWHzl(android.app.Application application, android.os.IBinder iBinder) {
            Intrinsics.checkNotNullParameter(application, "");
            C58029yta.copydefault.OLrzqt();
            C57970ysU.KWHzl.AEQbTJ(application);
            C57968ysS c57968ysS = C57968ysS.KWHzl;
            c57968ysS.EZpvd(InterfaceC57967ysR.StateListAnimator.AEQbTJ(iBinder));
            C58013ytK.EZpvd(c57968ysS.gEmmrt(), "on Supervisor Connected " + c57968ysS.AhwBna(), new java.lang.Object[0]);
            C58001ysz.AEQbTJ.copydefault(new StateListAnimator());
            InterfaceC57967ysR interfaceC57967ysRAhwBna = c57968ysS.AhwBna();
            if (interfaceC57967ysRAhwBna != null) {
                java.lang.String strGEmmrt = c57968ysS.gEmmrt();
                java.lang.String str = "supervisor is " + c57968ysS.AhwBna();
                try {
                    interfaceC57967ysRAhwBna.EZpvd(C57964ysO.Companion.OLrzqt((android.content.Context) application), C57969ysT.AEQbTJ.EZpvd(application));
                } catch (java.lang.Throwable th) {
                    C58013ytK.OLrzqt(strGEmmrt, th, str, new java.lang.Object[0]);
                }
            }
            C57964ysO.ActionBar actionBar = C57964ysO.Companion;
            android.app.Application application2 = C57968ysS.djBIcL;
            Intrinsics.copydefault(application2);
            actionBar.OLrzqt(application2);
        }

        /* JADX INFO: renamed from: o.ysS$TaskDescription$StateListAnimator */
        /* JADX INFO: loaded from: classes12.dex */
        public static final class StateListAnimator implements C58001ysz.ActionBar {
            @Override // o.C58001ysz.ActionBar
            public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                C57968ysS c57968ysS = C57968ysS.KWHzl;
                C58013ytK.copydefault(c57968ysS.gEmmrt(), "onSceneChanged: " + str2 + " -> " + str, new java.lang.Object[0]);
                InterfaceC57967ysR interfaceC57967ysRAhwBna = c57968ysS.AhwBna();
                if (interfaceC57967ysRAhwBna != null) {
                    java.lang.String strGEmmrt = c57968ysS.gEmmrt();
                    try {
                        interfaceC57967ysRAhwBna.KWHzl(str);
                    } catch (java.lang.Throwable th) {
                        C58013ytK.OLrzqt(strGEmmrt, th, "", new java.lang.Object[0]);
                    }
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(final android.content.ComponentName componentName) {
            android.os.Handler handlerOLrzqt = MatrixLifecycleThread.EZpvd.OLrzqt();
            final android.app.Application application = this.OLrzqt;
            final android.content.Intent intent = this.copydefault;
            handlerOLrzqt.post(new java.lang.Runnable() { // from class: o.ysV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57968ysS.TaskDescription.copydefault(componentName, application, this, intent);
                }
            });
        }

        public static final void copydefault(android.content.ComponentName componentName, final android.app.Application application, final TaskDescription taskDescription, final android.content.Intent intent) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            Intrinsics.checkNotNullParameter(intent, "");
            C57968ysS c57968ysS = C57968ysS.KWHzl;
            C58013ytK.OLrzqt(c57968ysS.gEmmrt(), "onServiceDisconnected " + componentName, new java.lang.Object[0]);
            c57968ysS.EZpvd((InterfaceC57967ysR) null);
            C58001ysz.AEQbTJ.copydefault((C58001ysz.ActionBar) null);
            C57964ysO.Companion.KWHzl();
            C58029yta.copydefault.AEQbTJ(application);
            try {
                application.unbindService(taskDescription);
            } catch (java.lang.Throwable unused) {
            }
            try {
                application.bindService(intent, taskDescription, 32);
                C58013ytK.OLrzqt(C57968ysS.KWHzl.gEmmrt(), "rebound supervisor", new java.lang.Object[0]);
                Unit unit = Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt(C57968ysS.KWHzl.gEmmrt(), th, "rebound supervisor failed", new java.lang.Object[0]);
                C57970ysU.KWHzl.KWHzl(application, new Function0<Unit>() { // from class: com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor$inCharge$conn$1$onServiceDisconnected$1$3$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C57968ysS.TaskDescription taskDescription2 = this.this$0;
                        C57968ysS c57968ysS2 = C57968ysS.KWHzl;
                        String strGEmmrt = c57968ysS2.gEmmrt();
                        Application application2 = application;
                        try {
                            application2.bindService(intent, taskDescription2, 32);
                            C57970ysU.KWHzl.AEQbTJ(application2);
                            C58013ytK.EZpvd(c57968ysS2.gEmmrt(), "subordinate pacemaker rebound supervisor", new Object[0]);
                        } catch (Throwable th2) {
                            C58013ytK.OLrzqt(strGEmmrt, th2, "", new Object[0]);
                        }
                    }
                });
            }
        }
    }
}
