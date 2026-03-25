package com.okinc.business.defi.wallet.tee.activate.viewmodel;

import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivateSAViewModel$updateSelectedAnotherAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountId;
    int label;
    final /* synthetic */ ActivateSAViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAViewModel$updateSelectedAnotherAccount$1(ActivateSAViewModel activateSAViewModel, String str, Continuation<? super ActivateSAViewModel$updateSelectedAnotherAccount$1> continuation) {
        super(2, continuation);
        this.this$0 = activateSAViewModel;
        this.$accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAViewModel$updateSelectedAnotherAccount$1(this.this$0, this.$accountId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAViewModel$updateSelectedAnotherAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivateTeeGuideModel value = this.this$0.AEQbTJ().getValue();
            this.this$0.djBIcL.set("tee_account_info", value.copy((250 & 1) != 0 ? value.accountId : this.$accountId, (250 & 2) != 0 ? value.showSelectWalletEntry : false, (250 & 4) != 0 ? value.isNeedToCreateNewAccount : false, (250 & 8) != 0 ? value.rootWalletId : null, (250 & 16) != 0 ? value.addressIndex : 0, (250 & 32) != 0 ? value.from : 0, (250 & 64) != 0 ? value.bcakTo : 0, (250 & 128) != 0 ? value.pathSource : null));
            this.this$0.KWHzl(false);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
