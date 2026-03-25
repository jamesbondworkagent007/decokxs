package com.okinc.business.trade.features.home.meme.usecase.transaction;

import android.os.Bundle;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6ApproveExecutionUseCase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6ApproveExecutionUseCase$performApprovalWithFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cancelApproveTag;
    final /* synthetic */ Function1<Bundle, Unit> $onApproveCallback;
    final /* synthetic */ Function1<Boolean, Unit> $onResult;
    final /* synthetic */ MemeV6ApproveExecutionUseCase.ApproveExecutionParams $params;
    int label;
    final /* synthetic */ MemeV6ApproveExecutionUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super android.os.Bundle, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MemeV6ApproveExecutionUseCase$performApprovalWithFlow$2(MemeV6ApproveExecutionUseCase memeV6ApproveExecutionUseCase, MemeV6ApproveExecutionUseCase.ApproveExecutionParams approveExecutionParams, String str, Function1<? super Bundle, Unit> function1, Function1<? super Boolean, Unit> function12, Continuation<? super MemeV6ApproveExecutionUseCase$performApprovalWithFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = memeV6ApproveExecutionUseCase;
        this.$params = approveExecutionParams;
        this.$cancelApproveTag = str;
        this.$onApproveCallback = function1;
        this.$onResult = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeV6ApproveExecutionUseCase$performApprovalWithFlow$2(this.this$0, this.$params, this.$cancelApproveTag, this.$onApproveCallback, this.$onResult, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeV6ApproveExecutionUseCase$performApprovalWithFlow$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowAEQbTJ = this.this$0.AEQbTJ(this.$params, this.$cancelApproveTag, this.$onApproveCallback);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$params, this.$onResult);
            this.label = 1;
            if (flowAEQbTJ.collect(anonymousClass3, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6ApproveExecutionUseCase$performApprovalWithFlow$2$3, reason: invalid class name */
    public static final class AnonymousClass3<T> implements FlowCollector {
        public final /* synthetic */ MemeV6ApproveExecutionUseCase AEQbTJ;
        public final /* synthetic */ Function1<Boolean, Unit> EZpvd;
        public final /* synthetic */ MemeV6ApproveExecutionUseCase.ApproveExecutionParams KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(MemeV6ApproveExecutionUseCase memeV6ApproveExecutionUseCase, MemeV6ApproveExecutionUseCase.ApproveExecutionParams approveExecutionParams, Function1<? super Boolean, Unit> function1) {
            this.AEQbTJ = memeV6ApproveExecutionUseCase;
            this.KWHzl = approveExecutionParams;
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Bundle bundle, Continuation<? super Unit> continuation) throws Throwable {
            MemeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1 memeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1;
            AnonymousClass3<T> anonymousClass3;
            if (continuation instanceof MemeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1) {
                memeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1 = (MemeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1) continuation;
                int i = memeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    memeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    memeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1 = new MemeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1(this, continuation);
                }
            }
            Object objCopydefault = memeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1.result;
            Object objCopydefault2 = C56442yFn.copydefault();
            int i2 = memeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                MemeV6ApproveExecutionUseCase memeV6ApproveExecutionUseCase = this.AEQbTJ;
                MemeV6ApproveExecutionUseCase.ApproveExecutionParams approveExecutionParams = this.KWHzl;
                memeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1.L$0 = this;
                memeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1.label = 1;
                objCopydefault = memeV6ApproveExecutionUseCase.copydefault(bundle, approveExecutionParams, memeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                anonymousClass3 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                anonymousClass3 = (AnonymousClass3) memeV6ApproveExecutionUseCase$performApprovalWithFlow$2$1$emit$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            anonymousClass3.EZpvd.invoke(C56443yFo.KWHzl(((Boolean) objCopydefault).booleanValue()));
            return Unit.INSTANCE;
        }
    }
}
