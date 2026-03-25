package o;

import com.okinc.core.ok_app.api.configuration.Scenario;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mtg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33291mtg {
    public final OKComplianceRestrictionService KWHzl;

    @yCM
    public C33291mtg(@NotNull OKComplianceRestrictionService oKComplianceRestrictionService) {
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        this.KWHzl = oKComplianceRestrictionService;
    }

    public final java.lang.Object copydefault(@NotNull Scenario scenario, @NotNull Continuation<? super Unit> continuation) {
        OKComplianceRestrictionService.UserEvent userEventOLrzqt = OLrzqt(scenario);
        if (userEventOLrzqt == null) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.KWHzl.AEQbTJ(CoroutineScopeKt.CoroutineScope(cancellableContinuationImpl.getContext()), userEventOLrzqt, new Application(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result == C56442yFn.copydefault() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mtg$Application */
    public static final class Application implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ CancellableContinuation<Unit> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(CancellableContinuation<? super Unit> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            EZpvd(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(boolean z) {
            pUU.KWHzl("ConfigManager", "Feature Restriction callback: " + z);
            CancellableContinuation<Unit> cancellableContinuation = this.EZpvd;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
        }
    }

    public final OKComplianceRestrictionService.UserEvent OLrzqt(Scenario scenario) {
        if (!(scenario instanceof Scenario.Login) && !(scenario instanceof Scenario.Register)) {
            if (Intrinsics.EZpvd(scenario, new Scenario.Logout(false, 1, null))) {
                return OKComplianceRestrictionService.UserEvent.Logout;
            }
            if (scenario instanceof Scenario.SwitchAccount) {
                return OKComplianceRestrictionService.UserEvent.Switched;
            }
            pUU.copydefault("ConfigManager", "Should not fetch FR in other flow");
            return null;
        }
        return OKComplianceRestrictionService.UserEvent.Login;
    }
}
