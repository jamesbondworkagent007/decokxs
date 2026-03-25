package aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class MalformedPolicyDocumentException extends StsException {
    public static final ActionBar Companion = new ActionBar(null);
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.MalformedPolicyDocumentException$TaskDescription) A[MD:(aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.MalformedPolicyDocumentException$TaskDescription):void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.MalformedPolicyDocumentException.<init>(aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.MalformedPolicyDocumentException$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MalformedPolicyDocumentException(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private MalformedPolicyDocumentException(TaskDescription taskDescription) {
        this.message = taskDescription.OLrzqt();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.MalformedPolicyDocumentException.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MalformedPolicyDocumentException(");
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
        return obj != null && MalformedPolicyDocumentException.class == obj.getClass() && Intrinsics.EZpvd((Object) getMessage(), (Object) ((MalformedPolicyDocumentException) obj).getMessage());
    }

    public static /* synthetic */ MalformedPolicyDocumentException copy$default(MalformedPolicyDocumentException malformedPolicyDocumentException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.MalformedPolicyDocumentException.copy.1
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
        TaskDescription taskDescription = new TaskDescription(malformedPolicyDocumentException);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    public final MalformedPolicyDocumentException copy(@NotNull Function1<? super TaskDescription, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(this);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    public static final class TaskDescription {
        public String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(String str) {
            this.AEQbTJ = str;
        }

        public final TaskDescription copydefault() {
            return this;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull MalformedPolicyDocumentException malformedPolicyDocumentException) {
            this();
            Intrinsics.checkNotNullParameter(malformedPolicyDocumentException, "");
            this.AEQbTJ = malformedPolicyDocumentException.getMessage();
        }

        public final MalformedPolicyDocumentException AEQbTJ() {
            return new MalformedPolicyDocumentException(this, null);
        }
    }
}
