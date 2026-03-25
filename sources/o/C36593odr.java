package o;

import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyAudioMessageDownloadUpdatesToMessageListModel$2;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyAudioMessagePlayStateUpdatesToMessageListModel$2;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyClearMessageEventToMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyClearMessageEventToMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyDeleteMessageEventToMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyDeleteMessageEventToMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyDownloadedMessagesToMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyDownloadedMessagesToMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyMediaMessageSentEventToMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyMediaMessageSentEventToMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyMessageSentEventToMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyMessageSentEventToMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyPrivateTypingIndicator$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyReadReceiptEventToMessageListModel$2;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyRecallEventToMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyRecallEventToMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyRefreshMessageEventToMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyRefreshMessageEventToMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$applyThinkingIndicator$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$createDisclaimerMessage$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$createThinkingMessage$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$initMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$injectDisclaimerMessage$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$injectRmVipWelcomeMessage$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$loadMoreNewerMessagesToMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$loadMoreNewerMessagesToMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$loadMoreOlderMessagesToMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$loadMoreOlderMessagesToMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$refreshMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$refreshMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$reloadMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$reloadMessageListModelForNavigation$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$reloadMessageListModelForNavigation$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$resetTargetMessageSearchKeyInMessageListModel$result$1;
import com.okinc.im.imui.messageV2.manager.MessageListModelManager$updateIsShowMessageStatus$2;
import com.okinc.im.usecase.messagelistmodel.LoadMessageListModelUseCaseV2;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKMessagePushConfig;
import com.okinc.okimcore.model.im.OKPrivacyDisclaimerMessage;
import com.okinc.okimcore.model.im.OKPrivateTypingIndicatorMessage;
import com.okinc.okimcore.model.im.OKRmVipWelcomeMessage;
import com.okinc.okimcore.model.im.OKThinkingIndicatorMessage;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36517ocU;
import o.oEZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36593odr {
    public final oET AYXKKw;
    public final oES AhwBna;
    public final oGH AkhnZx;
    public final C35824oFa AuCTel;
    public final oEV DbNXlk;
    public final oEM EZpvd;
    public final oEN KWHzl;
    public final oEO OLrzqt;
    public final oEK copydefault;
    public final oER djBIcL;
    public final C35805oEi ejfBZ;
    public final oEY fARcdN;
    public final C35825oFb fIwbmz;
    public final LoadMessageListModelUseCaseV2 fJNWhG;
    public final oEZ fetchVPNInfo;
    public final oEP gEmmrt;
    public final C35828oFe getNewProxyInstance;
    public final C35826oFc hDKMBd;
    public final oEU isConnected;
    public final C37708oyt iwGUEr;
    public final C35834oFk uzCIH;
    public final oEQ valueOf;
    public final oCE values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C36593odr(@NotNull C35824oFa c35824oFa, @NotNull oEY oey, @NotNull C35834oFk c35834oFk, @NotNull C35826oFc c35826oFc, @NotNull C35825oFb c35825oFb, @NotNull C35828oFe c35828oFe, @NotNull oER oer, @NotNull oEV oev, @NotNull oES oes, @NotNull oET oet, @NotNull oEM oem, @NotNull oEU oeu, @NotNull oEO oeo, @NotNull oEQ oeq, @NotNull oEP oep, @NotNull oEK oek, @NotNull oEN oen, @NotNull LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV2, @NotNull oCE oce, @NotNull C35805oEi c35805oEi, @NotNull oEZ oez, @NotNull oGH ogh, @yCL(AEQbTJ = "TrackerMessageListUseCase") @NotNull C37708oyt c37708oyt) {
        Intrinsics.checkNotNullParameter(c35824oFa, "");
        Intrinsics.checkNotNullParameter(oey, "");
        Intrinsics.checkNotNullParameter(c35834oFk, "");
        Intrinsics.checkNotNullParameter(c35826oFc, "");
        Intrinsics.checkNotNullParameter(c35825oFb, "");
        Intrinsics.checkNotNullParameter(c35828oFe, "");
        Intrinsics.checkNotNullParameter(oer, "");
        Intrinsics.checkNotNullParameter(oev, "");
        Intrinsics.checkNotNullParameter(oes, "");
        Intrinsics.checkNotNullParameter(oet, "");
        Intrinsics.checkNotNullParameter(oem, "");
        Intrinsics.checkNotNullParameter(oeu, "");
        Intrinsics.checkNotNullParameter(oeo, "");
        Intrinsics.checkNotNullParameter(oeq, "");
        Intrinsics.checkNotNullParameter(oep, "");
        Intrinsics.checkNotNullParameter(oek, "");
        Intrinsics.checkNotNullParameter(oen, "");
        Intrinsics.checkNotNullParameter(loadMessageListModelUseCaseV2, "");
        Intrinsics.checkNotNullParameter(oce, "");
        Intrinsics.checkNotNullParameter(c35805oEi, "");
        Intrinsics.checkNotNullParameter(oez, "");
        Intrinsics.checkNotNullParameter(ogh, "");
        Intrinsics.checkNotNullParameter(c37708oyt, "");
        this.AuCTel = c35824oFa;
        this.fARcdN = oey;
        this.uzCIH = c35834oFk;
        this.hDKMBd = c35826oFc;
        this.fIwbmz = c35825oFb;
        this.getNewProxyInstance = c35828oFe;
        this.djBIcL = oer;
        this.DbNXlk = oev;
        this.AhwBna = oes;
        this.AYXKKw = oet;
        this.EZpvd = oem;
        this.isConnected = oeu;
        this.OLrzqt = oeo;
        this.valueOf = oeq;
        this.gEmmrt = oep;
        this.copydefault = oek;
        this.KWHzl = oen;
        this.fJNWhG = loadMessageListModelUseCaseV2;
        this.values = oce;
        this.ejfBZ = c35805oEi;
        this.fetchVPNInfo = oez;
        this.AkhnZx = ogh;
        this.iwGUEr = c37708oyt;
    }

    /* JADX INFO: renamed from: o.odr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.odr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(C36558odI c36558odI, Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$applyThinkingIndicator$1 messageListModelManager$applyThinkingIndicator$1;
        java.util.List list;
        C36558odI c36558odI2;
        if (continuation instanceof MessageListModelManager$applyThinkingIndicator$1) {
            messageListModelManager$applyThinkingIndicator$1 = (MessageListModelManager$applyThinkingIndicator$1) continuation;
            int i = messageListModelManager$applyThinkingIndicator$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$applyThinkingIndicator$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$applyThinkingIndicator$1 = new MessageListModelManager$applyThinkingIndicator$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = messageListModelManager$applyThinkingIndicator$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListModelManager$applyThinkingIndicator$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objKWHzl);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) messageListModelManager$applyThinkingIndicator$1.L$1;
            C36558odI c36558odI3 = (C36558odI) messageListModelManager$applyThinkingIndicator$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            c36558odI2 = c36558odI3;
            C36558odI c36558odIAEQbTJ = c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) C56402yEa.EZpvd((C35254nrp) objKWHzl)), (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : true, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
            pUU.KWHzl("MessageListModelManager", "applyThinkingIndicator: Added thinking indicator, resultMessageListSize=" + c36558odIAEQbTJ.AEQbTJ().size());
            java.util.List<C35254nrp> listAEQbTJ = c36558odIAEQbTJ.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listAEQbTJ) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((C35254nrp) obj).OLrzqt().getClientMessageId(), (java.lang.Object) "private_typing_indicator_message")) {
                    arrayList.add(obj);
                }
            }
            return c36558odIAEQbTJ.AEQbTJ((32318 & 1) != 0 ? c36558odIAEQbTJ.AhwBna : arrayList, (32318 & 2) != 0 ? c36558odIAEQbTJ.KWHzl : null, (32318 & 4) != 0 ? c36558odIAEQbTJ.DbNXlk : null, (32318 & 8) != 0 ? c36558odIAEQbTJ.AkhnZx : null, (32318 & 16) != 0 ? c36558odIAEQbTJ.isConnected : null, (32318 & 32) != 0 ? c36558odIAEQbTJ.djBIcL : null, (32318 & 64) != 0 ? c36558odIAEQbTJ.EZpvd : false, (32318 & 128) != 0 ? c36558odIAEQbTJ.OLrzqt : false, (32318 & 256) != 0 ? c36558odIAEQbTJ.values : null, (32318 & 512) != 0 ? c36558odIAEQbTJ.AYXKKw : false, (32318 & 1024) != 0 ? c36558odIAEQbTJ.gEmmrt : null, (32318 & 2048) != 0 ? c36558odIAEQbTJ.copydefault : null, (32318 & 4096) != 0 ? c36558odIAEQbTJ.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odIAEQbTJ.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odIAEQbTJ.valueOf : false);
        }
        C56391yDq.AEQbTJ(objKWHzl);
        OKConversation oKConversationOLrzqt = c36558odI.OLrzqt();
        GroupTagType groupType = oKConversationOLrzqt.getGroupType();
        OKConversationType conversationType = oKConversationOLrzqt.getConversationType();
        boolean zIsConnected = c36558odI.isConnected();
        int size = c36558odI.AEQbTJ().size();
        pUU.KWHzl("MessageListModelManager", "applyThinkingIndicator: channelId=" + oKConversationOLrzqt.getTargetId() + ", groupType=" + groupType + ", isAgentProcessing=" + zIsConnected + ", messageListSize=" + size);
        if (groupType == GroupTagType.OTC_AGENT && zIsConnected) {
            java.util.List<C35254nrp> listAEQbTJ2 = c36558odI.AEQbTJ();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : listAEQbTJ2) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((C35254nrp) obj2).OLrzqt().getClientMessageId(), (java.lang.Object) "thinking_indicator_message")) {
                    arrayList2.add(obj2);
                }
            }
            messageListModelManager$applyThinkingIndicator$1.L$0 = c36558odI;
            messageListModelManager$applyThinkingIndicator$1.L$1 = arrayList2;
            messageListModelManager$applyThinkingIndicator$1.label = 1;
            objKWHzl = KWHzl(conversationType, messageListModelManager$applyThinkingIndicator$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            list = arrayList2;
            c36558odI2 = c36558odI;
            C36558odI c36558odIAEQbTJ2 = c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) C56402yEa.EZpvd((C35254nrp) objKWHzl)), (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : true, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
            pUU.KWHzl("MessageListModelManager", "applyThinkingIndicator: Added thinking indicator, resultMessageListSize=" + c36558odIAEQbTJ2.AEQbTJ().size());
            java.util.List<C35254nrp> listAEQbTJ3 = c36558odIAEQbTJ2.AEQbTJ();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            while (r1.hasNext()) {
            }
            return c36558odIAEQbTJ2.AEQbTJ((32318 & 1) != 0 ? c36558odIAEQbTJ2.AhwBna : arrayList3, (32318 & 2) != 0 ? c36558odIAEQbTJ2.KWHzl : null, (32318 & 4) != 0 ? c36558odIAEQbTJ2.DbNXlk : null, (32318 & 8) != 0 ? c36558odIAEQbTJ2.AkhnZx : null, (32318 & 16) != 0 ? c36558odIAEQbTJ2.isConnected : null, (32318 & 32) != 0 ? c36558odIAEQbTJ2.djBIcL : null, (32318 & 64) != 0 ? c36558odIAEQbTJ2.EZpvd : false, (32318 & 128) != 0 ? c36558odIAEQbTJ2.OLrzqt : false, (32318 & 256) != 0 ? c36558odIAEQbTJ2.values : null, (32318 & 512) != 0 ? c36558odIAEQbTJ2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odIAEQbTJ2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odIAEQbTJ2.copydefault : null, (32318 & 4096) != 0 ? c36558odIAEQbTJ2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odIAEQbTJ2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odIAEQbTJ2.valueOf : false);
        }
        java.util.List<C35254nrp> listAEQbTJ4 = c36558odI.AEQbTJ();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : listAEQbTJ4) {
            if (!Intrinsics.EZpvd((java.lang.Object) ((C35254nrp) obj3).OLrzqt().getClientMessageId(), (java.lang.Object) "thinking_indicator_message")) {
                arrayList4.add(obj3);
            }
        }
        C36558odI c36558odIAEQbTJ3 = c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : arrayList4, (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI.valueOf : false);
        pUU.KWHzl("MessageListModelManager", "applyThinkingIndicator: Removed thinking indicator, resultMessageListSize=" + c36558odIAEQbTJ3.AEQbTJ().size());
        messageListModelManager$applyThinkingIndicator$1.label = 2;
        objKWHzl = KWHzl(c36558odIAEQbTJ3, messageListModelManager$applyThinkingIndicator$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(C36558odI c36558odI, Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$applyPrivateTypingIndicator$1 messageListModelManager$applyPrivateTypingIndicator$1;
        C36558odI c36558odI2;
        java.util.List list;
        if (continuation instanceof MessageListModelManager$applyPrivateTypingIndicator$1) {
            messageListModelManager$applyPrivateTypingIndicator$1 = (MessageListModelManager$applyPrivateTypingIndicator$1) continuation;
            int i = messageListModelManager$applyPrivateTypingIndicator$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$applyPrivateTypingIndicator$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$applyPrivateTypingIndicator$1 = new MessageListModelManager$applyPrivateTypingIndicator$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = messageListModelManager$applyPrivateTypingIndicator$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListModelManager$applyPrivateTypingIndicator$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            OKConversation oKConversationOLrzqt = c36558odI.OLrzqt();
            OKConversationType conversationType = oKConversationOLrzqt.getConversationType();
            java.util.List<C35254nrp> listAEQbTJ = c36558odI.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listAEQbTJ) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((C35254nrp) obj).OLrzqt().getClientMessageId(), (java.lang.Object) "private_typing_indicator_message")) {
                    arrayList.add(obj);
                }
            }
            OKConversationType oKConversationType = OKConversationType.PRIVATE;
            boolean z = conversationType == oKConversationType && c36558odI.DbNXlk();
            if (conversationType != oKConversationType) {
                return c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : arrayList, (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI.valueOf : false);
            }
            if (!z) {
                return c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : arrayList, (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI.valueOf : false);
            }
            java.lang.String targetId = oKConversationOLrzqt.getTargetId();
            messageListModelManager$applyPrivateTypingIndicator$1.L$0 = c36558odI;
            messageListModelManager$applyPrivateTypingIndicator$1.L$1 = arrayList;
            messageListModelManager$applyPrivateTypingIndicator$1.label = 1;
            objEZpvd = EZpvd(targetId, conversationType, messageListModelManager$applyPrivateTypingIndicator$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c36558odI2 = c36558odI;
            list = arrayList;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) messageListModelManager$applyPrivateTypingIndicator$1.L$1;
            C36558odI c36558odI3 = (C36558odI) messageListModelManager$applyPrivateTypingIndicator$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            c36558odI2 = c36558odI3;
        }
        return c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) C56402yEa.EZpvd((C35254nrp) objEZpvd)), (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : true, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
    }

    public final java.lang.Object copydefault(@NotNull C36558odI c36558odI, boolean z, @NotNull Continuation<? super C36558odI> continuation) {
        return AEQbTJ(c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : null, (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : z, (32318 & 16384) != 0 ? c36558odI.valueOf : false), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull C36558odI c36558odI, boolean z, @NotNull Continuation<? super C36558odI> continuation) {
        return AEQbTJ(c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : null, (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI.valueOf : z), continuation);
    }

    public static /* synthetic */ java.lang.Object initMessageListModel$default(C36593odr c36593odr, java.lang.String str, java.lang.Long l, java.lang.String str2, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c36593odr.EZpvd(str, l, str2, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [212=4] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119 A[PHI: r15
  0x0119: PHI (r15v17 java.lang.Object) = (r15v14 java.lang.Object), (r15v1 java.lang.Object) binds: [B:43:0x0116, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, java.lang.Long l, java.lang.String str2, boolean z, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$initMessageListModel$1 messageListModelManager$initMessageListModel$1;
        C36593odr c36593odr;
        C36558odI c36558odI;
        java.lang.String str3;
        C36593odr c36593odr2;
        java.lang.String str4;
        java.lang.String str5;
        if (continuation instanceof MessageListModelManager$initMessageListModel$1) {
            messageListModelManager$initMessageListModel$1 = (MessageListModelManager$initMessageListModel$1) continuation;
            int i = messageListModelManager$initMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$initMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$initMessageListModel$1 = new MessageListModelManager$initMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = messageListModelManager$initMessageListModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListModelManager$initMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("MessageListModelManager", "initMessageListModel: channelId=" + str + ", targetMessageId=" + l + ", searchKey=" + str2 + ", isAgentProcessing=" + z);
            C35824oFa c35824oFa = this.AuCTel;
            messageListModelManager$initMessageListModel$1.L$0 = this;
            messageListModelManager$initMessageListModel$1.L$1 = str;
            messageListModelManager$initMessageListModel$1.L$2 = l;
            messageListModelManager$initMessageListModel$1.L$3 = str2;
            messageListModelManager$initMessageListModel$1.label = 1;
            objEZpvd = c35824oFa.EZpvd(str, l, str2, messageListModelManager$initMessageListModel$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c36593odr = this;
        } else if (i2 == 1) {
            str2 = (java.lang.String) messageListModelManager$initMessageListModel$1.L$3;
            l = (java.lang.Long) messageListModelManager$initMessageListModel$1.L$2;
            str = (java.lang.String) messageListModelManager$initMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$initMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        C56391yDq.AEQbTJ(objEZpvd);
                    }
                    if (i2 == 5) {
                        C56391yDq.AEQbTJ(objEZpvd);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c36593odr2 = (C36593odr) messageListModelManager$initMessageListModel$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c36558odI = (C36558odI) objEZpvd;
                messageListModelManager$initMessageListModel$1.L$0 = null;
                messageListModelManager$initMessageListModel$1.L$1 = null;
                messageListModelManager$initMessageListModel$1.L$2 = null;
                messageListModelManager$initMessageListModel$1.L$3 = null;
                messageListModelManager$initMessageListModel$1.label = 4;
                objEZpvd = c36593odr2.AEQbTJ(c36558odI, messageListModelManager$initMessageListModel$1);
                return objEZpvd != objCopydefault ? objCopydefault : objEZpvd;
            }
            str5 = (java.lang.String) messageListModelManager$initMessageListModel$1.L$3;
            l = (java.lang.Long) messageListModelManager$initMessageListModel$1.L$2;
            str3 = (java.lang.String) messageListModelManager$initMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$initMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            c36558odI = (C36558odI) objEZpvd;
            C36593odr c36593odr3 = c36593odr;
            str4 = str5;
            c36593odr2 = c36593odr3;
            if (c36593odr2.copydefault(str3, c36558odI, str4, l)) {
                Intrinsics.copydefault((java.lang.Object) str3);
                messageListModelManager$initMessageListModel$1.L$0 = c36593odr2;
                messageListModelManager$initMessageListModel$1.L$1 = null;
                messageListModelManager$initMessageListModel$1.L$2 = null;
                messageListModelManager$initMessageListModel$1.L$3 = null;
                messageListModelManager$initMessageListModel$1.label = 3;
                objEZpvd = c36593odr2.copydefault(c36558odI, str3, messageListModelManager$initMessageListModel$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c36558odI = (C36558odI) objEZpvd;
            }
            messageListModelManager$initMessageListModel$1.L$0 = null;
            messageListModelManager$initMessageListModel$1.L$1 = null;
            messageListModelManager$initMessageListModel$1.L$2 = null;
            messageListModelManager$initMessageListModel$1.L$3 = null;
            messageListModelManager$initMessageListModel$1.label = 4;
            objEZpvd = c36593odr2.AEQbTJ(c36558odI, messageListModelManager$initMessageListModel$1);
            if (objEZpvd != objCopydefault) {
            }
        }
        c36558odI = (C36558odI) objEZpvd;
        if (c36558odI.EZpvd()) {
            messageListModelManager$initMessageListModel$1.L$0 = null;
            messageListModelManager$initMessageListModel$1.L$1 = null;
            messageListModelManager$initMessageListModel$1.L$2 = null;
            messageListModelManager$initMessageListModel$1.L$3 = null;
            messageListModelManager$initMessageListModel$1.label = 5;
            objEZpvd = c36593odr.AEQbTJ(c36558odI, messageListModelManager$initMessageListModel$1);
            return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
        }
        if (c36593odr.EZpvd(str, c36558odI, str2, l)) {
            Intrinsics.copydefault((java.lang.Object) str);
            messageListModelManager$initMessageListModel$1.L$0 = c36593odr;
            messageListModelManager$initMessageListModel$1.L$1 = str;
            messageListModelManager$initMessageListModel$1.L$2 = l;
            messageListModelManager$initMessageListModel$1.L$3 = str2;
            messageListModelManager$initMessageListModel$1.label = 2;
            objEZpvd = c36593odr.AEQbTJ(c36558odI, str, messageListModelManager$initMessageListModel$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            java.lang.String str6 = str2;
            str3 = str;
            str5 = str6;
            c36558odI = (C36558odI) objEZpvd;
            C36593odr c36593odr32 = c36593odr;
            str4 = str5;
            c36593odr2 = c36593odr32;
            if (c36593odr2.copydefault(str3, c36558odI, str4, l)) {
            }
            messageListModelManager$initMessageListModel$1.L$0 = null;
            messageListModelManager$initMessageListModel$1.L$1 = null;
            messageListModelManager$initMessageListModel$1.L$2 = null;
            messageListModelManager$initMessageListModel$1.L$3 = null;
            messageListModelManager$initMessageListModel$1.label = 4;
            objEZpvd = c36593odr2.AEQbTJ(c36558odI, messageListModelManager$initMessageListModel$1);
            if (objEZpvd != objCopydefault) {
            }
        } else {
            java.lang.String str7 = str2;
            str3 = str;
            c36593odr2 = c36593odr;
            str4 = str7;
            if (c36593odr2.copydefault(str3, c36558odI, str4, l)) {
            }
            messageListModelManager$initMessageListModel$1.L$0 = null;
            messageListModelManager$initMessageListModel$1.L$1 = null;
            messageListModelManager$initMessageListModel$1.L$2 = null;
            messageListModelManager$initMessageListModel$1.L$3 = null;
            messageListModelManager$initMessageListModel$1.label = 4;
            objEZpvd = c36593odr2.AEQbTJ(c36558odI, messageListModelManager$initMessageListModel$1);
            if (objEZpvd != objCopydefault) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(C36558odI c36558odI, java.lang.String str, Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$injectRmVipWelcomeMessage$1 messageListModelManager$injectRmVipWelcomeMessage$1;
        java.util.List list;
        C36558odI c36558odI2;
        if (continuation instanceof MessageListModelManager$injectRmVipWelcomeMessage$1) {
            messageListModelManager$injectRmVipWelcomeMessage$1 = (MessageListModelManager$injectRmVipWelcomeMessage$1) continuation;
            int i = messageListModelManager$injectRmVipWelcomeMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$injectRmVipWelcomeMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$injectRmVipWelcomeMessage$1 = new MessageListModelManager$injectRmVipWelcomeMessage$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = messageListModelManager$injectRmVipWelcomeMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListModelManager$injectRmVipWelcomeMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.util.List<C35254nrp> listAEQbTJ = c36558odI.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listAEQbTJ) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((C35254nrp) obj).OLrzqt().getClientMessageId(), (java.lang.Object) "welcome_system_message")) {
                    arrayList.add(obj);
                }
            }
            OKConversationType conversationType = c36558odI.OLrzqt().getConversationType();
            messageListModelManager$injectRmVipWelcomeMessage$1.L$0 = c36558odI;
            messageListModelManager$injectRmVipWelcomeMessage$1.L$1 = arrayList;
            messageListModelManager$injectRmVipWelcomeMessage$1.label = 1;
            objKWHzl = KWHzl(str, conversationType, messageListModelManager$injectRmVipWelcomeMessage$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            list = arrayList;
            c36558odI2 = c36558odI;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) messageListModelManager$injectRmVipWelcomeMessage$1.L$1;
            C36558odI c36558odI3 = (C36558odI) messageListModelManager$injectRmVipWelcomeMessage$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            c36558odI2 = c36558odI3;
        }
        return c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd((C35254nrp) objKWHzl), (java.lang.Iterable) list), (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
    }

    public final java.lang.Object KWHzl(java.lang.String str, OKConversationType oKConversationType, Continuation<? super C35254nrp> continuation) {
        return this.AkhnZx.EZpvd(new OKMessage(0L, "welcome_system_message", str, (java.lang.String) null, (java.lang.String) null, oKConversationType, 0L, 0L, (java.lang.String) null, (java.lang.String) null, OKMessage.MessageDirection.SEND, (OKMessage.SentStatus) null, (OKMessageContent) new OKRmVipWelcomeMessage(), (OKMessagePushConfig) null, (java.lang.String) null, false, (java.lang.Integer) null, (java.util.List) null, 256984, (DefaultConstructorMarker) null), (256 & 2) != 0 ? yDY.AhwBna() : null, (256 & 4) != 0 ? null : null, (256 & 8) != 0 ? null : null, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? null : null, (256 & 64) != 0 ? null : null, (256 & 128) != 0 ? 0 : null, (256 & 256) != 0 ? null : null, continuation);
    }

    public final boolean copydefault(java.lang.String str, C36558odI c36558odI, java.lang.String str2, java.lang.Long l) {
        GroupTagType groupType = c36558odI.OLrzqt().getGroupType();
        boolean z = str != null && str2 == null && l == null && groupType != GroupTagType.VIDEO_CALL_CHAT_GROUP;
        pUU.KWHzl("MessageListModelManager", "shouldShowDisclaimer: channelId=" + str + ", searchKey=" + str2 + ", targetMessageId=" + l + ", groupType=" + groupType + ", result=" + z);
        return z;
    }

    public final boolean EZpvd(java.lang.String str, C36558odI c36558odI, java.lang.String str2, java.lang.Long l) {
        return str != null && str2 == null && l == null && c36558odI.OLrzqt().getGroupType() == GroupTagType.RM_VIP_GROUP && !C44170sFx.AEQbTJ(c36558odI.OLrzqt());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(C36558odI c36558odI, java.lang.String str, Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$injectDisclaimerMessage$1 messageListModelManager$injectDisclaimerMessage$1;
        C36558odI c36558odI2;
        java.util.List list;
        if (continuation instanceof MessageListModelManager$injectDisclaimerMessage$1) {
            messageListModelManager$injectDisclaimerMessage$1 = (MessageListModelManager$injectDisclaimerMessage$1) continuation;
            int i = messageListModelManager$injectDisclaimerMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$injectDisclaimerMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$injectDisclaimerMessage$1 = new MessageListModelManager$injectDisclaimerMessage$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = messageListModelManager$injectDisclaimerMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListModelManager$injectDisclaimerMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            OKConversationType conversationType = c36558odI.OLrzqt().getConversationType();
            pUU.KWHzl("MessageListModelManager", "injectDisclaimerMessage: channelId=" + str + ", conversationType=" + conversationType + ", originalMessageListSize=" + c36558odI.AEQbTJ().size());
            java.util.List<C35254nrp> listAEQbTJ = c36558odI.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listAEQbTJ) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((C35254nrp) obj).OLrzqt().getClientMessageId(), (java.lang.Object) "disclaimer_system_message")) {
                    arrayList.add(obj);
                }
            }
            pUU.KWHzl("MessageListModelManager", "injectDisclaimerMessage: Filtered existing disclaimers, filteredListSize=" + arrayList.size());
            messageListModelManager$injectDisclaimerMessage$1.L$0 = c36558odI;
            messageListModelManager$injectDisclaimerMessage$1.L$1 = arrayList;
            messageListModelManager$injectDisclaimerMessage$1.label = 1;
            objOLrzqt = OLrzqt(str, conversationType, messageListModelManager$injectDisclaimerMessage$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c36558odI2 = c36558odI;
            list = arrayList;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (java.util.List) messageListModelManager$injectDisclaimerMessage$1.L$1;
            C36558odI c36558odI3 = (C36558odI) messageListModelManager$injectDisclaimerMessage$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            c36558odI2 = c36558odI3;
        }
        C36558odI c36558odIAEQbTJ = c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd((C35254nrp) objOLrzqt), (java.lang.Iterable) list), (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
        pUU.KWHzl("MessageListModelManager", "injectDisclaimerMessage: Disclaimer injected, resultMessageListSize=" + c36558odIAEQbTJ.AEQbTJ().size());
        return c36558odIAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, OKConversationType oKConversationType, Continuation<? super C35254nrp> continuation) throws java.lang.Throwable {
        MessageListModelManager$createDisclaimerMessage$1 messageListModelManager$createDisclaimerMessage$1;
        java.lang.String str2;
        java.lang.Object objEZpvd;
        if (continuation instanceof MessageListModelManager$createDisclaimerMessage$1) {
            messageListModelManager$createDisclaimerMessage$1 = (MessageListModelManager$createDisclaimerMessage$1) continuation;
            int i = messageListModelManager$createDisclaimerMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$createDisclaimerMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$createDisclaimerMessage$1 = new MessageListModelManager$createDisclaimerMessage$1(this, continuation);
            }
        }
        MessageListModelManager$createDisclaimerMessage$1 messageListModelManager$createDisclaimerMessage$12 = messageListModelManager$createDisclaimerMessage$1;
        java.lang.Object obj = messageListModelManager$createDisclaimerMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListModelManager$createDisclaimerMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MessageListModelManager", "createDisclaimerMessage: channelId=" + str + ", conversationType=" + oKConversationType);
            OKMessage oKMessage = new OKMessage(0L, "disclaimer_system_message", str, (java.lang.String) null, (java.lang.String) null, oKConversationType, 0L, 0L, (java.lang.String) null, (java.lang.String) null, OKMessage.MessageDirection.SEND, (OKMessage.SentStatus) null, (OKMessageContent) new OKPrivacyDisclaimerMessage(), (OKMessagePushConfig) null, (java.lang.String) null, false, (java.lang.Integer) null, (java.util.List) null, 256984, (DefaultConstructorMarker) null);
            oGH ogh = this.AkhnZx;
            messageListModelManager$createDisclaimerMessage$12.label = 1;
            str2 = "MessageListModelManager";
            objEZpvd = ogh.EZpvd(oKMessage, (256 & 2) != 0 ? yDY.AhwBna() : null, (256 & 4) != 0 ? null : null, (256 & 8) != 0 ? null : null, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? null : null, (256 & 64) != 0 ? null : null, (256 & 128) != 0 ? 0 : null, (256 & 256) != 0 ? null : null, messageListModelManager$createDisclaimerMessage$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
            str2 = "MessageListModelManager";
        }
        C35254nrp c35254nrp = (C35254nrp) objEZpvd;
        pUU.KWHzl(str2, "createDisclaimerMessage: Disclaimer message created");
        return c35254nrp;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(OKConversationType oKConversationType, Continuation<? super C35254nrp> continuation) throws java.lang.Throwable {
        MessageListModelManager$createThinkingMessage$1 messageListModelManager$createThinkingMessage$1;
        java.lang.String str;
        java.lang.Object objEZpvd;
        if (continuation instanceof MessageListModelManager$createThinkingMessage$1) {
            messageListModelManager$createThinkingMessage$1 = (MessageListModelManager$createThinkingMessage$1) continuation;
            int i = messageListModelManager$createThinkingMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$createThinkingMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$createThinkingMessage$1 = new MessageListModelManager$createThinkingMessage$1(this, continuation);
            }
        }
        MessageListModelManager$createThinkingMessage$1 messageListModelManager$createThinkingMessage$12 = messageListModelManager$createThinkingMessage$1;
        java.lang.Object obj = messageListModelManager$createThinkingMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListModelManager$createThinkingMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MessageListModelManager", "createThinkingMessage: conversationType=" + oKConversationType);
            OKMessage oKMessage = new OKMessage(Long.MAX_VALUE, "thinking_indicator_message", "", (java.lang.String) null, (java.lang.String) null, oKConversationType, 0L, 0L, (java.lang.String) null, (java.lang.String) null, OKMessage.MessageDirection.RECEIVE, (OKMessage.SentStatus) null, (OKMessageContent) new OKThinkingIndicatorMessage(), (OKMessagePushConfig) null, (java.lang.String) null, false, (java.lang.Integer) null, (java.util.List) null, 256984, (DefaultConstructorMarker) null);
            oGH ogh = this.AkhnZx;
            messageListModelManager$createThinkingMessage$12.label = 1;
            str = "MessageListModelManager";
            objEZpvd = ogh.EZpvd(oKMessage, (256 & 2) != 0 ? yDY.AhwBna() : null, (256 & 4) != 0 ? null : null, (256 & 8) != 0 ? null : null, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? null : null, (256 & 64) != 0 ? null : null, (256 & 128) != 0 ? 0 : null, (256 & 256) != 0 ? null : null, messageListModelManager$createThinkingMessage$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
            str = "MessageListModelManager";
        }
        C35254nrp c35254nrp = (C35254nrp) objEZpvd;
        pUU.KWHzl(str, "createThinkingMessage: Thinking indicator message created");
        return c35254nrp;
    }

    public final java.lang.Object EZpvd(java.lang.String str, OKConversationType oKConversationType, Continuation<? super C35254nrp> continuation) {
        return this.AkhnZx.EZpvd(new OKMessage(Long.MAX_VALUE, "private_typing_indicator_message", str, (java.lang.String) null, (java.lang.String) null, oKConversationType, 0L, 0L, (java.lang.String) null, (java.lang.String) null, OKMessage.MessageDirection.RECEIVE, (OKMessage.SentStatus) null, (OKMessageContent) new OKPrivateTypingIndicatorMessage(), (OKMessagePushConfig) null, (java.lang.String) null, false, (java.lang.Integer) null, (java.util.List) null, 256984, (DefaultConstructorMarker) null), (256 & 2) != 0 ? yDY.AhwBna() : null, (256 & 4) != 0 ? null : null, (256 & 8) != 0 ? null : null, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? null : null, (256 & 64) != 0 ? null : null, (256 & 128) != 0 ? 0 : null, (256 & 256) != 0 ? null : null, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C36558odI c36558odI, long j, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$reloadMessageListModelForNavigation$1 messageListModelManager$reloadMessageListModelForNavigation$1;
        C36558odI c36558odI2;
        C36593odr c36593odr;
        if (continuation instanceof MessageListModelManager$reloadMessageListModelForNavigation$1) {
            messageListModelManager$reloadMessageListModelForNavigation$1 = (MessageListModelManager$reloadMessageListModelForNavigation$1) continuation;
            int i = messageListModelManager$reloadMessageListModelForNavigation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$reloadMessageListModelForNavigation$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$reloadMessageListModelForNavigation$1 = new MessageListModelManager$reloadMessageListModelForNavigation$1(this, continuation);
            }
        }
        MessageListModelManager$reloadMessageListModelForNavigation$1 messageListModelManager$reloadMessageListModelForNavigation$12 = messageListModelManager$reloadMessageListModelForNavigation$1;
        java.lang.Object objCopydefault = messageListModelManager$reloadMessageListModelForNavigation$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$reloadMessageListModelForNavigation$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            messageListModelManager$reloadMessageListModelForNavigation$12.L$0 = this;
            c36558odI2 = c36558odI;
            messageListModelManager$reloadMessageListModelForNavigation$12.L$1 = c36558odI2;
            messageListModelManager$reloadMessageListModelForNavigation$12.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$reloadMessageListModelForNavigation$result$1(this, c36558odI, j, null), 1, new java.lang.Object[]{c36558odI}, messageListModelManager$reloadMessageListModelForNavigation$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c36593odr = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c36558odI2 = (C36558odI) messageListModelManager$reloadMessageListModelForNavigation$12.L$1;
            c36593odr = (C36593odr) messageListModelManager$reloadMessageListModelForNavigation$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C36558odI c36558odI3 = (C36558odI) objCopydefault;
        C36558odI c36558odIAEQbTJ = c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : null, (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : c36558odI2.isConnected(), (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
        messageListModelManager$reloadMessageListModelForNavigation$12.L$0 = null;
        messageListModelManager$reloadMessageListModelForNavigation$12.L$1 = null;
        messageListModelManager$reloadMessageListModelForNavigation$12.label = 2;
        objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$reloadMessageListModelForNavigation$12);
        return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
    }

    public static /* synthetic */ java.lang.Object reloadMessageListModel$default(C36593odr c36593odr, java.lang.String str, java.lang.Long l, java.lang.String str2, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c36593odr.OLrzqt(str, l, str2, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131 A[PHI: r2
  0x0131: PHI (r2v19 java.lang.Object) = (r2v18 java.lang.Object), (r2v1 java.lang.Object) binds: [B:41:0x012e, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, java.lang.Long l, java.lang.String str2, boolean z, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$reloadMessageListModel$1 messageListModelManager$reloadMessageListModel$1;
        java.lang.Long l2;
        java.lang.String str3;
        boolean z2;
        C36593odr c36593odr;
        OKConversation oKConversation;
        OKConversation oKConversation2;
        C36593odr c36593odr2;
        boolean z3;
        OKMessage oKMessage;
        OKConversation oKConversation3;
        java.lang.String str4;
        java.lang.Object objEZpvd;
        boolean z4;
        C36593odr c36593odr3;
        java.lang.String str5 = str;
        if (continuation instanceof MessageListModelManager$reloadMessageListModel$1) {
            messageListModelManager$reloadMessageListModel$1 = (MessageListModelManager$reloadMessageListModel$1) continuation;
            int i = messageListModelManager$reloadMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$reloadMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$reloadMessageListModel$1 = new MessageListModelManager$reloadMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = messageListModelManager$reloadMessageListModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListModelManager$reloadMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (str5 != null) {
                oCE oce = this.values;
                messageListModelManager$reloadMessageListModel$1.L$0 = this;
                messageListModelManager$reloadMessageListModel$1.L$1 = str5;
                l2 = l;
                messageListModelManager$reloadMessageListModel$1.L$2 = l2;
                str3 = str2;
                messageListModelManager$reloadMessageListModel$1.L$3 = str3;
                z2 = z;
                messageListModelManager$reloadMessageListModel$1.Z$0 = z2;
                messageListModelManager$reloadMessageListModel$1.label = 1;
                objOLrzqt = oce.OLrzqt(str5, messageListModelManager$reloadMessageListModel$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c36593odr = this;
            } else {
                l2 = l;
                str3 = str2;
                z2 = z;
                c36593odr = this;
                oKConversation = null;
                if (oKConversation != null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                if (l2 != null) {
                    l2.longValue();
                    C35805oEi c35805oEi = c36593odr.ejfBZ;
                    long jLongValue = l2.longValue();
                    messageListModelManager$reloadMessageListModel$1.L$0 = c36593odr;
                    messageListModelManager$reloadMessageListModel$1.L$1 = str3;
                    messageListModelManager$reloadMessageListModel$1.L$2 = oKConversation;
                    messageListModelManager$reloadMessageListModel$1.L$3 = null;
                    messageListModelManager$reloadMessageListModel$1.Z$0 = z2;
                    messageListModelManager$reloadMessageListModel$1.label = 2;
                    java.lang.Object objOLrzqt2 = c35805oEi.OLrzqt(str5, jLongValue, messageListModelManager$reloadMessageListModel$1);
                    if (objOLrzqt2 == objCopydefault) {
                        return objCopydefault;
                    }
                    oKConversation3 = oKConversation;
                    str4 = str3;
                    objOLrzqt = objOLrzqt2;
                    z3 = z2;
                    str3 = str4;
                    oKConversation2 = oKConversation3;
                    C36593odr c36593odr4 = c36593odr;
                    oKMessage = (OKMessage) objOLrzqt;
                    c36593odr2 = c36593odr4;
                    LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV2 = c36593odr2.fJNWhG;
                    LoadMessageListModelUseCaseV2.ExecuteScenario executeScenario = LoadMessageListModelUseCaseV2.ExecuteScenario.RELOAD;
                    messageListModelManager$reloadMessageListModel$1.L$0 = c36593odr2;
                    messageListModelManager$reloadMessageListModel$1.L$1 = null;
                    messageListModelManager$reloadMessageListModel$1.L$2 = null;
                    messageListModelManager$reloadMessageListModel$1.L$3 = null;
                    messageListModelManager$reloadMessageListModel$1.Z$0 = z3;
                    messageListModelManager$reloadMessageListModel$1.label = 3;
                    objEZpvd = loadMessageListModelUseCaseV2.EZpvd(oKConversation2, oKMessage, str3, executeScenario, messageListModelManager$reloadMessageListModel$1);
                    if (objEZpvd == objCopydefault) {
                    }
                } else {
                    oKConversation2 = oKConversation;
                    c36593odr2 = c36593odr;
                    z3 = z2;
                    oKMessage = null;
                    LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV22 = c36593odr2.fJNWhG;
                    LoadMessageListModelUseCaseV2.ExecuteScenario executeScenario2 = LoadMessageListModelUseCaseV2.ExecuteScenario.RELOAD;
                    messageListModelManager$reloadMessageListModel$1.L$0 = c36593odr2;
                    messageListModelManager$reloadMessageListModel$1.L$1 = null;
                    messageListModelManager$reloadMessageListModel$1.L$2 = null;
                    messageListModelManager$reloadMessageListModel$1.L$3 = null;
                    messageListModelManager$reloadMessageListModel$1.Z$0 = z3;
                    messageListModelManager$reloadMessageListModel$1.label = 3;
                    objEZpvd = loadMessageListModelUseCaseV22.EZpvd(oKConversation2, oKMessage, str3, executeScenario2, messageListModelManager$reloadMessageListModel$1);
                    if (objEZpvd == objCopydefault) {
                    }
                }
            }
        } else if (i2 == 1) {
            boolean z5 = messageListModelManager$reloadMessageListModel$1.Z$0;
            java.lang.String str6 = (java.lang.String) messageListModelManager$reloadMessageListModel$1.L$3;
            java.lang.Long l3 = (java.lang.Long) messageListModelManager$reloadMessageListModel$1.L$2;
            java.lang.String str7 = (java.lang.String) messageListModelManager$reloadMessageListModel$1.L$1;
            C36593odr c36593odr5 = (C36593odr) messageListModelManager$reloadMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            z2 = z5;
            str5 = str7;
            str3 = str6;
            l2 = l3;
            c36593odr = c36593odr5;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        C56391yDq.AEQbTJ(objOLrzqt);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z6 = messageListModelManager$reloadMessageListModel$1.Z$0;
                c36593odr3 = (C36593odr) messageListModelManager$reloadMessageListModel$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                z4 = z6;
                C36558odI c36558odI = (C36558odI) objOLrzqt;
                C36558odI c36558odIAEQbTJ = c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : null, (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : z4, (32318 & 16384) != 0 ? c36558odI.valueOf : false);
                messageListModelManager$reloadMessageListModel$1.L$0 = null;
                messageListModelManager$reloadMessageListModel$1.label = 4;
                objOLrzqt = c36593odr3.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$reloadMessageListModel$1);
                return objOLrzqt != objCopydefault ? objCopydefault : objOLrzqt;
            }
            z3 = messageListModelManager$reloadMessageListModel$1.Z$0;
            oKConversation3 = (OKConversation) messageListModelManager$reloadMessageListModel$1.L$2;
            str4 = (java.lang.String) messageListModelManager$reloadMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$reloadMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            str3 = str4;
            oKConversation2 = oKConversation3;
            C36593odr c36593odr42 = c36593odr;
            oKMessage = (OKMessage) objOLrzqt;
            c36593odr2 = c36593odr42;
            LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV222 = c36593odr2.fJNWhG;
            LoadMessageListModelUseCaseV2.ExecuteScenario executeScenario22 = LoadMessageListModelUseCaseV2.ExecuteScenario.RELOAD;
            messageListModelManager$reloadMessageListModel$1.L$0 = c36593odr2;
            messageListModelManager$reloadMessageListModel$1.L$1 = null;
            messageListModelManager$reloadMessageListModel$1.L$2 = null;
            messageListModelManager$reloadMessageListModel$1.L$3 = null;
            messageListModelManager$reloadMessageListModel$1.Z$0 = z3;
            messageListModelManager$reloadMessageListModel$1.label = 3;
            objEZpvd = loadMessageListModelUseCaseV222.EZpvd(oKConversation2, oKMessage, str3, executeScenario22, messageListModelManager$reloadMessageListModel$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            z4 = z3;
            c36593odr3 = c36593odr2;
            objOLrzqt = objEZpvd;
            C36558odI c36558odI2 = (C36558odI) objOLrzqt;
            C36558odI c36558odIAEQbTJ2 = c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : null, (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : z4, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
            messageListModelManager$reloadMessageListModel$1.L$0 = null;
            messageListModelManager$reloadMessageListModel$1.label = 4;
            objOLrzqt = c36593odr3.AEQbTJ(c36558odIAEQbTJ2, messageListModelManager$reloadMessageListModel$1);
            if (objOLrzqt != objCopydefault) {
            }
        }
        oKConversation = (OKConversation) objOLrzqt;
        if (oKConversation != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AYXKKw(@NotNull C36558odI c36558odI, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1 messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1;
        C36593odr c36593odr;
        C36558odI c36558odI2 = c36558odI;
        if (continuation instanceof MessageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1) {
            messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1 = (MessageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1) continuation;
            int i = messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1 = new MessageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.L$0 = this;
            messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.L$1 = c36558odI2;
            messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$resetTargetMessageSearchKeyInMessageListModel$result$1(this, c36558odI2, null), 7, new java.lang.Object[]{c36558odI}, messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c36593odr = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c36558odI2 = (C36558odI) messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C36558odI c36558odI3 = (C36558odI) objCopydefault;
        C36558odI c36558odIAEQbTJ = c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : null, (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : c36558odI2.isConnected(), (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
        messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.L$0 = null;
        messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.L$1 = null;
        messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1.label = 2;
        objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$resetTargetMessageSearchKeyInMessageListModel$1);
        return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [514=4] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull C36558odI c36558odI, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$loadMoreOlderMessagesToMessageListModel$1 messageListModelManager$loadMoreOlderMessagesToMessageListModel$1;
        C36593odr c36593odr;
        OKConversation oKConversation;
        C36558odI c36558odIAEQbTJ;
        C36558odI c36558odI2;
        C36593odr c36593odr2;
        C36558odI c36558odI3 = c36558odI;
        if (continuation instanceof MessageListModelManager$loadMoreOlderMessagesToMessageListModel$1) {
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1 = (MessageListModelManager$loadMoreOlderMessagesToMessageListModel$1) continuation;
            int i = messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$loadMoreOlderMessagesToMessageListModel$1 = new MessageListModelManager$loadMoreOlderMessagesToMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            OKConversation oKConversationOLrzqt = c36558odI.OLrzqt();
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$0 = this;
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$1 = c36558odI3;
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$2 = oKConversationOLrzqt;
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.label = 1;
            java.lang.Object objCopydefault2 = this.iwGUEr.copydefault(new MessageListModelManager$loadMoreOlderMessagesToMessageListModel$result$1(this, c36558odI3, null), 4, new java.lang.Object[]{oKConversationOLrzqt}, messageListModelManager$loadMoreOlderMessagesToMessageListModel$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            c36593odr = this;
            oKConversation = oKConversationOLrzqt;
            objAEQbTJ = objCopydefault2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            C56391yDq.AEQbTJ(objAEQbTJ);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c36558odIAEQbTJ = (C36558odI) messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$0;
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    C36558odI c36558odI4 = c36558odIAEQbTJ;
                    return c36558odI4.AEQbTJ((32318 & 1) != 0 ? c36558odI4.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd((C35254nrp) objAEQbTJ), (java.lang.Iterable) c36558odI4.AEQbTJ()), (32318 & 2) != 0 ? c36558odI4.KWHzl : null, (32318 & 4) != 0 ? c36558odI4.DbNXlk : null, (32318 & 8) != 0 ? c36558odI4.AkhnZx : null, (32318 & 16) != 0 ? c36558odI4.isConnected : null, (32318 & 32) != 0 ? c36558odI4.djBIcL : null, (32318 & 64) != 0 ? c36558odI4.EZpvd : false, (32318 & 128) != 0 ? c36558odI4.OLrzqt : false, (32318 & 256) != 0 ? c36558odI4.values : null, (32318 & 512) != 0 ? c36558odI4.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI4.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI4.copydefault : null, (32318 & 4096) != 0 ? c36558odI4.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI4.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI4.valueOf : false);
                }
                C36558odI c36558odI5 = (C36558odI) messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$2;
                oKConversation = (OKConversation) messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$1;
                c36593odr2 = (C36593odr) messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                c36558odI2 = c36558odI5;
                c36558odIAEQbTJ = c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd((C35254nrp) objAEQbTJ), (java.lang.Iterable) c36558odI2.AEQbTJ()), (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
                c36593odr = c36593odr2;
                if (!c36593odr.copydefault(oKConversation.getTargetId(), c36558odIAEQbTJ, null, null)) {
                    return c36558odIAEQbTJ;
                }
                java.lang.String targetId = oKConversation.getTargetId();
                OKConversationType conversationType = oKConversation.getConversationType();
                messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$0 = c36558odIAEQbTJ;
                messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$1 = null;
                messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$2 = null;
                messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.label = 3;
                objAEQbTJ = c36593odr.OLrzqt(targetId, conversationType, messageListModelManager$loadMoreOlderMessagesToMessageListModel$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                C36558odI c36558odI42 = c36558odIAEQbTJ;
                return c36558odI42.AEQbTJ((32318 & 1) != 0 ? c36558odI42.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd((C35254nrp) objAEQbTJ), (java.lang.Iterable) c36558odI42.AEQbTJ()), (32318 & 2) != 0 ? c36558odI42.KWHzl : null, (32318 & 4) != 0 ? c36558odI42.DbNXlk : null, (32318 & 8) != 0 ? c36558odI42.AkhnZx : null, (32318 & 16) != 0 ? c36558odI42.isConnected : null, (32318 & 32) != 0 ? c36558odI42.djBIcL : null, (32318 & 64) != 0 ? c36558odI42.EZpvd : false, (32318 & 128) != 0 ? c36558odI42.OLrzqt : false, (32318 & 256) != 0 ? c36558odI42.values : null, (32318 & 512) != 0 ? c36558odI42.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI42.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI42.copydefault : null, (32318 & 4096) != 0 ? c36558odI42.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI42.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI42.valueOf : false);
            }
            OKConversation oKConversation2 = (OKConversation) messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$2;
            C36558odI c36558odI6 = (C36558odI) messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            oKConversation = oKConversation2;
            c36558odI3 = c36558odI6;
        }
        C36558odI c36558odI7 = (C36558odI) objAEQbTJ;
        c36558odI7.AEQbTJ((32318 & 1) != 0 ? c36558odI7.AhwBna : null, (32318 & 2) != 0 ? c36558odI7.KWHzl : null, (32318 & 4) != 0 ? c36558odI7.DbNXlk : null, (32318 & 8) != 0 ? c36558odI7.AkhnZx : null, (32318 & 16) != 0 ? c36558odI7.isConnected : null, (32318 & 32) != 0 ? c36558odI7.djBIcL : null, (32318 & 64) != 0 ? c36558odI7.EZpvd : false, (32318 & 128) != 0 ? c36558odI7.OLrzqt : false, (32318 & 256) != 0 ? c36558odI7.values : null, (32318 & 512) != 0 ? c36558odI7.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI7.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI7.copydefault : null, (32318 & 4096) != 0 ? c36558odI7.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI7.AEQbTJ : c36558odI3.isConnected(), (32318 & 16384) != 0 ? c36558odI7.valueOf : false);
        if (c36558odI7.EZpvd()) {
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$0 = null;
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$1 = null;
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$2 = null;
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.label = 4;
            objAEQbTJ = c36593odr.AEQbTJ(c36558odI7, messageListModelManager$loadMoreOlderMessagesToMessageListModel$1);
            return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
        }
        if (c36593odr.EZpvd(oKConversation.getTargetId(), c36558odI7, (java.lang.String) null, (java.lang.Long) null)) {
            java.lang.String targetId2 = oKConversation.getTargetId();
            OKConversationType conversationType2 = oKConversation.getConversationType();
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$0 = c36593odr;
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$1 = oKConversation;
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.L$2 = c36558odI7;
            messageListModelManager$loadMoreOlderMessagesToMessageListModel$1.label = 2;
            java.lang.Object objKWHzl = c36593odr.KWHzl(targetId2, conversationType2, messageListModelManager$loadMoreOlderMessagesToMessageListModel$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c36558odI2 = c36558odI7;
            c36593odr2 = c36593odr;
            objAEQbTJ = objKWHzl;
            c36558odIAEQbTJ = c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd((C35254nrp) objAEQbTJ), (java.lang.Iterable) c36558odI2.AEQbTJ()), (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
            c36593odr = c36593odr2;
            if (!c36593odr.copydefault(oKConversation.getTargetId(), c36558odIAEQbTJ, null, null)) {
            }
        } else {
            c36558odIAEQbTJ = c36558odI7;
            if (!c36593odr.copydefault(oKConversation.getTargetId(), c36558odIAEQbTJ, null, null)) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C36558odI c36558odI, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$loadMoreNewerMessagesToMessageListModel$1 messageListModelManager$loadMoreNewerMessagesToMessageListModel$1;
        java.lang.Object next;
        C35254nrp c35254nrp;
        C36593odr c36593odr;
        C36558odI c36558odI2 = c36558odI;
        if (continuation instanceof MessageListModelManager$loadMoreNewerMessagesToMessageListModel$1) {
            messageListModelManager$loadMoreNewerMessagesToMessageListModel$1 = (MessageListModelManager$loadMoreNewerMessagesToMessageListModel$1) continuation;
            int i = messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$loadMoreNewerMessagesToMessageListModel$1 = new MessageListModelManager$loadMoreNewerMessagesToMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            OKConversation oKConversationOLrzqt = c36558odI.OLrzqt();
            java.util.Iterator<T> it = c36558odI.AEQbTJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((C35254nrp) next).OLrzqt().getClientMessageId(), (java.lang.Object) "disclaimer_system_message")) {
                    break;
                }
            }
            c35254nrp = (C35254nrp) next;
            messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.L$0 = this;
            messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.L$1 = c36558odI2;
            messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.L$2 = c35254nrp;
            messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$loadMoreNewerMessagesToMessageListModel$result$1(this, c36558odI2, null), 3, new java.lang.Object[]{oKConversationOLrzqt}, messageListModelManager$loadMoreNewerMessagesToMessageListModel$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c36593odr = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C35254nrp c35254nrp2 = (C35254nrp) messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.L$2;
            C36558odI c36558odI3 = (C36558odI) messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            c35254nrp = c35254nrp2;
            c36558odI2 = c36558odI3;
        }
        C36558odI c36558odI4 = (C36558odI) objCopydefault;
        C36558odI c36558odIAEQbTJ = c36558odI4.AEQbTJ((32318 & 1) != 0 ? c36558odI4.AhwBna : null, (32318 & 2) != 0 ? c36558odI4.KWHzl : null, (32318 & 4) != 0 ? c36558odI4.DbNXlk : null, (32318 & 8) != 0 ? c36558odI4.AkhnZx : null, (32318 & 16) != 0 ? c36558odI4.isConnected : null, (32318 & 32) != 0 ? c36558odI4.djBIcL : null, (32318 & 64) != 0 ? c36558odI4.EZpvd : false, (32318 & 128) != 0 ? c36558odI4.OLrzqt : false, (32318 & 256) != 0 ? c36558odI4.values : null, (32318 & 512) != 0 ? c36558odI4.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI4.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI4.copydefault : null, (32318 & 4096) != 0 ? c36558odI4.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI4.AEQbTJ : c36558odI2.isConnected(), (32318 & 16384) != 0 ? c36558odI4.valueOf : false);
        if (c35254nrp != null) {
            java.util.List<C35254nrp> listAEQbTJ = c36558odIAEQbTJ.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listAEQbTJ) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((C35254nrp) obj).OLrzqt().getClientMessageId(), (java.lang.Object) "disclaimer_system_message")) {
                    arrayList.add(obj);
                }
            }
            c36558odIAEQbTJ = c36558odIAEQbTJ.AEQbTJ((32318 & 1) != 0 ? c36558odIAEQbTJ.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(c35254nrp), (java.lang.Iterable) arrayList), (32318 & 2) != 0 ? c36558odIAEQbTJ.KWHzl : null, (32318 & 4) != 0 ? c36558odIAEQbTJ.DbNXlk : null, (32318 & 8) != 0 ? c36558odIAEQbTJ.AkhnZx : null, (32318 & 16) != 0 ? c36558odIAEQbTJ.isConnected : null, (32318 & 32) != 0 ? c36558odIAEQbTJ.djBIcL : null, (32318 & 64) != 0 ? c36558odIAEQbTJ.EZpvd : false, (32318 & 128) != 0 ? c36558odIAEQbTJ.OLrzqt : false, (32318 & 256) != 0 ? c36558odIAEQbTJ.values : null, (32318 & 512) != 0 ? c36558odIAEQbTJ.AYXKKw : false, (32318 & 1024) != 0 ? c36558odIAEQbTJ.gEmmrt : null, (32318 & 2048) != 0 ? c36558odIAEQbTJ.copydefault : null, (32318 & 4096) != 0 ? c36558odIAEQbTJ.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odIAEQbTJ.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odIAEQbTJ.valueOf : false);
        }
        messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.L$0 = null;
        messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.L$1 = null;
        messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.L$2 = null;
        messageListModelManager$loadMoreNewerMessagesToMessageListModel$1.label = 2;
        objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$loadMoreNewerMessagesToMessageListModel$1);
        return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object valueOf(@NotNull C36558odI c36558odI, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$refreshMessageListModel$1 messageListModelManager$refreshMessageListModel$1;
        java.lang.Object next;
        C35254nrp c35254nrp;
        java.lang.Object objCopydefault;
        C36593odr c36593odr;
        C36558odI c36558odI2 = c36558odI;
        if (continuation instanceof MessageListModelManager$refreshMessageListModel$1) {
            messageListModelManager$refreshMessageListModel$1 = (MessageListModelManager$refreshMessageListModel$1) continuation;
            int i = messageListModelManager$refreshMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$refreshMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$refreshMessageListModel$1 = new MessageListModelManager$refreshMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = messageListModelManager$refreshMessageListModel$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$refreshMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            java.util.Iterator<T> it = c36558odI.AEQbTJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((C35254nrp) next).OLrzqt().getClientMessageId(), (java.lang.Object) "disclaimer_system_message")) {
                    break;
                }
            }
            c35254nrp = (C35254nrp) next;
            messageListModelManager$refreshMessageListModel$1.L$0 = this;
            messageListModelManager$refreshMessageListModel$1.L$1 = c36558odI2;
            messageListModelManager$refreshMessageListModel$1.L$2 = c35254nrp;
            messageListModelManager$refreshMessageListModel$1.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$refreshMessageListModel$result$1(this, c36558odI2, null), 8, new java.lang.Object[]{c36558odI}, messageListModelManager$refreshMessageListModel$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c36593odr = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C35254nrp c35254nrp2 = (C35254nrp) messageListModelManager$refreshMessageListModel$1.L$2;
            C36558odI c36558odI3 = (C36558odI) messageListModelManager$refreshMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$refreshMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            c35254nrp = c35254nrp2;
            c36558odI2 = c36558odI3;
            objCopydefault = objAEQbTJ;
        }
        C36558odI c36558odI4 = (C36558odI) objCopydefault;
        C36558odI c36558odIAEQbTJ = c36558odI4.AEQbTJ((32318 & 1) != 0 ? c36558odI4.AhwBna : null, (32318 & 2) != 0 ? c36558odI4.KWHzl : null, (32318 & 4) != 0 ? c36558odI4.DbNXlk : null, (32318 & 8) != 0 ? c36558odI4.AkhnZx : null, (32318 & 16) != 0 ? c36558odI4.isConnected : null, (32318 & 32) != 0 ? c36558odI4.djBIcL : null, (32318 & 64) != 0 ? c36558odI4.EZpvd : false, (32318 & 128) != 0 ? c36558odI4.OLrzqt : false, (32318 & 256) != 0 ? c36558odI4.values : null, (32318 & 512) != 0 ? c36558odI4.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI4.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI4.copydefault : null, (32318 & 4096) != 0 ? c36558odI4.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI4.AEQbTJ : c36558odI2.isConnected(), (32318 & 16384) != 0 ? c36558odI4.valueOf : false);
        if (c35254nrp != null) {
            java.util.List<C35254nrp> listAEQbTJ = c36558odIAEQbTJ.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listAEQbTJ) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((C35254nrp) obj).OLrzqt().getClientMessageId(), (java.lang.Object) "disclaimer_system_message")) {
                    arrayList.add(obj);
                }
            }
            c36558odIAEQbTJ = c36558odIAEQbTJ.AEQbTJ((32318 & 1) != 0 ? c36558odIAEQbTJ.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(c35254nrp), (java.lang.Iterable) arrayList), (32318 & 2) != 0 ? c36558odIAEQbTJ.KWHzl : null, (32318 & 4) != 0 ? c36558odIAEQbTJ.DbNXlk : null, (32318 & 8) != 0 ? c36558odIAEQbTJ.AkhnZx : null, (32318 & 16) != 0 ? c36558odIAEQbTJ.isConnected : null, (32318 & 32) != 0 ? c36558odIAEQbTJ.djBIcL : null, (32318 & 64) != 0 ? c36558odIAEQbTJ.EZpvd : false, (32318 & 128) != 0 ? c36558odIAEQbTJ.OLrzqt : false, (32318 & 256) != 0 ? c36558odIAEQbTJ.values : null, (32318 & 512) != 0 ? c36558odIAEQbTJ.AYXKKw : false, (32318 & 1024) != 0 ? c36558odIAEQbTJ.gEmmrt : null, (32318 & 2048) != 0 ? c36558odIAEQbTJ.copydefault : null, (32318 & 4096) != 0 ? c36558odIAEQbTJ.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odIAEQbTJ.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odIAEQbTJ.valueOf : false);
        }
        messageListModelManager$refreshMessageListModel$1.L$0 = null;
        messageListModelManager$refreshMessageListModel$1.L$1 = null;
        messageListModelManager$refreshMessageListModel$1.L$2 = null;
        messageListModelManager$refreshMessageListModel$1.label = 2;
        objAEQbTJ = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$refreshMessageListModel$1);
        return objAEQbTJ == objCopydefault2 ? objCopydefault2 : objAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C36558odI c36558odI, @NotNull C44468sQy c44468sQy, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$applyMessageSentEventToMessageListModel$1 messageListModelManager$applyMessageSentEventToMessageListModel$1;
        C36593odr c36593odr;
        C36558odI c36558odI2 = c36558odI;
        if (continuation instanceof MessageListModelManager$applyMessageSentEventToMessageListModel$1) {
            messageListModelManager$applyMessageSentEventToMessageListModel$1 = (MessageListModelManager$applyMessageSentEventToMessageListModel$1) continuation;
            int i = messageListModelManager$applyMessageSentEventToMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$applyMessageSentEventToMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$applyMessageSentEventToMessageListModel$1 = new MessageListModelManager$applyMessageSentEventToMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messageListModelManager$applyMessageSentEventToMessageListModel$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$applyMessageSentEventToMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            messageListModelManager$applyMessageSentEventToMessageListModel$1.L$0 = this;
            messageListModelManager$applyMessageSentEventToMessageListModel$1.L$1 = c36558odI2;
            messageListModelManager$applyMessageSentEventToMessageListModel$1.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$applyMessageSentEventToMessageListModel$result$1(this, c36558odI2, c44468sQy, null), 10, new java.lang.Object[]{c36558odI}, messageListModelManager$applyMessageSentEventToMessageListModel$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c36593odr = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return (C36558odI) objCopydefault;
            }
            c36558odI2 = (C36558odI) messageListModelManager$applyMessageSentEventToMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$applyMessageSentEventToMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C36558odI c36558odI3 = (C36558odI) objCopydefault;
        if (c36558odI3 == null) {
            return null;
        }
        C36558odI c36558odIAEQbTJ = c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : null, (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : c36558odI2.isConnected(), (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
        messageListModelManager$applyMessageSentEventToMessageListModel$1.L$0 = null;
        messageListModelManager$applyMessageSentEventToMessageListModel$1.L$1 = null;
        messageListModelManager$applyMessageSentEventToMessageListModel$1.label = 2;
        objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$applyMessageSentEventToMessageListModel$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        return (C36558odI) objCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C36558odI c36558odI, @NotNull sQB sqb, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$applyMediaMessageSentEventToMessageListModel$1 messageListModelManager$applyMediaMessageSentEventToMessageListModel$1;
        C36593odr c36593odr;
        C36558odI c36558odI2 = c36558odI;
        if (continuation instanceof MessageListModelManager$applyMediaMessageSentEventToMessageListModel$1) {
            messageListModelManager$applyMediaMessageSentEventToMessageListModel$1 = (MessageListModelManager$applyMediaMessageSentEventToMessageListModel$1) continuation;
            int i = messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$applyMediaMessageSentEventToMessageListModel$1 = new MessageListModelManager$applyMediaMessageSentEventToMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.L$0 = this;
            messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.L$1 = c36558odI2;
            messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$applyMediaMessageSentEventToMessageListModel$result$1(this, c36558odI2, sqb, null), 11, new java.lang.Object[]{c36558odI}, messageListModelManager$applyMediaMessageSentEventToMessageListModel$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c36593odr = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return (C36558odI) objCopydefault;
            }
            c36558odI2 = (C36558odI) messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C36558odI c36558odI3 = (C36558odI) objCopydefault;
        if (c36558odI3 == null) {
            return null;
        }
        C36558odI c36558odIAEQbTJ = c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : null, (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : c36558odI2.isConnected(), (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
        messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.L$0 = null;
        messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.L$1 = null;
        messageListModelManager$applyMediaMessageSentEventToMessageListModel$1.label = 2;
        objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$applyMediaMessageSentEventToMessageListModel$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        return (C36558odI) objCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull C36558odI c36558odI, @NotNull C44467sQx c44467sQx, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1 messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1;
        C36593odr c36593odr;
        C36558odI c36558odI2 = c36558odI;
        if (continuation instanceof MessageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1) {
            messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1 = (MessageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1) continuation;
            int i = messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1 = new MessageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.L$0 = this;
            messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.L$1 = c36558odI2;
            messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$result$1(this, c36558odI2, c44467sQx, null), 12, new java.lang.Object[]{c36558odI}, messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c36593odr = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return (C36558odI) objCopydefault;
            }
            c36558odI2 = (C36558odI) messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C36558odI c36558odI3 = (C36558odI) objCopydefault;
        if (c36558odI3 == null) {
            return null;
        }
        C36558odI c36558odIAEQbTJ = c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : null, (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : c36558odI2.isConnected(), (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
        messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.L$0 = null;
        messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.L$1 = null;
        messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1.label = 2;
        objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$applyReceivedMessageFromOpponentEventToMessageListModel$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        return (C36558odI) objCopydefault;
    }

    public final java.lang.Object AEQbTJ(@NotNull C36558odI c36558odI, @NotNull C44469sQz c44469sQz, @NotNull Continuation<? super C36558odI> continuation) {
        return this.iwGUEr.copydefault(new MessageListModelManager$applyReadReceiptEventToMessageListModel$2(this, c36558odI, c44469sQz, null), 13, new java.lang.Object[]{c36558odI}, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C36558odI c36558odI, @NotNull C44464sQu c44464sQu, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$applyRecallEventToMessageListModel$1 messageListModelManager$applyRecallEventToMessageListModel$1;
        C36593odr c36593odr;
        C36558odI c36558odI2 = c36558odI;
        if (continuation instanceof MessageListModelManager$applyRecallEventToMessageListModel$1) {
            messageListModelManager$applyRecallEventToMessageListModel$1 = (MessageListModelManager$applyRecallEventToMessageListModel$1) continuation;
            int i = messageListModelManager$applyRecallEventToMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$applyRecallEventToMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$applyRecallEventToMessageListModel$1 = new MessageListModelManager$applyRecallEventToMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messageListModelManager$applyRecallEventToMessageListModel$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$applyRecallEventToMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            messageListModelManager$applyRecallEventToMessageListModel$1.L$0 = this;
            messageListModelManager$applyRecallEventToMessageListModel$1.L$1 = c36558odI2;
            messageListModelManager$applyRecallEventToMessageListModel$1.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$applyRecallEventToMessageListModel$result$1(this, c36558odI2, c44464sQu, null), 15, new java.lang.Object[]{c36558odI}, messageListModelManager$applyRecallEventToMessageListModel$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c36593odr = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c36558odI2 = (C36558odI) messageListModelManager$applyRecallEventToMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$applyRecallEventToMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C36558odI c36558odI3 = (C36558odI) objCopydefault;
        C36558odI c36558odIAEQbTJ = c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : null, (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : c36558odI2.isConnected(), (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
        messageListModelManager$applyRecallEventToMessageListModel$1.L$0 = null;
        messageListModelManager$applyRecallEventToMessageListModel$1.L$1 = null;
        messageListModelManager$applyRecallEventToMessageListModel$1.label = 2;
        objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$applyRecallEventToMessageListModel$1);
        return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C36558odI c36558odI, @NotNull C44454sQk c44454sQk, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$applyDeleteMessageEventToMessageListModel$1 messageListModelManager$applyDeleteMessageEventToMessageListModel$1;
        C36593odr c36593odr;
        C36558odI c36558odI2 = c36558odI;
        if (continuation instanceof MessageListModelManager$applyDeleteMessageEventToMessageListModel$1) {
            messageListModelManager$applyDeleteMessageEventToMessageListModel$1 = (MessageListModelManager$applyDeleteMessageEventToMessageListModel$1) continuation;
            int i = messageListModelManager$applyDeleteMessageEventToMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$applyDeleteMessageEventToMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$applyDeleteMessageEventToMessageListModel$1 = new MessageListModelManager$applyDeleteMessageEventToMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messageListModelManager$applyDeleteMessageEventToMessageListModel$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$applyDeleteMessageEventToMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            messageListModelManager$applyDeleteMessageEventToMessageListModel$1.L$0 = this;
            messageListModelManager$applyDeleteMessageEventToMessageListModel$1.L$1 = c36558odI2;
            messageListModelManager$applyDeleteMessageEventToMessageListModel$1.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$applyDeleteMessageEventToMessageListModel$result$1(this, c36558odI2, c44454sQk, null), 16, new java.lang.Object[]{c36558odI}, messageListModelManager$applyDeleteMessageEventToMessageListModel$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c36593odr = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c36558odI2 = (C36558odI) messageListModelManager$applyDeleteMessageEventToMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$applyDeleteMessageEventToMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C36558odI c36558odI3 = (C36558odI) objCopydefault;
        C36558odI c36558odIAEQbTJ = c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : null, (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : c36558odI2.isConnected(), (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
        messageListModelManager$applyDeleteMessageEventToMessageListModel$1.L$0 = null;
        messageListModelManager$applyDeleteMessageEventToMessageListModel$1.L$1 = null;
        messageListModelManager$applyDeleteMessageEventToMessageListModel$1.label = 2;
        objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$applyDeleteMessageEventToMessageListModel$1);
        return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C36558odI c36558odI, @NotNull sQA sqa, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$applyRefreshMessageEventToMessageListModel$1 messageListModelManager$applyRefreshMessageEventToMessageListModel$1;
        C36593odr c36593odr;
        C36558odI c36558odI2 = c36558odI;
        if (continuation instanceof MessageListModelManager$applyRefreshMessageEventToMessageListModel$1) {
            messageListModelManager$applyRefreshMessageEventToMessageListModel$1 = (MessageListModelManager$applyRefreshMessageEventToMessageListModel$1) continuation;
            int i = messageListModelManager$applyRefreshMessageEventToMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$applyRefreshMessageEventToMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$applyRefreshMessageEventToMessageListModel$1 = new MessageListModelManager$applyRefreshMessageEventToMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messageListModelManager$applyRefreshMessageEventToMessageListModel$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$applyRefreshMessageEventToMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            messageListModelManager$applyRefreshMessageEventToMessageListModel$1.L$0 = this;
            messageListModelManager$applyRefreshMessageEventToMessageListModel$1.L$1 = c36558odI2;
            messageListModelManager$applyRefreshMessageEventToMessageListModel$1.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$applyRefreshMessageEventToMessageListModel$result$1(this, c36558odI2, sqa, null), 18, new java.lang.Object[]{c36558odI}, messageListModelManager$applyRefreshMessageEventToMessageListModel$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c36593odr = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return (C36558odI) objCopydefault;
            }
            c36558odI2 = (C36558odI) messageListModelManager$applyRefreshMessageEventToMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$applyRefreshMessageEventToMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C36558odI c36558odI3 = (C36558odI) objCopydefault;
        if (c36558odI3 == null) {
            return null;
        }
        C36558odI c36558odIAEQbTJ = c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : null, (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : c36558odI2.isConnected(), (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
        messageListModelManager$applyRefreshMessageEventToMessageListModel$1.L$0 = null;
        messageListModelManager$applyRefreshMessageEventToMessageListModel$1.L$1 = null;
        messageListModelManager$applyRefreshMessageEventToMessageListModel$1.label = 2;
        objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$applyRefreshMessageEventToMessageListModel$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        return (C36558odI) objCopydefault;
    }

    public static /* synthetic */ java.lang.Object applyClearMessageEventToMessageListModel$default(C36593odr c36593odr, java.lang.String str, java.lang.String str2, C44452sQi c44452sQi, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c36593odr.copydefault(str, str2, c44452sQi, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, java.lang.String str2, @NotNull C44452sQi c44452sQi, boolean z, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$applyClearMessageEventToMessageListModel$1 messageListModelManager$applyClearMessageEventToMessageListModel$1;
        boolean z2;
        C36593odr c36593odr;
        if (continuation instanceof MessageListModelManager$applyClearMessageEventToMessageListModel$1) {
            messageListModelManager$applyClearMessageEventToMessageListModel$1 = (MessageListModelManager$applyClearMessageEventToMessageListModel$1) continuation;
            int i = messageListModelManager$applyClearMessageEventToMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$applyClearMessageEventToMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$applyClearMessageEventToMessageListModel$1 = new MessageListModelManager$applyClearMessageEventToMessageListModel$1(this, continuation);
            }
        }
        MessageListModelManager$applyClearMessageEventToMessageListModel$1 messageListModelManager$applyClearMessageEventToMessageListModel$12 = messageListModelManager$applyClearMessageEventToMessageListModel$1;
        java.lang.Object objCopydefault = messageListModelManager$applyClearMessageEventToMessageListModel$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$applyClearMessageEventToMessageListModel$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            messageListModelManager$applyClearMessageEventToMessageListModel$12.L$0 = this;
            messageListModelManager$applyClearMessageEventToMessageListModel$12.Z$0 = z;
            messageListModelManager$applyClearMessageEventToMessageListModel$12.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$applyClearMessageEventToMessageListModel$result$1(this, str, str2, c44452sQi, null), 20, new java.lang.Object[0], messageListModelManager$applyClearMessageEventToMessageListModel$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            z2 = z;
            c36593odr = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return (C36558odI) objCopydefault;
            }
            boolean z3 = messageListModelManager$applyClearMessageEventToMessageListModel$12.Z$0;
            c36593odr = (C36593odr) messageListModelManager$applyClearMessageEventToMessageListModel$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            z2 = z3;
        }
        C36558odI c36558odI = (C36558odI) objCopydefault;
        if (c36558odI == null) {
            return null;
        }
        C36558odI c36558odIAEQbTJ = c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : null, (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : z2, (32318 & 16384) != 0 ? c36558odI.valueOf : false);
        messageListModelManager$applyClearMessageEventToMessageListModel$12.L$0 = null;
        messageListModelManager$applyClearMessageEventToMessageListModel$12.label = 2;
        objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$applyClearMessageEventToMessageListModel$12);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        return (C36558odI) objCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a9 A[PHI: r1
  0x01a9: PHI (r1v26 java.lang.Object) = (r1v21 java.lang.Object), (r1v1 java.lang.Object) binds: [B:47:0x01a6, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C36558odI c36558odI, @NotNull java.util.List<OKMessage> list, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        MessageListModelManager$applyDownloadedMessagesToMessageListModel$1 messageListModelManager$applyDownloadedMessagesToMessageListModel$1;
        C35254nrp c35254nrp;
        C36593odr c36593odr;
        C36558odI c36558odI2;
        OKMessage oKMessageOLrzqt;
        C36558odI c36558odIAEQbTJ;
        C36593odr c36593odr2;
        C36558odI c36558odI3;
        if (continuation instanceof MessageListModelManager$applyDownloadedMessagesToMessageListModel$1) {
            messageListModelManager$applyDownloadedMessagesToMessageListModel$1 = (MessageListModelManager$applyDownloadedMessagesToMessageListModel$1) continuation;
            int i = messageListModelManager$applyDownloadedMessagesToMessageListModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageListModelManager$applyDownloadedMessagesToMessageListModel$1.label = i - Integer.MIN_VALUE;
            } else {
                messageListModelManager$applyDownloadedMessagesToMessageListModel$1 = new MessageListModelManager$applyDownloadedMessagesToMessageListModel$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = messageListModelManager$applyDownloadedMessagesToMessageListModel$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = messageListModelManager$applyDownloadedMessagesToMessageListModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C35254nrp c35254nrp2 = (C35254nrp) CollectionsKt___CollectionsKt.firstOrNull(c36558odI.AEQbTJ());
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) ((c35254nrp2 == null || (oKMessageOLrzqt = c35254nrp2.OLrzqt()) == null) ? null : oKMessageOLrzqt.getClientMessageId()), (java.lang.Object) "disclaimer_system_message");
            c35254nrp = zEZpvd ? (C35254nrp) CollectionsKt___CollectionsKt.AuCTelauCTel(c36558odI.AEQbTJ()) : null;
            C36558odI c36558odIAEQbTJ2 = zEZpvd ? c36558odI.AEQbTJ((32318 & 1) != 0 ? c36558odI.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) c36558odI.AEQbTJ(), 1), (32318 & 2) != 0 ? c36558odI.KWHzl : null, (32318 & 4) != 0 ? c36558odI.DbNXlk : null, (32318 & 8) != 0 ? c36558odI.AkhnZx : null, (32318 & 16) != 0 ? c36558odI.isConnected : null, (32318 & 32) != 0 ? c36558odI.djBIcL : null, (32318 & 64) != 0 ? c36558odI.EZpvd : false, (32318 & 128) != 0 ? c36558odI.OLrzqt : false, (32318 & 256) != 0 ? c36558odI.values : null, (32318 & 512) != 0 ? c36558odI.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI.copydefault : null, (32318 & 4096) != 0 ? c36558odI.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI.valueOf : false) : c36558odI;
            messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$0 = this;
            messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$1 = c36558odI;
            messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$2 = c35254nrp;
            messageListModelManager$applyDownloadedMessagesToMessageListModel$1.label = 1;
            objCopydefault = this.iwGUEr.copydefault(new MessageListModelManager$applyDownloadedMessagesToMessageListModel$result$1(this, c36558odIAEQbTJ2, list, null), 21, new java.lang.Object[]{c36558odI}, messageListModelManager$applyDownloadedMessagesToMessageListModel$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c36593odr = this;
            c36558odI2 = c36558odI;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C56391yDq.AEQbTJ(objCopydefault);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C36558odI c36558odI4 = (C36558odI) messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$1;
                c36593odr2 = (C36593odr) messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                c36558odI3 = c36558odI4;
                c36558odIAEQbTJ = c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd((C35254nrp) objCopydefault), (java.lang.Iterable) c36558odI3.AEQbTJ()), (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
                c36593odr = c36593odr2;
                messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$0 = null;
                messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$1 = null;
                messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$2 = null;
                messageListModelManager$applyDownloadedMessagesToMessageListModel$1.label = 3;
                objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$applyDownloadedMessagesToMessageListModel$1);
                return objCopydefault != objCopydefault2 ? objCopydefault2 : objCopydefault;
            }
            c35254nrp = (C35254nrp) messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$2;
            c36558odI2 = (C36558odI) messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$1;
            c36593odr = (C36593odr) messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C36558odI c36558odI5 = (C36558odI) objCopydefault;
        c36558odIAEQbTJ = c36558odI5.AEQbTJ((32318 & 1) != 0 ? c36558odI5.AhwBna : null, (32318 & 2) != 0 ? c36558odI5.KWHzl : null, (32318 & 4) != 0 ? c36558odI5.DbNXlk : null, (32318 & 8) != 0 ? c36558odI5.AkhnZx : null, (32318 & 16) != 0 ? c36558odI5.isConnected : null, (32318 & 32) != 0 ? c36558odI5.djBIcL : null, (32318 & 64) != 0 ? c36558odI5.EZpvd : false, (32318 & 128) != 0 ? c36558odI5.OLrzqt : false, (32318 & 256) != 0 ? c36558odI5.values : null, (32318 & 512) != 0 ? c36558odI5.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI5.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI5.copydefault : null, (32318 & 4096) != 0 ? c36558odI5.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI5.AEQbTJ : c36558odI2.isConnected(), (32318 & 16384) != 0 ? c36558odI5.valueOf : false);
        if (c36593odr.copydefault(c36558odI2.OLrzqt().getTargetId(), c36558odIAEQbTJ, null, null) && !c36558odIAEQbTJ.EZpvd()) {
            if (c35254nrp == null) {
                java.lang.String targetId = c36558odI2.OLrzqt().getTargetId();
                OKConversationType conversationType = c36558odI2.OLrzqt().getConversationType();
                messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$0 = c36593odr;
                messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$1 = c36558odIAEQbTJ;
                messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$2 = null;
                messageListModelManager$applyDownloadedMessagesToMessageListModel$1.label = 2;
                java.lang.Object objOLrzqt = c36593odr.OLrzqt(targetId, conversationType, messageListModelManager$applyDownloadedMessagesToMessageListModel$1);
                if (objOLrzqt == objCopydefault2) {
                    return objCopydefault2;
                }
                c36593odr2 = c36593odr;
                c36558odI3 = c36558odIAEQbTJ;
                objCopydefault = objOLrzqt;
                c36558odIAEQbTJ = c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd((C35254nrp) objCopydefault), (java.lang.Iterable) c36558odI3.AEQbTJ()), (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
                c36593odr = c36593odr2;
            } else {
                c36558odIAEQbTJ = c36558odIAEQbTJ.AEQbTJ((32318 & 1) != 0 ? c36558odIAEQbTJ.AhwBna : CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(c35254nrp), (java.lang.Iterable) c36558odIAEQbTJ.AEQbTJ()), (32318 & 2) != 0 ? c36558odIAEQbTJ.KWHzl : null, (32318 & 4) != 0 ? c36558odIAEQbTJ.DbNXlk : null, (32318 & 8) != 0 ? c36558odIAEQbTJ.AkhnZx : null, (32318 & 16) != 0 ? c36558odIAEQbTJ.isConnected : null, (32318 & 32) != 0 ? c36558odIAEQbTJ.djBIcL : null, (32318 & 64) != 0 ? c36558odIAEQbTJ.EZpvd : false, (32318 & 128) != 0 ? c36558odIAEQbTJ.OLrzqt : false, (32318 & 256) != 0 ? c36558odIAEQbTJ.values : null, (32318 & 512) != 0 ? c36558odIAEQbTJ.AYXKKw : false, (32318 & 1024) != 0 ? c36558odIAEQbTJ.gEmmrt : null, (32318 & 2048) != 0 ? c36558odIAEQbTJ.copydefault : null, (32318 & 4096) != 0 ? c36558odIAEQbTJ.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odIAEQbTJ.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odIAEQbTJ.valueOf : false);
            }
        }
        messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$0 = null;
        messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$1 = null;
        messageListModelManager$applyDownloadedMessagesToMessageListModel$1.L$2 = null;
        messageListModelManager$applyDownloadedMessagesToMessageListModel$1.label = 3;
        objCopydefault = c36593odr.AEQbTJ(c36558odIAEQbTJ, messageListModelManager$applyDownloadedMessagesToMessageListModel$1);
        if (objCopydefault != objCopydefault2) {
        }
    }

    public final java.lang.Object EZpvd(@NotNull C36558odI c36558odI, @NotNull C36517ocU.StateListAnimator stateListAnimator, @NotNull OKMessage oKMessage, @NotNull Continuation<? super C36558odI> continuation) {
        return this.iwGUEr.copydefault(new MessageListModelManager$applyAudioMessageDownloadUpdatesToMessageListModel$2(this, c36558odI, stateListAnimator, oKMessage, null), 24, new java.lang.Object[]{c36558odI}, continuation);
    }

    public final java.lang.Object KWHzl(@NotNull C36558odI c36558odI, @NotNull C35249nrk c35249nrk, @NotNull Continuation<? super C36558odI> continuation) {
        return this.iwGUEr.copydefault(new MessageListModelManager$applyAudioMessagePlayStateUpdatesToMessageListModel$2(this, c36558odI, c35249nrk, null), 23, new java.lang.Object[]{c36558odI}, continuation);
    }

    public final java.lang.Object AEQbTJ(java.lang.Long l, @NotNull C36558odI c36558odI, @NotNull Continuation<? super C36558odI> continuation) {
        return c36558odI.OLrzqt().getConversationType() != OKConversationType.PRIVATE ? c36558odI : this.iwGUEr.copydefault(new MessageListModelManager$updateIsShowMessageStatus$2(this, l, c36558odI, null), 22, new java.lang.Object[]{c36558odI}, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull C36558odI c36558odI, @NotNull Continuation<? super oEZ.Activity> continuation) {
        return this.fetchVPNInfo.copydefault(c36558odI, continuation);
    }
}
