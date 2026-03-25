package com.okinc.business.dexlogic.main.market.detail;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C22398hec;
import o.C29447ktn;
import o.C56391yDq;
import o.C56442yFn;
import o.kKG;

/* JADX INFO: loaded from: classes18.dex */
public final class MarketCoinSharedViewModel$share$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LatestMarketInfoBean $latestMarketInfo;
    final /* synthetic */ TokenBase $token;
    int label;
    final /* synthetic */ MarketCoinSharedViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCoinSharedViewModel$share$1(MarketCoinSharedViewModel marketCoinSharedViewModel, TokenBase tokenBase, LatestMarketInfoBean latestMarketInfoBean, Continuation<? super MarketCoinSharedViewModel$share$1> continuation) {
        super(2, continuation);
        this.this$0 = marketCoinSharedViewModel;
        this.$token = tokenBase;
        this.$latestMarketInfo = latestMarketInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketCoinSharedViewModel$share$1(this.this$0, this.$token, this.$latestMarketInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketCoinSharedViewModel$share$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MainCoroutineDispatcher main;
        AnonymousClass1 anonymousClass1;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kKG kkg = this.this$0.copydefault;
            this.label = 1;
            obj = kkg.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                main = Dispatchers.getMain();
                anonymousClass1 = new AnonymousClass1(this.this$0, (C22398hec) obj, null);
                this.label = 3;
                if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str = (String) obj;
        C29447ktn c29447ktn = this.this$0.EZpvd;
        String chainId = this.$token.getChainId();
        String tokenContractAddress = this.$token.getTokenContractAddress();
        LatestMarketInfoBean latestMarketInfoBean = this.$latestMarketInfo;
        String strRealTokenContractAddress = latestMarketInfoBean != null ? latestMarketInfoBean.realTokenContractAddress() : null;
        this.label = 2;
        obj = c29447ktn.OLrzqt(chainId, tokenContractAddress, str, strRealTokenContractAddress, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        main = Dispatchers.getMain();
        anonymousClass1 = new AnonymousClass1(this.this$0, (C22398hec) obj, null);
        this.label = 3;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.dexlogic.main.market.detail.MarketCoinSharedViewModel$share$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C22398hec $sharePayload;
        int label;
        final /* synthetic */ MarketCoinSharedViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MarketCoinSharedViewModel marketCoinSharedViewModel, C22398hec c22398hec, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = marketCoinSharedViewModel;
            this.$sharePayload = c22398hec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$sharePayload, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
                C22398hec c22398hec = this.$sharePayload;
                this.label = 1;
                if (mutableSharedFlow.emit(c22398hec, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
