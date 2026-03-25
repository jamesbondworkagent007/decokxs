package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;

/* JADX INFO: renamed from: o.wVm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52710wVm extends android.widget.LinearLayout {
    public final int AEQbTJ;
    public final int AYXKKw;
    public android.widget.TextView EZpvd;
    public android.widget.TextView KWHzl;
    public final int OLrzqt;
    public C52710wVm copydefault;
    public final int djBIcL;
    public android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpponentInstrumentView(C52710wVm c52710wVm) {
        this.copydefault = c52710wVm;
    }

    public C52710wVm(android.content.Context context) {
        super(context);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.AYXKKw = C33512mxp.tradeRiseTagContent$default(c33512mxp, context2, 0.0f, 2, null);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.djBIcL = C33512mxp.tradeRiseTagFill$default(c33512mxp, context3, 0.0f, 2, null);
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        this.AEQbTJ = C33512mxp.tradeFallTagContent$default(c33512mxp, context4, 0.0f, 2, null);
        android.content.Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        this.OLrzqt = C33512mxp.tradeFallTagFill$default(c33512mxp, context5, 0.0f, 2, null);
        if (context != null) {
            EZpvd(context);
        }
    }

    public C52710wVm(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.AYXKKw = C33512mxp.tradeRiseTagContent$default(c33512mxp, context2, 0.0f, 2, null);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.djBIcL = C33512mxp.tradeRiseTagFill$default(c33512mxp, context3, 0.0f, 2, null);
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        this.AEQbTJ = C33512mxp.tradeFallTagContent$default(c33512mxp, context4, 0.0f, 2, null);
        android.content.Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        this.OLrzqt = C33512mxp.tradeFallTagFill$default(c33512mxp, context5, 0.0f, 2, null);
        if (context != null) {
            EZpvd(context);
        }
    }

    public C52710wVm(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.AYXKKw = C33512mxp.tradeRiseTagContent$default(c33512mxp, context2, 0.0f, 2, null);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.djBIcL = C33512mxp.tradeRiseTagFill$default(c33512mxp, context3, 0.0f, 2, null);
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        this.AEQbTJ = C33512mxp.tradeFallTagContent$default(c33512mxp, context4, 0.0f, 2, null);
        android.content.Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        this.OLrzqt = C33512mxp.tradeFallTagFill$default(c33512mxp, context5, 0.0f, 2, null);
        if (context != null) {
            EZpvd(context);
        }
    }

    public final void EZpvd(android.content.Context context) {
        android.view.View.inflate(context, C48033uCm.Activity.registerUser, this);
        this.KWHzl = (android.widget.TextView) findViewById(C48033uCm.Application.checkCloseActionMenu);
        this.gEmmrt = (android.widget.TextView) findViewById(C48033uCm.Application.onNothingSelected);
        this.EZpvd = (android.widget.TextView) findViewById(C48033uCm.Application.onActionItemClicked);
    }

    public final void setDirection(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy")) {
            android.widget.TextView textView = this.KWHzl;
            if (textView != null) {
                textView.setText(C33070mpX.AYXKKw(C55688xof.Application.getMaxVolume));
            }
            android.widget.TextView textView2 = this.KWHzl;
            if (textView2 != null) {
                textView2.setTextColor(this.AYXKKw);
            }
            android.widget.TextView textView3 = this.KWHzl;
            if (textView3 != null) {
                textView3.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.djBIcL));
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "sell")) {
            android.widget.TextView textView4 = this.KWHzl;
            if (textView4 != null) {
                textView4.setText(C33070mpX.AYXKKw(C55688xof.Application.getVolumeControl));
            }
            android.widget.TextView textView5 = this.KWHzl;
            if (textView5 != null) {
                textView5.setTextColor(this.AEQbTJ);
            }
            android.widget.TextView textView6 = this.KWHzl;
            if (textView6 != null) {
                textView6.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.OLrzqt));
            }
        } else {
            android.widget.TextView textView7 = this.KWHzl;
            if (textView7 != null) {
                textView7.setText("");
            }
            android.widget.TextView textView8 = this.KWHzl;
            if (textView8 != null) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                textView8.setTextColor(C33512mxp.tradeFallTagContent$default(c33512mxp, context, 0.0f, 2, null));
            }
            android.widget.TextView textView9 = this.KWHzl;
            if (textView9 != null) {
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                textView9.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33512mxp.tradeFallTagFill$default(c33512mxp2, context2, 0.0f, 2, null)));
            }
        }
        android.widget.TextView textView10 = this.KWHzl;
        if (textView10 != null) {
            textView10.post(new java.lang.Runnable() { // from class: o.wVn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C52710wVm.OLrzqt(this.EZpvd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(C52710wVm c52710wVm) {
        C52710wVm c52710wVm2 = c52710wVm.copydefault;
        java.lang.Integer numAEQbTJ = c52710wVm2 != null ? c52710wVm2.AEQbTJ() : null;
        java.lang.Integer numAEQbTJ2 = c52710wVm.AEQbTJ();
        if (C33129mqd.OLrzqt(numAEQbTJ, numAEQbTJ2)) {
            return;
        }
        if (C33129mqd.AEQbTJ(numAEQbTJ, numAEQbTJ2)) {
            c52710wVm.EZpvd(numAEQbTJ);
            return;
        }
        C52710wVm c52710wVm3 = c52710wVm.copydefault;
        if (c52710wVm3 != null) {
            c52710wVm3.EZpvd(numAEQbTJ2);
        }
    }

    public final void setTitle(java.lang.String str) {
        android.widget.TextView textView = this.gEmmrt;
        if (textView != null) {
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
    }

    public final void setMargin(java.lang.String str) {
        android.widget.TextView textView;
        int i;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            textView = this.EZpvd;
            if (textView != null) {
                i = 8;
                textView.setVisibility(i);
            }
        } else {
            textView = this.EZpvd;
            if (textView != null) {
                i = 0;
                textView.setVisibility(i);
            }
        }
        android.widget.TextView textView2 = this.EZpvd;
        if (textView2 != null) {
            if (str == null) {
                str = "";
            }
            textView2.setText(str);
        }
    }

    public final java.lang.Integer AEQbTJ() {
        android.widget.TextView textView = this.KWHzl;
        if (textView != null) {
            return java.lang.Integer.valueOf(textView.getWidth());
        }
        return null;
    }

    public final void EZpvd(java.lang.Integer num) {
        if (num != null) {
            num.intValue();
            android.widget.TextView textView = this.KWHzl;
            if (textView != null) {
                textView.setWidth(num.intValue());
            }
        }
    }
}
