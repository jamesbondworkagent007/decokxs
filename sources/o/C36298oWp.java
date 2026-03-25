package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32392mcI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oWp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36298oWp extends AbstractC36302oWt {
    public int AYXKKw;
    public boolean AhwBna;
    public final android.graphics.Paint AkhnZx;
    public final int AuCTel;
    public oWC DbNXlk;
    public ChartArea EZpvd;
    public java.lang.String KWHzl;
    public float OLrzqt;
    public com.okinc.kline.library.data.DataSource djBIcL;
    public final Date ejfBZ;
    public final RectF fARcdN;
    public final int fIwbmz;
    public oWN fJNWhG;
    public C36246oUr fetchVPNInfo;
    public final android.graphics.Paint gEmmrt;
    public final android.graphics.Paint isConnected;
    public final int iwGUEr;
    public java.lang.String valueOf;
    public float values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna() {
        this.AhwBna = false;
        this.KWHzl = "";
        this.OLrzqt = 0.0f;
    }

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36298oWp(java.lang.String str) {
        super(str);
        this.gEmmrt = new android.graphics.Paint();
        this.AkhnZx = new android.graphics.Paint();
        this.isConnected = new android.graphics.Paint();
        this.valueOf = "";
        this.iwGUEr = AbstractC36302oWt.copydefault(10.0f);
        this.AuCTel = AbstractC36302oWt.copydefault(32.0f);
        this.fIwbmz = AbstractC36302oWt.copydefault(2.0f);
        this.KWHzl = "";
        this.ejfBZ = new Date();
        this.fARcdN = new RectF();
        djBIcL();
        valueOf();
        AYXKKw();
    }

    /* JADX INFO: renamed from: o.oWp$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oWp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void djBIcL() {
        this.fetchVPNInfo = C36246oUr.copydefault();
    }

    public final void valueOf() {
        android.graphics.Paint paint = this.gEmmrt;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.AYXKKw);
        this.AkhnZx.setStyle(Paint.Style.FILL);
        android.graphics.Paint paint2 = this.isConnected;
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(AbstractC36302oWt.KWHzl(12.0f));
        paint2.setTypeface(C55051xce.OLrzqt.valueOf());
        this.valueOf = C33070mpX.AYXKKw(C32392mcI.Dialog.dvImUD);
    }

    public final void AYXKKw() {
        Paint.FontMetrics fontMetrics = this.isConnected.getFontMetrics();
        this.values = (-(((int) java.lang.Math.ceil(fontMetrics.bottom - fontMetrics.top)) >> 1)) - ((int) fontMetrics.top);
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(@NotNull oWK owk) {
        Intrinsics.checkNotNullParameter(owk, "");
        this.gEmmrt.setColor(owk.gEmmrt());
        this.gEmmrt.setAlpha(100);
        this.AkhnZx.setColor(owk.copydefault());
        this.isConnected.setColor(-1);
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (gEmmrt() && DbNXlk()) {
            OLrzqt(canvas);
        }
    }

    public final boolean gEmmrt() {
        oWC owc;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> dataSources;
        LinkedHashMap<java.lang.String, oWC> linkedHashMapQVAiDq;
        C36246oUr c36246oUr = this.fetchVPNInfo;
        if (c36246oUr == null) {
            return false;
        }
        oUE oueIwGUEr = c36246oUr.iwGUEr();
        if (oueIwGUEr == null || (linkedHashMapQVAiDq = oueIwGUEr.QVAiDq()) == null) {
            owc = null;
        } else {
            owc = linkedHashMapQVAiDq.get(copydefault() + ".m");
        }
        this.DbNXlk = owc;
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = c36246oUr.zLjUOn();
        this.djBIcL = (chartViewOutSideConfigZLjUOn == null || (dataSources = chartViewOutSideConfigZLjUOn.getDataSources()) == null) ? null : dataSources.get(copydefault());
        LinkedHashMap<java.lang.String, ChartArea> linkedHashMapValues = c36246oUr.values();
        this.EZpvd = linkedHashMapValues != null ? linkedHashMapValues.get(EZpvd()) : null;
        java.util.HashMap<java.lang.String, oWN> mapDCJXGO = c36246oUr.DCJXGO();
        this.fJNWhG = mapDCJXGO != null ? mapDCJXGO.get(copydefault()) : null;
        return true;
    }

    public final boolean DbNXlk() {
        com.okinc.kline.library.data.DataSource dataSource = this.djBIcL;
        return (dataSource == null || dataSource.gEmmrt() < 1 || this.fJNWhG == null || this.EZpvd == null) ? false : true;
    }

    public final void OLrzqt(android.graphics.Canvas canvas) {
        oWN own;
        ChartArea chartArea;
        com.okinc.kline.library.data.DataSource dataSource;
        C36246oUr c36246oUr = this.fetchVPNInfo;
        if (c36246oUr == null || (own = this.fJNWhG) == null || (chartArea = this.EZpvd) == null || (dataSource = this.djBIcL) == null) {
            return;
        }
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = c36246oUr.zLjUOn();
        int fastKLineIndex = chartViewOutSideConfigZLjUOn != null ? chartViewOutSideConfigZLjUOn.getFastKLineIndex() : -1;
        if (fastKLineIndex <= -1 || fastKLineIndex >= dataSource.gEmmrt()) {
            this.AhwBna = false;
            return;
        }
        float fAYXKKw = own.AYXKKw(fastKLineIndex);
        KWHzl(canvas, fAYXKKw, chartArea);
        AEQbTJ(canvas, fastKLineIndex, fAYXKKw);
    }

    public final void KWHzl(android.graphics.Canvas canvas, float f, ChartArea chartArea) {
        canvas.drawLine(f, 0.0f, f, chartArea.KWHzl(), this.gEmmrt);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, int i, float f) {
        ChartArea chartArea;
        com.okinc.kline.library.data.DataSource dataSource = this.djBIcL;
        if (dataSource == null || (chartArea = this.EZpvd) == null) {
            return;
        }
        try {
            AEQbTJ(dataSource, i);
            EZpvd(canvas, f, chartArea);
            OLrzqt(canvas, f, chartArea);
        } catch (java.lang.Exception e) {
            e.getMessage();
            AhwBna();
        }
    }

    public final void AEQbTJ(com.okinc.kline.library.data.DataSource dataSource, int i) {
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn;
        if (this.AhwBna) {
            return;
        }
        DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList = dataSource.AEQbTJ;
        if (i < 0 || i >= dataArrayList.size()) {
            return;
        }
        this.ejfBZ.setTime(dataArrayList.get(i).AhwBna());
        C36246oUr c36246oUr = this.fetchVPNInfo;
        java.lang.String str = (c36246oUr == null || (chartViewOutSideConfigZLjUOn = c36246oUr.zLjUOn()) == null || !chartViewOutSideConfigZLjUOn.isSelectTimeEarlier()) ? pTA.format$default(this.ejfBZ, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null) : this.valueOf;
        this.KWHzl = str;
        this.OLrzqt = this.isConnected.measureText(str) + (this.iwGUEr * 2);
        this.AhwBna = true;
    }

    public final void EZpvd(android.graphics.Canvas canvas, float f, ChartArea chartArea) {
        float f2 = 2;
        float f3 = this.OLrzqt / f2;
        float f4 = this.AuCTel / f2;
        float fAkhnZx = chartArea.AkhnZx();
        this.fARcdN.set(f - f3, fAkhnZx - f4, f + f3, fAkhnZx + f4);
        RectF rectF = this.fARcdN;
        float f5 = this.fIwbmz;
        canvas.drawRoundRect(rectF, f5, f5, this.AkhnZx);
    }

    public final void OLrzqt(android.graphics.Canvas canvas, float f, ChartArea chartArea) {
        canvas.drawText(this.KWHzl, f, chartArea.AkhnZx() + this.values, this.isConnected);
    }
}
