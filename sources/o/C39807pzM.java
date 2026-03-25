package o;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;
import androidx.camera.video.AudioStats;
import com.okinc.kline.ui.view.model.MarketDepthItem;
import kotlin.jvm.internal.Intrinsics;
import o.C37882pEe;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39807pzM extends android.view.View {
    public android.graphics.Paint AEQbTJ;
    public MarketDepthItem AYXKKw;
    public float AhwBna;
    public float[] AkhnZx;
    public final java.util.ArrayList<MarketDepthItem> AuCTel;
    public float[] AuCTelauCTel;
    public float[] AubY;
    public int AwvSrB;
    public float AxsJAY;
    public float DTwDnp;
    public boolean DbNXlk;
    public final int EZpvd;
    public float KWHzl;
    public final java.lang.String OLrzqt;
    public float ORxRYg;
    public float OcIXYQ;
    public float QKVWgx;
    public final float QOLQEE;
    public boolean QVAiDq;
    public android.animation.ValueAnimator QbewEr;
    public android.graphics.Paint copydefault;
    public int djBIcL;
    public int ejfBZ;
    public java.util.ArrayList<MarketDepthItem> fARcdN;
    public java.util.ArrayList<MarketDepthItem> fIwbmz;
    public float[] fJNWhG;
    public float fetchVPNInfo;
    public float gEmmrt;
    public float[] gHZMYf;
    public float getFieldNames;
    public final int getNewProxyInstance;
    public double hDKMBd;
    public float[] isConnected;
    public float iwGUEr;
    public int sSMYrx;
    public final int uzCIH;
    public int valueOf;
    public double values;
    public float wlaJM;
    public float zLjUOn;
    public float zsXlph;
    public float zuBGHE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39807pzM(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.fARcdN = new java.util.ArrayList<>();
        this.fIwbmz = new java.util.ArrayList<>(50);
        this.AuCTel = new java.util.ArrayList<>();
        this.ejfBZ = C55298xhM.dp2px$default(30.0f, null, 1, null);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.djBIcL = C33508mxl.copydefault(context2);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.AwvSrB = C33508mxl.AEQbTJ(context3);
        int i = C52761wXj.ActionBar.swzYdv;
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        this.valueOf = C55366xib.KWHzl(i, context4);
        int i2 = C52761wXj.ActionBar.fLIjIY;
        android.content.Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        this.sSMYrx = C55366xib.KWHzl(i2, context5);
        float fSp2pxFloat$default = C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
        this.QOLQEE = fSp2pxFloat$default;
        this.getNewProxyInstance = C55298xhM.dp2px$default(6.0f, null, 1, null);
        this.uzCIH = C55298xhM.dp2px$default(20.0f, null, 1, null);
        this.EZpvd = 50;
        this.OLrzqt = "--";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.copydefault = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = this.copydefault;
        if (paint2 != null) {
            paint2.setTextSize(fSp2pxFloat$default);
        }
        android.graphics.Paint paint3 = this.copydefault;
        if (paint3 != null) {
            paint3.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        }
        android.graphics.Paint paint4 = this.copydefault;
        if (paint4 != null) {
            paint4.setColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        }
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.AEQbTJ = paint5;
        paint5.setAntiAlias(true);
        android.graphics.Paint paint6 = this.AEQbTJ;
        if (paint6 != null) {
            paint6.setTextSize(fSp2pxFloat$default);
        }
        android.graphics.Paint paint7 = this.AEQbTJ;
        if (paint7 != null) {
            paint7.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        }
        android.graphics.Paint paint8 = this.AEQbTJ;
        if (paint8 != null) {
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            paint8.setColor(C33508mxl.copydefault(context6));
        }
        this.AkhnZx = new float[50];
        this.AubY = new float[50];
        this.fJNWhG = new float[50];
        this.gHZMYf = new float[50];
        this.isConnected = new float[50];
        this.AuCTelauCTel = new float[50];
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.pzS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C39807pzM.copydefault(this.OLrzqt, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(250L);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        this.QbewEr = valueAnimatorOfFloat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39807pzM(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.fARcdN = new java.util.ArrayList<>();
        this.fIwbmz = new java.util.ArrayList<>(50);
        this.AuCTel = new java.util.ArrayList<>();
        this.ejfBZ = C55298xhM.dp2px$default(30.0f, null, 1, null);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.djBIcL = C33508mxl.copydefault(context2);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.AwvSrB = C33508mxl.AEQbTJ(context3);
        int i = C52761wXj.ActionBar.swzYdv;
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        this.valueOf = C55366xib.KWHzl(i, context4);
        int i2 = C52761wXj.ActionBar.fLIjIY;
        android.content.Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        this.sSMYrx = C55366xib.KWHzl(i2, context5);
        float fSp2pxFloat$default = C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
        this.QOLQEE = fSp2pxFloat$default;
        this.getNewProxyInstance = C55298xhM.dp2px$default(6.0f, null, 1, null);
        this.uzCIH = C55298xhM.dp2px$default(20.0f, null, 1, null);
        this.EZpvd = 50;
        this.OLrzqt = "--";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.copydefault = paint;
        paint.setAntiAlias(true);
        android.graphics.Paint paint2 = this.copydefault;
        if (paint2 != null) {
            paint2.setTextSize(fSp2pxFloat$default);
        }
        android.graphics.Paint paint3 = this.copydefault;
        if (paint3 != null) {
            paint3.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        }
        android.graphics.Paint paint4 = this.copydefault;
        if (paint4 != null) {
            paint4.setColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        }
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.AEQbTJ = paint5;
        paint5.setAntiAlias(true);
        android.graphics.Paint paint6 = this.AEQbTJ;
        if (paint6 != null) {
            paint6.setTextSize(fSp2pxFloat$default);
        }
        android.graphics.Paint paint7 = this.AEQbTJ;
        if (paint7 != null) {
            paint7.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_regular.ttf"));
        }
        android.graphics.Paint paint8 = this.AEQbTJ;
        if (paint8 != null) {
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            paint8.setColor(C33508mxl.copydefault(context6));
        }
        this.AkhnZx = new float[50];
        this.AubY = new float[50];
        this.fJNWhG = new float[50];
        this.gHZMYf = new float[50];
        this.isConnected = new float[50];
        this.AuCTelauCTel = new float[50];
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.pzS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C39807pzM.copydefault(this.OLrzqt, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(250L);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        this.QbewEr = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.ejfBZ * this.EZpvd);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.gEmmrt = (getWidth() >> 1) - this.getNewProxyInstance;
        this.zuBGHE = (getWidth() >> 1) + this.getNewProxyInstance;
        this.AxsJAY = getWidth();
        this.AhwBna = getWidth() >> 1;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float f = this.uzCIH;
        float f2 = f;
        float f3 = 0.0f;
        int i = 0;
        for (java.lang.Object obj : this.fARcdN) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            MarketDepthItem marketDepthItem = (MarketDepthItem) obj;
            if (C55296xhK.AEQbTJ(this)) {
                android.graphics.Paint paint = this.copydefault;
                if (paint != null) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                }
                android.graphics.Paint paint2 = this.AEQbTJ;
                if (paint2 != null) {
                    paint2.setTextAlign(Paint.Align.LEFT);
                }
                android.graphics.Paint paint3 = this.AEQbTJ;
                if (paint3 != null) {
                    paint3.setColor(this.valueOf);
                }
                android.graphics.Paint paint4 = this.AEQbTJ;
                if (paint4 != null) {
                    paint4.setAlpha(51);
                }
                if (this.QVAiDq) {
                    double d = this.hDKMBd;
                    if (d > AudioStats.AUDIO_AMPLITUDE_NONE) {
                        this.DTwDnp = (float) ((((double) this.AhwBna) / d) * ((double) marketDepthItem.getSellAmountInt()));
                        this.QKVWgx = (float) ((((double) this.AhwBna) / this.hDKMBd) * ((double) marketDepthItem.getBuyAmountInt()));
                        this.OcIXYQ = (float) ((((double) this.AhwBna) / this.values) * ((double) this.fIwbmz.get(i).getSellAmountInt()));
                        this.ORxRYg = (float) ((((double) this.AhwBna) / this.values) * ((double) this.fIwbmz.get(i).getBuyAmountInt()));
                    }
                    float f4 = this.AhwBna;
                    float f5 = f4 - this.DTwDnp;
                    this.iwGUEr = f5;
                    float f6 = this.QKVWgx + f4;
                    this.zsXlph = f6;
                    if (this.DbNXlk) {
                        float f7 = this.isConnected[i];
                        this.getFieldNames = f7;
                        float f8 = this.AuCTelauCTel[i];
                        this.zLjUOn = f8;
                        float f9 = f7 - f5;
                        this.fetchVPNInfo = f9;
                        float f10 = f8 - f6;
                        this.wlaJM = f10;
                        this.AkhnZx[i] = f9;
                        this.AubY[i] = f10;
                    } else {
                        float f11 = f4 - this.OcIXYQ;
                        this.getFieldNames = f11;
                        float f12 = f4 + this.ORxRYg;
                        this.zLjUOn = f12;
                        float f13 = f11 - f5;
                        this.fetchVPNInfo = f13;
                        float f14 = f12 - f6;
                        this.wlaJM = f14;
                        this.fJNWhG[i] = f11;
                        this.gHZMYf[i] = f12;
                        this.AkhnZx[i] = f13;
                        this.AubY[i] = f14;
                    }
                } else {
                    this.getFieldNames = this.fJNWhG[i];
                    this.zLjUOn = this.gHZMYf[i];
                    this.fetchVPNInfo = this.AkhnZx[i];
                    this.wlaJM = this.AubY[i];
                }
                float f15 = this.AhwBna;
                float f16 = this.zLjUOn;
                float f17 = this.wlaJM;
                float f18 = this.KWHzl;
                float f19 = this.ejfBZ;
                android.graphics.Paint paint5 = this.AEQbTJ;
                Intrinsics.copydefault(paint5);
                canvas.drawRect(f15, f3, f16 - (f17 * f18), f19 + f3, paint5);
                this.AuCTelauCTel[i] = this.zLjUOn - (this.wlaJM * this.KWHzl);
                java.lang.String buyAmount = C33129mqd.OLrzqt((java.lang.CharSequence) marketDepthItem.getBuyAmount()) ? marketDepthItem.getBuyAmount() : this.OLrzqt;
                float f20 = this.AxsJAY;
                android.graphics.Paint paint6 = this.copydefault;
                Intrinsics.copydefault(paint6);
                canvas.drawText(buyAmount, f20, f2, paint6);
                android.graphics.Paint paint7 = this.AEQbTJ;
                if (paint7 != null) {
                    paint7.setColor(this.djBIcL);
                }
                android.graphics.Paint paint8 = this.AEQbTJ;
                if (paint8 != null) {
                    paint8.setAlpha(255);
                }
                java.lang.String buyPrice = C33129mqd.OLrzqt((java.lang.CharSequence) marketDepthItem.getBuyPrice()) ? marketDepthItem.getBuyPrice() : this.OLrzqt;
                float f21 = this.zuBGHE;
                android.graphics.Paint paint9 = this.AEQbTJ;
                Intrinsics.copydefault(paint9);
                canvas.drawText(buyPrice, f21, f2, paint9);
                android.graphics.Paint paint10 = this.copydefault;
                if (paint10 != null) {
                    paint10.setTextAlign(Paint.Align.LEFT);
                }
                android.graphics.Paint paint11 = this.AEQbTJ;
                if (paint11 != null) {
                    paint11.setTextAlign(Paint.Align.RIGHT);
                }
                android.graphics.Paint paint12 = this.AEQbTJ;
                if (paint12 != null) {
                    paint12.setColor(this.sSMYrx);
                }
                android.graphics.Paint paint13 = this.AEQbTJ;
                if (paint13 != null) {
                    paint13.setAlpha(51);
                }
                float f22 = this.getFieldNames;
                float f23 = this.fetchVPNInfo;
                float f24 = this.KWHzl;
                float f25 = this.AhwBna;
                float f26 = this.ejfBZ;
                android.graphics.Paint paint14 = this.AEQbTJ;
                Intrinsics.copydefault(paint14);
                canvas.drawRect(f22 - (f23 * f24), f3, f25, f26 + f3, paint14);
                this.isConnected[i] = this.getFieldNames - (this.fetchVPNInfo * this.KWHzl);
                java.lang.String sellAmount = C33129mqd.OLrzqt((java.lang.CharSequence) marketDepthItem.getSellAmount()) ? marketDepthItem.getSellAmount() : this.OLrzqt;
                android.graphics.Paint paint15 = this.copydefault;
                Intrinsics.copydefault(paint15);
                canvas.drawText(sellAmount, 0.0f, f2, paint15);
                android.graphics.Paint paint16 = this.AEQbTJ;
                if (paint16 != null) {
                    paint16.setColor(this.AwvSrB);
                }
                android.graphics.Paint paint17 = this.AEQbTJ;
                if (paint17 != null) {
                    paint17.setAlpha(255);
                }
                java.lang.String sellPrice = C33129mqd.OLrzqt((java.lang.CharSequence) marketDepthItem.getSellPrice()) ? marketDepthItem.getSellPrice() : this.OLrzqt;
                float f27 = this.gEmmrt;
                android.graphics.Paint paint18 = this.AEQbTJ;
                Intrinsics.copydefault(paint18);
                canvas.drawText(sellPrice, f27, f2, paint18);
            } else {
                android.graphics.Paint paint19 = this.copydefault;
                if (paint19 != null) {
                    paint19.setTextAlign(Paint.Align.LEFT);
                }
                android.graphics.Paint paint20 = this.AEQbTJ;
                if (paint20 != null) {
                    paint20.setTextAlign(Paint.Align.RIGHT);
                }
                android.graphics.Paint paint21 = this.AEQbTJ;
                if (paint21 != null) {
                    paint21.setColor(this.valueOf);
                }
                android.graphics.Paint paint22 = this.AEQbTJ;
                if (paint22 != null) {
                    paint22.setAlpha(51);
                }
                if (this.QVAiDq) {
                    double d2 = this.hDKMBd;
                    if (d2 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                        this.DTwDnp = (float) ((((double) this.AhwBna) / d2) * ((double) marketDepthItem.getBuyAmountInt()));
                        this.QKVWgx = (float) ((((double) this.AhwBna) / this.hDKMBd) * ((double) marketDepthItem.getSellAmountInt()));
                        this.OcIXYQ = (float) ((((double) this.AhwBna) / this.values) * ((double) this.fIwbmz.get(i).getBuyAmountInt()));
                        this.ORxRYg = (float) ((((double) this.AhwBna) / this.values) * ((double) this.fIwbmz.get(i).getSellAmountInt()));
                    }
                    float f28 = this.AhwBna;
                    float f29 = f28 - this.DTwDnp;
                    this.iwGUEr = f29;
                    float f30 = this.QKVWgx + f28;
                    this.zsXlph = f30;
                    if (this.DbNXlk) {
                        float f31 = this.isConnected[i];
                        this.getFieldNames = f31;
                        float f32 = this.AuCTelauCTel[i];
                        this.zLjUOn = f32;
                        float f33 = f31 - f29;
                        this.fetchVPNInfo = f33;
                        float f34 = f32 - f30;
                        this.wlaJM = f34;
                        this.AkhnZx[i] = f33;
                        this.AubY[i] = f34;
                    } else {
                        float f35 = f28 - this.OcIXYQ;
                        this.getFieldNames = f35;
                        float f36 = f28 + this.ORxRYg;
                        this.zLjUOn = f36;
                        float f37 = f35 - f29;
                        this.fetchVPNInfo = f37;
                        float f38 = f36 - f30;
                        this.wlaJM = f38;
                        this.fJNWhG[i] = f35;
                        this.gHZMYf[i] = f36;
                        this.AkhnZx[i] = f37;
                        this.AubY[i] = f38;
                    }
                } else {
                    this.getFieldNames = this.fJNWhG[i];
                    this.zLjUOn = this.gHZMYf[i];
                    this.fetchVPNInfo = this.AkhnZx[i];
                    this.wlaJM = this.AubY[i];
                }
                float f39 = this.getFieldNames;
                float f40 = this.fetchVPNInfo;
                float f41 = this.KWHzl;
                float f42 = this.AhwBna;
                float f43 = this.ejfBZ;
                android.graphics.Paint paint23 = this.AEQbTJ;
                Intrinsics.copydefault(paint23);
                canvas.drawRect(f39 - (f40 * f41), f3, f42, f43 + f3, paint23);
                this.isConnected[i] = this.getFieldNames - (this.fetchVPNInfo * this.KWHzl);
                java.lang.String buyAmount2 = C33129mqd.OLrzqt((java.lang.CharSequence) marketDepthItem.getBuyAmount()) ? marketDepthItem.getBuyAmount() : this.OLrzqt;
                android.graphics.Paint paint24 = this.copydefault;
                Intrinsics.copydefault(paint24);
                canvas.drawText(buyAmount2, 0.0f, f2, paint24);
                android.graphics.Paint paint25 = this.AEQbTJ;
                if (paint25 != null) {
                    paint25.setColor(this.djBIcL);
                }
                android.graphics.Paint paint26 = this.AEQbTJ;
                if (paint26 != null) {
                    paint26.setAlpha(255);
                }
                java.lang.String buyPrice2 = C33129mqd.OLrzqt((java.lang.CharSequence) marketDepthItem.getBuyPrice()) ? marketDepthItem.getBuyPrice() : this.OLrzqt;
                float f44 = this.gEmmrt;
                android.graphics.Paint paint27 = this.AEQbTJ;
                Intrinsics.copydefault(paint27);
                canvas.drawText(buyPrice2, f44, f2, paint27);
                android.graphics.Paint paint28 = this.copydefault;
                if (paint28 != null) {
                    paint28.setTextAlign(Paint.Align.RIGHT);
                }
                android.graphics.Paint paint29 = this.AEQbTJ;
                if (paint29 != null) {
                    paint29.setTextAlign(Paint.Align.LEFT);
                }
                android.graphics.Paint paint30 = this.AEQbTJ;
                if (paint30 != null) {
                    paint30.setColor(this.AwvSrB);
                }
                android.graphics.Paint paint31 = this.AEQbTJ;
                if (paint31 != null) {
                    paint31.setAlpha(51);
                }
                float f45 = this.AhwBna;
                float f46 = this.zLjUOn;
                float f47 = this.wlaJM;
                float f48 = this.KWHzl;
                float f49 = this.ejfBZ;
                android.graphics.Paint paint32 = this.AEQbTJ;
                Intrinsics.copydefault(paint32);
                canvas.drawRect(f45, f3, f46 - (f47 * f48), f49 + f3, paint32);
                this.AuCTelauCTel[i] = this.zLjUOn - (this.wlaJM * this.KWHzl);
                java.lang.String sellAmount2 = C33129mqd.OLrzqt((java.lang.CharSequence) marketDepthItem.getSellAmount()) ? marketDepthItem.getSellAmount() : this.OLrzqt;
                float f50 = this.AxsJAY;
                android.graphics.Paint paint33 = this.copydefault;
                Intrinsics.copydefault(paint33);
                canvas.drawText(sellAmount2, f50, f2, paint33);
                android.graphics.Paint paint34 = this.AEQbTJ;
                if (paint34 != null) {
                    paint34.setAlpha(255);
                }
                java.lang.String sellPrice2 = C33129mqd.OLrzqt((java.lang.CharSequence) marketDepthItem.getSellPrice()) ? marketDepthItem.getSellPrice() : this.OLrzqt;
                float f51 = this.zuBGHE;
                android.graphics.Paint paint35 = this.AEQbTJ;
                Intrinsics.copydefault(paint35);
                canvas.drawText(sellPrice2, f51, f2, paint35);
            }
            float f52 = this.ejfBZ;
            f2 += f52;
            f3 += f52;
            i++;
        }
        this.DbNXlk = false;
        this.QVAiDq = false;
    }

    public static final void copydefault(C39807pzM c39807pzM, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        java.lang.Float f = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f != null) {
            c39807pzM.KWHzl = f.floatValue();
            c39807pzM.postInvalidate();
        }
    }

    public final void copydefault(@NotNull C37882pEe.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.AuCTel.clear();
        this.values = this.hDKMBd;
        this.hDKMBd = AudioStats.AUDIO_AMPLITUDE_NONE;
        int size = taskDescription.KWHzl().size();
        int size2 = taskDescription.OLrzqt().size();
        C56404yEc.zsXlph(taskDescription.KWHzl());
        int i = this.EZpvd;
        for (int i2 = 0; i2 < i; i2++) {
            this.AYXKKw = new MarketDepthItem(null, null, null, null, null, null, null, null, 0.0f, 0.0f, 1023, null);
            int i3 = (size - 1) - i2;
            MarketDepthItem marketDepthItem = null;
            if (i3 >= 0) {
                pAQ paq = taskDescription.KWHzl().get(i3);
                Intrinsics.checkNotNullExpressionValue(paq, "");
                pAQ paq2 = paq;
                MarketDepthItem marketDepthItem2 = this.AYXKKw;
                if (marketDepthItem2 == null) {
                    Intrinsics.gEmmrt("");
                    marketDepthItem2 = null;
                }
                marketDepthItem2.setSellId("1");
                MarketDepthItem marketDepthItem3 = this.AYXKKw;
                if (marketDepthItem3 == null) {
                    Intrinsics.gEmmrt("");
                    marketDepthItem3 = null;
                }
                marketDepthItem3.setSellPrice(paq2.KWHzl());
                MarketDepthItem marketDepthItem4 = this.AYXKKw;
                if (marketDepthItem4 == null) {
                    Intrinsics.gEmmrt("");
                    marketDepthItem4 = null;
                }
                marketDepthItem4.setSellAmount(paq2.AEQbTJ());
                MarketDepthItem marketDepthItem5 = this.AYXKKw;
                if (marketDepthItem5 == null) {
                    Intrinsics.gEmmrt("");
                    marketDepthItem5 = null;
                }
                marketDepthItem5.setSellAmountInt(C33129mqd.djBIcL(java.lang.Double.valueOf(paq2.OLrzqt())));
                if (this.hDKMBd < paq2.OLrzqt()) {
                    this.hDKMBd = paq2.OLrzqt();
                }
            }
            if (i2 < size2) {
                pAQ paq3 = taskDescription.OLrzqt().get(i2);
                Intrinsics.checkNotNullExpressionValue(paq3, "");
                pAQ paq4 = paq3;
                MarketDepthItem marketDepthItem6 = this.AYXKKw;
                if (marketDepthItem6 == null) {
                    Intrinsics.gEmmrt("");
                    marketDepthItem6 = null;
                }
                marketDepthItem6.setBuyId("2");
                MarketDepthItem marketDepthItem7 = this.AYXKKw;
                if (marketDepthItem7 == null) {
                    Intrinsics.gEmmrt("");
                    marketDepthItem7 = null;
                }
                marketDepthItem7.setBuyPrice(paq4.KWHzl());
                MarketDepthItem marketDepthItem8 = this.AYXKKw;
                if (marketDepthItem8 == null) {
                    Intrinsics.gEmmrt("");
                    marketDepthItem8 = null;
                }
                marketDepthItem8.setBuyAmount(paq4.AEQbTJ());
                MarketDepthItem marketDepthItem9 = this.AYXKKw;
                if (marketDepthItem9 == null) {
                    Intrinsics.gEmmrt("");
                    marketDepthItem9 = null;
                }
                marketDepthItem9.setBuyAmountInt(C33129mqd.djBIcL(java.lang.Double.valueOf(paq4.OLrzqt())));
                if (this.hDKMBd < paq4.OLrzqt()) {
                    this.hDKMBd = paq4.OLrzqt();
                }
            }
            java.util.ArrayList<MarketDepthItem> arrayList = this.AuCTel;
            MarketDepthItem marketDepthItem10 = this.AYXKKw;
            if (marketDepthItem10 == null) {
                Intrinsics.gEmmrt("");
            } else {
                marketDepthItem = marketDepthItem10;
            }
            arrayList.add(marketDepthItem);
        }
        if (this.fARcdN.isEmpty()) {
            java.lang.Object objClone = this.AuCTel.clone();
            Intrinsics.copydefault(objClone, "");
            java.util.ArrayList<MarketDepthItem> arrayList2 = (java.util.ArrayList) objClone;
            this.fIwbmz = arrayList2;
            for (MarketDepthItem marketDepthItem11 : arrayList2) {
                marketDepthItem11.setBuyAmountInt(0.0f);
                marketDepthItem11.setSellAmountInt(0.0f);
            }
        } else {
            this.fIwbmz = this.fARcdN;
        }
        java.lang.Object objClone2 = this.AuCTel.clone();
        Intrinsics.copydefault(objClone2, "");
        this.fARcdN = (java.util.ArrayList) objClone2;
        if (!this.QbewEr.isRunning()) {
            this.QVAiDq = true;
            this.DbNXlk = false;
            this.QbewEr.start();
        } else {
            this.QbewEr.cancel();
            this.DbNXlk = true;
            this.QVAiDq = true;
            this.QbewEr.start();
        }
    }
}
