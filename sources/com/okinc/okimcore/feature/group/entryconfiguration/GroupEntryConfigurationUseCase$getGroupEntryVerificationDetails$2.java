package com.okinc.okimcore.feature.group.entryconfiguration;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerification;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.GroupEntryCreateVerificationRequestResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.AbstractC44412sOw;
import o.C43401rob;
import o.C43422row;
import o.C44255sJa;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class GroupEntryConfigurationUseCase$getGroupEntryVerificationDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC44412sOw>, Object> {
    final /* synthetic */ long $groupId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44255sJa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryConfigurationUseCase$getGroupEntryVerificationDetails$2(C44255sJa c44255sJa, long j, Continuation<? super GroupEntryConfigurationUseCase$getGroupEntryVerificationDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = c44255sJa;
        this.$groupId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupEntryConfigurationUseCase$getGroupEntryVerificationDetails$2 groupEntryConfigurationUseCase$getGroupEntryVerificationDetails$2 = new GroupEntryConfigurationUseCase$getGroupEntryVerificationDetails$2(this.this$0, this.$groupId, continuation);
        groupEntryConfigurationUseCase$getGroupEntryVerificationDetails$2.L$0 = obj;
        return groupEntryConfigurationUseCase$getGroupEntryVerificationDetails$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC44412sOw> continuation) {
        return ((GroupEntryConfigurationUseCase$getGroupEntryVerificationDetails$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("GroupAPI", "Making getGroupEntryVerificationDetails request");
                C44255sJa c44255sJa = this.this$0;
                long j = this.$groupId;
                InHouseIMGroupService inHouseIMGroupService = c44255sJa.AEQbTJ;
                this.label = 1;
                obj = inHouseIMGroupService.getGroupEntryVerificationDetails(j, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        pUU.EZpvd("GroupAPI", "Response: " + actionBar);
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse = (GroupEntryCreateVerificationRequestResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            Long groupId = groupEntryCreateVerificationRequestResponse.getGroupId();
            GroupEntryAssetVerification assetVerification = groupEntryCreateVerificationRequestResponse.getAssetVerification();
            GroupEntryAssetVerification groupEntryAssetVerification = assetVerification != null ? new GroupEntryAssetVerification(assetVerification.getAssetVerificationStatus(), assetVerification.getAssetVerificationType(), assetVerification.getCurrencyId(), assetVerification.getAssetAmount(), assetVerification.getCurrencyCode()) : null;
            GroupEntryBillingModel billingModel = groupEntryCreateVerificationRequestResponse.getBillingModel();
            return new AbstractC44412sOw.Activity(new GroupEntryCreateVerificationRequestResponse(groupId, (Integer) null, groupEntryAssetVerification, billingModel != null ? new GroupEntryBillingModel(billingModel.getEnabled(), billingModel.getCurrencyId(), billingModel.getCurrencyCode(), billingModel.getCurrencySign(), billingModel.getAmount(), billingModel.getBillingType()) : null, 2, (DefaultConstructorMarker) null));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        return new AbstractC44412sOw.TaskDescription(((OKServerException) actionBar2.KWHzl()).getCode(), (Throwable) actionBar2.KWHzl());
    }
}
