package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19228fxN extends AbstractC59533zio<C18999fsx, C19231fxQ> {
    public final Function1<C18999fsx, Unit> EZpvd;
    public final C18955fsF OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsx, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19228fxN(@NotNull Function1<? super C18999fsx, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
        this.copydefault = "";
        this.OLrzqt = new C18955fsF();
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
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19231fxQ c19231fxQ, @NotNull final C18999fsx c18999fsx) {
        Intrinsics.checkNotNullParameter(c19231fxQ, "");
        Intrinsics.checkNotNullParameter(c18999fsx, "");
        c19231fxQ.copydefault().setVisibility(8);
        android.widget.ImageView imageViewOLrzqt = c19231fxQ.OLrzqt();
        java.lang.String strAEQbTJ = c18999fsx.AEQbTJ();
        int i = C52761wXj.TaskDescription.aHXSQp;
        int i2 = C52761wXj.Activity.zuBGHE;
        android.content.Context context = c19231fxQ.OLrzqt().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C14725dqq.loadFixSizeBorderImage$default(imageViewOLrzqt, strAEQbTJ, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context), false, 32, null);
        android.widget.TextView textViewAEQbTJ = c19231fxQ.AEQbTJ();
        C18955fsF c18955fsF = this.OLrzqt;
        java.lang.String strCopydefault = c18999fsx.copydefault();
        java.lang.String str = this.copydefault;
        android.content.Context context2 = c19231fxQ.AEQbTJ().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textViewAEQbTJ.setText(c18955fsF.EZpvd(strCopydefault, str, context2));
        android.widget.TextView textViewEZpvd = c19231fxQ.EZpvd();
        C18955fsF c18955fsF2 = this.OLrzqt;
        java.lang.String strKWHzl = c18999fsx.KWHzl();
        java.lang.String str2 = this.copydefault;
        android.content.Context context3 = c19231fxQ.EZpvd().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        textViewEZpvd.setText(c18955fsF2.EZpvd(strKWHzl, str2, context3));
        c19231fxQ.valueOf().setText(C54862xYb.OLrzqt(C33129mqd.AYXKKw(java.lang.Integer.valueOf(c18999fsx.AYXKKw()))));
        c19231fxQ.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fxO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C19228fxN.AEQbTJ(this.OLrzqt, c18999fsx, view);
            }
        });
    }

    public static final void AEQbTJ(C19228fxN c19228fxN, C18999fsx c18999fsx, android.view.View view) {
        c19228fxN.EZpvd.invoke(c18999fsx);
    }
}
