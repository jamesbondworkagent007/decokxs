package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.api.QuickConvertParams;
import com.okinc.buysell.api.QuickConvertTokenInfo;
import com.okinc.buysell.ui.quickconvert.QuickConvertBottomSheetViewModel;
import com.okinc.buysell.ui.quickconvert.QuickConvertFragment$addObservers$1;
import com.okinc.buysell.ui.quickconvert.QuickConvertViewModel;
import com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcRouteConst;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC33244msm;
import o.C31351lsQ;
import o.C52761wXj;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lPD extends AbstractC30205lPt<AbstractC31540lvu> {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm valueOf;

    public lPD() {
        super(C31351lsQ.ActionBar.djSkpj);
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(QuickConvertBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.quickconvert.QuickConvertFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.quickconvert.QuickConvertFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.quickconvert.QuickConvertFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.quickconvert.QuickConvertFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.quickconvert.QuickConvertFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(QuickConvertViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.quickconvert.QuickConvertFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.quickconvert.QuickConvertFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.quickconvert.QuickConvertFragment$special$$inlined$viewModels$default$5
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
    }

    public final QuickConvertBottomSheetViewModel AYXKKw() {
        return (QuickConvertBottomSheetViewModel) this.valueOf.getValue();
    }

    public QuickConvertViewModel valueOf() {
        return (QuickConvertViewModel) this.AYXKKw.getValue();
    }

    @Override // o.AbstractC31907mIi
    public void djBIcL() {
        QuickConvertParams quickConvertParams;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (quickConvertParams = (QuickConvertParams) arguments.getParcelable("quick_convert_params")) == null) {
            quickConvertParams = new QuickConvertParams(yDY.AhwBna(), "");
        }
        QuickConvertViewModel quickConvertViewModelValueOf = valueOf();
        quickConvertViewModelValueOf.KWHzl(quickConvertParams.getTokenInfos());
        quickConvertViewModelValueOf.KWHzl(quickConvertParams.getApy());
    }

    @Override // o.AbstractC31907mIi
    public void gEmmrt() {
        valueOf().EZpvd();
        boolean z = !Intrinsics.EZpvd(((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).values().getValue(), AbstractC33244msm.ActionBar.KWHzl);
        QuickConvertViewModel quickConvertViewModelValueOf = valueOf();
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        quickConvertViewModelValueOf.KWHzl(c43453rpa.KWHzl(contextRequireContext), z);
        QuickConvertViewModel quickConvertViewModelValueOf2 = valueOf();
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        quickConvertViewModelValueOf2.EZpvd(c43453rpa.KWHzl(contextRequireContext2), z);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        valueOf().AEQbTJ();
        super.onPause();
    }

    @Override // o.AbstractC31907mIi
    public void EZpvd() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new QuickConvertFragment$addObservers$1(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        AYXKKw().KWHzl(false);
        AbstractC31540lvu abstractC31540lvu = (AbstractC31540lvu) isConnected();
        ((AbstractC31540lvu) isConnected()).copydefault.setAnimation(C52761wXj.PendingIntent.fIwbmz);
        ((AbstractC31540lvu) isConnected()).copydefault.setRepeatCount(-1);
        ((AbstractC31540lvu) isConnected()).copydefault.setRepeatMode(1);
        ((AbstractC31540lvu) isConnected()).copydefault.playAnimation();
        QuickConvertTokenInfo quickConvertTokenInfo = (QuickConvertTokenInfo) CollectionsKt___CollectionsKt.firstOrNull(valueOf().KWHzl());
        java.util.Iterator<T> it = valueOf().KWHzl().iterator();
        double dAEQbTJ = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (it.hasNext()) {
            dAEQbTJ += C33129mqd.AEQbTJ(((QuickConvertTokenInfo) it.next()).getBaseAmount());
        }
        abstractC31540lvu.djBIcL.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.djSkpj));
        android.widget.TextView textView = abstractC31540lvu.valueOf;
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(valueOf().copydefault()), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), DisplaySign.AUTO, java.lang.Double.valueOf(100.0d), null, 16, null);
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(dAEQbTJ));
        java.lang.String baseCurrency = quickConvertTokenInfo != null ? quickConvertTokenInfo.getBaseCurrency() : null;
        textView.setText(copydefault(iCUPercent$default, C31661lzi.appendCryptoSymbol$default(strGEmmrt, baseCurrency == null ? "" : baseCurrency, 0, null, null, null, 30, null)));
        abstractC31540lvu.AEQbTJ.setVisibility(4);
        abstractC31540lvu.AEQbTJ.setClickable(false);
        abstractC31540lvu.AEQbTJ.setText("");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(C3631Apb c3631Apb) {
        AYXKKw().KWHzl(true);
        AbstractC31540lvu abstractC31540lvu = (AbstractC31540lvu) isConnected();
        ((AbstractC31540lvu) isConnected()).copydefault.setAnimation(C52761wXj.PendingIntent.uzCIH);
        ((AbstractC31540lvu) isConnected()).copydefault.setRepeatCount(0);
        ((AbstractC31540lvu) isConnected()).copydefault.setRepeatMode(1);
        ((AbstractC31540lvu) isConnected()).copydefault.playAnimation();
        abstractC31540lvu.djBIcL.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.aKErDB));
        android.widget.TextView textView = abstractC31540lvu.valueOf;
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(valueOf().copydefault()), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), DisplaySign.AUTO, java.lang.Double.valueOf(100.0d), null, 16, null);
        java.lang.String strKWHzl = c3631Apb != null ? c3631Apb.KWHzl() : null;
        java.lang.String str = strKWHzl == null ? "" : strKWHzl;
        java.lang.String strAEQbTJ = c3631Apb != null ? c3631Apb.AEQbTJ() : null;
        textView.setText(copydefault(iCUPercent$default, C31661lzi.appendCryptoSymbol$default(str, strAEQbTJ == null ? "" : strAEQbTJ, 0, null, null, null, 30, null)));
        abstractC31540lvu.AEQbTJ.setVisibility(0);
        abstractC31540lvu.AEQbTJ.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.QVAiDq));
        C52794wYp c52794wYp = abstractC31540lvu.AEQbTJ;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
    }

    public final android.text.SpannableStringBuilder copydefault(java.lang.String str, java.lang.String str2) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.dNCPSb);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.UeEOUB);
        java.lang.String strReplace$default = C59449zhJ.replace$default(strAYXKKw, "{valueApy}", str, false, 4, (java.lang.Object) null);
        java.lang.String strReplace$default2 = C59449zhJ.replace$default(C59449zhJ.replace$default(strAYXKKw2, "{paramAPY}", strReplace$default, false, 4, (java.lang.Object) null), "{amount}", str2, false, 4, (java.lang.Object) null);
        int color = ContextCompat.getColor(requireContext(), C52761wXj.Activity.dvKsVJ);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strReplace$default2);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strReplace$default2, strReplace$default, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default != -1) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(color), iIndexOf$default, strReplace$default.length() + iIndexOf$default, 33);
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), iIndexOf$default, strReplace$default.length() + iIndexOf$default, 33);
        }
        return spannableStringBuilder;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ lPD KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, lPD lpd) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = lpd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AYXKKw().copydefault();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ lPD EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, lPD lpd) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = lpd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.AYXKKw().copydefault();
                this.EZpvd.AhwBna();
            }
        }
    }

    public final void AhwBna() {
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ()) {
            if (Intrinsics.EZpvd(((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).values().getValue(), AbstractC33244msm.ActionBar.KWHzl)) {
                InterfaceC49505upn interfaceC49505upn = (InterfaceC49505upn) C43251rlk.copydefault(InterfaceC49505upn.class);
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                interfaceC49505upn.AEQbTJ(contextRequireContext, "TRANSACTION", "TRANSACTION_BSC", null, null);
                return;
            }
            InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("tab_type", LiteNavigationTabEnum.LITE_SIMPLE_ACTIVITY);
            Unit unit = Unit.INSTANCE;
            InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS, contextRequireContext2, 2, false, 0, bundle, null, 32, null);
            return;
        }
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("path", "main/account");
            bundle2.putString(OtcRouteConst.MAIN_ROUTE_NAV, "funding_account");
            ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).copydefault(activityAEQbTJ, bundle2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DbNXlk() {
        AYXKKw().KWHzl(true);
        AbstractC31540lvu abstractC31540lvu = (AbstractC31540lvu) isConnected();
        ((AbstractC31540lvu) isConnected()).copydefault.setAnimation(C52761wXj.PendingIntent.ejfBZ);
        ((AbstractC31540lvu) isConnected()).copydefault.setRepeatCount(0);
        ((AbstractC31540lvu) isConnected()).copydefault.playAnimation();
        abstractC31540lvu.djBIcL.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.RJOkX));
        abstractC31540lvu.valueOf.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.QbewEr));
        abstractC31540lvu.AEQbTJ.setVisibility(0);
        abstractC31540lvu.AEQbTJ.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.QUSxYX));
        C52794wYp c52794wYp = abstractC31540lvu.AEQbTJ;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lPD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final lPD KWHzl(@NotNull QuickConvertParams quickConvertParams) {
            Intrinsics.checkNotNullParameter(quickConvertParams, "");
            lPD lpd = new lPD();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("quick_convert_params", quickConvertParams);
            lpd.setArguments(bundle);
            return lpd;
        }
    }
}
