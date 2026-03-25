package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.okinc.kline.library.layout.ChartArea;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import o.pDT;

/* JADX INFO: loaded from: classes8.dex */
public class oVX extends oVT {
    public java.util.Set<java.lang.Integer> ejfBZ;
    public int fARcdN;
    public final android.graphics.Paint getFieldNames;
    public final android.graphics.Paint getNewProxyInstance;
    public boolean hDKMBd;
    public final android.graphics.Paint iwGUEr;
    public final android.graphics.Paint uzCIH;
    public int zLjUOn;

    private void AEQbTJ(java.lang.String str) {
    }

    public oVX(java.lang.String str) {
        super(str);
        this.hDKMBd = false;
        this.zLjUOn = 0;
        this.ejfBZ = new java.util.HashSet();
        this.fARcdN = C33052mpF.EZpvd(24.0f, (android.content.Context) C43246rlf.OLrzqt.valueOf());
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getFieldNames = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.getNewProxyInstance = paint2;
        paint2.setStyle(Paint.Style.FILL);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        paint2.setColor(stateListAnimator.KWHzl().AYXKKw());
        paint2.setAlpha(25);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.uzCIH = paint3;
        paint3.setColor(stateListAnimator.KWHzl().fetchVPNInfo());
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.iwGUEr = paint4;
        paint4.setStyle(style);
    }

