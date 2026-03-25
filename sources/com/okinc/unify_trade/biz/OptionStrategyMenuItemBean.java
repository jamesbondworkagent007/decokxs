package com.okinc.unify_trade.biz;

import com.okinc.biz.OptionStrategyType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class OptionStrategyMenuItemBean {
    public static final int $stable = 8;
    private String description;
    private final int icon;
    private final int index;
    private Boolean isSelect;
    private String tagText;
    private int tagUrl;
    private String title;
    private OptionStrategyType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OptionStrategyMenuItemBean() {
        this(null, null, 0, null, 0, null, null, 0, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagText() {
        return this.tagText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTagUrl() {
        return this.tagUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionStrategyType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.description = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(Boolean bool) {
        this.isSelect = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTagText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tagText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTagUrl(int i) {
        this.tagUrl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull OptionStrategyType optionStrategyType) {
        Intrinsics.checkNotNullParameter(optionStrategyType, "");
        this.type = optionStrategyType;
    }

    public OptionStrategyMenuItemBean(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, int i2, @NotNull OptionStrategyType optionStrategyType, Boolean bool, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(optionStrategyType, "");
        this.title = str;
        this.description = str2;
        this.tagUrl = i;
        this.tagText = str3;
        this.icon = i2;
        this.type = optionStrategyType;
        this.isSelect = bool;
        this.index = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:com.okinc.biz.OptionStrategyType:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] (LINE:85) com.okinc.biz.OptionStrategyType.DEFAULT_OPTION_STRATEGY com.okinc.biz.OptionStrategyType) : (r15v0 com.okinc.biz.OptionStrategyType))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0038: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 int) : (0 int))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, int, com.okinc.biz.OptionStrategyType, java.lang.Boolean, int):void (m)] (LINE:79) call: com.okinc.unify_trade.biz.OptionStrategyMenuItemBean.<init>(java.lang.String, java.lang.String, int, java.lang.String, int, com.okinc.biz.OptionStrategyType, java.lang.Boolean, int):void type: THIS */
    public /* synthetic */ OptionStrategyMenuItemBean(String str, String str2, int i, String str3, int i2, OptionStrategyType optionStrategyType, Boolean bool, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) == 0 ? str3 : "", (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? OptionStrategyType.DEFAULT_OPTION_STRATEGY : optionStrategyType, (i4 & 64) != 0 ? Boolean.FALSE : bool, (i4 & 128) == 0 ? i3 : 0);
    }
}
