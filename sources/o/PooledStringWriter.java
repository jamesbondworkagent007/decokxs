package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PooledStringWriter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PooledStringWriter {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.lang.Double EZpvd;
    public final java.lang.Double KWHzl;
    public final java.lang.Double copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PooledStringWriter$TaskDescription) A[MD:(o.PooledStringWriter$TaskDescription):void (m)] call: o.PooledStringWriter.<init>(o.PooledStringWriter$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PooledStringWriter(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double copydefault() {
        return this.EZpvd;
    }

    public PooledStringWriter(TaskDescription taskDescription) {
        this.copydefault = taskDescription.KWHzl();
        this.EZpvd = taskDescription.OLrzqt();
        this.KWHzl = taskDescription.EZpvd();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PooledStringWriter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EntityTypesEvaluationMetrics(");
        sb.append("f1Score=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("precision=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("recall=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Double d = this.copydefault;
        int iHashCode = d != null ? d.hashCode() : 0;
        java.lang.Double d2 = this.EZpvd;
        int iHashCode2 = d2 != null ? d2.hashCode() : 0;
        java.lang.Double d3 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (d3 != null ? d3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PooledStringWriter.class != obj.getClass()) {
            return false;
        }
        PooledStringWriter pooledStringWriter = (PooledStringWriter) obj;
        return Intrinsics.OLrzqt(this.copydefault, pooledStringWriter.copydefault) && Intrinsics.OLrzqt(this.EZpvd, pooledStringWriter.EZpvd) && Intrinsics.OLrzqt(this.KWHzl, pooledStringWriter.KWHzl);
    }

    public static /* synthetic */ PooledStringWriter copy$default(PooledStringWriter pooledStringWriter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EntityTypesEvaluationMetrics$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PooledStringWriter.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PooledStringWriter.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(pooledStringWriter);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    public static final class TaskDescription {
        public java.lang.Double AEQbTJ;
        public java.lang.Double KWHzl;
        public java.lang.Double OLrzqt;

        public final TaskDescription AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Double d) {
            this.KWHzl = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Double d) {
            this.AEQbTJ = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Double d) {
            this.OLrzqt = d;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull PooledStringWriter pooledStringWriter) {
            this();
            Intrinsics.checkNotNullParameter(pooledStringWriter, "");
            this.AEQbTJ = pooledStringWriter.EZpvd();
            this.OLrzqt = pooledStringWriter.copydefault();
            this.KWHzl = pooledStringWriter.OLrzqt();
        }

        public final PooledStringWriter copydefault() {
            return new PooledStringWriter(this, null);
        }
    }
}
