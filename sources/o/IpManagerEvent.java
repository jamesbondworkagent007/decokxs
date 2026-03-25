package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IpManagerEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class IpManagerEvent {
    public static final Application AEQbTJ = new Application(null);
    public final C5173Hn EZpvd;
    public final ValidationProbeEvent KWHzl;
    public final NetworkMetrics OLrzqt;
    public final C5173Hn copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IpManagerEvent$StateListAnimator) A[MD:(o.IpManagerEvent$StateListAnimator):void (m)] call: o.IpManagerEvent.<init>(o.IpManagerEvent$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IpManagerEvent(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidationProbeEvent AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkMetrics OLrzqt() {
        return this.OLrzqt;
    }

    public IpManagerEvent(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.KWHzl();
        this.EZpvd = stateListAnimator.EZpvd();
        this.KWHzl = stateListAnimator.OLrzqt();
        this.OLrzqt = stateListAnimator.AEQbTJ();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IpManagerEvent.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatasetFilter(");
        sb.append("creationTimeAfter=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("creationTimeBefore=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("datasetType=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("status=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.copydefault;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.EZpvd;
        int iHashCode2 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        ValidationProbeEvent validationProbeEvent = this.KWHzl;
        int iHashCode3 = validationProbeEvent != null ? validationProbeEvent.hashCode() : 0;
        NetworkMetrics networkMetrics = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (networkMetrics != null ? networkMetrics.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IpManagerEvent.class != obj.getClass()) {
            return false;
        }
        IpManagerEvent ipManagerEvent = (IpManagerEvent) obj;
        return Intrinsics.EZpvd(this.copydefault, ipManagerEvent.copydefault) && Intrinsics.EZpvd(this.EZpvd, ipManagerEvent.EZpvd) && Intrinsics.EZpvd(this.KWHzl, ipManagerEvent.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, ipManagerEvent.OLrzqt);
    }

    public static /* synthetic */ IpManagerEvent copy$default(IpManagerEvent ipManagerEvent, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DatasetFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IpManagerEvent.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IpManagerEvent.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(ipManagerEvent);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    public static final class StateListAnimator {
        public C5173Hn EZpvd;
        public ValidationProbeEvent KWHzl;
        public NetworkMetrics OLrzqt;
        public C5173Hn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkMetrics AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ValidationProbeEvent OLrzqt() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull IpManagerEvent ipManagerEvent) {
            this();
            Intrinsics.checkNotNullParameter(ipManagerEvent, "");
            this.copydefault = ipManagerEvent.KWHzl();
            this.EZpvd = ipManagerEvent.EZpvd();
            this.KWHzl = ipManagerEvent.AEQbTJ();
            this.OLrzqt = ipManagerEvent.OLrzqt();
        }

        public final IpManagerEvent copydefault() {
            return new IpManagerEvent(this, null);
        }
    }
}
