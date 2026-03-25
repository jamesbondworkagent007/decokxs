package o;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C40896qgb extends android.view.View {
    public final float AEQbTJ;
    public final android.graphics.Paint EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final java.util.ArrayList<java.lang.Integer> OLrzqt;
    public final int copydefault;
    public final float djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40896qgb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40896qgb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.qgb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C40896qgb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40896qgb(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.EZpvd = paint;
        this.copydefault = context.getColor(C52761wXj.Activity.invokespecialODCBUN);
        this.OLrzqt = new java.util.ArrayList<>();
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qfY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40896qgb.OLrzqt(context);
            }
        });
        this.AEQbTJ = C55298xhM.dp2pxFloat$default(3.0f, null, 1, null);
        this.djBIcL = C55298xhM.dp2pxFloat$default(3.0f, null, 1, null);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    private final LinkedHashMap<kotlin.Pair<java.lang.Integer, java.lang.Integer>, java.lang.Integer> copydefault() {
        return (LinkedHashMap) this.KWHzl.getValue();
    }

    public static final LinkedHashMap OLrzqt(android.content.Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(Integer.MIN_VALUE, -8);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        linkedHashMap.put(pairOLrzqt, java.lang.Integer.valueOf(c33512mxp.isConnected(context, 1.0f)));
        linkedHashMap.put(C56390yDp.OLrzqt(-8, -6), java.lang.Integer.valueOf(c33512mxp.isConnected(context, 0.8f)));
        linkedHashMap.put(C56390yDp.OLrzqt(-6, -4), java.lang.Integer.valueOf(c33512mxp.isConnected(context, 0.6f)));
        linkedHashMap.put(C56390yDp.OLrzqt(-4, -2), java.lang.Integer.valueOf(c33512mxp.isConnected(context, 0.4f)));
        linkedHashMap.put(C56390yDp.OLrzqt(-2, 0), java.lang.Integer.valueOf(c33512mxp.isConnected(context, 0.2f)));
        linkedHashMap.put(C56390yDp.OLrzqt(0, 2), java.lang.Integer.valueOf(c33512mxp.zLjUOn(context, 0.2f)));
        linkedHashMap.put(C56390yDp.OLrzqt(2, 4), java.lang.Integer.valueOf(c33512mxp.zLjUOn(context, 0.4f)));
        linkedHashMap.put(C56390yDp.OLrzqt(4, 6), java.lang.Integer.valueOf(c33512mxp.zLjUOn(context, 0.6f)));
        linkedHashMap.put(C56390yDp.OLrzqt(6, 8), java.lang.Integer.valueOf(c33512mxp.zLjUOn(context, 0.8f)));
        linkedHashMap.put(C56390yDp.OLrzqt(8, Integer.MAX_VALUE), java.lang.Integer.valueOf(c33512mxp.zLjUOn(context, 1.0f)));
        return linkedHashMap;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        KWHzl(canvas);
    }

    public final void KWHzl(android.graphics.Canvas canvas) {
        float fKWHzl;
        float f;
        RectF rectF = new RectF();
        if (this.OLrzqt.isEmpty()) {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.EZpvd.setColor(this.copydefault);
            if (canvas != null) {
                float f2 = this.AEQbTJ;
                canvas.drawRoundRect(rectF, f2, f2, this.EZpvd);
                return;
            }
            return;
        }
        if (this.OLrzqt.size() == 1) {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.EZpvd.setColor(this.OLrzqt.get(0).intValue());
            if (canvas != null) {
                float f3 = this.AEQbTJ;
                canvas.drawRoundRect(rectF, f3, f3, this.EZpvd);
                return;
            }
            return;
        }
        float f4 = 0.0f;
        int i = 0;
        for (java.lang.Object obj : this.OLrzqt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            this.EZpvd.setColor(((java.lang.Number) obj).intValue());
            if (i == 0) {
                rectF.set(0.0f, 0.0f, KWHzl(), getMeasuredHeight());
                float f5 = this.AEQbTJ;
                float[] fArr = {f5, f5, 0.0f, 0.0f, 0.0f, 0.0f, f5, f5};
                android.graphics.Path path = new android.graphics.Path();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                if (canvas != null) {
                    canvas.drawPath(path, this.EZpvd);
                }
                fKWHzl = KWHzl();
                f = this.djBIcL;
            } else if (i == this.OLrzqt.size() - 1) {
                rectF.set(f4, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f6 = this.AEQbTJ;
                float[] fArr2 = {0.0f, 0.0f, f6, f6, f6, f6, 0.0f, 0.0f};
                android.graphics.Path path2 = new android.graphics.Path();
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                if (canvas != null) {
                    canvas.drawPath(path2, this.EZpvd);
                }
                i++;
            } else {
                rectF.set(f4, 0.0f, KWHzl() + f4, getMeasuredHeight());
                if (canvas != null) {
                    canvas.drawRect(rectF, this.EZpvd);
                }
                fKWHzl = KWHzl();
                f = this.djBIcL;
            }
            f4 += fKWHzl + f;
            i++;
        }
    }

    public final void setData(@NotNull java.util.List<MarketDiscoverFlowPo.MinimizedCellPo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        KWHzl(list);
        invalidate();
    }

    private final float KWHzl() {
        return (getMeasuredWidth() - (this.djBIcL * (this.OLrzqt.size() - 1))) / this.OLrzqt.size();
    }

    public final void KWHzl(java.util.List<MarketDiscoverFlowPo.MinimizedCellPo> list) {
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String strMulS$default = C33129mqd.mulS$default(((MarketDiscoverFlowPo.MinimizedCellPo) obj).getAveragePriceChangePercent(), 100, null, null, null, 14, null);
            int i2 = 0;
            for (java.lang.Object obj2 : C56427yEz.AkhnZx(copydefault())) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                kotlin.Pair pair = (kotlin.Pair) obj2;
                kotlin.Pair pair2 = (kotlin.Pair) pair.getFirst();
                if (C33129mqd.copydefault(strMulS$default, pair2.getFirst()) && C33129mqd.gEmmrt(strMulS$default, pair2.getSecond())) {
                    this.OLrzqt.add(i, (java.lang.Integer) pair.getSecond());
                }
                i2++;
            }
            i++;
        }
    }
}
