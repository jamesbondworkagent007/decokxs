package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.okinc.kline.data.BotOrderItem;
import com.okinc.kline.data.BotPendingLineVo;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C32392mcI;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oWf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36288oWf extends AbstractC36302oWt {
    public final int AYXKKw;
    public final android.graphics.Paint AhwBna;
    public final int AkhnZx;
    public final int AuCTel;
    public final int DbNXlk;
    public final android.graphics.Paint EZpvd;
    public final int KWHzl;
    public final android.graphics.Paint OLrzqt;
    public final float djBIcL;
    public final android.graphics.drawable.Drawable ejfBZ;
    public final int fARcdN;
    public final int fIwbmz;
    public final int fJNWhG;
    public final int fetchVPNInfo;
    public final float gEmmrt;
    public final android.graphics.Paint getFieldNames;
    public final oUE getNewProxyInstance;
    public final oWC hDKMBd;
    public final int isConnected;
    public final ChartViewOutSideConfig iwGUEr;
    public final C36246oUr uzCIH;
    public final int valueOf;
    public final float values;
    public final android.graphics.Paint wlaJM;
    public final InterfaceC56387yDm zLjUOn;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC36302oWt
    public void OLrzqt(@NotNull oWK owk) {
        Intrinsics.checkNotNullParameter(owk, "");
    }

    public C36288oWf(java.lang.String str) {
        oWC owc;
        LinkedHashMap<java.lang.String, oWC> linkedHashMapQVAiDq;
        super(str);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(this.getPriority);
        this.AhwBna = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.getFieldNames = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        paint3.setTypeface(C55051xce.OLrzqt.valueOf());
        this.wlaJM = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKDDUqPf));
        paint4.setStyle(style);
        this.EZpvd = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        paint5.setAntiAlias(true);
        paint5.setColor(C33070mpX.copydefault(C52761wXj.Activity.RAQtXZ));
        paint5.setAlpha(25);
        paint5.setStyle(style);
        this.OLrzqt = paint5;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        this.uzCIH = c36246oUrCopydefault;
        oUE oueIwGUEr = c36246oUrCopydefault != null ? c36246oUrCopydefault.iwGUEr() : null;
        this.getNewProxyInstance = oueIwGUEr;
        this.iwGUEr = c36246oUrCopydefault != null ? c36246oUrCopydefault.zLjUOn() : null;
        if (oueIwGUEr == null || (linkedHashMapQVAiDq = oueIwGUEr.QVAiDq()) == null) {
            owc = null;
        } else {
            owc = linkedHashMapQVAiDq.get(copydefault() + ".m");
        }
        this.hDKMBd = owc;
        this.zLjUOn = C56392yDr.copydefault(new Function0() { // from class: o.oWg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36288oWf.EZpvd(this.OLrzqt);
            }
        });
        this.ejfBZ = C33070mpX.KWHzl(C32392mcI.Activity.uzCIH);
        this.AYXKKw = C33070mpX.copydefault(C52761wXj.Activity.Dmq);
        this.KWHzl = C33070mpX.copydefault(C52761wXj.Activity.htlTjW);
        this.valueOf = C33070mpX.copydefault(C32113mPz.ActionBar.OcIXYQ);
        this.gEmmrt = C55298xhM.dp$default(0.5f, (android.content.Context) null, 1, (java.lang.Object) null);
        this.djBIcL = C55298xhM.dp$default(1, (android.content.Context) null, 1, (java.lang.Object) null);
        this.values = C55298xhM.dp$default(2, (android.content.Context) null, 1, (java.lang.Object) null);
        this.DbNXlk = C55298xhM.dpInt$default(3, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AuCTel = C55298xhM.dpInt$default(5, (android.content.Context) null, 1, (java.lang.Object) null);
        this.fJNWhG = C55298xhM.dpInt$default(7, (android.content.Context) null, 1, (java.lang.Object) null);
        this.fIwbmz = C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        this.fetchVPNInfo = C55298xhM.dpInt$default(11, (android.content.Context) null, 1, (java.lang.Object) null);
        this.isConnected = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AkhnZx = C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
        this.fARcdN = C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.oWf$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oWf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final oWK EZpvd(C36288oWf c36288oWf) {
        java.util.HashMap<java.lang.String, oWK> themes;
        ChartViewOutSideConfig chartViewOutSideConfig = c36288oWf.iwGUEr;
        if (chartViewOutSideConfig == null || (themes = chartViewOutSideConfig.getThemes()) == null) {
            return null;
        }
        return themes.get(c36288oWf.copydefault());
    }

    public final oWK gEmmrt() {
        return (oWK) this.zLjUOn.getValue();
    }

    public final int djBIcL() {
        oWC owc = this.hDKMBd;
        if (owc != null) {
            return owc.gEmmrt();
        }
        return 0;
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        oUE oue = this.getNewProxyInstance;
        if (oue != null) {
            oue.AEQbTJ((RectF) null);
        }
        oUE oue2 = this.getNewProxyInstance;
        if (oue2 != null) {
            oue2.OLrzqt((RectF) null);
        }
        OLrzqt(canvas);
        EZpvd(canvas);
        copydefault(canvas);
    }

    private final void EZpvd(android.graphics.Canvas canvas) {
        BotPendingLineVo botPendingLineVoQKVWgx;
        java.util.ArrayList<BotOrderItem> buyList;
        C36246oUr c36246oUr = this.uzCIH;
        if (c36246oUr == null || (botPendingLineVoQKVWgx = c36246oUr.QKVWgx()) == null || (buyList = botPendingLineVoQKVWgx.getBuyList()) == null) {
            return;
        }
        BotPendingLineVo botPendingLineVoQKVWgx2 = this.uzCIH.QKVWgx();
        java.util.ArrayList<BotOrderItem> sellList = botPendingLineVoQKVWgx2 != null ? botPendingLineVoQKVWgx2.getSellList() : null;
        boolean z = sellList == null || sellList.isEmpty();
        int i = 0;
        for (java.lang.Object obj : buyList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            BotOrderItem botOrderItem = (BotOrderItem) obj;
            oWC owc = this.hDKMBd;
            int iAhwBna = owc != null ? owc.AhwBna(C33129mqd.AEQbTJ(botOrderItem.getPrice())) : 0;
            if (1 <= iAhwBna && iAhwBna < djBIcL()) {
                if (i == 0 && z) {
                    oUE oue = this.getNewProxyInstance;
                    if (oue != null) {
                        oue.OLrzqt(EZpvd(canvas, botOrderItem.getPrice(), iAhwBna));
                    }
                    Objects.toString(botOrderItem);
                } else if (i == buyList.size() - 1) {
                    oUE oue2 = this.getNewProxyInstance;
                    if (oue2 != null) {
                        oue2.AEQbTJ(EZpvd(canvas, botOrderItem.getPrice(), iAhwBna));
                    }
                    Objects.toString(botOrderItem);
                } else {
                    oWK owkGEmmrt = gEmmrt();
                    if (owkGEmmrt != null) {
                        OLrzqt(canvas, owkGEmmrt.fIwbmz(), iAhwBna);
                    }
                }
            }
            i++;
        }
    }

    private final void copydefault(android.graphics.Canvas canvas) {
        BotPendingLineVo botPendingLineVoQKVWgx;
        java.util.ArrayList<BotOrderItem> sellList;
        C36246oUr c36246oUr = this.uzCIH;
        if (c36246oUr == null || (botPendingLineVoQKVWgx = c36246oUr.QKVWgx()) == null || (sellList = botPendingLineVoQKVWgx.getSellList()) == null) {
            return;
        }
        BotPendingLineVo botPendingLineVoQKVWgx2 = this.uzCIH.QKVWgx();
        java.util.ArrayList<BotOrderItem> buyList = botPendingLineVoQKVWgx2 != null ? botPendingLineVoQKVWgx2.getBuyList() : null;
        boolean z = buyList == null || buyList.isEmpty();
        int i = 0;
        for (java.lang.Object obj : sellList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            BotOrderItem botOrderItem = (BotOrderItem) obj;
            oWC owc = this.hDKMBd;
            int iAhwBna = owc != null ? owc.AhwBna(C33129mqd.AEQbTJ(botOrderItem.getPrice())) : 0;
            if (1 <= iAhwBna && iAhwBna < djBIcL()) {
                if (i == 0 && z) {
                    oUE oue = this.getNewProxyInstance;
                    if (oue != null) {
                        oue.AEQbTJ(EZpvd(canvas, botOrderItem.getPrice(), iAhwBna));
                    }
                    Objects.toString(botOrderItem);
                } else if (i == sellList.size() - 1) {
                    oUE oue2 = this.getNewProxyInstance;
                    if (oue2 != null) {
                        oue2.OLrzqt(EZpvd(canvas, botOrderItem.getPrice(), iAhwBna));
                    }
                    Objects.toString(botOrderItem);
                    KWHzl(canvas, iAhwBna);
                } else {
                    oWK owkGEmmrt = gEmmrt();
                    if (owkGEmmrt != null) {
                        OLrzqt(canvas, owkGEmmrt.fJNWhG(), iAhwBna);
                    }
                }
            }
            i++;
        }
    }

    public final RectF EZpvd(android.graphics.Canvas canvas, java.lang.String str, int i) {
        this.AhwBna.setColor(this.AYXKKw);
        this.AhwBna.setStrokeWidth(this.djBIcL);
        KWHzl(canvas, 0, canvas.getWidth() - this.AkhnZx, i, this.AhwBna);
        AEQbTJ(canvas, i);
        RectF rectFKWHzl = KWHzl(canvas, str, i);
        float f = rectFKWHzl.top;
        float f2 = this.AkhnZx;
        return new RectF(0.0f, f - f2, rectFKWHzl.left, rectFKWHzl.bottom + f2);
    }

    public final void OLrzqt(android.graphics.Canvas canvas, @androidx.annotation.ColorInt int i, int i2) {
        this.AhwBna.setColor(i);
        this.AhwBna.setStrokeWidth(this.gEmmrt);
        KWHzl(canvas, 0, canvas.getWidth(), i2, this.AhwBna);
    }

    public final RectF KWHzl(android.graphics.Canvas canvas, java.lang.String str, int i) {
        this.wlaJM.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        this.wlaJM.setColor(this.KWHzl);
        this.wlaJM.setTextAlign(Paint.Align.RIGHT);
        java.lang.String strAYXKKw = AbstractC36302oWt.AYXKKw(C33129mqd.AEQbTJ(str));
        int width = canvas.getWidth() - this.AkhnZx;
        int iCopydefault = copydefault(strAYXKKw);
        int i2 = this.AkhnZx >> 1;
        RectF rectF = new RectF(width - iCopydefault, i - i2, width, i2 + i);
        oWK owkGEmmrt = gEmmrt();
        if (owkGEmmrt != null) {
            this.getFieldNames.setColor(owkGEmmrt.gEmmrt());
        }
        float f = this.values;
        canvas.drawRoundRect(rectF, f, f, this.getFieldNames);
        canvas.drawText(strAYXKKw, width - this.DbNXlk, i + ((-(C33129mqd.AhwBna(java.lang.Float.valueOf((float) java.lang.Math.ceil(r1.bottom - r1.top))) >> 1)) - this.wlaJM.getFontMetrics().top), this.wlaJM);
        return rectF;
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, int i) {
        int width = canvas.getWidth() / 2;
        android.graphics.drawable.Drawable drawable = this.ejfBZ;
        if (drawable != null) {
            int i2 = this.fJNWhG;
            drawable.setBounds(width - i2, i - i2, width + this.fIwbmz, i + i2);
        }
        android.graphics.drawable.Drawable drawable2 = this.ejfBZ;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, int i) {
        android.graphics.Path path;
        RectF rectF;
        RectF rectFAuCTel;
        if (pEM.AEQbTJ.OLrzqt()) {
            this.wlaJM.setTextSize(AbstractC36302oWt.KWHzl(14.0f));
            this.wlaJM.setColor(this.valueOf);
            this.wlaJM.setTextAlign(Paint.Align.CENTER);
            java.lang.String strCopydefault = copydefault(this.wlaJM, canvas, C33070mpX.AYXKKw(C32392mcI.Dialog.accept));
            android.graphics.Rect rect = new android.graphics.Rect();
            this.wlaJM.getTextBounds(strCopydefault, 0, strCopydefault.length(), rect);
            float fMeasureText = this.wlaJM.measureText(strCopydefault);
            float fHeight = rect.height();
            float f = this.values;
            int i2 = this.isConnected;
            int i3 = this.fIwbmz;
            int i4 = this.AuCTel;
            int i5 = this.fetchVPNInfo;
            float f2 = (i3 * 2) + fHeight;
            float f3 = i4;
            float f4 = i - (f2 + f3);
            float f5 = i3;
            if (f4 - f5 > 0.0f) {
                float f6 = fMeasureText + (i2 * 2);
                float width = (canvas.getWidth() - f6) / 2;
                float f7 = f4 - this.AkhnZx;
                rectF = new RectF(width, f7, f6 + width, f2 + f7);
                path = new android.graphics.Path();
                float width2 = canvas.getWidth() / 2.0f;
                path.moveTo(width2, rectF.bottom + f3);
                float f8 = i5 / 2;
                path.lineTo(width2 - f8, rectF.bottom);
                path.lineTo(width2 + f8, rectF.bottom);
                path.close();
            } else {
                oUE oue = this.getNewProxyInstance;
                float f9 = fMeasureText + (i2 * 2);
                float width3 = (canvas.getWidth() - f9) / 2;
                float fIntValue = ((oue == null || (rectFAuCTel = oue.AuCTel()) == null) ? 0 : java.lang.Float.valueOf(rectFAuCTel.centerY())).intValue() + this.AkhnZx + i4;
                RectF rectF2 = new RectF(width3, fIntValue, f9 + width3, f2 + fIntValue);
                path = new android.graphics.Path();
                float width4 = canvas.getWidth() / 2.0f;
                path.moveTo(width4, fIntValue - f3);
                float f10 = i5 / 2;
                path.lineTo(width4 - f10, fIntValue);
                path.lineTo(width4 + f10, fIntValue);
                path.close();
                rectF = rectF2;
            }
            canvas.drawRoundRect(rectF, f, f, this.EZpvd);
            canvas.drawPath(path, this.EZpvd);
            canvas.drawText(strCopydefault, canvas.getWidth() / 2.0f, ((rectF.top + f5) + fHeight) - rect.bottom, this.wlaJM);
        }
    }

    public final void OLrzqt(android.graphics.Canvas canvas) {
        java.lang.String maxPrice;
        java.lang.String minPrice;
        BotPendingLineVo botPendingLineVoQKVWgx = this.uzCIH.QKVWgx();
        float fAEQbTJ = 0.0f;
        float fAEQbTJ2 = (botPendingLineVoQKVWgx == null || (minPrice = botPendingLineVoQKVWgx.getMinPrice()) == null) ? 0.0f : AEQbTJ(minPrice);
        BotPendingLineVo botPendingLineVoQKVWgx2 = this.uzCIH.QKVWgx();
        if (botPendingLineVoQKVWgx2 != null && (maxPrice = botPendingLineVoQKVWgx2.getMaxPrice()) != null) {
            fAEQbTJ = AEQbTJ(maxPrice);
        }
        canvas.drawRect(0.0f, fAEQbTJ2, canvas.getWidth(), fAEQbTJ, this.OLrzqt);
    }

    public final float AEQbTJ(java.lang.String str) {
        oWC owc = this.hDKMBd;
        return C33129mqd.djBIcL(owc != null ? java.lang.Integer.valueOf(owc.AhwBna(C33129mqd.AEQbTJ(str))) : null);
    }

    private final int copydefault(java.lang.String str) {
        return (int) (this.wlaJM.measureText(str) + (this.DbNXlk * 2));
    }

    public final java.lang.String copydefault(android.graphics.Paint paint, android.graphics.Canvas canvas, java.lang.String str) {
        float width = canvas.getWidth() - this.fARcdN;
        if (paint.measureText(str) <= width) {
            return str;
        }
        while (true) {
            if (paint.measureText(str + "...") <= width || str.length() == 0) {
                break;
            }
            str = str.substring(0, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        return str + "...";
    }
}
