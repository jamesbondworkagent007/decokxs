package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SimpleCursorTreeAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SimpleCursorTreeAdapter {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.lang.Float AEQbTJ;
    public final java.lang.Float EZpvd;
    public final java.lang.Float KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SimpleCursorTreeAdapter$TaskDescription) A[MD:(o.SimpleCursorTreeAdapter$TaskDescription):void (m)] call: o.SimpleCursorTreeAdapter.<init>(o.SimpleCursorTreeAdapter$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SimpleCursorTreeAdapter(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.AEQbTJ;
    }

    public SimpleCursorTreeAdapter(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.copydefault();
        this.AEQbTJ = taskDescription.KWHzl();
        this.EZpvd = taskDescription.EZpvd();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SimpleCursorTreeAdapter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EyeDirection(");
        sb.append("confidence=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("pitch=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("yaw=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.KWHzl;
        int iHashCode = f != null ? f.hashCode() : 0;
        java.lang.Float f2 = this.AEQbTJ;
        int iHashCode2 = f2 != null ? f2.hashCode() : 0;
        java.lang.Float f3 = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (f3 != null ? f3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SimpleCursorTreeAdapter.class != obj.getClass()) {
            return false;
        }
        SimpleCursorTreeAdapter simpleCursorTreeAdapter = (SimpleCursorTreeAdapter) obj;
        return Intrinsics.copydefault(this.KWHzl, simpleCursorTreeAdapter.KWHzl) && Intrinsics.copydefault(this.AEQbTJ, simpleCursorTreeAdapter.AEQbTJ) && Intrinsics.copydefault(this.EZpvd, simpleCursorTreeAdapter.EZpvd);
    }

    public static /* synthetic */ SimpleCursorTreeAdapter copy$default(SimpleCursorTreeAdapter simpleCursorTreeAdapter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.EyeDirection$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SimpleCursorTreeAdapter.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SimpleCursorTreeAdapter.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(simpleCursorTreeAdapter);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    public static final class TaskDescription {
        public java.lang.Float EZpvd;
        public java.lang.Float KWHzl;
        public java.lang.Float copydefault;

        public final TaskDescription AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Float f) {
            this.EZpvd = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Float f) {
            this.KWHzl = f;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull SimpleCursorTreeAdapter simpleCursorTreeAdapter) {
            this();
            Intrinsics.checkNotNullParameter(simpleCursorTreeAdapter, "");
            this.copydefault = simpleCursorTreeAdapter.KWHzl();
            this.EZpvd = simpleCursorTreeAdapter.copydefault();
            this.KWHzl = simpleCursorTreeAdapter.OLrzqt();
        }

        public final SimpleCursorTreeAdapter OLrzqt() {
            return new SimpleCursorTreeAdapter(this, null);
        }
    }
}
