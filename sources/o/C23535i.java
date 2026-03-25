package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C23535i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C23535i {
    public static final Activity KWHzl = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final C21454h OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.i$Application) A[MD:(o.i$Application):void (m)] call: o.i.<init>(o.i$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C23535i(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C21454h EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    public C23535i(Application application) {
        this.OLrzqt = application.copydefault();
        java.lang.String strKWHzl = application.KWHzl();
        if (strKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for flowDefinitionArn".toString());
        }
        this.EZpvd = strKWHzl;
        java.lang.String strOLrzqt = application.OLrzqt();
        if (strOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for humanLoopName".toString());
        }
        this.AEQbTJ = strOLrzqt;
    }

    /* JADX INFO: renamed from: o.i$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.i.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HumanLoopConfig(");
        sb.append("dataAttributes=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("flowDefinitionArn=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("humanLoopName=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C21454h c21454h = this.OLrzqt;
        return ((((c21454h != null ? c21454h.hashCode() : 0) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23535i.class != obj.getClass()) {
            return false;
        }
        C23535i c23535i = (C23535i) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c23535i.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c23535i.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c23535i.AEQbTJ);
    }

    public static /* synthetic */ C23535i copy$default(C23535i c23535i, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.HumanLoopConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C23535i.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C23535i.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c23535i);
        function1.invoke(application);
        return application.EZpvd();
    }

    /* JADX INFO: renamed from: o.i$Application */
    public static final class Application {
        public C21454h EZpvd;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21454h copydefault() {
            return this.EZpvd;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C23535i c23535i) {
            this();
            Intrinsics.checkNotNullParameter(c23535i, "");
            this.EZpvd = c23535i.EZpvd();
            this.OLrzqt = c23535i.OLrzqt();
            this.copydefault = c23535i.KWHzl();
        }

        public final C23535i EZpvd() {
            return new C23535i(this, null);
        }
    }
}
