package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C9251bS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C9251bS {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final ActivityChooserView OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bS$Application) A[MD:(o.bS$Application):void (m)] call: o.bS.<init>(o.bS$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C9251bS(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityChooserView KWHzl() {
        return this.OLrzqt;
    }

    public C9251bS(Application application) {
        this.OLrzqt = application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.bS$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StreamProcessorSettingsForUpdate(");
        sb.append("connectedHomeForUpdate=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        ActivityChooserView activityChooserView = this.OLrzqt;
        if (activityChooserView != null) {
            return activityChooserView.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9251bS.class == obj.getClass() && Intrinsics.EZpvd(this.OLrzqt, ((C9251bS) obj).OLrzqt);
    }

    public static /* synthetic */ C9251bS copy$default(C9251bS c9251bS, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StreamProcessorSettingsForUpdate$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C9251bS.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C9251bS.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c9251bS);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.bS$Application */
    public static final class Application {
        public ActivityChooserView KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActivityChooserView OLrzqt() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C9251bS c9251bS) {
            this();
            Intrinsics.checkNotNullParameter(c9251bS, "");
            this.KWHzl = c9251bS.KWHzl();
        }

        public final C9251bS KWHzl() {
            return new C9251bS(this, null);
        }
    }
}
