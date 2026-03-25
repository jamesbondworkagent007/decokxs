package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RecommendationService;
import o.SynchronousResultReceiver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RecommendationService {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final NetworkOnMainThreadException AEQbTJ;
    public final CpuUsageInfo EZpvd;
    public final SynchronousResultReceiver OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RecommendationService$Application) A[MD:(o.RecommendationService$Application):void (m)] call: o.RecommendationService.<init>(o.RecommendationService$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RecommendationService(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkOnMainThreadException KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CpuUsageInfo OLrzqt() {
        return this.EZpvd;
    }

    public RecommendationService(Application application) {
        this.EZpvd = application.KWHzl();
        this.AEQbTJ = application.OLrzqt();
        SynchronousResultReceiver synchronousResultReceiverAEQbTJ = application.AEQbTJ();
        if (synchronousResultReceiverAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for languageCode".toString());
        }
        this.OLrzqt = synchronousResultReceiverAEQbTJ;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RecommendationService.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TaskConfig(");
        sb.append("documentClassificationConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("entityRecognitionConfig=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("languageCode=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        CpuUsageInfo cpuUsageInfo = this.EZpvd;
        int iHashCode = cpuUsageInfo != null ? cpuUsageInfo.hashCode() : 0;
        NetworkOnMainThreadException networkOnMainThreadException = this.AEQbTJ;
        return (((iHashCode * 31) + (networkOnMainThreadException != null ? networkOnMainThreadException.hashCode() : 0)) * 31) + this.OLrzqt.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RecommendationService.class != obj.getClass()) {
            return false;
        }
        RecommendationService recommendationService = (RecommendationService) obj;
        return Intrinsics.EZpvd(this.EZpvd, recommendationService.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, recommendationService.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, recommendationService.OLrzqt);
    }

    public static /* synthetic */ RecommendationService copy$default(RecommendationService recommendationService, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.TaskConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RecommendationService.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RecommendationService.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(recommendationService);
        function1.invoke(application);
        return application.copydefault();
    }

    public static final class Application {
        public NetworkOnMainThreadException EZpvd;
        public SynchronousResultReceiver KWHzl;
        public CpuUsageInfo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(CpuUsageInfo cpuUsageInfo) {
            this.OLrzqt = cpuUsageInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CpuUsageInfo KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkOnMainThreadException OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(NetworkOnMainThreadException networkOnMainThreadException) {
            this.EZpvd = networkOnMainThreadException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(SynchronousResultReceiver synchronousResultReceiver) {
            this.KWHzl = synchronousResultReceiver;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull RecommendationService recommendationService) {
            this();
            Intrinsics.checkNotNullParameter(recommendationService, "");
            this.OLrzqt = recommendationService.OLrzqt();
            this.EZpvd = recommendationService.KWHzl();
            this.KWHzl = recommendationService.AEQbTJ();
        }

        public final RecommendationService copydefault() {
            return new RecommendationService(this, null);
        }

        public final Application EZpvd() {
            if (this.KWHzl == null) {
                this.KWHzl = new SynchronousResultReceiver.PictureInPictureParams("no value provided");
            }
            return this;
        }
    }
}
