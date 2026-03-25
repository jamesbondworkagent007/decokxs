package com.okinc.kline.data;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class LineStateBean {
    public static final int $stable = 8;
    private boolean alwaysShowStats;
    private String backgroundColor;
    private String backgroundColorBlk;
    private boolean bold;
    private String currencyId;
    private boolean extendLeft;
    private boolean extendRight;
    private int fontsize;
    private boolean frozen;
    private String horzLabelsAlign;
    private String interval;
    private IntervalsVisibilitiesBean intervalsVisibilities;
    private boolean italic;
    private int leftEnd;
    private String linecolor;
    private String linecolorBlk;
    private int linestyle;
    private int linewidth;
    private int rightEnd;
    private boolean showAngle;
    private boolean showBarsRange;
    private boolean showDateTimeRange;
    private boolean showDistance;
    private boolean showLabel;
    private boolean showMiddlePoint;
    private boolean showPriceLabels;
    private boolean showPriceRange;
    private int statsPosition;
    private String symbol;
    private int symbolStateVersion;
    private String text;
    private String textcolor;
    private String title;
    private String unitId;
    private String vertLabelsAlign;
    private boolean visible;
    private int zOrderVersion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LineStateBean() {
        this(null, null, 0, 0, false, false, 0, 0, false, null, null, null, 0, false, false, false, false, false, false, false, false, false, false, 0, 0, 0, false, false, null, null, null, null, null, null, null, null, null, -1, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.linecolor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.horzLabelsAlign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.vertLabelsAlign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.textcolor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.fontsize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.bold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.italic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.alwaysShowStats;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.showMiddlePoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.showPriceLabels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.showPriceRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.linecolorBlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.showBarsRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.showDateTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.showDistance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.showAngle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component24() {
        return this.statsPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component25() {
        return this.symbolStateVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component26() {
        return this.zOrderVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component27() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component28() {
        return this.frozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.linewidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.unitId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntervalsVisibilitiesBean component32() {
        return this.intervalsVisibilities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.backgroundColorBlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.linestyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.extendLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.extendRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.leftEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.rightEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.showLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LineStateBean copy(@NotNull String str, @NotNull String str2, int i, int i2, boolean z, boolean z2, int i3, int i4, boolean z3, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i5, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i6, int i7, int i8, boolean z14, boolean z15, @NotNull String str6, String str7, String str8, @NotNull IntervalsVisibilitiesBean intervalsVisibilitiesBean, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(intervalsVisibilitiesBean, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new LineStateBean(str, str2, i, i2, z, z2, i3, i4, z3, str3, str4, str5, i5, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, i6, i7, i8, z14, z15, str6, str7, str8, intervalsVisibilitiesBean, str9, str10, str11, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineStateBean)) {
            return false;
        }
        LineStateBean lineStateBean = (LineStateBean) obj;
        return Intrinsics.EZpvd((Object) this.linecolor, (Object) lineStateBean.linecolor) && Intrinsics.EZpvd((Object) this.linecolorBlk, (Object) lineStateBean.linecolorBlk) && this.linewidth == lineStateBean.linewidth && this.linestyle == lineStateBean.linestyle && this.extendLeft == lineStateBean.extendLeft && this.extendRight == lineStateBean.extendRight && this.leftEnd == lineStateBean.leftEnd && this.rightEnd == lineStateBean.rightEnd && this.showLabel == lineStateBean.showLabel && Intrinsics.EZpvd((Object) this.horzLabelsAlign, (Object) lineStateBean.horzLabelsAlign) && Intrinsics.EZpvd((Object) this.vertLabelsAlign, (Object) lineStateBean.vertLabelsAlign) && Intrinsics.EZpvd((Object) this.textcolor, (Object) lineStateBean.textcolor) && this.fontsize == lineStateBean.fontsize && this.bold == lineStateBean.bold && this.italic == lineStateBean.italic && this.alwaysShowStats == lineStateBean.alwaysShowStats && this.showMiddlePoint == lineStateBean.showMiddlePoint && this.showPriceLabels == lineStateBean.showPriceLabels && this.showPriceRange == lineStateBean.showPriceRange && this.showBarsRange == lineStateBean.showBarsRange && this.showDateTimeRange == lineStateBean.showDateTimeRange && this.showDistance == lineStateBean.showDistance && this.showAngle == lineStateBean.showAngle && this.statsPosition == lineStateBean.statsPosition && this.symbolStateVersion == lineStateBean.symbolStateVersion && this.zOrderVersion == lineStateBean.zOrderVersion && this.visible == lineStateBean.visible && this.frozen == lineStateBean.frozen && Intrinsics.EZpvd((Object) this.symbol, (Object) lineStateBean.symbol) && Intrinsics.EZpvd((Object) this.currencyId, (Object) lineStateBean.currencyId) && Intrinsics.EZpvd((Object) this.unitId, (Object) lineStateBean.unitId) && Intrinsics.EZpvd(this.intervalsVisibilities, lineStateBean.intervalsVisibilities) && Intrinsics.EZpvd((Object) this.title, (Object) lineStateBean.title) && Intrinsics.EZpvd((Object) this.text, (Object) lineStateBean.text) && Intrinsics.EZpvd((Object) this.interval, (Object) lineStateBean.interval) && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) lineStateBean.backgroundColor) && Intrinsics.EZpvd((Object) this.backgroundColorBlk, (Object) lineStateBean.backgroundColorBlk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAlwaysShowStats() {
        return this.alwaysShowStats;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundColorBlk() {
        return this.backgroundColorBlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBold() {
        return this.bold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExtendLeft() {
        return this.extendLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExtendRight() {
        return this.extendRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFontsize() {
        return this.fontsize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFrozen() {
        return this.frozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHorzLabelsAlign() {
        return this.horzLabelsAlign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterval() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntervalsVisibilitiesBean getIntervalsVisibilities() {
        return this.intervalsVisibilities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getItalic() {
        return this.italic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLeftEnd() {
        return this.leftEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinecolor() {
        return this.linecolor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinecolorBlk() {
        return this.linecolorBlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLinestyle() {
        return this.linestyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLinewidth() {
        return this.linewidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRightEnd() {
        return this.rightEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowAngle() {
        return this.showAngle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowBarsRange() {
        return this.showBarsRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowDateTimeRange() {
        return this.showDateTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowDistance() {
        return this.showDistance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowLabel() {
        return this.showLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowMiddlePoint() {
        return this.showMiddlePoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowPriceLabels() {
        return this.showPriceLabels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowPriceRange() {
        return this.showPriceRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatsPosition() {
        return this.statsPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSymbolStateVersion() {
        return this.symbolStateVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTextcolor() {
        return this.textcolor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnitId() {
        return this.unitId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVertLabelsAlign() {
        return this.vertLabelsAlign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getZOrderVersion() {
        return this.zOrderVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.linecolor.hashCode();
        int iHashCode2 = this.linecolorBlk.hashCode();
        int iHashCode3 = Integer.hashCode(this.linewidth);
        int iHashCode4 = Integer.hashCode(this.linestyle);
        int iHashCode5 = Boolean.hashCode(this.extendLeft);
        int iHashCode6 = Boolean.hashCode(this.extendRight);
        int iHashCode7 = Integer.hashCode(this.leftEnd);
        int iHashCode8 = Integer.hashCode(this.rightEnd);
        int iHashCode9 = Boolean.hashCode(this.showLabel);
        int iHashCode10 = this.horzLabelsAlign.hashCode();
        int iHashCode11 = this.vertLabelsAlign.hashCode();
        int iHashCode12 = this.textcolor.hashCode();
        int iHashCode13 = Integer.hashCode(this.fontsize);
        int iHashCode14 = Boolean.hashCode(this.bold);
        int iHashCode15 = Boolean.hashCode(this.italic);
        int iHashCode16 = Boolean.hashCode(this.alwaysShowStats);
        int iHashCode17 = Boolean.hashCode(this.showMiddlePoint);
        int iHashCode18 = Boolean.hashCode(this.showPriceLabels);
        int iHashCode19 = Boolean.hashCode(this.showPriceRange);
        int iHashCode20 = Boolean.hashCode(this.showBarsRange);
        int iHashCode21 = Boolean.hashCode(this.showDateTimeRange);
        int iHashCode22 = Boolean.hashCode(this.showDistance);
        int iHashCode23 = Boolean.hashCode(this.showAngle);
        int iHashCode24 = Integer.hashCode(this.statsPosition);
        int iHashCode25 = Integer.hashCode(this.symbolStateVersion);
        int iHashCode26 = Integer.hashCode(this.zOrderVersion);
        int iHashCode27 = Boolean.hashCode(this.visible);
        int iHashCode28 = Boolean.hashCode(this.frozen);
        int iHashCode29 = this.symbol.hashCode();
        String str = this.currencyId;
        int iHashCode30 = str == null ? 0 : str.hashCode();
        String str2 = this.unitId;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.intervalsVisibilities.hashCode()) * 31) + this.title.hashCode()) * 31) + this.text.hashCode()) * 31) + this.interval.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.backgroundColorBlk.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlwaysShowStats(boolean z) {
        this.alwaysShowStats = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackgroundColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.backgroundColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackgroundColorBlk(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.backgroundColorBlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBold(boolean z) {
        this.bold = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(String str) {
        this.currencyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtendLeft(boolean z) {
        this.extendLeft = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtendRight(boolean z) {
        this.extendRight = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFontsize(int i) {
        this.fontsize = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrozen(boolean z) {
        this.frozen = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHorzLabelsAlign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.horzLabelsAlign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterval(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.interval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntervalsVisibilities(@NotNull IntervalsVisibilitiesBean intervalsVisibilitiesBean) {
        Intrinsics.checkNotNullParameter(intervalsVisibilitiesBean, "");
        this.intervalsVisibilities = intervalsVisibilitiesBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItalic(boolean z) {
        this.italic = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftEnd(int i) {
        this.leftEnd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinecolor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.linecolor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinecolorBlk(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.linecolorBlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinestyle(int i) {
        this.linestyle = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinewidth(int i) {
        this.linewidth = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightEnd(int i) {
        this.rightEnd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowAngle(boolean z) {
        this.showAngle = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowBarsRange(boolean z) {
        this.showBarsRange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowDateTimeRange(boolean z) {
        this.showDateTimeRange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowDistance(boolean z) {
        this.showDistance = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowLabel(boolean z) {
        this.showLabel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowMiddlePoint(boolean z) {
        this.showMiddlePoint = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowPriceLabels(boolean z) {
        this.showPriceLabels = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowPriceRange(boolean z) {
        this.showPriceRange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatsPosition(int i) {
        this.statsPosition = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbolStateVersion(int i) {
        this.symbolStateVersion = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextcolor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.textcolor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnitId(String str) {
        this.unitId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVertLabelsAlign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.vertLabelsAlign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisible(boolean z) {
        this.visible = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setZOrderVersion(int i) {
        this.zOrderVersion = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LineStateBean(linecolor=" + this.linecolor + ", linecolorBlk=" + this.linecolorBlk + ", linewidth=" + this.linewidth + ", linestyle=" + this.linestyle + ", extendLeft=" + this.extendLeft + ", extendRight=" + this.extendRight + ", leftEnd=" + this.leftEnd + ", rightEnd=" + this.rightEnd + ", showLabel=" + this.showLabel + ", horzLabelsAlign=" + this.horzLabelsAlign + ", vertLabelsAlign=" + this.vertLabelsAlign + ", textcolor=" + this.textcolor + ", fontsize=" + this.fontsize + ", bold=" + this.bold + ", italic=" + this.italic + ", alwaysShowStats=" + this.alwaysShowStats + ", showMiddlePoint=" + this.showMiddlePoint + ", showPriceLabels=" + this.showPriceLabels + ", showPriceRange=" + this.showPriceRange + ", showBarsRange=" + this.showBarsRange + ", showDateTimeRange=" + this.showDateTimeRange + ", showDistance=" + this.showDistance + ", showAngle=" + this.showAngle + ", statsPosition=" + this.statsPosition + ", symbolStateVersion=" + this.symbolStateVersion + ", zOrderVersion=" + this.zOrderVersion + ", visible=" + this.visible + ", frozen=" + this.frozen + ", symbol=" + this.symbol + ", currencyId=" + this.currencyId + ", unitId=" + this.unitId + ", intervalsVisibilities=" + this.intervalsVisibilities + ", title=" + this.title + ", text=" + this.text + ", interval=" + this.interval + ", backgroundColor=" + this.backgroundColor + ", backgroundColorBlk=" + this.backgroundColorBlk + ")";
    }

    public LineStateBean(@NotNull String str, @NotNull String str2, int i, int i2, boolean z, boolean z2, int i3, int i4, boolean z3, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i5, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i6, int i7, int i8, boolean z14, boolean z15, @NotNull String str6, String str7, String str8, @NotNull IntervalsVisibilitiesBean intervalsVisibilitiesBean, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(intervalsVisibilitiesBean, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.linecolor = str;
        this.linecolorBlk = str2;
        this.linewidth = i;
        this.linestyle = i2;
        this.extendLeft = z;
        this.extendRight = z2;
        this.leftEnd = i3;
        this.rightEnd = i4;
        this.showLabel = z3;
        this.horzLabelsAlign = str3;
        this.vertLabelsAlign = str4;
        this.textcolor = str5;
        this.fontsize = i5;
        this.bold = z4;
        this.italic = z5;
        this.alwaysShowStats = z6;
        this.showMiddlePoint = z7;
        this.showPriceLabels = z8;
        this.showPriceRange = z9;
        this.showBarsRange = z10;
        this.showDateTimeRange = z11;
        this.showDistance = z12;
        this.showAngle = z13;
        this.statsPosition = i6;
        this.symbolStateVersion = i7;
        this.zOrderVersion = i8;
        this.visible = z14;
        this.frozen = z15;
        this.symbol = str6;
        this.currencyId = str7;
        this.unitId = str8;
        this.intervalsVisibilities = intervalsVisibilitiesBean;
        this.title = str9;
        this.text = str10;
        this.interval = str11;
        this.backgroundColor = str12;
        this.backgroundColorBlk = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01ef: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r75v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r75v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r75v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r40v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r75v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r75v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r42v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r75v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r43v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0034: ARITH (r75v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003c: ARITH (r75v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r45v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r75v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r46v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r75v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0050: SGET  A[WRAPPED] com.google.android.exoplayer2.text.ttml.TtmlNode.CENTER java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r75v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("bottom") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r75v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("#2962FF") : (r49v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0067: ARITH (r75v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (14 int) : (r50v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0070: ARITH (r75v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r51v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007a: ARITH (r75v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r52v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0085: ARITH (r75v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r53v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0090: ARITH (r75v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r54v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x009b: ARITH (r75v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r55v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r75v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r56v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r75v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? false : (r57v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r75v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r58v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r75v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? false : (r59v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r75v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? false : (r60v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r75v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r61v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r75v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r62v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r75v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) == (0 int)) ? (r63v0 int) : (2 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r75v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? true : (r64v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0109: ARITH (r75v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? true : (r65v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0114: ARITH (r75v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("BTC-USDT") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011f: ARITH (r75v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012a: ARITH (r75v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:com.okinc.kline.data.IntervalsVisibilitiesBean:?: TERNARY null = ((wrap:int:0x0135: ARITH (r75v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0170: CONSTRUCTOR 
  false
  false
  (0 int)
  (0 int)
  false
  (0 int)
  (0 int)
  false
  (0 int)
  (0 int)
  false
  (0 int)
  (0 int)
  false
  (0 int)
  (0 int)
  false
  (0 int)
  (0 int)
  false
  (1048575 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(boolean, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:92) call: com.okinc.kline.data.IntervalsVisibilitiesBean.<init>(boolean, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r69v0 com.okinc.kline.data.IntervalsVisibilitiesBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0176: ARITH (r76v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x017f: ARITH (r76v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0188: ARITH (r76v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("1W") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0191: ARITH (r76v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x019a: ARITH (r76v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, int, boolean, boolean, int, int, boolean, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.kline.data.IntervalsVisibilitiesBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:60) call: com.okinc.kline.data.LineStateBean.<init>(java.lang.String, java.lang.String, int, int, boolean, boolean, int, int, boolean, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.kline.data.IntervalsVisibilitiesBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LineStateBean(String str, String str2, int i, int i2, boolean z, boolean z2, int i3, int i4, boolean z3, String str3, String str4, String str5, int i5, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i6, int i7, int i8, boolean z14, boolean z15, String str6, String str7, String str8, IntervalsVisibilitiesBean intervalsVisibilitiesBean, String str9, String str10, String str11, String str12, String str13, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? 1 : i, (i9 & 8) != 0 ? 0 : i2, (i9 & 16) != 0 ? false : z, (i9 & 32) != 0 ? false : z2, (i9 & 64) != 0 ? 0 : i3, (i9 & 128) != 0 ? 0 : i4, (i9 & 256) != 0 ? false : z3, (i9 & 512) != 0 ? TtmlNode.CENTER : str3, (i9 & 1024) != 0 ? "bottom" : str4, (i9 & 2048) != 0 ? "#2962FF" : str5, (i9 & 4096) != 0 ? 14 : i5, (i9 & 8192) != 0 ? false : z4, (i9 & 16384) != 0 ? false : z5, (i9 & 32768) != 0 ? false : z6, (i9 & 65536) != 0 ? false : z7, (i9 & 131072) != 0 ? false : z8, (i9 & 262144) != 0 ? false : z9, (i9 & 524288) != 0 ? false : z10, (i9 & 1048576) != 0 ? false : z11, (i9 & 2097152) != 0 ? false : z12, (i9 & 4194304) != 0 ? false : z13, (i9 & 8388608) != 0 ? 2 : i6, (i9 & 16777216) != 0 ? 2 : i7, (i9 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0 ? i8 : 2, (i9 & 67108864) != 0 ? true : z14, (i9 & 134217728) != 0 ? true : z15, (i9 & 268435456) != 0 ? "BTC-USDT" : str6, (i9 & 536870912) != 0 ? "" : str7, (i9 & 1073741824) != 0 ? "" : str8, (i9 & Integer.MIN_VALUE) != 0 ? new IntervalsVisibilitiesBean(false, false, 0, 0, false, 0, 0, false, 0, 0, false, 0, 0, false, 0, 0, false, 0, 0, false, 1048575, null) : intervalsVisibilitiesBean, (i10 & 1) != 0 ? "" : str9, (i10 & 2) != 0 ? "" : str10, (i10 & 4) != 0 ? "1W" : str11, (i10 & 8) != 0 ? "" : str12, (i10 & 16) != 0 ? "" : str13);
    }
}
