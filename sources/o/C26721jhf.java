package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.PointSectionInfoBinder$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26721jhf extends AbstractC27119jpF<InterfaceC24178iXu.FragmentManager, iLK> {
    public final InterfaceC56387yDm EZpvd;

    public C26721jhf() {
        super(PointSectionInfoBinder$1.INSTANCE);
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jhg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26721jhf.AEQbTJ();
            }
        });
    }

    public final C26724jhi copydefault() {
        return (C26724jhi) this.EZpvd.getValue();
    }

    public static final C26724jhi AEQbTJ() {
        return new C26724jhi();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iLK ilk, @NotNull InterfaceC24178iXu.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(ilk, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        RecyclerView recyclerView = ilk.copydefault;
        recyclerView.setAdapter(copydefault());
        int color = recyclerView.getContext().getColor(C52761wXj.Activity.aBDePw);
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        recyclerView.addItemDecoration(new C31703mAu(color, C55298xhM.copydefault(16.0f, context), recyclerView.getContext().getColor(C52761wXj.Activity.aBDePw), 0));
        C27588jxy.AEQbTJ(copydefault(), fragmentManager.copydefault().KWHzl());
    }
}
