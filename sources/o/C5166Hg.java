package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5166Hg {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public static final C5166Hg OLrzqt = new C5166Hg("", "", InterfaceC5164He.copydefault.OLrzqt());
    public final InterfaceC5164He AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String copydefault;
    public final boolean gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.gEmmrt;
    }

    public C5166Hg(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC5164He interfaceC5164He) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC5164He, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = interfaceC5164He;
        boolean z = str.length() == 0 && str2.length() == 0;
        this.valueOf = z;
        this.gEmmrt = !z;
    }

    /* JADX INFO: renamed from: o.Hg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Hg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C5166Hg copydefault() {
            return C5166Hg.OLrzqt;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5166Hg)) {
            return false;
        }
        C5166Hg c5166Hg = (C5166Hg) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c5166Hg.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c5166Hg.EZpvd);
    }

    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
    }

    public final C5166Hg KWHzl(@NotNull InterfaceC5164He interfaceC5164He) {
        Intrinsics.checkNotNullParameter(interfaceC5164He, "");
        return interfaceC5164He.AEQbTJ(this.copydefault);
    }

    public java.lang.String toString() {
        java.lang.String str = "Encodable(decoded=" + this.copydefault + ", encoded=" + this.EZpvd + ", encoding=" + this.AEQbTJ.OLrzqt() + ")";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
