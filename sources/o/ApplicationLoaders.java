package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ApplicationLoaders;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ApplicationLoaders {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ApplicationLoaders$Application) A[MD:(o.ApplicationLoaders$Application):void (m)] call: o.ApplicationLoaders.<init>(o.ApplicationLoaders$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ApplicationLoaders(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    public ApplicationLoaders(Application application) {
        this.KWHzl = application.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ApplicationLoaders.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final ApplicationLoaders OLrzqt(@NotNull Function1<? super Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Application application = new Application();
            function1.invoke(application);
            return application.copydefault();
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "GetUserRequest(accessToken=*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ApplicationLoaders.class == obj.getClass() && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((ApplicationLoaders) obj).KWHzl);
    }

    public static /* synthetic */ ApplicationLoaders copy$default(ApplicationLoaders applicationLoaders, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.GetUserRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ApplicationLoaders.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ApplicationLoaders.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(applicationLoaders);
        function1.invoke(application);
        return application.copydefault();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Application {
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.OLrzqt = str;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ApplicationLoaders applicationLoaders) {
            this();
            Intrinsics.checkNotNullParameter(applicationLoaders, "");
            this.OLrzqt = applicationLoaders.AEQbTJ();
        }

        public final ApplicationLoaders copydefault() {
            return new ApplicationLoaders(this, null);
        }
    }
}
