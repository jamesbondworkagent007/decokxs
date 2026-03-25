package o;

import androidx.core.os.BundleKt;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okex.lite.onboarding.api.TradingRouteType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45751swO implements InterfaceC43234rlT {
    public final android.content.Context EZpvd;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public C45751swO(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
    }

    public final OKComplianceRestrictionService.Feature copydefault(android.os.Bundle bundle) {
        if (bundle != null) {
            int i = bundle.getInt("bizType");
            if (i == 1) {
                return OKComplianceRestrictionService.Feature.MARGIN;
            }
            if (i == 2) {
                return OKComplianceRestrictionService.Feature.PERPETUAL;
            }
            if (i == 3) {
                return OKComplianceRestrictionService.Feature.FUTURE;
            }
            if (i == 4) {
                return OKComplianceRestrictionService.Feature.OPTION;
            }
            return OKComplianceRestrictionService.Feature.MARGIN;
        }
        return OKComplianceRestrictionService.Feature.MARGIN;
    }

    public final void AEQbTJ(android.content.Context context, android.os.Bundle bundle, OKComplianceRestrictionService.Feature feature) {
        ((InterfaceC45748swL) C43251rlk.copydefault(InterfaceC45748swL.class)).EZpvd(context, feature.name(), "derivateonboarding", bundle);
    }

    /* JADX INFO: renamed from: o.swO$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.swO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        C43296rmc.AEQbTJ("au_trade_test", "receive deeplink: lite/derivateonboarding");
        AEQbTJ(context, BundleKt.bundleOf(C56390yDp.OLrzqt("trading_route_type", TradingRouteType.DERIVATIVE), C56390yDp.OLrzqt("bizType", map.get("bizType"))), copydefault(C33048mpB.EZpvd((kotlin.Pair[]) C56427yEz.AkhnZx(map).toArray(new kotlin.Pair[0]))));
    }
}
