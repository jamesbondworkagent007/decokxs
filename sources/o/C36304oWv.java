package o;

import android.graphics.Paint;
import androidx.camera.video.AudioStats;
import com.okinc.kline.library.data.DataSource;

/* JADX INFO: renamed from: o.oWv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36304oWv extends AbstractC36302oWt {
    public android.graphics.Paint AEQbTJ;
    public android.graphics.Paint KWHzl;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
    }

    public C36304oWv(java.lang.String str) {
        super(str);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.KWHzl = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.KWHzl.setStrokeWidth(AbstractC36302oWt.copydefault(1.0f));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.AEQbTJ = paint2;
        paint2.setStyle(style);
        this.AEQbTJ.setStrokeWidth(AbstractC36302oWt.copydefault(1.0f));
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        int i;
        float f;
        com.okinc.kline.library.data.DataSource dataSource;
        com.okinc.kline.library.data.DataSource dataSource2;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        oWN own = c36246oUrCopydefault.DCJXGO().get(copydefault());
        oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get(EZpvd());
        if (owc.AuCTel() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        com.okinc.kline.library.data.DataSource dataSource3 = c36246oUrCopydefault.sSMYrx().get(copydefault());
        if (dataSource3.gEmmrt() < 1) {
            return;
        }
        int iIsConnected = own.isConnected();
        int iEjfBZ = own.ejfBZ();
        float fAhwBna = own.AhwBna();
        float fFJNWhG = (((int) own.fJNWhG()) >> 1) + 1;
        float fDbNXlk = own.DbNXlk(iIsConnected);
        float fAYXKKw = own.AYXKKw(iIsConnected);
        android.graphics.Path path = new android.graphics.Path();
        android.graphics.Path path2 = new android.graphics.Path();
        android.graphics.Path path3 = new android.graphics.Path();
        while (iIsConnected < iEjfBZ) {
            DataSource.StateListAnimator stateListAnimator = dataSource3.AEQbTJ.get(iIsConnected);
            int i2 = iEjfBZ;
            int iAhwBna = owc.AhwBna(stateListAnimator.AkhnZx());
            int iMax = java.lang.Math.max(owc.AhwBna(stateListAnimator.values()) - iAhwBna, 1);
            if (stateListAnimator.copydefault() >= stateListAnimator.AuCTel()) {
                f = fAhwBna;
                int iAhwBna2 = owc.AhwBna(stateListAnimator.copydefault());
                dataSource = dataSource3;
                i = iIsConnected;
                int iAhwBna3 = owc.AhwBna(stateListAnimator.AuCTel());
                AbstractC36302oWt.AEQbTJ(path, fAYXKKw, iAhwBna, 1.0f + fAYXKKw, iAhwBna + iMax);
                AbstractC36302oWt.AEQbTJ(path, fDbNXlk, iAhwBna3, fDbNXlk + fFJNWhG, iAhwBna3 + 1);
                AbstractC36302oWt.AEQbTJ(path, fAYXKKw, iAhwBna2, fAYXKKw + fFJNWhG, iAhwBna2 + 1);
            } else {
                i = iIsConnected;
                f = fAhwBna;
                dataSource = dataSource3;
                if (stateListAnimator.copydefault() == stateListAnimator.AuCTel()) {
                    int iAhwBna4 = owc.AhwBna(stateListAnimator.copydefault());
                    AbstractC36302oWt.AEQbTJ(path2, fAYXKKw, iAhwBna, fAYXKKw + 1.0f, iAhwBna + iMax);
                    float f2 = iAhwBna4;
                    float f3 = iAhwBna4 + 1;
                    AbstractC36302oWt.AEQbTJ(path2, fDbNXlk, f2, fDbNXlk + fFJNWhG, f3);
                    AbstractC36302oWt.AEQbTJ(path2, fAYXKKw, f2, fAYXKKw + fFJNWhG, f3);
                } else {
                    int iAhwBna5 = owc.AhwBna(stateListAnimator.AuCTel());
                    dataSource2 = dataSource;
                    int iAhwBna6 = owc.AhwBna(stateListAnimator.copydefault());
                    AbstractC36302oWt.AEQbTJ(path3, fAYXKKw, iAhwBna, 1.0f + fAYXKKw, iAhwBna + iMax);
                    AbstractC36302oWt.AEQbTJ(path3, fDbNXlk, iAhwBna5, fDbNXlk + fFJNWhG, iAhwBna5 + 1);
                    AbstractC36302oWt.AEQbTJ(path3, fAYXKKw, iAhwBna6, fAYXKKw + fFJNWhG, iAhwBna6 + 1);
                    fDbNXlk += f;
                    fAYXKKw += f;
                    fAhwBna = f;
                    dataSource3 = dataSource2;
                    iEjfBZ = i2;
                    iIsConnected = i + 1;
                }
            }
            dataSource2 = dataSource;
            fDbNXlk += f;
            fAYXKKw += f;
            fAhwBna = f;
            dataSource3 = dataSource2;
            iEjfBZ = i2;
            iIsConnected = i + 1;
        }
        oWK owk = c36246oUrCopydefault.zLjUOn().getThemes().get(copydefault());
        this.KWHzl.setColor(owk.fIwbmz());
        this.AEQbTJ.setColor(owk.fJNWhG());
        canvas.drawPath(path, this.KWHzl);
        canvas.drawPath(path2, this.AEQbTJ);
        canvas.drawPath(path3, this.AEQbTJ);
    }
}
