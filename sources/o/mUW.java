package o;

import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mUW implements InterfaceC57902yrF {
    public Function0<Unit> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        this.EZpvd = null;
    }

    @Override // o.InterfaceC57902yrF
    public void AEQbTJ(InterfaceC57927yre interfaceC57927yre, boolean z, float f, int i, int i2, int i3) {
    }

    @Override // o.InterfaceC57902yrF
    public void AEQbTJ(InterfaceC57933yrk interfaceC57933yrk, boolean z) {
    }

    @Override // o.InterfaceC57902yrF
    public void EZpvd(InterfaceC57927yre interfaceC57927yre, int i, int i2) {
    }

    @Override // o.InterfaceC57902yrF
    public void EZpvd(InterfaceC57933yrk interfaceC57933yrk, int i, int i2) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57900yrD
    public void EZpvd(@NotNull InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    @Override // o.InterfaceC57902yrF
    public void KWHzl(InterfaceC57933yrk interfaceC57933yrk, int i, int i2) {
    }

    @Override // o.InterfaceC57902yrF
    public void KWHzl(InterfaceC57933yrk interfaceC57933yrk, boolean z, float f, int i, int i2, int i3) {
    }

    @Override // o.InterfaceC57902yrF
    public void OLrzqt(InterfaceC57927yre interfaceC57927yre, int i, int i2) {
    }

    @Override // o.InterfaceC57902yrF
    public void copydefault(InterfaceC57927yre interfaceC57927yre, boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57903yrG
    public void copydefault(@NotNull InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
    }

    @Override // o.InterfaceC57908yrL
    public void OLrzqt(@NotNull InterfaceC57934yrl interfaceC57934yrl, @NotNull RefreshState refreshState, @NotNull RefreshState refreshState2) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        Intrinsics.checkNotNullParameter(refreshState, "");
        Intrinsics.checkNotNullParameter(refreshState2, "");
        if (refreshState == RefreshState.RefreshFinish && refreshState2 == RefreshState.None && (function0 = this.EZpvd) != null) {
            function0.invoke();
        }
    }
}
