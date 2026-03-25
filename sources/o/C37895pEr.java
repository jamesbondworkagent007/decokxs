package o;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.PixelCopy;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.Gson;
import com.okinc.db.bean.DrawingDataEntity;
import com.okinc.kline.data.DrawingDataBean;
import com.okinc.kline.data.DrawingLinesData;
import com.okinc.kline.data.LineDataBean;
import com.okinc.kline.data.LineFibDataBean;
import com.okinc.kline.data.LineFibStateBean;
import com.okinc.kline.data.LinePointsBean;
import com.okinc.kline.data.LineStateBean;
import com.okinc.kline.library.drawline.DrawLineData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.pDT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pEr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37895pEr {
    public static final C37895pEr copydefault = new C37895pEr();
    public static int EZpvd = 50;
    public static final int KWHzl = 8;

    /* JADX INFO: renamed from: o.pEr$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DrawLineData.LineType.values().length];
            try {
                iArr[DrawLineData.LineType.H_SEGMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DrawLineData.LineType.H_RADIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DrawLineData.LineType.H_LINE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[DrawLineData.LineType.SEGMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[DrawLineData.LineType.INFO_SEGMENT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[DrawLineData.LineType.RADIAL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[DrawLineData.LineType.LINE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[DrawLineData.LineType.ARROW.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[DrawLineData.LineType.PRICE_LINE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[DrawLineData.LineType.FIBONACCI.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[DrawLineData.LineType.G_RECTANGLE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[DrawLineData.LineType.G_CIRCLE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[DrawLineData.LineType.G_TRIANGLE.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return EZpvd;
    }

    private C37895pEr() {
    }

    public final java.lang.String OLrzqt(@NotNull DrawLineData.LineType lineType) {
        Intrinsics.checkNotNullParameter(lineType, "");
        switch (TaskDescription.copydefault[lineType.ordinal()]) {
            case 1:
                return "LineToolHorzTrendLine";
            case 2:
                return "LineToolHorzRay";
            case 3:
                return "LineToolHorzLine";
            case 4:
                return "LineToolTrendLine";
            case 5:
                return "LineToolInfoLine";
            case 6:
                return "LineToolRay";
            case 7:
                return "LineToolExtended";
            case 8:
                return "LineToolArrow";
            case 9:
                return "MarkToolPriceLine";
            case 10:
                return "LineToolFibRetracement";
            case 11:
                return "LineToolRectangle";
            case 12:
                return "LineToolCircle";
            case 13:
                return "LineToolTriangle";
            default:
                return "";
        }
    }

    public static /* synthetic */ LineFibStateBean getLineFibDataState$default(C37895pEr c37895pEr, DrawLineData.DrawLineItem drawLineItem, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c37895pEr.KWHzl(drawLineItem, str, z);
    }

    public final LineFibStateBean KWHzl(@NotNull DrawLineData.DrawLineItem drawLineItem, @NotNull java.lang.String str, boolean z) {
        java.lang.String str2;
        java.lang.String linecolor;
        Intrinsics.checkNotNullParameter(drawLineItem, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String linecolor2 = drawLineItem.getLinecolor();
        if (z && C33129mqd.OLrzqt((java.lang.CharSequence) drawLineItem.getLinecolor()) && drawLineItem.getLinecolor().length() == 9) {
            pDT.StateListAnimator stateListAnimator = pDT.Companion;
            int iIntValue = stateListAnimator.KWHzl().EZpvd(drawLineItem.getLinecolor()).getFirst().intValue();
            int iIntValue2 = stateListAnimator.KWHzl().EZpvd(drawLineItem.getLinecolor()).getSecond().intValue();
            try {
                pEL pel = pEL.OLrzqt;
                C56529yIt c56529yIt = C56529yIt.KWHzl;
                java.lang.String str3 = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iIntValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "");
                linecolor = pel.KWHzl(str3, iIntValue2);
            } catch (java.lang.Exception unused) {
                linecolor = drawLineItem.getLinecolor();
            }
            str2 = linecolor;
        } else {
            str2 = linecolor2;
        }
        return new LineFibStateBean(str2, drawLineItem.getLineColorBlk(), drawLineItem.getLinewidth(), drawLineItem.getLinestyle(), false, drawLineItem.getLocked(), str, false, false, false, 0, false, false, false, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -112, 63, null);
    }

    public final java.util.List<LinePointsBean> OLrzqt(@NotNull DrawLineData.DrawLineItem drawLineItem) {
        Intrinsics.checkNotNullParameter(drawLineItem, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (DrawLineData.Dot dot : drawLineItem.getDotList()) {
            arrayList.add(new LinePointsBean(dot.getTime(), 0, dot.getPrice()));
        }
        return arrayList;
    }

    public final LineStateBean KWHzl(@NotNull DrawLineData.DrawLineItem drawLineItem, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(drawLineItem, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new LineStateBean(drawLineItem.getLinecolor(), drawLineItem.getLineColorBlk(), drawLineItem.getLinewidth(), drawLineItem.getLinestyle(), false, false, 0, 0, false, null, null, null, 0, false, false, false, false, false, false, false, false, false, false, 0, 0, 0, false, drawLineItem.getLocked(), str, null, null, null, null, null, null, drawLineItem.getFillColor(), drawLineItem.getFillColorBlk(), -402653200, 7, null);
    }

    public final LineStateBean EZpvd(@NotNull DrawLineData.DrawLineItem drawLineItem, @NotNull java.lang.String str, boolean z) {
        java.lang.String str2;
        java.lang.String fillColor;
        Intrinsics.checkNotNullParameter(drawLineItem, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String linecolor = drawLineItem.getLinecolor();
        java.lang.String fillColor2 = drawLineItem.getFillColor();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) drawLineItem.getLinecolor()) && drawLineItem.getLinecolor().length() == 9) {
            pDT.StateListAnimator stateListAnimator = pDT.Companion;
            int iIntValue = stateListAnimator.KWHzl().EZpvd(drawLineItem.getLinecolor()).getFirst().intValue();
            int iIntValue2 = stateListAnimator.KWHzl().EZpvd(drawLineItem.getLinecolor()).getSecond().intValue();
            try {
                pEL pel = pEL.OLrzqt;
                C56529yIt c56529yIt = C56529yIt.KWHzl;
                java.lang.String str3 = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iIntValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "");
                linecolor = pel.KWHzl(str3, iIntValue2);
            } catch (java.lang.Exception unused) {
                linecolor = drawLineItem.getLinecolor();
            }
        }
        java.lang.String str4 = linecolor;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) drawLineItem.getFillColor()) && drawLineItem.getFillColor().length() == 9) {
            pDT.StateListAnimator stateListAnimator2 = pDT.Companion;
            int iIntValue3 = stateListAnimator2.KWHzl().EZpvd(drawLineItem.getFillColor()).getFirst().intValue();
            int iIntValue4 = stateListAnimator2.KWHzl().EZpvd(drawLineItem.getFillColor()).getSecond().intValue();
            try {
                pEL pel2 = pEL.OLrzqt;
                C56529yIt c56529yIt2 = C56529yIt.KWHzl;
                java.lang.String str5 = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iIntValue3)}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "");
                fillColor = pel2.KWHzl(str5, iIntValue4);
            } catch (java.lang.Exception unused2) {
                fillColor = drawLineItem.getFillColor();
            }
            str2 = fillColor;
        } else {
            str2 = fillColor2;
        }
        return new LineStateBean(str4, drawLineItem.getLineColorBlk(), drawLineItem.getLinewidth(), drawLineItem.getLinestyle(), false, false, 0, 0, false, null, null, null, 0, false, false, false, false, false, false, false, false, false, false, 0, 0, 0, false, drawLineItem.getLocked(), str, null, null, null, null, null, null, str2, drawLineItem.getFillColorBlk(), -402653200, 7, null);
    }

    public final void EZpvd(@NotNull LineFibDataBean lineFibDataBean, @NotNull DrawLineData.DrawLineItem drawLineItem) {
        Intrinsics.checkNotNullParameter(lineFibDataBean, "");
        Intrinsics.checkNotNullParameter(drawLineItem, "");
        if (drawLineItem.getFiboList().size() >= 20) {
            int i = 0;
            for (java.lang.Object obj : drawLineItem.getFiboList()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                DrawLineData.DrawLineFiboBean drawLineFiboBean = (DrawLineData.DrawLineFiboBean) obj;
                float percent = drawLineFiboBean.getPercent();
                java.util.List<? extends java.lang.Object> listGEmmrt = yDY.gEmmrt(java.lang.Float.valueOf(percent), lineFibDataBean.getState().getLinecolor(), java.lang.Boolean.valueOf(drawLineFiboBean.isSelected()));
                switch (i) {
                    case 0:
                        lineFibDataBean.getState().setLevel1(listGEmmrt);
                        break;
                    case 1:
                        lineFibDataBean.getState().setLevel2(listGEmmrt);
                        break;
                    case 2:
                        lineFibDataBean.getState().setLevel3(listGEmmrt);
                        break;
                    case 3:
                        lineFibDataBean.getState().setLevel4(listGEmmrt);
                        break;
                    case 4:
                        lineFibDataBean.getState().setLevel5(listGEmmrt);
                        break;
                    case 5:
                        lineFibDataBean.getState().setLevel6(listGEmmrt);
                        break;
                    case 6:
                        lineFibDataBean.getState().setLevel7(listGEmmrt);
                        break;
                    case 7:
                        lineFibDataBean.getState().setLevel8(listGEmmrt);
                        break;
                    case 8:
                        lineFibDataBean.getState().setLevel9(listGEmmrt);
                        break;
                    case 9:
                        lineFibDataBean.getState().setLevel10(listGEmmrt);
                        break;
                    case 10:
                        lineFibDataBean.getState().setLevel11(listGEmmrt);
                        break;
                    case 11:
                        lineFibDataBean.getState().setLevel12(listGEmmrt);
                        break;
                    case 12:
                        lineFibDataBean.getState().setLevel13(listGEmmrt);
                        break;
                    case 13:
                        lineFibDataBean.getState().setLevel14(listGEmmrt);
                        break;
                    case 14:
                        lineFibDataBean.getState().setLevel15(listGEmmrt);
                        break;
                    case 15:
                        lineFibDataBean.getState().setLevel16(listGEmmrt);
                        break;
                    case 16:
                        lineFibDataBean.getState().setLevel17(listGEmmrt);
                        break;
                    case 17:
                        lineFibDataBean.getState().setLevel18(listGEmmrt);
                        break;
                    case 18:
                        lineFibDataBean.getState().setLevel19(listGEmmrt);
                        break;
                    case 19:
                        lineFibDataBean.getState().setLevel20(listGEmmrt);
                        break;
                }
                i++;
            }
        }
    }

    public static /* synthetic */ void saveLineData2Db$default(C37895pEr c37895pEr, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "0";
        }
        c37895pEr.AEQbTJ(arrayList, str, str2, arrayList2, arrayList3);
    }

    public final void AEQbTJ(@NotNull java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.ArrayList<LineDataBean> arrayList2, @NotNull java.util.ArrayList<LineFibDataBean> arrayList3) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.lang.String str3 = str;
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        arrayList2.clear();
        arrayList3.clear();
        DrawingDataEntity drawingDataEntity = new DrawingDataEntity(null, null, null, 7, null);
        drawingDataEntity.setInstId(str2);
        if (str.length() == 0) {
            str3 = "0";
        }
        drawingDataEntity.setTimeVersion(str3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (DrawLineData.DrawLineItem drawLineItem : arrayList) {
            if (!drawLineItem.isDelete()) {
                LineDataBean lineDataBean = new LineDataBean(null, null, null, null, 0, null, null, 0, null, FrameMetricsAggregator.EVERY_DURATION, null);
                LineFibDataBean lineFibDataBean = new LineFibDataBean(null, null, null, null, 0, null, null, 0, null, FrameMetricsAggregator.EVERY_DURATION, null);
                if (drawLineItem.getLineType() == DrawLineData.LineType.FIBONACCI) {
                    lineFibDataBean.setId(drawLineItem.getIndexId());
                    C37895pEr c37895pEr = copydefault;
                    lineFibDataBean.setType(c37895pEr.OLrzqt(drawLineItem.getLineType()));
                    lineFibDataBean.setState(getLineFibDataState$default(c37895pEr, drawLineItem, str2 == null ? "" : str2, false, 4, null));
                    lineFibDataBean.setPoints(c37895pEr.OLrzqt(drawLineItem));
                    lineFibDataBean.setTimeStamp(drawLineItem.getTimeStamp());
                    c37895pEr.EZpvd(lineFibDataBean, drawLineItem);
                    arrayList3.add(lineFibDataBean);
                } else {
                    lineDataBean.setId(drawLineItem.getIndexId());
                    C37895pEr c37895pEr2 = copydefault;
                    lineDataBean.setType(c37895pEr2.OLrzqt(drawLineItem.getLineType()));
                    lineDataBean.setState(c37895pEr2.KWHzl(drawLineItem, str2 == null ? "" : str2));
                    lineDataBean.setPoints(c37895pEr2.OLrzqt(drawLineItem));
                    lineDataBean.setTimeStamp(drawLineItem.getTimeStamp());
                    arrayList2.add(lineDataBean);
                }
            }
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
            for (LineDataBean lineDataBean2 : arrayList2) {
                DrawingLinesData drawingLinesData = new DrawingLinesData(null, null, null, 7, null);
                drawingLinesData.setIndexId(lineDataBean2.getId());
                drawingLinesData.setLineData(new Gson().toJson(lineDataBean2));
                drawingLinesData.setTimeStamp(lineDataBean2.getTimeStamp());
                arrayList4.add(drawingLinesData);
            }
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList3)) {
            for (LineFibDataBean lineFibDataBean2 : arrayList3) {
                DrawingLinesData drawingLinesData2 = new DrawingLinesData(null, null, null, 7, null);
                drawingLinesData2.setIndexId(lineFibDataBean2.getId());
                drawingLinesData2.setLineData(new Gson().toJson(lineFibDataBean2));
                drawingLinesData2.setTimeStamp(lineFibDataBean2.getTimeStamp());
                arrayList4.add(drawingLinesData2);
            }
        }
        drawingDataEntity.setLines(new Gson().toJson(arrayList4));
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = new C31947mJv().OLrzqt(drawingDataEntity);
        if (abstractC58260yxtOLrzqt != null) {
            final Function1 function1 = new Function1() { // from class: o.pEw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37895pEr.KWHzl((java.lang.Long) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pEx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C37895pEr.djBIcL(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.pEE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37895pEr.KWHzl((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.pEC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C37895pEr.AhwBna(function12, obj);
                }
            });
        }
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        pUU.copydefault("OKKLine", "saveDrawingData画线数据存储失败: " + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull DrawingDataBean drawingDataBean, @NotNull java.util.ArrayList<LineDataBean> arrayList, @NotNull java.util.ArrayList<LineFibDataBean> arrayList2) {
        Intrinsics.checkNotNullParameter(drawingDataBean, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        DrawingDataEntity drawingDataEntity = new DrawingDataEntity(null, null, null, 7, null);
        drawingDataEntity.setInstId(drawingDataBean.getInstId());
        drawingDataEntity.setTimeVersion(drawingDataBean.getTimeVersion());
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            for (LineDataBean lineDataBean : arrayList) {
                DrawingLinesData drawingLinesData = new DrawingLinesData(null, null, null, 7, null);
                drawingLinesData.setIndexId(lineDataBean.getId());
                drawingLinesData.setLineData(new Gson().toJson(lineDataBean));
                drawingDataBean.getLines().add(drawingLinesData);
            }
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
            for (LineFibDataBean lineFibDataBean : arrayList2) {
                DrawingLinesData drawingLinesData2 = new DrawingLinesData(null, null, null, 7, null);
                drawingLinesData2.setIndexId(lineFibDataBean.getId());
                drawingLinesData2.setLineData(new Gson().toJson(lineFibDataBean));
                drawingDataBean.getLines().add(drawingLinesData2);
            }
        }
        drawingDataEntity.setLines(new Gson().toJson(drawingDataBean.getLines()));
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = new C31947mJv().OLrzqt(drawingDataEntity);
        if (abstractC58260yxtOLrzqt != null) {
            final Function1 function1 = new Function1() { // from class: o.pEs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37895pEr.EZpvd((java.lang.Long) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pEv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C37895pEr.AEQbTJ(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.pEy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37895pEr.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.pEz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C37895pEr.valueOf(function12, obj);
                }
            });
        }
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Long l) {
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        pUU.copydefault("OKKLine", "saveDrawingData画线数据存储失败: " + th.getMessage());
        return Unit.INSTANCE;
    }

    public final java.util.ArrayList<DrawLineData.DrawLineItem> AEQbTJ(@NotNull java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, @NotNull java.util.ArrayList<DrawLineData.DrawLineItem> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        arrayList.removeAll(arrayList2);
        return arrayList;
    }

    public final void copydefault(android.view.Window window, @NotNull android.webkit.WebView webView, @NotNull final Function1<? super android.graphics.Bitmap, Unit> function1) {
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (window != null) {
            int width = webView.getWidth();
            int height = webView.getHeight();
            if (width <= 0 || height <= 0) {
                function1.invoke(null);
                return;
            }
            final android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            if (Build.VERSION.SDK_INT >= 26) {
                android.graphics.Rect rect = new android.graphics.Rect();
                webView.getGlobalVisibleRect(rect);
                PixelCopy.request(window, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: o.pEA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i) {
                        C37895pEr.AEQbTJ(function1, bitmapCreateBitmap, i);
                    }
                }, new android.os.Handler(android.os.Looper.getMainLooper()));
            } else {
                webView.setLayerType(1, null);
                webView.draw(new android.graphics.Canvas(bitmapCreateBitmap));
                function1.invoke(bitmapCreateBitmap);
                webView.setLayerType(2, null);
            }
        }
    }

    public static final void AEQbTJ(Function1 function1, android.graphics.Bitmap bitmap, int i) {
        if (i == 0) {
            function1.invoke(bitmap);
        }
    }
}
