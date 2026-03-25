package com.okinc.wallet.core.mpc;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class HDWalletCoin {
    private String addressHrp;
    private int addressIndex;

    @SerializedName("addressType")
    private int addressType;
    private long chainId;
    private boolean mainNetWork;
    private long realChainId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HDWalletCoin() {
        this(0L, 0L, false, 0, 0, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.mainNetWork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.addressHrp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HDWalletCoin copy(long j, long j2, boolean z, int i, int i2, String str) {
        return new HDWalletCoin(j, j2, z, i, i2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HDWalletCoin)) {
            return false;
        }
        HDWalletCoin hDWalletCoin = (HDWalletCoin) obj;
        return this.chainId == hDWalletCoin.chainId && this.realChainId == hDWalletCoin.realChainId && this.mainNetWork == hDWalletCoin.mainNetWork && this.addressType == hDWalletCoin.addressType && this.addressIndex == hDWalletCoin.addressIndex && Intrinsics.EZpvd((Object) this.addressHrp, (Object) hDWalletCoin.addressHrp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressHrp() {
        return this.addressHrp;
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
    public final boolean getMainNetWork() {
        return this.mainNetWork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRealChainId() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getaddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainId);
        int iHashCode2 = Long.hashCode(this.realChainId);
        int iHashCode3 = Boolean.hashCode(this.mainNetWork);
        int iHashCode4 = Integer.hashCode(this.addressType);
        int iHashCode5 = Integer.hashCode(this.addressIndex);
        String str = this.addressHrp;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressHrp(String str) {
        this.addressHrp = str;
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
    public final void setMainNetWork(boolean z) {
        this.mainNetWork = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealChainId(long j) {
        this.realChainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setaddressType(int i) {
        this.addressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HDWalletCoin(chainId=" + this.chainId + ", realChainId=" + this.realChainId + ", mainNetWork=" + this.mainNetWork + ", addressType=" + this.addressType + ", addressIndex=" + this.addressIndex + ", addressHrp=" + this.addressHrp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.mpc.HDWalletCoin.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HDWalletCoin> serializer() {
            return HDWalletCoin$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HDWalletCoin(int i, long j, long j2, boolean z, int i2, int i3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? -1L : j;
        if ((i & 2) == 0) {
            this.realChainId = 0L;
        } else {
            this.realChainId = j2;
        }
        if ((i & 4) == 0) {
            this.mainNetWork = true;
        } else {
            this.mainNetWork = z;
        }
        if ((i & 8) == 0) {
            this.addressType = 1;
        } else {
            this.addressType = i2;
        }
        if ((i & 16) == 0) {
            this.addressIndex = 0;
        } else {
            this.addressIndex = i3;
        }
        if ((i & 32) == 0) {
            this.addressHrp = null;
        } else {
            this.addressHrp = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(HDWalletCoin hDWalletCoin, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || hDWalletCoin.chainId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, hDWalletCoin.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || hDWalletCoin.realChainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, hDWalletCoin.realChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !hDWalletCoin.mainNetWork) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, hDWalletCoin.mainNetWork);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || hDWalletCoin.addressType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, hDWalletCoin.addressType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || hDWalletCoin.addressIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, hDWalletCoin.addressIndex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && hDWalletCoin.addressHrp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, hDWalletCoin.addressHrp);
    }

    public HDWalletCoin(long j, long j2, boolean z, int i, int i2, String str) {
        this.chainId = j;
        this.realChainId = j2;
        this.mainNetWork = z;
        this.addressType = i;
        this.addressIndex = i2;
        this.addressHrp = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r9v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r13v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r17v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r14v0 int) : (1 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
 A[MD:(long, long, boolean, int, int, java.lang.String):void (m)] (LINE:60) call: com.okinc.wallet.core.mpc.HDWalletCoin.<init>(long, long, boolean, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ HDWalletCoin(long j, long j2, boolean z, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1L : j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? true : z, (i3 & 8) == 0 ? i : 1, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : str);
    }
}
