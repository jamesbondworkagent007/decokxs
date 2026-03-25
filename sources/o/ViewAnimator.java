package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ViewAnimator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ViewAnimator {
    public static final Activity copydefault = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Integer KWHzl;
    public final AbstractC58373z OLrzqt;
    public final A valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ViewAnimator$StateListAnimator) A[MD:(o.ViewAnimator$StateListAnimator):void (m)] call: o.ViewAnimator.<init>(o.ViewAnimator$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ViewAnimator(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final A AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC58373z copydefault() {
        return this.OLrzqt;
    }

    public ViewAnimator(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator.copydefault();
        this.EZpvd = stateListAnimator.KWHzl();
        this.KWHzl = stateListAnimator.EZpvd();
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        this.valueOf = stateListAnimator.AhwBna();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ViewAnimator.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetLabelDetectionRequest(");
        sb.append("aggregateBy=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sortBy=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC58373z abstractC58373z = this.OLrzqt;
        int iHashCode = abstractC58373z != null ? abstractC58373z.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        A a2 = this.valueOf;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iIntValue) * 31) + iHashCode3) * 31) + (a2 != null ? a2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ViewAnimator.class != obj.getClass()) {
            return false;
        }
        ViewAnimator viewAnimator = (ViewAnimator) obj;
        return Intrinsics.EZpvd(this.OLrzqt, viewAnimator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) viewAnimator.EZpvd) && Intrinsics.EZpvd(this.KWHzl, viewAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) viewAnimator.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, viewAnimator.valueOf);
    }

    public static /* synthetic */ ViewAnimator copy$default(ViewAnimator viewAnimator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetLabelDetectionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ViewAnimator.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ViewAnimator.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(viewAnimator);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        public java.lang.Integer AEQbTJ;
        public A EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public AbstractC58373z copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final A AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC58373z copydefault() {
            return this.copydefault;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ViewAnimator viewAnimator) {
            this();
            Intrinsics.checkNotNullParameter(viewAnimator, "");
            this.copydefault = viewAnimator.copydefault();
            this.KWHzl = viewAnimator.KWHzl();
            this.AEQbTJ = viewAnimator.EZpvd();
            this.OLrzqt = viewAnimator.OLrzqt();
            this.EZpvd = viewAnimator.AEQbTJ();
        }

        public final ViewAnimator OLrzqt() {
            return new ViewAnimator(this, null);
        }
    }
}
