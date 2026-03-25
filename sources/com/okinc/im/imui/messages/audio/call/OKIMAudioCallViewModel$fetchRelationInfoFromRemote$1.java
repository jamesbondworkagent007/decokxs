package com.okinc.im.imui.messages.audio.call;

import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35859oGi;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMAudioCallViewModel$fetchRelationInfoFromRemote$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $remoteUserId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OKIMAudioCallViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMAudioCallViewModel$fetchRelationInfoFromRemote$1(OKIMAudioCallViewModel oKIMAudioCallViewModel, String str, Continuation<? super OKIMAudioCallViewModel$fetchRelationInfoFromRemote$1> continuation) {
        super(2, continuation);
        this.this$0 = oKIMAudioCallViewModel;
        this.$remoteUserId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKIMAudioCallViewModel$fetchRelationInfoFromRemote$1 oKIMAudioCallViewModel$fetchRelationInfoFromRemote$1 = new OKIMAudioCallViewModel$fetchRelationInfoFromRemote$1(this.this$0, this.$remoteUserId, continuation);
        oKIMAudioCallViewModel$fetchRelationInfoFromRemote$1.L$0 = obj;
        return oKIMAudioCallViewModel$fetchRelationInfoFromRemote$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMAudioCallViewModel$fetchRelationInfoFromRemote$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        OKIMAudioCallViewModel oKIMAudioCallViewModel;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Unit unit = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault.setValue(C56443yFo.KWHzl(true));
                oKIMAudioCallViewModel = this.this$0;
                String str2 = this.$remoteUserId;
                Result.Application application = Result.Companion;
                C35859oGi c35859oGi = oKIMAudioCallViewModel.fJNWhG;
                this.L$0 = oKIMAudioCallViewModel;
                this.L$1 = str2;
                this.label = 1;
                Object objCopydefault2 = c35859oGi.copydefault(str2, null, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                str = str2;
                obj = objCopydefault2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                oKIMAudioCallViewModel = (OKIMAudioCallViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            RelationInfo relationInfo = (RelationInfo) obj;
            if (relationInfo != null) {
                C44124sEe.imLogVoiceCall$default("ViewModel: fetched relation info for " + str, null, 2, null);
                oKIMAudioCallViewModel.OLrzqt(relationInfo);
                unit = Unit.INSTANCE;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        String str3 = this.$remoteUserId;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("OKIMAudioCallViewModel", "Failed to fetch relation info for " + str3, thM7380exceptionOrNullimpl);
            C44124sEe.fIwbmz("ViewModel: failed to fetch relation info", thM7380exceptionOrNullimpl);
        }
        this.this$0.copydefault.setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
