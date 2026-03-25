package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.MainThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class MainThread {
    public static final Activity AEQbTJ = new Activity(null);
    public final RequiresPermission KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.MainThread$Application) A[MD:(o.MainThread$Application):void (m)] call: o.MainThread.<init>(o.MainThread$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MainThread(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RequiresPermission EZpvd() {
        return this.KWHzl;
    }

    public MainThread(Application application) {
        this.KWHzl = application.OLrzqt();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.MainThread.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeUserPoolDomainResponse(");
        sb.append("domainDescription=" + this.KWHzl);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        RequiresPermission requiresPermission = this.KWHzl;
        if (requiresPermission != null) {
            return requiresPermission.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && MainThread.class == obj.getClass() && Intrinsics.EZpvd(this.KWHzl, ((MainThread) obj).KWHzl);
    }

    public static /* synthetic */ MainThread copy$default(MainThread mainThread, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.DescribeUserPoolDomainResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MainThread.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MainThread.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(mainThread);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public RequiresPermission EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(RequiresPermission requiresPermission) {
            this.EZpvd = requiresPermission;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RequiresPermission OLrzqt() {
            return this.EZpvd;
        }

        public final Application copydefault() {
            return this;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull MainThread mainThread) {
            this();
            Intrinsics.checkNotNullParameter(mainThread, "");
            this.EZpvd = mainThread.EZpvd();
        }

        public final MainThread EZpvd() {
            return new MainThread(this, null);
        }
    }
}
