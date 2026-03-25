package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C35823oF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35823oF {
    public static final Activity EZpvd = new Activity(null);
    public final java.util.List<java.lang.String> KWHzl;
    public final AbstractC35769oD OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oF$StateListAnimator) A[MD:(o.oF$StateListAnimator):void (m)] call: o.oF.<init>(o.oF$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35823oF(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC35769oD OLrzqt() {
        return this.OLrzqt;
    }

    public C35823oF(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.copydefault();
        this.OLrzqt = stateListAnimator.KWHzl();
    }

    /* JADX INFO: renamed from: o.oF$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Relationship(");
        sb.append("ids=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("type=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<java.lang.String> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        AbstractC35769oD abstractC35769oD = this.OLrzqt;
        return (iHashCode * 31) + (abstractC35769oD != null ? abstractC35769oD.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C35823oF.class != obj.getClass()) {
            return false;
        }
        C35823oF c35823oF = (C35823oF) obj;
        return Intrinsics.EZpvd(this.KWHzl, c35823oF.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c35823oF.OLrzqt);
    }

    public static /* synthetic */ C35823oF copy$default(C35823oF c35823oF, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.Relationship$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C35823oF.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C35823oF.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c35823oF);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    /* JADX INFO: renamed from: o.oF$StateListAnimator */
    public static final class StateListAnimator {
        public java.util.List<java.lang.String> AEQbTJ;
        public AbstractC35769oD KWHzl;

        public final StateListAnimator AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC35769oD KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<java.lang.String> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AbstractC35769oD abstractC35769oD) {
            this.KWHzl = abstractC35769oD;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> copydefault() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C35823oF c35823oF) {
            this();
            Intrinsics.checkNotNullParameter(c35823oF, "");
            this.AEQbTJ = c35823oF.AEQbTJ();
            this.KWHzl = c35823oF.OLrzqt();
        }

        public final C35823oF OLrzqt() {
            return new C35823oF(this, null);
        }
    }
}
