package o;

import android.view.View;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19230fxP extends AbstractC59533zio<C18978fsc, C19231fxQ> {
    public java.lang.String AEQbTJ;
    public final Function1<C18978fsc, Unit> EZpvd;
    public final C18955fsF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsc, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19230fxP(@NotNull Function1<? super C18978fsc, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
        this.AEQbTJ = "";
        this.copydefault = new C18955fsF();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C19231fxQ onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.sILrnl, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C19231fxQ(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19231fxQ c19231fxQ, @NotNull final C18978fsc c18978fsc) {
        android.widget.ImageView imageViewKWHzl;
        Intrinsics.checkNotNullParameter(c19231fxQ, "");
        Intrinsics.checkNotNullParameter(c18978fsc, "");
        android.widget.ImageView imageViewOLrzqt = c19231fxQ.OLrzqt();
        java.lang.String strAhwBna = c18978fsc.AhwBna();
        int i = C52761wXj.TaskDescription.aHXSQp;
        int i2 = C52761wXj.Activity.zuBGHE;
        android.content.Context context = c19231fxQ.OLrzqt().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C14725dqq.loadFixSizeBorderImage$default(imageViewOLrzqt, strAhwBna, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context), false, 32, null);
        java.lang.String strKWHzl = c18978fsc.KWHzl();
        boolean z = !(strKWHzl == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl));
        android.widget.ImageView imageViewKWHzl2 = c19231fxQ.KWHzl();
        if (imageViewKWHzl2 != null) {
            imageViewKWHzl2.setVisibility(z ? 0 : 8);
        }
        if (z && (imageViewKWHzl = c19231fxQ.KWHzl()) != null) {
            java.lang.String strKWHzl2 = c18978fsc.KWHzl();
            int i3 = C52761wXj.TaskDescription.aHXSQp;
            int i4 = C52761wXj.Activity.zuBGHE;
            android.widget.ImageView imageViewKWHzl3 = c19231fxQ.KWHzl();
            Intrinsics.copydefault(imageViewKWHzl3);
            android.content.Context context2 = imageViewKWHzl3.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C14725dqq.loadFixSizeBorderImage$default(imageViewKWHzl, strKWHzl2, i3, 1.0f, 16.0f, C33070mpX.OLrzqt(i4, context2), false, 32, null);
        }
        android.widget.TextView textViewAEQbTJ = c19231fxQ.AEQbTJ();
        C18955fsF c18955fsF = this.copydefault;
        java.lang.String strAYXKKw = c18978fsc.AYXKKw();
        java.lang.String str = this.AEQbTJ;
        android.content.Context context3 = c19231fxQ.AEQbTJ().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        textViewAEQbTJ.setText(c18955fsF.EZpvd(strAYXKKw, str, context3));
        try {
            int iOLrzqt = c18978fsc.OLrzqt();
            c19231fxQ.valueOf().setText(C13821dZn.EZpvd.KWHzl(C54870xYj.EZpvd(c18978fsc.AEQbTJ(), iOLrzqt == -1 ? 0 : iOLrzqt, c18978fsc.copydefault(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null)));
        } catch (java.lang.ArithmeticException e) {
            e.printStackTrace();
        }
        c19231fxQ.copydefault().setText(C13821dZn.EZpvd.KWHzl(c18978fsc.EZpvd()));
        c19231fxQ.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fxR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C19230fxP.OLrzqt(this.copydefault, c18978fsc, view);
            }
        });
    }

    public static final void OLrzqt(C19230fxP c19230fxP, C18978fsc c18978fsc, android.view.View view) {
        c19230fxP.EZpvd.invoke(c18978fsc);
    }
}
