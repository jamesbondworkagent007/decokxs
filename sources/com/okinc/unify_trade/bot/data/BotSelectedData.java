package com.okinc.unify_trade.bot.data;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import com.okinc.unify_trade.biz.CategoryTag;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BotSelectedData {
    public static final int $stable = 8;
    private final String botDesc;
    private final int botDescColor;
    private final int botIconRes;
    private final String botName;
    private final String botType;
    private String botUserCount;
    private Boolean isCopyTradeRole;
    private final boolean isDescSeparator;
    private Boolean isSelected;
    private List<CategoryTag> tags;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.botDescColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.botIconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.botName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.botDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.botUserCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.isCopyTradeRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CategoryTag> component8() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isDescSeparator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotSelectedData copy(@NotNull String str, @DrawableRes int i, @NotNull String str2, @NotNull String str3, String str4, Boolean bool, Boolean bool2, List<CategoryTag> list, boolean z, @ColorRes int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BotSelectedData(str, i, str2, str3, str4, bool, bool2, list, z, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotSelectedData)) {
            return false;
        }
        BotSelectedData botSelectedData = (BotSelectedData) obj;
        return Intrinsics.EZpvd((Object) this.botType, (Object) botSelectedData.botType) && this.botIconRes == botSelectedData.botIconRes && Intrinsics.EZpvd((Object) this.botName, (Object) botSelectedData.botName) && Intrinsics.EZpvd((Object) this.botDesc, (Object) botSelectedData.botDesc) && Intrinsics.EZpvd((Object) this.botUserCount, (Object) botSelectedData.botUserCount) && Intrinsics.EZpvd(this.isSelected, botSelectedData.isSelected) && Intrinsics.EZpvd(this.isCopyTradeRole, botSelectedData.isCopyTradeRole) && Intrinsics.EZpvd(this.tags, botSelectedData.tags) && this.isDescSeparator == botSelectedData.isDescSeparator && this.botDescColor == botSelectedData.botDescColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotDesc() {
        return this.botDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBotDescColor() {
        return this.botDescColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBotIconRes() {
        return this.botIconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotName() {
        return this.botName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotType() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotUserCount() {
        return this.botUserCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CategoryTag> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.botType.hashCode();
        int iHashCode2 = Integer.hashCode(this.botIconRes);
        int iHashCode3 = this.botName.hashCode();
        int iHashCode4 = this.botDesc.hashCode();
        String str = this.botUserCount;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Boolean bool = this.isSelected;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isCopyTradeRole;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        List<CategoryTag> list = this.tags;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list != null ? list.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDescSeparator)) * 31) + Integer.hashCode(this.botDescColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isCopyTradeRole() {
        return this.isCopyTradeRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDescSeparator() {
        return this.isDescSeparator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotUserCount(String str) {
        this.botUserCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCopyTradeRole(Boolean bool) {
        this.isCopyTradeRole = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(Boolean bool) {
        this.isSelected = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTags(List<CategoryTag> list) {
        this.tags = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotSelectedData(botType=" + this.botType + ", botIconRes=" + this.botIconRes + ", botName=" + this.botName + ", botDesc=" + this.botDesc + ", botUserCount=" + this.botUserCount + ", isSelected=" + this.isSelected + ", isCopyTradeRole=" + this.isCopyTradeRole + ", tags=" + this.tags + ", isDescSeparator=" + this.isDescSeparator + ", botDescColor=" + this.botDescColor + ")";
    }

    public BotSelectedData(@NotNull String str, @DrawableRes int i, @NotNull String str2, @NotNull String str3, String str4, Boolean bool, Boolean bool2, List<CategoryTag> list, boolean z, @ColorRes int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.botType = str;
        this.botIconRes = i;
        this.botName = str2;
        this.botDesc = str3;
        this.botUserCount = str4;
        this.isSelected = bool;
        this.isCopyTradeRole = bool2;
        this.tags = list;
        this.isDescSeparator = z;
        this.botDescColor = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003f: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 int)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r23v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002e: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r24v0 int))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List<com.okinc.unify_trade.biz.CategoryTag>, boolean, int):void (m)] (LINE:936) call: com.okinc.unify_trade.bot.data.BotSelectedData.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List, boolean, int):void type: THIS */
    public /* synthetic */ BotSelectedData(String str, int i, String str2, String str3, String str4, Boolean bool, Boolean bool2, List list, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : bool, (i3 & 64) != 0 ? Boolean.FALSE : bool2, (i3 & 128) != 0 ? null : list, (i3 & 256) != 0 ? true : z, (i3 & 512) != 0 ? -1 : i2);
    }
}
