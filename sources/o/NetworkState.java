package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NetworkState;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkState {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final java.util.List<Proxy> EZpvd;
    public final java.util.List<NetworkRequest> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkState$ActionBar) A[MD:(o.NetworkState$ActionBar):void (m)] call: o.NetworkState.<init>(o.NetworkState$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkState(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<NetworkRequest> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Proxy> copydefault() {
        return this.EZpvd;
    }

    public NetworkState(ActionBar actionBar) {
        java.util.List<Proxy> listOLrzqt = actionBar.OLrzqt();
        if (listOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for errorList".toString());
        }
        this.EZpvd = listOLrzqt;
        java.util.List<NetworkRequest> listEZpvd = actionBar.EZpvd();
        if (listEZpvd == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for resultList".toString());
        }
        this.OLrzqt = listEZpvd;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkState.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "BatchDetectSentimentResponse(*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkState.class != obj.getClass()) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return Intrinsics.EZpvd(this.EZpvd, networkState.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, networkState.OLrzqt);
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.BatchDetectSentimentResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkState.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkState.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(networkState);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    public static final class ActionBar {
        public java.util.List<NetworkRequest> AEQbTJ;
        public java.util.List<Proxy> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<Proxy> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<NetworkRequest> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<NetworkRequest> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Proxy> OLrzqt() {
            return this.EZpvd;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull NetworkState networkState) {
            this();
            Intrinsics.checkNotNullParameter(networkState, "");
            this.EZpvd = networkState.copydefault();
            this.AEQbTJ = networkState.AEQbTJ();
        }

        public final NetworkState AEQbTJ() {
            return new NetworkState(this, null);
        }

        public final ActionBar copydefault() {
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
