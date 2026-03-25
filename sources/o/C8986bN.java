package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8986bN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C8986bN {
    public static final Application KWHzl = new Application(null);
    public final C31679m OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bN$TaskDescription) A[MD:(o.bN$TaskDescription):void (m)] call: o.bN.<init>(o.bN$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C8986bN(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31679m AEQbTJ() {
        return this.OLrzqt;
    }

    public C8986bN(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription.OLrzqt();
    }

    /* JADX INFO: renamed from: o.bN$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StreamProcessorInput(");
        sb.append("kinesisVideoStream=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C31679m c31679m = this.OLrzqt;
        if (c31679m != null) {
            return c31679m.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8986bN.class == obj.getClass() && Intrinsics.EZpvd(this.OLrzqt, ((C8986bN) obj).OLrzqt);
    }

    public static /* synthetic */ C8986bN copy$default(C8986bN c8986bN, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StreamProcessorInput$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C8986bN.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C8986bN.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c8986bN);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    /* JADX INFO: renamed from: o.bN$TaskDescription */
    public static final class TaskDescription {
        public C31679m KWHzl;

        public final TaskDescription KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C31679m OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C31679m c31679m) {
            this.KWHzl = c31679m;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C8986bN c8986bN) {
            this();
            Intrinsics.checkNotNullParameter(c8986bN, "");
            this.KWHzl = c8986bN.AEQbTJ();
        }

        public final C8986bN EZpvd() {
            return new C8986bN(this, null);
        }
    }
}
