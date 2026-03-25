package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C11135cD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11135cD {
    public static final Activity copydefault = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.Long AYXKKw;
    public final java.lang.Long AhwBna;
    public final AbstractC11054cA EZpvd;
    public final java.lang.Long KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Float gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.cD$ActionBar) A[MD:(o.cD$ActionBar):void (m)] call: o.cD.<init>(o.cD$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C11135cD(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC11054cA AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float valueOf() {
        return this.gEmmrt;
    }

    public C11135cD(ActionBar actionBar) {
        this.OLrzqt = actionBar.copydefault();
        this.EZpvd = actionBar.AEQbTJ();
        this.KWHzl = actionBar.KWHzl();
        this.AEQbTJ = actionBar.gEmmrt();
        this.AhwBna = actionBar.valueOf();
        this.gEmmrt = actionBar.djBIcL();
        this.AYXKKw = actionBar.AhwBna();
    }

    /* JADX INFO: renamed from: o.cD$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VideoMetadata(");
        sb.append("codec=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("colorRange=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("durationMillis=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("format=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("frameHeight=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("frameRate=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("frameWidth=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        AbstractC11054cA abstractC11054cA = this.EZpvd;
        int iHashCode2 = abstractC11054cA != null ? abstractC11054cA.hashCode() : 0;
        java.lang.Long l = this.KWHzl;
        int iHashCode3 = l != null ? l.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.Long l2 = this.AhwBna;
        int iHashCode5 = l2 != null ? l2.hashCode() : 0;
        java.lang.Float f = this.gEmmrt;
        int iHashCode6 = f != null ? f.hashCode() : 0;
        java.lang.Long l3 = this.AYXKKw;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (l3 != null ? l3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11135cD.class != obj.getClass()) {
            return false;
        }
        C11135cD c11135cD = (C11135cD) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c11135cD.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c11135cD.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c11135cD.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c11135cD.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, c11135cD.AhwBna) && Intrinsics.copydefault(this.gEmmrt, c11135cD.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, c11135cD.AYXKKw);
    }

    public static /* synthetic */ C11135cD copy$default(C11135cD c11135cD, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.VideoMetadata$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C11135cD.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C11135cD.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c11135cD);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.cD$ActionBar */
    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public java.lang.Long EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Long OLrzqt;
        public AbstractC11054cA copydefault;
        public java.lang.Float djBIcL;
        public java.lang.Long valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC11054cA AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Long l) {
            this.valueOf = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC11054cA abstractC11054cA) {
            this.copydefault = abstractC11054cA;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Long l) {
            this.EZpvd = l;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Float f) {
            this.djBIcL = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Long l) {
            this.OLrzqt = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long valueOf() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C11135cD c11135cD) {
            this();
            Intrinsics.checkNotNullParameter(c11135cD, "");
            this.AEQbTJ = c11135cD.KWHzl();
            this.copydefault = c11135cD.AEQbTJ();
            this.EZpvd = c11135cD.EZpvd();
            this.KWHzl = c11135cD.OLrzqt();
            this.OLrzqt = c11135cD.copydefault();
            this.djBIcL = c11135cD.valueOf();
            this.valueOf = c11135cD.djBIcL();
        }

        public final C11135cD EZpvd() {
            return new C11135cD(this, null);
        }
    }
}
