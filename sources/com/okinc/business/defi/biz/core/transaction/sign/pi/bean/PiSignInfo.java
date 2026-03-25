package com.okinc.business.defi.biz.core.transaction.sign.pi.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class PiSignInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String assetName;
    private final String issuer;
    private final String maxTransferAmount;
    private final Integer memoMaxLength;
    private final String minTransferAmount;
    private final String networkPassphrase;
    private final String nonce;
    private final String normal;
    private final String timeout;
    private final String trustLineLimit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PiSignInfo() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.trustLineLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.memoMaxLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.networkPassphrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.assetName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.issuer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PiSignInfo copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new PiSignInfo(str, str2, str3, num, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiSignInfo)) {
            return false;
        }
        PiSignInfo piSignInfo = (PiSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.nonce, (Object) piSignInfo.nonce) && Intrinsics.EZpvd((Object) this.minTransferAmount, (Object) piSignInfo.minTransferAmount) && Intrinsics.EZpvd((Object) this.maxTransferAmount, (Object) piSignInfo.maxTransferAmount) && Intrinsics.EZpvd(this.memoMaxLength, piSignInfo.memoMaxLength) && Intrinsics.EZpvd((Object) this.networkPassphrase, (Object) piSignInfo.networkPassphrase) && Intrinsics.EZpvd((Object) this.normal, (Object) piSignInfo.normal) && Intrinsics.EZpvd((Object) this.timeout, (Object) piSignInfo.timeout) && Intrinsics.EZpvd((Object) this.assetName, (Object) piSignInfo.assetName) && Intrinsics.EZpvd((Object) this.issuer, (Object) piSignInfo.issuer) && Intrinsics.EZpvd((Object) this.trustLineLimit, (Object) piSignInfo.trustLineLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetName() {
        return this.assetName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxTransferAmount() {
        return this.maxTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMemoMaxLength() {
        return this.memoMaxLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinTransferAmount() {
        return this.minTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkPassphrase() {
        return this.networkPassphrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNormal() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeout() {
        return this.timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrustLineLimit() {
        return this.trustLineLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nonce;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.minTransferAmount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxTransferAmount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.memoMaxLength;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.networkPassphrase;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.normal;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.timeout;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.assetName;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.issuer;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.trustLineLimit;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PiSignInfo(nonce=" + this.nonce + ", minTransferAmount=" + this.minTransferAmount + ", maxTransferAmount=" + this.maxTransferAmount + ", memoMaxLength=" + this.memoMaxLength + ", networkPassphrase=" + this.networkPassphrase + ", normal=" + this.normal + ", timeout=" + this.timeout + ", assetName=" + this.assetName + ", issuer=" + this.issuer + ", trustLineLimit=" + this.trustLineLimit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.pi.bean.PiSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PiSignInfo> serializer() {
            return PiSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PiSignInfo(int i, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str;
        }
        if ((i & 2) == 0) {
            this.minTransferAmount = null;
        } else {
            this.minTransferAmount = str2;
        }
        if ((i & 4) == 0) {
            this.maxTransferAmount = null;
        } else {
            this.maxTransferAmount = str3;
        }
        if ((i & 8) == 0) {
            this.memoMaxLength = null;
        } else {
            this.memoMaxLength = num;
        }
        if ((i & 16) == 0) {
            this.networkPassphrase = null;
        } else {
            this.networkPassphrase = str4;
        }
        if ((i & 32) == 0) {
            this.normal = null;
        } else {
            this.normal = str5;
        }
        if ((i & 64) == 0) {
            this.timeout = null;
        } else {
            this.timeout = str6;
        }
        if ((i & 128) == 0) {
            this.assetName = null;
        } else {
            this.assetName = str7;
        }
        if ((i & 256) == 0) {
            this.issuer = null;
        } else {
            this.issuer = str8;
        }
        if ((i & 512) == 0) {
            this.trustLineLimit = null;
        } else {
            this.trustLineLimit = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PiSignInfo piSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || piSignInfo.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, piSignInfo.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || piSignInfo.minTransferAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, piSignInfo.minTransferAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || piSignInfo.maxTransferAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, piSignInfo.maxTransferAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || piSignInfo.memoMaxLength != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, piSignInfo.memoMaxLength);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || piSignInfo.networkPassphrase != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, piSignInfo.networkPassphrase);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || piSignInfo.normal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, piSignInfo.normal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || piSignInfo.timeout != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, piSignInfo.timeout);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || piSignInfo.assetName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, piSignInfo.assetName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || piSignInfo.issuer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, piSignInfo.issuer);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && piSignInfo.trustLineLimit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, piSignInfo.trustLineLimit);
    }

    public PiSignInfo(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.nonce = str;
        this.minTransferAmount = str2;
        this.maxTransferAmount = str3;
        this.memoMaxLength = num;
        this.networkPassphrase = str4;
        this.normal = str5;
        this.timeout = str6;
        this.assetName = str7;
        this.issuer = str8;
        this.trustLineLimit = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.defi.biz.core.transaction.sign.pi.bean.PiSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PiSignInfo(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) == 0 ? str9 : null);
    }
}
