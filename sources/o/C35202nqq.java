package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35202nqq implements InterfaceC35203nqr {
    public static final C35210nqy AEQbTJ;
    public static final int KWHzl;
    public static final C35202nqq OLrzqt = new C35202nqq();

    private C35202nqq() {
    }

    static {
        C35210nqy c35210nqy = new C35210nqy();
        c35210nqy.AhwBna();
        AEQbTJ = c35210nqy;
        KWHzl = 8;
    }

    @Override // o.InterfaceC35203nqr
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ.valueOf(str);
    }

    @Override // o.InterfaceC35203nqr
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull InterfaceC35209nqx interfaceC35209nqx) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC35209nqx, "");
        AEQbTJ.copydefault(str, interfaceC35209nqx);
    }

    public boolean copydefault() {
        return AEQbTJ.djBIcL();
    }

    public void KWHzl(boolean z) {
        AEQbTJ.OLrzqt(z);
    }

    public java.util.Map<java.lang.String, java.lang.Boolean> OLrzqt() {
        return AEQbTJ.gEmmrt();
    }

    public void AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ.OLrzqt(str, z);
    }

    public java.util.Set<java.lang.String> EZpvd() {
        return AEQbTJ.EZpvd();
    }

    public void AEQbTJ() {
        AEQbTJ.DbNXlk();
    }
}
