package com.okinc.wallet.core.sign;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class UnsignedTx {
    public static final int $stable = 8;
    private int addressType;
    private long chainId;
    private Object data;
    private boolean mainNetWork;
    private long realChainId;
    private String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.mainNetWork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsignedTx copy(long j, long j2, String str, @NotNull Object obj, int i, boolean z) {
        Intrinsics.checkNotNullParameter(obj, "");
        return new UnsignedTx(j, j2, str, obj, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsignedTx)) {
            return false;
        }
        UnsignedTx unsignedTx = (UnsignedTx) obj;
        return this.chainId == unsignedTx.chainId && this.realChainId == unsignedTx.realChainId && Intrinsics.EZpvd((Object) this.token, (Object) unsignedTx.token) && Intrinsics.EZpvd(this.data, unsignedTx.data) && this.addressType == unsignedTx.addressType && this.mainNetWork == unsignedTx.mainNetWork;
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
    public final Object getData() {
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
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainId);
        int iHashCode2 = Long.hashCode(this.realChainId);
        String str = this.token;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.data.hashCode()) * 31) + Integer.hashCode(this.addressType)) * 31) + Boolean.hashCode(this.mainNetWork);
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
    public final void setData(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.data = obj;
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
    public final void setToken(String str) {
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnsignedTx(chainId=" + this.chainId + ", realChainId=" + this.realChainId + ", token=" + this.token + ", data=" + this.data + ", addressType=" + this.addressType + ", mainNetWork=" + this.mainNetWork + ")";
    }

    public UnsignedTx(long j, long j2, String str, @NotNull Object obj, int i, boolean z) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.chainId = j;
        this.realChainId = j2;
        this.token = str;
        this.data = obj;
        this.addressType = i;
        this.mainNetWork = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r12v0 long)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 long))
  (r16v0 java.lang.String)
  (r17v0 java.lang.Object)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r18v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r19v0 boolean))
 A[MD:(long, long, java.lang.String, java.lang.Object, int, boolean):void (m)] (LINE:26) call: com.okinc.wallet.core.sign.UnsignedTx.<init>(long, long, java.lang.String, java.lang.Object, int, boolean):void type: THIS */
    public /* synthetic */ UnsignedTx(long j, long j2, String str, Object obj, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? 0L : j2, str, obj, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? true : z);
    }
}
