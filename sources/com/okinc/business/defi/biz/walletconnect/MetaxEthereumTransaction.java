package com.okinc.business.defi.biz.walletconnect;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class MetaxEthereumTransaction {
    public static final int $stable = 0;
    private final String approvalAddress;
    private final String approvalNum;
    private final String data;
    private final String from;
    private final String gas;
    private final String gasLimit;
    private final String gasPrice;
    private final int gasRate;
    private final String nonce;
    private final String to;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.approvalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.gasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MetaxEthereumTransaction copy(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, @NotNull String str8, String str9, String str10, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new MetaxEthereumTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaxEthereumTransaction)) {
            return false;
        }
        MetaxEthereumTransaction metaxEthereumTransaction = (MetaxEthereumTransaction) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) metaxEthereumTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) metaxEthereumTransaction.to) && Intrinsics.EZpvd((Object) this.nonce, (Object) metaxEthereumTransaction.nonce) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) metaxEthereumTransaction.gasPrice) && Intrinsics.EZpvd((Object) this.gas, (Object) metaxEthereumTransaction.gas) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) metaxEthereumTransaction.gasLimit) && Intrinsics.EZpvd((Object) this.value, (Object) metaxEthereumTransaction.value) && Intrinsics.EZpvd((Object) this.data, (Object) metaxEthereumTransaction.data) && Intrinsics.EZpvd((Object) this.approvalAddress, (Object) metaxEthereumTransaction.approvalAddress) && Intrinsics.EZpvd((Object) this.approvalNum, (Object) metaxEthereumTransaction.approvalNum) && this.gasRate == metaxEthereumTransaction.gasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalAddress() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalNum() {
        return this.approvalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGas() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGasRate() {
        return this.gasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.from.hashCode();
        String str = this.to;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.nonce;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.gasPrice;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.gas;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.gasLimit;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.value;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        int iHashCode8 = this.data.hashCode();
        String str7 = this.approvalAddress;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.approvalNum;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str8 != null ? str8.hashCode() : 0)) * 31) + Integer.hashCode(this.gasRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MetaxEthereumTransaction(from=" + this.from + ", to=" + this.to + ", nonce=" + this.nonce + ", gasPrice=" + this.gasPrice + ", gas=" + this.gas + ", gasLimit=" + this.gasLimit + ", value=" + this.value + ", data=" + this.data + ", approvalAddress=" + this.approvalAddress + ", approvalNum=" + this.approvalNum + ", gasRate=" + this.gasRate + ")";
    }

    public MetaxEthereumTransaction(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, @NotNull String str8, String str9, String str10, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.from = str;
        this.to = str2;
        this.nonce = str3;
        this.gasPrice = str4;
        this.gas = str5;
        this.gasLimit = str6;
        this.value = str7;
        this.data = str8;
        this.approvalAddress = str9;
        this.approvalNum = str10;
        this.gasRate = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:163) call: com.okinc.business.defi.biz.walletconnect.MetaxEthereumTransaction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ MetaxEthereumTransaction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? 0 : i);
    }
}
