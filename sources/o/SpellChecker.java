package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SpellChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SpellChecker {
    public static final Activity EZpvd = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final WebViewZygote KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Float copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SpellChecker$Application) A[MD:(o.SpellChecker$Application):void (m)] call: o.SpellChecker.<init>(o.SpellChecker$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SpellChecker(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    public SpellChecker(Application application) {
        this.KWHzl = application.OLrzqt();
        this.copydefault = application.EZpvd();
        this.AEQbTJ = application.KWHzl();
        this.OLrzqt = application.AYXKKw();
        this.AYXKKw = application.AhwBna();
        this.AhwBna = application.valueOf();
        this.gEmmrt = application.djBIcL();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SpellChecker.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Face(");
        sb.append("boundingBox=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("confidence=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("externalImageId=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("faceId=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("imageId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("indexFacesModelVersion=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userId=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WebViewZygote webViewZygote = this.KWHzl;
        int iHashCode = webViewZygote != null ? webViewZygote.hashCode() : 0;
        java.lang.Float f = this.copydefault;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AYXKKw;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SpellChecker.class != obj.getClass()) {
            return false;
        }
        SpellChecker spellChecker = (SpellChecker) obj;
        return Intrinsics.EZpvd(this.KWHzl, spellChecker.KWHzl) && Intrinsics.copydefault(this.copydefault, spellChecker.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) spellChecker.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) spellChecker.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) spellChecker.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) spellChecker.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) spellChecker.gEmmrt);
    }

    public static /* synthetic */ SpellChecker copy$default(SpellChecker spellChecker, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.Face$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SpellChecker.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SpellChecker.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(spellChecker);
        function1.invoke(application);
        return application.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public java.lang.Float AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String EZpvd;
        public WebViewZygote KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String gEmmrt;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Float f) {
            this.AEQbTJ = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(WebViewZygote webViewZygote) {
            this.KWHzl = webViewZygote;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull SpellChecker spellChecker) {
            this();
            Intrinsics.checkNotNullParameter(spellChecker, "");
            this.KWHzl = spellChecker.OLrzqt();
            this.AEQbTJ = spellChecker.AEQbTJ();
            this.EZpvd = spellChecker.EZpvd();
            this.OLrzqt = spellChecker.KWHzl();
            this.copydefault = spellChecker.copydefault();
            this.gEmmrt = spellChecker.AhwBna();
            this.AYXKKw = spellChecker.djBIcL();
        }

        public final SpellChecker copydefault() {
            return new SpellChecker(this, null);
        }
    }
}
