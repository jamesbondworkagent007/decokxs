package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bumptech.glide.Glide;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pYT extends LinearLayoutCompat {
    public static final ActionBar Companion = new ActionBar(null);
    public final int AEQbTJ;
    public final int KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pYT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null);
        this.KWHzl = C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null);
        setOrientation(0);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pYT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        removeAllViews();
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(qZH.Activity.AkhnZx);
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str2 = (java.lang.String) obj;
            android.widget.ImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setBackground(drawableKWHzl);
            int i2 = i == 0 ? 0 : -this.KWHzl;
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
            C55296xhK.AEQbTJ(layoutParams, i2, 0, 0, 0);
            appCompatImageView.setLayoutParams(layoutParams);
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(getContext());
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, str2, "lfit", 20, 20).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getContext())).djBIcL().EZpvd(appCompatImageView);
            addView(appCompatImageView);
            i++;
        }
        if (str.length() > 0) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setBackground(C33070mpX.KWHzl(qZH.Activity.DbNXlk));
            LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(-2, C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
            C55296xhK.AEQbTJ(layoutParams2, -this.KWHzl, 0, 0, 0);
            appCompatTextView.setPaddingRelative(this.AEQbTJ, 0, this.KWHzl, 0);
            appCompatTextView.setLayoutParams(layoutParams2);
            appCompatTextView.setGravity(17);
            appCompatTextView.setTextAppearance(C32113mPz.Dialog.ejfBZ);
            appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
            appCompatTextView.setText(str);
            addView(appCompatTextView);
        }
    }
}
