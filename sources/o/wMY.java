package o;

import android.view.View;
import com.okinc.unify_trade.bot.data.TacticsClickableInsideItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wMY extends AbstractC59533zio<TacticsClickableInsideItemData, C52482wNa> {
    public final Function1<java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> AEQbTJ() {
        return this.KWHzl;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ wMY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, wMY wmy) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = wmy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1<java.lang.String, Unit> function1AEQbTJ = this.copydefault.AEQbTJ();
                if (function1AEQbTJ != null) {
                    function1AEQbTJ.invoke("price_setting");
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public wMY(Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C52482wNa onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.resume, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C52482wNa(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52482wNa c52482wNa, @NotNull TacticsClickableInsideItemData tacticsClickableInsideItemData) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        Intrinsics.checkNotNullParameter(c52482wNa, "");
        Intrinsics.checkNotNullParameter(tacticsClickableInsideItemData, "");
        C55312xha c55312xhaValueOf = c52482wNa.OLrzqt().valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setText(tacticsClickableInsideItemData.getTitle());
        }
        C55312xha c55312xhaValueOf2 = c52482wNa.copydefault().valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl.setText(tacticsClickableInsideItemData.getText());
        }
        C55258xgZ c55258xgZCopydefault = c52482wNa.copydefault();
        c55258xgZCopydefault.setOnClickListener(new ActionBar(c55258xgZCopydefault, 1000L, this));
    }
}
