package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC46051tG;
import o.C45943tC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C45943tC {
    public static final Activity KWHzl = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final AbstractC46051tG OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tC$StateListAnimator) A[MD:(o.tC$StateListAnimator):void (m)] call: o.tC.<init>(o.tC$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C45943tC(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46051tG EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public C45943tC(StateListAnimator stateListAnimator) {
        AbstractC46051tG abstractC46051tGKWHzl = stateListAnimator.KWHzl();
        if (abstractC46051tGKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for format".toString());
        }
        this.OLrzqt = abstractC46051tGKWHzl;
        java.lang.String strCopydefault = stateListAnimator.copydefault();
        if (strCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for s3Uri".toString());
        }
        this.AEQbTJ = strCopydefault;
    }

    /* JADX INFO: renamed from: o.tC$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tC.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ParallelDataConfig(");
        sb.append("format=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("s3Uri=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C45943tC.class != obj.getClass()) {
            return false;
        }
        C45943tC c45943tC = (C45943tC) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c45943tC.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c45943tC.AEQbTJ);
    }

    public static /* synthetic */ C45943tC copy$default(C45943tC c45943tC, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.ParallelDataConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C45943tC.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C45943tC.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c45943tC);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tC$StateListAnimator */
    public static final class StateListAnimator {
        public AbstractC46051tG EZpvd;
        public java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC46051tG abstractC46051tG) {
            this.EZpvd = abstractC46051tG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46051tG KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C45943tC c45943tC) {
            this();
            Intrinsics.checkNotNullParameter(c45943tC, "");
            this.EZpvd = c45943tC.EZpvd();
            this.KWHzl = c45943tC.copydefault();
        }

        public final C45943tC AEQbTJ() {
            return new C45943tC(this, null);
        }

        public final StateListAnimator OLrzqt() {
            if (this.EZpvd == null) {
                this.EZpvd = new AbstractC46051tG.StateListAnimator("no value provided");
            }
            if (this.KWHzl == null) {
                this.KWHzl = "";
            }
            return this;
        }
    }
}
