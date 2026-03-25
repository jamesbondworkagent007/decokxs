package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eZx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15912eZx extends AbstractC59533zio<eWR, C15913eZy> {
    public boolean AEQbTJ;
    public boolean EZpvd;
    public final Function1<eWR, Unit> KWHzl;
    public final Function2<eWR, android.view.View, Unit> OLrzqt;
    public final Function1<eWR, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.eWR, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.eWR, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super o.eWR, ? super android.view.View, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C15912eZx(@NotNull Function1<? super eWR, Unit> function1, @NotNull Function1<? super eWR, Unit> function12, @NotNull Function2<? super eWR, ? super android.view.View, Unit> function2, boolean z) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = function1;
        this.KWHzl = function12;
        this.OLrzqt = function2;
        this.AEQbTJ = z;
        this.EZpvd = true;
    }

    /* JADX INFO: renamed from: o.eZx$Application */
    public static final class Application {
        public final boolean AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.AEQbTJ;
        }

        public Application(boolean z) {
            this.AEQbTJ = z;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C15913eZy onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17170exj c17170exjEZpvd = C17170exj.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17170exjEZpvd, "");
        return new C15913eZy(c17170exjEZpvd, this.EZpvd, this.KWHzl, this.copydefault, this.OLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C15913eZy c15913eZy, @NotNull eWR ewr) {
        Intrinsics.checkNotNullParameter(c15913eZy, "");
        Intrinsics.checkNotNullParameter(ewr, "");
        c15913eZy.AEQbTJ(ewr, this.AEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C15913eZy c15913eZy, @NotNull eWR ewr, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c15913eZy, "");
        Intrinsics.checkNotNullParameter(ewr, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!(!list.isEmpty())) {
            super.onBindViewHolder(c15913eZy, ewr, list);
            return;
        }
        for (java.lang.Object obj : list) {
            if (obj instanceof Application) {
                Application application = (Application) obj;
                this.AEQbTJ = application.KWHzl();
                c15913eZy.KWHzl(ewr, application.KWHzl());
            }
        }
    }
}
