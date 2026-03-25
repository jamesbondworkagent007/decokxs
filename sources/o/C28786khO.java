package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.meme.bundle_detail.domain.model.BundleDetailData;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.DataTabViewModel;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC28783khL;
import o.C23274hvD;
import o.InterfaceC54828xWv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28786khO extends AbstractC28863kim<C21459hAd> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AYXKKw() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AhwBna() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String DbNXlk() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String djBIcL() {
        return "--";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21459hAd EZpvd(C28786khO c28786khO) {
        return (C21459hAd) c28786khO.aX_();
    }

    public C28786khO() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.DataTabFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.DataTabFragment$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DataTabViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.DataTabFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.DataTabFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.token_detail_sheet.ui.DataTabFragment$special$$inlined$viewModels$default$5
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

    public final DataTabViewModel AkhnZx() {
        return (DataTabViewModel) this.AEQbTJ.getValue();
    }

    public final TokenDetailCommonParams fetchVPNInfo() {
        TokenDetailCommonParams tokenDetailCommonParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (tokenDetailCommonParams = (TokenDetailCommonParams) BundleCompat.getParcelable(arguments, "common_data", TokenDetailCommonParams.class)) == null) ? new TokenDetailCommonParams(null, null, null, null, null, false, false, null, null, false, 1023, null) : tokenDetailCommonParams;
    }

    public final TokenDetailTabData.DataTab isConnected() {
        TokenDetailTabData.DataTab dataTab;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (dataTab = (TokenDetailTabData.DataTab) BundleCompat.getParcelable(arguments, "data_tab", TokenDetailTabData.DataTab.class)) == null) ? new TokenDetailTabData.DataTab(null, null, null, null, false, null, null, null, 255, null) : dataTab;
    }

    /* JADX INFO: renamed from: o.khO$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.khO.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C28786khO copydefault(@NotNull TokenDetailCommonParams tokenDetailCommonParams, @NotNull TokenDetailTabData.DataTab dataTab) {
            Intrinsics.checkNotNullParameter(tokenDetailCommonParams, "");
            Intrinsics.checkNotNullParameter(dataTab, "");
            C28786khO c28786khO = new C28786khO();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("common_data", tokenDetailCommonParams);
            bundle.putParcelable("data_tab", dataTab);
            c28786khO.setArguments(bundle);
            return c28786khO;
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C21459hAd KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21459hAd c21459hAdCopydefault = C21459hAd.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21459hAdCopydefault, "");
        return c21459hAdCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C21459hAd c21459hAd, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21459hAd, "");
        fIwbmz();
        fJNWhG();
        AkhnZx().loadData(fetchVPNInfo().KWHzl(), fetchVPNInfo().djBIcL(), isConnected().OLrzqt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fIwbmz() {
        C21459hAd c21459hAd = (C21459hAd) aX_();
        if (c21459hAd != null) {
            kotlin.Pair<java.lang.String, java.lang.Integer> pairAhwBna = C28926kjw.AhwBna(isConnected().gEmmrt());
            c21459hAd.DTwDnp.setText(pairAhwBna.getFirst());
            android.widget.TextView textView = c21459hAd.DTwDnp;
            int iIntValue = pairAhwBna.getSecond().intValue();
            android.content.Context context = c21459hAd.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setTextColor(C25382ivf.copydefault(iIntValue, context));
            android.widget.LinearLayout linearLayout = c21459hAd.getNewProxyInstance;
            linearLayout.setOnClickListener(new StateListAnimator(linearLayout, 1000L, this));
            kotlin.Pair<java.lang.String, java.lang.Integer> pairOLrzqt = C28926kjw.OLrzqt(isConnected().AYXKKw());
            c21459hAd.QOLQEE.setText(pairOLrzqt.getFirst());
            android.widget.TextView textView2 = c21459hAd.QOLQEE;
            int iIntValue2 = pairOLrzqt.getSecond().intValue();
            android.content.Context context2 = c21459hAd.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textView2.setTextColor(C25382ivf.copydefault(iIntValue2, context2));
            kotlin.Pair<java.lang.String, java.lang.Integer> pairCopydefault = C28926kjw.copydefault(isConnected().valueOf());
            c21459hAd.AxsJAY.setText(pairCopydefault.getFirst());
            android.widget.TextView textView3 = c21459hAd.AxsJAY;
            int iIntValue3 = pairCopydefault.getSecond().intValue();
            android.content.Context context3 = c21459hAd.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            textView3.setTextColor(C25382ivf.copydefault(iIntValue3, context3));
            kotlin.Pair<java.lang.String, java.lang.Integer> pairEZpvd = C28926kjw.EZpvd(isConnected().AEQbTJ());
            c21459hAd.zuBGHE.setText(pairEZpvd.getFirst());
            android.widget.TextView textView4 = c21459hAd.zuBGHE;
            int iIntValue4 = pairEZpvd.getSecond().intValue();
            android.content.Context context4 = c21459hAd.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            textView4.setTextColor(C25382ivf.copydefault(iIntValue4, context4));
            android.widget.LinearLayout linearLayout2 = c21459hAd.uzCIH;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(C23313hvq.OLrzqt(isConnected().AEQbTJ(), "0") ? 0 : 8);
            kotlin.Pair<java.lang.String, java.lang.Integer> pairAEQbTJ = C28926kjw.AEQbTJ(isConnected().KWHzl());
            c21459hAd.QKVWgx.setText(pairAEQbTJ.getFirst());
            android.widget.TextView textView5 = c21459hAd.QKVWgx;
            int iIntValue5 = pairAEQbTJ.getSecond().intValue();
            android.content.Context context5 = c21459hAd.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            textView5.setTextColor(C25382ivf.copydefault(iIntValue5, context5));
            android.widget.LinearLayout linearLayout3 = c21459hAd.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout3.setVisibility(C23313hvq.OLrzqt(isConnected().KWHzl(), "0") ? 0 : 8);
            java.lang.String strCopydefault = isConnected().copydefault();
            boolean zDjBIcL = isConnected().djBIcL();
            android.content.Context context6 = c21459hAd.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            kotlin.Pair<java.lang.String, java.lang.Integer> pairEZpvd2 = C28926kjw.EZpvd(strCopydefault, zDjBIcL, context6);
            c21459hAd.AwvSrB.setText(pairEZpvd2.getFirst());
            android.widget.TextView textView6 = c21459hAd.AwvSrB;
            int iIntValue6 = pairEZpvd2.getSecond().intValue();
            android.content.Context context7 = c21459hAd.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            textView6.setTextColor(C25382ivf.copydefault(iIntValue6, context7));
            ConstraintLayout constraintLayout = c21459hAd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            Group group = c21459hAd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
            C55258xgZ c55258xgZ = c21459hAd.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
            KWHzl(c55258xgZ, C23274hvD.Fragment.onRetainNonConfigurationInstance, C23274hvD.Fragment.removeOnReportDrawnListener);
            C55258xgZ c55258xgZ2 = c21459hAd.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ2, "");
            KWHzl(c55258xgZ2, C23274hvD.Fragment.onMenuItemSelected, C23274hvD.Fragment.removeReporter);
            C55258xgZ c55258xgZ3 = c21459hAd.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ3, "");
            KWHzl(c55258xgZ3, C23274hvD.Fragment.RjCdvp, C23274hvD.Fragment.FullyDrawnReporterExternalSyntheticLambda0);
            C55258xgZ c55258xgZ4 = c21459hAd.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ4, "");
            KWHzl(c55258xgZ4, C23274hvD.Fragment.stop, C23274hvD.Fragment.IMediaSessionStub);
            C55258xgZ c55258xgZ5 = c21459hAd.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ5, "");
            KWHzl(c55258xgZ5, C23274hvD.Fragment.unregisterCallbackListener, C23274hvD.Fragment.setVolumeTo);
            C55258xgZ c55258xgZ6 = c21459hAd.djBIcL;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ6, "");
            KWHzl(c55258xgZ6, C23274hvD.Fragment.onCreatePanelMenu, C23274hvD.Fragment.isFullyDrawnReported);
            C55258xgZ c55258xgZ7 = c21459hAd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ7, "");
            KWHzl(c55258xgZ7, C23274hvD.Fragment.DcMfJKDIADVb, C23274hvD.Fragment.FullyDrawnReporterKt);
            C55258xgZ c55258xgZ8 = c21459hAd.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ8, "");
            KWHzl(c55258xgZ8, C23274hvD.Fragment.invokespecialatDTRm, C23274hvD.Fragment.handleOnBackPressed);
            C55258xgZ c55258xgZ9 = c21459hAd.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ9, "");
            KWHzl(c55258xgZ9, C23274hvD.Fragment.invokespecialdPnHjp, C23274hvD.Fragment.isEnabled);
        }
    }

    /* JADX INFO: renamed from: o.khO$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, android.view.View view2, int i, int i2) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = view2;
            this.OLrzqt = i;
            this.copydefault = i2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.OLrzqt(this.OLrzqt, context));
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.OLrzqt(this.copydefault, context));
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.OLrzqt(C23274hvD.Fragment.buildRccMetadata, context), (View.OnClickListener) new PendingIntent(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.khO$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C28786khO KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C28786khO c28786khO) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c28786khO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C28840kiP.EZpvd("top_10_holders");
                this.KWHzl.values();
            }
        }
    }

    /* JADX INFO: renamed from: o.khO$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    public final void values() {
        java.lang.String value = AkhnZx().copydefault().getValue();
        if (value.length() == 0) {
            return;
        }
        InterfaceC54828xWv interfaceC54828xWv = (InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC54828xWv.ActionBar.enterDAppWebView$default(interfaceC54828xWv, fragmentActivityRequireActivity, value, null, null, null, null, null, "dex", 96, null);
    }

    private final void fJNWhG() {
        C25390ivn.collectOnViewLifecycle$default(this, AkhnZx().EZpvd(), null, new Application(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AkhnZx().copydefault(), null, new TaskDescription(), 2, null);
    }

    /* JADX INFO: renamed from: o.khO$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC28783khL abstractC28783khL, Continuation<? super Unit> continuation) {
            if (!(abstractC28783khL instanceof AbstractC28783khL.Activity)) {
                if (abstractC28783khL instanceof AbstractC28783khL.TaskDescription) {
                    C28786khO.this.EZpvd(((AbstractC28783khL.TaskDescription) abstractC28783khL).KWHzl());
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C28786khO.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                } else {
                    if (!(abstractC28783khL instanceof AbstractC28783khL.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C21459hAd c21459hAdEZpvd = C28786khO.EZpvd(C28786khO.this);
                    if (c21459hAdEZpvd != null) {
                        ConstraintLayout constraintLayout = c21459hAdEZpvd.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                        constraintLayout.setVisibility(8);
                        Group group = c21459hAdEZpvd.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(group, "");
                        group.setVisibility(8);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.khO$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.lang.String str, Continuation<? super Unit> continuation) {
            C21459hAd c21459hAdEZpvd = C28786khO.EZpvd(C28786khO.this);
            if (c21459hAdEZpvd != null) {
                android.widget.ImageView imageView = c21459hAdEZpvd.AuCTel;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? 0 : 8);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(BundleDetailData bundleDetailData) {
        C21459hAd c21459hAd = (C21459hAd) aX_();
        if (c21459hAd != null) {
            boolean zOLrzqt = C23313hvq.OLrzqt(bundleDetailData.getBundleHoldingRatio(), "0");
            ConstraintLayout constraintLayout = c21459hAd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(zOLrzqt ? 0 : 8);
            if (zOLrzqt) {
                kotlin.Pair<java.lang.String, java.lang.Integer> pairKWHzl = C28926kjw.KWHzl(bundleDetailData.getBundleHoldingRatio());
                c21459hAd.wlaJM.setText(pairKWHzl.getFirst());
                android.widget.TextView textView = c21459hAd.wlaJM;
                int iIntValue = pairKWHzl.getSecond().intValue();
                android.content.Context context = c21459hAd.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                textView.setTextColor(C25382ivf.copydefault(iIntValue, context));
                Group group = c21459hAd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(group, "");
                group.setVisibility(0);
                android.widget.TextView textView2 = c21459hAd.AubY;
                java.lang.String bundleAth = bundleDetailData.getBundleAth();
                textView2.setText(C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) bundleAth) ? C23311hvo.formatPercentWithoutSymbol$default(bundleAth, true, 0, null, false, null, 30, null) : "", (Function0<java.lang.String>) new Function0() { // from class: o.khK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C28786khO.DbNXlk();
                    }
                }));
                android.widget.TextView textView3 = c21459hAd.ORxRYg;
                java.lang.String totalBundlers = bundleDetailData.getTotalBundlers();
                textView3.setText(C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) totalBundlers) ? pTB.formatICUNumber$default(C33129mqd.EZpvd(totalBundlers), null, C38307pTy.Companion.KWHzl(0, 2), null, null, 13, null) : "", (Function0<java.lang.String>) new Function0() { // from class: o.khN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C28786khO.djBIcL();
                    }
                }));
                android.widget.TextView textView4 = c21459hAd.sSMYrx;
                java.lang.String totalBundledValue = bundleDetailData.getTotalBundledValue();
                textView4.setText(C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) totalBundledValue) ? C23271hvA.formatTokenCode$default(C23271hvA.copydefault, totalBundledValue, true, null, false, bundleDetailData.getNativeTokenSymbol(), null, 22, null) : "", (Function0<java.lang.String>) new Function0() { // from class: o.khP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C28786khO.AYXKKw();
                    }
                }));
                android.widget.TextView textView5 = c21459hAd.gHZMYf;
                java.lang.String bundleHoldingRatio = bundleDetailData.getBundleHoldingRatio();
                textView5.setText(C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) bundleHoldingRatio) ? C23311hvo.formatPercentWithoutSymbol$default(bundleHoldingRatio, true, 0, null, false, null, 30, null) : "", (Function0<java.lang.String>) new Function0() { // from class: o.khT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C28786khO.AhwBna();
                    }
                }));
            }
        }
    }

    public final void KWHzl(android.view.View view, @androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
        view.setOnClickListener(new ActionBar(view, 1000L, view, i, i2));
    }
}
