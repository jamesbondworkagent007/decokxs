package com.okinc.business.defi.biz.core.transaction.sign.starknet.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class StarkNetSignInfo {
    private String contractAddress;
    private String nonce;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StarkNetSignInfo() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StarkNetSignInfo copy$default(StarkNetSignInfo starkNetSignInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = starkNetSignInfo.nonce;
        }
        if ((i & 2) != 0) {
            str2 = starkNetSignInfo.contractAddress;
        }
        return starkNetSignInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StarkNetSignInfo copy(String str, String str2) {
        return new StarkNetSignInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarkNetSignInfo)) {
            return false;
        }
        StarkNetSignInfo starkNetSignInfo = (StarkNetSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.nonce, (Object) starkNetSignInfo.nonce) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) starkNetSignInfo.contractAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nonce;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.contractAddress;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(String str) {
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StarkNetSignInfo(nonce=" + this.nonce + ", contractAddress=" + this.contractAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.starknet.bean.StarkNetSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StarkNetSignInfo> serializer() {
            return StarkNetSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StarkNetSignInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str;
        }
        if ((i & 2) == 0) {
            this.contractAddress = null;
        } else {
            this.contractAddress = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(StarkNetSignInfo starkNetSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || starkNetSignInfo.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, starkNetSignInfo.nonce);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && starkNetSignInfo.contractAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, starkNetSignInfo.contractAddress);
    }

    public StarkNetSignInfo(String str, String str2) {
        this.nonce = str;
        this.contractAddress = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.business.defi.biz.core.transaction.sign.starknet.bean.StarkNetSignInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StarkNetSignInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
