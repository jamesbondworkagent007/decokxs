package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedCustomSolPresetVM;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.liO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30819liO {
    public final android.content.Context AEQbTJ;
    public final AdvancedSettingsContract.Input EZpvd;
    public final java.lang.String KWHzl;
    public final AdvancedCustomSolPresetVM copydefault;

    public C30819liO(@NotNull android.content.Context context, @NotNull AdvancedCustomSolPresetVM advancedCustomSolPresetVM, @NotNull AdvancedSettingsContract.Input input, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(advancedCustomSolPresetVM, "");
        Intrinsics.checkNotNullParameter(input, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = context;
        this.copydefault = advancedCustomSolPresetVM;
        this.EZpvd = input;
        this.KWHzl = str;
    }

    public final void EZpvd() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.AEQbTJ);
        C21570hEg c21570hEgKWHzl = C21570hEg.KWHzl(android.view.LayoutInflater.from(viewOnClickListenerC54939xaY.getContext()));
        Intrinsics.checkNotNullExpressionValue(c21570hEgKWHzl, "");
        java.lang.String strEZpvd = this.copydefault.EZpvd(this.EZpvd.getQuoteData());
        AdvancedCustomSolPresetVM advancedCustomSolPresetVM = this.copydefault;
        java.lang.String strKWHzl = advancedCustomSolPresetVM.KWHzl(advancedCustomSolPresetVM.AhwBna(), this.EZpvd.getQuoteData());
        java.lang.String perTokenUsd = this.EZpvd.getPerTokenUsd();
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        android.app.Application applicationOLrzqt = c32979mnm.OLrzqt();
        int i = C23274hvD.Fragment.R;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        java.lang.String str = C33069mpW.KWHzl(applicationOLrzqt, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C23272hvB.formatScientificCurrency$default(c23272hvB, C23313hvq.mulCheckS$default(strEZpvd, perTokenUsd, null, null, null, 14, null), false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null)))) + "(" + KWHzl(strEZpvd, this.KWHzl) + ")";
        java.lang.String str2 = C33069mpW.KWHzl(c32979mnm.OLrzqt(), C23274hvD.Fragment.set, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C23272hvB.formatScientificCurrency$default(c23272hvB, C23313hvq.mulCheckS$default(strKWHzl, perTokenUsd, null, null, null, 14, null), false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null)))) + "(" + KWHzl(strKWHzl, this.KWHzl) + ")";
        c21570hEgKWHzl.copydefault.setText(str + "\n" + str2);
        LinearLayoutCompat root = c21570hEgKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        android.content.Context context = viewOnClickListenerC54939xaY.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        viewOnClickListenerC54939xaY.OLrzqt(root, C55298xhM.KWHzl(4.0f, context));
        viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.buildRccMetadata, new View.OnClickListener() { // from class: o.liQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30819liO.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, false, null, false, false, false, true, null, false, false, 479, null) + " " + str2;
    }
}
