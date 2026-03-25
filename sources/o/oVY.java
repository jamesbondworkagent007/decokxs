package o;

import com.okinc.kline.library.layout.ChartArea;

/* JADX INFO: loaded from: classes8.dex */
public class oVY extends C36284oWb {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;

    public oVY(java.lang.String str) {
        super(str);
    }

    @Override // o.C36284oWb, o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        java.lang.String strSubstring;
        if (this.zhUgOk) {
            return;
        }
        java.lang.String strEZpvd = EZpvd();
        if (!strEZpvd.equals(this.EZpvd) || (strSubstring = this.AEQbTJ) == null) {
            int iLastIndexOf = strEZpvd.lastIndexOf("Range");
            strSubstring = iLastIndexOf > 0 ? strEZpvd.substring(0, iLastIndexOf) : strEZpvd;
            this.EZpvd = strEZpvd;
            this.AEQbTJ = strSubstring;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        ChartArea chartArea = c36246oUrCopydefault.values().get(strEZpvd);
        oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get(strSubstring);
        if (chartArea == null || owc == null) {
            return;
        }
        if (chartArea.ejfBZ() || owc.hDKMBd()) {
            this.KWHzl.set(chartArea.AYXKKw(), chartArea.AuCTel(), chartArea.DbNXlk(), chartArea.KWHzl());
            canvas.drawRect(this.KWHzl, this.OLrzqt);
        }
    }
}
