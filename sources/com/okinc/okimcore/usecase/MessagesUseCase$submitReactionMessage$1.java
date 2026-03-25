package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReaction;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionAck;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C44124sEe;
import o.C44169sFw;
import o.C44486sRp;
import o.C44489sRs;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.sRW;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$submitReactionMessage$1 extends SuspendLambda implements Function2<FlowCollector<? super C44502sSe.Dialog>, Continuation<? super Unit>, Object> {
    final /* synthetic */ WSSendReactionData $wsReactionDataRequest;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$submitReactionMessage$1(C44502sSe c44502sSe, WSSendReactionData wSSendReactionData, Continuation<? super MessagesUseCase$submitReactionMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = c44502sSe;
        this.$wsReactionDataRequest = wSSendReactionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessagesUseCase$submitReactionMessage$1 messagesUseCase$submitReactionMessage$1 = new MessagesUseCase$submitReactionMessage$1(this.this$0, this.$wsReactionDataRequest, continuation);
        messagesUseCase$submitReactionMessage$1.L$0 = obj;
        return messagesUseCase$submitReactionMessage$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super C44502sSe.Dialog> flowCollector, Continuation<? super Unit> continuation) {
        return ((MessagesUseCase$submitReactionMessage$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:9:0x0043, B:40:0x0106, B:12:0x0058, B:34:0x00e6, B:36:0x00ee, B:41:0x0151, B:42:0x015c, B:15:0x006a, B:28:0x00cb, B:30:0x00cf, B:43:0x015d, B:44:0x0168, B:18:0x007e, B:25:0x00b1, B:21:0x0090), top: B:66:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:9:0x0043, B:40:0x0106, B:12:0x0058, B:34:0x00e6, B:36:0x00ee, B:41:0x0151, B:42:0x015c, B:15:0x006a, B:28:0x00cb, B:30:0x00cf, B:43:0x015d, B:44:0x0168, B:18:0x007e, B:25:0x00b1, B:21:0x0090), top: B:66:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0151 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:9:0x0043, B:40:0x0106, B:12:0x0058, B:34:0x00e6, B:36:0x00ee, B:41:0x0151, B:42:0x015c, B:15:0x006a, B:28:0x00cb, B:30:0x00cf, B:43:0x015d, B:44:0x0168, B:18:0x007e, B:25:0x00b1, B:21:0x0090), top: B:66:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015d A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:9:0x0043, B:40:0x0106, B:12:0x0058, B:34:0x00e6, B:36:0x00ee, B:41:0x0151, B:42:0x015c, B:15:0x006a, B:28:0x00cb, B:30:0x00cf, B:43:0x015d, B:44:0x0168, B:18:0x007e, B:25:0x00b1, B:21:0x0090), top: B:66:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objM7377constructorimpl;
        Object obj2;
        FlowCollector flowCollector;
        Throwable thM7380exceptionOrNullimpl;
        WSSendReactionData wSSendReactionData;
        Throwable th;
        OKMessage oKMessageOLrzqt;
        Throwable th2;
        WSSendReactionData wSSendReactionData2;
        FlowCollector flowCollector2;
        FlowCollector flowCollector3;
        C44502sSe c44502sSe;
        WSSendReactionData wSSendReactionData3;
        WSSendReactionAck wSSendReactionAck;
        WSSendReactionAck wSSendReactionAck2;
        C44502sSe c44502sSe2;
        FlowCollector flowCollector4;
        OKMessage oKMessageOLrzqt2;
        InHouseIMMessageWithReactions inHouseIMMessageWithReactions;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th3) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                flowCollector2 = (FlowCollector) this.L$0;
                C44502sSe c44502sSe3 = this.this$0;
                WSSendReactionData wSSendReactionData4 = this.$wsReactionDataRequest;
                Result.Application application2 = Result.Companion;
                c44502sSe3.fARcdN.OLrzqt();
                C44502sSe.Dialog.StateListAnimator stateListAnimator = C44502sSe.Dialog.StateListAnimator.AEQbTJ;
                this.L$0 = flowCollector2;
                this.L$1 = c44502sSe3;
                this.L$2 = wSSendReactionData4;
                this.L$3 = flowCollector2;
                this.label = 1;
                if (flowCollector2.emit(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
                flowCollector3 = flowCollector2;
                c44502sSe = c44502sSe3;
                wSSendReactionData3 = wSSendReactionData4;
                C44489sRs c44489sRs = c44502sSe.fARcdN;
                WSSendReaction wSSendReaction = new WSSendReaction(wSSendReactionData3);
                this.L$0 = flowCollector2;
                this.L$1 = c44502sSe;
                this.L$2 = flowCollector3;
                this.L$3 = null;
                this.label = 2;
                obj = c44489sRs.OLrzqt(wSSendReaction, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                wSSendReactionAck = (WSSendReactionAck) obj;
                if (wSSendReactionAck == null) {
                    throw new IllegalStateException("send reaction => WebSocket returned null ack".toString());
                }
                this.L$0 = flowCollector2;
                this.L$1 = c44502sSe;
                this.L$2 = flowCollector3;
                this.L$3 = wSSendReactionAck;
                this.label = 3;
                Object objEZpvd = c44502sSe.EZpvd(wSSendReactionAck, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                FlowCollector flowCollector5 = flowCollector3;
                wSSendReactionAck2 = wSSendReactionAck;
                obj = objEZpvd;
                c44502sSe2 = c44502sSe;
                flowCollector4 = flowCollector5;
                InHouseIMMessageWithReactions inHouseIMMessageWithReactions2 = (InHouseIMMessageWithReactions) obj;
                oKMessageOLrzqt2 = C44169sFw.OLrzqt(inHouseIMMessageWithReactions2);
                if (oKMessageOLrzqt2 != null) {
                    throw new IllegalArgumentException("cannot convert to ok message".toString());
                }
                C44502sSe.Dialog.TaskDescription taskDescription = new C44502sSe.Dialog.TaskDescription(oKMessageOLrzqt2);
                this.L$0 = flowCollector2;
                this.L$1 = c44502sSe2;
                this.L$2 = inHouseIMMessageWithReactions2;
                this.L$3 = wSSendReactionAck2;
                this.label = 4;
                if (flowCollector4.emit(taskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
                inHouseIMMessageWithReactions = inHouseIMMessageWithReactions2;
                sRW.KWHzl.AEQbTJ(c44502sSe2.AEQbTJ, "IMChat_Message_SentAck_Success", inHouseIMMessageWithReactions.getImMessageEntity(), C56443yFo.KWHzl(System.currentTimeMillis()), c44502sSe2.copydefault);
                C44124sEe.imLogSync$default("send reaction => notified reaction message[" + wSSendReactionAck2.EZpvd().EZpvd() + "]: sent", null, wSSendReactionAck2.EZpvd().OLrzqt(), 2, null);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                obj2 = objM7377constructorimpl;
                flowCollector = flowCollector2;
                C44502sSe c44502sSe4 = this.this$0;
                WSSendReactionData wSSendReactionData5 = this.$wsReactionDataRequest;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    C44486sRp c44486sRp = c44502sSe4.DbNXlk;
                    String channelId = wSSendReactionData5.getChannelId();
                    long seq = wSSendReactionData5.getSeq();
                    this.L$0 = flowCollector;
                    this.L$1 = obj2;
                    this.L$2 = wSSendReactionData5;
                    this.L$3 = thM7380exceptionOrNullimpl;
                    this.label = 5;
                    obj = c44486sRp.copydefault(channelId, seq, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    wSSendReactionData = wSSendReactionData5;
                    th = thM7380exceptionOrNullimpl;
                    InHouseIMMessageWithReactions inHouseIMMessageWithReactions3 = (InHouseIMMessageWithReactions) obj;
                    oKMessageOLrzqt = inHouseIMMessageWithReactions3 == null ? C44169sFw.OLrzqt(inHouseIMMessageWithReactions3) : null;
                    if (oKMessageOLrzqt != null) {
                        C44502sSe.Dialog.ActionBar actionBar = new C44502sSe.Dialog.ActionBar(oKMessageOLrzqt, th);
                        this.L$0 = obj2;
                        this.L$1 = wSSendReactionData;
                        this.L$2 = th;
                        this.L$3 = null;
                        this.label = 6;
                        if (flowCollector.emit(actionBar, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        th2 = th;
                        wSSendReactionData2 = wSSendReactionData;
                        wSSendReactionData = wSSendReactionData2;
                        th = th2;
                    }
                    C44124sEe.AEQbTJ("send reaction => notified reaction message: failed", th, wSSendReactionData.getChannelId());
                }
                return Unit.INSTANCE;
            case 1:
                flowCollector3 = (FlowCollector) this.L$3;
                WSSendReactionData wSSendReactionData6 = (WSSendReactionData) this.L$2;
                C44502sSe c44502sSe5 = (C44502sSe) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                wSSendReactionData3 = wSSendReactionData6;
                c44502sSe = c44502sSe5;
                C44489sRs c44489sRs2 = c44502sSe.fARcdN;
                WSSendReaction wSSendReaction2 = new WSSendReaction(wSSendReactionData3);
                this.L$0 = flowCollector2;
                this.L$1 = c44502sSe;
                this.L$2 = flowCollector3;
                this.L$3 = null;
                this.label = 2;
                obj = c44489sRs2.OLrzqt(wSSendReaction2, this);
                if (obj == objCopydefault) {
                }
                wSSendReactionAck = (WSSendReactionAck) obj;
                if (wSSendReactionAck == null) {
                }
                break;
            case 2:
                flowCollector3 = (FlowCollector) this.L$2;
                c44502sSe = (C44502sSe) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                wSSendReactionAck = (WSSendReactionAck) obj;
                if (wSSendReactionAck == null) {
                }
                break;
            case 3:
                wSSendReactionAck2 = (WSSendReactionAck) this.L$3;
                flowCollector4 = (FlowCollector) this.L$2;
                c44502sSe2 = (C44502sSe) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                InHouseIMMessageWithReactions inHouseIMMessageWithReactions22 = (InHouseIMMessageWithReactions) obj;
                oKMessageOLrzqt2 = C44169sFw.OLrzqt(inHouseIMMessageWithReactions22);
                if (oKMessageOLrzqt2 != null) {
                }
                break;
            case 4:
                wSSendReactionAck2 = (WSSendReactionAck) this.L$3;
                inHouseIMMessageWithReactions = (InHouseIMMessageWithReactions) this.L$2;
                c44502sSe2 = (C44502sSe) this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                sRW.KWHzl.AEQbTJ(c44502sSe2.AEQbTJ, "IMChat_Message_SentAck_Success", inHouseIMMessageWithReactions.getImMessageEntity(), C56443yFo.KWHzl(System.currentTimeMillis()), c44502sSe2.copydefault);
                C44124sEe.imLogSync$default("send reaction => notified reaction message[" + wSSendReactionAck2.EZpvd().EZpvd() + "]: sent", null, wSSendReactionAck2.EZpvd().OLrzqt(), 2, null);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                obj2 = objM7377constructorimpl;
                flowCollector = flowCollector2;
                C44502sSe c44502sSe42 = this.this$0;
                WSSendReactionData wSSendReactionData52 = this.$wsReactionDataRequest;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 5:
                th = (Throwable) this.L$3;
                wSSendReactionData = (WSSendReactionData) this.L$2;
                obj2 = this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                InHouseIMMessageWithReactions inHouseIMMessageWithReactions32 = (InHouseIMMessageWithReactions) obj;
                if (inHouseIMMessageWithReactions32 == null) {
                }
                if (oKMessageOLrzqt != null) {
                }
                C44124sEe.AEQbTJ("send reaction => notified reaction message: failed", th, wSSendReactionData.getChannelId());
                return Unit.INSTANCE;
            case 6:
                th2 = (Throwable) this.L$2;
                wSSendReactionData2 = (WSSendReactionData) this.L$1;
                C56391yDq.AEQbTJ(obj);
                wSSendReactionData = wSSendReactionData2;
                th = th2;
                C44124sEe.AEQbTJ("send reaction => notified reaction message: failed", th, wSSendReactionData.getChannelId());
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
