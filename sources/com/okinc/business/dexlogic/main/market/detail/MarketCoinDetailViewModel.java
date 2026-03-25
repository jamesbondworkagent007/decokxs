package com.okinc.business.dexlogic.main.market.detail;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.DexFeature;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.main.market.bean.BubbleMapData;
import com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean;
import com.okinc.business.dexlogic.main.market.bean.EarlyBuyerInfoData;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.bean.SupportSwapData;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.market.common.marketconfig.domain.BannerConfig;
import com.okinc.business.market.common.marketconfig.domain.MarketConfig;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.holders.domain.model.BubbleMap;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C22380heK;
import o.C22416heu;
import o.C25389ivm;
import o.C25624jAh;
import o.C25798jGt;
import o.C26109jSg;
import o.C26286jYv;
import o.C27633jyq;
import o.C27722kAy;
import o.C27767kCp;
import o.C27770kCs;
import o.C28264kUz;
import o.C29712kyn;
import o.C31200lpY;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C58156yvv;
import o.InterfaceC22533hhE;
import o.InterfaceC22618hik;
import o.InterfaceC28415kaO;
import o.InterfaceC56387yDm;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import o.InterfaceC9738bbJ;
import o.jNN;
import o.jYD;
import o.kKG;
import o.kVR;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketCoinDetailViewModel extends AbstractC33073mpa {
    public final MutableLiveData<String> AEQbTJ;
    public final MutableLiveData<Boolean> AYXKKw;
    public final MutableStateFlow<Boolean> AhwBna;
    public final CoroutineDispatcher AkhnZx;
    public TradingType AuCTel;
    public MutableLiveData<Unit> AuCTelauCTel;
    public final MutableLiveData<Pair<Boolean, Integer>> AubY;
    public MutableLiveData<Boolean> AwvSrB;
    public final InterfaceC56387yDm AxsJAY;
    public final LiveData<String> DTwDnp;
    public final C25798jGt DbNXlk;
    public final MutableLiveData<MarketDetailActionButton> EZpvd;
    public MutableLiveData<List<TagWrapper>> KWHzl;
    public MutableLiveData<Boolean> OLrzqt;
    public final MutableLiveData<Boolean> ORxRYg;
    public final C28264kUz OcIXYQ;
    public final MutableLiveData<Boolean> QKVWgx;
    public Integer QOLQEE;
    public MutableLiveData<String> QUSxYX;
    public final C27770kCs QVAiDq;
    public final kKG RJOkX;
    public final MutableLiveData<Boolean> copydefault;
    public final MutableLiveData<String> djBIcL;
    public final LiveData<Boolean> ejfBZ;
    public final C26109jSg fARcdN;
    public final jYD fIwbmz;
    public boolean fJNWhG;
    public final C27767kCp fetchVPNInfo;
    public final MutableLiveData<Boolean> gEmmrt;
    public final MutableLiveData<Boolean> gHZMYf;
    public MutableLiveData<Pair<Boolean, LatestMarketInfoBean>> getFieldNames;
    public MarketConfig getNewProxyInstance;
    public final C29712kyn hDKMBd;
    public final jNN isConnected;
    public final C27633jyq iwGUEr;
    public boolean sSMYrx;
    public final C25624jAh uzCIH;
    public final MutableLiveData<InterfaceC22618hik> valueOf;
    public final MutableLiveData<Boolean> values;
    public final StateFlow<Boolean> wlaJM;
    public final kVR zLjUOn;
    public final SavedStateHandle zsXlph;
    public Boolean zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final SupportSwapData OLrzqt(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingType AYXKKw() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<InterfaceC22618hik> AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AubY() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> DbNXlk() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Boolean bool) {
        this.zuBGHE = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Integer num) {
        this.QOLQEE = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<MarketDetailActionButton> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<TagWrapper>> djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> ejfBZ() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean fARcdN() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> fIwbmz() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> fJNWhG() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketConfig fetchVPNInfo() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> getFieldNames() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> hDKMBd() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Pair<Boolean, Integer>> isConnected() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> iwGUEr() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer uzCIH() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Pair<Boolean, LatestMarketInfoBean>> valueOf() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Unit> values() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean wlaJM() {
        return this.fJNWhG;
    }

    @yCM
    public MarketCoinDetailViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C27633jyq c27633jyq, @NotNull C26109jSg c26109jSg, @NotNull C27770kCs c27770kCs, @NotNull kKG kkg, @NotNull jNN jnn, @NotNull C25798jGt c25798jGt, @NotNull C25624jAh c25624jAh, @NotNull jYD jyd, @NotNull C28264kUz c28264kUz, @NotNull C27767kCp c27767kCp, @NotNull C29712kyn c29712kyn, @NotNull kVR kvr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c27633jyq, "");
        Intrinsics.checkNotNullParameter(c26109jSg, "");
        Intrinsics.checkNotNullParameter(c27770kCs, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(jnn, "");
        Intrinsics.checkNotNullParameter(c25798jGt, "");
        Intrinsics.checkNotNullParameter(c25624jAh, "");
        Intrinsics.checkNotNullParameter(jyd, "");
        Intrinsics.checkNotNullParameter(c28264kUz, "");
        Intrinsics.checkNotNullParameter(c27767kCp, "");
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        Intrinsics.checkNotNullParameter(kvr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.zsXlph = savedStateHandle;
        this.iwGUEr = c27633jyq;
        this.fARcdN = c26109jSg;
        this.QVAiDq = c27770kCs;
        this.RJOkX = kkg;
        this.isConnected = jnn;
        this.DbNXlk = c25798jGt;
        this.uzCIH = c25624jAh;
        this.fIwbmz = jyd;
        this.OcIXYQ = c28264kUz;
        this.fetchVPNInfo = c27767kCp;
        this.hDKMBd = c29712kyn;
        this.zLjUOn = kvr;
        this.AkhnZx = coroutineDispatcher;
        this.getNewProxyInstance = new MarketConfig(null, null, null, null, 15, null);
        this.AxsJAY = C56392yDr.copydefault(new Function0() { // from class: o.hhW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketCoinDetailViewModel.fJNWhG(this.KWHzl);
            }
        });
        this.AuCTelauCTel = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.AwvSrB = new MutableLiveData<>();
        this.getFieldNames = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.ORxRYg = new MutableLiveData<>();
        this.AubY = new MutableLiveData<>();
        this.QKVWgx = new MutableLiveData<>();
        this.QUSxYX = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.ejfBZ = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.djBIcL = mutableLiveData2;
        this.DTwDnp = mutableLiveData2;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AhwBna = MutableStateFlow;
        this.wlaJM = FlowKt.asStateFlow(MutableStateFlow);
        this.AuCTel = TradingType.Swap;
        this.gHZMYf = new MutableLiveData<>(null);
        this.KWHzl = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    public final String AuCTel() {
        return (String) this.AxsJAY.getValue();
    }

    public static final String fJNWhG(MarketCoinDetailViewModel marketCoinDetailViewModel) {
        return C31200lpY.getSourceType$default(marketCoinDetailViewModel.zsXlph, (String) null, 1, (Object) null);
    }

    /* JADX INFO: renamed from: com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarketCoinDetailViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            MarketCoinDetailViewModel marketCoinDetailViewModel;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MarketCoinDetailViewModel marketCoinDetailViewModel2 = MarketCoinDetailViewModel.this;
                C27633jyq c27633jyq = marketCoinDetailViewModel2.iwGUEr;
                this.L$0 = marketCoinDetailViewModel2;
                this.label = 1;
                Object marketConfig$default = C27633jyq.getMarketConfig$default(c27633jyq, false, this, 1, null);
                if (marketConfig$default == objCopydefault) {
                    return objCopydefault;
                }
                marketCoinDetailViewModel = marketCoinDetailViewModel2;
                obj = marketConfig$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                marketCoinDetailViewModel = (MarketCoinDetailViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            marketCoinDetailViewModel.getNewProxyInstance = (MarketConfig) obj;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarketCoinDetailViewModel.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            MarketCoinDetailViewModel marketCoinDetailViewModel;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MarketCoinDetailViewModel marketCoinDetailViewModel2 = MarketCoinDetailViewModel.this;
                kKG kkg = marketCoinDetailViewModel2.RJOkX;
                this.L$0 = marketCoinDetailViewModel2;
                this.label = 1;
                Object objAYXKKw = kkg.AYXKKw(this);
                if (objAYXKKw == objCopydefault) {
                    return objCopydefault;
                }
                marketCoinDetailViewModel = marketCoinDetailViewModel2;
                obj = objAYXKKw;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                marketCoinDetailViewModel = (MarketCoinDetailViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            marketCoinDetailViewModel.sSMYrx = ((Boolean) obj).booleanValue();
            return Unit.INSTANCE;
        }
    }

    public final void AEQbTJ(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketCoinDetailViewModel$getEarnTabVisibility$1(this, str, str2, null), 3, null);
    }

    public final void AwvSrB() {
        this.AhwBna.setValue(Boolean.valueOf(!(this.wlaJM.getValue() != null ? r1.booleanValue() : false)));
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AkhnZx, null, new MarketCoinDetailViewModel$subscribeHolderAmount$1(this, str, str2, null), 2, null);
    }

    public final void sSMYrx() {
        this.fIwbmz.KWHzl();
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        sSMYrx();
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull Function1<? super CoinDetailTradeJumpBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        copydefault(str, str2, function1);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull Function1<? super CoinDetailTradeJumpBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketCoinDetailViewModel$goSwapCheck$1(this, str, str2, function1, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull FavoriteAction favoriteAction, @NotNull List<HomeToken> list, @NotNull List<Integer> list2, @NotNull List<Integer> list3, @NotNull Continuation<? super Result<? extends InterfaceC28415kaO>> continuation) throws Throwable {
        MarketCoinDetailViewModel$updateFavoriteStatus$1 marketCoinDetailViewModel$updateFavoriteStatus$1;
        if (continuation instanceof MarketCoinDetailViewModel$updateFavoriteStatus$1) {
            marketCoinDetailViewModel$updateFavoriteStatus$1 = (MarketCoinDetailViewModel$updateFavoriteStatus$1) continuation;
            int i = marketCoinDetailViewModel$updateFavoriteStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketCoinDetailViewModel$updateFavoriteStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                marketCoinDetailViewModel$updateFavoriteStatus$1 = new MarketCoinDetailViewModel$updateFavoriteStatus$1(this, continuation);
            }
        }
        MarketCoinDetailViewModel$updateFavoriteStatus$1 marketCoinDetailViewModel$updateFavoriteStatus$12 = marketCoinDetailViewModel$updateFavoriteStatus$1;
        Object obj = marketCoinDetailViewModel$updateFavoriteStatus$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketCoinDetailViewModel$updateFavoriteStatus$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C27770kCs c27770kCs = this.QVAiDq;
        marketCoinDetailViewModel$updateFavoriteStatus$12.label = 1;
        Object objEZpvd = c27770kCs.EZpvd(favoriteAction, list, list2, list3, marketCoinDetailViewModel$updateFavoriteStatus$12);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: updateFavoriteStatus-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m6503updateFavoriteStatusyxL6bBk$default(MarketCoinDetailViewModel marketCoinDetailViewModel, FavoriteAction favoriteAction, List list, List list2, List list3, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            list3 = yDY.AhwBna();
        }
        return marketCoinDetailViewModel.OLrzqt(favoriteAction, (List<HomeToken>) list, (List<Integer>) list4, (List<Integer>) list3, (Continuation<? super Result<? extends InterfaceC28415kaO>>) continuation);
    }

    public final void EZpvd(@NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketCoinDetailViewModel$signalFavoriteListChange$1(this, tokenBase, null), 3, null);
    }

    public final void copydefault(@NotNull final LifecycleOwner lifecycleOwner, @NotNull String str, @NotNull final String str2, @NotNull final String str3) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AwvSrB.setValue(Boolean.TRUE);
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C22380heK.OLrzqt.copydefault(str).fARcdN().OLrzqt(), lifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.hia
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketCoinDetailViewModel.OLrzqt(this.KWHzl, lifecycleOwner, str2, str3, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hib
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketCoinDetailViewModel.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketCoinDetailViewModel.KWHzl(this.AEQbTJ, lifecycleOwner, str2, str3, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hid
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketCoinDetailViewModel.gEmmrt(function12, obj);
            }
        });
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(MarketCoinDetailViewModel marketCoinDetailViewModel, LifecycleOwner lifecycleOwner, String str, String str2, InterfaceC9738bbJ interfaceC9738bbJ) {
        marketCoinDetailViewModel.KWHzl(lifecycleOwner, str, interfaceC9738bbJ.DbNXlk(), str2, marketCoinDetailViewModel.RJOkX.copydefault());
        marketCoinDetailViewModel.KWHzl(str2, str);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(MarketCoinDetailViewModel marketCoinDetailViewModel, LifecycleOwner lifecycleOwner, String str, String str2, Throwable th) {
        marketCoinDetailViewModel.KWHzl(lifecycleOwner, str, "", str2, (String) null);
        marketCoinDetailViewModel.KWHzl(str2, str);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final LifecycleOwner lifecycleOwner, final String str, String str2, final String str3, String str4) {
        final InterfaceC22533hhE interfaceC22533hhEIsConnected = C22380heK.OLrzqt.copydefault("default_trade").isConnected();
        AbstractC58185ywX<LatestMarketInfoBean> abstractC58185ywXOLrzqt = interfaceC22533hhEIsConnected.OLrzqt(str, str2, str3, str4);
        final AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(new Callable() { // from class: o.hhR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return MarketCoinDetailViewModel.KWHzl(interfaceC22533hhEIsConnected, str, str3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXOLrzqt, lifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.hhS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketCoinDetailViewModel.EZpvd(this.KWHzl, str3, str, abstractC58185ywXEZpvd, lifecycleOwner, (LatestMarketInfoBean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hhZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketCoinDetailViewModel.DbNXlk(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hhY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketCoinDetailViewModel.KWHzl(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hhX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketCoinDetailViewModel.values(function12, obj);
            }
        });
    }

    public static final InterfaceC60096zvd KWHzl(InterfaceC22533hhE interfaceC22533hhE, String str, String str2) {
        AbstractC58185ywX<SupportSwapData> abstractC58185ywXKWHzl = interfaceC22533hhE.KWHzl(str, str2);
        final Function1 function1 = new Function1() { // from class: o.hhP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketCoinDetailViewModel.OLrzqt((java.lang.Throwable) obj);
            }
        };
        return abstractC58185ywXKWHzl.djBIcL(new InterfaceC58229yxO() { // from class: o.hhT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return MarketCoinDetailViewModel.valueOf(function1, obj);
            }
        });
    }

    public static final SupportSwapData valueOf(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SupportSwapData) function1.invoke(obj);
    }

    public static final void DbNXlk(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final MarketCoinDetailViewModel marketCoinDetailViewModel, String str, String str2, AbstractC58185ywX abstractC58185ywX, LifecycleOwner lifecycleOwner, final LatestMarketInfoBean latestMarketInfoBean) {
        marketCoinDetailViewModel.AwvSrB.setValue(Boolean.FALSE);
        marketCoinDetailViewModel.iwGUEr.AEQbTJ(str, str2, C27722kAy.OLrzqt(latestMarketInfoBean.isSupportHolderExpandData()));
        marketCoinDetailViewModel.OLrzqt.setValue(Boolean.valueOf(latestMarketInfoBean.isCollectState()));
        marketCoinDetailViewModel.getFieldNames.setValue(C56390yDp.OLrzqt(Boolean.TRUE, latestMarketInfoBean));
        marketCoinDetailViewModel.copydefault(latestMarketInfoBean.getNewTagList());
        marketCoinDetailViewModel.AEQbTJ.setValue(latestMarketInfoBean.getHolders());
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywX, lifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.hie
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketCoinDetailViewModel.copydefault(this.KWHzl, latestMarketInfoBean, (SupportSwapData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketCoinDetailViewModel.fetchVPNInfo(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hhV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketCoinDetailViewModel.copydefault(this.OLrzqt, latestMarketInfoBean, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hhU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketCoinDetailViewModel.isConnected(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(MarketCoinDetailViewModel marketCoinDetailViewModel, LatestMarketInfoBean latestMarketInfoBean, SupportSwapData supportSwapData) {
        Intrinsics.copydefault(latestMarketInfoBean);
        marketCoinDetailViewModel.EZpvd(supportSwapData, latestMarketInfoBean);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MarketCoinDetailViewModel marketCoinDetailViewModel, LatestMarketInfoBean latestMarketInfoBean, Throwable th) {
        Intrinsics.copydefault(latestMarketInfoBean);
        marketCoinDetailViewModel.EZpvd((SupportSwapData) null, latestMarketInfoBean);
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void values(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(MarketCoinDetailViewModel marketCoinDetailViewModel, Throwable th) {
        MutableLiveData<Boolean> mutableLiveData = marketCoinDetailViewModel.AwvSrB;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        MutableLiveData<Pair<Boolean, LatestMarketInfoBean>> mutableLiveData2 = marketCoinDetailViewModel.getFieldNames;
        Intrinsics.copydefault(th, "");
        mutableLiveData2.setValue(C56390yDp.OLrzqt(bool, new LatestMarketInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, String.valueOf(((OKServerException) th).getCode()), (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EarlyBuyerInfoData) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (BubbleMapData) null, (String) null, (String) null, (String) null, -524289, 2047, (DefaultConstructorMarker) null)));
        marketCoinDetailViewModel.EZpvd.setValue(MarketDetailActionButton.None);
        return Unit.INSTANCE;
    }

    public final void EZpvd(SupportSwapData supportSwapData, LatestMarketInfoBean latestMarketInfoBean) {
        MarketDetailActionButton marketDetailActionButton;
        MarketDetailActionButton marketDetailActionButton2;
        if (supportSwapData == null) {
            MutableLiveData<MarketDetailActionButton> mutableLiveData = this.EZpvd;
            if (!latestMarketInfoBean.getDappList().isEmpty()) {
                marketDetailActionButton2 = MarketDetailActionButton.OnlyDAppRedirect;
            } else {
                marketDetailActionButton2 = MarketDetailActionButton.None;
            }
            mutableLiveData.setValue(marketDetailActionButton2);
            return;
        }
        boolean zIsSupportSwapOrder = supportSwapData.isSupportSwapOrder();
        boolean zIsSupportLimitOrder = supportSwapData.isSupportLimitOrder();
        boolean zIsSupportDAppRedirect = supportSwapData.isSupportDAppRedirect(latestMarketInfoBean.getDappList());
        boolean zIsSupportMemeModeOrder = supportSwapData.isSupportMemeModeOrder();
        boolean zIsSupportCefiModeOrder = supportSwapData.isSupportCefiModeOrder();
        boolean zCopydefault = C22416heu.copydefault(DexFeature.TRADE);
        if (!zIsSupportSwapOrder && !zIsSupportLimitOrder && !zIsSupportDAppRedirect) {
            marketDetailActionButton = MarketDetailActionButton.None;
        } else if (zCopydefault && (!latestMarketInfoBean.getDappList().isEmpty())) {
            marketDetailActionButton = MarketDetailActionButton.OnlyDAppRedirect;
        } else if (zIsSupportSwapOrder && zIsSupportMemeModeOrder && zIsSupportCefiModeOrder) {
            marketDetailActionButton = MarketDetailActionButton.SwapAdvancedMeme;
        } else if (zIsSupportSwapOrder && zIsSupportCefiModeOrder) {
            marketDetailActionButton = MarketDetailActionButton.SwapAdvanced;
        } else if (zIsSupportSwapOrder && zIsSupportMemeModeOrder) {
            marketDetailActionButton = MarketDetailActionButton.SwapAndMeme;
        } else if (zIsSupportSwapOrder || zIsSupportLimitOrder) {
            marketDetailActionButton = MarketDetailActionButton.OnlySwap;
        } else if (zIsSupportMemeModeOrder) {
            marketDetailActionButton = MarketDetailActionButton.OnlyMeme;
        } else {
            marketDetailActionButton = MarketDetailActionButton.OnlyDAppRedirect;
        }
        this.EZpvd.setValue(marketDetailActionButton);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketCoinDetailViewModel$closeBanner$1(this, str, null), 3, null);
    }

    public final void KWHzl(InterfaceC22618hik interfaceC22618hik) {
        this.valueOf.setValue(interfaceC22618hik);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1(this, str, str2, str3, null), 3, null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$2(this, str, str2, null), 3, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.setValue(str);
    }

    public final void zsXlph() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AkhnZx, null, new MarketCoinDetailViewModel$initTradingType$1(this, null), 2, null);
    }

    public final boolean AuCTelauCTel() {
        return CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends MarketDetailActionButton>) ((Iterable<? extends Object>) yDY.gEmmrt(MarketDetailActionButton.SwapAndMeme, MarketDetailActionButton.SwapAdvancedMeme, MarketDetailActionButton.DAppRedDirectAndMeme, MarketDetailActionButton.OnlyMeme)), this.EZpvd.getValue()) && C22416heu.iwGUEr();
    }

    public final void copydefault(@NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketCoinDetailViewModel$formatTagData$1(this, list, null), 3, null);
    }

    public final BubbleMap AEQbTJ() {
        LatestMarketInfoBean second;
        BubbleMapData bubbleMapInfo;
        Pair<Boolean, LatestMarketInfoBean> value = this.getFieldNames.getValue();
        if (value == null || (second = value.getSecond()) == null || (bubbleMapInfo = second.getBubbleMapInfo()) == null) {
            return null;
        }
        return C26286jYv.KWHzl(bubbleMapInfo);
    }

    public final void copydefault(@NotNull String str, @NotNull Object obj, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AkhnZx, null, new MarketCoinDetailViewModel$putSpUtils$2(str, obj, str2, null), 2, null);
    }

    public final Object copydefault(@NotNull Continuation<? super String> continuation) {
        return this.RJOkX.AEQbTJ(continuation);
    }

    public final String getNewProxyInstance() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.RJOkX.valueOf();
        if (interfaceC9738bbJValueOf != null) {
            return interfaceC9738bbJValueOf.DbNXlk();
        }
        return null;
    }

    public final BannerConfig copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.iwGUEr.KWHzl(this.getNewProxyInstance, str, str2);
    }

    public final void KWHzl(@NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        this.zLjUOn.copydefault(AuCTel(), tokenBase);
    }

    public final void zLjUOn() {
        this.zLjUOn.EZpvd();
    }
}
