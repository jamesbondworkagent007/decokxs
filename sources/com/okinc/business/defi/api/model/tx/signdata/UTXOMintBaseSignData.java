package com.okinc.business.defi.api.model.tx.signdata;

import com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseItemInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class UTXOMintBaseSignData<Item extends UTXOMintBaseItemInfo> extends UTXOTransferBaseSignData {
    public static final int $stable = 8;
    private List<? extends Item> mintItemList;
    private String mintOutputSat;
    private int mintType;
    private int protocolId;
    private String tickerId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<Item> getMintItemList() {
        return this.mintItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMintOutputSat() {
        return this.mintOutputSat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMintType() {
        return this.mintType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTickerId() {
        return this.tickerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMintItemList(List<? extends Item> list) {
        this.mintItemList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMintOutputSat(String str) {
        this.mintOutputSat = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMintType(int i) {
        this.mintType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(int i) {
        this.protocolId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTickerId(String str) {
        this.tickerId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (r18v0 long)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 boolean)
  (r24v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (r26v0 int)
  (r27v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r28v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, int, java.util.List<? extends Item extends com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseItemInfo>, java.lang.String, java.lang.String):void (m)] (LINE:119) call: com.okinc.business.defi.api.model.tx.signdata.UTXOMintBaseSignData.<init>(long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, int, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UTXOMintBaseSignData(long j, String str, String str2, String str3, boolean z, boolean z2, String str4, int i, int i2, List list, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, z, z2, (i3 & 64) != 0 ? null : str4, i, i2, (i3 & 512) != 0 ? null : list, (i3 & 1024) != 0 ? null : str5, (i3 & 2048) != 0 ? null : str6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UTXOMintBaseSignData(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, String str4, int i, int i2, List<? extends Item> list, String str5, String str6) {
        super(j, str, str2, str3, z, z2, str4);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.protocolId = i;
        this.mintType = i2;
        this.mintItemList = list;
        this.mintOutputSat = str5;
        this.tickerId = str6;
    }
}
