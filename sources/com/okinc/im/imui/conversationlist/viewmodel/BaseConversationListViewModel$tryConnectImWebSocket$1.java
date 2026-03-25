package com.okinc.im.imui.conversationlist.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nGA;
import o.sDN;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseConversationListViewModel$tryConnectImWebSocket$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseConversationListViewModel$tryConnectImWebSocket$1(BaseConversationListViewModel baseConversationListViewModel, Continuation<? super BaseConversationListViewModel$tryConnectImWebSocket$1> continuation) {
        super(2, continuation);
        this.this$0 = baseConversationListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseConversationListViewModel$tryConnectImWebSocket$1 baseConversationListViewModel$tryConnectImWebSocket$1 = new BaseConversationListViewModel$tryConnectImWebSocket$1(this.this$0, continuation);
        baseConversationListViewModel$tryConnectImWebSocket$1.L$0 = obj;
        return baseConversationListViewModel$tryConnectImWebSocket$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseConversationListViewModel$tryConnectImWebSocket$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BaseConversationListViewModel baseConversationListViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            BaseConversationListViewModel$tryConnectImWebSocket$1$isConnectSuccess$1$1 baseConversationListViewModel$tryConnectImWebSocket$1$isConnectSuccess$1$1 = new BaseConversationListViewModel$tryConnectImWebSocket$1$isConnectSuccess$1$1(baseConversationListViewModel, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherCopydefault, baseConversationListViewModel$tryConnectImWebSocket$1$isConnectSuccess$1$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
        BaseConversationListViewModel baseConversationListViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            if (!baseConversationListViewModel2.DTwDnp()) {
                baseConversationListViewModel2.KWHzl(thM7380exceptionOrNullimpl);
            }
            objM7377constructorimpl = C56443yFo.KWHzl(false);
        }
        boolean zBooleanValue = ((Boolean) objM7377constructorimpl).booleanValue();
        C44124sEe.imLogConversation$default("[In-House] Conversation list flow: connect web socket: " + zBooleanValue + ", isConversationListLoaded:" + this.this$0.DTwDnp(), null, 2, null);
        if (!this.this$0.DTwDnp()) {
            if (!zBooleanValue) {
                C44124sEe.imLogConversation$default("[In-House] Conversation list flow - first load failed, unable to connect", null, 2, null);
                this.this$0.AuCTelauCTel().setValue(new C32989mnw<>(nGA.FragmentManager.copydefault));
            } else {
                C44124sEe.imLogConversation$default("[In-House] Conversation list flow - delayAndShowEmptyIfConversationNotLoaded", null, 2, null);
                BaseConversationListViewModel baseConversationListViewModel3 = this.this$0;
                this.label = 2;
                if (baseConversationListViewModel3.KWHzl(this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
