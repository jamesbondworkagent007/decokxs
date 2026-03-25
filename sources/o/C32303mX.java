package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C32303mX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C32303mX {
    public static final Activity copydefault = new Activity(null);
    public final C5173Hn AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.util.List<AbstractC33846nI> EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final AbstractC32276mW gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.mX$StateListAnimator) A[MD:(o.mX$StateListAnimator):void (m)] call: o.mX.<init>(o.mX$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C32303mX(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC32276mW AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC33846nI> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public C32303mX(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.copydefault();
        this.OLrzqt = stateListAnimator.KWHzl();
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        this.EZpvd = stateListAnimator.AYXKKw();
        this.gEmmrt = stateListAnimator.valueOf();
        this.AhwBna = stateListAnimator.djBIcL();
    }

    /* JADX INFO: renamed from: o.mX$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdapterVersionOverview(");
        sb.append("adapterId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("adapterVersion=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("creationTime=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("featureTypes=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("statusMessage=");
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
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        C5173Hn c5173Hn = this.AEQbTJ;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.util.List<AbstractC33846nI> list = this.EZpvd;
        int iHashCode4 = list != null ? list.hashCode() : 0;
        AbstractC32276mW abstractC32276mW = this.gEmmrt;
        int iHashCode5 = abstractC32276mW != null ? abstractC32276mW.hashCode() : 0;
        java.lang.String str3 = this.AhwBna;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C32303mX.class != obj.getClass()) {
            return false;
        }
        C32303mX c32303mX = (C32303mX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c32303mX.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c32303mX.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c32303mX.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c32303mX.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, c32303mX.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c32303mX.AhwBna);
    }

    public static /* synthetic */ C32303mX copy$default(C32303mX c32303mX, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.AdapterVersionOverview$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C32303mX.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C32303mX.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c32303mX);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    /* JADX INFO: renamed from: o.mX$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public AbstractC32276mW EZpvd;
        public C5173Hn KWHzl;
        public java.lang.String OLrzqt;
        public java.util.List<? extends AbstractC33846nI> copydefault;
        public java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<? extends AbstractC33846nI> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.nI>, java.util.List<o.nI> */
        public final java.util.List<AbstractC33846nI> AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC32276mW abstractC32276mW) {
            this.EZpvd = abstractC32276mW;
        }

        public final StateListAnimator OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC32276mW valueOf() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C32303mX c32303mX) {
            this();
            Intrinsics.checkNotNullParameter(c32303mX, "");
            this.OLrzqt = c32303mX.KWHzl();
            this.AEQbTJ = c32303mX.copydefault();
            this.KWHzl = c32303mX.EZpvd();
            this.copydefault = c32303mX.OLrzqt();
            this.EZpvd = c32303mX.AEQbTJ();
            this.gEmmrt = c32303mX.AhwBna();
        }

        public final C32303mX EZpvd() {
            return new C32303mX(this, null);
        }
    }
}
