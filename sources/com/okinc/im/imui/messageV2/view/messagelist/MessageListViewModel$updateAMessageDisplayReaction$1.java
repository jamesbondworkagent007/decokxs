package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C33129mqd;
import o.C35254nrp;
import o.C35713oAy;
import o.C36558odI;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yDY;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$updateAMessageDisplayReaction$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ WSSendReactionData $data;
    final /* synthetic */ OKMessage $okMessage;
    Object L$0;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$updateAMessageDisplayReaction$1(MessageListViewModel messageListViewModel, OKMessage oKMessage, WSSendReactionData wSSendReactionData, Continuation<? super MessageListViewModel$updateAMessageDisplayReaction$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$okMessage = oKMessage;
        this.$data = wSSendReactionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$updateAMessageDisplayReaction$1(this.this$0, this.$okMessage, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$updateAMessageDisplayReaction$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MessageListViewModel messageListViewModel;
        MessageListViewModel messageListViewModel2;
        List<ReactionDisplay> reactionDisplay;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MessageListViewModel.ActionBar actionBar = this.this$0.AkhnZx;
            if (actionBar != null) {
                messageListViewModel = this.this$0;
                OKMessage oKMessage = this.$okMessage;
                WSSendReactionData wSSendReactionData = this.$data;
                try {
                    Result.Application application = Result.Companion;
                    List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) actionBar.KWHzl().AEQbTJ());
                    Iterator it = listFJNWhG.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (C33129mqd.valueOf(C56443yFo.KWHzl(((C35254nrp) it.next()).OLrzqt().getSeq())) == wSSendReactionData.getSeq()) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        C35254nrp c35254nrp = (C35254nrp) listFJNWhG.get(i2);
                        if (oKMessage == null) {
                            C35713oAy c35713oAy = C35713oAy.KWHzl;
                            List<ReactionDisplay> reactionDisplay2 = c35254nrp.OLrzqt().getReactionDisplay();
                            if (reactionDisplay2 == null) {
                                reactionDisplay2 = yDY.AhwBna();
                            }
                            reactionDisplay = c35713oAy.AEQbTJ(reactionDisplay2, wSSendReactionData);
                        } else {
                            reactionDisplay = oKMessage.getReactionDisplay();
                        }
                        OKMessage oKMessageOLrzqt = c35254nrp.OLrzqt();
                        listFJNWhG.set(i2, c35254nrp.copydefault((CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1) != 0 ? c35254nrp.AYXKKw : oKMessageOLrzqt.copy((262143 & 1) != 0 ? oKMessageOLrzqt.seq : 0L, (262143 & 2) != 0 ? oKMessageOLrzqt.clientMessageId : null, (262143 & 4) != 0 ? oKMessageOLrzqt.targetId : null, (262143 & 8) != 0 ? oKMessageOLrzqt.senderUserId : null, (262143 & 16) != 0 ? oKMessageOLrzqt.messageType : null, (262143 & 32) != 0 ? oKMessageOLrzqt.conversationType : null, (262143 & 64) != 0 ? oKMessageOLrzqt.sentTime : 0L, (262143 & 128) != 0 ? oKMessageOLrzqt.receivedTime : 0L, (262143 & 256) != 0 ? oKMessageOLrzqt.extra : null, (262143 & 512) != 0 ? oKMessageOLrzqt.objectName : null, (262143 & 1024) != 0 ? oKMessageOLrzqt.messageDirection : null, (262143 & 2048) != 0 ? oKMessageOLrzqt.sentStatus : null, (262143 & 4096) != 0 ? oKMessageOLrzqt.content : null, (262143 & 8192) != 0 ? oKMessageOLrzqt.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessageOLrzqt.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessageOLrzqt.isVisible : false, (262143 & 65536) != 0 ? oKMessageOLrzqt.error : null, (262143 & 131072) != 0 ? oKMessageOLrzqt.reactionDisplay : reactionDisplay), (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2) != 0 ? c35254nrp.AEQbTJ : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4) != 0 ? c35254nrp.values : 0, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8) != 0 ? c35254nrp.AhwBna : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16) != 0 ? c35254nrp.valueOf : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32) != 0 ? c35254nrp.djBIcL : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 64) != 0 ? c35254nrp.KWHzl : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 128) != 0 ? c35254nrp.copydefault : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 256) != 0 ? c35254nrp.OLrzqt : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 512) != 0 ? c35254nrp.fJNWhG : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 1024) != 0 ? c35254nrp.AuCTel : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 2048) != 0 ? c35254nrp.isConnected : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 4096) != 0 ? c35254nrp.AkhnZx : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 8192) != 0 ? c35254nrp.DbNXlk : 0, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 16384) != 0 ? c35254nrp.fARcdN : null, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 32768) != 0 ? c35254nrp.gEmmrt : false, (CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 & 65536) != 0 ? c35254nrp.fetchVPNInfo : 0));
                        C36558odI c36558odIKWHzl = actionBar.KWHzl();
                        C36558odI c36558odIAEQbTJ = c36558odIKWHzl.AEQbTJ((32318 & 1) != 0 ? c36558odIKWHzl.AhwBna : listFJNWhG, (32318 & 2) != 0 ? c36558odIKWHzl.KWHzl : null, (32318 & 4) != 0 ? c36558odIKWHzl.DbNXlk : null, (32318 & 8) != 0 ? c36558odIKWHzl.AkhnZx : null, (32318 & 16) != 0 ? c36558odIKWHzl.isConnected : null, (32318 & 32) != 0 ? c36558odIKWHzl.djBIcL : null, (32318 & 64) != 0 ? c36558odIKWHzl.EZpvd : false, (32318 & 128) != 0 ? c36558odIKWHzl.OLrzqt : false, (32318 & 256) != 0 ? c36558odIKWHzl.values : null, (32318 & 512) != 0 ? c36558odIKWHzl.AYXKKw : false, (32318 & 1024) != 0 ? c36558odIKWHzl.gEmmrt : null, (32318 & 2048) != 0 ? c36558odIKWHzl.copydefault : null, (32318 & 4096) != 0 ? c36558odIKWHzl.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odIKWHzl.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odIKWHzl.valueOf : false);
                        pUU.EZpvd("MessageListViewModel", "updateAMessageDisplayReaction setMessageListModel - seq:" + wSSendReactionData.getSeq());
                        MessageListViewModel.ActionBar actionBar2 = new MessageListViewModel.ActionBar(c36558odIAEQbTJ, null);
                        this.L$0 = messageListViewModel;
                        this.label = 1;
                        if (messageListViewModel.EZpvd(actionBar2, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        pUU.valueOf("MessageListViewModel", "updateAMessageDisplayReaction - message not found for seq:" + wSSendReactionData.getSeq());
                    }
                    messageListViewModel2 = messageListViewModel;
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    th = th;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    messageListViewModel2 = messageListViewModel;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        messageListViewModel2 = (MessageListViewModel) this.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            th = th2;
            messageListViewModel = messageListViewModel2;
            Result.Application application22 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            messageListViewModel2 = messageListViewModel;
        }
        this.L$0 = null;
        this.label = 2;
        if (messageListViewModel2.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
