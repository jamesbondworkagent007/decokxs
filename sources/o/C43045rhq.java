package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43045rhq {
    public final int EZpvd;
    public final java.lang.String copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 1;
    public static final int AEQbTJ = 2;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd == AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    public C43045rhq(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = i;
        this.copydefault = str;
    }

    public static /* synthetic */ java.lang.String getResourcePath$default(C43045rhq c43045rhq, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c43045rhq.AEQbTJ(str, z);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.copydefault + "/" + str;
        if (!z || this.EZpvd != KWHzl) {
            return str2;
        }
        return "file://android_asset/" + str2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yFE.readText$default(java.io.File, java.nio.charset.Charset, int, java.lang.Object):java.lang.String */
    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String resourcePath$default = getResourcePath$default(this, str, false, 2, null);
        if (this.EZpvd == KWHzl) {
            return C7864arq.EZpvd(C32979mnm.EZpvd.OLrzqt(), resourcePath$default);
        }
        try {
            return yFI.readText$default(new java.io.File(resourcePath$default), null, 1, null);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public final java.io.InputStream copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.io.InputStream fileInputStream = null;
        java.lang.String resourcePath$default = getResourcePath$default(this, str, false, 2, null);
        try {
            if (this.EZpvd == KWHzl) {
                fileInputStream = C7864arq.OLrzqt(C32979mnm.EZpvd.OLrzqt(), resourcePath$default);
            } else {
                fileInputStream = new java.io.FileInputStream(resourcePath$default);
            }
        } catch (java.io.IOException unused) {
        }
        return fileInputStream;
    }

    /* JADX INFO: renamed from: o.rhq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rhq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final int copydefault() {
            return C43045rhq.KWHzl;
        }

        public final int EZpvd() {
            return C43045rhq.AEQbTJ;
        }
    }
}
