package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C11861cc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11861cc {
    public static final Activity OLrzqt = new Activity(null);
    public final long AEQbTJ;
    public final C11967ce EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.cc$Application) A[MD:(o.cc$Application):void (m)] call: o.cc.<init>(o.cc$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C11861cc(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11967ce KWHzl() {
        return this.EZpvd;
    }

    public C11861cc(Application application) {
        this.EZpvd = application.OLrzqt();
        this.AEQbTJ = application.EZpvd();
    }

    /* JADX INFO: renamed from: o.cc$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cc.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TextDetectionResult(");
        sb.append("textDetection=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("timestamp=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C11967ce c11967ce = this.EZpvd;
        return ((c11967ce != null ? c11967ce.hashCode() : 0) * 31) + java.lang.Long.hashCode(this.AEQbTJ);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11861cc.class != obj.getClass()) {
            return false;
        }
        C11861cc c11861cc = (C11861cc) obj;
        return Intrinsics.EZpvd(this.EZpvd, c11861cc.EZpvd) && this.AEQbTJ == c11861cc.AEQbTJ;
    }

    public static /* synthetic */ C11861cc copy$default(C11861cc c11861cc, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.TextDetectionResult$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C11861cc.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C11861cc.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c11861cc);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.cc$Application */
    public static final class Application {
        public C11967ce AEQbTJ;
        public long EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11967ce OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(long j) {
            this.EZpvd = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C11967ce c11967ce) {
            this.AEQbTJ = c11967ce;
        }

        public final Application copydefault() {
            return this;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C11861cc c11861cc) {
            this();
            Intrinsics.checkNotNullParameter(c11861cc, "");
            this.AEQbTJ = c11861cc.KWHzl();
            this.EZpvd = c11861cc.EZpvd();
        }

        public final C11861cc KWHzl() {
            return new C11861cc(this, null);
        }
    }
}
