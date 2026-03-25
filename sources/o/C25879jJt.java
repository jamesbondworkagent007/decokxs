package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.EveryTimeStepFundingFeePo;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeePo;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jJt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25879jJt extends AbstractC49400uno<kotlin.Pair<? extends FundingFeePo, ? extends ValuationCurrency>, java.util.List<? extends C25901jKo>> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.jJt$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jJt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @yCM
    public C25879jJt(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<FundingFeePo, ValuationCurrency> pair, @NotNull Continuation<? super java.util.List<C25901jKo>> continuation) {
        java.lang.String str;
        long dateTime;
        java.util.List<EveryTimeStepFundingFeePo> everyTimeStepFundingFeeList = pair.getFirst().getEveryTimeStepFundingFeeList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(everyTimeStepFundingFeeList, 10));
        for (EveryTimeStepFundingFeePo everyTimeStepFundingFeePo : everyTimeStepFundingFeeList) {
            double dAEQbTJ = C33129mqd.AEQbTJ(everyTimeStepFundingFeePo.getFundingFee());
            java.lang.String strOLrzqt = C27977kKi.OLrzqt(everyTimeStepFundingFeePo.getFundingFee(), pair.getSecond().getUnit(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 2) != 0 ? "" : pair.getSecond().getSymbol(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 4) != 0 ? false : true, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 8) == 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 32) == 0 ? null : "", (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 64) != 0, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 128) != 0 ? new Function2() { // from class: o.kKj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C27977kKi.copydefault((BigDecimal) obj, (C38307pTy) obj2);
                }
            } : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 256) != 0 ? new Function1() { // from class: o.kKn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27977kKi.EZpvd(((java.lang.Integer) obj).intValue());
                }
            } : null);
            if (everyTimeStepFundingFeePo.getTimeStep() == 2) {
                str = new SimpleDateFormat("MM-dd").format(C56443yFo.KWHzl(everyTimeStepFundingFeePo.getDateTime()));
            } else {
                str = new SimpleDateFormat("MM").format(C56443yFo.KWHzl(everyTimeStepFundingFeePo.getDateTime()));
            }
            java.lang.String str2 = str;
            if (everyTimeStepFundingFeePo.getTimeStep() == 2) {
                dateTime = C41425qqa.KWHzl(everyTimeStepFundingFeePo.getDateTime());
            } else {
                dateTime = everyTimeStepFundingFeePo.getDateTime();
            }
            Intrinsics.copydefault((java.lang.Object) str2);
            arrayList.add(new C25901jKo(dAEQbTJ, strOLrzqt, str2, dateTime, everyTimeStepFundingFeePo.getTimeStep()));
        }
        return arrayList;
    }
}
