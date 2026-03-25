package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.core.ok_app.ModeManager;
import com.okinc.core.ok_app.OKAppServiceImp$subMode$2$1;
import com.okinc.core.ok_app.OKAppServiceImp$subMode$2$2;
import com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum;
import com.okinc.core.ok_app.api.bean.TabBean;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import o.C33123mqX;
import o.C33160mrH;
import o.C52761wXj;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mrC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33155mrC extends AbstractC43215rlA implements InterfaceC33171mrS {
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public static final java.lang.String copydefault = "ModeSwitch-Service";
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mrE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33155mrC.AYXKKw();
        }
    });
    public final CoroutineScope EZpvd = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getDefault()));
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.mrF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33155mrC.AEQbTJ(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mrG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33155mrC.AhwBna();
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.mrD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33155mrC.gEmmrt();
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.mrK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33155mrC.djBIcL();
        }
    });

    public static final StateFlow AYXKKw() {
        return ModeManager.EZpvd.DbNXlk();
    }

    @Override // o.InterfaceC33171mrS
    public StateFlow<java.lang.Integer> isConnected() {
        return (StateFlow) this.KWHzl.getValue();
    }

    @Override // o.InterfaceC33171mrS
    public StateFlow<AbstractC33244msm> values() {
        return (StateFlow) this.djBIcL.getValue();
    }

    public static final StateFlow AEQbTJ(C33155mrC c33155mrC) {
        Flow flowFlowOf;
        AbstractC33244msm abstractC33244msmKWHzl;
        SharedFlow<Unit> sharedFlowAxsJAY;
        if (C33431mwN.EZpvd.KWHzl()) {
            return c33155mrC.fetchVPNInfo().AYXKKw();
        }
        StateFlow<AbstractC33240msi> stateFlowKWHzl = c33155mrC.AkhnZx().KWHzl();
        StateFlow<AbstractC33249msr> stateFlowOLrzqt = c33155mrC.DbNXlk().OLrzqt();
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
        if (oKComplianceRestrictionService == null || (sharedFlowAxsJAY = oKComplianceRestrictionService.AxsJAY()) == null || (flowFlowOf = FlowKt.onStart(sharedFlowAxsJAY, new OKAppServiceImp$subMode$2$1(null))) == null) {
            flowFlowOf = FlowKt.flowOf(Unit.INSTANCE);
        }
        Flow flowCombine = FlowKt.combine(stateFlowKWHzl, stateFlowOLrzqt, flowFlowOf, new OKAppServiceImp$subMode$2$2(null));
        CoroutineScope coroutineScope = c33155mrC.EZpvd;
        SharingStarted eagerly = SharingStarted.Companion.getEagerly();
        if (C33367mvC.copydefault()) {
            abstractC33244msmKWHzl = C33239msh.OLrzqt(c33155mrC.AkhnZx().KWHzl().getValue());
        } else {
            abstractC33244msmKWHzl = C33250mss.KWHzl(c33155mrC.DbNXlk().OLrzqt().getValue());
        }
        return FlowKt.stateIn(flowCombine, coroutineScope, eagerly, abstractC33244msmKWHzl);
    }

    public final InterfaceC33233msb AkhnZx() {
        return (InterfaceC33233msb) this.OLrzqt.getValue();
    }

    public static final InterfaceC33233msb AhwBna() {
        return (InterfaceC33233msb) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC33233msb.class));
    }

    public final InterfaceC33237msf DbNXlk() {
        return (InterfaceC33237msf) this.AYXKKw.getValue();
    }

    public static final InterfaceC33237msf gEmmrt() {
        return (InterfaceC33237msf) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC33237msf.class));
    }

    public final C33123mqX fetchVPNInfo() {
        return (C33123mqX) this.AhwBna.getValue();
    }

    public static final C33123mqX djBIcL() {
        return C33123mqX.Companion.KWHzl();
    }

    @Override // o.InterfaceC33171mrS
    public boolean KWHzl(@NotNull android.content.Context context, int i, boolean z, int i2, android.os.Bundle bundle, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (C33431mwN.EZpvd.KWHzl()) {
            return fetchVPNInfo().KWHzl(context, C33234msc.copydefault(i), z, OLrzqt(i2), bundle, function1);
        }
        return ModeManager.switchAppMode$default(ModeManager.EZpvd, context, i, z, i2, bundle, false, false, function1, 96, null);
    }

    @Override // o.InterfaceC33171mrS
    public java.lang.Object OLrzqt(@NotNull AbstractC33244msm abstractC33244msm, @NotNull android.content.Context context, boolean z, android.os.Bundle bundle, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        if (C33431mwN.EZpvd.KWHzl()) {
            return C33123mqX.switchToMode$default(fetchVPNInfo(), context, abstractC33244msm, z, null, bundle, continuation, 8, null);
        }
        if (C33367mvC.copydefault()) {
            AbstractC33240msi abstractC33240msiCopydefault = C33239msh.copydefault(abstractC33244msm);
            if (abstractC33240msiCopydefault != null) {
                if (z) {
                    return AkhnZx().KWHzl(abstractC33240msiCopydefault, context, bundle, continuation);
                }
                return AkhnZx().copydefault(abstractC33240msiCopydefault, continuation);
            }
            pUU.copydefault(copydefault, "switchSubMode: Can't convert " + abstractC33244msm + " to liteSubMode");
            return C56443yFo.KWHzl(false);
        }
        AbstractC33249msr abstractC33249msrEZpvd = C33250mss.EZpvd(abstractC33244msm);
        if (abstractC33249msrEZpvd != null) {
            if (z) {
                return DbNXlk().KWHzl(abstractC33249msrEZpvd, context, bundle, continuation);
            }
            return DbNXlk().OLrzqt(abstractC33249msrEZpvd, continuation);
        }
        pUU.copydefault(copydefault, "switchSubMode: Can't convert " + abstractC33244msm + " to proSubMode");
        return C56443yFo.KWHzl(false);
    }

    @Override // o.InterfaceC33171mrS
    public boolean valueOf() {
        return AkhnZx().AEQbTJ();
    }

    @Override // o.InterfaceC33171mrS
    public boolean KWHzl(@NotNull AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        if (C33431mwN.EZpvd.KWHzl()) {
            return fetchVPNInfo().AEQbTJ(abstractC33244msm);
        }
        if (C33367mvC.copydefault()) {
            InterfaceC33233msb interfaceC33233msbAkhnZx = AkhnZx();
            AbstractC33240msi abstractC33240msiCopydefault = C33239msh.copydefault(abstractC33244msm);
            if (abstractC33240msiCopydefault == null) {
                return false;
            }
            return interfaceC33233msbAkhnZx.AEQbTJ(abstractC33240msiCopydefault);
        }
        InterfaceC33237msf interfaceC33237msfDbNXlk = DbNXlk();
        AbstractC33249msr abstractC33249msrEZpvd = C33250mss.EZpvd(abstractC33244msm);
        if (abstractC33249msrEZpvd == null) {
            return false;
        }
        return interfaceC33237msfDbNXlk.EZpvd(abstractC33249msrEZpvd);
    }

    @Override // o.InterfaceC33171mrS
    public android.view.View copydefault(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull AppModeSwitchViewSource appModeSwitchViewSource, @NotNull final Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(appModeSwitchViewSource, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (C33431mwN.EZpvd.KWHzl()) {
            return fetchVPNInfo().KWHzl(context, fragmentManager, lifecycleOwner, appModeSwitchViewSource, new Function2() { // from class: o.mrJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C33155mrC.copydefault(function2, (AbstractC33244msm) obj, (AbstractC33244msm) obj2);
                }
            });
        }
        if (C33367mvC.copydefault()) {
            return AkhnZx().AEQbTJ(context, fragmentManager, lifecycleOwner, appModeSwitchViewSource, function2);
        }
        return DbNXlk().copydefault(context, fragmentManager, lifecycleOwner, appModeSwitchViewSource, function2);
    }

    public static final Unit copydefault(Function2 function2, AbstractC33244msm abstractC33244msm, AbstractC33244msm abstractC33244msm2) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        Intrinsics.checkNotNullParameter(abstractC33244msm2, "");
        function2.invoke(java.lang.Integer.valueOf(C33234msc.EZpvd(abstractC33244msm)), java.lang.Integer.valueOf(C33234msc.EZpvd(abstractC33244msm2)));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC33171mrS
    public boolean ejfBZ() {
        if (C33431mwN.EZpvd.KWHzl()) {
            return fetchVPNInfo().AkhnZx();
        }
        return ModeManager.EZpvd.AuCTel();
    }

    @Override // o.InterfaceC33171mrS
    public boolean getFieldNames() {
        if (C33431mwN.EZpvd.KWHzl()) {
            return fetchVPNInfo().fIwbmz();
        }
        return ModeManager.EZpvd.uzCIH();
    }

    @Override // o.InterfaceC33171mrS
    public boolean fJNWhG() {
        if (C33431mwN.EZpvd.KWHzl()) {
            return fetchVPNInfo().values();
        }
        return ModeManager.EZpvd.getNewProxyInstance();
    }

    @Override // o.InterfaceC33171mrS
    public boolean fIwbmz() {
        if (C33431mwN.EZpvd.KWHzl()) {
            return fetchVPNInfo().fetchVPNInfo();
        }
        return ModeManager.EZpvd.hDKMBd();
    }

    @Override // o.InterfaceC33171mrS
    public void KWHzl(Function1<? super java.util.List<TabBean>, Unit> function1) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (iwGUEr()) {
            arrayList.add(new TabBean(C33160mrH.TaskDescription.AuCTel, 1, "appWalletTabID"));
            arrayList.add(new TabBean(C33160mrH.TaskDescription.ejfBZ, 0, "appExchangeTabID"));
        } else {
            arrayList.add(new TabBean(C33160mrH.TaskDescription.ejfBZ, 0, "appExchangeTabID"));
            arrayList.add(new TabBean(C33160mrH.TaskDescription.AuCTel, 1, "appWalletTabID"));
        }
        if (function1 != null) {
            function1.invoke(arrayList);
        }
    }

    @Override // o.InterfaceC33171mrS
    public boolean AEQbTJ(@NotNull android.app.Activity activity, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(activity, "");
        return InterfaceC33171mrS.Activity.switchToAppMode$default(this, activity, 2, z, z2 ? 0 : 2, null, null, 48, null);
    }

    @Override // o.InterfaceC33171mrS
    public boolean KWHzl(@NotNull android.app.Activity activity, boolean z, boolean z2, boolean z3, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        return InterfaceC33171mrS.Activity.switchToAppMode$default(this, activity, 1, z, z2 ? 0 : 2, bundle, null, 32, null);
    }

    @Override // o.InterfaceC33171mrS
    public boolean EZpvd(@NotNull android.app.Activity activity, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(activity, "");
        return InterfaceC33171mrS.Activity.switchToAppMode$default(this, activity, 3, z, z2 ? 0 : 2, null, null, 48, null);
    }

    @Override // o.InterfaceC33171mrS
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull LiteNavigationTabEnum liteNavigationTabEnum) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(liteNavigationTabEnum, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("tab_type", liteNavigationTabEnum);
        Unit unit = Unit.INSTANCE;
        InterfaceC33171mrS.Activity.switchToAppMode$default(this, context, 2, false, 0, bundle, null, 32, null);
    }

    @Override // o.InterfaceC33171mrS
    public boolean fARcdN() {
        return SPUtils.getBoolean("APP_FIRST_INSTALL_KEY", true, "defi_forbidden_file_KEY");
    }

    @Override // o.InterfaceC33171mrS
    public void uzCIH() {
        SPUtils.put("APP_FIRST_INSTALL_KEY", java.lang.Boolean.FALSE, "defi_forbidden_file_KEY");
    }

    @Override // o.InterfaceC33171mrS
    public void AEQbTJ(@NotNull android.app.Activity activity, int i, @NotNull AbstractC33169mrQ abstractC33169mrQ, @NotNull AbstractC33173mrU abstractC33173mrU, final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(abstractC33169mrQ, "");
        Intrinsics.checkNotNullParameter(abstractC33173mrU, "");
        if (!AEQbTJ(i) && EZpvd(activity, function1)) {
            C33436mwS c33436mwS = new C33436mwS(activity, null, 2, 0 == true ? 1 : 0);
            c33436mwS.setOnDismissCallback(new Function1() { // from class: o.mrI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C33155mrC.OLrzqt(function1, ((java.lang.Integer) obj).intValue());
                }
            });
            c33436mwS.copydefault(activity, i, abstractC33169mrQ, abstractC33173mrU);
            c33436mwS.OLrzqt();
            c33436mwS.AYXKKw();
        }
    }

    public static final Unit OLrzqt(Function1 function1, int i) {
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC33171mrS
    public void OLrzqt(@NotNull android.app.Activity activity, int i, @NotNull AbstractC33169mrQ abstractC33169mrQ, @NotNull java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(abstractC33169mrQ, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (!AEQbTJ(i) && EZpvd(activity, function1)) {
            C33436mwS c33436mwS = new C33436mwS(activity, null, 2, 0 == true ? 1 : 0);
            c33436mwS.setOnDismissCallback(new Function1() { // from class: o.mrL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C33155mrC.copydefault(function1, ((java.lang.Integer) obj).intValue());
                }
            });
            C33436mwS.init$default(c33436mwS, activity, i, abstractC33169mrQ, charSequence, charSequence2, null, 32, null);
            c33436mwS.OLrzqt();
            c33436mwS.AYXKKw();
        }
    }

    public static final Unit copydefault(Function1 function1, int i) {
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    public boolean getNewProxyInstance() {
        return ModeManager.EZpvd.AuCTelauCTel();
    }

    public final boolean AEQbTJ(int i) {
        return i != 3 && getNewProxyInstance();
    }

    public final boolean EZpvd(android.app.Activity activity, Function1<? super java.lang.Integer, Unit> function1) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        activity.getTheme().resolveAttribute(C52761wXj.ActionBar.OHqIaq, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        C6777aVl.Companion.OLrzqt(new java.lang.IllegalStateException("The current theme of " + activity.getComponentName() + " is not OKTheme"), null, java.lang.Boolean.TRUE);
        if (function1 != null) {
            function1.invoke(2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    @Override // o.InterfaceC33171mrS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean iwGUEr() {
        boolean z;
        boolean zEZpvd = Intrinsics.EZpvd(CollectionsKt___CollectionsKt.firstOrNull(hDKMBd()), (java.lang.Object) OKComplianceRestrictionService.AppMode.WEB3.getModeName());
        java.lang.String str = (java.lang.String) C32935mmv.KWHzl.get("channel_id");
        if (str != null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            z = lowerCase != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) "web3", false, 2, (java.lang.Object) null);
        }
        return ((zEZpvd || z) && copydefault(3)) || C34703nhO.copydefault();
    }

    private final java.util.List<java.lang.String> hDKMBd() {
        return ModeManager.EZpvd.isConnected().AuCTel();
    }

    @Override // o.InterfaceC33171mrS
    public boolean AuCTel() {
        if (C33431mwN.EZpvd.KWHzl()) {
            return fetchVPNInfo().isConnected();
        }
        return ModeManager.EZpvd.fARcdN();
    }

    @Override // o.InterfaceC33171mrS
    public boolean copydefault(int i) {
        if (C33431mwN.EZpvd.KWHzl()) {
            return fetchVPNInfo().EZpvd(C33234msc.copydefault(i));
        }
        return ModeManager.EZpvd.EZpvd(i);
    }

    @Override // o.InterfaceC33171mrS
    public boolean KWHzl(@NotNull android.content.Context context, boolean z, boolean z2, android.os.Bundle bundle, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (C33431mwN.EZpvd.KWHzl()) {
            return fetchVPNInfo().copydefault(context, z, z2, bundle, function1);
        }
        return ModeManager.EZpvd.KWHzl(context, z, z2, bundle, function1);
    }

    @Override // o.InterfaceC33171mrS
    public boolean copydefault(@NotNull android.content.Context context, boolean z, int i, android.os.Bundle bundle, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (C33431mwN.EZpvd.KWHzl()) {
            return fetchVPNInfo().KWHzl(context, z, OLrzqt(i), bundle, function1);
        }
        return ModeManager.switchToCeFi$default(ModeManager.EZpvd, context, z, i, bundle, false, function1, 16, null);
    }

    @Override // o.InterfaceC33171mrS
    public InterfaceC33213msH OLrzqt(@NotNull InterfaceC33213msH interfaceC33213msH) {
        Intrinsics.checkNotNullParameter(interfaceC33213msH, "");
        return C33267mtI.OLrzqt.AEQbTJ(interfaceC33213msH);
    }

    public final C33123mqX.Activity OLrzqt(int i) {
        if (i == 0) {
            return C33123mqX.Activity.Application.KWHzl;
        }
        if (i == 1) {
            return C33123mqX.Activity.C0884Activity.KWHzl;
        }
        return C33123mqX.Activity.StateListAnimator.OLrzqt;
    }

    /* JADX INFO: renamed from: o.mrC$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mrC.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
