package com.okinc.business.defi.biz.core.transaction.sign.ton.bean;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TonSignInfo {
    public static final int STATUS_CAN_CLAIM = 1;
    private final Boolean checkMemo;
    private final String claimInfoUrl;
    private String customPayload;
    private String fromJettonAccount;
    private final String minTonLimit;
    private final String nonce;
    private String stateInit;
    private final Integer status;
    private final Integer ttl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TonSignInfo() {
        this((String) null, (String) null, (Boolean) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromJettonAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.checkMemo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minTonLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.stateInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.customPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.claimInfoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonSignInfo copy(String str, String str2, Boolean bool, String str3, Integer num, Integer num2, String str4, String str5, String str6) {
        return new TonSignInfo(str, str2, bool, str3, num, num2, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonSignInfo)) {
            return false;
        }
        TonSignInfo tonSignInfo = (TonSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.nonce, (Object) tonSignInfo.nonce) && Intrinsics.EZpvd((Object) this.fromJettonAccount, (Object) tonSignInfo.fromJettonAccount) && Intrinsics.EZpvd(this.checkMemo, tonSignInfo.checkMemo) && Intrinsics.EZpvd((Object) this.minTonLimit, (Object) tonSignInfo.minTonLimit) && Intrinsics.EZpvd(this.ttl, tonSignInfo.ttl) && Intrinsics.EZpvd(this.status, tonSignInfo.status) && Intrinsics.EZpvd((Object) this.stateInit, (Object) tonSignInfo.stateInit) && Intrinsics.EZpvd((Object) this.customPayload, (Object) tonSignInfo.customPayload) && Intrinsics.EZpvd((Object) this.claimInfoUrl, (Object) tonSignInfo.claimInfoUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCheckMemo() {
        return this.checkMemo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClaimInfoUrl() {
        return this.claimInfoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomPayload() {
        return this.customPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromJettonAccount() {
        return this.fromJettonAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinTonLimit() {
        return this.minTonLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStateInit() {
        return this.stateInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTtl() {
        return this.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nonce;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fromJettonAccount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.checkMemo;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str3 = this.minTonLimit;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.ttl;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.status;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        String str4 = this.stateInit;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.customPayload;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.claimInfoUrl;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomPayload(String str) {
        this.customPayload = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromJettonAccount(String str) {
        this.fromJettonAccount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStateInit(String str) {
        this.stateInit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonSignInfo(nonce=" + this.nonce + ", fromJettonAccount=" + this.fromJettonAccount + ", checkMemo=" + this.checkMemo + ", minTonLimit=" + this.minTonLimit + ", ttl=" + this.ttl + ", status=" + this.status + ", stateInit=" + this.stateInit + ", customPayload=" + this.customPayload + ", claimInfoUrl=" + this.claimInfoUrl + ")";
    }

    public /* synthetic */ TonSignInfo(int i, String str, String str2, Boolean bool, String str3, Integer num, Integer num2, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str;
        }
        if ((i & 2) == 0) {
            this.fromJettonAccount = null;
        } else {
            this.fromJettonAccount = str2;
        }
        if ((i & 4) == 0) {
            this.checkMemo = null;
        } else {
            this.checkMemo = bool;
        }
        if ((i & 8) == 0) {
            this.minTonLimit = null;
        } else {
            this.minTonLimit = str3;
        }
        if ((i & 16) == 0) {
            this.ttl = null;
        } else {
            this.ttl = num;
        }
        if ((i & 32) == 0) {
            this.status = null;
        } else {
            this.status = num2;
        }
        if ((i & 64) == 0) {
            this.stateInit = null;
        } else {
            this.stateInit = str4;
        }
        if ((i & 128) == 0) {
            this.customPayload = null;
        } else {
            this.customPayload = str5;
        }
        if ((i & 256) == 0) {
            this.claimInfoUrl = null;
        } else {
            this.claimInfoUrl = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TonSignInfo tonSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tonSignInfo.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tonSignInfo.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tonSignInfo.fromJettonAccount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tonSignInfo.fromJettonAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tonSignInfo.checkMemo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, tonSignInfo.checkMemo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tonSignInfo.minTonLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tonSignInfo.minTonLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tonSignInfo.ttl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, tonSignInfo.ttl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tonSignInfo.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, tonSignInfo.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tonSignInfo.stateInit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tonSignInfo.stateInit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tonSignInfo.customPayload != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tonSignInfo.customPayload);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && tonSignInfo.claimInfoUrl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tonSignInfo.claimInfoUrl);
    }

    public TonSignInfo(String str, String str2, Boolean bool, String str3, Integer num, Integer num2, String str4, String str5, String str6) {
        this.nonce = str;
        this.fromJettonAccount = str2;
        this.checkMemo = bool;
        this.minTonLimit = str3;
        this.ttl = num;
        this.status = num2;
        this.stateInit = str4;
        this.customPayload = str5;
        this.claimInfoUrl = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r13v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonSignInfo.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TonSignInfo(String str, String str2, Boolean bool, String str3, Integer num, Integer num2, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? str6 : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TonSignInfo> serializer() {
            return TonSignInfo$$serializer.INSTANCE;
        }
    }
}