    @Override // com.okinc.kline.library.layout.ChartArea
    public void OLrzqt(int i, int i2) {
        int iAKErDB;
        int iIsConnected;
        copydefault(i, i2);
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        C36307oWy c36307oWy = (C36307oWy) c36246oUrCopydefault.copydefault.get(this.fIwbmz.AEQbTJ() + ".m");
        int size = this.fJNWhG.size();
        AbstractC36262oVg abstractC36262oVgAEQbTJ = c36246oUrCopydefault.AEQbTJ(copydefault(), "VOLUME");
        boolean z = true;
        if (abstractC36262oVgAEQbTJ == null || !abstractC36262oVgAEQbTJ.AYXKKw().equals("VOLUMEM")) {
            this.hDKMBd = false;
        } else {
            this.hDKMBd = true;
        }
        if (c36246oUrCopydefault.fjfviF()) {
            iAKErDB = c36246oUrCopydefault.accept();
        } else {
            iAKErDB = c36246oUrCopydefault.aKErDB();
        }
        if (((size + 1) >> 1) < 0 || i <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ChartArea chartArea : this.fJNWhG) {
            if (chartArea.valueOf()) {
                arrayList.add(chartArea);
            }
        }
        int size2 = arrayList.size();
        int[] iArr = new int[size2];
        int iDjBIcL = i2;
        for (int i3 = size2 - 1; i3 > 0; i3--) {
            if (!this.ejfBZ.contains(java.lang.Integer.valueOf(i3))) {
                if (c36246oUrCopydefault.getNewProxyInstance() == 1) {
                    if (((ChartArea) arrayList.get(i3)).EZpvd().equals("ds0.mVOLUME")) {
                        break;
                    }
                    iArr[i3] = ((ChartArea) arrayList.get(i3)).djBIcL();
                    iDjBIcL -= ((ChartArea) arrayList.get(i3)).djBIcL();
                    AEQbTJ(" rh" + i3 + ": " + iArr[i3]);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(" h:");
                    sb.append(iDjBIcL);
                    AEQbTJ(sb.toString());
                    AEQbTJ("height" + i2);
                    if (iArr[i3] == 0) {
                        iArr[i3] = iAKErDB;
                    }
                } else {
                    iArr[i3] = iAKErDB;
                }
                iDjBIcL -= iAKErDB;
            }
        }
        if (c36246oUrCopydefault.getNewProxyInstance() == 1) {
            int iAhwBna = iDjBIcL - c36307oWy.AhwBna();
            AEQbTJ("=========================");
            AEQbTJ("calculateHeight mainChart:" + iAhwBna);
            AEQbTJ("mainAreaMiniSize " + this.fJNWhG.get(0).isConnected);
            for (int i4 = 0; i4 < size2; i4++) {
                AEQbTJ("rh" + i4 + ":" + iArr[i4]);
            }
            if (iAhwBna < this.fJNWhG.get(0).isConnected) {
                iArr[0] = this.fJNWhG.get(0).isConnected;
                if (c36246oUrCopydefault.zLjUOn().isDragSubIndicatorOrNot()) {
                    int iDjBIcL2 = this.fJNWhG.get(0).isConnected - iAhwBna;
                    int i5 = 1;
                    while (true) {
                        if (i5 >= arrayList.size() - 1) {
                            break;
                        }
                        if (((ChartArea) arrayList.get(i5)).djBIcL() > ((ChartArea) arrayList.get(i5)).values) {
                            if (((ChartArea) arrayList.get(i5)).djBIcL() - iDjBIcL2 > ((ChartArea) arrayList.get(i5)).values) {
                                ((ChartArea) arrayList.get(i5)).EZpvd(((ChartArea) arrayList.get(i5)).djBIcL() - iDjBIcL2);
                                break;
                            } else {
                                iDjBIcL2 -= ((ChartArea) arrayList.get(i5)).djBIcL() - ((ChartArea) arrayList.get(i5)).values;
                                ((ChartArea) arrayList.get(i5)).EZpvd(((ChartArea) arrayList.get(i5)).values);
                            }
                        }
                        i5++;
                    }
                }
            } else {
                iArr[0] = iAhwBna;
            }
            iArr[1] = iArr[0] / 4;
        } else {
            iArr[0] = (iDjBIcL - c36307oWy.AhwBna()) + iAKErDB;
            iArr[1] = iDjBIcL / 4;
        }
        int iCopydefault = AbstractC36302oWt.copydefault(8.0f);
        int i6 = iCopydefault * 7;
        int i7 = i / 3;
        if (c36246oUrCopydefault.sSMYrx().get(copydefault()).gEmmrt() > 0) {
            oWN own = c36246oUrCopydefault.DCJXGO().get(copydefault());
            int i8 = (i7 - i6) / iCopydefault;
            int i9 = i8 + 1;
            int[] iArr2 = new int[i9];
            int i10 = i6;
            while (i8 >= 0) {
                iArr2[i8] = own.EZpvd(own.OLrzqt(own.EZpvd(i - i10)));
                i8--;
                i10 += iCopydefault;
            }
            int i11 = 0;
            while (i11 < this.fJNWhG.size() && i9 > 0) {
                ChartArea chartArea2 = this.fJNWhG.get(i11);
                if (!chartArea2.EZpvd().endsWith("mVOLUME") && !chartArea2.EZpvd().endsWith("mVOLUMERange")) {
                    C36305oWw c36305oWw = (C36305oWw) c36246oUrCopydefault.copydefault.get(chartArea2.AEQbTJ() + "Range.m");
                    C36286oWd c36286oWd = (C36286oWd) c36246oUrCopydefault.copydefault.get("ds0.m.d");
                    int iGEmmrt = c36305oWw != null ? c36305oWw.gEmmrt() : 0;
                    if (iGEmmrt < 0) {
                        iGEmmrt = java.lang.Math.abs(iGEmmrt);
                    }
                    if (!C36246oUr.copydefault().uzCIH()) {
                        C36246oUr.copydefault().AhwBna(z);
                        if (c36286oWd != null && (c36246oUrCopydefault.KDccX() || c36246oUrCopydefault.zLjUOn().isShowCountdown())) {
                            iGEmmrt = java.lang.Math.max(iGEmmrt, c36286oWd.isConnected());
                        }
                        KWHzl(i, iGEmmrt);
                        c36246oUrCopydefault.djBIcL("ds0");
                        C36246oUr.copydefault().copydefault("ds0", (java.util.List<? extends oUO>) null);
                    } else if (C36246oUr.copydefault().iwGUEr().uzCIH()) {
                        C36246oUr.copydefault().iwGUEr().AEQbTJ(false);
                        float f = i;
                        if (f > own.AuCTel() * own.AhwBna()) {
                            if (C36246oUr.copydefault().hDKMBd() == 0) {
                                C36246oUr.copydefault().iwGUEr().OLrzqt((f - C36246oUr.copydefault().QUSxYX()) - (own.AuCTel() * own.AhwBna()));
                                C36246oUr.copydefault().iwGUEr().copydefault(C36246oUr.copydefault().iwGUEr().AuCTelauCTel());
                                C36246oUr.copydefault().iwGUEr().KWHzl(((f - (own.AuCTel() * own.AhwBna())) - own.values()) - C36246oUr.copydefault().AEQbTJ);
                            } else if (own.AuCTel() * own.AhwBna() <= i / 2) {
                                C36246oUr.copydefault().iwGUEr().OLrzqt(0.0f);
                                C36246oUr.copydefault().iwGUEr().copydefault(C36246oUr.copydefault().iwGUEr().AuCTelauCTel());
                                C36246oUr.copydefault().iwGUEr().KWHzl(-C36246oUr.copydefault().AEQbTJ);
                            } else {
                                if (C36246oUr.copydefault().hDKMBd() == 1) {
                                    C36246oUr.copydefault().iwGUEr().OLrzqt((f - C36246oUr.copydefault().QUSxYX()) - (own.AuCTel() * own.AhwBna()));
                                } else {
                                    C36246oUr.copydefault().iwGUEr().OLrzqt(0.0f);
                                }
                                C36246oUr.copydefault().iwGUEr().copydefault(C36246oUr.copydefault().iwGUEr().AuCTelauCTel());
                                C36246oUr.copydefault().iwGUEr().KWHzl(((f - (own.AuCTel() * own.AhwBna())) - own.values()) - C36246oUr.copydefault().AEQbTJ);
                            }
                        } else {
                            own.AEQbTJ("pre setMKlineInitOffsetLeft" + C36246oUr.copydefault().iwGUEr().AuCTelauCTel());
                            C36246oUr.copydefault().iwGUEr().OLrzqt((f - C36246oUr.copydefault().RJOkX().floatValue()) - (((float) own.AuCTel()) * own.AhwBna()));
                            own.AEQbTJ("after setMKlineInitOffsetLeft" + C36246oUr.copydefault().iwGUEr().AuCTelauCTel());
                            own.AEQbTJ("pre setMKlineOffsetMaxLeft" + C36246oUr.copydefault().iwGUEr().zsXlph());
                            C36246oUr.copydefault().iwGUEr().copydefault(C36246oUr.copydefault().iwGUEr().AuCTelauCTel() - (C36246oUr.copydefault().QUSxYX() - C36246oUr.copydefault().QfsBiF()));
                            own.AEQbTJ("after setMKlineOffsetMaxLeft" + C36246oUr.copydefault().iwGUEr().zsXlph());
                            own.AEQbTJ("pre setMKlineOffsetMaxRight" + C36246oUr.copydefault().iwGUEr().zsXlph());
                            C36246oUr.copydefault().iwGUEr().KWHzl(C36246oUr.copydefault().iwGUEr().AuCTelauCTel() - ((float) C36246oUr.copydefault().AEQbTJ));
                            own.AEQbTJ("after setMKlineOffsetMaxRight" + C36246oUr.copydefault().iwGUEr().zsXlph());
                        }
                    }
                    if (iGEmmrt > i6) {
                        i6 = iGEmmrt;
                    }
                    AbstractC36301oWs abstractC36301oWs = (AbstractC36301oWs) c36246oUrCopydefault.copydefault.get(chartArea2.AEQbTJ() + "Range.d");
                    if (abstractC36301oWs != null && (iIsConnected = abstractC36301oWs.isConnected()) > i6) {
                        i6 = iIsConnected;
                    }
                    if (i11 == 0) {
                        this.fIwbmz.OLrzqt(fIwbmz(), c36307oWy.AhwBna());
                        this.fIwbmz.OLrzqt.AEQbTJ(oWJ.EZpvd);
                    }
                }
                i11 += 2;
                z = true;
            }
        }
        for (int i12 = 0; i12 < this.fJNWhG.size(); i12 += 2) {
            this.fJNWhG.get(i12).OLrzqt(i, iArr[i12 >> 1]);
        }
        for (int i13 = 1; i13 < this.fJNWhG.size(); i13 += 2) {
            this.fJNWhG.get(i13).OLrzqt(i6, iArr[i13 >> 1]);
        }
    }

