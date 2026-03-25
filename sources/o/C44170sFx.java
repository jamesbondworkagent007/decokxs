package o;

import com.okinc.okimcore.model.biz.OKBizCustomMessage;
import com.okinc.okimcore.model.exception.OKIMReportException;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKInformationNotificationMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.IllegalType;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import com.okinc.okimcore.model.remote.GroupRolePermissionItem;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity;
import com.okinc.okuser.data.User;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.sFx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44170sFx {

    /* JADX INFO: renamed from: o.sFx$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupRole.values().length];
            try {
                iArr[GroupRole.Common.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[GroupRole.Administrator.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupRole.Owner.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupRole.Unknown.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    public static final java.lang.Object EZpvd(@NotNull OKMessage oKMessage, boolean z, @NotNull Continuation<? super Unit> continuation) {
        OKMessageContent content = oKMessage.getContent();
        if (content instanceof OKGroupNotificationMessage) {
            java.lang.Object objKWHzl = sJP.EZpvd.KWHzl(oKMessage, z, continuation);
            return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
        }
        if (content instanceof OKBizCustomMessage) {
            sNI.AEQbTJ.OLrzqt(oKMessage);
        } else if (content instanceof OKInformationNotificationMessage) {
            sJV.OLrzqt.OLrzqt(oKMessage);
        }
        return Unit.INSTANCE;
    }

    public static final <T extends OKGroupNotificationMessage> T AEQbTJ(@NotNull OKGroupNotificationMessage oKGroupNotificationMessage, @NotNull java.lang.Class<T> cls) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
        Intrinsics.checkNotNullParameter(oKGroupNotificationMessage, "");
        Intrinsics.checkNotNullParameter(cls, "");
        T tNewInstance = cls.newInstance();
        T t = tNewInstance;
        t.setUserInfo(oKGroupNotificationMessage.getUserInfo());
        t.setMentionedInfo(oKGroupNotificationMessage.getMentionedInfo());
        t.setExtra(oKGroupNotificationMessage.getExtra());
        t.setDestruct(oKGroupNotificationMessage.isDestruct());
        t.setDestructTime(oKGroupNotificationMessage.getDestructTime());
        t.setOperatorUserId(oKGroupNotificationMessage.getOperatorUserId());
        t.setOperation(oKGroupNotificationMessage.getOperation());
        t.setData(oKGroupNotificationMessage.getData());
        t.setMessage(oKGroupNotificationMessage.getMessage());
        Intrinsics.checkNotNullExpressionValue(tNewInstance, "");
        return t;
    }

    public static final <T extends OKInformationNotificationMessage> T OLrzqt(@NotNull OKInformationNotificationMessage oKInformationNotificationMessage, @NotNull java.lang.Class<T> cls) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
        Intrinsics.checkNotNullParameter(oKInformationNotificationMessage, "");
        Intrinsics.checkNotNullParameter(cls, "");
        T tNewInstance = cls.newInstance();
        T t = tNewInstance;
        t.setUserInfo(oKInformationNotificationMessage.getUserInfo());
        t.setMentionedInfo(oKInformationNotificationMessage.getMentionedInfo());
        t.setExtra(oKInformationNotificationMessage.getExtra());
        t.setDestruct(oKInformationNotificationMessage.isDestruct());
        t.setDestructTime(oKInformationNotificationMessage.getDestructTime());
        t.setMessage(oKInformationNotificationMessage.getMessage());
        Intrinsics.checkNotNullExpressionValue(tNewInstance, "");
        return t;
    }

    public static final boolean AEQbTJ(@NotNull OKMessageContent oKMessageContent) {
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        java.lang.String extra = oKMessageContent.getExtra();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) extra)) {
            try {
                return C33129mqd.OLrzqt((java.lang.CharSequence) new JSONObject(extra).optString("c2cOrderId"));
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public static final boolean OLrzqt(@NotNull OKMessageContent oKMessageContent) {
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        if (oKMessageContent.getContentType() == InHouseIMContentType.SystemMessage) {
            return true;
        }
        if (oKMessageContent.getContentType() == InHouseIMContentType.Custom) {
            OKCustomMessage oKCustomMessage = oKMessageContent instanceof OKCustomMessage ? (OKCustomMessage) oKMessageContent : null;
            if (oKCustomMessage != null && oKCustomMessage.isSystemMessage()) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.String OLrzqt(@NotNull com.okinc.okimcore.model.remote.UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (C38303pTu.KWHzl(locale)) {
            java.lang.String petname = userInfo.getPetname();
            return petname == null ? "" : petname;
        }
        java.lang.String enPetname = userInfo.getEnPetname();
        java.lang.String petname2 = userInfo.getPetname();
        java.lang.String str = petname2 != null ? petname2 : "";
        return (enPetname == null || enPetname.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) enPetname)) ? str : enPetname;
    }

    public static final java.lang.String copydefault(@NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(relationInfo, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (C38303pTu.KWHzl(locale)) {
            return relationInfo.getNickName();
        }
        java.lang.String enNickName = relationInfo.getEnNickName();
        java.lang.String nickName = relationInfo.getNickName();
        return (enNickName == null || enNickName.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) enNickName)) ? nickName : enNickName;
    }

    public static final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return (str == null || str.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? str2 : str;
    }

    public static final java.lang.String copydefault(@NotNull GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (C38303pTu.KWHzl(locale)) {
            java.lang.String nickName = groupMemberInfo.getNickName();
            java.lang.String enPetname = groupMemberInfo.getEnPetname();
            if (enPetname == null) {
                enPetname = groupMemberInfo.getName();
            }
            return (nickName == null || nickName.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) nickName)) ? enPetname : nickName;
        }
        java.lang.String enPetname2 = groupMemberInfo.getEnPetname();
        return (enPetname2 == null || enPetname2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) enPetname2)) ? groupMemberInfo.getName() : enPetname2;
    }

    public static final java.lang.String KWHzl(@NotNull InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity) {
        java.lang.String enPetname;
        Intrinsics.checkNotNullParameter(inHouseIMGroupMemberEntity, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (C38303pTu.KWHzl(locale)) {
            java.lang.String nickName = inHouseIMGroupMemberEntity.getNickName();
            enPetname = inHouseIMGroupMemberEntity.getEnPetname();
            if (nickName != null && nickName.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) nickName)) {
                return nickName;
            }
        } else {
            enPetname = inHouseIMGroupMemberEntity.getEnPetname();
            if (enPetname == null || enPetname.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) enPetname)) {
                return "";
            }
        }
        return enPetname;
    }

    public static final java.lang.String OLrzqt(@NotNull InHouseIMConversationEntity inHouseIMConversationEntity) {
        java.lang.String enNickname;
        Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
        java.lang.String nickname = inHouseIMConversationEntity.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        return (C38303pTu.KWHzl(locale) || (enNickname = inHouseIMConversationEntity.getEnNickname()) == null || enNickname.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) enNickname)) ? nickname : enNickname;
    }

    public static final java.lang.String KWHzl(@NotNull OKMessageContent oKMessageContent) {
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        if (oKMessageContent instanceof OKTextMessage) {
            return ((OKTextMessage) oKMessageContent).getContent();
        }
        return null;
    }

    public static final IllegalType OLrzqt(java.lang.String str) {
        C44528sTf c44528sTf = C44528sTf.KWHzl;
        if (str == null) {
            str = "";
        }
        if (c44528sTf.copydefault(str)) {
            return IllegalType.Link;
        }
        return IllegalType.Legality;
    }

    public static final boolean OLrzqt(OfficialTagInfo officialTagInfo) {
        if (officialTagInfo == null) {
            return false;
        }
        return officialTagInfo.getSupportTagTypes().contains(OfficialTagType.ROBOT);
    }

    public static final boolean KWHzl(OfficialTagInfo officialTagInfo) {
        if (officialTagInfo == null) {
            return false;
        }
        return officialTagInfo.getSupportTagTypes().contains(OfficialTagType.CertifiedMerchant) || officialTagInfo.getSupportTagTypes().contains(OfficialTagType.DiamondMerchant);
    }

    public static final boolean valueOf(OfficialTagInfo officialTagInfo) {
        if (officialTagInfo == null) {
            return false;
        }
        java.util.List<OfficialTagType> supportTagTypes = officialTagInfo.getSupportTagTypes();
        if ((supportTagTypes instanceof java.util.Collection) && supportTagTypes.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = supportTagTypes.iterator();
        while (it.hasNext()) {
            if (yDY.gEmmrt(OfficialTagType.Vip1, OfficialTagType.Vip2, OfficialTagType.Vip3, OfficialTagType.Vip4, OfficialTagType.Vip5, OfficialTagType.Vip6, OfficialTagType.Vip7, OfficialTagType.Vip8, OfficialTagType.Vip9).contains((OfficialTagType) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.Integer AEQbTJ(OfficialTagInfo officialTagInfo) {
        java.lang.Object next;
        if (officialTagInfo == null) {
            return null;
        }
        java.util.Iterator<T> it = officialTagInfo.getSupportTagTypes().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (yDY.gEmmrt(OfficialTagType.Vip1, OfficialTagType.Vip2, OfficialTagType.Vip3, OfficialTagType.Vip4, OfficialTagType.Vip5, OfficialTagType.Vip6, OfficialTagType.Vip7, OfficialTagType.Vip8, OfficialTagType.Vip9).contains((OfficialTagType) next)) {
                break;
            }
        }
        OfficialTagType officialTagType = (OfficialTagType) next;
        if (officialTagType != null) {
            return java.lang.Integer.valueOf(officialTagType.getType());
        }
        return null;
    }

    public static final boolean copydefault(OfficialTagInfo officialTagInfo) {
        if (officialTagInfo == null) {
            return false;
        }
        java.util.List<OfficialTagType> supportTagTypes = officialTagInfo.getSupportTagTypes();
        if ((supportTagTypes instanceof java.util.Collection) && supportTagTypes.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = supportTagTypes.iterator();
        while (it.hasNext()) {
            if (yDY.gEmmrt(OfficialTagType.VipRM, OfficialTagType.VipSupport).contains((OfficialTagType) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean OLrzqt(OKConversation oKConversation) {
        return oKConversation != null && oKConversation.getGroupType() == GroupTagType.VIP_CHAT_GROUP;
    }

    public static final boolean AEQbTJ(@NotNull OKConversation oKConversation) {
        User userOLrzqt;
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return oKConversation.getGroupType() == GroupTagType.RM_VIP_GROUP && (userOLrzqt = C44157sFk.gEmmrt().OLrzqt()) != null && userOLrzqt.isVip();
    }

    public static final boolean copydefault(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return oKConversation.getConversationType() == OKConversationType.GROUP && oKConversation.getInGroupStatus() == InGroupStatus.NOT_IN_GROUP && oKConversation.getGroupStatus() == GroupStatus.NORMAL;
    }

    public static final boolean KWHzl(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return oKConversation.getConversationType() == OKConversationType.GROUP && oKConversation.getInGroupStatus() == InGroupStatus.NOT_IN_GROUP && oKConversation.getGroupStatus() == GroupStatus.DISMISS;
    }

    public static final boolean EZpvd(OfficialTagInfo officialTagInfo) {
        if (officialTagInfo == null) {
            return false;
        }
        java.util.List<OfficialTagType> supportTagTypes = officialTagInfo.getSupportTagTypes();
        if ((supportTagTypes instanceof java.util.Collection) && supportTagTypes.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = supportTagTypes.iterator();
        while (it.hasNext()) {
            int type = ((OfficialTagType) it.next()).getType();
            if (1 <= type && type < 101) {
                return true;
            }
        }
        return false;
    }

    public static final boolean copydefault(@NotNull OKMessage oKMessage, @NotNull java.util.Set<? extends java.lang.Class<? extends OKMessageContent>> set) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(set, "");
        OKMessageContent content = oKMessage.getContent();
        if (content != null) {
            return set.contains(content.getClass());
        }
        return true;
    }

    public static final boolean KWHzl(@NotNull GroupRole groupRole) {
        Intrinsics.checkNotNullParameter(groupRole, "");
        return yEE.AhwBna(GroupRole.Owner, GroupRole.Administrator).contains(groupRole);
    }

    public static final boolean EZpvd(@NotNull GroupRole groupRole) {
        Intrinsics.checkNotNullParameter(groupRole, "");
        return yED.AEQbTJ(GroupRole.Owner).contains(groupRole);
    }

    public static final GroupRolePermissionItem copydefault(@NotNull GroupRole groupRole) {
        Intrinsics.checkNotNullParameter(groupRole, "");
        int i = StateListAnimator.EZpvd[groupRole.ordinal()];
        if (i == 1) {
            return new GroupRolePermissionItem(1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }
        if (i == 2) {
            return new GroupRolePermissionItem(1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1);
        }
        if (i == 3) {
            return new GroupRolePermissionItem(1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new GroupRolePermissionItem(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public static final java.util.Map<java.lang.String, java.lang.String> EZpvd(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonObject jsonObject = JsonElementKt.getJsonObject(jsonElement);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(jsonObject.size()));
        java.util.Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            JsonElement jsonElement2 = (JsonElement) entry.getValue();
            linkedHashMap.put(key, jsonElement2 instanceof JsonPrimitive ? ((JsonPrimitive) jsonElement2).getContent() : jsonElement2.toString());
        }
        return linkedHashMap;
    }

    public static final void KWHzl(@NotNull OKIMReportException oKIMReportException) {
        Intrinsics.checkNotNullParameter(oKIMReportException, "");
        C6777aVl.Companion.EZpvd(oKIMReportException);
    }
}
