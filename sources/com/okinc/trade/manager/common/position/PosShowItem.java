package com.okinc.trade.manager.common.position;

import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class PosShowItem {
    public static final int $stable = 8;
    private final AvgPosPriceHintParam avgPosPriceHintParam;
    private final String content;
    private int contentColor;
    private final Pair<String, String> hintText;
    private boolean isSecurityDeposit;
    private boolean isShowPMEstimatedLiquidationPrice;
    private final int position;
    private final String title;
    private final boolean titleIsShowHint;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AvgPosPriceHintParam getAvgPosPriceHintParam() {
        return this.avgPosPriceHintParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getContentColor() {
        return this.contentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getHintText() {
        return this.hintText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTitleIsShowHint() {
        return this.titleIsShowHint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSecurityDeposit() {
        return this.isSecurityDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowPMEstimatedLiquidationPrice() {
        return this.isShowPMEstimatedLiquidationPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentColor(int i) {
        this.contentColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecurityDeposit(boolean z) {
        this.isSecurityDeposit = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowPMEstimatedLiquidationPrice(boolean z) {
        this.isShowPMEstimatedLiquidationPrice = z;
    }

    public PosShowItem(int i, @NotNull String str, @NotNull String str2, boolean z, Pair<String, String> pair, boolean z2, boolean z3, AvgPosPriceHintParam avgPosPriceHintParam, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.position = i;
        this.title = str;
        this.content = str2;
        this.titleIsShowHint = z;
        this.hintText = pair;
        this.isSecurityDeposit = z2;
        this.isShowPMEstimatedLiquidationPrice = z3;
        this.avgPosPriceHintParam = avgPosPriceHintParam;
        this.contentColor = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (r14v0 int)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r18v0 kotlin.Pair))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:com.okinc.trade.manager.common.position.AvgPosPriceHintParam:?: TERNARY null = ((wrap:int:0x0024: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.trade.manager.common.position.AvgPosPriceHintParam) : (r21v0 com.okinc.trade.manager.common.position.AvgPosPriceHintParam))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002c: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
 A[MD:(int, java.lang.String, java.lang.String, boolean, kotlin.Pair<java.lang.String, java.lang.String>, boolean, boolean, com.okinc.trade.manager.common.position.AvgPosPriceHintParam, int):void (m)] (LINE:542) call: com.okinc.trade.manager.common.position.PosShowItem.<init>(int, java.lang.String, java.lang.String, boolean, kotlin.Pair, boolean, boolean, com.okinc.trade.manager.common.position.AvgPosPriceHintParam, int):void type: THIS */
    public /* synthetic */ PosShowItem(int i, String str, String str2, boolean z, Pair pair, boolean z2, boolean z3, AvgPosPriceHintParam avgPosPriceHintParam, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? null : pair, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? null : avgPosPriceHintParam, (i3 & 256) != 0 ? 0 : i2);
    }
}
