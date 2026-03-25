package com.okinc.business.market.features.holders.domain.usecase;

import com.okinc.business.data.model.market.TokenHolderResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C26287jYw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jYD;
import o.jYG;
import o.jYH;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderUseCase$subscribeHoldersRanking$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ jYD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderUseCase$subscribeHoldersRanking$1(jYD jyd, String str, String str2, String str3, Continuation<? super HolderUseCase$subscribeHoldersRanking$1> continuation) {
        super(2, continuation);
        this.this$0 = jyd;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$accountId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HolderUseCase$subscribeHoldersRanking$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$accountId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HolderUseCase$subscribeHoldersRanking$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jYG jyg = this.this$0.valueOf;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            String str3 = this.$accountId;
            this.label = 1;
            obj = jyg.KWHzl(str, str2, str3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0);
        this.label = 2;
        if (((Flow) obj).collect(anonymousClass5, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.holders.domain.usecase.HolderUseCase$subscribeHoldersRanking$1$5, reason: invalid class name */
    public static final class AnonymousClass5<T> implements FlowCollector {
        public final /* synthetic */ jYD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(jYD jyd) {
            this.copydefault = jyd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(TokenHolderResponseData tokenHolderResponseData, Continuation<? super Unit> continuation) throws Throwable {
            HolderUseCase$subscribeHoldersRanking$1$1$emit$1 holderUseCase$subscribeHoldersRanking$1$1$emit$1;
            Object objOLrzqt;
            AnonymousClass5<T> anonymousClass5;
            if (continuation instanceof HolderUseCase$subscribeHoldersRanking$1$1$emit$1) {
                holderUseCase$subscribeHoldersRanking$1$1$emit$1 = (HolderUseCase$subscribeHoldersRanking$1$1$emit$1) continuation;
                int i = holderUseCase$subscribeHoldersRanking$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    holderUseCase$subscribeHoldersRanking$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    holderUseCase$subscribeHoldersRanking$1$1$emit$1 = new HolderUseCase$subscribeHoldersRanking$1$1$emit$1(this, continuation);
                }
            }
            Object obj = holderUseCase$subscribeHoldersRanking$1$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = holderUseCase$subscribeHoldersRanking$1$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                jYH jyh = this.copydefault.djBIcL;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(100);
                holderUseCase$subscribeHoldersRanking$1$1$emit$1.L$0 = this;
                holderUseCase$subscribeHoldersRanking$1$1$emit$1.label = 1;
                objOLrzqt = jyh.OLrzqt(tokenHolderResponseData, numAEQbTJ, holderUseCase$subscribeHoldersRanking$1$1$emit$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                anonymousClass5 = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                anonymousClass5 = (AnonymousClass5) holderUseCase$subscribeHoldersRanking$1$1$emit$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objOLrzqt)) {
                objOLrzqt = null;
            }
            MutableStateFlow mutableStateFlow = anonymousClass5.copydefault.copydefault;
            holderUseCase$subscribeHoldersRanking$1$1$emit$1.L$0 = null;
            holderUseCase$subscribeHoldersRanking$1$1$emit$1.label = 2;
            if (mutableStateFlow.emit((C26287jYw) objOLrzqt, holderUseCase$subscribeHoldersRanking$1$1$emit$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }
}
