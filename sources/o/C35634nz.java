package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35634nz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35634nz {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final C35796oE KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nz$TaskDescription) A[MD:(o.nz$TaskDescription):void (m)] call: o.nz.<init>(o.nz$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35634nz(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35796oE OLrzqt() {
        return this.KWHzl;
    }

    public C35634nz(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.OLrzqt();
    }

    /* JADX INFO: renamed from: o.nz$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nz.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentLocation(");
        sb.append("s3Object=" + this.KWHzl);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C35796oE c35796oE = this.KWHzl;
        if (c35796oE != null) {
            return c35796oE.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C35634nz.class == obj.getClass() && Intrinsics.EZpvd(this.KWHzl, ((C35634nz) obj).KWHzl);
    }

    public static /* synthetic */ C35634nz copy$default(C35634nz c35634nz, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.DocumentLocation$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C35634nz.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C35634nz.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c35634nz);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    /* JADX INFO: renamed from: o.nz$TaskDescription */
    public static final class TaskDescription {
        public C35796oE AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35796oE OLrzqt() {
            return this.AEQbTJ;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C35634nz c35634nz) {
            this();
            Intrinsics.checkNotNullParameter(c35634nz, "");
            this.AEQbTJ = c35634nz.OLrzqt();
        }

        public final C35634nz EZpvd() {
            return new C35634nz(this, null);
        }
    }
}
