package o;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.okinc.business.dexui.main.swap.route.dag.model.DexEdgeItem;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeKey;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeMeta;
import com.okinc.business.dexui.main.swap.route.dag.model.lane.Capsule;
import com.okinc.business.dexui.main.swap.route.dag.model.lane.LaneLayoutResult;
import com.okinc.business.dexui.main.swap.route.dag.model.lane.Polyline;
import com.okinc.business.dexui.main.swap.route.dag.model.layout.LaneLayoutNew;
import com.okinc.business.dexui.main.swap.route.dag.model.parse.ParseResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24477iea extends android.widget.HorizontalScrollView {
    public final ActionBar AEQbTJ;
    public Function2<? super RouteNodeKey, ? super RouteNodeMeta, Unit> EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.ScrollView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24477iea(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24477iea(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnNodeClick(Function2<? super RouteNodeKey, ? super RouteNodeMeta, Unit> function2) {
        this.EZpvd = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.iea.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C24477iea(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24477iea(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.ScrollView scrollView = new android.widget.ScrollView(context);
        this.copydefault = scrollView;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.OLrzqt = frameLayout;
        ActionBar actionBar = new ActionBar(this, context);
        this.AEQbTJ = actionBar;
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
        this.KWHzl = frameLayout2;
        setHorizontalScrollBarEnabled(false);
        frameLayout.addView(actionBar, new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-2, -2));
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setFillViewport(false);
        scrollView.setClipToPadding(false);
        scrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-2, -2));
        post(new java.lang.Runnable() { // from class: o.iej
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24477iea.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(C24477iea c24477iea) {
        c24477iea.copydefault.setPadding(0, (int) c24477iea.AEQbTJ(8.0f), 0, (int) c24477iea.AEQbTJ(32.0f));
    }

    public final void setData(@NotNull java.util.List<DexEdgeItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.AEQbTJ(C24412idO.copydefault.AEQbTJ(list));
        this.copydefault.setPadding(0, (int) AEQbTJ(8.0f), 0, (int) AEQbTJ(32.0f));
        requestLayout();
    }

    public final float AEQbTJ(float f) {
        return f * getResources().getDisplayMetrics().density;
    }

    public final float KWHzl(float f) {
        return f * getResources().getDisplayMetrics().scaledDensity;
    }

    public final void AEQbTJ(LaneLayoutResult laneLayoutResult) {
        this.KWHzl.setLayoutParams(new FrameLayout.LayoutParams(laneLayoutResult.getWidth(), laneLayoutResult.getHeight()));
        this.KWHzl.removeAllViews();
        float fAEQbTJ = AEQbTJ(24.0f);
        float fAEQbTJ2 = AEQbTJ(8.0f);
        for (Map.Entry<RouteNodeKey, RectF> entry : laneLayoutResult.getNodeRects().entrySet()) {
            final RouteNodeKey key = entry.getKey();
            RectF value = entry.getValue();
            final RouteNodeMeta routeNodeMeta = laneLayoutResult.getNodeMeta().get(key);
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            int i = (int) fAEQbTJ;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
            imageView.setTranslationX(value.centerX() - (fAEQbTJ / 2));
            imageView.setTranslationY(value.top + fAEQbTJ2);
            this.KWHzl.addView(imageView);
            java.lang.String logoUrl = routeNodeMeta != null ? routeNodeMeta.getLogoUrl() : null;
            if (logoUrl == null) {
                logoUrl = "";
            }
            OLrzqt(imageView, logoUrl, C57406yhn.Activity.QKVWgx);
            imageView.setContentDescription("web3_dex_swap_provider_sub_route_row");
            android.view.View view = new android.view.View(getContext());
            view.setLayoutParams(new FrameLayout.LayoutParams((int) value.width(), (int) value.height()));
            view.setTranslationX(value.left);
            view.setTranslationY(value.top);
            view.setClickable(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: o.ief
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C24477iea.OLrzqt(this.AEQbTJ, key, routeNodeMeta, view2);
                }
            });
            this.KWHzl.addView(view);
        }
        float fAEQbTJ3 = AEQbTJ(32.0f);
        float fAEQbTJ4 = AEQbTJ(16.0f);
        LaneLayoutResult laneLayoutResultEZpvd = this.AEQbTJ.EZpvd();
        float fMax = java.lang.Math.max(laneLayoutResultEZpvd != null ? laneLayoutResultEZpvd.getTrunkTop() : 0.0f, AEQbTJ(16.0f)) - fAEQbTJ3;
        float f = fMax < 0.0f ? 0.0f : fMax;
        EZpvd(this, fAEQbTJ3, fAEQbTJ4, laneLayoutResult.getLeftTrunkX(), f, this.AEQbTJ.OLrzqt(), this.AEQbTJ.copydefault());
        EZpvd(this, fAEQbTJ3, fAEQbTJ4, laneLayoutResult.getRightTrunkX(), f, this.AEQbTJ.KWHzl(), this.AEQbTJ.AEQbTJ());
    }

    public static final void OLrzqt(C24477iea c24477iea, RouteNodeKey routeNodeKey, RouteNodeMeta routeNodeMeta, android.view.View view) {
        Function2<? super RouteNodeKey, ? super RouteNodeMeta, Unit> function2 = c24477iea.EZpvd;
        if (function2 != null) {
            function2.invoke(routeNodeKey, routeNodeMeta);
        }
    }

    public static final void EZpvd(C24477iea c24477iea, float f, float f2, float f3, float f4, java.lang.String str, java.lang.String str2) {
        android.widget.ImageView imageView = new android.widget.ImageView(c24477iea.getContext());
        int i = (int) f;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        imageView.setTranslationX(f3 - (f / 2));
        imageView.setTranslationY(f4);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        c24477iea.KWHzl.addView(imageView);
        if (str == null) {
            str = "";
        }
        c24477iea.OLrzqt(imageView, str, C57406yhn.Activity.QKVWgx);
        android.widget.ImageView imageView2 = new android.widget.ImageView(c24477iea.getContext());
        int i2 = (int) f2;
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        float f5 = f / 2.0f;
        float f6 = f2 / 2.0f;
        float fSqrt = (float) (((double) f5) / java.lang.Math.sqrt(2.0d));
        imageView2.setTranslationX((f3 + fSqrt) - f6);
        imageView2.setTranslationY(((f4 + f5) + fSqrt) - f6);
        imageView2.setScaleType(scaleType);
        c24477iea.KWHzl.addView(imageView2);
        if (str2 == null) {
            str2 = "";
        }
        c24477iea.OLrzqt(imageView2, str2, C57406yhn.Activity.QKVWgx);
    }

    /* JADX INFO: renamed from: o.iea$ActionBar */
    public final class ActionBar extends android.view.View {
        public final float AEQbTJ;
        public final float AYXKKw;
        public final float AhwBna;
        public final int AkhnZx;
        public final float AuCTel;
        public final /* synthetic */ C24477iea AuCTelauCTel;
        public java.lang.String DbNXlk;
        public final int EZpvd;
        public final android.graphics.Paint KWHzl;
        public final android.graphics.Paint OLrzqt;
        public final android.graphics.Paint copydefault;
        public final float djBIcL;
        public final float ejfBZ;
        public final android.graphics.Paint fARcdN;
        public final android.graphics.Paint fIwbmz;
        public final int fJNWhG;
        public java.lang.String fetchVPNInfo;
        public final LaneLayoutNew gEmmrt;
        public LaneLayoutResult getFieldNames;
        public final android.graphics.Paint getNewProxyInstance;
        public final float hDKMBd;
        public java.lang.String isConnected;
        public final float iwGUEr;
        public final float uzCIH;
        public final float valueOf;
        public java.lang.String values;
        public final android.graphics.Paint wlaJM;
        public final float zLjUOn;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LaneLayoutResult EZpvd() {
            return this.getFieldNames;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLastEndChainLogo(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.isConnected = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLastEndTokenLogo(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.fetchVPNInfo = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLastStartChainLogo(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLastStartTokenLogo(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.values = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C24477iea c24477iea, android.content.Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
            this.AuCTelauCTel = c24477iea;
            this.DbNXlk = "";
            this.isConnected = "";
            this.values = "";
            this.fetchVPNInfo = "";
            float fAEQbTJ = c24477iea.AEQbTJ(66.0f);
            this.hDKMBd = fAEQbTJ;
            float fAEQbTJ2 = c24477iea.AEQbTJ(58.0f);
            this.ejfBZ = fAEQbTJ2;
            float fAEQbTJ3 = c24477iea.AEQbTJ(12.0f);
            this.AhwBna = fAEQbTJ3;
            float fAEQbTJ4 = c24477iea.AEQbTJ(12.0f);
            this.iwGUEr = fAEQbTJ4;
            float fAEQbTJ5 = c24477iea.AEQbTJ(16.0f);
            this.uzCIH = fAEQbTJ5;
            float fAEQbTJ6 = c24477iea.AEQbTJ(46.0f);
            this.zLjUOn = fAEQbTJ6;
            float fAEQbTJ7 = c24477iea.AEQbTJ(46.0f);
            this.AuCTel = fAEQbTJ7;
            float fAEQbTJ8 = c24477iea.AEQbTJ(28.0f);
            this.djBIcL = fAEQbTJ8;
            this.AYXKKw = c24477iea.AEQbTJ(8.0f);
            float fAEQbTJ9 = c24477iea.AEQbTJ(54.0f);
            this.valueOf = fAEQbTJ9;
            this.AEQbTJ = c24477iea.AEQbTJ(8.0f);
            this.AkhnZx = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
            this.fJNWhG = C25382ivf.KWHzl(C52761wXj.Activity.QKVWgx);
            int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.invokespecialDPHOMC);
            this.EZpvd = iKWHzl;
            this.gEmmrt = new LaneLayoutNew(fAEQbTJ, fAEQbTJ2, fAEQbTJ3, fAEQbTJ4, fAEQbTJ5, fAEQbTJ6, fAEQbTJ7, fAEQbTJ8, fAEQbTJ9, null, 512, null);
            android.graphics.Paint paint = new android.graphics.Paint(1);
            paint.setColor(iKWHzl);
            this.fIwbmz = paint;
            android.graphics.Paint paint2 = new android.graphics.Paint(1);
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            paint2.setStrokeWidth(c24477iea.AEQbTJ(2.0f));
            this.getNewProxyInstance = paint2;
            android.graphics.Paint paint3 = new android.graphics.Paint(1);
            paint3.setTextSize(c24477iea.KWHzl(12.0f));
            paint3.setUnderlineText(true);
            this.wlaJM = paint3;
            android.graphics.Paint paint4 = new android.graphics.Paint(1);
            paint4.setColor(iKWHzl);
            this.copydefault = paint4;
            android.graphics.Paint paint5 = new android.graphics.Paint(1);
            paint5.setStyle(style);
            paint5.setStrokeWidth(c24477iea.AEQbTJ(2.0f));
            this.KWHzl = paint5;
            android.graphics.Paint paint6 = new android.graphics.Paint(1);
            paint6.setTextSize(c24477iea.AEQbTJ(14.0f));
            this.OLrzqt = paint6;
            android.graphics.Paint paint7 = new android.graphics.Paint(1);
            paint7.setStyle(style);
            paint7.setStrokeWidth(c24477iea.AEQbTJ(2.0f));
            this.fARcdN = paint7;
        }

        public final void AEQbTJ(@NotNull ParseResult parseResult) {
            java.lang.String logoUrl;
            RouteNodeMeta endMeta;
            java.lang.String logoUrl2;
            RouteNodeMeta startMeta;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(parseResult, "");
            this.getFieldNames = this.gEmmrt.layout(parseResult.getGraph(), java.lang.Integer.valueOf(MS.AEQbTJ(getContext())));
            this.DbNXlk = parseResult.getGraph().getStartChainLogoUrl();
            this.isConnected = parseResult.getGraph().getEndChainLogoUrl();
            LaneLayoutResult laneLayoutResult = this.getFieldNames;
            if (laneLayoutResult == null || (startMeta = laneLayoutResult.getStartMeta()) == null || (logoUrl = startMeta.getLogoUrl()) == null) {
                logoUrl = "";
            }
            this.values = logoUrl;
            LaneLayoutResult laneLayoutResult2 = this.getFieldNames;
            if (laneLayoutResult2 != null && (endMeta = laneLayoutResult2.getEndMeta()) != null && (logoUrl2 = endMeta.getLogoUrl()) != null) {
                str = logoUrl2;
            }
            this.fetchVPNInfo = str;
            LaneLayoutResult laneLayoutResult3 = this.getFieldNames;
            if (laneLayoutResult3 == null) {
                return;
            }
            this.AuCTelauCTel.AEQbTJ(laneLayoutResult3);
            requestLayout();
            invalidate();
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            LaneLayoutResult laneLayoutResult = this.getFieldNames;
            int width = laneLayoutResult != null ? laneLayoutResult.getWidth() : 0;
            LaneLayoutResult laneLayoutResult2 = this.getFieldNames;
            setMeasuredDimension(width, laneLayoutResult2 != null ? laneLayoutResult2.getHeight() : 0);
        }

        @Override // android.view.View
        public void onDraw(@NotNull android.graphics.Canvas canvas) {
            java.lang.String strAkhnZx;
            Intrinsics.checkNotNullParameter(canvas, "");
            super.onDraw(canvas);
            LaneLayoutResult laneLayoutResult = this.getFieldNames;
            if (laneLayoutResult == null) {
                return;
            }
            this.wlaJM.setColor(this.AkhnZx);
            this.getNewProxyInstance.setColor(this.EZpvd);
            this.KWHzl.setColor(this.EZpvd);
            this.OLrzqt.setColor(this.AkhnZx);
            this.fARcdN.setColor(this.fJNWhG);
            float fMax = java.lang.Math.max(laneLayoutResult.getTrunkTop(), this.uzCIH);
            float fMin = java.lang.Math.min(laneLayoutResult.getLeftTrunkBottom(), getHeight() - this.uzCIH);
            float fMin2 = java.lang.Math.min(laneLayoutResult.getRightTrunkBottom(), getHeight() - this.uzCIH);
            canvas.drawLine(laneLayoutResult.getLeftTrunkX(), fMax, laneLayoutResult.getLeftTrunkX(), fMin, this.fARcdN);
            canvas.drawLine(laneLayoutResult.getRightTrunkX(), fMax, laneLayoutResult.getRightTrunkX(), fMin2, this.fARcdN);
            java.util.Iterator<T> it = laneLayoutResult.getPolylines().iterator();
            while (it.hasNext()) {
                KWHzl(canvas, ((Polyline) it.next()).getPts());
            }
            for (Capsule capsule : laneLayoutResult.getCapsules()) {
                AEQbTJ(canvas, capsule.getRect(), capsule.getText());
            }
            java.util.Map<RouteNodeKey, RectF> nodeRects = laneLayoutResult.getNodeRects();
            C24477iea c24477iea = this.AuCTelauCTel;
            for (Map.Entry<RouteNodeKey, RectF> entry : nodeRects.entrySet()) {
                RouteNodeKey key = entry.getKey();
                RectF value = entry.getValue();
                canvas.drawRoundRect(value, c24477iea.AEQbTJ(16.0f), c24477iea.AEQbTJ(16.0f), this.fIwbmz);
                canvas.drawRoundRect(value, c24477iea.AEQbTJ(16.0f), c24477iea.AEQbTJ(16.0f), this.getNewProxyInstance);
                RouteNodeMeta routeNodeMeta = laneLayoutResult.getNodeMeta().get(key);
                if (routeNodeMeta == null || (strAkhnZx = routeNodeMeta.getSymbol()) == null) {
                    strAkhnZx = C59454zhO.AkhnZx(key.getTokenAddress(), 4);
                }
                float f = value.top;
                float fAEQbTJ = c24477iea.AEQbTJ(8.0f);
                float fAEQbTJ2 = c24477iea.AEQbTJ(24.0f);
                canvas.drawText(strAkhnZx, value.centerX() - (this.wlaJM.measureText(strAkhnZx) / 2), (((f + fAEQbTJ) + fAEQbTJ2) + c24477iea.AEQbTJ(4.0f)) - this.wlaJM.ascent(), this.wlaJM);
            }
        }

        public final void AEQbTJ(android.graphics.Canvas canvas, RectF rectF, java.lang.String str) {
            float fMeasureText = this.OLrzqt.measureText(str);
            float f = this.AEQbTJ;
            float f2 = 2;
            float f3 = rectF.left;
            RectF rectF2 = new RectF(f3, rectF.top, fMeasureText + (f * f2) + f3, rectF.bottom);
            float f4 = this.AYXKKw;
            canvas.drawRoundRect(rectF2, f4, f4, this.copydefault);
            float f5 = this.AYXKKw;
            canvas.drawRoundRect(rectF2, f5, f5, this.KWHzl);
            canvas.drawText(str, rectF2.left + this.AEQbTJ, rectF2.centerY() - ((this.OLrzqt.descent() + this.OLrzqt.ascent()) / f2), this.OLrzqt);
        }

        public final void KWHzl(android.graphics.Canvas canvas, java.util.List<? extends PointF> list) {
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(((PointF) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).x, ((PointF) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).y);
            int size = list.size();
            for (int i = 1; i < size; i++) {
                path.lineTo(list.get(i).x, list.get(i).y);
            }
            canvas.drawPath(path, this.fARcdN);
        }
    }

    public final void OLrzqt(android.widget.ImageView imageView, java.lang.String str, int i) {
        C5335Nt c5335NtKWHzl = Glide.KWHzl(imageView).EZpvd(str).KWHzl(i);
        android.content.Context context = imageView.getContext();
        int i2 = C52761wXj.Activity.scanPackages;
        android.content.Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c5335NtKWHzl.EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(context, 0.6f, C33070mpX.OLrzqt(i2, context2), false, 8, null)).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(i).copydefault(i)).EZpvd(imageView);
    }
}
