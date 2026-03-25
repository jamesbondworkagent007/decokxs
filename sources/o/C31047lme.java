package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.MemeModeQuoteBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.trade.features.home.meme.viewmodel.preset.PresetChildViewModel;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.FeeConfig;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import com.okinc.business.trade.features.home.ui.meme.data.RouteConfig;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lme, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C31047lme {
    public final BuySellPreset AEQbTJ;
    public final PresetChildViewModel AYXKKw;
    public final java.lang.String EZpvd;
    public final android.content.Context KWHzl;
    public final NonMevPriorityFeeInfo OLrzqt;
    public final java.lang.String copydefault;

    public C31047lme(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull NonMevPriorityFeeInfo nonMevPriorityFeeInfo, @NotNull PresetChildViewModel presetChildViewModel, @NotNull java.lang.String str2, BuySellPreset buySellPreset) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nonMevPriorityFeeInfo, "");
        Intrinsics.checkNotNullParameter(presetChildViewModel, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = context;
        this.copydefault = str;
        this.OLrzqt = nonMevPriorityFeeInfo;
        this.AYXKKw = presetChildViewModel;
        this.EZpvd = str2;
        this.AEQbTJ = buySellPreset;
    }

    public final void copydefault() {
        FeeOption feeOption;
        java.lang.String value;
        RouteConfig routeConfig;
        FeeConfig feeConfig;
        java.util.List<FeeOption> feeOptions;
        java.lang.Object next;
        BuySellPreset buySellPreset = this.AEQbTJ;
        if (buySellPreset == null || (feeConfig = buySellPreset.getFeeConfig()) == null || (feeOptions = feeConfig.getFeeOptions()) == null) {
            feeOption = null;
        } else {
            java.util.Iterator<T> it = feeOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((FeeOption) next).getSelected()) {
                        break;
                    }
                }
            }
            feeOption = (FeeOption) next;
        }
        kotlin.Pair<java.lang.Boolean, MemeModeQuoteBean> value2 = this.AYXKKw.EZpvd().getValue();
        MemeModeQuoteBean second = value2 != null ? value2.getSecond() : null;
        if ((second != null ? second.getMemeModeCommonDexInfo() : null) == null || !Intrinsics.EZpvd((java.lang.Object) this.AYXKKw.OLrzqt(), (java.lang.Object) MemeChainType.MemeChainTypeSol.getValue())) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.KWHzl);
        C21570hEg c21570hEgKWHzl = C21570hEg.KWHzl(android.view.LayoutInflater.from(viewOnClickListenerC54939xaY.getContext()));
        Intrinsics.checkNotNullExpressionValue(c21570hEgKWHzl, "");
        android.content.Context context = viewOnClickListenerC54939xaY.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int i = C23274hvD.Fragment.R;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C23272hvB.getShowDataWithPrefix$default(c23272hvB, this.OLrzqt.getBaseFeeUsd(), false, false, null, false, 30, null))));
        C23271hvA c23271hvA = C23271hvA.copydefault;
        java.lang.String showDataWithSymbol$default = C23271hvA.getShowDataWithSymbol$default(c23271hvA, this.OLrzqt.getBaseFee(), this.copydefault, false, null, false, false, 60, null);
        int feeLevel = feeOption != null ? feeOption.getFeeLevel() : PriorityFeeType.PriorityCustom.getValue();
        InterfaceC30984llU interfaceC30984llUCopydefault = this.AYXKKw.copydefault(second);
        PresetChildViewModel presetChildViewModel = this.AYXKKw;
        java.lang.String str = this.EZpvd;
        BuySellPreset buySellPreset2 = this.AEQbTJ;
        if (buySellPreset2 == null || (routeConfig = buySellPreset2.getRouteConfig()) == null || (value = routeConfig.getRouterModeType()) == null) {
            value = PresetRouteType.RouteTypeAuto.getValue();
        }
        boolean zAEQbTJ = presetChildViewModel.AEQbTJ(str, value, interfaceC30984llUCopydefault.KWHzl());
        java.lang.String feeValue = (feeOption == null || feeOption.getFeeLevel() != PriorityFeeType.PriorityCustom.getValue()) ? "" : feeOption.getFeeValue();
        android.content.Context context2 = viewOnClickListenerC54939xaY.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        java.lang.String strKWHzl2 = C33069mpW.KWHzl(context2, C23274hvD.Fragment.set, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C23272hvB.getShowDataWithPrefix$default(c23272hvB, this.AYXKKw.EZpvd(feeLevel, interfaceC30984llUCopydefault, zAEQbTJ, feeValue), false, false, null, false, 30, null))));
        java.lang.String showDataWithSymbol$default2 = C23271hvA.getShowDataWithSymbol$default(c23271hvA, this.AYXKKw.KWHzl(feeLevel, interfaceC30984llUCopydefault, zAEQbTJ, feeValue), this.copydefault, false, null, false, false, 60, null);
        c21570hEgKWHzl.copydefault.setText(strKWHzl + " (" + showDataWithSymbol$default + ")\n" + strKWHzl2 + " (" + showDataWithSymbol$default2 + ")");
        LinearLayoutCompat root = c21570hEgKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        android.content.Context context3 = viewOnClickListenerC54939xaY.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        viewOnClickListenerC54939xaY.OLrzqt(root, C55298xhM.KWHzl(4.0f, context3));
        viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.buildRccMetadata, new View.OnClickListener() { // from class: o.lmg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C31047lme.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
