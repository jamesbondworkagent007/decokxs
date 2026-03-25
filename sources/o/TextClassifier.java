package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TextClassifier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class TextClassifier {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final java.lang.Integer AEQbTJ;
    public final java.util.List<Toolbar> AYXKKw;
    public final java.lang.String AhwBna;
    public final java.util.List<Toast> AkhnZx;
    public final java.util.List<java.lang.String> DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.util.List<BufferType> copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TextClassifier$TaskDescription) A[MD:(o.TextClassifier$TaskDescription):void (m)] call: o.TextClassifier.<init>(o.TextClassifier$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TextClassifier(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Toolbar> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BufferType> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Toast> gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    public TextClassifier(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.copydefault();
        this.OLrzqt = taskDescription.AEQbTJ();
        this.EZpvd = taskDescription.KWHzl();
        this.copydefault = taskDescription.OLrzqt();
        this.AYXKKw = taskDescription.AYXKKw();
        this.AhwBna = taskDescription.gEmmrt();
        this.gEmmrt = taskDescription.AhwBna();
        this.valueOf = taskDescription.valueOf();
        this.djBIcL = taskDescription.djBIcL();
        this.AkhnZx = taskDescription.isConnected();
        this.fetchVPNInfo = taskDescription.AkhnZx();
        this.DbNXlk = taskDescription.DbNXlk();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TextClassifier.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AssumeRoleRequest(");
        sb.append("durationSeconds=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("externalId=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("policy=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("policyArns=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("providedContexts=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("roleArn=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("roleSessionName=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("serialNumber=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("sourceIdentity=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("tokenCode=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("transitiveTagKeys=");
        sb2.append(this.DbNXlk);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.AEQbTJ;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.util.List<BufferType> list = this.copydefault;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        java.util.List<Toolbar> list2 = this.AYXKKw;
        int iHashCode4 = list2 != null ? list2.hashCode() : 0;
        java.lang.String str3 = this.AhwBna;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.gEmmrt;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.valueOf;
        int iHashCode7 = str5 != null ? str5.hashCode() : 0;
        java.lang.String str6 = this.djBIcL;
        int iHashCode8 = str6 != null ? str6.hashCode() : 0;
        java.util.List<Toast> list3 = this.AkhnZx;
        int iHashCode9 = list3 != null ? list3.hashCode() : 0;
        java.lang.String str7 = this.fetchVPNInfo;
        int iHashCode10 = str7 != null ? str7.hashCode() : 0;
        java.util.List<java.lang.String> list4 = this.DbNXlk;
        return (((((((((((((((((((((iIntValue * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextClassifier.class != obj.getClass()) {
            return false;
        }
        TextClassifier textClassifier = (TextClassifier) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, textClassifier.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) textClassifier.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) textClassifier.EZpvd) && Intrinsics.EZpvd(this.copydefault, textClassifier.copydefault) && Intrinsics.EZpvd(this.AYXKKw, textClassifier.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) textClassifier.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) textClassifier.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) textClassifier.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) textClassifier.djBIcL) && Intrinsics.EZpvd(this.AkhnZx, textClassifier.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) textClassifier.fetchVPNInfo) && Intrinsics.EZpvd(this.DbNXlk, textClassifier.DbNXlk);
    }

    public static /* synthetic */ TextClassifier copy$default(TextClassifier textClassifier, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.AssumeRoleRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TextClassifier.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextClassifier.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(textClassifier);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String EZpvd;
        public java.util.List<Toolbar> KWHzl;
        public java.util.List<BufferType> OLrzqt;
        public java.lang.Integer copydefault;
        public java.util.List<Toast> djBIcL;
        public java.lang.String fetchVPNInfo;
        public java.lang.String gEmmrt;
        public java.lang.String valueOf;
        public java.util.List<java.lang.String> values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Toolbar> AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AYXKKw(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> DbNXlk() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.copydefault = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<Toast> list) {
            this.djBIcL = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<java.lang.String> list) {
            this.values = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<BufferType> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<BufferType> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void djBIcL(java.lang.String str) {
            this.fetchVPNInfo = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Toast> isConnected() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull TextClassifier textClassifier) {
            this();
            Intrinsics.checkNotNullParameter(textClassifier, "");
            this.copydefault = textClassifier.copydefault();
            this.AEQbTJ = textClassifier.AEQbTJ();
            this.EZpvd = textClassifier.EZpvd();
            this.OLrzqt = textClassifier.OLrzqt();
            this.KWHzl = textClassifier.KWHzl();
            this.AhwBna = textClassifier.djBIcL();
            this.gEmmrt = textClassifier.AYXKKw();
            this.valueOf = textClassifier.valueOf();
            this.AYXKKw = textClassifier.AhwBna();
            this.djBIcL = textClassifier.gEmmrt();
            this.fetchVPNInfo = textClassifier.AkhnZx();
            this.values = textClassifier.isConnected();
        }

        public final TextClassifier EZpvd() {
            return new TextClassifier(this, null);
        }
    }
}
