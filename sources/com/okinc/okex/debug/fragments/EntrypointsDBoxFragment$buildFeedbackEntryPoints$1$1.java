package com.okinc.okex.debug.fragments;

import android.content.Context;
import com.okinc.okex.common.navigator.CommonServiceKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45300snG;
import o.C56391yDq;
import o.C56442yFn;
import o.sBZ;

/* JADX INFO: loaded from: classes16.dex */
public final class EntrypointsDBoxFragment$buildFeedbackEntryPoints$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ EntrypointsDBoxFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntrypointsDBoxFragment$buildFeedbackEntryPoints$1$1(EntrypointsDBoxFragment entrypointsDBoxFragment, Context context, Continuation<? super EntrypointsDBoxFragment$buildFeedbackEntryPoints$1$1> continuation) {
        super(2, continuation);
        this.this$0 = entrypointsDBoxFragment;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EntrypointsDBoxFragment$buildFeedbackEntryPoints$1$1(this.this$0, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EntrypointsDBoxFragment$buildFeedbackEntryPoints$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45300snG c45300snGKWHzl = this.this$0.KWHzl();
            CommonServiceKey commonServiceKey = CommonServiceKey.ErrorLogUpload;
            Context context = this.$context;
            sBZ sbz = new sBZ("1110001362", "460017800671", "460017801982");
            this.label = 1;
            if (c45300snGKWHzl.copydefault(commonServiceKey, context, sbz, this) == objCopydefault) {
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
