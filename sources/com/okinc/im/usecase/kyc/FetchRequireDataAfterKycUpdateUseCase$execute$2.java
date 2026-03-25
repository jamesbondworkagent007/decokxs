package com.okinc.im.usecase.kyc;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35799oEc;
import o.C35859oGi;
import o.C56391yDq;
import o.C56442yFn;
import o.oDA;

/* JADX INFO: loaded from: classes8.dex */
public final class FetchRequireDataAfterKycUpdateUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    int label;
    final /* synthetic */ C35799oEc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchRequireDataAfterKycUpdateUseCase$execute$2(String str, C35799oEc c35799oEc, Continuation<? super FetchRequireDataAfterKycUpdateUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = c35799oEc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchRequireDataAfterKycUpdateUseCase$execute$2(this.$channelId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FetchRequireDataAfterKycUpdateUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$channelId != null) {
                OKConversation oKConversationOLrzqt = this.this$0.AEQbTJ.OLrzqt(this.$channelId);
                if (oKConversationOLrzqt == null) {
                    return Unit.INSTANCE;
                }
                if (oKConversationOLrzqt.getConversationType() == OKConversationType.PRIVATE) {
                    C35859oGi c35859oGi = this.this$0.KWHzl;
                    String str = this.$channelId;
                    this.label = 1;
                    if (c35859oGi.copydefault(str, null, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (oKConversationOLrzqt.getConversationType() == OKConversationType.GROUP) {
                    oDA oda = this.this$0.copydefault;
                    String str2 = this.$channelId;
                    this.label = 2;
                    if (oda.copydefault(str2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
