package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.okex.lite.hero.coordinator.HeroABTestCoordinator$startMonitoring$1$onUpdatedCallback$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.suP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C45667suP {
    public final C45706svB AEQbTJ;
    public final InterfaceC45711svG EZpvd;
    public final ABTestManager KWHzl;
    public InterfaceC32861mla OLrzqt;
    public final C45670suS copydefault;
    public final CoroutineScope djBIcL;

    @yCM
    public C45667suP(@NotNull InterfaceC45711svG interfaceC45711svG, @NotNull C45706svB c45706svB, @NotNull C45670suS c45670suS, @NotNull ABTestManager aBTestManager, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(interfaceC45711svG, "");
        Intrinsics.checkNotNullParameter(c45706svB, "");
        Intrinsics.checkNotNullParameter(c45670suS, "");
        Intrinsics.checkNotNullParameter(aBTestManager, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.EZpvd = interfaceC45711svG;
        this.AEQbTJ = c45706svB;
        this.copydefault = c45670suS;
        this.KWHzl = aBTestManager;
        this.djBIcL = coroutineScope;
    }

    public final void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleOwner, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            copydefault();
            StateListAnimator stateListAnimator = new StateListAnimator(function1, lifecycleOwner);
            this.OLrzqt = stateListAnimator;
            ABTestManager aBTestManager = this.KWHzl;
            Intrinsics.copydefault(stateListAnimator);
            aBTestManager.KWHzl(stateListAnimator, AmplitudeName.CEFI);
            this.EZpvd.AEQbTJ("A/B test monitoring started");
        } catch (java.lang.Exception e) {
            this.EZpvd.OLrzqt("Failed to start A/B test monitoring", e);
        }
    }

    /* JADX INFO: renamed from: o.suP$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC32861mla {
        public final /* synthetic */ Function1<LifecycleOwner, Unit> KWHzl;
        public final /* synthetic */ LifecycleOwner copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC32861mla
        public void EZpvd(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.lifecycle.LifecycleOwner, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function1<? super LifecycleOwner, Unit> function1, LifecycleOwner lifecycleOwner) {
            this.KWHzl = function1;
            this.copydefault = lifecycleOwner;
        }

        @Override // o.InterfaceC32861mla
        public void KWHzl(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            C45667suP.this.EZpvd.AEQbTJ("ABTestManager updated");
            if (C45667suP.this.AEQbTJ.copydefault(false, false)) {
                BuildersKt__Builders_commonKt.launch$default(C45667suP.this.djBIcL, null, null, new HeroABTestCoordinator$startMonitoring$1$onUpdatedCallback$1(C45667suP.this, this.KWHzl, this.copydefault, null), 3, null);
            } else {
                C45667suP.this.EZpvd.AEQbTJ("Hero feature not enabled. Skipping A/B test update.");
            }
        }
    }

    public final void copydefault() {
        try {
            InterfaceC32861mla interfaceC32861mla = this.OLrzqt;
            if (interfaceC32861mla != null) {
                ABTestManager.unRegisterCallback$default(this.KWHzl, interfaceC32861mla, null, 2, null);
                this.EZpvd.AEQbTJ("A/B test monitoring stopped");
            }
            this.OLrzqt = null;
            Job job = (Job) this.djBIcL.getCoroutineContext().get(Job.Key);
            if (job != null) {
                JobKt__JobKt.cancelChildren$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.EZpvd.AEQbTJ("Cancelled ongoing hero loading operations");
        } catch (java.lang.Exception e) {
            this.EZpvd.OLrzqt("Error stopping A/B test monitoring", e);
        }
    }
}
