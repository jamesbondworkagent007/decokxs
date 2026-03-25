package aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class PackedPolicyTooLargeException extends StsException {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.PackedPolicyTooLargeException$TaskDescription) A[MD:(aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.PackedPolicyTooLargeException$TaskDescription):void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.PackedPolicyTooLargeException.<init>(aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.PackedPolicyTooLargeException$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PackedPolicyTooLargeException(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private PackedPolicyTooLargeException(TaskDescription taskDescription) {
        this.message = taskDescription.copydefault();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.PackedPolicyTooLargeException.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PackedPolicyTooLargeException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            return message.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && PackedPolicyTooLargeException.class == obj.getClass() && Intrinsics.EZpvd((Object) getMessage(), (Object) ((PackedPolicyTooLargeException) obj).getMessage());
    }

    public static /* synthetic */ PackedPolicyTooLargeException copy$default(PackedPolicyTooLargeException packedPolicyTooLargeException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.PackedPolicyTooLargeException.copy.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(packedPolicyTooLargeException);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    public final PackedPolicyTooLargeException copy(@NotNull Function1<? super TaskDescription, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(this);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    public static final class TaskDescription {
        public String KWHzl;

        public final TaskDescription KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.KWHzl;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull PackedPolicyTooLargeException packedPolicyTooLargeException) {
            this();
            Intrinsics.checkNotNullParameter(packedPolicyTooLargeException, "");
            this.KWHzl = packedPolicyTooLargeException.getMessage();
        }

        public final PackedPolicyTooLargeException OLrzqt() {
            return new PackedPolicyTooLargeException(this, null);
        }
    }
}
