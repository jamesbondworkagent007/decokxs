package com.okinc.im.usecase.conversation.draft;

import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oCU;
import o.pUU;
import o.sGF;

/* JADX INFO: loaded from: classes8.dex */
public final class SaveDraftMessageModelUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ DraftMessageModel $draftMessageModel;
    int label;
    final /* synthetic */ oCU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveDraftMessageModelUseCase$execute$2(String str, DraftMessageModel draftMessageModel, oCU ocu, Continuation<? super SaveDraftMessageModelUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.$draftMessageModel = draftMessageModel;
        this.this$0 = ocu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SaveDraftMessageModelUseCase$execute$2(this.$channelId, this.$draftMessageModel, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SaveDraftMessageModelUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$channelId;
            if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                pUU.copydefault("SaveDraftMessageModelUseCase", "channelId is null or blank, return");
                return Unit.INSTANCE;
            }
            pUU.KWHzl("SaveDraftMessageModelUseCase", "Saving draft message model " + this.$draftMessageModel + " for channelId: " + this.$channelId);
            sGF sgf = this.this$0.EZpvd;
            String str2 = this.$channelId;
            DraftMessageModel draftMessageModel = this.$draftMessageModel;
            this.label = 1;
            if (sgf.KWHzl(str2, draftMessageModel, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
