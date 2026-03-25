package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jMB extends AbstractC49400uno<Application, java.lang.String> {
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public jMB(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
    }

    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = application.KWHzl;
            }
            if ((i & 4) != 0) {
                str3 = application.AEQbTJ;
            }
            return application.KWHzl(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Application(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.EZpvd;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FormatPnlDetailPositionMarketValueUseCaseParams(positionMarketValue=" + this.EZpvd + ", unit=" + this.KWHzl + ", symbol=" + this.AEQbTJ + ")";
        }

        public Application(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.EZpvd = str;
            this.KWHzl = str2;
            this.AEQbTJ = str3;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull Application application, @NotNull Continuation<? super java.lang.String> continuation) {
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2 = application.OLrzqt();
        return (strOLrzqt2 == null || (strOLrzqt = C27977kKi.OLrzqt(strOLrzqt2, application.AEQbTJ(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 2) != 0 ? "" : application.KWHzl(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 4) != 0 ? false : true, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 8) == 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 32) == 0 ? null : "", (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 64) != 0, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 128) != 0 ? new Function2() { // from class: o.kKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27977kKi.copydefault((BigDecimal) obj, (C38307pTy) obj2);
            }
        } : new Function2() { // from class: o.jMz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return jMB.EZpvd((BigDecimal) obj, (C38307pTy) obj2);
            }
        }, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 256) != 0 ? new Function1() { // from class: o.kKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27977kKi.EZpvd(((java.lang.Integer) obj).intValue());
            }
        } : null)) == null) ? "--" : strOLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String EZpvd(BigDecimal bigDecimal, C38307pTy c38307pTy) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        return pTB.formatICUNumber$default(bigDecimal, RoundingMode.HALF_DOWN, c38307pTy, null, null, 12, null);
    }
}
