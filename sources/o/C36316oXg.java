package o;

import androidx.camera.video.AudioStats;
import com.google.gson.Gson;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.rxutils.RxBus;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36316oXg extends oWO {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public boolean DbNXlk;
    public DrawLineData.DrawLineItem djBIcL;
    public C36312oXc isConnected;
    public boolean values;

    private final boolean AEQbTJ(float f, float f2, float f3, float f4, float f5) {
        float f6 = f - f3;
        float f7 = f2 - f4;
        return (f6 * f6) + (f7 * f7) <= f5 * f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(DrawLineData.DrawLineItem drawLineItem) {
        this.djBIcL = drawLineItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36312oXc AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oWO
    public java.lang.String KWHzl() {
        return "StateMoveDrawing";
    }

    public C36316oXg(@NotNull C36312oXc c36312oXc) {
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        this.isConnected = c36312oXc;
    }

    @Override // o.oWO
    public boolean AkhnZx(@NotNull android.view.MotionEvent motionEvent) {
        C36250oUv c36250oUvDbNXlk;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.DbNXlk = false;
        if (motionEvent.getPointerCount() <= 2 && (c36250oUvDbNXlk = this.isConnected.DbNXlk()) != null) {
            c36250oUvDbNXlk.EZpvd(false);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0435 A[SYNTHETIC] */
    @Override // o.oWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AhwBna(@NotNull android.view.MotionEvent motionEvent) {
        int i;
        java.lang.Number numberValueOf;
        DrawLineData.DrawLineItem drawLineItemIsConnected;
        int i2;
        java.lang.Number numberValueOf2;
        float fFloatValue;
        DrawLineData.DrawLineItem drawLineItemIsConnected2;
        java.util.ArrayList<DrawLineData.Dot> dotList;
        DrawLineData.Dot dot;
        java.util.ArrayList<DrawLineData.Dot> dotList2;
        java.util.ArrayList<DrawLineData.Dot> dotList3;
        DrawLineData.Dot dot2;
        java.util.ArrayList<DrawLineData.Dot> dotList4;
        DrawLineData.Dot dot3;
        java.util.ArrayList<DrawLineData.Dot> dotList5;
        DrawLineData.Dot dot4;
        java.util.ArrayList<DrawLineData.Dot> dotList6;
        java.util.ArrayList<DrawLineData.Dot> dotList7;
        int i3;
        int i4;
        java.lang.Number numberValueOf3;
        float fFloatValue2;
        DrawLineData.DrawLineItem drawLineItem;
        java.util.ArrayList<DrawLineData.Dot> dotList8;
        DrawLineData.Dot dot5;
        java.util.ArrayList<DrawLineData.Dot> dotList9;
        java.util.ArrayList<DrawLineData.Dot> dotList10;
        DrawLineData.Dot dot6;
        java.util.ArrayList<DrawLineData.Dot> dotList11;
        DrawLineData.Dot dot7;
        java.util.ArrayList<DrawLineData.Dot> dotList12;
        DrawLineData.Dot dot8;
        java.util.ArrayList<DrawLineData.Dot> dotList13;
        DrawLineData.Dot dot9;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.AhwBna(motionEvent);
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        oVT ovt = c36246oUrCopydefault.iwGUEr().values().get(this.isConnected.DbNXlk().fIwbmz() + ".root");
        Intrinsics.copydefault(ovt);
        ovt.AEQbTJ((int) motionEvent.getX(), (int) motionEvent.getY());
        oWN own = c36246oUrCopydefault.DCJXGO().get("ds0");
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayListDxcTrN = c36246oUrCopydefault.RdAHlO() ? c36246oUrCopydefault.dxcTrN() : DrawLineData.copydefault.EZpvd();
        int size = arrayListDxcTrN.size();
        int i7 = -1;
        int i8 = 0;
        int i9 = -1;
        boolean z = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            arrayListDxcTrN.get(i10).setSelected(i7);
            int size2 = arrayListDxcTrN.get(i10).getDotList().size();
            boolean z2 = z;
            int i11 = i8;
            while (i11 < size2) {
                if (z2) {
                    i5 = i11;
                    i6 = size2;
                } else {
                    i5 = i11;
                    i6 = size2;
                    if (oUU.copydefault.copydefault(motionEvent, arrayListDxcTrN.get(i10).getDotList().get(i11).getX(), arrayListDxcTrN.get(i10).getDotList().get(i11).getY()) >= AudioStats.AUDIO_AMPLITUDE_NONE && !arrayListDxcTrN.get(i10).isDelete()) {
                        arrayListDxcTrN.get(i10).setSelected(i5 + 1);
                        arrayListDxcTrN.get(i10).getSelected();
                        this.djBIcL = (DrawLineData.DrawLineItem) new Gson().fromJson(new Gson().toJson(arrayListDxcTrN.get(i10)), DrawLineData.DrawLineItem.class);
                        DrawLineData.copydefault.KWHzl(arrayListDxcTrN.get(i10));
                        if (arrayListDxcTrN.get(i10).getLocked()) {
                            InterfaceC39508ptf interfaceC39508ptf = pFN.OLrzqt.copydefault().get();
                            if (interfaceC39508ptf != null) {
                                interfaceC39508ptf.setImageResource(C52761wXj.TaskDescription.unregister);
                            }
                        } else {
                            InterfaceC39508ptf interfaceC39508ptf2 = pFN.OLrzqt.copydefault().get();
                            if (interfaceC39508ptf2 != null) {
                                interfaceC39508ptf2.setImageResource(C52761wXj.TaskDescription.UUsvzU);
                            }
                        }
                        gEmmrt();
                        z2 = true;
                    }
                }
                i11 = i5 + 1;
                size2 = i6;
            }
            DrawLineData.DrawLineItem drawLineItem2 = arrayListDxcTrN.get(i10);
            if ((drawLineItem2 != null ? drawLineItem2.getLineType() : null) == DrawLineData.LineType.G_RECTANGLE) {
                if (!z2 && oUU.copydefault.copydefault(motionEvent, arrayListDxcTrN.get(i10).getDotList().get(i8).getX(), arrayListDxcTrN.get(i10).getDotList().get(1).getY()) >= AudioStats.AUDIO_AMPLITUDE_NONE && !arrayListDxcTrN.get(i10).isDelete()) {
                    arrayListDxcTrN.get(i10).setSelected(3);
                    this.djBIcL = (DrawLineData.DrawLineItem) new Gson().fromJson(new Gson().toJson(arrayListDxcTrN.get(i10)), DrawLineData.DrawLineItem.class);
                    DrawLineData.copydefault.KWHzl(arrayListDxcTrN.get(i10));
                    if (arrayListDxcTrN.get(i10).getLocked()) {
                        InterfaceC39508ptf interfaceC39508ptf3 = pFN.OLrzqt.copydefault().get();
                        if (interfaceC39508ptf3 != null) {
                            interfaceC39508ptf3.setImageResource(C52761wXj.TaskDescription.unregister);
                        }
                    } else {
                        InterfaceC39508ptf interfaceC39508ptf4 = pFN.OLrzqt.copydefault().get();
                        if (interfaceC39508ptf4 != null) {
                            interfaceC39508ptf4.setImageResource(C52761wXj.TaskDescription.UUsvzU);
                        }
                    }
                    gEmmrt();
                    z2 = true;
                }
                if (!z2 && oUU.copydefault.copydefault(motionEvent, arrayListDxcTrN.get(i10).getDotList().get(1).getX(), arrayListDxcTrN.get(i10).getDotList().get(i8).getY()) >= AudioStats.AUDIO_AMPLITUDE_NONE && !arrayListDxcTrN.get(i10).isDelete()) {
                    arrayListDxcTrN.get(i10).setSelected(4);
                    this.djBIcL = (DrawLineData.DrawLineItem) new Gson().fromJson(new Gson().toJson(arrayListDxcTrN.get(i10)), DrawLineData.DrawLineItem.class);
                    DrawLineData.copydefault.KWHzl(arrayListDxcTrN.get(i10));
                    if (arrayListDxcTrN.get(i10).getLocked()) {
                        InterfaceC39508ptf interfaceC39508ptf5 = pFN.OLrzqt.copydefault().get();
                        if (interfaceC39508ptf5 != null) {
                            interfaceC39508ptf5.setImageResource(C52761wXj.TaskDescription.unregister);
                        }
                    } else {
                        InterfaceC39508ptf interfaceC39508ptf6 = pFN.OLrzqt.copydefault().get();
                        if (interfaceC39508ptf6 != null) {
                            interfaceC39508ptf6.setImageResource(C52761wXj.TaskDescription.UUsvzU);
                        }
                    }
                    gEmmrt();
                    z2 = true;
                }
            }
            if (!z2) {
                oUU ouu = oUU.copydefault;
                if (ouu.copydefault(motionEvent, arrayListDxcTrN.get(i10).getLinePositionList()) >= AudioStats.AUDIO_AMPLITUDE_NONE && !arrayListDxcTrN.get(i10).isDelete() && (i9 < 0 || ouu.copydefault(motionEvent, arrayListDxcTrN.get(i10).getLinePositionList()) < ouu.copydefault(motionEvent, arrayListDxcTrN.get(i9).getLinePositionList()))) {
                    i9 = i10;
                }
            }
            if (arrayListDxcTrN.get(i10).getLineType() != DrawLineData.LineType.G_CIRCLE || i9 >= 0) {
                i3 = i10;
            } else {
                DrawLineData.DrawLineItem drawLineItem3 = arrayListDxcTrN.get(i10);
                float fFloatValue3 = ((drawLineItem3 == null || (dotList13 = drawLineItem3.getDotList()) == null || (dot9 = dotList13.get(i8)) == null) ? java.lang.Integer.valueOf(i8) : java.lang.Double.valueOf(dot9.getX())).floatValue();
                DrawLineData.DrawLineItem drawLineItem4 = arrayListDxcTrN.get(i10);
                float fFloatValue4 = ((drawLineItem4 == null || (dotList12 = drawLineItem4.getDotList()) == null || (dot8 = dotList12.get(i8)) == null) ? java.lang.Integer.valueOf(i8) : java.lang.Double.valueOf(dot8.getY())).floatValue();
                DrawLineData.DrawLineItem drawLineItem5 = arrayListDxcTrN.get(i10);
                float fFloatValue5 = ((drawLineItem5 == null || (dotList11 = drawLineItem5.getDotList()) == null || (dot7 = dotList11.get(1)) == null) ? java.lang.Integer.valueOf(i8) : java.lang.Double.valueOf(dot7.getX())).floatValue();
                DrawLineData.DrawLineItem drawLineItem6 = arrayListDxcTrN.get(i10);
                java.lang.Number numberValueOf4 = (drawLineItem6 == null || (dotList10 = drawLineItem6.getDotList()) == null || (dot6 = dotList10.get(1)) == null) ? java.lang.Integer.valueOf(i8) : java.lang.Double.valueOf(dot6.getY());
                double d = 2;
                float fSqrt = (float) java.lang.Math.sqrt(java.lang.Math.pow(fFloatValue3 - fFloatValue5, d) + java.lang.Math.pow(fFloatValue4 - numberValueOf4.floatValue(), d));
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                i3 = i10;
                DrawLineData.DrawLineItem drawLineItem7 = arrayListDxcTrN.get(i3);
                if (drawLineItem7 == null || (dotList9 = drawLineItem7.getDotList()) == null) {
                    i4 = 0;
                } else {
                    i4 = 0;
                    DrawLineData.Dot dot10 = dotList9.get(0);
                    if (dot10 != null) {
                        numberValueOf3 = java.lang.Double.valueOf(dot10.getX());
                    }
                    fFloatValue2 = numberValueOf3.floatValue();
                    drawLineItem = arrayListDxcTrN.get(i3);
                    if (!AEQbTJ(x, y, fFloatValue2, ((drawLineItem != null || (dotList8 = drawLineItem.getDotList()) == null || (dot5 = dotList8.get(i4)) == null) ? java.lang.Integer.valueOf(i4) : java.lang.Double.valueOf(dot5.getY())).floatValue(), fSqrt)) {
                        i9 = i3;
                    }
                }
                numberValueOf3 = java.lang.Integer.valueOf(i4);
                fFloatValue2 = numberValueOf3.floatValue();
                drawLineItem = arrayListDxcTrN.get(i3);
                if (drawLineItem != null) {
                    if (!AEQbTJ(x, y, fFloatValue2, ((drawLineItem != null || (dotList8 = drawLineItem.getDotList()) == null || (dot5 = dotList8.get(i4)) == null) ? java.lang.Integer.valueOf(i4) : java.lang.Double.valueOf(dot5.getY())).floatValue(), fSqrt)) {
                    }
                }
            }
            i10 = i3 + 1;
            z = z2;
            i7 = -1;
            i8 = 0;
        }
        if (i9 >= 0 && !C36246oUr.copydefault().QwvEab()) {
            if (arrayListDxcTrN.get(i9).getLineType() == DrawLineData.LineType.G_TRIANGLE) {
                arrayListDxcTrN.get(i9).setSelected(5);
            } else {
                arrayListDxcTrN.get(i9).setSelected(0);
            }
            this.djBIcL = (DrawLineData.DrawLineItem) new Gson().fromJson(new Gson().toJson(arrayListDxcTrN.get(i9)), DrawLineData.DrawLineItem.class);
            DrawLineData.copydefault.KWHzl(arrayListDxcTrN.get(i9));
            gEmmrt();
        } else if (!z && i9 == -1) {
            DrawLineData drawLineData = DrawLineData.copydefault;
            DrawLineData.DrawLineItem drawLineItemIsConnected3 = drawLineData.isConnected();
            if ((drawLineItemIsConnected3 != null ? drawLineItemIsConnected3.getLineType() : null) == DrawLineData.LineType.G_RECTANGLE) {
                copydefault();
            } else {
                DrawLineData.DrawLineItem drawLineItemIsConnected4 = drawLineData.isConnected();
                if ((drawLineItemIsConnected4 != null ? drawLineItemIsConnected4.getLineType() : null) == DrawLineData.LineType.G_TRIANGLE) {
                    DrawLineData.DrawLineItem drawLineItemIsConnected5 = drawLineData.isConnected();
                    if (drawLineItemIsConnected5 != null && (dotList7 = drawLineItemIsConnected5.getDotList()) != null && dotList7.size() == 3) {
                        copydefault();
                    }
                } else {
                    DrawLineData.DrawLineItem drawLineItemIsConnected6 = drawLineData.isConnected();
                    if ((drawLineItemIsConnected6 != null ? drawLineItemIsConnected6.getLineType() : null) == DrawLineData.LineType.G_CIRCLE) {
                        DrawLineData.DrawLineItem drawLineItemIsConnected7 = drawLineData.isConnected();
                        if (drawLineItemIsConnected7 == null || (dotList6 = drawLineItemIsConnected7.getDotList()) == null) {
                            i = 0;
                        } else {
                            i = 0;
                            DrawLineData.Dot dot11 = dotList6.get(0);
                            if (dot11 != null) {
                                numberValueOf = java.lang.Double.valueOf(dot11.getX());
                            }
                            float fFloatValue6 = numberValueOf.floatValue();
                            DrawLineData.DrawLineItem drawLineItemIsConnected8 = drawLineData.isConnected();
                            float fFloatValue7 = ((drawLineItemIsConnected8 != null || (dotList5 = drawLineItemIsConnected8.getDotList()) == null || (dot4 = dotList5.get(i)) == null) ? java.lang.Integer.valueOf(i) : java.lang.Double.valueOf(dot4.getY())).floatValue();
                            DrawLineData.DrawLineItem drawLineItemIsConnected9 = drawLineData.isConnected();
                            float fFloatValue8 = ((drawLineItemIsConnected9 != null || (dotList4 = drawLineItemIsConnected9.getDotList()) == null || (dot3 = dotList4.get(1)) == null) ? 0 : java.lang.Double.valueOf(dot3.getX())).floatValue();
                            DrawLineData.DrawLineItem drawLineItemIsConnected10 = drawLineData.isConnected();
                            double d2 = 2;
                            float fSqrt2 = (float) java.lang.Math.sqrt(java.lang.Math.pow(fFloatValue6 - fFloatValue8, d2) + java.lang.Math.pow(fFloatValue7 - ((drawLineItemIsConnected10 != null || (dotList3 = drawLineItemIsConnected10.getDotList()) == null || (dot2 = dotList3.get(1)) == null) ? 0 : java.lang.Double.valueOf(dot2.getY())).floatValue(), d2));
                            float x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            drawLineItemIsConnected = drawLineData.isConnected();
                            if (drawLineItemIsConnected != null || (dotList2 = drawLineItemIsConnected.getDotList()) == null) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                                DrawLineData.Dot dot12 = dotList2.get(0);
                                if (dot12 != null) {
                                    numberValueOf2 = java.lang.Double.valueOf(dot12.getX());
                                }
                                fFloatValue = numberValueOf2.floatValue();
                                drawLineItemIsConnected2 = drawLineData.isConnected();
                                if (!AEQbTJ(x2, y2, fFloatValue, ((drawLineItemIsConnected2 == null || (dotList = drawLineItemIsConnected2.getDotList()) == null || (dot = dotList.get(i2)) == null) ? java.lang.Integer.valueOf(i2) : java.lang.Double.valueOf(dot.getY())).floatValue(), fSqrt2)) {
                                    DrawLineData.DrawLineItem drawLineItemIsConnected11 = drawLineData.isConnected();
                                    if (drawLineItemIsConnected11 != null) {
                                        drawLineItemIsConnected11.setSelected(5);
                                    }
                                } else {
                                    copydefault();
                                }
                            }
                            numberValueOf2 = java.lang.Integer.valueOf(i2);
                            fFloatValue = numberValueOf2.floatValue();
                            drawLineItemIsConnected2 = drawLineData.isConnected();
                            if (drawLineItemIsConnected2 == null) {
                                if (!AEQbTJ(x2, y2, fFloatValue, ((drawLineItemIsConnected2 == null || (dotList = drawLineItemIsConnected2.getDotList()) == null || (dot = dotList.get(i2)) == null) ? java.lang.Integer.valueOf(i2) : java.lang.Double.valueOf(dot.getY())).floatValue(), fSqrt2)) {
                                }
                            }
                        }
                        numberValueOf = java.lang.Integer.valueOf(i);
                        float fFloatValue62 = numberValueOf.floatValue();
                        DrawLineData.DrawLineItem drawLineItemIsConnected82 = drawLineData.isConnected();
                        if (drawLineItemIsConnected82 != null) {
                            float fFloatValue72 = ((drawLineItemIsConnected82 != null || (dotList5 = drawLineItemIsConnected82.getDotList()) == null || (dot4 = dotList5.get(i)) == null) ? java.lang.Integer.valueOf(i) : java.lang.Double.valueOf(dot4.getY())).floatValue();
                            DrawLineData.DrawLineItem drawLineItemIsConnected92 = drawLineData.isConnected();
                            if (drawLineItemIsConnected92 != null) {
                                float fFloatValue82 = ((drawLineItemIsConnected92 != null || (dotList4 = drawLineItemIsConnected92.getDotList()) == null || (dot3 = dotList4.get(1)) == null) ? 0 : java.lang.Double.valueOf(dot3.getX())).floatValue();
                                DrawLineData.DrawLineItem drawLineItemIsConnected102 = drawLineData.isConnected();
                                if (drawLineItemIsConnected102 != null) {
                                    double d22 = 2;
                                    float fSqrt22 = (float) java.lang.Math.sqrt(java.lang.Math.pow(fFloatValue62 - fFloatValue82, d22) + java.lang.Math.pow(fFloatValue72 - ((drawLineItemIsConnected102 != null || (dotList3 = drawLineItemIsConnected102.getDotList()) == null || (dot2 = dotList3.get(1)) == null) ? 0 : java.lang.Double.valueOf(dot2.getY())).floatValue(), d22));
                                    float x22 = motionEvent.getX();
                                    float y22 = motionEvent.getY();
                                    drawLineItemIsConnected = drawLineData.isConnected();
                                    if (drawLineItemIsConnected != null) {
                                        i2 = 0;
                                        numberValueOf2 = java.lang.Integer.valueOf(i2);
                                        fFloatValue = numberValueOf2.floatValue();
                                        drawLineItemIsConnected2 = drawLineData.isConnected();
                                    }
                                }
                            }
                        }
                    } else {
                        copydefault();
                    }
                }
            }
        }
        this.isConnected.EZpvd(java.lang.System.currentTimeMillis());
        this.isConnected.copydefault(motionEvent.getX());
        this.isConnected.OLrzqt(motionEvent.getY());
        if (own != null) {
            own.sSMYrx();
        }
        if (own != null) {
            own.AwvSrB();
        }
        C36250oUv c36250oUvDbNXlk = this.isConnected.DbNXlk();
        if (c36250oUvDbNXlk == null) {
            return false;
        }
        c36250oUvDbNXlk.invalidate();
        return false;
    }

    public final void copydefault() {
        C36250oUv c36250oUvDbNXlk;
        C36250oUv c36250oUvDbNXlk2;
        DrawLineData.copydefault.KWHzl((DrawLineData.DrawLineItem) null);
        C36250oUv c36250oUvDbNXlk3 = this.isConnected.DbNXlk();
        if (c36250oUvDbNXlk3 != null && c36250oUvDbNXlk3.getNewProxyInstance() == 0 && (c36250oUvDbNXlk = this.isConnected.DbNXlk()) != null && c36250oUvDbNXlk.isConnected() == 1 && (c36250oUvDbNXlk2 = this.isConnected.DbNXlk()) != null && c36250oUvDbNXlk2.OcIXYQ()) {
            C36312oXc c36312oXc = this.isConnected;
            c36312oXc.EZpvd(c36312oXc.wlaJM);
        } else {
            C36312oXc c36312oXc2 = this.isConnected;
            c36312oXc2.EZpvd(c36312oXc2.getFieldNames);
        }
    }

    public final void gEmmrt() {
        DrawLineData drawLineData = DrawLineData.copydefault;
        DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
        java.lang.Integer numValueOf = drawLineItemIsConnected != null ? java.lang.Integer.valueOf(drawLineItemIsConnected.getSelected()) : null;
        DrawLineData.DrawLineItem drawLineItemIsConnected2 = drawLineData.isConnected();
        DrawLineData.LineType lineType = drawLineItemIsConnected2 != null ? drawLineItemIsConnected2.getLineType() : null;
        DrawLineData.DrawLineItem drawLineItemIsConnected3 = drawLineData.isConnected();
        if (drawLineItemIsConnected3 != null) {
            drawLineItemIsConnected3.getFillColor();
        }
        DrawLineData.DrawLineItem drawLineItemIsConnected4 = drawLineData.isConnected();
        if (drawLineItemIsConnected4 != null) {
            drawLineItemIsConnected4.getLinecolor();
        }
        Objects.toString(numValueOf);
        Objects.toString(lineType);
        DrawLineData.DrawLineItem drawLineItemIsConnected5 = drawLineData.isConnected();
        if (drawLineItemIsConnected5 != null) {
            drawLineData.EZpvd(drawLineItemIsConnected5.getLinecolor());
            drawLineData.AEQbTJ(drawLineItemIsConnected5.getLineColorBlk());
            drawLineData.copydefault(drawLineItemIsConnected5.getFillColor());
            drawLineData.KWHzl(drawLineItemIsConnected5.getFillColorBlk());
            drawLineData.OLrzqt(drawLineItemIsConnected5.getLinewidth());
            drawLineData.copydefault(drawLineItemIsConnected5.getLinestyle());
            drawLineData.EZpvd(drawLineItemIsConnected5.getFiboList());
            AhwBna();
        }
    }

    public final void AhwBna() {
        InterfaceC39508ptf interfaceC39508ptf = pFN.OLrzqt.copydefault().get();
        if (interfaceC39508ptf != null) {
            interfaceC39508ptf.ejfBZ();
            DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
            Intrinsics.copydefault(drawLineItemIsConnected);
            if (drawLineItemIsConnected.getLocked()) {
                interfaceC39508ptf.setImageResource(C52761wXj.TaskDescription.unregister);
            } else {
                interfaceC39508ptf.setImageResource(C52761wXj.TaskDescription.UUsvzU);
            }
        }
    }

    @Override // o.oWO
    public boolean AYXKKw(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.AYXKKw(motionEvent);
        C36312oXc c36312oXc = this.isConnected;
        c36312oXc.EZpvd(c36312oXc.zLjUOn);
        InterfaceC39508ptf interfaceC39508ptf = pFN.OLrzqt.copydefault().get();
        if (interfaceC39508ptf != null) {
            interfaceC39508ptf.fetchVPNInfo();
        }
        this.values = false;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0aa8  */
    @Override // o.oWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean DbNXlk(@NotNull android.view.MotionEvent motionEvent) {
        C36316oXg c36316oXg;
        com.okinc.kline.library.data.DataSource dataSource;
        C36316oXg c36316oXg2 = this;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.DbNXlk(motionEvent);
        if (!c36316oXg2.DbNXlk) {
            C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
            oWN own = c36246oUrCopydefault.DCJXGO().get("ds0");
            com.okinc.kline.library.data.DataSource dataSource2 = c36246oUrCopydefault.sSMYrx().get("ds0");
            oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get("ds0.m");
            if (own == null || dataSource2 == null || owc == null || dataSource2.AEQbTJ.size() < 2) {
                return true;
            }
            DrawLineData drawLineData = DrawLineData.copydefault;
            if (drawLineData.isConnected() != null && c36316oXg2.djBIcL != null) {
                DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
                Intrinsics.copydefault(drawLineItemIsConnected);
                java.lang.String indexId = drawLineItemIsConnected.getIndexId();
                DrawLineData.DrawLineItem drawLineItem = c36316oXg2.djBIcL;
                Intrinsics.copydefault(drawLineItem);
                if (Intrinsics.EZpvd((java.lang.Object) indexId, (java.lang.Object) drawLineItem.getIndexId())) {
                    DrawLineData.DrawLineItem drawLineItemIsConnected2 = drawLineData.isConnected();
                    Intrinsics.copydefault(drawLineItemIsConnected2);
                    if (drawLineItemIsConnected2.getLocked()) {
                        return true;
                    }
                    float x = motionEvent.getX() - c36316oXg2.isConnected.copydefault();
                    float y = motionEvent.getY() - c36316oXg2.isConnected.djBIcL();
                    DrawLineData.DrawLineItem drawLineItemIsConnected3 = drawLineData.isConnected();
                    Intrinsics.copydefault(drawLineItemIsConnected3);
                    int selected = drawLineItemIsConnected3.getSelected();
                    if (selected != 0) {
                        if (selected == 1) {
                            DrawLineData.DrawLineItem drawLineItemIsConnected4 = drawLineData.isConnected();
                            Intrinsics.copydefault(drawLineItemIsConnected4);
                            if (drawLineItemIsConnected4.getLineType() == DrawLineData.LineType.G_CIRCLE) {
                                AEQbTJ(owc, own, x, y, dataSource2);
                            } else {
                                DrawLineData.DrawLineItem drawLineItem2 = c36316oXg2.djBIcL;
                                if (drawLineItem2 != null) {
                                    Intrinsics.copydefault(drawLineItem2);
                                    if (drawLineItem2.getDotList().size() > 0) {
                                        ChartArea chartArea = C36246oUr.copydefault().values().get("ds0.m");
                                        int iDjBIcL = chartArea != null ? chartArea.djBIcL() : c36316oXg2.isConnected.DbNXlk().getHeight();
                                        DrawLineData.DrawLineItem drawLineItem3 = c36316oXg2.djBIcL;
                                        Intrinsics.copydefault(drawLineItem3);
                                        double d = y;
                                        double y2 = drawLineItem3.getDotList().get(0).getY() + d;
                                        if (y2 > iDjBIcL || y2 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                                            return true;
                                        }
                                        DrawLineData.DrawLineItem drawLineItemIsConnected5 = drawLineData.isConnected();
                                        Intrinsics.copydefault(drawLineItemIsConnected5);
                                        DrawLineData.Dot dot = drawLineItemIsConnected5.getDotList().get(0);
                                        Intrinsics.copydefault(c36316oXg2.djBIcL);
                                        dot.setTime((long) (r7.getDotList().get(0).getTime() + ((((long) x) / own.AhwBna()) * (dataSource2.AEQbTJ.get(1).AhwBna() - dataSource2.AEQbTJ.get(0).AhwBna()))));
                                        DrawLineData.DrawLineItem drawLineItemIsConnected6 = drawLineData.isConnected();
                                        Intrinsics.copydefault(drawLineItemIsConnected6);
                                        DrawLineData.Dot dot2 = drawLineItemIsConnected6.getDotList().get(0);
                                        DrawLineData.DrawLineItem drawLineItem4 = c36316oXg2.djBIcL;
                                        Intrinsics.copydefault(drawLineItem4);
                                        dot2.setPrice(drawLineItem4.getDotList().get(0).getPrice() + (((owc.EZpvd(owc.uzCIH()) - owc.EZpvd(owc.gEmmrt())) / ((double) (owc.uzCIH() - owc.gEmmrt()))) * d));
                                        DrawLineData.DrawLineItem drawLineItemIsConnected7 = drawLineData.isConnected();
                                        Intrinsics.copydefault(drawLineItemIsConnected7);
                                        if (drawLineItemIsConnected7.getLineType() != DrawLineData.LineType.H_SEGMENT) {
                                            DrawLineData.DrawLineItem drawLineItemIsConnected8 = drawLineData.isConnected();
                                            Intrinsics.copydefault(drawLineItemIsConnected8);
                                            if (drawLineItemIsConnected8.getLineType() == DrawLineData.LineType.H_RADIAL) {
                                                DrawLineData.DrawLineItem drawLineItemIsConnected9 = drawLineData.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected9);
                                                DrawLineData.Dot dot3 = drawLineItemIsConnected9.getDotList().get(1);
                                                DrawLineData.DrawLineItem drawLineItem5 = c36316oXg2.djBIcL;
                                                Intrinsics.copydefault(drawLineItem5);
                                                dot3.setPrice(drawLineItem5.getDotList().get(0).getPrice() + (d * ((owc.EZpvd(owc.uzCIH()) - owc.EZpvd(owc.gEmmrt())) / ((double) (owc.uzCIH() - owc.gEmmrt())))));
                                            }
                                            DrawLineData.DrawLineItem drawLineItemIsConnected10 = drawLineData.isConnected();
                                            Intrinsics.copydefault(drawLineItemIsConnected10);
                                            if (drawLineItemIsConnected10.getLineType() == DrawLineData.LineType.G_TRIANGLE) {
                                                DrawLineData.DrawLineItem drawLineItemIsConnected11 = drawLineData.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected11);
                                                double x2 = drawLineItemIsConnected11.getDotList().get(0).getX();
                                                DrawLineData.DrawLineItem drawLineItemIsConnected12 = drawLineData.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected12);
                                                pUU.copydefault("StateDrawing", "拖拽第1个点 G_TRIANGLE = dot1X" + x2 + "  dot1Y" + drawLineItemIsConnected12.getDotList().get(0).getPrice());
                                            }
                                            InterfaceC39508ptf interfaceC39508ptf = pFN.OLrzqt.copydefault().get();
                                            if (interfaceC39508ptf != null) {
                                                DrawLineData.DrawLineItem drawLineItemIsConnected13 = drawLineData.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected13);
                                                double x3 = drawLineItemIsConnected13.getDotList().get(0).getX();
                                                DrawLineData.DrawLineItem drawLineItemIsConnected14 = drawLineData.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected14);
                                                interfaceC39508ptf.KWHzl(x3, drawLineItemIsConnected14.getDotList().get(0).getY());
                                                Unit unit = Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (selected == 2) {
                            DrawLineData.DrawLineItem drawLineItemIsConnected15 = drawLineData.isConnected();
                            Intrinsics.copydefault(drawLineItemIsConnected15);
                            if (drawLineItemIsConnected15.getLineType() == DrawLineData.LineType.G_CIRCLE) {
                                ChartArea chartArea2 = C36246oUr.copydefault().values().get("ds0.m");
                                int iDjBIcL2 = chartArea2 != null ? chartArea2.djBIcL() : c36316oXg2.isConnected.DbNXlk().getHeight();
                                DrawLineData.DrawLineItem drawLineItem6 = c36316oXg2.djBIcL;
                                Intrinsics.copydefault(drawLineItem6);
                                double d2 = y;
                                double y3 = drawLineItem6.getDotList().get(1).getY() + d2;
                                if (y3 < iDjBIcL2 && y3 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                                    DrawLineData.DrawLineItem drawLineItemIsConnected16 = drawLineData.isConnected();
                                    Intrinsics.copydefault(drawLineItemIsConnected16);
                                    DrawLineData.Dot dot4 = drawLineItemIsConnected16.getDotList().get(1);
                                    Intrinsics.copydefault(c36316oXg2.djBIcL);
                                    dot4.setTime((long) (r7.getDotList().get(1).getTime() + ((((long) x) / own.AhwBna()) * (dataSource2.AEQbTJ.get(1).AhwBna() - dataSource2.AEQbTJ.get(0).AhwBna()))));
                                    DrawLineData.DrawLineItem drawLineItemIsConnected17 = drawLineData.isConnected();
                                    Intrinsics.copydefault(drawLineItemIsConnected17);
                                    DrawLineData.Dot dot5 = drawLineItemIsConnected17.getDotList().get(1);
                                    DrawLineData.DrawLineItem drawLineItem7 = c36316oXg2.djBIcL;
                                    Intrinsics.copydefault(drawLineItem7);
                                    dot5.setPrice(drawLineItem7.getDotList().get(1).getPrice() + (((owc.EZpvd(owc.uzCIH()) - owc.EZpvd(owc.gEmmrt())) / ((double) (owc.uzCIH() - owc.gEmmrt()))) * d2));
                                    DrawLineData.DrawLineItem drawLineItemIsConnected18 = drawLineData.isConnected();
                                    Intrinsics.copydefault(drawLineItemIsConnected18);
                                    DrawLineData.Dot dot6 = drawLineItemIsConnected18.getDotList().get(1);
                                    DrawLineData.DrawLineItem drawLineItem8 = c36316oXg2.djBIcL;
                                    Intrinsics.copydefault(drawLineItem8);
                                    dot6.setX(drawLineItem8.getDotList().get(1).getX() + ((double) x));
                                    DrawLineData.DrawLineItem drawLineItemIsConnected19 = drawLineData.isConnected();
                                    Intrinsics.copydefault(drawLineItemIsConnected19);
                                    DrawLineData.Dot dot7 = drawLineItemIsConnected19.getDotList().get(1);
                                    DrawLineData.DrawLineItem drawLineItem9 = c36316oXg2.djBIcL;
                                    Intrinsics.copydefault(drawLineItem9);
                                    dot7.setY(drawLineItem9.getDotList().get(1).getY() + d2);
                                    InterfaceC39508ptf interfaceC39508ptf2 = pFN.OLrzqt.copydefault().get();
                                    if (interfaceC39508ptf2 != null) {
                                        DrawLineData.DrawLineItem drawLineItemIsConnected20 = drawLineData.isConnected();
                                        Intrinsics.copydefault(drawLineItemIsConnected20);
                                        double x4 = drawLineItemIsConnected20.getDotList().get(1).getX();
                                        DrawLineData.DrawLineItem drawLineItemIsConnected21 = drawLineData.isConnected();
                                        Intrinsics.copydefault(drawLineItemIsConnected21);
                                        interfaceC39508ptf2.KWHzl(x4, drawLineItemIsConnected21.getDotList().get(1).getY());
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                }
                            } else {
                                DrawLineData.DrawLineItem drawLineItem10 = c36316oXg2.djBIcL;
                                if (drawLineItem10 != null) {
                                    Intrinsics.copydefault(drawLineItem10);
                                    if (drawLineItem10.getDotList().size() > 1) {
                                        ChartArea chartArea3 = C36246oUr.copydefault().values().get("ds0.m");
                                        int iDjBIcL3 = chartArea3 != null ? chartArea3.djBIcL() : c36316oXg2.isConnected.DbNXlk().getHeight();
                                        DrawLineData.DrawLineItem drawLineItem11 = c36316oXg2.djBIcL;
                                        Intrinsics.copydefault(drawLineItem11);
                                        double d3 = y;
                                        double y4 = drawLineItem11.getDotList().get(1).getY() + d3;
                                        if (y4 < iDjBIcL3 && y4 > AudioStats.AUDIO_AMPLITUDE_NONE && dataSource2.AEQbTJ.size() > 1) {
                                            DrawLineData.DrawLineItem drawLineItemIsConnected22 = drawLineData.isConnected();
                                            Intrinsics.copydefault(drawLineItemIsConnected22);
                                            if (drawLineItemIsConnected22.getLineType() != DrawLineData.LineType.H_SEGMENT) {
                                                DrawLineData.DrawLineItem drawLineItemIsConnected23 = drawLineData.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected23);
                                                if (drawLineItemIsConnected23.getLineType() == DrawLineData.LineType.H_RADIAL) {
                                                    DrawLineData.DrawLineItem drawLineItemIsConnected24 = drawLineData.isConnected();
                                                    Intrinsics.copydefault(drawLineItemIsConnected24);
                                                    DrawLineData.Dot dot8 = drawLineItemIsConnected24.getDotList().get(0);
                                                    DrawLineData.DrawLineItem drawLineItem12 = c36316oXg2.djBIcL;
                                                    Intrinsics.copydefault(drawLineItem12);
                                                    dot8.setPrice(drawLineItem12.getDotList().get(1).getPrice() + (((owc.EZpvd(owc.uzCIH()) - owc.EZpvd(owc.gEmmrt())) / ((double) (owc.uzCIH() - owc.gEmmrt()))) * d3));
                                                }
                                                DrawLineData.DrawLineItem drawLineItemIsConnected25 = drawLineData.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected25);
                                                DrawLineData.Dot dot9 = drawLineItemIsConnected25.getDotList().get(1);
                                                Intrinsics.copydefault(c36316oXg2.djBIcL);
                                                dot9.setTime((long) (r7.getDotList().get(1).getTime() + ((((long) x) / own.AhwBna()) * (dataSource2.AEQbTJ.get(1).AhwBna() - dataSource2.AEQbTJ.get(0).AhwBna()))));
                                                DrawLineData.DrawLineItem drawLineItemIsConnected26 = drawLineData.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected26);
                                                DrawLineData.Dot dot10 = drawLineItemIsConnected26.getDotList().get(1);
                                                DrawLineData.DrawLineItem drawLineItem13 = c36316oXg2.djBIcL;
                                                Intrinsics.copydefault(drawLineItem13);
                                                dot10.setPrice(drawLineItem13.getDotList().get(1).getPrice() + (d3 * ((owc.EZpvd(owc.uzCIH()) - owc.EZpvd(owc.gEmmrt())) / ((double) (owc.uzCIH() - owc.gEmmrt())))));
                                                InterfaceC39508ptf interfaceC39508ptf3 = pFN.OLrzqt.copydefault().get();
                                                if (interfaceC39508ptf3 != null) {
                                                    DrawLineData.DrawLineItem drawLineItemIsConnected27 = drawLineData.isConnected();
                                                    Intrinsics.copydefault(drawLineItemIsConnected27);
                                                    double x5 = drawLineItemIsConnected27.getDotList().get(1).getX();
                                                    DrawLineData.DrawLineItem drawLineItemIsConnected28 = drawLineData.isConnected();
                                                    Intrinsics.copydefault(drawLineItemIsConnected28);
                                                    interfaceC39508ptf3.KWHzl(x5, drawLineItemIsConnected28.getDotList().get(1).getY());
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (selected == 3) {
                            DrawLineData.DrawLineItem drawLineItem14 = c36316oXg2.djBIcL;
                            if (drawLineItem14 != null) {
                                Intrinsics.copydefault(drawLineItem14);
                                if (drawLineItem14.getDotList().size() > 1) {
                                    DrawLineData.DrawLineItem drawLineItemIsConnected29 = drawLineData.isConnected();
                                    Intrinsics.copydefault(drawLineItemIsConnected29);
                                    if (drawLineItemIsConnected29.getLineType() == DrawLineData.LineType.G_TRIANGLE) {
                                        ChartArea chartArea4 = C36246oUr.copydefault().values().get("ds0.m");
                                        int iDjBIcL4 = chartArea4 != null ? chartArea4.djBIcL() : c36316oXg2.isConnected.DbNXlk().getHeight();
                                        DrawLineData.DrawLineItem drawLineItem15 = c36316oXg2.djBIcL;
                                        Intrinsics.copydefault(drawLineItem15);
                                        double d4 = y;
                                        double y5 = drawLineItem15.getDotList().get(2).getY() + d4;
                                        if (y5 >= iDjBIcL4 || y5 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                                            x = x;
                                        } else {
                                            DrawLineData.DrawLineItem drawLineItemIsConnected30 = drawLineData.isConnected();
                                            Intrinsics.copydefault(drawLineItemIsConnected30);
                                            DrawLineData.Dot dot11 = drawLineItemIsConnected30.getDotList().get(2);
                                            Intrinsics.copydefault(c36316oXg2.djBIcL);
                                            x = x;
                                            dot11.setTime((long) (r8.getDotList().get(2).getTime() + ((((long) x) / own.AhwBna()) * (dataSource2.AEQbTJ.get(1).AhwBna() - dataSource2.AEQbTJ.get(0).AhwBna()))));
                                            DrawLineData.DrawLineItem drawLineItemIsConnected31 = drawLineData.isConnected();
                                            Intrinsics.copydefault(drawLineItemIsConnected31);
                                            DrawLineData.Dot dot12 = drawLineItemIsConnected31.getDotList().get(2);
                                            DrawLineData.DrawLineItem drawLineItem16 = c36316oXg2.djBIcL;
                                            Intrinsics.copydefault(drawLineItem16);
                                            dot12.setPrice(drawLineItem16.getDotList().get(2).getPrice() + (d4 * ((owc.EZpvd(owc.uzCIH()) - owc.EZpvd(owc.gEmmrt())) / ((double) (owc.uzCIH() - owc.gEmmrt())))));
                                        }
                                    }
                                    DrawLineData.DrawLineItem drawLineItemIsConnected32 = drawLineData.isConnected();
                                    Intrinsics.copydefault(drawLineItemIsConnected32);
                                    if (drawLineItemIsConnected32.getLineType() == DrawLineData.LineType.G_RECTANGLE) {
                                        ChartArea chartArea5 = C36246oUr.copydefault().values().get("ds0.m");
                                        int iDjBIcL5 = chartArea5 != null ? chartArea5.djBIcL() : c36316oXg2.isConnected.DbNXlk().getHeight();
                                        DrawLineData.DrawLineItem drawLineItem17 = c36316oXg2.djBIcL;
                                        Intrinsics.copydefault(drawLineItem17);
                                        double d5 = y;
                                        double y6 = drawLineItem17.getDotList().get(1).getY() + d5;
                                        if (y6 < iDjBIcL5 && y6 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                                            DrawLineData.DrawLineItem drawLineItemIsConnected33 = drawLineData.isConnected();
                                            Intrinsics.copydefault(drawLineItemIsConnected33);
                                            DrawLineData.Dot dot13 = drawLineItemIsConnected33.getDotList().get(0);
                                            Intrinsics.copydefault(c36316oXg2.djBIcL);
                                            dot13.setTime((long) (r2.getDotList().get(0).getTime() + ((((long) x) / own.AhwBna()) * (dataSource2.AEQbTJ.get(1).AhwBna() - dataSource2.AEQbTJ.get(0).AhwBna()))));
                                            DrawLineData.DrawLineItem drawLineItemIsConnected34 = drawLineData.isConnected();
                                            Intrinsics.copydefault(drawLineItemIsConnected34);
                                            DrawLineData.Dot dot14 = drawLineItemIsConnected34.getDotList().get(1);
                                            DrawLineData.DrawLineItem drawLineItem18 = c36316oXg2.djBIcL;
                                            Intrinsics.copydefault(drawLineItem18);
                                            dot14.setPrice(drawLineItem18.getDotList().get(1).getPrice() + (d5 * ((owc.EZpvd(owc.uzCIH()) - owc.EZpvd(owc.gEmmrt())) / ((double) (owc.uzCIH() - owc.gEmmrt())))));
                                            InterfaceC39508ptf interfaceC39508ptf4 = pFN.OLrzqt.copydefault().get();
                                            if (interfaceC39508ptf4 != null) {
                                                DrawLineData.DrawLineItem drawLineItemIsConnected35 = drawLineData.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected35);
                                                double x6 = drawLineItemIsConnected35.getDotList().get(0).getX();
                                                DrawLineData.DrawLineItem drawLineItemIsConnected36 = drawLineData.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected36);
                                                interfaceC39508ptf4.KWHzl(x6, drawLineItemIsConnected36.getDotList().get(1).getY());
                                                Unit unit4 = Unit.INSTANCE;
                                            }
                                        }
                                        Unit unit5 = Unit.INSTANCE;
                                    } else {
                                        InterfaceC39508ptf interfaceC39508ptf5 = pFN.OLrzqt.copydefault().get();
                                        if (interfaceC39508ptf5 != null) {
                                            DrawLineData.DrawLineItem drawLineItemIsConnected37 = drawLineData.isConnected();
                                            Intrinsics.copydefault(drawLineItemIsConnected37);
                                            double x7 = drawLineItemIsConnected37.getDotList().get(2).getX();
                                            DrawLineData.DrawLineItem drawLineItemIsConnected38 = drawLineData.isConnected();
                                            Intrinsics.copydefault(drawLineItemIsConnected38);
                                            interfaceC39508ptf5.KWHzl(x7, drawLineItemIsConnected38.getDotList().get(2).getY());
                                            Unit unit6 = Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        } else if (selected == 4) {
                            DrawLineData.DrawLineItem drawLineItemIsConnected39 = drawLineData.isConnected();
                            Intrinsics.copydefault(drawLineItemIsConnected39);
                            if (drawLineItemIsConnected39.getLineType() == DrawLineData.LineType.G_RECTANGLE) {
                                ChartArea chartArea6 = C36246oUr.copydefault().values().get("ds0.m");
                                int iDjBIcL6 = chartArea6 != null ? chartArea6.djBIcL() : c36316oXg2.isConnected.DbNXlk().getHeight();
                                DrawLineData.DrawLineItem drawLineItem19 = c36316oXg2.djBIcL;
                                Intrinsics.copydefault(drawLineItem19);
                                double d6 = y;
                                double y7 = drawLineItem19.getDotList().get(0).getY() + d6;
                                if (y7 < iDjBIcL6 && y7 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                                    DrawLineData.DrawLineItem drawLineItemIsConnected40 = drawLineData.isConnected();
                                    Intrinsics.copydefault(drawLineItemIsConnected40);
                                    DrawLineData.Dot dot15 = drawLineItemIsConnected40.getDotList().get(1);
                                    Intrinsics.copydefault(c36316oXg2.djBIcL);
                                    dot15.setTime((long) (r10.getDotList().get(1).getTime() + ((((long) x) / own.AhwBna()) * (dataSource2.AEQbTJ.get(1).AhwBna() - dataSource2.AEQbTJ.get(0).AhwBna()))));
                                    DrawLineData.DrawLineItem drawLineItemIsConnected41 = drawLineData.isConnected();
                                    Intrinsics.copydefault(drawLineItemIsConnected41);
                                    DrawLineData.Dot dot16 = drawLineItemIsConnected41.getDotList().get(0);
                                    DrawLineData.DrawLineItem drawLineItem20 = c36316oXg2.djBIcL;
                                    Intrinsics.copydefault(drawLineItem20);
                                    dot16.setPrice(drawLineItem20.getDotList().get(0).getPrice() + (d6 * ((owc.EZpvd(owc.uzCIH()) - owc.EZpvd(owc.gEmmrt())) / ((double) (owc.uzCIH() - owc.gEmmrt())))));
                                    InterfaceC39508ptf interfaceC39508ptf6 = pFN.OLrzqt.copydefault().get();
                                    if (interfaceC39508ptf6 != null) {
                                        DrawLineData.DrawLineItem drawLineItemIsConnected42 = drawLineData.isConnected();
                                        Intrinsics.copydefault(drawLineItemIsConnected42);
                                        double x8 = drawLineItemIsConnected42.getDotList().get(1).getX();
                                        DrawLineData.DrawLineItem drawLineItemIsConnected43 = drawLineData.isConnected();
                                        Intrinsics.copydefault(drawLineItemIsConnected43);
                                        interfaceC39508ptf6.KWHzl(x8, drawLineItemIsConnected43.getDotList().get(0).getY());
                                        Unit unit7 = Unit.INSTANCE;
                                    }
                                }
                            }
                        } else if (selected == 5) {
                            AEQbTJ(owc, own, x, y, dataSource2);
                        }
                        c36316oXg = c36316oXg2;
                    } else {
                        own.AwvSrB();
                        DrawLineData.DrawLineItem drawLineItemIsConnected44 = drawLineData.isConnected();
                        Intrinsics.copydefault(drawLineItemIsConnected44);
                        if (drawLineItemIsConnected44.getLineType() != DrawLineData.LineType.G_CIRCLE) {
                            DrawLineData.DrawLineItem drawLineItemIsConnected45 = drawLineData.isConnected();
                            Intrinsics.copydefault(drawLineItemIsConnected45);
                            if (drawLineItemIsConnected45.getLineType() != DrawLineData.LineType.G_TRIANGLE) {
                                DrawLineData.DrawLineItem drawLineItemIsConnected46 = drawLineData.isConnected();
                                Intrinsics.copydefault(drawLineItemIsConnected46);
                                if (drawLineItemIsConnected46.getLineType() == DrawLineData.LineType.G_RECTANGLE) {
                                    c36316oXg = this;
                                    c36316oXg.AEQbTJ(owc, own, x, y, dataSource2);
                                } else {
                                    DrawLineData.DrawLineItem drawLineItemIsConnected47 = drawLineData.isConnected();
                                    Intrinsics.copydefault(drawLineItemIsConnected47);
                                    int size = drawLineItemIsConnected47.getDotList().size();
                                    boolean z = false;
                                    for (int i = 0; i < size; i++) {
                                        ChartArea chartArea7 = C36246oUr.copydefault().values().get("ds0.m");
                                        int iDjBIcL7 = chartArea7 != null ? chartArea7.djBIcL() : c36316oXg2.isConnected.DbNXlk().getHeight();
                                        DrawLineData.DrawLineItem drawLineItem21 = c36316oXg2.djBIcL;
                                        Intrinsics.copydefault(drawLineItem21);
                                        double y8 = drawLineItem21.getDotList().get(i).getY() + ((double) y);
                                        if (y8 > iDjBIcL7 || y8 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        return true;
                                    }
                                    DrawLineData.DrawLineItem drawLineItemIsConnected48 = DrawLineData.copydefault.isConnected();
                                    Intrinsics.copydefault(drawLineItemIsConnected48);
                                    int size2 = drawLineItemIsConnected48.getDotList().size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        DrawLineData.DrawLineItem drawLineItem22 = c36316oXg2.djBIcL;
                                        if (drawLineItem22 != null) {
                                            Intrinsics.copydefault(drawLineItem22);
                                            if (drawLineItem22.getDotList().size() > i2) {
                                                DrawLineData drawLineData2 = DrawLineData.copydefault;
                                                DrawLineData.DrawLineItem drawLineItemIsConnected49 = drawLineData2.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected49);
                                                DrawLineData.Dot dot17 = drawLineItemIsConnected49.getDotList().get(i2);
                                                Intrinsics.copydefault(c36316oXg2.djBIcL);
                                                dot17.setTime((long) (r8.getDotList().get(i2).getTime() + ((((long) x) / own.AhwBna()) * (dataSource2.AEQbTJ.get(1).AhwBna() - dataSource2.AEQbTJ.get(0).AhwBna()))));
                                                DrawLineData.DrawLineItem drawLineItemIsConnected50 = drawLineData2.isConnected();
                                                Intrinsics.copydefault(drawLineItemIsConnected50);
                                                DrawLineData.Dot dot18 = drawLineItemIsConnected50.getDotList().get(i2);
                                                DrawLineData.DrawLineItem drawLineItem23 = c36316oXg2.djBIcL;
                                                Intrinsics.copydefault(drawLineItem23);
                                                dataSource = dataSource2;
                                                dot18.setPrice(drawLineItem23.getDotList().get(i2).getPrice() + (((double) y) * ((owc.EZpvd(owc.uzCIH()) - owc.EZpvd(owc.gEmmrt())) / ((double) (owc.uzCIH() - owc.gEmmrt())))));
                                            } else {
                                                dataSource = dataSource2;
                                            }
                                        }
                                        i2++;
                                        c36316oXg2 = this;
                                        dataSource2 = dataSource;
                                    }
                                    c36316oXg = this;
                                }
                            }
                        }
                    }
                    c36316oXg.isConnected.DbNXlk().invalidate();
                    c36316oXg.values = true;
                    return true;
                }
            }
            float x9 = motionEvent.getX();
            float fCopydefault = c36316oXg2.isConnected.copydefault();
            oWN own2 = C36246oUr.copydefault().DCJXGO().get(c36316oXg2.isConnected.DbNXlk().fIwbmz());
            if (own2 != null) {
                own2.AhwBna(x9 - fCopydefault);
                c36316oXg2.isConnected.copydefault(motionEvent.getX());
                Unit unit8 = Unit.INSTANCE;
            }
            c36316oXg2.isConnected.DbNXlk().invalidate();
            c36316oXg2.isConnected.DbNXlk().EZpvd(true);
            return true;
        }
        float fCopydefault2 = C36326oXq.copydefault(motionEvent);
        if (java.lang.Math.abs(fCopydefault2 - c36316oXg2.isConnected.fetchVPNInfo()) <= android.view.ViewConfiguration.get(c36316oXg2.isConnected.DbNXlk().getContext()).getScaledTouchSlop()) {
            return true;
        }
        C36246oUr c36246oUrCopydefault2 = C36246oUr.copydefault();
        oWN own3 = c36246oUrCopydefault2.DCJXGO().get("ds0");
        Intrinsics.copydefault(own3);
        own3.EZpvd(true);
        oWN own4 = c36246oUrCopydefault2.DCJXGO().get("ds0");
        Intrinsics.copydefault(own4);
        own4.EZpvd(fCopydefault2 - c36316oXg2.isConnected.fetchVPNInfo(), fCopydefault2 > c36316oXg2.isConnected.fetchVPNInfo() ? 1 : -1);
        c36316oXg2.isConnected.EZpvd(fCopydefault2);
        c36316oXg2.isConnected.DbNXlk().invalidate();
        c36316oXg2.isConnected.DbNXlk().EZpvd(true);
        return true;
    }

    @Override // o.oWO
    public boolean values(@NotNull android.view.MotionEvent motionEvent) {
        oWN own;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getPointerCount() > 2) {
            return true;
        }
        this.isConnected.EZpvd(C36326oXq.copydefault(motionEvent));
        if (this.isConnected.fetchVPNInfo() > android.view.ViewConfiguration.get(this.isConnected.DbNXlk().getContext()).getScaledTouchSlop() && (own = C36246oUr.copydefault().DCJXGO().get("ds0")) != null) {
            own.AxsJAY();
            own.OLrzqt(0, 0);
            own.valueOf(own.fJNWhG());
        }
        this.isConnected.DbNXlk().EZpvd(true);
        this.DbNXlk = true;
        return true;
    }

    @Override // o.oWO
    public boolean fetchVPNInfo(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.isConnected.DbNXlk().EZpvd(false);
        oWN own = C36246oUr.copydefault().DCJXGO().get(this.isConnected.DbNXlk().fIwbmz());
        if (own != null) {
            own.gEmmrt();
            own.EZpvd(false);
            own.AwvSrB();
            own.AEQbTJ(false);
        }
        InterfaceC39508ptf interfaceC39508ptf = pFN.OLrzqt.copydefault().get();
        if (interfaceC39508ptf != null) {
            interfaceC39508ptf.fetchVPNInfo();
        }
        if (this.values) {
            RxBus.KWHzl("kline_drawing_data_upload");
            this.values = false;
        }
        DrawLineData drawLineData = DrawLineData.copydefault;
        if (drawLineData.isConnected() != null) {
            DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
            Intrinsics.copydefault(drawLineItemIsConnected);
            drawLineItemIsConnected.setSelected(0);
        }
        C36250oUv c36250oUvDbNXlk = this.isConnected.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.invalidate();
        }
        return false;
    }

    @Override // o.oWO
    public void AEQbTJ(boolean z) {
        if (z) {
            C36312oXc c36312oXc = this.isConnected;
            c36312oXc.EZpvd(c36312oXc.getFieldNames);
            C36246oUr.copydefault().valueOf(true);
        } else {
            C36312oXc c36312oXc2 = this.isConnected;
            c36312oXc2.EZpvd(c36312oXc2.zLjUOn);
            C36246oUr.copydefault().valueOf(false);
        }
    }

    /* JADX INFO: renamed from: o.oXg$Application */
    public static final class Application implements InterfaceC39560pue {
        public Application() {
        }

        @Override // o.InterfaceC39560pue
        public void OLrzqt() {
            C36250oUv c36250oUvDbNXlk;
            C36250oUv c36250oUvDbNXlk2;
            java.util.Iterator<DrawLineData.DrawLineItem> it = C36246oUr.copydefault().dxcTrN().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                DrawLineData.DrawLineItem next = it.next();
                Intrinsics.copydefault(next, "");
                if (next.getSelected() != -1) {
                    it.remove();
                }
            }
            C36250oUv c36250oUvDbNXlk3 = C36316oXg.this.AYXKKw().DbNXlk();
            if (c36250oUvDbNXlk3 != null && c36250oUvDbNXlk3.getNewProxyInstance() == 0 && (c36250oUvDbNXlk = C36316oXg.this.AYXKKw().DbNXlk()) != null && c36250oUvDbNXlk.isConnected() == 1 && (c36250oUvDbNXlk2 = C36316oXg.this.AYXKKw().DbNXlk()) != null && c36250oUvDbNXlk2.OcIXYQ()) {
                C36316oXg.this.AYXKKw().EZpvd(C36316oXg.this.AYXKKw().wlaJM);
            } else {
                C36316oXg.this.AYXKKw().EZpvd(C36316oXg.this.AYXKKw().getFieldNames);
            }
            C36250oUv c36250oUvDbNXlk4 = C36316oXg.this.AYXKKw().DbNXlk();
            if (c36250oUvDbNXlk4 != null) {
                c36250oUvDbNXlk4.invalidate();
            }
        }

        @Override // o.InterfaceC39560pue
        public void KWHzl() {
            DrawLineData drawLineData = DrawLineData.copydefault;
            if (drawLineData.isConnected() != null) {
                DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
                Intrinsics.copydefault(drawLineItemIsConnected);
                if (drawLineItemIsConnected.getLocked()) {
                    InterfaceC39508ptf interfaceC39508ptf = pFN.OLrzqt.copydefault().get();
                    if (interfaceC39508ptf != null) {
                        interfaceC39508ptf.setImageResource(C52761wXj.TaskDescription.unregister);
                        return;
                    }
                    return;
                }
                InterfaceC39508ptf interfaceC39508ptf2 = pFN.OLrzqt.copydefault().get();
                if (interfaceC39508ptf2 != null) {
                    interfaceC39508ptf2.setImageResource(C52761wXj.TaskDescription.UUsvzU);
                    return;
                }
                return;
            }
            java.util.Iterator<DrawLineData.DrawLineItem> it = C36246oUr.copydefault().dxcTrN().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                DrawLineData.DrawLineItem next = it.next();
                Intrinsics.copydefault(next, "");
                DrawLineData.DrawLineItem drawLineItem = next;
                if (drawLineItem.getSelected() != -1) {
                    if (drawLineItem.getLocked()) {
                        drawLineItem.setLineLocked(false);
                        InterfaceC39508ptf interfaceC39508ptf3 = pFN.OLrzqt.copydefault().get();
                        if (interfaceC39508ptf3 != null) {
                            interfaceC39508ptf3.setImageResource(C52761wXj.TaskDescription.UUsvzU);
                        }
                    } else {
                        drawLineItem.setLineLocked(true);
                        InterfaceC39508ptf interfaceC39508ptf4 = pFN.OLrzqt.copydefault().get();
                        if (interfaceC39508ptf4 != null) {
                            interfaceC39508ptf4.setImageResource(C52761wXj.TaskDescription.unregister);
                        }
                    }
                }
            }
        }
    }

    @Override // o.oWO
    public void EZpvd() {
        pFN pfn = pFN.OLrzqt;
        InterfaceC39508ptf interfaceC39508ptf = pfn.copydefault().get();
        if (interfaceC39508ptf != null) {
            interfaceC39508ptf.AkhnZx();
        }
        InterfaceC39508ptf interfaceC39508ptf2 = pfn.copydefault().get();
        if (interfaceC39508ptf2 != null) {
            interfaceC39508ptf2.setClickLockListener(new Application());
        }
        gEmmrt();
    }

    @Override // o.oWO
    public void OLrzqt() {
        InterfaceC39508ptf interfaceC39508ptf = pFN.OLrzqt.copydefault().get();
        if (interfaceC39508ptf != null) {
            interfaceC39508ptf.valueOf();
        }
        DrawLineData.copydefault.KWHzl((DrawLineData.DrawLineItem) null);
        java.util.Iterator<DrawLineData.DrawLineItem> it = C36246oUr.copydefault().dxcTrN().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            it.next().setSelected(-1);
        }
        this.values = false;
        if (C36246oUr.copydefault().RdAHlO()) {
            return;
        }
        java.util.Iterator<DrawLineData.DrawLineItem> it2 = DrawLineData.copydefault.EZpvd().iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "");
        while (it2.hasNext()) {
            DrawLineData.DrawLineItem next = it2.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            next.setSelected(-1);
        }
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd(drawLineData.EZpvd());
    }

    public final void AEQbTJ(oWC owc, oWN own, float f, float f2, com.okinc.kline.library.data.DataSource dataSource) {
        int i;
        DrawLineData.DrawLineItem drawLineItemIsConnected;
        DrawLineData.DrawLineItem drawLineItemIsConnected2 = DrawLineData.copydefault.isConnected();
        Intrinsics.copydefault(drawLineItemIsConnected2);
        int size = drawLineItemIsConnected2.getDotList().size();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (true) {
            i = 1;
            if (i3 >= size) {
                break;
            }
            ChartArea chartArea = C36246oUr.copydefault().values().get("ds0.m");
            int iDjBIcL = chartArea != null ? chartArea.djBIcL() : this.isConnected.DbNXlk().getHeight();
            DrawLineData.DrawLineItem drawLineItem = this.djBIcL;
            Intrinsics.copydefault(drawLineItem);
            double y = drawLineItem.getDotList().get(i3).getY() + ((double) f2);
            if (y > iDjBIcL || y < AudioStats.AUDIO_AMPLITUDE_NONE) {
                z = true;
            }
            i3++;
        }
        if (z) {
            return;
        }
        DrawLineData.DrawLineItem drawLineItemIsConnected3 = DrawLineData.copydefault.isConnected();
        Intrinsics.copydefault(drawLineItemIsConnected3);
        int size2 = drawLineItemIsConnected3.getDotList().size();
        int i4 = 0;
        while (i4 < size2) {
            DrawLineData.DrawLineItem drawLineItem2 = this.djBIcL;
            if (drawLineItem2 != null) {
                Intrinsics.copydefault(drawLineItem2);
                if (drawLineItem2.getDotList().size() > i4) {
                    DrawLineData drawLineData = DrawLineData.copydefault;
                    DrawLineData.DrawLineItem drawLineItemIsConnected4 = drawLineData.isConnected();
                    Intrinsics.copydefault(drawLineItemIsConnected4);
                    drawLineItemIsConnected4.getDotList().get(i4).getX();
                    DrawLineData.DrawLineItem drawLineItemIsConnected5 = drawLineData.isConnected();
                    Intrinsics.copydefault(drawLineItemIsConnected5);
                    drawLineItemIsConnected5.getDotList().get(i4).getY();
                    DrawLineData.DrawLineItem drawLineItemIsConnected6 = drawLineData.isConnected();
                    Intrinsics.copydefault(drawLineItemIsConnected6);
                    DrawLineData.Dot dot = drawLineItemIsConnected6.getDotList().get(i4);
                    Intrinsics.copydefault(this.djBIcL);
                    dot.setTime((long) (r11.getDotList().get(i4).getTime() + ((((long) f) / own.AhwBna()) * (dataSource.AEQbTJ.get(i).AhwBna() - dataSource.AEQbTJ.get(i2).AhwBna()))));
                    DrawLineData.DrawLineItem drawLineItemIsConnected7 = drawLineData.isConnected();
                    Intrinsics.copydefault(drawLineItemIsConnected7);
                    DrawLineData.Dot dot2 = drawLineItemIsConnected7.getDotList().get(i4);
                    DrawLineData.DrawLineItem drawLineItem3 = this.djBIcL;
                    Intrinsics.copydefault(drawLineItem3);
                    double d = f2;
                    dot2.setPrice(drawLineItem3.getDotList().get(i4).getPrice() + (((owc.EZpvd(owc.uzCIH()) - owc.EZpvd(owc.gEmmrt())) / ((double) (owc.uzCIH() - owc.gEmmrt()))) * d));
                    DrawLineData.DrawLineItem drawLineItemIsConnected8 = drawLineData.isConnected();
                    Intrinsics.copydefault(drawLineItemIsConnected8);
                    DrawLineData.Dot dot3 = drawLineItemIsConnected8.getDotList().get(i4);
                    DrawLineData.DrawLineItem drawLineItem4 = this.djBIcL;
                    Intrinsics.copydefault(drawLineItem4);
                    dot3.setX(drawLineItem4.getDotList().get(i4).getX() + ((double) f));
                    DrawLineData.DrawLineItem drawLineItemIsConnected9 = drawLineData.isConnected();
                    Intrinsics.copydefault(drawLineItemIsConnected9);
                    DrawLineData.Dot dot4 = drawLineItemIsConnected9.getDotList().get(i4);
                    DrawLineData.DrawLineItem drawLineItem5 = this.djBIcL;
                    Intrinsics.copydefault(drawLineItem5);
                    dot4.setY(drawLineItem5.getDotList().get(i4).getY() + d);
                    DrawLineData.DrawLineItem drawLineItemIsConnected10 = drawLineData.isConnected();
                    Intrinsics.copydefault(drawLineItemIsConnected10);
                    drawLineItemIsConnected10.getDotList().get(i4).getX();
                    DrawLineData.DrawLineItem drawLineItemIsConnected11 = drawLineData.isConnected();
                    Intrinsics.copydefault(drawLineItemIsConnected11);
                    drawLineItemIsConnected11.getDotList().get(i4).getY();
                }
            }
            i4++;
            i2 = 0;
            i = 1;
        }
        DrawLineData drawLineData2 = DrawLineData.copydefault;
        DrawLineData.DrawLineItem drawLineItemIsConnected12 = drawLineData2.isConnected();
        if ((drawLineItemIsConnected12 != null ? drawLineItemIsConnected12.getLineType() : null) != DrawLineData.LineType.G_CIRCLE || (drawLineItemIsConnected = drawLineData2.isConnected()) == null) {
            return;
        }
        drawLineItemIsConnected.setSelected(5);
    }

    /* JADX INFO: renamed from: o.oXg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oXg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
