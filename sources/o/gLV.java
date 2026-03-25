package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gLV implements gLW {
    public final gLS AEQbTJ;

    @yCM
    public gLV(@NotNull gLS gls) {
        Intrinsics.checkNotNullParameter(gls, "");
        this.AEQbTJ = gls;
    }

    @Override // o.gLW
    public void copydefault(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = this.AEQbTJ.AEQbTJ();
        java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        ((dTQ) C43251rlk.copydefault(dTQ.class)).copydefault(context, strDbNXlk, java.lang.Boolean.valueOf(z), "");
    }
}
