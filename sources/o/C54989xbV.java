package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54989xbV extends ConstraintLayout implements InterfaceC55066xct {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final C54991xbX AEQbTJ;
    public final C55065xcs AhwBna;
    public final C55279xgu EZpvd;
    public final C54942xab OLrzqt;
    public final C55380xip copydefault;
    public int djBIcL;
    public final C55280xgv valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54989xbV(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54989xbV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55380xip copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.fERRXa int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.xbV.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C54989xbV(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.fERRXa : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54989xbV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.AhwBna = c55065xcs;
        this.EZpvd = new C55279xgu();
        this.valueOf = new C55280xgv();
        C54942xab c54942xabKWHzl = C54942xab.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54942xabKWHzl, "");
        this.OLrzqt = c54942xabKWHzl;
        C54991xbX c54991xbX = new C54991xbX(this);
        this.AEQbTJ = c54991xbX;
        C55380xip c55380xip = c54942xabKWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55380xip, "");
        this.copydefault = c55380xip;
        c54991xbX.OLrzqt(attributeSet, i, C52761wXj.LoaderManager.aKErDB);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, 0, 0, 6, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.init);
        EZpvd().setText(typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.XW));
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.Hx);
        if (drawable != null) {
            android.widget.ImageView imageViewAEQbTJ = AEQbTJ();
            imageViewAEQbTJ.setImageDrawable(drawable);
            imageViewAEQbTJ.setVisibility(0);
        }
        this.djBIcL = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.DcMfJKsfEqpH, 0);
        OLrzqt().setVisibility(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.DcMfJKfwDlxl, false) ? 0 : 8);
        setSelected(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.DcMfJKfNUfqk, false));
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.enabled}, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "");
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
        valueOf();
        typedArrayObtainStyledAttributes.recycle();
        KWHzl();
    }

    public final android.widget.ImageView AEQbTJ() {
        android.widget.ImageView imageView = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.OLrzqt.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.ImageView OLrzqt() {
        android.widget.ImageView imageView = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final void setMenuIcon(@NotNull android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        android.widget.ImageView imageView = this.OLrzqt.copydefault;
        imageView.setImageDrawable(drawable);
        Intrinsics.copydefault(imageView);
        imageView.setVisibility(0);
        KWHzl();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.AhwBna.setOKDSSize(i);
        KWHzl();
    }

    public final void setStyle(int i) {
        if (this.djBIcL != i) {
            this.djBIcL = i;
            valueOf();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        if (isEnabled() && z2) {
            android.widget.TextView textViewEZpvd = EZpvd();
            if (this.djBIcL == 2) {
                TextViewCompat.setTextAppearance(textViewEZpvd, C52761wXj.LoaderManager.giSNqX);
            } else if (z) {
                TextViewCompat.setTextAppearance(textViewEZpvd, C52761wXj.LoaderManager.giSNqX);
            } else {
                TextViewCompat.setTextAppearance(textViewEZpvd, C52761wXj.LoaderManager.gGvvIC);
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (isEnabled() == z) {
            return;
        }
        super.setEnabled(z);
        C54942xab c54942xab = this.OLrzqt;
        c54942xab.copydefault.setAlpha(z ? 1.0f : 0.5f);
        c54942xab.valueOf.setEnabled(z);
        c54942xab.OLrzqt.setEnabled(z);
    }

    public final void KWHzl() {
        int iOLrzqt;
        int iOLrzqt2;
        int iOLrzqt3;
        int iCopydefault = this.AhwBna.copydefault();
        int iOLrzqt4 = 0;
        boolean z = AEQbTJ().getVisibility() != 8;
        if (iCopydefault == -20) {
            android.widget.ImageView imageViewAEQbTJ = AEQbTJ();
            ViewGroup.LayoutParams layoutParams = imageViewAEQbTJ.getLayoutParams();
            if (layoutParams != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                layoutParams.width = C55298xhM.OLrzqt(16, context);
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                layoutParams.height = C55298xhM.OLrzqt(16, context2);
                imageViewAEQbTJ.setLayoutParams(layoutParams);
                ConstraintLayout root = this.OLrzqt.getRoot();
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                int iOLrzqt5 = C55298xhM.OLrzqt(8, context3);
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                int iOLrzqt6 = C55298xhM.OLrzqt(6, context4);
                android.content.Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                int iOLrzqt7 = C55298xhM.OLrzqt(8, context5);
                android.content.Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                root.setPaddingRelative(iOLrzqt5, iOLrzqt6, iOLrzqt7, C55298xhM.OLrzqt(6, context6));
                android.widget.TextView textViewEZpvd = EZpvd();
                ViewGroup.LayoutParams layoutParams2 = textViewEZpvd.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (z) {
                    android.content.Context context7 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "");
                    iOLrzqt4 = C55298xhM.OLrzqt(4, context7);
                }
                marginLayoutParams.setMarginStart(iOLrzqt4);
                textViewEZpvd.setLayoutParams(marginLayoutParams);
                textViewEZpvd.setTextSize(12.0f);
                android.content.Context context8 = getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                textViewEZpvd.setMinHeight(C55298xhM.OLrzqt(16, context8));
                if (this.djBIcL == 2 || isSelected()) {
                    TextViewCompat.setTextAppearance(textViewEZpvd, C52761wXj.LoaderManager.giSNqX);
                    return;
                } else {
                    TextViewCompat.setTextAppearance(textViewEZpvd, C52761wXj.LoaderManager.gGvvIC);
                    return;
                }
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (iCopydefault == -6) {
            android.widget.ImageView imageViewAEQbTJ2 = AEQbTJ();
            ViewGroup.LayoutParams layoutParams3 = imageViewAEQbTJ2.getLayoutParams();
            if (layoutParams3 != null) {
                android.content.Context context9 = getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "");
                layoutParams3.width = C55298xhM.OLrzqt(16, context9);
                android.content.Context context10 = getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "");
                layoutParams3.height = C55298xhM.OLrzqt(16, context10);
                imageViewAEQbTJ2.setLayoutParams(layoutParams3);
                if (z) {
                    android.content.Context context11 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context11, "");
                    iOLrzqt = C55298xhM.OLrzqt(4, context11);
                } else {
                    android.content.Context context12 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context12, "");
                    iOLrzqt = C55298xhM.OLrzqt(8, context12);
                }
                ConstraintLayout root2 = this.OLrzqt.getRoot();
                int iOLrzqt8 = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.OuxcSI);
                android.content.Context context13 = getContext();
                Intrinsics.checkNotNullExpressionValue(context13, "");
                root2.setPaddingRelative(iOLrzqt, iOLrzqt8, C55298xhM.OLrzqt(8, context13), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.OuxcSI));
                android.widget.TextView textViewEZpvd2 = EZpvd();
                ViewGroup.LayoutParams layoutParams4 = textViewEZpvd2.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                if (z) {
                    android.content.Context context14 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context14, "");
                    iOLrzqt4 = C55298xhM.OLrzqt(4, context14);
                }
                marginLayoutParams2.setMarginStart(iOLrzqt4);
                textViewEZpvd2.setLayoutParams(marginLayoutParams2);
                android.content.Context context15 = getContext();
                Intrinsics.checkNotNullExpressionValue(context15, "");
                textViewEZpvd2.setMinHeight(C55298xhM.OLrzqt(16, context15));
                textViewEZpvd2.setTextSize(12.0f);
                if (this.djBIcL == 2 || isSelected()) {
                    TextViewCompat.setTextAppearance(textViewEZpvd2, C52761wXj.LoaderManager.giSNqX);
                    return;
                } else {
                    TextViewCompat.setTextAppearance(textViewEZpvd2, C52761wXj.LoaderManager.gGvvIC);
                    return;
                }
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (iCopydefault == -5) {
            android.widget.ImageView imageViewAEQbTJ3 = AEQbTJ();
            ViewGroup.LayoutParams layoutParams5 = imageViewAEQbTJ3.getLayoutParams();
            if (layoutParams5 != null) {
                android.content.Context context16 = getContext();
                Intrinsics.checkNotNullExpressionValue(context16, "");
                layoutParams5.width = C55298xhM.OLrzqt(16, context16);
                android.content.Context context17 = getContext();
                Intrinsics.checkNotNullExpressionValue(context17, "");
                layoutParams5.height = C55298xhM.OLrzqt(16, context17);
                imageViewAEQbTJ3.setLayoutParams(layoutParams5);
                if (z) {
                    android.content.Context context18 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context18, "");
                    iOLrzqt2 = C55298xhM.OLrzqt(8, context18);
                } else {
                    android.content.Context context19 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context19, "");
                    iOLrzqt2 = C55298xhM.OLrzqt(12, context19);
                }
                ConstraintLayout root3 = this.OLrzqt.getRoot();
                int iOLrzqt9 = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT);
                android.content.Context context20 = getContext();
                Intrinsics.checkNotNullExpressionValue(context20, "");
                root3.setPaddingRelative(iOLrzqt2, iOLrzqt9, C55298xhM.OLrzqt(12, context20), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT));
                android.widget.TextView textViewEZpvd3 = EZpvd();
                ViewGroup.LayoutParams layoutParams6 = textViewEZpvd3.getLayoutParams();
                if (layoutParams6 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6;
                if (z) {
                    android.content.Context context21 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context21, "");
                    iOLrzqt4 = C55298xhM.OLrzqt(4, context21);
                }
                marginLayoutParams3.setMarginStart(iOLrzqt4);
                textViewEZpvd3.setLayoutParams(marginLayoutParams3);
                android.content.Context context22 = getContext();
                Intrinsics.checkNotNullExpressionValue(context22, "");
                textViewEZpvd3.setMinHeight(C55298xhM.OLrzqt(16, context22));
                textViewEZpvd3.setTextSize(14.0f);
                if (this.djBIcL == 2 || isSelected()) {
                    TextViewCompat.setTextAppearance(textViewEZpvd3, C52761wXj.LoaderManager.giSNqX);
                    return;
                } else {
                    TextViewCompat.setTextAppearance(textViewEZpvd3, C52761wXj.LoaderManager.gGvvIC);
                    return;
                }
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (iCopydefault != -4) {
            return;
        }
        android.widget.ImageView imageViewAEQbTJ4 = AEQbTJ();
        ViewGroup.LayoutParams layoutParams7 = imageViewAEQbTJ4.getLayoutParams();
        if (layoutParams7 != null) {
            android.content.Context context23 = getContext();
            Intrinsics.checkNotNullExpressionValue(context23, "");
            layoutParams7.width = C55298xhM.OLrzqt(20, context23);
            android.content.Context context24 = getContext();
            Intrinsics.checkNotNullExpressionValue(context24, "");
            layoutParams7.height = C55298xhM.OLrzqt(20, context24);
            imageViewAEQbTJ4.setLayoutParams(layoutParams7);
            if (z) {
                android.content.Context context25 = getContext();
                Intrinsics.checkNotNullExpressionValue(context25, "");
                iOLrzqt3 = C55298xhM.OLrzqt(8, context25);
            } else {
                android.content.Context context26 = getContext();
                Intrinsics.checkNotNullExpressionValue(context26, "");
                iOLrzqt3 = C55298xhM.OLrzqt(12, context26);
            }
            ConstraintLayout root4 = this.OLrzqt.getRoot();
            android.content.Context context27 = getContext();
            Intrinsics.checkNotNullExpressionValue(context27, "");
            int iOLrzqt10 = C55298xhM.OLrzqt(8, context27);
            android.content.Context context28 = getContext();
            Intrinsics.checkNotNullExpressionValue(context28, "");
            int iOLrzqt11 = C55298xhM.OLrzqt(12, context28);
            android.content.Context context29 = getContext();
            Intrinsics.checkNotNullExpressionValue(context29, "");
            root4.setPaddingRelative(iOLrzqt3, iOLrzqt10, iOLrzqt11, C55298xhM.OLrzqt(8, context29));
            android.widget.TextView textViewEZpvd4 = EZpvd();
            ViewGroup.LayoutParams layoutParams8 = textViewEZpvd4.getLayoutParams();
            if (layoutParams8 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams8;
            if (z) {
                android.content.Context context30 = getContext();
                Intrinsics.checkNotNullExpressionValue(context30, "");
                iOLrzqt4 = C55298xhM.OLrzqt(4, context30);
            }
            marginLayoutParams4.setMarginStart(iOLrzqt4);
            textViewEZpvd4.setLayoutParams(marginLayoutParams4);
            android.content.Context context31 = getContext();
            Intrinsics.checkNotNullExpressionValue(context31, "");
            textViewEZpvd4.setMinHeight(C55298xhM.OLrzqt(20, context31));
            textViewEZpvd4.setTextSize(14.0f);
            if (this.djBIcL == 2 || isSelected()) {
                TextViewCompat.setTextAppearance(textViewEZpvd4, C52761wXj.LoaderManager.giSNqX);
                return;
            } else {
                TextViewCompat.setTextAppearance(textViewEZpvd4, C52761wXj.LoaderManager.gGvvIC);
                return;
            }
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final void valueOf() {
        C55279xgu c55279xgu = this.EZpvd;
        c55279xgu.zuBGHE();
        c55279xgu.copydefault(true);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55279xgu.OLrzqt(C55298xhM.EZpvd(999.0f, context));
        int i = this.djBIcL;
        if (i == 0) {
            c55279xgu.AhwBna(this.AEQbTJ.fJNWhG());
            c55279xgu.djBIcL(this.AEQbTJ.getNewProxyInstance());
            c55279xgu.AYXKKw(this.AEQbTJ.AuCTel());
            c55279xgu.valueOf(this.AEQbTJ.values());
        } else if (i == 1) {
            c55279xgu.AhwBna(this.AEQbTJ.AubY());
            c55279xgu.djBIcL(this.AEQbTJ.gHZMYf());
            c55279xgu.AYXKKw(this.AEQbTJ.sSMYrx());
            c55279xgu.valueOf(this.AEQbTJ.getFieldNames());
        } else if (i == 2) {
            c55279xgu.AhwBna(this.AEQbTJ.OLrzqt());
            c55279xgu.djBIcL(this.AEQbTJ.djBIcL());
            c55279xgu.AYXKKw(this.AEQbTJ.gEmmrt());
            c55279xgu.valueOf(this.AEQbTJ.copydefault());
        }
        this.valueOf.KWHzl(this, this.EZpvd);
        int i2 = this.djBIcL;
        if (i2 == 0) {
            EZpvd().setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{this.AEQbTJ.DbNXlk(), this.AEQbTJ.iwGUEr(), this.AEQbTJ.hDKMBd(), this.AEQbTJ.ejfBZ()}));
        } else if (i2 == 1) {
            EZpvd().setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{this.AEQbTJ.zsXlph(), this.AEQbTJ.AxsJAY(), this.AEQbTJ.DTwDnp(), this.AEQbTJ.wlaJM()}));
        } else if (i2 == 2) {
            EZpvd().setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{this.AEQbTJ.AEQbTJ(), this.AEQbTJ.AhwBna(), this.AEQbTJ.AkhnZx(), this.AEQbTJ.valueOf()}));
            TextViewCompat.setTextAppearance(EZpvd(), C52761wXj.LoaderManager.giSNqX);
        }
        int i3 = this.djBIcL;
        if (i3 == 0) {
            OLrzqt().setImageTintList(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{this.AEQbTJ.isConnected(), this.AEQbTJ.fIwbmz(), this.AEQbTJ.uzCIH(), this.AEQbTJ.fARcdN()}));
        } else if (i3 == 1) {
            OLrzqt().setImageTintList(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{this.AEQbTJ.zLjUOn(), this.AEQbTJ.zuBGHE(), this.AEQbTJ.AwvSrB(), this.AEQbTJ.AuCTelauCTel()}));
        } else {
            if (i3 != 2) {
                return;
            }
            OLrzqt().setImageTintList(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{this.AEQbTJ.EZpvd(), this.AEQbTJ.AYXKKw(), this.AEQbTJ.fetchVPNInfo(), this.AEQbTJ.KWHzl()}));
        }
    }

    /* JADX INFO: renamed from: o.xbV$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xbV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
