package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C11755ca;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11755ca {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.lang.String EZpvd;
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ca$Application) A[MD:(o.ca$Application):void (m)] call: o.ca.<init>(o.ca$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C11755ca(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.KWHzl;
    }

    public C11755ca(Application application) {
        this.EZpvd = application.OLrzqt();
        this.KWHzl = application.copydefault();
    }

    /* JADX INFO: renamed from: o.ca$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ca.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TagResourceRequest(");
        sb.append("resourceArn=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tags=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.KWHzl;
        return (iHashCode * 31) + (map != null ? map.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11755ca.class != obj.getClass()) {
            return false;
        }
        C11755ca c11755ca = (C11755ca) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c11755ca.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c11755ca.KWHzl);
    }

    public static /* synthetic */ C11755ca copy$default(C11755ca c11755ca, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.TagResourceRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C11755ca.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C11755ca.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c11755ca);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.ca$Application */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.util.Map<java.lang.String, java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
            return this.copydefault;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C11755ca c11755ca) {
            this();
            Intrinsics.checkNotNullParameter(c11755ca, "");
            this.AEQbTJ = c11755ca.EZpvd();
            this.copydefault = c11755ca.copydefault();
        }

        public final C11755ca KWHzl() {
            return new C11755ca(this, null);
        }
    }
}
