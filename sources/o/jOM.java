package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.coindetail.ui.dev_analysis.DevAnalysisBottomSheet$onCreateContent$2;
import com.okinc.business.market.features.coindetail.ui.dev_analysis.DevAnalysisBottomSheetParams;
import com.okinc.business.market.features.coindetail.ui.dev_analysis.DevAnalysisViewModel;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.jOU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jOM extends jOT {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public LinearLayoutManager AEQbTJ;
    public C23458hyc AhwBna;
    public Function0<Unit> EZpvd;
    public boolean OLrzqt;
    public jOR copydefault;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jOJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jOM.copydefault(this.OLrzqt);
        }
    });

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jOM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ jOM newInstance$default(Application application, java.lang.String str, java.lang.String str2, TagWrapper tagWrapper, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return application.AEQbTJ(str, str2, tagWrapper);
        }

        public final jOM AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, TagWrapper tagWrapper) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            jOM jom = new jOM();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.dev_analysis_bottom_sheet", new DevAnalysisBottomSheetParams(str, str2, tagWrapper));
            jom.setArguments(bundle);
            return jom;
        }
    }

    public jOM() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.coindetail.ui.dev_analysis.DevAnalysisBottomSheet$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.coindetail.ui.dev_analysis.DevAnalysisBottomSheet$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DevAnalysisViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail.ui.dev_analysis.DevAnalysisBottomSheet$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail.ui.dev_analysis.DevAnalysisBottomSheet$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail.ui.dev_analysis.DevAnalysisBottomSheet$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.EZpvd = new Function0() { // from class: o.jOO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jOM.OLrzqt();
            }
        };
    }

    public final DevAnalysisBottomSheetParams KWHzl() {
        return (DevAnalysisBottomSheetParams) this.valueOf.getValue();
    }

    public static final DevAnalysisBottomSheetParams copydefault(jOM jom) {
        DevAnalysisBottomSheetParams devAnalysisBottomSheetParams;
        android.os.Bundle arguments = jom.getArguments();
        return (arguments == null || (devAnalysisBottomSheetParams = (DevAnalysisBottomSheetParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.dev_analysis_bottom_sheet", DevAnalysisBottomSheetParams.class))) == null) ? new DevAnalysisBottomSheetParams(null, null, null, 7, null) : devAnalysisBottomSheetParams;
    }

    public final DevAnalysisViewModel EZpvd() {
        return (DevAnalysisViewModel) this.gEmmrt.getValue();
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DcMfJKDSqxTE));
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
        wxq.EZpvd().setVisibility(8);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23458hyc c23458hycCopydefault = C23458hyc.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        this.AhwBna = c23458hycCopydefault;
        if (c23458hycCopydefault == null) {
            Intrinsics.gEmmrt("");
            c23458hycCopydefault = null;
        }
        c23458hycCopydefault.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.jON
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jOM.copydefault(this.AEQbTJ, view);
            }
        });
        gEmmrt();
        EZpvd().KWHzl(KWHzl().AEQbTJ(), KWHzl().copydefault(), 1, 10);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DevAnalysisBottomSheet$onCreateContent$2(this, null), 3, null);
    }

    public static final void copydefault(jOM jom, android.view.View view) {
        jom.OLrzqt = false;
        DevAnalysisViewModel.loadData$default(jom.EZpvd(), jom.KWHzl().AEQbTJ(), jom.KWHzl().copydefault(), 0, 0, 12, null);
    }

    public final void AEQbTJ(jOU jou) {
        C23458hyc c23458hyc = this.AhwBna;
        if (c23458hyc == null) {
            Intrinsics.gEmmrt("");
            c23458hyc = null;
        }
        C55173xeu c55173xeu = c23458hyc.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(jou instanceof jOU.ActionBar ? 0 : 8);
        C55113xdn c55113xdn = c23458hyc.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(jou instanceof jOU.Application ? 0 : 8);
        RecyclerView recyclerView = c23458hyc.copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        boolean z = jou instanceof jOU.TaskDescription;
        recyclerView.setVisibility(z ? 0 : 8);
        if (!z) {
            this.OLrzqt = false;
            return;
        }
        if (!this.OLrzqt) {
            KWHzl(((jOU.TaskDescription) jou).KWHzl());
            this.OLrzqt = true;
        }
        jOR jor = this.copydefault;
        if (jor != null) {
            jor.submitList(((jOU.TaskDescription) jou).copydefault());
        }
    }

    public final void KWHzl(final jNU jnu) {
        jOR jor = this.copydefault;
        if (jor != null) {
            jor.KWHzl(KWHzl().EZpvd());
        }
        jOR jor2 = this.copydefault;
        if (jor2 != null) {
            C26047jPz[] c26047jPzArr = new C26047jPz[4];
            int i = C23274hvD.Fragment.gFTCsA;
            jPD jpd = new jPD(C23274hvD.Fragment.HJWChPOKBmQNaCIdOM, C23274hvD.Fragment.fAklCm, C23274hvD.Fragment.fmB);
            java.lang.String percentWithoutSymbol$default = C23311hvo.formatPercentWithoutSymbol$default(jnu.djBIcL(), false, 0, new BigDecimal(0.01d), true, null, 19, null);
            int iKWHzl = C25382ivf.KWHzl(C23313hvq.OLrzqt(jnu.djBIcL(), "0") ? C52761wXj.ActionBar.OuxcSI : C52761wXj.Activity.fdOvFl);
            C23271hvA c23271hvA = C23271hvA.copydefault;
            java.lang.String strAhwBna = jnu.AhwBna();
            RoundingMode roundingMode = RoundingMode.DOWN;
            c26047jPzArr[0] = new C26047jPz(i, jpd, percentWithoutSymbol$default, iKWHzl, "(" + C23271hvA.formatTokenCode$default(c23271hvA, strAhwBna, true, roundingMode, false, null, null, 28, null) + "/" + C23271hvA.formatTokenCode$default(c23271hvA, jnu.EZpvd(), true, roundingMode, false, null, null, 28, null) + ")", null, null, null, null, 96, null);
            c26047jPzArr[1] = new C26047jPz(C23274hvD.Fragment.OxbLUn, new jPD(C23274hvD.Fragment.DjwCMv, C23274hvD.Fragment.putInt, C23274hvD.Fragment.fmB), C23311hvo.formatPercentWithoutSymbol$default(jnu.valueOf(), false, 0, new BigDecimal(0.01d), true, null, 19, null), C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), "(" + C23271hvA.formatTokenCode$default(c23271hvA, jnu.OLrzqt(), true, roundingMode, false, null, null, 28, null) + "/" + C23271hvA.formatTokenCode$default(c23271hvA, jnu.EZpvd(), true, roundingMode, false, null, null, 28, null) + ")", null, null, null, null, 96, null);
            c26047jPzArr[2] = new C26047jPz(C23274hvD.Fragment.DeEinT, new jPD(C23274hvD.Fragment.fDu, C23274hvD.Fragment.hwkNQP, C23274hvD.Fragment.fmB), C23311hvo.formatPercentWithoutSymbol$default(jnu.copydefault(), false, 0, new BigDecimal(0.01d), true, null, 19, null), C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), "(" + C23271hvA.formatTokenCode$default(c23271hvA, jnu.KWHzl(), true, roundingMode, false, null, null, 28, null) + "/" + C23271hvA.formatTokenCode$default(c23271hvA, jnu.EZpvd(), true, roundingMode, false, null, null, 28, null) + ")", null, null, null, null, 96, null);
            c26047jPzArr[3] = new C26047jPz(C23274hvD.Fragment.HJWChPOZOJIj, null, C25352ivB.formatAddress$default(jnu.AEQbTJ(), 6, 4, null, 4, null), C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl), "", null, null, java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZxnNGp), new Function0() { // from class: o.jOL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jOM.OLrzqt(this.EZpvd, jnu);
                }
            }, 96, null);
            jOR.setHeader$default(jor2, yDY.gEmmrt(c26047jPzArr), false, 2, null);
        }
    }

    public static final Unit OLrzqt(jOM jom, jNU jnu) {
        int i = C23274hvD.Fragment.ComponentActivity22;
        android.content.Context contextRequireContext = jom.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        hSW.copyAddress$default(i, contextRequireContext, jnu.AEQbTJ(), null, null, 24, null);
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        C23458hyc c23458hyc = this.AhwBna;
        if (c23458hyc == null) {
            Intrinsics.gEmmrt("");
            c23458hyc = null;
        }
        RecyclerView recyclerView = c23458hyc.copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        this.copydefault = new jOR(new Function1() { // from class: o.jOI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jOM.EZpvd(this.copydefault, (TokenBase) obj);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.AEQbTJ = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.copydefault);
        recyclerView.addOnScrollListener(new ActionBar(new Function0() { // from class: o.jOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jOM.KWHzl(this.copydefault);
            }
        }));
    }

    public static final Unit EZpvd(jOM jom, TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        jom.copydefault(tokenBase);
        return Unit.INSTANCE;
    }

    public static final class ActionBar extends kME {
        public ActionBar(Function0<? extends LinearLayoutManager> function0) {
            super(5, function0);
        }

        @Override // o.kME
        public void AEQbTJ() {
            if (jOM.this.EZpvd().OLrzqt()) {
                jOM.this.EZpvd().AEQbTJ();
            }
        }
    }

    public static final LinearLayoutManager KWHzl(jOM jom) {
        return jom.AEQbTJ;
    }

    private final void copydefault(TokenBase tokenBase) {
        super.dismiss();
        this.EZpvd.invoke();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C25352ivB.openMarketDetailPage$default(activity, "view_details", tokenBase, "app_dev_token", null, new int[0], 8, null);
        }
    }
}
