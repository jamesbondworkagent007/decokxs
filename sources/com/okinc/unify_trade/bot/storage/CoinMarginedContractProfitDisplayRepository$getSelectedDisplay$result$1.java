package com.okinc.unify_trade.bot.storage;

import com.okinc.unify_trade.bot.mapper.CoinMarginedCcyDisplay;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C55991xuQ;
import o.C55993xuS;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC55986xuL;

/* JADX INFO: loaded from: classes12.dex */
public final class CoinMarginedContractProfitDisplayRepository$getSelectedDisplay$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CoinMarginedCcyDisplay>, Object> {
    final /* synthetic */ String $algoId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinMarginedContractProfitDisplayRepository$getSelectedDisplay$result$1(String str, Continuation<? super CoinMarginedContractProfitDisplayRepository$getSelectedDisplay$result$1> continuation) {
        super(2, continuation);
        this.$algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinMarginedContractProfitDisplayRepository$getSelectedDisplay$result$1(this.$algoId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CoinMarginedCcyDisplay> continuation) {
        return ((CoinMarginedContractProfitDisplayRepository$getSelectedDisplay$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.unify_trade.bot.storage.CoinMarginedContractProfitDisplayRepository$getSelectedDisplay$result$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CoinMarginedCcyDisplay>, Object> {
        final /* synthetic */ String $algoId;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$algoId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$algoId, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CoinMarginedCcyDisplay> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoinMarginedCcyDisplay coinMarginedCcyDisplayAEQbTJ;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC55986xuL interfaceC55986xuLEZpvd = C55991xuQ.KWHzl.EZpvd();
                String str = this.$algoId;
                this.label = 1;
                obj = interfaceC55986xuLEZpvd.EZpvd(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            C55993xuS c55993xuS = (C55993xuS) obj;
            return (c55993xuS == null || (coinMarginedCcyDisplayAEQbTJ = c55993xuS.AEQbTJ()) == null) ? CoinMarginedCcyDisplay.COIN : coinMarginedCcyDisplayAEQbTJ;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$algoId, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, anonymousClass1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
