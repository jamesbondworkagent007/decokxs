package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11081cB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11081cB {
    public static final ActionBar copydefault = new ActionBar(null);
    public final java.util.List<WebViewDelegate> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.cB$TaskDescription) A[MD:(o.cB$TaskDescription):void (m)] call: o.cB.<init>(o.cB$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C11081cB(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<WebViewDelegate> KWHzl() {
        return this.OLrzqt;
    }

    public C11081cB(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.cB$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ValidationData(");
        sb.append("assets=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<WebViewDelegate> list = this.OLrzqt;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C11081cB.class == obj.getClass() && Intrinsics.EZpvd(this.OLrzqt, ((C11081cB) obj).OLrzqt);
    }

    public static /* synthetic */ C11081cB copy$default(C11081cB c11081cB, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ValidationData$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C11081cB.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C11081cB.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c11081cB);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    /* JADX INFO: renamed from: o.cB$TaskDescription */
    public static final class TaskDescription {
        public java.util.List<WebViewDelegate> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<WebViewDelegate> AEQbTJ() {
            return this.EZpvd;
        }

        public final TaskDescription copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<WebViewDelegate> list) {
            this.EZpvd = list;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C11081cB c11081cB) {
            this();
            Intrinsics.checkNotNullParameter(c11081cB, "");
            this.EZpvd = c11081cB.KWHzl();
        }

        public final C11081cB OLrzqt() {
            return new C11081cB(this, null);
        }
    }
}
