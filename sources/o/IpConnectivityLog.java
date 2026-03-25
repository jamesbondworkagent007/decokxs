package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IpConnectivityLog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class IpConnectivityLog {
    public static final Activity copydefault = new Activity(null);
    public final java.util.List<X509TrustManagerExtensions> AEQbTJ;
    public final IpReachabilityEvent EZpvd;
    public final DhcpErrorEvent KWHzl;
    public final DhcpClientEvent OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IpConnectivityLog$StateListAnimator) A[MD:(o.IpConnectivityLog$StateListAnimator):void (m)] call: o.IpConnectivityLog.<init>(o.IpConnectivityLog$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IpConnectivityLog(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IpReachabilityEvent AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<X509TrustManagerExtensions> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DhcpClientEvent OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DhcpErrorEvent copydefault() {
        return this.KWHzl;
    }

    public IpConnectivityLog(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.EZpvd();
        this.OLrzqt = stateListAnimator.copydefault();
        this.KWHzl = stateListAnimator.OLrzqt();
        this.EZpvd = stateListAnimator.KWHzl();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IpConnectivityLog.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatasetInputDataConfig(");
        sb.append("augmentedManifests=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("dataFormat=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("documentClassifierInputDataConfig=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("entityRecognizerInputDataConfig=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<X509TrustManagerExtensions> list = this.AEQbTJ;
        int iHashCode = list != null ? list.hashCode() : 0;
        DhcpClientEvent dhcpClientEvent = this.OLrzqt;
        int iHashCode2 = dhcpClientEvent != null ? dhcpClientEvent.hashCode() : 0;
        DhcpErrorEvent dhcpErrorEvent = this.KWHzl;
        int iHashCode3 = dhcpErrorEvent != null ? dhcpErrorEvent.hashCode() : 0;
        IpReachabilityEvent ipReachabilityEvent = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (ipReachabilityEvent != null ? ipReachabilityEvent.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IpConnectivityLog.class != obj.getClass()) {
            return false;
        }
        IpConnectivityLog ipConnectivityLog = (IpConnectivityLog) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, ipConnectivityLog.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, ipConnectivityLog.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, ipConnectivityLog.KWHzl) && Intrinsics.EZpvd(this.EZpvd, ipConnectivityLog.EZpvd);
    }

    public static /* synthetic */ IpConnectivityLog copy$default(IpConnectivityLog ipConnectivityLog, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DatasetInputDataConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IpConnectivityLog.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IpConnectivityLog.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(ipConnectivityLog);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    public static final class StateListAnimator {
        public DhcpErrorEvent AEQbTJ;
        public DhcpClientEvent EZpvd;
        public IpReachabilityEvent KWHzl;
        public java.util.List<X509TrustManagerExtensions> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<X509TrustManagerExtensions> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IpReachabilityEvent KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DhcpErrorEvent OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DhcpClientEvent copydefault() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull IpConnectivityLog ipConnectivityLog) {
            this();
            Intrinsics.checkNotNullParameter(ipConnectivityLog, "");
            this.OLrzqt = ipConnectivityLog.EZpvd();
            this.EZpvd = ipConnectivityLog.OLrzqt();
            this.AEQbTJ = ipConnectivityLog.copydefault();
            this.KWHzl = ipConnectivityLog.AEQbTJ();
        }

        public final IpConnectivityLog AEQbTJ() {
            return new IpConnectivityLog(this, null);
        }
    }
}
