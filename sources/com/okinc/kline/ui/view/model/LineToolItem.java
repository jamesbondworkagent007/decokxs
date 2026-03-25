package com.okinc.kline.ui.view.model;

import com.okinc.kline.library.drawline.DrawLineData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LineToolItem {
    public static final int $stable = 8;
    private DrawLineData.LineType id;
    private boolean isSelect;
    private Integer toolImg;
    private String toolName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LineToolItem() {
        this(null, false, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LineToolItem copy$default(LineToolItem lineToolItem, String str, boolean z, Integer num, DrawLineData.LineType lineType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lineToolItem.toolName;
        }
        if ((i & 2) != 0) {
            z = lineToolItem.isSelect;
        }
        if ((i & 4) != 0) {
            num = lineToolItem.toolImg;
        }
        if ((i & 8) != 0) {
            lineType = lineToolItem.id;
        }
        return lineToolItem.copy(str, z, num, lineType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.toolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.toolImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DrawLineData.LineType component4() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LineToolItem copy(@NotNull String str, boolean z, Integer num, @NotNull DrawLineData.LineType lineType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lineType, "");
        return new LineToolItem(str, z, num, lineType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineToolItem)) {
            return false;
        }
        LineToolItem lineToolItem = (LineToolItem) obj;
        return Intrinsics.EZpvd((Object) this.toolName, (Object) lineToolItem.toolName) && this.isSelect == lineToolItem.isSelect && Intrinsics.EZpvd(this.toolImg, lineToolItem.toolImg) && this.id == lineToolItem.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DrawLineData.LineType getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getToolImg() {
        return this.toolImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToolName() {
        return this.toolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.toolName.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isSelect);
        Integer num = this.toolImg;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.id.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull DrawLineData.LineType lineType) {
        Intrinsics.checkNotNullParameter(lineType, "");
        this.id = lineType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToolImg(Integer num) {
        this.toolImg = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToolName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toolName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LineToolItem(toolName=" + this.toolName + ", isSelect=" + this.isSelect + ", toolImg=" + this.toolImg + ", id=" + this.id + ")";
    }

    public LineToolItem(@NotNull String str, boolean z, Integer num, @NotNull DrawLineData.LineType lineType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lineType, "");
        this.toolName = str;
        this.isSelect = z;
        this.toolImg = num;
        this.id = lineType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:com.okinc.kline.library.drawline.DrawLineData$LineType:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.kline.library.drawline.DrawLineData$LineType:0x0014: SGET  A[WRAPPED] (LINE:17) com.okinc.kline.library.drawline.DrawLineData.LineType.H_SEGMENT com.okinc.kline.library.drawline.DrawLineData$LineType) : (r4v0 com.okinc.kline.library.drawline.DrawLineData$LineType))
 A[MD:(java.lang.String, boolean, java.lang.Integer, com.okinc.kline.library.drawline.DrawLineData$LineType):void (m)] (LINE:17) call: com.okinc.kline.ui.view.model.LineToolItem.<init>(java.lang.String, boolean, java.lang.Integer, com.okinc.kline.library.drawline.DrawLineData$LineType):void type: THIS */
    public /* synthetic */ LineToolItem(String str, boolean z, Integer num, DrawLineData.LineType lineType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? DrawLineData.LineType.H_SEGMENT : lineType);
    }
}
