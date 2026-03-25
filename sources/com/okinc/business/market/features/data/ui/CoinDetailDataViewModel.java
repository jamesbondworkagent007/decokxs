package com.okinc.business.market.features.data.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C21847hOn;
import o.C27633jyq;
import o.C56391yDq;
import o.C56442yFn;
import o.jQE;
import o.jQF;
import o.jQG;
import o.jQN;
import o.kKG;
import o.yCM;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class CoinDetailDataViewModel extends ViewModel {
    public final MutableStateFlow<jQG> AEQbTJ;
    public final StateFlow<jQG> AYXKKw;
    public final StateFlow<jQG> AhwBna;
    public final jQN AkhnZx;
    public final SavedStateHandle DbNXlk;
    public final MutableStateFlow<jQG> EZpvd;
    public final MutableStateFlow<jQG> KWHzl;
    public final MutableStateFlow<Pair<Boolean, Boolean>> OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final StateFlow<jQG> djBIcL;
    public final C27633jyq fetchVPNInfo;
    public final StateFlow<Pair<Boolean, Boolean>> gEmmrt;
    public final kKG isConnected;
    public final jQF valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jQG> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jQG> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jQG> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt(boolean z) {
        return z ? "dex_coin_detail_data_loading_dark.lottie" : "dex_coin_detail_data_loading_light.lottie";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Pair<Boolean, Boolean>> copydefault() {
        return this.gEmmrt;
    }

    @yCM
    public CoinDetailDataViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull jQF jqf, @NotNull jQN jqn, @NotNull C27633jyq c27633jyq, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(jqf, "");
        Intrinsics.checkNotNullParameter(jqn, "");
        Intrinsics.checkNotNullParameter(c27633jyq, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.DbNXlk = savedStateHandle;
        this.valueOf = jqf;
        this.AkhnZx = jqn;
        this.fetchVPNInfo = c27633jyq;
        this.isConnected = kkg;
        this.copydefault = coroutineDispatcher;
        MutableStateFlow<jQG> MutableStateFlow = StateFlowKt.MutableStateFlow(new jQG(new jQE(true, false, false, 6, null), false, null, 6, null));
        this.AEQbTJ = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<jQG> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new jQG(new jQE(true, false, false, 6, null), false, null, 6, null));
        this.KWHzl = MutableStateFlow2;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<jQG> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new jQG(new jQE(true, false, false, 6, null), false, null, 6, null));
        this.EZpvd = MutableStateFlow3;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Pair<Boolean, Boolean>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow4;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow4);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(MutableStateFlow2, MutableStateFlow3, new AnonymousClass1(null)), new AnonymousClass2(null)), ViewModelKt.getViewModelScope(this));
    }

    public final TokenBase valueOf() {
        TokenBase tokenBase = (TokenBase) this.DbNXlk.get("data");
        return tokenBase == null ? new TokenBase(null, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -1, null) : tokenBase;
    }

    public final String OLrzqt() {
        String str = (String) this.DbNXlk.get("key.page_from");
        return str == null ? "unknown" : str;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.data.ui.CoinDetailDataViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<jQG, jQG, Continuation<? super jQG>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(jQG jqg, jQG jqg2, Continuation<? super jQG> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = jqg;
            anonymousClass1.L$1 = jqg2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                jQG jqg = (jQG) this.L$0;
                jQG jqg2 = (jQG) this.L$1;
                boolean z = jqg.copydefault().copydefault() && jqg2.copydefault().copydefault();
                boolean z2 = jqg.copydefault().EZpvd() && jqg2.copydefault().EZpvd();
                boolean z3 = jqg.OLrzqt() && jqg2.OLrzqt();
                if (z) {
                    return new jQG(new jQE(true, false, false, 6, null), false, null, 6, null);
                }
                if (z2) {
                    return new jQG(new jQE(false, false, true, 3, null), false, null, 6, null);
                }
                if (z3) {
                    return new jQG(null, true, null, 5, null);
                }
                return new jQG(null, false, null, 7, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.data.ui.CoinDetailDataViewModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<jQG, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = CoinDetailDataViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jQG jqg, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(jqg, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoinDetailDataViewModel.this.AEQbTJ.setValue((jQG) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ void loadAllData$default(CoinDetailDataViewModel coinDetailDataViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        coinDetailDataViewModel.copydefault(z, z2);
    }

    public final void copydefault(boolean z, boolean z2) {
        EZpvd(z, z2);
        getLiquidityData$default(this, z, z2, null, 4, null);
    }

    public static /* synthetic */ void getHolderData$default(CoinDetailDataViewModel coinDetailDataViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        coinDetailDataViewModel.EZpvd(z, z2);
    }

    public final void EZpvd(boolean z, boolean z2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new CoinDetailDataViewModel$getHolderData$1(this, z2, z, null), 2, null);
    }

    public static /* synthetic */ void getLiquidityData$default(CoinDetailDataViewModel coinDetailDataViewModel, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        coinDetailDataViewModel.KWHzl(z, z2, str);
    }

    public final void KWHzl(boolean z, boolean z2, String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new CoinDetailDataViewModel$getLiquidityData$1(str, this, z2, z, null), 2, null);
    }

    public static /* synthetic */ void trackButtonClick$default(CoinDetailDataViewModel coinDetailDataViewModel, TokenDetailButtonName tokenDetailButtonName, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        coinDetailDataViewModel.EZpvd(tokenDetailButtonName, str, z);
    }

    public final void EZpvd(@NotNull TokenDetailButtonName tokenDetailButtonName, String str, boolean z) {
        Intrinsics.checkNotNullParameter(tokenDetailButtonName, "");
        String strOLrzqt = OLrzqt();
        String chainName = valueOf().getChainName();
        String chainId = valueOf().getChainId();
        C21847hOn.trackDexMarketTokenPageClick$default(valueOf().getTokenContractAddress(), valueOf().getTokenSymbol(), chainId, chainName, CoinDetailTabType.DATA, strOLrzqt, null, null, null, null, null, null, null, null, null, tokenDetailButtonName, str, this.isConnected.OLrzqt(), TokenDetailClickLayer.COMPONENTS, null, null, z, 1605568, null);
    }
}
