package com.okinc.business.defi.biz.core.transaction.sign.stacks.bean;

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
public final class StacksSignInfo {
    private String contractAddress;
    private String contractName;
    private String nonce;
    private String reserveFeeRatio;
    private String tokenName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StacksSignInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StacksSignInfo copy$default(StacksSignInfo stacksSignInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stacksSignInfo.nonce;
        }
        if ((i & 2) != 0) {
            str2 = stacksSignInfo.contractAddress;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = stacksSignInfo.contractName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = stacksSignInfo.tokenName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = stacksSignInfo.reserveFeeRatio;
        }
        return stacksSignInfo.copy(str, str6, str7, str8, str5);
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
    public final String component3() {
        return this.contractName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StacksSignInfo copy(String str, String str2, String str3, String str4, String str5) {
        return new StacksSignInfo(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StacksSignInfo)) {
            return false;
        }
        StacksSignInfo stacksSignInfo = (StacksSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.nonce, (Object) stacksSignInfo.nonce) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) stacksSignInfo.contractAddress) && Intrinsics.EZpvd((Object) this.contractName, (Object) stacksSignInfo.contractName) && Intrinsics.EZpvd((Object) this.tokenName, (Object) stacksSignInfo.tokenName) && Intrinsics.EZpvd((Object) this.reserveFeeRatio, (Object) stacksSignInfo.reserveFeeRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractName() {
        return this.contractName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFeeRatio() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nonce;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.contractAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.contractName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenName;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.reserveFeeRatio;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractName(String str) {
        this.contractName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(String str) {
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFeeRatio(String str) {
        this.reserveFeeRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenName(String str) {
        this.tokenName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StacksSignInfo(nonce=" + this.nonce + ", contractAddress=" + this.contractAddress + ", contractName=" + this.contractName + ", tokenName=" + this.tokenName + ", reserveFeeRatio=" + this.reserveFeeRatio + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.stacks.bean.StacksSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StacksSignInfo> serializer() {
            return StacksSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StacksSignInfo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
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
        if ((i & 4) == 0) {
            this.contractName = null;
        } else {
            this.contractName = str3;
        }
        if ((i & 8) == 0) {
            this.tokenName = null;
        } else {
            this.tokenName = str4;
        }
        if ((i & 16) == 0) {
            this.reserveFeeRatio = null;
        } else {
            this.reserveFeeRatio = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(StacksSignInfo stacksSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || stacksSignInfo.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, stacksSignInfo.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || stacksSignInfo.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, stacksSignInfo.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || stacksSignInfo.contractName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, stacksSignInfo.contractName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || stacksSignInfo.tokenName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, stacksSignInfo.tokenName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && stacksSignInfo.reserveFeeRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, stacksSignInfo.reserveFeeRatio);
    }

    public StacksSignInfo(String str, String str2, String str3, String str4, String str5) {
        this.nonce = str;
        this.contractAddress = str2;
        this.contractName = str3;
        this.tokenName = str4;
        this.reserveFeeRatio = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.defi.biz.core.transaction.sign.stacks.bean.StacksSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StacksSignInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
