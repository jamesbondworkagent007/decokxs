package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vWj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50653vWj extends ConstraintLayout implements InterfaceC55066xct {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final C55279xgu AEQbTJ;
    public int AYXKKw;
    public final C55280xgv EZpvd;
    public final C48653uZj KWHzl;
    public final C55065xcs OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50653vWj(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50653vWj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.fERRXa int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.vWj.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C50653vWj(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.fERRXa : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50653vWj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.OLrzqt = c55065xcs;
        this.AEQbTJ = new C55279xgu();
        this.EZpvd = new C55280xgv();
        C48653uZj c48653uZjAEQbTJ = C48653uZj.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c48653uZjAEQbTJ, "");
        this.KWHzl = c48653uZjAEQbTJ;
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, 0, 0, 6, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.init);
        EZpvd().setText(typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.XW));
        this.AYXKKw = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.DcMfJKsfEqpH, 0);
        OLrzqt().setVisibility(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.DcMfJKfwDlxl, false) ? 0 : 8);
        setSelected(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.DcMfJKfNUfqk, false));
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.enabled}, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "");
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
        valueOf();
        typedArrayObtainStyledAttributes.recycle();
        AEQbTJ();
    }

    public final C51601vqB copydefault() {
        C51601vqB c51601vqB = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(c51601vqB, "");
        return c51601vqB;
    }

    public static /* synthetic */ void refreshCircleCoins$default(C50653vWj c50653vWj, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        c50653vWj.OLrzqt(list, i);
    }

    public final void OLrzqt(@NotNull java.util.List<java.lang.String> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        copydefault().setVisibility(0);
        C51601vqB.refreshCircleCoins$default(copydefault(), list, i, 0, 4, null);
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd().setText(str);
    }

    public final android.widget.ImageView OLrzqt() {
        android.widget.ImageView imageView = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public int KWHzl() {
        return this.OLrzqt.copydefault();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.OLrzqt.setOKDSSize(i);
        AEQbTJ();
    }

    public final void setStyle(int i) {
        if (this.AYXKKw != i) {
            this.AYXKKw = i;
            valueOf();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        if (isEnabled() && z2) {
            android.widget.TextView textViewEZpvd = EZpvd();
            if (z) {
                if (KWHzl() == -6) {
                    TextViewCompat.setTextAppearance(textViewEZpvd, C52761wXj.LoaderManager.giSNqX);
                } else {
                    TextViewCompat.setTextAppearance(textViewEZpvd, C52761wXj.LoaderManager.fFgQHt);
                }
            } else {
                TextViewCompat.setTextAppearance(textViewEZpvd, C52761wXj.LoaderManager.gGvvIC);
            }
            valueOf();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (isEnabled() == z) {
            return;
        }
        super.setEnabled(z);
        C48653uZj c48653uZj = this.KWHzl;
        c48653uZj.copydefault.setAlpha(z ? 1.0f : 0.5f);
        c48653uZj.AEQbTJ.setEnabled(z);
        c48653uZj.KWHzl.setEnabled(z);
    }

    public final void AEQbTJ() {
        int iOLrzqt;
        int iOLrzqt2;
        int iOLrzqt3;
        int iCopydefault = this.OLrzqt.copydefault();
        boolean z = copydefault().getVisibility() != 8;
        if (iCopydefault == -6) {
            if (z) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iOLrzqt = C55298xhM.OLrzqt(4, context);
            } else {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iOLrzqt = C55298xhM.OLrzqt(8, context2);
            }
            ConstraintLayout root = this.KWHzl.getRoot();
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iOLrzqt4 = C55298xhM.OLrzqt(4, context3);
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            int iOLrzqt5 = C55298xhM.OLrzqt(8, context4);
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            root.setPadding(iOLrzqt, iOLrzqt4, iOLrzqt5, C55298xhM.OLrzqt(4, context5));
            android.widget.TextView textViewEZpvd = EZpvd();
            if (z) {
                C55296xhK.margin$default(textViewEZpvd, java.lang.Float.valueOf(4.0f), null, null, null, 14, null);
            } else {
                C55296xhK.margin$default(textViewEZpvd, java.lang.Float.valueOf(0.0f), null, null, null, 14, null);
            }
            textViewEZpvd.setTextSize(12.0f);
            if (isSelected()) {
                TextViewCompat.setTextAppearance(textViewEZpvd, C52761wXj.LoaderManager.giSNqX);
                return;
            } else {
                TextViewCompat.setTextAppearance(textViewEZpvd, C52761wXj.LoaderManager.gGvvIC);
                return;
            }
        }
        if (iCopydefault == -5) {
            if (z) {
                android.content.Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                iOLrzqt2 = C55298xhM.OLrzqt(8, context6);
            } else {
                android.content.Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                iOLrzqt2 = C55298xhM.OLrzqt(12, context7);
            }
            ConstraintLayout root2 = this.KWHzl.getRoot();
            android.content.Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            int iOLrzqt6 = C55298xhM.OLrzqt(6, context8);
            android.content.Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            int iOLrzqt7 = C55298xhM.OLrzqt(12, context9);
            android.content.Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            root2.setPadding(iOLrzqt2, iOLrzqt6, iOLrzqt7, C55298xhM.OLrzqt(6, context10));
            android.widget.TextView textViewEZpvd2 = EZpvd();
            if (z) {
                C55296xhK.margin$default(textViewEZpvd2, java.lang.Float.valueOf(4.0f), null, null, null, 14, null);
            } else {
                C55296xhK.margin$default(textViewEZpvd2, java.lang.Float.valueOf(0.0f), null, null, null, 14, null);
            }
            textViewEZpvd2.setTextSize(12.0f);
            if (isSelected()) {
                TextViewCompat.setTextAppearance(textViewEZpvd2, C52761wXj.LoaderManager.fFgQHt);
                return;
            } else {
                TextViewCompat.setTextAppearance(textViewEZpvd2, C52761wXj.LoaderManager.gGvvIC);
                return;
            }
        }
        if (iCopydefault != -4) {
            return;
        }
        if (z) {
            android.content.Context context11 = getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            iOLrzqt3 = C55298xhM.OLrzqt(8, context11);
        } else {
            android.content.Context context12 = getContext();
            Intrinsics.checkNotNullExpressionValue(context12, "");
            iOLrzqt3 = C55298xhM.OLrzqt(12, context12);
        }
        ConstraintLayout root3 = this.KWHzl.getRoot();
        android.content.Context context13 = getContext();
        Intrinsics.checkNotNullExpressionValue(context13, "");
        int iOLrzqt8 = C55298xhM.OLrzqt(8, context13);
        android.content.Context context14 = getContext();
        Intrinsics.checkNotNullExpressionValue(context14, "");
        int iOLrzqt9 = C55298xhM.OLrzqt(12, context14);
        android.content.Context context15 = getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "");
        root3.setPadding(iOLrzqt3, iOLrzqt8, iOLrzqt9, C55298xhM.OLrzqt(8, context15));
        android.widget.TextView textViewEZpvd3 = EZpvd();
        if (z) {
            C55296xhK.margin$default(textViewEZpvd3, java.lang.Float.valueOf(4.0f), null, null, null, 14, null);
        } else {
            C55296xhK.margin$default(textViewEZpvd3, java.lang.Float.valueOf(0.0f), null, null, null, 14, null);
        }
        textViewEZpvd3.setTextSize(16.0f);
        if (isSelected()) {
            TextViewCompat.setTextAppearance(textViewEZpvd3, C52761wXj.LoaderManager.fFgQHt);
        } else {
            TextViewCompat.setTextAppearance(textViewEZpvd3, C52761wXj.LoaderManager.gGvvIC);
        }
    }

    public final void valueOf() {
        C55279xgu c55279xgu = this.AEQbTJ;
        c55279xgu.zuBGHE();
        c55279xgu.copydefault(true);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55279xgu.OLrzqt(C55298xhM.EZpvd(999.0f, context));
        if (this.AYXKKw == 0) {
            c55279xgu.AhwBna(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
            c55279xgu.AYXKKw(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
            c55279xgu.valueOf(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        }
        this.EZpvd.KWHzl(this, this.AEQbTJ);
        if (this.AYXKKw == 0) {
            EZpvd().setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)}));
        }
        if (this.AYXKKw == 0) {
            OLrzqt().setImageTintList(new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{C33070mpX.copydefault(C52761wXj.Activity.UlJrfe), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)}));
        }
    }

    /* JADX INFO: renamed from: o.vWj$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vWj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
