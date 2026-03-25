package o;

import android.widget.PopupWindow;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57644ymM extends android.widget.FrameLayout {
    public android.view.View AEQbTJ;
    public android.widget.TextView EZpvd;
    public boolean KWHzl;
    public android.view.View OLrzqt;
    public C33584mzH copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33584mzH AEQbTJ() {
        return this.copydefault;
    }

    public void EZpvd() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeft(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMPopWindow(C33584mzH c33584mzH) {
        this.copydefault = c33584mzH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRight(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowTopDividerLine(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.EZpvd = textView;
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = this.EZpvd;
        if (textView != null) {
            return textView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.view.View OLrzqt() {
        android.view.View view = this.AEQbTJ;
        if (view != null) {
            return view;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.view.View KWHzl() {
        android.view.View view = this.OLrzqt;
        if (view != null) {
            return view;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57644ymM(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = true;
        copydefault(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57644ymM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = true;
        copydefault(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57644ymM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = true;
        copydefault(context, attributeSet);
    }

    public final void copydefault(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C32113mPz.Fragment.AxsJAY, this);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.gUEfcq);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setTitle((android.widget.TextView) viewInflate.findViewById(C32113mPz.FragmentManager.gkJEwt));
        setLeft(viewInflate.findViewById(C32113mPz.FragmentManager.AwvSrB));
        setRight(viewInflate.findViewById(C32113mPz.FragmentManager.QUSxYX));
        copydefault().setText(C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C32113mPz.PendingIntent.gmHjFq, 0)));
        OLrzqt().setVisibility(typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.gSBher, false) ? 0 : 4);
        KWHzl().setVisibility(typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.fsSxsn, false) ? 0 : 4);
        this.KWHzl = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.iPSTqm, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setRightLineVisible(boolean z) {
        KWHzl().setVisibility(z ? 0 : 8);
    }

    public final void setTextMaxLines(int i) {
        copydefault().setMaxLines(i);
    }

    public final void setTextGravity(int i, int i2) {
        copydefault().setGravity(i & i2);
    }

    public static /* synthetic */ void show$default(C57644ymM c57644ymM, android.view.View view, float f, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i & 2) != 0) {
            f = 8.0f;
        }
        c57644ymM.KWHzl(view, f);
    }

    public final void KWHzl(@NotNull android.view.View view, float f) {
        Intrinsics.checkNotNullParameter(view, "");
        setSelected(true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.addView(view);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        frameLayout.setPaddingRelative(0, 0, 0, C33052mpF.EZpvd(f, context));
        frameLayout.setBackgroundResource(C32113mPz.TaskDescription.fJNWhG);
        C33584mzH c33584mzH = new C33584mzH(getContext(), frameLayout, this.KWHzl);
        this.copydefault = c33584mzH;
        c33584mzH.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.ymS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C57644ymM.AEQbTJ(this.KWHzl);
            }
        });
        C33584mzH c33584mzH2 = this.copydefault;
        if (c33584mzH2 != null) {
            c33584mzH2.showAsDropDown(this, 0, 0);
        }
    }

    public static final void AEQbTJ(C57644ymM c57644ymM) {
        c57644ymM.setSelected(false);
        C33584mzH c33584mzH = c57644ymM.copydefault;
        if (c33584mzH != null && c33584mzH.isShowing()) {
            c57644ymM.AYXKKw();
        }
        c57644ymM.EZpvd();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        copydefault().setSelected(z);
    }

    public void AYXKKw() {
        C33584mzH c33584mzH = this.copydefault;
        if (c33584mzH != null) {
            c33584mzH.dismiss();
        }
        this.copydefault = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AYXKKw();
    }

    public final void setRightDrawable(int i) {
        copydefault().setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
    }

    public final void setTitleStyle(int i, int i2, int i3) {
        android.widget.TextView textViewCopydefault = copydefault();
        textViewCopydefault.setTextAppearance(i3);
        textViewCopydefault.setTextSize(2, i);
        textViewCopydefault.setTextColor(ContextCompat.getColor(textViewCopydefault.getContext(), i2));
    }
}