    public final void KWHzl(int i, int i2) {
        int i3 = i2 + this.fARcdN;
        oWN own = C36246oUr.copydefault().DCJXGO().get(copydefault());
        if (C36246oUr.copydefault().zblBkD() || C36246oUr.copydefault().KDccX()) {
            if (C36246oUr.copydefault().hDKMBd() == 0) {
                if (own.AuCTel() * own.AhwBna() < i - i3) {
                    C36246oUr.copydefault().KWHzl(i - (own.AuCTel() * own.AhwBna()));
                    C36246oUr.copydefault().EZpvd(C36246oUr.copydefault().QfsBiF());
                } else {
                    float f = i3;
                    C36246oUr.copydefault().EZpvd(f);
                    C36246oUr.copydefault().KWHzl(f);
                }
                C36246oUr.copydefault().copydefault(i - 200);
            } else if (C36246oUr.copydefault().hDKMBd() == 1) {
                if (own.AuCTel() * own.AhwBna() < i - i3) {
                    C36246oUr.copydefault().KWHzl(i - (own.AuCTel() * own.AhwBna()));
                    C36246oUr.copydefault().EZpvd(C36246oUr.copydefault().QfsBiF());
                } else {
                    float f2 = i3;
                    C36246oUr.copydefault().KWHzl(f2);
                    C36246oUr.copydefault().EZpvd(f2);
                }
                C36246oUr.copydefault().copydefault(i / 2);
            } else if (own.AuCTel() * own.AhwBna() < i - i3) {
                C36246oUr.copydefault().KWHzl(i - (own.AuCTel() * own.AhwBna()));
                C36246oUr.copydefault().EZpvd(C36246oUr.copydefault().QfsBiF());
                C36246oUr.copydefault().copydefault(C36246oUr.copydefault().QfsBiF());
            } else {
                float f3 = i3;
                C36246oUr.copydefault().EZpvd(f3);
                C36246oUr.copydefault().KWHzl(f3);
                C36246oUr.copydefault().copydefault(f3);
            }
            C36246oUr.copydefault().EZpvd(java.lang.Float.valueOf(C36246oUr.copydefault().QfsBiF()));
        } else {
            if (C36246oUr.copydefault().hDKMBd() == 0) {
                if (own.AuCTel() * own.AhwBna() < i - i3) {
                    C36246oUr.copydefault().KWHzl(i - (own.AuCTel() * own.AhwBna()));
                    C36246oUr.copydefault().EZpvd(C36246oUr.copydefault().QfsBiF());
                } else {
                    C36246oUr.copydefault().KWHzl(0.0f);
                    C36246oUr.copydefault().EZpvd(0.0f);
                }
                C36246oUr.copydefault().copydefault(i - 200);
            } else if (C36246oUr.copydefault().hDKMBd() == 1) {
                if (own.AuCTel() * own.AhwBna() < i - i3) {
                    C36246oUr.copydefault().KWHzl(i - (own.AuCTel() * own.AhwBna()));
                    C36246oUr.copydefault().EZpvd(C36246oUr.copydefault().QfsBiF());
                } else {
                    C36246oUr.copydefault().KWHzl(0.0f);
                    C36246oUr.copydefault().EZpvd(0.0f);
                }
                C36246oUr.copydefault().copydefault(i / 2);
            } else if (own.AuCTel() * own.AhwBna() < i - i3) {
                C36246oUr.copydefault().KWHzl(i - (own.AuCTel() * own.AhwBna()));
                C36246oUr.copydefault().EZpvd(C36246oUr.copydefault().QfsBiF());
                C36246oUr.copydefault().copydefault(C36246oUr.copydefault().QfsBiF());
            } else {
                C36246oUr.copydefault().KWHzl(0.0f);
                C36246oUr.copydefault().EZpvd(0.0f);
                C36246oUr.copydefault().copydefault(0.0f);
            }
            C36246oUr.copydefault().EZpvd(java.lang.Float.valueOf(C36246oUr.copydefault().QfsBiF()));
        }
        if (C36246oUr.copydefault().DNMMPQ() && C36246oUr.copydefault().zLjUOn().getChartMode() != 2 && (C36246oUr.copydefault().zLjUOn().getMode().equals("pro_mode") || C36246oUr.copydefault().zLjUOn().getMode().equals("lite_mode"))) {
            C36246oUr.copydefault().AEQbTJ = java.lang.Math.max((int) ((own.AhwBna() * 2.0f) - own.fetchVPNInfo()), 16);
        } else if (C36246oUr.copydefault().hDKMBd() == 0) {
            C36246oUr.copydefault().AEQbTJ = 150;
        } else if (C36246oUr.copydefault().hDKMBd() == 1) {
            C36246oUr.copydefault().AEQbTJ = i / 2;
        } else {
            C36246oUr.copydefault().AEQbTJ = (i - i3) - 100;
        }
        float f4 = i - i3;
        if ((own.AuCTel() + 1) * own.AhwBna() < f4) {
            C36246oUr.copydefault().isConnected = 0.0f;
            C36246oUr.copydefault().AkhnZx = 0.0f;
        } else {
            C36246oUr.copydefault().isConnected = (i - C36246oUr.copydefault().QfsBiF()) - (own.AuCTel() * own.AhwBna());
            C36246oUr.copydefault().AkhnZx = C36246oUr.copydefault().isConnected;
        }
        C36246oUr.copydefault().AuCTel = 0.0f;
        C36246oUr.copydefault().gEmmrt = C36246oUr.copydefault().djSkpj();
        C36246oUr.copydefault().fIwbmz = 0.0f;
        C36246oUr.copydefault().hDKMBd = 0.0f;
        own.zLjUOn();
        if ((own.AuCTel() + 1) * own.AhwBna() < f4) {
            if (C36246oUr.copydefault().hDKMBd() == 0) {
                float f5 = i;
                C36246oUr.copydefault().iwGUEr().OLrzqt((f5 - C36246oUr.copydefault().QUSxYX()) - ((own.AuCTel() + 1) * own.AhwBna()));
                C36246oUr.copydefault().iwGUEr().copydefault(C36246oUr.copydefault().iwGUEr().AuCTelauCTel());
                C36246oUr.copydefault().iwGUEr().KWHzl(((f5 - ((own.AuCTel() + 1) * own.AhwBna())) - own.values()) - C36246oUr.copydefault().AEQbTJ);
                return;
            }
            if ((own.AuCTel() + 1) * own.AhwBna() <= i / 2) {
                C36246oUr.copydefault().iwGUEr().OLrzqt(C36246oUr.copydefault().AkhnZx);
                C36246oUr.copydefault().iwGUEr().copydefault(C36246oUr.copydefault().iwGUEr().AuCTelauCTel());
                C36246oUr.copydefault().iwGUEr().KWHzl(-C36246oUr.copydefault().AEQbTJ);
                return;
            } else {
                if (C36246oUr.copydefault().hDKMBd() == 1) {
                    C36246oUr.copydefault().iwGUEr().OLrzqt((i - C36246oUr.copydefault().QUSxYX()) - ((own.AuCTel() + 1) * own.AhwBna()));
                } else {
                    C36246oUr.copydefault().iwGUEr().OLrzqt(C36246oUr.copydefault().AkhnZx);
                }
                C36246oUr.copydefault().iwGUEr().copydefault(C36246oUr.copydefault().iwGUEr().AuCTelauCTel());
                C36246oUr.copydefault().iwGUEr().KWHzl(((i - ((own.AuCTel() + 1) * own.AhwBna())) - own.values()) - C36246oUr.copydefault().AEQbTJ);
                return;
            }
        }
        C36246oUr.copydefault().iwGUEr().OLrzqt(C36246oUr.copydefault().AkhnZx);
        C36246oUr.copydefault().iwGUEr().copydefault(C36246oUr.copydefault().iwGUEr().AuCTelauCTel() - (C36246oUr.copydefault().QUSxYX() - C36246oUr.copydefault().QfsBiF()));
        C36246oUr.copydefault().iwGUEr().KWHzl(C36246oUr.copydefault().iwGUEr().AuCTelauCTel() - C36246oUr.copydefault().AEQbTJ);
    }

