package com.okinc.im.message.provider;

import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sKH;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageReactionUIHelper$bindUI$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ String $channelId;
    final /* synthetic */ OKConversationType $conversationType;
    final /* synthetic */ long $messageSeq;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageReactionUIHelper$bindUI$1$2$1$1(String str, long j, OKConversationType oKConversationType, AbstractActivityC33041mov abstractActivityC33041mov, Continuation<? super MessageReactionUIHelper$bindUI$1$2$1$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.$messageSeq = j;
        this.$conversationType = oKConversationType;
        this.$activity = abstractActivityC33041mov;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageReactionUIHelper$bindUI$1$2$1$1(this.$channelId, this.$messageSeq, this.$conversationType, this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageReactionUIHelper$bindUI$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC35180nqU interfaceC35180nqU;
        long j;
        String str;
        AbstractActivityC33041mov abstractActivityC33041mov;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU2 = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU2 != null) {
                String str2 = this.$channelId;
                long j2 = this.$messageSeq;
                OKConversationType oKConversationType = this.$conversationType;
                AbstractActivityC33041mov abstractActivityC33041mov2 = this.$activity;
                sKH skhCopydefault = interfaceC35180nqU2.copydefault();
                boolean z = oKConversationType == OKConversationType.PRIVATE;
                this.L$0 = interfaceC35180nqU2;
                this.L$1 = str2;
                this.L$2 = abstractActivityC33041mov2;
                this.L$3 = interfaceC35180nqU2;
                this.J$0 = j2;
                this.label = 1;
                Object objOLrzqt = skhCopydefault.OLrzqt(str2, j2, z, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC35180nqU = interfaceC35180nqU2;
                obj = objOLrzqt;
                j = j2;
                str = str2;
                abstractActivityC33041mov = abstractActivityC33041mov2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j3 = this.J$0;
        InterfaceC35180nqU interfaceC35180nqU3 = (InterfaceC35180nqU) this.L$3;
        AbstractActivityC33041mov abstractActivityC33041mov3 = (AbstractActivityC33041mov) this.L$2;
        String str3 = (String) this.L$1;
        C56391yDq.AEQbTJ(obj);
        interfaceC35180nqU = interfaceC35180nqU3;
        abstractActivityC33041mov = abstractActivityC33041mov3;
        str = str3;
        j = j3;
        interfaceC35180nqU.KWHzl(abstractActivityC33041mov, str, j, (List<ReactionDetail>) obj);
        return Unit.INSTANCE;
    }
}
