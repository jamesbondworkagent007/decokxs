package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C12285ck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C12285ck {
    public static final Activity OLrzqt = new Activity(null);
    public final C11081cB EZpvd;
    public final C12126ch KWHzl;
    public final C12126ch copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ck$Application) A[MD:(o.ck$Application):void (m)] call: o.ck.<init>(o.ck$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C12285ck(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12126ch EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12126ch KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11081cB copydefault() {
        return this.EZpvd;
    }

    public C12285ck(Application application) {
        this.copydefault = application.AEQbTJ();
        this.KWHzl = application.copydefault();
        this.EZpvd = application.EZpvd();
    }

    /* JADX INFO: renamed from: o.ck$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ck.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TrainingDataResult(");
        sb.append("input=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("output=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("validation=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C12126ch c12126ch = this.copydefault;
        int iHashCode = c12126ch != null ? c12126ch.hashCode() : 0;
        C12126ch c12126ch2 = this.KWHzl;
        int iHashCode2 = c12126ch2 != null ? c12126ch2.hashCode() : 0;
        C11081cB c11081cB = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c11081cB != null ? c11081cB.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12285ck.class != obj.getClass()) {
            return false;
        }
        C12285ck c12285ck = (C12285ck) obj;
        return Intrinsics.EZpvd(this.copydefault, c12285ck.copydefault) && Intrinsics.EZpvd(this.KWHzl, c12285ck.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c12285ck.EZpvd);
    }

    public static /* synthetic */ C12285ck copy$default(C12285ck c12285ck, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.TrainingDataResult$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C12285ck.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C12285ck.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c12285ck);
        function1.invoke(application);
        return application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.ck$Application */
    public static final class Application {
        public C12126ch AEQbTJ;
        public C11081cB KWHzl;
        public C12126ch copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C12126ch AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11081cB EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C11081cB c11081cB) {
            this.KWHzl = c11081cB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C12126ch c12126ch) {
            this.copydefault = c12126ch;
        }

        public final Application KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C12126ch c12126ch) {
            this.AEQbTJ = c12126ch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C12126ch copydefault() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C12285ck c12285ck) {
            this();
            Intrinsics.checkNotNullParameter(c12285ck, "");
            this.copydefault = c12285ck.KWHzl();
            this.AEQbTJ = c12285ck.EZpvd();
            this.KWHzl = c12285ck.copydefault();
        }

        public final C12285ck OLrzqt() {
            return new C12285ck(this, null);
        }
    }
}
