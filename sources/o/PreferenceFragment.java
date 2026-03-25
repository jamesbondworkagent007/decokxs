package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PreferenceFragment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PreferenceFragment {
    public static final ActionBar copydefault = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final StatsDimensionsValue EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PreferenceFragment$TaskDescription) A[MD:(o.PreferenceFragment$TaskDescription):void (m)] call: o.PreferenceFragment.<init>(o.PreferenceFragment$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PreferenceFragment(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public PreferenceFragment(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.copydefault();
        this.KWHzl = taskDescription.AEQbTJ();
        this.EZpvd = taskDescription.OLrzqt();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PreferenceFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartSentimentDetectionJobResponse(");
        sb.append("jobArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("jobStatus=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PreferenceFragment.class != obj.getClass()) {
            return false;
        }
        PreferenceFragment preferenceFragment = (PreferenceFragment) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) preferenceFragment.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) preferenceFragment.KWHzl) && Intrinsics.EZpvd(this.EZpvd, preferenceFragment.EZpvd);
    }

    public static /* synthetic */ PreferenceFragment copy$default(PreferenceFragment preferenceFragment, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StartSentimentDetectionJobResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PreferenceFragment.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PreferenceFragment.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(preferenceFragment);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    public static final class TaskDescription {
        public StatsDimensionsValue EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        public final TaskDescription KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(StatsDimensionsValue statsDimensionsValue) {
            this.EZpvd = statsDimensionsValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.copydefault = str;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull PreferenceFragment preferenceFragment) {
            this();
            Intrinsics.checkNotNullParameter(preferenceFragment, "");
            this.copydefault = preferenceFragment.OLrzqt();
            this.KWHzl = preferenceFragment.copydefault();
            this.EZpvd = preferenceFragment.AEQbTJ();
        }

        public final PreferenceFragment EZpvd() {
            return new PreferenceFragment(this, null);
        }
    }
}
