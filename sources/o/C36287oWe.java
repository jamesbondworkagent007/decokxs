package o;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.camera.video.AudioStats;
import com.okinc.kline.library.data.DataSource;

/* JADX INFO: renamed from: o.oWe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36287oWe extends AbstractC36302oWt {
    public final android.graphics.Paint AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public final android.graphics.Path AhwBna;
    public final android.graphics.Path DbNXlk;
    public final android.graphics.Path EZpvd;
    public final android.graphics.Path KWHzl;
    public final java.lang.String OLrzqt;
    public final android.graphics.Path djBIcL;
    public final android.graphics.Path fetchVPNInfo;
    public final android.graphics.Path gEmmrt;
    public final android.graphics.Path isConnected;
    public final android.graphics.Paint valueOf;
    public final android.graphics.Paint values;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
    }

    public C36287oWe(java.lang.String str) {
        super(str);
        this.OLrzqt = "CandlestickPlotter";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.values = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        float fCopydefault = AbstractC36302oWt.copydefault(1.0f);
        paint.setStrokeWidth(fCopydefault);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.valueOf = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(fCopydefault);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.AYXKKw = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.AEQbTJ = paint4;
        paint4.setStyle(style2);
        this.isConnected = new android.graphics.Path();
        this.fetchVPNInfo = new android.graphics.Path();
        this.djBIcL = new android.graphics.Path();
        this.DbNXlk = new android.graphics.Path();
        this.AhwBna = new android.graphics.Path();
        this.gEmmrt = new android.graphics.Path();
        this.EZpvd = new android.graphics.Path();
        this.KWHzl = new android.graphics.Path();
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        oWN own;
        com.okinc.kline.library.data.DataSource dataSource;
        float f;
        float f2;
        float f3;
        C36246oUr c36246oUr;
        oWC owc;
        float f4;
        float f5;
        float f6;
        int i;
        int i2;
        boolean z;
        float f7;
        float f8;
        int i3;
        int i4;
        int i5;
        float f9;
        float f10;
        int i6;
        int i7;
        int i8;
        android.graphics.Canvas canvas2 = canvas;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        oWN own2 = c36246oUrCopydefault.DCJXGO().get(copydefault());
        oWC owc2 = c36246oUrCopydefault.iwGUEr().QVAiDq().get(EZpvd());
        com.okinc.kline.library.data.DataSource dataSource2 = c36246oUrCopydefault.sSMYrx().get(copydefault());
        if (own2 == null || dataSource2 == null || dataSource2.gEmmrt() < 1 || owc2 == null || owc2.AuCTel() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        java.lang.String strAuCTel = c36246oUrCopydefault.AuCTel();
        if (strAuCTel == null) {
            this.values.setColor(c36246oUrCopydefault.iZzfmt());
            this.AYXKKw.setColor(c36246oUrCopydefault.iZzfmt());
        } else {
            this.values.setColor(Color.parseColor(strAuCTel));
            this.AYXKKw.setColor(Color.parseColor(strAuCTel));
        }
        java.lang.String strEjfBZ = c36246oUrCopydefault.ejfBZ();
        if (strEjfBZ == null) {
            this.valueOf.setColor(c36246oUrCopydefault.giSNqX());
            this.AEQbTJ.setColor(c36246oUrCopydefault.giSNqX());
        } else {
            this.valueOf.setColor(Color.parseColor(strEjfBZ));
            this.AEQbTJ.setColor(Color.parseColor(strEjfBZ));
        }
        int timelineScale = c36246oUrCopydefault.KWHzl(copydefault()).getTimelineScale();
        this.isConnected.reset();
        this.fetchVPNInfo.reset();
        this.djBIcL.reset();
        this.DbNXlk.reset();
        this.AhwBna.reset();
        this.gEmmrt.reset();
        this.EZpvd.reset();
        this.KWHzl.reset();
        int iIsConnected = own2.isConnected();
        int iEjfBZ = own2.ejfBZ();
        float fAhwBna = own2.AhwBna();
        float fFJNWhG = own2.fJNWhG();
        own2.iwGUEr();
        float fDbNXlk = own2.DbNXlk(iIsConnected);
        float fAYXKKw = own2.AYXKKw(iIsConnected);
        own2.djBIcL(iIsConnected);
        own2.AhwBna(iIsConnected);
        int i9 = iIsConnected;
        float f11 = fDbNXlk;
        float f12 = fAYXKKw;
        while (i9 < iEjfBZ) {
            DataSource.StateListAnimator stateListAnimator = dataSource2.AEQbTJ.get(i9);
            float f13 = fDbNXlk;
            float f14 = fAYXKKw;
            int iAhwBna = owc2.AhwBna(stateListAnimator.AkhnZx());
            int i10 = iIsConnected;
            int i11 = iEjfBZ;
            int iAhwBna2 = owc2.AhwBna(stateListAnimator.values());
            if (stateListAnimator.copydefault() >= stateListAnimator.AuCTel()) {
                float f15 = f12;
                float f16 = fAhwBna;
                int iAhwBna3 = owc2.AhwBna(stateListAnimator.copydefault());
                float f17 = fFJNWhG;
                int iAhwBna4 = owc2.AhwBna(stateListAnimator.AuCTel());
                dataSource = dataSource2;
                int iMax = java.lang.Math.max(iAhwBna4 - iAhwBna3, 1);
                if (stateListAnimator.AkhnZx() > stateListAnimator.copydefault()) {
                    iAhwBna = java.lang.Math.min(iAhwBna, iAhwBna3 - 1);
                }
                if (stateListAnimator.AuCTel() > stateListAnimator.values()) {
                    iAhwBna2 = java.lang.Math.max(iAhwBna2, iAhwBna4 + 1);
                }
                if (timelineScale > oWN.AEQbTJ) {
                    if (i9 == own2.AuCTel() - 1) {
                        if (c36246oUrCopydefault.iwGUEr().ejfBZ() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                            i6 = iAhwBna2;
                            f = f16;
                            c36246oUrCopydefault.iwGUEr().AEQbTJ(stateListAnimator.copydefault());
                        } else {
                            i6 = iAhwBna2;
                            f = f16;
                        }
                        if (c36246oUrCopydefault.iwGUEr().ejfBZ() == stateListAnimator.copydefault()) {
                            if (pEM.AEQbTJ.EZpvd()) {
                                float f18 = iMax + iAhwBna3;
                                float f19 = f11;
                                i7 = i10;
                                AbstractC36302oWt.AEQbTJ(this.fetchVPNInfo, f19, iAhwBna3, f19 + f17, f18);
                                f2 = f19;
                            } else {
                                f2 = f11;
                                i7 = i10;
                                AbstractC36302oWt.AEQbTJ(this.gEmmrt, f2, iAhwBna3, f2 + f17, iMax + iAhwBna3);
                            }
                            if (stateListAnimator.AkhnZx() > stateListAnimator.copydefault()) {
                                f10 = f15;
                                AbstractC36302oWt.AEQbTJ(this.isConnected, f10, java.lang.Math.min(iAhwBna, iAhwBna3 - 1), f10, iAhwBna3);
                            } else {
                                f10 = f15;
                            }
                            i8 = i9;
                        } else {
                            f2 = f11;
                            i7 = i10;
                            f10 = f15;
                            i8 = i9;
                            c36246oUrCopydefault.iwGUEr().AEQbTJ(c36246oUrCopydefault.iwGUEr().ejfBZ() + ((stateListAnimator.copydefault() - c36246oUrCopydefault.iwGUEr().ejfBZ()) * ((double) c36246oUrCopydefault.iwGUEr().EZpvd())));
                            this.zlvcHA = (int) (owc2.AhwBna(c36246oUrCopydefault.iwGUEr().ejfBZ()) + ((iAhwBna3 - owc2.AhwBna(c36246oUrCopydefault.iwGUEr().ejfBZ())) * c36246oUrCopydefault.iwGUEr().EZpvd()));
                            if (pEM.AEQbTJ.EZpvd()) {
                                AbstractC36302oWt.AEQbTJ(this.fetchVPNInfo, f2, this.zlvcHA, f2 + f17, iMax + iAhwBna3);
                            } else {
                                AbstractC36302oWt.AEQbTJ(this.gEmmrt, f2, this.zlvcHA, f2 + f17, iMax + iAhwBna3);
                            }
                            if (stateListAnimator.AkhnZx() > stateListAnimator.copydefault()) {
                                AbstractC36302oWt.AEQbTJ(this.isConnected, f10, java.lang.Math.min(iAhwBna, iAhwBna3 - 1), f10, owc2.AhwBna(c36246oUrCopydefault.iwGUEr().ejfBZ()));
                            }
                        }
                        canvas2.drawPath(this.fetchVPNInfo, this.values);
                        canvas2.drawPath(this.gEmmrt, this.AYXKKw);
                        i5 = i7;
                        f9 = f14;
                        i9 = i8;
                        c36246oUr = c36246oUrCopydefault;
                        own = own2;
                        f3 = f13;
                    } else {
                        i6 = iAhwBna2;
                        f = f16;
                        f2 = f11;
                        f10 = f15;
                        int i12 = i9;
                        if (pEM.AEQbTJ.EZpvd()) {
                            i5 = i10;
                            i9 = i12;
                            if (i9 == i5) {
                                c36246oUr = c36246oUrCopydefault;
                                own = own2;
                                f3 = f13;
                                AbstractC36302oWt.AEQbTJ(this.isConnected, f3, iAhwBna3, f13 + f17, iMax + iAhwBna3);
                            } else {
                                c36246oUr = c36246oUrCopydefault;
                                own = own2;
                                f3 = f13;
                                AbstractC36302oWt.AEQbTJ(this.isConnected, f2, iAhwBna3, f2 + f17, iMax + iAhwBna3);
                            }
                        } else {
                            i5 = i10;
                            i9 = i12;
                            c36246oUr = c36246oUrCopydefault;
                            own = own2;
                            f3 = f13;
                            if (i9 == i5) {
                                AbstractC36302oWt.AEQbTJ(this.AhwBna, f3, iAhwBna3, f3 + f17, iMax + iAhwBna3);
                            } else {
                                AbstractC36302oWt.AEQbTJ(this.AhwBna, f2, iAhwBna3, f2 + f17, iMax + iAhwBna3);
                            }
                        }
                        if (stateListAnimator.AkhnZx() > stateListAnimator.copydefault()) {
                            int iMin = java.lang.Math.min(iAhwBna, iAhwBna3 - 1);
                            if (i9 == i5) {
                                f9 = f14;
                                AbstractC36302oWt.AEQbTJ(this.isConnected, f9, iMin, f9, iAhwBna3);
                            } else {
                                f9 = f14;
                                AbstractC36302oWt.AEQbTJ(this.isConnected, f10, iMin, f10, iAhwBna3);
                            }
                        } else {
                            f9 = f14;
                        }
                    }
                    if (stateListAnimator.AuCTel() > stateListAnimator.values()) {
                        int iMax2 = java.lang.Math.max(i6, iAhwBna4 + 1);
                        if (i9 == i5) {
                            AbstractC36302oWt.AEQbTJ(this.isConnected, f9, iAhwBna4, f9, iMax2);
                        } else {
                            AbstractC36302oWt.AEQbTJ(this.isConnected, f10, iAhwBna4, f10, iMax2);
                        }
                    }
                } else {
                    f = f16;
                    i5 = i10;
                    f2 = f11;
                    f9 = f14;
                    f10 = f15;
                    c36246oUr = c36246oUrCopydefault;
                    own = own2;
                    f3 = f13;
                    if (pEM.AEQbTJ.EZpvd()) {
                        if (i9 == i5) {
                            AbstractC36302oWt.AEQbTJ(this.isConnected, f3, iAhwBna, f3 + f17, iAhwBna2);
                        } else {
                            AbstractC36302oWt.AEQbTJ(this.isConnected, f2, iAhwBna, f2 + f17, iAhwBna2);
                        }
                    } else if (i9 == i5) {
                        AbstractC36302oWt.AEQbTJ(this.isConnected, f3, iAhwBna, f3 + f17, iAhwBna2);
                    } else {
                        AbstractC36302oWt.AEQbTJ(this.AhwBna, f2, iAhwBna, f2 + f17, iAhwBna2);
                    }
                }
                owc = owc2;
                f4 = f9;
                f5 = f10;
                f6 = f17;
                i = timelineScale;
                i2 = i5;
                z = true;
            } else {
                own = own2;
                dataSource = dataSource2;
                f = fAhwBna;
                float f20 = fFJNWhG;
                f2 = f11;
                f3 = f13;
                c36246oUr = c36246oUrCopydefault;
                float f21 = f12;
                int iAhwBna5 = owc2.AhwBna(stateListAnimator.AuCTel());
                int iAhwBna6 = owc2.AhwBna(stateListAnimator.copydefault());
                int iMax3 = java.lang.Math.max(iAhwBna6 - iAhwBna5, 1);
                if (stateListAnimator.AkhnZx() > stateListAnimator.AuCTel()) {
                    iAhwBna = java.lang.Math.min(iAhwBna, iAhwBna5 - 1);
                }
                if (stateListAnimator.copydefault() > stateListAnimator.values()) {
                    iAhwBna2 = java.lang.Math.max(iAhwBna2, iAhwBna6 + 1);
                }
                int i13 = iAhwBna;
                if (timelineScale > oWN.AEQbTJ) {
                    if (i9 == own.AuCTel() - 1) {
                        if (c36246oUr.iwGUEr().ejfBZ() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                            f7 = f21;
                            c36246oUr.iwGUEr().AEQbTJ(stateListAnimator.copydefault());
                        } else {
                            f7 = f21;
                        }
                        if (c36246oUr.iwGUEr().ejfBZ() == stateListAnimator.copydefault()) {
                            if (pEM.AEQbTJ.AEQbTJ()) {
                                f6 = f20;
                                i = timelineScale;
                                f8 = f14;
                                AbstractC36302oWt.AEQbTJ(this.DbNXlk, f2, iAhwBna5, java.lang.Math.max(f6, 1.0f) + f2, java.lang.Math.max(iMax3, 1) + iAhwBna5);
                            } else {
                                f8 = f14;
                                f6 = f20;
                                i = timelineScale;
                                AbstractC36302oWt.AEQbTJ(this.KWHzl, f2, iAhwBna5, java.lang.Math.max(f6, 1.0f) + f2, java.lang.Math.max(iMax3, 1) + iAhwBna5);
                            }
                            if (stateListAnimator.copydefault() > stateListAnimator.values()) {
                                f5 = f7;
                                AbstractC36302oWt.AEQbTJ(this.djBIcL, f5, iAhwBna6, f5, java.lang.Math.max(iAhwBna2, iAhwBna6 + 1));
                            } else {
                                f5 = f7;
                            }
                            i3 = i10;
                            i4 = i9;
                        } else {
                            f8 = f14;
                            f5 = f7;
                            f6 = f20;
                            i = timelineScale;
                            i3 = i10;
                            i4 = i9;
                            c36246oUr.iwGUEr().AEQbTJ(c36246oUr.iwGUEr().ejfBZ() - ((c36246oUr.iwGUEr().ejfBZ() - stateListAnimator.copydefault()) * ((double) c36246oUr.iwGUEr().EZpvd())));
                            this.zlvcHA = (int) (owc2.AhwBna(c36246oUr.iwGUEr().ejfBZ()) - ((owc2.AhwBna(c36246oUr.iwGUEr().ejfBZ()) - iAhwBna6) * c36246oUr.iwGUEr().EZpvd()));
                            if (pEM.AEQbTJ.AEQbTJ()) {
                                AbstractC36302oWt.AEQbTJ(this.DbNXlk, f2, iAhwBna5, java.lang.Math.max(f6, 1.0f) + f2, java.lang.Math.max(this.zlvcHA, iAhwBna5 + 1));
                            } else {
                                AbstractC36302oWt.AEQbTJ(this.KWHzl, f2, iAhwBna5, java.lang.Math.max(f6, 1.0f) + f2, java.lang.Math.max(this.zlvcHA, iAhwBna5 + 1));
                            }
                            if (stateListAnimator.copydefault() > stateListAnimator.values()) {
                                AbstractC36302oWt.AEQbTJ(this.djBIcL, f5, owc2.AhwBna(c36246oUr.iwGUEr().ejfBZ()), f5, java.lang.Math.max(iAhwBna2, iAhwBna6 + 1));
                            }
                        }
                        canvas.drawPath(this.DbNXlk, this.valueOf);
                        canvas.drawPath(this.KWHzl, this.AEQbTJ);
                        i2 = i3;
                        f4 = f8;
                        i9 = i4;
                        z = true;
                        owc = owc2;
                    } else {
                        int i14 = i9;
                        f5 = f21;
                        f6 = f20;
                        i = timelineScale;
                        if (pEM.AEQbTJ.AEQbTJ()) {
                            i2 = i10;
                            i9 = i14;
                            if (i9 == i2) {
                                owc = owc2;
                                z = true;
                                AbstractC36302oWt.AEQbTJ(this.djBIcL, f3, iAhwBna5, f3 + f6, java.lang.Math.max(iMax3, 1) + iAhwBna5);
                            } else {
                                owc = owc2;
                                z = true;
                                AbstractC36302oWt.AEQbTJ(this.djBIcL, f2, iAhwBna5, java.lang.Math.max(f6, 1.0f) + f2, java.lang.Math.max(iMax3, 1) + iAhwBna5);
                            }
                        } else {
                            i2 = i10;
                            i9 = i14;
                            z = true;
                            owc = owc2;
                            if (i9 == i2) {
                                AbstractC36302oWt.AEQbTJ(this.EZpvd, f3, iAhwBna5, f3 + f6, java.lang.Math.max(iMax3, 1) + iAhwBna5);
                            } else {
                                AbstractC36302oWt.AEQbTJ(this.EZpvd, f2, iAhwBna5, java.lang.Math.max(f6, 1.0f) + f2, java.lang.Math.max(iMax3, 1) + iAhwBna5);
                            }
                        }
                        if (stateListAnimator.copydefault() > stateListAnimator.values()) {
                            int iMax4 = java.lang.Math.max(iAhwBna2, iAhwBna6 + 1);
                            if (i9 == i2) {
                                f4 = f14;
                                AbstractC36302oWt.AEQbTJ(this.djBIcL, f4, iAhwBna6, f4, iMax4);
                            } else {
                                f4 = f14;
                                AbstractC36302oWt.AEQbTJ(this.djBIcL, f5, iAhwBna6, f5, iMax4);
                            }
                        } else {
                            f4 = f14;
                        }
                    }
                    if (stateListAnimator.AkhnZx() > stateListAnimator.AuCTel()) {
                        int iMin2 = java.lang.Math.min(i13, iAhwBna5 - 1);
                        if (i9 == i2) {
                            AbstractC36302oWt.AEQbTJ(this.djBIcL, f4, iMin2, f4, iAhwBna5);
                        } else {
                            AbstractC36302oWt.AEQbTJ(this.djBIcL, f5, iMin2, f5, iAhwBna5);
                        }
                    }
                } else {
                    owc = owc2;
                    f4 = f14;
                    f5 = f21;
                    f6 = f20;
                    i = timelineScale;
                    i2 = i10;
                    z = true;
                    if (pEM.AEQbTJ.AEQbTJ()) {
                        AbstractC36302oWt.AEQbTJ(this.djBIcL, f2, i13, java.lang.Math.max(f6, 1.0f) + f2, iAhwBna2);
                    } else {
                        AbstractC36302oWt.AEQbTJ(this.EZpvd, f2, i13, java.lang.Math.max(f6, 1.0f) + f2, iAhwBna2);
                    }
                }
            }
            i9++;
            float f22 = f2 + f;
            float f23 = f5 + f;
            fDbNXlk = f3;
            iIsConnected = i2;
            fFJNWhG = f6;
            owc2 = owc;
            iEjfBZ = i11;
            own2 = own;
            timelineScale = i;
            dataSource2 = dataSource;
            fAhwBna = f;
            fAYXKKw = f4;
            f12 = f23;
            c36246oUrCopydefault = c36246oUr;
            f11 = f22;
            canvas2 = canvas;
        }
        canvas.drawPath(this.isConnected, this.values);
        canvas.drawPath(this.djBIcL, this.valueOf);
        canvas.drawPath(this.AhwBna, this.AYXKKw);
        canvas.drawPath(this.EZpvd, this.AEQbTJ);
    }
}
