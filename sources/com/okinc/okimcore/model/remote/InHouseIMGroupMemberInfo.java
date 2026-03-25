package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMGroupMemberInfo {
    private final String groupId;
    private final String inviterUid;
    private final String memberAlias;
    private final Integer memberStatus;
    private final String memberUid;
    private final PaidGroupMemberStatus paidGroupMemberStatus;
    private final Integer role;
    private final InHouseUserInfo userInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMGroupMemberInfo() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (InHouseUserInfo) null, (PaidGroupMemberStatus) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.memberUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.inviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.memberAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.memberStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseUserInfo component7() {
        return this.userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupMemberStatus component8() {
        return this.paidGroupMemberStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupMemberInfo copy(String str, String str2, String str3, Integer num, String str4, Integer num2, InHouseUserInfo inHouseUserInfo, PaidGroupMemberStatus paidGroupMemberStatus) {
        return new InHouseIMGroupMemberInfo(str, str2, str3, num, str4, num2, inHouseUserInfo, paidGroupMemberStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMGroupMemberInfo)) {
            return false;
        }
        InHouseIMGroupMemberInfo inHouseIMGroupMemberInfo = (InHouseIMGroupMemberInfo) obj;
        return Intrinsics.EZpvd((Object) this.groupId, (Object) inHouseIMGroupMemberInfo.groupId) && Intrinsics.EZpvd((Object) this.memberUid, (Object) inHouseIMGroupMemberInfo.memberUid) && Intrinsics.EZpvd((Object) this.inviterUid, (Object) inHouseIMGroupMemberInfo.inviterUid) && Intrinsics.EZpvd(this.role, inHouseIMGroupMemberInfo.role) && Intrinsics.EZpvd((Object) this.memberAlias, (Object) inHouseIMGroupMemberInfo.memberAlias) && Intrinsics.EZpvd(this.memberStatus, inHouseIMGroupMemberInfo.memberStatus) && Intrinsics.EZpvd(this.userInfo, inHouseIMGroupMemberInfo.userInfo) && Intrinsics.EZpvd(this.paidGroupMemberStatus, inHouseIMGroupMemberInfo.paidGroupMemberStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviterUid() {
        return this.inviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemberAlias() {
        return this.memberAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMemberStatus() {
        return this.memberStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemberUid() {
        return this.memberUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupMemberStatus getPaidGroupMemberStatus() {
        return this.paidGroupMemberStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRole() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseUserInfo getUserInfo() {
        return this.userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.groupId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.memberUid;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.inviterUid;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.role;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.memberAlias;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.memberStatus;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        InHouseUserInfo inHouseUserInfo = this.userInfo;
        int iHashCode7 = inHouseUserInfo == null ? 0 : inHouseUserInfo.hashCode();
        PaidGroupMemberStatus paidGroupMemberStatus = this.paidGroupMemberStatus;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (paidGroupMemberStatus != null ? paidGroupMemberStatus.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMGroupMemberInfo(groupId=" + this.groupId + ", memberUid=" + this.memberUid + ", inviterUid=" + this.inviterUid + ", role=" + this.role + ", memberAlias=" + this.memberAlias + ", memberStatus=" + this.memberStatus + ", userInfo=" + this.userInfo + ", paidGroupMemberStatus=" + this.paidGroupMemberStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMGroupMemberInfo> serializer() {
            return InHouseIMGroupMemberInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMGroupMemberInfo(int i, String str, String str2, String str3, Integer num, String str4, Integer num2, InHouseUserInfo inHouseUserInfo, PaidGroupMemberStatus paidGroupMemberStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = null;
        } else {
            this.groupId = str;
        }
        if ((i & 2) == 0) {
            this.memberUid = null;
        } else {
            this.memberUid = str2;
        }
        if ((i & 4) == 0) {
            this.inviterUid = null;
        } else {
            this.inviterUid = str3;
        }
        if ((i & 8) == 0) {
            this.role = null;
        } else {
            this.role = num;
        }
        if ((i & 16) == 0) {
            this.memberAlias = null;
        } else {
            this.memberAlias = str4;
        }
        if ((i & 32) == 0) {
            this.memberStatus = null;
        } else {
            this.memberStatus = num2;
        }
        if ((i & 64) == 0) {
            this.userInfo = null;
        } else {
            this.userInfo = inHouseUserInfo;
        }
        if ((i & 128) == 0) {
            this.paidGroupMemberStatus = null;
        } else {
            this.paidGroupMemberStatus = paidGroupMemberStatus;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMGroupMemberInfo inHouseIMGroupMemberInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inHouseIMGroupMemberInfo.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inHouseIMGroupMemberInfo.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMGroupMemberInfo.memberUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inHouseIMGroupMemberInfo.memberUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inHouseIMGroupMemberInfo.inviterUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inHouseIMGroupMemberInfo.inviterUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMGroupMemberInfo.role != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, inHouseIMGroupMemberInfo.role);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || inHouseIMGroupMemberInfo.memberAlias != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, inHouseIMGroupMemberInfo.memberAlias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inHouseIMGroupMemberInfo.memberStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, inHouseIMGroupMemberInfo.memberStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inHouseIMGroupMemberInfo.userInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, InHouseUserInfo$$serializer.INSTANCE, inHouseIMGroupMemberInfo.userInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && inHouseIMGroupMemberInfo.paidGroupMemberStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, PaidGroupMemberStatus$$serializer.INSTANCE, inHouseIMGroupMemberInfo.paidGroupMemberStatus);
    }

    public InHouseIMGroupMemberInfo(String str, String str2, String str3, Integer num, String str4, Integer num2, InHouseUserInfo inHouseUserInfo, PaidGroupMemberStatus paidGroupMemberStatus) {
        this.groupId = str;
        this.memberUid = str2;
        this.inviterUid = str3;
        this.role = num;
        this.memberAlias = str4;
        this.memberStatus = num2;
        this.userInfo = inHouseUserInfo;
        this.paidGroupMemberStatus = paidGroupMemberStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:com.okinc.okimcore.model.remote.InHouseUserInfo:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.InHouseUserInfo) : (r16v0 com.okinc.okimcore.model.remote.InHouseUserInfo))
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus) : (null com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, com.okinc.okimcore.model.remote.InHouseUserInfo, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus):void (m)] (LINE:53) call: com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, com.okinc.okimcore.model.remote.InHouseUserInfo, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus):void type: THIS */
    public /* synthetic */ InHouseIMGroupMemberInfo(String str, String str2, String str3, Integer num, String str4, Integer num2, InHouseUserInfo inHouseUserInfo, PaidGroupMemberStatus paidGroupMemberStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : inHouseUserInfo, (i & 128) == 0 ? paidGroupMemberStatus : null);
    }
}
