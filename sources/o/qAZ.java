package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qAZ extends AbstractC40510qYn<C39890qBo, C42895rez> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42895rez AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42895rez c42895rezOLrzqt = C42895rez.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42895rezOLrzqt, "");
        return c42895rezOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42895rez c42895rez, int i, @NotNull C39890qBo c39890qBo) {
        Intrinsics.checkNotNullParameter(c42895rez, "");
        Intrinsics.checkNotNullParameter(c39890qBo, "");
        c42895rez.KWHzl.setText(c39890qBo.AEQbTJ());
        C41431qqg.AEQbTJ(c42895rez.copydefault, c39890qBo.EZpvd(), (Function1<? super AppCompatImageView, Unit>) new Function1() { // from class: o.qBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qAZ.copydefault((AppCompatImageView) obj);
            }
        });
    }

    public static final Unit copydefault(final AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.qAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                qAZ.EZpvd(appCompatImageView, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void EZpvd(AppCompatImageView appCompatImageView, android.view.View view) {
        Intrinsics.copydefault(appCompatImageView);
        qLU qluKWHzl = qLY.KWHzl(appCompatImageView);
        if (qluKWHzl != null) {
            qluKWHzl.AhwBna();
        }
    }
}
