package com.okinc.business.defi.wallet.mine.viewmodel;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C56391yDq;
import o.C56442yFn;
import o.C56548yJl;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletBatchCreateAccountAnimationModel$prepareAsyncWalletData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $count;
    int label;
    final /* synthetic */ DefiWalletBatchCreateAccountAnimationModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletBatchCreateAccountAnimationModel$prepareAsyncWalletData$1(DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel, int i, Continuation<? super DefiWalletBatchCreateAccountAnimationModel$prepareAsyncWalletData$1> continuation) {
        super(2, continuation);
        this.this$0 = defiWalletBatchCreateAccountAnimationModel;
        this.$count = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletBatchCreateAccountAnimationModel$prepareAsyncWalletData$1(this.this$0, this.$count, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletBatchCreateAccountAnimationModel$prepareAsyncWalletData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.viewmodel.DefiWalletBatchCreateAccountAnimationModel$prepareAsyncWalletData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $count;
        int label;
        final /* synthetic */ DefiWalletBatchCreateAccountAnimationModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = defiWalletBatchCreateAccountAnimationModel;
            this.$count = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$count, continuation);
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
                if (!(!this.this$0.KWHzl.isEmpty())) {
                    pUU.copydefault(this.this$0.ejfBZ, "asyncWalletQueue is empty");
                } else {
                    ArrayList arrayList = new ArrayList(this.$count);
                    int iCopydefault = C56548yJl.copydefault(this.$count, this.this$0.KWHzl.size());
                    for (int i2 = 0; i2 < iCopydefault; i2++) {
                        if (this.this$0.KWHzl.peek() != null) {
                            arrayList.add(this.this$0.KWHzl.pop());
                        }
                    }
                    DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel = this.this$0;
                    this.label = 1;
                    if (defiWalletBatchCreateAccountAnimationModel.AEQbTJ(arrayList, this) == objCopydefault) {
                        return objCopydefault;
                    }
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$count, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
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
