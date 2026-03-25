package o;

import com.okinc.business.dexlogic.bean.PresetRouteType;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22303hcn {
    public final ConcurrentHashMap<java.lang.String, PresetRouteType> AEQbTJ = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: o.hcn$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PresetRouteType.values().length];
            try {
                iArr[PresetRouteType.RouteTypeNotSupport.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PresetRouteType.RouteTypeAuto.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PresetRouteType.RouteTypeMev.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PresetRouteType.RouteTypeFast.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    @yCM
    public C22303hcn() {
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        this.AEQbTJ.put(str, presetRouteType);
    }

    public static /* synthetic */ PresetRouteType getRouterModeType$default(C22303hcn c22303hcn, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = PresetRouteType.RouteTypeAuto.getValue();
        }
        return c22303hcn.OLrzqt(str, z, str2);
    }

    public final void KWHzl() {
        this.AEQbTJ.clear();
    }

    public static /* synthetic */ boolean isOpenMev$default(C22303hcn c22303hcn, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = PresetRouteType.RouteTypeAuto.getValue();
        }
        return c22303hcn.copydefault(str, str2, z, str3);
    }

    public final boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int i = StateListAnimator.EZpvd[OLrzqt(str, z, str3).ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "1");
            }
            if (i == 3) {
                return true;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public final PresetRouteType OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ConcurrentHashMap<java.lang.String, PresetRouteType> concurrentHashMap = this.AEQbTJ;
        PresetRouteType presetRouteTypeEZpvd = concurrentHashMap.get(str);
        if (presetRouteTypeEZpvd == null) {
            presetRouteTypeEZpvd = z ? PresetRouteType.Companion.EZpvd(str2) : PresetRouteType.RouteTypeAuto;
            PresetRouteType presetRouteTypePutIfAbsent = concurrentHashMap.putIfAbsent(str, presetRouteTypeEZpvd);
            if (presetRouteTypePutIfAbsent != null) {
                presetRouteTypeEZpvd = presetRouteTypePutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(presetRouteTypeEZpvd, "");
        return presetRouteTypeEZpvd;
    }
}
