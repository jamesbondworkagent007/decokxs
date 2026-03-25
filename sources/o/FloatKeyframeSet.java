package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FloatEvaluator;
import o.FloatKeyframeSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class FloatKeyframeSet {
    public static final Application EZpvd = new Application(null);
    public final FloatEvaluator KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.FloatKeyframeSet$ActionBar) A[MD:(o.FloatKeyframeSet$ActionBar):void (m)] call: o.FloatKeyframeSet.<init>(o.FloatKeyframeSet$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FloatKeyframeSet(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FloatEvaluator KWHzl() {
        return this.KWHzl;
    }

    public FloatKeyframeSet(ActionBar actionBar) {
        FloatEvaluator floatEvaluatorOLrzqt = actionBar.OLrzqt();
        if (floatEvaluatorOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for eventAction".toString());
        }
        this.KWHzl = floatEvaluatorOLrzqt;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FloatKeyframeSet.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CompromisedCredentialsActionsType(");
        sb.append("eventAction=" + this.KWHzl);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && FloatKeyframeSet.class == obj.getClass() && Intrinsics.EZpvd(this.KWHzl, ((FloatKeyframeSet) obj).KWHzl);
    }

    public static /* synthetic */ FloatKeyframeSet copy$default(FloatKeyframeSet floatKeyframeSet, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.CompromisedCredentialsActionsType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull FloatKeyframeSet.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FloatKeyframeSet.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(floatKeyframeSet);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public FloatEvaluator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(FloatEvaluator floatEvaluator) {
            this.copydefault = floatEvaluator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FloatEvaluator OLrzqt() {
            return this.copydefault;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull FloatKeyframeSet floatKeyframeSet) {
            this();
            Intrinsics.checkNotNullParameter(floatKeyframeSet, "");
            this.copydefault = floatKeyframeSet.KWHzl();
        }

        public final FloatKeyframeSet KWHzl() {
            return new FloatKeyframeSet(this, null);
        }

        public final ActionBar EZpvd() {
            if (this.copydefault == null) {
                this.copydefault = new FloatEvaluator.Activity("no value provided");
            }
            return this;
        }
    }
}
