package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NetworkRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkRequest {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.lang.Integer EZpvd;
    public final UntaggedSocketViolation KWHzl;
    public final WebViewMethodCalledOnWrongThreadViolation OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkRequest$StateListAnimator) A[MD:(o.NetworkRequest$StateListAnimator):void (m)] call: o.NetworkRequest.<init>(o.NetworkRequest$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkRequest(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UntaggedSocketViolation AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewMethodCalledOnWrongThreadViolation EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.EZpvd;
    }

    public NetworkRequest(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.KWHzl();
        this.KWHzl = stateListAnimator.AEQbTJ();
        this.OLrzqt = stateListAnimator.copydefault();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkRequest.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BatchDetectSentimentItemResult(");
        sb.append("index=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("sentiment=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sentimentScore=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.EZpvd;
        int iIntValue = num != null ? num.intValue() : 0;
        UntaggedSocketViolation untaggedSocketViolation = this.KWHzl;
        int iHashCode = untaggedSocketViolation != null ? untaggedSocketViolation.hashCode() : 0;
        WebViewMethodCalledOnWrongThreadViolation webViewMethodCalledOnWrongThreadViolation = this.OLrzqt;
        return (((iIntValue * 31) + iHashCode) * 31) + (webViewMethodCalledOnWrongThreadViolation != null ? webViewMethodCalledOnWrongThreadViolation.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkRequest.class != obj.getClass()) {
            return false;
        }
        NetworkRequest networkRequest = (NetworkRequest) obj;
        return Intrinsics.EZpvd(this.EZpvd, networkRequest.EZpvd) && Intrinsics.EZpvd(this.KWHzl, networkRequest.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, networkRequest.OLrzqt);
    }

    public static /* synthetic */ NetworkRequest copy$default(NetworkRequest networkRequest, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.BatchDetectSentimentItemResult$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkRequest.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkRequest.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(networkRequest);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    public static final class StateListAnimator {
        public java.lang.Integer EZpvd;
        public UntaggedSocketViolation KWHzl;
        public WebViewMethodCalledOnWrongThreadViolation OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UntaggedSocketViolation AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(WebViewMethodCalledOnWrongThreadViolation webViewMethodCalledOnWrongThreadViolation) {
            this.OLrzqt = webViewMethodCalledOnWrongThreadViolation;
        }

        public final StateListAnimator EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.EZpvd = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewMethodCalledOnWrongThreadViolation copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(UntaggedSocketViolation untaggedSocketViolation) {
            this.KWHzl = untaggedSocketViolation;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull NetworkRequest networkRequest) {
            this();
            Intrinsics.checkNotNullParameter(networkRequest, "");
            this.EZpvd = networkRequest.copydefault();
            this.KWHzl = networkRequest.AEQbTJ();
            this.OLrzqt = networkRequest.EZpvd();
        }

        public final NetworkRequest OLrzqt() {
            return new NetworkRequest(this, null);
        }
    }
}
