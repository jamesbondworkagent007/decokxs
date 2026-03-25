package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C46294tP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C46294tP {
    public static final Activity OLrzqt = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final C45916tB AYXKKw;
    public final java.util.List<java.lang.String> AhwBna;
    public final java.util.List<java.lang.String> AkhnZx;
    public final C47280tn EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;
    public final java.util.List<java.lang.String> djBIcL;
    public final C48882ue gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tP$StateListAnimator) A[MD:(o.tP$StateListAnimator):void (m)] call: o.tP.<init>(o.tP$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C46294tP(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47280tn AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45916tB copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48882ue gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> valueOf() {
        return this.AkhnZx;
    }

    public C46294tP(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.copydefault();
        this.KWHzl = stateListAnimator.KWHzl();
        this.EZpvd = stateListAnimator.EZpvd();
        this.copydefault = stateListAnimator.OLrzqt();
        this.AYXKKw = stateListAnimator.AhwBna();
        this.djBIcL = stateListAnimator.valueOf();
        this.gEmmrt = stateListAnimator.djBIcL();
        this.valueOf = stateListAnimator.gEmmrt();
        this.AhwBna = stateListAnimator.AYXKKw();
        this.AkhnZx = stateListAnimator.isConnected();
    }

    /* JADX INFO: renamed from: o.tP$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartTextTranslationJobRequest(");
        sb.append("clientToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("parallelDataNames=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("settings=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("sourceLanguageCode=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("targetLanguageCodes=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("terminologyNames=");
        sb2.append(this.AkhnZx);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        C47280tn c47280tn = this.EZpvd;
        int iHashCode3 = c47280tn != null ? c47280tn.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        C45916tB c45916tB = this.AYXKKw;
        int iHashCode5 = c45916tB != null ? c45916tB.hashCode() : 0;
        java.util.List<java.lang.String> list = this.djBIcL;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        C48882ue c48882ue = this.gEmmrt;
        int iHashCode7 = c48882ue != null ? c48882ue.hashCode() : 0;
        java.lang.String str4 = this.valueOf;
        int iHashCode8 = str4 != null ? str4.hashCode() : 0;
        java.util.List<java.lang.String> list2 = this.AhwBna;
        int iHashCode9 = list2 != null ? list2.hashCode() : 0;
        java.util.List<java.lang.String> list3 = this.AkhnZx;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C46294tP.class != obj.getClass()) {
            return false;
        }
        C46294tP c46294tP = (C46294tP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46294tP.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c46294tP.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c46294tP.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c46294tP.copydefault) && Intrinsics.EZpvd(this.AYXKKw, c46294tP.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, c46294tP.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, c46294tP.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c46294tP.valueOf) && Intrinsics.EZpvd(this.AhwBna, c46294tP.AhwBna) && Intrinsics.EZpvd(this.AkhnZx, c46294tP.AkhnZx);
    }

    public static /* synthetic */ C46294tP copy$default(C46294tP c46294tP, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.StartTextTranslationJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C46294tP.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46294tP.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c46294tP);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tP$StateListAnimator */
    public static final class StateListAnimator {
        public C47280tn AEQbTJ;
        public java.lang.String AYXKKw;
        public java.util.List<java.lang.String> AhwBna;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public C45916tB OLrzqt;
        public java.lang.String copydefault;
        public java.util.List<java.lang.String> djBIcL;
        public java.util.List<java.lang.String> gEmmrt;
        public C48882ue valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C45916tB AhwBna() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C47280tn EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C48882ue djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> isConnected() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> valueOf() {
            return this.AhwBna;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C46294tP c46294tP) {
            this();
            Intrinsics.checkNotNullParameter(c46294tP, "");
            this.KWHzl = c46294tP.OLrzqt();
            this.EZpvd = c46294tP.EZpvd();
            this.AEQbTJ = c46294tP.AEQbTJ();
            this.copydefault = c46294tP.KWHzl();
            this.OLrzqt = c46294tP.copydefault();
            this.AhwBna = c46294tP.djBIcL();
            this.valueOf = c46294tP.gEmmrt();
            this.AYXKKw = c46294tP.AhwBna();
            this.djBIcL = c46294tP.AYXKKw();
            this.gEmmrt = c46294tP.valueOf();
        }

        public final C46294tP AEQbTJ() {
            return new C46294tP(this, null);
        }
    }
}
