package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.KlineSpotAverageBean;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC39563puh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ppH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC39274ppH extends InterfaceC39563puh.Application {
    void KWHzl(@NotNull C36250oUv c36250oUv, @NotNull java.lang.String str, LifecycleOwner lifecycleOwner);

    void copydefault(@NotNull C36250oUv c36250oUv, @NotNull java.lang.String str, LifecycleOwner lifecycleOwner, boolean z);

    /* JADX INFO: renamed from: o.ppH$ActionBar */
    public static final class ActionBar {
        public static void EZpvd(@NotNull InterfaceC39274ppH interfaceC39274ppH, @NotNull java.util.ArrayList<MarketCoinInfo> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            InterfaceC39563puh.Application.C0921Application.EZpvd((InterfaceC39563puh.Application) interfaceC39274ppH, arrayList);
        }

        public static void KWHzl(@NotNull InterfaceC39274ppH interfaceC39274ppH, @NotNull java.util.List<? extends oLY> list) {
            Intrinsics.checkNotNullParameter(list, "");
            InterfaceC39563puh.Application.C0921Application.EZpvd(interfaceC39274ppH, list);
        }

        public static void OLrzqt(@NotNull InterfaceC39274ppH interfaceC39274ppH, @NotNull KlineSpotAverageBean klineSpotAverageBean) {
            Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
            InterfaceC39563puh.Application.C0921Application.EZpvd(interfaceC39274ppH, klineSpotAverageBean);
        }

        public static void copydefault(@NotNull InterfaceC39274ppH interfaceC39274ppH) {
            InterfaceC39563puh.Application.C0921Application.EZpvd(interfaceC39274ppH);
        }

        public static void copydefault(@NotNull InterfaceC39274ppH interfaceC39274ppH, @NotNull java.lang.String str, @NotNull java.util.List<? extends oLY> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            InterfaceC39563puh.Application.C0921Application.EZpvd(interfaceC39274ppH, str, list);
        }

        public static /* synthetic */ void getDrawingData$default(InterfaceC39274ppH interfaceC39274ppH, C36250oUv c36250oUv, java.lang.String str, LifecycleOwner lifecycleOwner, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDrawingData");
            }
            if ((i & 4) != 0) {
                lifecycleOwner = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            interfaceC39274ppH.copydefault(c36250oUv, str, lifecycleOwner, z);
        }

        public static /* synthetic */ void useLocalDrawingData$default(InterfaceC39274ppH interfaceC39274ppH, C36250oUv c36250oUv, java.lang.String str, LifecycleOwner lifecycleOwner, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: useLocalDrawingData");
            }
            if ((i & 4) != 0) {
                lifecycleOwner = null;
            }
            interfaceC39274ppH.KWHzl(c36250oUv, str, lifecycleOwner);
        }
    }
}
