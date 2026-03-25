package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.LinearInterpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class LinearInterpolator {
    public static final Application OLrzqt = new Application(null);
    public final java.lang.String AEQbTJ;
    public final int KWHzl;
    public final AbstractC59439zh copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.LinearInterpolator$TaskDescription) A[MD:(o.LinearInterpolator$TaskDescription):void (m)] call: o.LinearInterpolator.<init>(o.LinearInterpolator$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LinearInterpolator(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59439zh OLrzqt() {
        return this.copydefault;
    }

    public LinearInterpolator(TaskDescription taskDescription) {
        this.copydefault = taskDescription.copydefault();
        this.AEQbTJ = taskDescription.KWHzl();
        this.KWHzl = taskDescription.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LinearInterpolator.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SynthesizeSpeechResponse(");
        sb.append("audioStream=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("contentType=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("requestCharacters=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC59439zh abstractC59439zh = this.copydefault;
        int iHashCode = abstractC59439zh != null ? abstractC59439zh.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.KWHzl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LinearInterpolator.class != obj.getClass()) {
            return false;
        }
        LinearInterpolator linearInterpolator = (LinearInterpolator) obj;
        return Intrinsics.EZpvd(this.copydefault, linearInterpolator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) linearInterpolator.AEQbTJ) && this.KWHzl == linearInterpolator.KWHzl;
    }

    public static /* synthetic */ LinearInterpolator copy$default(LinearInterpolator linearInterpolator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.SynthesizeSpeechResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LinearInterpolator.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LinearInterpolator.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(linearInterpolator);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        public AbstractC59439zh KWHzl;
        public int OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(int i) {
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC59439zh abstractC59439zh) {
            this.KWHzl = abstractC59439zh;
        }

        public final TaskDescription OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC59439zh copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.copydefault = str;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull LinearInterpolator linearInterpolator) {
            this();
            Intrinsics.checkNotNullParameter(linearInterpolator, "");
            this.KWHzl = linearInterpolator.OLrzqt();
            this.copydefault = linearInterpolator.KWHzl();
            this.OLrzqt = linearInterpolator.EZpvd();
        }

        public final LinearInterpolator EZpvd() {
            return new LinearInterpolator(this, null);
        }
    }
}
