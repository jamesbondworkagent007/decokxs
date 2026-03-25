package com.okinc.wallet.hardware.api.onekey;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class CommonParams {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean deriveCardano;
    private final Boolean initSession;
    private final String keepSession;
    private final String passphraseState;
    private final Long pollIntervalTime;
    private final Long retryCount;
    private final Long timeout;
    private final Boolean useEmptyPassphrase;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommonParams() {
        this((String) null, (Long) null, (Long) null, (Long) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDeriveCardano() {
        return this.deriveCardano;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getInitSession() {
        return this.initSession;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeepSession() {
        return this.keepSession;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPassphraseState() {
        return this.passphraseState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPollIntervalTime() {
        return this.pollIntervalTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getRetryCount() {
        return this.retryCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTimeout() {
        return this.timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUseEmptyPassphrase() {
        return this.useEmptyPassphrase;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.onekey.CommonParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommonParams> serializer() {
            return CommonParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommonParams(int i, String str, Long l, Long l2, Long l3, String str2, Boolean bool, Boolean bool2, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.keepSession = null;
        } else {
            this.keepSession = str;
        }
        if ((i & 2) == 0) {
            this.retryCount = null;
        } else {
            this.retryCount = l;
        }
        if ((i & 4) == 0) {
            this.pollIntervalTime = null;
        } else {
            this.pollIntervalTime = l2;
        }
        if ((i & 8) == 0) {
            this.timeout = null;
        } else {
            this.timeout = l3;
        }
        if ((i & 16) == 0) {
            this.passphraseState = null;
        } else {
            this.passphraseState = str2;
        }
        if ((i & 32) == 0) {
            this.useEmptyPassphrase = null;
        } else {
            this.useEmptyPassphrase = bool;
        }
        if ((i & 64) == 0) {
            this.initSession = null;
        } else {
            this.initSession = bool2;
        }
        if ((i & 128) == 0) {
            this.deriveCardano = null;
        } else {
            this.deriveCardano = bool3;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(CommonParams commonParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || commonParams.keepSession != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, commonParams.keepSession);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || commonParams.retryCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, commonParams.retryCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || commonParams.pollIntervalTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, commonParams.pollIntervalTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || commonParams.timeout != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, commonParams.timeout);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || commonParams.passphraseState != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, commonParams.passphraseState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || commonParams.useEmptyPassphrase != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, commonParams.useEmptyPassphrase);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || commonParams.initSession != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, commonParams.initSession);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && commonParams.deriveCardano == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, commonParams.deriveCardano);
    }

    public CommonParams(String str, Long l, Long l2, Long l3, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        this.keepSession = str;
        this.retryCount = l;
        this.pollIntervalTime = l2;
        this.timeout = l3;
        this.passphraseState = str2;
        this.useEmptyPassphrase = bool;
        this.initSession = bool2;
        this.deriveCardano = bool3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r12v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:8) call: com.okinc.wallet.hardware.api.onekey.CommonParams.<init>(java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ CommonParams(String str, Long l, Long l2, Long l3, String str2, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) == 0 ? bool3 : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(CommonParams.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        CommonParams commonParams = (CommonParams) obj;
        return Intrinsics.EZpvd((Object) this.keepSession, (Object) commonParams.keepSession) && Intrinsics.EZpvd(this.retryCount, commonParams.retryCount) && Intrinsics.EZpvd(this.pollIntervalTime, commonParams.pollIntervalTime) && Intrinsics.EZpvd(this.timeout, commonParams.timeout) && Intrinsics.EZpvd((Object) this.passphraseState, (Object) commonParams.passphraseState) && Intrinsics.EZpvd(this.useEmptyPassphrase, commonParams.useEmptyPassphrase) && Intrinsics.EZpvd(this.initSession, commonParams.initSession) && Intrinsics.EZpvd(this.deriveCardano, commonParams.deriveCardano);
    }

    public int hashCode() {
        String str = this.keepSession;
        int iHashCode = str != null ? str.hashCode() : 0;
        Long l = this.retryCount;
        int iHashCode2 = l != null ? l.hashCode() : 0;
        Long l2 = this.pollIntervalTime;
        int iHashCode3 = l2 != null ? l2.hashCode() : 0;
        Long l3 = this.timeout;
        int iHashCode4 = l3 != null ? l3.hashCode() : 0;
        String str2 = this.passphraseState;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        Boolean bool = this.useEmptyPassphrase;
        int iHashCode6 = bool != null ? bool.hashCode() : 0;
        Boolean bool2 = this.initSession;
        int iHashCode7 = bool2 != null ? bool2.hashCode() : 0;
        Boolean bool3 = this.deriveCardano;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "CommonParams(keepSession=" + this.keepSession + ", retryCount=" + this.retryCount + ", pollIntervalTime=" + this.pollIntervalTime + ", timeout=" + this.timeout + ", passphraseState=" + this.passphraseState + ", useEmptyPassphrase=" + this.useEmptyPassphrase + ", initSession=" + this.initSession + ", deriveCardano=" + this.deriveCardano + ")";
    }
}
