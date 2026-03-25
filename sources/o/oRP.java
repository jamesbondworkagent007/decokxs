package o;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C38307pTy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oRP extends androidx.recyclerview.widget.ListAdapter<IndexComponent, TaskDescription> {
    public oRP() {
        super(ActionBar.KWHzl);
    }

    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final /* synthetic */ oRP AEQbTJ;
        public final android.widget.TextView EZpvd;
        public final android.widget.TextView KWHzl;
        public final android.widget.TextView OLrzqt;
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull oRP orp, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = orp;
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.newPercentageRating);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C35964oKf.StateListAnimator.scaleBitmap);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C35964oKf.StateListAnimator.setShuffleMode);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C35964oKf.StateListAnimator.MediaSessionCompat1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.copydefault = (android.widget.TextView) viewFindViewById4;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C35964oKf.Application.hrNTAI, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new TaskDescription(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        IndexComponent item = getItem(i);
        taskDescription.KWHzl().setText(item.getExch());
        taskDescription.OLrzqt().setText(item.getSymbol());
        int iGkJEwt = C36246oUr.copydefault().gkJEwt();
        android.widget.TextView textViewCopydefault = taskDescription.copydefault();
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(item.getCnvPx());
        C38307pTy.Application application = C38307pTy.Companion;
        textViewCopydefault.setText(pTB.formatICUNumber$default(bigDecimalEZpvd, null, application.EZpvd(iGkJEwt), null, null, 13, null));
        taskDescription.AEQbTJ().setText(pTB.formatICUPercent$default(C33129mqd.EZpvd(item.getWgt()), RoundingMode.HALF_UP, application.AEQbTJ(2), null, java.lang.Double.valueOf(100.0d), null, 20, null));
    }

    public static final class ActionBar extends DiffUtil.ItemCallback<IndexComponent> {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull IndexComponent indexComponent, @NotNull IndexComponent indexComponent2) {
            Intrinsics.checkNotNullParameter(indexComponent, "");
            Intrinsics.checkNotNullParameter(indexComponent2, "");
            return Intrinsics.EZpvd((java.lang.Object) indexComponent.getExch(), (java.lang.Object) indexComponent2.getExch()) && Intrinsics.EZpvd((java.lang.Object) indexComponent.getSymbol(), (java.lang.Object) indexComponent2.getSymbol());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull IndexComponent indexComponent, @NotNull IndexComponent indexComponent2) {
            Intrinsics.checkNotNullParameter(indexComponent, "");
            Intrinsics.checkNotNullParameter(indexComponent2, "");
            return Intrinsics.EZpvd(indexComponent, indexComponent2);
        }
    }
}
