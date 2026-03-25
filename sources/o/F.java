package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.F;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class F {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.Integer AhwBna;
    public final java.util.List<java.lang.String> KWHzl;
    public final java.lang.Boolean OLrzqt;
    public final java.lang.Boolean copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.F$TaskDescription) A[MD:(o.F$TaskDescription):void (m)] call: o.F.<init>(o.F$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ F(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    public F(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.copydefault();
        this.AEQbTJ = taskDescription.EZpvd();
        this.copydefault = taskDescription.OLrzqt();
        this.OLrzqt = taskDescription.AEQbTJ();
        this.AhwBna = taskDescription.valueOf();
        this.AYXKKw = taskDescription.AYXKKw();
        this.valueOf = taskDescription.AhwBna();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.F.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListDatasetEntriesRequest(");
        sb.append("containsLabels=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("datasetArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("hasErrors=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("labeled=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sourceRefContains=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<java.lang.String> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.Boolean bool = this.copydefault;
        int iHashCode3 = bool != null ? bool.hashCode() : 0;
        java.lang.Boolean bool2 = this.OLrzqt;
        int iHashCode4 = bool2 != null ? bool2.hashCode() : 0;
        java.lang.Integer num = this.AhwBna;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.AYXKKw;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.valueOf;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iIntValue) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f = (F) obj;
        return Intrinsics.EZpvd(this.KWHzl, f.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) f.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, f.copydefault) && Intrinsics.EZpvd(this.OLrzqt, f.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, f.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) f.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) f.valueOf);
    }

    public static /* synthetic */ F copy$default(F f, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ListDatasetEntriesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull F.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(F.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(f);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        public java.util.List<java.lang.String> AEQbTJ;
        public java.lang.Boolean EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Boolean OLrzqt;
        public java.lang.Integer copydefault;
        public java.lang.String gEmmrt;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer valueOf() {
            return this.copydefault;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull F f) {
            this();
            Intrinsics.checkNotNullParameter(f, "");
            this.AEQbTJ = f.OLrzqt();
            this.KWHzl = f.copydefault();
            this.OLrzqt = f.KWHzl();
            this.EZpvd = f.AEQbTJ();
            this.copydefault = f.EZpvd();
            this.valueOf = f.valueOf();
            this.gEmmrt = f.gEmmrt();
        }

        public final F KWHzl() {
            return new F(this, null);
        }
    }
}
