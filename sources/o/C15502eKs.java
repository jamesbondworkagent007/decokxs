package o;

import com.okinc.business.defi.biz.net.bean.TxTypes;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15502eKs implements InterfaceC15501eKr {
    public final C13934dbu KWHzl;

    public C15502eKs(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.KWHzl = c13934dbu;
    }

    @Override // o.InterfaceC15501eKr
    public java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<TxTypes, OKServerException>> continuation) {
        return this.KWHzl.fARcdN(continuation);
    }
}
