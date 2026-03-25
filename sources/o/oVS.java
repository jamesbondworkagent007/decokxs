package o;

import android.graphics.Paint;
import com.okinc.kline.library.layout.ChartArea;

/* JADX INFO: loaded from: classes8.dex */
public class oVS extends oVT {
    public final android.graphics.Paint fARcdN;

    public oVS(java.lang.String str) {
        super(str);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.fARcdN = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.okinc.kline.library.layout.ChartArea
    public void OLrzqt(int i, int i2) {
        copydefault(i, i2);
        int size = this.fJNWhG.size();
        for (int i3 = 0; i3 < size; i3++) {
            ChartArea chartArea = this.fJNWhG.get(i3);
            chartArea.OLrzqt(i, i2);
            int i4 = AnonymousClass3.AEQbTJ[chartArea.AhwBna().ordinal()];
            if (i4 == 1 || i4 == 2) {
                i -= chartArea.isConnected();
            } else if (i4 == 3 || i4 == 4) {
                i2 -= chartArea.gEmmrt();
            } else if (i4 == 5) {
                i = 0;
                i2 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: o.oVS$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[ChartArea.DockStyle.values().length];
            AEQbTJ = iArr;
            try {
                iArr[ChartArea.DockStyle.Left.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[ChartArea.DockStyle.Right.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[ChartArea.DockStyle.Top.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[ChartArea.DockStyle.Bottom.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[ChartArea.DockStyle.Fill.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.okinc.kline.library.layout.ChartArea
    public void copydefault(int i, int i2, int i3, int i4, boolean z) {
        super.copydefault(i, i2, i3, i4, z);
        if (!z) {
            z = ejfBZ();
        }
        int size = this.fJNWhG.size();
        int i5 = i4;
        int i6 = i3;
        int i7 = i2;
        int i8 = i;
        for (int i9 = 0; i9 < size; i9++) {
            ChartArea chartArea = this.fJNWhG.get(i9);
            int iIsConnected = chartArea.isConnected();
            int iGEmmrt = chartArea.gEmmrt();
            int i10 = AnonymousClass3.AEQbTJ[chartArea.AhwBna().ordinal()];
            if (i10 == 1) {
                int i11 = i8 + iIsConnected;
                chartArea.copydefault(i8, i7, i11, i5, z);
                i8 = i11;
            } else if (i10 == 2) {
                int i12 = i6 - iIsConnected;
                chartArea.copydefault(i12, i7, i6, i5, z);
                i6 = i12;
            } else if (i10 == 3) {
                int i13 = i7 + iGEmmrt;
                chartArea.copydefault(i8, i7, i6, i13, z);
                i7 = i13;
            } else if (i10 == 4) {
                int i14 = i5 - iGEmmrt;
                chartArea.copydefault(i8, i14, i6, i5, z);
                i5 = i14;
            } else if (i10 == 5) {
                chartArea.copydefault(i8, i7, i6, i5, z);
                i8 = i6;
                i7 = i5;
            }
        }
    }

    @Override // o.oVT
    public void copydefault(oWK owk) {
        this.fARcdN.setColor(owk.OLrzqt(1));
    }

    @Override // o.oVT
    public void OLrzqt(android.graphics.Canvas canvas) {
        int size = this.fJNWhG.size();
        for (int i = 0; i < size; i++) {
            if (AnonymousClass3.AEQbTJ[this.fJNWhG.get(i).AhwBna().ordinal()] == 4) {
                canvas.drawLine(AYXKKw(), r2.AuCTel(), DbNXlk(), r2.AuCTel(), this.fARcdN);
            }
        }
    }
}
