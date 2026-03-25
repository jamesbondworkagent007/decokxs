package o;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.camera.video.AudioStats;
import com.okinc.tradeuilib.depth.bean.DepthClickableConfig;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.urE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49576urE extends android.view.View {
    public float AEQbTJ;
    public float AYXKKw;
    public java.util.ArrayList<RectF> AhwBna;
    public int AkhnZx;
    public boolean AuCTel;
    public float AuCTelauCTel;
    public android.graphics.Paint AubY;
    public java.lang.Integer AwvSrB;
    public android.graphics.Paint AxsJAY;
    public java.util.List<C54429xIb> DbNXlk;
    public int EZpvd;
    public android.graphics.Paint KWHzl;
    public float OLrzqt;
    public float copydefault;
    public DepthClickableConfig djBIcL;
    public boolean ejfBZ;
    public java.lang.String fARcdN;
    public java.lang.String fIwbmz;
    public float fJNWhG;
    public java.util.ArrayList<RectF> fetchVPNInfo;
    public int gEmmrt;
    public float gHZMYf;
    public int getFieldNames;
    public yHS<? super java.lang.Integer, ? super java.lang.Double, ? super java.lang.Double, ? super java.lang.Double, ? super java.lang.Boolean, Unit> getNewProxyInstance;
    public java.util.List<C54429xIb> hDKMBd;
    public float isConnected;
    public final java.lang.String iwGUEr;
    public android.animation.ValueAnimator sSMYrx;
    public java.util.ArrayList<C54429xIb> uzCIH;
    public java.util.ArrayList<C54429xIb> valueOf;
    public java.util.ArrayList<RectF> values;
    public int wlaJM;
    public int zLjUOn;
    public final android.graphics.Paint zsXlph;
    public android.graphics.Paint zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49576urE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49576urE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C54429xIb> EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setForceGone(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnItemClickCallback(yHS<? super java.lang.Integer, ? super java.lang.Double, ? super java.lang.Double, ? super java.lang.Double, ? super java.lang.Boolean, Unit> yhs) {
        this.getNewProxyInstance = yhs;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.urE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C49576urE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49576urE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = 5;
        this.isConnected = 4.0f;
        this.AYXKKw = 8.0f;
        this.AubY = new android.graphics.Paint();
        this.wlaJM = Color.parseColor("#E84256");
        this.AuCTelauCTel = C33052mpF.AYXKKw(12.0f, context);
        this.AxsJAY = new android.graphics.Paint();
        this.gHZMYf = C33052mpF.AYXKKw(13.0f, context);
        this.KWHzl = new android.graphics.Paint();
        this.EZpvd = Color.parseColor("#3D3D3D");
        this.copydefault = C33052mpF.AYXKKw(12.0f, context);
        this.zuBGHE = new android.graphics.Paint();
        this.zLjUOn = Color.parseColor("#CCCCCC");
        this.valueOf = new java.util.ArrayList<>();
        this.uzCIH = new java.util.ArrayList<>();
        this.values = new java.util.ArrayList<>();
        this.fetchVPNInfo = new java.util.ArrayList<>();
        this.AhwBna = new java.util.ArrayList<>();
        this.iwGUEr = "--";
        this.zsXlph = new android.graphics.Paint();
        this.fARcdN = "";
        this.fIwbmz = "";
        this.djBIcL = new DepthClickableConfig((java.lang.Boolean) null, (java.lang.Boolean) null, 3, (DefaultConstructorMarker) null);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.ORxRYg, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                this.gEmmrt = typedArrayObtainStyledAttributes.getInteger(C32113mPz.PendingIntent.QKVWgx, this.gEmmrt);
                this.isConnected = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.QfsBiF, this.isConnected);
                this.AuCTelauCTel = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.QbewEr, this.AuCTelauCTel);
                this.wlaJM = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.QVAiDq, this.wlaJM);
                this.copydefault = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.DTwDnp, this.copydefault);
                this.EZpvd = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.OcIXYQ, this.EZpvd);
                this.zLjUOn = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.RJOkX, this.zLjUOn);
                this.AkhnZx = typedArrayObtainStyledAttributes.getInteger(C32113mPz.PendingIntent.QUSxYX, this.AkhnZx);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        OLrzqt();
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.urG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C49576urE.EZpvd(this.copydefault, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(250L);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        this.sSMYrx = valueAnimatorOfFloat;
    }

    public final void OLrzqt() {
        android.graphics.Paint paint = this.AubY;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        paint.setTextAlign(C55296xhK.OLrzqt(context) ? Paint.Align.RIGHT : Paint.Align.LEFT);
        this.AubY.setAntiAlias(true);
        this.AubY.setColor(this.wlaJM);
        this.AubY.setTextSize(this.AuCTelauCTel);
        android.graphics.Paint paint2 = this.AubY;
        C55051xce c55051xce = C55051xce.OLrzqt;
        paint2.setTypeface(c55051xce.valueOf());
        this.AxsJAY.setAntiAlias(true);
        this.AxsJAY.setColor(this.wlaJM);
        this.AxsJAY.setTextSize(this.gHZMYf);
        android.graphics.Paint paint3 = this.KWHzl;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        paint3.setTextAlign(C55296xhK.OLrzqt(context2) ? Paint.Align.LEFT : Paint.Align.RIGHT);
        this.KWHzl.setAntiAlias(true);
        this.KWHzl.setColor(this.EZpvd);
        this.KWHzl.setTextSize(this.copydefault);
        this.KWHzl.setTypeface(c55051xce.valueOf());
        this.zuBGHE.setAntiAlias(true);
        android.graphics.Paint paint4 = this.zuBGHE;
        Paint.Style style = Paint.Style.FILL;
        paint4.setStyle(style);
        this.zuBGHE.setColor(this.zLjUOn);
        this.zsXlph.setAntiAlias(true);
        this.zsXlph.setStyle(style);
        this.zsXlph.setColor(0);
    }

    public final void setDepthLevel(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        int iScale = xMR.copydefault.OLrzqt((java.lang.Object) str).scale() - 7;
        if (iScale <= 0) {
            java.util.List<C54429xIb> listEZpvd = EZpvd();
            if (listEZpvd != null) {
                for (C54429xIb c54429xIb : listEZpvd) {
                    iScale = java.lang.Math.max(iScale, C33129mqd.AhwBna(java.lang.Double.valueOf(C33129mqd.subD$default(java.lang.Double.valueOf(C33129mqd.addD$default(java.lang.Integer.valueOf(c54429xIb.KWHzl().length()), java.lang.Integer.valueOf(c54429xIb.OLrzqt().length()), null, null, null, 14, null)), 17, null, null, null, 14, null))));
                }
            }
            java.util.List<C54429xIb> list = this.hDKMBd;
            if (list != null) {
                for (C54429xIb c54429xIb2 : list) {
                    iScale = java.lang.Math.max(iScale, C33129mqd.AhwBna(java.lang.Double.valueOf(C33129mqd.subD$default(java.lang.Double.valueOf(C33129mqd.addD$default(java.lang.Integer.valueOf(c54429xIb2.KWHzl().length()), java.lang.Integer.valueOf(c54429xIb2.OLrzqt().length()), null, null, null, 14, null)), 17, null, null, null, 14, null))));
                }
            }
        }
        pUU.KWHzl("DepthView", "end textSize: " + iScale);
        if (iScale > 0) {
            int iValueOf = C56548yJl.valueOf(4, iScale);
            float f = this.AuCTelauCTel;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iDjBIcL = C33052mpF.djBIcL(f, context) - iValueOf;
            float f2 = this.copydefault;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iDjBIcL2 = C33052mpF.djBIcL(f2, context2) - iValueOf;
            if (iDjBIcL > 0) {
                android.graphics.Paint paint = this.AubY;
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                paint.setTextSize(C33052mpF.AYXKKw(r2, r4));
                android.graphics.Paint paint2 = this.AxsJAY;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                float fAYXKKw = C33052mpF.AYXKKw(iDjBIcL, context3);
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                paint2.setTextSize(fAYXKKw + C33052mpF.AYXKKw(2.0f, r4));
            }
            if (iDjBIcL2 > 0) {
                android.graphics.Paint paint3 = this.KWHzl;
                Intrinsics.checkNotNullExpressionValue(getContext(), "");
                paint3.setTextSize(C33052mpF.AYXKKw(iDjBIcL2, r2));
                return;
            }
            return;
        }
        this.AubY.setTextSize(this.AuCTelauCTel);
        this.KWHzl.setTextSize(this.copydefault);
        android.graphics.Paint paint4 = this.AxsJAY;
        float f3 = this.AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        paint4.setTextSize(f3 + C33052mpF.AYXKKw(2.0f, r3));
    }

    public final void setDepthItems(@NotNull java.util.List<C54429xIb> list, java.util.List<C54429xIb> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<C54429xIb> list3 = this.DbNXlk;
        if (list3 == null || list3.size() != list.size()) {
            this.DbNXlk = list;
            this.hDKMBd = list2;
            this.valueOf.clear();
            this.valueOf.addAll(list);
            this.uzCIH.clear();
            if (list2 != null) {
                this.uzCIH.addAll(list2);
            }
            requestLayout();
        } else {
            this.valueOf.clear();
            java.util.List<C54429xIb> list4 = this.DbNXlk;
            if (list4 != null) {
                this.valueOf.addAll(list4);
            }
            this.uzCIH.clear();
            java.util.List<C54429xIb> list5 = this.hDKMBd;
            if (list5 != null) {
                this.uzCIH.addAll(list5);
            }
            this.DbNXlk = list;
            this.hDKMBd = list2;
            invalidate();
        }
        this.sSMYrx.cancel();
        this.sSMYrx.start();
    }

    public final void setPriceColor(int i) {
        this.AubY.setColor(i);
    }

    public final void setProgressColor(int i) {
        this.zsXlph.setColor(i);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Paint.FontMetrics fontMetrics = this.AubY.getFontMetrics();
        Paint.FontMetrics fontMetrics2 = this.KWHzl.getFontMetrics();
        float fMax = java.lang.Math.max(java.lang.Math.abs(fontMetrics.bottom) + java.lang.Math.abs(fontMetrics.top), java.lang.Math.abs(fontMetrics2.bottom) + java.lang.Math.abs(fontMetrics2.top));
        this.AEQbTJ = fMax;
        float f = fMax + this.isConnected;
        this.fJNWhG = f;
        int i3 = this.gEmmrt;
        this.getFieldNames = i3;
        super.onMeasure(i, (this.AuCTel ? 0 : (int) (f * i3)) | 1073741824);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (copydefault()) {
            EZpvd(canvas);
            KWHzl(canvas, this.DbNXlk);
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas) {
        java.lang.Integer num;
        int iIntValue;
        if (AEQbTJ() && (num = this.AwvSrB) != null && (iIntValue = num.intValue()) < this.values.size()) {
            if (this.ejfBZ) {
                if (KWHzl() && Intrinsics.EZpvd(this.djBIcL.getPriceClickable(), java.lang.Boolean.TRUE)) {
                    canvas.drawRect(this.values.get(iIntValue), this.zuBGHE);
                    return;
                } else if (Intrinsics.EZpvd(this.djBIcL.getPriceClickable(), java.lang.Boolean.TRUE)) {
                    canvas.drawRect(this.fetchVPNInfo.get(iIntValue), this.zuBGHE);
                    return;
                } else {
                    if (KWHzl()) {
                        canvas.drawRect(this.AhwBna.get(iIntValue), this.zuBGHE);
                        return;
                    }
                    return;
                }
            }
            if (Intrinsics.EZpvd(this.djBIcL.getPriceClickable(), java.lang.Boolean.TRUE)) {
                canvas.drawRect(this.fetchVPNInfo.get(iIntValue), this.zuBGHE);
            }
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, java.lang.String str, RectF rectF, android.graphics.Paint paint, boolean z) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            z = !z;
        }
        Paint.FontMetrics fontMetrics = this.AubY.getFontMetrics();
        canvas.drawText(str, z ? getWidth() : 0, (((rectF.bottom + rectF.top) - fontMetrics.bottom) - fontMetrics.top) / 2, paint);
    }

    public static final void EZpvd(C49576urE c49576urE, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        java.lang.Float f = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f != null) {
            c49576urE.OLrzqt = f.floatValue();
            c49576urE.postInvalidate();
        }
    }

    public final boolean copydefault() {
        if (!this.values.isEmpty() && this.gEmmrt == this.getFieldNames) {
            return true;
        }
        int i = 0;
        if (getWidth() <= 0 || getHeight() <= 0) {
            return false;
        }
        float width = getWidth();
        float height = getHeight();
        if (this.AkhnZx == 0) {
            int i2 = this.gEmmrt;
            while (i < i2) {
                java.util.ArrayList<RectF> arrayList = this.values;
                float f = i;
                float f2 = this.fJNWhG;
                i++;
                float f3 = i;
                arrayList.add(new RectF(0.0f, f * f2, width, f2 * f3));
                java.util.ArrayList<RectF> arrayList2 = this.fetchVPNInfo;
                float f4 = this.fJNWhG;
                float f5 = width / 2;
                arrayList2.add(new RectF(0.0f, f * f4, f5, f4 * f3));
                java.util.ArrayList<RectF> arrayList3 = this.AhwBna;
                float f6 = this.fJNWhG;
                arrayList3.add(new RectF(f5, f * f6, width, f3 * f6));
            }
        } else {
            int i3 = this.gEmmrt;
            while (i < i3) {
                java.util.ArrayList<RectF> arrayList4 = this.values;
                int i4 = i + 1;
                float f7 = i4;
                float f8 = this.fJNWhG;
                float f9 = i;
                arrayList4.add(new RectF(0.0f, height - (f7 * f8), width, height - (f8 * f9)));
                java.util.ArrayList<RectF> arrayList5 = this.fetchVPNInfo;
                float f10 = this.fJNWhG;
                float f11 = width / 2;
                arrayList5.add(new RectF(0.0f, height - (f7 * f10), f11, height - (f10 * f9)));
                java.util.ArrayList<RectF> arrayList6 = this.AhwBna;
                float f12 = this.fJNWhG;
                arrayList6.add(new RectF(f11, height - (f7 * f12), width, height - (f9 * f12)));
                i = i4;
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf;
        float f = this.fJNWhG;
        if (f > 0.0f) {
            java.lang.Integer numValueOf2 = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
            int i = 0;
            if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                if (this.AkhnZx == 0) {
                    numValueOf = java.lang.Integer.valueOf((int) (motionEvent.getY() / f));
                } else {
                    numValueOf = java.lang.Integer.valueOf((int) ((getHeight() - motionEvent.getY()) / f));
                }
                this.AwvSrB = numValueOf;
                this.ejfBZ = motionEvent.getX() >= ((float) (getWidth() / 2));
                invalidate();
                if (AEQbTJ()) {
                    C50028uzg c50028uzg = C50028uzg.copydefault;
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    c50028uzg.OLrzqt(context, 100L);
                }
            } else if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                java.lang.Integer num = this.AwvSrB;
                java.util.List<C54429xIb> list = this.DbNXlk;
                if (num != null && list != null && !list.isEmpty() && num.intValue() < list.size()) {
                    int iIntValue = num.intValue();
                    double dAddD$default = AudioStats.AUDIO_AMPLITUDE_NONE;
                    if (iIntValue >= 0) {
                        while (true) {
                            dAddD$default = C33129mqd.addD$default(java.lang.Double.valueOf(dAddD$default), java.lang.Double.valueOf(list.get(i).AEQbTJ()), null, null, null, 14, null);
                            if (i == iIntValue) {
                                break;
                            }
                            i++;
                        }
                    }
                    yHS<? super java.lang.Integer, ? super java.lang.Double, ? super java.lang.Double, ? super java.lang.Double, ? super java.lang.Boolean, Unit> yhs = this.getNewProxyInstance;
                    if (yhs != null) {
                        yhs.invoke(num, java.lang.Double.valueOf(list.get(num.intValue()).copydefault()), java.lang.Double.valueOf(list.get(num.intValue()).AEQbTJ()), java.lang.Double.valueOf(dAddD$default), java.lang.Boolean.valueOf(this.ejfBZ));
                    }
                }
                this.AwvSrB = null;
                invalidate();
            } else if (numValueOf2 != null && numValueOf2.intValue() == 3) {
                this.AwvSrB = null;
                invalidate();
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.urE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changeDataHeight$default(C49576urE c49576urE, int i, java.lang.Integer num, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        c49576urE.OLrzqt(i, num, function1);
    }

    public final void OLrzqt(int i, java.lang.Integer num, Function1<? super java.lang.Integer, Unit> function1) {
        int iIntValue = num != null ? num.intValue() : (i / 2) + getMeasuredHeight();
        float f = this.AEQbTJ + this.AYXKKw;
        float f2 = iIntValue;
        int iCopydefault = C56548yJl.copydefault(5, C56548yJl.valueOf(20, (int) (f2 / f)));
        float f3 = iCopydefault;
        float f4 = (f2 - (f * f3)) / f3;
        this.gEmmrt = iCopydefault;
        this.isConnected = f4 < 0.0f ? this.AYXKKw : f4 + this.AYXKKw;
        this.values.clear();
        this.fetchVPNInfo.clear();
        this.AhwBna.clear();
        this.getFieldNames = iCopydefault;
        requestLayout();
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(this.gEmmrt));
        }
    }

    public final void KWHzl(@NotNull DepthClickableConfig depthClickableConfig) {
        Intrinsics.checkNotNullParameter(depthClickableConfig, "");
        if (depthClickableConfig.getPriceClickable() != null) {
            this.djBIcL.setPriceClickable(depthClickableConfig.getPriceClickable());
        }
        if (depthClickableConfig.getAmtClickable() != null) {
            this.djBIcL.setAmtClickable(depthClickableConfig.getAmtClickable());
        }
    }

    public final boolean AEQbTJ() {
        if (this.ejfBZ) {
            return Intrinsics.EZpvd(this.djBIcL.getPriceClickable(), java.lang.Boolean.TRUE) || KWHzl();
        }
        return Intrinsics.EZpvd(this.djBIcL.getPriceClickable(), java.lang.Boolean.TRUE);
    }

    public final boolean KWHzl() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        return Intrinsics.EZpvd(this.djBIcL.getAmtClickable(), java.lang.Boolean.TRUE) && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.AxsJAY();
    }

    public final void KWHzl(android.graphics.Canvas canvas, java.util.List<C54429xIb> list) {
        int i = 0;
        if (list == null) {
            for (java.lang.Object obj : this.values) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                RectF rectF = (RectF) obj;
                KWHzl(canvas, this.iwGUEr, rectF, this.AubY, false);
                KWHzl(canvas, this.iwGUEr, rectF, this.KWHzl, true);
                i++;
            }
            return;
        }
        for (java.lang.Object obj2 : this.values) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            RectF rectF2 = (RectF) obj2;
            if (i < list.size()) {
                KWHzl(canvas, i, rectF2, this.zsXlph);
                C54429xIb c54429xIb = list.get(i);
                java.lang.Integer num = this.AwvSrB;
                if (num != null && i == num.intValue()) {
                    KWHzl(canvas, c54429xIb.KWHzl(), rectF2, this.AxsJAY, false);
                } else {
                    KWHzl(canvas, c54429xIb.KWHzl(), rectF2, this.AubY, false);
                }
                KWHzl(canvas, c54429xIb.OLrzqt(), rectF2, this.KWHzl, true);
            } else {
                KWHzl(canvas, this.iwGUEr, rectF2, this.AubY, false);
                KWHzl(canvas, this.iwGUEr, rectF2, this.KWHzl, true);
            }
            i++;
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, int i, RectF rectF, android.graphics.Paint paint) {
        double dAEQbTJ;
        android.graphics.Canvas canvas2;
        android.graphics.Paint paint2;
        RectF rectF2;
        C54429xIb c54429xIb;
        java.lang.String strDivS$default;
        java.lang.String strDivS$default2;
        if (this.AuCTel) {
            return;
        }
        java.util.List<C54429xIb> list = this.DbNXlk;
        double dAEQbTJ2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (list != null) {
            dAEQbTJ = 0.0d;
            for (C54429xIb c54429xIb2 : list) {
                if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(c54429xIb2.AEQbTJ()), java.lang.Double.valueOf(dAEQbTJ))) {
                    dAEQbTJ = c54429xIb2.AEQbTJ();
                }
            }
        } else {
            dAEQbTJ = 0.0d;
        }
        java.util.List<C54429xIb> list2 = this.hDKMBd;
        if (list2 != null) {
            for (C54429xIb c54429xIb3 : list2) {
                if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(c54429xIb3.AEQbTJ()), java.lang.Double.valueOf(dAEQbTJ))) {
                    dAEQbTJ = c54429xIb3.AEQbTJ();
                }
            }
        }
        for (C54429xIb c54429xIb4 : this.valueOf) {
            if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(c54429xIb4.AEQbTJ()), java.lang.Double.valueOf(dAEQbTJ2))) {
                dAEQbTJ2 = c54429xIb4.AEQbTJ();
            }
        }
        for (C54429xIb c54429xIb5 : this.uzCIH) {
            if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(c54429xIb5.AEQbTJ()), java.lang.Double.valueOf(dAEQbTJ2))) {
                dAEQbTJ2 = c54429xIb5.AEQbTJ();
            }
        }
        C54429xIb c54429xIb6 = (C54429xIb) CollectionsKt___CollectionsKt.AkhnZx(this.valueOf, i);
        float fDjBIcL = 0.0f;
        float fWidth = rectF.width() * ((c54429xIb6 == null || (strDivS$default2 = C33129mqd.divS$default(java.lang.Double.valueOf(c54429xIb6.AEQbTJ()), java.lang.Double.valueOf(dAEQbTJ2), null, null, null, 14, null)) == null) ? 0.0f : C33129mqd.djBIcL(strDivS$default2));
        java.util.List<C54429xIb> list3 = this.DbNXlk;
        if (list3 != null && (c54429xIb = (C54429xIb) CollectionsKt___CollectionsKt.AkhnZx(list3, i)) != null && (strDivS$default = C33129mqd.divS$default(java.lang.Double.valueOf(c54429xIb.AEQbTJ()), java.lang.Double.valueOf(dAEQbTJ), null, null, null, 14, null)) != null) {
            fDjBIcL = C33129mqd.djBIcL(strDivS$default);
        }
        float fWidth2 = ((rectF.width() * fDjBIcL) - fWidth) * C33129mqd.djBIcL(java.lang.Float.valueOf(this.OLrzqt));
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            rectF2 = new RectF(rectF.left, rectF.top, C33129mqd.djBIcL(java.lang.Float.valueOf(fWidth + fWidth2)) + rectF.left, rectF.bottom);
            canvas2 = canvas;
            paint2 = paint;
        } else {
            RectF rectF3 = new RectF(rectF.left + (rectF.width() - (fWidth + fWidth2)), rectF.top, rectF.right, rectF.bottom);
            canvas2 = canvas;
            paint2 = paint;
            rectF2 = rectF3;
        }
        canvas2.drawRect(rectF2, paint2);
    }
}
