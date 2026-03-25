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
public final class VideoTooLargeException extends RekognitionException {
    public static final TaskDescription Companion = new TaskDescription(null);
    private final String code;
    private final String logref;
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.rekognition.model.VideoTooLargeException$Activity) A[MD:(aws.sdk.kotlin.services.rekognition.model.VideoTooLargeException$Activity):void (m)] call: aws.sdk.kotlin.services.rekognition.model.VideoTooLargeException.<init>(aws.sdk.kotlin.services.rekognition.model.VideoTooLargeException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ VideoTooLargeException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
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

    private VideoTooLargeException(Activity activity) {
        this.code = activity.copydefault();
        this.logref = activity.OLrzqt();
        this.message = activity.AEQbTJ();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.rekognition.model.VideoTooLargeException.TaskDescription.<init>():void type: THIS */
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
        sb.append("VideoTooLargeException(");
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
        if (obj == null || VideoTooLargeException.class != obj.getClass()) {
            return false;
        }
        VideoTooLargeException videoTooLargeException = (VideoTooLargeException) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) videoTooLargeException.code) && Intrinsics.EZpvd((Object) this.logref, (Object) videoTooLargeException.logref) && Intrinsics.EZpvd((Object) getMessage(), (Object) videoTooLargeException.getMessage());
    }

    public static /* synthetic */ VideoTooLargeException copy$default(VideoTooLargeException videoTooLargeException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.VideoTooLargeException.copy.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(videoTooLargeException);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public final VideoTooLargeException copy(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(this);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public String KWHzl;
        public String OLrzqt;
        public String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.OLrzqt = str;
        }

        public final Activity EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull VideoTooLargeException videoTooLargeException) {
            this();
            Intrinsics.checkNotNullParameter(videoTooLargeException, "");
            this.copydefault = videoTooLargeException.getCode();
            this.OLrzqt = videoTooLargeException.getLogref();
            this.KWHzl = videoTooLargeException.getMessage();
        }

        public final VideoTooLargeException KWHzl() {
            return new VideoTooLargeException(this, null);
        }
    }
}
