package o;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class uJS extends androidx.recyclerview.widget.ListAdapter<uJO, C48248uKl> {
    public final uJM AEQbTJ;
    public final Function1<java.lang.String, TacticsData> KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, com.okinc.unify_trade.bot.data.TacticsData> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uJS(@NotNull uJM ujm, boolean z, @NotNull Function1<? super java.lang.String, TacticsData> function1) {
        super(uJP.OLrzqt);
        Intrinsics.checkNotNullParameter(ujm, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = ujm;
        this.copydefault = z;
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C48248uKl onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        return new C48248uKl(composeView, this.AEQbTJ, this.copydefault, this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C48248uKl c48248uKl, int i) {
        Intrinsics.checkNotNullParameter(c48248uKl, "");
        uJO item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        c48248uKl.KWHzl(item);
    }
}
