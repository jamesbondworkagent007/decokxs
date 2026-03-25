package o;

import android.graphics.Color;
import androidx.camera.video.AudioStats;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.p2p.api.OtcExtraKeys;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import o.C32392mcI;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.oWn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36296oWn extends AbstractC36297oWo {
    public android.content.res.Resources EZpvd;

    public C36296oWn(java.lang.String str) {
        super(str);
        this.EZpvd = C36246oUr.copydefault().AubY().getApplicationContext().getResources();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0287 A[PHI: r1 r21
  0x0287: PHI (r1v13 int) = (r1v12 int), (r1v12 int), (r1v12 int), (r1v12 int), (r1v12 int), (r1v12 int), (r1v12 int), (r1v16 int) binds: [B:62:0x025f, B:64:0x0265, B:66:0x026e, B:57:0x0236, B:59:0x0244, B:50:0x0206, B:52:0x0215, B:40:0x01ba] A[DONT_GENERATE, DONT_INLINE]
  0x0287: PHI (r21v1 int) = (r21v0 int), (r21v0 int), (r21v0 int), (r21v0 int), (r21v0 int), (r21v0 int), (r21v0 int), (r21v3 int) binds: [B:62:0x025f, B:64:0x0265, B:66:0x026e, B:57:0x0236, B:59:0x0244, B:50:0x0206, B:52:0x0215, B:40:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028f  */
    @Override // o.AbstractC36297oWo, o.AbstractC36302oWt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(android.graphics.Canvas canvas) {
        ChartArea chartArea;
        C36246oUr c36246oUr;
        java.lang.String string;
        int[] iArr;
        int i;
        int i2;
        java.lang.String string2;
        if (this.zhUgOk) {
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        ChartArea chartArea2 = c36246oUrCopydefault.values().get(EZpvd());
        oUK ouk = (oUK) c36246oUrCopydefault.iwGUEr().AkhnZx().get(EZpvd() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (ouk != null) {
            oWK owk = c36246oUrCopydefault.zLjUOn().getThemes().get(copydefault());
            AbstractC36262oVg abstractC36262oVgIsConnected = ouk.isConnected();
            new android.graphics.Rect(chartArea2.AYXKKw() + this.AkhnZx, chartArea2.AuCTel() + this.DbNXlk, chartArea2.fIwbmz() - AbstractC36302oWt.copydefault(4.0f), this.fIwbmz);
            this.ejfBZ.setColor(owk.EZpvd(3));
            this.ejfBZ.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
            oWN own = c36246oUrCopydefault.DCJXGO().get(copydefault());
            int iHDKMBd = own.hDKMBd();
            if (iHDKMBd < 0) {
                iHDKMBd = own.AuCTel() - 1;
            }
            int iAhwBna = abstractC36262oVgIsConnected.AhwBna();
            java.lang.String[] strArr = new java.lang.String[iAhwBna];
            int[] iArr2 = new int[iAhwBna];
            int i3 = 0;
            int i4 = 0;
            while (i3 < iAhwBna) {
                Expression.Output outputOLrzqt = abstractC36262oVgIsConnected.OLrzqt(i3);
                if (!(abstractC36262oVgIsConnected instanceof oVE) || (!outputOLrzqt.EZpvd().equals("UB") && !outputOLrzqt.EZpvd().equals(ExpandedProductParsedResult.POUND))) {
                    double dExecute = outputOLrzqt.execute(iHDKMBd);
                    if ((AEQbTJ(abstractC36262oVgIsConnected) && !abstractC36262oVgIsConnected.fARcdN() && i3 == 0) || java.lang.Double.isNaN(dExecute)) {
                        c36246oUr = c36246oUrCopydefault;
                        chartArea = chartArea2;
                        iArr = iArr2;
                        i = i3;
                    } else {
                        if ("VOL".equals(outputOLrzqt.EZpvd()) && !c36246oUrCopydefault.AkhnZx().isEmpty()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            chartArea = chartArea2;
                            sb.append(outputOLrzqt.EZpvd());
                            sb.append("(");
                            sb.append(c36246oUrCopydefault.AkhnZx());
                            sb.append("): ");
                            sb.append(oWC.AEQbTJ(dExecute, AbstractC36302oWt.EZpvd(dExecute)));
                            sb.append(" ");
                            c36246oUr = c36246oUrCopydefault;
                            string2 = sb.toString();
                            iArr = iArr2;
                            i = i3;
                            i2 = i4;
                        } else {
                            chartArea = chartArea2;
                            if (abstractC36262oVgIsConnected.ejfBZ().equals("VOLUME")) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                c36246oUr = c36246oUrCopydefault;
                                sb2.append(outputOLrzqt.EZpvd());
                                sb2.append(": ");
                                sb2.append(oWC.AEQbTJ(dExecute, AbstractC36302oWt.EZpvd(dExecute)));
                                sb2.append(" ");
                                string = sb2.toString();
                            } else {
                                c36246oUr = c36246oUrCopydefault;
                                string = outputOLrzqt.EZpvd() + ": " + AbstractC36302oWt.AYXKKw(dExecute) + " ";
                            }
                            java.lang.String str = string;
                            iArr = iArr2;
                            if (abstractC36262oVgIsConnected instanceof oVL) {
                                i = i3;
                                i2 = i4;
                                if (((int) abstractC36262oVgIsConnected.EZpvd(0).getValue()) - 1 > iHDKMBd) {
                                    string2 = outputOLrzqt.EZpvd() + ": --  ";
                                } else {
                                    string2 = str;
                                }
                                if (OLrzqt(abstractC36262oVgIsConnected)) {
                                    string2 = AEQbTJ(outputOLrzqt) + ": " + AEQbTJ(abstractC36262oVgIsConnected, outputOLrzqt, dExecute) + " ";
                                }
                            } else {
                                i = i3;
                                i2 = i4;
                                if ((outputOLrzqt instanceof Expression.Paint) && ((Expression.Paint) outputOLrzqt).AhwBna() - 1 > iHDKMBd) {
                                    string2 = outputOLrzqt.EZpvd() + ": --  ";
                                } else if (abstractC36262oVgIsConnected instanceof C36266oVk) {
                                    if (abstractC36262oVgIsConnected.AhwBna() > 0 && ((Expression.Paint) abstractC36262oVgIsConnected.OLrzqt(0)).AhwBna() - 1 > iHDKMBd) {
                                        string2 = outputOLrzqt.EZpvd() + ": --  ";
                                    }
                                } else if (abstractC36262oVgIsConnected instanceof C36279oVx) {
                                    if (abstractC36262oVgIsConnected.DbNXlk() > 0 && ((int) abstractC36262oVgIsConnected.EZpvd(0).getValue()) - 1 > iHDKMBd) {
                                        string2 = outputOLrzqt.EZpvd() + ": --  ";
                                    }
                                } else if ((abstractC36262oVgIsConnected instanceof C36274oVs) && abstractC36262oVgIsConnected.DbNXlk() > 0 && ((int) abstractC36262oVgIsConnected.djBIcL()) - 1 > iHDKMBd) {
                                    string2 = outputOLrzqt.EZpvd() + ": --  ";
                                }
                                if (OLrzqt(abstractC36262oVgIsConnected)) {
                                }
                            }
                        }
                        if (abstractC36262oVgIsConnected.values() >= iAhwBna) {
                            if (abstractC36262oVgIsConnected.copydefault(i).getIsShow()) {
                                strArr[i] = string2;
                            } else {
                                strArr[i] = "";
                            }
                        } else {
                            strArr[i2] = string2;
                        }
                        int iKWHzl = outputOLrzqt.KWHzl();
                        if (iKWHzl < 0) {
                            iKWHzl = i + 1;
                        }
                        iArr[i2] = owk.KWHzl(iKWHzl);
                        if (abstractC36262oVgIsConnected.values() >= iAhwBna) {
                            iArr[i] = Color.parseColor(AEQbTJ(abstractC36262oVgIsConnected.copydefault(i).getColor(), abstractC36262oVgIsConnected.copydefault(i).getColorBlk()));
                        } else {
                            iArr[i2] = owk.KWHzl(iKWHzl);
                            this.ejfBZ.setColor(owk.KWHzl(iKWHzl));
                        }
                        if (OLrzqt(abstractC36262oVgIsConnected)) {
                            if (outputOLrzqt.EZpvd().contains("Net L/S")) {
                                iArr[i2] = owk.KWHzl(22);
                                this.ejfBZ.setColor(owk.KWHzl(22));
                            }
                            if (outputOLrzqt.EZpvd().contains("Taker B/S")) {
                                iArr[i2] = owk.KWHzl(22);
                                this.ejfBZ.setColor(owk.KWHzl(22));
                            }
                        }
                        i4 = i2 + 1;
                    }
                }
                i3 = i + 1;
                chartArea2 = chartArea;
                c36246oUrCopydefault = c36246oUr;
                iArr2 = iArr;
            }
            ChartArea chartArea3 = chartArea2;
            KWHzl(canvas, strArr, iArr2, chartArea3.AYXKKw() + this.AkhnZx, chartArea3.AuCTel() + this.DbNXlk, this.ejfBZ);
        }
    }

    public final java.lang.String KWHzl(double d) {
        java.lang.String strKWHzl = pTB.KWHzl(pTB.OLrzqt(java.lang.Double.valueOf(d)), 2, RoundingMode.DOWN);
        if (d <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return strKWHzl;
        }
        return Marker.ANY_NON_NULL_MARKER + strKWHzl;
    }

    public final java.lang.String AEQbTJ(Expression.Output output) {
        java.lang.String strEZpvd = output.EZpvd();
        if (!output.EZpvd().contains(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK)) {
            return strEZpvd;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, C36246oUr.copydefault().AkhnZx());
        if (output.EZpvd().contains("OI")) {
            strEZpvd = C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C32392mcI.Dialog.QDqgQU, map);
        }
        if (output.EZpvd().contains("Taker B/S")) {
            strEZpvd = C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C32392mcI.Dialog.RVsVBY, map);
        }
        if (output.EZpvd().contains("Buy")) {
            strEZpvd = C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C32392mcI.Dialog.DGgnkA, map);
        }
        if (output.EZpvd().contains("Sell")) {
            strEZpvd = C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C32392mcI.Dialog.RKcVTr, map);
        }
        return "Net L/S".equals(output.EZpvd()) ? this.EZpvd.getString(C32392mcI.Dialog.DNMMPQ) : strEZpvd;
    }

    public final java.lang.String AEQbTJ(AbstractC36262oVg abstractC36262oVg, Expression.Output output, double d) {
        TemplateSetting templateSettingKWHzl = C36246oUr.copydefault().KWHzl(copydefault());
        if ((((templateSettingKWHzl != null && templateSettingKWHzl.getSPTimeInterval() < 5) || !C36246oUr.copydefault().QVsKAR()) && ((abstractC36262oVg instanceof C36275oVt) || (abstractC36262oVg instanceof C36281oVz) || (abstractC36262oVg instanceof oVB) || (abstractC36262oVg instanceof C36269oVn) || (abstractC36262oVg instanceof oVG))) || d == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return "--";
        }
        if ("Net L/S".equals(output.EZpvd())) {
            return KWHzl(d);
        }
        return oWC.AEQbTJ(d, 2);
    }
}
