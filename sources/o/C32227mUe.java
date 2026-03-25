package o;

import androidx.core.content.ContextCompat;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.LabelExplanationItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32227mUe extends mUT<C32224mUb, oNA> {
    public C32227mUe() {
        super(LabelExplanationItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull mUU<oNA> muu, @NotNull C32224mUb c32224mUb) {
        Intrinsics.checkNotNullParameter(muu, "");
        Intrinsics.checkNotNullParameter(c32224mUb, "");
        oNA ona = (oNA) muu.KWHzl();
        if (c32224mUb.AEQbTJ() != null) {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(c32224mUb.AEQbTJ().intValue());
            if (drawableKWHzl != null) {
                C33057mpK.copydefault(drawableKWHzl, mUM.copydefault(C52761wXj.Activity.fdOvFl));
                ona.OLrzqt.setImageDrawable(drawableKWHzl);
            }
        } else {
            android.widget.ImageView imageView = ona.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            copydefault(imageView, c32224mUb.EZpvd(), c32224mUb.copydefault());
        }
        ona.EZpvd.setText(c32224mUb.KWHzl());
        ona.copydefault.setText(c32224mUb.OLrzqt());
    }

    private final void copydefault(final android.widget.ImageView imageView, java.lang.String str, final java.lang.Integer num) {
        android.graphics.drawable.Drawable drawable;
        if (num != null) {
            drawable = ContextCompat.getDrawable(imageView.getContext(), num.intValue());
        } else {
            drawable = null;
        }
        mUS.AEQbTJ(imageView, str, (AbstractC5396Qc[]) java.util.Arrays.copyOf(new AbstractC5396Qc[0], 0), drawable, new Function2() { // from class: o.mUd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C32227mUe.OLrzqt(num, imageView, (android.graphics.Bitmap) obj, (java.lang.Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(java.lang.Integer num, android.widget.ImageView imageView, android.graphics.Bitmap bitmap, java.lang.Throwable th) {
        imageView.setVisibility((th == null || num != null) ? 0 : 8);
        if (th != null && num != null) {
            imageView.setImageResource(num.intValue());
        }
        return Unit.INSTANCE;
    }
}
