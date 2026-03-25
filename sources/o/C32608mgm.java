package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43264rlx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mgm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32608mgm implements InterfaceC43264rlx {
    @Override // o.InterfaceC43264rlx
    public void KWHzl(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43216rlB
    public void init(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.InterfaceC43216rlB
    public boolean isInitialized() {
        return true;
    }

    @Override // o.InterfaceC43264rlx
    public int AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.KWHzl(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.OLrzqt(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.KWHzl(this, str, str2, th);
    }

    @Override // o.InterfaceC43264rlx
    public java.lang.String EZpvd(java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.EZpvd(this, th);
    }

    @Override // o.InterfaceC43264rlx
    public int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.EZpvd(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.OLrzqt(this, str, str2, th);
    }

    @Override // o.InterfaceC43264rlx
    public int OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.copydefault(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.AEQbTJ(this, str, str2, th);
    }

    @Override // o.InterfaceC43264rlx
    public int copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.AEQbTJ(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (i) {
            case 2:
                pUU.OLrzqt(str, str2);
                break;
            case 3:
                pUU.EZpvd(str, str2);
                break;
            case 4:
                pUU.KWHzl(str, str2);
                break;
            case 5:
                pUU.valueOf(str, str2);
                break;
            case 6:
                pUU.copydefault(str, str2);
                break;
            case 7:
                pUU.AEQbTJ(str, str2);
                break;
        }
        return 1;
    }
}
