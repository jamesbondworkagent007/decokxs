package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C11914cd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11914cd {
    public static final Application OLrzqt = new Application(null);
    public final C11081cB AEQbTJ;
    public final C11808cb EZpvd;
    public final C11808cb KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.cd$StateListAnimator) A[MD:(o.cd$StateListAnimator):void (m)] call: o.cd.<init>(o.cd$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C11914cd(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11808cb AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11808cb EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11081cB KWHzl() {
        return this.AEQbTJ;
    }

    public C11914cd(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.AEQbTJ();
        this.EZpvd = stateListAnimator.EZpvd();
        this.AEQbTJ = stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.cd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TestingDataResult(");
        sb.append("input=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("output=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("validation=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C11808cb c11808cb = this.KWHzl;
        int iHashCode = c11808cb != null ? c11808cb.hashCode() : 0;
        C11808cb c11808cb2 = this.EZpvd;
        int iHashCode2 = c11808cb2 != null ? c11808cb2.hashCode() : 0;
        C11081cB c11081cB = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c11081cB != null ? c11081cB.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11914cd.class != obj.getClass()) {
            return false;
        }
        C11914cd c11914cd = (C11914cd) obj;
        return Intrinsics.EZpvd(this.KWHzl, c11914cd.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c11914cd.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c11914cd.AEQbTJ);
    }

    public static /* synthetic */ C11914cd copy$default(C11914cd c11914cd, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.TestingDataResult$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C11914cd.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C11914cd.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c11914cd);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    /* JADX INFO: renamed from: o.cd$StateListAnimator */
    public static final class StateListAnimator {
        public C11081cB EZpvd;
        public C11808cb KWHzl;
        public C11808cb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11808cb AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C11081cB c11081cB) {
            this.EZpvd = c11081cB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C11808cb c11808cb) {
            this.copydefault = c11808cb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11808cb EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C11808cb c11808cb) {
            this.KWHzl = c11808cb;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11081cB copydefault() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C11914cd c11914cd) {
            this();
            Intrinsics.checkNotNullParameter(c11914cd, "");
            this.copydefault = c11914cd.EZpvd();
            this.KWHzl = c11914cd.AEQbTJ();
            this.EZpvd = c11914cd.KWHzl();
        }

        public final C11914cd OLrzqt() {
            return new C11914cd(this, null);
        }
    }
}
