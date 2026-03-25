package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NetworkScoreManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkScoreManager {
    public static final Application EZpvd = new Application(null);
    public final java.util.List<java.lang.String> AEQbTJ;
    public final SynchronousResultReceiver copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkScoreManager$StateListAnimator) A[MD:(o.NetworkScoreManager$StateListAnimator):void (m)] call: o.NetworkScoreManager.<init>(o.NetworkScoreManager$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkScoreManager(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver OLrzqt() {
        return this.copydefault;
    }

    public NetworkScoreManager(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.copydefault();
        this.AEQbTJ = stateListAnimator.KWHzl();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkScoreManager.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BatchDetectSentimentRequest(");
        sb.append("languageCode=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("textList=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        SynchronousResultReceiver synchronousResultReceiver = this.copydefault;
        int iHashCode = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.util.List<java.lang.String> list = this.AEQbTJ;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkScoreManager.class != obj.getClass()) {
            return false;
        }
        NetworkScoreManager networkScoreManager = (NetworkScoreManager) obj;
        return Intrinsics.EZpvd(this.copydefault, networkScoreManager.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, networkScoreManager.AEQbTJ);
    }

    public static /* synthetic */ NetworkScoreManager copy$default(NetworkScoreManager networkScoreManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.BatchDetectSentimentRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkScoreManager.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkScoreManager.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(networkScoreManager);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    public static final class StateListAnimator {
        public SynchronousResultReceiver AEQbTJ;
        public java.util.List<java.lang.String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver copydefault() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull NetworkScoreManager networkScoreManager) {
            this();
            Intrinsics.checkNotNullParameter(networkScoreManager, "");
            this.AEQbTJ = networkScoreManager.OLrzqt();
            this.OLrzqt = networkScoreManager.KWHzl();
        }

        public final NetworkScoreManager AEQbTJ() {
            return new NetworkScoreManager(this, null);
        }
    }
}
