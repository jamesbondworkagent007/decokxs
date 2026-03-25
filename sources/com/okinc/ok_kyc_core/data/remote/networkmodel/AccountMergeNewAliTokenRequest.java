package com.okinc.ok_kyc_core.data.remote.networkmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AccountMergeNewAliTokenRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int channel;
    private final String idCard;
    private final String metaInfo;
    private final String realName;
    private final Integer type;
    private final String uuid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountMergeNewAliTokenRequest() {
        this((String) null, (String) null, (String) null, 0, (Integer) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountMergeNewAliTokenRequest copy$default(AccountMergeNewAliTokenRequest accountMergeNewAliTokenRequest, String str, String str2, String str3, int i, Integer num, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = accountMergeNewAliTokenRequest.realName;
        }
        if ((i2 & 2) != 0) {
            str2 = accountMergeNewAliTokenRequest.idCard;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = accountMergeNewAliTokenRequest.metaInfo;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = accountMergeNewAliTokenRequest.channel;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            num = accountMergeNewAliTokenRequest.type;
        }
        Integer num2 = num;
        if ((i2 & 32) != 0) {
            str4 = accountMergeNewAliTokenRequest.uuid;
        }
        return accountMergeNewAliTokenRequest.copy(str, str5, str6, i3, num2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.idCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.metaInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountMergeNewAliTokenRequest copy(String str, String str2, String str3, int i, Integer num, String str4) {
        return new AccountMergeNewAliTokenRequest(str, str2, str3, i, num, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountMergeNewAliTokenRequest)) {
            return false;
        }
        AccountMergeNewAliTokenRequest accountMergeNewAliTokenRequest = (AccountMergeNewAliTokenRequest) obj;
        return Intrinsics.EZpvd((Object) this.realName, (Object) accountMergeNewAliTokenRequest.realName) && Intrinsics.EZpvd((Object) this.idCard, (Object) accountMergeNewAliTokenRequest.idCard) && Intrinsics.EZpvd((Object) this.metaInfo, (Object) accountMergeNewAliTokenRequest.metaInfo) && this.channel == accountMergeNewAliTokenRequest.channel && Intrinsics.EZpvd(this.type, accountMergeNewAliTokenRequest.type) && Intrinsics.EZpvd((Object) this.uuid, (Object) accountMergeNewAliTokenRequest.uuid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdCard() {
        return this.idCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMetaInfo() {
        return this.metaInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealName() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.realName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.idCard;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.metaInfo;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = Integer.hashCode(this.channel);
        Integer num = this.type;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str4 = this.uuid;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountMergeNewAliTokenRequest(realName=" + this.realName + ", idCard=" + this.idCard + ", metaInfo=" + this.metaInfo + ", channel=" + this.channel + ", type=" + this.type + ", uuid=" + this.uuid + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeNewAliTokenRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountMergeNewAliTokenRequest> serializer() {
            return AccountMergeNewAliTokenRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountMergeNewAliTokenRequest(int i, String str, String str2, String str3, int i2, Integer num, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.realName = null;
        } else {
            this.realName = str;
        }
        if ((i & 2) == 0) {
            this.idCard = null;
        } else {
            this.idCard = str2;
        }
        if ((i & 4) == 0) {
            this.metaInfo = null;
        } else {
            this.metaInfo = str3;
        }
        if ((i & 8) == 0) {
            this.channel = 0;
        } else {
            this.channel = i2;
        }
        if ((i & 16) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        if ((i & 32) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AccountMergeNewAliTokenRequest accountMergeNewAliTokenRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || accountMergeNewAliTokenRequest.realName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, accountMergeNewAliTokenRequest.realName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || accountMergeNewAliTokenRequest.idCard != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, accountMergeNewAliTokenRequest.idCard);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || accountMergeNewAliTokenRequest.metaInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, accountMergeNewAliTokenRequest.metaInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || accountMergeNewAliTokenRequest.channel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, accountMergeNewAliTokenRequest.channel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || accountMergeNewAliTokenRequest.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, accountMergeNewAliTokenRequest.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && accountMergeNewAliTokenRequest.uuid == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, accountMergeNewAliTokenRequest.uuid);
    }

    public AccountMergeNewAliTokenRequest(String str, String str2, String str3, int i, Integer num, String str4) {
        this.realName = str;
        this.idCard = str2;
        this.metaInfo = str3;
        this.channel = i;
        this.type = num;
        this.uuid = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:int:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001c: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.Integer, java.lang.String):void (m)] (LINE:9) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeNewAliTokenRequest.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ AccountMergeNewAliTokenRequest(String str, String str2, String str3, int i, Integer num, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : str4);
    }
}
