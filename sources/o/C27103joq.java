package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse;
import com.okinc.business.invest_biz.ui.viewmodel.InvestRecommendedViewModel$getClickInvestmentDetail$1;
import com.okinc.business.invest_biz.ui.viewmodel.InvestRecommendedViewModel$getTokenDetails$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.joq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27103joq extends ViewModel {
    public final StateFlow<java.util.List<TokenInvestDetail>> EZpvd;
    public final iGF KWHzl;
    public final MutableStateFlow<java.util.List<TokenInvestDetail>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<TokenInvestDetail>> AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C27103joq(@NotNull iGF igf) {
        Intrinsics.checkNotNullParameter(igf, "");
        this.KWHzl = igf;
        MutableStateFlow<java.util.List<TokenInvestDetail>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ(@NotNull java.util.List<java.lang.Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new InvestRecommendedViewModel$getTokenDetails$1(list, this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(long j, @NotNull Continuation<? super Result<TokenInvestDetailResponse>> continuation) {
        InvestRecommendedViewModel$getClickInvestmentDetail$1 investRecommendedViewModel$getClickInvestmentDetail$1;
        if (continuation instanceof InvestRecommendedViewModel$getClickInvestmentDetail$1) {
            investRecommendedViewModel$getClickInvestmentDetail$1 = (InvestRecommendedViewModel$getClickInvestmentDetail$1) continuation;
            int i = investRecommendedViewModel$getClickInvestmentDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investRecommendedViewModel$getClickInvestmentDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                investRecommendedViewModel$getClickInvestmentDetail$1 = new InvestRecommendedViewModel$getClickInvestmentDetail$1(this, continuation);
            }
        }
        java.lang.Object obj = investRecommendedViewModel$getClickInvestmentDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investRecommendedViewModel$getClickInvestmentDetail$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        iGF igf = this.KWHzl;
        java.util.List<java.lang.String> listEZpvd = C56402yEa.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(j)));
        investRecommendedViewModel$getClickInvestmentDetail$1.label = 1;
        java.lang.Object objKWHzl = igf.KWHzl(listEZpvd, investRecommendedViewModel$getClickInvestmentDetail$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }
}
