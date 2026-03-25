package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19180fwS extends AbstractC59533zio<C18997fsv, C19179fwR> {
    public final Function1<C18997fsv, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C18997fsv, Unit> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsv, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19180fwS(@NotNull Function1<? super C18997fsv, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C19179fwR onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.GiPPlLRPuVlr, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C19179fwR(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C19179fwR c19179fwR, @NotNull C18997fsv c18997fsv) {
        Intrinsics.checkNotNullParameter(c19179fwR, "");
        Intrinsics.checkNotNullParameter(c18997fsv, "");
        android.view.View view = c19179fwR.itemView;
        view.setOnClickListener(new ActionBar(view, 1000L, this, c18997fsv));
        C14725dqq.copydefault(c19179fwR.KWHzl(), c18997fsv.KWHzl(), C52761wXj.TaskDescription.aHXSQp, new Function1() { // from class: o.fwQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19180fwS.OLrzqt(c19179fwR, (C5335Nt) obj);
            }
        }, 32.0f);
        c19179fwR.copydefault().setText(c18997fsv.KWHzl());
    }

    public static final Unit OLrzqt(C19179fwR c19179fwR, C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        android.content.Context context = c19179fwR.KWHzl().getContext();
        int i = C52761wXj.Activity.zuBGHE;
        android.content.Context context2 = c19179fwR.KWHzl().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C14641dpL(context, 8.0f, 1.0f, C33070mpX.OLrzqt(i, context2)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fwS$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C18997fsv EZpvd;
        public final /* synthetic */ C19180fwS KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C19180fwS c19180fwS, C18997fsv c18997fsv) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c19180fwS;
            this.EZpvd = c18997fsv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ().invoke(this.EZpvd);
            }
        }
    }
}
