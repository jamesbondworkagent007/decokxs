package com.okinc.business.defi.api.model.tx.signdata;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RunesMainMintSignData extends UTXOMintBaseSignData<RuneMainMintItemInfo> {
    public static final int $stable = 8;

    @SerializedName("from")
    private String fromAddress;

    @SerializedName("outputSat")
    private String mintOutputSat;

    @SerializedName("to")
    private String toAddress;
    private final String tokenId;

    @SerializedName("coinAmount")
    private String transferAmount;
    private final int txType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public String getFromAddress() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseSignData
    public String getMintOutputSat() {
        return this.mintOutputSat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public String getTransferAmount() {
        return this.transferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public void setFromAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseSignData
    public void setMintOutputSat(String str) {
        this.mintOutputSat = str;
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (r20v0 java.lang.String)
  (r21v0 java.util.List)
  (r22v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (r24v0 java.lang.String)
  (r25v0 int)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List<com.okinc.business.defi.api.model.tx.signdata.RuneMainMintItemInfo>, int, java.lang.String, java.lang.String, int):void (m)] (LINE:177) call: com.okinc.business.defi.api.model.tx.signdata.RunesMainMintSignData.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List, int, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ RunesMainMintSignData(String str, String str2, String str3, boolean z, boolean z2, String str4, List list, int i, String str5, String str6, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, str4, list, i, (i3 & 256) != 0 ? null : str5, str6, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunesMainMintSignData(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, String str4, @NotNull List<RuneMainMintItemInfo> list, int i, String str5, @NotNull String str6, int i2) {
        super(-1L, str, str2, str3, z, z2, null, i, 11, list, str4, str5);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.fromAddress = str;
        this.toAddress = str2;
        this.transferAmount = str3;
        this.mintOutputSat = str4;
        this.tokenId = str6;
        this.txType = i2;
    }
}
