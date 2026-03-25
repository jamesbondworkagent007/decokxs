package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ResourceMismatchViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ResourceMismatchViolation {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public final C5173Hn EZpvd;
    public final java.lang.String KWHzl;
    public final StatsDimensionsValue OLrzqt;
    public final C5173Hn copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ResourceMismatchViolation$ActionBar) A[MD:(o.ResourceMismatchViolation$ActionBar):void (m)] call: o.ResourceMismatchViolation.<init>(o.ResourceMismatchViolation$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ResourceMismatchViolation(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue OLrzqt() {
        return this.OLrzqt;
    }

    public ResourceMismatchViolation(ActionBar actionBar) {
        this.KWHzl = actionBar.KWHzl();
        this.OLrzqt = actionBar.EZpvd();
        this.EZpvd = actionBar.AEQbTJ();
        this.copydefault = actionBar.copydefault();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ResourceMismatchViolation.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SentimentDetectionJobFilter(");
        sb.append("jobName=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("submitTimeAfter=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("submitTimeBefore=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.OLrzqt;
        int iHashCode2 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c5173Hn2 != null ? c5173Hn2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResourceMismatchViolation.class != obj.getClass()) {
            return false;
        }
        ResourceMismatchViolation resourceMismatchViolation = (ResourceMismatchViolation) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) resourceMismatchViolation.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, resourceMismatchViolation.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, resourceMismatchViolation.EZpvd) && Intrinsics.EZpvd(this.copydefault, resourceMismatchViolation.copydefault);
    }

    public static /* synthetic */ ResourceMismatchViolation copy$default(ResourceMismatchViolation resourceMismatchViolation, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.SentimentDetectionJobFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ResourceMismatchViolation.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ResourceMismatchViolation.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(resourceMismatchViolation);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public C5173Hn EZpvd;
        public StatsDimensionsValue KWHzl;
        public C5173Hn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.EZpvd;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull ResourceMismatchViolation resourceMismatchViolation) {
            this();
            Intrinsics.checkNotNullParameter(resourceMismatchViolation, "");
            this.AEQbTJ = resourceMismatchViolation.KWHzl();
            this.KWHzl = resourceMismatchViolation.OLrzqt();
            this.copydefault = resourceMismatchViolation.EZpvd();
            this.EZpvd = resourceMismatchViolation.AEQbTJ();
        }

        public final ResourceMismatchViolation OLrzqt() {
            return new ResourceMismatchViolation(this, null);
        }
    }
}
