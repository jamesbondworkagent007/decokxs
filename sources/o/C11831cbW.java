package o;

import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.sui.SuiTransaction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11831cbW extends AbstractC12442cmy {
    public final C11846cbl KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11831cbW(@NotNull C11846cbl c11846cbl) {
        super(c11846cbl);
        Intrinsics.checkNotNullParameter(c11846cbl, "");
        this.KWHzl = c11846cbl;
    }

    public final SignedTx KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C54898xZk.AEQbTJ.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), new SuiTransaction(str2));
    }
}
