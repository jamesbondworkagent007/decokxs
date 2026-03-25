package com.okinc.kline.library.drawline;

import android.text.TextUtils;
import androidx.camera.video.AudioStats;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.library.drawline.DrawLineData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC58247yxg;
import o.C36246oUr;
import o.C37897pEt;
import o.C56444yFp;
import o.C58266yxz;
import o.InterfaceC56445yFq;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.oUJ;
import o.yBP;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawLineData {
    public static DrawLineItem DbNXlk;
    public static int djBIcL;
    public static LineType isConnected;
    public static final DrawLineData copydefault = new DrawLineData();
    public static final double[] KWHzl = {261.8d, 161.8d, 138.2d, 100.0d, 78.6d, 61.8d, 50.0d, 38.2d, 23.6d, AudioStats.AUDIO_AMPLITUDE_NONE};
    public static String gEmmrt = "#2862FF";
    public static String AYXKKw = "A6";
    public static String EZpvd = "#262862FF";
    public static String valueOf = "A6";
    public static int fetchVPNInfo = 1;
    public static ArrayList<DrawLineFiboBean> AhwBna = new ArrayList<>();
    public static ArrayList<DrawLineItem> AEQbTJ = new ArrayList<>();
    public static ArrayList<DrawLineItem> values = new ArrayList<>();
    public static final int OLrzqt = 8;

    public static final class Application extends TypeToken<ArrayList<DrawLineItem>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull ArrayList<DrawLineItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AEQbTJ = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DrawLineItem> EZpvd() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(LineType lineType) {
        isConnected = lineType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull ArrayList<DrawLineFiboBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AhwBna = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(DrawLineItem drawLineItem) {
        DbNXlk = drawLineItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LineType OLrzqt() {
        return isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        djBIcL = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DrawLineFiboBean> djBIcL() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DrawLineItem> fetchVPNInfo() {
        return values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DrawLineItem isConnected() {
        return DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LineType valueOf() {
        return isConnected;
    }

    private DrawLineData() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LineType[] $VALUES;
        private final String strName;
        public static final LineType H_SEGMENT = new LineType("H_SEGMENT", 0, "horizontal_segment");
        public static final LineType H_RADIAL = new LineType("H_RADIAL", 1, "horizontal_ray");
        public static final LineType H_LINE = new LineType("H_LINE", 2, "horizontal_line");
        public static final LineType SEGMENT = new LineType("SEGMENT", 3, "segment");
        public static final LineType RADIAL = new LineType("RADIAL", 4, "ray");
        public static final LineType LINE = new LineType("LINE", 5, "line");
        public static final LineType ARROW = new LineType("ARROW", 6, "arrow");
        public static final LineType INFO_SEGMENT = new LineType("INFO_SEGMENT", 7, "info_segment");
        public static final LineType PRICE_LINE = new LineType("PRICE_LINE", 8, "price_line");
        public static final LineType PRICE_ROAD = new LineType("PRICE_ROAD", 9, "PRICE_ROAD");
        public static final LineType FIBONACCI = new LineType("FIBONACCI", 10, "fib_retrace");
        public static final LineType G_RECTANGLE = new LineType("G_RECTANGLE", 11, "rectangle");
        public static final LineType G_CIRCLE = new LineType("G_CIRCLE", 12, "circle");
        public static final LineType G_TRIANGLE = new LineType("G_TRIANGLE", 13, "triangle");
        public static final LineType NONE = new LineType("NONE", 14, "NONE");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LineType[] $values() {
            return new LineType[]{H_SEGMENT, H_RADIAL, H_LINE, SEGMENT, RADIAL, LINE, ARROW, INFO_SEGMENT, PRICE_LINE, PRICE_ROAD, FIBONACCI, G_RECTANGLE, G_CIRCLE, G_TRIANGLE, NONE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LineType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStrName() {
            return this.strName;
        }

        private LineType(String str, int i, String str2) {
            this.strName = str2;
        }

        static {
            LineType[] lineTypeArr$values = $values();
            $VALUES = lineTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(lineTypeArr$values);
        }

        public static LineType valueOf(String str) {
            return (LineType) Enum.valueOf(LineType.class, str);
        }

        public static LineType[] values() {
            return (LineType[]) $VALUES.clone();
        }
    }

    public static final class DrawLineItem {
        public static final int $stable = 8;
        private String contract;
        private int currencyId;
        private ArrayList<Dot> dotList;
        private ArrayList<DrawLineFiboBean> fiboList;
        private String fillColor;
        private String fillColorBlk;
        private String indexId;
        private boolean isDelete;
        private int klineType;
        private String lineColorBlk;
        private ArrayList<Line> linePositionList;
        private LineType lineType;
        private String linecolor;
        private int linestyle;
        private int linewidth;
        private boolean locked;
        private int selected;
        private String timeStamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DrawLineItem() {
            this(null, null, null, 0, 0, null, null, 0, false, null, 0, 0, null, false, null, null, null, null, 262143, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LineType component1() {
            return this.lineType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.linecolor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component11() {
            return this.linewidth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component12() {
            return this.linestyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<DrawLineFiboBean> component13() {
            return this.fiboList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component14() {
            return this.isDelete;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component15() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component16() {
            return this.lineColorBlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component17() {
            return this.fillColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component18() {
            return this.fillColorBlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.indexId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.contract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component4() {
            return this.klineType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component5() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<Dot> component6() {
            return this.dotList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<Line> component7() {
            return this.linePositionList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component8() {
            return this.selected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component9() {
            return this.locked;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DrawLineItem copy(@NotNull LineType lineType, @NotNull String str, @NotNull String str2, int i, int i2, @NotNull ArrayList<Dot> arrayList, @NotNull ArrayList<Line> arrayList2, int i3, boolean z, @NotNull String str3, int i4, int i5, @NotNull ArrayList<DrawLineFiboBean> arrayList3, boolean z2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(lineType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(arrayList3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new DrawLineItem(lineType, str, str2, i, i2, arrayList, arrayList2, i3, z, str3, i4, i5, arrayList3, z2, str4, str5, str6, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContract() {
            return this.contract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getCurrencyId() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<Dot> getDotList() {
            return this.dotList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<DrawLineFiboBean> getFiboList() {
            return this.fiboList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFillColor() {
            return this.fillColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFillColorBlk() {
            return this.fillColorBlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIndexId() {
            return this.indexId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getKlineType() {
            return this.klineType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLineColorBlk() {
            return this.lineColorBlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<Line> getLinePositionList() {
            return this.linePositionList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LineType getLineType() {
            return this.lineType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLinecolor() {
            return this.linecolor;
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
        public final boolean getLocked() {
            return this.locked;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getSelected() {
            return this.selected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTimeStamp() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((this.lineType.hashCode() * 31) + this.indexId.hashCode()) * 31) + this.contract.hashCode()) * 31) + Integer.hashCode(this.klineType)) * 31) + Integer.hashCode(this.currencyId)) * 31) + this.dotList.hashCode()) * 31) + this.linePositionList.hashCode()) * 31) + Integer.hashCode(this.selected)) * 31) + Boolean.hashCode(this.locked)) * 31) + this.linecolor.hashCode()) * 31) + Integer.hashCode(this.linewidth)) * 31) + Integer.hashCode(this.linestyle)) * 31) + this.fiboList.hashCode()) * 31) + Boolean.hashCode(this.isDelete)) * 31) + this.timeStamp.hashCode()) * 31) + this.lineColorBlk.hashCode()) * 31) + this.fillColor.hashCode()) * 31) + this.fillColorBlk.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isDelete() {
            return this.isDelete;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContract(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.contract = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCurrencyId(int i) {
            this.currencyId = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDelete(boolean z) {
            this.isDelete = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDotList(@NotNull ArrayList<Dot> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.dotList = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFiboList(@NotNull ArrayList<DrawLineFiboBean> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.fiboList = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFillColor(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.fillColor = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFillColorBlk(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.fillColorBlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setIndexId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.indexId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setKlineType(int i) {
            this.klineType = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLineColorBlk(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.lineColorBlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLinePositionList(@NotNull ArrayList<Line> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.linePositionList = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLineType(@NotNull LineType lineType) {
            Intrinsics.checkNotNullParameter(lineType, "");
            this.lineType = lineType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLinecolor(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.linecolor = str;
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
        public final void setLocked(boolean z) {
            this.locked = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSelected(int i) {
            this.selected = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTimeStamp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.timeStamp = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DrawLineItem(lineType=" + this.lineType + ", indexId=" + this.indexId + ", contract=" + this.contract + ", klineType=" + this.klineType + ", currencyId=" + this.currencyId + ", dotList=" + this.dotList + ", linePositionList=" + this.linePositionList + ", selected=" + this.selected + ", locked=" + this.locked + ", linecolor=" + this.linecolor + ", linewidth=" + this.linewidth + ", linestyle=" + this.linestyle + ", fiboList=" + this.fiboList + ", isDelete=" + this.isDelete + ", timeStamp=" + this.timeStamp + ", lineColorBlk=" + this.lineColorBlk + ", fillColor=" + this.fillColor + ", fillColorBlk=" + this.fillColorBlk + ")";
        }

        public DrawLineItem(@NotNull LineType lineType, @NotNull String str, @NotNull String str2, int i, int i2, @NotNull ArrayList<Dot> arrayList, @NotNull ArrayList<Line> arrayList2, int i3, boolean z, @NotNull String str3, int i4, int i5, @NotNull ArrayList<DrawLineFiboBean> arrayList3, boolean z2, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(lineType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(arrayList3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.lineType = lineType;
            this.indexId = str;
            this.contract = str2;
            this.klineType = i;
            this.currencyId = i2;
            this.dotList = arrayList;
            this.linePositionList = arrayList2;
            this.selected = i3;
            this.locked = z;
            this.linecolor = str3;
            this.linewidth = i4;
            this.linestyle = i5;
            this.fiboList = arrayList3;
            this.isDelete = z2;
            this.timeStamp = str4;
            this.lineColorBlk = str5;
            this.fillColor = str6;
            this.fillColorBlk = str7;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00d5: CONSTRUCTOR 
  (wrap:com.okinc.kline.library.drawline.DrawLineData$LineType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:94) com.okinc.kline.library.drawline.DrawLineData.LineType.H_SEGMENT com.okinc.kline.library.drawline.DrawLineData$LineType) : (r20v0 com.okinc.kline.library.drawline.DrawLineData$LineType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x002d: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:99) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r25v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0039: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:100) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r26v0 java.util.ArrayList))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0045: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r27v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("#2862FF") : (r29v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005e: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r30v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0066: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x006e: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0074: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:106) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r32v0 java.util.ArrayList))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007a: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0084: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
 A[MD:(com.okinc.kline.library.drawline.DrawLineData$LineType, java.lang.String, java.lang.String, int, int, java.util.ArrayList<com.okinc.kline.library.drawline.DrawLineData$Dot>, java.util.ArrayList<com.okinc.kline.library.drawline.DrawLineData$Line>, int, boolean, java.lang.String, int, int, java.util.ArrayList<com.okinc.kline.library.drawline.DrawLineData$DrawLineFiboBean>, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:93) call: com.okinc.kline.library.drawline.DrawLineData.DrawLineItem.<init>(com.okinc.kline.library.drawline.DrawLineData$LineType, java.lang.String, java.lang.String, int, int, java.util.ArrayList, java.util.ArrayList, int, boolean, java.lang.String, int, int, java.util.ArrayList, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ DrawLineItem(LineType lineType, String str, String str2, int i, int i2, ArrayList arrayList, ArrayList arrayList2, int i3, boolean z, String str3, int i4, int i5, ArrayList arrayList3, boolean z2, String str4, String str5, String str6, String str7, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? LineType.H_SEGMENT : lineType, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? 0 : i, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? new ArrayList() : arrayList, (i6 & 64) != 0 ? new ArrayList() : arrayList2, (i6 & 128) != 0 ? -1 : i3, (i6 & 256) != 0 ? false : z, (i6 & 512) != 0 ? "#2862FF" : str3, (i6 & 1024) != 0 ? 1 : i4, (i6 & 2048) != 0 ? 0 : i5, (i6 & 4096) != 0 ? new ArrayList() : arrayList3, (i6 & 8192) != 0 ? false : z2, (i6 & 16384) != 0 ? "" : str4, (i6 & 32768) != 0 ? "" : str5, (i6 & 65536) != 0 ? "" : str6, (i6 & 131072) != 0 ? "" : str7);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DrawLineItem(@NotNull LineType lineType, @NotNull String str, int i, int i2, @NotNull ArrayList<Dot> arrayList, int i3, @NotNull String str2, int i4, int i5, @NotNull ArrayList<DrawLineFiboBean> arrayList2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
            Intrinsics.checkNotNullParameter(lineType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            ArrayList arrayList3 = null;
            int i6 = 0;
            String str7 = null;
            this(null, null, null, 0, 0, arrayList3, arrayList3, 0, 0 == true ? 1 : 0, null, i6, i6, null, false, str7, str7, null, null, 262143, null);
            this.lineType = lineType;
            this.contract = str;
            this.klineType = i;
            this.currencyId = i2;
            this.dotList = arrayList;
            this.selected = i3;
            this.linecolor = str2;
            this.linewidth = i4;
            this.linestyle = i5;
            this.fiboList = arrayList2;
            this.timeStamp = str3;
            this.lineColorBlk = str4;
            this.fillColor = str5;
            this.fillColorBlk = str6;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (r17v0 com.okinc.kline.library.drawline.DrawLineData$LineType)
  (r18v0 java.lang.String)
  (r19v0 int)
  (r20v0 int)
  (r21v0 java.util.ArrayList)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r22v0 int))
  (r23v0 java.lang.String)
  (r24v0 int)
  (r25v0 int)
  (r26v0 java.util.ArrayList)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
 A[MD:(com.okinc.kline.library.drawline.DrawLineData$LineType, java.lang.String, int, int, java.util.ArrayList<com.okinc.kline.library.drawline.DrawLineData$Dot>, int, java.lang.String, int, int, java.util.ArrayList<com.okinc.kline.library.drawline.DrawLineData$DrawLineFiboBean>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:114) call: com.okinc.kline.library.drawline.DrawLineData.DrawLineItem.<init>(com.okinc.kline.library.drawline.DrawLineData$LineType, java.lang.String, int, int, java.util.ArrayList, int, java.lang.String, int, int, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ DrawLineItem(LineType lineType, String str, int i, int i2, ArrayList arrayList, int i3, String str2, int i4, int i5, ArrayList arrayList2, String str3, String str4, String str5, String str6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this(lineType, str, i, i2, arrayList, (i6 & 32) != 0 ? -1 : i3, str2, i4, i5, arrayList2, str3, str4, str5, str6);
        }

        public final void setLineLocked(boolean z) {
            this.locked = z;
            Iterator<DrawLineItem> it = DrawLineData.copydefault.EZpvd().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                DrawLineItem next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                DrawLineItem drawLineItem = next;
                if (Intrinsics.EZpvd(drawLineItem, this)) {
                    drawLineItem.locked = z;
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.EZpvd(DrawLineItem.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.copydefault(obj, "");
            DrawLineItem drawLineItem = (DrawLineItem) obj;
            if (Intrinsics.EZpvd((Object) this.indexId, (Object) drawLineItem.indexId)) {
                return true;
            }
            if (this.lineType != drawLineItem.lineType || !Intrinsics.EZpvd((Object) this.contract, (Object) drawLineItem.contract) || this.klineType != drawLineItem.klineType || this.currencyId != drawLineItem.currencyId) {
                return false;
            }
            int size = this.dotList.size();
            for (int i = 0; i < size; i++) {
                if (this.dotList.get(i).getTime() != drawLineItem.dotList.get(i).getTime() || this.dotList.get(i).getPrice() != drawLineItem.dotList.get(i).getPrice()) {
                    return false;
                }
            }
            return Intrinsics.EZpvd((Object) this.indexId, (Object) drawLineItem.indexId);
        }
    }

    public static final class Dot implements Comparable<Dot> {
        public static final int $stable = 8;
        private double price;
        private long time;
        private double x;
        private double y;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double getPrice() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getTime() {
            return this.time;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double getX() {
            return this.x;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double getY() {
            return this.y;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPrice(double d) {
            this.price = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTime(long j) {
            this.time = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setX(double d) {
            this.x = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setY(double d) {
            this.y = d;
        }

        public Dot() {
            this.x = -1.0d;
            this.y = -1.0d;
        }

        public Dot(long j, double d) {
            this();
            this.time = j;
            this.price = d;
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        public int compareTo(@NotNull Dot dot) {
            Intrinsics.checkNotNullParameter(dot, "");
            return Double.compare(this.x, dot.x);
        }

        public final Dot copy() {
            Dot dot = new Dot();
            dot.time = this.time;
            dot.price = this.price;
            dot.x = this.x;
            dot.y = this.y;
            return dot;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Line {
        public static final int $stable = 8;
        private double x1;
        private double x2;
        private double y1;
        private double y2;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double getX1() {
            return this.x1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double getX2() {
            return this.x2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double getY1() {
            return this.y1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double getY2() {
            return this.y2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setX1(double d) {
            this.x1 = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setX2(double d) {
            this.x2 = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setY1(double d) {
            this.y1 = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setY2(double d) {
            this.y2 = d;
        }

        public Line() {
        }

        public Line(float f, float f2, float f3, float f4) {
            this();
            this.x1 = f;
            this.y1 = f2;
            this.x2 = f3;
            this.y2 = f4;
        }
    }

    public static final class DrawLineFiboBean {
        public static final int $stable = 8;
        private boolean isSelected;
        private float percent;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DrawLineFiboBean() {
            this(0.0f, false, 3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float getPercent() {
            return this.percent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isSelected() {
            return this.isSelected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPercent(float f) {
            this.percent = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSelected(boolean z) {
            this.isSelected = z;
        }

        public DrawLineFiboBean(float f, boolean z) {
            this.percent = f;
            this.isSelected = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r1v0 float))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(float, boolean):void (m)] (LINE:201) call: com.okinc.kline.library.drawline.DrawLineData.DrawLineFiboBean.<init>(float, boolean):void type: THIS */
        public /* synthetic */ DrawLineFiboBean(float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? false : z);
        }
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: T, ? super java.util.ArrayList<com.okinc.kline.library.drawline.DrawLineData$DrawLineItem> */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    public final void OLrzqt(@NotNull final Function1<? super ArrayList<DrawLineItem>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        final String string = SPUtils.getString(values(), "");
        if (!TextUtils.isEmpty(string)) {
            AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
            final Function1 function12 = new Function1() { // from class: o.oUS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DrawLineData.copydefault(objectRef, string, (java.lang.String) obj);
                }
            };
            AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.oUR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return DrawLineData.OLrzqt(function12, obj);
                }
            }).subscribeOn(yBP.KWHzl()).observeOn(C58266yxz.OLrzqt());
            final Function1 function13 = new Function1() { // from class: o.oUT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DrawLineData.EZpvd(objectRef, function1, (Unit) obj);
                }
            };
            abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.oUQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    DrawLineData.KWHzl(function13, obj);
                }
            });
            return;
        }
        function1.invoke(objectRef.element);
    }

    public static final Unit OLrzqt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    public static final Unit copydefault(Ref.ObjectRef objectRef, String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        objectRef.element = new Gson().fromJson(str, new Application().getType());
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Ref.ObjectRef objectRef, Function1 function1, Unit unit) {
        int i = 0;
        for (Object obj : (Iterable) objectRef.element) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            DrawLineItem drawLineItem = (DrawLineItem) obj;
            if (drawLineItem.getIndexId().length() == 0) {
                drawLineItem.setIndexId(C37897pEt.KWHzl.copydefault(System.currentTimeMillis() + ((long) i)));
            }
            i++;
        }
        function1.invoke(objectRef.element);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    public final void AEQbTJ(@NotNull final Function1<? super ArrayList<DrawLineItem>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        OLrzqt(new Function1() { // from class: o.oUW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DrawLineData.KWHzl(objectRef, function1, (java.util.ArrayList) obj);
            }
        });
    }

    public final void EZpvd(List<DrawLineItem> list) {
        String strValues = values();
        if (list == null) {
            SPUtils.remove(strValues);
        } else {
            SPUtils.put(strValues, new Gson().toJson(list));
        }
    }

    public final String values() {
        if (C36246oUr.copydefault().RdAHlO()) {
            return "DRAW_LINE_DATA";
        }
        if (Intrinsics.EZpvd((Object) C36246oUr.copydefault().fZBcTu(), (Object) "cedefi_mode")) {
            return "DRAW_LINE_DATAcedefi_mode";
        }
        return "DRAW_LINE_DATA" + C36246oUr.copydefault().fIwbmz();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(Ref.ObjectRef objectRef, Function1 function1, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DrawLineItem drawLineItem = (DrawLineItem) it.next();
            String contract = drawLineItem.getContract();
            oUJ ouj = oUJ.KWHzl;
            DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
            Intrinsics.copydefault(drawLineBeanAEQbTJ);
            if (Intrinsics.EZpvd((Object) contract, (Object) drawLineBeanAEQbTJ.getCoinId())) {
                int klineType = drawLineItem.getKlineType();
                DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
                Intrinsics.copydefault(drawLineBeanAEQbTJ2);
                Integer type = drawLineBeanAEQbTJ2.getType();
                if (type != null && klineType == type.intValue()) {
                    ((ArrayList) objectRef.element).add(drawLineItem);
                }
            }
        }
        T t = objectRef.element;
        values = (ArrayList) t;
        function1.invoke(t);
        return Unit.INSTANCE;
    }
}
