package o;

import android.view.View;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedAmountValueItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lfR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C30663lfR extends AbstractC25436iwg<C55276xgr, hHR> {
    public final Function1<C55276xgr, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.xgr, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30663lfR(@NotNull Function1<? super C55276xgr, Unit> function1) {
        super(AdvancedAmountValueItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    public static final Unit EZpvd(C30663lfR c30663lfR, C55276xgr c55276xgr, C55276xgr c55276xgr2) {
        Intrinsics.checkNotNullParameter(c55276xgr2, "");
        c30663lfR.KWHzl.invoke(c55276xgr);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hHR> c25435iwf, @NotNull final C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        copydefault((hHR) c25435iwf.EZpvd(), c55276xgr, new Function1() { // from class: o.lfT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30663lfR.EZpvd(this.AEQbTJ, c55276xgr, (C55276xgr) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, C55276xgr c55276xgr, android.view.View view) {
        function1.invoke(c55276xgr);
    }

    public final void copydefault(hHR hhr, final C55276xgr c55276xgr, final Function1<? super C55276xgr, Unit> function1) {
        hhr.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lfS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30663lfR.AEQbTJ(function1, c55276xgr, view);
            }
        });
        hhr.KWHzl.setText(c55276xgr.AhwBna());
        android.widget.ImageView imageView = hhr.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(c55276xgr.AEQbTJ() ^ true ? 4 : 0);
    }
}
