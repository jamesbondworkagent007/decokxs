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
public final class InvalidImageFormatException extends RekognitionException {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private final String code;
    private final String logref;
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.rekognition.model.InvalidImageFormatException$ActionBar) A[MD:(aws.sdk.kotlin.services.rekognition.model.InvalidImageFormatException$ActionBar):void (m)] call: aws.sdk.kotlin.services.rekognition.model.InvalidImageFormatException.<init>(aws.sdk.kotlin.services.rekognition.model.InvalidImageFormatException$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ InvalidImageFormatException(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
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

    private InvalidImageFormatException(ActionBar actionBar) {
        this.code = actionBar.EZpvd();
        this.logref = actionBar.OLrzqt();
        this.message = actionBar.AEQbTJ();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.rekognition.model.InvalidImageFormatException.StateListAnimator.<init>():void type: THIS */
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
        sb.append("InvalidImageFormatException(");
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
        if (obj == null || InvalidImageFormatException.class != obj.getClass()) {
            return false;
        }
        InvalidImageFormatException invalidImageFormatException = (InvalidImageFormatException) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) invalidImageFormatException.code) && Intrinsics.EZpvd((Object) this.logref, (Object) invalidImageFormatException.logref) && Intrinsics.EZpvd((Object) getMessage(), (Object) invalidImageFormatException.getMessage());
    }

    public static /* synthetic */ InvalidImageFormatException copy$default(InvalidImageFormatException invalidImageFormatException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.InvalidImageFormatException.copy.1
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
        ActionBar actionBar = new ActionBar(invalidImageFormatException);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public final InvalidImageFormatException copy(@NotNull Function1<? super ActionBar, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(this);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public String AEQbTJ;
        public String KWHzl;
        public String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(String str) {
            this.AEQbTJ = str;
        }

        public final ActionBar copydefault() {
            return this;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull InvalidImageFormatException invalidImageFormatException) {
            this();
            Intrinsics.checkNotNullParameter(invalidImageFormatException, "");
            this.KWHzl = invalidImageFormatException.getCode();
            this.AEQbTJ = invalidImageFormatException.getLogref();
            this.OLrzqt = invalidImageFormatException.getMessage();
        }

        public final InvalidImageFormatException KWHzl() {
            return new InvalidImageFormatException(this, null);
        }
    }
}
