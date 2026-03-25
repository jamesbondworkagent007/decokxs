package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.market.features.smart_money.signal.ui.alert_history.SignalAlertHistoryItemBinder$1;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kvC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29516kvC extends AbstractC25436iwg<C29582kwP, hEX> {
    public C29516kvC() {
        super(SignalAlertHistoryItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hEX> c25435iwf, @NotNull C29582kwP c29582kwP) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c29582kwP, "");
        hEX hex = (hEX) c25435iwf.EZpvd();
        android.widget.TextView textView = hex.KWHzl;
        android.content.Context context = hex.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(C33069mpW.KWHzl(context, C23274hvD.Fragment.onBackInvoked, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C25322iuY.OLrzqt.EZpvd(java.lang.String.valueOf(c29582kwP.EZpvd()))))));
        hex.EZpvd.setText(C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, c29582kwP.KWHzl(), false, false, RoundingMode.DOWN, false, 20, null));
        hex.AEQbTJ.setText(C33129mqd.gEmmrt(java.lang.Integer.valueOf(c29582kwP.OLrzqt())));
    }
}
