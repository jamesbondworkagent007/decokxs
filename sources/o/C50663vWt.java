package o;

import android.view.View;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.AccountShow;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vWt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50663vWt extends AbstractC59533zio<AccountShow, C50664vWu> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C50664vWu onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uRA uraAEQbTJ = uRA.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(uraAEQbTJ, "");
        return new C50664vWu(uraAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C50664vWu c50664vWu, @NotNull AccountShow accountShow) {
        Intrinsics.checkNotNullParameter(c50664vWu, "");
        Intrinsics.checkNotNullParameter(accountShow, "");
        c50664vWu.KWHzl().EZpvd.EZpvd().setTextAppearance(C52761wXj.LoaderManager.giSNqX);
        c50664vWu.KWHzl().EZpvd.setTitle(accountShow.getTitle());
        c50664vWu.KWHzl().EZpvd.setDescription(accountShow.getAvailable());
        c50664vWu.KWHzl().KWHzl.setSelected(accountShow.getSelect());
        android.view.View view = c50664vWu.itemView;
        view.setOnClickListener(new Activity(view, 1000L, accountShow, this));
    }

    /* JADX INFO: renamed from: o.vWt$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C50663vWt AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ AccountShow KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, AccountShow accountShow, C50663vWt c50663vWt) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = accountShow;
            this.AEQbTJ = c50663vWt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.setSelect(!r7.getSelect());
                this.AEQbTJ.getAdapter().notifyDataSetChanged();
            }
        }
    }
}
