package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.tradeapi.framework.constant.TradeKey;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jMw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25963jMw extends AbstractC49400uno<StateListAnimator, java.lang.String> {
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((StateListAnimator) obj, (Continuation<? super java.lang.String>) continuation);
    }

    @yCM
    public C25963jMw(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.jMw$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.copydefault;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FormatPnlDetailBalanceUseCaseParams(balance=" + this.copydefault + ", unit=" + this.KWHzl + ")";
        }

        public StateListAnimator(java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.KWHzl = str2;
        }
    }

    public java.lang.Object KWHzl(@NotNull final StateListAnimator stateListAnimator, @NotNull Continuation<? super java.lang.String> continuation) {
        java.lang.String strOLrzqt;
        java.lang.String strEZpvd = stateListAnimator.EZpvd();
        return (strEZpvd == null || (strOLrzqt = C27977kKi.OLrzqt(strEZpvd, stateListAnimator.KWHzl(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 2) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 4) != 0 ? false : true, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 8) == 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 32) == 0 ? null : "", (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 64) != 0, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 128) != 0 ? new Function2() { // from class: o.kKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27977kKi.copydefault((BigDecimal) obj, (C38307pTy) obj2);
            }
        } : new Function2() { // from class: o.jMu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C25963jMw.AEQbTJ(stateListAnimator, (BigDecimal) obj, (C38307pTy) obj2);
            }
        }, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 256) != 0 ? new Function1() { // from class: o.kKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27977kKi.EZpvd(((java.lang.Integer) obj).intValue());
            }
        } : null)) == null) ? "--" : strOLrzqt;
    }

    public static final java.lang.String AEQbTJ(StateListAnimator stateListAnimator, BigDecimal bigDecimal, C38307pTy c38307pTy) {
        InterfaceC49426uoN interfaceC49426uoN;
        java.lang.String strAEQbTJ;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC49426uoN = (InterfaceC49426uoN) interfaceC49425uoM.KWHzl(TradeKey.COMMON_COIN)) != null && (strAEQbTJ = interfaceC49426uoN.AEQbTJ(stateListAnimator.KWHzl())) != null) {
            str = strAEQbTJ;
        }
        return pTB.formatICUNumber$default(bigDecimal, RoundingMode.HALF_DOWN, C38307pTy.Companion.EZpvd(C33129mqd.AhwBna(str)), null, null, 12, null);
    }
}
