package o;

import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59480zho {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public static final C59480zho KWHzl;
    public static final C59480zho OLrzqt;
    public final ActionBar AEQbTJ;
    public final Application copydefault;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar copydefault() {
        return this.AEQbTJ;
    }

    public C59480zho(boolean z, @NotNull Application application, @NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.valueOf = z;
        this.copydefault = application;
        this.AEQbTJ = actionBar;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HexFormat(");
        sb.append('\n');
        sb.append("    upperCase = ");
        sb.append(this.valueOf);
        sb.append(",");
        sb.append('\n');
        sb.append("    bytes = BytesHexFormat(");
        sb.append('\n');
        this.copydefault.copydefault(sb, "        ").append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.AEQbTJ.KWHzl(sb, "        ").append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.zho$Application */
    public static final class Application {
        public final boolean AYXKKw;
        public final int AhwBna;
        public final boolean DbNXlk;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final boolean djBIcL;
        public final java.lang.String gEmmrt;
        public final int valueOf;
        public static final Activity KWHzl = new Activity(null);
        public static final Application AEQbTJ = new Application(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.DbNXlk;
        }

        public Application(int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.valueOf = i;
            this.AhwBna = i2;
            this.gEmmrt = str;
            this.EZpvd = str2;
            this.OLrzqt = str3;
            this.copydefault = str4;
            boolean z = true;
            this.AYXKKw = i == Integer.MAX_VALUE && i2 == Integer.MAX_VALUE;
            this.DbNXlk = str3.length() == 0 && str4.length() == 0 && str2.length() <= 1;
            if (!C59484zhs.copydefault(str) && !C59484zhs.copydefault(str2) && !C59484zhs.copydefault(str3) && !C59484zhs.copydefault(str4)) {
                z = false;
            }
            this.djBIcL = z;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("BytesHexFormat(");
            sb.append('\n');
            copydefault(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }

        public final java.lang.StringBuilder copydefault(@NotNull java.lang.StringBuilder sb, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(sb, "");
            Intrinsics.checkNotNullParameter(str, "");
            sb.append(str);
            sb.append("bytesPerLine = ");
            sb.append(this.valueOf);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(this.AhwBna);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append(this.gEmmrt);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append(this.EZpvd);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytePrefix = \"");
            sb.append(this.OLrzqt);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append(this.copydefault);
            sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            return sb;
        }

        /* JADX INFO: renamed from: o.zho$Application$Activity */
        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zho.Application.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }

            public final Application EZpvd() {
                return Application.AEQbTJ;
            }
        }
    }

    /* JADX INFO: renamed from: o.zho$ActionBar */
    public static final class ActionBar {
        public final boolean AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final boolean EZpvd;
        public final boolean copydefault;
        public final int djBIcL;
        public final boolean valueOf;
        public static final TaskDescription OLrzqt = new TaskDescription(null);
        public static final ActionBar KWHzl = new ActionBar("", "", false, 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.EZpvd;
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AYXKKw = str;
            this.AhwBna = str2;
            this.valueOf = z;
            this.djBIcL = i;
            boolean z2 = true;
            boolean z3 = str.length() == 0 && str2.length() == 0;
            this.EZpvd = z3;
            this.AEQbTJ = z3 && i == 1;
            if (!C59484zhs.copydefault(str) && !C59484zhs.copydefault(str2)) {
                z2 = false;
            }
            this.copydefault = z2;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("NumberHexFormat(");
            sb.append('\n');
            KWHzl(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }

        public final java.lang.StringBuilder KWHzl(@NotNull java.lang.StringBuilder sb, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(sb, "");
            Intrinsics.checkNotNullParameter(str, "");
            sb.append(str);
            sb.append("prefix = \"");
            sb.append(this.AYXKKw);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append(this.AhwBna);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(this.valueOf);
            sb.append(AbstractJsonLexerKt.COMMA);
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(this.djBIcL);
            return sb;
        }

        /* JADX INFO: renamed from: o.zho$ActionBar$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zho.ActionBar.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final ActionBar KWHzl() {
                return ActionBar.KWHzl;
            }
        }
    }

    /* JADX INFO: renamed from: o.zho$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zho.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C59480zho OLrzqt() {
            return C59480zho.KWHzl;
        }
    }

    static {
        Application.Activity activity = Application.KWHzl;
        Application applicationEZpvd = activity.EZpvd();
        ActionBar.TaskDescription taskDescription = ActionBar.OLrzqt;
        KWHzl = new C59480zho(false, applicationEZpvd, taskDescription.KWHzl());
        OLrzqt = new C59480zho(true, activity.EZpvd(), taskDescription.KWHzl());
    }
}
