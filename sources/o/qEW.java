package o;

import com.okinc.uilab.reminder.OKReminder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qEW extends AbstractC39964qEh<qES, C42879rej> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42879rej AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42879rej c42879rejEZpvd = C42879rej.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42879rejEZpvd, "");
        return c42879rejEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull C42879rej c42879rej, int i, @NotNull qES qes) {
        Intrinsics.checkNotNullParameter(c42879rej, "");
        Intrinsics.checkNotNullParameter(qes, "");
        OKReminder oKReminder = c42879rej.copydefault;
        Intrinsics.checkNotNullExpressionValue(oKReminder, "");
        C41653quq.AEQbTJ(oKReminder, true, "MARKETS_FUTURES_USDS_PAY_WITH");
    }
}
