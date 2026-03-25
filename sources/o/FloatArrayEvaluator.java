package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.FloatArrayEvaluator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class FloatArrayEvaluator {
    public static final Application AEQbTJ = new Application(null);
    public final FloatKeyframeSet EZpvd;
    public final java.util.List<SuppressAutoDoc> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.FloatArrayEvaluator$StateListAnimator) A[MD:(o.FloatArrayEvaluator$StateListAnimator):void (m)] call: o.FloatArrayEvaluator.<init>(o.FloatArrayEvaluator$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FloatArrayEvaluator(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FloatKeyframeSet AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SuppressAutoDoc> EZpvd() {
        return this.copydefault;
    }

    public FloatArrayEvaluator(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.copydefault();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FloatArrayEvaluator.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CompromisedCredentialsRiskConfigurationType(");
        sb.append("actions=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("eventFilter=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        FloatKeyframeSet floatKeyframeSet = this.EZpvd;
        int iHashCode = floatKeyframeSet != null ? floatKeyframeSet.hashCode() : 0;
        java.util.List<SuppressAutoDoc> list = this.copydefault;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FloatArrayEvaluator.class != obj.getClass()) {
            return false;
        }
        FloatArrayEvaluator floatArrayEvaluator = (FloatArrayEvaluator) obj;
        return Intrinsics.EZpvd(this.EZpvd, floatArrayEvaluator.EZpvd) && Intrinsics.EZpvd(this.copydefault, floatArrayEvaluator.copydefault);
    }

    public static /* synthetic */ FloatArrayEvaluator copy$default(FloatArrayEvaluator floatArrayEvaluator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.CompromisedCredentialsRiskConfigurationType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull FloatArrayEvaluator.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FloatArrayEvaluator.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(floatArrayEvaluator);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    public static final class StateListAnimator {
        public java.util.List<? extends SuppressAutoDoc> EZpvd;
        public FloatKeyframeSet KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FloatKeyframeSet AEQbTJ() {
            return this.KWHzl;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<? extends SuppressAutoDoc> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(FloatKeyframeSet floatKeyframeSet) {
            this.KWHzl = floatKeyframeSet;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.SuppressAutoDoc>, java.util.List<o.SuppressAutoDoc> */
        public final java.util.List<SuppressAutoDoc> copydefault() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull FloatArrayEvaluator floatArrayEvaluator) {
            this();
            Intrinsics.checkNotNullParameter(floatArrayEvaluator, "");
            this.KWHzl = floatArrayEvaluator.AEQbTJ();
            this.EZpvd = floatArrayEvaluator.EZpvd();
        }

        public final FloatArrayEvaluator OLrzqt() {
            return new FloatArrayEvaluator(this, null);
        }
    }
}
