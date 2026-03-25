package o;

import com.okinc.business.defi.api.model.tx.signdata.SuiMessageSignData;
import com.okinc.wallet.core.sign.sui.SuiTransaction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11830cbV extends AbstractC12442cmy {
    public final C11813cbE AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11830cbV(@NotNull C11813cbE c11813cbE) {
        super(c11813cbE);
        Intrinsics.checkNotNullParameter(c11813cbE, "");
        this.AEQbTJ = c11813cbE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54898xZk.AEQbTJ.KWHzl(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), new SuiTransaction(((SuiMessageSignData) this.AEQbTJ.QVsKAR()).getData()));
    }
}
