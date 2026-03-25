package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C35904oI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35904oI {
    public static final Application OLrzqt = new Application(null);
    public final java.util.List<AbstractC33846nI> AEQbTJ;
    public final C37715oz AYXKKw;
    public final C37344os AhwBna;
    public final C35634nz EZpvd;
    public final C34331na KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final C37291or valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oI$ActionBar) A[MD:(o.oI$ActionBar):void (m)] call: o.oI.<init>(o.oI$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35904oI(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC33846nI> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37344os AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37291or AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35634nz KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34331na copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37715oz djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public C35904oI(ActionBar actionBar) {
        this.KWHzl = actionBar.EZpvd();
        this.copydefault = actionBar.OLrzqt();
        this.EZpvd = actionBar.AEQbTJ();
        this.AEQbTJ = actionBar.copydefault();
        this.gEmmrt = actionBar.valueOf();
        this.djBIcL = actionBar.gEmmrt();
        this.valueOf = actionBar.AYXKKw();
        this.AhwBna = actionBar.djBIcL();
        this.AYXKKw = actionBar.AhwBna();
    }

    /* JADX INFO: renamed from: o.oI$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oI.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartDocumentAnalysisRequest(");
        sb.append("adaptersConfig=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("clientRequestToken=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("documentLocation=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("featureTypes=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("notificationChannel=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("outputConfig=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("queriesConfig=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C34331na c34331na = this.KWHzl;
        int iHashCode = c34331na != null ? c34331na.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        C35634nz c35634nz = this.EZpvd;
        int iHashCode3 = c35634nz != null ? c35634nz.hashCode() : 0;
        java.util.List<AbstractC33846nI> list = this.AEQbTJ;
        int iHashCode4 = list != null ? list.hashCode() : 0;
        java.lang.String str2 = this.gEmmrt;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.djBIcL;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        C37291or c37291or = this.valueOf;
        int iHashCode7 = c37291or != null ? c37291or.hashCode() : 0;
        C37344os c37344os = this.AhwBna;
        int iHashCode8 = c37344os != null ? c37344os.hashCode() : 0;
        C37715oz c37715oz = this.AYXKKw;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (c37715oz != null ? c37715oz.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C35904oI.class != obj.getClass()) {
            return false;
        }
        C35904oI c35904oI = (C35904oI) obj;
        return Intrinsics.EZpvd(this.KWHzl, c35904oI.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c35904oI.copydefault) && Intrinsics.EZpvd(this.EZpvd, c35904oI.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c35904oI.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c35904oI.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c35904oI.djBIcL) && Intrinsics.EZpvd(this.valueOf, c35904oI.valueOf) && Intrinsics.EZpvd(this.AhwBna, c35904oI.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, c35904oI.AYXKKw);
    }

    public static /* synthetic */ C35904oI copy$default(C35904oI c35904oI, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.StartDocumentAnalysisRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C35904oI.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C35904oI.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c35904oI);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    /* JADX INFO: renamed from: o.oI$ActionBar */
    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public C37291or AhwBna;
        public C35634nz EZpvd;
        public java.lang.String KWHzl;
        public C34331na OLrzqt;
        public java.util.List<? extends AbstractC33846nI> copydefault;
        public java.lang.String djBIcL;
        public C37715oz gEmmrt;
        public C37344os valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35634nz AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37291or AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37715oz AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C34331na EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.nI>, java.util.List<o.nI> */
        public final java.util.List<AbstractC33846nI> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37344os djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C35904oI c35904oI) {
            this();
            Intrinsics.checkNotNullParameter(c35904oI, "");
            this.OLrzqt = c35904oI.copydefault();
            this.AEQbTJ = c35904oI.OLrzqt();
            this.EZpvd = c35904oI.KWHzl();
            this.copydefault = c35904oI.AEQbTJ();
            this.KWHzl = c35904oI.EZpvd();
            this.djBIcL = c35904oI.valueOf();
            this.AhwBna = c35904oI.AhwBna();
            this.valueOf = c35904oI.AYXKKw();
            this.gEmmrt = c35904oI.djBIcL();
        }

        public final C35904oI KWHzl() {
            return new C35904oI(this, null);
        }
    }
}
