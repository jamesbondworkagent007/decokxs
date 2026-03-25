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
public final class HumanLoopQuotaExceededException extends TextractException {
    public static final TaskDescription Companion = new TaskDescription(null);
    private final String code;
    private final String message;
    private final String quotaCode;
    private final String resourceType;
    private final String serviceCode;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.textract.model.HumanLoopQuotaExceededException$Activity) A[MD:(aws.sdk.kotlin.services.textract.model.HumanLoopQuotaExceededException$Activity):void (m)] call: aws.sdk.kotlin.services.textract.model.HumanLoopQuotaExceededException.<init>(aws.sdk.kotlin.services.textract.model.HumanLoopQuotaExceededException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HumanLoopQuotaExceededException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuotaCode() {
        return this.quotaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResourceType() {
        return this.resourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceCode() {
        return this.serviceCode;
    }

    private HumanLoopQuotaExceededException(Activity activity) {
        this.code = activity.EZpvd();
        this.message = activity.KWHzl();
        this.quotaCode = activity.copydefault();
        this.resourceType = activity.AYXKKw();
        this.serviceCode = activity.djBIcL();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.textract.model.HumanLoopQuotaExceededException.TaskDescription.<init>():void type: THIS */
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
        sb.append("HumanLoopQuotaExceededException(");
        sb.append("code=" + this.code + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + getMessage() + AbstractJsonLexerKt.COMMA);
        sb.append("quotaCode=" + this.quotaCode + AbstractJsonLexerKt.COMMA);
        sb.append("resourceType=" + this.resourceType + AbstractJsonLexerKt.COMMA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("serviceCode=");
        sb2.append(this.serviceCode);
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
        int iHashCode2 = message != null ? message.hashCode() : 0;
        String str2 = this.quotaCode;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.resourceType;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.serviceCode;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HumanLoopQuotaExceededException.class != obj.getClass()) {
            return false;
        }
        HumanLoopQuotaExceededException humanLoopQuotaExceededException = (HumanLoopQuotaExceededException) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) humanLoopQuotaExceededException.code) && Intrinsics.EZpvd((Object) getMessage(), (Object) humanLoopQuotaExceededException.getMessage()) && Intrinsics.EZpvd((Object) this.quotaCode, (Object) humanLoopQuotaExceededException.quotaCode) && Intrinsics.EZpvd((Object) this.resourceType, (Object) humanLoopQuotaExceededException.resourceType) && Intrinsics.EZpvd((Object) this.serviceCode, (Object) humanLoopQuotaExceededException.serviceCode);
    }

    public static /* synthetic */ HumanLoopQuotaExceededException copy$default(HumanLoopQuotaExceededException humanLoopQuotaExceededException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.HumanLoopQuotaExceededException.copy.1
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
        Activity activity = new Activity(humanLoopQuotaExceededException);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public final HumanLoopQuotaExceededException copy(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(this);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public String AEQbTJ;
        public String EZpvd;
        public String KWHzl;
        public String OLrzqt;
        public String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(String str) {
            this.copydefault = str;
        }

        public final Activity OLrzqt() {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull HumanLoopQuotaExceededException humanLoopQuotaExceededException) {
            this();
            Intrinsics.checkNotNullParameter(humanLoopQuotaExceededException, "");
            this.EZpvd = humanLoopQuotaExceededException.getCode();
            this.AEQbTJ = humanLoopQuotaExceededException.getMessage();
            this.KWHzl = humanLoopQuotaExceededException.getQuotaCode();
            this.OLrzqt = humanLoopQuotaExceededException.getResourceType();
            this.copydefault = humanLoopQuotaExceededException.getServiceCode();
        }

        public final HumanLoopQuotaExceededException AEQbTJ() {
            return new HumanLoopQuotaExceededException(this, null);
        }
    }
}
