package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ViewFlipper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ViewFlipper {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final A KWHzl;
    public final AbstractC58373z copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ViewFlipper$TaskDescription) A[MD:(o.ViewFlipper$TaskDescription):void (m)] call: o.ViewFlipper.<init>(o.ViewFlipper$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ViewFlipper(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC58373z KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final A copydefault() {
        return this.KWHzl;
    }

    public ViewFlipper(TaskDescription taskDescription) {
        this.copydefault = taskDescription.EZpvd();
        this.KWHzl = taskDescription.copydefault();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ViewFlipper.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetLabelDetectionRequestMetadata(");
        sb.append("aggregateBy=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sortBy=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC58373z abstractC58373z = this.copydefault;
        int iHashCode = abstractC58373z != null ? abstractC58373z.hashCode() : 0;
        A a2 = this.KWHzl;
        return (iHashCode * 31) + (a2 != null ? a2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ViewFlipper.class != obj.getClass()) {
            return false;
        }
        ViewFlipper viewFlipper = (ViewFlipper) obj;
        return Intrinsics.EZpvd(this.copydefault, viewFlipper.copydefault) && Intrinsics.EZpvd(this.KWHzl, viewFlipper.KWHzl);
    }

    public static /* synthetic */ ViewFlipper copy$default(ViewFlipper viewFlipper, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetLabelDetectionRequestMetadata$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ViewFlipper.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ViewFlipper.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(viewFlipper);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    public static final class TaskDescription {
        public A OLrzqt;
        public AbstractC58373z copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(A a2) {
            this.OLrzqt = a2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC58373z EZpvd() {
            return this.copydefault;
        }

        public final TaskDescription OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AbstractC58373z abstractC58373z) {
            this.copydefault = abstractC58373z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final A copydefault() {
            return this.OLrzqt;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ViewFlipper viewFlipper) {
            this();
            Intrinsics.checkNotNullParameter(viewFlipper, "");
            this.copydefault = viewFlipper.KWHzl();
            this.OLrzqt = viewFlipper.copydefault();
        }

        public final ViewFlipper KWHzl() {
            return new ViewFlipper(this, null);
        }
    }
}
