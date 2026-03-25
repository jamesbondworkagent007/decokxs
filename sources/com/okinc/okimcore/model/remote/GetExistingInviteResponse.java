package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class GetExistingInviteResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Long expireTime;
    private final Long groupId;
    private final String invitationId;
    private final String invitationLink;
    private final String inviterUid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetExistingInviteResponse() {
        this((String) null, (Long) null, (String) null, (String) null, (Long) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetExistingInviteResponse copy$default(GetExistingInviteResponse getExistingInviteResponse, String str, Long l, String str2, String str3, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getExistingInviteResponse.invitationId;
        }
        if ((i & 2) != 0) {
            l = getExistingInviteResponse.groupId;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            str2 = getExistingInviteResponse.inviterUid;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = getExistingInviteResponse.invitationLink;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            l2 = getExistingInviteResponse.expireTime;
        }
        return getExistingInviteResponse.copy(str, l3, str4, str5, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.inviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.invitationLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetExistingInviteResponse copy(String str, Long l, String str2, String str3, Long l2) {
        return new GetExistingInviteResponse(str, l, str2, str3, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetExistingInviteResponse)) {
            return false;
        }
        GetExistingInviteResponse getExistingInviteResponse = (GetExistingInviteResponse) obj;
        return Intrinsics.EZpvd((Object) this.invitationId, (Object) getExistingInviteResponse.invitationId) && Intrinsics.EZpvd(this.groupId, getExistingInviteResponse.groupId) && Intrinsics.EZpvd((Object) this.inviterUid, (Object) getExistingInviteResponse.inviterUid) && Intrinsics.EZpvd((Object) this.invitationLink, (Object) getExistingInviteResponse.invitationLink) && Intrinsics.EZpvd(this.expireTime, getExistingInviteResponse.expireTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvitationId() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvitationLink() {
        return this.invitationLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviterUid() {
        return this.inviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.invitationId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.groupId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str2 = this.inviterUid;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.invitationLink;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Long l2 = this.expireTime;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetExistingInviteResponse(invitationId=" + this.invitationId + ", groupId=" + this.groupId + ", inviterUid=" + this.inviterUid + ", invitationLink=" + this.invitationLink + ", expireTime=" + this.expireTime + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GetExistingInviteResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetExistingInviteResponse> serializer() {
            return GetExistingInviteResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetExistingInviteResponse(int i, String str, Long l, String str2, String str3, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.invitationId = null;
        } else {
            this.invitationId = str;
        }
        if ((i & 2) == 0) {
            this.groupId = null;
        } else {
            this.groupId = l;
        }
        if ((i & 4) == 0) {
            this.inviterUid = null;
        } else {
            this.inviterUid = str2;
        }
        if ((i & 8) == 0) {
            this.invitationLink = null;
        } else {
            this.invitationLink = str3;
        }
        if ((i & 16) == 0) {
            this.expireTime = null;
        } else {
            this.expireTime = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GetExistingInviteResponse getExistingInviteResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || getExistingInviteResponse.invitationId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, getExistingInviteResponse.invitationId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || getExistingInviteResponse.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, getExistingInviteResponse.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getExistingInviteResponse.inviterUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, getExistingInviteResponse.inviterUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || getExistingInviteResponse.invitationLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, getExistingInviteResponse.invitationLink);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && getExistingInviteResponse.expireTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, getExistingInviteResponse.expireTime);
    }

    public GetExistingInviteResponse(String str, Long l, String str2, String str3, Long l2) {
        this.invitationId = str;
        this.groupId = l;
        this.inviterUid = str2;
        this.invitationLink = str3;
        this.expireTime = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r9v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:8) call: com.okinc.okimcore.model.remote.GetExistingInviteResponse.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ GetExistingInviteResponse(String str, Long l, String str2, String str3, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : l2);
    }
}
