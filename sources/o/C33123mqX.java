package o;

import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.core.ok_app.ModeManager;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import com.okinc.rxutils.RxBus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33244msm;
import o.AbstractC33246mso;
import o.AbstractC33247msp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mqX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33123mqX {
    public final InterfaceC47278tmy AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public java.lang.String KWHzl;
    public final C33396mvf OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final C33404mvn djBIcL;
    public final InterfaceC56387yDm valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final InterfaceC56387yDm<C33123mqX> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mqZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33123mqX.EZpvd();
        }
    });

    public C33123mqX(@NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull InterfaceC56387yDm<C33397mvg> interfaceC56387yDm, @NotNull C33404mvn c33404mvn, @NotNull C33396mvf c33396mvf) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(c33404mvn, "");
        Intrinsics.checkNotNullParameter(c33396mvf, "");
        this.AYXKKw = interfaceC47278tmy;
        this.djBIcL = c33404mvn;
        this.OLrzqt = c33396mvf;
        this.AhwBna = interfaceC56387yDm;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mrb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33123mqX.KWHzl(this.EZpvd);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.mrc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33123mqX.copydefault(this.EZpvd);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r1v0 o.tmy)
  (r2v0 o.yDm)
  (wrap:o.mvn:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.mvn:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:43) call: o.mvn.<init>():void type: CONSTRUCTOR) : (r3v0 o.mvn))
  (wrap:o.mvf:?: TERNARY null = ((wrap:int:0x0009: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.mvf:0x000f: CONSTRUCTOR (r1v0 o.tmy) A[MD:(o.tmy):void (m), WRAPPED] (LINE:44) call: o.mvf.<init>(o.tmy):void type: CONSTRUCTOR) : (r4v0 o.mvf))
 A[MD:(o.tmy, o.yDm<o.mvg>, o.mvn, o.mvf):void (m)] (LINE:40) call: o.mqX.<init>(o.tmy, o.yDm, o.mvn, o.mvf):void type: THIS */
    public /* synthetic */ C33123mqX(InterfaceC47278tmy interfaceC47278tmy, InterfaceC56387yDm interfaceC56387yDm, C33404mvn c33404mvn, C33396mvf c33396mvf, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC47278tmy, interfaceC56387yDm, (i & 4) != 0 ? new C33404mvn() : c33404mvn, (i & 8) != 0 ? new C33396mvf(interfaceC47278tmy) : c33396mvf);
    }

    public final C33397mvg valueOf() {
        return (C33397mvg) this.AhwBna.getValue();
    }

    public static final MutableStateFlow KWHzl(C33123mqX c33123mqX) {
        return StateFlowKt.MutableStateFlow(c33123mqX.gEmmrt());
    }

    public final MutableStateFlow<AbstractC33244msm> AhwBna() {
        return (MutableStateFlow) this.copydefault.getValue();
    }

    public static final StateFlow copydefault(C33123mqX c33123mqX) {
        return FlowKt.asStateFlow(c33123mqX.AhwBna());
    }

    public final StateFlow<AbstractC33244msm> AYXKKw() {
        return (StateFlow) this.valueOf.getValue();
    }

    public final java.lang.String djBIcL() {
        if (this.KWHzl == null) {
            AYXKKw().getValue();
        }
        java.lang.String str = this.KWHzl;
        Intrinsics.copydefault((java.lang.Object) str);
        return str;
    }

    public final boolean fARcdN() {
        return !valueOf().AEQbTJ(AbstractC33247msp.StateListAnimator.AEQbTJ);
    }

    public final AbstractC33244msm gEmmrt() {
        AbstractC33244msm abstractC33244msmDbNXlk;
        java.lang.String strCopydefault = C33460mwq.copydefault(this.AYXKKw);
        this.KWHzl = strCopydefault;
        AbstractC33244msm abstractC33244msmEZpvd = this.djBIcL.EZpvd(strCopydefault);
        if (abstractC33244msmEZpvd != null) {
            pUU.KWHzl("ModeSwitch-Manager", "initAppMode: mode from SP - " + abstractC33244msmEZpvd);
            return abstractC33244msmEZpvd;
        }
        ModeManager modeManager = ModeManager.EZpvd;
        if (modeManager.hDKMBd()) {
            abstractC33244msmDbNXlk = AbstractC33244msm.PendingIntent.KWHzl;
        } else if (modeManager.getNewProxyInstance()) {
            abstractC33244msmDbNXlk = AbstractC33244msm.TaskDescription.KWHzl;
        } else if (modeManager.AuCTel()) {
            abstractC33244msmDbNXlk = DbNXlk();
        } else {
            abstractC33244msmDbNXlk = modeManager.uzCIH() ? AbstractC33244msm.Application.KWHzl : null;
        }
        if (abstractC33244msmDbNXlk != null) {
            pUU.KWHzl("ModeSwitch-Manager", "initAppMode: mode from legacy - " + abstractC33244msmDbNXlk);
            this.djBIcL.AEQbTJ(abstractC33244msmDbNXlk, strCopydefault);
            return abstractC33244msmDbNXlk;
        }
        return AbstractC33244msm.Dialog.KWHzl;
    }

    public final AbstractC33244msm DbNXlk() {
        AbstractC33244msm abstractC33244msmAEQbTJ = this.djBIcL.AEQbTJ(C33460mwq.copydefault(this.AYXKKw));
        return abstractC33244msmAEQbTJ != null ? abstractC33244msmAEQbTJ : valueOf().copydefault(AbstractC33247msp.StateListAnimator.AEQbTJ);
    }

    public final boolean copydefault(AbstractC33244msm abstractC33244msm) {
        return valueOf().AEQbTJ(abstractC33244msm);
    }

    public final boolean isConnected() {
        return !(Intrinsics.EZpvd((java.lang.Object) djBIcL(), (java.lang.Object) C33460mwq.copydefault(this.AYXKKw)) ^ true) && copydefault(AYXKKw().getValue());
    }

    public final boolean EZpvd(@NotNull AbstractC33247msp abstractC33247msp) {
        Intrinsics.checkNotNullParameter(abstractC33247msp, "");
        java.util.List<AbstractC33244msm> listAEQbTJ = abstractC33247msp.AEQbTJ();
        if (!(listAEQbTJ instanceof java.util.Collection) || !listAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                if (AEQbTJ((AbstractC33244msm) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean AEQbTJ(@NotNull AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        return copydefault(abstractC33244msm);
    }

    public final java.util.List<AbstractC33244msm> fJNWhG() {
        return valueOf().OLrzqt(true);
    }

    public static /* synthetic */ void interceptSwitchMode$default(C33123mqX c33123mqX, android.content.Context context, AbstractC33244msm abstractC33244msm, Activity activity, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            abstractC33244msm = null;
        }
        if ((i & 4) != 0) {
            activity = Activity.Application.KWHzl;
        }
        if ((i & 8) != 0) {
            bundle = null;
        }
        c33123mqX.copydefault(context, abstractC33244msm, activity, bundle);
    }

    public final void copydefault(android.content.Context context, AbstractC33244msm abstractC33244msm, Activity activity, android.os.Bundle bundle) {
        pUU.KWHzl("ModeSwitch-Manager", "interceptSwitchMode: " + abstractC33244msm);
        if (abstractC33244msm != null) {
            OLrzqt(abstractC33244msm);
        }
        this.OLrzqt.EZpvd(context, bundle);
        this.OLrzqt.copydefault(context, AYXKKw().getValue(), AbstractC33244msm.Dialog.KWHzl, activity);
    }

    public final boolean AuCTel() {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
        InterfaceC33254msw interfaceC33254msw = listKWHzl != null ? (InterfaceC33254msw) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl) : null;
        return interfaceC33254msw != null && interfaceC33254msw.EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<AbstractC33244msm, android.os.Bundle> copydefault(android.os.Bundle bundle, Function1<? super AbstractC33244msm, java.lang.Boolean> function1) {
        C33257msz c33257mszKWHzl;
        java.lang.Object next;
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33256msy.class));
        if (listKWHzl != null) {
            java.util.Iterator it = listKWHzl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (function1.invoke(((InterfaceC33256msy) next).copydefault()).booleanValue()) {
                    break;
                }
            }
            InterfaceC33256msy interfaceC33256msy = (InterfaceC33256msy) next;
            c33257mszKWHzl = interfaceC33256msy != null ? interfaceC33256msy.KWHzl() : null;
        }
        if (c33257mszKWHzl != null) {
            AbstractC33244msm abstractC33244msmEZpvd = c33257mszKWHzl.EZpvd();
            if (copydefault(abstractC33244msmEZpvd)) {
                android.os.Bundle bundleBundleOf = BundleKt.bundleOf();
                if (bundle != null) {
                    bundleBundleOf.putAll(bundle);
                }
                android.os.Bundle bundleKWHzl = c33257mszKWHzl.KWHzl();
                if (bundleKWHzl != null) {
                    bundleBundleOf.putAll(bundleKWHzl);
                }
                pUU.KWHzl("ModeSwitch-Manager", "fallback mode: " + abstractC33244msmEZpvd);
                return C56390yDp.OLrzqt(abstractC33244msmEZpvd, bundleBundleOf);
            }
        }
        return C56390yDp.OLrzqt(null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.mqX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean switchToAppMode$default(C33123mqX c33123mqX, android.content.Context context, AbstractC33247msp abstractC33247msp, boolean z, Activity activity, android.os.Bundle bundle, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            activity = Activity.Application.KWHzl;
        }
        Activity activity2 = activity;
        if ((i & 16) != 0) {
            bundle = null;
        }
        android.os.Bundle bundle2 = bundle;
        if ((i & 32) != 0) {
            function1 = new Function1() { // from class: o.mqV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C33123mqX.OLrzqt(((java.lang.Boolean) obj2).booleanValue());
                }
            };
        }
        return c33123mqX.KWHzl(context, abstractC33247msp, z2, activity2, bundle2, function1);
    }

    public static final Unit OLrzqt(boolean z) {
        return Unit.INSTANCE;
    }

    public final boolean KWHzl(@NotNull android.content.Context context, @NotNull final AbstractC33247msp abstractC33247msp, boolean z, @NotNull Activity activity, android.os.Bundle bundle, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        kotlin.Pair<AbstractC33244msm, android.os.Bundle> pairOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(abstractC33247msp, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("ModeSwitch-Manager", "switchToAppMode, mode: " + abstractC33247msp + ", animated: " + z);
        java.lang.String strCopydefault = C33460mwq.copydefault(this.AYXKKw);
        AbstractC33244msm abstractC33244msmEZpvd = this.djBIcL.EZpvd(strCopydefault);
        if ((!Intrinsics.EZpvd(abstractC33244msmEZpvd != null ? abstractC33244msmEZpvd.KWHzl() : null, abstractC33247msp) || !copydefault(abstractC33244msmEZpvd)) && ((abstractC33244msmEZpvd = this.djBIcL.OLrzqt(strCopydefault, abstractC33247msp)) == null || !copydefault(abstractC33244msmEZpvd))) {
            abstractC33244msmEZpvd = valueOf().copydefault(abstractC33247msp);
        }
        pUU.KWHzl("ModeSwitch-Manager", "select sub mode for " + abstractC33247msp + ": " + abstractC33244msmEZpvd);
        boolean z2 = true;
        if (AuCTel()) {
            copydefault(context, abstractC33244msmEZpvd, activity, bundle);
            function1.invoke(java.lang.Boolean.TRUE);
            return true;
        }
        if (abstractC33244msmEZpvd == null) {
            pairOLrzqt = copydefault(bundle, new Function1() { // from class: o.mqT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C33123mqX.EZpvd(abstractC33247msp, (AbstractC33244msm) obj));
                }
            });
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(abstractC33244msmEZpvd, bundle);
            z2 = false;
        }
        AbstractC33244msm abstractC33244msmComponent1 = pairOLrzqt.component1();
        android.os.Bundle bundleComponent2 = pairOLrzqt.component2();
        if (abstractC33244msmComponent1 == null) {
            pUU.copydefault("ModeSwitch-Manager", "switchToAppMode: no sub mode available for OKAppType " + abstractC33247msp);
            function1.invoke(java.lang.Boolean.FALSE);
            return false;
        }
        return OLrzqt(context, z2, abstractC33244msmComponent1, z, activity, bundleComponent2, function1);
    }

    public static final boolean EZpvd(AbstractC33247msp abstractC33247msp, AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        return Intrinsics.EZpvd(abstractC33244msm.KWHzl(), abstractC33247msp);
    }

    public static /* synthetic */ java.lang.Object switchToMode$default(C33123mqX c33123mqX, android.content.Context context, AbstractC33244msm abstractC33244msm, boolean z, Activity activity, android.os.Bundle bundle, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            activity = Activity.Application.KWHzl;
        }
        Activity activity2 = activity;
        if ((i & 16) != 0) {
            bundle = null;
        }
        return c33123mqX.EZpvd(context, abstractC33244msm, z2, activity2, bundle, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull final AbstractC33244msm abstractC33244msm, boolean z, @NotNull Activity activity, android.os.Bundle bundle, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        kotlin.Pair<AbstractC33244msm, android.os.Bundle> pairOLrzqt;
        pUU.KWHzl("ModeSwitch-Manager", "switchToMode, mode: " + abstractC33244msm + ", animated: " + z);
        boolean z2 = true;
        if (AuCTel()) {
            copydefault(context, abstractC33244msm, activity, bundle);
            return C56443yFo.KWHzl(true);
        }
        if (!copydefault(abstractC33244msm)) {
            pairOLrzqt = copydefault(bundle, new Function1() { // from class: o.mqU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C33123mqX.AEQbTJ(abstractC33244msm, (AbstractC33244msm) obj));
                }
            });
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(abstractC33244msm, bundle);
            z2 = false;
        }
        AbstractC33244msm abstractC33244msmComponent1 = pairOLrzqt.component1();
        android.os.Bundle bundleComponent2 = pairOLrzqt.component2();
        if (abstractC33244msmComponent1 == null) {
            pUU.copydefault("ModeSwitch-Manager", "switchToMode: mode is not available - " + abstractC33244msm);
            return C56443yFo.KWHzl(false);
        }
        C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        OLrzqt(context, z2, abstractC33244msmComponent1, z, activity, bundleComponent2, new Application(c56434yFf));
        java.lang.Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    public static final boolean AEQbTJ(AbstractC33244msm abstractC33244msm, AbstractC33244msm abstractC33244msm2) {
        Intrinsics.checkNotNullParameter(abstractC33244msm2, "");
        return Intrinsics.EZpvd(abstractC33244msm2, abstractC33244msm);
    }

    /* JADX INFO: renamed from: o.mqX$Application */
    public static final class Application implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ Continuation<java.lang.Boolean> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Continuation<? super java.lang.Boolean> continuation) {
            this.KWHzl = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            copydefault(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(boolean z) {
            Continuation<java.lang.Boolean> continuation = this.KWHzl;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.valueOf(z)));
        }
    }

    public static final Unit EZpvd(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.mqX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean autoSwitchMode$default(C33123mqX c33123mqX, android.content.Context context, boolean z, boolean z2, android.os.Bundle bundle, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            bundle = null;
        }
        android.os.Bundle bundle2 = bundle;
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: o.mrf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C33123mqX.EZpvd(((java.lang.Boolean) obj2).booleanValue());
                }
            };
        }
        return c33123mqX.copydefault(context, z3, z4, bundle2, function1);
    }

    public final boolean copydefault(@NotNull android.content.Context context, boolean z, boolean z2, android.os.Bundle bundle, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (AuCTel()) {
            interceptSwitchMode$default(this, context, valueOf().AEQbTJ(), null, bundle, 4, null);
            function1.invoke(java.lang.Boolean.FALSE);
            return false;
        }
        AbstractC33244msm value = AYXKKw().getValue();
        java.lang.String strCopydefault = C33460mwq.copydefault(this.AYXKKw);
        boolean z3 = !Intrinsics.EZpvd((java.lang.Object) djBIcL(), (java.lang.Object) strCopydefault);
        pUU.KWHzl("ModeSwitch-Manager", "autoSwitchMode: user changed: " + z3 + ", current mode " + value);
        if (!z3 && copydefault(value)) {
            if (!z2) {
                return false;
            }
            this.OLrzqt.copydefault(context, value, value, z, Activity.Application.KWHzl, bundle, new Function1() { // from class: o.mra
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C33123mqX.AEQbTJ(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            return false;
        }
        AbstractC33244msm abstractC33244msmEZpvd = z3 ? this.djBIcL.EZpvd(strCopydefault) : null;
        AbstractC33244msm abstractC33244msmAEQbTJ = (abstractC33244msmEZpvd == null || !copydefault(abstractC33244msmEZpvd)) ? valueOf().AEQbTJ() : abstractC33244msmEZpvd;
        pUU.KWHzl("ModeSwitch-Manager", "autoSwitchMode: lastSavedMode " + abstractC33244msmEZpvd + ", targetMode " + abstractC33244msmAEQbTJ);
        if (abstractC33244msmAEQbTJ != null) {
            return OLrzqt(context, false, abstractC33244msmAEQbTJ, z, Activity.Application.KWHzl, bundle, function1);
        }
        pUU.copydefault("ModeSwitch-Manager", "autoSwitchMode: can't find available mode to switch to");
        function1.invoke(java.lang.Boolean.FALSE);
        return false;
    }

    public static final Unit AEQbTJ(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean switchToCeFi$default(C33123mqX c33123mqX, android.content.Context context, boolean z, Activity activity, android.os.Bundle bundle, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            activity = Activity.Application.KWHzl;
        }
        Activity activity2 = activity;
        if ((i & 8) != 0) {
            bundle = new android.os.Bundle();
        }
        return c33123mqX.KWHzl(context, z, activity2, bundle, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final boolean KWHzl(@NotNull android.content.Context context, boolean z, @NotNull Activity activity, android.os.Bundle bundle, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC33247msp abstractC33247mspOLrzqt = valueOf().OLrzqt(AbstractC33246mso.StateListAnimator.OLrzqt);
        if (abstractC33247mspOLrzqt == null) {
            pUU.valueOf("ModeSwitch-Manager", "switchToCeFi: no available sub mode for CeFi");
            function1.invoke(java.lang.Boolean.FALSE);
            return false;
        }
        return KWHzl(context, abstractC33247mspOLrzqt, z, activity, bundle, function1);
    }

    public final void OLrzqt(@NotNull AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        pUU.KWHzl("ModeSwitch-Manager", "updateMode: update current mode to " + abstractC33244msm);
        java.lang.String strCopydefault = C33460mwq.copydefault(this.AYXKKw);
        this.djBIcL.AEQbTJ(abstractC33244msm, strCopydefault);
        this.KWHzl = strCopydefault;
        AhwBna().setValue(abstractC33244msm);
        this.OLrzqt.EZpvd(abstractC33244msm, strCopydefault, fARcdN());
    }

    public final boolean OLrzqt(android.content.Context context, final boolean z, AbstractC33244msm abstractC33244msm, boolean z2, Activity activity, android.os.Bundle bundle, final Function1<? super java.lang.Boolean, Unit> function1) {
        AbstractC33244msm value = AYXKKw().getValue();
        pUU.EZpvd("ModeSwitch-Manager", "switchToModeInternal: from " + value + " to " + abstractC33244msm + "(animated=" + z2 + ", finishType=" + activity + "))");
        OLrzqt(abstractC33244msm);
        final boolean zEZpvd = Intrinsics.EZpvd(abstractC33244msm, value) ^ true;
        if (z && !zEZpvd) {
            function1.invoke(java.lang.Boolean.TRUE);
            return true;
        }
        boolean zCopydefault = this.OLrzqt.copydefault(context, value, abstractC33244msm, z2, activity, bundle, new Function1() { // from class: o.mqY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33123mqX.OLrzqt(zEZpvd, z, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        if (zCopydefault && zEZpvd) {
            RxBus.KWHzl("EVENT_OKEX_HOME_MODE_CHANGE");
        }
        return zCopydefault && (zEZpvd || z);
    }

    public static final Unit OLrzqt(boolean z, boolean z2, Function1 function1, boolean z3) {
        function1.invoke(java.lang.Boolean.valueOf(z3 && (z || z2)));
        return Unit.INSTANCE;
    }

    public final android.view.View KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull AppModeSwitchViewSource appModeSwitchViewSource, @NotNull Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(appModeSwitchViewSource, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return C33423mwF.copydefault.KWHzl(context, fragmentManager, lifecycleOwner, appModeSwitchViewSource, function2);
    }

    public final boolean AkhnZx() {
        return Intrinsics.EZpvd(AYXKKw().getValue().KWHzl(), AbstractC33247msp.StateListAnimator.AEQbTJ);
    }

    public final boolean fIwbmz() {
        return Intrinsics.EZpvd(AYXKKw().getValue().KWHzl(), AbstractC33247msp.Activity.AEQbTJ);
    }

    public final boolean values() {
        return Intrinsics.EZpvd(AYXKKw().getValue().KWHzl(), AbstractC33247msp.Application.AEQbTJ);
    }

    public final boolean fetchVPNInfo() {
        return Intrinsics.EZpvd(AYXKKw().getValue().KWHzl(), AbstractC33247msp.TaskDescription.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.mqX$Activity */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mqX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.mqX$Activity$Application */
        public static final class Application extends Activity {
            public static final Application KWHzl = new Application();

            private Application() {
                super(null);
            }
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.mqX$Activity$Activity, reason: collision with other inner class name */
        public static final class C0884Activity extends Activity {
            public static final C0884Activity KWHzl = new C0884Activity();

            private C0884Activity() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.mqX$Activity$StateListAnimator */
        public static final class StateListAnimator extends Activity {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }
    }

    /* JADX INFO: renamed from: o.mqX$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mqX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C33123mqX copydefault() {
            return (C33123mqX) C33123mqX.AEQbTJ.getValue();
        }

        public final C33123mqX KWHzl() {
            return copydefault();
        }
    }

    public static final C33123mqX EZpvd() {
        return new C33123mqX(((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf().getApplicationContext(), InterfaceC47230tmC.class)).fmB(), C56392yDr.copydefault(new Function0() { // from class: o.mrh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33123mqX.AEQbTJ();
            }
        }), null, null, 12, null);
    }

    public static final C33397mvg AEQbTJ() {
        return new C33397mvg((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class));
    }
}
