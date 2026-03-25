package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C33738nE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C33738nE {
    public static final Application KWHzl = new Application(null);
    public final java.lang.Float AEQbTJ;
    public final C33954nM EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nE$StateListAnimator) A[MD:(o.nE$StateListAnimator):void (m)] call: o.nE.<init>(o.nE$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C33738nE(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33954nM copydefault() {
        return this.EZpvd;
    }

    public C33738nE(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.KWHzl();
        this.EZpvd = stateListAnimator.OLrzqt();
        this.copydefault = stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.nE$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExpenseDetection(");
        sb.append("confidence=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("geometry=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("text=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.AEQbTJ;
        int iHashCode = f != null ? f.hashCode() : 0;
        C33954nM c33954nM = this.EZpvd;
        int iHashCode2 = c33954nM != null ? c33954nM.hashCode() : 0;
        java.lang.String str = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33738nE.class != obj.getClass()) {
            return false;
        }
        C33738nE c33738nE = (C33738nE) obj;
        return Intrinsics.copydefault(this.AEQbTJ, c33738nE.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c33738nE.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c33738nE.copydefault);
    }

    public static /* synthetic */ C33738nE copy$default(C33738nE c33738nE, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.ExpenseDetection$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C33738nE.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C33738nE.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c33738nE);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    /* JADX INFO: renamed from: o.nE$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public C33954nM KWHzl;
        public java.lang.Float OLrzqt;

        public final StateListAnimator AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C33954nM c33954nM) {
            this.KWHzl = c33954nM;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Float f) {
            this.OLrzqt = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33954nM OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C33738nE c33738nE) {
            this();
            Intrinsics.checkNotNullParameter(c33738nE, "");
            this.OLrzqt = c33738nE.OLrzqt();
            this.KWHzl = c33738nE.copydefault();
            this.AEQbTJ = c33738nE.EZpvd();
        }

        public final C33738nE EZpvd() {
            return new C33738nE(this, null);
        }
    }
}
