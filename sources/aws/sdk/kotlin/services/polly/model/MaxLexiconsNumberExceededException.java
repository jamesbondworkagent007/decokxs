package aws.sdk.kotlin.services.polly.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MaxLexiconsNumberExceededException extends PollyException {
    public static final TaskDescription Companion = new TaskDescription(null);
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.polly.model.MaxLexiconsNumberExceededException$ActionBar) A[MD:(aws.sdk.kotlin.services.polly.model.MaxLexiconsNumberExceededException$ActionBar):void (m)] call: aws.sdk.kotlin.services.polly.model.MaxLexiconsNumberExceededException.<init>(aws.sdk.kotlin.services.polly.model.MaxLexiconsNumberExceededException$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MaxLexiconsNumberExceededException(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private MaxLexiconsNumberExceededException(ActionBar actionBar) {
        this.message = actionBar.OLrzqt();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.polly.model.MaxLexiconsNumberExceededException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaxLexiconsNumberExceededException(");
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
        return obj != null && MaxLexiconsNumberExceededException.class == obj.getClass() && Intrinsics.EZpvd((Object) getMessage(), (Object) ((MaxLexiconsNumberExceededException) obj).getMessage());
    }

    public static /* synthetic */ MaxLexiconsNumberExceededException copy$default(MaxLexiconsNumberExceededException maxLexiconsNumberExceededException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.MaxLexiconsNumberExceededException.copy.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(maxLexiconsNumberExceededException);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public final MaxLexiconsNumberExceededException copy(@NotNull Function1<? super ActionBar, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(this);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public static final class ActionBar {
        public String AEQbTJ;

        public final ActionBar KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(String str) {
            this.AEQbTJ = str;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull MaxLexiconsNumberExceededException maxLexiconsNumberExceededException) {
            this();
            Intrinsics.checkNotNullParameter(maxLexiconsNumberExceededException, "");
            this.AEQbTJ = maxLexiconsNumberExceededException.getMessage();
        }

        public final MaxLexiconsNumberExceededException copydefault() {
            return new MaxLexiconsNumberExceededException(this, null);
        }
    }
}
