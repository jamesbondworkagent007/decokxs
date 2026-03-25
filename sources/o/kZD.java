package o;

import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kZD implements InterfaceC28389kZp {
    public final kZG AEQbTJ;
    public final kZF EZpvd;
    public final kZC OLrzqt;

    public kZD(@NotNull kZF kzf, @NotNull kZC kzc, @NotNull kZG kzg) {
        Intrinsics.checkNotNullParameter(kzf, "");
        Intrinsics.checkNotNullParameter(kzc, "");
        Intrinsics.checkNotNullParameter(kzg, "");
        this.EZpvd = kzf;
        this.OLrzqt = kzc;
        this.AEQbTJ = kzg;
    }

    @Override // o.InterfaceC28389kZp
    public java.lang.Object AEQbTJ(@NotNull C28378kZe c28378kZe, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        InterfaceC28389kZp interfaceC28389kZp;
        java.lang.String strEZpvd = c28378kZe.EZpvd();
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "chain_id_all_network")) {
            interfaceC28389kZp = this.EZpvd;
        } else {
            interfaceC28389kZp = Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "chain_id_collection") ? this.OLrzqt : this.AEQbTJ;
        }
        return interfaceC28389kZp.AEQbTJ(c28378kZe, continuation);
    }
}
