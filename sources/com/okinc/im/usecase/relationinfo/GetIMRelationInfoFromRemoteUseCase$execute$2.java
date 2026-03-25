package com.okinc.im.usecase.relationinfo;

import com.okinc.im.bean.IMRelationInfo;
import com.okinc.im.bean.RelationModel;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35667nzg;
import o.C35855oGe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44177sGd;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class GetIMRelationInfoFromRemoteUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super IMRelationInfo>, Object> {
    final /* synthetic */ RelationModel $relationModel;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35855oGe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetIMRelationInfoFromRemoteUseCase$execute$2(RelationModel relationModel, C35855oGe c35855oGe, Continuation<? super GetIMRelationInfoFromRemoteUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$relationModel = relationModel;
        this.this$0 = c35855oGe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetIMRelationInfoFromRemoteUseCase$execute$2 getIMRelationInfoFromRemoteUseCase$execute$2 = new GetIMRelationInfoFromRemoteUseCase$execute$2(this.$relationModel, this.this$0, continuation);
        getIMRelationInfoFromRemoteUseCase$execute$2.L$0 = obj;
        return getIMRelationInfoFromRemoteUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super IMRelationInfo> continuation) {
        return ((GetIMRelationInfoFromRemoteUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C35855oGe c35855oGe = this.this$0;
                RelationModel relationModel = this.$relationModel;
                Result.Application application = Result.Companion;
                InterfaceC44177sGd interfaceC44177sGd = c35855oGe.copydefault;
                String userUid = relationModel.getUserUid();
                this.label = 1;
                obj = interfaceC44177sGd.OLrzqt(userUid, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((RelationInfo) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("GetIMRelationInfoFromRemoteUseCase", "getContactInfoFromRemote failed: " + thM7380exceptionOrNullimpl.getMessage());
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        RelationInfo relationInfo = (RelationInfo) objM7377constructorimpl;
        IMRelationInfo iMRelationInfoOLrzqt = relationInfo != null ? C35667nzg.EZpvd.OLrzqt(relationInfo, this.$relationModel.getKycName()) : null;
        pUU.KWHzl("GetIMRelationInfoFromRemoteUseCase", "result id: " + (iMRelationInfoOLrzqt != null ? iMRelationInfoOLrzqt.getUserUid() : null) + ", displayName: " + (iMRelationInfoOLrzqt != null ? iMRelationInfoOLrzqt.getDisplayName() : null));
        return iMRelationInfoOLrzqt;
    }
}
