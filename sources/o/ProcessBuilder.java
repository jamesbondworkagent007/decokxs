package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ProcessBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ProcessBuilder {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.util.List<NoSuchFieldError> KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ProcessBuilder$ActionBar) A[MD:(o.ProcessBuilder$ActionBar):void (m)] call: o.ProcessBuilder.<init>(o.ProcessBuilder$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ProcessBuilder(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<NoSuchFieldError> OLrzqt() {
        return this.KWHzl;
    }

    public ProcessBuilder(ActionBar actionBar) {
        java.util.List<NoSuchFieldError> listEZpvd = actionBar.EZpvd();
        if (listEZpvd == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for rules".toString());
        }
        this.KWHzl = listEZpvd;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ProcessBuilder.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RulesConfigurationType(");
        sb.append("rules=" + this.KWHzl);
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
        return obj != null && ProcessBuilder.class == obj.getClass() && Intrinsics.EZpvd(this.KWHzl, ((ProcessBuilder) obj).KWHzl);
    }

    public static /* synthetic */ ProcessBuilder copy$default(ProcessBuilder processBuilder, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.RulesConfigurationType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ProcessBuilder.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ProcessBuilder.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(processBuilder);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public java.util.List<NoSuchFieldError> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<NoSuchFieldError> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<NoSuchFieldError> list) {
            this.OLrzqt = list;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull ProcessBuilder processBuilder) {
            this();
            Intrinsics.checkNotNullParameter(processBuilder, "");
            this.OLrzqt = processBuilder.OLrzqt();
        }

        public final ProcessBuilder KWHzl() {
            return new ProcessBuilder(this, null);
        }

        public final ActionBar copydefault() {
            if (this.OLrzqt == null) {
                this.OLrzqt = yDY.AhwBna();
            }
            return this;
        }
    }
}
