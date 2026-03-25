package com.okinc.dexkline.market.features.data.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o.C32254mVe;
import o.C56391yDq;
import o.C56442yFn;
import o.mXJ;
import o.mXK;
import o.mXQ;
import o.mXR;
import o.yCM;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CoinDetailDataViewModel extends ViewModel {
    public final MutableStateFlow<mXJ> AEQbTJ;
    public final mXQ AYXKKw;
    public final StateFlow<Pair<Boolean, Boolean>> AhwBna;
    public final MutableStateFlow<mXJ> EZpvd;
    public final MutableStateFlow<Pair<Boolean, Boolean>> KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final MutableStateFlow<mXJ> copydefault;
    public final StateFlow<mXJ> djBIcL;
    public final SavedStateHandle fetchVPNInfo;
    public final StateFlow<mXJ> gEmmrt;
    public final C32254mVe isConnected;
    public final StateFlow<mXJ> valueOf;
    public final mXR values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Pair<Boolean, Boolean>> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<mXJ> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl(boolean z) {
        return z ? "dex_coin_detail_data_loading_dark.lottie" : "dex_coin_detail_data_loading_light.lottie";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<mXJ> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<mXJ> OLrzqt() {
        return this.djBIcL;
    }

    @yCM
    public CoinDetailDataViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull mXQ mxq, @NotNull mXR mxr, @NotNull C32254mVe c32254mVe, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(mxq, "");
        Intrinsics.checkNotNullParameter(mxr, "");
        Intrinsics.checkNotNullParameter(c32254mVe, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.fetchVPNInfo = savedStateHandle;
        this.AYXKKw = mxq;
        this.values = mxr;
        this.isConnected = c32254mVe;
        this.OLrzqt = coroutineDispatcher;
        MutableStateFlow<mXJ> MutableStateFlow = StateFlowKt.MutableStateFlow(new mXJ(new mXK(true, false, false, 6, null), false, null, 6, null));
        this.EZpvd = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<mXJ> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new mXJ(new mXK(true, false, false, 6, null), false, null, 6, null));
        this.AEQbTJ = MutableStateFlow2;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<mXJ> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new mXJ(new mXK(true, false, false, 6, null), false, null, 6, null));
        this.copydefault = MutableStateFlow3;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Pair<Boolean, Boolean>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow4;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow4);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(MutableStateFlow2, MutableStateFlow3, new AnonymousClass1(null)), new AnonymousClass2(null)), ViewModelKt.getViewModelScope(this));
    }

    public final TokenBase copydefault() {
        TokenBase tokenBase = (TokenBase) this.fetchVPNInfo.get("data");
        return tokenBase == null ? new TokenBase((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null) : tokenBase;
    }

    /* JADX INFO: renamed from: com.okinc.dexkline.market.features.data.ui.CoinDetailDataViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<mXJ, mXJ, Continuation<? super mXJ>, Object> {
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
        public final Object invoke(mXJ mxj, mXJ mxj2, Continuation<? super mXJ> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = mxj;
            anonymousClass1.L$1 = mxj2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                mXJ mxj = (mXJ) this.L$0;
                mXJ mxj2 = (mXJ) this.L$1;
                boolean z = mxj.OLrzqt().KWHzl() && mxj2.OLrzqt().KWHzl();
                boolean z2 = mxj.OLrzqt().copydefault() && mxj2.OLrzqt().copydefault();
                boolean z3 = mxj.KWHzl() && mxj2.KWHzl();
                if (z) {
                    return new mXJ(new mXK(true, false, false, 6, null), false, null, 6, null);
                }
                if (z2) {
                    return new mXJ(new mXK(false, false, true, 3, null), false, null, 6, null);
                }
                if (z3) {
                    return new mXJ(null, true, null, 5, null);
                }
                return new mXJ(null, false, null, 7, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.dexkline.market.features.data.ui.CoinDetailDataViewModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<mXJ, Continuation<? super Unit>, Object> {
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
        public final Object invoke(mXJ mxj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mxj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoinDetailDataViewModel.this.EZpvd.setValue((mXJ) this.L$0);
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
        OLrzqt(z, z2);
        EZpvd(z, z2);
    }

    public static /* synthetic */ void getHolderData$default(CoinDetailDataViewModel coinDetailDataViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        coinDetailDataViewModel.OLrzqt(z, z2);
    }

    public final void OLrzqt(boolean z, boolean z2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new CoinDetailDataViewModel$getHolderData$1(this, z2, z, null), 2, null);
    }

    public static /* synthetic */ void getLiquidityData$default(CoinDetailDataViewModel coinDetailDataViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        coinDetailDataViewModel.EZpvd(z, z2);
    }

    public final void EZpvd(boolean z, boolean z2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new CoinDetailDataViewModel$getLiquidityData$1(this, z2, z, null), 2, null);
    }
}
