package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C47227tm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C47227tm {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final AbstractC45997tE AEQbTJ;
    public final java.util.List<C46240tN> AhwBna;
    public final java.lang.String EZpvd;
    public final C46697tc KWHzl;
    public final java.lang.String copydefault;
    public final C46402tT djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tm$TaskDescription) A[MD:(o.tm$TaskDescription):void (m)] call: o.tm.<init>(o.tm$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C47227tm(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46697tc AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C46240tN> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC45997tE copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46402tT djBIcL() {
        return this.djBIcL;
    }

    public C47227tm(TaskDescription taskDescription) {
        this.EZpvd = taskDescription.AEQbTJ();
        this.KWHzl = taskDescription.KWHzl();
        this.AEQbTJ = taskDescription.copydefault();
        this.copydefault = taskDescription.EZpvd();
        this.AhwBna = taskDescription.AYXKKw();
        this.djBIcL = taskDescription.gEmmrt();
    }

    /* JADX INFO: renamed from: o.tm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ImportTerminologyRequest(");
        sb.append("description=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("encryptionKey=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("mergeStrategy=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("terminologyData=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        C46697tc c46697tc = this.KWHzl;
        int iHashCode2 = c46697tc != null ? c46697tc.hashCode() : 0;
        AbstractC45997tE abstractC45997tE = this.AEQbTJ;
        int iHashCode3 = abstractC45997tE != null ? abstractC45997tE.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.util.List<C46240tN> list = this.AhwBna;
        int iHashCode5 = list != null ? list.hashCode() : 0;
        C46402tT c46402tT = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (c46402tT != null ? c46402tT.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C47227tm.class != obj.getClass()) {
            return false;
        }
        C47227tm c47227tm = (C47227tm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c47227tm.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c47227tm.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c47227tm.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c47227tm.copydefault) && Intrinsics.EZpvd(this.AhwBna, c47227tm.AhwBna) && Intrinsics.EZpvd(this.djBIcL, c47227tm.djBIcL);
    }

    public static /* synthetic */ C47227tm copy$default(C47227tm c47227tm, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.ImportTerminologyRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47227tm.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47227tm.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c47227tm);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    /* JADX INFO: renamed from: o.tm$TaskDescription */
    public static final class TaskDescription {
        public C46697tc AEQbTJ;
        public java.util.List<C46240tN> EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public AbstractC45997tE copydefault;
        public C46402tT djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C46240tN> AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46697tc KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC45997tE copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46402tT gEmmrt() {
            return this.djBIcL;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C47227tm c47227tm) {
            this();
            Intrinsics.checkNotNullParameter(c47227tm, "");
            this.OLrzqt = c47227tm.EZpvd();
            this.AEQbTJ = c47227tm.AEQbTJ();
            this.copydefault = c47227tm.copydefault();
            this.KWHzl = c47227tm.OLrzqt();
            this.EZpvd = c47227tm.KWHzl();
            this.djBIcL = c47227tm.djBIcL();
        }

        public final C47227tm OLrzqt() {
            return new C47227tm(this, null);
        }
    }
}
