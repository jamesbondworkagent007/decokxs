package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.ExplainTitleData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class vZM extends AbstractC59533zio<ExplainTitleData, StateListAnimator> {

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public AppCompatTextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppCompatTextView copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.allOf);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.copydefault = (AppCompatTextView) viewFindViewById;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.OqCbbx, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull ExplainTitleData explainTitleData) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(explainTitleData, "");
        stateListAnimator.copydefault().setText(explainTitleData.getTitle());
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Float.valueOf(explainTitleData.getPadTop()), (java.lang.Object) 0)) {
            return;
        }
        AppCompatTextView appCompatTextViewCopydefault = stateListAnimator.copydefault();
        ViewGroup.LayoutParams layoutParams = appCompatTextViewCopydefault.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = C55298xhM.dp2px$default(explainTitleData.getPadTop(), null, 1, null);
            appCompatTextViewCopydefault.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }
}
