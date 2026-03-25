package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.BotToMPRecommend;
import com.okinc.unify_trade.bot.data.BotToMPRecommendCard;
import com.okinc.unify_trade.bot.data.BotToMPViewMore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52497wNp extends AbstractC59533zio<BotToMPRecommendCard, StateListAnimator> {
    public final Function1<java.lang.String, Unit> AEQbTJ;
    public final Function0<Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52497wNp(@NotNull Function0<Unit> function0, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function0;
        this.AEQbTJ = function1;
    }

    /* JADX INFO: renamed from: o.wNp$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public RecyclerView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecyclerView OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.ResultReceiver1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (RecyclerView) viewFindViewById;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.pause, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull BotToMPRecommendCard botToMPRecommendCard) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(botToMPRecommendCard, "");
        android.view.View view = stateListAnimator.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(BotToMPRecommend.class, new C52496wNo(new Function1() { // from class: o.wNn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52497wNp.OLrzqt(this.copydefault, (java.lang.String) obj);
            }
        }));
        c43316rmw.register(BotToMPViewMore.class, new C52494wNm(new Function0() { // from class: o.wNq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52497wNp.OLrzqt(this.OLrzqt);
            }
        }));
        stateListAnimator.OLrzqt().setAdapter(c43316rmw);
        stateListAnimator.OLrzqt().setLayoutManager(new LinearLayoutManager(stateListAnimator.itemView.getContext(), 1, false));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<BotToMPRecommend> recommendList = botToMPRecommendCard.getRecommendList();
        if (recommendList != null) {
            arrayList.addAll(recommendList);
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(new BotToMPViewMore(null, 1, null));
        }
        c43316rmw.setItems(arrayList);
        c43316rmw.notifyDataSetChanged();
    }

    public static final Unit OLrzqt(C52497wNp c52497wNp, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c52497wNp.AEQbTJ.invoke(str);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52497wNp c52497wNp) {
        c52497wNp.OLrzqt.invoke();
        return Unit.INSTANCE;
    }
}
