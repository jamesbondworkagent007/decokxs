package o;

import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C22366hdx;
import o.C23274hvD;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class kBD implements InterfaceC27734kBj<kBC, C22323hdG> {
    public final android.view.LayoutInflater EZpvd;
    public final Function1<kBC, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<kBC, Unit> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.kBC, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public kBD(@NotNull android.view.LayoutInflater layoutInflater, Function1<? super kBC, Unit> function1) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.EZpvd = layoutInflater;
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/content/Context;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC27734kBj
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C22323hdG AEQbTJ(@NotNull android.content.Context context, android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "");
        C22323hdG c22323hdGEZpvd = C22323hdG.EZpvd(this.EZpvd, viewGroup, true);
        Intrinsics.checkNotNullExpressionValue(c22323hdGEZpvd, "");
        return c22323hdGEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.InterfaceC27734kBj
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C22323hdG c22323hdG, @NotNull kBC kbc) {
        int color;
        int iDp2px$default;
        int iDp2px$default2;
        Intrinsics.checkNotNullParameter(c22323hdG, "");
        Intrinsics.checkNotNullParameter(kbc, "");
        if (C23313hvq.KWHzl(kbc.KWHzl(), 0)) {
            color = Color.parseColor("#FC45AB");
        } else {
            color = Color.parseColor("#BCFF2F");
        }
        c22323hdG.AYXKKw.setText(kbc.EZpvd());
        c22323hdG.AYXKKw.setShadowLayer(12.0f, 0.0f, 0.0f, color);
        android.widget.TextView textView = c22323hdG.EZpvd;
        java.lang.String strKWHzl = kbc.KWHzl();
        DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
        textView.setText(kLY.formatPercentage$default(strKWHzl, displaySign, false, null, null, 14, null));
        c22323hdG.valueOf.setText(kLY.formatPercentage$default(kbc.KWHzl(), displaySign, false, null, null, 14, null));
        android.widget.TextView textView2 = c22323hdG.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility((C33129mqd.OLrzqt((java.lang.CharSequence) kbc.KWHzl()) && C23313hvq.AhwBna(kbc.KWHzl(), "0")) ? 0 : 8);
        android.widget.TextView textView3 = c22323hdG.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility((C33129mqd.OLrzqt((java.lang.CharSequence) kbc.KWHzl()) && C23313hvq.AhwBna(kbc.KWHzl(), "0")) ? 0 : 8);
        c22323hdG.valueOf.setShadowLayer(12.0f, 0.0f, 0.0f, color);
        c22323hdG.isConnected.setText(kbc.AEQbTJ());
        c22323hdG.isConnected.setShadowLayer(12.0f, 0.0f, 0.0f, color);
        c22323hdG.isConnected.setTextSize(C33129mqd.valueOf(kbc.AEQbTJ(), "3") ? 48.0f : 24.0f);
        ViewGroup.LayoutParams layoutParams = c22323hdG.isConnected.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            int iDp2px$default3 = C55298xhM.dp2px$default(4.0f, null, 1, null);
            int iDp2px$default4 = C55298xhM.dp2px$default(0.0f, null, 1, null);
            int iDp2px$default5 = C55298xhM.dp2px$default(4.0f, null, 1, null);
            if (C33129mqd.valueOf(kbc.AEQbTJ(), "3")) {
                iDp2px$default2 = C55298xhM.dp2px$default(-6.0f, null, 1, null);
            } else {
                iDp2px$default2 = C55298xhM.dp2px$default(0.0f, null, 1, null);
            }
            layoutParams2.setMargins(iDp2px$default3, iDp2px$default4, iDp2px$default5, iDp2px$default2);
        }
        ViewGroup.LayoutParams layoutParams3 = c22323hdG.AkhnZx.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            int iDp2px$default6 = C55298xhM.dp2px$default(4.0f, null, 1, null);
            int iDp2px$default7 = C55298xhM.dp2px$default(0.0f, null, 1, null);
            int iDp2px$default8 = C55298xhM.dp2px$default(4.0f, null, 1, null);
            if (C33129mqd.valueOf(kbc.AEQbTJ(), "3")) {
                iDp2px$default = C55298xhM.dp2px$default(-6.0f, null, 1, null);
            } else {
                iDp2px$default = C55298xhM.dp2px$default(0.0f, null, 1, null);
            }
            layoutParams4.setMargins(iDp2px$default6, iDp2px$default7, iDp2px$default8, iDp2px$default);
        }
        if (C33129mqd.AEQbTJ(kbc.AEQbTJ(), "3")) {
            C55298xhM.dp2px$default(1.0f, null, 1, null);
        } else {
            C55298xhM.dp2px$default(0.0f, null, 1, null);
        }
        c22323hdG.gEmmrt.setText(C23319hvw.getFormattedNumberICU$default(java.lang.String.valueOf(kbc.djBIcL()), null, null, null, null, false, false, 63, null));
        c22323hdG.gEmmrt.setShadowLayer(12.0f, 0.0f, 0.0f, color);
        c22323hdG.djBIcL.setText(kbc.EZpvd());
        c22323hdG.AkhnZx.setText(kbc.AEQbTJ());
        c22323hdG.AkhnZx.setTextSize(C33129mqd.valueOf(kbc.AEQbTJ(), "3") ? 48.0f : 24.0f);
        c22323hdG.AhwBna.setText(C23319hvw.getFormattedNumberICU$default(java.lang.String.valueOf(kbc.djBIcL()), null, null, null, null, false, false, 63, null));
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C57406yhn.Activity.djBIcL);
        if (drawableKWHzl != null) {
            C33057mpK.copydefault(drawableKWHzl, color);
        } else {
            drawableKWHzl = null;
        }
        if (drawableKWHzl != null) {
            android.widget.ImageView imageView = c22323hdG.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.KWHzl(imageView, kbc.copydefault(), C55298xhM.dp2px$default(4.0f, null, 1, null), new C25385ivi(C33070mpX.KWHzl(C22366hdx.Application.EZpvd), null, 0.0f, 0, 14, null));
            c22323hdG.copydefault.setClipToOutline(true);
            android.widget.ImageView imageView2 = c22323hdG.copydefault;
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            android.widget.ImageView imageView3 = c22323hdG.OLrzqt;
            android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C23274hvD.ActionBar.hDKMBd);
            imageView3.setImageDrawable(drawableKWHzl2 != null ? C33057mpK.copydefault(drawableKWHzl2, color) : null);
            imageView2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        }
        android.widget.FrameLayout root = c22323hdG.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, kbc));
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ kBD KWHzl;
        public final /* synthetic */ kBC OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, kBD kbd, kBC kbc) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = kbd;
            this.OLrzqt = kbc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1<kBC, Unit> function1AEQbTJ = this.KWHzl.AEQbTJ();
                if (function1AEQbTJ != null) {
                    function1AEQbTJ.invoke(this.OLrzqt);
                }
            }
        }
    }
}
