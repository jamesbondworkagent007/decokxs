package com.okinc.im.usecase.group.entryconfiguration;

import com.okinc.okimcore.model.remote.GroupEntryAssetVerification;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.GroupEntryCreateVerificationRequestResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44414sOy;
import o.C44255sJa;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDC;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupEntryUpsertVerificationUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC44414sOy>, Object> {
    final /* synthetic */ GroupEntryAssetVerification $assetVerification;
    final /* synthetic */ GroupEntryBillingModel $billingModel;
    final /* synthetic */ long $groupId;
    final /* synthetic */ int $verificationType;
    int label;
    final /* synthetic */ oDC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryUpsertVerificationUseCase$execute$2(oDC odc, long j, int i, GroupEntryAssetVerification groupEntryAssetVerification, GroupEntryBillingModel groupEntryBillingModel, Continuation<? super GroupEntryUpsertVerificationUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = odc;
        this.$groupId = j;
        this.$verificationType = i;
        this.$assetVerification = groupEntryAssetVerification;
        this.$billingModel = groupEntryBillingModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupEntryUpsertVerificationUseCase$execute$2(this.this$0, this.$groupId, this.$verificationType, this.$assetVerification, this.$billingModel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC44414sOy> continuation) {
        return ((GroupEntryUpsertVerificationUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44255sJa c44255sJa = this.this$0.KWHzl;
            GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse = new GroupEntryCreateVerificationRequestResponse(C56443yFo.KWHzl(this.$groupId), C56443yFo.AEQbTJ(this.$verificationType), this.$assetVerification, this.$billingModel);
            this.label = 1;
            obj = c44255sJa.EZpvd(groupEntryCreateVerificationRequestResponse, this);
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
