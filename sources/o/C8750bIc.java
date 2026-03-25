package o;

import com.okinc.business.defi.api.model.tx.signdata.AptosMessageSignData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8750bIc extends AbstractC12442cmy {
    public final C8673bHE copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8750bIc(@NotNull C8673bHE c8673bHE) {
        super(c8673bHE);
        Intrinsics.checkNotNullParameter(c8673bHE, "");
        this.copydefault = c8673bHE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xYX.copydefault.EZpvd(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), ((AptosMessageSignData) this.copydefault.QVsKAR()).getData());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xYX.copydefault.copydefault(str, ((AptosMessageSignData) this.copydefault.QVsKAR()).getData());
    }
}
