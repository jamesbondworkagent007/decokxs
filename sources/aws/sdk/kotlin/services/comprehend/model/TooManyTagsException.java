package aws.sdk.kotlin.services.comprehend.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TooManyTagsException extends ComprehendException {
    public static final ActionBar Companion = new ActionBar(null);
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.comprehend.model.TooManyTagsException$StateListAnimator) A[MD:(aws.sdk.kotlin.services.comprehend.model.TooManyTagsException$StateListAnimator):void (m)] call: aws.sdk.kotlin.services.comprehend.model.TooManyTagsException.<init>(aws.sdk.kotlin.services.comprehend.model.TooManyTagsException$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TooManyTagsException(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private TooManyTagsException(StateListAnimator stateListAnimator) {
        this.message = stateListAnimator.OLrzqt();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.comprehend.model.TooManyTagsException.ActionBar.<init>():void type: THIS */
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
        sb.append("TooManyTagsException(");
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
        return obj != null && TooManyTagsException.class == obj.getClass() && Intrinsics.EZpvd((Object) getMessage(), (Object) ((TooManyTagsException) obj).getMessage());
    }

    public static /* synthetic */ TooManyTagsException copy$default(TooManyTagsException tooManyTagsException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.TooManyTagsException.copy.1
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
        return stateListAnimator.EZpvd();
    }

    public final TooManyTagsException copy(@NotNull Function1<? super StateListAnimator, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(this);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.OLrzqt;
        }

        public final StateListAnimator copydefault() {
            return this;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull TooManyTagsException tooManyTagsException) {
            this();
            Intrinsics.checkNotNullParameter(tooManyTagsException, "");
            this.OLrzqt = tooManyTagsException.getMessage();
        }

        public final TooManyTagsException EZpvd() {
            return new TooManyTagsException(this, null);
        }
    }
}
