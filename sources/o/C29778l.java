package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C29778l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C29778l {
    public static final Activity copydefault = new Activity(null);
    public final java.util.List<WebViewProvider> AEQbTJ;
    public final AbstractC6105aJ AYXKKw;
    public final C25615j EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Integer gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.l$Application) A[MD:(o.l$Application):void (m)] call: o.l.<init>(o.l$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C29778l(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<WebViewProvider> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25615j OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC6105aJ djBIcL() {
        return this.AYXKKw;
    }

    public C29778l(Application application) {
        this.OLrzqt = application.copydefault();
        this.AEQbTJ = application.OLrzqt();
        this.KWHzl = application.KWHzl();
        this.EZpvd = application.AEQbTJ();
        this.gEmmrt = application.gEmmrt();
        this.AYXKKw = application.djBIcL();
    }

    /* JADX INFO: renamed from: o.l$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.l.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IndexFacesRequest(");
        sb.append("collectionId=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("detectionAttributes=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("externalImageId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("image=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("maxFaces=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("qualityFilter=");
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
        java.util.List<WebViewProvider> list = this.AEQbTJ;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        C25615j c25615j = this.EZpvd;
        int iHashCode4 = c25615j != null ? c25615j.hashCode() : 0;
        java.lang.Integer num = this.gEmmrt;
        int iIntValue = num != null ? num.intValue() : 0;
        AbstractC6105aJ abstractC6105aJ = this.AYXKKw;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iIntValue) * 31) + (abstractC6105aJ != null ? abstractC6105aJ.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C29778l.class != obj.getClass()) {
            return false;
        }
        C29778l c29778l = (C29778l) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c29778l.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c29778l.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c29778l.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c29778l.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, c29778l.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, c29778l.AYXKKw);
    }

    public static /* synthetic */ C29778l copy$default(C29778l c29778l, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.IndexFacesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C29778l.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C29778l.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c29778l);
        function1.invoke(application);
        return application.EZpvd();
    }

    /* JADX INFO: renamed from: o.l$Application */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public AbstractC6105aJ AhwBna;
        public java.lang.String EZpvd;
        public java.lang.Integer KWHzl;
        public C25615j OLrzqt;
        public java.util.List<? extends WebViewProvider> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C25615j AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.WebViewProvider>, java.util.List<o.WebViewProvider> */
        public final java.util.List<WebViewProvider> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC6105aJ djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer gEmmrt() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C29778l c29778l) {
            this();
            Intrinsics.checkNotNullParameter(c29778l, "");
            this.AEQbTJ = c29778l.KWHzl();
            this.copydefault = c29778l.EZpvd();
            this.EZpvd = c29778l.copydefault();
            this.OLrzqt = c29778l.OLrzqt();
            this.KWHzl = c29778l.AEQbTJ();
            this.AhwBna = c29778l.djBIcL();
        }

        public final C29778l EZpvd() {
            return new C29778l(this, null);
        }
    }
}
