package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C35475nw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35475nw {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final java.lang.String KWHzl;
    public final C33657nB OLrzqt;
    public final java.util.List<C34735ni> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nw$TaskDescription) A[MD:(o.nw$TaskDescription):void (m)] call: o.nw.<init>(o.nw$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35475nw(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C34735ni> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33657nB copydefault() {
        return this.OLrzqt;
    }

    public C35475nw(TaskDescription taskDescription) {
        this.copydefault = taskDescription.AEQbTJ();
        this.KWHzl = taskDescription.KWHzl();
        this.OLrzqt = taskDescription.OLrzqt();
    }

    /* JADX INFO: renamed from: o.nw$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nw.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectDocumentTextResponse(");
        sb.append("blocks=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("detectDocumentTextModelVersion=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("documentMetadata=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C34735ni> list = this.copydefault;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        C33657nB c33657nB = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c33657nB != null ? c33657nB.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C35475nw.class != obj.getClass()) {
            return false;
        }
        C35475nw c35475nw = (C35475nw) obj;
        return Intrinsics.EZpvd(this.copydefault, c35475nw.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c35475nw.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c35475nw.OLrzqt);
    }

    public static /* synthetic */ C35475nw copy$default(C35475nw c35475nw, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.DetectDocumentTextResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C35475nw.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C35475nw.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c35475nw);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    /* JADX INFO: renamed from: o.nw$TaskDescription */
    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.util.List<C34735ni> OLrzqt;
        public C33657nB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C34735ni> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C33657nB c33657nB) {
            this.copydefault = c33657nB;
        }

        public final TaskDescription EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33657nB OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<C34735ni> list) {
            this.OLrzqt = list;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C35475nw c35475nw) {
            this();
            Intrinsics.checkNotNullParameter(c35475nw, "");
            this.OLrzqt = c35475nw.EZpvd();
            this.AEQbTJ = c35475nw.OLrzqt();
            this.copydefault = c35475nw.copydefault();
        }

        public final C35475nw copydefault() {
            return new C35475nw(this, null);
        }
    }
}
