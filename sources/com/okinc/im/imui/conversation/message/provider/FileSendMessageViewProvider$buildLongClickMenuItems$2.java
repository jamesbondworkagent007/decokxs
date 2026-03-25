package com.okinc.im.imui.conversation.message.provider;

import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuInfoAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuRecallAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuReplyAction;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33674nBq;
import o.C35254nrp;
import o.C35802oEf;
import o.C43251rlk;
import o.C44157sFk;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class FileSendMessageViewProvider$buildLongClickMenuItems$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends MenuActionBase>>, Object> {
    final /* synthetic */ C35254nrp $item;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C33674nBq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSendMessageViewProvider$buildLongClickMenuItems$2(C35254nrp c35254nrp, C33674nBq c33674nBq, Continuation<? super FileSendMessageViewProvider$buildLongClickMenuItems$2> continuation) {
        super(2, continuation);
        this.$item = c35254nrp;
        this.this$0 = c33674nBq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileSendMessageViewProvider$buildLongClickMenuItems$2(this.$item, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MenuActionBase>> continuation) {
        return ((FileSendMessageViewProvider$buildLongClickMenuItems$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listOLrzqt;
        List list;
        List list2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU == null || !interfaceC35180nqU.djBIcL()) {
                return yDY.AhwBna();
            }
            C35254nrp c35254nrp = this.$item;
            C33674nBq c33674nBq = this.this$0;
            listOLrzqt = C56402yEa.OLrzqt();
            if (c35254nrp.OLrzqt().getConversationType() != OKConversationType.BROADCAST) {
                if (C44157sFk.EZpvd(c35254nrp.OLrzqt())) {
                    listOLrzqt.add(new MenuReplyAction());
                }
                C35802oEf c35802oEfAYXKKw = c33674nBq.AYXKKw();
                OKMessage oKMessageOLrzqt = c35254nrp.OLrzqt();
                this.L$0 = listOLrzqt;
                this.L$1 = listOLrzqt;
                this.label = 1;
                obj = c35802oEfAYXKKw.KWHzl(oKMessageOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                list2 = listOLrzqt;
                list = list2;
            } else {
                list = listOLrzqt;
                listOLrzqt.add(new MenuInfoAction());
                return C56402yEa.fARcdN(list);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) this.L$1;
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            list2.add(new MenuRecallAction());
        }
        listOLrzqt = list2;
        listOLrzqt.add(new MenuInfoAction());
        return C56402yEa.fARcdN(list);
    }
}
