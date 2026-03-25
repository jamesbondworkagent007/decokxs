package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC40510qYn;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jTN extends AbstractC40510qYn<C26175jUs, C42814rdX> {
    public final yHO<java.lang.Integer, java.lang.Boolean, C26175jUs, Unit> KWHzl;
    public final Function1<RecyclerView.ViewHolder, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42814rdX c42814rdX, int i, @NotNull C26175jUs c26175jUs) {
        Intrinsics.checkNotNullParameter(c42814rdX, "");
        Intrinsics.checkNotNullParameter(c26175jUs, "");
    }

    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt */
    public /* synthetic */ void onBindViewHolder(AbstractC40510qYn.Application application, InterfaceC40516qYt interfaceC40516qYt) {
        onBindViewHolder((AbstractC40510qYn.Application<C42814rdX>) application, (C26175jUs) interfaceC40516qYt);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super o.jUs, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.recyclerview.widget.RecyclerView$ViewHolder, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jTN(@NotNull yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super C26175jUs, Unit> yho, @NotNull Function1<? super RecyclerView.ViewHolder, Unit> function1) {
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = yho;
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42814rdX AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42814rdX c42814rdXKWHzl = C42814rdX.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42814rdXKWHzl, "");
        return c42814rdXKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC40510qYn, o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC40510qYn.Application<C42814rdX> application, @NotNull C26175jUs c26175jUs) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c26175jUs, "");
        EZpvd((C42814rdX) application.KWHzl(), application, application.getBindingAdapterPosition(), c26175jUs);
    }

    public final void EZpvd(C42814rdX c42814rdX, final AbstractC40510qYn.Application<C42814rdX> application, final int i, final C26175jUs c26175jUs) {
        java.lang.String string;
        c42814rdX.AEQbTJ.setImageResource(c26175jUs.OLrzqt() ? C52761wXj.TaskDescription.fVjYLc : C52761wXj.TaskDescription.dbwnZN);
        c42814rdX.EZpvd.setText(Intrinsics.EZpvd((java.lang.Object) c26175jUs.AEQbTJ().getInstType(), (java.lang.Object) "CEDEFI") ? c26175jUs.AEQbTJ().getTokenSymbol() : c26175jUs.KWHzl());
        AppCompatTextView appCompatTextView = c42814rdX.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C55307xhV.AEQbTJ(appCompatTextView, c26175jUs.copydefault());
        int iCopydefault = c26175jUs.djBIcL() ? C33070mpX.copydefault(C52761wXj.Activity.invokespecialhOMIpD) : C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        int iCopydefault2 = c26175jUs.djBIcL() ? C33070mpX.copydefault(qZH.TaskDescription.AEQbTJ) : C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC);
        c42814rdX.valueOf.setTextColor(iCopydefault);
        c42814rdX.valueOf.setBackgroundTintList(android.content.res.ColorStateList.valueOf(iCopydefault2));
        if (Intrinsics.EZpvd((java.lang.Object) c26175jUs.AEQbTJ().getInstType(), (java.lang.Object) "CEDEFI")) {
            string = C33070mpX.AYXKKw(qZH.PendingIntent.DKtBnz);
        } else if (c26175jUs.gEmmrt()) {
            string = c26175jUs.EZpvd();
        } else {
            string = c26175jUs.djBIcL() ? c42814rdX.getRoot().getContext().getString(qZH.PendingIntent.dvKsVJ) : null;
        }
        AppCompatTextView appCompatTextView2 = c42814rdX.valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        C55307xhV.AEQbTJ(appCompatTextView2, string);
        c42814rdX.OLrzqt.setOnTouchListener(new View.OnTouchListener() { // from class: o.jTR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return jTN.AEQbTJ(this.KWHzl, application, view, motionEvent);
            }
        });
        c42814rdX.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.jTO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jTN.AEQbTJ(this.EZpvd, i, c26175jUs, view);
            }
        });
    }

    public static final boolean AEQbTJ(jTN jtn, AbstractC40510qYn.Application application, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        jtn.OLrzqt.invoke(application);
        return false;
    }

    public static final void AEQbTJ(jTN jtn, int i, C26175jUs c26175jUs, android.view.View view) {
        jtn.KWHzl.invoke(java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(!c26175jUs.OLrzqt()), c26175jUs);
    }
}
