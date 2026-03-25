package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.StyleableRes;
import o.TestApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class StyleableRes {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final TestApi AEQbTJ;
    public final C5173Hn EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.StyleableRes$Application) A[MD:(o.StyleableRes$Application):void (m)] call: o.StyleableRes.<init>(o.StyleableRes$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ StyleableRes(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TestApi copydefault() {
        return this.AEQbTJ;
    }

    public StyleableRes(Application application) {
        this.EZpvd = application.copydefault();
        TestApi testApiOLrzqt = application.OLrzqt();
        if (testApiOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for feedbackValue".toString());
        }
        this.AEQbTJ = testApiOLrzqt;
        java.lang.String strKWHzl = application.KWHzl();
        if (strKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for provider".toString());
        }
        this.KWHzl = strKWHzl;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.StyleableRes.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EventFeedbackType(");
        sb.append("feedbackDate=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("feedbackValue=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("provider=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.EZpvd;
        return ((((c5173Hn != null ? c5173Hn.hashCode() : 0) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleableRes.class != obj.getClass()) {
            return false;
        }
        StyleableRes styleableRes = (StyleableRes) obj;
        return Intrinsics.EZpvd(this.EZpvd, styleableRes.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, styleableRes.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) styleableRes.KWHzl);
    }

    public static /* synthetic */ StyleableRes copy$default(StyleableRes styleableRes, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.EventFeedbackType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull StyleableRes.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(StyleableRes.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(styleableRes);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    public static final class Application {
        public TestApi AEQbTJ;
        public C5173Hn KWHzl;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(TestApi testApi) {
            this.AEQbTJ = testApi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TestApi OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull StyleableRes styleableRes) {
            this();
            Intrinsics.checkNotNullParameter(styleableRes, "");
            this.KWHzl = styleableRes.KWHzl();
            this.AEQbTJ = styleableRes.copydefault();
            this.OLrzqt = styleableRes.AEQbTJ();
        }

        public final StyleableRes AEQbTJ() {
            return new StyleableRes(this, null);
        }

        public final Application EZpvd() {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new TestApi.ActionBar("no value provided");
            }
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            return this;
        }
    }
}
