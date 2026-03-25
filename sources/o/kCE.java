package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexui.chain_picker.ChainPickerParams;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import com.okinc.business.market.features.watch_list_groups.ui.filter.WatchListFilterParams;
import com.okinc.business.market.features.watch_list_groups.ui.filter.WatchListFilterViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC28591kdf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kCE extends kCC implements InterfaceC23406hxd, InterfaceC28591kdf {
    public C23478hyw gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AhwBna = 8;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.InterfaceC28591kdf
    public void isConnected() {
        InterfaceC28591kdf.Activity.KWHzl(this);
    }

    public kCE() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.watch_list_groups.ui.filter.WatchListFilterBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.watch_list_groups.ui.filter.WatchListFilterBottomSheet$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WatchListFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.watch_list_groups.ui.filter.WatchListFilterBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.watch_list_groups.ui.filter.WatchListFilterBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.watch_list_groups.ui.filter.WatchListFilterBottomSheet$special$$inlined$viewModels$default$5
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

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchListFilterParams AhwBna() {
        WatchListFilterParams watchListFilterParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (watchListFilterParams = (WatchListFilterParams) BundleCompat.getParcelable(arguments, "key.watchlist_filter", WatchListFilterParams.class)) == null) ? new WatchListFilterParams(null, null, null, false, 15, null) : watchListFilterParams;
    }

    /* JADX DEBUG: Possible override for method o.kCC.AEQbTJ()V */
    public final WatchListFilterViewModel AEQbTJ() {
        return (WatchListFilterViewModel) this.valueOf.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AYXKKw().setText(AhwBna().OLrzqt());
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.gEmmrt = C23478hyw.OLrzqt(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        AEQbTJ(AhwBna().copydefault().djBIcL());
        AEQbTJ(AhwBna().copydefault().copydefault());
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.dpErvT));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(true);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new TaskDescription(c52794wYpCopydefault2, 1000L, this));
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.sanrWj));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new Application(c52794wYpAEQbTJ2, 1000L, this));
        }
    }

    public final void copydefault(TimeIntervalType timeIntervalType, MarketChainBean marketChainBean) {
        ActivityResultCaller parentFragment = getParentFragment();
        kCF kcf = parentFragment instanceof kCF ? (kCF) parentFragment : null;
        if (kcf == null) {
            KeyEventDispatcher.Component activity = getActivity();
            kCF kcf2 = activity instanceof kCF ? (kCF) activity : null;
            if (kcf2 == null) {
                return;
            } else {
                kcf = kcf2;
            }
        }
        kcf.OLrzqt(timeIntervalType, marketChainBean);
        dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().OLrzqt(), null, new StateListAnimator(), 2, null);
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(kCH kch, Continuation<? super Unit> continuation) {
            ConstraintLayout constraintLayout;
            Sequence<android.view.View> children;
            kCE.this.AEQbTJ(kch.KWHzl());
            kCE.this.AEQbTJ(kch.AEQbTJ());
            C54946xaf binding = kCE.this.getBinding();
            android.view.View view = (binding == null || (constraintLayout = binding.OLrzqt) == null || (children = ViewGroupKt.getChildren(constraintLayout)) == null) ? null : (android.view.View) C59467zhb.zLjUOn(children);
            wYF wyf = view instanceof wYF ? (wYF) view : null;
            if (wyf == null) {
                return Unit.INSTANCE;
            }
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setEnabled(kch.OLrzqt());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C33570myu.copydefault((android.app.Activity) getActivity());
    }

    @Override // o.InterfaceC23406hxd
    public void KWHzl(@NotNull MarketChainBean marketChainBean) {
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        AEQbTJ().KWHzl(marketChainBean);
    }

    @Override // o.InterfaceC28591kdf
    public void OLrzqt(@NotNull TimeIntervalType timeIntervalType) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        AEQbTJ().KWHzl(timeIntervalType);
    }

    public final void AEQbTJ(TimeIntervalType timeIntervalType) {
        C28055kNf c28055kNf;
        AppCompatTextView appCompatTextView;
        java.util.List<TimeIntervalType> listKWHzl = AhwBna().KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (TimeIntervalType timeIntervalType2 : listKWHzl) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.zuBGHE);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(TimeIntervalType.Companion.copydefault(timeIntervalType2)));
            spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
            arrayList.add(new C28060kNk(C33129mqd.gEmmrt(java.lang.Integer.valueOf(timeIntervalType2.getValue())), null, new android.text.SpannedString(spannableStringBuilder), false, 10, null));
        }
        C23478hyw c23478hyw = this.gEmmrt;
        if (c23478hyw == null || (c28055kNf = c23478hyw.AYXKKw) == null) {
            return;
        }
        c28055kNf.setSpanCount(4);
        c28055kNf.setCallback(new LoaderManager());
        c28055kNf.setData(arrayList, C33129mqd.gEmmrt(java.lang.Integer.valueOf(timeIntervalType.getValue())));
        c28055kNf.setVisibility(C33129mqd.KWHzl((java.util.Collection) arrayList) ? 0 : 8);
        C23478hyw c23478hyw2 = this.gEmmrt;
        if (c23478hyw2 == null || (appCompatTextView = c23478hyw2.AhwBna) == null) {
            return;
        }
        appCompatTextView.setVisibility(C33129mqd.KWHzl((java.util.Collection) arrayList) ? 0 : 8);
    }

    public final /* synthetic */ class LoaderManager implements InterfaceC28053kNd, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28053kNd) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, kCE.this, kCE.class, "onTypeChange", "onTypeChange(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28053kNd
        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            kCE.this.KWHzl(str);
        }
    }

    public final void AEQbTJ(MarketChainBean marketChainBean) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        android.widget.LinearLayout linearLayout;
        AppCompatImageView appCompatImageView4;
        android.widget.TextView textView;
        C23478hyw c23478hyw = this.gEmmrt;
        if (c23478hyw != null && (textView = c23478hyw.OLrzqt) != null) {
            textView.setText(marketChainBean.getChainName());
        }
        if (Intrinsics.EZpvd((java.lang.Object) marketChainBean.getChainId(), (java.lang.Object) "-100")) {
            C23478hyw c23478hyw2 = this.gEmmrt;
            if (c23478hyw2 != null && (appCompatImageView4 = c23478hyw2.KWHzl) != null) {
                appCompatImageView4.setImageResource(C52761wXj.TaskDescription.createSocket);
            }
        } else if (marketChainBean.getChainLogo().length() > 0) {
            C23478hyw c23478hyw3 = this.gEmmrt;
            if (c23478hyw3 != null && (appCompatImageView3 = c23478hyw3.KWHzl) != null) {
                C25386ivj.KWHzl(appCompatImageView3, marketChainBean.getChainLogo(), new C25385ivi(C33070mpX.KWHzl(C57406yhn.Activity.QKVWgx), null, 0.0f, 0, 14, null));
            }
        } else if (marketChainBean.getResourceId() != 0) {
            C23478hyw c23478hyw4 = this.gEmmrt;
            if (c23478hyw4 != null && (appCompatImageView2 = c23478hyw4.KWHzl) != null) {
                appCompatImageView2.setImageResource(marketChainBean.getResourceId());
            }
        } else {
            C23478hyw c23478hyw5 = this.gEmmrt;
            if (c23478hyw5 != null && (appCompatImageView = c23478hyw5.KWHzl) != null) {
                appCompatImageView.setImageResource(C57406yhn.Activity.QKVWgx);
            }
        }
        C23478hyw c23478hyw6 = this.gEmmrt;
        if (c23478hyw6 == null || (linearLayout = c23478hyw6.copydefault) == null) {
            return;
        }
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this, marketChainBean));
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ MarketChainBean EZpvd;
        public final /* synthetic */ kCE KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, kCE kce, MarketChainBean marketChainBean) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = kce;
            this.EZpvd = marketChainBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ(this.EZpvd.getChainId());
                C29229kph.KWHzl(this.KWHzl.AhwBna().EZpvd(), "network_filter");
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ kCE AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, kCE kce) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = kce;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                kCE kce = this.AEQbTJ;
                HomeFavoriteListFilter.Activity activity = HomeFavoriteListFilter.Companion;
                kce.copydefault(activity.KWHzl().djBIcL(), activity.KWHzl().copydefault());
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ kCE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, kCE kce) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = kce;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                kCE kce = this.copydefault;
                kce.copydefault(kce.AEQbTJ().OLrzqt().getValue().AEQbTJ(), this.copydefault.AEQbTJ().OLrzqt().getValue().KWHzl());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
        AEQbTJ().KWHzl(TimeIntervalType.Companion.fromValue$default(TimeIntervalType.Companion, C33129mqd.AhwBna(str), null, 2, null));
    }

    public final void AEQbTJ(java.lang.String str) {
        C23407hxe c23407hxeCopydefault = C23407hxe.Companion.copydefault(new ChainPickerParams(str));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c23407hxeCopydefault.show(childFragmentManager);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kCE.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final kCE KWHzl(@NotNull WatchListFilterParams watchListFilterParams) {
            Intrinsics.checkNotNullParameter(watchListFilterParams, "");
            kCE kce = new kCE();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.watchlist_filter", watchListFilterParams);
            kce.setArguments(bundle);
            return kce;
        }
    }
}
