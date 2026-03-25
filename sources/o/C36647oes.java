package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.tracking.IMTrackerMetadataImpl;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oes, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36647oes {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final yHS<java.lang.Integer, java.lang.Long, java.lang.Object[], IMTrackerMetadataImpl, java.lang.Object, Unit> OLrzqt() {
        return new yHS() { // from class: o.oew
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHS
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                return C36647oes.OLrzqt(((java.lang.Integer) obj).intValue(), ((java.lang.Long) obj2).longValue(), (java.lang.Object[]) obj3, (IMTrackerMetadataImpl) obj4, obj5);
            }
        };
    }

    public static final Unit OLrzqt(int i, long j, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(iMTrackerMetadataImpl, "");
        if (i == 0) {
            OLrzqt(j, obj, objArr, iMTrackerMetadataImpl);
        } else if (i == 1) {
            EZpvd(j, obj, objArr, iMTrackerMetadataImpl);
        } else if (i == 2) {
            KWHzl(j, obj, objArr, iMTrackerMetadataImpl);
        } else if (i == 3) {
            copydefault(j, obj, objArr, iMTrackerMetadataImpl);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(long j, java.lang.Object obj, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl) {
        java.lang.Object objGEmmrt = yDV.gEmmrt(objArr, 0);
        OKConversation oKConversation = objGEmmrt instanceof OKConversation ? (OKConversation) objGEmmrt : null;
        java.lang.Object objGEmmrt2 = yDV.gEmmrt(objArr, 1);
        RelationInfo relationInfo = objGEmmrt2 instanceof RelationInfo ? (RelationInfo) objGEmmrt2 : null;
        java.lang.Object objGEmmrt3 = yDV.gEmmrt(objArr, 2);
        java.lang.Boolean bool = objGEmmrt3 instanceof java.lang.Boolean ? (java.lang.Boolean) objGEmmrt3 : null;
        java.lang.Object objGEmmrt4 = yDV.gEmmrt(objArr, 3);
        java.lang.Boolean bool2 = objGEmmrt4 instanceof java.lang.Boolean ? (java.lang.Boolean) objGEmmrt4 : null;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "tag", "OnMoreClicked");
        copydefault(jsonObjectBuilder, oKConversation);
        JsonElementBuildersKt.put(jsonObjectBuilder, "relationId", relationInfo != null ? relationInfo.getContactsId() : null);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isPrivateChat", bool);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isGroupChat", bool2);
        JsonElementBuildersKt.put(jsonObjectBuilder, "timeCost", java.lang.Long.valueOf(j));
        pUU.KWHzl("ChatActivityViewModel", jsonObjectBuilder.build().toString());
    }

    public static final void EZpvd(long j, java.lang.Object obj, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl) {
        java.lang.Object objGEmmrt = yDV.gEmmrt(objArr, 0);
        OKConversation oKConversation = objGEmmrt instanceof OKConversation ? (OKConversation) objGEmmrt : null;
        java.lang.Object objGEmmrt2 = yDV.gEmmrt(objArr, 1);
        java.lang.Boolean bool = objGEmmrt2 instanceof java.lang.Boolean ? (java.lang.Boolean) objGEmmrt2 : null;
        java.lang.Object objGEmmrt3 = yDV.gEmmrt(objArr, 2);
        java.lang.Boolean bool2 = objGEmmrt3 instanceof java.lang.Boolean ? (java.lang.Boolean) objGEmmrt3 : null;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "tag", "onTitleClicked");
        copydefault(jsonObjectBuilder, oKConversation);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isPrivateChat", bool);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isOpponentMerchant", bool2);
        JsonElementBuildersKt.put(jsonObjectBuilder, "timeCost", java.lang.Long.valueOf(j));
        pUU.KWHzl("ChatActivityViewModel", jsonObjectBuilder.build().toString());
    }

    public static final void KWHzl(long j, java.lang.Object obj, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl) {
        java.lang.Object obj2 = iMTrackerMetadataImpl.get("userInfo");
        final com.okinc.okimcore.model.remote.UserInfo userInfo = obj2 instanceof com.okinc.okimcore.model.remote.UserInfo ? (com.okinc.okimcore.model.remote.UserInfo) obj2 : null;
        if (userInfo != null) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("app_okim_join_quit_group_merchant_page_nameenter", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oeu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return C36647oes.KWHzl(userInfo, (EventParamsList) obj3);
                }
            });
        }
    }

    public static final Unit KWHzl(com.okinc.okimcore.model.remote.UserInfo userInfo, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("userIdentity", C44170sFx.KWHzl(userInfo.getOfficialTag()) ? "merchant" : "normal", true);
        return Unit.INSTANCE;
    }

    public static final void copydefault(long j, java.lang.Object obj, java.lang.Object[] objArr, IMTrackerMetadataImpl iMTrackerMetadataImpl) {
        java.lang.Object objGEmmrt = yDV.gEmmrt(objArr, 0);
        OKConversation oKConversation = objGEmmrt instanceof OKConversation ? (OKConversation) objGEmmrt : null;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "tag", "init");
        copydefault(jsonObjectBuilder, oKConversation);
        pUU.KWHzl("ChatActivityViewModel", jsonObjectBuilder.build().toString());
    }

    public static final void copydefault(@NotNull JsonObjectBuilder jsonObjectBuilder, OKConversation oKConversation) {
        OKConversationType conversationType;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        JsonElementBuildersKt.put(jsonObjectBuilder, RemoteMessageConst.Notification.CHANNEL_ID, oKConversation != null ? oKConversation.getTargetId() : null);
        JsonElementBuildersKt.put(jsonObjectBuilder, "channelType", (oKConversation == null || (conversationType = oKConversation.getConversationType()) == null) ? null : conversationType.getTypeName());
        JsonElementBuildersKt.put(jsonObjectBuilder, "chatName", oKConversation != null ? oKConversation.getConversationTitle() : null);
    }
}
