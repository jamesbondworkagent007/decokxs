package o;

import android.view.View;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.OrderTypesItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lgP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30714lgP extends AbstractC25436iwg<C55276xgr, hHP> {
    public final Function1<C55276xgr, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.xgr, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30714lgP(@NotNull Function1<? super C55276xgr, Unit> function1) {
        super(OrderTypesItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    public static final Unit KWHzl(C30714lgP c30714lgP, C55276xgr c55276xgr, C55276xgr c55276xgr2) {
        Intrinsics.checkNotNullParameter(c55276xgr2, "");
        c30714lgP.KWHzl.invoke(c55276xgr);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hHP> c25435iwf, @NotNull final C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        OLrzqt((hHP) c25435iwf.EZpvd(), c55276xgr, new Function1() { // from class: o.lgT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30714lgP.KWHzl(this.AEQbTJ, c55276xgr, (C55276xgr) obj);
            }
        });
    }

    public final void OLrzqt(hHP hhp, final C55276xgr c55276xgr, final Function1<? super C55276xgr, Unit> function1) {
        final boolean z = c55276xgr.OLrzqt() != null && (c55276xgr.OLrzqt() instanceof java.lang.Boolean) && Intrinsics.EZpvd(c55276xgr.OLrzqt(), java.lang.Boolean.TRUE);
        android.widget.TextView textView = hhp.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        hhp.gEmmrt.setText(c55276xgr.AhwBna());
        android.widget.TextView textView2 = hhp.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        boolean z2 = !z;
        textView2.setVisibility(z2 ? 0 : 8);
        hhp.copydefault.setText(c55276xgr.AhwBna());
        android.widget.TextView textView3 = hhp.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(z2 ? 0 : 8);
        hhp.AEQbTJ.setText(c55276xgr.EZpvd());
        if (c55276xgr.AEQbTJ()) {
            android.widget.ImageView imageView = hhp.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
        } else if (z) {
            android.widget.ImageView imageView2 = hhp.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
        } else {
            android.widget.ImageView imageView3 = hhp.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(4);
        }
        if (c55276xgr.KWHzl() != null && (c55276xgr.KWHzl() instanceof java.lang.Integer)) {
            android.widget.ImageView imageView4 = hhp.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            imageView4.setVisibility(z2 ? 0 : 8);
            android.widget.ImageView imageView5 = hhp.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            java.lang.Object objKWHzl = c55276xgr.KWHzl();
            Intrinsics.copydefault(objKWHzl, "");
            C33054mpH.AEQbTJ(imageView5, (java.lang.Integer) objKWHzl);
        } else {
            android.widget.ImageView imageView6 = hhp.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView6, "");
            imageView6.setVisibility(8);
        }
        C55251xgS c55251xgS = hhp.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility((c55276xgr.AYXKKw() || z) ? 8 : 0);
        hhp.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lgR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30714lgP.KWHzl(c55276xgr, z, function1, view);
            }
        });
        android.widget.TextView textView4 = hhp.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        updateTint$default(this, textView4, c55276xgr.AYXKKw(), 0, 2, null);
        android.widget.TextView textView5 = hhp.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        KWHzl(textView5, c55276xgr.AYXKKw(), C52761wXj.Activity.QwvEab);
        android.widget.ImageView imageView7 = hhp.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView7, "");
        updateTint$default(this, imageView7, c55276xgr.AYXKKw(), 0, 2, null);
        hhp.getRoot().setContentDescription(c55276xgr.copydefault());
    }

    public static final void KWHzl(C55276xgr c55276xgr, boolean z, Function1 function1, android.view.View view) {
        if (!c55276xgr.AYXKKw() || z) {
            return;
        }
        function1.invoke(c55276xgr);
    }

    public static /* synthetic */ void updateTint$default(C30714lgP c30714lgP, android.view.View view, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        c30714lgP.KWHzl(view, z, i);
    }

    public final void KWHzl(android.view.View view, boolean z, @androidx.annotation.ColorRes int i) {
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (!z) {
                i = C52761wXj.Activity.UlJrfe;
            }
            textView.setTextColor(C25382ivf.KWHzl(i));
            return;
        }
        if (view instanceof android.widget.ImageView) {
            android.widget.ImageView imageView = (android.widget.ImageView) view;
            if (!z) {
                i = C52761wXj.Activity.UlJrfe;
            }
            imageView.setColorFilter(C25382ivf.KWHzl(i));
        }
    }
}
