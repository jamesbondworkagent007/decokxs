package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.assets.api.model.ValuationCurrency;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jLT extends AbstractC49400uno<Application, java.lang.String> {
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    public static final class Application {
        public static final int copydefault = ValuationCurrency.$stable;
        public final java.lang.String AEQbTJ;
        public final ValuationCurrency OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, ValuationCurrency valuationCurrency, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                valuationCurrency = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = application.AEQbTJ;
            }
            return application.KWHzl(valuationCurrency, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull ValuationCurrency valuationCurrency, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(valuationCurrency, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(valuationCurrency, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ValuationCurrency copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FormatCurrentDayPnlUseCaseParams(valuationCurrency=" + this.OLrzqt + ", currentDayPnl=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull ValuationCurrency valuationCurrency, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(valuationCurrency, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = valuationCurrency;
            this.AEQbTJ = str;
        }
    }

    @yCM
    public jLT(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull Application application, @NotNull Continuation<? super java.lang.String> continuation) {
        if (application.copydefault().getUnit().length() == 0 || application.copydefault().getSymbol().length() == 0 || Intrinsics.EZpvd((java.lang.Object) application.AEQbTJ(), (java.lang.Object) "--")) {
            return "--";
        }
        return C27977kKi.OLrzqt(application.AEQbTJ(), application.copydefault().getUnit(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 2) != 0 ? "" : application.copydefault().getSymbol(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 4) != 0 ? false : true, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 8) == 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 32) == 0 ? null : "", (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 64) != 0, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 128) != 0 ? new Function2() { // from class: o.kKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27977kKi.copydefault((BigDecimal) obj, (C38307pTy) obj2);
            }
        } : new Function2() { // from class: o.jLX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return jLT.EZpvd((BigDecimal) obj, (C38307pTy) obj2);
            }
        }, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 256) != 0 ? new Function1() { // from class: o.kKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27977kKi.EZpvd(((java.lang.Integer) obj).intValue());
            }
        } : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String EZpvd(BigDecimal bigDecimal, C38307pTy c38307pTy) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        return pTB.formatICUNumber$default(bigDecimal, RoundingMode.HALF_DOWN, c38307pTy, null, null, 12, null);
    }
}
