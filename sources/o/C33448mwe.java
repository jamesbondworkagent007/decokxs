package o;

import com.okinc.core.ok_app.ModeManager;
import com.okinc.core.ok_app.modeswitch.usecase.AppModeAnimationUseCase$animatePro$2;
import com.okinc.core.ok_app.modeswitch.usecase.AppModeAnimationUseCase$invoke$1;
import com.okinc.core.ok_app.modeswitch.usecase.AppModeAnimationUseCase$invoke$2;
import com.okinc.core.ok_app.modeswitch.usecase.AppModeAnimationUseCase$switchWithAnimation$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC33173mrU;
import o.AbstractC33240msi;
import o.AbstractC33249msr;
import o.C33160mrH;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33448mwe {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static C33448mwe copydefault;
    public final C33447mwd AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C33448mwe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C33448mwe(@NotNull C33447mwd c33447mwd) {
        Intrinsics.checkNotNullParameter(c33447mwd, "");
        this.AEQbTJ = c33447mwd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.mwd:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.mwd:0x0006: INVOKE (wrap:o.mwd$Activity:0x0004: SGET  A[WRAPPED] (LINE:26) o.mwd.Companion o.mwd$Activity) VIRTUAL call: o.mwd.Activity.EZpvd():o.mwd A[MD:():o.mwd (m), WRAPPED] (LINE:26)) : (r1v0 o.mwd))
 A[MD:(o.mwd):void (m)] (LINE:25) call: o.mwe.<init>(o.mwd):void type: THIS */
    public /* synthetic */ C33448mwe(C33447mwd c33447mwd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C33447mwd.Companion.EZpvd() : c33447mwd);
    }

    public static /* synthetic */ java.lang.Object invoke$default(C33448mwe c33448mwe, AbstractC33240msi abstractC33240msi, android.content.Context context, AbstractC33240msi abstractC33240msi2, android.os.Bundle bundle, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            bundle = null;
        }
        return c33448mwe.OLrzqt(abstractC33240msi, context, abstractC33240msi2, bundle, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull AbstractC33240msi abstractC33240msi, @NotNull android.content.Context context, @NotNull AbstractC33240msi abstractC33240msi2, android.os.Bundle bundle, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AppModeAnimationUseCase$invoke$1 appModeAnimationUseCase$invoke$1;
        android.os.Bundle bundle2;
        C33448mwe c33448mwe;
        android.content.Context context2;
        int i;
        C33448mwe c33448mwe2;
        android.content.Context context3;
        AbstractC33173mrU abstractC33173mrU;
        AbstractC33173mrU.TaskDescription taskDescription;
        MainCoroutineDispatcher main;
        AppModeAnimationUseCase$invoke$2 appModeAnimationUseCase$invoke$2;
        AbstractC33240msi abstractC33240msi3 = abstractC33240msi;
        if (continuation instanceof AppModeAnimationUseCase$invoke$1) {
            appModeAnimationUseCase$invoke$1 = (AppModeAnimationUseCase$invoke$1) continuation;
            int i2 = appModeAnimationUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appModeAnimationUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                appModeAnimationUseCase$invoke$1 = new AppModeAnimationUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = appModeAnimationUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = appModeAnimationUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("ModeSwitch", "invoke: Lite mode animation - from=" + abstractC33240msi2 + ", to=" + abstractC33240msi3);
            if (abstractC33240msi3 instanceof AbstractC33240msi.LoaderManager) {
                pUU.KWHzl("ModeSwitch", "invoke: NextMode is Web3, saving last Cefi mode");
                C33447mwd c33447mwd = this.AEQbTJ;
                appModeAnimationUseCase$invoke$1.L$0 = this;
                appModeAnimationUseCase$invoke$1.L$1 = abstractC33240msi3;
                appModeAnimationUseCase$invoke$1.L$2 = context;
                bundle2 = bundle;
                appModeAnimationUseCase$invoke$1.L$3 = bundle2;
                appModeAnimationUseCase$invoke$1.label = 1;
                if (c33447mwd.KWHzl(abstractC33240msi2, appModeAnimationUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                c33448mwe2 = this;
                context3 = context;
            } else {
                bundle2 = bundle;
                if (abstractC33240msi3 instanceof AbstractC33240msi.TaskDescription) {
                    pUU.KWHzl("ModeSwitch", "invoke: NextMode is Pay");
                    c33448mwe = this;
                    i = 5;
                    context2 = context;
                } else {
                    int i4 = C33367mvC.copydefault() ? 2 : 1;
                    pUU.KWHzl("ModeSwitch", "invoke: NextMode is Cefi, isLiteAvailable=" + C33367mvC.copydefault() + ", appMode=" + i4);
                    c33448mwe = this;
                    context2 = context;
                    i = i4;
                }
                android.os.Bundle bundle3 = bundle2;
                if (!Intrinsics.EZpvd(abstractC33240msi3, AbstractC33240msi.ActionBar.EZpvd)) {
                    java.lang.String string = context2.getString(C33160mrH.TaskDescription.fetchVPNInfo);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    taskDescription = new AbstractC33173mrU.TaskDescription(string);
                } else {
                    if (!Intrinsics.EZpvd(abstractC33240msi3, AbstractC33240msi.Activity.OLrzqt)) {
                        if (!Intrinsics.EZpvd(abstractC33240msi3, AbstractC33240msi.Application.copydefault) && !Intrinsics.EZpvd(abstractC33240msi3, AbstractC33240msi.LoaderManager.EZpvd) && !Intrinsics.EZpvd(abstractC33240msi3, AbstractC33240msi.TaskDescription.OLrzqt)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC33173mrU.Activity activity = AbstractC33173mrU.Activity.EZpvd;
                        abstractC33173mrU = activity;
                        pUU.KWHzl("ModeSwitch", "invoke: appMode=" + i + ", appModeTag=" + abstractC33173mrU);
                        main = Dispatchers.getMain();
                        appModeAnimationUseCase$invoke$2 = new AppModeAnimationUseCase$invoke$2(c33448mwe, context2, i, abstractC33173mrU, bundle3, null);
                        appModeAnimationUseCase$invoke$1.L$0 = null;
                        appModeAnimationUseCase$invoke$1.L$1 = null;
                        appModeAnimationUseCase$invoke$1.L$2 = null;
                        appModeAnimationUseCase$invoke$1.L$3 = null;
                        appModeAnimationUseCase$invoke$1.label = 2;
                        if (BuildersKt.withContext(main, appModeAnimationUseCase$invoke$2, appModeAnimationUseCase$invoke$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    java.lang.String string2 = context2.getString(C33160mrH.TaskDescription.AYXKKw);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    taskDescription = new AbstractC33173mrU.TaskDescription(string2);
                }
                abstractC33173mrU = taskDescription;
                pUU.KWHzl("ModeSwitch", "invoke: appMode=" + i + ", appModeTag=" + abstractC33173mrU);
                main = Dispatchers.getMain();
                appModeAnimationUseCase$invoke$2 = new AppModeAnimationUseCase$invoke$2(c33448mwe, context2, i, abstractC33173mrU, bundle3, null);
                appModeAnimationUseCase$invoke$1.L$0 = null;
                appModeAnimationUseCase$invoke$1.L$1 = null;
                appModeAnimationUseCase$invoke$1.L$2 = null;
                appModeAnimationUseCase$invoke$1.L$3 = null;
                appModeAnimationUseCase$invoke$1.label = 2;
                if (BuildersKt.withContext(main, appModeAnimationUseCase$invoke$2, appModeAnimationUseCase$invoke$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            android.os.Bundle bundle4 = (android.os.Bundle) appModeAnimationUseCase$invoke$1.L$3;
            context3 = (android.content.Context) appModeAnimationUseCase$invoke$1.L$2;
            AbstractC33240msi abstractC33240msi4 = (AbstractC33240msi) appModeAnimationUseCase$invoke$1.L$1;
            c33448mwe2 = (C33448mwe) appModeAnimationUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(obj);
            bundle2 = bundle4;
            abstractC33240msi3 = abstractC33240msi4;
        }
        context2 = context3;
        i = 3;
        c33448mwe = c33448mwe2;
        android.os.Bundle bundle32 = bundle2;
        if (!Intrinsics.EZpvd(abstractC33240msi3, AbstractC33240msi.ActionBar.EZpvd)) {
        }
        abstractC33173mrU = taskDescription;
        pUU.KWHzl("ModeSwitch", "invoke: appMode=" + i + ", appModeTag=" + abstractC33173mrU);
        main = Dispatchers.getMain();
        appModeAnimationUseCase$invoke$2 = new AppModeAnimationUseCase$invoke$2(c33448mwe, context2, i, abstractC33173mrU, bundle32, null);
        appModeAnimationUseCase$invoke$1.L$0 = null;
        appModeAnimationUseCase$invoke$1.L$1 = null;
        appModeAnimationUseCase$invoke$1.L$2 = null;
        appModeAnimationUseCase$invoke$1.L$3 = null;
        appModeAnimationUseCase$invoke$1.label = 2;
        if (BuildersKt.withContext(main, appModeAnimationUseCase$invoke$2, appModeAnimationUseCase$invoke$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object animatePro$default(C33448mwe c33448mwe, AbstractC33249msr abstractC33249msr, android.content.Context context, AbstractC33249msr abstractC33249msr2, android.os.Bundle bundle, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            bundle = null;
        }
        return c33448mwe.OLrzqt(abstractC33249msr, context, abstractC33249msr2, bundle, (Continuation<? super Unit>) continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull AbstractC33249msr abstractC33249msr, @NotNull android.content.Context context, @NotNull AbstractC33249msr abstractC33249msr2, android.os.Bundle bundle, @NotNull Continuation<? super Unit> continuation) {
        int i;
        ActionBar actionBar;
        pUU.KWHzl("ModeSwitch", "animatePro: Pro mode animation - from=" + abstractC33249msr2 + ", to=" + abstractC33249msr);
        if (abstractC33249msr instanceof AbstractC33249msr.ActionBar) {
            pUU.KWHzl("ModeSwitch", "animatePro: NextMode is Web3");
            i = 3;
        } else if (abstractC33249msr instanceof AbstractC33249msr.Application) {
            pUU.KWHzl("ModeSwitch", "animatePro: NextMode is Pay");
            i = 5;
        } else {
            i = C33367mvC.valueOf() ? 1 : 2;
            pUU.KWHzl("ModeSwitch", "animatePro: NextMode is Exchange, isProAvailable=" + C33367mvC.valueOf() + ", appMode=" + i);
        }
        int i2 = i;
        if (Intrinsics.EZpvd(abstractC33249msr, abstractC33249msr2)) {
            pUU.EZpvd("ModeSwitch", "animatePro: Same mode, no animation");
            actionBar = ActionBar.Activity.AEQbTJ;
        } else {
            actionBar = ActionBar.Application.KWHzl;
        }
        ActionBar actionBar2 = actionBar;
        pUU.KWHzl("ModeSwitch", "animatePro: appMode=" + i2 + ", animationType=" + actionBar2);
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new AppModeAnimationUseCase$animatePro$2(this, actionBar2, context, i2, bundle, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object switchWithAnimation$default(C33448mwe c33448mwe, ActionBar actionBar, android.app.Activity activity, int i, AbstractC33173mrU abstractC33173mrU, android.os.Bundle bundle, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            bundle = null;
        }
        return c33448mwe.OLrzqt(actionBar, activity, i, abstractC33173mrU, bundle, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(ActionBar actionBar, android.app.Activity activity, int i, AbstractC33173mrU abstractC33173mrU, android.os.Bundle bundle, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AppModeAnimationUseCase$switchWithAnimation$1 appModeAnimationUseCase$switchWithAnimation$1;
        if (continuation instanceof AppModeAnimationUseCase$switchWithAnimation$1) {
            appModeAnimationUseCase$switchWithAnimation$1 = (AppModeAnimationUseCase$switchWithAnimation$1) continuation;
            int i2 = appModeAnimationUseCase$switchWithAnimation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appModeAnimationUseCase$switchWithAnimation$1.label = i2 - Integer.MIN_VALUE;
            } else {
                appModeAnimationUseCase$switchWithAnimation$1 = new AppModeAnimationUseCase$switchWithAnimation$1(this, continuation);
            }
        }
        AppModeAnimationUseCase$switchWithAnimation$1 appModeAnimationUseCase$switchWithAnimation$12 = appModeAnimationUseCase$switchWithAnimation$1;
        java.lang.Object obj = appModeAnimationUseCase$switchWithAnimation$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = appModeAnimationUseCase$switchWithAnimation$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("ModeSwitch", "switchWithAnimation: animationType=" + actionBar + ", appMode=" + i + ", appModeTag=" + abstractC33173mrU);
            appModeAnimationUseCase$switchWithAnimation$12.L$0 = actionBar;
            appModeAnimationUseCase$switchWithAnimation$12.L$1 = activity;
            appModeAnimationUseCase$switchWithAnimation$12.L$2 = bundle;
            appModeAnimationUseCase$switchWithAnimation$12.I$0 = i;
            appModeAnimationUseCase$switchWithAnimation$12.label = 1;
            C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(appModeAnimationUseCase$switchWithAnimation$12));
            InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
            if (interfaceC33171mrS == null) {
                pUU.copydefault("ModeSwitch", "switchWithAnimation: AppService not available");
            } else if (actionBar instanceof ActionBar.Application) {
                pUU.EZpvd("ModeSwitch", "switchWithAnimation: Using new mode switch animation");
                C56443yFo.KWHzl(ModeManager.switchAppMode$default(ModeManager.EZpvd, activity, i, true, 0, bundle, false, true, new Activity(c56434yFf), 32, null));
            } else {
                boolean z = !(actionBar instanceof ActionBar.Activity);
                pUU.KWHzl("ModeSwitch", "switchWithAnimation: Switching without new animation, showAnimation=" + z);
                InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS, activity, i, z, 0, bundle, null, 40, null);
                Result.Application application = Result.Companion;
                c56434yFf.resumeWith(Result.m7377constructorimpl(C56443yFo.KWHzl(true)));
            }
            java.lang.Object objKWHzl = c56434yFf.KWHzl();
            if (objKWHzl == C56442yFn.copydefault()) {
                C56447yFs.copydefault(appModeAnimationUseCase$switchWithAnimation$12);
            }
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("ModeSwitch", "switchWithAnimation: Animation complete");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mwe$Activity */
    public static final class Activity implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ Continuation<java.lang.Boolean> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Continuation<? super java.lang.Boolean> continuation) {
            this.OLrzqt = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            AEQbTJ(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(boolean z) {
            Continuation<java.lang.Boolean> continuation = this.OLrzqt;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: o.mwe$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwe.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C33448mwe OLrzqt() {
            C33448mwe c33448mwe = C33448mwe.copydefault;
            if (c33448mwe == null) {
                synchronized (this) {
                    c33448mwe = C33448mwe.copydefault;
                    if (c33448mwe == null) {
                        c33448mwe = new C33448mwe(null, 1, 0 == true ? 1 : 0);
                        TaskDescription taskDescription = C33448mwe.Companion;
                        C33448mwe.copydefault = c33448mwe;
                    }
                }
            }
            return c33448mwe;
        }
    }

    /* JADX INFO: renamed from: o.mwe$ActionBar */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwe.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.mwe$ActionBar$Application */
        public static final class Application extends ActionBar {
            public static final Application KWHzl = new Application();

            private Application() {
                super(null);
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.mwe$ActionBar$Activity */
        public static final class Activity extends ActionBar {
            public static final Activity AEQbTJ = new Activity();

            private Activity() {
                super(null);
            }
        }
    }
}
