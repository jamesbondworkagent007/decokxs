package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eZk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15899eZk extends AbstractC59533zio<eWM, C15897eZi> {
    public final Function1<eWM, Unit> AEQbTJ;
    public final Function2<eWM, android.view.View, Unit> EZpvd;
    public boolean OLrzqt;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.eZk$Activity */
    public static final class Activity {
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        public Activity(boolean z) {
            this.KWHzl = z;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.eWM, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super o.eWM, ? super android.view.View, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C15899eZk(@NotNull Function1<? super eWM, Unit> function1, @NotNull Function2<? super eWM, ? super android.view.View, Unit> function2, boolean z) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = function1;
        this.EZpvd = function2;
        this.copydefault = z;
        this.OLrzqt = true;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C15897eZi onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16702eos c16702eosAEQbTJ = C16702eos.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16702eosAEQbTJ, "");
        return new C15897eZi(c16702eosAEQbTJ, this.OLrzqt, this.AEQbTJ, this.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C15897eZi c15897eZi, @NotNull eWM ewm) {
        Intrinsics.checkNotNullParameter(c15897eZi, "");
        Intrinsics.checkNotNullParameter(ewm, "");
        c15897eZi.EZpvd(ewm, this.copydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C15897eZi c15897eZi, @NotNull eWM ewm, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c15897eZi, "");
        Intrinsics.checkNotNullParameter(ewm, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!(!list.isEmpty())) {
            super.onBindViewHolder(c15897eZi, ewm, list);
            return;
        }
        for (java.lang.Object obj : list) {
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                this.copydefault = activity.AEQbTJ();
                c15897eZi.KWHzl(ewm, activity.AEQbTJ());
            }
        }
    }
}
