package com.okinc.business.defi.biz.core.customchain.rpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class CustomChainTransactionReceipt {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String blockHash;
    private final String gasUsed;
    private final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomChainTransactionReceipt() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CustomChainTransactionReceipt copy$default(CustomChainTransactionReceipt customChainTransactionReceipt, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customChainTransactionReceipt.blockHash;
        }
        if ((i & 2) != 0) {
            str2 = customChainTransactionReceipt.status;
        }
        if ((i & 4) != 0) {
            str3 = customChainTransactionReceipt.gasUsed;
        }
        return customChainTransactionReceipt.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.blockHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.gasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainTransactionReceipt copy(String str, String str2, String str3) {
        return new CustomChainTransactionReceipt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomChainTransactionReceipt)) {
            return false;
        }
        CustomChainTransactionReceipt customChainTransactionReceipt = (CustomChainTransactionReceipt) obj;
        return Intrinsics.EZpvd((Object) this.blockHash, (Object) customChainTransactionReceipt.blockHash) && Intrinsics.EZpvd((Object) this.status, (Object) customChainTransactionReceipt.status) && Intrinsics.EZpvd((Object) this.gasUsed, (Object) customChainTransactionReceipt.gasUsed);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlockHash() {
        return this.blockHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasUsed() {
        return this.gasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.blockHash;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.status;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.gasUsed;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomChainTransactionReceipt(blockHash=" + this.blockHash + ", status=" + this.status + ", gasUsed=" + this.gasUsed + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.customchain.rpc.CustomChainTransactionReceipt.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CustomChainTransactionReceipt> serializer() {
            return CustomChainTransactionReceipt$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CustomChainTransactionReceipt(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.blockHash = null;
        } else {
            this.blockHash = str;
        }
        if ((i & 2) == 0) {
            this.status = null;
        } else {
            this.status = str2;
        }
        if ((i & 4) == 0) {
            this.gasUsed = null;
        } else {
            this.gasUsed = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CustomChainTransactionReceipt customChainTransactionReceipt, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || customChainTransactionReceipt.blockHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, customChainTransactionReceipt.blockHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || customChainTransactionReceipt.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, customChainTransactionReceipt.status);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && customChainTransactionReceipt.gasUsed == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, customChainTransactionReceipt.gasUsed);
    }

    public CustomChainTransactionReceipt(String str, String str2, String str3) {
        this.blockHash = str;
        this.status = str2;
        this.gasUsed = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.defi.biz.core.customchain.rpc.CustomChainTransactionReceipt.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CustomChainTransactionReceipt(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
