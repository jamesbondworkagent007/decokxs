package o;

import android.graphics.Paint;
import androidx.camera.video.AudioStats;
import androidx.exifinterface.media.ExifInterface;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import java.text.NumberFormat;

/* JADX INFO: renamed from: o.oWw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36305oWw extends AbstractC36302oWt {
    public int AEQbTJ;
    public final int AYXKKw;
    public boolean AhwBna;
    public final int EZpvd;
    public java.lang.String KWHzl;
    public final android.graphics.Paint OLrzqt;
    public final android.graphics.Paint djBIcL;
    public int gEmmrt;
    public NumberFormat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.AhwBna = z;
    }

    public C36305oWw(java.lang.String str) {
        super(str);
        this.KWHzl = "RangePlotter";
        this.AhwBna = false;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        this.valueOf = numberInstance;
        numberInstance.setGroupingUsed(false);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.djBIcL = paint;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.RIGHT);
        paint.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int iCeil = (int) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top);
        this.AYXKKw = iCeil;
        this.gEmmrt = (-(iCeil >> 1)) - ((int) fontMetrics.top);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.OLrzqt = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.EZpvd = AbstractC36302oWt.copydefault(4.0f);
        this.AEQbTJ = AbstractC36302oWt.copydefault(16.0f);
    }

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
        if (this.zhUgOk) {
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        java.lang.String strEZpvd = EZpvd();
        oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get(strEZpvd.substring(0, strEZpvd.lastIndexOf("Range")));
        if (owc != null) {
            this.valueOf.setMaximumFractionDigits(owc.isConnected());
            this.valueOf.setMinimumFractionDigits(owc.values());
        }
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.djBIcL.setColor(owk.EZpvd(1));
        this.OLrzqt.setColor(owk.OLrzqt(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0342 A[Catch: Exception -> 0x0365, TRY_LEAVE, TryCatch #2 {Exception -> 0x0365, blocks: (B:91:0x0262, B:92:0x0267, B:93:0x028b, B:95:0x0297, B:97:0x02a1, B:98:0x02c0, B:99:0x02e7, B:101:0x02f3, B:103:0x02fd, B:104:0x031a, B:106:0x0324, B:107:0x0342), top: B:121:0x0262 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0234  */
    @Override // o.AbstractC36302oWt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(android.graphics.Canvas canvas) {
        C36246oUr c36246oUr;
        android.graphics.Canvas canvas2;
        java.lang.String strKWHzl;
        java.lang.String strAEQbTJ;
        android.graphics.Canvas canvas3 = canvas;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.zblBkD()) {
            java.lang.String strEZpvd = EZpvd();
            if (strEZpvd.endsWith("mVOLUMERange")) {
                return;
            }
            c36246oUrCopydefault.values().get(strEZpvd);
            int i = 0;
            java.lang.String strSubstring = strEZpvd.substring(0, strEZpvd.lastIndexOf("Range"));
            oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get(strSubstring);
            if (owc.AuCTel() == AudioStats.AUDIO_AMPLITUDE_NONE) {
                return;
            }
            oWN own = c36246oUrCopydefault.DCJXGO().get(copydefault());
            java.util.ArrayList<java.lang.Double> arrayListAYXKKw = owc.AYXKKw();
            if (arrayListAYXKKw.size() == 0) {
                return;
            }
            int size = arrayListAYXKKw.size();
            this.gEmmrt = (int) this.djBIcL.measureText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
            int iEZpvd = AbstractC36302oWt.EZpvd(owc.DbNXlk() - owc.AkhnZx());
            while (i < size) {
                double dDoubleValue = arrayListAYXKKw.get(i).doubleValue();
                if (c36246oUrCopydefault.zLjUOn().isCompareKLine() && !EZpvd().contains("indic") && strSubstring.endsWith(com.ibm.icu.text.DateFormat.MINUTE)) {
                    dDoubleValue = gEmmrt(dDoubleValue);
                }
                if (!EZpvd().contains("indic") || valueOf(owc.AhwBna()) || dDoubleValue >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                    int iDjBIcL = owc.djBIcL(dDoubleValue);
                    if (EZpvd().contains("indic") && !valueOf(owc.AhwBna()) && i == 2) {
                        c36246oUr = c36246oUrCopydefault;
                        if (iDjBIcL <= owc.djBIcL(arrayListAYXKKw.get(i - 1).doubleValue()) + this.AYXKKw) {
                            canvas2 = canvas;
                        }
                    } else {
                        c36246oUr = c36246oUrCopydefault;
                    }
                    try {
                        if (strSubstring.endsWith(com.ibm.icu.text.DateFormat.MINUTE) || dDoubleValue < 1000.0d) {
                            if (C36246oUr.copydefault().dHguZz() && !EZpvd().contains("indic") && strSubstring.endsWith(com.ibm.icu.text.DateFormat.MINUTE)) {
                                strAEQbTJ = pTB.EZpvd(pTB.OLrzqt(arrayListAYXKKw.get(i)), 2, 2, RoundingMode.HALF_UP);
                            } else if (strSubstring.endsWith(com.ibm.icu.text.DateFormat.MINUTE) && C36246oUr.copydefault().hUfVAv() == 1) {
                                oUG oug = c36246oUr.iwGUEr().AkhnZx().get(strSubstring + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
                                if (oug instanceof oUM) {
                                    strAEQbTJ = pDQ.copydefault.copydefault(dDoubleValue, ((oUM) oug).valueOf().get(own.isConnected()).copydefault());
                                } else if (oug instanceof oUK) {
                                    strAEQbTJ = pDQ.copydefault.copydefault(dDoubleValue, ((oUK) oug).valueOf().get(own.isConnected()).copydefault());
                                } else {
                                    strAEQbTJ = AbstractC36302oWt.AYXKKw(dDoubleValue);
                                }
                            } else if (owc.AhwBna().equals("VOLUME")) {
                                strAEQbTJ = oWC.AEQbTJ(dDoubleValue, owc.isConnected());
                            } else {
                                if (!valueOf(owc.AhwBna())) {
                                    strKWHzl = AbstractC36302oWt.KWHzl(dDoubleValue, iEZpvd);
                                } else if (dDoubleValue < AudioStats.AUDIO_AMPLITUDE_NONE) {
                                    strKWHzl = AbstractC36302oWt.AEQbTJ(dDoubleValue, 2);
                                } else {
                                    strKWHzl = oWC.AEQbTJ(dDoubleValue, 2);
                                }
                                if (size > 1) {
                                    canvas2 = canvas;
                                    canvas2.drawText("" + strKWHzl, canvas.getWidth() - this.AEQbTJ, iDjBIcL - this.gEmmrt, this.djBIcL);
                                } else if (i == 0) {
                                    canvas2 = canvas;
                                    if (owc.AhwBna().equals("PRICE") && !EZpvd().contains("indic")) {
                                        canvas2.drawText("" + strKWHzl, canvas.getWidth() - this.AEQbTJ, iDjBIcL, this.djBIcL);
                                    }
                                    if (valueOf(owc.AhwBna())) {
                                        canvas2.drawText("" + strKWHzl, canvas.getWidth() - this.AEQbTJ, iDjBIcL, this.djBIcL);
                                    }
                                } else if (i != size - 1) {
                                    if (owc.AhwBna().equals("PRICE")) {
                                        canvas2 = canvas;
                                        try {
                                            canvas2.drawText("" + strKWHzl, canvas.getWidth() - this.AEQbTJ, iDjBIcL, this.djBIcL);
                                        } catch (java.lang.Exception e) {
                                            e = e;
                                            pUU.copydefault(this.KWHzl, e.toString());
                                        }
                                    } else {
                                        canvas2 = canvas;
                                        canvas2.drawText("" + strKWHzl, canvas.getWidth() - this.AEQbTJ, iDjBIcL - this.gEmmrt, this.djBIcL);
                                    }
                                } else {
                                    canvas2 = canvas;
                                    if (owc.AhwBna().equals("PRICE") && !EZpvd().contains("indic")) {
                                        canvas2.drawText("" + strKWHzl, canvas.getWidth() - this.AEQbTJ, iDjBIcL, this.djBIcL);
                                    } else {
                                        canvas2.drawText("" + strKWHzl, canvas.getWidth() - this.AEQbTJ, (iDjBIcL + owc.ejfBZ()) - this.gEmmrt, this.djBIcL);
                                    }
                                }
                            }
                        } else if (owc.AhwBna().equals("VOLUME")) {
                            strAEQbTJ = oWC.AEQbTJ(dDoubleValue, owc.isConnected());
                        } else if (valueOf(owc.AhwBna())) {
                            strAEQbTJ = oWC.AEQbTJ(dDoubleValue, 2);
                        } else {
                            strAEQbTJ = AbstractC36302oWt.AYXKKw(dDoubleValue / 1000.0d) + "k";
                        }
                        strKWHzl = strAEQbTJ;
                        if (size > 1) {
                        }
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        canvas2 = canvas;
                    }
                } else {
                    canvas2 = canvas3;
                    c36246oUr = c36246oUrCopydefault;
                }
                i++;
                canvas3 = canvas2;
                c36246oUrCopydefault = c36246oUr;
            }
        }
    }

    public int gEmmrt() {
        float fMeasureText;
        int i = this.EZpvd << 1;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        java.lang.String strEZpvd = EZpvd();
        int i2 = 0;
        java.lang.String strSubstring = strEZpvd.substring(0, strEZpvd.lastIndexOf("Range"));
        oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get(strSubstring);
        if (owc.AuCTel() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return -i;
        }
        java.util.ArrayList<java.lang.Double> arrayListAYXKKw = owc.AYXKKw();
        if (arrayListAYXKKw.size() == 0) {
            return -i;
        }
        if (this.AhwBna) {
            this.djBIcL.measureText(c36246oUrCopydefault.fvQaOB());
        }
        java.util.Iterator<java.lang.Double> it = arrayListAYXKKw.iterator();
        while (it.hasNext()) {
            double dDoubleValue = it.next().doubleValue();
            if (strSubstring.endsWith(com.ibm.icu.text.DateFormat.MINUTE) || dDoubleValue < 1000.0d) {
                fMeasureText = this.djBIcL.measureText(AbstractC36302oWt.AYXKKw(dDoubleValue));
            } else {
                fMeasureText = this.djBIcL.measureText(AbstractC36302oWt.AYXKKw(dDoubleValue / 1000.0d) + "k");
            }
            int i3 = (int) fMeasureText;
            if (i3 > i2) {
                i2 = i3;
            }
        }
        return i2;
    }
}
