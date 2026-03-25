package o;

import androidx.lifecycle.ViewModel;
import com.okinc.okmarket.ui.market.ModuleChooseViewModel$stateFlow$2$1;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_find.net.BizFindApiService;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tcA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46698tcA extends ViewModel {
    public final InterfaceC56387yDm AEQbTJ;
    public final MutableStateFlow<java.util.List<TradeGroupData>> OLrzqt;
    public final MutableStateFlow<TradeGroupData> copydefault = StateFlowKt.MutableStateFlow(null);
    public final MutableStateFlow<java.lang.String> EZpvd = StateFlowKt.MutableStateFlow("");
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.tcz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46698tcA.OLrzqt();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<java.lang.String> copydefault() {
        return this.EZpvd;
    }

    public C46698tcA() {
        java.lang.Object objUzCIH;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        this.OLrzqt = StateFlowKt.MutableStateFlow((interfaceC54581xNrOLrzqt == null || (objUzCIH = interfaceC54581xNrOLrzqt.uzCIH()) == null) ? yDY.AhwBna() : objUzCIH);
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tcx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46698tcA.copydefault(this.copydefault);
            }
        });
    }

    public final BizFindApiService EZpvd() {
        return (BizFindApiService) this.KWHzl.getValue();
    }

    public static final BizFindApiService OLrzqt() {
        return (BizFindApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizFindApiService.class));
    }

    public final Flow<java.util.List<kotlin.Pair<java.lang.Boolean, TradeGroupData>>> KWHzl() {
        return (Flow) this.AEQbTJ.getValue();
    }

    public static final Flow copydefault(C46698tcA c46698tcA) {
        return FlowKt.combine(c46698tcA.OLrzqt, c46698tcA.copydefault, FlowKt.sample(c46698tcA.EZpvd, 150L), new ModuleChooseViewModel$stateFlow$2$1(c46698tcA, null));
    }

    public final void AEQbTJ(@NotNull java.lang.CharSequence charSequence) {
        java.lang.String value;
        Intrinsics.checkNotNullParameter(charSequence, "");
        try {
            Result.Application application = Result.Companion;
            MutableStateFlow<java.lang.String> mutableStateFlow = this.EZpvd;
            do {
                value = mutableStateFlow.getValue();
                java.lang.String str = value;
            } while (!mutableStateFlow.compareAndSet(value, charSequence.toString()));
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void copydefault(TradeGroupData tradeGroupData) {
        try {
            Result.Application application = Result.Companion;
            this.copydefault.setValue(tradeGroupData);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
