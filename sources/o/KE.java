package o;

import com.amplitude.core.platform.Plugin;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class KE implements com.amplitude.core.platform.Plugin {
    public final Plugin.Type AEQbTJ = Plugin.Type.Before;
    public JZ KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public void AEQbTJ(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        this.KWHzl = jz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplitude.core.platform.Plugin
    public Plugin.Type EZpvd() {
        return this.AEQbTJ;
    }

    public JZ copydefault() {
        JZ jz = this.KWHzl;
        if (jz != null) {
            return jz;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // com.amplitude.core.platform.Plugin
    public void KWHzl(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        super.KWHzl(jz);
        EZpvd(jz.djBIcL());
    }

    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault().OLrzqt(str);
    }

    public final void EZpvd(C5244Kg c5244Kg) {
        java.lang.String strOLrzqt = c5244Kg.OLrzqt();
        if (strOLrzqt != null) {
            AEQbTJ(strOLrzqt);
        }
    }

    private final void OLrzqt(C5242Ke c5242Ke) {
        C5246Ki c5246KiValues;
        C5253Kp c5253KpUzCIH;
        java.lang.String newProxyInstance;
        if (c5242Ke.RJOkX() == null) {
            c5242Ke.copydefault(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            Unit unit = Unit.INSTANCE;
        }
        if (c5242Ke.AubY() == null) {
            c5242Ke.fIwbmz(UUID.randomUUID().toString());
            Unit unit2 = Unit.INSTANCE;
        }
        if (c5242Ke.wlaJM() == null) {
            c5242Ke.AuCTel("amplitude-kotlin/0.0.1");
            Unit unit3 = Unit.INSTANCE;
        }
        if (c5242Ke.RcXXUw() == null) {
            c5242Ke.wlaJM(copydefault().ejfBZ().copydefault());
            Unit unit4 = Unit.INSTANCE;
        }
        if (c5242Ke.ejfBZ() == null) {
            c5242Ke.values(copydefault().ejfBZ().KWHzl());
            Unit unit5 = Unit.INSTANCE;
        }
        if (c5242Ke.AxsJAY() == null && (newProxyInstance = copydefault().djBIcL().getNewProxyInstance()) != null) {
            c5242Ke.getFieldNames(newProxyInstance);
            Unit unit6 = Unit.INSTANCE;
        }
        if (c5242Ke.AuCTelauCTel() == null) {
            c5242Ke.ejfBZ("$remote");
            Unit unit7 = Unit.INSTANCE;
        }
        if (c5242Ke.ORxRYg() == null && (c5253KpUzCIH = copydefault().djBIcL().uzCIH()) != null) {
            c5242Ke.copydefault(c5253KpUzCIH.AEQbTJ());
            Unit unit8 = Unit.INSTANCE;
        }
        if (c5242Ke.zsXlph() != null || (c5246KiValues = copydefault().djBIcL().values()) == null) {
            return;
        }
        c5242Ke.copydefault(c5246KiValues.copydefault());
        Unit unit9 = Unit.INSTANCE;
    }

    @Override // com.amplitude.core.platform.Plugin
    public C5242Ke EZpvd(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        OLrzqt(c5242Ke);
        return c5242Ke;
    }
}
