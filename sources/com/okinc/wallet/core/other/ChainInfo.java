package com.okinc.wallet.core.other;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ChainInfo {
    private int addressIndex;
    private int addressType;
    private long chainId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainInfo() {
        this(0L, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChainInfo copy$default(ChainInfo chainInfo, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = chainInfo.chainId;
        }
        if ((i3 & 2) != 0) {
            i = chainInfo.addressIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = chainInfo.addressType;
        }
        return chainInfo.copy(j, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainInfo copy(long j, int i, int i2) {
        return new ChainInfo(j, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChainInfo)) {
            return false;
        }
        ChainInfo chainInfo = (ChainInfo) obj;
        return this.chainId == chainInfo.chainId && this.addressIndex == chainInfo.addressIndex && this.addressType == chainInfo.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.chainId) * 31) + Integer.hashCode(this.addressIndex)) * 31) + Integer.hashCode(this.addressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressIndex(int i) {
        this.addressIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(int i) {
        this.addressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainInfo(chainId=" + this.chainId + ", addressIndex=" + this.addressIndex + ", addressType=" + this.addressType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.other.ChainInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainInfo> serializer() {
            return ChainInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChainInfo(int i, long j, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? -1L : j;
        if ((i & 2) == 0) {
            this.addressIndex = 0;
        } else {
            this.addressIndex = i2;
        }
        if ((i & 4) == 0) {
            this.addressType = 1;
        } else {
            this.addressType = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ChainInfo chainInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || chainInfo.chainId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, chainInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || chainInfo.addressIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, chainInfo.addressIndex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && chainInfo.addressType == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, chainInfo.addressType);
    }

    public ChainInfo(long j, int i, int i2) {
        this.chainId = j;
        this.addressIndex = i;
        this.addressType = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r1v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r4v0 int))
 A[MD:(long, int, int):void (m)] (LINE:15) call: com.okinc.wallet.core.other.ChainInfo.<init>(long, int, int):void type: THIS */
    public /* synthetic */ ChainInfo(long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 1 : i2);
    }
}
