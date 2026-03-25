package com.okinc.okimcore.tracking;

import com.google.firebase.messaging.Constants;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.tracking.InHouseIMWebSocketSyncManagerTracking$trackOnReceiveWSPushAckEvent$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C32866mlf;
import o.C33129mqd;
import o.C44124sEe;
import o.C44169sFw;
import o.C44484sRn;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.sDZ;
import o.sEF;
import o.xVW;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerTracking$trackOnReceiveWSPushAckEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C44484sRn $conversationRepository;
    final /* synthetic */ WSSendMessageDetailData $sendMsgDetail;
    long J$0;
    int label;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InHouseIMChannelType.values().length];
            try {
                iArr[InHouseIMChannelType.Group.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InHouseIMChannelType.Individual.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerTracking$trackOnReceiveWSPushAckEvent$1(WSSendMessageDetailData wSSendMessageDetailData, C44484sRn c44484sRn, Continuation<? super InHouseIMWebSocketSyncManagerTracking$trackOnReceiveWSPushAckEvent$1> continuation) {
        super(2, continuation);
        this.$sendMsgDetail = wSSendMessageDetailData;
        this.$conversationRepository = c44484sRn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMWebSocketSyncManagerTracking$trackOnReceiveWSPushAckEvent$1(this.$sendMsgDetail, this.$conversationRepository, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerTracking$trackOnReceiveWSPushAckEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        Object objEZpvd;
        OKConversation oKConversationOLrzqt;
        String conversationTitle;
        int i;
        Integer numAEQbTJ;
        Integer num;
        Integer type;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            String channelId = this.$sendMsgDetail.getChannelId();
            if (channelId != null) {
                C44484sRn c44484sRn = this.$conversationRepository;
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                objEZpvd = c44484sRn.EZpvd(channelId, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            }
            final long j = jCurrentTimeMillis;
            if (oKConversationOLrzqt != null || (conversationTitle = oKConversationOLrzqt.getConversationTitle()) == null) {
                conversationTitle = "";
            }
            final String channelId2 = this.$sendMsgDetail.getChannelId();
            InHouseIMContentType contentType = this.$sendMsgDetail.getContentType();
            Integer numAEQbTJ2 = contentType == null ? C56443yFo.AEQbTJ(contentType.getApiValue()) : null;
            InHouseIMChannelType channelType = this.$sendMsgDetail.getChannelType();
            i = channelType != null ? -1 : Activity.OLrzqt[channelType.ordinal()];
            if (i != 1) {
                numAEQbTJ = C56443yFo.AEQbTJ(0);
            } else if (i == 2) {
                numAEQbTJ = C56443yFo.AEQbTJ(1);
            } else {
                num = null;
                final String str = this.$sendMsgDetail.getClientMsgId() + xVW.copydefault();
                if (this.$sendMsgDetail.getChannelType() != InHouseIMChannelType.Group || channelId2 == null) {
                    type = null;
                } else {
                    GroupInfo groupInfoOLrzqt = sDZ.AEQbTJ.valueOf().OLrzqt(channelId2);
                    type = groupInfoOLrzqt != null ? groupInfoOLrzqt.getType() : null;
                }
                final Integer num2 = type;
                final Integer num3 = num;
                final String str2 = conversationTitle;
                Integer num4 = type;
                final Integer num5 = numAEQbTJ2;
                Integer num6 = num;
                Integer num7 = numAEQbTJ2;
                C32866mlf.onEvent$default("IMChat_Message_PushAck_Success", (TrackChannel[]) null, new Function1() { // from class: o.sRU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InHouseIMWebSocketSyncManagerTracking$trackOnReceiveWSPushAckEvent$1.invokeSuspend$lambda$6(num2, num3, str2, channelId2, num5, j, str, (EventParamsList) obj2);
                    }
                }, 1, (Object) null);
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder, "group_type", num4);
                JsonElementBuildersKt.put(jsonObjectBuilder, "channel_type", num6);
                JsonElementBuildersKt.put(jsonObjectBuilder, "chat_name", conversationTitle);
                JsonElementBuildersKt.put(jsonObjectBuilder, "channel_id", channelId2);
                JsonElementBuildersKt.put(jsonObjectBuilder, "message_type", num7);
                JsonElementBuildersKt.put(jsonObjectBuilder, "timestamp", C56443yFo.KWHzl(j));
                JsonElementBuildersKt.put(jsonObjectBuilder, Constants.MessagePayloadKeys.MSGID_SERVER, str);
                String string = jsonObjectBuilder.build().toString();
                sEF sef = sEF.OLrzqt;
                EventData eventDataAEQbTJ = sef.AEQbTJ();
                eventDataAEQbTJ.setMsg("IMChat_Message_PushAck_Success");
                eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("isRunningInEmulator", C33129mqd.gEmmrt(num4)), C56390yDp.OLrzqt("path", String.valueOf(num6)), C56390yDp.OLrzqt("isAppDebuggable", conversationTitle), C56390yDp.OLrzqt("totalTime", C33129mqd.gEmmrt(channelId2)), C56390yDp.OLrzqt("attr_1", String.valueOf(num7)), C56390yDp.OLrzqt("attr_2", String.valueOf(j)), C56390yDp.OLrzqt("attr_3", str)));
                sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
                C44124sEe.imLogTrackEvent$default(string, null, 2, null);
                return Unit.INSTANCE;
            }
            num = numAEQbTJ;
            final String str3 = this.$sendMsgDetail.getClientMsgId() + xVW.copydefault();
            if (this.$sendMsgDetail.getChannelType() != InHouseIMChannelType.Group) {
                type = null;
            }
            final Integer num22 = type;
            final Integer num32 = num;
            final String str22 = conversationTitle;
            Integer num42 = type;
            final Integer num52 = numAEQbTJ2;
            Integer num62 = num;
            Integer num72 = numAEQbTJ2;
            C32866mlf.onEvent$default("IMChat_Message_PushAck_Success", (TrackChannel[]) null, new Function1() { // from class: o.sRU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return InHouseIMWebSocketSyncManagerTracking$trackOnReceiveWSPushAckEvent$1.invokeSuspend$lambda$6(num22, num32, str22, channelId2, num52, j, str3, (EventParamsList) obj2);
                }
            }, 1, (Object) null);
            JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder2, "group_type", num42);
            JsonElementBuildersKt.put(jsonObjectBuilder2, "channel_type", num62);
            JsonElementBuildersKt.put(jsonObjectBuilder2, "chat_name", conversationTitle);
            JsonElementBuildersKt.put(jsonObjectBuilder2, "channel_id", channelId2);
            JsonElementBuildersKt.put(jsonObjectBuilder2, "message_type", num72);
            JsonElementBuildersKt.put(jsonObjectBuilder2, "timestamp", C56443yFo.KWHzl(j));
            JsonElementBuildersKt.put(jsonObjectBuilder2, Constants.MessagePayloadKeys.MSGID_SERVER, str3);
            String string2 = jsonObjectBuilder2.build().toString();
            sEF sef2 = sEF.OLrzqt;
            EventData eventDataAEQbTJ2 = sef2.AEQbTJ();
            eventDataAEQbTJ2.setMsg("IMChat_Message_PushAck_Success");
            eventDataAEQbTJ2.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("isRunningInEmulator", C33129mqd.gEmmrt(num42)), C56390yDp.OLrzqt("path", String.valueOf(num62)), C56390yDp.OLrzqt("isAppDebuggable", conversationTitle), C56390yDp.OLrzqt("totalTime", C33129mqd.gEmmrt(channelId2)), C56390yDp.OLrzqt("attr_1", String.valueOf(num72)), C56390yDp.OLrzqt("attr_2", String.valueOf(j)), C56390yDp.OLrzqt("attr_3", str3)));
            sef2.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ2);
            C44124sEe.imLogTrackEvent$default(string2, null, 2, null);
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j2 = this.J$0;
        C56391yDq.AEQbTJ(obj);
        jCurrentTimeMillis = j2;
        objEZpvd = obj;
        InHouseIMConversationEntity inHouseIMConversationEntity = (InHouseIMConversationEntity) objEZpvd;
        oKConversationOLrzqt = inHouseIMConversationEntity != null ? C44169sFw.OLrzqt(inHouseIMConversationEntity) : null;
        final long j3 = jCurrentTimeMillis;
        if (oKConversationOLrzqt != null) {
            conversationTitle = "";
        }
        final String channelId22 = this.$sendMsgDetail.getChannelId();
        InHouseIMContentType contentType2 = this.$sendMsgDetail.getContentType();
        if (contentType2 == null) {
        }
        InHouseIMChannelType channelType2 = this.$sendMsgDetail.getChannelType();
        if (channelType2 != null) {
        }
        if (i != 1) {
        }
        num = numAEQbTJ;
        final String str32 = this.$sendMsgDetail.getClientMsgId() + xVW.copydefault();
        if (this.$sendMsgDetail.getChannelType() != InHouseIMChannelType.Group) {
        }
        final Integer num222 = type;
        final Integer num322 = num;
        final String str222 = conversationTitle;
        Integer num422 = type;
        final Integer num522 = numAEQbTJ2;
        Integer num622 = num;
        Integer num722 = numAEQbTJ2;
        C32866mlf.onEvent$default("IMChat_Message_PushAck_Success", (TrackChannel[]) null, new Function1() { // from class: o.sRU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return InHouseIMWebSocketSyncManagerTracking$trackOnReceiveWSPushAckEvent$1.invokeSuspend$lambda$6(num222, num322, str222, channelId22, num522, j3, str32, (EventParamsList) obj2);
            }
        }, 1, (Object) null);
        JsonObjectBuilder jsonObjectBuilder22 = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder22, "group_type", num422);
        JsonElementBuildersKt.put(jsonObjectBuilder22, "channel_type", num622);
        JsonElementBuildersKt.put(jsonObjectBuilder22, "chat_name", conversationTitle);
        JsonElementBuildersKt.put(jsonObjectBuilder22, "channel_id", channelId22);
        JsonElementBuildersKt.put(jsonObjectBuilder22, "message_type", num722);
        JsonElementBuildersKt.put(jsonObjectBuilder22, "timestamp", C56443yFo.KWHzl(j3));
        JsonElementBuildersKt.put(jsonObjectBuilder22, Constants.MessagePayloadKeys.MSGID_SERVER, str32);
        String string22 = jsonObjectBuilder22.build().toString();
        sEF sef22 = sEF.OLrzqt;
        EventData eventDataAEQbTJ22 = sef22.AEQbTJ();
        eventDataAEQbTJ22.setMsg("IMChat_Message_PushAck_Success");
        eventDataAEQbTJ22.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("isRunningInEmulator", C33129mqd.gEmmrt(num422)), C56390yDp.OLrzqt("path", String.valueOf(num622)), C56390yDp.OLrzqt("isAppDebuggable", conversationTitle), C56390yDp.OLrzqt("totalTime", C33129mqd.gEmmrt(channelId22)), C56390yDp.OLrzqt("attr_1", String.valueOf(num722)), C56390yDp.OLrzqt("attr_2", String.valueOf(j3)), C56390yDp.OLrzqt("attr_3", str32)));
        sef22.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ22);
        C44124sEe.imLogTrackEvent$default(string22, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6(Integer num, Integer num2, String str, String str2, Integer num3, long j, String str3, EventParamsList eventParamsList) {
        if (num != null) {
            EventParamsList.put$default(eventParamsList, "group_type", C33129mqd.gEmmrt(Integer.valueOf(num.intValue())), false, 4, null);
        }
        if (num2 != null) {
            EventParamsList.put$default(eventParamsList, "channel_type", C33129mqd.gEmmrt(Integer.valueOf(num2.intValue())), false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "chat_name", str, false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "channel_id", str2, false, 4, null);
        }
        if (num3 != null) {
            EventParamsList.put$default(eventParamsList, "message_type", C33129mqd.gEmmrt(Integer.valueOf(num3.intValue())), false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "timestamp", C33129mqd.gEmmrt(Long.valueOf(j)), false, 4, null);
        EventParamsList.put$default(eventParamsList, Constants.MessagePayloadKeys.MSGID_SERVER, str3, false, 4, null);
        return Unit.INSTANCE;
    }
}
