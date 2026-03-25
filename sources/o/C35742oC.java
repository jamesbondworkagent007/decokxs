package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C35742oC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35742oC {
    public static final Activity copydefault = new Activity(null);
    public final C33954nM AEQbTJ;
    public final java.lang.Float EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oC$TaskDescription) A[MD:(o.oC$TaskDescription):void (m)] call: o.oC.<init>(o.oC$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35742oC(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33954nM KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float OLrzqt() {
        return this.EZpvd;
    }

    public C35742oC(TaskDescription taskDescription) {
        this.EZpvd = taskDescription.OLrzqt();
        this.AEQbTJ = taskDescription.KWHzl();
    }

    /* JADX INFO: renamed from: o.oC$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oC.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SignatureDetection(");
        sb.append("confidence=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("geometry=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.EZpvd;
        int iHashCode = f != null ? f.hashCode() : 0;
        C33954nM c33954nM = this.AEQbTJ;
        return (iHashCode * 31) + (c33954nM != null ? c33954nM.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C35742oC.class != obj.getClass()) {
            return false;
        }
        C35742oC c35742oC = (C35742oC) obj;
        return Intrinsics.copydefault(this.EZpvd, c35742oC.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c35742oC.AEQbTJ);
    }

    public static /* synthetic */ C35742oC copy$default(C35742oC c35742oC, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.SignatureDetection$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C35742oC.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C35742oC.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c35742oC);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    /* JADX INFO: renamed from: o.oC$TaskDescription */
    public static final class TaskDescription {
        public C33954nM AEQbTJ;
        public java.lang.Float KWHzl;

        public final TaskDescription AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Float f) {
            this.KWHzl = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33954nM KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C33954nM c33954nM) {
            this.AEQbTJ = c33954nM;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C35742oC c35742oC) {
            this();
            Intrinsics.checkNotNullParameter(c35742oC, "");
            this.KWHzl = c35742oC.OLrzqt();
            this.AEQbTJ = c35742oC.KWHzl();
        }

        public final C35742oC EZpvd() {
            return new C35742oC(this, null);
        }
    }
}
