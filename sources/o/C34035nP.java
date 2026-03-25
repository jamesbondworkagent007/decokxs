package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34035nP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34035nP {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final AbstractC36549od AEQbTJ;
    public final java.util.List<C36336oY> AhwBna;
    public final java.util.List<C34735ni> EZpvd;
    public final java.lang.String KWHzl;
    public final C33657nB copydefault;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nP$StateListAnimator) A[MD:(o.nP$StateListAnimator):void (m)] call: o.nP.<init>(o.nP$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34035nP(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33657nB AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C34735ni> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC36549od copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36336oY> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    public C34035nP(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.KWHzl();
        this.EZpvd = stateListAnimator.OLrzqt();
        this.copydefault = stateListAnimator.AEQbTJ();
        this.AEQbTJ = stateListAnimator.djBIcL();
        this.valueOf = stateListAnimator.AhwBna();
        this.gEmmrt = stateListAnimator.AYXKKw();
        this.AhwBna = stateListAnimator.valueOf();
    }

    /* JADX INFO: renamed from: o.nP$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetDocumentAnalysisResponse(");
        sb.append("analyzeDocumentModelVersion=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("blocks=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("documentMetadata=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("warnings=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.util.List<C34735ni> list = this.EZpvd;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        C33657nB c33657nB = this.copydefault;
        int iHashCode3 = c33657nB != null ? c33657nB.hashCode() : 0;
        AbstractC36549od abstractC36549od = this.AEQbTJ;
        int iHashCode4 = abstractC36549od != null ? abstractC36549od.hashCode() : 0;
        java.lang.String str2 = this.valueOf;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.gEmmrt;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        java.util.List<C36336oY> list2 = this.AhwBna;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34035nP.class != obj.getClass()) {
            return false;
        }
        C34035nP c34035nP = (C34035nP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c34035nP.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c34035nP.EZpvd) && Intrinsics.EZpvd(this.copydefault, c34035nP.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c34035nP.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c34035nP.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c34035nP.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, c34035nP.AhwBna);
    }

    public static /* synthetic */ C34035nP copy$default(C34035nP c34035nP, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.GetDocumentAnalysisResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34035nP.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34035nP.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c34035nP);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.nP$StateListAnimator */
    public static final class StateListAnimator {
        public java.util.List<C34735ni> AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public C33657nB OLrzqt;
        public AbstractC36549od copydefault;
        public java.lang.String gEmmrt;
        public java.util.List<C36336oY> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33657nB AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C33657nB c33657nB) {
            this.OLrzqt = c33657nB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC36549od abstractC36549od) {
            this.copydefault = abstractC36549od;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.KWHzl;
        }

        public final StateListAnimator EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C36336oY> list) {
            this.valueOf = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C34735ni> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C34735ni> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC36549od djBIcL() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C36336oY> valueOf() {
            return this.valueOf;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C34035nP c34035nP) {
            this();
            Intrinsics.checkNotNullParameter(c34035nP, "");
            this.EZpvd = c34035nP.KWHzl();
            this.AEQbTJ = c34035nP.EZpvd();
            this.OLrzqt = c34035nP.AEQbTJ();
            this.copydefault = c34035nP.copydefault();
            this.KWHzl = c34035nP.OLrzqt();
            this.gEmmrt = c34035nP.valueOf();
            this.valueOf = c34035nP.gEmmrt();
        }

        public final C34035nP copydefault() {
            return new C34035nP(this, null);
        }
    }
}
