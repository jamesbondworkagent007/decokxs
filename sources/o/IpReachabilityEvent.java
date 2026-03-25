package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IpReachabilityEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class IpReachabilityEvent {
    public static final Application KWHzl = new Application(null);
    public final ApfStats EZpvd;
    public final DefaultNetworkEvent OLrzqt;
    public final ConnectStats copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IpReachabilityEvent$ActionBar) A[MD:(o.IpReachabilityEvent$ActionBar):void (m)] call: o.IpReachabilityEvent.<init>(o.IpReachabilityEvent$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IpReachabilityEvent(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConnectStats AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefaultNetworkEvent EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApfStats OLrzqt() {
        return this.EZpvd;
    }

    public IpReachabilityEvent(ActionBar actionBar) {
        this.EZpvd = actionBar.OLrzqt();
        this.copydefault = actionBar.copydefault();
        this.OLrzqt = actionBar.KWHzl();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IpReachabilityEvent.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatasetEntityRecognizerInputDataConfig(");
        sb.append("annotations=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("documents=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("entityList=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        ApfStats apfStats = this.EZpvd;
        int iHashCode = apfStats != null ? apfStats.hashCode() : 0;
        ConnectStats connectStats = this.copydefault;
        int iHashCode2 = connectStats != null ? connectStats.hashCode() : 0;
        DefaultNetworkEvent defaultNetworkEvent = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (defaultNetworkEvent != null ? defaultNetworkEvent.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IpReachabilityEvent.class != obj.getClass()) {
            return false;
        }
        IpReachabilityEvent ipReachabilityEvent = (IpReachabilityEvent) obj;
        return Intrinsics.EZpvd(this.EZpvd, ipReachabilityEvent.EZpvd) && Intrinsics.EZpvd(this.copydefault, ipReachabilityEvent.copydefault) && Intrinsics.EZpvd(this.OLrzqt, ipReachabilityEvent.OLrzqt);
    }

    public static /* synthetic */ IpReachabilityEvent copy$default(IpReachabilityEvent ipReachabilityEvent, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DatasetEntityRecognizerInputDataConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IpReachabilityEvent.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IpReachabilityEvent.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(ipReachabilityEvent);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public ApfStats AEQbTJ;
        public ConnectStats KWHzl;
        public DefaultNetworkEvent copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DefaultNetworkEvent KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApfStats OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConnectStats copydefault() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull IpReachabilityEvent ipReachabilityEvent) {
            this();
            Intrinsics.checkNotNullParameter(ipReachabilityEvent, "");
            this.AEQbTJ = ipReachabilityEvent.OLrzqt();
            this.KWHzl = ipReachabilityEvent.AEQbTJ();
            this.copydefault = ipReachabilityEvent.EZpvd();
        }

        public final IpReachabilityEvent EZpvd() {
            return new IpReachabilityEvent(this, null);
        }
    }
}
