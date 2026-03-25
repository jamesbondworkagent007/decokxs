package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C9039bO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C9039bO {
    public static final Activity copydefault = new Activity(null);
    public final AbstractC9410bV AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bO$Application) A[MD:(o.bO$Application):void (m)] call: o.bO.<init>(o.bO$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C9039bO(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC9410bV OLrzqt() {
        return this.AEQbTJ;
    }

    public C9039bO(Application application) {
        this.KWHzl = application.OLrzqt();
        this.AEQbTJ = application.KWHzl();
    }

    /* JADX INFO: renamed from: o.bO$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bO.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StreamProcessor(");
        sb.append("name=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("status=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        AbstractC9410bV abstractC9410bV = this.AEQbTJ;
        return (iHashCode * 31) + (abstractC9410bV != null ? abstractC9410bV.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9039bO.class != obj.getClass()) {
            return false;
        }
        C9039bO c9039bO = (C9039bO) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c9039bO.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c9039bO.AEQbTJ);
    }

    public static /* synthetic */ C9039bO copy$default(C9039bO c9039bO, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StreamProcessor$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C9039bO.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C9039bO.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c9039bO);
        function1.invoke(application);
        return application.EZpvd();
    }

    /* JADX INFO: renamed from: o.bO$Application */
    public static final class Application {
        public AbstractC9410bV AEQbTJ;
        public java.lang.String KWHzl;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC9410bV abstractC9410bV) {
            this.AEQbTJ = abstractC9410bV;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC9410bV KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C9039bO c9039bO) {
            this();
            Intrinsics.checkNotNullParameter(c9039bO, "");
            this.KWHzl = c9039bO.EZpvd();
            this.AEQbTJ = c9039bO.OLrzqt();
        }

        public final C9039bO EZpvd() {
            return new C9039bO(this, null);
        }
    }
}
