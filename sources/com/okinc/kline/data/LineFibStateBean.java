package com.okinc.kline.data;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class LineFibStateBean {
    public static final int $stable = 8;
    private boolean coeffsAsPercents;
    private boolean extendLines;
    private boolean extendLinesLeft;
    private boolean fibLevelsBasedOnLogScale;
    private boolean fillBackground;
    private boolean frozen;
    private int labelFontSize;
    private List<? extends Object> level1;
    private List<? extends Object> level10;
    private List<? extends Object> level11;
    private List<? extends Object> level12;
    private List<? extends Object> level13;
    private List<? extends Object> level14;
    private List<? extends Object> level15;
    private List<? extends Object> level16;
    private List<? extends Object> level17;
    private List<? extends Object> level18;
    private List<? extends Object> level19;
    private List<? extends Object> level2;
    private List<? extends Object> level20;
    private List<? extends Object> level3;
    private List<? extends Object> level4;
    private List<? extends Object> level5;
    private List<? extends Object> level6;
    private List<? extends Object> level7;
    private List<? extends Object> level8;
    private List<? extends Object> level9;
    private String linecolor;
    private String linecolorBlk;
    private int linestyle;
    private int linewidth;
    private boolean reverse;
    private boolean showCoeffs;
    private boolean showPrices;
    private String symbol;
    private int transparency;
    private TrendlineBean trendline;
    private boolean visible;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LineFibStateBean() {
        this(null, null, 0, 0, false, false, null, false, false, false, 0, false, false, false, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.linecolor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.fillBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.transparency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.extendLines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.extendLinesLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.reverse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.coeffsAsPercents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.fibLevelsBasedOnLogScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.labelFontSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendlineBean component18() {
        return this.trendline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component19() {
        return this.level1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.linecolorBlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component20() {
        return this.level2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component21() {
        return this.level3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component22() {
        return this.level4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component23() {
        return this.level5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component24() {
        return this.level6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component25() {
        return this.level7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component26() {
        return this.level8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component27() {
        return this.level9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component28() {
        return this.level10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component29() {
        return this.level11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.linewidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component30() {
        return this.level12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component31() {
        return this.level13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component32() {
        return this.level14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component33() {
        return this.level15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component34() {
        return this.level16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component35() {
        return this.level17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component36() {
        return this.level18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component37() {
        return this.level19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component38() {
        return this.level20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.linestyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.frozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.showCoeffs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.showPrices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LineFibStateBean copy(@NotNull String str, @NotNull String str2, int i, int i2, boolean z, boolean z2, @NotNull String str3, boolean z3, boolean z4, boolean z5, int i3, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i4, @NotNull TrendlineBean trendlineBean, @NotNull List<? extends Object> list, @NotNull List<? extends Object> list2, @NotNull List<? extends Object> list3, @NotNull List<? extends Object> list4, @NotNull List<? extends Object> list5, @NotNull List<? extends Object> list6, @NotNull List<? extends Object> list7, @NotNull List<? extends Object> list8, @NotNull List<? extends Object> list9, @NotNull List<? extends Object> list10, @NotNull List<? extends Object> list11, @NotNull List<? extends Object> list12, @NotNull List<? extends Object> list13, @NotNull List<? extends Object> list14, @NotNull List<? extends Object> list15, @NotNull List<? extends Object> list16, @NotNull List<? extends Object> list17, @NotNull List<? extends Object> list18, @NotNull List<? extends Object> list19, @NotNull List<? extends Object> list20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(trendlineBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(list10, "");
        Intrinsics.checkNotNullParameter(list11, "");
        Intrinsics.checkNotNullParameter(list12, "");
        Intrinsics.checkNotNullParameter(list13, "");
        Intrinsics.checkNotNullParameter(list14, "");
        Intrinsics.checkNotNullParameter(list15, "");
        Intrinsics.checkNotNullParameter(list16, "");
        Intrinsics.checkNotNullParameter(list17, "");
        Intrinsics.checkNotNullParameter(list18, "");
        Intrinsics.checkNotNullParameter(list19, "");
        Intrinsics.checkNotNullParameter(list20, "");
        return new LineFibStateBean(str, str2, i, i2, z, z2, str3, z3, z4, z5, i3, z6, z7, z8, z9, z10, i4, trendlineBean, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16, list17, list18, list19, list20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineFibStateBean)) {
            return false;
        }
        LineFibStateBean lineFibStateBean = (LineFibStateBean) obj;
        return Intrinsics.EZpvd((Object) this.linecolor, (Object) lineFibStateBean.linecolor) && Intrinsics.EZpvd((Object) this.linecolorBlk, (Object) lineFibStateBean.linecolorBlk) && this.linewidth == lineFibStateBean.linewidth && this.linestyle == lineFibStateBean.linestyle && this.visible == lineFibStateBean.visible && this.frozen == lineFibStateBean.frozen && Intrinsics.EZpvd((Object) this.symbol, (Object) lineFibStateBean.symbol) && this.showCoeffs == lineFibStateBean.showCoeffs && this.showPrices == lineFibStateBean.showPrices && this.fillBackground == lineFibStateBean.fillBackground && this.transparency == lineFibStateBean.transparency && this.extendLines == lineFibStateBean.extendLines && this.extendLinesLeft == lineFibStateBean.extendLinesLeft && this.reverse == lineFibStateBean.reverse && this.coeffsAsPercents == lineFibStateBean.coeffsAsPercents && this.fibLevelsBasedOnLogScale == lineFibStateBean.fibLevelsBasedOnLogScale && this.labelFontSize == lineFibStateBean.labelFontSize && Intrinsics.EZpvd(this.trendline, lineFibStateBean.trendline) && Intrinsics.EZpvd(this.level1, lineFibStateBean.level1) && Intrinsics.EZpvd(this.level2, lineFibStateBean.level2) && Intrinsics.EZpvd(this.level3, lineFibStateBean.level3) && Intrinsics.EZpvd(this.level4, lineFibStateBean.level4) && Intrinsics.EZpvd(this.level5, lineFibStateBean.level5) && Intrinsics.EZpvd(this.level6, lineFibStateBean.level6) && Intrinsics.EZpvd(this.level7, lineFibStateBean.level7) && Intrinsics.EZpvd(this.level8, lineFibStateBean.level8) && Intrinsics.EZpvd(this.level9, lineFibStateBean.level9) && Intrinsics.EZpvd(this.level10, lineFibStateBean.level10) && Intrinsics.EZpvd(this.level11, lineFibStateBean.level11) && Intrinsics.EZpvd(this.level12, lineFibStateBean.level12) && Intrinsics.EZpvd(this.level13, lineFibStateBean.level13) && Intrinsics.EZpvd(this.level14, lineFibStateBean.level14) && Intrinsics.EZpvd(this.level15, lineFibStateBean.level15) && Intrinsics.EZpvd(this.level16, lineFibStateBean.level16) && Intrinsics.EZpvd(this.level17, lineFibStateBean.level17) && Intrinsics.EZpvd(this.level18, lineFibStateBean.level18) && Intrinsics.EZpvd(this.level19, lineFibStateBean.level19) && Intrinsics.EZpvd(this.level20, lineFibStateBean.level20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCoeffsAsPercents() {
        return this.coeffsAsPercents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExtendLines() {
        return this.extendLines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExtendLinesLeft() {
        return this.extendLinesLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFibLevelsBasedOnLogScale() {
        return this.fibLevelsBasedOnLogScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFillBackground() {
        return this.fillBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFrozen() {
        return this.frozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLabelFontSize() {
        return this.labelFontSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel1() {
        return this.level1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel10() {
        return this.level10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel11() {
        return this.level11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel12() {
        return this.level12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel13() {
        return this.level13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel14() {
        return this.level14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel15() {
        return this.level15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel16() {
        return this.level16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel17() {
        return this.level17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel18() {
        return this.level18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel19() {
        return this.level19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel2() {
        return this.level2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel20() {
        return this.level20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel3() {
        return this.level3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel4() {
        return this.level4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel5() {
        return this.level5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel6() {
        return this.level6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel7() {
        return this.level7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel8() {
        return this.level8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getLevel9() {
        return this.level9;
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
    public final boolean getReverse() {
        return this.reverse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowCoeffs() {
        return this.showCoeffs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowPrices() {
        return this.showPrices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransparency() {
        return this.transparency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendlineBean getTrendline() {
        return this.trendline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.linecolor.hashCode() * 31) + this.linecolorBlk.hashCode()) * 31) + Integer.hashCode(this.linewidth)) * 31) + Integer.hashCode(this.linestyle)) * 31) + Boolean.hashCode(this.visible)) * 31) + Boolean.hashCode(this.frozen)) * 31) + this.symbol.hashCode()) * 31) + Boolean.hashCode(this.showCoeffs)) * 31) + Boolean.hashCode(this.showPrices)) * 31) + Boolean.hashCode(this.fillBackground)) * 31) + Integer.hashCode(this.transparency)) * 31) + Boolean.hashCode(this.extendLines)) * 31) + Boolean.hashCode(this.extendLinesLeft)) * 31) + Boolean.hashCode(this.reverse)) * 31) + Boolean.hashCode(this.coeffsAsPercents)) * 31) + Boolean.hashCode(this.fibLevelsBasedOnLogScale)) * 31) + Integer.hashCode(this.labelFontSize)) * 31) + this.trendline.hashCode()) * 31) + this.level1.hashCode()) * 31) + this.level2.hashCode()) * 31) + this.level3.hashCode()) * 31) + this.level4.hashCode()) * 31) + this.level5.hashCode()) * 31) + this.level6.hashCode()) * 31) + this.level7.hashCode()) * 31) + this.level8.hashCode()) * 31) + this.level9.hashCode()) * 31) + this.level10.hashCode()) * 31) + this.level11.hashCode()) * 31) + this.level12.hashCode()) * 31) + this.level13.hashCode()) * 31) + this.level14.hashCode()) * 31) + this.level15.hashCode()) * 31) + this.level16.hashCode()) * 31) + this.level17.hashCode()) * 31) + this.level18.hashCode()) * 31) + this.level19.hashCode()) * 31) + this.level20.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoeffsAsPercents(boolean z) {
        this.coeffsAsPercents = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtendLines(boolean z) {
        this.extendLines = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtendLinesLeft(boolean z) {
        this.extendLinesLeft = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFibLevelsBasedOnLogScale(boolean z) {
        this.fibLevelsBasedOnLogScale = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillBackground(boolean z) {
        this.fillBackground = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrozen(boolean z) {
        this.frozen = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLabelFontSize(int i) {
        this.labelFontSize = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel1(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level1 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel10(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level10 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel11(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level11 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel12(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level12 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel13(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level13 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel14(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level14 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel15(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level15 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel16(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level16 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel17(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level17 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel18(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level18 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel19(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level19 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel2(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level2 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel20(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level20 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel3(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level3 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel4(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level4 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel5(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level5 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel6(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level6 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel7(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level7 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel8(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level8 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel9(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.level9 = list;
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
    public final void setReverse(boolean z) {
        this.reverse = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCoeffs(boolean z) {
        this.showCoeffs = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowPrices(boolean z) {
        this.showPrices = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransparency(int i) {
        this.transparency = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrendline(@NotNull TrendlineBean trendlineBean) {
        Intrinsics.checkNotNullParameter(trendlineBean, "");
        this.trendline = trendlineBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisible(boolean z) {
        this.visible = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LineFibStateBean(linecolor=" + this.linecolor + ", linecolorBlk=" + this.linecolorBlk + ", linewidth=" + this.linewidth + ", linestyle=" + this.linestyle + ", visible=" + this.visible + ", frozen=" + this.frozen + ", symbol=" + this.symbol + ", showCoeffs=" + this.showCoeffs + ", showPrices=" + this.showPrices + ", fillBackground=" + this.fillBackground + ", transparency=" + this.transparency + ", extendLines=" + this.extendLines + ", extendLinesLeft=" + this.extendLinesLeft + ", reverse=" + this.reverse + ", coeffsAsPercents=" + this.coeffsAsPercents + ", fibLevelsBasedOnLogScale=" + this.fibLevelsBasedOnLogScale + ", labelFontSize=" + this.labelFontSize + ", trendline=" + this.trendline + ", level1=" + this.level1 + ", level2=" + this.level2 + ", level3=" + this.level3 + ", level4=" + this.level4 + ", level5=" + this.level5 + ", level6=" + this.level6 + ", level7=" + this.level7 + ", level8=" + this.level8 + ", level9=" + this.level9 + ", level10=" + this.level10 + ", level11=" + this.level11 + ", level12=" + this.level12 + ", level13=" + this.level13 + ", level14=" + this.level14 + ", level15=" + this.level15 + ", level16=" + this.level16 + ", level17=" + this.level17 + ", level18=" + this.level18 + ", level19=" + this.level19 + ", level20=" + this.level20 + ")";
    }

    public LineFibStateBean(@NotNull String str, @NotNull String str2, int i, int i2, boolean z, boolean z2, @NotNull String str3, boolean z3, boolean z4, boolean z5, int i3, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i4, @NotNull TrendlineBean trendlineBean, @NotNull List<? extends Object> list, @NotNull List<? extends Object> list2, @NotNull List<? extends Object> list3, @NotNull List<? extends Object> list4, @NotNull List<? extends Object> list5, @NotNull List<? extends Object> list6, @NotNull List<? extends Object> list7, @NotNull List<? extends Object> list8, @NotNull List<? extends Object> list9, @NotNull List<? extends Object> list10, @NotNull List<? extends Object> list11, @NotNull List<? extends Object> list12, @NotNull List<? extends Object> list13, @NotNull List<? extends Object> list14, @NotNull List<? extends Object> list15, @NotNull List<? extends Object> list16, @NotNull List<? extends Object> list17, @NotNull List<? extends Object> list18, @NotNull List<? extends Object> list19, @NotNull List<? extends Object> list20) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(trendlineBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(list10, "");
        Intrinsics.checkNotNullParameter(list11, "");
        Intrinsics.checkNotNullParameter(list12, "");
        Intrinsics.checkNotNullParameter(list13, "");
        Intrinsics.checkNotNullParameter(list14, "");
        Intrinsics.checkNotNullParameter(list15, "");
        Intrinsics.checkNotNullParameter(list16, "");
        Intrinsics.checkNotNullParameter(list17, "");
        Intrinsics.checkNotNullParameter(list18, "");
        Intrinsics.checkNotNullParameter(list19, "");
        Intrinsics.checkNotNullParameter(list20, "");
        this.linecolor = str;
        this.linecolorBlk = str2;
        this.linewidth = i;
        this.linestyle = i2;
        this.visible = z;
        this.frozen = z2;
        this.symbol = str3;
        this.showCoeffs = z3;
        this.showPrices = z4;
        this.fillBackground = z5;
        this.transparency = i3;
        this.extendLines = z6;
        this.extendLinesLeft = z7;
        this.reverse = z8;
        this.coeffsAsPercents = z9;
        this.fibLevelsBasedOnLogScale = z10;
        this.labelFontSize = i4;
        this.trendline = trendlineBean;
        this.level1 = list;
        this.level2 = list2;
        this.level3 = list3;
        this.level4 = list4;
        this.level5 = list5;
        this.level6 = list6;
        this.level7 = list7;
        this.level8 = list8;
        this.level9 = list9;
        this.level10 = list10;
        this.level11 = list11;
        this.level12 = list12;
        this.level13 = list13;
        this.level14 = list14;
        this.level15 = list15;
        this.level16 = list16;
        this.level17 = list17;
        this.level18 = list18;
        this.level19 = list19;
        this.level20 = list20;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0202: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r77v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r77v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r40v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r77v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r41v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r77v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r42v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r77v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r43v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r77v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r44v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r77v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("BTC-USDT") : (r45v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r77v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r46v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r77v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r47v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r77v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r48v0 boolean) : true)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0054: ARITH (r77v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (80 int) : (r49v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r77v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r50v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0065: ARITH (r77v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r51v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006d: ARITH (r77v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r52v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0075: ARITH (r77v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r53v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0080: ARITH (r77v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r54v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008b: ARITH (r77v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (12 int) : (r55v0 int))
  (wrap:com.okinc.kline.data.TrendlineBean:?: TERNARY null = ((wrap:int:0x0096: ARITH (r77v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b6: CONSTRUCTOR (null java.lang.String), (0 int), (0 int), false, (15 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.String, int, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:119) call: com.okinc.kline.data.TrendlineBean.<init>(java.lang.String, int, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r56v0 com.okinc.kline.data.TrendlineBean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00be: ARITH (r77v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c2: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:120)) : (r57v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00cb: ARITH (r77v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00cf: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:121)) : (r58v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00d8: ARITH (r77v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00dc: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:122)) : (r59v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r77v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00e9: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:123)) : (r60v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r77v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00f6: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:124)) : (r61v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00ff: ARITH (r77v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0103: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:125)) : (r62v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x010c: ARITH (r77v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0110: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:126)) : (r63v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0119: ARITH (r77v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x011d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:127)) : (r64v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0126: ARITH (r77v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x012a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:128)) : (r65v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0133: ARITH (r77v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0137: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:129)) : (r66v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0140: ARITH (r77v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0144: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:130)) : (r67v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x014d: ARITH (r77v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0151: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:131)) : (r68v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x015a: ARITH (r77v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x015e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:132)) : (r69v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0167: ARITH (r77v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x016b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:133)) : (r70v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0172: ARITH (r78v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0176: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:134)) : (r71v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x017d: ARITH (r78v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0181: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:135)) : (r72v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0188: ARITH (r78v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x018c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:136)) : (r73v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0193: ARITH (r78v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0197: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:137)) : (r74v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x019e: ARITH (r78v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01a2: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:138)) : (r75v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x01a9: ARITH (r78v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01ad: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:139)) : (r76v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, int, int, boolean, boolean, java.lang.String, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean, boolean, int, com.okinc.kline.data.TrendlineBean, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>, java.util.List<? extends java.lang.Object>):void (m)] (LINE:101) call: com.okinc.kline.data.LineFibStateBean.<init>(java.lang.String, java.lang.String, int, int, boolean, boolean, java.lang.String, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean, boolean, int, com.okinc.kline.data.TrendlineBean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ LineFibStateBean(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, boolean z4, boolean z5, int i3, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i4, TrendlineBean trendlineBean, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) == 0 ? str2 : "", (i5 & 4) != 0 ? 1 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? true : z, (i5 & 32) != 0 ? false : z2, (i5 & 64) != 0 ? "BTC-USDT" : str3, (i5 & 128) != 0 ? true : z3, (i5 & 256) != 0 ? true : z4, (i5 & 512) == 0 ? z5 : true, (i5 & 1024) != 0 ? 80 : i3, (i5 & 2048) != 0 ? false : z6, (i5 & 4096) != 0 ? false : z7, (i5 & 8192) != 0 ? false : z8, (i5 & 16384) != 0 ? false : z9, (i5 & 32768) != 0 ? false : z10, (i5 & 65536) != 0 ? 12 : i4, (i5 & 131072) != 0 ? new TrendlineBean(null, 0, 0, false, 15, null) : trendlineBean, (i5 & 262144) != 0 ? yDY.AhwBna() : list, (i5 & 524288) != 0 ? yDY.AhwBna() : list2, (i5 & 1048576) != 0 ? yDY.AhwBna() : list3, (i5 & 2097152) != 0 ? yDY.AhwBna() : list4, (i5 & 4194304) != 0 ? yDY.AhwBna() : list5, (i5 & 8388608) != 0 ? yDY.AhwBna() : list6, (i5 & 16777216) != 0 ? yDY.AhwBna() : list7, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? yDY.AhwBna() : list8, (i5 & 67108864) != 0 ? yDY.AhwBna() : list9, (i5 & 134217728) != 0 ? yDY.AhwBna() : list10, (i5 & 268435456) != 0 ? yDY.AhwBna() : list11, (i5 & 536870912) != 0 ? yDY.AhwBna() : list12, (i5 & 1073741824) != 0 ? yDY.AhwBna() : list13, (i5 & Integer.MIN_VALUE) != 0 ? yDY.AhwBna() : list14, (i6 & 1) != 0 ? yDY.AhwBna() : list15, (i6 & 2) != 0 ? yDY.AhwBna() : list16, (i6 & 4) != 0 ? yDY.AhwBna() : list17, (i6 & 8) != 0 ? yDY.AhwBna() : list18, (i6 & 16) != 0 ? yDY.AhwBna() : list19, (i6 & 32) != 0 ? yDY.AhwBna() : list20);
    }
}
