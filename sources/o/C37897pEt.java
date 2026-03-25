package o;

import android.graphics.Color;
import androidx.camera.video.AudioStats;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.gson.Gson;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.DrawingLinesData;
import com.okinc.kline.data.LineDataBean;
import com.okinc.kline.data.LineFibDataBean;
import com.okinc.kline.data.LineFibStateBean;
import com.okinc.kline.data.LinePointsBean;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.util.KlineDrawingDataUtils$removeDeleteData$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pEt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37897pEt {
    public static final C37897pEt KWHzl = new C37897pEt();

    private C37897pEt() {
    }

    public final java.util.ArrayList<DrawLineData.DrawLineItem> copydefault(@NotNull DrawingDataBean drawingDataBean, boolean z) {
        java.lang.String timeStamp;
        java.lang.String lineData;
        java.lang.String coinId;
        java.lang.Integer type;
        Intrinsics.checkNotNullParameter(drawingDataBean, "");
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList = new java.util.ArrayList<>();
        for (DrawingLinesData drawingLinesData : drawingDataBean.getLines()) {
            DrawLineData.DrawLineItem drawLineItem = new DrawLineData.DrawLineItem(null, null, null, 0, 0, null, null, 0, false, null, 0, 0, null, false, null, null, null, null, 262143, null);
            if (drawingLinesData == null || (timeStamp = drawingLinesData.getTimeStamp()) == null) {
                timeStamp = "";
            }
            drawLineItem.setTimeStamp(timeStamp);
            if (drawingLinesData != null && (lineData = drawingLinesData.getLineData()) != null) {
                LineDataBean lineDataBean = (LineDataBean) new Gson().fromJson(lineData, LineDataBean.class);
                drawLineItem.setIndexId(lineDataBean.getId());
                C37897pEt c37897pEt = KWHzl;
                drawLineItem.setLineType(c37897pEt.EZpvd(lineDataBean.getType()));
                drawLineItem.setDotList(c37897pEt.EZpvd(lineDataBean.getPoints()));
                drawLineItem.setLocked(lineDataBean.getState().getFrozen());
                drawLineItem.setLinecolor(c37897pEt.OLrzqt(lineDataBean.getState().getLinecolor(), z));
                drawLineItem.setLineColorBlk(c37897pEt.KWHzl(lineDataBean.getState().getLinecolorBlk()));
                drawLineItem.setLinewidth(lineDataBean.getState().getLinewidth());
                drawLineItem.setLinestyle(lineDataBean.getState().getLinestyle());
                oUJ ouj = oUJ.KWHzl;
                DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
                if (drawLineBeanAEQbTJ == null || (coinId = drawLineBeanAEQbTJ.getCoinId()) == null) {
                    coinId = "";
                }
                drawLineItem.setContract(coinId);
                DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
                drawLineItem.setKlineType((drawLineBeanAEQbTJ2 == null || (type = drawLineBeanAEQbTJ2.getType()) == null) ? 0 : type.intValue());
                drawLineItem.setFillColor(c37897pEt.OLrzqt(lineDataBean.getState().getBackgroundColor(), z));
                drawLineItem.setFillColorBlk(lineDataBean.getState().getBackgroundColorBlk());
                if (drawLineItem.getLineType() == DrawLineData.LineType.FIBONACCI) {
                    drawLineItem.setFiboList(c37897pEt.copydefault(((LineFibDataBean) new Gson().fromJson(lineData, LineFibDataBean.class)).getState()));
                }
                arrayList.add(drawLineItem);
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList<DrawLineData.DrawLineItem> copydefault(@NotNull DrawingDataBean drawingDataBean) {
        java.lang.String timeStamp;
        java.lang.String lineData;
        java.lang.String coinId;
        java.lang.Integer type;
        Intrinsics.checkNotNullParameter(drawingDataBean, "");
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList = new java.util.ArrayList<>();
        for (DrawingLinesData drawingLinesData : drawingDataBean.getLines()) {
            DrawLineData.DrawLineItem drawLineItem = new DrawLineData.DrawLineItem(null, null, null, 0, 0, null, null, 0, false, null, 0, 0, null, false, null, null, null, null, 262143, null);
            if (drawingLinesData == null || (timeStamp = drawingLinesData.getTimeStamp()) == null) {
                timeStamp = "";
            }
            drawLineItem.setTimeStamp(timeStamp);
            if (drawingLinesData != null && (lineData = drawingLinesData.getLineData()) != null) {
                LineDataBean lineDataBean = (LineDataBean) new Gson().fromJson(lineData, LineDataBean.class);
                drawLineItem.setIndexId(lineDataBean.getId());
                C37897pEt c37897pEt = KWHzl;
                drawLineItem.setLineType(c37897pEt.EZpvd(lineDataBean.getType()));
                drawLineItem.setDotList(c37897pEt.EZpvd(lineDataBean.getPoints()));
                drawLineItem.setLocked(lineDataBean.getState().getFrozen());
                drawLineItem.setLinecolor(c37897pEt.KWHzl(lineDataBean.getState().getLinecolor()));
                drawLineItem.setLineColorBlk(c37897pEt.KWHzl(lineDataBean.getState().getLinecolorBlk()));
                drawLineItem.setLinewidth(lineDataBean.getState().getLinewidth());
                drawLineItem.setLinestyle(lineDataBean.getState().getLinestyle());
                oUJ ouj = oUJ.KWHzl;
                DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
                if (drawLineBeanAEQbTJ == null || (coinId = drawLineBeanAEQbTJ.getCoinId()) == null) {
                    coinId = "";
                }
                drawLineItem.setContract(coinId);
                DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
                drawLineItem.setKlineType((drawLineBeanAEQbTJ2 == null || (type = drawLineBeanAEQbTJ2.getType()) == null) ? 0 : type.intValue());
                drawLineItem.setFillColor(lineDataBean.getState().getBackgroundColor());
                drawLineItem.setFillColorBlk(lineDataBean.getState().getBackgroundColorBlk());
                if (drawLineItem.getLineType() == DrawLineData.LineType.FIBONACCI) {
                    drawLineItem.setFiboList(c37897pEt.copydefault(((LineFibDataBean) new Gson().fromJson(lineData, LineFibDataBean.class)).getState()));
                }
                arrayList.add(drawLineItem);
            }
        }
        return arrayList;
    }

    public final java.lang.String copydefault(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (j == 0) {
            return "0";
        }
        while (j > 0) {
            long j2 = 36;
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((int) (j % j2)));
            j /= j2;
        }
        java.lang.String string = sb.reverse().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "rgb", false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.lang.String strSubstring = str.substring(StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, "(", 0, false, 6, (java.lang.Object) null) + 1, str.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strSubstring, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() < 3) {
            return "#2862FF";
        }
        java.lang.String str2 = ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + KWHzl(C33129mqd.AhwBna(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) listSplit$default.get(0)).toString())) + KWHzl(C33129mqd.AhwBna(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) listSplit$default.get(1)).toString())) + KWHzl(C33129mqd.AhwBna(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) listSplit$default.get(2)).toString()));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final java.lang.String OLrzqt(java.lang.String str, boolean z) {
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "rgb", false, 2, (java.lang.Object) null)) {
            return pDT.Companion.KWHzl().AEQbTJ(str);
        }
        if (z) {
            try {
                Color.parseColor(str);
                kotlin.Pair<java.lang.String, java.lang.Integer> pairKWHzl = pEL.OLrzqt.KWHzl(str);
                return EZpvd(pairKWHzl.getFirst(), pairKWHzl.getSecond().intValue());
            } catch (java.lang.Exception e) {
                pUU.copydefault("getDrawColor fromService error " + e.getMessage());
            }
        }
        return "#2862FF";
    }

    public final java.lang.String KWHzl(int i) {
        java.lang.String hexString = java.lang.Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "");
        return StringsKt__StringsKt.copydefault(hexString, 2, '0');
    }

    public final java.util.ArrayList<DrawLineData.DrawLineFiboBean> copydefault(@NotNull LineFibStateBean lineFibStateBean) {
        Intrinsics.checkNotNullParameter(lineFibStateBean, "");
        java.util.ArrayList<DrawLineData.DrawLineFiboBean> arrayList = new java.util.ArrayList<>();
        try {
            try {
                float fDjBIcL = C33129mqd.djBIcL(lineFibStateBean.getLevel1().get(0));
                java.lang.Object obj = lineFibStateBean.getLevel1().get(2);
                Intrinsics.copydefault(obj, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL, ((java.lang.Boolean) obj).booleanValue()));
                float fDjBIcL2 = C33129mqd.djBIcL(lineFibStateBean.getLevel2().get(0));
                java.lang.Object obj2 = lineFibStateBean.getLevel2().get(2);
                Intrinsics.copydefault(obj2, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL2, ((java.lang.Boolean) obj2).booleanValue()));
                float fDjBIcL3 = C33129mqd.djBIcL(lineFibStateBean.getLevel3().get(0));
                java.lang.Object obj3 = lineFibStateBean.getLevel3().get(2);
                Intrinsics.copydefault(obj3, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL3, ((java.lang.Boolean) obj3).booleanValue()));
                float fDjBIcL4 = C33129mqd.djBIcL(lineFibStateBean.getLevel4().get(0));
                java.lang.Object obj4 = lineFibStateBean.getLevel4().get(2);
                Intrinsics.copydefault(obj4, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL4, ((java.lang.Boolean) obj4).booleanValue()));
                float fDjBIcL5 = C33129mqd.djBIcL(lineFibStateBean.getLevel5().get(0));
                java.lang.Object obj5 = lineFibStateBean.getLevel5().get(2);
                Intrinsics.copydefault(obj5, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL5, ((java.lang.Boolean) obj5).booleanValue()));
                float fDjBIcL6 = C33129mqd.djBIcL(lineFibStateBean.getLevel6().get(0));
                java.lang.Object obj6 = lineFibStateBean.getLevel6().get(2);
                Intrinsics.copydefault(obj6, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL6, ((java.lang.Boolean) obj6).booleanValue()));
                float fDjBIcL7 = C33129mqd.djBIcL(lineFibStateBean.getLevel7().get(0));
                java.lang.Object obj7 = lineFibStateBean.getLevel7().get(2);
                Intrinsics.copydefault(obj7, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL7, ((java.lang.Boolean) obj7).booleanValue()));
                float fDjBIcL8 = C33129mqd.djBIcL(lineFibStateBean.getLevel8().get(0));
                java.lang.Object obj8 = lineFibStateBean.getLevel8().get(2);
                Intrinsics.copydefault(obj8, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL8, ((java.lang.Boolean) obj8).booleanValue()));
                float fDjBIcL9 = C33129mqd.djBIcL(lineFibStateBean.getLevel9().get(0));
                java.lang.Object obj9 = lineFibStateBean.getLevel9().get(2);
                Intrinsics.copydefault(obj9, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL9, ((java.lang.Boolean) obj9).booleanValue()));
                float fDjBIcL10 = C33129mqd.djBIcL(lineFibStateBean.getLevel10().get(0));
                java.lang.Object obj10 = lineFibStateBean.getLevel10().get(2);
                Intrinsics.copydefault(obj10, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL10, ((java.lang.Boolean) obj10).booleanValue()));
                float fDjBIcL11 = C33129mqd.djBIcL(lineFibStateBean.getLevel11().get(0));
                java.lang.Object obj11 = lineFibStateBean.getLevel11().get(2);
                Intrinsics.copydefault(obj11, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL11, ((java.lang.Boolean) obj11).booleanValue()));
                float fDjBIcL12 = C33129mqd.djBIcL(lineFibStateBean.getLevel12().get(0));
                java.lang.Object obj12 = lineFibStateBean.getLevel12().get(2);
                Intrinsics.copydefault(obj12, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL12, ((java.lang.Boolean) obj12).booleanValue()));
                float fDjBIcL13 = C33129mqd.djBIcL(lineFibStateBean.getLevel13().get(0));
                java.lang.Object obj13 = lineFibStateBean.getLevel13().get(2);
                Intrinsics.copydefault(obj13, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL13, ((java.lang.Boolean) obj13).booleanValue()));
                float fDjBIcL14 = C33129mqd.djBIcL(lineFibStateBean.getLevel14().get(0));
                java.lang.Object obj14 = lineFibStateBean.getLevel14().get(2);
                Intrinsics.copydefault(obj14, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL14, ((java.lang.Boolean) obj14).booleanValue()));
                float fDjBIcL15 = C33129mqd.djBIcL(lineFibStateBean.getLevel15().get(0));
                java.lang.Object obj15 = lineFibStateBean.getLevel15().get(2);
                Intrinsics.copydefault(obj15, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL15, ((java.lang.Boolean) obj15).booleanValue()));
                float fDjBIcL16 = C33129mqd.djBIcL(lineFibStateBean.getLevel16().get(0));
                java.lang.Object obj16 = lineFibStateBean.getLevel16().get(2);
                Intrinsics.copydefault(obj16, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL16, ((java.lang.Boolean) obj16).booleanValue()));
                float fDjBIcL17 = C33129mqd.djBIcL(lineFibStateBean.getLevel17().get(0));
                java.lang.Object obj17 = lineFibStateBean.getLevel17().get(2);
                Intrinsics.copydefault(obj17, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL17, ((java.lang.Boolean) obj17).booleanValue()));
                float fDjBIcL18 = C33129mqd.djBIcL(lineFibStateBean.getLevel18().get(0));
                java.lang.Object obj18 = lineFibStateBean.getLevel18().get(2);
                Intrinsics.copydefault(obj18, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL18, ((java.lang.Boolean) obj18).booleanValue()));
                float fDjBIcL19 = C33129mqd.djBIcL(lineFibStateBean.getLevel19().get(0));
                java.lang.Object obj19 = lineFibStateBean.getLevel19().get(2);
                Intrinsics.copydefault(obj19, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL19, ((java.lang.Boolean) obj19).booleanValue()));
                float fDjBIcL20 = C33129mqd.djBIcL(lineFibStateBean.getLevel20().get(0));
                java.lang.Object obj20 = lineFibStateBean.getLevel20().get(2);
                Intrinsics.copydefault(obj20, "");
                arrayList.add(new DrawLineData.DrawLineFiboBean(fDjBIcL20, ((java.lang.Boolean) obj20).booleanValue()));
                return arrayList;
            } catch (java.lang.Exception e) {
                pUU.copydefault("getFiboList", e.toString());
                return arrayList;
            }
        } catch (java.lang.Throwable unused) {
            return arrayList;
        }
    }

    public final java.util.ArrayList<DrawLineData.Dot> EZpvd(@NotNull java.util.List<LinePointsBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<DrawLineData.Dot> arrayList = new java.util.ArrayList<>();
        for (LinePointsBean linePointsBean : list) {
            arrayList.add(new DrawLineData.Dot(linePointsBean != null ? linePointsBean.getTime_t() : 0L, linePointsBean != null ? linePointsBean.getPrice() : AudioStats.AUDIO_AMPLITUDE_NONE));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [318=13] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final DrawLineData.LineType EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1780010578:
                if (str.equals("LineToolInfoLine")) {
                    return DrawLineData.LineType.INFO_SEGMENT;
                }
                break;
            case -1358910563:
                if (str.equals("LineToolArrow")) {
                    return DrawLineData.LineType.ARROW;
                }
                break;
            case -1134682947:
                if (str.equals("LineToolFibRetracement")) {
                    return DrawLineData.LineType.FIBONACCI;
                }
                break;
            case -572494346:
                if (str.equals("LineToolHorzTrendLine")) {
                    return DrawLineData.LineType.H_SEGMENT;
                }
                break;
            case -459949580:
                if (str.equals("LineToolTriangle")) {
                    return DrawLineData.LineType.G_TRIANGLE;
                }
                break;
            case -266445627:
                if (str.equals("LineToolTrendLine")) {
                    return DrawLineData.LineType.SEGMENT;
                }
                break;
            case 516365605:
                if (str.equals("LineToolExtended")) {
                    return DrawLineData.LineType.LINE;
                }
                break;
            case 561773315:
                if (str.equals("LineToolRectangle")) {
                    return DrawLineData.LineType.G_RECTANGLE;
                }
                break;
            case 872380348:
                if (str.equals("LineToolCircle")) {
                    return DrawLineData.LineType.G_CIRCLE;
                }
                break;
            case 914801854:
                if (str.equals("LineToolRay")) {
                    return DrawLineData.LineType.RADIAL;
                }
                break;
            case 1453959224:
                if (str.equals("MarkToolPriceLine")) {
                    return DrawLineData.LineType.PRICE_LINE;
                }
                break;
            case 1588973231:
                if (str.equals("LineToolHorzRay")) {
                    return DrawLineData.LineType.H_RADIAL;
                }
                break;
            case 2013358607:
                if (str.equals("LineToolHorzLine")) {
                    return DrawLineData.LineType.H_LINE;
                }
                break;
        }
        return DrawLineData.LineType.NONE;
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, @NotNull Continuation<? super java.util.ArrayList<DrawLineData.DrawLineItem>> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new KlineDrawingDataUtils$removeDeleteData$2(arrayList, null), continuation);
    }

    public final kotlin.Pair<DrawLineData.Dot, DrawLineData.Dot> copydefault(@NotNull java.util.ArrayList<DrawLineData.Dot> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        DrawLineData.Dot dot = arrayList.get(0);
        Intrinsics.checkNotNullExpressionValue(dot, "");
        DrawLineData.Dot dot2 = arrayList.get(0);
        Intrinsics.checkNotNullExpressionValue(dot2, "");
        for (DrawLineData.Dot dot3 : arrayList) {
            if (dot3.getY() > dot.getY()) {
                dot = dot3;
            }
            if (dot3.getY() < dot2.getY()) {
                dot2 = dot3;
            }
        }
        return new kotlin.Pair<>(dot2, dot);
    }

    public final java.lang.String EZpvd(java.lang.String str, int i) {
        int color = Color.parseColor(str);
        int iArgb = Color.argb(i, Color.red(color), Color.green(color), Color.blue(color));
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str2 = java.lang.String.format("#%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iArgb)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }
}
