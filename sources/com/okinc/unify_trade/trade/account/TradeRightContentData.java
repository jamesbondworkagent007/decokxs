package com.okinc.unify_trade.trade.account;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class TradeRightContentData {
    public static final int $stable = 8;
    private String content;
    private String info;
    private boolean isSelected;
    private boolean isShowCheck;
    private boolean isSingleButton;
    private boolean showInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeRightContentData copy$default(TradeRightContentData tradeRightContentData, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeRightContentData.content;
        }
        if ((i & 2) != 0) {
            z = tradeRightContentData.isSelected;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = tradeRightContentData.showInfo;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            str2 = tradeRightContentData.info;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            z3 = tradeRightContentData.isShowCheck;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            z4 = tradeRightContentData.isSingleButton;
        }
        return tradeRightContentData.copy(str, z5, z6, str3, z7, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.showInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isShowCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isSingleButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeRightContentData copy(@NotNull String str, boolean z, boolean z2, @NotNull String str2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TradeRightContentData(str, z, z2, str2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeRightContentData)) {
            return false;
        }
        TradeRightContentData tradeRightContentData = (TradeRightContentData) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) tradeRightContentData.content) && this.isSelected == tradeRightContentData.isSelected && this.showInfo == tradeRightContentData.showInfo && Intrinsics.EZpvd((Object) this.info, (Object) tradeRightContentData.info) && this.isShowCheck == tradeRightContentData.isShowCheck && this.isSingleButton == tradeRightContentData.isSingleButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInfo() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowInfo() {
        return this.showInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.content.hashCode() * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.showInfo)) * 31) + this.info.hashCode()) * 31) + Boolean.hashCode(this.isShowCheck)) * 31) + Boolean.hashCode(this.isSingleButton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowCheck() {
        return this.isShowCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSingleButton() {
        return this.isSingleButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.info = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCheck(boolean z) {
        this.isShowCheck = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowInfo(boolean z) {
        this.showInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSingleButton(boolean z) {
        this.isSingleButton = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeRightContentData(content=" + this.content + ", isSelected=" + this.isSelected + ", showInfo=" + this.showInfo + ", info=" + this.info + ", isShowCheck=" + this.isShowCheck + ", isSingleButton=" + this.isSingleButton + ")";
    }

    public TradeRightContentData(@NotNull String str, boolean z, boolean z2, @NotNull String str2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.content = str;
        this.isSelected = z;
        this.showInfo = z2;
        this.info = str2;
        this.isShowCheck = z3;
        this.isSingleButton = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 boolean)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r13v0 boolean))
 A[MD:(java.lang.String, boolean, boolean, java.lang.String, boolean, boolean):void (m)] (LINE:10) call: com.okinc.unify_trade.trade.account.TradeRightContentData.<init>(java.lang.String, boolean, boolean, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ TradeRightContentData(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? true : z3, (i & 32) != 0 ? true : z4);
    }
}
