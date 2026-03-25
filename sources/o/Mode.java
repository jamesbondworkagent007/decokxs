package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Mode {
    public static final Application OLrzqt = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public Mode(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.copydefault = str;
        this.gEmmrt = str2;
        this.AEQbTJ = str3;
        this.KWHzl = str4;
        this.EZpvd = str5;
        if (str3 != null && !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3))) {
            throw new java.lang.IllegalArgumentException("ARN region must not be blank".toString());
        }
        if (str4 != null && !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4))) {
            throw new java.lang.IllegalArgumentException("ARN accountId must not be blank".toString());
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Mode.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final Mode EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{AbstractJsonLexerKt.COLON}, false, 6, 2, (java.lang.Object) null);
            if (listSplit$default.size() != 6) {
                throw new java.lang.IllegalArgumentException(("Malformed ARN (" + str + ") does not have the expected number of components").toString());
            }
            if (!Intrinsics.EZpvd(listSplit$default.get(0), (java.lang.Object) "arn")) {
                throw new java.lang.IllegalArgumentException("Malformed ARN - does not start with `arn:`".toString());
            }
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) listSplit$default.get(1)))) {
                throw new java.lang.IllegalArgumentException("Malformed ARN - no AWS partition specified".toString());
            }
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) listSplit$default.get(2)))) {
                throw new java.lang.IllegalArgumentException("Malformed ARN - no AWS service specified".toString());
            }
            Application application = Mode.OLrzqt;
            TaskDescription taskDescription = new TaskDescription();
            taskDescription.EZpvd((java.lang.String) listSplit$default.get(1));
            taskDescription.KWHzl((java.lang.String) listSplit$default.get(2));
            java.lang.Object obj = listSplit$default.get(3);
            if (!java.lang.Boolean.valueOf(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) obj)).booleanValue()) {
                obj = null;
            }
            taskDescription.AEQbTJ((java.lang.String) obj);
            java.lang.Object obj2 = listSplit$default.get(4);
            taskDescription.OLrzqt((java.lang.String) (java.lang.Boolean.valueOf(true ^ StringsKt__StringsKt.fARcdN((java.lang.CharSequence) obj2)).booleanValue() ? obj2 : null));
            taskDescription.copydefault((java.lang.String) listSplit$default.get(5));
            return taskDescription.KWHzl();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Mode(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        java.lang.String strCopydefault = taskDescription.copydefault();
        Intrinsics.copydefault((java.lang.Object) strCopydefault);
        java.lang.String strGEmmrt = taskDescription.gEmmrt();
        Intrinsics.copydefault((java.lang.Object) strGEmmrt);
        java.lang.String strOLrzqt = taskDescription.OLrzqt();
        java.lang.String strAEQbTJ = taskDescription.AEQbTJ();
        java.lang.String strEZpvd = taskDescription.EZpvd();
        Intrinsics.copydefault((java.lang.Object) strEZpvd);
        this(strCopydefault, strGEmmrt, strOLrzqt, strAEQbTJ, strEZpvd);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("arn:" + this.copydefault + AbstractJsonLexerKt.COLON + this.gEmmrt + AbstractJsonLexerKt.COLON);
        java.lang.String str = this.AEQbTJ;
        if (str != null) {
            sb.append(str);
        }
        sb.append(":");
        java.lang.String str2 = this.KWHzl;
        if (str2 != null) {
            sb.append(str2);
        }
        sb.append(AbstractJsonLexerKt.COLON + this.EZpvd);
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mode)) {
            return false;
        }
        Mode mode = (Mode) obj;
        if (Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) mode.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) mode.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) mode.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) mode.KWHzl)) {
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) mode.EZpvd);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        java.lang.String str = this.AEQbTJ;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.copydefault;
        }

        public final Mode KWHzl() {
            java.lang.String str = this.AEQbTJ;
            if (!(!(str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)))) {
                throw new java.lang.IllegalArgumentException("ARN partition must not be null or blank".toString());
            }
            java.lang.String str2 = this.copydefault;
            if (!(!(str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)))) {
                throw new java.lang.IllegalArgumentException("ARN service must not be null or blank".toString());
            }
            if (this.KWHzl == null) {
                throw new java.lang.IllegalArgumentException("ARN resource must not be null".toString());
            }
            return new Mode(this);
        }
    }
}
