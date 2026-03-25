package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NetworkUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkUtils {
    public static final Activity OLrzqt = new Activity(null);
    public final java.util.List<NetworkStatsHistory> AEQbTJ;
    public final java.util.List<Proxy> KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkUtils$TaskDescription) A[MD:(o.NetworkUtils$TaskDescription):void (m)] call: o.NetworkUtils.<init>(o.NetworkUtils$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkUtils(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Proxy> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<NetworkStatsHistory> KWHzl() {
        return this.AEQbTJ;
    }

    public NetworkUtils(TaskDescription taskDescription) {
        java.util.List<Proxy> listAEQbTJ = taskDescription.AEQbTJ();
        if (listAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for errorList".toString());
        }
        this.KWHzl = listAEQbTJ;
        java.util.List<NetworkStatsHistory> listOLrzqt = taskDescription.OLrzqt();
        if (listOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for resultList".toString());
        }
        this.AEQbTJ = listOLrzqt;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkUtils.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "BatchDetectSyntaxResponse(*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkUtils.class != obj.getClass()) {
            return false;
        }
        NetworkUtils networkUtils = (NetworkUtils) obj;
        return Intrinsics.EZpvd(this.KWHzl, networkUtils.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, networkUtils.AEQbTJ);
    }

    public static /* synthetic */ NetworkUtils copy$default(NetworkUtils networkUtils, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.BatchDetectSyntaxResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkUtils.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkUtils.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(networkUtils);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    public static final class TaskDescription {
        public java.util.List<NetworkStatsHistory> KWHzl;
        public java.util.List<Proxy> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Proxy> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<NetworkStatsHistory> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<Proxy> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<NetworkStatsHistory> OLrzqt() {
            return this.KWHzl;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull NetworkUtils networkUtils) {
            this();
            Intrinsics.checkNotNullParameter(networkUtils, "");
            this.copydefault = networkUtils.AEQbTJ();
            this.KWHzl = networkUtils.KWHzl();
        }

        public final NetworkUtils KWHzl() {
            return new NetworkUtils(this, null);
        }

        public final TaskDescription copydefault() {
            if (this.copydefault == null) {
                this.copydefault = yDY.AhwBna();
            }
            if (this.KWHzl == null) {
                this.KWHzl = yDY.AhwBna();
            }
            return this;
        }
    }
}
