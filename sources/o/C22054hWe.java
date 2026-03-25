package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22054hWe extends AbstractC59533zio<C22023hVa, Application> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21478hAw c21478hAwKWHzl = C21478hAw.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21478hAwKWHzl, "");
        return new Application(c21478hAwKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull C22023hVa c22023hVa) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c22023hVa, "");
        if (Intrinsics.EZpvd((java.lang.Object) c22023hVa.KWHzl().getReceiveTokenStatus(), (java.lang.Object) "3")) {
            application.OLrzqt().OLrzqt.setGasFee(c22023hVa.KWHzl().getGasDropFromAmountFormat(), c22023hVa.KWHzl().getReceiveAmountFormat());
        } else {
            application.OLrzqt().OLrzqt.setGasUnInitialization();
        }
    }

    /* JADX INFO: renamed from: o.hWe$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final C21478hAw EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21478hAw OLrzqt() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C21478hAw c21478hAw) {
            super(c21478hAw.getRoot());
            Intrinsics.checkNotNullParameter(c21478hAw, "");
            this.EZpvd = c21478hAw;
        }
    }
}
