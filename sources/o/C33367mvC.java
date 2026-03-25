package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.core.ok_app.modeswitch.OKLiteSubModeUtilsKt$collectOnLifecycle$1;
import com.okinc.core.ok_app.modeswitch.OKLiteSubModeUtilsKt$setupConfigCollector$1;
import com.okinc.core.ok_app.modeswitch.OKLiteSubModeUtilsKt$setupConfigCollector$2;
import com.okinc.core.ok_app.modeswitch.OKLiteSubModeUtilsKt$setupConfigCollector$3;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33367mvC {
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mvD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33367mvC.KWHzl();
        }
    });

    public static final OKComplianceRestrictionService EZpvd() {
        return (OKComplianceRestrictionService) AEQbTJ.getValue();
    }

    public static final OKComplianceRestrictionService KWHzl() {
        return (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
    }

    public static final boolean AEQbTJ() {
        return EZpvd().AuCTel().contains(OKComplianceRestrictionService.AppMode.CEFI.getModeName());
    }

    /* JADX INFO: renamed from: o.mvC$ActionBar */
    public static final class ActionBar extends AbstractC56429yFa implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
        }

        public ActionBar(CoroutineExceptionHandler.Key key) {
            super(key);
        }
    }

    public static final boolean djBIcL() {
        return EZpvd().AuCTel().contains(OKComplianceRestrictionService.AppMode.WEB3.getModeName());
    }

    public static final boolean copydefault() {
        return AEQbTJ() && EZpvd().fIwbmz().contains(OKComplianceRestrictionService.CefiMode.LITE.getModeName());
    }

    public static final boolean valueOf() {
        return AEQbTJ() && EZpvd().fIwbmz().contains(OKComplianceRestrictionService.CefiMode.PRO.getModeName());
    }

    public static final void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull yHO<? super CoroutineScope, ? super kotlin.Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi>, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        InterfaceC33171mrS interfaceC33171mrS;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(yho, "");
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
        if (oKComplianceRestrictionService == null || (interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class)) == null) {
            return;
        }
        StateFlow<AbstractC33249msr> stateFlowOLrzqt = ((InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class)).OLrzqt();
        StateFlow<AbstractC33240msi> stateFlowKWHzl = ((InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class)).KWHzl();
        pUU.EZpvd("ModeSwitch", "setupConfigCollector");
        copydefault(FlowKt.combine(FlowKt.onStart(oKComplianceRestrictionService.AxsJAY(), new OKLiteSubModeUtilsKt$setupConfigCollector$1(null)), interfaceC33171mrS.isConnected(), stateFlowOLrzqt, stateFlowKWHzl, new OKLiteSubModeUtilsKt$setupConfigCollector$2(null)), lifecycleOwner, Lifecycle.State.CREATED, new OKLiteSubModeUtilsKt$setupConfigCollector$3(yho, null));
    }

    public static /* synthetic */ Job collectOnLifecycle$default(Flow flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, yHO yho, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return copydefault(flow, lifecycleOwner, state, yho);
    }

    public static final <T> Job copydefault(@NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull yHO<? super CoroutineScope, ? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(yho, "");
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), new ActionBar(CoroutineExceptionHandler.Key), null, new OKLiteSubModeUtilsKt$collectOnLifecycle$1(lifecycleOwner, state, flow, yho, null), 2, null);
    }
}
