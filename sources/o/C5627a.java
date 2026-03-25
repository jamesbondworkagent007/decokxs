package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5627a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5627a {
    public static final Activity EZpvd = new Activity(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.a$Application) A[MD:(o.a$Application):void (m)] call: o.a.<init>(o.a$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C5627a(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.AEQbTJ;
    }

    public C5627a(Application application) {
        this.KWHzl = application.EZpvd();
        this.AEQbTJ = application.copydefault();
        this.OLrzqt = application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.a$Activity */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.a.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetSegmentDetectionRequest(");
        sb.append("jobId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.Integer num = this.AEQbTJ;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.OLrzqt;
        return (((iHashCode * 31) + iIntValue) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5627a.class != obj.getClass()) {
            return false;
        }
        C5627a c5627a = (C5627a) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c5627a.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c5627a.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c5627a.OLrzqt);
    }

    public static /* synthetic */ C5627a copy$default(C5627a c5627a, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetSegmentDetectionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C5627a.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C5627a.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c5627a);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.a$Application */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public java.lang.Integer AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C5627a c5627a) {
            this();
            Intrinsics.checkNotNullParameter(c5627a, "");
            this.EZpvd = c5627a.AEQbTJ();
            this.AEQbTJ = c5627a.OLrzqt();
            this.KWHzl = c5627a.EZpvd();
        }

        public final C5627a KWHzl() {
            return new C5627a(this, null);
        }
    }
}
