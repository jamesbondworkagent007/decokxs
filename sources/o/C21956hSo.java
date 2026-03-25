package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.LabelExplanationItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hSo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21956hSo extends AbstractC25436iwg<C21961hSt, C23484hzB> {
    public C21956hSo() {
        super(LabelExplanationItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C23484hzB> c25435iwf, @NotNull C21961hSt c21961hSt) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c21961hSt, "");
        C23484hzB c23484hzB = (C23484hzB) c25435iwf.EZpvd();
        if (c21961hSt.KWHzl() != null) {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(c21961hSt.KWHzl().intValue());
            if (drawableKWHzl != null) {
                C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                c23484hzB.EZpvd.setImageDrawable(drawableKWHzl);
            }
        } else {
            android.widget.ImageView imageView = c23484hzB.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            AEQbTJ(imageView, c21961hSt.AEQbTJ(), c21961hSt.OLrzqt());
        }
        if (c21961hSt.copydefault()) {
            c23484hzB.EZpvd.setImageTintList(C25382ivf.copydefault(C52761wXj.Activity.fdOvFl));
        }
        c23484hzB.KWHzl.setText(c21961hSt.gEmmrt());
        c23484hzB.OLrzqt.setText(c21961hSt.EZpvd());
    }

    public final void AEQbTJ(final android.widget.ImageView imageView, java.lang.String str, final java.lang.Integer num) {
        android.graphics.drawable.Drawable drawable;
        if (num != null) {
            drawable = ContextCompat.getDrawable(imageView.getContext(), num.intValue());
        } else {
            drawable = null;
        }
        C25392ivp.AEQbTJ(imageView, str, (AbstractC5396Qc[]) java.util.Arrays.copyOf(new AbstractC5396Qc[0], 0), drawable, (Function2<? super android.graphics.Bitmap, ? super java.lang.Throwable, Unit>) new Function2() { // from class: o.hSr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C21956hSo.OLrzqt(num, imageView, (android.graphics.Bitmap) obj, (java.lang.Throwable) obj2);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.Integer num, android.widget.ImageView imageView, android.graphics.Bitmap bitmap, java.lang.Throwable th) {
        imageView.setVisibility((th == null || num != null) ? 0 : 8);
        if (th != null && num != null) {
            imageView.setImageResource(num.intValue());
        }
        return Unit.INSTANCE;
    }
}
