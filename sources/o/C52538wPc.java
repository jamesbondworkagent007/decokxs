package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52538wPc extends AbstractC59533zio<BotParamItemData, Application> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.HJWChPUUMfbK, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new Application((AbstractC50773vaV) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull BotParamItemData botParamItemData) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(botParamItemData, "");
        AbstractC50773vaV abstractC50773vaVKWHzl = application.KWHzl();
        abstractC50773vaVKWHzl.AEQbTJ.setText(botParamItemData.getTitle());
        abstractC50773vaVKWHzl.KWHzl.setText(botParamItemData.getText());
        abstractC50773vaVKWHzl.KWHzl.setTextColor(botParamItemData.getTextColor());
        if (application.getBindingAdapterPosition() % 3 == 2) {
            abstractC50773vaVKWHzl.AEQbTJ.setGravity(8388613);
            abstractC50773vaVKWHzl.KWHzl.setGravity(8388613);
        } else {
            abstractC50773vaVKWHzl.AEQbTJ.setGravity(8388611);
            abstractC50773vaVKWHzl.KWHzl.setGravity(8388611);
        }
    }

    /* JADX INFO: renamed from: o.wPc$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final AbstractC50773vaV EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC50773vaV KWHzl() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AbstractC50773vaV abstractC50773vaV) {
            super(abstractC50773vaV.getRoot());
            Intrinsics.checkNotNullParameter(abstractC50773vaV, "");
            this.EZpvd = abstractC50773vaV;
        }
    }
}
