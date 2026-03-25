package o;

import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.AccountConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vWr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50661vWr extends AbstractC59533zio<AccountConfig, C50665vWv> {
    public final ItemTouchHelper EZpvd;

    public C50661vWr(@NotNull ItemTouchHelper itemTouchHelper) {
        Intrinsics.checkNotNullParameter(itemTouchHelper, "");
        this.EZpvd = itemTouchHelper;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C50665vWv onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C48445uRr c48445uRrOLrzqt = C48445uRr.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c48445uRrOLrzqt, "");
        return new C50665vWv(c48445uRrOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C50665vWv c50665vWv, @NotNull AccountConfig accountConfig) {
        Intrinsics.checkNotNullParameter(c50665vWv, "");
        Intrinsics.checkNotNullParameter(accountConfig, "");
        c50665vWv.AEQbTJ().copydefault.setTitle(accountConfig.getTitle());
        c50665vWv.AEQbTJ().copydefault.setDescription(accountConfig.getAvailable());
        android.widget.ImageView imageView = c50665vWv.AEQbTJ().KWHzl;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this, c50665vWv));
        c50665vWv.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vWw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C50661vWr.copydefault(this.copydefault, c50665vWv, view);
            }
        });
    }

    public static final boolean copydefault(C50661vWr c50661vWr, C50665vWv c50665vWv, android.view.View view) {
        c50661vWr.EZpvd.startDrag(c50665vWv);
        return true;
    }

    /* JADX INFO: renamed from: o.vWr$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50665vWv KWHzl;
        public final /* synthetic */ C50661vWr OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50661vWr c50661vWr, C50665vWv c50665vWv) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c50661vWr;
            this.KWHzl = c50665vWv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.EZpvd.startDrag(this.KWHzl);
            }
        }
    }
}
