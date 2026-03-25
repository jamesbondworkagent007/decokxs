package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RssiCurve;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RssiCurve {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.util.List<PacProxySelector> KWHzl;
    public final java.util.List<Proxy> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RssiCurve$Application) A[MD:(o.RssiCurve$Application):void (m)] call: o.RssiCurve.<init>(o.RssiCurve$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RssiCurve(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Proxy> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PacProxySelector> KWHzl() {
        return this.KWHzl;
    }

    public RssiCurve(Application application) {
        java.util.List<Proxy> listKWHzl = application.KWHzl();
        if (listKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for errorList".toString());
        }
        this.copydefault = listKWHzl;
        java.util.List<PacProxySelector> listAEQbTJ = application.AEQbTJ();
        if (listAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for resultList".toString());
        }
        this.KWHzl = listAEQbTJ;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RssiCurve.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "BatchDetectTargetedSentimentResponse(*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RssiCurve.class != obj.getClass()) {
            return false;
        }
        RssiCurve rssiCurve = (RssiCurve) obj;
        return Intrinsics.EZpvd(this.copydefault, rssiCurve.copydefault) && Intrinsics.EZpvd(this.KWHzl, rssiCurve.KWHzl);
    }

    public static /* synthetic */ RssiCurve copy$default(RssiCurve rssiCurve, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.BatchDetectTargetedSentimentResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RssiCurve.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RssiCurve.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(rssiCurve);
        function1.invoke(application);
        return application.OLrzqt();
    }

    public static final class Application {
        public java.util.List<PacProxySelector> AEQbTJ;
        public java.util.List<Proxy> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PacProxySelector> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<Proxy> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<PacProxySelector> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Proxy> KWHzl() {
            return this.EZpvd;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull RssiCurve rssiCurve) {
            this();
            Intrinsics.checkNotNullParameter(rssiCurve, "");
            this.EZpvd = rssiCurve.EZpvd();
            this.AEQbTJ = rssiCurve.KWHzl();
        }

        public final RssiCurve OLrzqt() {
            return new RssiCurve(this, null);
        }

        public final Application EZpvd() {
            if (this.EZpvd == null) {
                this.EZpvd = yDY.AhwBna();
            }
            if (this.AEQbTJ == null) {
                this.AEQbTJ = yDY.AhwBna();
            }
            return this;
        }
    }
}
