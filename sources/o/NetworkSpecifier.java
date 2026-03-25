package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NetworkSpecifier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkSpecifier {
    public static final Application copydefault = new Application(null);
    public final java.util.List<Proxy> EZpvd;
    public final java.util.List<NetworkMisc> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkSpecifier$TaskDescription) A[MD:(o.NetworkSpecifier$TaskDescription):void (m)] call: o.NetworkSpecifier.<init>(o.NetworkSpecifier$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkSpecifier(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<NetworkMisc> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Proxy> copydefault() {
        return this.EZpvd;
    }

    public NetworkSpecifier(TaskDescription taskDescription) {
        java.util.List<Proxy> listCopydefault = taskDescription.copydefault();
        if (listCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for errorList".toString());
        }
        this.EZpvd = listCopydefault;
        java.util.List<NetworkMisc> listOLrzqt = taskDescription.OLrzqt();
        if (listOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for resultList".toString());
        }
        this.OLrzqt = listOLrzqt;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkSpecifier.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "BatchDetectKeyPhrasesResponse(*** Sensitive Data Redacted ***)";
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
        if (obj == null || NetworkSpecifier.class != obj.getClass()) {
            return false;
        }
        NetworkSpecifier networkSpecifier = (NetworkSpecifier) obj;
        return Intrinsics.EZpvd(this.EZpvd, networkSpecifier.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, networkSpecifier.OLrzqt);
    }

    public static /* synthetic */ NetworkSpecifier copy$default(NetworkSpecifier networkSpecifier, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.BatchDetectKeyPhrasesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkSpecifier.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkSpecifier.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(networkSpecifier);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    public static final class TaskDescription {
        public java.util.List<NetworkMisc> KWHzl;
        public java.util.List<Proxy> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<Proxy> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<NetworkMisc> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<NetworkMisc> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Proxy> copydefault() {
            return this.copydefault;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull NetworkSpecifier networkSpecifier) {
            this();
            Intrinsics.checkNotNullParameter(networkSpecifier, "");
            this.copydefault = networkSpecifier.copydefault();
            this.KWHzl = networkSpecifier.AEQbTJ();
        }

        public final NetworkSpecifier AEQbTJ() {
            return new NetworkSpecifier(this, null);
        }

        public final TaskDescription KWHzl() {
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
