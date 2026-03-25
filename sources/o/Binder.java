package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Binder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Binder {
    public static final Activity copydefault = new Activity(null);
    public final WebViewMethodCalledOnWrongThreadViolation AEQbTJ;
    public final UntaggedSocketViolation KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Binder$ActionBar) A[MD:(o.Binder$ActionBar):void (m)] call: o.Binder.<init>(o.Binder$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Binder(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UntaggedSocketViolation OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewMethodCalledOnWrongThreadViolation copydefault() {
        return this.AEQbTJ;
    }

    public Binder(ActionBar actionBar) {
        this.KWHzl = actionBar.copydefault();
        this.AEQbTJ = actionBar.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Binder.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "DetectSentimentResponse(*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        UntaggedSocketViolation untaggedSocketViolation = this.KWHzl;
        int iHashCode = untaggedSocketViolation != null ? untaggedSocketViolation.hashCode() : 0;
        WebViewMethodCalledOnWrongThreadViolation webViewMethodCalledOnWrongThreadViolation = this.AEQbTJ;
        return (iHashCode * 31) + (webViewMethodCalledOnWrongThreadViolation != null ? webViewMethodCalledOnWrongThreadViolation.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Binder.class != obj.getClass()) {
            return false;
        }
        Binder binder = (Binder) obj;
        return Intrinsics.EZpvd(this.KWHzl, binder.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, binder.AEQbTJ);
    }

    public static /* synthetic */ Binder copy$default(Binder binder, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DetectSentimentResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Binder.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Binder.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(binder);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public WebViewMethodCalledOnWrongThreadViolation EZpvd;
        public UntaggedSocketViolation KWHzl;

        public final ActionBar AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(UntaggedSocketViolation untaggedSocketViolation) {
            this.KWHzl = untaggedSocketViolation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(WebViewMethodCalledOnWrongThreadViolation webViewMethodCalledOnWrongThreadViolation) {
            this.EZpvd = webViewMethodCalledOnWrongThreadViolation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewMethodCalledOnWrongThreadViolation OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UntaggedSocketViolation copydefault() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull Binder binder) {
            this();
            Intrinsics.checkNotNullParameter(binder, "");
            this.KWHzl = binder.OLrzqt();
            this.EZpvd = binder.copydefault();
        }

        public final Binder KWHzl() {
            return new Binder(this, null);
        }
    }
}
