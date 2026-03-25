package com.okinc.unify_trade.bot.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ExpandableGridDealRecordItemData {
    public static final int $stable = 8;
    private final List<TransDetailsData> details;
    private final String groupId;
    private final boolean isExpanded;
    private final String pnlText;
    private final Integer pnlTextColor;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.unify_trade.bot.data.ExpandableGridDealRecordItemData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpandableGridDealRecordItemData copy$default(ExpandableGridDealRecordItemData expandableGridDealRecordItemData, String str, String str2, Integer num, String str3, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = expandableGridDealRecordItemData.title;
        }
        if ((i & 2) != 0) {
            str2 = expandableGridDealRecordItemData.pnlText;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            num = expandableGridDealRecordItemData.pnlTextColor;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = expandableGridDealRecordItemData.groupId;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            z = expandableGridDealRecordItemData.isExpanded;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            list = expandableGridDealRecordItemData.details;
        }
        return expandableGridDealRecordItemData.copy(str, str4, num2, str5, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pnlText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.pnlTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isExpanded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransDetailsData> component6() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExpandableGridDealRecordItemData copy(@NotNull String str, @NotNull String str2, Integer num, @NotNull String str3, boolean z, @NotNull List<? extends TransDetailsData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ExpandableGridDealRecordItemData(str, str2, num, str3, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandableGridDealRecordItemData)) {
            return false;
        }
        ExpandableGridDealRecordItemData expandableGridDealRecordItemData = (ExpandableGridDealRecordItemData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) expandableGridDealRecordItemData.title) && Intrinsics.EZpvd((Object) this.pnlText, (Object) expandableGridDealRecordItemData.pnlText) && Intrinsics.EZpvd(this.pnlTextColor, expandableGridDealRecordItemData.pnlTextColor) && Intrinsics.EZpvd((Object) this.groupId, (Object) expandableGridDealRecordItemData.groupId) && this.isExpanded == expandableGridDealRecordItemData.isExpanded && Intrinsics.EZpvd(this.details, expandableGridDealRecordItemData.details);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransDetailsData> getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlText() {
        return this.pnlText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPnlTextColor() {
        return this.pnlTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.pnlText.hashCode();
        Integer num = this.pnlTextColor;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.groupId.hashCode()) * 31) + Boolean.hashCode(this.isExpanded)) * 31) + this.details.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isExpanded() {
        return this.isExpanded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExpandableGridDealRecordItemData(title=" + this.title + ", pnlText=" + this.pnlText + ", pnlTextColor=" + this.pnlTextColor + ", groupId=" + this.groupId + ", isExpanded=" + this.isExpanded + ", details=" + this.details + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.okinc.unify_trade.bot.data.TransDetailsData> */
    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableGridDealRecordItemData(@NotNull String str, @NotNull String str2, Integer num, @NotNull String str3, boolean z, @NotNull List<? extends TransDetailsData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.pnlText = str2;
        this.pnlTextColor = num;
        this.groupId = str3;
        this.isExpanded = z;
        this.details = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:java.lang.Integer:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.String:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:boolean:0x0012: TERNARY null = ((wrap:int:0x000d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0017: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1177)) : (r13v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, boolean, java.util.List<? extends com.okinc.unify_trade.bot.data.TransDetailsData>):void (m)] (LINE:1171) call: com.okinc.unify_trade.bot.data.ExpandableGridDealRecordItemData.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ ExpandableGridDealRecordItemData(String str, String str2, Integer num, String str3, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? yDY.AhwBna() : list);
    }
}
