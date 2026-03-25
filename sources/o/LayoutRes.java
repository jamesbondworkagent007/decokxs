package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.LayoutRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutRes {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final RestoreObserver AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.LayoutRes$Application) A[MD:(o.LayoutRes$Application):void (m)] call: o.LayoutRes.<init>(o.LayoutRes$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LayoutRes(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreObserver EZpvd() {
        return this.AEQbTJ;
    }

    public LayoutRes(Application application) {
        this.AEQbTJ = application.copydefault();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LayoutRes.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeUserPoolClientResponse(");
        sb.append("userPoolClient=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        RestoreObserver restoreObserver = this.AEQbTJ;
        if (restoreObserver != null) {
            return restoreObserver.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && LayoutRes.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((LayoutRes) obj).AEQbTJ);
    }

    public static /* synthetic */ LayoutRes copy$default(LayoutRes layoutRes, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.DescribeUserPoolClientResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutRes.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutRes.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(layoutRes);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public RestoreObserver AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(RestoreObserver restoreObserver) {
            this.AEQbTJ = restoreObserver;
        }

        public final Application OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreObserver copydefault() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull LayoutRes layoutRes) {
            this();
            Intrinsics.checkNotNullParameter(layoutRes, "");
            this.AEQbTJ = layoutRes.EZpvd();
        }

        public final LayoutRes KWHzl() {
            return new LayoutRes(this, null);
        }
    }
}
