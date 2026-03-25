package o;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55021xcA extends android.widget.RelativeLayout {
    public int AYXKKw;
    public android.view.View AhwBna;
    public android.view.View AkhnZx;
    public int DbNXlk;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public final C54955xao copydefault;
    public int djBIcL;
    public int ejfBZ;
    public int fetchVPNInfo;
    public int gEmmrt;
    public int isConnected;
    public float valueOf;
    public int values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55021xcA(@NotNull android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55021xcA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55021xcA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int, int):void (m)] (LINE:50) call: o.xcA.<init>(android.content.Context, android.util.AttributeSet, int, int):void type: THIS */
    public /* synthetic */ C55021xcA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55021xcA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        C54955xao c54955xaoEZpvd = C54955xao.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54955xaoEZpvd, "");
        this.copydefault = c54955xaoEZpvd;
        this.isConnected = C55298xhM.KWHzl(16.0f, context);
        this.fetchVPNInfo = C55298xhM.OLrzqt(20, context);
        this.values = C55298xhM.OLrzqt(24, context);
        this.valueOf = 0.5f;
        int[] iArr = C52761wXj.PictureInPictureParams.ROgMPW;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int i3 = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.DPHOMC, 0);
        this.gEmmrt = i3;
        setCryptoCellStyle(i3);
        int i4 = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.invokespecialsiEkQe, 0);
        this.djBIcL = i4;
        setCryptoStyle(i4);
        int i5 = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.DaTmkG, 0);
        this.EZpvd = i5;
        setChangeMainTitleStyle(i5);
        this.ejfBZ = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.ODCBUN, 0);
        typedArrayObtainStyledAttributes.recycle();
        TextViewCompat.setLineHeight(c54955xaoEZpvd.valueOf, C55298xhM.OLrzqt(20, context));
        TextViewCompat.setLineHeight(c54955xaoEZpvd.djBIcL, C55298xhM.OLrzqt(16, context));
        OLrzqt();
        fetchVPNInfo();
    }

    public final android.widget.RelativeLayout copydefault() {
        android.widget.RelativeLayout relativeLayout = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        return relativeLayout;
    }

    public final android.widget.TextView AkhnZx() {
        android.widget.TextView textView = this.copydefault.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final C55389xiy gEmmrt() {
        C55389xiy c55389xiy = this.copydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55389xiy, "");
        return c55389xiy;
    }

    public final C55070xcx valueOf() {
        C55070xcx c55070xcx = this.copydefault.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55070xcx, "");
        return c55070xcx;
    }

    public final android.widget.TextView KWHzl() {
        MaterialTextView materialTextView = this.copydefault.djBIcL;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        return materialTextView;
    }

    public final android.widget.LinearLayout AhwBna() {
        android.widget.LinearLayout linearLayout = this.copydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public final android.widget.TextView AYXKKw() {
        MaterialTextView materialTextView = this.copydefault.values;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        return materialTextView;
    }

    public final android.widget.TextView values() {
        MaterialTextView materialTextView = this.copydefault.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        return materialTextView;
    }

    public final C55071xcy AEQbTJ() {
        C55071xcy c55071xcy = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55071xcy, "");
        return c55071xcy;
    }

    public final android.widget.TextView EZpvd() {
        MaterialTextView materialTextView = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        return materialTextView;
    }

    public final void setCryptoExtraView(android.view.View view) {
        this.AhwBna = view;
        if (view == null) {
            this.copydefault.valueOf.setEndDrawable(null);
        } else {
            this.copydefault.valueOf.setEndDrawable(view != null ? C55296xhK.viewToDrawable$default(view, 0, 0, 3, null) : null);
            requestLayout();
        }
    }

    public final void setPriceExtraView(android.view.View view) {
        this.AkhnZx = view;
        if (view == null) {
            android.widget.RelativeLayout relativeLayout = this.copydefault.AkhnZx;
            relativeLayout.removeAllViews();
            Intrinsics.copydefault(relativeLayout);
            relativeLayout.setVisibility(8);
            Intrinsics.copydefault(relativeLayout);
            return;
        }
        if ((view != null ? view.getParent() : null) != null) {
            android.view.View view2 = this.AkhnZx;
            android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).removeView(this.AkhnZx);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        android.widget.RelativeLayout relativeLayout2 = this.copydefault.AkhnZx;
        relativeLayout2.addView(view);
        C55296xhK.EZpvd(view, C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null));
        Intrinsics.copydefault(relativeLayout2);
        relativeLayout2.setVisibility(0);
        this.fetchVPNInfo = view.getMeasuredHeight();
    }

    public static /* synthetic */ void setCryptoCellStyle$default(C55021xcA c55021xcA, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        c55021xcA.setCryptoCellStyle(i);
    }

    public final void setCryptoCellStyle(int i) {
        this.gEmmrt = i;
        if (i == 0) {
            C54955xao c54955xao = this.copydefault;
            c54955xao.gEmmrt.setVisibility(0);
            c54955xao.EZpvd.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.copydefault.gEmmrt.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).removeRule(21);
            }
            android.content.res.Resources resources = getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            int iEZpvd = C55302xhQ.EZpvd(resources);
            int i2 = this.values;
            int i3 = this.isConnected;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(16, context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            this.OLrzqt = (((iEZpvd - i2) - i3) - iOLrzqt) - C55298xhM.OLrzqt(84, context2);
            setCryptoAndPriceWidthByRatio(this.valueOf, false);
        } else if (i == 1) {
            C54955xao c54955xao2 = this.copydefault;
            c54955xao2.gEmmrt.setVisibility(0);
            c54955xao2.EZpvd.setVisibility(8);
            android.content.res.Resources resources2 = getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            int iEZpvd2 = C55302xhQ.EZpvd(resources2);
            int i4 = this.isConnected;
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            this.OLrzqt = (iEZpvd2 - i4) - C55298xhM.OLrzqt(16, context3);
            setCryptoAndPriceWidthByRatio(this.valueOf, false);
        } else if (i == 2) {
            C54955xao c54955xao3 = this.copydefault;
            c54955xao3.gEmmrt.setVisibility(8);
            c54955xao3.EZpvd.setVisibility(0);
            android.content.res.Resources resources3 = getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "");
            int iEZpvd3 = C55302xhQ.EZpvd(resources3);
            int i5 = this.values;
            int i6 = this.isConnected;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            int iOLrzqt2 = C55298xhM.OLrzqt(16, context4);
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            this.OLrzqt = (((iEZpvd3 - i5) - i6) - iOLrzqt2) - C55298xhM.OLrzqt(84, context5);
            setCryptoAndPriceWidthByRatio(1.0f, false);
        }
        requestLayout();
    }

    public static /* synthetic */ void setCryptoStyle$default(C55021xcA c55021xcA, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        c55021xcA.setCryptoStyle(i);
    }

    public final void setCryptoStyle(int i) {
        int iOLrzqt;
        this.djBIcL = i;
        android.widget.LinearLayout linearLayout = this.copydefault.KWHzl;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (this.djBIcL == 0) {
                iOLrzqt = 0;
            } else {
                android.content.Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iOLrzqt = C55298xhM.OLrzqt(12, context);
            }
            marginLayoutParams.setMarginEnd(iOLrzqt);
        }
        linearLayout.setLayoutParams(layoutParams);
        int i2 = this.djBIcL;
        if (i2 == 0) {
            this.copydefault.KWHzl.setVisibility(8);
        } else if (i2 == 1) {
            C54955xao c54955xao = this.copydefault;
            c54955xao.KWHzl.setVisibility(0);
            c54955xao.fetchVPNInfo.setVisibility(8);
            c54955xao.AYXKKw.setVisibility(0);
        } else if (i2 == 2) {
            C54955xao c54955xao2 = this.copydefault;
            c54955xao2.KWHzl.setVisibility(0);
            c54955xao2.fetchVPNInfo.setVisibility(0);
            c54955xao2.AYXKKw.setVisibility(8);
        }
        fetchVPNInfo();
        requestLayout();
    }

    public static /* synthetic */ void setChangeMainTitleStyle$default(C55021xcA c55021xcA, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        c55021xcA.setChangeMainTitleStyle(i);
    }

    public final void setChangeMainTitleStyle(int i) {
        this.EZpvd = i;
        this.copydefault.OLrzqt.setStyle(i);
        requestLayout();
    }

    public static /* synthetic */ void setCryptoText$default(C55021xcA c55021xcA, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charSequence = "";
        }
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        c55021xcA.setCryptoText(charSequence, charSequence2);
    }

    public final void setCryptoText(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if (!android.text.TextUtils.isEmpty(charSequence2)) {
            android.text.TextPaint paint = valueOf().getPaint();
            float fMeasureText = paint.measureText(((java.lang.Object) charSequence) + " / ");
            float textSize = paint.getTextSize();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            paint.setTextSize(C55298xhM.EZpvd(12.0f, context));
            float fMeasureText2 = paint.measureText(java.lang.String.valueOf(charSequence2));
            paint.setTextSize(textSize);
            valueOf().setTextWidth(fMeasureText + fMeasureText2);
        } else {
            valueOf().setTextWidth(valueOf().getPaint().measureText(java.lang.String.valueOf(charSequence)));
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        OLrzqt(charSequence, charSequence2);
    }

    public static /* synthetic */ void setPriceVisibility$default(C55021xcA c55021xcA, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c55021xcA.setPriceVisibility(z);
    }

    public final void setPriceVisibility(boolean z) {
        android.widget.LinearLayout linearLayout = this.copydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public static /* synthetic */ void setChangeVisibility$default(C55021xcA c55021xcA, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c55021xcA.setChangeVisibility(z);
    }

    public final void setChangeVisibility(boolean z) {
        android.widget.LinearLayout linearLayout = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public static /* synthetic */ void setMarginBetweenPriceAndChange$default(C55021xcA c55021xcA, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            android.content.Context context = c55021xcA.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = C55298xhM.OLrzqt(24, context);
        }
        c55021xcA.setMarginBetweenPriceAndChange(i);
    }

    public final void setMarginBetweenPriceAndChange(int i) {
        this.values = i;
        ViewGroup.LayoutParams layoutParams = this.copydefault.EZpvd.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(i);
        }
        requestLayout();
    }

    public final void setCryptoAndPriceWidthByRatio(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        setCryptoAndPriceWidthByRatio(f, true);
    }

    public static /* synthetic */ void setCryptoAndPriceWidthByRatio$default(C55021xcA c55021xcA, float f, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c55021xcA.setCryptoAndPriceWidthByRatio(f, z);
    }

    public final void setCryptoAndPriceWidthByRatio(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f, boolean z) {
        if (z) {
            this.valueOf = f;
        }
        this.AYXKKw = (int) (this.OLrzqt * f);
        ViewGroup.LayoutParams layoutParams = copydefault().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.AYXKKw;
        }
        this.DbNXlk = (int) (this.OLrzqt * (1.0f - f));
        ViewGroup.LayoutParams layoutParams2 = AhwBna().getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = this.DbNXlk;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        C54955xao c54955xao = this.copydefault;
        android.widget.LinearLayout linearLayout = c54955xao.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(android.text.TextUtils.isEmpty(c54955xao.valueOf.getText()) ^ true ? 0 : 8);
        MaterialTextView materialTextView = c54955xao.djBIcL;
        Intrinsics.checkNotNullExpressionValue(materialTextView, "");
        materialTextView.setVisibility(android.text.TextUtils.isEmpty(c54955xao.djBIcL.getText()) ^ true ? 0 : 8);
        MaterialTextView materialTextView2 = c54955xao.values;
        Intrinsics.checkNotNullExpressionValue(materialTextView2, "");
        materialTextView2.setVisibility(android.text.TextUtils.isEmpty(c54955xao.values.getText()) ^ true ? 0 : 8);
        MaterialTextView materialTextView3 = c54955xao.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(materialTextView3, "");
        materialTextView3.setVisibility(android.text.TextUtils.isEmpty(c54955xao.DbNXlk.getText()) ^ true ? 0 : 8);
        C55071xcy c55071xcy = c54955xao.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55071xcy, "");
        c55071xcy.setVisibility(android.text.TextUtils.isEmpty(c54955xao.OLrzqt.getText()) ^ true ? 0 : 8);
        MaterialTextView materialTextView4 = c54955xao.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(materialTextView4, "");
        materialTextView4.setVisibility(android.text.TextUtils.isEmpty(c54955xao.AEQbTJ.getText()) ^ true ? 0 : 8);
        if (this.copydefault.EZpvd.getVisibility() == 8) {
            ViewGroup.LayoutParams layoutParams = this.copydefault.gEmmrt.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).addRule(21, -1);
            }
            if (android.text.TextUtils.isEmpty(AYXKKw().getText()) && android.text.TextUtils.isEmpty(values().getText())) {
                layoutParams.height = this.fetchVPNInfo;
            }
        }
        super.onMeasure(i, i2);
        isConnected();
    }

    public final void OLrzqt() {
        int i = this.ejfBZ == 1 ? 14 : 16;
        this.copydefault.valueOf.setTextSize(i);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this.copydefault.values, 12, i, 2, 2);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this.copydefault.OLrzqt, 12, i, 2, 2);
    }

    public final void fetchVPNInfo() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iEZpvd = new C52771wXt(context).EZpvd();
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt = C55298xhM.OLrzqt(8, context2);
        this.copydefault.getRoot().setPaddingRelative(iEZpvd, iOLrzqt, iEZpvd, iOLrzqt);
        this.copydefault.KWHzl.setVisibility(0);
        int i = this.djBIcL;
        if (i == 0) {
            this.copydefault.KWHzl.setVisibility(8);
            return;
        }
        if (i == 1) {
            C54955xao c54955xao = this.copydefault;
            c54955xao.KWHzl.setVisibility(0);
            c54955xao.AYXKKw.setVisibility(0);
            c54955xao.fetchVPNInfo.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = c54955xao.KWHzl.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C55298xhM.OLrzqt(12, context3));
            }
            this.copydefault.KWHzl.setLayoutParams(layoutParams);
            return;
        }
        C54955xao c54955xao2 = this.copydefault;
        c54955xao2.KWHzl.setVisibility(0);
        c54955xao2.AYXKKw.setVisibility(8);
        c54955xao2.fetchVPNInfo.setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = c54955xao2.KWHzl.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(C55298xhM.OLrzqt(4, context4));
        }
        c54955xao2.KWHzl.setLayoutParams(layoutParams2);
        android.content.Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        this.isConnected = C55298xhM.OLrzqt(8, context5);
        this.copydefault.getRoot().setPaddingRelative(iEZpvd, iOLrzqt, iEZpvd, iOLrzqt);
        requestLayout();
    }

    public static /* synthetic */ void generateTitleText$default(C55021xcA c55021xcA, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charSequence = "";
        }
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        c55021xcA.OLrzqt(charSequence, charSequence2);
    }

    public final void OLrzqt(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        boolean z = android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1;
        java.lang.String str = z ? " \\ " : " / ";
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (z && !android.text.TextUtils.isEmpty(charSequence2)) {
            EZpvd(spannableStringBuilder, charSequence, charSequence2, str);
        } else if (!android.text.TextUtils.isEmpty(charSequence2)) {
            KWHzl(spannableStringBuilder, charSequence, charSequence2, str);
        } else {
            KWHzl(spannableStringBuilder, charSequence);
        }
        this.copydefault.valueOf.setText(spannableStringBuilder);
    }

    public final void EZpvd(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str) {
        EZpvd(spannableStringBuilder, charSequence2);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        int length2 = spannableStringBuilder.length();
        KWHzl(spannableStringBuilder, charSequence);
        EZpvd(spannableStringBuilder, length, length2);
    }

    public final void KWHzl(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str) {
        KWHzl(spannableStringBuilder, charSequence);
        spannableStringBuilder.append((java.lang.CharSequence) str);
        EZpvd(spannableStringBuilder, charSequence2);
    }

    public final void KWHzl(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.CharSequence charSequence) {
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan(this.ejfBZ == 1 ? 14 : 16, true), spannableStringBuilder.length() - charSequence.length(), spannableStringBuilder.length(), 33);
    }

    public final void EZpvd(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.CharSequence charSequence) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(getContext(), C52761wXj.Activity.aappFQ)), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan(12, true), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.gGvvIC), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new TaskDescription(ContextCompat.getColor(getContext(), C52761wXj.Activity.aappFQ)), length, spannableStringBuilder.length(), 33);
    }

    public final void EZpvd(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(getContext(), C52761wXj.Activity.aappFQ)), i, i2, 33);
    }

    public final void isConnected() {
        int measuredWidth = this.AYXKKw - this.copydefault.KWHzl.getMeasuredWidth();
        this.KWHzl = measuredWidth;
        if (this.djBIcL != 0) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.KWHzl = measuredWidth - C55298xhM.OLrzqt(12, context);
        }
        valueOf().setMaxWidth(this.KWHzl);
    }

    /* JADX INFO: renamed from: o.xcA$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xcA.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.xcA$TaskDescription */
    public static final class TaskDescription extends android.text.style.ReplacementSpan {
        public final int AEQbTJ;
        public int EZpvd = -1;

        public TaskDescription(int i) {
            this.AEQbTJ = i;
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NotNull android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            Intrinsics.checkNotNullParameter(paint, "");
            return yII.EZpvd(EZpvd(paint).measureText(charSequence, i, i2));
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NotNull android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull android.graphics.Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(paint, "");
            android.text.TextPaint textPaintEZpvd = EZpvd(paint);
            Paint.FontMetricsInt fontMetricsInt = textPaintEZpvd.getFontMetricsInt();
            Intrinsics.checkNotNullExpressionValue(fontMetricsInt, "");
            int color = paint.getColor();
            textPaintEZpvd.setColor(this.AEQbTJ);
            textPaintEZpvd.setTypeface(C55051xce.OLrzqt.valueOf());
            int i6 = (((i4 + fontMetricsInt.ascent) + i4) + fontMetricsInt.descent) / 2;
            int i7 = (i3 + i5) / 2;
            if (charSequence != null) {
                canvas.drawText(charSequence, i, i2, f, (i4 - (i6 - i7)) + 3, textPaintEZpvd);
            }
            paint.setColor(color);
        }

        public final android.text.TextPaint EZpvd(android.graphics.Paint paint) {
            android.text.TextPaint textPaint = new android.text.TextPaint(paint);
            int i = this.EZpvd;
            if (i != -1) {
                textPaint.setTextSize(i * textPaint.density);
            }
            return textPaint;
        }
    }
}
