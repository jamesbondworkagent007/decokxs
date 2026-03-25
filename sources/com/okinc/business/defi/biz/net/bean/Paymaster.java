package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Paymaster {
    public static final int $stable = 8;
    private String address;
    private String name;
    private String paymasterAddress;
    private Integer type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Paymaster copy$default(Paymaster paymaster, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymaster.address;
        }
        if ((i & 2) != 0) {
            str2 = paymaster.paymasterAddress;
        }
        if ((i & 4) != 0) {
            str3 = paymaster.name;
        }
        if ((i & 8) != 0) {
            num = paymaster.type;
        }
        return paymaster.copy(str, str2, str3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.paymasterAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Paymaster copy(@NotNull String str, String str2, String str3, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Paymaster(str, str2, str3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Paymaster)) {
            return false;
        }
        Paymaster paymaster = (Paymaster) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) paymaster.address) && Intrinsics.EZpvd((Object) this.paymasterAddress, (Object) paymaster.paymasterAddress) && Intrinsics.EZpvd((Object) this.name, (Object) paymaster.name) && Intrinsics.EZpvd(this.type, paymaster.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterAddress() {
        return this.paymasterAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        String str = this.paymasterAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.type;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterAddress(String str) {
        this.paymasterAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(Integer num) {
        this.type = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Paymaster(address=" + this.address + ", paymasterAddress=" + this.paymasterAddress + ", name=" + this.name + ", type=" + this.type + ")";
    }

    public Paymaster(@NotNull String str, String str2, String str3, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.paymasterAddress = str2;
        this.name = str3;
        this.type = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:1306) call: com.okinc.business.defi.biz.net.bean.Paymaster.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ Paymaster(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }

    public final boolean isFreeGasPaymaster() {
        Integer num = this.type;
        return num != null && num.intValue() == 0;
    }

    public final String getRealPaymasterAddress() {
        if (!C33129mqd.OLrzqt((CharSequence) this.paymasterAddress)) {
            return this.address;
        }
        String str = this.paymasterAddress;
        Intrinsics.copydefault((Object) str);
        return str;
    }
}
