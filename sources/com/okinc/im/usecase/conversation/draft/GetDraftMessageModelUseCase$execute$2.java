package com.okinc.im.usecase.conversation.draft;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oCE;
import o.oCN;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class GetDraftMessageModelUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DraftMessageModel>, Object> {
    final /* synthetic */ String $channelId;
    int label;
    final /* synthetic */ oCN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDraftMessageModelUseCase$execute$2(String str, oCN ocn, Continuation<? super GetDraftMessageModelUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = ocn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetDraftMessageModelUseCase$execute$2(this.$channelId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DraftMessageModel> continuation) {
        return ((GetDraftMessageModelUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$channelId;
            if (str != null && !StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                oCE oce = this.this$0.copydefault;
                String str2 = this.$channelId;
                this.label = 1;
                obj = oce.OLrzqt(str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.copydefault("GetDraftMessageModelUseCase", "channelId is null or blank, return");
                return null;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        OKConversation oKConversation = (OKConversation) obj;
        if (oKConversation != null) {
            return oKConversation.getDraftMessageModel();
        }
        return null;
    }
}
