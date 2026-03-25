package aws.sdk.kotlin.services.textract.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class InvalidParameterException extends TextractException {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private final String code;
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.textract.model.InvalidParameterException$TaskDescription) A[MD:(aws.sdk.kotlin.services.textract.model.InvalidParameterException$TaskDescription):void (m)] call: aws.sdk.kotlin.services.textract.model.InvalidParameterException.<init>(aws.sdk.kotlin.services.textract.model.InvalidParameterException$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ InvalidParameterException(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private InvalidParameterException(TaskDescription taskDescription) {
        this.code = taskDescription.OLrzqt();
        this.message = taskDescription.EZpvd();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.textract.model.InvalidParameterException.StateListAnimator.<init>():void type: THIS */
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
        sb.append("InvalidParameterException(");
        sb.append("code=" + this.code + AbstractJsonLexerKt.COMMA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = str != null ? str.hashCode() : 0;
        String message = getMessage();
        return (iHashCode * 31) + (message != null ? message.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InvalidParameterException.class != obj.getClass()) {
            return false;
        }
        InvalidParameterException invalidParameterException = (InvalidParameterException) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) invalidParameterException.code) && Intrinsics.EZpvd((Object) getMessage(), (Object) invalidParameterException.getMessage());
    }

    public static /* synthetic */ InvalidParameterException copy$default(InvalidParameterException invalidParameterException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.InvalidParameterException.copy.1
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
        TaskDescription taskDescription = new TaskDescription(invalidParameterException);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    public final InvalidParameterException copy(@NotNull Function1<? super TaskDescription, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(this);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    public static final class TaskDescription {
        public String AEQbTJ;
        public String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        public final TaskDescription KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(String str) {
            this.KWHzl = str;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull InvalidParameterException invalidParameterException) {
            this();
            Intrinsics.checkNotNullParameter(invalidParameterException, "");
            this.KWHzl = invalidParameterException.getCode();
            this.AEQbTJ = invalidParameterException.getMessage();
        }

        public final InvalidParameterException copydefault() {
            return new InvalidParameterException(this, null);
        }
    }
}
