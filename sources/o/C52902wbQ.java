package o;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeuilib.imgs.OKRemoteImageResource;
import com.okinc.tradeuilib.imgs.RemoteSupportedScaleType;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbCustomOrderFragment$initViewModel$1;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbCustomOrderFragment$mAdapter$1$1;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbCustomOrderViewModel;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.FundingRateArbCoin;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC52122vzt;
import o.C48033uCm;
import o.C51685vrg;
import o.C52937wbz;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.wbQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52902wbQ extends AbstractC52896wbK {
    public final int AYXKKw = C48033uCm.Activity.ROgMPW;
    public java.util.List<FundingRateArbCoin> AhwBna;
    public final C43316rmw djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public uSO valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public C52902wbQ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbCustomOrderFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbCustomOrderFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SmartArbCustomOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbCustomOrderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbCustomOrderFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbCustomOrderFragment$special$$inlined$viewModels$default$5
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
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(FundingRateArbCoin.class, new C52958wcT(new SmartArbCustomOrderFragment$mAdapter$1$1(this)));
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(null, 1, null));
        this.djBIcL = c43316rmw;
        this.AhwBna = yDY.AhwBna();
    }

    /* JADX DEBUG: Possible override for method o.wbK.KWHzl()V */
    public final SmartArbCustomOrderViewModel KWHzl() {
        return (SmartArbCustomOrderViewModel) this.gEmmrt.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        uSO usoKWHzl = uSO.KWHzl(view);
        Intrinsics.copydefault(usoKWHzl);
        KWHzl(usoKWHzl);
        this.valueOf = usoKWHzl;
        AYXKKw();
        getChildFragmentManager().setFragmentResultListener("smart_arbitrage_select_coin", this, new FragmentResultListener() { // from class: o.wbP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C52902wbQ.AEQbTJ(this.copydefault, str, bundle2);
            }
        });
        C56028xvA.registerBotFragmentTrack$default(this, "SmartArbCustomOrderFragment", new kotlin.Pair[0], null, 8, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void djBIcL() {
        getChildFragmentManager().beginTransaction().replace(C48033uCm.Application.dUDNAs, C51685vrg.ActionBar.newInstance$default(C51685vrg.Companion, "", "SmartArbRecommendationView", null, 4, null), "smart_arb_asset").commitAllowingStateLoss();
    }

    public final void EZpvd(java.lang.String str) {
        ActionBar actionBarAEQbTJ;
        RxBus.KWHzl("bot_arb_smart_guide_need_finish");
        ActivityC52122vzt.Application application = ActivityC52122vzt.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        application.OLrzqt(contextRequireContext, new BotTradeData("smart_arbitrage", str == null ? "" : str, "SWAP", (android.os.Parcelable) null, false, (java.lang.String) null, (str == null || (actionBarAEQbTJ = o.TaskDescription.AEQbTJ(str)) == null) ? null : o.TaskDescription.copydefault(actionBarAEQbTJ), false, (java.util.List) this.AhwBna, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, (DefaultConstructorMarker) null), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "SmartArbCustomOrderFragment", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
    }

    public final void KWHzl(uSO uso) {
        android.widget.ImageView imageView = uso.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C49721utr.OLrzqt(imageView, OKRemoteImageResource.Resource.SMART_ARBITRAGE_CUSTOMIZABLE_USER_COUNT_AVATAR, requireContext(), (2044 & 4) != 0 ? 0 : 0, (2044 & 8) != 0 ? RemoteSupportedScaleType.CENTER_INSIDE : null, (2044 & 16) != 0 ? null : null, (2044 & 32) != 0 ? -1 : 0, (2044 & 64) != 0 ? -1 : 0, (2044 & 128) != 0 ? null : null, (2044 & 256) != 0 ? null : null, (2044 & 512) != 0 ? false : false, (2044 & 1024) != 0 ? OKRemoteImageResource.EZpvd.getClass().getSimpleName() : null);
        RecyclerView recyclerView = uso.AhwBna;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(this.djBIcL);
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(16.0f, null, 1, null), 0));
        android.widget.TextView textView = uso.gEmmrt;
        textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
        uso.EZpvd.setRetryClickListener(new View.OnClickListener() { // from class: o.wbM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52902wbQ.EZpvd(this.OLrzqt, view);
            }
        });
        djBIcL();
    }

    public static final void EZpvd(C52902wbQ c52902wbQ, android.view.View view) {
        c52902wbQ.KWHzl().OLrzqt();
    }

    private final void AYXKKw() {
        C52692wUv.flowAndCollect$default(KWHzl().copydefault(), this, null, new SmartArbCustomOrderFragment$initViewModel$1(this, null), 2, null);
        KWHzl().OLrzqt();
    }

    public final android.text.SpannableStringBuilder copydefault(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, java.lang.String str2) {
        java.lang.Object styleSpan;
        java.lang.String str3 = "{" + str + "}";
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, str3, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            return spannableStringBuilder;
        }
        android.text.SpannableStringBuilder spannableStringBuilderReplace = spannableStringBuilder.replace(iIndexOf$default, str3.length() + iIndexOf$default, (java.lang.CharSequence) str2);
        int length = str2.length();
        android.graphics.Typeface typefaceOLrzqt = C55051xce.OLrzqt.OLrzqt();
        if (Build.VERSION.SDK_INT >= 28 && typefaceOLrzqt != null) {
            styleSpan = C7368aiX.copydefault(typefaceOLrzqt);
        } else {
            styleSpan = new android.text.style.StyleSpan(1);
        }
        spannableStringBuilderReplace.setSpan(styleSpan, iIndexOf$default, length + iIndexOf$default, 33);
        Intrinsics.copydefault(spannableStringBuilderReplace);
        return spannableStringBuilderReplace;
    }

    /* JADX INFO: renamed from: o.wbQ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52902wbQ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52902wbQ c52902wbQ) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c52902wbQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52937wbz.Activity activity = C52937wbz.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                activity.AEQbTJ(childFragmentManager);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.valueOf = null;
        super.onDestroyView();
    }

    public static final void AEQbTJ(C52902wbQ c52902wbQ, java.lang.String str, android.os.Bundle bundle) {
        java.lang.Object parcelable;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable("data", FundingRateArbCoin.class);
        } else {
            java.lang.Object parcelable2 = bundle.getParcelable("data");
            if (!(parcelable2 instanceof FundingRateArbCoin)) {
                parcelable2 = null;
            }
            parcelable = (FundingRateArbCoin) parcelable2;
        }
        FundingRateArbCoin fundingRateArbCoin = (FundingRateArbCoin) parcelable;
        c52902wbQ.EZpvd(fundingRateArbCoin != null ? fundingRateArbCoin.getInstId() : null);
    }
}
