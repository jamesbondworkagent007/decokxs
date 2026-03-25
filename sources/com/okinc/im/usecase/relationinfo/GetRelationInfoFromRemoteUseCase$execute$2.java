package com.okinc.im.usecase.relationinfo;

import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C35859oGi;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44177sGd;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class GetRelationInfoFromRemoteUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RelationInfo>, Object> {
    final /* synthetic */ String $memberOfGroup;
    final /* synthetic */ String $relationId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35859oGi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRelationInfoFromRemoteUseCase$execute$2(String str, C35859oGi c35859oGi, String str2, Continuation<? super GetRelationInfoFromRemoteUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$relationId = str;
        this.this$0 = c35859oGi;
        this.$memberOfGroup = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetRelationInfoFromRemoteUseCase$execute$2 getRelationInfoFromRemoteUseCase$execute$2 = new GetRelationInfoFromRemoteUseCase$execute$2(this.$relationId, this.this$0, this.$memberOfGroup, continuation);
        getRelationInfoFromRemoteUseCase$execute$2.L$0 = obj;
        return getRelationInfoFromRemoteUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RelationInfo> continuation) {
        return ((GetRelationInfoFromRemoteUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (StringsKt__StringsKt.fARcdN((CharSequence) this.$relationId)) {
                    return null;
                }
                C35859oGi c35859oGi = this.this$0;
                String str = this.$relationId;
                String str2 = this.$memberOfGroup;
                Result.Application application = Result.Companion;
                InterfaceC44177sGd interfaceC44177sGd = c35859oGi.copydefault;
                this.label = 1;
                obj = interfaceC44177sGd.EZpvd(str, str2, this);
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
            pUU.copydefault("GetRelationInfoFromRemoteUseCase", "getRelationInfoAsyncById failed: " + thM7380exceptionOrNullimpl.getMessage());
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
