package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CaptioningManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CaptioningManager {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final LayoutAnimationController EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CaptioningManager$ActionBar) A[MD:(o.CaptioningManager$ActionBar):void (m)] call: o.CaptioningManager.<init>(o.CaptioningManager$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CaptioningManager(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LayoutAnimationController OLrzqt() {
        return this.EZpvd;
    }

    public CaptioningManager(ActionBar actionBar) {
        this.EZpvd = actionBar.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CaptioningManager.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetSpeechSynthesisTaskResponse(");
        sb.append("synthesisTask=" + this.EZpvd);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        LayoutAnimationController layoutAnimationController = this.EZpvd;
        if (layoutAnimationController != null) {
            return layoutAnimationController.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && CaptioningManager.class == obj.getClass() && Intrinsics.EZpvd(this.EZpvd, ((CaptioningManager) obj).EZpvd);
    }

    public static /* synthetic */ CaptioningManager copy$default(CaptioningManager captioningManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.GetSpeechSynthesisTaskResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CaptioningManager.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CaptioningManager.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(captioningManager);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public LayoutAnimationController AEQbTJ;

        public final ActionBar AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(LayoutAnimationController layoutAnimationController) {
            this.AEQbTJ = layoutAnimationController;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LayoutAnimationController copydefault() {
            return this.AEQbTJ;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull CaptioningManager captioningManager) {
            this();
            Intrinsics.checkNotNullParameter(captioningManager, "");
            this.AEQbTJ = captioningManager.OLrzqt();
        }

        public final CaptioningManager KWHzl() {
            return new CaptioningManager(this, null);
        }
    }
}
