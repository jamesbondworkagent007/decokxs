package o;

import com.okinc.modular.deeplinkv2.LinkSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38107pMm extends AbstractC43215rlA implements InterfaceC43294rma {
    public final pMM AEQbTJ;
    public final pLE EZpvd;
    public final InterfaceC38118pMx OLrzqt;
    public final InterfaceC38101pMg copydefault;

    public C38107pMm(@NotNull pLE ple, @NotNull InterfaceC38101pMg interfaceC38101pMg, @NotNull InterfaceC38118pMx interfaceC38118pMx, @NotNull pMM pmm) {
        Intrinsics.checkNotNullParameter(ple, "");
        Intrinsics.checkNotNullParameter(interfaceC38101pMg, "");
        Intrinsics.checkNotNullParameter(interfaceC38118pMx, "");
        Intrinsics.checkNotNullParameter(pmm, "");
        this.EZpvd = ple;
        this.copydefault = interfaceC38101pMg;
        this.OLrzqt = interfaceC38118pMx;
        this.AEQbTJ = pmm;
    }

    @Override // o.InterfaceC43294rma
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull LinkSource linkSource, boolean z, @NotNull Function1<? super AbstractC43238rlX, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(linkSource, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.EZpvd(context);
        this.EZpvd.OLrzqt(str, map, linkSource, z, function1);
    }

    @Override // o.InterfaceC43294rma
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull Function1<? super AbstractC43238rlX, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.EZpvd(context);
        this.EZpvd.OLrzqt(str, map, LinkSource.IN_APP, true, function1);
    }

    @Override // o.InterfaceC43294rma
    public boolean AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.EZpvd(str);
    }

    @Override // o.InterfaceC43294rma
    public boolean values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.copydefault(str);
    }

    @Override // o.InterfaceC43294rma
    public java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43238rlX> continuation) {
        this.AEQbTJ.EZpvd(context);
        return this.EZpvd.AEQbTJ(str, continuation);
    }

    @Override // o.InterfaceC43294rma
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.EZpvd.KWHzl(str, continuation);
    }

    @Override // o.InterfaceC43294rma
    public java.util.Map<java.lang.String, java.lang.Object> fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.OLrzqt(str);
    }

    @Override // o.InterfaceC43294rma
    public java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return this.EZpvd.KWHzl(str, map, z);
    }

    @Override // o.InterfaceC43294rma
    public java.lang.String wlaJM() {
        return this.copydefault.copydefault();
    }
}
