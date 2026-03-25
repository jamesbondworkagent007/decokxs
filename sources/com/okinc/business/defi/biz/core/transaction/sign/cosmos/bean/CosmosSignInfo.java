package com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class CosmosSignInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountNumber;
    private final String chainId;
    private final String demon;
    private final String feeDemon;
    private final String max;
    private final String min;
    private final String normal;
    private final String reserveFeeRatio;
    private final String sequence;
    private final String sourceChannel;
    private final String timeoutHeight;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CosmosSignInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDemon() {
        return this.demon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeDemon() {
        return this.feeDemon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNormal() {
        return this.normal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFeeRatio() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSequence() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceChannel() {
        return this.sourceChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeoutHeight() {
        return this.timeoutHeight;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CosmosSignInfo> serializer() {
            return CosmosSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CosmosSignInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.demon = null;
        } else {
            this.demon = str;
        }
        if ((i & 2) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.sequence = null;
        } else {
            this.sequence = str3;
        }
        if ((i & 8) == 0) {
            this.accountNumber = null;
        } else {
            this.accountNumber = str4;
        }
        if ((i & 16) == 0) {
            this.feeDemon = null;
        } else {
            this.feeDemon = str5;
        }
        if ((i & 32) == 0) {
            this.min = null;
        } else {
            this.min = str6;
        }
        if ((i & 64) == 0) {
            this.normal = null;
        } else {
            this.normal = str7;
        }
        if ((i & 128) == 0) {
            this.max = null;
        } else {
            this.max = str8;
        }
        if ((i & 256) == 0) {
            this.timeoutHeight = null;
        } else {
            this.timeoutHeight = str9;
        }
        if ((i & 512) == 0) {
            this.sourceChannel = null;
        } else {
            this.sourceChannel = str10;
        }
        if ((i & 1024) == 0) {
            this.reserveFeeRatio = null;
        } else {
            this.reserveFeeRatio = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CosmosSignInfo cosmosSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cosmosSignInfo.demon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cosmosSignInfo.demon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cosmosSignInfo.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, cosmosSignInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cosmosSignInfo.sequence != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cosmosSignInfo.sequence);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cosmosSignInfo.accountNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cosmosSignInfo.accountNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || cosmosSignInfo.feeDemon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, cosmosSignInfo.feeDemon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || cosmosSignInfo.min != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, cosmosSignInfo.min);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || cosmosSignInfo.normal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, cosmosSignInfo.normal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || cosmosSignInfo.max != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, cosmosSignInfo.max);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || cosmosSignInfo.timeoutHeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, cosmosSignInfo.timeoutHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || cosmosSignInfo.sourceChannel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, cosmosSignInfo.sourceChannel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && cosmosSignInfo.reserveFeeRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, cosmosSignInfo.reserveFeeRatio);
    }

    public CosmosSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.demon = str;
        this.chainId = str2;
        this.sequence = str3;
        this.accountNumber = str4;
        this.feeDemon = str5;
        this.min = str6;
        this.normal = str7;
        this.max = str8;
        this.timeoutHeight = str9;
        this.sourceChannel = str10;
        this.reserveFeeRatio = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CosmosSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? str11 : null);
    }
}
