package o;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.drawable.VectorDrawable;
import androidx.camera.video.AudioStats;
import androidx.compose.material3.CalendarModelKt;
import androidx.exifinterface.media.ExifInterface;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Objects;

/* JADX INFO: renamed from: o.oWt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC36302oWt extends C36252oUx {
    public android.graphics.drawable.Drawable DGUQLIDGUQLI;
    public int DGUQLIOvDItG;
    public int DTg;
    public android.graphics.drawable.Drawable getLabel;
    public PathEffect getPriority;
    public PathEffect gtCCJH;
    public VectorDrawable zOIQXb;
    public int zSsVtY;
    public int zYHWMc;
    public boolean zhUgOk;
    public int zlvcHA;
    public int zqTOFw;

    public abstract void AEQbTJ(android.graphics.Canvas canvas);

    public abstract void KWHzl();

    public abstract void OLrzqt(oWK owk);

    public static int copydefault(float f) {
        return (int) android.util.TypedValue.applyDimension(1, f, C36246oUr.copydefault().AubY().getResources().getDisplayMetrics());
    }

    public static int KWHzl(float f) {
        return (int) android.util.TypedValue.applyDimension(2, f, C36246oUr.copydefault().AubY().getResources().getDisplayMetrics());
    }

    public AbstractC36302oWt(java.lang.String str) {
        super(str);
        this.zhUgOk = false;
        this.zlvcHA = 0;
        this.zqTOFw = 191;
        this.zSsVtY = 217;
        this.zYHWMc = 255;
        this.gtCCJH = new DashPathEffect(new float[]{6.0f, 6.0f}, 1.0f);
        this.getPriority = new DashPathEffect(new float[]{10.0f, 10.0f}, 1.0f);
        this.zOIQXb = null;
    }

    public static android.graphics.Path AEQbTJ(android.graphics.Path path, float f, float f2, float f3, float f4) {
        path.moveTo(f, f2);
        path.lineTo(f3, f2);
        path.lineTo(f3, f4);
        path.lineTo(f, f4);
        path.lineTo(f, f2);
        return path;
    }

    public static java.lang.String AEQbTJ(double d, int i) {
        return pTB.AEQbTJ(pTB.OLrzqt((java.lang.Object) C33129mqd.gEmmrt(java.lang.Double.valueOf(d))), i);
    }

    public static java.lang.String AYXKKw(double d) {
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = C36246oUr.copydefault().zLjUOn();
        if (chartViewOutSideConfigZLjUOn.isCeFiMCapMode()) {
            return copydefault(d);
        }
        if (chartViewOutSideConfigZLjUOn.isMarketCap()) {
            return AhwBna(d);
        }
        if (AEQbTJ(d, chartViewOutSideConfigZLjUOn)) {
            return AEQbTJ(d);
        }
        return pTB.AEQbTJ(pTB.OLrzqt((java.lang.Object) C33129mqd.gEmmrt(java.lang.Double.valueOf(d))), EZpvd(d));
    }

    public static boolean AEQbTJ(double d, ChartViewOutSideConfig chartViewOutSideConfig) {
        return C36246oUr.copydefault().DLWbHP() && C33129mqd.gEmmrt(java.lang.Double.valueOf(d), java.lang.Double.valueOf(1.0E-4d));
    }

    public static java.lang.String KWHzl(double d, int i) {
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = C36246oUr.copydefault().zLjUOn();
        if (chartViewOutSideConfigZLjUOn.isCeFiMCapMode()) {
            return copydefault(d);
        }
        if (chartViewOutSideConfigZLjUOn.isMarketCap()) {
            return EZpvd(d, i);
        }
        if (AEQbTJ(d, chartViewOutSideConfigZLjUOn)) {
            return AEQbTJ(d);
        }
        return pTB.AEQbTJ(pTB.OLrzqt((java.lang.Object) C33129mqd.gEmmrt(java.lang.Double.valueOf(d))), EZpvd(d));
    }

    public static java.lang.String AEQbTJ(double d) {
        try {
            return C38305pTw.KWHzl(java.lang.Double.valueOf(d), "USD", RoundingMode.DOWN, C38307pTy.Companion.copydefault(5, 5)).replace("$", "");
        } catch (java.lang.Exception unused) {
            return "0";
        }
    }

    public static java.lang.String copydefault(double d) {
        return C38305pTw.AEQbTJ(pTB.OLrzqt(java.lang.Double.valueOf(d)), Currency.getInstance(java.util.Locale.US).getCurrencyCode(), RoundingMode.HALF_UP, C38307pTy.Companion.EZpvd(2), DisplaySign.AUTO, Notation.COMPACT_SHORT);
    }

    public static java.lang.String AhwBna(double d) {
        return EZpvd(d, EZpvd(d));
    }

    public static java.lang.String EZpvd(double d, int i) {
        if (d < 1000.0d) {
            return pTB.AEQbTJ(pTB.OLrzqt((java.lang.Object) C33129mqd.gEmmrt(java.lang.Double.valueOf(d))), i);
        }
        if (d < 1000000.0d) {
            return pTB.AEQbTJ(pTB.OLrzqt((java.lang.Object) C33129mqd.gEmmrt(java.lang.Double.valueOf(d / 1000.0d))), 2) + "K";
        }
        if (d < 1.0E9d) {
            return pTB.AEQbTJ(pTB.OLrzqt((java.lang.Object) C33129mqd.gEmmrt(java.lang.Double.valueOf(d / 1000000.0d))), 2) + "M";
        }
        if (d < 1.0E12d) {
            return pTB.AEQbTJ(pTB.OLrzqt((java.lang.Object) C33129mqd.gEmmrt(java.lang.Double.valueOf(d / 1.0E9d))), 2) + "B";
        }
        return pTB.AEQbTJ(pTB.OLrzqt((java.lang.Object) C33129mqd.gEmmrt(java.lang.Double.valueOf(d / 1.0E12d))), 2) + ExifInterface.GPS_DIRECTION_TRUE;
    }

    public static int EZpvd(double d) {
        if (C36246oUr.copydefault().RdAHlO() && !C36246oUr.copydefault().zLjUOn().isFromFormula()) {
            return C36246oUr.copydefault().gkJEwt();
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(d));
        if (djBIcL(strGEmmrt)) {
            strGEmmrt = BigDecimal.valueOf(d).toPlainString();
        }
        int iDvKsVJ = C36246oUr.copydefault().dvKsVJ();
        int iIndexOf = strGEmmrt.indexOf(46);
        return (iIndexOf != -1 ? KWHzl(strGEmmrt.substring(iIndexOf + 1)) : 0) + iDvKsVJ;
    }

    public static int KWHzl(java.lang.String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length() && str.charAt(i2) == '0'; i2++) {
            i++;
        }
        return i;
    }

    public static boolean djBIcL(java.lang.String str) {
        if (!str.contains("E") && !str.contains("e")) {
            return false;
        }
        java.lang.String[] strArrSplit = str.split("[Ee]");
        return strArrSplit.length == 2 && strArrSplit[1].matches("[+-]?\\d+");
    }

    public boolean AEQbTJ(AbstractC36262oVg abstractC36262oVg) {
        return (abstractC36262oVg instanceof C36275oVt) || (abstractC36262oVg instanceof C36281oVz) || (abstractC36262oVg instanceof oVB);
    }

    public boolean OLrzqt(AbstractC36262oVg abstractC36262oVg) {
        return (abstractC36262oVg instanceof C36275oVt) || (abstractC36262oVg instanceof C36281oVz) || (abstractC36262oVg instanceof oVB) || (abstractC36262oVg instanceof C36269oVn) || (abstractC36262oVg instanceof oVG);
    }

    public boolean valueOf(java.lang.String str) {
        return str.equals("OI") || str.equals("LSAcco") || str.equals("LSPos") || str.equals("LSRatio") || str.equals("BSVol");
    }

    public boolean getFieldNames() {
        TemplateSetting templateSettingKWHzl = C36246oUr.copydefault().KWHzl(copydefault());
        return (templateSettingKWHzl == null || templateSettingKWHzl.getSPTimeInterval() >= 5) && C36246oUr.copydefault().QVsKAR();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.lang.String strCopydefault;
        if (str2 == null || str2.isEmpty()) {
            if (str == null || str.isEmpty()) {
                strCopydefault = str;
            } else if (str.equalsIgnoreCase("#ffffff")) {
                strCopydefault = "#E3E3E3";
            } else if (str.equalsIgnoreCase("#000000")) {
                strCopydefault = "#2F2F2F";
            } else if (str.equalsIgnoreCase("#131722")) {
                strCopydefault = "#424242";
            }
        } else {
            strCopydefault = pDT.Companion.KWHzl().copydefault(str2, C36246oUr.copydefault().DarRvM());
        }
        return (strCopydefault == null || strCopydefault.isEmpty()) ? str : strCopydefault;
    }

    public void copydefault(android.graphics.Paint paint) {
        paint.setAlpha(this.zYHWMc);
    }

    public void KWHzl(android.graphics.Paint paint, int i) {
        paint.setAlpha(i);
    }

    public void KWHzl(android.graphics.Canvas canvas, int i, int i2, int i3, android.graphics.Paint paint) {
        float f = i3;
        canvas.drawLine(i, f, i2, f, paint);
    }

    public void copydefault(android.graphics.Canvas canvas, int i, int i2, int i3, int i4) {
        VectorDrawable vectorDrawable = this.zOIQXb;
        if (vectorDrawable != null) {
            vectorDrawable.setBounds(i, i2, i3, i4);
            this.zOIQXb.draw(canvas);
        }
    }

    public double gEmmrt(double d) {
        double dFARcdN = fARcdN();
        return (d * dFARcdN) + dFARcdN;
    }

    public double fARcdN() {
        oUG oug;
        try {
            oWN own = C36246oUr.copydefault().DCJXGO().get(copydefault());
            if (own == null || (oug = C36246oUr.copydefault().iwGUEr().AkhnZx().get("ds0.m.m")) == null) {
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            if (oug instanceof oUM) {
                oUM oum = (oUM) oug;
                if (oum.valueOf() != null && !oum.valueOf().isEmpty()) {
                    return oum.valueOf().get(own.isConnected()).copydefault();
                }
            }
            if (!(oug instanceof oUK)) {
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            oUK ouk = (oUK) oug;
            return (ouk.valueOf() == null || ouk.valueOf().isEmpty()) ? AudioStats.AUDIO_AMPLITUDE_NONE : ouk.valueOf().get(own.isConnected()).copydefault();
        } catch (java.lang.Exception unused) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
    }

    public void EZpvd(android.graphics.Canvas canvas, int i, int i2) {
        int width = canvas.getWidth() / 2;
        this.DGUQLIDGUQLI.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        android.graphics.drawable.Drawable drawable = this.DGUQLIDGUQLI;
        int i3 = this.DGUQLIOvDItG;
        drawable.setBounds(width - i3, i2 - i3, width + i3, i3 + i2);
        this.DGUQLIDGUQLI.draw(canvas);
        android.graphics.drawable.Drawable drawable2 = this.getLabel;
        int i4 = this.DTg;
        drawable2.setBounds(width - i4, i2 - i4, width + i4, i2 + i4);
        this.getLabel.draw(canvas);
    }

    public int OLrzqt(long j) {
        oWN own = C36246oUr.copydefault().DCJXGO().get(copydefault());
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().sSMYrx().get("ds0");
        if (own == null || dataSource == null || dataSource.AEQbTJ.isEmpty()) {
            return 0;
        }
        long jKWHzl = pEV.OLrzqt.KWHzl();
        if (j < dataSource.AEQbTJ.get(0).AhwBna()) {
            return (int) ((j - dataSource.AEQbTJ.get(0).AhwBna()) / jKWHzl);
        }
        if (j > dataSource.AEQbTJ.get(r0.size() - 1).AhwBna()) {
            return (int) ((((j - dataSource.AEQbTJ.get(r0.size() - 1).AhwBna()) / jKWHzl) + ((long) dataSource.AEQbTJ.size())) - 1);
        }
        for (int i = 0; i < dataSource.AEQbTJ.size(); i++) {
            long jAhwBna = dataSource.AEQbTJ.get(i).AhwBna();
            if (Objects.equals(java.lang.Long.valueOf(jAhwBna), java.lang.Long.valueOf(j)) || (j > jAhwBna && j < jAhwBna + jKWHzl)) {
                return i;
            }
        }
        return dataSource.AEQbTJ.size() - 1;
    }

    public long iwGUEr() {
        int iODWQjV = C36246oUr.copydefault().ODWQjV();
        if (iODWQjV == -30) {
            return 30000L;
        }
        if (iODWQjV == -15) {
            return 15000L;
        }
        if (iODWQjV == -5) {
            return 5000L;
        }
        if (iODWQjV == -2) {
            return CalendarModelKt.MillisecondsIn24Hours;
        }
        if (iODWQjV == -1) {
            return 60000L;
        }
        if (iODWQjV != 0) {
            return 60000 * ((long) iODWQjV);
        }
        return 1000L;
    }
}
