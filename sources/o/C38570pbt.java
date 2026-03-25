package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.ui.IntroductionCoin;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pbt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38570pbt extends AbstractC59533zio<IntroductionCoin, StateListAnimator> {
    public Function1<? super java.lang.String, Unit> KWHzl;

    public C38570pbt(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX INFO: renamed from: o.pbt$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;
        public android.widget.TextView EZpvd;
        public android.widget.ImageView KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.fsw);
            this.EZpvd = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.dLBcXg);
            this.AEQbTJ = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.gmHjFq);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.QKudOq, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull IntroductionCoin introductionCoin) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(introductionCoin, "");
        android.widget.TextView textViewEZpvd = stateListAnimator.EZpvd();
        if (textViewEZpvd != null) {
            textViewEZpvd.setText(introductionCoin.getCoinValue());
        }
        android.widget.ImageView imageViewKWHzl = stateListAnimator.KWHzl();
        if (imageViewKWHzl != null) {
            C33054mpH.AEQbTJ(imageViewKWHzl, introductionCoin.getUrl());
        }
        android.widget.TextView textViewOLrzqt = stateListAnimator.OLrzqt();
        if (textViewOLrzqt != null) {
            textViewOLrzqt.setText(introductionCoin.getFullName());
        }
    }
}
