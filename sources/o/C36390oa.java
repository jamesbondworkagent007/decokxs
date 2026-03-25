package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C36390oa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36390oa {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final C33657nB AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final AbstractC36549od copydefault;
    public final java.util.List<C36336oY> gEmmrt;
    public final C36761oh valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oa$StateListAnimator) A[MD:(o.oa$StateListAnimator):void (m)] call: o.oa.<init>(o.oa$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36390oa(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36761oh KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33657nB OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC36549od copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36336oY> djBIcL() {
        return this.gEmmrt;
    }

    public C36390oa(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator.copydefault();
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.EZpvd();
        this.EZpvd = stateListAnimator.AhwBna();
        this.valueOf = stateListAnimator.djBIcL();
        this.gEmmrt = stateListAnimator.AYXKKw();
    }

    /* JADX INFO: renamed from: o.oa$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetLendingAnalysisSummaryResponse(");
        sb.append("analyzeLendingModelVersion=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("documentMetadata=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("summary=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("warnings=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        C33657nB c33657nB = this.AEQbTJ;
        int iHashCode2 = c33657nB != null ? c33657nB.hashCode() : 0;
        AbstractC36549od abstractC36549od = this.copydefault;
        int iHashCode3 = abstractC36549od != null ? abstractC36549od.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        C36761oh c36761oh = this.valueOf;
        int iHashCode5 = c36761oh != null ? c36761oh.hashCode() : 0;
        java.util.List<C36336oY> list = this.gEmmrt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36390oa.class != obj.getClass()) {
            return false;
        }
        C36390oa c36390oa = (C36390oa) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c36390oa.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c36390oa.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c36390oa.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c36390oa.EZpvd) && Intrinsics.EZpvd(this.valueOf, c36390oa.valueOf) && Intrinsics.EZpvd(this.gEmmrt, c36390oa.gEmmrt);
    }

    public static /* synthetic */ C36390oa copy$default(C36390oa c36390oa, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.GetLendingAnalysisSummaryResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36390oa.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36390oa.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c36390oa);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    /* JADX INFO: renamed from: o.oa$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public java.util.List<C36336oY> AYXKKw;
        public C36761oh EZpvd;
        public C33657nB KWHzl;
        public AbstractC36549od OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33657nB AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<C36336oY> list) {
            this.AYXKKw = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C36336oY> AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC36549od EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC36549od abstractC36549od) {
            this.OLrzqt = abstractC36549od;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C33657nB c33657nB) {
            this.KWHzl = c33657nB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C36761oh c36761oh) {
            this.EZpvd = c36761oh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36761oh djBIcL() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C36390oa c36390oa) {
            this();
            Intrinsics.checkNotNullParameter(c36390oa, "");
            this.AEQbTJ = c36390oa.AEQbTJ();
            this.KWHzl = c36390oa.OLrzqt();
            this.OLrzqt = c36390oa.copydefault();
            this.copydefault = c36390oa.EZpvd();
            this.EZpvd = c36390oa.KWHzl();
            this.AYXKKw = c36390oa.djBIcL();
        }

        public final C36390oa OLrzqt() {
            return new C36390oa(this, null);
        }
    }
}
