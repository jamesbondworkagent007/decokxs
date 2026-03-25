package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53151wgA extends AbstractC59533zio<ExplainItemModel, StateListAnimator> {
    public final android.content.Context AEQbTJ;

    public C53151wgA(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.fkESqH, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull ExplainItemModel explainItemModel) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(explainItemModel, "");
        stateListAnimator.OLrzqt().setText(explainItemModel.KWHzl());
        stateListAnimator.EZpvd().setText(explainItemModel.AEQbTJ());
        stateListAnimator.OLrzqt().setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) explainItemModel.KWHzl()) ^ true ? 0 : 8);
        stateListAnimator.EZpvd().setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) explainItemModel.AEQbTJ()) ^ true ? 0 : 8);
        stateListAnimator.EZpvd().setTextColor(C33070mpX.copydefault(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) explainItemModel.KWHzl()) ^ true ? C32113mPz.ActionBar.hDKMBd : C32113mPz.ActionBar.zLjUOn));
    }

    /* JADX INFO: renamed from: o.wgA$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;
        public android.widget.TextView EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.QjzqRB);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.OEsIKP);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById2;
        }
    }
}
