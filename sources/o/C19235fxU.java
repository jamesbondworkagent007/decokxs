package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19235fxU extends AbstractC59533zio<C18990fso, C19231fxQ> {
    public java.lang.String AEQbTJ;
    public final Function1<C18990fso, Unit> EZpvd;
    public final C18955fsF KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fso, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19235fxU(@NotNull Function1<? super C18990fso, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
        this.AEQbTJ = "";
        this.KWHzl = new C18955fsF();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C19231fxQ onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DQnQnb, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C19231fxQ(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19231fxQ c19231fxQ, @NotNull final C18990fso c18990fso) {
        Intrinsics.checkNotNullParameter(c19231fxQ, "");
        Intrinsics.checkNotNullParameter(c18990fso, "");
        android.widget.ImageView imageViewOLrzqt = c19231fxQ.OLrzqt();
        java.lang.String strAEQbTJ = c18990fso.AEQbTJ();
        int i = C52761wXj.TaskDescription.aHXSQp;
        int i2 = C52761wXj.Activity.zuBGHE;
        android.content.Context context = c19231fxQ.OLrzqt().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C14725dqq.loadFixSizeBorderImage$default(imageViewOLrzqt, strAEQbTJ, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context), false, 32, null);
        android.widget.TextView textViewAEQbTJ = c19231fxQ.AEQbTJ();
        C18955fsF c18955fsF = this.KWHzl;
        java.lang.String strGEmmrt = c18990fso.gEmmrt();
        java.lang.String str = this.AEQbTJ;
        android.content.Context context2 = c19231fxQ.AEQbTJ().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textViewAEQbTJ.setText(c18955fsF.EZpvd(strGEmmrt, str, context2));
        android.widget.TextView textViewEZpvd = c19231fxQ.EZpvd();
        C18955fsF c18955fsF2 = this.KWHzl;
        java.lang.String strKWHzl = c18990fso.KWHzl();
        java.lang.String str2 = this.AEQbTJ;
        android.content.Context context3 = c19231fxQ.EZpvd().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        textViewEZpvd.setText(c18955fsF2.EZpvd(strKWHzl, str2, context3));
        c19231fxQ.valueOf().setText(C13821dZn.EZpvd.KWHzl(c18990fso.OLrzqt()));
        c19231fxQ.copydefault().setVisibility(8);
        c19231fxQ.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fxW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C19235fxU.OLrzqt(this.KWHzl, c18990fso, view);
            }
        });
    }

    public static final void OLrzqt(C19235fxU c19235fxU, C18990fso c18990fso, android.view.View view) {
        c19235fxU.EZpvd.invoke(c18990fso);
    }
}
