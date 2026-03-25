package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CheckBox;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CheckBox {
    public static final Activity EZpvd = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final AbstractC8031av KWHzl;
    public final DatePickerSpinnerDelegate OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CheckBox$TaskDescription) A[MD:(o.CheckBox$TaskDescription):void (m)] call: o.CheckBox.<init>(o.CheckBox$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CheckBox(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DatePickerSpinnerDelegate OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC8031av copydefault() {
        return this.KWHzl;
    }

    public CheckBox(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.OLrzqt();
        this.OLrzqt = taskDescription.AEQbTJ();
        this.AEQbTJ = taskDescription.EZpvd();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CheckBox.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateProjectRequest(");
        sb.append("autoUpdate=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("feature=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("projectName=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC8031av abstractC8031av = this.KWHzl;
        int iHashCode = abstractC8031av != null ? abstractC8031av.hashCode() : 0;
        DatePickerSpinnerDelegate datePickerSpinnerDelegate = this.OLrzqt;
        int iHashCode2 = datePickerSpinnerDelegate != null ? datePickerSpinnerDelegate.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CheckBox.class != obj.getClass()) {
            return false;
        }
        CheckBox checkBox = (CheckBox) obj;
        return Intrinsics.EZpvd(this.KWHzl, checkBox.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, checkBox.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) checkBox.AEQbTJ);
    }

    public static /* synthetic */ CheckBox copy$default(CheckBox checkBox, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CreateProjectRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CheckBox.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CheckBox.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(checkBox);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    public static final class TaskDescription {
        public AbstractC8031av AEQbTJ;
        public java.lang.String EZpvd;
        public DatePickerSpinnerDelegate OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DatePickerSpinnerDelegate AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC8031av OLrzqt() {
            return this.AEQbTJ;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull CheckBox checkBox) {
            this();
            Intrinsics.checkNotNullParameter(checkBox, "");
            this.AEQbTJ = checkBox.copydefault();
            this.OLrzqt = checkBox.OLrzqt();
            this.EZpvd = checkBox.AEQbTJ();
        }

        public final CheckBox copydefault() {
            return new CheckBox(this, null);
        }
    }
}
