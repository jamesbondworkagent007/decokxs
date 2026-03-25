package o;

import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28300kWh {

    /* JADX INFO: renamed from: o.kWh$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MemeChainType.values().length];
            try {
                iArr[MemeChainType.MemeChainTypeSol.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MemeChainType.MemeChainTypeEVM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MemeChainType.MemeChainTypeOther.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull InterfaceC30985llV interfaceC30985llV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC30985llV, "");
        return false;
    }

    @yCM
    public C28300kWh() {
    }

    public final boolean OLrzqt(@NotNull java.lang.String str, @NotNull InterfaceC30985llV interfaceC30985llV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC30985llV, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeAuto.getValue())) {
            return Intrinsics.EZpvd((java.lang.Object) interfaceC30985llV.isEnableMev(), (java.lang.Object) "1");
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeMev.getValue())) {
            return true;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeFast.getValue()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeNotSupport.getValue())) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) interfaceC30985llV.isEnableMev(), (java.lang.Object) "1");
    }

    public final boolean EZpvd(@NotNull java.lang.String str, @NotNull InterfaceC30985llV interfaceC30985llV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC30985llV, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeAuto.getValue())) {
            return interfaceC30985llV.getEnableJito();
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeMev.getValue())) {
            return true;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeFast.getValue())) {
            Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeNotSupport.getValue());
        }
        return false;
    }

    public final boolean KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC30985llV interfaceC30985llV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC30985llV, "");
        int i = ActionBar.EZpvd[MemeChainType.Companion.EZpvd(str).ordinal()];
        if (i == 1) {
            return EZpvd(str2, interfaceC30985llV);
        }
        if (i == 2) {
            return OLrzqt(str2, interfaceC30985llV);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return AEQbTJ(str2, interfaceC30985llV);
    }
}
