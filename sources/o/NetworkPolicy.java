package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NetworkPolicy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkPolicy {
    public static final Application EZpvd = new Application(null);
    public final java.util.List<NetworkInfo> AEQbTJ;
    public final java.util.List<Proxy> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkPolicy$StateListAnimator) A[MD:(o.NetworkPolicy$StateListAnimator):void (m)] call: o.NetworkPolicy.<init>(o.NetworkPolicy$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkPolicy(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<NetworkInfo> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Proxy> EZpvd() {
        return this.copydefault;
    }

    public NetworkPolicy(StateListAnimator stateListAnimator) {
        java.util.List<Proxy> listEZpvd = stateListAnimator.EZpvd();
        if (listEZpvd == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for errorList".toString());
        }
        this.copydefault = listEZpvd;
        java.util.List<NetworkInfo> listCopydefault = stateListAnimator.copydefault();
        if (listCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for resultList".toString());
        }
        this.AEQbTJ = listCopydefault;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkPolicy.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "BatchDetectDominantLanguageResponse(*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkPolicy.class != obj.getClass()) {
            return false;
        }
        NetworkPolicy networkPolicy = (NetworkPolicy) obj;
        return Intrinsics.EZpvd(this.copydefault, networkPolicy.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, networkPolicy.AEQbTJ);
    }

    public static /* synthetic */ NetworkPolicy copy$default(NetworkPolicy networkPolicy, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.BatchDetectDominantLanguageResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkPolicy.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkPolicy.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(networkPolicy);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    public static final class StateListAnimator {
        public java.util.List<Proxy> EZpvd;
        public java.util.List<NetworkInfo> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<NetworkInfo> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Proxy> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<NetworkInfo> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<Proxy> list) {
            this.EZpvd = list;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull NetworkPolicy networkPolicy) {
            this();
            Intrinsics.checkNotNullParameter(networkPolicy, "");
            this.EZpvd = networkPolicy.EZpvd();
            this.copydefault = networkPolicy.AEQbTJ();
        }

        public final NetworkPolicy KWHzl() {
            return new NetworkPolicy(this, null);
        }

        public final StateListAnimator AEQbTJ() {
            if (this.EZpvd == null) {
                this.EZpvd = yDY.AhwBna();
            }
            if (this.copydefault == null) {
                this.copydefault = yDY.AhwBna();
            }
            return this;
        }
    }
}
