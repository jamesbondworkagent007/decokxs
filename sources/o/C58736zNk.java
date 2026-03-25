package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58736zNk {
    public static final int $stable = 8;
    public java.util.List<? extends AbstractC58950zVm> AEQbTJ;
    public AbstractC58950zVm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zNk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C58736zNk copy$default(C58736zNk c58736zNk, AbstractC58950zVm abstractC58950zVm, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC58950zVm = c58736zNk.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c58736zNk.AEQbTJ;
        }
        return c58736zNk.KWHzl(abstractC58950zVm, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58736zNk KWHzl(@NotNull AbstractC58950zVm abstractC58950zVm, @NotNull java.util.List<? extends AbstractC58950zVm> list) {
        Intrinsics.checkNotNullParameter(abstractC58950zVm, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C58736zNk(abstractC58950zVm, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC58950zVm OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.zVm>, java.util.List<o.zVm> */
    public final java.util.List<AbstractC58950zVm> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58736zNk)) {
            return false;
        }
        C58736zNk c58736zNk = (C58736zNk) obj;
        return Intrinsics.EZpvd(this.KWHzl, c58736zNk.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c58736zNk.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NewDeviceSingleOtpInteractorInput(otpType=" + this.KWHzl + ", allOtpTypes=" + this.AEQbTJ + ")";
    }

    public C58736zNk(@NotNull AbstractC58950zVm abstractC58950zVm, @NotNull java.util.List<? extends AbstractC58950zVm> list) {
        Intrinsics.checkNotNullParameter(abstractC58950zVm, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = abstractC58950zVm;
        this.AEQbTJ = list;
    }
}
