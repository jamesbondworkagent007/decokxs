package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C7874as;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.as, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C7874as {
    public static final Activity copydefault = new Activity(null);
    public final long AEQbTJ;
    public final WebViewZygote EZpvd;
    public final SmartSelectSprite KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.as$Application) A[MD:(o.as$Application):void (m)] call: o.as.<init>(o.as$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C7874as(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartSelectSprite KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote copydefault() {
        return this.EZpvd;
    }

    public C7874as(Application application) {
        this.EZpvd = application.KWHzl();
        this.KWHzl = application.OLrzqt();
        this.AEQbTJ = application.EZpvd();
    }

    /* JADX INFO: renamed from: o.as$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.as.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PersonDetail(");
        sb.append("boundingBox=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("face=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("index=");
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
        SmartSelectSprite smartSelectSprite = this.KWHzl;
        return (((iHashCode * 31) + (smartSelectSprite != null ? smartSelectSprite.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.AEQbTJ);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7874as.class != obj.getClass()) {
            return false;
        }
        C7874as c7874as = (C7874as) obj;
        return Intrinsics.EZpvd(this.EZpvd, c7874as.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c7874as.KWHzl) && this.AEQbTJ == c7874as.AEQbTJ;
    }

    public static /* synthetic */ C7874as copy$default(C7874as c7874as, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.PersonDetail$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C7874as.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C7874as.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c7874as);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.as$Application */
    public static final class Application {
        public SmartSelectSprite AEQbTJ;
        public long EZpvd;
        public WebViewZygote copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(SmartSelectSprite smartSelectSprite) {
            this.AEQbTJ = smartSelectSprite;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(long j) {
            this.EZpvd = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SmartSelectSprite OLrzqt() {
            return this.AEQbTJ;
        }

        public final Application copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(WebViewZygote webViewZygote) {
            this.copydefault = webViewZygote;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C7874as c7874as) {
            this();
            Intrinsics.checkNotNullParameter(c7874as, "");
            this.copydefault = c7874as.copydefault();
            this.AEQbTJ = c7874as.KWHzl();
            this.EZpvd = c7874as.EZpvd();
        }

        public final C7874as AEQbTJ() {
            return new C7874as(this, null);
        }
    }
}
