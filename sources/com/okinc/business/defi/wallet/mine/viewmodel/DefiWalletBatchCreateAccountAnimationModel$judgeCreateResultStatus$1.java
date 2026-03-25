package com.okinc.business.defi.wallet.mine.viewmodel;

import com.okinc.business.defi.wallet.mine.viewmodel.DefiWalletBatchCreateAccountAnimationModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletBatchCreateAccountAnimationModel$judgeCreateResultStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DefiWalletBatchCreateAccountAnimationModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletBatchCreateAccountAnimationModel$judgeCreateResultStatus$1(DefiWalletBatchCreateAccountAnimationModel defiWalletBatchCreateAccountAnimationModel, Continuation<? super DefiWalletBatchCreateAccountAnimationModel$judgeCreateResultStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = defiWalletBatchCreateAccountAnimationModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletBatchCreateAccountAnimationModel$judgeCreateResultStatus$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletBatchCreateAccountAnimationModel$judgeCreateResultStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        DefiWalletBatchCreateAccountAnimationModel.CreateResultStatus createResultStatus;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Channel channel = this.this$0.gEmmrt;
            int iGEmmrt = this.this$0.gEmmrt();
            if (iGEmmrt == 0) {
                createResultStatus = DefiWalletBatchCreateAccountAnimationModel.CreateResultStatus.FAILED;
            } else if (iGEmmrt == this.this$0.AkhnZx()) {
                createResultStatus = DefiWalletBatchCreateAccountAnimationModel.CreateResultStatus.ALL_SUCCESS;
            } else {
                createResultStatus = DefiWalletBatchCreateAccountAnimationModel.CreateResultStatus.PART_SUCCESS;
            }
            this.label = 1;
            if (channel.send(createResultStatus, this) == objCopydefault) {
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
