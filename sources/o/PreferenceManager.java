package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PreferenceManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PreferenceManager {
    public static final Application EZpvd = new Application(null);
    public final java.lang.String KWHzl;
    public final StatsDimensionsValue OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PreferenceManager$TaskDescription) A[MD:(o.PreferenceManager$TaskDescription):void (m)] call: o.PreferenceManager.<init>(o.PreferenceManager$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PreferenceManager(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue copydefault() {
        return this.OLrzqt;
    }

    public PreferenceManager(TaskDescription taskDescription) {
        this.copydefault = taskDescription.OLrzqt();
        this.KWHzl = taskDescription.EZpvd();
        this.OLrzqt = taskDescription.copydefault();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PreferenceManager.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartTopicsDetectionJobResponse(");
        sb.append("jobArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("jobStatus=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PreferenceManager.class != obj.getClass()) {
            return false;
        }
        PreferenceManager preferenceManager = (PreferenceManager) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) preferenceManager.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) preferenceManager.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, preferenceManager.OLrzqt);
    }

    public static /* synthetic */ PreferenceManager copy$default(PreferenceManager preferenceManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StartTopicsDetectionJobResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PreferenceManager.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PreferenceManager.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(preferenceManager);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    public static final class TaskDescription {
        public java.lang.String EZpvd;
        public StatsDimensionsValue KWHzl;
        public java.lang.String copydefault;

        public final TaskDescription AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(StatsDimensionsValue statsDimensionsValue) {
            this.KWHzl = statsDimensionsValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue copydefault() {
            return this.KWHzl;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull PreferenceManager preferenceManager) {
            this();
            Intrinsics.checkNotNullParameter(preferenceManager, "");
            this.EZpvd = preferenceManager.OLrzqt();
            this.copydefault = preferenceManager.KWHzl();
            this.KWHzl = preferenceManager.copydefault();
        }

        public final PreferenceManager KWHzl() {
            return new PreferenceManager(this, null);
        }
    }
}
