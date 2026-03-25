package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ParcelFileDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ParcelFileDescriptor {
    public static final Application KWHzl = new Application(null);
    public final java.lang.Double AEQbTJ;
    public final java.lang.Double EZpvd;
    public final java.lang.Double copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ParcelFileDescriptor$TaskDescription) A[MD:(o.ParcelFileDescriptor$TaskDescription):void (m)] call: o.ParcelFileDescriptor.<init>(o.ParcelFileDescriptor$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ParcelFileDescriptor(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double copydefault() {
        return this.EZpvd;
    }

    public ParcelFileDescriptor(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.copydefault();
        this.copydefault = taskDescription.EZpvd();
        this.EZpvd = taskDescription.AEQbTJ();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ParcelFileDescriptor.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EntityRecognizerEvaluationMetrics(");
        sb.append("f1Score=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("precision=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("recall=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Double d = this.AEQbTJ;
        int iHashCode = d != null ? d.hashCode() : 0;
        java.lang.Double d2 = this.copydefault;
        int iHashCode2 = d2 != null ? d2.hashCode() : 0;
        java.lang.Double d3 = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (d3 != null ? d3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ParcelFileDescriptor.class != obj.getClass()) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        return Intrinsics.OLrzqt(this.AEQbTJ, parcelFileDescriptor.AEQbTJ) && Intrinsics.OLrzqt(this.copydefault, parcelFileDescriptor.copydefault) && Intrinsics.OLrzqt(this.EZpvd, parcelFileDescriptor.EZpvd);
    }

    public static /* synthetic */ ParcelFileDescriptor copy$default(ParcelFileDescriptor parcelFileDescriptor, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EntityRecognizerEvaluationMetrics$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ParcelFileDescriptor.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ParcelFileDescriptor.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(parcelFileDescriptor);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    public static final class TaskDescription {
        public java.lang.Double AEQbTJ;
        public java.lang.Double EZpvd;
        public java.lang.Double OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Double d) {
            this.AEQbTJ = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Double d) {
            this.OLrzqt = d;
        }

        public final TaskDescription OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Double d) {
            this.EZpvd = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double copydefault() {
            return this.AEQbTJ;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ParcelFileDescriptor parcelFileDescriptor) {
            this();
            Intrinsics.checkNotNullParameter(parcelFileDescriptor, "");
            this.AEQbTJ = parcelFileDescriptor.KWHzl();
            this.OLrzqt = parcelFileDescriptor.EZpvd();
            this.EZpvd = parcelFileDescriptor.copydefault();
        }

        public final ParcelFileDescriptor KWHzl() {
            return new ParcelFileDescriptor(this, null);
        }
    }
}
