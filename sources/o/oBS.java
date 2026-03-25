package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.im.imui.tracking.IMTrackerMetadataImpl;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class oBS {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final yHS<java.lang.Integer, java.lang.Long, java.lang.Object[], IMTrackerMetadataImpl, java.lang.Object, Unit> copydefault() {
        return new yHS() { // from class: o.oBV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHS
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                return oBS.copydefault(((java.lang.Integer) obj).intValue(), ((java.lang.Long) obj2).longValue(), (java.lang.Object[]) obj3, (IMTrackerMetadataImpl) obj4, obj5);
            }
        };
    }

    public static final Unit copydefault(int i, long j, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(iMTrackerMetadataImpl, "");
        switch (i) {
            case 0:
                AEQbTJ(j, obj, objArr, iMTrackerMetadataImpl);
                break;
            case 1:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ReloadMessageForNavigation");
                break;
            case 2:
                OLrzqt(j, obj, objArr, iMTrackerMetadataImpl);
                break;
            case 3:
                KWHzl(j, obj, objArr, iMTrackerMetadataImpl);
                break;
            case 4:
                EZpvd(j, obj, objArr, iMTrackerMetadataImpl);
                break;
            case 5:
                KWHzl(j, objArr, iMTrackerMetadataImpl);
                break;
            case 7:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ResetTargetMessage");
                break;
            case 8:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "RefreshMessageList");
                break;
            case 9:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ClearMessageList");
                break;
            case 10:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplySendMessageEvent");
                break;
            case 11:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplySendMediaMessageEvent");
                break;
            case 12:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyReceivedMessageEvent");
                break;
            case 13:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyReadReceiptEvent");
                break;
            case 14:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyInsertedMessageEvent");
                break;
            case 15:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyRecallEvent");
                break;
            case 16:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyDeleteMessageEvent");
                break;
            case 17:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyReplaceMessageEvent");
                break;
            case 18:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyRefreshMessageEvent");
                break;
            case 19:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyReceiveGroupNotifyMessageEvent");
                break;
            case 20:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyClearMessageEvent");
                break;
            case 21:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyDownloadedMessages");
                break;
            case 22:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "UpdateIsShowMessageState");
                break;
            case 23:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyUpdateAudioPlayState");
                break;
            case 24:
                AEQbTJ(j, objArr, iMTrackerMetadataImpl, obj, "ApplyUpdateAudioDownloadState");
                break;
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(long j, java.lang.Object obj, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl) {
        KWHzl(true, j, obj, objArr, iMTrackerMetadataImpl);
    }

    public static final void AEQbTJ(long j, java.lang.Object obj, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl) {
        KWHzl(false, j, obj, objArr, iMTrackerMetadataImpl);
    }

    public static final void KWHzl(boolean z, long j, java.lang.Object obj, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl) {
        java.lang.String str = z ? "Chat screen init message list success" : "Chat screen reload message list success";
        java.lang.String str2 = z ? "Chat screen init message list failure" : "Chat screen reload message list failure";
        boolean z2 = obj instanceof java.lang.Throwable;
        if (z2) {
            str = str2;
        }
        java.lang.String str3 = z ? "InitMessages" : "ReloadMessages";
        java.lang.Object objGEmmrt = yDV.gEmmrt(objArr, 0);
        OKConversation oKConversation = objGEmmrt instanceof OKConversation ? (OKConversation) objGEmmrt : null;
        if (oKConversation == null) {
            return;
        }
        int i = oKConversation.getConversationType() == OKConversationType.GROUP ? 0 : 1;
        java.lang.String targetId = oKConversation.getTargetId();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(oKConversation.getConversationTitle());
        java.lang.Object obj2 = iMTrackerMetadataImpl.get("timeCostGetMaxSequence");
        java.lang.Object obj3 = iMTrackerMetadataImpl.get("maxSequence");
        java.lang.Object obj4 = iMTrackerMetadataImpl.get("messageId");
        java.lang.Object obj5 = iMTrackerMetadataImpl.get("pageSize");
        java.lang.Object obj6 = iMTrackerMetadataImpl.get("timeCostLoadMessages");
        int size = obj instanceof java.util.List ? ((java.util.List) obj).size() : 0;
        java.lang.String strAEQbTJ = z2 ? C56379yDe.AEQbTJ((java.lang.Throwable) obj) : null;
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg(str);
        java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("path", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i))), C56390yDp.OLrzqt("isAppDebuggable", strGEmmrt), C56390yDp.OLrzqt("totalTime", targetId), C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(java.lang.Long.valueOf(j))), C56390yDp.OLrzqt("attr_2", C33129mqd.gEmmrt(obj2)), C56390yDp.OLrzqt("attr_3", C33129mqd.gEmmrt(obj3)), C56390yDp.OLrzqt("attr_4", C33129mqd.gEmmrt(obj4)), C56390yDp.OLrzqt("attr_5", C33129mqd.gEmmrt(obj5)), C56390yDp.OLrzqt("full_url", C33129mqd.gEmmrt(obj6)), C56390yDp.OLrzqt("type", C33129mqd.gEmmrt(java.lang.Integer.valueOf(size))));
        if (strAEQbTJ != null) {
            mapDjBIcL.put("click", strAEQbTJ);
        }
        eventDataAEQbTJ.setAttrs(mapDjBIcL);
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "tag", str3);
        JsonElementBuildersKt.put(jsonObjectBuilder, "channelType", java.lang.Integer.valueOf(i));
        JsonElementBuildersKt.put(jsonObjectBuilder, "chatName", strGEmmrt);
        JsonElementBuildersKt.put(jsonObjectBuilder, RemoteMessageConst.Notification.CHANNEL_ID, targetId);
        JsonElementBuildersKt.put(jsonObjectBuilder, "timeCost", java.lang.Long.valueOf(j));
        java.util.Set<Map.Entry<java.lang.String, java.lang.Object>> setEntrySet = iMTrackerMetadataImpl.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Intrinsics.copydefault(entry);
            java.lang.Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            JsonElementBuildersKt.put(jsonObjectBuilder, (java.lang.String) key, C33129mqd.gEmmrt(entry.getValue()));
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "result", OLrzqt(obj));
        pUU.EZpvd("MessageListUseCase", jsonObjectBuilder.build().toString());
    }

    public static final void KWHzl(long j, java.lang.Object obj, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl) {
        java.lang.Object objGEmmrt = yDV.gEmmrt(objArr, 0);
        OKConversation oKConversation = objGEmmrt instanceof OKConversation ? (OKConversation) objGEmmrt : null;
        if (oKConversation == null) {
            return;
        }
        java.lang.Object objGEmmrt2 = yDV.gEmmrt(objArr, 1);
        OKMessage oKMessage = objGEmmrt2 instanceof OKMessage ? (OKMessage) objGEmmrt2 : null;
        if (oKMessage == null) {
            return;
        }
        java.lang.Object objGEmmrt3 = yDV.gEmmrt(objArr, 2);
        java.lang.Boolean bool = objGEmmrt3 instanceof java.lang.Boolean ? (java.lang.Boolean) objGEmmrt3 : null;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            int i = oKConversation.getConversationType() == OKConversationType.GROUP ? 0 : 1;
            java.lang.String targetId = oKConversation.getTargetId();
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(oKConversation.getConversationTitle());
            int size = obj instanceof java.util.List ? ((java.util.List) obj).size() : 0;
            boolean z = obj instanceof java.lang.Throwable;
            java.lang.String str = z ? "Chat screen load newer message failure" : "Chat screen load newer message success";
            sEF sef = sEF.OLrzqt;
            EventData eventDataAEQbTJ = sef.AEQbTJ();
            eventDataAEQbTJ.setMsg(str);
            java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("path", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i))), C56390yDp.OLrzqt("isAppDebuggable", strGEmmrt), C56390yDp.OLrzqt("totalTime", targetId), C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(java.lang.Long.valueOf(j))), C56390yDp.OLrzqt("attr_2", C33129mqd.gEmmrt(java.lang.Integer.valueOf(size))));
            if (z) {
                mapDjBIcL.put("attr_3", C56379yDe.AEQbTJ((java.lang.Throwable) obj));
            }
            eventDataAEQbTJ.setAttrs(mapDjBIcL);
            sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "tag", "LoadNewerMessage");
            JsonElementBuildersKt.put(jsonObjectBuilder, "channelType", java.lang.Integer.valueOf(i));
            JsonElementBuildersKt.put(jsonObjectBuilder, "chatName", strGEmmrt);
            JsonElementBuildersKt.put(jsonObjectBuilder, RemoteMessageConst.Notification.CHANNEL_ID, targetId);
            JsonElementBuildersKt.put(jsonObjectBuilder, "timeCost", java.lang.Long.valueOf(j));
            JsonElementBuildersKt.put(jsonObjectBuilder, "result", OLrzqt(obj));
            JsonElementBuildersKt.put(jsonObjectBuilder, "messageId", C33129mqd.gEmmrt(java.lang.Long.valueOf(oKMessage.getSeq())));
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSystemMessage", java.lang.Boolean.valueOf(zBooleanValue));
            pUU.EZpvd("MessageListUseCase", jsonObjectBuilder.build().toString());
        }
    }

    public static final void EZpvd(long j, java.lang.Object obj, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl) {
        java.lang.Object objGEmmrt = yDV.gEmmrt(objArr, 0);
        OKConversation oKConversation = objGEmmrt instanceof OKConversation ? (OKConversation) objGEmmrt : null;
        if (oKConversation == null) {
            return;
        }
        java.lang.Object objGEmmrt2 = yDV.gEmmrt(objArr, 1);
        OKMessage oKMessage = objGEmmrt2 instanceof OKMessage ? (OKMessage) objGEmmrt2 : null;
        if (oKMessage == null) {
            return;
        }
        java.lang.Object objGEmmrt3 = yDV.gEmmrt(objArr, 2);
        java.lang.Boolean bool = objGEmmrt3 instanceof java.lang.Boolean ? (java.lang.Boolean) objGEmmrt3 : null;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            int i = oKConversation.getConversationType() == OKConversationType.GROUP ? 0 : 1;
            java.lang.String targetId = oKConversation.getTargetId();
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(oKConversation.getConversationTitle());
            boolean z = obj instanceof java.lang.Throwable;
            java.lang.String str = z ? "Chat screen load older message failure" : "Chat screen load older message success";
            int size = obj instanceof java.util.List ? ((java.util.List) obj).size() : 0;
            sEF sef = sEF.OLrzqt;
            EventData eventDataAEQbTJ = sef.AEQbTJ();
            eventDataAEQbTJ.setMsg(str);
            java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("path", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i))), C56390yDp.OLrzqt("isAppDebuggable", strGEmmrt), C56390yDp.OLrzqt("totalTime", targetId), C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(java.lang.Long.valueOf(j))), C56390yDp.OLrzqt("attr_2", C33129mqd.gEmmrt(java.lang.Integer.valueOf(size))));
            if (z) {
                mapDjBIcL.put("attr_3", C56379yDe.AEQbTJ((java.lang.Throwable) obj));
            }
            eventDataAEQbTJ.setAttrs(mapDjBIcL);
            sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "tag", "LoadOlderMessage");
            JsonElementBuildersKt.put(jsonObjectBuilder, "channelType", java.lang.Integer.valueOf(i));
            JsonElementBuildersKt.put(jsonObjectBuilder, "chatName", strGEmmrt);
            JsonElementBuildersKt.put(jsonObjectBuilder, RemoteMessageConst.Notification.CHANNEL_ID, targetId);
            JsonElementBuildersKt.put(jsonObjectBuilder, "timeCost", java.lang.Long.valueOf(j));
            JsonElementBuildersKt.put(jsonObjectBuilder, "result", OLrzqt(obj));
            JsonElementBuildersKt.put(jsonObjectBuilder, "messageId", C33129mqd.gEmmrt(java.lang.Long.valueOf(oKMessage.getSeq())));
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSystemMessage", java.lang.Boolean.valueOf(zBooleanValue));
            pUU.EZpvd("MessageListUseCase", jsonObjectBuilder.build().toString());
        }
    }

    public static final void KWHzl(long j, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl) {
        java.lang.Object objGEmmrt = yDV.gEmmrt(objArr, 0);
        OKConversation oKConversation = objGEmmrt instanceof OKConversation ? (OKConversation) objGEmmrt : null;
        if (oKConversation == null) {
            return;
        }
        java.lang.Object objGEmmrt2 = yDV.gEmmrt(objArr, 1);
        OKMessage oKMessage = objGEmmrt2 instanceof OKMessage ? (OKMessage) objGEmmrt2 : null;
        java.lang.Object objGEmmrt3 = yDV.gEmmrt(objArr, 2);
        OKMessage oKMessage2 = objGEmmrt3 instanceof OKMessage ? (OKMessage) objGEmmrt3 : null;
        java.lang.Object objGEmmrt4 = yDV.gEmmrt(objArr, 3);
        java.lang.String str = objGEmmrt4 instanceof java.lang.String ? (java.lang.String) objGEmmrt4 : null;
        java.lang.Object objGEmmrt5 = yDV.gEmmrt(objArr, 4);
        java.lang.String str2 = objGEmmrt5 instanceof java.lang.String ? (java.lang.String) objGEmmrt5 : null;
        java.lang.Object objGEmmrt6 = yDV.gEmmrt(objArr, 5);
        java.lang.Boolean bool = objGEmmrt6 instanceof java.lang.Boolean ? (java.lang.Boolean) objGEmmrt6 : null;
        int i = oKConversation.getConversationType() != OKConversationType.GROUP ? 1 : 0;
        java.lang.String targetId = oKConversation.getTargetId();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(oKConversation.getConversationTitle());
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "tag", "SetTargetMessage");
        JsonElementBuildersKt.put(jsonObjectBuilder, "channelType", java.lang.Integer.valueOf(i));
        JsonElementBuildersKt.put(jsonObjectBuilder, "chatName", strGEmmrt);
        JsonElementBuildersKt.put(jsonObjectBuilder, RemoteMessageConst.Notification.CHANNEL_ID, targetId);
        JsonElementBuildersKt.put(jsonObjectBuilder, "searchKeyBefore", C33129mqd.gEmmrt(str));
        JsonElementBuildersKt.put(jsonObjectBuilder, "searchKeyNow", C33129mqd.gEmmrt(str2));
        JsonElementBuildersKt.put(jsonObjectBuilder, "skipRefresh", bool);
        JsonElementBuildersKt.put(jsonObjectBuilder, "timeCost", java.lang.Long.valueOf(j));
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetMessageBefore", C33129mqd.gEmmrt(oKMessage));
        JsonElementBuildersKt.put(jsonObjectBuilder, "targetMessageNow", C33129mqd.gEmmrt(oKMessage2));
        java.util.Set<Map.Entry<java.lang.String, java.lang.Object>> setEntrySet = iMTrackerMetadataImpl.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            JsonElementBuildersKt.put(jsonObjectBuilder, (java.lang.String) key, C33129mqd.gEmmrt(entry.getValue()));
        }
        pUU.EZpvd("MessageListUseCase", jsonObjectBuilder.build().toString());
    }

    public static final java.lang.String OLrzqt(java.lang.Object obj) {
        if (obj instanceof java.lang.Throwable) {
            return C56379yDe.AEQbTJ((java.lang.Throwable) obj);
        }
        C36558odI c36558odI = obj instanceof C36558odI ? (C36558odI) obj : null;
        if (c36558odI != null) {
            return copydefault(c36558odI);
        }
        return null;
    }

    public static final java.lang.String copydefault(C36558odI c36558odI) {
        return "MessageListModel(messagesListSize=" + c36558odI.AEQbTJ().size() + ", conversation=" + c36558odI.OLrzqt() + ", targetMessage=" + c36558odI.AkhnZx() + ", searchKey=" + c36558odI.gEmmrt() + ", startMessageSequence=" + c36558odI.djBIcL() + ", receiveMessage=" + c36558odI.AhwBna() + ", hasNewerMessage=" + c36558odI.KWHzl() + ")";
    }

    public static final void AEQbTJ(long j, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl, java.lang.Object obj, java.lang.String str) {
        java.lang.Object objGEmmrt = yDV.gEmmrt(objArr, 0);
        C36558odI c36558odI = objGEmmrt instanceof C36558odI ? (C36558odI) objGEmmrt : null;
        if (c36558odI == null) {
            return;
        }
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "tag", str);
        JsonElementBuildersKt.put(jsonObjectBuilder, "timeCost", java.lang.Long.valueOf(j));
        JsonElementBuildersKt.put(jsonObjectBuilder, "param", copydefault(c36558odI));
        JsonElementBuildersKt.put(jsonObjectBuilder, "result", OLrzqt(obj));
        pUU.EZpvd("MessageListUseCase", jsonObjectBuilder.build().toString());
    }
}
