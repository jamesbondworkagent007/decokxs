package com.okinc.im.imui.conversation.message.viewmodel.tracker;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.conversation.message.viewmodel.tracker.IMEventTracker;
import com.okinc.im.imui.conversation.message.viewmodel.tracker.IMEventTracker$trackIMLinkClicked$1;
import com.okinc.okimcore.model.im.CacheStrategy;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C33129mqd;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC35180nqU;
import o.InterfaceC44375sNm;
import o.sEF;
import o.sHZ;

/* JADX INFO: loaded from: classes16.dex */
public final class IMEventTracker$trackIMLinkClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $conversationId;
    final /* synthetic */ String $link;
    final /* synthetic */ IMEventTracker.LinkLocation $linkLocation;
    final /* synthetic */ String $senderId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IMEventTracker this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMEventTracker$trackIMLinkClicked$1(String str, IMEventTracker iMEventTracker, String str2, IMEventTracker.LinkLocation linkLocation, String str3, Continuation<? super IMEventTracker$trackIMLinkClicked$1> continuation) {
        super(2, continuation);
        this.$conversationId = str;
        this.this$0 = iMEventTracker;
        this.$senderId = str2;
        this.$linkLocation = linkLocation;
        this.$link = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IMEventTracker$trackIMLinkClicked$1 iMEventTracker$trackIMLinkClicked$1 = new IMEventTracker$trackIMLinkClicked$1(this.$conversationId, this.this$0, this.$senderId, this.$linkLocation, this.$link, continuation);
        iMEventTracker$trackIMLinkClicked$1.L$0 = obj;
        return iMEventTracker$trackIMLinkClicked$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMEventTracker$trackIMLinkClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        OKConversation oKConversation;
        OKConversation oKConversation2;
        sHZ shzAEQbTJ;
        InterfaceC44375sNm interfaceC44375sNmEZpvd;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$conversationId;
            Result.Application application2 = Result.Companion;
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU == null || (shzAEQbTJ = interfaceC35180nqU.AEQbTJ()) == null || (interfaceC44375sNmEZpvd = shzAEQbTJ.EZpvd()) == null) {
                oKConversation2 = null;
                objM7377constructorimpl = Result.m7377constructorimpl(oKConversation2);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                oKConversation = (OKConversation) objM7377constructorimpl;
                if (oKConversation != null) {
                    final String str2 = this.$conversationId;
                    IMEventTracker iMEventTracker = this.this$0;
                    String str3 = this.$senderId;
                    final IMEventTracker.LinkLocation linkLocation = this.$linkLocation;
                    final String str4 = this.$link;
                    final int iEZpvd = iMEventTracker.EZpvd(oKConversation);
                    String conversationTitle = oKConversation.getConversationTitle();
                    if (conversationTitle == null) {
                        conversationTitle = "";
                    }
                    final Integer numAEQbTJ = iMEventTracker.AEQbTJ(oKConversation);
                    final Integer numOLrzqt = iMEventTracker.OLrzqt(oKConversation, str3);
                    final String str5 = conversationTitle;
                    C32866mlf.onEvent$default("IMChat_Link_Open_Click", (TrackChannel[]) null, new Function1() { // from class: o.nEs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return IMEventTracker$trackIMLinkClicked$1.invokeSuspend$lambda$5$lambda$3(numAEQbTJ, numOLrzqt, iEZpvd, str5, str2, linkLocation, str4, (EventParamsList) obj2);
                        }
                    }, 1, (Object) null);
                    sEF sef = sEF.OLrzqt;
                    EventData eventDataAEQbTJ = sef.AEQbTJ();
                    eventDataAEQbTJ.setMsg("IMChat_Link_Open_Click");
                    Pair[] pairArr = new Pair[7];
                    pairArr[0] = C56390yDp.OLrzqt("attr_1", str2);
                    pairArr[1] = C56390yDp.OLrzqt("attr_2", conversationTitle);
                    pairArr[2] = C56390yDp.OLrzqt("attr_3", linkLocation.getValue());
                    pairArr[3] = C56390yDp.OLrzqt("attr_4", numAEQbTJ != null ? C33129mqd.gEmmrt(numAEQbTJ) : null);
                    pairArr[4] = C56390yDp.OLrzqt("attr_5", numOLrzqt != null ? C33129mqd.gEmmrt(numOLrzqt) : null);
                    pairArr[5] = C56390yDp.OLrzqt("full_url", str4);
                    pairArr[6] = C56390yDp.OLrzqt("type", C33129mqd.gEmmrt(C56443yFo.AEQbTJ(iEZpvd)));
                    eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(pairArr));
                    sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
                }
                return Unit.INSTANCE;
            }
            OKConversationType oKConversationType = OKConversationType.PRIVATE;
            CacheStrategy cacheStrategy = CacheStrategy.CacheOnly;
            this.label = 1;
            objAEQbTJ = interfaceC44375sNmEZpvd.AEQbTJ(oKConversationType, str, false, cacheStrategy, null, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        oKConversation2 = (OKConversation) objAEQbTJ;
        objM7377constructorimpl = Result.m7377constructorimpl(oKConversation2);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        oKConversation = (OKConversation) objM7377constructorimpl;
        if (oKConversation != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5$lambda$3(Integer num, Integer num2, int i, String str, String str2, IMEventTracker.LinkLocation linkLocation, String str3, EventParamsList eventParamsList) {
        if (num != null) {
            eventParamsList.put("group_type", C33129mqd.gEmmrt(Integer.valueOf(num.intValue())), true);
        }
        if (num2 != null) {
            eventParamsList.put("sender_group_role", C33129mqd.gEmmrt(Integer.valueOf(num2.intValue())), true);
        }
        eventParamsList.put("channel_type", C33129mqd.gEmmrt(Integer.valueOf(i)), true);
        eventParamsList.put("chat_name", str, false);
        eventParamsList.put("channel_id", str2, false);
        eventParamsList.put("link_location", linkLocation.getValue(), false);
        eventParamsList.put("link_url", str3, false);
        return Unit.INSTANCE;
    }
}
