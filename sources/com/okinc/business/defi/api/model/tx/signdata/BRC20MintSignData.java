package com.okinc.business.defi.api.model.tx.signdata;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BRC20MintSignData extends UTXOMintBaseSignData<BRC20MintItemInfo> {
    public static final int $stable = 8;

    @SerializedName("from")
    private String fromAddress;

    @SerializedName("inscribeList")
    private List<? extends BRC20MintItemInfo> mintItemList;

    @SerializedName("inscribeOutputSat")
    private String mintOutputSat;

    @SerializedName("inscribeType")
    private int mintType;
    private String ticker;

    @SerializedName("to")
    private String toAddress;

    @SerializedName("coinAmount")
    private String transferAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public String getFromAddress() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.business.defi.api.model.tx.signdata.BRC20MintItemInfo>, java.util.List<com.okinc.business.defi.api.model.tx.signdata.BRC20MintItemInfo> */
    @Override // com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseSignData
    public List<BRC20MintItemInfo> getMintItemList() {
        return this.mintItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseSignData
    public String getMintOutputSat() {
        return this.mintOutputSat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseSignData
    public int getMintType() {
        return this.mintType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTicker() {
        return this.ticker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public String getTransferAmount() {
        return this.transferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public void setFromAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseSignData
    public void setMintItemList(List<? extends BRC20MintItemInfo> list) {
        this.mintItemList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseSignData
    public void setMintOutputSat(String str) {
        this.mintOutputSat = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseSignData
    public void setMintType(int i) {
        this.mintType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTicker(String str) {
        this.ticker = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public void setToAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public void setTransferAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transferAmount = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r16v0 java.lang.Long))
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (r23v0 int)
  (r24v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r25v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, int, java.util.List<? extends com.okinc.business.defi.api.model.tx.signdata.BRC20MintItemInfo>, java.lang.String, java.lang.String):void (m)] (LINE:143) call: com.okinc.business.defi.api.model.tx.signdata.BRC20MintSignData.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, int, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BRC20MintSignData(Long l, String str, String str2, String str3, boolean z, boolean z2, String str4, int i, int i2, List list, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1L : l, str, str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? null : str4, i, i2, (i3 & 512) != 0 ? null : list, (i3 & 1024) != 0 ? null : str5, (i3 & 2048) != 0 ? null : str6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BRC20MintSignData(Long l, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, String str4, int i, int i2, List<? extends BRC20MintItemInfo> list, String str5, String str6) {
        super(l != null ? l.longValue() : -1L, str, str2, str3, z, z2, str4, i, i2, list, str5, null, 2048, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.fromAddress = str;
        this.toAddress = str2;
        this.transferAmount = str3;
        this.mintType = i2;
        this.mintItemList = list;
        this.mintOutputSat = str5;
        this.ticker = str6;
    }
}
