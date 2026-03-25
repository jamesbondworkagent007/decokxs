package o;

import com.okinc.business.market.features.search.repository.SearchRepositoryImpl$reportValidSearch$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ktk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29444ktk implements InterfaceC29443ktj {
    public final InterfaceC23229huL EZpvd;

    @yCM
    public C29444ktk(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        this.EZpvd = interfaceC23229huL;
    }

    @Override // o.InterfaceC29443ktj
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("chainId", str);
        map.put("tokenContractAddress", str2);
        java.lang.Object objEZpvd = kAB.EZpvd(new SearchRepositoryImpl$reportValidSearch$2(this, map, null), continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }
}
