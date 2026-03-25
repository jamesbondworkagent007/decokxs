package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.OvershootInterpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class OvershootInterpolator {
    public static final Activity OLrzqt = new Activity(null);
    public final LayoutAnimationController copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.OvershootInterpolator$ActionBar) A[MD:(o.OvershootInterpolator$ActionBar):void (m)] call: o.OvershootInterpolator.<init>(o.OvershootInterpolator$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OvershootInterpolator(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LayoutAnimationController EZpvd() {
        return this.copydefault;
    }

    public OvershootInterpolator(ActionBar actionBar) {
        this.copydefault = actionBar.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.OvershootInterpolator.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartSpeechSynthesisTaskResponse(");
        sb.append("synthesisTask=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        LayoutAnimationController layoutAnimationController = this.copydefault;
        if (layoutAnimationController != null) {
            return layoutAnimationController.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && OvershootInterpolator.class == obj.getClass() && Intrinsics.EZpvd(this.copydefault, ((OvershootInterpolator) obj).copydefault);
    }

    public static /* synthetic */ OvershootInterpolator copy$default(OvershootInterpolator overshootInterpolator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.StartSpeechSynthesisTaskResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull OvershootInterpolator.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OvershootInterpolator.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(overshootInterpolator);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public LayoutAnimationController OLrzqt;

        public final ActionBar KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(LayoutAnimationController layoutAnimationController) {
            this.OLrzqt = layoutAnimationController;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LayoutAnimationController OLrzqt() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull OvershootInterpolator overshootInterpolator) {
            this();
            Intrinsics.checkNotNullParameter(overshootInterpolator, "");
            this.OLrzqt = overshootInterpolator.EZpvd();
        }

        public final OvershootInterpolator copydefault() {
            return new OvershootInterpolator(this, null);
        }
    }
}
