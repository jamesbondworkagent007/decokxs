package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AdapterViewAnimator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AdapterViewAnimator {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final java.lang.Float AEQbTJ;
    public final WebViewZygote EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AdapterViewAnimator$Application) A[MD:(o.AdapterViewAnimator$Application):void (m)] call: o.AdapterViewAnimator.<init>(o.AdapterViewAnimator$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AdapterViewAnimator(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote copydefault() {
        return this.EZpvd;
    }

    public AdapterViewAnimator(Application application) {
        this.EZpvd = application.KWHzl();
        this.AEQbTJ = application.AEQbTJ();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AdapterViewAnimator.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ComparedSourceImageFace(");
        sb.append("boundingBox=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("confidence=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WebViewZygote webViewZygote = this.EZpvd;
        int iHashCode = webViewZygote != null ? webViewZygote.hashCode() : 0;
        java.lang.Float f = this.AEQbTJ;
        return (iHashCode * 31) + (f != null ? f.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdapterViewAnimator.class != obj.getClass()) {
            return false;
        }
        AdapterViewAnimator adapterViewAnimator = (AdapterViewAnimator) obj;
        return Intrinsics.EZpvd(this.EZpvd, adapterViewAnimator.EZpvd) && Intrinsics.copydefault(this.AEQbTJ, adapterViewAnimator.AEQbTJ);
    }

    public static /* synthetic */ AdapterViewAnimator copy$default(AdapterViewAnimator adapterViewAnimator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ComparedSourceImageFace$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AdapterViewAnimator.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AdapterViewAnimator.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(adapterViewAnimator);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public java.lang.Float EZpvd;
        public WebViewZygote OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Float f) {
            this.EZpvd = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(WebViewZygote webViewZygote) {
            this.OLrzqt = webViewZygote;
        }

        public final Application OLrzqt() {
            return this;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AdapterViewAnimator adapterViewAnimator) {
            this();
            Intrinsics.checkNotNullParameter(adapterViewAnimator, "");
            this.OLrzqt = adapterViewAnimator.copydefault();
            this.EZpvd = adapterViewAnimator.EZpvd();
        }

        public final AdapterViewAnimator EZpvd() {
            return new AdapterViewAnimator(this, null);
        }
    }
}
