package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NetworkRecommendationProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkRecommendationProvider {
    public static final Application AEQbTJ = new Application(null);
    public final java.util.List<Proxy> EZpvd;
    public final java.util.List<NetworkQuotaInfo> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkRecommendationProvider$TaskDescription) A[MD:(o.NetworkRecommendationProvider$TaskDescription):void (m)] call: o.NetworkRecommendationProvider.<init>(o.NetworkRecommendationProvider$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkRecommendationProvider(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Proxy> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<NetworkQuotaInfo> KWHzl() {
        return this.OLrzqt;
    }

    public NetworkRecommendationProvider(TaskDescription taskDescription) {
        java.util.List<Proxy> listCopydefault = taskDescription.copydefault();
        if (listCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for errorList".toString());
        }
        this.EZpvd = listCopydefault;
        java.util.List<NetworkQuotaInfo> listKWHzl = taskDescription.KWHzl();
        if (listKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for resultList".toString());
        }
        this.OLrzqt = listKWHzl;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkRecommendationProvider.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "BatchDetectEntitiesResponse(*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkRecommendationProvider.class != obj.getClass()) {
            return false;
        }
        NetworkRecommendationProvider networkRecommendationProvider = (NetworkRecommendationProvider) obj;
        return Intrinsics.EZpvd(this.EZpvd, networkRecommendationProvider.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, networkRecommendationProvider.OLrzqt);
    }

    public static /* synthetic */ NetworkRecommendationProvider copy$default(NetworkRecommendationProvider networkRecommendationProvider, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.BatchDetectEntitiesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkRecommendationProvider.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkRecommendationProvider.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(networkRecommendationProvider);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    public static final class TaskDescription {
        public java.util.List<Proxy> AEQbTJ;
        public java.util.List<NetworkQuotaInfo> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<NetworkQuotaInfo> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<Proxy> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<NetworkQuotaInfo> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Proxy> copydefault() {
            return this.AEQbTJ;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull NetworkRecommendationProvider networkRecommendationProvider) {
            this();
            Intrinsics.checkNotNullParameter(networkRecommendationProvider, "");
            this.AEQbTJ = networkRecommendationProvider.AEQbTJ();
            this.OLrzqt = networkRecommendationProvider.KWHzl();
        }

        public final NetworkRecommendationProvider AEQbTJ() {
            return new NetworkRecommendationProvider(this, null);
        }

        public final TaskDescription EZpvd() {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = yDY.AhwBna();
            }
            if (this.OLrzqt == null) {
                this.OLrzqt = yDY.AhwBna();
            }
            return this;
        }
    }
}
