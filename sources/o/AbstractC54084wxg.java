package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.uilab.view.OKSortTextView;
import com.okinc.unify_trade.biz.ArbitrageFavoriteBean;
import com.okinc.unify_trade.biz.ArbitrageInfo;
import com.okinc.unify_trade.biz.ArbitrageSetFavoriteBean;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData;
import com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC54084wxg;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.xKK;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.wxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC54084wxg extends AbstractC32998moE {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public java.util.ArrayList<java.lang.Object> AEQbTJ;
    public final TradeLiveData<SourceResp<C55879xsK>> AYXKKw;
    public FutureGroupInfo AhwBna;
    public AbstractC48365uOu AkhnZx;
    public java.lang.String AuCTel;
    public Function1<? super MarketArbCoinInfo, Unit> DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public java.lang.String KWHzl;
    public OKSortTextView.SortType OLrzqt;
    public java.util.ArrayList<java.lang.String> djBIcL;
    public android.graphics.drawable.Drawable ejfBZ;
    public java.util.ArrayList<java.lang.Object> fARcdN;
    public android.graphics.drawable.Drawable fJNWhG;
    public C43316rmw fetchVPNInfo;
    public java.util.ArrayList<java.lang.Object> gEmmrt;
    public final InterfaceC56387yDm getFieldNames;
    public boolean isConnected;
    public OKSortTextView.SortType values;
    public final xDJ valueOf = new xDJ();
    public final xDO fIwbmz = new xDO();

    /* JADX INFO: renamed from: o.wxg$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.wxg$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKSortTextView.SortType.values().length];
            try {
                iArr[OKSortTextView.SortType.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKSortTextView.SortType.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SourceResp<C55879xsK>> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.isConnected = z;
    }

    public abstract java.util.List<FutureGroupInfo> AYXKKw();

    public abstract void DbNXlk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FutureGroupInfo EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super MarketArbCoinInfo, Unit> function1) {
        this.DbNXlk = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.util.ArrayList<java.lang.Object> arrayList) {
        this.AEQbTJ = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.Object> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC48365uOu djBIcL() {
        return this.AkhnZx;
    }

    public abstract void fetchVPNInfo();

    public abstract int gEmmrt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.OFhtUX;
    }

    public abstract void isConnected();

    public abstract java.lang.String valueOf();

    public AbstractC54084wxg() {
        final Function0 function0 = new Function0() { // from class: o.wxk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC54084wxg.OLrzqt(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.BaseArbitrageSearchFragment$special$$inlined$viewModels$default$1
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
        this.getFieldNames = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54056wxE.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.BaseArbitrageSearchFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.BaseArbitrageSearchFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.BaseArbitrageSearchFragment$special$$inlined$viewModels$default$4
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vBJ.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.BaseArbitrageSearchFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.BaseArbitrageSearchFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.search.view.BaseArbitrageSearchFragment$special$$inlined$activityViewModels$default$3
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
        this.KWHzl = "futures_spot";
        this.fetchVPNInfo = new C43316rmw();
        OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
        this.OLrzqt = sortType;
        this.values = sortType;
        this.gEmmrt = new java.util.ArrayList<>();
        this.fARcdN = new java.util.ArrayList<>();
        this.AYXKKw = new TradeLiveData<>();
    }

    public static final ViewModelStoreOwner OLrzqt(AbstractC54084wxg abstractC54084wxg) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = abstractC54084wxg.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final C54056wxE AhwBna() {
        return (C54056wxE) this.getFieldNames.getValue();
    }

    private final vBJ fARcdN() {
        return (vBJ) this.EZpvd.getValue();
    }

    /* JADX INFO: renamed from: o.wxg$Fragment */
    public static final class Fragment<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(T t, T t2) {
            java.lang.String apy;
            java.lang.Double dValueOf;
            java.lang.String apy2;
            java.lang.Double dValueOf2 = null;
            if (t instanceof FundingRateArbitrageData) {
                java.lang.String apy3 = ((FundingRateArbitrageData) t).getApy();
                dValueOf = apy3 != null ? java.lang.Double.valueOf(C33129mqd.AEQbTJ(apy3)) : null;
            } else {
                SpreadArbitrageData spreadArbitrageData = t instanceof SpreadArbitrageData ? (SpreadArbitrageData) t : null;
                if (spreadArbitrageData != null && (apy = spreadArbitrageData.getApy()) != null) {
                    dValueOf = java.lang.Double.valueOf(C33129mqd.AEQbTJ(apy));
                }
            }
            if (t2 instanceof FundingRateArbitrageData) {
                java.lang.String apy4 = ((FundingRateArbitrageData) t2).getApy();
                if (apy4 != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(apy4));
                }
            } else {
                SpreadArbitrageData spreadArbitrageData2 = t2 instanceof SpreadArbitrageData ? (SpreadArbitrageData) t2 : null;
                if (spreadArbitrageData2 != null && (apy2 = spreadArbitrageData2.getApy()) != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(apy2));
                }
            }
            return yET.KWHzl(dValueOf, dValueOf2);
        }
    }

    /* JADX INFO: renamed from: o.wxg$FragmentManager */
    public static final class FragmentManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(T t, T t2) {
            java.lang.String notionalUsd;
            java.lang.Double dValueOf;
            java.lang.String notionalUsd2;
            java.lang.Double dValueOf2 = null;
            if (t instanceof FundingRateArbitrageData) {
                java.lang.String notionalUsd3 = ((FundingRateArbitrageData) t).getNotionalUsd();
                dValueOf = notionalUsd3 != null ? java.lang.Double.valueOf(C33129mqd.AEQbTJ(notionalUsd3)) : null;
            } else {
                SpreadArbitrageData spreadArbitrageData = t instanceof SpreadArbitrageData ? (SpreadArbitrageData) t : null;
                if (spreadArbitrageData != null && (notionalUsd = spreadArbitrageData.getNotionalUsd()) != null) {
                    dValueOf = java.lang.Double.valueOf(C33129mqd.AEQbTJ(notionalUsd));
                }
            }
            if (t2 instanceof FundingRateArbitrageData) {
                java.lang.String notionalUsd4 = ((FundingRateArbitrageData) t2).getNotionalUsd();
                if (notionalUsd4 != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(notionalUsd4));
                }
            } else {
                SpreadArbitrageData spreadArbitrageData2 = t2 instanceof SpreadArbitrageData ? (SpreadArbitrageData) t2 : null;
                if (spreadArbitrageData2 != null && (notionalUsd2 = spreadArbitrageData2.getNotionalUsd()) != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(notionalUsd2));
                }
            }
            return yET.KWHzl(dValueOf, dValueOf2);
        }
    }

    /* JADX INFO: renamed from: o.wxg$PendingIntent */
    public static final class PendingIntent<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(T t, T t2) {
            java.lang.String spread;
            java.lang.Double dValueOf;
            java.lang.String spread2;
            java.lang.Double dValueOf2 = null;
            if (t instanceof FundingRateArbitrageData) {
                java.lang.String fundingRate = ((FundingRateArbitrageData) t).getFundingRate();
                dValueOf = fundingRate != null ? java.lang.Double.valueOf(C33129mqd.AEQbTJ(fundingRate)) : null;
            } else {
                SpreadArbitrageData spreadArbitrageData = t instanceof SpreadArbitrageData ? (SpreadArbitrageData) t : null;
                if (spreadArbitrageData != null && (spread = spreadArbitrageData.getSpread()) != null) {
                    dValueOf = java.lang.Double.valueOf(C33129mqd.AEQbTJ(spread));
                }
            }
            if (t2 instanceof FundingRateArbitrageData) {
                java.lang.String fundingRate2 = ((FundingRateArbitrageData) t2).getFundingRate();
                if (fundingRate2 != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(fundingRate2));
                }
            } else {
                SpreadArbitrageData spreadArbitrageData2 = t2 instanceof SpreadArbitrageData ? (SpreadArbitrageData) t2 : null;
                if (spreadArbitrageData2 != null && (spread2 = spreadArbitrageData2.getSpread()) != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(spread2));
                }
            }
            return yET.KWHzl(dValueOf, dValueOf2);
        }
    }

    /* JADX INFO: renamed from: o.wxg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wxg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.wxg$Dialog */
    public static final class Dialog<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(T t, T t2) {
            java.lang.String spread;
            java.lang.Double dValueOf;
            java.lang.String spread2;
            java.lang.Double dValueOf2 = null;
            if (t2 instanceof FundingRateArbitrageData) {
                java.lang.String fundingRate = ((FundingRateArbitrageData) t2).getFundingRate();
                dValueOf = fundingRate != null ? java.lang.Double.valueOf(C33129mqd.AEQbTJ(fundingRate)) : null;
            } else {
                SpreadArbitrageData spreadArbitrageData = t2 instanceof SpreadArbitrageData ? (SpreadArbitrageData) t2 : null;
                if (spreadArbitrageData != null && (spread = spreadArbitrageData.getSpread()) != null) {
                    dValueOf = java.lang.Double.valueOf(C33129mqd.AEQbTJ(spread));
                }
            }
            if (t instanceof FundingRateArbitrageData) {
                java.lang.String fundingRate2 = ((FundingRateArbitrageData) t).getFundingRate();
                if (fundingRate2 != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(fundingRate2));
                }
            } else {
                SpreadArbitrageData spreadArbitrageData2 = t instanceof SpreadArbitrageData ? (SpreadArbitrageData) t : null;
                if (spreadArbitrageData2 != null && (spread2 = spreadArbitrageData2.getSpread()) != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(spread2));
                }
            }
            return yET.KWHzl(dValueOf, dValueOf2);
        }
    }

    /* JADX INFO: renamed from: o.wxg$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(T t, T t2) {
            java.lang.String notionalUsd;
            java.lang.Double dValueOf;
            java.lang.String notionalUsd2;
            java.lang.Double dValueOf2 = null;
            if (t2 instanceof FundingRateArbitrageData) {
                java.lang.String notionalUsd3 = ((FundingRateArbitrageData) t2).getNotionalUsd();
                dValueOf = notionalUsd3 != null ? java.lang.Double.valueOf(C33129mqd.AEQbTJ(notionalUsd3)) : null;
            } else {
                SpreadArbitrageData spreadArbitrageData = t2 instanceof SpreadArbitrageData ? (SpreadArbitrageData) t2 : null;
                if (spreadArbitrageData != null && (notionalUsd = spreadArbitrageData.getNotionalUsd()) != null) {
                    dValueOf = java.lang.Double.valueOf(C33129mqd.AEQbTJ(notionalUsd));
                }
            }
            if (t instanceof FundingRateArbitrageData) {
                java.lang.String notionalUsd4 = ((FundingRateArbitrageData) t).getNotionalUsd();
                if (notionalUsd4 != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(notionalUsd4));
                }
            } else {
                SpreadArbitrageData spreadArbitrageData2 = t instanceof SpreadArbitrageData ? (SpreadArbitrageData) t : null;
                if (spreadArbitrageData2 != null && (notionalUsd2 = spreadArbitrageData2.getNotionalUsd()) != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(notionalUsd2));
                }
            }
            return yET.KWHzl(dValueOf, dValueOf2);
        }
    }

    /* JADX INFO: renamed from: o.wxg$SharedElementCallback */
    public static final class SharedElementCallback<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(T t, T t2) {
            java.lang.String apy;
            java.lang.Double dValueOf;
            java.lang.String apy2;
            java.lang.Double dValueOf2 = null;
            if (t2 instanceof FundingRateArbitrageData) {
                java.lang.String apy3 = ((FundingRateArbitrageData) t2).getApy();
                dValueOf = apy3 != null ? java.lang.Double.valueOf(C33129mqd.AEQbTJ(apy3)) : null;
            } else {
                SpreadArbitrageData spreadArbitrageData = t2 instanceof SpreadArbitrageData ? (SpreadArbitrageData) t2 : null;
                if (spreadArbitrageData != null && (apy = spreadArbitrageData.getApy()) != null) {
                    dValueOf = java.lang.Double.valueOf(C33129mqd.AEQbTJ(apy));
                }
            }
            if (t instanceof FundingRateArbitrageData) {
                java.lang.String apy4 = ((FundingRateArbitrageData) t).getApy();
                if (apy4 != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(apy4));
                }
            } else {
                SpreadArbitrageData spreadArbitrageData2 = t instanceof SpreadArbitrageData ? (SpreadArbitrageData) t : null;
                if (spreadArbitrageData2 != null && (apy2 = spreadArbitrageData2.getApy()) != null) {
                    dValueOf2 = java.lang.Double.valueOf(C33129mqd.AEQbTJ(apy2));
                }
            }
            return yET.KWHzl(dValueOf, dValueOf2);
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        AbstractC48365uOu abstractC48365uOu = this.AkhnZx;
        C57680ymw.KWHzl(abstractC48365uOu != null ? abstractC48365uOu.AEQbTJ : null);
        this.djBIcL = null;
        AkhnZx();
        fetchVPNInfo();
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        this.AYXKKw.removeObservers(this);
        this.valueOf.AYXKKw();
        this.fIwbmz.AYXKKw();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.AkhnZx = (AbstractC48365uOu) DataBindingUtil.inflate(layoutInflater, getLayoutId(), viewGroup, false);
        TradeLiveData<java.lang.String> tradeLiveDataEZpvd = AhwBna().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.wxr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC54084wxg.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        AbstractC48365uOu abstractC48365uOu = this.AkhnZx;
        if (abstractC48365uOu != null) {
            return abstractC48365uOu.getRoot();
        }
        return null;
    }

    public static final Unit EZpvd(AbstractC54084wxg abstractC54084wxg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        abstractC54084wxg.AuCTel = str;
        abstractC54084wxg.fIwbmz();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "");
        AuCTel();
        AbstractC48365uOu abstractC48365uOu = this.AkhnZx;
        if (abstractC48365uOu != null && (recyclerView2 = abstractC48365uOu.AEQbTJ) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        AbstractC48365uOu abstractC48365uOu2 = this.AkhnZx;
        if (abstractC48365uOu2 != null && (recyclerView = abstractC48365uOu2.AEQbTJ) != null) {
            recyclerView.setAdapter(this.fetchVPNInfo);
        }
        DbNXlk();
        values();
    }

    public void values() {
        java.util.ArrayList<java.lang.String> arrayList;
        final AbstractC48365uOu abstractC48365uOu = this.AkhnZx;
        if (abstractC48365uOu != null) {
            abstractC48365uOu.EZpvd.setText(gEmmrt());
            abstractC48365uOu.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wxl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC54084wxg.EZpvd(abstractC48365uOu, this, view);
                }
            });
            abstractC48365uOu.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.wxj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC54084wxg.AEQbTJ(abstractC48365uOu, this, view);
                }
            });
            abstractC48365uOu.OLrzqt.setOnSortTypeChangeListener(new Function2() { // from class: o.wxn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return AbstractC54084wxg.OLrzqt(this.EZpvd, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
                }
            });
            abstractC48365uOu.EZpvd.setOnSortTypeChangeListener(new Function2() { // from class: o.wxm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return AbstractC54084wxg.KWHzl(this.copydefault, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
                }
            });
            android.widget.LinearLayout linearLayout = abstractC48365uOu.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(C33129mqd.KWHzl((java.util.Collection) AYXKKw()) ? 0 : 8);
            abstractC48365uOu.AYXKKw.setIsScroll(true);
            C52708wVk c52708wVk = abstractC48365uOu.AYXKKw;
            java.util.List<FutureGroupInfo> listAYXKKw = AYXKKw();
            if (listAYXKKw != null) {
                arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(listAYXKKw, 10));
                java.util.Iterator<T> it = listAYXKKw.iterator();
                while (it.hasNext()) {
                    java.lang.String text = ((FutureGroupInfo) it.next()).getText();
                    if (text == null) {
                        text = "";
                    }
                    arrayList.add(text);
                }
            } else {
                arrayList = null;
            }
            c52708wVk.setItems(arrayList, 0);
            if (C33129mqd.KWHzl((java.util.Collection) AYXKKw())) {
                java.util.List<FutureGroupInfo> listAYXKKw2 = AYXKKw();
                this.AhwBna = listAYXKKw2 != null ? (FutureGroupInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(listAYXKKw2) : null;
            }
            abstractC48365uOu.AYXKKw.setOnClickItemListener(new Function1() { // from class: o.wxq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC54084wxg.OLrzqt(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final void EZpvd(AbstractC48365uOu abstractC48365uOu, AbstractC54084wxg abstractC54084wxg, android.view.View view) {
        abstractC48365uOu.EZpvd.setSortSelf(true);
        OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
        abstractC54084wxg.OLrzqt = sortType;
        abstractC48365uOu.OLrzqt.setSortType(sortType, false);
    }

    public static final void AEQbTJ(AbstractC48365uOu abstractC48365uOu, AbstractC54084wxg abstractC54084wxg, android.view.View view) {
        abstractC48365uOu.OLrzqt.setSortSelf(true);
        OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
        abstractC54084wxg.values = sortType;
        abstractC48365uOu.EZpvd.setSortType(sortType, false);
    }

    public static final Unit OLrzqt(AbstractC54084wxg abstractC54084wxg, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        abstractC54084wxg.OLrzqt = sortType;
        abstractC54084wxg.values = OKSortTextView.SortType.NONE;
        abstractC54084wxg.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC54084wxg abstractC54084wxg, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        abstractC54084wxg.values = sortType;
        abstractC54084wxg.OLrzqt = OKSortTextView.SortType.NONE;
        abstractC54084wxg.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC54084wxg abstractC54084wxg, int i) {
        java.util.List<FutureGroupInfo> listAYXKKw = abstractC54084wxg.AYXKKw();
        abstractC54084wxg.AhwBna = listAYXKKw != null ? listAYXKKw.get(i) : null;
        abstractC54084wxg.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        C56036xvI c56036xvI = C56036xvI.KWHzl;
        return !Intrinsics.EZpvd((java.lang.Object) c56036xvI.copydefault().getSide(), (java.lang.Object) c56036xvI.AEQbTJ().getSide()) && (!Intrinsics.EZpvd((java.lang.Object) c56036xvI.copydefault().getSide(), (java.lang.Object) "buy") ? !(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) copydefault(c56036xvI.AEQbTJ())) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) copydefault(c56036xvI.copydefault()))) : !(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) copydefault(c56036xvI.copydefault())) && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) copydefault(c56036xvI.AEQbTJ()))));
    }

    public final java.lang.String copydefault(ArbitrageInfo arbitrageInfo) {
        BizInstrument bizInstrumentCopydefault;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) arbitrageInfo.getInstId())) {
            return arbitrageInfo.getInstId();
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (bizInstrumentCopydefault = interfaceC54581xNrCopydefault.copydefault(arbitrageInfo.getInstType(), arbitrageInfo.getInstId(), arbitrageInfo.getUly(), arbitrageInfo.getAlias())) == null) {
            return null;
        }
        return bizInstrumentCopydefault.getInstId();
    }

    private final void AuCTel() {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, contextRequireContext, 0.0f, 2, null);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        int iTradeFallDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp, contextRequireContext2, 0.0f, 2, null);
        android.content.Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        int iTradeRiseTagContent$default = C33512mxp.tradeRiseTagContent$default(c33512mxp, contextRequireContext3, 0.0f, 2, null);
        android.content.Context contextRequireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
        int iTradeFallTagContent$default = C33512mxp.tradeFallTagContent$default(c33512mxp, contextRequireContext4, 0.0f, 2, null);
        android.content.Context contextRequireContext5 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
        int iTradeRiseTagFill$default = C33512mxp.tradeRiseTagFill$default(c33512mxp, contextRequireContext5, 0.0f, 2, null);
        android.content.Context contextRequireContext6 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
        int iTradeFallTagFill$default = C33512mxp.tradeFallTagFill$default(c33512mxp, contextRequireContext6, 0.0f, 2, null);
        android.content.Context context = getContext();
        if (context == null || (drawable = ContextCompat.getDrawable(context, C48033uCm.ActionBar.fIwbmz)) == null) {
            drawable = null;
        } else {
            drawable.setTint(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
        }
        this.ejfBZ = drawable;
        android.content.Context context2 = getContext();
        if (context2 == null || (drawable2 = ContextCompat.getDrawable(context2, C48033uCm.ActionBar.uzCIH)) == null) {
            drawable2 = null;
        } else {
            drawable2.setTint(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        this.fJNWhG = drawable2;
        this.fetchVPNInfo.register(CommonEmptyData.class, new C50041uzt(null, 1, null));
        this.fetchVPNInfo.register(FundingRateArbitrageData.class, new TaskDescription(iTradeRiseDefault$default, iTradeFallDefault$default, iTradeRiseTagContent$default, iTradeRiseTagFill$default, iTradeFallTagContent$default, iTradeFallTagFill$default, C48033uCm.Activity.BVXAa, C48034uCn.copydefault));
        this.fetchVPNInfo.register(SpreadArbitrageData.class, new ActionBar(iTradeRiseDefault$default, iTradeFallDefault$default, iTradeFallTagContent$default, iTradeFallTagFill$default, iTradeRiseTagContent$default, iTradeRiseTagFill$default, C48033uCm.Activity.YqksP, C48034uCn.KWHzl));
        this.fetchVPNInfo.setItems(this.fARcdN);
        C49952uyJ.updateDataOrEmpty$default(this.fetchVPNInfo, this.fARcdN, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 60, null, null, false, 56, null);
    }

    /* JADX INFO: renamed from: o.wxg$TaskDescription */
    public static final class TaskDescription extends C43318rmy<FundingRateArbitrageData, AbstractC50775vaX> {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ int copydefault;
        public final /* synthetic */ int djBIcL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            super(i7, i8);
            this.djBIcL = i;
            this.EZpvd = i2;
            this.KWHzl = i3;
            this.copydefault = i4;
            this.AEQbTJ = i5;
            this.OLrzqt = i6;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C43312rms<AbstractC50775vaX> c43312rms, final FundingRateArbitrageData fundingRateArbitrageData) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(fundingRateArbitrageData, "");
            super.onBindViewHolder((C43312rms) c43312rms, fundingRateArbitrageData);
            boolean zAEQbTJ = AbstractC54084wxg.this.AEQbTJ(fundingRateArbitrageData.getBuyInstId(), fundingRateArbitrageData.getSellInstId());
            pUU.KWHzl("FundingRateArbitrageData ---- ", fundingRateArbitrageData.getBuyInstId() + "-" + fundingRateArbitrageData.getSellInstId() + " isShow：" + fundingRateArbitrageData.isShow() + "  isSearchVisible：" + fundingRateArbitrageData.isSearchVisible() + "  isSelected：" + zAEQbTJ);
            if (!fundingRateArbitrageData.isShow() && !fundingRateArbitrageData.isSearchVisible() && !zAEQbTJ) {
                android.view.View view = c43312rms.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                OLrzqt(view, false);
                return;
            }
            android.view.View view2 = c43312rms.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            OLrzqt(view2, true);
            android.widget.ImageView imageView = ((AbstractC50775vaX) c43312rms.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            imageView.setVisibility((interfaceC54581xNrOLrzqt == null || !interfaceC54581xNrOLrzqt.sSMYrx() || C55697xoo.OLrzqt.AkhnZx()) ? 8 : 0);
            android.widget.ImageView imageView2 = ((AbstractC50775vaX) c43312rms.OLrzqt()).OLrzqt;
            java.util.ArrayList<java.lang.String> arrayListKWHzl = AbstractC54084wxg.this.KWHzl();
            imageView2.setSelected(arrayListKWHzl != null && CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayListKWHzl), fundingRateArbitrageData.getArbitrageId()));
            ((AbstractC50775vaX) c43312rms.OLrzqt()).OLrzqt.setImageDrawable(((AbstractC50775vaX) c43312rms.OLrzqt()).OLrzqt.isSelected() ? AbstractC54084wxg.this.ejfBZ : AbstractC54084wxg.this.fJNWhG);
            android.widget.ImageView imageView3 = ((AbstractC50775vaX) c43312rms.OLrzqt()).OLrzqt;
            final AbstractC54084wxg abstractC54084wxg = AbstractC54084wxg.this;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: o.wxo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    AbstractC54084wxg.TaskDescription.copydefault(abstractC54084wxg, fundingRateArbitrageData, c43312rms, view3);
                }
            });
            android.view.View root = ((AbstractC50775vaX) c43312rms.OLrzqt()).getRoot();
            final AbstractC54084wxg abstractC54084wxg2 = AbstractC54084wxg.this;
            root.setOnClickListener(new View.OnClickListener() { // from class: o.wxv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    AbstractC54084wxg.TaskDescription.AEQbTJ(abstractC54084wxg2, fundingRateArbitrageData, c43312rms, view3);
                }
            });
            android.widget.TextView textView = ((AbstractC50775vaX) c43312rms.OLrzqt()).AYXKKw;
            xMR xmr = xMR.copydefault;
            java.lang.String apy = fundingRateArbitrageData.getApy();
            if (apy == null) {
                apy = "";
            }
            BigDecimal bigDecimalOLrzqt = xmr.OLrzqt((java.lang.Object) apy);
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            textView.setText(pTB.KWHzl(bigDecimalOLrzqt, 2, roundingMode));
            if (Intrinsics.EZpvd((java.lang.Object) AbstractC54084wxg.this.valueOf(), (java.lang.Object) "Watchlist")) {
                android.widget.TextView textView2 = ((AbstractC50775vaX) c43312rms.OLrzqt()).AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(0);
                android.widget.TextView textView3 = ((AbstractC50775vaX) c43312rms.OLrzqt()).AhwBna;
                AbstractC54084wxg abstractC54084wxg3 = AbstractC54084wxg.this;
                java.lang.String notionalUsd = fundingRateArbitrageData.getNotionalUsd();
                if (notionalUsd == null) {
                    notionalUsd = "0";
                }
                textView3.setText(abstractC54084wxg3.copydefault(notionalUsd));
                android.widget.TextView textView4 = ((AbstractC50775vaX) c43312rms.OLrzqt()).valueOf;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(8);
                android.widget.TextView textView5 = ((AbstractC50775vaX) c43312rms.OLrzqt()).valueOf;
                AbstractC54084wxg abstractC54084wxg4 = AbstractC54084wxg.this;
                java.lang.String notionalUsd2 = fundingRateArbitrageData.getNotionalUsd();
                textView5.setText(abstractC54084wxg4.copydefault(notionalUsd2 != null ? notionalUsd2 : "0"));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).valueOf.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.zvzmfz));
            } else {
                android.widget.TextView textView6 = ((AbstractC50775vaX) c43312rms.OLrzqt()).AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView6, "");
                textView6.setVisibility(0);
                android.widget.TextView textView7 = ((AbstractC50775vaX) c43312rms.OLrzqt()).AhwBna;
                java.lang.String fundingRate = fundingRateArbitrageData.getFundingRate();
                if (fundingRate == null) {
                    fundingRate = "";
                }
                textView7.setText(pTB.KWHzl(xmr.OLrzqt((java.lang.Object) fundingRate), 3, roundingMode));
                android.widget.TextView textView8 = ((AbstractC50775vaX) c43312rms.OLrzqt()).valueOf;
                Intrinsics.checkNotNullExpressionValue(textView8, "");
                textView8.setVisibility(8);
                android.widget.TextView textView9 = ((AbstractC50775vaX) c43312rms.OLrzqt()).valueOf;
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.iqeXgQ);
                java.lang.String nextFundingRate = fundingRateArbitrageData.getNextFundingRate();
                textView9.setText(strAYXKKw + " " + pTB.KWHzl(xmr.OLrzqt((java.lang.Object) (nextFundingRate != null ? nextFundingRate : "")), 3, roundingMode));
                if (C33129mqd.AEQbTJ(fundingRateArbitrageData.getNextFundingRate()) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    ((AbstractC50775vaX) c43312rms.OLrzqt()).valueOf.setTextColor(this.djBIcL);
                } else {
                    ((AbstractC50775vaX) c43312rms.OLrzqt()).valueOf.setTextColor(this.EZpvd);
                }
            }
            ((AbstractC50775vaX) c43312rms.OLrzqt()).gEmmrt.setTextColor(this.KWHzl);
            ((AbstractC50775vaX) c43312rms.OLrzqt()).gEmmrt.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.copydefault));
            ((AbstractC50775vaX) c43312rms.OLrzqt()).EZpvd.setTextColor(this.AEQbTJ);
            ((AbstractC50775vaX) c43312rms.OLrzqt()).EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.OLrzqt));
            C54799xVt c54799xVt = C54799xVt.AEQbTJ;
            java.lang.String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(c54799xVt, fundingRateArbitrageData.getSellInstId(), fundingRateArbitrageData.getSellInstType(), false, false, 8, null);
            java.lang.String titleByIdAndType$default2 = C54799xVt.getTitleByIdAndType$default(c54799xVt, fundingRateArbitrageData.getBuyInstId(), fundingRateArbitrageData.getBuyInstType(), false, false, 8, null);
            if (C33129mqd.AEQbTJ(fundingRateArbitrageData.getFundingRate()) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                ((AbstractC50775vaX) c43312rms.OLrzqt()).djBIcL.setText(AbstractC54084wxg.this.EZpvd(titleByIdAndType$default, fundingRateArbitrageData.getSellInstType()));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).KWHzl.setText(AbstractC54084wxg.this.EZpvd(titleByIdAndType$default2, fundingRateArbitrageData.getBuyInstType()));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).gEmmrt.setText(C33070mpX.AYXKKw(C55688xof.Application.getVolumeControl));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).EZpvd.setText(C33070mpX.AYXKKw(C55688xof.Application.getMaxVolume));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).gEmmrt.setTextColor(this.AEQbTJ);
                ((AbstractC50775vaX) c43312rms.OLrzqt()).gEmmrt.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.OLrzqt));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).EZpvd.setTextColor(this.KWHzl);
                ((AbstractC50775vaX) c43312rms.OLrzqt()).EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.copydefault));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).AhwBna.setTextColor(this.djBIcL);
            } else {
                ((AbstractC50775vaX) c43312rms.OLrzqt()).djBIcL.setText(AbstractC54084wxg.this.EZpvd(titleByIdAndType$default2, fundingRateArbitrageData.getBuyInstType()));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).KWHzl.setText(AbstractC54084wxg.this.EZpvd(titleByIdAndType$default, fundingRateArbitrageData.getSellInstType()));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).gEmmrt.setText(C33070mpX.AYXKKw(C55688xof.Application.getMaxVolume));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).EZpvd.setText(C33070mpX.AYXKKw(C55688xof.Application.getVolumeControl));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).gEmmrt.setTextColor(this.KWHzl);
                ((AbstractC50775vaX) c43312rms.OLrzqt()).gEmmrt.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.copydefault));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).EZpvd.setTextColor(this.AEQbTJ);
                ((AbstractC50775vaX) c43312rms.OLrzqt()).EZpvd.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.OLrzqt));
                ((AbstractC50775vaX) c43312rms.OLrzqt()).AhwBna.setTextColor(this.EZpvd);
            }
            ((AbstractC50775vaX) c43312rms.OLrzqt()).gEmmrt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.wxx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    AbstractC54084wxg.TaskDescription.KWHzl(c43312rms);
                }
            });
        }

        public static final void copydefault(AbstractC54084wxg abstractC54084wxg, FundingRateArbitrageData fundingRateArbitrageData, C43312rms c43312rms, android.view.View view) {
            boolean zIsSelected = view.isSelected();
            java.lang.String ctType = fundingRateArbitrageData.getCtType();
            if (ctType == null) {
                ctType = "";
            }
            ArbitrageSetFavoriteBean setFavoriteBean = fundingRateArbitrageData.toSetFavoriteBean(zIsSelected ? 1 : 0, ctType, null);
            android.widget.ImageView imageView = ((AbstractC50775vaX) c43312rms.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            abstractC54084wxg.copydefault(setFavoriteBean, imageView);
        }

        public static final void AEQbTJ(AbstractC54084wxg abstractC54084wxg, FundingRateArbitrageData fundingRateArbitrageData, C43312rms c43312rms, android.view.View view) {
            abstractC54084wxg.AEQbTJ(fundingRateArbitrageData.getSellInstType(), fundingRateArbitrageData.getSellInstId(), fundingRateArbitrageData.getBuyInstType(), fundingRateArbitrageData.getBuyInstId(), ((AbstractC50775vaX) c43312rms.OLrzqt()).OLrzqt.isSelected());
        }

        public static final void KWHzl(C43312rms c43312rms) {
            int iCopydefault = C56548yJl.copydefault(((AbstractC50775vaX) c43312rms.OLrzqt()).gEmmrt.getWidth(), ((AbstractC50775vaX) c43312rms.OLrzqt()).EZpvd.getWidth());
            ((AbstractC50775vaX) c43312rms.OLrzqt()).gEmmrt.setWidth(iCopydefault);
            ((AbstractC50775vaX) c43312rms.OLrzqt()).EZpvd.setWidth(iCopydefault);
        }

        public final void OLrzqt(android.view.View view, boolean z) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = z ? -2 : 0;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: o.wxg$ActionBar */
    public static final class ActionBar extends C43318rmy<SpreadArbitrageData, uRB> {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ int copydefault;
        public final /* synthetic */ int gEmmrt;

        @Override // o.AbstractC43310rmq
        public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, java.lang.Object obj) {
            onBindViewHolder((C43312rms<uRB>) c43312rms, (SpreadArbitrageData) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            super(i7, i8);
            this.gEmmrt = i;
            this.copydefault = i2;
            this.OLrzqt = i3;
            this.AEQbTJ = i4;
            this.EZpvd = i5;
            this.KWHzl = i6;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq, o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C43312rms<uRB> c43312rms, final SpreadArbitrageData spreadArbitrageData) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(spreadArbitrageData, "");
            super.onBindViewHolder((C43312rms) c43312rms, spreadArbitrageData);
            boolean zAEQbTJ = AbstractC54084wxg.this.AEQbTJ(spreadArbitrageData.getBuyInstId(), spreadArbitrageData.getSellInstId());
            pUU.KWHzl("SpreadArbitrageData ---- ", spreadArbitrageData.getBuyInstId() + "-" + spreadArbitrageData.getSellInstId() + " isShow：" + spreadArbitrageData.isShow() + "  isSearchVisible：" + spreadArbitrageData.isSearchVisible() + "  isSelected：" + zAEQbTJ);
            boolean z = false;
            if (!spreadArbitrageData.isShow() && !spreadArbitrageData.isSearchVisible() && !zAEQbTJ) {
                android.view.View view = c43312rms.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                OLrzqt(view, false);
                return;
            }
            android.view.View view2 = c43312rms.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            OLrzqt(view2, true);
            android.widget.ImageView imageView = ((uRB) c43312rms.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            imageView.setVisibility((interfaceC54581xNrOLrzqt == null || !interfaceC54581xNrOLrzqt.sSMYrx() || C55697xoo.OLrzqt.AkhnZx()) ? 8 : 0);
            android.widget.ImageView imageView2 = ((uRB) c43312rms.OLrzqt()).OLrzqt;
            java.util.ArrayList<java.lang.String> arrayListKWHzl = AbstractC54084wxg.this.KWHzl();
            if (arrayListKWHzl != null && CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayListKWHzl), spreadArbitrageData.getArbitrageId())) {
                z = true;
            }
            imageView2.setSelected(z);
            ((uRB) c43312rms.OLrzqt()).OLrzqt.setImageDrawable(((uRB) c43312rms.OLrzqt()).OLrzqt.isSelected() ? AbstractC54084wxg.this.ejfBZ : AbstractC54084wxg.this.fJNWhG);
            android.widget.ImageView imageView3 = ((uRB) c43312rms.OLrzqt()).OLrzqt;
            final AbstractC54084wxg abstractC54084wxg = AbstractC54084wxg.this;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: o.wxt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    AbstractC54084wxg.ActionBar.AEQbTJ(abstractC54084wxg, spreadArbitrageData, c43312rms, view3);
                }
            });
            android.view.View root = ((uRB) c43312rms.OLrzqt()).getRoot();
            final AbstractC54084wxg abstractC54084wxg2 = AbstractC54084wxg.this;
            root.setOnClickListener(new View.OnClickListener() { // from class: o.wxu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    AbstractC54084wxg.ActionBar.OLrzqt(abstractC54084wxg2, spreadArbitrageData, c43312rms, view3);
                }
            });
            android.widget.TextView textView = ((uRB) c43312rms.OLrzqt()).EZpvd;
            xMR xmr = xMR.copydefault;
            java.lang.String apy = spreadArbitrageData.getApy();
            if (apy == null) {
                apy = "";
            }
            BigDecimal bigDecimalOLrzqt = xmr.OLrzqt((java.lang.Object) apy);
            textView.setText(bigDecimalOLrzqt != null ? pTB.KWHzl(bigDecimalOLrzqt, 2, RoundingMode.HALF_UP) : null);
            if (Intrinsics.EZpvd((java.lang.Object) AbstractC54084wxg.this.valueOf(), (java.lang.Object) "Watchlist")) {
                android.widget.TextView textView2 = ((uRB) c43312rms.OLrzqt()).AYXKKw;
                AbstractC54084wxg abstractC54084wxg3 = AbstractC54084wxg.this;
                java.lang.String notionalUsd = spreadArbitrageData.getNotionalUsd();
                if (notionalUsd == null) {
                    notionalUsd = "0";
                }
                textView2.setText(abstractC54084wxg3.copydefault(notionalUsd));
            } else {
                android.widget.TextView textView3 = ((uRB) c43312rms.OLrzqt()).AYXKKw;
                java.lang.String str = C33129mqd.AEQbTJ(spreadArbitrageData.getSpread()) > AudioStats.AUDIO_AMPLITUDE_NONE ? Marker.ANY_NON_NULL_MARKER : "";
                java.lang.String spread = spreadArbitrageData.getSpread();
                textView3.setText(str + pTB.KWHzl(xmr.OLrzqt((java.lang.Object) (spread != null ? spread : "")), 2, RoundingMode.HALF_UP));
                if (C33129mqd.AEQbTJ(spreadArbitrageData.getSpread()) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    ((uRB) c43312rms.OLrzqt()).AYXKKw.setTextColor(this.gEmmrt);
                } else {
                    ((uRB) c43312rms.OLrzqt()).AYXKKw.setTextColor(this.copydefault);
                }
            }
            C54799xVt c54799xVt = C54799xVt.AEQbTJ;
            java.lang.String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(c54799xVt, spreadArbitrageData.getSellInstId(), spreadArbitrageData.getSellInstType(), AbstractC54084wxg.this.KWHzl(spreadArbitrageData.getSellInstType()), false, 8, null);
            java.lang.String titleByIdAndType$default2 = C54799xVt.getTitleByIdAndType$default(c54799xVt, spreadArbitrageData.getBuyInstId(), spreadArbitrageData.getBuyInstType(), AbstractC54084wxg.this.KWHzl(spreadArbitrageData.getBuyInstType()), false, 8, null);
            if (C33129mqd.AEQbTJ(spreadArbitrageData.getSpread()) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                ((uRB) c43312rms.OLrzqt()).valueOf.setText(AbstractC54084wxg.this.EZpvd(titleByIdAndType$default, spreadArbitrageData.getSellInstType()));
                ((uRB) c43312rms.OLrzqt()).copydefault.setText(AbstractC54084wxg.this.EZpvd(titleByIdAndType$default2, spreadArbitrageData.getBuyInstType()));
                ((uRB) c43312rms.OLrzqt()).gEmmrt.setText(C33070mpX.AYXKKw(C55688xof.Application.getVolumeControl));
                ((uRB) c43312rms.OLrzqt()).KWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.getMaxVolume));
                ((uRB) c43312rms.OLrzqt()).gEmmrt.setTextColor(this.OLrzqt);
                ((uRB) c43312rms.OLrzqt()).gEmmrt.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.AEQbTJ));
                ((uRB) c43312rms.OLrzqt()).KWHzl.setTextColor(this.EZpvd);
                ((uRB) c43312rms.OLrzqt()).KWHzl.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.KWHzl));
                ((uRB) c43312rms.OLrzqt()).AYXKKw.setTextColor(this.gEmmrt);
            } else {
                ((uRB) c43312rms.OLrzqt()).valueOf.setText(AbstractC54084wxg.this.EZpvd(titleByIdAndType$default2, spreadArbitrageData.getBuyInstType()));
                ((uRB) c43312rms.OLrzqt()).copydefault.setText(AbstractC54084wxg.this.EZpvd(titleByIdAndType$default, spreadArbitrageData.getSellInstType()));
                ((uRB) c43312rms.OLrzqt()).gEmmrt.setText(C33070mpX.AYXKKw(C55688xof.Application.getMaxVolume));
                ((uRB) c43312rms.OLrzqt()).KWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.getVolumeControl));
                ((uRB) c43312rms.OLrzqt()).gEmmrt.setTextColor(this.EZpvd);
                ((uRB) c43312rms.OLrzqt()).gEmmrt.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.KWHzl));
                ((uRB) c43312rms.OLrzqt()).KWHzl.setTextColor(this.OLrzqt);
                ((uRB) c43312rms.OLrzqt()).KWHzl.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.AEQbTJ));
                ((uRB) c43312rms.OLrzqt()).AYXKKw.setTextColor(this.copydefault);
            }
            ((uRB) c43312rms.OLrzqt()).gEmmrt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.wxw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    AbstractC54084wxg.ActionBar.KWHzl(c43312rms);
                }
            });
            if (C33129mqd.AEQbTJ(spreadArbitrageData.getSpread()) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                ((uRB) c43312rms.OLrzqt()).AYXKKw.setTextColor(this.gEmmrt);
            } else {
                ((uRB) c43312rms.OLrzqt()).AYXKKw.setTextColor(this.copydefault);
            }
            if (Intrinsics.EZpvd((java.lang.Object) AbstractC54084wxg.this.valueOf(), (java.lang.Object) "Watchlist")) {
                ((uRB) c43312rms.OLrzqt()).AYXKKw.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.zvzmfz));
            }
        }

        public static final void AEQbTJ(AbstractC54084wxg abstractC54084wxg, SpreadArbitrageData spreadArbitrageData, C43312rms c43312rms, android.view.View view) {
            boolean zIsSelected = view.isSelected();
            java.lang.String ctType = spreadArbitrageData.getCtType();
            if (ctType == null) {
                ctType = "";
            }
            java.lang.String arbitrageType = spreadArbitrageData.getArbitrageType();
            if (arbitrageType == null) {
                arbitrageType = "";
            }
            ArbitrageSetFavoriteBean setFavoriteBean = spreadArbitrageData.toSetFavoriteBean(zIsSelected ? 1 : 0, ctType, arbitrageType);
            android.widget.ImageView imageView = ((uRB) c43312rms.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            abstractC54084wxg.copydefault(setFavoriteBean, imageView);
        }

        public static final void OLrzqt(AbstractC54084wxg abstractC54084wxg, SpreadArbitrageData spreadArbitrageData, C43312rms c43312rms, android.view.View view) {
            abstractC54084wxg.AEQbTJ(spreadArbitrageData.getSellInstType(), spreadArbitrageData.getSellInstId(), spreadArbitrageData.getBuyInstType(), spreadArbitrageData.getBuyInstId(), ((uRB) c43312rms.OLrzqt()).OLrzqt.isSelected());
        }

        public static final void KWHzl(C43312rms c43312rms) {
            int iCopydefault = C56548yJl.copydefault(((uRB) c43312rms.OLrzqt()).gEmmrt.getWidth(), ((uRB) c43312rms.OLrzqt()).KWHzl.getWidth());
            ((uRB) c43312rms.OLrzqt()).gEmmrt.setWidth(iCopydefault);
            ((uRB) c43312rms.OLrzqt()).KWHzl.setWidth(iCopydefault);
        }

        private final void OLrzqt(android.view.View view, boolean z) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = z ? -2 : 0;
            view.setLayoutParams(layoutParams);
        }
    }

    public final void AkhnZx() {
        xDJ xdj = this.valueOf;
        xdj.KWHzl(new Function1() { // from class: o.wxs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC54084wxg.OLrzqt(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xdj, 0L, 1, null);
    }

    public static final Unit OLrzqt(AbstractC54084wxg abstractC54084wxg, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        abstractC54084wxg.djBIcL = new java.util.ArrayList<>();
        java.util.List<ArbitrageFavoriteBean> list = (java.util.List) responseData.getData();
        if (list != null) {
            for (ArbitrageFavoriteBean arbitrageFavoriteBean : list) {
                java.util.ArrayList<java.lang.String> arrayList = abstractC54084wxg.djBIcL;
                if (arrayList != null) {
                    java.lang.String arbitrageId = arbitrageFavoriteBean.getArbitrageId();
                    if (arbitrageId == null) {
                        arbitrageId = "";
                    }
                    arrayList.add(arbitrageId);
                }
            }
        }
        abstractC54084wxg.isConnected();
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.util.ArrayList<java.lang.Object> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.gEmmrt.clear();
        this.gEmmrt.addAll(arrayList);
        fJNWhG();
    }

    public final void fJNWhG() {
        this.fARcdN.clear();
        this.fARcdN.addAll(this.gEmmrt);
        if (Intrinsics.EZpvd((java.lang.Object) valueOf(), (java.lang.Object) "Watchlist")) {
            int i = StateListAnimator.OLrzqt[this.values.ordinal()];
            if (i == 1) {
                java.util.ArrayList<java.lang.Object> arrayList = this.fARcdN;
                if (arrayList.size() > 1) {
                    C56407yEf.copydefault(arrayList, new FragmentManager());
                }
            } else if (i == 2) {
                java.util.ArrayList<java.lang.Object> arrayList2 = this.fARcdN;
                if (arrayList2.size() > 1) {
                    C56407yEf.copydefault(arrayList2, new LoaderManager());
                }
            }
        } else {
            int i2 = StateListAnimator.OLrzqt[this.values.ordinal()];
            if (i2 == 1) {
                java.util.ArrayList<java.lang.Object> arrayList3 = this.fARcdN;
                if (arrayList3.size() > 1) {
                    C56407yEf.copydefault(arrayList3, new PendingIntent());
                }
            } else if (i2 == 2) {
                java.util.ArrayList<java.lang.Object> arrayList4 = this.fARcdN;
                if (arrayList4.size() > 1) {
                    C56407yEf.copydefault(arrayList4, new Dialog());
                }
            }
        }
        int i3 = StateListAnimator.OLrzqt[this.OLrzqt.ordinal()];
        if (i3 == 1) {
            java.util.ArrayList<java.lang.Object> arrayList5 = this.fARcdN;
            if (arrayList5.size() > 1) {
                C56407yEf.copydefault(arrayList5, new Fragment());
            }
        } else if (i3 == 2) {
            java.util.ArrayList<java.lang.Object> arrayList6 = this.fARcdN;
            if (arrayList6.size() > 1) {
                C56407yEf.copydefault(arrayList6, new SharedElementCallback());
            }
        }
        fIwbmz();
    }

    public final boolean KWHzl(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES") && !xMP.AEQbTJ.AEQbTJ();
    }

    public final void fIwbmz() {
        java.util.ArrayList<java.lang.String> arrayList;
        java.lang.String upperCase;
        java.lang.String upperCase2;
        java.util.ArrayList<java.lang.String> arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.addAll(this.fARcdN);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList3) {
            if (obj instanceof FundingRateArbitrageData) {
                FundingRateArbitrageData fundingRateArbitrageData = (FundingRateArbitrageData) obj;
                fundingRateArbitrageData.setSearchVisible(C33129mqd.OLrzqt((java.lang.CharSequence) this.AuCTel) && KWHzl(fundingRateArbitrageData.getBuyInstId(), fundingRateArbitrageData.getBuyInstType()) && KWHzl(fundingRateArbitrageData.getSellInstId(), fundingRateArbitrageData.getSellInstType()));
                if (!fundingRateArbitrageData.isShow() && (arrayList2 = this.djBIcL) != null) {
                    fundingRateArbitrageData.setShow(CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList2), fundingRateArbitrageData.getArbitrageId()));
                }
            } else if (obj instanceof SpreadArbitrageData) {
                SpreadArbitrageData spreadArbitrageData = (SpreadArbitrageData) obj;
                spreadArbitrageData.setSearchVisible(C33129mqd.OLrzqt((java.lang.CharSequence) this.AuCTel) && KWHzl(spreadArbitrageData.getBuyInstId(), spreadArbitrageData.getBuyInstType()) && KWHzl(spreadArbitrageData.getSellInstId(), spreadArbitrageData.getSellInstType()));
                if (!spreadArbitrageData.isShow() && (arrayList = this.djBIcL) != null) {
                    spreadArbitrageData.setShow(CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList), spreadArbitrageData.getArbitrageId()));
                }
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AuCTel)) {
                if (obj instanceof InterfaceC55813xqy) {
                    C54799xVt c54799xVt = C54799xVt.AEQbTJ;
                    InterfaceC55813xqy interfaceC55813xqy = (InterfaceC55813xqy) obj;
                    java.lang.String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(c54799xVt, interfaceC55813xqy.getArbRightInstId(), interfaceC55813xqy.getArbRightInstType(), KWHzl(interfaceC55813xqy.getArbRightInstType()), false, 8, null);
                    java.lang.String titleByIdAndType$default2 = C54799xVt.getTitleByIdAndType$default(c54799xVt, interfaceC55813xqy.getArbLeftInstId(), interfaceC55813xqy.getArbLeftInstType(), KWHzl(interfaceC55813xqy.getArbLeftInstType()), false, 8, null);
                    java.util.Locale locale = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String upperCase3 = titleByIdAndType$default.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                    java.lang.String str = this.AuCTel;
                    if (str != null) {
                        java.util.Locale locale2 = java.util.Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale2, "");
                        upperCase = str.toUpperCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    } else {
                        upperCase = null;
                    }
                    if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) upperCase3, (java.lang.CharSequence) java.lang.String.valueOf(upperCase), false, 2, (java.lang.Object) null)) {
                        java.util.Locale locale3 = java.util.Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale3, "");
                        java.lang.String upperCase4 = titleByIdAndType$default2.toUpperCase(locale3);
                        Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                        java.lang.String str2 = this.AuCTel;
                        if (str2 != null) {
                            java.util.Locale locale4 = java.util.Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale4, "");
                            upperCase2 = str2.toUpperCase(locale4);
                            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                        } else {
                            upperCase2 = null;
                        }
                        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) upperCase4, (java.lang.CharSequence) java.lang.String.valueOf(upperCase2), false, 2, (java.lang.Object) null)) {
                        }
                    }
                }
            }
            arrayList4.add(obj);
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) AhwBna().EZpvd().getValue())) {
            C49952uyJ.KWHzl(this.fetchVPNInfo, arrayList3, C33070mpX.AYXKKw(C55688xof.Application.dXcUrg), 60);
        } else {
            C49952uyJ.updateDataOrEmpty$default(this.fetchVPNInfo, arrayList3, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 60, null, null, false, 56, null);
        }
        this.fetchVPNInfo.notifyDataSetChanged();
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        if (this.isConnected) {
            C56036xvI c56036xvI = C56036xvI.KWHzl;
            c56036xvI.EZpvd(str == null ? "" : str, str2, gEmmrt(str == null ? "" : str, str2 == null ? "" : str2), OLrzqt(str == null ? "" : str, str2 == null ? "" : str2));
            c56036xvI.KWHzl(str3 == null ? "" : str3, str4, gEmmrt(str3 == null ? "" : str3, str4 == null ? "" : str4), OLrzqt(str3 == null ? "" : str3, str4 == null ? "" : str4));
        }
        if (this.DbNXlk != null) {
            MarketArbCoinInfo marketArbCoinInfo = new MarketArbCoinInfo(str2 == null ? "" : str2, str == null ? "" : str, "sell", str4 == null ? "" : str4, str3 == null ? "" : str3, "buy", z, false, 128, (DefaultConstructorMarker) null);
            Function1<? super MarketArbCoinInfo, Unit> function1 = this.DbNXlk;
            if (function1 != null) {
                function1.invoke(marketArbCoinInfo);
            }
        }
        fARcdN().AYXKKw().postValue("");
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        C54085wxh c54085wxh = parentFragment instanceof C54085wxh ? (C54085wxh) parentFragment : null;
        if (c54085wxh != null) {
            c54085wxh.dismiss();
        }
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP") || str == null || !StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.finit), false, 2, (java.lang.Object) null)) {
            return str;
        }
        return C59449zhJ.replace$default(str, C33070mpX.AYXKKw(C55688xof.Application.finit), " " + C33070mpX.AYXKKw(C55688xof.Application.QVAiDq), false, 4, (java.lang.Object) null);
    }

    public final void copydefault(final ArbitrageSetFavoriteBean arbitrageSetFavoriteBean, final android.widget.ImageView imageView) {
        showLoading();
        xDO xdo = this.fIwbmz;
        xdo.copydefault(arbitrageSetFavoriteBean);
        xdo.KWHzl(new Function1() { // from class: o.wxp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC54084wxg.OLrzqt(this.KWHzl, imageView, arbitrageSetFavoriteBean, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xdo, 0L, 1, null);
    }

    public static final Unit OLrzqt(AbstractC54084wxg abstractC54084wxg, android.widget.ImageView imageView, ArbitrageSetFavoriteBean arbitrageSetFavoriteBean, ResponseData responseData) {
        java.util.ArrayList<java.lang.String> arrayList;
        Intrinsics.checkNotNullParameter(responseData, "");
        abstractC54084wxg.dismissLoading();
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            imageView.setSelected(!imageView.isSelected());
            imageView.setImageDrawable(imageView.isSelected() ? abstractC54084wxg.ejfBZ : abstractC54084wxg.fJNWhG);
            java.lang.Integer operator = arbitrageSetFavoriteBean.getOperator();
            if (operator != null && operator.intValue() == 1) {
                java.util.ArrayList<java.lang.String> arrayList2 = abstractC54084wxg.djBIcL;
                if (arrayList2 != null) {
                    C56532yIw.EZpvd(arrayList2).remove(arbitrageSetFavoriteBean.getArbitrageId());
                }
            } else {
                java.lang.String arbitrageId = arbitrageSetFavoriteBean.getArbitrageId();
                if (arbitrageId != null && (arrayList = abstractC54084wxg.djBIcL) != null) {
                    arrayList.add(arbitrageId);
                }
            }
            abstractC54084wxg.isConnected();
        } else {
            C33134mqi.AEQbTJ(responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return xMR.formatICUCompact$default(xMR.copydefault, str, null, null, null, null, 30, null);
    }

    public final boolean copydefault(java.lang.String str, java.lang.String str2) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            return true;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return interfaceC54581xNrCopydefault.OLrzqt(str, str2);
    }

    public final boolean KWHzl(java.lang.String str, java.lang.String str2) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            return true;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return interfaceC54581xNrCopydefault.AEQbTJ(str, str2);
    }
}
