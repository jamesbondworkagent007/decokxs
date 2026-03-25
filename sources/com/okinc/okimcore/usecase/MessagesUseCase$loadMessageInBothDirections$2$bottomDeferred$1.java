package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sNO;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$loadMessageInBothDirections$2$bottomDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends InHouseIMMessageEntity>>, Object> {
    final /* synthetic */ Boolean $asc;
    final /* synthetic */ String $channelId;
    final /* synthetic */ long $size;
    final /* synthetic */ long $targetSeq;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$loadMessageInBothDirections$2$bottomDeferred$1(C44502sSe c44502sSe, String str, long j, long j2, Boolean bool, Continuation<? super MessagesUseCase$loadMessageInBothDirections$2$bottomDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = c44502sSe;
        this.$channelId = str;
        this.$targetSeq = j;
        this.$size = j2;
        this.$asc = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessagesUseCase$loadMessageInBothDirections$2$bottomDeferred$1(this.this$0, this.$channelId, this.$targetSeq, this.$size, this.$asc, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends InHouseIMMessageEntity>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<InHouseIMMessageEntity>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<InHouseIMMessageEntity>> continuation) {
        return ((MessagesUseCase$loadMessageInBothDirections$2$bottomDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44502sSe c44502sSe = this.this$0;
            sNO sno = new sNO(this.$channelId, C56443yFo.KWHzl(this.$targetSeq), this.$size, this.$asc, false, 0, false, 32, null);
            this.label = 1;
            obj = C44502sSe.loadMessagesWith$default(c44502sSe, sno, null, null, this, 6, null);
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
