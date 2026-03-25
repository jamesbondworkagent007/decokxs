package com.okinc.okimcore.model.im.inhouseim.ws;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class SystemMessageData {
    public static final KSerializer<Object>[] $childSerializers;
    public final String actingUid;
    public final Map<String, String> extra;
    public final Long systemAction;
    public final Integer targetUidCount;
    public final List<String> targetUidsList;
    public final List<UserInfo> userInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SystemMessageData() {
        this((String) null, (Map) null, (Long) null, (Integer) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SystemMessageData copy$default(SystemMessageData systemMessageData, String str, Map map, Long l, Integer num, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = systemMessageData.actingUid;
        }
        if ((i & 2) != 0) {
            map = systemMessageData.extra;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            l = systemMessageData.systemAction;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            num = systemMessageData.targetUidCount;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            list = systemMessageData.targetUidsList;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = systemMessageData.userInfoList;
        }
        return systemMessageData.OLrzqt(str, map2, l2, num2, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> AEQbTJ() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserInfo> AhwBna() {
        return this.userInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long EZpvd() {
        return this.systemAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.actingUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemMessageData OLrzqt(String str, Map<String, String> map, Long l, Integer num, List<String> list, List<UserInfo> list2) {
        return new SystemMessageData(str, map, l, num, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer OLrzqt() {
        return this.targetUidCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemMessageData)) {
            return false;
        }
        SystemMessageData systemMessageData = (SystemMessageData) obj;
        return Intrinsics.EZpvd((Object) this.actingUid, (Object) systemMessageData.actingUid) && Intrinsics.EZpvd(this.extra, systemMessageData.extra) && Intrinsics.EZpvd(this.systemAction, systemMessageData.systemAction) && Intrinsics.EZpvd(this.targetUidCount, systemMessageData.targetUidCount) && Intrinsics.EZpvd(this.targetUidsList, systemMessageData.targetUidsList) && Intrinsics.EZpvd(this.userInfoList, systemMessageData.userInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.actingUid;
        int iHashCode = str == null ? 0 : str.hashCode();
        Map<String, String> map = this.extra;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        Long l = this.systemAction;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Integer num = this.targetUidCount;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        List<String> list = this.targetUidsList;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        List<UserInfo> list2 = this.userInfoList;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SystemMessageData(actingUid=" + this.actingUid + ", extra=" + this.extra + ", systemAction=" + this.systemAction + ", targetUidCount=" + this.targetUidCount + ", targetUidsList=" + this.targetUidsList + ", userInfoList=" + this.userInfoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> valueOf() {
        return this.targetUidsList;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SystemMessageData> serializer() {
            return SystemMessageData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(SystemMessageData$UserInfo$$serializer.INSTANCE)};
    }

    public /* synthetic */ SystemMessageData(int i, String str, Map map, Long l, Integer num, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.actingUid = null;
        } else {
            this.actingUid = str;
        }
        if ((i & 2) == 0) {
            this.extra = null;
        } else {
            this.extra = map;
        }
        if ((i & 4) == 0) {
            this.systemAction = null;
        } else {
            this.systemAction = l;
        }
        if ((i & 8) == 0) {
            this.targetUidCount = null;
        } else {
            this.targetUidCount = num;
        }
        if ((i & 16) == 0) {
            this.targetUidsList = null;
        } else {
            this.targetUidsList = list;
        }
        if ((i & 32) == 0) {
            this.userInfoList = null;
        } else {
            this.userInfoList = list2;
        }
    }

    public static final /* synthetic */ void EZpvd(SystemMessageData systemMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || systemMessageData.actingUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, systemMessageData.actingUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || systemMessageData.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], systemMessageData.extra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || systemMessageData.systemAction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, systemMessageData.systemAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || systemMessageData.targetUidCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, systemMessageData.targetUidCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || systemMessageData.targetUidsList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], systemMessageData.targetUidsList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && systemMessageData.userInfoList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], systemMessageData.userInfoList);
    }

    public SystemMessageData(String str, Map<String, String> map, Long l, Integer num, List<String> list, List<UserInfo> list2) {
        this.actingUid = str;
        this.extra = map;
        this.systemAction = l;
        this.targetUidCount = num;
        this.targetUidsList = list;
        this.userInfoList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r7v0 java.util.Map))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r8v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
 A[MD:(java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.lang.Long, java.lang.Integer, java.util.List<java.lang.String>, java.util.List<com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData$UserInfo>):void (m)] (LINE:8) call: com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData.<init>(java.lang.String, java.util.Map, java.lang.Long, java.lang.Integer, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SystemMessageData(String str, Map map, Long l, Integer num, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2);
    }

    @Serializable
    public static final class UserInfo {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final String alias;
        public final String enNickname;
        public final String nickname;
        public final String userUid;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UserInfo() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userInfo.alias;
            }
            if ((i & 2) != 0) {
                str2 = userInfo.enNickname;
            }
            if ((i & 4) != 0) {
                str3 = userInfo.nickname;
            }
            if ((i & 8) != 0) {
                str4 = userInfo.userUid;
            }
            return userInfo.AEQbTJ(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UserInfo AEQbTJ(String str, String str2, String str3, String str4) {
            return new UserInfo(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.nickname;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.userUid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.enNickname;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserInfo)) {
                return false;
            }
            UserInfo userInfo = (UserInfo) obj;
            return Intrinsics.EZpvd((Object) this.alias, (Object) userInfo.alias) && Intrinsics.EZpvd((Object) this.enNickname, (Object) userInfo.enNickname) && Intrinsics.EZpvd((Object) this.nickname, (Object) userInfo.nickname) && Intrinsics.EZpvd((Object) this.userUid, (Object) userInfo.userUid);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.alias;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.enNickname;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.nickname;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.userUid;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UserInfo(alias=" + this.alias + ", enNickname=" + this.enNickname + ", nickname=" + this.nickname + ", userUid=" + this.userUid + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData.UserInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<UserInfo> serializer() {
                return SystemMessageData$UserInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ UserInfo(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.alias = null;
            } else {
                this.alias = str;
            }
            if ((i & 2) == 0) {
                this.enNickname = null;
            } else {
                this.enNickname = str2;
            }
            if ((i & 4) == 0) {
                this.nickname = null;
            } else {
                this.nickname = str3;
            }
            if ((i & 8) == 0) {
                this.userUid = null;
            } else {
                this.userUid = str4;
            }
        }

        public static final /* synthetic */ void KWHzl(UserInfo userInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || userInfo.alias != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, userInfo.alias);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || userInfo.enNickname != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, userInfo.enNickname);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || userInfo.nickname != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, userInfo.nickname);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && userInfo.userUid == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, userInfo.userUid);
        }

        public UserInfo(String str, String str2, String str3, String str4) {
            this.alias = str;
            this.enNickname = str2;
            this.nickname = str3;
            this.userUid = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:23) call: com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData.UserInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ UserInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VisibleSystemAction {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ VisibleSystemAction[] $VALUES;
        public static final Application Companion;
        private final int systemAction;
        public static final VisibleSystemAction SYSTEM_ACTION_POST_GROUP_ANNOUNCEMENT = new VisibleSystemAction("SYSTEM_ACTION_POST_GROUP_ANNOUNCEMENT", 0, 300);
        public static final VisibleSystemAction SYSTEM_ACTION_ENABLE_GROUP_MEMBER = new VisibleSystemAction("SYSTEM_ACTION_ENABLE_GROUP_MEMBER", 1, 301);
        public static final VisibleSystemAction SYSTEM_ACTION_DISABLE_GROUP_MEMBER = new VisibleSystemAction("SYSTEM_ACTION_DISABLE_GROUP_MEMBER", 2, 302);
        public static final VisibleSystemAction SYSTEM_ACTION_ENABLE_GROUP_MEMBER_MENTION_OTHER = new VisibleSystemAction("SYSTEM_ACTION_ENABLE_GROUP_MEMBER_MENTION_OTHER", 3, 303);
        public static final VisibleSystemAction SYSTEM_ACTION_DISABLE_GROUP_MEMBER_MENTION_OTHER = new VisibleSystemAction("SYSTEM_ACTION_DISABLE_GROUP_MEMBER_MENTION_OTHER", 4, 304);
        public static final VisibleSystemAction SYSTEM_ACTION_ENABLE_GROUP_MEMBER_SENDING_LINK = new VisibleSystemAction("SYSTEM_ACTION_ENABLE_GROUP_MEMBER_SENDING_LINK", 5, 305);
        public static final VisibleSystemAction SYSTEM_ACTION_DISABLE_GROUP_MEMBER_SENDING_LINK = new VisibleSystemAction("SYSTEM_ACTION_DISABLE_GROUP_MEMBER_SENDING_LINK", 6, 306);
        public static final VisibleSystemAction SYSTEM_ACTION_ADDED_GROUP_ADMIN_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT = new VisibleSystemAction("SYSTEM_ACTION_ADDED_GROUP_ADMIN_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT", 7, 307);
        public static final VisibleSystemAction SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT = new VisibleSystemAction("SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT", 8, 308);
        public static final VisibleSystemAction SYSTEM_ACTION_ADDED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT = new VisibleSystemAction("SYSTEM_ACTION_ADDED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT", 9, 309);
        public static final VisibleSystemAction SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT = new VisibleSystemAction("SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT", 10, 310);
        public static final VisibleSystemAction SYSTEM_ACTION_CREATE_GROUP = new VisibleSystemAction("SYSTEM_ACTION_CREATE_GROUP", 11, 311);
        public static final VisibleSystemAction SYSTEM_ACTION_ADD_MEMBER_TO_GROUP_MEMBER_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT = new VisibleSystemAction("SYSTEM_ACTION_ADD_MEMBER_TO_GROUP_MEMBER_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT", 12, 312);
        public static final VisibleSystemAction SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT = new VisibleSystemAction("SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT", 13, 313);
        public static final VisibleSystemAction SYSTEM_ACTION_ADD_MEMBER_TO_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT = new VisibleSystemAction("SYSTEM_ACTION_ADD_MEMBER_TO_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT", 14, 314);
        public static final VisibleSystemAction SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT = new VisibleSystemAction("SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT", 15, 315);
        public static final VisibleSystemAction SYSTEM_ACTION_DELETE_GROUP_ANNOUNCEMENT = new VisibleSystemAction("SYSTEM_ACTION_DELETE_GROUP_ANNOUNCEMENT", 16, TypedValues.AttributesType.TYPE_PATH_ROTATE);
        public static final VisibleSystemAction SYSTEM_ACTION_DISBAND_GROUP = new VisibleSystemAction("SYSTEM_ACTION_DISBAND_GROUP", 17, TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        public static final VisibleSystemAction SYSTEM_ACTION_GROUP_TRANSFER_OWNERSHIP = new VisibleSystemAction("SYSTEM_ACTION_GROUP_TRANSFER_OWNERSHIP", 18, 319);
        public static final VisibleSystemAction SYSTEM_ACTION_CHANGE_GROUP_NAME = new VisibleSystemAction("SYSTEM_ACTION_CHANGE_GROUP_NAME", 19, 320);
        public static final VisibleSystemAction SYSTEM_ACTION_CHANGE_GROUP_AVATAR = new VisibleSystemAction("SYSTEM_ACTION_CHANGE_GROUP_AVATAR", 20, 321);
        public static final VisibleSystemAction SYSTEM_ACTION_ENABLE_MEMBER_ADD_MEMBER = new VisibleSystemAction("SYSTEM_ACTION_ENABLE_MEMBER_ADD_MEMBER", 21, 322);
        public static final VisibleSystemAction SYSTEM_ACTION_DISABLE_MEMBER_ADD_MEMBER = new VisibleSystemAction("SYSTEM_ACTION_DISABLE_MEMBER_ADD_MEMBER", 22, 323);
        public static final VisibleSystemAction SYSTEM_ACTION_ENABLE_SHARING_INVITATION_QR_CODE = new VisibleSystemAction("SYSTEM_ACTION_ENABLE_SHARING_INVITATION_QR_CODE", 23, 324);
        public static final VisibleSystemAction SYSTEM_ACTION_DISABLE_SHARING_INVITATION_QR_CODE = new VisibleSystemAction("SYSTEM_ACTION_DISABLE_SHARING_INVITATION_QR_CODE", 24, 325);
        public static final VisibleSystemAction SYSTEM_ACTION_ENABLE_REQUIRE_ADMIN_APPROVAL_TO_JOIN = new VisibleSystemAction("SYSTEM_ACTION_ENABLE_REQUIRE_ADMIN_APPROVAL_TO_JOIN", 25, 326);
        public static final VisibleSystemAction SYSTEM_ACTION_DISABLE_REQUIRE_ADMIN_APPROVAL_TO_JOIN = new VisibleSystemAction("SYSTEM_ACTION_DISABLE_REQUIRE_ADMIN_APPROVAL_TO_JOIN", 26, 327);
        public static final VisibleSystemAction SYSTEM_ACTION_ENABLE_GROUP_PRIVATE_CHAT = new VisibleSystemAction("SYSTEM_ACTION_ENABLE_GROUP_PRIVATE_CHAT", 27, 328);
        public static final VisibleSystemAction SYSTEM_ACTION_DISABLE_GROUP_PRIVATE_CHAT = new VisibleSystemAction("SYSTEM_ACTION_DISABLE_GROUP_PRIVATE_CHAT", 28, 329);
        public static final VisibleSystemAction SYSTEM_ACTION_ENABLE_ASSET_VERIFICATION = new VisibleSystemAction("SYSTEM_ACTION_ENABLE_ASSET_VERIFICATION", 29, 330);
        public static final VisibleSystemAction SYSTEM_ACTION_UPDATE_ASSET_VERIFICATION = new VisibleSystemAction("SYSTEM_ACTION_UPDATE_ASSET_VERIFICATION", 30, 331);
        public static final VisibleSystemAction SYSTEM_ACTION_DISABLE_ASSET_VERIFICATION = new VisibleSystemAction("SYSTEM_ACTION_DISABLE_ASSET_VERIFICATION", 31, 332);
        public static final VisibleSystemAction SYSTEM_ACTION_ENABLE_PAID_GROUP_BILLING = new VisibleSystemAction("SYSTEM_ACTION_ENABLE_PAID_GROUP_BILLING", 32, 340);
        public static final VisibleSystemAction SYSTEM_ACTION_UPDATE_PAID_GROUP_BILLING = new VisibleSystemAction("SYSTEM_ACTION_UPDATE_PAID_GROUP_BILLING", 33, 341);
        public static final VisibleSystemAction SYSTEM_ACTION_DISABLE_PAID_GROUP_BILLING = new VisibleSystemAction("SYSTEM_ACTION_DISABLE_PAID_GROUP_BILLING", 34, 342);
        public static final VisibleSystemAction SYSTEM_ACTION_CONVERT_PRIVATE_TO_PUBLIC_GROUP = new VisibleSystemAction("SYSTEM_ACTION_CONVERT_PRIVATE_TO_PUBLIC_GROUP", 35, 348);
        public static final VisibleSystemAction SYSTEM_ACTION_UPDATE_GROUP_ANNOUNCEMENT = new VisibleSystemAction("SYSTEM_ACTION_UPDATE_GROUP_ANNOUNCEMENT", 36, 349);
        public static final VisibleSystemAction SYSTEM_ACTION_PIN_GROUP_ANNOUNCEMENT = new VisibleSystemAction("SYSTEM_ACTION_PIN_GROUP_ANNOUNCEMENT", 37, 350);
        public static final VisibleSystemAction SYSTEM_ACTION_ADD_CONTACT = new VisibleSystemAction("SYSTEM_ACTION_ADD_CONTACT", 38, 501);
        public static final VisibleSystemAction SYSTEM_ACTION_GROUP_VOICE_CALL_START = new VisibleSystemAction("SYSTEM_ACTION_GROUP_VOICE_CALL_START", 39, TypedValues.TransitionType.TYPE_FROM);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ VisibleSystemAction[] $values() {
            return new VisibleSystemAction[]{SYSTEM_ACTION_POST_GROUP_ANNOUNCEMENT, SYSTEM_ACTION_ENABLE_GROUP_MEMBER, SYSTEM_ACTION_DISABLE_GROUP_MEMBER, SYSTEM_ACTION_ENABLE_GROUP_MEMBER_MENTION_OTHER, SYSTEM_ACTION_DISABLE_GROUP_MEMBER_MENTION_OTHER, SYSTEM_ACTION_ENABLE_GROUP_MEMBER_SENDING_LINK, SYSTEM_ACTION_DISABLE_GROUP_MEMBER_SENDING_LINK, SYSTEM_ACTION_ADDED_GROUP_ADMIN_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT, SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT, SYSTEM_ACTION_ADDED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT, SYSTEM_ACTION_REMOVED_GROUP_ADMIN_AMOUNT_MORE_THEN_LIMIT, SYSTEM_ACTION_CREATE_GROUP, SYSTEM_ACTION_ADD_MEMBER_TO_GROUP_MEMBER_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT, SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_LESS_THEN_OR_EQUAL_TO_LIMIT, SYSTEM_ACTION_ADD_MEMBER_TO_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT, SYSTEM_ACTION_REMOVE_GROUP_MEMBER_AMOUNT_MORE_THEN_LIMIT, SYSTEM_ACTION_DELETE_GROUP_ANNOUNCEMENT, SYSTEM_ACTION_DISBAND_GROUP, SYSTEM_ACTION_GROUP_TRANSFER_OWNERSHIP, SYSTEM_ACTION_CHANGE_GROUP_NAME, SYSTEM_ACTION_CHANGE_GROUP_AVATAR, SYSTEM_ACTION_ENABLE_MEMBER_ADD_MEMBER, SYSTEM_ACTION_DISABLE_MEMBER_ADD_MEMBER, SYSTEM_ACTION_ENABLE_SHARING_INVITATION_QR_CODE, SYSTEM_ACTION_DISABLE_SHARING_INVITATION_QR_CODE, SYSTEM_ACTION_ENABLE_REQUIRE_ADMIN_APPROVAL_TO_JOIN, SYSTEM_ACTION_DISABLE_REQUIRE_ADMIN_APPROVAL_TO_JOIN, SYSTEM_ACTION_ENABLE_GROUP_PRIVATE_CHAT, SYSTEM_ACTION_DISABLE_GROUP_PRIVATE_CHAT, SYSTEM_ACTION_ENABLE_ASSET_VERIFICATION, SYSTEM_ACTION_UPDATE_ASSET_VERIFICATION, SYSTEM_ACTION_DISABLE_ASSET_VERIFICATION, SYSTEM_ACTION_ENABLE_PAID_GROUP_BILLING, SYSTEM_ACTION_UPDATE_PAID_GROUP_BILLING, SYSTEM_ACTION_DISABLE_PAID_GROUP_BILLING, SYSTEM_ACTION_CONVERT_PRIVATE_TO_PUBLIC_GROUP, SYSTEM_ACTION_UPDATE_GROUP_ANNOUNCEMENT, SYSTEM_ACTION_PIN_GROUP_ANNOUNCEMENT, SYSTEM_ACTION_ADD_CONTACT, SYSTEM_ACTION_GROUP_VOICE_CALL_START};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<VisibleSystemAction> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getSystemAction() {
            return this.systemAction;
        }

        private VisibleSystemAction(String str, int i, int i2) {
            this.systemAction = i2;
        }

        static {
            VisibleSystemAction[] visibleSystemActionArr$values = $values();
            $VALUES = visibleSystemActionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(visibleSystemActionArr$values);
            Companion = new Application(null);
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData.VisibleSystemAction.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }

            public final VisibleSystemAction KWHzl(int i) {
                for (VisibleSystemAction visibleSystemAction : VisibleSystemAction.values()) {
                    if (visibleSystemAction.getSystemAction() == i) {
                        return visibleSystemAction;
                    }
                }
                return null;
            }
        }

        public static VisibleSystemAction valueOf(String str) {
            return (VisibleSystemAction) Enum.valueOf(VisibleSystemAction.class, str);
        }

        public static VisibleSystemAction[] values() {
            return (VisibleSystemAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InvisibleSystemAction {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ InvisibleSystemAction[] $VALUES;
        private final int systemAction;
        public static final InvisibleSystemAction SYSTEM_ACTION_REFRESH_CONVERSATION = new InvisibleSystemAction("SYSTEM_ACTION_REFRESH_CONVERSATION", 0, 401);
        public static final InvisibleSystemAction SYSTEM_ACTION_GROUP_JOIN_APPLICATION = new InvisibleSystemAction("SYSTEM_ACTION_GROUP_JOIN_APPLICATION", 1, 402);
        public static final InvisibleSystemAction SYSTEM_ACTION_GROUP_APPROVAL = new InvisibleSystemAction("SYSTEM_ACTION_GROUP_APPROVAL", 2, 403);
        public static final InvisibleSystemAction SYSTEM_ACTION_GROUP_REJECT = new InvisibleSystemAction("SYSTEM_ACTION_GROUP_REJECT", 3, 404);
        public static final InvisibleSystemAction SYSTEM_ACTION_GROUP_WITHDRAWN_APPLICATION = new InvisibleSystemAction("SYSTEM_ACTION_GROUP_WITHDRAWN_APPLICATION", 4, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ InvisibleSystemAction[] $values() {
            return new InvisibleSystemAction[]{SYSTEM_ACTION_REFRESH_CONVERSATION, SYSTEM_ACTION_GROUP_JOIN_APPLICATION, SYSTEM_ACTION_GROUP_APPROVAL, SYSTEM_ACTION_GROUP_REJECT, SYSTEM_ACTION_GROUP_WITHDRAWN_APPLICATION};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<InvisibleSystemAction> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getSystemAction() {
            return this.systemAction;
        }

        private InvisibleSystemAction(String str, int i, int i2) {
            this.systemAction = i2;
        }

        static {
            InvisibleSystemAction[] invisibleSystemActionArr$values = $values();
            $VALUES = invisibleSystemActionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(invisibleSystemActionArr$values);
        }

        public static InvisibleSystemAction valueOf(String str) {
            return (InvisibleSystemAction) Enum.valueOf(InvisibleSystemAction.class, str);
        }

        public static InvisibleSystemAction[] values() {
            return (InvisibleSystemAction[]) $VALUES.clone();
        }
    }
}
