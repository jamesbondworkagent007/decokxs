package aws.sdk.kotlin.services.translate.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TooManyTagsException extends TranslateException {
    public static final TaskDescription Companion = new TaskDescription(null);
    private final String message;
    private final String resourceArn;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.translate.model.TooManyTagsException$StateListAnimator) A[MD:(aws.sdk.kotlin.services.translate.model.TooManyTagsException$StateListAnimator):void (m)] call: aws.sdk.kotlin.services.translate.model.TooManyTagsException.<init>(aws.sdk.kotlin.services.translate.model.TooManyTagsException$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TooManyTagsException(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResourceArn() {
        return this.resourceArn;
    }

    private TooManyTagsException(StateListAnimator stateListAnimator) {
        this.message = stateListAnimator.OLrzqt();
        this.resourceArn = stateListAnimator.KWHzl();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.translate.model.TooManyTagsException.TaskDescription.<init>():void type: THIS */
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
        sb.append("TooManyTagsException(");
        sb.append("message=" + getMessage() + AbstractJsonLexerKt.COMMA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("resourceArn=");
        sb2.append(this.resourceArn);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        String message = getMessage();
        int iHashCode = message != null ? message.hashCode() : 0;
        String str = this.resourceArn;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TooManyTagsException.class != obj.getClass()) {
            return false;
        }
        TooManyTagsException tooManyTagsException = (TooManyTagsException) obj;
        return Intrinsics.EZpvd((Object) getMessage(), (Object) tooManyTagsException.getMessage()) && Intrinsics.EZpvd((Object) this.resourceArn, (Object) tooManyTagsException.resourceArn);
    }

    public static /* synthetic */ TooManyTagsException copy$default(TooManyTagsException tooManyTagsException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.TooManyTagsException.copy.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(tooManyTagsException);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    public final TooManyTagsException copy(@NotNull Function1<? super StateListAnimator, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(this);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    public static final class StateListAnimator {
        public String AEQbTJ;
        public String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.AEQbTJ = str;
        }

        public final StateListAnimator EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull TooManyTagsException tooManyTagsException) {
            this();
            Intrinsics.checkNotNullParameter(tooManyTagsException, "");
            this.AEQbTJ = tooManyTagsException.getMessage();
            this.copydefault = tooManyTagsException.getResourceArn();
        }

        public final TooManyTagsException copydefault() {
            return new TooManyTagsException(this, null);
        }
    }
}
