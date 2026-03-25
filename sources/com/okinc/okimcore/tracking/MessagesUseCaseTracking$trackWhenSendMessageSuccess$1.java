package com.okinc.okimcore.tracking;

import com.google.firebase.messaging.Constants;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.tracking.MessagesUseCaseTracking$trackWhenSendMessageSuccess$1;
import kotlin.Result;
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
import o.C44166sFt;
import o.C44169sFw;
import o.C44484sRn;
import o.C44485sRo;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.sEF;
import o.xVW;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCaseTracking$trackWhenSendMessageSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C44485sRo $contactRepository;
    final /* synthetic */ C44484sRn $conversationRepository;
    final /* synthetic */ String $event;
    final /* synthetic */ InHouseIMMessageEntity $message;
    final /* synthetic */ Long $time;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCaseTracking$trackWhenSendMessageSuccess$1(Long l, C44484sRn c44484sRn, InHouseIMMessageEntity inHouseIMMessageEntity, C44485sRo c44485sRo, String str, Continuation<? super MessagesUseCaseTracking$trackWhenSendMessageSuccess$1> continuation) {
        super(2, continuation);
        this.$time = l;
        this.$conversationRepository = c44484sRn;
        this.$message = inHouseIMMessageEntity;
        this.$contactRepository = c44485sRo;
        this.$event = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessagesUseCaseTracking$trackWhenSendMessageSuccess$1 messagesUseCaseTracking$trackWhenSendMessageSuccess$1 = new MessagesUseCaseTracking$trackWhenSendMessageSuccess$1(this.$time, this.$conversationRepository, this.$message, this.$contactRepository, this.$event, continuation);
        messagesUseCaseTracking$trackWhenSendMessageSuccess$1.L$0 = obj;
        return messagesUseCaseTracking$trackWhenSendMessageSuccess$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessagesUseCaseTracking$trackWhenSendMessageSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InHouseIMMessageEntity inHouseIMMessageEntity;
        C44485sRo c44485sRo;
        Object objEZpvd;
        String str;
        String str2;
        String conversationTitle;
        String channelId;
        int contentType;
        int i;
        String str3;
        Object objOLrzqt;
        int i2;
        String str4;
        String str5;
        String str6;
        GroupTagType groupType;
        int value;
        String strCopydefault;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity;
        RelationSourceType relationSourceType;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            Long l = this.$time;
            C44484sRn c44484sRn = this.$conversationRepository;
            inHouseIMMessageEntity = this.$message;
            c44485sRo = this.$contactRepository;
            String str7 = this.$event;
            Result.Application application2 = Result.Companion;
            String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(l != null ? l.longValue() : System.currentTimeMillis()));
            String channelId2 = inHouseIMMessageEntity.getChannelId();
            this.L$0 = inHouseIMMessageEntity;
            this.L$1 = c44485sRo;
            this.L$2 = str7;
            this.L$3 = strGEmmrt;
            this.label = 1;
            objEZpvd = c44484sRn.EZpvd(channelId2, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str = str7;
            str2 = strGEmmrt;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$1;
                int i4 = this.I$0;
                str4 = (String) this.L$4;
                str6 = (String) this.L$3;
                str5 = (String) this.L$2;
                str2 = (String) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                contentType = i4;
                objOLrzqt = obj;
                inHouseIMContactInfoEntity = (InHouseIMContactInfoEntity) objOLrzqt;
                if (inHouseIMContactInfoEntity != null || (relationSourceType = inHouseIMContactInfoEntity.getRelationSourceType()) == null) {
                    i = i2;
                    str3 = str4;
                    channelId = str6;
                    conversationTitle = str5;
                    value = 0;
                    final int i5 = value;
                    final int i6 = i;
                    final String str8 = conversationTitle;
                    final String str9 = channelId;
                    final int i7 = contentType;
                    final String str10 = str2;
                    final String str11 = str3;
                    C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.sRV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return MessagesUseCaseTracking$trackWhenSendMessageSuccess$1.invokeSuspend$lambda$3$lambda$0(i5, i6, str8, str9, i7, str10, str11, (EventParamsList) obj2);
                        }
                    }, 1, (Object) null);
                    JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                    JsonElementBuildersKt.put(jsonObjectBuilder, "group_type", C56443yFo.AEQbTJ(value));
                    JsonElementBuildersKt.put(jsonObjectBuilder, "channel_type", C56443yFo.AEQbTJ(i));
                    JsonElementBuildersKt.put(jsonObjectBuilder, "chat_name", conversationTitle);
                    JsonElementBuildersKt.put(jsonObjectBuilder, "channel_id", channelId);
                    JsonElementBuildersKt.put(jsonObjectBuilder, "message_type", C56443yFo.AEQbTJ(contentType));
                    JsonElementBuildersKt.put(jsonObjectBuilder, "timestamp", str2);
                    JsonElementBuildersKt.put(jsonObjectBuilder, Constants.MessagePayloadKeys.MSGID_SERVER, str3);
                    String string = jsonObjectBuilder.build().toString();
                    sEF sef = sEF.OLrzqt;
                    EventData eventDataAEQbTJ = sef.AEQbTJ();
                    eventDataAEQbTJ.setMsg(str);
                    eventDataAEQbTJ.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("isRunningInEmulator", C33129mqd.gEmmrt(C56443yFo.AEQbTJ(value))), C56390yDp.OLrzqt("path", String.valueOf(i)), C56390yDp.OLrzqt("isAppDebuggable", conversationTitle), C56390yDp.OLrzqt("totalTime", channelId), C56390yDp.OLrzqt("attr_1", String.valueOf(contentType)), C56390yDp.OLrzqt("attr_2", str2), C56390yDp.OLrzqt("attr_3", str3)));
                    sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
                    C44124sEe.imLogTrackEvent$default(string, null, 2, null);
                    Result.m7377constructorimpl(Unit.INSTANCE);
                    return Unit.INSTANCE;
                }
                i = i2;
                value = relationSourceType.getValue();
                str3 = str4;
                channelId = str6;
                conversationTitle = str5;
                final int i52 = value;
                final int i62 = i;
                final String str82 = conversationTitle;
                final String str92 = channelId;
                final int i72 = contentType;
                final String str102 = str2;
                final String str112 = str3;
                C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.sRV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return MessagesUseCaseTracking$trackWhenSendMessageSuccess$1.invokeSuspend$lambda$3$lambda$0(i52, i62, str82, str92, i72, str102, str112, (EventParamsList) obj2);
                    }
                }, 1, (Object) null);
                JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder2, "group_type", C56443yFo.AEQbTJ(value));
                JsonElementBuildersKt.put(jsonObjectBuilder2, "channel_type", C56443yFo.AEQbTJ(i));
                JsonElementBuildersKt.put(jsonObjectBuilder2, "chat_name", conversationTitle);
                JsonElementBuildersKt.put(jsonObjectBuilder2, "channel_id", channelId);
                JsonElementBuildersKt.put(jsonObjectBuilder2, "message_type", C56443yFo.AEQbTJ(contentType));
                JsonElementBuildersKt.put(jsonObjectBuilder2, "timestamp", str2);
                JsonElementBuildersKt.put(jsonObjectBuilder2, Constants.MessagePayloadKeys.MSGID_SERVER, str3);
                String string2 = jsonObjectBuilder2.build().toString();
                sEF sef2 = sEF.OLrzqt;
                EventData eventDataAEQbTJ2 = sef2.AEQbTJ();
                eventDataAEQbTJ2.setMsg(str);
                eventDataAEQbTJ2.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("isRunningInEmulator", C33129mqd.gEmmrt(C56443yFo.AEQbTJ(value))), C56390yDp.OLrzqt("path", String.valueOf(i)), C56390yDp.OLrzqt("isAppDebuggable", conversationTitle), C56390yDp.OLrzqt("totalTime", channelId), C56390yDp.OLrzqt("attr_1", String.valueOf(contentType)), C56390yDp.OLrzqt("attr_2", str2), C56390yDp.OLrzqt("attr_3", str3)));
                sef2.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ2);
                C44124sEe.imLogTrackEvent$default(string2, null, 2, null);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            String str12 = (String) this.L$3;
            String str13 = (String) this.L$2;
            c44485sRo = (C44485sRo) this.L$1;
            inHouseIMMessageEntity = (InHouseIMMessageEntity) this.L$0;
            C56391yDq.AEQbTJ(obj);
            str2 = str12;
            str = str13;
            objEZpvd = obj;
        }
        InHouseIMConversationEntity inHouseIMConversationEntity = (InHouseIMConversationEntity) objEZpvd;
        OKConversation oKConversationOLrzqt = inHouseIMConversationEntity != null ? C44169sFw.OLrzqt(inHouseIMConversationEntity) : null;
        String str14 = "";
        if (oKConversationOLrzqt == null || (conversationTitle = oKConversationOLrzqt.getConversationTitle()) == null) {
            conversationTitle = "";
        }
        channelId = inHouseIMMessageEntity.getChannelId();
        if (oKConversationOLrzqt != null && (strCopydefault = C44166sFt.copydefault(oKConversationOLrzqt)) != null) {
            str14 = strCopydefault;
        }
        contentType = inHouseIMMessageEntity.getContentType();
        int channelType = inHouseIMMessageEntity.getChannelType();
        InHouseIMChannelType inHouseIMChannelType = InHouseIMChannelType.Group;
        i = channelType == inHouseIMChannelType.getApiValue() ? 0 : 1;
        str3 = inHouseIMMessageEntity.getMessageId() + xVW.copydefault();
        if (inHouseIMMessageEntity.getChannelType() == inHouseIMChannelType.getApiValue()) {
            if (oKConversationOLrzqt != null && (groupType = oKConversationOLrzqt.getGroupType()) != null) {
                value = groupType.getValue();
            }
            final int i522 = value;
            final int i622 = i;
            final String str822 = conversationTitle;
            final String str922 = channelId;
            final int i722 = contentType;
            final String str1022 = str2;
            final String str1122 = str3;
            C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.sRV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MessagesUseCaseTracking$trackWhenSendMessageSuccess$1.invokeSuspend$lambda$3$lambda$0(i522, i622, str822, str922, i722, str1022, str1122, (EventParamsList) obj2);
                }
            }, 1, (Object) null);
            JsonObjectBuilder jsonObjectBuilder22 = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder22, "group_type", C56443yFo.AEQbTJ(value));
            JsonElementBuildersKt.put(jsonObjectBuilder22, "channel_type", C56443yFo.AEQbTJ(i));
            JsonElementBuildersKt.put(jsonObjectBuilder22, "chat_name", conversationTitle);
            JsonElementBuildersKt.put(jsonObjectBuilder22, "channel_id", channelId);
            JsonElementBuildersKt.put(jsonObjectBuilder22, "message_type", C56443yFo.AEQbTJ(contentType));
            JsonElementBuildersKt.put(jsonObjectBuilder22, "timestamp", str2);
            JsonElementBuildersKt.put(jsonObjectBuilder22, Constants.MessagePayloadKeys.MSGID_SERVER, str3);
            String string22 = jsonObjectBuilder22.build().toString();
            sEF sef22 = sEF.OLrzqt;
            EventData eventDataAEQbTJ22 = sef22.AEQbTJ();
            eventDataAEQbTJ22.setMsg(str);
            eventDataAEQbTJ22.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("isRunningInEmulator", C33129mqd.gEmmrt(C56443yFo.AEQbTJ(value))), C56390yDp.OLrzqt("path", String.valueOf(i)), C56390yDp.OLrzqt("isAppDebuggable", conversationTitle), C56390yDp.OLrzqt("totalTime", channelId), C56390yDp.OLrzqt("attr_1", String.valueOf(contentType)), C56390yDp.OLrzqt("attr_2", str2), C56390yDp.OLrzqt("attr_3", str3)));
            sef22.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ22);
            C44124sEe.imLogTrackEvent$default(string22, null, 2, null);
            Result.m7377constructorimpl(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
        if (c44485sRo != null) {
            this.L$0 = str;
            this.L$1 = str2;
            this.L$2 = conversationTitle;
            this.L$3 = channelId;
            this.L$4 = str3;
            this.I$0 = contentType;
            this.I$1 = i;
            this.label = 2;
            objOLrzqt = c44485sRo.OLrzqt(str14, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            i2 = i;
            str4 = str3;
            str5 = conversationTitle;
            str6 = channelId;
            inHouseIMContactInfoEntity = (InHouseIMContactInfoEntity) objOLrzqt;
            if (inHouseIMContactInfoEntity != null) {
            }
            i = i2;
            str3 = str4;
            channelId = str6;
            conversationTitle = str5;
        }
        value = 0;
        final int i5222 = value;
        final int i6222 = i;
        final String str8222 = conversationTitle;
        final String str9222 = channelId;
        final int i7222 = contentType;
        final String str10222 = str2;
        final String str11222 = str3;
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.sRV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return MessagesUseCaseTracking$trackWhenSendMessageSuccess$1.invokeSuspend$lambda$3$lambda$0(i5222, i6222, str8222, str9222, i7222, str10222, str11222, (EventParamsList) obj2);
            }
        }, 1, (Object) null);
        JsonObjectBuilder jsonObjectBuilder222 = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder222, "group_type", C56443yFo.AEQbTJ(value));
        JsonElementBuildersKt.put(jsonObjectBuilder222, "channel_type", C56443yFo.AEQbTJ(i));
        JsonElementBuildersKt.put(jsonObjectBuilder222, "chat_name", conversationTitle);
        JsonElementBuildersKt.put(jsonObjectBuilder222, "channel_id", channelId);
        JsonElementBuildersKt.put(jsonObjectBuilder222, "message_type", C56443yFo.AEQbTJ(contentType));
        JsonElementBuildersKt.put(jsonObjectBuilder222, "timestamp", str2);
        JsonElementBuildersKt.put(jsonObjectBuilder222, Constants.MessagePayloadKeys.MSGID_SERVER, str3);
        String string222 = jsonObjectBuilder222.build().toString();
        sEF sef222 = sEF.OLrzqt;
        EventData eventDataAEQbTJ222 = sef222.AEQbTJ();
        eventDataAEQbTJ222.setMsg(str);
        eventDataAEQbTJ222.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("isRunningInEmulator", C33129mqd.gEmmrt(C56443yFo.AEQbTJ(value))), C56390yDp.OLrzqt("path", String.valueOf(i)), C56390yDp.OLrzqt("isAppDebuggable", conversationTitle), C56390yDp.OLrzqt("totalTime", channelId), C56390yDp.OLrzqt("attr_1", String.valueOf(contentType)), C56390yDp.OLrzqt("attr_2", str2), C56390yDp.OLrzqt("attr_3", str3)));
        sef222.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ222);
        C44124sEe.imLogTrackEvent$default(string222, null, 2, null);
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$0(int i, int i2, String str, String str2, int i3, String str3, String str4, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "group_type", C33129mqd.gEmmrt(Integer.valueOf(i)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_type", C33129mqd.gEmmrt(Integer.valueOf(i2)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chat_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_id", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "message_type", C33129mqd.gEmmrt(Integer.valueOf(i3)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "timestamp", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, Constants.MessagePayloadKeys.MSGID_SERVER, str4, false, 4, null);
        return Unit.INSTANCE;
    }
}
