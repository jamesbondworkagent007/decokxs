package com.okinc.business.defi.biz.net.bean;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10854bwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymasterToken {
    public static final int $stable = 8;
    public transient List<AAGasLimit> aaGasLimitRes;
    private Long chainId;
    private Long coinId;
    public transient C10854bwM coinMeta;
    private String contractAddress;
    private ArrayList<Paymaster> payMaster;
    private String symbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.PaymasterToken */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymasterToken copy$default(PaymasterToken paymasterToken, Long l, Long l2, String str, ArrayList arrayList, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = paymasterToken.chainId;
        }
        if ((i & 2) != 0) {
            l2 = paymasterToken.coinId;
        }
        Long l3 = l2;
        if ((i & 4) != 0) {
            str = paymasterToken.contractAddress;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            arrayList = paymasterToken.payMaster;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 16) != 0) {
            str2 = paymasterToken.symbol;
        }
        return paymasterToken.copy(l, l3, str3, arrayList2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Paymaster> component4() {
        return this.payMaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymasterToken copy(Long l, Long l2, String str, ArrayList<Paymaster> arrayList, String str2) {
        return new PaymasterToken(l, l2, str, arrayList, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymasterToken)) {
            return false;
        }
        PaymasterToken paymasterToken = (PaymasterToken) obj;
        return Intrinsics.EZpvd(this.chainId, paymasterToken.chainId) && Intrinsics.EZpvd(this.coinId, paymasterToken.coinId) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) paymasterToken.contractAddress) && Intrinsics.EZpvd(this.payMaster, paymasterToken.payMaster) && Intrinsics.EZpvd((Object) this.symbol, (Object) paymasterToken.symbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Paymaster> getPayMaster() {
        return this.payMaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.coinId;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        String str = this.contractAddress;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        ArrayList<Paymaster> arrayList = this.payMaster;
        int iHashCode4 = arrayList == null ? 0 : arrayList.hashCode();
        String str2 = this.symbol;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAaGasLimitRes(@NotNull List<AAGasLimit> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.aaGasLimitRes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinMeta(@NotNull C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        this.coinMeta = c10854bwM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayMaster(ArrayList<Paymaster> arrayList) {
        this.payMaster = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaymasterToken(chainId=" + this.chainId + ", coinId=" + this.coinId + ", contractAddress=" + this.contractAddress + ", payMaster=" + this.payMaster + ", symbol=" + this.symbol + ")";
    }

    public PaymasterToken(Long l, Long l2, String str, ArrayList<Paymaster> arrayList, String str2) {
        this.chainId = l;
        this.coinId = l2;
        this.contractAddress = str;
        this.payMaster = arrayList;
        this.symbol = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r8v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r9v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (r11v0 java.util.ArrayList)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.util.ArrayList<com.okinc.business.defi.biz.net.bean.Paymaster>, java.lang.String):void (m)] (LINE:1291) call: com.okinc.business.defi.biz.net.bean.PaymasterToken.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.util.ArrayList, java.lang.String):void type: THIS */
    public /* synthetic */ PaymasterToken(Long l, Long l2, String str, ArrayList arrayList, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, arrayList, (i & 16) != 0 ? null : str2);
    }

    public final C10854bwM getCoinMeta() {
        C10854bwM c10854bwM = this.coinMeta;
        if (c10854bwM != null) {
            return c10854bwM;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final List<AAGasLimit> getAaGasLimitRes() {
        List<AAGasLimit> list = this.aaGasLimitRes;
        if (list != null) {
            return list;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
