package o;

import android.graphics.Paint;
import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverFlowPo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C40895qga extends android.view.View {
    public java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> AEQbTJ;
    public android.graphics.Paint AYXKKw;
    public int AhwBna;
    public int EZpvd;
    public final int KWHzl;
    public android.content.Context OLrzqt;
    public final int copydefault;
    public int djBIcL;
    public java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> fetchVPNInfo;
    public android.graphics.Paint gEmmrt;
    public final int isConnected;
    public android.graphics.Paint valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40895qga(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = 100;
        this.KWHzl = 10;
        this.EZpvd = 10;
        this.copydefault = C55298xhM.dp2px$default(3.0f, null, 1, null);
        this.djBIcL = 10;
        this.isConnected = C55298xhM.dp2px$default(4.0f, null, 1, null);
        this.gEmmrt = new android.graphics.Paint();
        this.AYXKKw = new android.graphics.Paint();
        this.valueOf = new android.graphics.Paint();
        this.OLrzqt = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40895qga(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.AhwBna = 100;
        this.KWHzl = 10;
        this.EZpvd = 10;
        this.copydefault = C55298xhM.dp2px$default(3.0f, null, 1, null);
        this.djBIcL = 10;
        this.isConnected = C55298xhM.dp2px$default(4.0f, null, 1, null);
        this.gEmmrt = new android.graphics.Paint();
        this.AYXKKw = new android.graphics.Paint();
        this.valueOf = new android.graphics.Paint();
        this.OLrzqt = context;
        copydefault(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40895qga(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.AhwBna = 100;
        this.KWHzl = 10;
        this.EZpvd = 10;
        this.copydefault = C55298xhM.dp2px$default(3.0f, null, 1, null);
        this.djBIcL = 10;
        this.isConnected = C55298xhM.dp2px$default(4.0f, null, 1, null);
        this.gEmmrt = new android.graphics.Paint();
        this.AYXKKw = new android.graphics.Paint();
        this.valueOf = new android.graphics.Paint();
        this.OLrzqt = context;
        copydefault(context);
    }

    public final void copydefault(android.content.Context context) {
        if (C55296xhK.OLrzqt(context)) {
            android.graphics.Paint paint = this.gEmmrt;
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            paint.setColor(C33512mxp.tradeFallGraph$default(c33512mxp, context, 0.0f, 2, null));
            this.AYXKKw.setColor(C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null));
        } else {
            android.graphics.Paint paint2 = this.gEmmrt;
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            paint2.setColor(C33512mxp.tradeRiseGraph$default(c33512mxp2, context, 0.0f, 2, null));
            this.AYXKKw.setColor(C33512mxp.tradeFallGraph$default(c33512mxp2, context, 0.0f, 2, null));
        }
        this.gEmmrt.setAntiAlias(true);
        android.graphics.Paint paint3 = this.gEmmrt;
        C55051xce c55051xce = C55051xce.OLrzqt;
        paint3.setTypeface(c55051xce.valueOf());
        this.gEmmrt.setTextSize(C55298xhM.sp2pxFloat$default(10.0f, null, 1, null));
        this.AYXKKw.setAntiAlias(true);
        this.AYXKKw.setTypeface(c55051xce.valueOf());
        this.AYXKKw.setTextSize(C55298xhM.sp2pxFloat$default(10.0f, null, 1, null));
        this.valueOf.setTextSize(C55298xhM.sp2pxFloat$default(10.0f, null, 1, null));
        this.valueOf.setColor(C55366xib.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit, context));
        this.valueOf.setAntiAlias(true);
        this.valueOf.setTypeface(c55051xce.valueOf());
        Paint.FontMetrics fontMetrics = this.valueOf.getFontMetrics();
        int i = fontMetrics != null ? (int) fontMetrics.descent : 0;
        Paint.FontMetrics fontMetrics2 = this.valueOf.getFontMetrics();
        this.djBIcL = i - (fontMetrics2 != null ? (int) fontMetrics2.ascent : 0);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int i5 = this.KWHzl;
        this.EZpvd = (width - ((i5 - 1) * this.copydefault)) / i5;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList;
        MarketDiscoverFlowPo.ExpandedCellPo expandedCellPo;
        MarketDiscoverFlowPo.ExpandedCellPo expandedCellPo2;
        java.lang.String num;
        int i;
        MarketDiscoverFlowPo.ExpandedCellPo expandedCellPo3;
        MarketDiscoverFlowPo.ExpandedCellPo expandedCellPo4;
        java.lang.String num2;
        MarketDiscoverFlowPo.ExpandedCellPo expandedCellPo5;
        MarketDiscoverFlowPo.ExpandedCellPo expandedCellPo6;
        java.lang.String num3;
        int i2;
        int i3;
        MarketDiscoverFlowPo.ExpandedCellPo expandedCellPo7;
        MarketDiscoverFlowPo.ExpandedCellPo expandedCellPo8;
        java.lang.String num4;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList2 = this.fetchVPNInfo;
        if (arrayList2 == null || arrayList2.isEmpty() || (arrayList = this.AEQbTJ) == null || arrayList.isEmpty()) {
            return;
        }
        int height = (getHeight() - this.djBIcL) - (this.isConnected * 2);
        int height2 = (getHeight() - (this.djBIcL * 2)) - (this.isConnected * 3);
        android.content.Context context = this.OLrzqt;
        int i4 = 0;
        int i5 = 5;
        if (context != null && C55296xhK.OLrzqt(context)) {
            java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList3 = this.AEQbTJ;
            if (arrayList3 != null && arrayList3.size() >= 5) {
                int i6 = 0;
                while (i6 < i5) {
                    int i7 = (this.copydefault + this.EZpvd) * i6;
                    java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList4 = this.AEQbTJ;
                    float fDjBIcL = (arrayList4 == null || (expandedCellPo8 = (MarketDiscoverFlowPo.ExpandedCellPo) CollectionsKt___CollectionsKt.AkhnZx(arrayList4, i6)) == null || (num4 = expandedCellPo8.getNum()) == null) ? 0.0f : C33129mqd.djBIcL(num4);
                    float f = C33129mqd.valueOf(java.lang.Float.valueOf(fDjBIcL), java.lang.Float.valueOf(1.0f)) ? height - ((1.0f / this.AhwBna) * height2) : height - ((fDjBIcL / this.AhwBna) * height2);
                    int i8 = this.EZpvd;
                    java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList5 = this.AEQbTJ;
                    if (arrayList5 == null || (expandedCellPo7 = (MarketDiscoverFlowPo.ExpandedCellPo) CollectionsKt___CollectionsKt.AkhnZx(arrayList5, i6)) == null) {
                        i2 = i6;
                        i3 = i5;
                    } else {
                        i2 = i6;
                        i3 = i5;
                        AEQbTJ(canvas, expandedCellPo7, this.gEmmrt, i7, C33129mqd.AhwBna(java.lang.Float.valueOf(f)), i7 + i8, height, true);
                    }
                    i6 = i2 + 1;
                    i5 = i3;
                }
            }
            int i9 = i5;
            java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList6 = this.fetchVPNInfo;
            if (arrayList6 == null || arrayList6.size() < i9) {
                return;
            }
            while (i4 < i9) {
                int i10 = (this.copydefault + this.EZpvd) * (i4 + 5);
                java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList7 = this.fetchVPNInfo;
                float fDjBIcL2 = (arrayList7 == null || (expandedCellPo6 = (MarketDiscoverFlowPo.ExpandedCellPo) CollectionsKt___CollectionsKt.AkhnZx(arrayList7, i4)) == null || (num3 = expandedCellPo6.getNum()) == null) ? 0.0f : C33129mqd.djBIcL(num3);
                float f2 = C33129mqd.valueOf(java.lang.Float.valueOf(fDjBIcL2), java.lang.Float.valueOf(1.0f)) ? height - ((1.0f / this.AhwBna) * height2) : height - ((fDjBIcL2 / this.AhwBna) * height2);
                int i11 = this.EZpvd;
                java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList8 = this.fetchVPNInfo;
                if (arrayList8 != null && (expandedCellPo5 = (MarketDiscoverFlowPo.ExpandedCellPo) CollectionsKt___CollectionsKt.AkhnZx(arrayList8, i4)) != null) {
                    AEQbTJ(canvas, expandedCellPo5, this.AYXKKw, i10, C33129mqd.AhwBna(java.lang.Float.valueOf(f2)), i10 + i11, height, false);
                }
                i4++;
            }
            return;
        }
        java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList9 = this.fetchVPNInfo;
        if (arrayList9 != null && arrayList9.size() >= 5) {
            int i12 = 0;
            while (i12 < 5) {
                int i13 = (this.copydefault + this.EZpvd) * i12;
                java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList10 = this.fetchVPNInfo;
                float fDjBIcL3 = (arrayList10 == null || (expandedCellPo4 = (MarketDiscoverFlowPo.ExpandedCellPo) CollectionsKt___CollectionsKt.AkhnZx(arrayList10, i12)) == null || (num2 = expandedCellPo4.getNum()) == null) ? 0.0f : C33129mqd.djBIcL(num2);
                float f3 = C33129mqd.valueOf(java.lang.Float.valueOf(fDjBIcL3), java.lang.Float.valueOf(1.0f)) ? height - ((1.0f / this.AhwBna) * height2) : height - ((fDjBIcL3 / this.AhwBna) * height2);
                int i14 = this.EZpvd;
                java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList11 = this.fetchVPNInfo;
                if (arrayList11 == null || (expandedCellPo3 = (MarketDiscoverFlowPo.ExpandedCellPo) CollectionsKt___CollectionsKt.AkhnZx(arrayList11, i12)) == null) {
                    i = i12;
                } else {
                    i = i12;
                    AEQbTJ(canvas, expandedCellPo3, this.gEmmrt, i13, C33129mqd.AhwBna(java.lang.Float.valueOf(f3)), i13 + i14, height, true);
                }
                i12 = i + 1;
            }
        }
        java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList12 = this.AEQbTJ;
        if (arrayList12 == null || arrayList12.size() < 5) {
            return;
        }
        while (i4 < 5) {
            int i15 = (this.copydefault + this.EZpvd) * (i4 + 5);
            java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList13 = this.AEQbTJ;
            float fDjBIcL4 = (arrayList13 == null || (expandedCellPo2 = (MarketDiscoverFlowPo.ExpandedCellPo) CollectionsKt___CollectionsKt.AkhnZx(arrayList13, i4)) == null || (num = expandedCellPo2.getNum()) == null) ? 0.0f : C33129mqd.djBIcL(num);
            float f4 = C33129mqd.valueOf(java.lang.Float.valueOf(fDjBIcL4), java.lang.Float.valueOf(1.0f)) ? height - ((1.0f / this.AhwBna) * height2) : height - ((fDjBIcL4 / this.AhwBna) * height2);
            int i16 = this.EZpvd;
            java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList14 = this.AEQbTJ;
            if (arrayList14 != null && (expandedCellPo = (MarketDiscoverFlowPo.ExpandedCellPo) CollectionsKt___CollectionsKt.AkhnZx(arrayList14, i4)) != null) {
                AEQbTJ(canvas, expandedCellPo, this.AYXKKw, i15, C33129mqd.AhwBna(java.lang.Float.valueOf(f4)), i15 + i16, height, false);
            }
            i4++;
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, MarketDiscoverFlowPo.ExpandedCellPo expandedCellPo, android.graphics.Paint paint, int i, int i2, int i3, int i4, boolean z) {
        canvas.drawRect(new android.graphics.Rect(i, i2, i3, i4), paint);
        float fMeasureText = this.valueOf.measureText(expandedCellPo.getNum());
        this.gEmmrt.setTextSize(C55298xhM.sp2pxFloat$default(10.0f, null, 1, null));
        this.AYXKKw.setTextSize(C55298xhM.sp2pxFloat$default(10.0f, null, 1, null));
        if (z) {
            canvas.drawText(expandedCellPo.getNum(), ((i + i3) - fMeasureText) / 2, i2 - this.isConnected, this.gEmmrt);
        } else {
            canvas.drawText(expandedCellPo.getNum(), ((i + i3) - fMeasureText) / 2, i2 - this.isConnected, this.AYXKKw);
        }
        canvas.drawText(expandedCellPo.getRange(), ((i + i3) - this.AYXKKw.measureText(expandedCellPo.getRange())) / 2, i4 + this.isConnected + this.djBIcL, this.valueOf);
    }

    public final void OLrzqt(@NotNull MarketDiscoverFlowPo.ExpandedFlowPo expandedFlowPo) {
        Intrinsics.checkNotNullParameter(expandedFlowPo, "");
        this.AhwBna = C33129mqd.AhwBna(expandedFlowPo.getMaxRangeNum());
        java.util.List<MarketDiscoverFlowPo.ExpandedCellPo> downList = expandedFlowPo.getDownList();
        Intrinsics.copydefault(downList, "");
        this.AEQbTJ = (java.util.ArrayList) downList;
        java.util.List<MarketDiscoverFlowPo.ExpandedCellPo> upList = expandedFlowPo.getUpList();
        Intrinsics.copydefault(upList, "");
        this.fetchVPNInfo = (java.util.ArrayList) upList;
        android.content.Context context = this.OLrzqt;
        if (context != null && C55296xhK.OLrzqt(context)) {
            java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList = this.AEQbTJ;
            if (arrayList != null) {
                C56404yEc.zsXlph(arrayList);
            }
            java.util.ArrayList<MarketDiscoverFlowPo.ExpandedCellPo> arrayList2 = this.fetchVPNInfo;
            if (arrayList2 != null) {
                C56404yEc.zsXlph(arrayList2);
            }
        }
        postInvalidate();
    }
}
