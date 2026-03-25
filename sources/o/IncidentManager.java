package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IncidentManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class IncidentManager {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final C5173Hn EZpvd;
    public final java.lang.String KWHzl;
    public final StatsDimensionsValue OLrzqt;
    public final C5173Hn copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IncidentManager$StateListAnimator) A[MD:(o.IncidentManager$StateListAnimator):void (m)] call: o.IncidentManager.<init>(o.IncidentManager$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IncidentManager(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    public IncidentManager(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.copydefault();
        this.OLrzqt = stateListAnimator.AEQbTJ();
        this.EZpvd = stateListAnimator.KWHzl();
        this.copydefault = stateListAnimator.OLrzqt();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IncidentManager.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EntitiesDetectionJobFilter(");
        sb.append("jobName=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("submitTimeAfter=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("submitTimeBefore=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.OLrzqt;
        int iHashCode2 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c5173Hn2 != null ? c5173Hn2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IncidentManager.class != obj.getClass()) {
            return false;
        }
        IncidentManager incidentManager = (IncidentManager) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) incidentManager.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, incidentManager.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, incidentManager.EZpvd) && Intrinsics.EZpvd(this.copydefault, incidentManager.copydefault);
    }

    public static /* synthetic */ IncidentManager copy$default(IncidentManager incidentManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EntitiesDetectionJobFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IncidentManager.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IncidentManager.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(incidentManager);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public C5173Hn AEQbTJ;
        public StatsDimensionsValue EZpvd;
        public C5173Hn OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull IncidentManager incidentManager) {
            this();
            Intrinsics.checkNotNullParameter(incidentManager, "");
            this.copydefault = incidentManager.OLrzqt();
            this.EZpvd = incidentManager.KWHzl();
            this.OLrzqt = incidentManager.EZpvd();
            this.AEQbTJ = incidentManager.AEQbTJ();
        }

        public final IncidentManager EZpvd() {
            return new IncidentManager(this, null);
        }
    }
}
