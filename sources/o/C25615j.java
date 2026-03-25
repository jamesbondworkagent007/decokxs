package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C25615j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C25615j {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public final C6582aS KWHzl;
    public final byte[] copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.j$TaskDescription) A[MD:(o.j$TaskDescription):void (m)] call: o.j.<init>(o.j$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C25615j(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6582aS copydefault() {
        return this.KWHzl;
    }

    public C25615j(TaskDescription taskDescription) {
        this.copydefault = taskDescription.OLrzqt();
        this.KWHzl = taskDescription.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.j$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.j.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C25615j copydefault(@NotNull Function1<? super TaskDescription, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            TaskDescription taskDescription = new TaskDescription();
            function1.invoke(taskDescription);
            return taskDescription.EZpvd();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Image(");
        sb.append("bytes=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("s3Object=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        byte[] bArr = this.copydefault;
        int iHashCode = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        C6582aS c6582aS = this.KWHzl;
        return (iHashCode * 31) + (c6582aS != null ? c6582aS.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C25615j.class != obj.getClass()) {
            return false;
        }
        C25615j c25615j = (C25615j) obj;
        byte[] bArr = this.copydefault;
        if (bArr != null) {
            byte[] bArr2 = c25615j.copydefault;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (c25615j.copydefault != null) {
            return false;
        }
        return Intrinsics.EZpvd(this.KWHzl, c25615j.KWHzl);
    }

    public static /* synthetic */ C25615j copy$default(C25615j c25615j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.Image$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C25615j.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C25615j.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c25615j);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    /* JADX INFO: renamed from: o.j$TaskDescription */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        public C6582aS AEQbTJ;
        public byte[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C6582aS AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(byte[] bArr) {
            this.KWHzl = bArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] OLrzqt() {
            return this.KWHzl;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C25615j c25615j) {
            this();
            Intrinsics.checkNotNullParameter(c25615j, "");
            this.KWHzl = c25615j.EZpvd();
            this.AEQbTJ = c25615j.copydefault();
        }

        public final C25615j EZpvd() {
            return new C25615j(this, null);
        }
    }
}
