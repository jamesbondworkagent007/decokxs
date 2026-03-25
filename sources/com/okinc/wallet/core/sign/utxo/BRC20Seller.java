package com.okinc.wallet.core.sign.utxo;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BRC20Seller {
    public static final int $stable = 8;
    private String address;
    private String price;
    private String psbtTx;
    private List<String> signatureList;
    private List<UTXOTxIn> txin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.wallet.core.sign.utxo.BRC20Seller */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BRC20Seller copy$default(BRC20Seller bRC20Seller, String str, String str2, List list, List list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bRC20Seller.price;
        }
        if ((i & 2) != 0) {
            str2 = bRC20Seller.address;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = bRC20Seller.txin;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = bRC20Seller.signatureList;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            str3 = bRC20Seller.psbtTx;
        }
        return bRC20Seller.copy(str, str4, list3, list4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOTxIn> component3() {
        return this.txin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.signatureList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.psbtTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BRC20Seller copy(@NotNull String str, @NotNull String str2, @NotNull List<UTXOTxIn> list, List<String> list2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BRC20Seller(str, str2, list, list2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BRC20Seller)) {
            return false;
        }
        BRC20Seller bRC20Seller = (BRC20Seller) obj;
        return Intrinsics.EZpvd((Object) this.price, (Object) bRC20Seller.price) && Intrinsics.EZpvd((Object) this.address, (Object) bRC20Seller.address) && Intrinsics.EZpvd(this.txin, bRC20Seller.txin) && Intrinsics.EZpvd(this.signatureList, bRC20Seller.signatureList) && Intrinsics.EZpvd((Object) this.psbtTx, (Object) bRC20Seller.psbtTx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPsbtTx() {
        return this.psbtTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignatureList() {
        return this.signatureList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOTxIn> getTxin() {
        return this.txin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.price.hashCode();
        int iHashCode2 = this.address.hashCode();
        int iHashCode3 = this.txin.hashCode();
        List<String> list = this.signatureList;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str = this.psbtTx;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPsbtTx(String str) {
        this.psbtTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignatureList(List<String> list) {
        this.signatureList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxin(@NotNull List<UTXOTxIn> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.txin = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BRC20Seller(price=" + this.price + ", address=" + this.address + ", txin=" + this.txin + ", signatureList=" + this.signatureList + ", psbtTx=" + this.psbtTx + ")";
    }

    public BRC20Seller(@NotNull String str, @NotNull String str2, @NotNull List<UTXOTxIn> list, List<String> list2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.price = str;
        this.address = str2;
        this.txin = list;
        this.signatureList = list2;
        this.psbtTx = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.wallet.core.sign.utxo.UTXOTxIn>, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:66) call: com.okinc.wallet.core.sign.utxo.BRC20Seller.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ BRC20Seller(String str, String str2, List list, List list2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str3);
    }
}
