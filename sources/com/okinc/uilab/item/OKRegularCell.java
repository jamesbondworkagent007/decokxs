package com.okinc.uilab.item;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StyleRes;
import androidx.core.content.ContextCompat;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C54965xay;
import o.C55065xcs;
import o.C55069xcw;
import o.C55279xgu;
import o.C55280xgv;
import o.C55296xhK;
import o.C55298xhM;
import o.C55302xhQ;
import o.C55307xhV;
import o.C56444yFp;
import o.InterfaceC52764wXm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class OKRegularCell extends LinearLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C55065xcs AEQbTJ;
    public final C54965xay KWHzl;
    public final C55069xcw OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKRegularCell(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKRegularCell(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.QSLkRj int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:42) call: com.okinc.uilab.item.OKRegularCell.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OKRegularCell(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.QSLkRj : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRegularCell(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.AEQbTJ = c55065xcs;
        C55069xcw c55069xcw = new C55069xcw(this);
        this.OLrzqt = c55069xcw;
        C54965xay c54965xayCopydefault = C54965xay.copydefault(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54965xayCopydefault, "");
        this.KWHzl = c54965xayCopydefault;
        setOrientation(0);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55069xcw, attributeSet, i, 0, 4, null);
        c55065xcs.OLrzqt(attributeSet, i, 0);
        c54965xayCopydefault.EZpvd.setMaxLines(c55069xcw.values());
        c54965xayCopydefault.copydefault.setMaxLines(c55069xcw.AEQbTJ());
        setPaddingRelative(c55069xcw.copydefault(), c55069xcw.AkhnZx(), c55069xcw.copydefault(), c55069xcw.AkhnZx());
        setMinimumHeight(c55069xcw.fetchVPNInfo());
        setGravity(16);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.GiPPlLQAswws);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.OxbLUn);
        if (drawable != null) {
            setIcon(drawable);
        }
        CharSequence string$default = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.hwkNQP, 0, 4, null);
        if (string$default != null) {
            setTitle(string$default);
        }
        CharSequence string$default2 = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.dSJNDS, 0, 4, null);
        if (string$default2 != null) {
            setDescription(string$default2);
        }
        setIconTint(typedArrayObtainStyledAttributes.getColorStateList(C52761wXj.PictureInPictureParams.DVmcag));
        float f = typedArrayObtainStyledAttributes.getFloat(C52761wXj.PictureInPictureParams.Qsauvs, -1.0f);
        if (f > 0.0f) {
            setPanelWeight(f);
        }
        setCellStyle(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.gFTCsA, 0));
        typedArrayObtainStyledAttributes.recycle();
        setColorState();
        KWHzl();
    }

    public final void setSize(int i) {
        this.AEQbTJ.setOKDSSize(i);
        KWHzl();
    }

    public final void setCellStyle(int i) {
        if (this.copydefault == i) {
            return;
        }
        this.copydefault = i;
        C55280xgv c55280xgv = new C55280xgv();
        C55279xgu c55279xgu = new C55279xgu();
        if (i == 0) {
            c55279xgu.AkhnZx(0);
            c55279xgu.AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
            c55279xgu.AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.invokespecialODCBUN));
            c55279xgu.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
            c55279xgu.copydefault(true);
        } else if (i == 1) {
            c55279xgu.AkhnZx(0);
            c55279xgu.DbNXlk(ContextCompat.getColor(getContext(), C52761wXj.Activity.zuBGHE));
            c55279xgu.fIwbmz(C55298xhM.dpInt$default(1, (Context) null, 1, (Object) null));
            c55279xgu.OLrzqt(C55298xhM.dp$default(8, (Context) null, 1, (Object) null));
            c55279xgu.AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
            c55279xgu.AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.invokespecialODCBUN));
            c55279xgu.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
            c55279xgu.copydefault(true);
        } else if (i == 2) {
            c55279xgu.AkhnZx(0);
            c55279xgu.OLrzqt(C55298xhM.dp$default(8, (Context) null, 1, (Object) null));
            c55279xgu.AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.invokespecialaKhcqp));
            c55279xgu.AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.invokespecialODCBUN));
            c55279xgu.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.UccSpe));
            c55279xgu.copydefault(true);
        }
        View root = this.KWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55280xgv.KWHzl(root, c55279xgu);
    }

    public final void setPanelWeight(float f) {
        ViewGroup.LayoutParams layoutParams = this.KWHzl.OLrzqt.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.weight = f;
        this.KWHzl.OLrzqt.setLayoutParams(layoutParams2);
    }

    public final void setIcon(@DrawableRes int i) {
        this.KWHzl.AEQbTJ.setImageResource(i);
    }

    public final void setIcon(Drawable drawable) {
        ImageView imageView = this.KWHzl.AEQbTJ;
        imageView.setVisibility(drawable == null ? 8 : 0);
        imageView.setImageDrawable(drawable);
    }

    public static /* synthetic */ void setIconSize$default(OKRegularCell oKRegularCell, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIconSize");
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        oKRegularCell.setIconSize(i, i2);
    }

    public final void setIconSize(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.KWHzl.AEQbTJ.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ImageView imageView = this.KWHzl.AEQbTJ;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = i;
            marginLayoutParams.height = i2;
            imageView.setLayoutParams(layoutParams);
        }
    }

    public final void setTitle(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        TextView textView = this.KWHzl.EZpvd;
        Intrinsics.copydefault(textView);
        C55307xhV.AEQbTJ(textView, charSequence);
        ColorStateList colorStateListDbNXlk = this.OLrzqt.DbNXlk();
        if (colorStateListDbNXlk != null) {
            textView.setTextColor(colorStateListDbNXlk);
        }
    }

    public final void setDescription(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        TextView textView = this.KWHzl.copydefault;
        Intrinsics.copydefault(textView);
        C55307xhV.AEQbTJ(textView, charSequence);
        ColorStateList colorStateListKWHzl = this.OLrzqt.KWHzl();
        if (colorStateListKWHzl != null) {
            textView.setTextColor(colorStateListKWHzl);
        }
    }

    public final ImageView OLrzqt() {
        ImageView imageView = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final LinearLayout copydefault() {
        LinearLayout linearLayout = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        C55296xhK.AEQbTJ(this, z);
    }

    public final TextView EZpvd() {
        TextView textView = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final TextView AEQbTJ() {
        TextView textView = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final void setIconTint(ColorStateList colorStateList) {
        this.KWHzl.AEQbTJ.setImageTintList(colorStateList);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2;
        if (view != null) {
            layoutParams2 = layoutParams;
            if (view.getId() != C52761wXj.FragmentManager.DTwDnp) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    marginLayoutParams.setMarginStart(C55298xhM.KWHzl(12.0f, context));
                    layoutParams2 = marginLayoutParams;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(layoutParams);
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    marginLayoutParams2.setMarginStart(C55298xhM.KWHzl(12.0f, context2));
                    layoutParams2 = marginLayoutParams2;
                }
            }
        }
        super.addView(view, i, layoutParams2);
    }

    public static /* synthetic */ void addViewBehindTitle$default(OKRegularCell oKRegularCell, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addViewBehindTitle");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 16;
        }
        oKRegularCell.KWHzl(view, i, i2);
    }

    public final void KWHzl(@NotNull final View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        LinearLayout linearLayoutCopydefault = copydefault();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i2;
        layoutParams.setMarginStart(i);
        Unit unit = Unit.INSTANCE;
        linearLayoutCopydefault.addView(view, layoutParams);
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        final int measuredWidth = view.getMeasuredWidth();
        post(new Runnable() { // from class: o.xcz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OKRegularCell.copydefault(measuredWidth, view, this);
            }
        });
    }

    public static final void copydefault(int i, View view, OKRegularCell oKRegularCell) {
        if (i > view.getWidth()) {
            TextView textViewEZpvd = oKRegularCell.EZpvd();
            ViewGroup.LayoutParams layoutParams = textViewEZpvd.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = 0;
            layoutParams2.weight = 1.0f;
            textViewEZpvd.requestLayout();
        }
    }

    public final void valueOf() {
        LinearLayout linearLayoutCopydefault = copydefault();
        linearLayoutCopydefault.removeViews(1, linearLayoutCopydefault.getChildCount() - 1);
    }

    public final void setColorState() {
        C55280xgv c55280xgv = new C55280xgv();
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.AkhnZx(0);
        c55279xgu.AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
        c55279xgu.AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.GcnicV));
        c55279xgu.copydefault(true);
        View root = this.KWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55280xgv.KWHzl(root, c55279xgu);
    }

    public final void KWHzl() {
        if (this.AEQbTJ.copydefault() == -3) {
            C54965xay c54965xay = this.KWHzl;
            int iOLrzqt = this.OLrzqt.OLrzqt();
            setIconSize(iOLrzqt, iOLrzqt);
            KWHzl(this.OLrzqt.AhwBna());
            c54965xay.EZpvd.setTextSize(0, this.OLrzqt.valueOf());
            OLrzqt(this.OLrzqt.EZpvd());
            return;
        }
        C54965xay c54965xay2 = this.KWHzl;
        int iDjBIcL = this.OLrzqt.djBIcL();
        setIconSize(iDjBIcL, iDjBIcL);
        KWHzl(this.OLrzqt.gEmmrt());
        c54965xay2.EZpvd.setTextSize(0, this.OLrzqt.isConnected());
        OLrzqt(this.OLrzqt.AYXKKw());
    }

    public final void KWHzl(@StyleRes int i) {
        TextView textView = this.KWHzl.EZpvd;
        textView.setTextAppearance(i);
        textView.setTextColor(this.OLrzqt.DbNXlk());
    }

    public final void OLrzqt(@StyleRes int i) {
        TextView textView = this.KWHzl.copydefault;
        textView.setTextAppearance(i);
        textView.setTextColor(this.OLrzqt.KWHzl());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class HorizontalPaddingToken {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ HorizontalPaddingToken[] $VALUES;
        public static final HorizontalPaddingToken H_16 = new HorizontalPaddingToken("H_16", 0, 16);
        public static final HorizontalPaddingToken H_24 = new HorizontalPaddingToken("H_24", 1, 24);
        private final int paddingDp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ HorizontalPaddingToken[] $values() {
            return new HorizontalPaddingToken[]{H_16, H_24};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<HorizontalPaddingToken> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getPaddingDp() {
            return this.paddingDp;
        }

        private HorizontalPaddingToken(String str, int i, int i2) {
            this.paddingDp = i2;
        }

        static {
            HorizontalPaddingToken[] horizontalPaddingTokenArr$values = $values();
            $VALUES = horizontalPaddingTokenArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(horizontalPaddingTokenArr$values);
        }

        public static HorizontalPaddingToken valueOf(String str) {
            return (HorizontalPaddingToken) Enum.valueOf(HorizontalPaddingToken.class, str);
        }

        public static HorizontalPaddingToken[] values() {
            return (HorizontalPaddingToken[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.item.OKRegularCell.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
