package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36920ok;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36920ok {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.util.List<C33819nH> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ok$TaskDescription) A[MD:(o.ok$TaskDescription):void (m)] call: o.ok.<init>(o.ok$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36920ok(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C33819nH> copydefault() {
        return this.OLrzqt;
    }

    public C36920ok(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription.copydefault();
    }

    /* JADX INFO: renamed from: o.ok$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ok.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LineItemFields(");
        sb.append("lineItemExpenseFields=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C33819nH> list = this.OLrzqt;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C36920ok.class == obj.getClass() && Intrinsics.EZpvd(this.OLrzqt, ((C36920ok) obj).OLrzqt);
    }

    public static /* synthetic */ C36920ok copy$default(C36920ok c36920ok, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.LineItemFields$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36920ok.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36920ok.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c36920ok);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    /* JADX INFO: renamed from: o.ok$TaskDescription */
    public static final class TaskDescription {
        public java.util.List<C33819nH> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C33819nH> list) {
            this.EZpvd = list;
        }

        public final TaskDescription OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C33819nH> copydefault() {
            return this.EZpvd;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C36920ok c36920ok) {
            this();
            Intrinsics.checkNotNullParameter(c36920ok, "");
            this.EZpvd = c36920ok.copydefault();
        }

        public final C36920ok EZpvd() {
            return new C36920ok(this, null);
        }
    }
}
