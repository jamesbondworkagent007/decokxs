package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.indicator.Expression;

/* JADX INFO: renamed from: o.oVg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC36262oVg extends C36260oVe {
    public final java.util.ArrayList<Expression.ActionBar> AEQbTJ;
    public java.util.ArrayList<Expression.Parameter> AYXKKw;
    public boolean EZpvd;
    public final java.util.ArrayList<Expression.Output> KWHzl;
    public Activity OLrzqt;
    public java.util.ArrayList<Expression.Parameter> valueOf;

    public abstract java.lang.String AYXKKw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.util.ArrayList<Expression.Parameter> arrayList) {
        this.AYXKKw = arrayList;
    }

    public double djBIcL() {
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.ArrayList<Expression.Parameter> gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.ArrayList<Expression.Parameter> isConnected() {
        return this.AYXKKw;
    }

    public AbstractC36262oVg(java.lang.String str) {
        super(str);
        this.OLrzqt = new Activity();
        this.valueOf = new java.util.ArrayList<>();
        this.AYXKKw = new java.util.ArrayList<>();
        this.AEQbTJ = new java.util.ArrayList<>();
        this.KWHzl = new java.util.ArrayList<>();
        this.EZpvd = false;
    }

    public void valueOf() {
        int[] iArr = new int[DbNXlk()];
        if (fIwbmz() != DbNXlk()) {
            for (int i = 0; i < DbNXlk(); i++) {
                iArr[i] = (int) EZpvd(i).execute(0);
            }
            copydefault(iArr);
            return;
        }
        for (int i2 = 0; i2 < DbNXlk(); i2++) {
            Expression.Parameter parameterEZpvd = EZpvd(i2);
            int iAEQbTJ = AEQbTJ(i2);
            double d = iAEQbTJ;
            if (d != parameterEZpvd.getDefaultValue()) {
                if (d < parameterEZpvd.getMinValue()) {
                    iAEQbTJ = (int) parameterEZpvd.getMinValue();
                }
                if (iAEQbTJ > parameterEZpvd.getMaxValue()) {
                    iAEQbTJ = (int) parameterEZpvd.getMaxValue();
                }
            }
            iArr[i2] = iAEQbTJ;
        }
        OLrzqt(iArr);
        copydefault(iArr);
    }

    /* JADX INFO: renamed from: o.oVg$Activity */
    public static class Activity extends Expression.ComponentCallbacks2 {
        public com.okinc.kline.library.data.DataSource AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public com.okinc.kline.library.data.DataSource KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void copydefault(com.okinc.kline.library.data.DataSource dataSource) {
            this.AEQbTJ = dataSource;
        }

        private Activity() {
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public int AEQbTJ() {
            return this.AEQbTJ.djBIcL();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double values(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).AuCTel();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double AhwBna(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).AkhnZx();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double AYXKKw(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).values();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double KWHzl(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).copydefault();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double AkhnZx(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).zsXlph();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double djBIcL(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).DbNXlk();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double EZpvd(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).djBIcL();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double AEQbTJ(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).gEmmrt();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double OLrzqt(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).valueOf();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double copydefault(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).AYXKKw();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double gEmmrt(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).isConnected();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double valueOf(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).fetchVPNInfo();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double fetchVPNInfo(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).getFieldNames();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double DbNXlk(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).getNewProxyInstance();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double isConnected(int i) {
            return this.AEQbTJ.AEQbTJ.get(i).uzCIH();
        }

        @Override // com.okinc.kline.library.indicator.Expression.ComponentCallbacks2
        public double AEQbTJ(int i, java.lang.String str) {
            try {
                return this.AEQbTJ.AEQbTJ.get(i).EZpvd(str);
            } catch (java.lang.Exception e) {
                pUU.copydefault("ChartView", "getCompareClose:error = " + e.getMessage());
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
        }
    }

    public void OLrzqt(Expression.Parameter parameter) {
        this.valueOf.add(parameter);
    }

    public void EZpvd(Expression.Parameter parameter) {
        this.AYXKKw.add(parameter);
    }

    public void EZpvd(Expression.ActionBar actionBar) {
        this.AEQbTJ.add(actionBar);
    }

    public void OLrzqt(Expression.Output output) {
        this.KWHzl.add(output);
    }

    public int DbNXlk() {
        return this.valueOf.size();
    }

    public int values() {
        return this.AYXKKw.size();
    }

    public Expression.Parameter EZpvd(int i) {
        if (i < DbNXlk()) {
            return this.valueOf.get(i);
        }
        return null;
    }

    public Expression.Parameter copydefault(int i) {
        if (i < values()) {
            return this.AYXKKw.get(i);
        }
        return null;
    }

    public final void OLrzqt(int[] iArr) {
        if (iArr.length == DbNXlk()) {
            for (int i = 0; i < iArr.length; i++) {
                EZpvd(i).setValue(iArr[i]);
            }
        }
    }

    public int AhwBna() {
        return this.KWHzl.size();
    }

    public Expression.Output OLrzqt(int i) {
        return this.KWHzl.get(i);
    }

    public void KWHzl() {
        this.OLrzqt.OLrzqt();
        java.util.Iterator<Expression.ActionBar> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        java.util.Iterator<Expression.Output> it2 = this.KWHzl.iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
    }

    public void KWHzl(com.okinc.kline.library.data.DataSource dataSource, boolean z) throws java.lang.Exception {
        if (dataSource == null || dataSource.gEmmrt() <= 0) {
            return;
        }
        this.OLrzqt.copydefault(dataSource);
        Expression.ComponentCallbacks2.EZpvd(this.OLrzqt);
        int i = 0;
        int iMax = java.lang.Math.max(this.KWHzl.get(0).OLrzqt() - 1, dataSource.djBIcL());
        if (z) {
            dataSource.DbNXlk();
        } else {
            i = iMax;
        }
        int iDbNXlk = dataSource.DbNXlk();
        while (i < iDbNXlk) {
            try {
                java.util.Iterator<Expression.ActionBar> it = this.AEQbTJ.iterator();
                while (it.hasNext()) {
                    it.next().AEQbTJ(i, z);
                }
                java.util.Iterator<Expression.Output> it2 = this.KWHzl.iterator();
                while (it2.hasNext()) {
                    it2.next().AEQbTJ(i, z);
                }
                if (this.OLrzqt.EZpvd() < 0) {
                    this.OLrzqt.fJNWhG(i);
                }
            } catch (java.lang.Exception e) {
                if (this.OLrzqt.EZpvd() >= 0) {
                    throw e;
                }
            }
            i++;
        }
        this.KWHzl.size();
        this.AEQbTJ.size();
    }

    public void fJNWhG() {
        KWHzl();
        KWHzl(this.OLrzqt.KWHzl(), false);
    }

    public void AkhnZx() {
        for (int i = 0; i < DbNXlk(); i++) {
            Expression.Parameter parameterEZpvd = EZpvd(i);
            parameterEZpvd.setTempValue(parameterEZpvd.getValue());
        }
    }

    public void fetchVPNInfo() {
        for (int i = 0; i < values(); i++) {
            Expression.Parameter parameterCopydefault = copydefault(i);
            parameterCopydefault.setIsShowTemp(parameterCopydefault.getIsShow());
            parameterCopydefault.setColorTemp(parameterCopydefault.getColor());
            parameterCopydefault.setColorBlkTemp(parameterCopydefault.getColorBlk());
            parameterCopydefault.setTransparencyTemp(parameterCopydefault.getTransparency());
        }
    }

    public void EZpvd() {
        int[] iArr = new int[DbNXlk()];
        for (int i = 0; i < DbNXlk(); i++) {
            Expression.Parameter parameterEZpvd = EZpvd(i);
            parameterEZpvd.setValue(parameterEZpvd.getTempValue());
            parameterEZpvd.setIsShow(parameterEZpvd.getIsShowTemp());
            iArr[i] = (int) parameterEZpvd.getValue();
        }
        copydefault(iArr);
    }

    public void copydefault() {
        for (int i = 0; i < values(); i++) {
            Expression.Parameter parameterCopydefault = copydefault(i);
            parameterCopydefault.setSubValue(parameterCopydefault.getIsShowTemp(), parameterCopydefault.getColorTemp(), parameterCopydefault.getTransparencyTemp(), parameterCopydefault.getColorBlkTemp());
        }
    }
}
