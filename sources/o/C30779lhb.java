package o;

import android.view.View;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.limit.AdvancedLimitOrderByItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30779lhb extends AbstractC25436iwg<C55276xgr, hHR> {
    public final Function1<C55276xgr, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.xgr, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30779lhb(@NotNull Function1<? super C55276xgr, Unit> function1) {
        super(AdvancedLimitOrderByItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    public static final Unit AEQbTJ(C30779lhb c30779lhb, C55276xgr c55276xgr, C55276xgr c55276xgr2) {
        Intrinsics.checkNotNullParameter(c55276xgr2, "");
        c30779lhb.OLrzqt.invoke(c55276xgr);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hHR> c25435iwf, @NotNull final C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        AEQbTJ((hHR) c25435iwf.EZpvd(), c55276xgr, new Function1() { // from class: o.lgZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30779lhb.AEQbTJ(this.EZpvd, c55276xgr, (C55276xgr) obj);
            }
        });
    }

    private final void AEQbTJ(hHR hhr, final C55276xgr c55276xgr, final Function1<? super C55276xgr, Unit> function1) {
        hhr.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lha
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30779lhb.OLrzqt(c55276xgr, function1, view);
            }
        });
        hhr.KWHzl.setText(c55276xgr.AhwBna());
        android.widget.ImageView imageView = hhr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(c55276xgr.AEQbTJ() ^ true ? 4 : 0);
        hhr.KWHzl.setTextColor(C25382ivf.KWHzl(c55276xgr.AYXKKw() ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe));
    }

    public static final void OLrzqt(C55276xgr c55276xgr, Function1 function1, android.view.View view) {
        if (c55276xgr.AYXKKw()) {
            function1.invoke(c55276xgr);
        }
    }
}
