package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C48776uc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C48776uc {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.util.List<C44548sU> AEQbTJ;
    public final java.lang.String KWHzl;
    public final C48882ue OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.uc$TaskDescription) A[MD:(o.uc$TaskDescription):void (m)] call: o.uc.<init>(o.uc$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C48776uc(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48882ue AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C44548sU> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    public C48776uc(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription.OLrzqt();
        this.AEQbTJ = taskDescription.AEQbTJ();
        java.lang.String strKWHzl = taskDescription.KWHzl();
        if (strKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for sourceLanguageCode".toString());
        }
        this.copydefault = strKWHzl;
        java.lang.String strGEmmrt = taskDescription.gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for targetLanguageCode".toString());
        }
        this.KWHzl = strGEmmrt;
        java.lang.String strValueOf = taskDescription.valueOf();
        if (strValueOf == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for translatedText".toString());
        }
        this.valueOf = strValueOf;
    }

    /* JADX INFO: renamed from: o.uc$StateListAnimator */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TranslateTextResponse(");
        sb.append("appliedSettings=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("appliedTerminologies=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("sourceLanguageCode=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("targetLanguageCode=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("translatedText=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C48882ue c48882ue = this.OLrzqt;
        int iHashCode = c48882ue != null ? c48882ue.hashCode() : 0;
        java.util.List<C44548sU> list = this.AEQbTJ;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.valueOf.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C48776uc.class != obj.getClass()) {
            return false;
        }
        C48776uc c48776uc = (C48776uc) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c48776uc.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c48776uc.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c48776uc.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48776uc.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c48776uc.valueOf);
    }

    public static /* synthetic */ C48776uc copy$default(C48776uc c48776uc, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.TranslateTextResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C48776uc.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C48776uc.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c48776uc);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    /* JADX INFO: renamed from: o.uc$TaskDescription */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.util.List<C44548sU> OLrzqt;
        public C48882ue copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C44548sU> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd() {
            if (this.EZpvd == null) {
                this.EZpvd = "";
            }
            if (this.KWHzl == null) {
                this.KWHzl = "";
            }
            if (this.AEQbTJ == null) {
                this.AEQbTJ = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C48882ue OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C44548sU> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C48882ue c48882ue) {
            this.copydefault = c48882ue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AEQbTJ;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C48776uc c48776uc) {
            this();
            Intrinsics.checkNotNullParameter(c48776uc, "");
            this.copydefault = c48776uc.AEQbTJ();
            this.OLrzqt = c48776uc.OLrzqt();
            this.EZpvd = c48776uc.copydefault();
            this.KWHzl = c48776uc.KWHzl();
            this.AEQbTJ = c48776uc.EZpvd();
        }

        public final C48776uc copydefault() {
            return new C48776uc(this, null);
        }
    }
}
