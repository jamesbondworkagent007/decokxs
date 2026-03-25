package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C45970tD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C45970tD {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.util.List<C46456tV> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tD$TaskDescription) A[MD:(o.tD$TaskDescription):void (m)] call: o.tD.<init>(o.tD$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C45970tD(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C46456tV> KWHzl() {
        return this.copydefault;
    }

    public C45970tD(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.KWHzl();
        this.copydefault = taskDescription.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tD$StateListAnimator */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListTextTranslationJobsResponse(");
        sb.append("nextToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("textTranslationJobPropertiesList=");
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
        java.util.List<C46456tV> list = this.copydefault;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C45970tD.class != obj.getClass()) {
            return false;
        }
        C45970tD c45970tD = (C45970tD) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c45970tD.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c45970tD.copydefault);
    }

    public static /* synthetic */ C45970tD copy$default(C45970tD c45970tD, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.ListTextTranslationJobsResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C45970tD.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C45970tD.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c45970tD);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    /* JADX INFO: renamed from: o.tD$TaskDescription */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.util.List<C46456tV> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C46456tV> AEQbTJ() {
            return this.EZpvd;
        }

        public final TaskDescription EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C46456tV> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C45970tD c45970tD) {
            this();
            Intrinsics.checkNotNullParameter(c45970tD, "");
            this.AEQbTJ = c45970tD.EZpvd();
            this.EZpvd = c45970tD.KWHzl();
        }

        public final C45970tD copydefault() {
            return new C45970tD(this, null);
        }
    }
}
