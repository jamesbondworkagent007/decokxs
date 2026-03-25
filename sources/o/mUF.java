package o;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.okinc.dexkline.dexui.main.market.widget.CornerRadiusPosition;
import com.okinc.dexkline.dexui.main.market.widget.TransactionStates;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mUF extends android.widget.LinearLayout {
    public final android.view.View AEQbTJ;
    public final int EZpvd;
    public final android.view.View KWHzl;
    public final android.view.View copydefault;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionStates.values().length];
            try {
                iArr[TransactionStates.NO_TRANSACTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionStates.SINGLE_TRANSACTION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionStates.DOUBLE_TRANSACTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[CornerRadiusPosition.values().length];
            try {
                iArr2[CornerRadiusPosition.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[CornerRadiusPosition.START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[CornerRadiusPosition.END.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mUF(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:23) call: o.mUF.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ mUF(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mUF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View view = new android.view.View(context);
        this.KWHzl = view;
        android.view.View view2 = new android.view.View(context);
        this.copydefault = view2;
        android.view.View view3 = new android.view.View(context);
        this.AEQbTJ = view3;
        int iEZpvd = mUM.EZpvd(context, C52761wXj.Activity.invokespecialDPHOMC);
        this.EZpvd = iEZpvd;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, C55298xhM.copydefault(4.0f, context), 4.0f);
        layoutParams.setMarginEnd(C55298xhM.dp2px$default(2.0f, null, 1, null));
        view.setLayoutParams(layoutParams);
        AEQbTJ("0");
        view2.setLayoutParams(new LinearLayout.LayoutParams(0, C55298xhM.copydefault(4.0f, context), 2.0f));
        EZpvd("");
        view3.setLayoutParams(new LinearLayout.LayoutParams(0, C55298xhM.copydefault(4.0f, context), 4.0f));
        EZpvd(iEZpvd, CornerRadiusPosition.DEFAULT);
        view3.setVisibility(8);
        addView(view);
        addView(view2);
        addView(view3);
    }

    public final void KWHzl(double d, double d2) {
        mUH muhCopydefault = copydefault(d, d2);
        float fAEQbTJ = muhCopydefault.AEQbTJ();
        float fCopydefault = muhCopydefault.copydefault();
        int i = TaskDescription.OLrzqt[TransactionStates.Companion.OLrzqt(fAEQbTJ, fCopydefault).ordinal()];
        if (i == 1) {
            this.KWHzl.setVisibility(8);
            this.copydefault.setVisibility(8);
            this.AEQbTJ.setVisibility(0);
            this.AEQbTJ.setBackground(EZpvd(this.EZpvd, CornerRadiusPosition.DEFAULT));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.KWHzl.setVisibility(0);
            this.copydefault.setVisibility(0);
            this.AEQbTJ.setVisibility(8);
            android.view.View view = this.KWHzl;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (mRE.AYXKKw(java.lang.Double.valueOf(mRE.mulCheckD$default(java.lang.Float.valueOf(fAEQbTJ), 100, null, null, null, 14, null)), 1)) {
                fAEQbTJ = 0.01f;
            }
            layoutParams2.weight = fAEQbTJ;
            view.setLayoutParams(layoutParams2);
            android.view.View view2 = this.copydefault;
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            Intrinsics.copydefault(layoutParams3, "");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            if (mRE.AYXKKw(java.lang.Double.valueOf(mRE.mulCheckD$default(java.lang.Float.valueOf(fCopydefault), 100, null, null, null, 14, null)), 1)) {
                fCopydefault = 0.01f;
            }
            layoutParams4.weight = fCopydefault;
            view2.setLayoutParams(layoutParams4);
            this.KWHzl.setBackground(AEQbTJ(C33129mqd.gEmmrt(java.lang.Double.valueOf(d))));
            this.copydefault.setBackground(EZpvd(C33129mqd.gEmmrt(java.lang.Double.valueOf(d2))));
            return;
        }
        if (fAEQbTJ != 0.0f) {
            this.copydefault.setVisibility(8);
            this.KWHzl.setVisibility(0);
            this.AEQbTJ.setVisibility(8);
            android.view.View view3 = this.KWHzl;
            ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
            Intrinsics.copydefault(layoutParams5, "");
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
            layoutParams6.weight = fAEQbTJ;
            view3.setLayoutParams(layoutParams6);
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.KWHzl.setBackground(EZpvd(C33512mxp.tradeRiseGraph$default(c33512mxp, mUM.KWHzl(context), 0.0f, 2, null), CornerRadiusPosition.DEFAULT));
        }
        if (fCopydefault == 0.0f) {
            return;
        }
        this.KWHzl.setVisibility(8);
        this.copydefault.setVisibility(0);
        this.AEQbTJ.setVisibility(8);
        android.view.View view4 = this.copydefault;
        ViewGroup.LayoutParams layoutParams7 = view4.getLayoutParams();
        Intrinsics.copydefault(layoutParams7, "");
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.weight = fCopydefault;
        view4.setLayoutParams(layoutParams8);
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.copydefault.setBackground(EZpvd(C33512mxp.tradeFallGraph$default(c33512mxp2, mUM.KWHzl(context2), 0.0f, 2, null), CornerRadiusPosition.DEFAULT));
    }

    public final mUH copydefault(double d, double d2) {
        if (!mRE.copydefault(java.lang.Double.valueOf(d), 0) || !mRE.valueOf(java.lang.Double.valueOf(d2), 0)) {
            if (!mRE.valueOf(java.lang.Double.valueOf(d), 0) || !mRE.copydefault(java.lang.Double.valueOf(d2), 0)) {
                if (mRE.copydefault(java.lang.Double.valueOf(d), 0)) {
                    return new mUH(0.0f, 0.0f);
                }
                double dAddCheckD$default = mRE.addCheckD$default(java.lang.Double.valueOf(d), java.lang.Double.valueOf(d2), null, null, null, 14, null);
                return new mUH(C33129mqd.djBIcL(java.lang.Double.valueOf(mRE.divCheckD$default(java.lang.Double.valueOf(d), java.lang.Double.valueOf(dAddCheckD$default), null, null, null, 14, null))), C33129mqd.djBIcL(java.lang.Double.valueOf(mRE.divCheckD$default(java.lang.Double.valueOf(d2), java.lang.Double.valueOf(dAddCheckD$default), null, null, null, 14, null))));
            }
            return new mUH(1.0f, 0.0f);
        }
        return new mUH(0.0f, 1.0f);
    }

    public final GradientDrawable EZpvd(int i, CornerRadiusPosition cornerRadiusPosition) {
        float[] fArr;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        int i2 = TaskDescription.KWHzl[cornerRadiusPosition.ordinal()];
        if (i2 == 1) {
            fArr = new float[]{8.0f, 8.0f, 8.0f, 8.0f, 8.0f, 8.0f, 8.0f, 8.0f};
        } else if (i2 == 2) {
            fArr = new float[]{8.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f};
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fArr = new float[]{0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f, 0.0f, 0.0f};
        }
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    public final GradientDrawable AEQbTJ(java.lang.String str) {
        if (C55296xhK.AEQbTJ(this)) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return EZpvd(mUG.copydefault(context, str), CornerRadiusPosition.END);
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return EZpvd(mUG.copydefault(context2, str), CornerRadiusPosition.START);
    }

    public final GradientDrawable EZpvd(java.lang.String str) {
        if (C55296xhK.AEQbTJ(this)) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return EZpvd(mUG.AEQbTJ(context, str), CornerRadiusPosition.START);
        }
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return EZpvd(mUG.AEQbTJ(context2, str), CornerRadiusPosition.END);
    }
}
