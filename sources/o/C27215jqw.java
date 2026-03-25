package o;

import android.graphics.drawable.AnimationDrawable;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27215jqw extends AbstractC57946yrx implements InterfaceC57927yre {
    public AnimationDrawable AEQbTJ;
    public java.lang.String KWHzl;
    public android.widget.LinearLayout OLrzqt;
    public android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoMoreText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    public C27215jqw(android.content.Context context) {
        this(context, null);
    }

    public C27215jqw(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public C27215jqw(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        copydefault(context);
    }

    private final void copydefault(android.content.Context context) {
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C25493ixk.Activity.RZNAhV, (android.view.ViewGroup) null);
        this.OLrzqt = (android.widget.LinearLayout) viewInflate.findViewById(C25493ixk.ActionBar.fhUrPt);
        android.view.View viewFindViewById = viewInflate.findViewById(C25493ixk.ActionBar.dbUqJD);
        android.widget.ImageView imageView = viewFindViewById instanceof android.widget.ImageView ? (android.widget.ImageView) viewFindViewById : null;
        this.AEQbTJ = (AnimationDrawable) (imageView != null ? imageView.getDrawable() : null);
        this.copydefault = (android.widget.TextView) viewInflate.findViewById(C25493ixk.ActionBar.getStateLabel);
        android.content.Context context2 = viewInflate.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        addView(viewInflate, new RelativeLayout.LayoutParams(-1, C33052mpF.EZpvd(40.0f, context2)));
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void KWHzl(@NotNull InterfaceC57934yrl interfaceC57934yrl, int i, int i2) {
        AnimationDrawable animationDrawable;
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        android.widget.LinearLayout linearLayout = this.OLrzqt;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        AnimationDrawable animationDrawable2 = this.AEQbTJ;
        if ((animationDrawable2 == null || !animationDrawable2.isRunning()) && (animationDrawable = this.AEQbTJ) != null) {
            animationDrawable.start();
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public int EZpvd(@NotNull InterfaceC57934yrl interfaceC57934yrl, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        android.widget.LinearLayout linearLayout = this.OLrzqt;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        return super.EZpvd(interfaceC57934yrl, z);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57927yre
    public boolean AEQbTJ(boolean z) {
        android.widget.LinearLayout linearLayout = this.OLrzqt;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl)) {
            return true;
        }
        android.widget.TextView textView = this.copydefault;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        android.widget.TextView textView2 = this.copydefault;
        if (textView2 == null) {
            return true;
        }
        textView2.setText(this.KWHzl);
        return true;
    }
}
