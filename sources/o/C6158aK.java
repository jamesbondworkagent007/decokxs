package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C6158aK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C6158aK {
    public static final ActionBar copydefault = new ActionBar(null);
    public final WebViewZygote EZpvd;
    public final java.util.List<C7980au> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aK$Application) A[MD:(o.aK$Application):void (m)] call: o.aK.<init>(o.aK$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C6158aK(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C7980au> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote copydefault() {
        return this.EZpvd;
    }

    public C6158aK(Application application) {
        this.EZpvd = application.copydefault();
        this.OLrzqt = application.EZpvd();
    }

    /* JADX INFO: renamed from: o.aK$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RegionOfInterest(");
        sb.append("boundingBox=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("polygon=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WebViewZygote webViewZygote = this.EZpvd;
        int iHashCode = webViewZygote != null ? webViewZygote.hashCode() : 0;
        java.util.List<C7980au> list = this.OLrzqt;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6158aK.class != obj.getClass()) {
            return false;
        }
        C6158aK c6158aK = (C6158aK) obj;
        return Intrinsics.EZpvd(this.EZpvd, c6158aK.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c6158aK.OLrzqt);
    }

    public static /* synthetic */ C6158aK copy$default(C6158aK c6158aK, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.RegionOfInterest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C6158aK.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C6158aK.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c6158aK);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.aK$Application */
    public static final class Application {
        public WebViewZygote AEQbTJ;
        public java.util.List<C7980au> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C7980au> EZpvd() {
            return this.EZpvd;
        }

        public final Application OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C7980au> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(WebViewZygote webViewZygote) {
            this.AEQbTJ = webViewZygote;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C6158aK c6158aK) {
            this();
            Intrinsics.checkNotNullParameter(c6158aK, "");
            this.AEQbTJ = c6158aK.copydefault();
            this.EZpvd = c6158aK.AEQbTJ();
        }

        public final C6158aK KWHzl() {
            return new C6158aK(this, null);
        }
    }
}