    @Override // com.okinc.kline.library.layout.ChartArea
    public void copydefault(int i, int i2, int i3, int i4, boolean z) {
        super.copydefault(i, i2, i3, i4, z);
        if (this.fJNWhG.size() < 1) {
            return;
        }
        int i5 = 0;
        this.fJNWhG.get(0).isConnected();
        if (!z) {
            z = ejfBZ();
        }
        int size = this.fJNWhG.size();
        int i6 = i2;
        int i7 = 0;
        while (i5 < size) {
            ChartArea chartArea = this.fJNWhG.get(i5);
            if (!chartArea.EZpvd().endsWith("mVOLUME") && !chartArea.EZpvd().endsWith("mVOLUMERange")) {
                int iGEmmrt = chartArea.gEmmrt() + i6;
                int i8 = i5 == 0 ? iGEmmrt : i7;
                chartArea.copydefault(0, i6, i3, iGEmmrt, z);
                i5++;
                if (i5 == 1) {
                    this.fIwbmz.copydefault(0, iGEmmrt, i3, iGEmmrt + this.fIwbmz.gEmmrt(), z);
                    iGEmmrt += this.fIwbmz.gEmmrt();
                }
                i6 = iGEmmrt;
                i7 = i8;
            }
            i5++;
        }
        if (this.hDKMBd) {
            ChartArea chartArea2 = this.fJNWhG.get(2);
            if (chartArea2 != null) {
                chartArea2.copydefault(0, i7 - (i7 / 4), i3, i7, z);
                return;
            }
            return;
        }
        C36246oUr.copydefault().copydefault.remove(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE + "VOLUME" + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        C36246oUr.copydefault().iwGUEr().AkhnZx().remove(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE + "VOLUME.s");
    }

    @Override // o.oVT
    public void copydefault(oWK owk) {
        this.getFieldNames.setColor(owk.OLrzqt(5));
        this.getFieldNames.setAlpha(200);
        this.iwGUEr.setColor(owk.OLrzqt(5));
    }

    @Override // o.oVT
    public void OLrzqt(android.graphics.Canvas canvas) {
        if (this.fJNWhG.size() < 1) {
            return;
        }
        ChartArea chartArea = this.fJNWhG.get(0);
        canvas.drawLine(chartArea.DbNXlk(), AuCTel(), chartArea.DbNXlk(), KWHzl(), this.getFieldNames);
        int size = this.fJNWhG.size();
        for (int i = 0; i < size; i += 2) {
            ChartArea chartArea2 = this.fJNWhG.get(i);
            if (i == 0) {
                canvas.drawLine(AYXKKw(), chartArea2.AuCTel(), DbNXlk(), chartArea2.AuCTel(), this.getFieldNames);
            }
            if (chartArea2.fJNWhG()) {
                int iAYXKKw = AYXKKw();
                int iAuCTel = chartArea2.AuCTel();
                pFN pfn = pFN.OLrzqt;
                AEQbTJ(canvas, iAYXKKw, iAuCTel - pfn.AEQbTJ(6.0f), DbNXlk(), chartArea2.AuCTel() + pfn.AEQbTJ(6.0f), chartArea2.AuCTel());
            }
            canvas.drawLine(AYXKKw(), chartArea2.KWHzl() - 1, DbNXlk(), chartArea2.KWHzl() - 1, this.iwGUEr);
        }
        if (C36246oUr.copydefault().heceqZ()) {
            canvas.drawLine(AYXKKw(), this.fIwbmz.KWHzl() - 1, DbNXlk(), this.fIwbmz.KWHzl() - 1, this.iwGUEr);
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        canvas.drawRoundRect(new RectF(i, i2, i3, i4), 0.0f, 0.0f, this.getNewProxyInstance);
        float f = i5;
        canvas.drawLine(AYXKKw(), f, DbNXlk(), f, this.uzCIH);
    }
}
