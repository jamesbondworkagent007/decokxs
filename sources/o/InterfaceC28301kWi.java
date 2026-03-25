package o;

import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28301kWi {
    java.lang.String AEQbTJ(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str);

    java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str);

    java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    java.util.List<PrioritySelectionBean> copydefault(@NotNull java.util.List<FeeOption> list, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.kWi$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.String getPriorityFeeByPriorityType$default(InterfaceC28301kWi interfaceC28301kWi, int i, InterfaceC30984llU interfaceC30984llU, boolean z, java.lang.String str, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPriorityFeeByPriorityType");
            }
            if ((i2 & 8) != 0) {
                str = "";
            }
            return interfaceC28301kWi.AEQbTJ(i, interfaceC30984llU, z, str);
        }

        public static /* synthetic */ java.lang.String getPriorityFeeUsd$default(InterfaceC28301kWi interfaceC28301kWi, int i, InterfaceC30984llU interfaceC30984llU, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC28301kWi.OLrzqt(i, interfaceC30984llU, z, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPriorityFeeUsd");
        }
    }
}
