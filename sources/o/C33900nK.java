package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C33900nK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C33900nK {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final C36708og EZpvd;
    public final C36973ol KWHzl;
    public final C33711nD copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nK$TaskDescription) A[MD:(o.nK$TaskDescription):void (m)] call: o.nK.<init>(o.nK$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C33900nK(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36973ol AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33711nD KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36708og copydefault() {
        return this.EZpvd;
    }

    public C33900nK(TaskDescription taskDescription) {
        this.copydefault = taskDescription.AEQbTJ();
        this.EZpvd = taskDescription.KWHzl();
        this.KWHzl = taskDescription.copydefault();
    }

    /* JADX INFO: renamed from: o.nK$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Extraction(");
        sb.append("expenseDocument=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("identityDocument=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("lendingDocument=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C33711nD c33711nD = this.copydefault;
        int iHashCode = c33711nD != null ? c33711nD.hashCode() : 0;
        C36708og c36708og = this.EZpvd;
        int iHashCode2 = c36708og != null ? c36708og.hashCode() : 0;
        C36973ol c36973ol = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c36973ol != null ? c36973ol.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33900nK.class != obj.getClass()) {
            return false;
        }
        C33900nK c33900nK = (C33900nK) obj;
        return Intrinsics.EZpvd(this.copydefault, c33900nK.copydefault) && Intrinsics.EZpvd(this.EZpvd, c33900nK.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c33900nK.KWHzl);
    }

    public static /* synthetic */ C33900nK copy$default(C33900nK c33900nK, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.Extraction$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C33900nK.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C33900nK.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c33900nK);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    /* JADX INFO: renamed from: o.nK$TaskDescription */
    public static final class TaskDescription {
        public C36973ol KWHzl;
        public C36708og OLrzqt;
        public C33711nD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33711nD AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C36708og c36708og) {
            this.OLrzqt = c36708og;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36708og KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C33711nD c33711nD) {
            this.copydefault = c33711nD;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C36973ol c36973ol) {
            this.KWHzl = c36973ol;
        }

        public final TaskDescription OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36973ol copydefault() {
            return this.KWHzl;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C33900nK c33900nK) {
            this();
            Intrinsics.checkNotNullParameter(c33900nK, "");
            this.copydefault = c33900nK.KWHzl();
            this.OLrzqt = c33900nK.copydefault();
            this.KWHzl = c33900nK.AEQbTJ();
        }

        public final C33900nK EZpvd() {
            return new C33900nK(this, null);
        }
    }
}
