package com.okinc.trade.manager.common.position;

import com.okinc.trade.manager.common.position.TradeHisPositionManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class HisPosShowItem {
    public static final int $stable = 8;
    private String clickEventType;
    private int colorType;
    private final String content;
    private final TradeHisPositionManager.HisPositionItem data;
    private final int position;
    private Boolean showUnderLine;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClickEventType() {
        return this.clickEventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getColorType() {
        return this.colorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeHisPositionManager.HisPositionItem getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowUnderLine() {
        return this.showUnderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickEventType(String str) {
        this.clickEventType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColorType(int i) {
        this.colorType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowUnderLine(Boolean bool) {
        this.showUnderLine = bool;
    }

    public HisPosShowItem(int i, @NotNull String str, @NotNull String str2, int i2, Boolean bool, TradeHisPositionManager.HisPositionItem hisPositionItem, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.position = i;
        this.title = str;
        this.content = str2;
        this.colorType = i2;
        this.showUnderLine = bool;
        this.data = hisPositionItem;
        this.clickEventType = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (r10v0 int)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:com.okinc.trade.manager.common.position.TradeHisPositionManager$HisPositionItem:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.trade.manager.common.position.TradeHisPositionManager$HisPositionItem) : (r15v0 com.okinc.trade.manager.common.position.TradeHisPositionManager$HisPositionItem))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, int, java.lang.Boolean, com.okinc.trade.manager.common.position.TradeHisPositionManager$HisPositionItem, java.lang.String):void (m)] (LINE:61) call: com.okinc.trade.manager.common.position.HisPosShowItem.<init>(int, java.lang.String, java.lang.String, int, java.lang.Boolean, com.okinc.trade.manager.common.position.TradeHisPositionManager$HisPositionItem, java.lang.String):void type: THIS */
    public /* synthetic */ HisPosShowItem(int i, String str, String str2, int i2, Boolean bool, TradeHisPositionManager.HisPositionItem hisPositionItem, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? Boolean.FALSE : bool, (i3 & 32) != 0 ? null : hisPositionItem, (i3 & 64) != 0 ? null : str3);
    }
}
