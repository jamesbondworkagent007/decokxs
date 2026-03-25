package o;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.kline.data.BotOrderItem;
import com.okinc.kline.data.BotPendingLineVo;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.C32392mcI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oWc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36285oWc extends AbstractC36302oWt {
    public int AEQbTJ;
    public final android.graphics.Paint AYXKKw;
    public final android.graphics.Path AhwBna;
    public int AkhnZx;
    public float AuCTel;
    public int DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public com.okinc.kline.library.data.DataSource OLrzqt;
    public float[] djBIcL;
    public C36246oUr ejfBZ;
    public final android.graphics.Paint fARcdN;
    public oWC fIwbmz;
    public final RectF fJNWhG;
    public final android.graphics.Paint fetchVPNInfo;
    public final android.graphics.Paint gEmmrt;
    public oWK hDKMBd;
    public final android.graphics.Paint isConnected;
    public float[] valueOf;
    public int values;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    public C36285oWc(java.lang.String str) {
        oWC owc;
        oUE oueIwGUEr;
        LinkedHashMap<java.lang.String, oWC> linkedHashMapQVAiDq;
        super(str);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.AYXKKw = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.gEmmrt = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.isConnected = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.fetchVPNInfo = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.fARcdN = paint5;
        this.AhwBna = new android.graphics.Path();
        this.fJNWhG = new RectF();
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        this.ejfBZ = c36246oUrCopydefault;
        if (c36246oUrCopydefault == null || (oueIwGUEr = c36246oUrCopydefault.iwGUEr()) == null || (linkedHashMapQVAiDq = oueIwGUEr.QVAiDq()) == null) {
            owc = null;
        } else {
            owc = linkedHashMapQVAiDq.get(copydefault() + ".m");
        }
        this.fIwbmz = owc;
        this.AEQbTJ = AbstractC36302oWt.copydefault(1.0f);
        this.KWHzl = AbstractC36302oWt.copydefault(16.0f);
        this.EZpvd = AbstractC36302oWt.copydefault(0.5f);
        this.values = AbstractC36302oWt.copydefault(4.0f);
        this.AkhnZx = AbstractC36302oWt.copydefault(16.0f);
        int iCopydefault = AbstractC36302oWt.copydefault(2.0f);
        this.DbNXlk = iCopydefault;
        float fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(iCopydefault));
        int i = this.DbNXlk;
        float f = i;
        float fDjBIcL2 = C33129mqd.djBIcL(java.lang.Integer.valueOf(i));
        int i2 = this.DbNXlk;
        this.djBIcL = new float[]{fDjBIcL, f, 0.0f, 0.0f, 0.0f, 0.0f, fDjBIcL2, i2};
        float fDjBIcL3 = C33129mqd.djBIcL(java.lang.Integer.valueOf(i2));
        int i3 = this.DbNXlk;
        this.valueOf = new float[]{0.0f, 0.0f, fDjBIcL3, i3, C33129mqd.djBIcL(java.lang.Integer.valueOf(i3)), this.DbNXlk, 0.0f, 0.0f};
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(C33129mqd.djBIcL(java.lang.Integer.valueOf(this.AEQbTJ)));
        paint.setPathEffect(this.getPriority);
        paint2.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setStrokeWidth(this.EZpvd);
        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.FILL_AND_STROKE);
        paint4.setStrokeWidth(this.EZpvd);
        paint5.setAntiAlias(true);
        paint5.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint5.setTypeface(C55051xce.OLrzqt.valueOf());
        this.AuCTel = (-(C33129mqd.AhwBna(java.lang.Float.valueOf((float) java.lang.Math.ceil(r1.bottom - r1.top))) >> 1)) - paint5.getFontMetrics().top;
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(@NotNull oWK owk) {
        Intrinsics.checkNotNullParameter(owk, "");
        this.gEmmrt.setColor(owk.OLrzqt());
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(@NotNull android.graphics.Canvas canvas) {
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn;
        java.util.HashMap<java.lang.String, oWK> themes;
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn2;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> dataSources;
        Intrinsics.checkNotNullParameter(canvas, "");
        C36246oUr c36246oUr = this.ejfBZ;
        oWK owk = null;
        com.okinc.kline.library.data.DataSource dataSource = (c36246oUr == null || (chartViewOutSideConfigZLjUOn2 = c36246oUr.zLjUOn()) == null || (dataSources = chartViewOutSideConfigZLjUOn2.getDataSources()) == null) ? null : dataSources.get(copydefault());
        this.OLrzqt = dataSource;
        if (dataSource != null) {
            Intrinsics.copydefault(dataSource);
            if (dataSource.gEmmrt() >= 1) {
                C36246oUr c36246oUr2 = this.ejfBZ;
                if ((c36246oUr2 != null ? c36246oUr2.fetchVPNInfo() : null) == null || this.fIwbmz == null) {
                    return;
                }
                C36246oUr c36246oUr3 = this.ejfBZ;
                if (c36246oUr3 != null && (chartViewOutSideConfigZLjUOn = c36246oUr3.zLjUOn()) != null && (themes = chartViewOutSideConfigZLjUOn.getThemes()) != null) {
                    owk = themes.get(copydefault());
                }
                this.hDKMBd = owk;
                OLrzqt(canvas);
                djBIcL(canvas);
                gEmmrt(canvas);
                copydefault(canvas);
                AhwBna(canvas);
                KWHzl(canvas);
                EZpvd(canvas);
            }
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas) {
        BotPendingLineVo botPendingLineVoFetchVPNInfo;
        java.lang.String liqPrice;
        C36246oUr c36246oUr = this.ejfBZ;
        if (c36246oUr == null || (botPendingLineVoFetchVPNInfo = c36246oUr.fetchVPNInfo()) == null || (liqPrice = botPendingLineVoFetchVPNInfo.getLiqPrice()) == null || !C33129mqd.OLrzqt((java.lang.CharSequence) liqPrice)) {
            return;
        }
        oWC owc = this.fIwbmz;
        Intrinsics.copydefault(owc);
        int iAhwBna = owc.AhwBna(C33129mqd.AEQbTJ(liqPrice));
        if (iAhwBna > 0) {
            oWC owc2 = this.fIwbmz;
            if (iAhwBna < (owc2 != null ? owc2.gEmmrt() : 0)) {
                oWK owk = this.hDKMBd;
                int iAuCTelauCTel = owk != null ? owk.AuCTelauCTel() : 0;
                this.AYXKKw.setColor(iAuCTelauCTel);
                KWHzl(canvas, 0, canvas.getWidth(), iAhwBna, this.AYXKKw);
                EZpvd(canvas, liqPrice, iAhwBna, iAuCTelauCTel);
                copydefault(canvas, iAhwBna, C33070mpX.AYXKKw(C32392mcI.Dialog.fERRXa), iAuCTelauCTel);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(android.graphics.Canvas canvas) {
        BotPendingLineVo botPendingLineVoFetchVPNInfo;
        BotOrderItem initialOrder;
        int iFIwbmz;
        BotPendingLineVo botPendingLineVoFetchVPNInfo2;
        C36246oUr c36246oUr = this.ejfBZ;
        if (c36246oUr == null || (botPendingLineVoFetchVPNInfo = c36246oUr.fetchVPNInfo()) == null || (initialOrder = botPendingLineVoFetchVPNInfo.getInitialOrder()) == null) {
            return;
        }
        oWC owc = this.fIwbmz;
        Intrinsics.copydefault(owc);
        int iAhwBna = owc.AhwBna(C33129mqd.AEQbTJ(initialOrder.getPrice()));
        if (iAhwBna > 0) {
            oWC owc2 = this.fIwbmz;
            if (iAhwBna < (owc2 != null ? owc2.gEmmrt() : 0)) {
                C36246oUr c36246oUr2 = this.ejfBZ;
                if (Intrinsics.EZpvd((java.lang.Object) ((c36246oUr2 == null || (botPendingLineVoFetchVPNInfo2 = c36246oUr2.fetchVPNInfo()) == null) ? null : botPendingLineVoFetchVPNInfo2.getDirection()), (java.lang.Object) "short")) {
                    oWK owk = this.hDKMBd;
                    iFIwbmz = owk != null ? owk.fJNWhG() : 0;
                } else {
                    oWK owk2 = this.hDKMBd;
                    if (owk2 != null) {
                        iFIwbmz = owk2.fIwbmz();
                    }
                }
                this.AYXKKw.setColor(iFIwbmz);
                KWHzl(canvas, 0, canvas.getWidth(), iAhwBna, this.AYXKKw);
                EZpvd(canvas, initialOrder.getPrice(), iAhwBna, iFIwbmz);
                KWHzl(canvas, iAhwBna, C33070mpX.AYXKKw(C32392mcI.Dialog.fjfviF), initialOrder.getAmount(), iFIwbmz);
            }
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, int i, java.lang.String str, java.lang.String str2, int i2) {
        this.isConnected.setColor(i2);
        this.fetchVPNInfo.setColor(i2);
        this.fARcdN.setColor(i2);
        int i3 = this.KWHzl;
        int iEZpvd = EZpvd(str) + i3;
        int i4 = this.AkhnZx >> 1;
        copydefault(canvas, str2, i3, iEZpvd, i - i4, i + i4);
        this.fARcdN.setTextAlign(Paint.Align.LEFT);
        KWHzl(canvas, str, i3, i);
        android.graphics.Paint paint = this.fARcdN;
        oWK owk = this.hDKMBd;
        paint.setColor(owk != null ? owk.AuCTel() : 0);
        KWHzl(canvas, str2, iEZpvd, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void djBIcL(android.graphics.Canvas canvas) {
        BotPendingLineVo botPendingLineVoFetchVPNInfo;
        java.util.ArrayList<BotOrderItem> sellList;
        BotPendingLineVo botPendingLineVoFetchVPNInfo2;
        BotPendingLineVo botPendingLineVoFetchVPNInfo3;
        BotPendingLineVo botPendingLineVoFetchVPNInfo4;
        java.lang.String fillSafetyOrds;
        BotPendingLineVo botPendingLineVoFetchVPNInfo5;
        java.util.ArrayList<BotOrderItem> sellList2;
        oWK owk = this.hDKMBd;
        int iFJNWhG = owk != null ? owk.fJNWhG() : 0;
        this.AYXKKw.setColor(iFJNWhG);
        C36246oUr c36246oUr = this.ejfBZ;
        if (c36246oUr != null && (botPendingLineVoFetchVPNInfo5 = c36246oUr.fetchVPNInfo()) != null && (sellList2 = botPendingLineVoFetchVPNInfo5.getSellList()) != null) {
            for (BotOrderItem botOrderItem : sellList2) {
                oWC owc = this.fIwbmz;
                Intrinsics.copydefault(owc);
                int iAhwBna = owc.AhwBna(C33129mqd.AEQbTJ(botOrderItem.getPrice()));
                if (iAhwBna > 0) {
                    oWC owc2 = this.fIwbmz;
                    if (iAhwBna < (owc2 != null ? owc2.gEmmrt() : 0)) {
                        KWHzl(canvas, 0, canvas.getWidth(), iAhwBna, this.AYXKKw);
                    }
                }
            }
        }
        C36246oUr c36246oUr2 = this.ejfBZ;
        if (c36246oUr2 == null || (botPendingLineVoFetchVPNInfo = c36246oUr2.fetchVPNInfo()) == null || (sellList = botPendingLineVoFetchVPNInfo.getSellList()) == null) {
            return;
        }
        int size = sellList.size();
        java.util.ArrayList<BotOrderItem> arrayListSubList = sellList;
        if (size > 4) {
            arrayListSubList = sellList.subList(0, 4);
        }
        java.util.ArrayList<BotOrderItem> arrayList = arrayListSubList;
        Intrinsics.copydefault(arrayList);
        C36246oUr c36246oUr3 = this.ejfBZ;
        int iAhwBna2 = (c36246oUr3 == null || (botPendingLineVoFetchVPNInfo4 = c36246oUr3.fetchVPNInfo()) == null || (fillSafetyOrds = botPendingLineVoFetchVPNInfo4.getFillSafetyOrds()) == null) ? 0 : C33129mqd.AhwBna(fillSafetyOrds);
        int size2 = arrayList.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i = size2 - 1;
            java.lang.String price = arrayList.get(size2).getPrice();
            oWC owc3 = this.fIwbmz;
            Intrinsics.copydefault(owc3);
            int iAhwBna3 = owc3.AhwBna(C33129mqd.AEQbTJ(price));
            if (iAhwBna3 > 0) {
                oWC owc4 = this.fIwbmz;
                if (iAhwBna3 < (owc4 != null ? owc4.gEmmrt() : 0)) {
                    EZpvd(canvas, price, iAhwBna3, iFJNWhG);
                    C36246oUr c36246oUr4 = this.ejfBZ;
                    java.lang.String type = null;
                    if (Intrinsics.EZpvd((java.lang.Object) ((c36246oUr4 == null || (botPendingLineVoFetchVPNInfo3 = c36246oUr4.fetchVPNInfo()) == null) ? null : botPendingLineVoFetchVPNInfo3.getType()), (java.lang.Object) "spot_dca")) {
                        KWHzl(canvas, iAhwBna3, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C32392mcI.Dialog.ixgjPv), C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.Integer.valueOf(size2 + 1 + iAhwBna2)))), arrayList.get(size2).getAmount(), iFJNWhG);
                    } else {
                        C36246oUr c36246oUr5 = this.ejfBZ;
                        if (c36246oUr5 != null && (botPendingLineVoFetchVPNInfo2 = c36246oUr5.fetchVPNInfo()) != null) {
                            type = botPendingLineVoFetchVPNInfo2.getType();
                        }
                        if (!Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "contract_dca")) {
                            copydefault(canvas, iAhwBna3, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C32392mcI.Dialog.Dmq), C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.Integer.valueOf(size2 + 1)))), iFJNWhG);
                        }
                    }
                }
            }
            if (i < 0) {
                return;
            } else {
                size2 = i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(android.graphics.Canvas canvas) {
        BotPendingLineVo botPendingLineVoFetchVPNInfo;
        java.util.ArrayList<BotOrderItem> buyList;
        BotPendingLineVo botPendingLineVoFetchVPNInfo2;
        BotPendingLineVo botPendingLineVoFetchVPNInfo3;
        BotPendingLineVo botPendingLineVoFetchVPNInfo4;
        java.lang.String fillSafetyOrds;
        BotPendingLineVo botPendingLineVoFetchVPNInfo5;
        java.util.ArrayList<BotOrderItem> buyList2;
        oWK owk = this.hDKMBd;
        int iFIwbmz = owk != null ? owk.fIwbmz() : 0;
        this.AYXKKw.setColor(iFIwbmz);
        C36246oUr c36246oUr = this.ejfBZ;
        if (c36246oUr != null && (botPendingLineVoFetchVPNInfo5 = c36246oUr.fetchVPNInfo()) != null && (buyList2 = botPendingLineVoFetchVPNInfo5.getBuyList()) != null) {
            for (BotOrderItem botOrderItem : buyList2) {
                oWC owc = this.fIwbmz;
                Intrinsics.copydefault(owc);
                int iAhwBna = owc.AhwBna(C33129mqd.AEQbTJ(botOrderItem.getPrice()));
                if (iAhwBna > 0) {
                    oWC owc2 = this.fIwbmz;
                    if (iAhwBna < (owc2 != null ? owc2.gEmmrt() : 0)) {
                        KWHzl(canvas, 0, canvas.getWidth(), iAhwBna, this.AYXKKw);
                    }
                }
            }
        }
        C36246oUr c36246oUr2 = this.ejfBZ;
        if (c36246oUr2 == null || (botPendingLineVoFetchVPNInfo = c36246oUr2.fetchVPNInfo()) == null || (buyList = botPendingLineVoFetchVPNInfo.getBuyList()) == null) {
            return;
        }
        int size = buyList.size();
        java.util.ArrayList<BotOrderItem> arrayListSubList = buyList;
        if (size > 4) {
            arrayListSubList = buyList.subList(0, 4);
        }
        java.util.ArrayList<BotOrderItem> arrayList = arrayListSubList;
        Intrinsics.copydefault(arrayList);
        C36246oUr c36246oUr3 = this.ejfBZ;
        int iAhwBna2 = (c36246oUr3 == null || (botPendingLineVoFetchVPNInfo4 = c36246oUr3.fetchVPNInfo()) == null || (fillSafetyOrds = botPendingLineVoFetchVPNInfo4.getFillSafetyOrds()) == null) ? 0 : C33129mqd.AhwBna(fillSafetyOrds);
        int size2 = arrayList.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i = size2 - 1;
            java.lang.String price = arrayList.get(size2).getPrice();
            oWC owc3 = this.fIwbmz;
            Intrinsics.copydefault(owc3);
            int iAhwBna3 = owc3.AhwBna(C33129mqd.AEQbTJ(price));
            if (iAhwBna3 > 0) {
                oWC owc4 = this.fIwbmz;
                if (iAhwBna3 < (owc4 != null ? owc4.gEmmrt() : 0)) {
                    EZpvd(canvas, price, iAhwBna3, iFIwbmz);
                    C36246oUr c36246oUr4 = this.ejfBZ;
                    java.lang.String type = null;
                    if (Intrinsics.EZpvd((java.lang.Object) ((c36246oUr4 == null || (botPendingLineVoFetchVPNInfo3 = c36246oUr4.fetchVPNInfo()) == null) ? null : botPendingLineVoFetchVPNInfo3.getType()), (java.lang.Object) "spot_dca")) {
                        KWHzl(canvas, iAhwBna3, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C32392mcI.Dialog.ixgjPv), C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.Integer.valueOf(size2 + 1 + iAhwBna2)))), arrayList.get(size2).getAmount(), iFIwbmz);
                    } else {
                        C36246oUr c36246oUr5 = this.ejfBZ;
                        if (c36246oUr5 != null && (botPendingLineVoFetchVPNInfo2 = c36246oUr5.fetchVPNInfo()) != null) {
                            type = botPendingLineVoFetchVPNInfo2.getType();
                        }
                        if (!Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "contract_dca")) {
                            copydefault(canvas, iAhwBna3, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C32392mcI.Dialog.htlTjW), C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.Integer.valueOf(size2 + 1)))), iFIwbmz);
                        }
                    }
                }
            }
            if (i < 0) {
                return;
            } else {
                size2 = i;
            }
        }
    }

    public final void gEmmrt(android.graphics.Canvas canvas) {
        BotPendingLineVo botPendingLineVoFetchVPNInfo;
        java.lang.String tpPrice;
        C36246oUr c36246oUr = this.ejfBZ;
        if (c36246oUr == null || (botPendingLineVoFetchVPNInfo = c36246oUr.fetchVPNInfo()) == null || (tpPrice = botPendingLineVoFetchVPNInfo.getTpPrice()) == null || !C33129mqd.OLrzqt((java.lang.CharSequence) tpPrice)) {
            return;
        }
        oWC owc = this.fIwbmz;
        Intrinsics.copydefault(owc);
        int iAhwBna = owc.AhwBna(C33129mqd.AEQbTJ(tpPrice));
        if (iAhwBna > 0) {
            oWC owc2 = this.fIwbmz;
            if (iAhwBna < (owc2 != null ? owc2.gEmmrt() : 0)) {
                oWK owk = this.hDKMBd;
                int iFIwbmz = owk != null ? owk.fIwbmz() : 0;
                this.AYXKKw.setColor(iFIwbmz);
                KWHzl(canvas, 0, canvas.getWidth(), iAhwBna, this.AYXKKw);
                EZpvd(canvas, tpPrice, iAhwBna, iFIwbmz);
                copydefault(canvas, iAhwBna, C33070mpX.AYXKKw(C32392mcI.Dialog.DGOPHZ), iFIwbmz);
            }
        }
    }

    public final void copydefault(android.graphics.Canvas canvas) {
        BotPendingLineVo botPendingLineVoFetchVPNInfo;
        java.lang.String slPrice;
        C36246oUr c36246oUr = this.ejfBZ;
        if (c36246oUr == null || (botPendingLineVoFetchVPNInfo = c36246oUr.fetchVPNInfo()) == null || (slPrice = botPendingLineVoFetchVPNInfo.getSlPrice()) == null || !C33129mqd.OLrzqt((java.lang.CharSequence) slPrice)) {
            return;
        }
        oWC owc = this.fIwbmz;
        Intrinsics.copydefault(owc);
        int iAhwBna = owc.AhwBna(C33129mqd.AEQbTJ(slPrice));
        if (iAhwBna > 0) {
            oWC owc2 = this.fIwbmz;
            if (iAhwBna < (owc2 != null ? owc2.gEmmrt() : 0)) {
                oWK owk = this.hDKMBd;
                int iFJNWhG = owk != null ? owk.fJNWhG() : 0;
                this.AYXKKw.setColor(iFJNWhG);
                KWHzl(canvas, 0, canvas.getWidth(), iAhwBna, this.AYXKKw);
                EZpvd(canvas, slPrice, iAhwBna, iFJNWhG);
                copydefault(canvas, iAhwBna, C33070mpX.AYXKKw(C32392mcI.Dialog.zblBkD), iFJNWhG);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AhwBna(android.graphics.Canvas canvas) {
        BotPendingLineVo botPendingLineVoFetchVPNInfo;
        java.lang.String stopTriggerPrice;
        BotPendingLineVo botPendingLineVoFetchVPNInfo2;
        BotPendingLineVo botPendingLineVoFetchVPNInfo3;
        java.lang.String startTriggerPrice;
        int iFIwbmz;
        BotPendingLineVo botPendingLineVoFetchVPNInfo4;
        C36246oUr c36246oUr = this.ejfBZ;
        java.lang.String direction = null;
        int iFIwbmz2 = 0;
        if (c36246oUr != null && (botPendingLineVoFetchVPNInfo3 = c36246oUr.fetchVPNInfo()) != null && (startTriggerPrice = botPendingLineVoFetchVPNInfo3.getStartTriggerPrice()) != null && C33129mqd.OLrzqt((java.lang.CharSequence) startTriggerPrice)) {
            oWC owc = this.fIwbmz;
            Intrinsics.copydefault(owc);
            int iAhwBna = owc.AhwBna(C33129mqd.AEQbTJ(startTriggerPrice));
            if (iAhwBna > 0) {
                oWC owc2 = this.fIwbmz;
                if (iAhwBna < (owc2 != null ? owc2.gEmmrt() : 0)) {
                    C36246oUr c36246oUr2 = this.ejfBZ;
                    if (Intrinsics.EZpvd((java.lang.Object) ((c36246oUr2 == null || (botPendingLineVoFetchVPNInfo4 = c36246oUr2.fetchVPNInfo()) == null) ? null : botPendingLineVoFetchVPNInfo4.getDirection()), (java.lang.Object) "short")) {
                        oWK owk = this.hDKMBd;
                        iFIwbmz = owk != null ? owk.fJNWhG() : 0;
                        this.AYXKKw.setColor(iFIwbmz);
                        KWHzl(canvas, 0, canvas.getWidth(), iAhwBna, this.AYXKKw);
                        EZpvd(canvas, startTriggerPrice, iAhwBna, iFIwbmz);
                        copydefault(canvas, iAhwBna, C33070mpX.AYXKKw(C32392mcI.Dialog.DCUTEIdCUTEI), iFIwbmz);
                    } else {
                        oWK owk2 = this.hDKMBd;
                        if (owk2 != null) {
                            iFIwbmz = owk2.fIwbmz();
                        }
                        this.AYXKKw.setColor(iFIwbmz);
                        KWHzl(canvas, 0, canvas.getWidth(), iAhwBna, this.AYXKKw);
                        EZpvd(canvas, startTriggerPrice, iAhwBna, iFIwbmz);
                        copydefault(canvas, iAhwBna, C33070mpX.AYXKKw(C32392mcI.Dialog.DCUTEIdCUTEI), iFIwbmz);
                    }
                }
            }
        }
        C36246oUr c36246oUr3 = this.ejfBZ;
        if (c36246oUr3 == null || (botPendingLineVoFetchVPNInfo = c36246oUr3.fetchVPNInfo()) == null || (stopTriggerPrice = botPendingLineVoFetchVPNInfo.getStopTriggerPrice()) == null || !C33129mqd.OLrzqt((java.lang.CharSequence) stopTriggerPrice)) {
            return;
        }
        oWC owc3 = this.fIwbmz;
        Intrinsics.copydefault(owc3);
        int iAhwBna2 = owc3.AhwBna(C33129mqd.AEQbTJ(stopTriggerPrice));
        C36246oUr c36246oUr4 = this.ejfBZ;
        if (c36246oUr4 != null && (botPendingLineVoFetchVPNInfo2 = c36246oUr4.fetchVPNInfo()) != null) {
            direction = botPendingLineVoFetchVPNInfo2.getDirection();
        }
        if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "short")) {
            oWK owk3 = this.hDKMBd;
            if (owk3 != null) {
                iFIwbmz2 = owk3.fJNWhG();
            }
        } else {
            oWK owk4 = this.hDKMBd;
            if (owk4 != null) {
                iFIwbmz2 = owk4.fIwbmz();
            }
        }
        this.AYXKKw.setColor(iFIwbmz2);
        KWHzl(canvas, 0, canvas.getWidth(), iAhwBna2, this.AYXKKw);
        EZpvd(canvas, stopTriggerPrice, iAhwBna2, iFIwbmz2);
        copydefault(canvas, iAhwBna2, C33070mpX.AYXKKw(C32392mcI.Dialog.spnCvw), iFIwbmz2);
    }

    public final void copydefault(android.graphics.Canvas canvas, int i, java.lang.String str, int i2) {
        this.isConnected.setColor(i2);
        this.fARcdN.setColor(i2);
        int i3 = this.KWHzl;
        int iEZpvd = i3 + EZpvd(str);
        int i4 = this.AkhnZx >> 1;
        OLrzqt(canvas, i3, iEZpvd, i - i4, i + i4);
        this.fARcdN.setTextAlign(Paint.Align.LEFT);
        canvas.drawText(str, i3 + this.values, i + this.AuCTel, this.fARcdN);
    }

    public final void EZpvd(android.graphics.Canvas canvas, java.lang.String str, int i, int i2) {
        this.isConnected.setColor(i2);
        this.fARcdN.setColor(i2);
        int width = canvas.getWidth() - this.KWHzl;
        int iEZpvd = width - EZpvd(AbstractC36302oWt.AYXKKw(C33129mqd.AEQbTJ(str)));
        int i3 = this.AkhnZx >> 1;
        OLrzqt(canvas, iEZpvd, width, i - i3, i + i3);
        this.fARcdN.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText(AbstractC36302oWt.AYXKKw(C33129mqd.AEQbTJ(str)), width - this.values, i + this.AuCTel, this.fARcdN);
    }

    public final void OLrzqt(android.graphics.Canvas canvas, int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i3;
        float f3 = i2;
        float f4 = i4;
        RectF rectF = new RectF(f, f2, f3, f4);
        float f5 = this.DbNXlk;
        canvas.drawRoundRect(rectF, f5, f5, this.gEmmrt);
        RectF rectF2 = new RectF(f, f2, f3, f4);
        float f6 = this.DbNXlk;
        canvas.drawRoundRect(rectF2, f6, f6, this.isConnected);
    }

    public final void copydefault(android.graphics.Canvas canvas, java.lang.String str, int i, int i2, int i3, int i4) {
        float f = i3;
        float f2 = i2;
        float f3 = i4;
        this.fJNWhG.set(i, f, f2, f3);
        this.AhwBna.reset();
        android.graphics.Path path = this.AhwBna;
        RectF rectF = this.fJNWhG;
        float[] fArr = this.djBIcL;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        canvas.drawPath(this.AhwBna, this.gEmmrt);
        canvas.drawPath(this.AhwBna, this.isConnected);
        this.fJNWhG.set(f2, f, i2 + EZpvd(str), f3);
        this.AhwBna.reset();
        this.AhwBna.addRoundRect(this.fJNWhG, this.valueOf, direction);
        canvas.drawPath(this.AhwBna, this.fetchVPNInfo);
    }

    public final void KWHzl(android.graphics.Canvas canvas, java.lang.String str, int i, int i2) {
        canvas.drawText(str, i + this.values, i2 + this.AuCTel, this.fARcdN);
    }

    private final int EZpvd(java.lang.String str) {
        return (int) (this.fARcdN.measureText(str) + (this.values * 2));
    }
}
