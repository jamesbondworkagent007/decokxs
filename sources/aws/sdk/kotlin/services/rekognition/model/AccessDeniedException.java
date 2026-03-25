package aws.sdk.kotlin.services.rekognition.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AccessDeniedException extends RekognitionException {
    public static final Activity Companion = new Activity(null);
    private final String code;
    private final String logref;
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.rekognition.model.AccessDeniedException$StateListAnimator) A[MD:(aws.sdk.kotlin.services.rekognition.model.AccessDeniedException$StateListAnimator):void (m)] call: aws.sdk.kotlin.services.rekognition.model.AccessDeniedException.<init>(aws.sdk.kotlin.services.rekognition.model.AccessDeniedException$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AccessDeniedException(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogref() {
        return this.logref;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private AccessDeniedException(StateListAnimator stateListAnimator) {
        this.code = stateListAnimator.AEQbTJ();
        this.logref = stateListAnimator.KWHzl();
        this.message = stateListAnimator.OLrzqt();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.rekognition.model.AccessDeniedException.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccessDeniedException(");
        sb.append("code=" + this.code + AbstractJsonLexerKt.COMMA);
        sb.append("logref=" + this.logref + AbstractJsonLexerKt.COMMA);
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
        String str2 = this.logref;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String message = getMessage();
        return (((iHashCode * 31) + iHashCode2) * 31) + (message != null ? message.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccessDeniedException.class != obj.getClass()) {
            return false;
        }
        AccessDeniedException accessDeniedException = (AccessDeniedException) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) accessDeniedException.code) && Intrinsics.EZpvd((Object) this.logref, (Object) accessDeniedException.logref) && Intrinsics.EZpvd((Object) getMessage(), (Object) accessDeniedException.getMessage());
    }

    public static /* synthetic */ AccessDeniedException copy$default(AccessDeniedException accessDeniedException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.AccessDeniedException.copy.1
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
        StateListAnimator stateListAnimator = new StateListAnimator(accessDeniedException);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public final AccessDeniedException copy(@NotNull Function1<? super StateListAnimator, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(this);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public String AEQbTJ;
        public String EZpvd;
        public String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(String str) {
            this.EZpvd = str;
        }

        public final StateListAnimator copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(String str) {
            this.AEQbTJ = str;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AccessDeniedException accessDeniedException) {
            this();
            Intrinsics.checkNotNullParameter(accessDeniedException, "");
            this.EZpvd = accessDeniedException.getCode();
            this.AEQbTJ = accessDeniedException.getLogref();
            this.copydefault = accessDeniedException.getMessage();
        }

        public final AccessDeniedException EZpvd() {
            return new AccessDeniedException(this, null);
        }
    }
}
