package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.contact.repository.remote.inhouseim.InHouseIMRelationService;
import com.okinc.okimcore.model.remote.SyncRelationsRequest;
import com.okinc.okimcore.model.remote.SyncRelationsResponse;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import com.okinc.okimcore.usecase.phonerelations.SubmitPhoneRelationsUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sSA {
    public final InHouseIMRelationService AEQbTJ;

    @yCM
    public sSA(@NotNull InHouseIMRelationService inHouseIMRelationService) {
        Intrinsics.checkNotNullParameter(inHouseIMRelationService, "");
        this.AEQbTJ = inHouseIMRelationService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<PhoneRelationEntity> list, @NotNull Continuation<? super SyncRelationsResponse> continuation) throws java.lang.Throwable {
        SubmitPhoneRelationsUseCase$execute$1 submitPhoneRelationsUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof SubmitPhoneRelationsUseCase$execute$1) {
            submitPhoneRelationsUseCase$execute$1 = (SubmitPhoneRelationsUseCase$execute$1) continuation;
            int i = submitPhoneRelationsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                submitPhoneRelationsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                submitPhoneRelationsUseCase$execute$1 = new SubmitPhoneRelationsUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objSyncRelations = submitPhoneRelationsUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = submitPhoneRelationsUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objSyncRelations);
                if (!(!list.isEmpty())) {
                    throw new java.lang.IllegalArgumentException("no phone relations for sync".toString());
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (PhoneRelationEntity phoneRelationEntity : list) {
                    arrayList.add(new SyncRelationsRequest.SyncRelation(phoneRelationEntity.getCountryCode(), phoneRelationEntity.getHash()));
                }
                SyncRelationsRequest syncRelationsRequest = new SyncRelationsRequest(arrayList);
                InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                submitPhoneRelationsUseCase$execute$1.label = 1;
                objSyncRelations = inHouseIMRelationService.syncRelations(syncRelationsRequest, submitPhoneRelationsUseCase$execute$1);
                if (objSyncRelations == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objSyncRelations);
            }
            responseData = (ResponseData) objSyncRelations;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0) {
            stateListAnimator = new AbstractC43419rot.StateListAnimator(responseData.getData());
            return stateListAnimator.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return stateListAnimator.AEQbTJ();
    }
}
