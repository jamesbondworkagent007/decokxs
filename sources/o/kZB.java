package o;

import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kZB implements InterfaceC28389kZp {
    public final C28392kZs EZpvd;
    public final C28396kZw OLrzqt;
    public final C28395kZv copydefault;

    public kZB(@NotNull C28392kZs c28392kZs, @NotNull C28396kZw c28396kZw, @NotNull C28395kZv c28395kZv) {
        Intrinsics.checkNotNullParameter(c28392kZs, "");
        Intrinsics.checkNotNullParameter(c28396kZw, "");
        Intrinsics.checkNotNullParameter(c28395kZv, "");
        this.EZpvd = c28392kZs;
        this.OLrzqt = c28396kZw;
        this.copydefault = c28395kZv;
    }

    @Override // o.InterfaceC28389kZp
    public java.lang.Object AEQbTJ(@NotNull C28378kZe c28378kZe, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        InterfaceC28389kZp interfaceC28389kZp;
        java.lang.String strEZpvd = c28378kZe.EZpvd();
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "chain_id_all_network")) {
            interfaceC28389kZp = this.EZpvd;
        } else {
            interfaceC28389kZp = Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "chain_id_collection") ? this.OLrzqt : this.copydefault;
        }
        return interfaceC28389kZp.AEQbTJ(c28378kZe, continuation);
    }
}
