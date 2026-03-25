package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.chatsettings.AutoDownloadOption;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35482nwG;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nwG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35482nwG extends RecyclerView.Adapter<TaskDescription> {
    public final AutoDownloadOption[] AEQbTJ;
    public final Function1<AutoDownloadOption, Unit> EZpvd;
    public AutoDownloadOption KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.im.imui.chatsettings.AutoDownloadOption, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C35482nwG(@NotNull AutoDownloadOption autoDownloadOption, @NotNull Function1<? super AutoDownloadOption, Unit> function1) {
        Intrinsics.checkNotNullParameter(autoDownloadOption, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = autoDownloadOption;
        this.EZpvd = function1;
        this.AEQbTJ = AutoDownloadOption.values();
    }

    /* JADX INFO: renamed from: o.nwG$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final OKRegularCell AEQbTJ;
        public final /* synthetic */ C35482nwG EZpvd;
        public android.widget.ImageView KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C35482nwG c35482nwG, OKRegularCell oKRegularCell) {
            super(oKRegularCell);
            Intrinsics.checkNotNullParameter(oKRegularCell, "");
            this.EZpvd = c35482nwG;
            this.AEQbTJ = oKRegularCell;
        }

        public final void AEQbTJ(@NotNull final AutoDownloadOption autoDownloadOption, boolean z) {
            Intrinsics.checkNotNullParameter(autoDownloadOption, "");
            OKRegularCell oKRegularCell = this.AEQbTJ;
            final C35482nwG c35482nwG = this.EZpvd;
            java.lang.String string = oKRegularCell.getContext().getString(autoDownloadOption.getTitleResId());
            Intrinsics.checkNotNullExpressionValue(string, "");
            oKRegularCell.setTitle(string);
            android.widget.ImageView imageView = this.KWHzl;
            if (imageView != null) {
                oKRegularCell.removeView(imageView);
            }
            android.widget.ImageView imageView2 = new android.widget.ImageView(oKRegularCell.getContext());
            imageView2.setImageResource(z ? C52761wXj.TaskDescription.gqESXP : C52761wXj.TaskDescription.dbwnZN);
            imageView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            this.KWHzl = imageView2;
            oKRegularCell.addView(imageView2);
            oKRegularCell.setOnClickListener(new View.OnClickListener() { // from class: o.nwI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C35482nwG.TaskDescription.OLrzqt(c35482nwG, autoDownloadOption, this, view);
                }
            });
        }

        public static final void OLrzqt(C35482nwG c35482nwG, AutoDownloadOption autoDownloadOption, TaskDescription taskDescription, android.view.View view) {
            if (c35482nwG.KWHzl != autoDownloadOption) {
                int iGEmmrt = yDV.gEmmrt(c35482nwG.AEQbTJ, c35482nwG.KWHzl);
                c35482nwG.KWHzl = autoDownloadOption;
                c35482nwG.notifyItemChanged(iGEmmrt);
                c35482nwG.notifyItemChanged(taskDescription.getAdapterPosition());
                c35482nwG.EZpvd.invoke(autoDownloadOption);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        OKRegularCell oKRegularCell = new OKRegularCell(context, null, 0, 6, null);
        oKRegularCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        oKRegularCell.setCellStyle(0);
        return new TaskDescription(this, oKRegularCell);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AutoDownloadOption autoDownloadOption = this.AEQbTJ[i];
        taskDescription.AEQbTJ(autoDownloadOption, autoDownloadOption == this.KWHzl);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.length;
    }
}
