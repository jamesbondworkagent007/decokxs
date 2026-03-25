package com.okinc.business.dexlogic.bean;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class IntentBridgeQuoteCallDataReq {
    private String amount;
    private String bridgeId;
    private String chainId;
    private String fromTokenAddress;
    private String receiveWalletAddress;
    private String slippage;
    private String toChainId;
    private String toTokenAddress;
    private String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IntentBridgeQuoteCallDataReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntentBridgeQuoteCallDataReq copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new IntentBridgeQuoteCallDataReq(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntentBridgeQuoteCallDataReq)) {
            return false;
        }
        IntentBridgeQuoteCallDataReq intentBridgeQuoteCallDataReq = (IntentBridgeQuoteCallDataReq) obj;
        return Intrinsics.EZpvd((Object) this.bridgeId, (Object) intentBridgeQuoteCallDataReq.bridgeId) && Intrinsics.EZpvd((Object) this.slippage, (Object) intentBridgeQuoteCallDataReq.slippage) && Intrinsics.EZpvd((Object) this.toChainId, (Object) intentBridgeQuoteCallDataReq.toChainId) && Intrinsics.EZpvd((Object) this.receiveWalletAddress, (Object) intentBridgeQuoteCallDataReq.receiveWalletAddress) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) intentBridgeQuoteCallDataReq.userWalletAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) intentBridgeQuoteCallDataReq.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) intentBridgeQuoteCallDataReq.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) intentBridgeQuoteCallDataReq.toTokenAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) intentBridgeQuoteCallDataReq.amount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeId() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveWalletAddress() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.bridgeId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.slippage;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.toChainId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.receiveWalletAddress;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.userWalletAddress;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.chainId;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.fromTokenAddress;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.toTokenAddress;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.amount;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeId(String str) {
        this.bridgeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(String str) {
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromTokenAddress(String str) {
        this.fromTokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveWalletAddress(String str) {
        this.receiveWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippage(String str) {
        this.slippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToChainId(String str) {
        this.toChainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenAddress(String str) {
        this.toTokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserWalletAddress(String str) {
        this.userWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IntentBridgeQuoteCallDataReq(bridgeId=" + this.bridgeId + ", slippage=" + this.slippage + ", toChainId=" + this.toChainId + ", receiveWalletAddress=" + this.receiveWalletAddress + ", userWalletAddress=" + this.userWalletAddress + ", chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", amount=" + this.amount + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallDataReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IntentBridgeQuoteCallDataReq> serializer() {
            return IntentBridgeQuoteCallDataReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IntentBridgeQuoteCallDataReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bridgeId = null;
        } else {
            this.bridgeId = str;
        }
        if ((i & 2) == 0) {
            this.slippage = null;
        } else {
            this.slippage = str2;
        }
        if ((i & 4) == 0) {
            this.toChainId = null;
        } else {
            this.toChainId = str3;
        }
        if ((i & 8) == 0) {
            this.receiveWalletAddress = null;
        } else {
            this.receiveWalletAddress = str4;
        }
        if ((i & 16) == 0) {
            this.userWalletAddress = null;
        } else {
            this.userWalletAddress = str5;
        }
        if ((i & 32) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str6;
        }
        if ((i & 64) == 0) {
            this.fromTokenAddress = null;
        } else {
            this.fromTokenAddress = str7;
        }
        if ((i & 128) == 0) {
            this.toTokenAddress = null;
        } else {
            this.toTokenAddress = str8;
        }
        if ((i & 256) == 0) {
            this.amount = null;
        } else {
            this.amount = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(IntentBridgeQuoteCallDataReq intentBridgeQuoteCallDataReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || intentBridgeQuoteCallDataReq.bridgeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, intentBridgeQuoteCallDataReq.bridgeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || intentBridgeQuoteCallDataReq.slippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, intentBridgeQuoteCallDataReq.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || intentBridgeQuoteCallDataReq.toChainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, intentBridgeQuoteCallDataReq.toChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || intentBridgeQuoteCallDataReq.receiveWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, intentBridgeQuoteCallDataReq.receiveWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || intentBridgeQuoteCallDataReq.userWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, intentBridgeQuoteCallDataReq.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || intentBridgeQuoteCallDataReq.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, intentBridgeQuoteCallDataReq.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || intentBridgeQuoteCallDataReq.fromTokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, intentBridgeQuoteCallDataReq.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || intentBridgeQuoteCallDataReq.toTokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, intentBridgeQuoteCallDataReq.toTokenAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && intentBridgeQuoteCallDataReq.amount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, intentBridgeQuoteCallDataReq.amount);
    }

    public IntentBridgeQuoteCallDataReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.bridgeId = str;
        this.slippage = str2;
        this.toChainId = str3;
        this.receiveWalletAddress = str4;
        this.userWalletAddress = str5;
        this.chainId = str6;
        this.fromTokenAddress = str7;
        this.toTokenAddress = str8;
        this.amount = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2207) call: com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallDataReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IntentBridgeQuoteCallDataReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
    }
}
