package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.feature.message.manager.InHouseIMWebSocketSyncManagerImpl$handleReactionData$2$1$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44169sFw;
import o.C44302sKu;
import o.C44467sQx;
import o.C44486sRp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44291sKj;
import o.sSX;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$handleReactionData$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ List<ReactionDisplay> $displayList;
    final /* synthetic */ long $seq;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$handleReactionData$2$1$1(C44302sKu c44302sKu, String str, long j, List<ReactionDisplay> list, Continuation<? super InHouseIMWebSocketSyncManagerImpl$handleReactionData$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
        this.$channelId = str;
        this.$seq = j;
        this.$displayList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerImpl$handleReactionData$2$1$1(this.this$0, this.$channelId, this.$seq, this.$displayList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$handleReactionData$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44486sRp c44486sRpAkhnZx = this.this$0.AkhnZx();
            String str = this.$channelId;
            long j = this.$seq;
            this.label = 1;
            obj = c44486sRpAkhnZx.OLrzqt(str, j, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InHouseIMMessageEntity inHouseIMMessageEntity = (InHouseIMMessageEntity) obj;
        if (inHouseIMMessageEntity != null) {
            List<ReactionDisplay> list = this.$displayList;
            C44302sKu c44302sKu = this.this$0;
            final OKMessage oKMessageOLrzqt = C44169sFw.OLrzqt(new InHouseIMMessageWithReactions(inHouseIMMessageEntity, sSX.KWHzl.copydefault(list)));
            if (oKMessageOLrzqt != null) {
                c44302sKu.fIwbmz().copydefault(new Function1() { // from class: o.sKF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InHouseIMWebSocketSyncManagerImpl$handleReactionData$2$1$1.invokeSuspend$lambda$2$lambda$1$lambda$0(oKMessageOLrzqt, (InterfaceC44291sKj) obj2);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1$lambda$0(OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
        interfaceC44291sKj.copydefault(new C44467sQx(oKMessage));
        return Unit.INSTANCE;
    }
}
