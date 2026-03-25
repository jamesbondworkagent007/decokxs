package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oBF {
    public static final oBF OLrzqt = new oBF();

    private oBF() {
    }

    public final boolean OLrzqt(OKConversation oKConversation) {
        java.lang.String extra;
        java.lang.Boolean boolValueOf;
        java.lang.Object objDecodeFromString;
        JsonObject jsonObject;
        java.util.Set<java.lang.String> setKeySet;
        OKMessageContent latestMessage = oKConversation.getLatestMessage();
        if (latestMessage != null && (extra = latestMessage.getExtra()) != null) {
            try {
                sHY shyCopydefault = sHW.copydefault();
                boolValueOf = null;
                try {
                    Json jsonKWHzl = shyCopydefault.KWHzl();
                    shyCopydefault.KWHzl().getSerializersModule();
                    objDecodeFromString = jsonKWHzl.decodeFromString(BuiltinSerializersKt.getNullable(JsonElement.Companion.serializer()), extra);
                } catch (SerializationException e) {
                    pUU.copydefault("SafeJson", "decodeFromString SerializationException: " + e.getMessage());
                    sSR.copydefault("decodeFromString SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                    objDecodeFromString = null;
                } catch (java.lang.Exception e2) {
                    pUU.copydefault("SafeJson", "decodeFromString error: " + e2.getMessage());
                    sSR.copydefault("decodeFromString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
                    objDecodeFromString = null;
                }
                JsonElement jsonElement = (JsonElement) objDecodeFromString;
                if (jsonElement != null && (jsonObject = JsonElementKt.getJsonObject(jsonElement)) != null && (setKeySet = jsonObject.keySet()) != null) {
                    boolValueOf = java.lang.Boolean.valueOf(setKeySet.contains("c2cOrderId"));
                }
            } catch (java.lang.Exception unused) {
                boolValueOf = java.lang.Boolean.FALSE;
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return false;
    }

    public final boolean EZpvd(@NotNull OKConversation oKConversation, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        java.lang.String targetId = oKConversation.getTargetId();
        boolean zAEQbTJ = C44157sFk.AEQbTJ();
        boolean zEZpvd = C44170sFx.EZpvd(relationInfo.getOfficialTags());
        boolean z = (zAEQbTJ || zEZpvd) ? false : true;
        boolean zIsFriend = relationInfo.isFriend();
        boolean zOLrzqt = OLrzqt(oKConversation);
        boolean z2 = (zIsFriend || !z || zOLrzqt) ? false : true;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, "ConversationPolicy");
        JsonElementBuildersKt.add(jsonArrayBuilder, "isEligibleForShowScamBanner");
        Unit unit = Unit.INSTANCE;
        jsonObjectBuilder.put("tags", jsonArrayBuilder.build());
        JsonElementBuildersKt.put(jsonObjectBuilder, "conversationId", targetId);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isFriend", java.lang.Boolean.valueOf(zIsFriend));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isOfficialUser", java.lang.Boolean.valueOf(zAEQbTJ));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isOpponentOfficialUser", java.lang.Boolean.valueOf(zEZpvd));
        JsonElementBuildersKt.put(jsonObjectBuilder, "bothNotOfficialUser", java.lang.Boolean.valueOf(z));
        JsonElementBuildersKt.put(jsonObjectBuilder, "hasC2cOrderId", java.lang.Boolean.valueOf(zOLrzqt));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isScamBannerAvailable", java.lang.Boolean.valueOf(z2));
        pUU.KWHzl("ConversationPolicy", jsonObjectBuilder.build().toString());
        return z2;
    }

    public static /* synthetic */ boolean isEligibleForShowBlockOrAddToContactSection$default(oBF obf, OKConversation oKConversation, RelationInfo relationInfo, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        return obf.KWHzl(oKConversation, relationInfo, bool);
    }

    public final boolean KWHzl(@NotNull OKConversation oKConversation, @NotNull RelationInfo relationInfo, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        java.lang.String targetId = oKConversation.getTargetId();
        boolean z = false;
        boolean z2 = oKConversation.getConversationType() == OKConversationType.PRIVATE;
        boolean zIsFriend = relationInfo.isFriend();
        boolean zIsBlackList = relationInfo.isBlackList();
        java.lang.Boolean showUnknownContactBanner = relationInfo.getShowUnknownContactBanner();
        boolean zBooleanValue = showUnknownContactBanner != null ? showUnknownContactBanner.booleanValue() : false;
        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
        if (z2 && !zIsFriend && !zIsBlackList && zBooleanValue2 && zBooleanValue) {
            z = true;
        }
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, "ConversationPolicy");
        JsonElementBuildersKt.add(jsonArrayBuilder, "isEligibleForShowBlockOrAddToContactSection");
        Unit unit = Unit.INSTANCE;
        jsonObjectBuilder.put("tags", jsonArrayBuilder.build());
        JsonElementBuildersKt.put(jsonObjectBuilder, "conversationId", targetId);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isPrivateChat", java.lang.Boolean.valueOf(z2));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isFriend", java.lang.Boolean.valueOf(zIsFriend));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isKycCompleted", java.lang.Boolean.valueOf(zBooleanValue2));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isInBlackList", java.lang.Boolean.valueOf(zIsBlackList));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isBlockOrAddToContactSectionAvailable", java.lang.Boolean.valueOf(z));
        JsonElementBuildersKt.put(jsonObjectBuilder, "showUnknownContact", java.lang.Boolean.valueOf(zBooleanValue));
        pUU.KWHzl("ConversationPolicy", jsonObjectBuilder.build().toString());
        return z;
    }

    public final boolean KWHzl(@NotNull OKConversation oKConversation, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        java.lang.String targetId = oKConversation.getTargetId();
        boolean z = oKConversation.getConversationType() == OKConversationType.PRIVATE;
        boolean zIsBlackList = relationInfo.isBlackList();
        boolean z2 = z && zIsBlackList;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, "ConversationPolicy");
        JsonElementBuildersKt.add(jsonArrayBuilder, "isEligibleForShowBlockedUserSection");
        Unit unit = Unit.INSTANCE;
        jsonObjectBuilder.put("tags", jsonArrayBuilder.build());
        JsonElementBuildersKt.put(jsonObjectBuilder, "conversationId", targetId);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isPrivateChat", java.lang.Boolean.valueOf(z));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isBlacklisted", java.lang.Boolean.valueOf(zIsBlackList));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isBlockedUserSectionAvailable", java.lang.Boolean.valueOf(z2));
        pUU.KWHzl("ConversationPolicy", jsonObjectBuilder.build().toString());
        return z2;
    }

    public final boolean KWHzl(@NotNull GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(groupInfo, "");
        java.lang.String notice = groupInfo.getNotice();
        boolean zIsShowNotice = groupInfo.isShowNotice();
        java.lang.String groupId = groupInfo.getGroupId();
        boolean z = zIsShowNotice && C33129mqd.OLrzqt((java.lang.CharSequence) notice);
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        JsonElementBuildersKt.add(jsonArrayBuilder, "ConversationPolicy");
        JsonElementBuildersKt.add(jsonArrayBuilder, "isEligibleForShowGroupAnnouncement");
        Unit unit = Unit.INSTANCE;
        jsonObjectBuilder.put("tags", jsonArrayBuilder.build());
        JsonElementBuildersKt.put(jsonObjectBuilder, "conversationId", groupId);
        JsonElementBuildersKt.put(jsonObjectBuilder, "notice", notice);
        JsonElementBuildersKt.put(jsonObjectBuilder, "isShowNotice", java.lang.Boolean.valueOf(zIsShowNotice));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isEligibleForShowGroupAnnouncement", java.lang.Boolean.valueOf(z));
        pUU.KWHzl("ConversationPolicy", jsonObjectBuilder.build().toString());
        return z;
    }
}
