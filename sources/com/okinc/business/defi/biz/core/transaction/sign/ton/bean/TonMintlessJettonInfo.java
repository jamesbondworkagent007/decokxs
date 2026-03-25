package com.okinc.business.defi.biz.core.transaction.sign.ton.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TonMintlessJettonInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String customPayload;
    private final String jettonWallet;
    private final String stateInit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TonMintlessJettonInfo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonMintlessJettonInfo copy$default(TonMintlessJettonInfo tonMintlessJettonInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tonMintlessJettonInfo.jettonWallet;
        }
        if ((i & 2) != 0) {
            str2 = tonMintlessJettonInfo.stateInit;
        }
        if ((i & 4) != 0) {
            str3 = tonMintlessJettonInfo.customPayload;
        }
        return tonMintlessJettonInfo.copy(str, str2, str3);
    }

    @SerialName("custom_payload")
    public static /* synthetic */ void getCustomPayload$annotations() {
    }

    @SerialName("jetton_wallet")
    public static /* synthetic */ void getJettonWallet$annotations() {
    }

    @SerialName("state_init")
    public static /* synthetic */ void getStateInit$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.jettonWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.stateInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.customPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonMintlessJettonInfo copy(String str, String str2, String str3) {
        return new TonMintlessJettonInfo(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonMintlessJettonInfo)) {
            return false;
        }
        TonMintlessJettonInfo tonMintlessJettonInfo = (TonMintlessJettonInfo) obj;
        return Intrinsics.EZpvd((Object) this.jettonWallet, (Object) tonMintlessJettonInfo.jettonWallet) && Intrinsics.EZpvd((Object) this.stateInit, (Object) tonMintlessJettonInfo.stateInit) && Intrinsics.EZpvd((Object) this.customPayload, (Object) tonMintlessJettonInfo.customPayload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomPayload() {
        return this.customPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJettonWallet() {
        return this.jettonWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStateInit() {
        return this.stateInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.jettonWallet;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.stateInit;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.customPayload;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonMintlessJettonInfo(jettonWallet=" + this.jettonWallet + ", stateInit=" + this.stateInit + ", customPayload=" + this.customPayload + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonMintlessJettonInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonMintlessJettonInfo> serializer() {
            return TonMintlessJettonInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonMintlessJettonInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.jettonWallet = null;
        } else {
            this.jettonWallet = str;
        }
        if ((i & 2) == 0) {
            this.stateInit = null;
        } else {
            this.stateInit = str2;
        }
        if ((i & 4) == 0) {
            this.customPayload = null;
        } else {
            this.customPayload = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TonMintlessJettonInfo tonMintlessJettonInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tonMintlessJettonInfo.jettonWallet != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tonMintlessJettonInfo.jettonWallet);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tonMintlessJettonInfo.stateInit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tonMintlessJettonInfo.stateInit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && tonMintlessJettonInfo.customPayload == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tonMintlessJettonInfo.customPayload);
    }

    public TonMintlessJettonInfo(String str, String str2, String str3) {
        this.jettonWallet = str;
        this.stateInit = str2;
        this.customPayload = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:80) call: com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonMintlessJettonInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TonMintlessJettonInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
