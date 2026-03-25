package com.okinc.wallet.core.sign;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class RawData {
    public static final int $stable = 8;
    private int addressType;
    private long chainId;
    private SignatureRawValue data;
    private boolean mainNetWork;
    private long realChainId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignatureRawValue component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.mainNetWork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RawData copy(long j, long j2, @NotNull SignatureRawValue signatureRawValue, boolean z, int i) {
        Intrinsics.checkNotNullParameter(signatureRawValue, "");
        return new RawData(j, j2, signatureRawValue, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawData)) {
            return false;
        }
        RawData rawData = (RawData) obj;
        return this.chainId == rawData.chainId && this.realChainId == rawData.realChainId && Intrinsics.EZpvd(this.data, rawData.data) && this.mainNetWork == rawData.mainNetWork && this.addressType == rawData.addressType;
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
    public final SignatureRawValue getData() {
        return this.data;
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
    public int hashCode() {
        return (((((((Long.hashCode(this.chainId) * 31) + Long.hashCode(this.realChainId)) * 31) + this.data.hashCode()) * 31) + Boolean.hashCode(this.mainNetWork)) * 31) + Integer.hashCode(this.addressType);
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
    public final void setData(@NotNull SignatureRawValue signatureRawValue) {
        Intrinsics.checkNotNullParameter(signatureRawValue, "");
        this.data = signatureRawValue;
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
    public String toString() {
        return "RawData(chainId=" + this.chainId + ", realChainId=" + this.realChainId + ", data=" + this.data + ", mainNetWork=" + this.mainNetWork + ", addressType=" + this.addressType + ")";
    }

    public RawData(long j, long j2, @NotNull SignatureRawValue signatureRawValue, boolean z, int i) {
        Intrinsics.checkNotNullParameter(signatureRawValue, "");
        this.chainId = j;
        this.realChainId = j2;
        this.data = signatureRawValue;
        this.mainNetWork = z;
        this.addressType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r11v0 long)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r13v0 long))
  (r15v0 com.okinc.wallet.core.sign.SignatureRawValue)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r17v0 int))
 A[MD:(long, long, com.okinc.wallet.core.sign.SignatureRawValue, boolean, int):void (m)] (LINE:36) call: com.okinc.wallet.core.sign.RawData.<init>(long, long, com.okinc.wallet.core.sign.SignatureRawValue, boolean, int):void type: THIS */
    public /* synthetic */ RawData(long j, long j2, SignatureRawValue signatureRawValue, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? 0L : j2, signatureRawValue, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? 1 : i);
    }
}
