package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10250bks extends AbstractC59533zio<C10219bkN, C10223bkR> {
    public final Function1<java.lang.Integer, Unit> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C10250bks(@NotNull java.lang.String str, Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C10223bkR onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16845erc abstractC16845ercCopydefault = AbstractC16845erc.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16845ercCopydefault, "");
        final C10223bkR c10223bkR = new C10223bkR(abstractC16845ercCopydefault);
        abstractC16845ercCopydefault.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.bkw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C10250bks.OLrzqt(c10223bkR, this, view);
            }
        });
        return c10223bkR;
    }

    public static final void OLrzqt(C10223bkR c10223bkR, C10250bks c10250bks, android.view.View view) {
        int adapterPosition = c10223bkR.getAdapterPosition();
        Function1<java.lang.Integer, Unit> function1 = c10250bks.OLrzqt;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(adapterPosition));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C10223bkR c10223bkR, @NotNull C10219bkN c10219bkN) {
        Intrinsics.checkNotNullParameter(c10223bkR, "");
        Intrinsics.checkNotNullParameter(c10219bkN, "");
        c10223bkR.AEQbTJ(c10219bkN, this.copydefault);
    }
}
