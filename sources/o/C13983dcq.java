package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dcq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13983dcq {
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final InterfaceC13987dcu copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C13983dcq copy$default(C13983dcq c13983dcq, InterfaceC13987dcu interfaceC13987dcu, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC13987dcu = c13983dcq.copydefault;
        }
        if ((i & 2) != 0) {
            str = c13983dcq.OLrzqt;
        }
        return c13983dcq.AEQbTJ(interfaceC13987dcu, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13983dcq AEQbTJ(@NotNull InterfaceC13987dcu interfaceC13987dcu, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC13987dcu, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C13983dcq(interfaceC13987dcu, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC13987dcu copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13983dcq)) {
            return false;
        }
        C13983dcq c13983dcq = (C13983dcq) obj;
        return Intrinsics.EZpvd(this.copydefault, c13983dcq.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c13983dcq.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Caip10AccountId(chainId=" + this.copydefault + ", accountAddress=" + this.OLrzqt + ")";
    }

    public C13983dcq(@NotNull InterfaceC13987dcu interfaceC13987dcu, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC13987dcu, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = interfaceC13987dcu;
        this.OLrzqt = str;
        this.EZpvd = Companion.OLrzqt(interfaceC13987dcu.AEQbTJ(), str);
    }

    /* JADX INFO: renamed from: o.dcq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dcq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return str + ":" + str2;
        }

        public final java.lang.String KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() != 3) {
                return null;
            }
            java.lang.String str2 = (java.lang.String) listSplit$default.get(0);
            java.lang.String str3 = (java.lang.String) listSplit$default.get(1);
            return str2 + ":" + str3;
        }

        public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() != 3) {
                return null;
            }
            return (java.lang.String) listSplit$default.get(2);
        }
    }
}
