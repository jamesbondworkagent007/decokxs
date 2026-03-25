package com.okinc.im.imui.conversation.message.provider;

import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuRecallAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuReplyAction;
import com.okinc.im.menu.MenuActionBase;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33670nBm;
import o.C35254nrp;
import o.C43251rlk;
import o.C44157sFk;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class FileReceiveMessageViewProvider$buildLongClickMenuItems$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends MenuActionBase>>, Object> {
    final /* synthetic */ C35254nrp $item;
    int label;
    final /* synthetic */ C33670nBm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReceiveMessageViewProvider$buildLongClickMenuItems$2(C35254nrp c35254nrp, C33670nBm c33670nBm, Continuation<? super FileReceiveMessageViewProvider$buildLongClickMenuItems$2> continuation) {
        super(2, continuation);
        this.$item = c35254nrp;
        this.this$0 = c33670nBm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileReceiveMessageViewProvider$buildLongClickMenuItems$2(this.$item, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MenuActionBase>> continuation) {
        return ((FileReceiveMessageViewProvider$buildLongClickMenuItems$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU == null || !interfaceC35180nqU.djBIcL()) {
                return yDY.AhwBna();
            }
            C35254nrp c35254nrp = this.$item;
            C33670nBm c33670nBm = this.this$0;
            List listOLrzqt = C56402yEa.OLrzqt();
            if (C44157sFk.EZpvd(c35254nrp.OLrzqt())) {
                listOLrzqt.add(new MenuReplyAction());
            }
            if (c33670nBm.copydefault(c35254nrp.OLrzqt())) {
                listOLrzqt.add(new MenuRecallAction());
            }
            return C56402yEa.fARcdN(listOLrzqt);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
