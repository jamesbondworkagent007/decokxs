package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C47174tl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C47174tl {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.lang.String EZpvd;
    public final AbstractC46375tS OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tl$Application) A[MD:(o.tl$Application):void (m)] call: o.tl.<init>(o.tl$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C47174tl(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46375tS copydefault() {
        return this.OLrzqt;
    }

    public C47174tl(Application application) {
        this.EZpvd = application.copydefault();
        this.OLrzqt = application.EZpvd();
    }

    /* JADX INFO: renamed from: o.tl$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetTerminologyRequest(");
        sb.append("name=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("terminologyDataFormat=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        AbstractC46375tS abstractC46375tS = this.OLrzqt;
        return (iHashCode * 31) + (abstractC46375tS != null ? abstractC46375tS.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C47174tl.class != obj.getClass()) {
            return false;
        }
        C47174tl c47174tl = (C47174tl) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c47174tl.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c47174tl.OLrzqt);
    }

    public static /* synthetic */ C47174tl copy$default(C47174tl c47174tl, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.GetTerminologyRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47174tl.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47174tl.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c47174tl);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.tl$Application */
    public static final class Application {
        public AbstractC46375tS EZpvd;
        public java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46375tS EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C47174tl c47174tl) {
            this();
            Intrinsics.checkNotNullParameter(c47174tl, "");
            this.KWHzl = c47174tl.EZpvd();
            this.EZpvd = c47174tl.copydefault();
        }

        public final C47174tl KWHzl() {
            return new C47174tl(this, null);
        }
    }
}
