package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.dexkline.market.domain.model.cointag.CoinTag;
import com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperViewBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mXH extends mUT<mXB, C36075oOi> {
    public Function1<? super mXB, Unit> AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mXH(@NotNull Function1<? super mXB, Unit> function1) {
        super(SniperViewBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull mUU<C36075oOi> muu, @NotNull mXB mxb) {
        android.graphics.drawable.Drawable drawableCopydefault;
        Intrinsics.checkNotNullParameter(muu, "");
        Intrinsics.checkNotNullParameter(mxb, "");
        C36075oOi c36075oOi = (C36075oOi) muu.KWHzl();
        ConstraintLayout root = c36075oOi.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L));
        C32328mXy c32328mXyEZpvd = mXD.EZpvd(mxb.copydefault());
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(c32328mXyEZpvd.copydefault());
        java.lang.Integer numOLrzqt = c32328mXyEZpvd.OLrzqt();
        if (numOLrzqt != null) {
            drawableKWHzl = drawableKWHzl != null ? C33057mpK.copydefault(drawableKWHzl, mUM.copydefault(numOLrzqt.intValue())) : null;
        }
        c36075oOi.AEQbTJ.setImageDrawable(drawableKWHzl);
        loop0: while (true) {
            drawableCopydefault = null;
            for (CoinTag coinTag : mxb.OLrzqt()) {
                if (coinTag instanceof CoinTag.Snipers) {
                    android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C57406yhn.Activity.zsXlph);
                    drawableCopydefault = drawableKWHzl2 != null ? C33057mpK.copydefault(drawableKWHzl2, mUM.copydefault(C52761wXj.Activity.gdmIOq)) : null;
                }
                if ((coinTag instanceof CoinTag.Suspicious) && drawableCopydefault == null) {
                    android.graphics.drawable.Drawable drawableKWHzl3 = C33070mpX.KWHzl(C57406yhn.Activity.gHZMYf);
                    if (drawableKWHzl3 != null) {
                        drawableCopydefault = C33057mpK.copydefault(drawableKWHzl3, mUM.copydefault(C52761wXj.Activity.DQzvGN));
                    }
                }
            }
        }
        AppCompatImageView appCompatImageView = c36075oOi.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(drawableCopydefault != null ? 0 : 8);
        if (drawableCopydefault != null) {
            c36075oOi.copydefault.setImageDrawable(drawableCopydefault);
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j) {
            this.KWHzl = view;
            this.EZpvd = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
            }
        }
    }
}
