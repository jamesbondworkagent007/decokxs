package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31817mF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C31817mF {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.mF$Application) A[MD:(o.mF$Application):void (m)] call: o.mF.<init>(o.mF$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C31817mF(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    public C31817mF(Application application) {
        java.lang.String strCopydefault = application.copydefault();
        if (strCopydefault == null) {
            throw new java.lang.IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.OLrzqt = strCopydefault;
    }

    /* JADX INFO: renamed from: o.mF$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.mF$Application */
    public static final class Application {
        public java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        public final C31817mF OLrzqt() {
            return new C31817mF(this, null);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TextractAuthSchemeParameters(");
        sb.append("operationName=" + this.OLrzqt + ')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31817mF) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((C31817mF) obj).OLrzqt);
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C31817mF copy$default(C31817mF c31817mF, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.auth.TextractAuthSchemeParameters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C31817mF.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C31817mF.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        return c31817mF.AEQbTJ(function1);
    }

    public final C31817mF AEQbTJ(@NotNull Function1<? super Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application();
        application.OLrzqt(this.OLrzqt);
        function1.invoke(application);
        return application.OLrzqt();
    }
}
