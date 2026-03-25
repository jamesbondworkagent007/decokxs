package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.ui.screens.home.binder.PointsProductItemBinder$1;
import com.okinc.business.invest_biz.ui.widget.SpanningLinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26510jdg extends AbstractC27119jpF<C26522jds, C23759iIg> {
    public final Function0<android.app.Activity> AEQbTJ;
    public final Function1<C26526jdw, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends android.app.Activity> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.jdw, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26510jdg(@NotNull Function0<? extends android.app.Activity> function0, @NotNull Function1<? super C26526jdw, Unit> function1) {
        super(PointsProductItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function0;
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23759iIg c23759iIg, @NotNull C26522jds c26522jds) {
        Intrinsics.checkNotNullParameter(c23759iIg, "");
        Intrinsics.checkNotNullParameter(c26522jds, "");
        c23759iIg.OLrzqt.setData(c26522jds.AEQbTJ(), this.AEQbTJ, this.EZpvd);
        RecyclerView recyclerView = c23759iIg.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(c26522jds.KWHzl().isEmpty() ^ true ? 0 : 8);
        if (!c26522jds.KWHzl().isEmpty()) {
            AEQbTJ(c23759iIg, c26522jds.KWHzl());
        }
    }

    public final void AEQbTJ(C23759iIg c23759iIg, java.util.List<C26449jcY> list) {
        android.content.Context context = c23759iIg.getRoot().getContext();
        C26504jda c26504jda = new C26504jda();
        c23759iIg.AEQbTJ.setAdapter(c26504jda);
        ConstraintLayout root = c23759iIg.getRoot();
        Intrinsics.copydefault(context);
        root.setPaddingRelative(C55298xhM.copydefault(24.0f, context), C55298xhM.copydefault(12.0f, context), C55298xhM.copydefault(24.0f, context), C55298xhM.copydefault(0.0f, context));
        c23759iIg.EZpvd.setBackground(C27569jxf.generateSolidBackground$default(C27569jxf.OLrzqt, context, 4, java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialaKhcqp), 0.0f, null, 24, null));
        c23759iIg.EZpvd.setPaddingRelative(C55298xhM.copydefault(12.0f, context), C55298xhM.copydefault(10.0f, context), C55298xhM.copydefault(12.0f, context), C55298xhM.copydefault(12.0f, context));
        c23759iIg.AEQbTJ.setLayoutManager(new SpanningLinearLayoutManager(context, 0, C55298xhM.copydefault(16.0f, context), C55298xhM.copydefault(128.0f, context), 0, 16, null));
        AbstractC27470jvm.setData$default(c26504jda, list, null, 2, null);
    }
}
