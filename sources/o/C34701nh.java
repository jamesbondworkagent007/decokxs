package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34701nh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34701nh {
    public static final Activity OLrzqt = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final C33657nB KWHzl;
    public final java.util.List<C36708og> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nh$TaskDescription) A[MD:(o.nh$TaskDescription):void (m)] call: o.nh.<init>(o.nh$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34701nh(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33657nB EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36708og> OLrzqt() {
        return this.copydefault;
    }

    public C34701nh(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.OLrzqt();
        this.KWHzl = taskDescription.KWHzl();
        this.copydefault = taskDescription.copydefault();
    }

    /* JADX INFO: renamed from: o.nh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyzeIdResponse(");
        sb.append("analyzeIdModelVersion=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("documentMetadata=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("identityDocuments=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        C33657nB c33657nB = this.KWHzl;
        int iHashCode2 = c33657nB != null ? c33657nB.hashCode() : 0;
        java.util.List<C36708og> list = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34701nh.class != obj.getClass()) {
            return false;
        }
        C34701nh c34701nh = (C34701nh) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c34701nh.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c34701nh.KWHzl) && Intrinsics.EZpvd(this.copydefault, c34701nh.copydefault);
    }

    public static /* synthetic */ C34701nh copy$default(C34701nh c34701nh, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.AnalyzeIdResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34701nh.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34701nh.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c34701nh);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.nh$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        public static int KWHzl;
        public static int copydefault;
        public C33657nB AEQbTJ;
        public java.lang.String EZpvd;
        public java.util.List<C36708og> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.EZpvd = str;
        }

        public final TaskDescription EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C36708og> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33657nB KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C36708og> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C33657nB c33657nB) {
            this.AEQbTJ = c33657nB;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C34701nh c34701nh) {
            this();
            Intrinsics.checkNotNullParameter(c34701nh, "");
            this.EZpvd = c34701nh.KWHzl();
            this.AEQbTJ = c34701nh.EZpvd();
            this.OLrzqt = c34701nh.OLrzqt();
        }

        public final C34701nh AEQbTJ() {
            return new C34701nh(this, null);
        }

        public static int valueOf() {
            int i = KWHzl;
            int i2 = i % 5610719;
            KWHzl = i + 1;
            if (i2 != 0) {
                return copydefault;
            }
            int startUptimeMillis = (int) android.os.Process.getStartUptimeMillis();
            copydefault = startUptimeMillis;
            return startUptimeMillis;
        }
    }
}
