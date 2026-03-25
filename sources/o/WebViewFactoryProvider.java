package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WebViewFactoryProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class WebViewFactoryProvider {
    public static final ActionBar copydefault = new ActionBar(null);
    public final java.lang.Long AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Long KWHzl;
    public final java.lang.Long OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WebViewFactoryProvider$Application) A[MD:(o.WebViewFactoryProvider$Application):void (m)] call: o.WebViewFactoryProvider.<init>(o.WebViewFactoryProvider$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WebViewFactoryProvider(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public WebViewFactoryProvider(Application application) {
        this.EZpvd = application.copydefault();
        this.OLrzqt = application.OLrzqt();
        this.KWHzl = application.EZpvd();
        this.AEQbTJ = application.AYXKKw();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WebViewFactoryProvider.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AudioMetadata(");
        sb.append("codec=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("durationMillis=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("numberOfChannels=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sampleRate=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.Long l = this.OLrzqt;
        int iHashCode2 = l != null ? l.hashCode() : 0;
        java.lang.Long l2 = this.KWHzl;
        int iHashCode3 = l2 != null ? l2.hashCode() : 0;
        java.lang.Long l3 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l3 != null ? l3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WebViewFactoryProvider.class != obj.getClass()) {
            return false;
        }
        WebViewFactoryProvider webViewFactoryProvider = (WebViewFactoryProvider) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) webViewFactoryProvider.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, webViewFactoryProvider.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, webViewFactoryProvider.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, webViewFactoryProvider.AEQbTJ);
    }

    public static /* synthetic */ WebViewFactoryProvider copy$default(WebViewFactoryProvider webViewFactoryProvider, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.AudioMetadata$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WebViewFactoryProvider.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WebViewFactoryProvider.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(webViewFactoryProvider);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public java.lang.Long EZpvd;
        public java.lang.Long KWHzl;
        public java.lang.Long OLrzqt;
        public java.lang.String copydefault;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Long l) {
            this.OLrzqt = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Long l) {
            this.KWHzl = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Long l) {
            this.EZpvd = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull WebViewFactoryProvider webViewFactoryProvider) {
            this();
            Intrinsics.checkNotNullParameter(webViewFactoryProvider, "");
            this.copydefault = webViewFactoryProvider.copydefault();
            this.OLrzqt = webViewFactoryProvider.KWHzl();
            this.KWHzl = webViewFactoryProvider.EZpvd();
            this.EZpvd = webViewFactoryProvider.AEQbTJ();
        }

        public final WebViewFactoryProvider KWHzl() {
            return new WebViewFactoryProvider(this, null);
        }
    }
}
