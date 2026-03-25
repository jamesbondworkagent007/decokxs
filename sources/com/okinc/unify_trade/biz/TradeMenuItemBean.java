package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeMenuItemBean {
    public static final int HEADER_TYPE_ADVANCED = 1;
    public static final int HEADER_TYPE_BASIC = 0;
    private final boolean canSelect;
    private Object data;
    private String description;
    private boolean enable;
    private final int headerType;
    private final Integer icon;
    private Object imageInfo;
    private final int index;
    private boolean isSelect;
    private boolean isShowDivide;
    private String key;
    private final String noSelectHint;
    private String title;
    private int type;
    private String typeTitle;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeMenuItemBean() {
        this(null, false, null, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanSelect() {
        return this.canSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHeaderType() {
        return this.headerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getImageInfo() {
        return this.imageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNoSelectHint() {
        return this.noSelectHint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeTitle() {
        return this.typeTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowDivide() {
        return this.isShowDivide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(Object obj) {
        this.data = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.description = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnable(boolean z) {
        this.enable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageInfo(Object obj) {
        this.imageInfo = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.key = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowDivide(boolean z) {
        this.isShowDivide = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTypeTitle(String str) {
        this.typeTitle = str;
    }

    public TradeMenuItemBean(@NotNull String str, boolean z, Object obj, @NotNull String str2, boolean z2, @NotNull String str3, String str4, int i, boolean z3, Integer num, int i2, boolean z4, int i3, @NotNull String str5, Object obj2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.title = str;
        this.isSelect = z;
        this.data = obj;
        this.noSelectHint = str2;
        this.enable = z2;
        this.description = str3;
        this.typeTitle = str4;
        this.type = i;
        this.isShowDivide = z3;
        this.icon = num;
        this.headerType = i2;
        this.canSelect = z4;
        this.index = i3;
        this.key = str5;
        this.imageInfo = obj2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0015: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r19v0 java.lang.Object))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r32v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004e: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r26v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0056: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005e: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r28v0 boolean) : true)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r29v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("last") : (r30v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0075: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.Object) : (null java.lang.Object))
 A[MD:(java.lang.String, boolean, java.lang.Object, java.lang.String, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.Integer, int, boolean, int, java.lang.String, java.lang.Object):void (m)] (LINE:54) call: com.okinc.unify_trade.biz.TradeMenuItemBean.<init>(java.lang.String, boolean, java.lang.Object, java.lang.String, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.Integer, int, boolean, int, java.lang.String, java.lang.Object):void type: THIS */
    public /* synthetic */ TradeMenuItemBean(String str, boolean z, Object obj, String str2, boolean z2, String str3, String str4, int i, boolean z3, Integer num, int i2, boolean z4, int i3, String str5, Object obj2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? null : obj, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? true : z2, (i4 & 32) != 0 ? "" : str3, (i4 & 64) == 0 ? str4 : "", (i4 & 128) != 0 ? 0 : i, (i4 & 256) != 0 ? false : z3, (i4 & 512) != 0 ? null : num, (i4 & 1024) != 0 ? 0 : i2, (i4 & 2048) == 0 ? z4 : true, (i4 & 4096) == 0 ? i3 : 0, (i4 & 8192) != 0 ? "last" : str5, (i4 & 16384) == 0 ? obj2 : null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeMenuItemBean.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
