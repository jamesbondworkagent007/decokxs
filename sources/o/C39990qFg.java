package o;

import com.okinc.core.util.SPUtils;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39990qFg extends AbstractC39964qEh<C39986qFc, C42879rej> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42879rej AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42879rej c42879rejEZpvd = C42879rej.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42879rejEZpvd, "");
        return c42879rejEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42879rej c42879rej, int i, @NotNull C39986qFc c39986qFc) {
        Intrinsics.checkNotNullParameter(c42879rej, "");
        Intrinsics.checkNotNullParameter(c39986qFc, "");
        final OKReminder oKReminder = c42879rej.copydefault;
        oKReminder.setTitle(C33069mpW.OLrzqt(C33070mpX.AYXKKw(qZH.PendingIntent.zpGcln), C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", c39986qFc.AEQbTJ()))));
        Intrinsics.copydefault(oKReminder);
        oKReminder.setMessage(C41431qqg.copydefault(oKReminder, qZH.PendingIntent.registerUser));
        oKReminder.AYXKKw().setOKDSType(258);
        oKReminder.setStyle(0);
        oKReminder.setLeadingIconVisibility(false);
        oKReminder.setOnCloseIconCallback(new Function0() { // from class: o.qFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39990qFg.EZpvd(oKReminder);
            }
        });
    }

    public static final Unit EZpvd(OKReminder oKReminder) {
        SPUtils.put("MARKET_SPOT_USD_PAY_WITH", java.lang.Boolean.FALSE);
        oKReminder.setVisibility(8);
        return Unit.INSTANCE;
    }
}
