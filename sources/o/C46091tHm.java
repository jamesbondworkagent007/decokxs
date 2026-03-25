package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46091tHm implements InterfaceC47828txV {
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46091tHm copy$default(C46091tHm c46091tHm, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c46091tHm.EZpvd;
        }
        return c46091tHm.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46091tHm EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C46091tHm(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46091tHm) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((C46091tHm) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultOverviewTitleVo(title=" + this.EZpvd + ")";
    }

    public C46091tHm(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    @Override // o.InterfaceC47828txV
    public boolean copydefault(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        return (interfaceC47828txV instanceof C46091tHm) && Intrinsics.EZpvd(this, interfaceC47828txV);
    }

    @Override // o.InterfaceC47828txV
    public boolean KWHzl(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        return (interfaceC47828txV instanceof C46091tHm) && Intrinsics.EZpvd(this, interfaceC47828txV);
    }
}
