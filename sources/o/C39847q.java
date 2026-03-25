package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C39847q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C39847q {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final AbstractC7503al EZpvd;
    public final java.util.List<StackView> KWHzl;
    public final java.lang.String OLrzqt;
    public final java.util.List<C12073cg> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.q$TaskDescription) A[MD:(o.q$TaskDescription):void (m)] call: o.q.<init>(o.q$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C39847q(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC7503al AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C12073cg> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<StackView> OLrzqt() {
        return this.KWHzl;
    }

    public C39847q(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription.KWHzl();
        this.KWHzl = taskDescription.AEQbTJ();
        this.EZpvd = taskDescription.OLrzqt();
        this.copydefault = taskDescription.AYXKKw();
    }

    /* JADX INFO: renamed from: o.q$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.q.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IndexFacesResponse(");
        sb.append("faceModelVersion=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("faceRecords=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("orientationCorrection=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("unindexedFaces=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.util.List<StackView> list = this.KWHzl;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        AbstractC7503al abstractC7503al = this.EZpvd;
        int iHashCode3 = abstractC7503al != null ? abstractC7503al.hashCode() : 0;
        java.util.List<C12073cg> list2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C39847q.class != obj.getClass()) {
            return false;
        }
        C39847q c39847q = (C39847q) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c39847q.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c39847q.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c39847q.EZpvd) && Intrinsics.EZpvd(this.copydefault, c39847q.copydefault);
    }

    public static /* synthetic */ C39847q copy$default(C39847q c39847q, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.IndexFacesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C39847q.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C39847q.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c39847q);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    /* JADX INFO: renamed from: o.q$TaskDescription */
    public static final class TaskDescription {
        public java.util.List<StackView> AEQbTJ;
        public java.util.List<C12073cg> KWHzl;
        public java.lang.String OLrzqt;
        public AbstractC7503al copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<StackView> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC7503al abstractC7503al) {
            this.copydefault = abstractC7503al;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C12073cg> AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C12073cg> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<StackView> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC7503al OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        public final TaskDescription copydefault() {
            return this;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C39847q c39847q) {
            this();
            Intrinsics.checkNotNullParameter(c39847q, "");
            this.OLrzqt = c39847q.EZpvd();
            this.AEQbTJ = c39847q.OLrzqt();
            this.copydefault = c39847q.AEQbTJ();
            this.KWHzl = c39847q.KWHzl();
        }

        public final C39847q EZpvd() {
            return new C39847q(this, null);
        }
    }
}
