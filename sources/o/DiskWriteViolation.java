package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DiskWriteViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DiskWriteViolation {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final C5173Hn EZpvd;
    public final C5173Hn KWHzl;
    public final java.lang.String OLrzqt;
    public final StatsDimensionsValue copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DiskWriteViolation$StateListAnimator) A[MD:(o.DiskWriteViolation$StateListAnimator):void (m)] call: o.DiskWriteViolation.<init>(o.DiskWriteViolation$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DiskWriteViolation(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.KWHzl;
    }

    public DiskWriteViolation(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator.copydefault();
        this.copydefault = stateListAnimator.OLrzqt();
        this.EZpvd = stateListAnimator.KWHzl();
        this.KWHzl = stateListAnimator.AEQbTJ();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DiskWriteViolation.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PiiEntitiesDetectionJobFilter(");
        sb.append("jobName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("submitTimeAfter=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("submitTimeBefore=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.copydefault;
        int iHashCode2 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c5173Hn2 != null ? c5173Hn2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DiskWriteViolation.class != obj.getClass()) {
            return false;
        }
        DiskWriteViolation diskWriteViolation = (DiskWriteViolation) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) diskWriteViolation.OLrzqt) && Intrinsics.EZpvd(this.copydefault, diskWriteViolation.copydefault) && Intrinsics.EZpvd(this.EZpvd, diskWriteViolation.EZpvd) && Intrinsics.EZpvd(this.KWHzl, diskWriteViolation.KWHzl);
    }

    public static /* synthetic */ DiskWriteViolation copy$default(DiskWriteViolation diskWriteViolation, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.PiiEntitiesDetectionJobFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DiskWriteViolation.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DiskWriteViolation.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(diskWriteViolation);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public StatsDimensionsValue AEQbTJ;
        public C5173Hn EZpvd;
        public java.lang.String OLrzqt;
        public C5173Hn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull DiskWriteViolation diskWriteViolation) {
            this();
            Intrinsics.checkNotNullParameter(diskWriteViolation, "");
            this.OLrzqt = diskWriteViolation.EZpvd();
            this.AEQbTJ = diskWriteViolation.AEQbTJ();
            this.EZpvd = diskWriteViolation.KWHzl();
            this.copydefault = diskWriteViolation.copydefault();
        }

        public final DiskWriteViolation EZpvd() {
            return new DiskWriteViolation(this, null);
        }
    }
}
