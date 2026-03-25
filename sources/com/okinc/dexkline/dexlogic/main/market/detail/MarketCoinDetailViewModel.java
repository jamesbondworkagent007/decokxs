package com.okinc.dexkline.dexlogic.main.market.detail;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.core.util.SPUtils;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.dexlogic.main.market.bean.BubbleMapData;
import com.okinc.dexkline.dexlogic.main.market.bean.EarlyBuyerInfoData;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.bean.SupportSwapData;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.market.common.marketconfig.domain.MarketConfig;
import com.okinc.dexkline.market.data.model.CompactTagData;
import com.okinc.dexkline.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import com.okinc.kline.news.data.vo.KlineFlashItem;
import com.okinc.kline.news.data.vo.KlineFlashVo;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
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
import o.C32254mVe;
import o.C32277mWa;
import o.C34540ndx;
import o.C34541ndy;
import o.C34582nem;
import o.C34587ner;
import o.C34656ngH;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C58156yvv;
import o.InterfaceC32117mQc;
import o.InterfaceC32140mQz;
import o.InterfaceC43033rhe;
import o.InterfaceC56387yDm;
import o.InterfaceC58223yxI;
import o.InterfaceC58227yxM;
import o.mPY;
import o.mUR;
import o.mWA;
import o.mWE;
import o.pDX;
import o.pFS;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketCoinDetailViewModel extends AbstractC33073mpa {
    public final MutableLiveData<InterfaceC32140mQz> AYXKKw;
    public final MutableLiveData<Boolean> AhwBna;
    public final mWE AkhnZx;
    public final LiveData<Boolean> AuCTel;
    public final MutableLiveData<Pair<Boolean, Integer>> AuCTelauCTel;
    public final SavedStateHandle AubY;
    public Integer AwvSrB;
    public final LiveData<String> AxsJAY;
    public MutableLiveData<String> DTwDnp;
    public final CoroutineDispatcher DbNXlk;
    public MutableLiveData<List<TagWrapper>> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableLiveData<Boolean> ORxRYg;
    public final C34587ner QOLQEE;
    public MutableLiveData<Boolean> copydefault;
    public final MutableStateFlow<Boolean> djBIcL;
    public final mWA ejfBZ;
    public boolean fARcdN;
    public MutableLiveData<Pair<Boolean, LatestMarketInfoBean>> fIwbmz;
    public final C34540ndx fJNWhG;
    public final MutableLiveData<Boolean> fetchVPNInfo;
    public final MutableLiveData<Boolean> gEmmrt;
    public final MutableLiveData<Boolean> gHZMYf;
    public MarketConfig getFieldNames;
    public final StateFlow<Boolean> getNewProxyInstance;
    public final C32254mVe hDKMBd;
    public final C32277mWa isConnected;
    public MutableLiveData<Unit> iwGUEr;
    public boolean sSMYrx;
    public final C34541ndy uzCIH;
    public final MutableLiveData<String> valueOf;
    public final MutableLiveData<Pair<Boolean, List<KlineFlashItem>>> values;
    public MutableLiveData<Boolean> wlaJM;
    public final StateFlow<Boolean> zLjUOn;
    public Boolean zsXlph;
    public final InterfaceC56387yDm zuBGHE;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Unit> AYXKKw() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Pair<Boolean, LatestMarketInfoBean>> AhwBna() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AuCTel() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean DbNXlk() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Boolean bool) {
        this.zsXlph = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Pair<Boolean, List<KlineFlashItem>>> KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Integer num) {
        this.AwvSrB = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketConfig djBIcL() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> ejfBZ() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer fARcdN() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> fIwbmz() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> fJNWhG() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> fetchVPNInfo() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<InterfaceC32140mQz> gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> isConnected() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> iwGUEr() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<TagWrapper>> valueOf() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Pair<Boolean, Integer>> values() {
        return this.AuCTelauCTel;
    }

    @yCM
    public MarketCoinDetailViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C32254mVe c32254mVe, @NotNull C34587ner c34587ner, @NotNull mWE mwe, @NotNull C32277mWa c32277mWa, @NotNull C34541ndy c34541ndy, @NotNull C34540ndx c34540ndx, @NotNull mWA mwa, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c32254mVe, "");
        Intrinsics.checkNotNullParameter(c34587ner, "");
        Intrinsics.checkNotNullParameter(mwe, "");
        Intrinsics.checkNotNullParameter(c32277mWa, "");
        Intrinsics.checkNotNullParameter(c34541ndy, "");
        Intrinsics.checkNotNullParameter(c34540ndx, "");
        Intrinsics.checkNotNullParameter(mwa, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AubY = savedStateHandle;
        this.hDKMBd = c32254mVe;
        this.QOLQEE = c34587ner;
        this.AkhnZx = mwe;
        this.isConnected = c32277mWa;
        this.uzCIH = c34541ndy;
        this.fJNWhG = c34540ndx;
        this.ejfBZ = mwa;
        this.DbNXlk = coroutineDispatcher;
        this.getFieldNames = new MarketConfig(null, null, null, null, 15, null);
        this.zuBGHE = C56392yDr.copydefault(new Function0() { // from class: o.mQt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketCoinDetailViewModel.AkhnZx(this.copydefault);
            }
        });
        this.iwGUEr = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.wlaJM = new MutableLiveData<>();
        this.fIwbmz = new MutableLiveData<>();
        this.gHZMYf = new MutableLiveData<>();
        this.AuCTelauCTel = new MutableLiveData<>();
        this.ORxRYg = new MutableLiveData<>();
        this.DTwDnp = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.djBIcL = MutableStateFlow;
        this.zLjUOn = FlowKt.asStateFlow(MutableStateFlow);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.AuCTel = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.valueOf = mutableLiveData2;
        this.AxsJAY = mutableLiveData2;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow2;
        this.getNewProxyInstance = FlowKt.asStateFlow(MutableStateFlow2);
        this.fARcdN = true;
        this.EZpvd = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass3(null), 3, null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final String AkhnZx(MarketCoinDetailViewModel marketCoinDetailViewModel) {
        return C34656ngH.getSourceType$default(marketCoinDetailViewModel.AubY, (String) null, 1, (Object) null);
    }

    /* JADX INFO: renamed from: com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel$1, reason: invalid class name */
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
                C32254mVe c32254mVe = marketCoinDetailViewModel2.hDKMBd;
                this.L$0 = marketCoinDetailViewModel2;
                this.label = 1;
                Object marketConfig$default = C32254mVe.getMarketConfig$default(c32254mVe, false, this, 1, null);
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
            marketCoinDetailViewModel.getFieldNames = (MarketConfig) obj;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel$2, reason: invalid class name */
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
                C34587ner c34587ner = marketCoinDetailViewModel2.QOLQEE;
                this.L$0 = marketCoinDetailViewModel2;
                this.label = 1;
                Object objOLrzqt = c34587ner.OLrzqt(this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                marketCoinDetailViewModel = marketCoinDetailViewModel2;
                obj = objOLrzqt;
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

    /* JADX INFO: renamed from: com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarketCoinDetailViewModel.this.new AnonymousClass3(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C34540ndx c34540ndx = MarketCoinDetailViewModel.this.fJNWhG;
                this.label = 1;
                if (c34540ndx.OLrzqt(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
            }
            return Unit.INSTANCE;
        }
    }

    public final void getFieldNames() {
        this.KWHzl.setValue(Boolean.valueOf(!(this.getNewProxyInstance.getValue() != null ? r1.booleanValue() : false)));
    }

    public final void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.wlaJM.setValue(Boolean.TRUE);
        copydefault(lifecycleOwner, str2, this.QOLQEE.AEQbTJ(), str3, this.QOLQEE.KWHzl(str3));
    }

    private final void copydefault(LifecycleOwner lifecycleOwner, final String str, String str2, final String str3, String str4) {
        InterfaceC32117mQc interfaceC32117mQcKWHzl = mPY.OLrzqt.copydefault("default_trade").KWHzl();
        AbstractC58185ywX<LatestMarketInfoBean> abstractC58185ywXKWHzl = interfaceC32117mQcKWHzl.KWHzl(str, str2, str3, str4);
        AbstractC58185ywX<SupportSwapData> abstractC58185ywXOLrzqt = interfaceC32117mQcKWHzl.OLrzqt(str, str3);
        final Function2 function2 = new Function2() { // from class: o.mQo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MarketCoinDetailViewModel.AEQbTJ((LatestMarketInfoBean) obj, (SupportSwapData) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXKWHzl, abstractC58185ywXOLrzqt, new InterfaceC58223yxI() { // from class: o.mQq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return MarketCoinDetailViewModel.OLrzqt(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXEZpvd, lifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.mQr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketCoinDetailViewModel.EZpvd(this.OLrzqt, str3, str, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mQn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketCoinDetailViewModel.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.mQp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketCoinDetailViewModel.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mQw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketCoinDetailViewModel.copydefault(function12, obj);
            }
        });
    }

    public static final Pair OLrzqt(Function2 function2, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Pair) function2.invoke(obj, obj2);
    }

    public static final Pair AEQbTJ(LatestMarketInfoBean latestMarketInfoBean, SupportSwapData supportSwapData) {
        Intrinsics.checkNotNullParameter(latestMarketInfoBean, "");
        Intrinsics.checkNotNullParameter(supportSwapData, "");
        return C56390yDp.OLrzqt(latestMarketInfoBean, supportSwapData);
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(MarketCoinDetailViewModel marketCoinDetailViewModel, String str, String str2, Pair pair) {
        marketCoinDetailViewModel.wlaJM.setValue(Boolean.FALSE);
        marketCoinDetailViewModel.hDKMBd.AEQbTJ(str, str2, C34582nem.KWHzl(((LatestMarketInfoBean) pair.getFirst()).isSupportHolderExpandData()));
        marketCoinDetailViewModel.copydefault.setValue(Boolean.valueOf(((LatestMarketInfoBean) pair.getFirst()).isCollectState()));
        marketCoinDetailViewModel.fIwbmz.setValue(C56390yDp.OLrzqt(Boolean.TRUE, pair.getFirst()));
        marketCoinDetailViewModel.KWHzl(((LatestMarketInfoBean) pair.getFirst()).getNewTagList());
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(MarketCoinDetailViewModel marketCoinDetailViewModel, Throwable th) {
        MutableLiveData<Boolean> mutableLiveData = marketCoinDetailViewModel.wlaJM;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        MutableLiveData<Pair<Boolean, LatestMarketInfoBean>> mutableLiveData2 = marketCoinDetailViewModel.fIwbmz;
        Intrinsics.copydefault(th, "");
        mutableLiveData2.setValue(C56390yDp.OLrzqt(bool, new LatestMarketInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, String.valueOf(((OKServerException) th).getCode()), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EarlyBuyerInfoData) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (BubbleMapData) null, (String) null, -2097153, 2047, (DefaultConstructorMarker) null)));
        return Unit.INSTANCE;
    }

    public final void KWHzl(InterfaceC32140mQz interfaceC32140mQz) {
        this.AYXKKw.setValue(interfaceC32140mQz);
        this.djBIcL.setValue(Boolean.valueOf(interfaceC32140mQz != null && interfaceC32140mQz.KWHzl() == CoinDetailTabType.FEEDS.ordinal()));
    }

    public final void copydefault() {
        this.djBIcL.setValue(Boolean.FALSE);
    }

    public final void OLrzqt(TokenBase tokenBase) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1(this, tokenBase, null), 3, null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.setValue(str);
    }

    public final void KWHzl(@NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MarketCoinDetailViewModel$formatTagData$1(this, list, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.DbNXlk, null, new MarketCoinDetailViewModel$putSpUtils$1(str, obj, null), 2, null);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull Object obj, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str2, "");
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.DbNXlk, null, new MarketCoinDetailViewModel$putSpUtils$2(str, obj, str2, null), 2, null);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (AEQbTJ(z)) {
            mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.DbNXlk, null, new MarketCoinDetailViewModel$getDexFlashNewsList$1(this, str, str2, str3, null), 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super List<KlineFlashVo>> continuation) throws Throwable {
        MarketCoinDetailViewModel$getDexContentFlashNewsList$1 marketCoinDetailViewModel$getDexContentFlashNewsList$1;
        Object objKWHzl;
        if (continuation instanceof MarketCoinDetailViewModel$getDexContentFlashNewsList$1) {
            marketCoinDetailViewModel$getDexContentFlashNewsList$1 = (MarketCoinDetailViewModel$getDexContentFlashNewsList$1) continuation;
            int i = marketCoinDetailViewModel$getDexContentFlashNewsList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketCoinDetailViewModel$getDexContentFlashNewsList$1.label = i - Integer.MIN_VALUE;
            } else {
                marketCoinDetailViewModel$getDexContentFlashNewsList$1 = new MarketCoinDetailViewModel$getDexContentFlashNewsList$1(this, continuation);
            }
        }
        MarketCoinDetailViewModel$getDexContentFlashNewsList$1 marketCoinDetailViewModel$getDexContentFlashNewsList$12 = marketCoinDetailViewModel$getDexContentFlashNewsList$1;
        Object obj = marketCoinDetailViewModel$getDexContentFlashNewsList$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketCoinDetailViewModel$getDexContentFlashNewsList$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            mWA mwa = this.ejfBZ;
            marketCoinDetailViewModel$getDexContentFlashNewsList$12.label = 1;
            objKWHzl = mwa.KWHzl(str, str2, str3, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : null, (56 & 32) != 0 ? 20 : null, marketCoinDetailViewModel$getDexContentFlashNewsList$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl == null) {
            return new ArrayList((List) objKWHzl);
        }
        pUU.copydefault("MarketCoinDetailViewModel", "getDexContentFlashNewsList error: " + thM7380exceptionOrNullimpl.getMessage());
        return new ArrayList();
    }

    public final boolean AEQbTJ(boolean z) {
        return pFS.KWHzl.EZpvd() && SPUtils.getBoolean("kline_flash_news_on", true) && pDX.AEQbTJ.OLrzqt() && ((InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class)).copydefault().AEQbTJ() && z;
    }
}
