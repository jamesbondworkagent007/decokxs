package o;

import android.app.Application;
import com.okinc.business.defi.DefiApplicationModule$onCreate$2$onAppEnterForeground$1;
import com.okinc.business.defi.wallet.DefiWalletMainActivity;
import java.util.Deque;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.C10604brb;
import o.C12827cuN;
import o.C15530eLt;
import o.C9678baC;
import o.InterfaceC13426dKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.baC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9678baC extends C43265rly {
    public static android.app.Application OLrzqt;
    public boolean EZpvd = true;
    public boolean copydefault = true;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.baJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9678baC.OLrzqt();
        }
    });
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public static final Deque<android.app.Activity> KWHzl = new LinkedList();

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return 250;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43265rly
    public void onInit(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: renamed from: o.baC$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.baC.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.app.Application AEQbTJ() {
            android.app.Application application = C9678baC.OLrzqt;
            if (application != null) {
                return application;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        public static /* synthetic */ android.app.Activity getActiveActivity$default(Activity activity, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return activity.AEQbTJ(z);
        }

        public final android.app.Activity AEQbTJ(boolean z) {
            for (android.app.Activity activity : C9678baC.KWHzl) {
                if (!activity.isFinishing()) {
                    if (z && C20690gle.OLrzqt.AEQbTJ()) {
                        Activity activity2 = C9678baC.Companion;
                        Intrinsics.copydefault(activity);
                        if (!activity2.KWHzl(activity)) {
                        }
                    }
                    return activity;
                }
            }
            return null;
        }

        public final boolean copydefault() {
            java.lang.Object next;
            java.util.Iterator it = C9678baC.KWHzl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                android.app.Activity activity = (android.app.Activity) next;
                Activity activity2 = C9678baC.Companion;
                Intrinsics.copydefault(activity);
                if (activity2.KWHzl(activity)) {
                    break;
                }
            }
            return next != null;
        }

        public final boolean KWHzl(android.app.Activity activity) {
            return (activity instanceof InterfaceC20523giW) || activity.getIntent().getBooleanExtra("ITransferActivity", false);
        }
    }

    public final fVK KWHzl() {
        return (fVK) this.valueOf.getValue();
    }

    public static final fVK OLrzqt() {
        return new fVK(InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).DTwDnp());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt = getApplication();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        getApplication().registerActivityLifecycleCallbacks(new TaskDescription());
        C54819xWm.KWHzl().AEQbTJ(new Application());
        BCE.registerWalletHeaderProvider(new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.baC$TaskDescription */
    public static final class TaskDescription implements Application.ActivityLifecycleCallbacks {
        public boolean AEQbTJ = true;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            C9678baC.KWHzl.addFirst(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            try {
                if (activity instanceof DefiWalletMainActivity) {
                    if (!this.AEQbTJ) {
                        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXIsConnected = C10954byG.EZpvd.AYXKKw().isConnected();
                        final Function1 function1 = new Function1() { // from class: o.baK
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C9678baC.TaskDescription.KWHzl((java.lang.Boolean) obj);
                            }
                        };
                        InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.baI
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C9678baC.TaskDescription.KWHzl(function1, obj);
                            }
                        };
                        final Function1 function12 = new Function1() { // from class: o.baG
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C9678baC.TaskDescription.OLrzqt((java.lang.Throwable) obj);
                            }
                        };
                        abstractC58185ywXIsConnected.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.baH
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C9678baC.TaskDescription.OLrzqt(function12, obj);
                            }
                        });
                    }
                    this.AEQbTJ = false;
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }

        public static final Unit KWHzl(java.lang.Boolean bool) {
            return Unit.INSTANCE;
        }

        public static final void KWHzl(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit OLrzqt(java.lang.Throwable th) {
            return Unit.INSTANCE;
        }

        public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            C9678baC.KWHzl.remove(activity);
            C20690gle c20690gle = C20690gle.OLrzqt;
            if (!c20690gle.AEQbTJ() || C9678baC.Companion.copydefault()) {
                return;
            }
            c20690gle.copydefault(false);
        }
    }

    /* JADX INFO: renamed from: o.baC$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application implements InterfaceC54816xWj {
        public Application() {
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            C14436dlS.KWHzl.copydefault(java.lang.System.currentTimeMillis());
        }

        @Override // o.InterfaceC54816xWj
        public void OLrzqt(android.app.Activity activity) {
            super.OLrzqt(activity);
            try {
                if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz()) {
                    if (C9678baC.this.EZpvd) {
                        C9678baC.this.EZpvd = false;
                        return;
                    }
                    if (!(C9678baC.Companion.AEQbTJ(false) instanceof DefiWalletMainActivity)) {
                        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXIsConnected = C10954byG.EZpvd.AYXKKw().isConnected();
                        final Function1 function1 = new Function1() { // from class: o.baN
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C9678baC.Application.KWHzl((java.lang.Boolean) obj);
                            }
                        };
                        InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.baP
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C9678baC.Application.OLrzqt(function1, obj);
                            }
                        };
                        final Function1 function12 = new Function1() { // from class: o.baO
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C9678baC.Application.KWHzl((java.lang.Throwable) obj);
                            }
                        };
                        abstractC58185ywXIsConnected.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.baM
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C9678baC.Application.KWHzl(function12, obj);
                            }
                        });
                    }
                    if (eLJ.Companion.AEQbTJ()) {
                        C15530eLt.ActionBar.getInstance$default(C15530eLt.Companion, null, 1, null).EZpvd(true);
                    }
                    C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null).djBIcL();
                    C14436dlS.KWHzl.AEQbTJ(java.lang.System.currentTimeMillis());
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }

        public static final Unit KWHzl(java.lang.Boolean bool) {
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(java.lang.Throwable th) {
            return Unit.INSTANCE;
        }

        public static final void KWHzl(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            super.copydefault();
            if (!C9678baC.this.copydefault) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new DefiApplicationModule$onCreate$2$onAppEnterForeground$1(C9678baC.this, null), 3, null);
            } else {
                C9678baC.this.copydefault = false;
            }
        }
    }

    /* JADX INFO: renamed from: o.baC$StateListAnimator */
    public static final class StateListAnimator implements BCu {
        @Override // o.BCu
        public BCp copydefault() {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
            if (abstractC12782ctV == null) {
                return new BCp(C56424yEw.KWHzl());
            }
            return new BCp(C13934dbu.Companion.OLrzqt(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), "", ""));
        }

        @Override // o.BCu
        public BCr AEQbTJ() {
            return new BCr(C13934dbu.Companion.OLrzqt());
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onLaunchComplete() {
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.OLrzqt(InterfaceC48893ueK.class);
        if (interfaceC48893ueK != null) {
            interfaceC48893ueK.AEQbTJ(new C13661dTp());
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        dRX.EZpvd.OLrzqt(context, interfaceC43253rlm);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        dRB.OLrzqt.copydefault(context, interfaceC43299rmf, this);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerCustomHandler(@NotNull android.content.Context context, @NotNull InterfaceC43220rlF interfaceC43220rlF) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43220rlF, "");
        super.registerCustomHandler(context, interfaceC43220rlF);
        C13606dRo.copydefault.copydefault(context, interfaceC43220rlF);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        C13604dRm.copydefault.OLrzqt(context, interfaceC43237rlW);
    }
}
