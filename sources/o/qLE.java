package o;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qLE extends android.widget.PopupWindow {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public android.widget.TextView AEQbTJ;
    public final android.content.Context EZpvd;
    public android.widget.ImageView OLrzqt;
    public android.widget.LinearLayout copydefault;

    public qLE(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
        OLrzqt();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qLE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void OLrzqt() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(this.EZpvd).inflate(qZH.ActionBar.DCJXGO, (android.view.ViewGroup) null);
        this.copydefault = linearLayout;
        this.AEQbTJ = linearLayout != null ? (android.widget.TextView) linearLayout.findViewById(qZH.StateListAnimator.disconnect) : null;
        android.widget.LinearLayout linearLayout2 = this.copydefault;
        this.OLrzqt = linearLayout2 != null ? (android.widget.ImageView) linearLayout2.findViewById(qZH.StateListAnimator.Dap) : null;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.AEQbTJ;
        if (textView != null) {
            textView.setText(str);
        }
        KWHzl();
    }

    public final void OLrzqt(int i, int i2, int i3) {
        android.widget.LinearLayout linearLayout = this.copydefault;
        if (linearLayout != null) {
            linearLayout.setGravity(i);
        }
        android.widget.ImageView imageView = this.OLrzqt;
        ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i == 5) {
            marginLayoutParams.setMarginEnd(i2);
        } else {
            marginLayoutParams.setMarginEnd(i2);
        }
        android.widget.ImageView imageView2 = this.OLrzqt;
        if (imageView2 != null) {
            imageView2.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2, int i3) {
        Intrinsics.copydefault(view);
        view.getLocationOnScreen(new int[2]);
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void KWHzl() {
        android.widget.LinearLayout linearLayout = this.copydefault;
        if (linearLayout == null) {
            return;
        }
        setContentView(linearLayout);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
    }
}
