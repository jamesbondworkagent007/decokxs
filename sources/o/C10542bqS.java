package o;

import com.okinc.business.defi.biz.net.bean.WalletTotalAssetModel;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10542bqS {
    public final C10538bqO AEQbTJ;
    public final C10540bqQ OLrzqt;

    public C10542bqS(@NotNull C10540bqQ c10540bqQ, @NotNull C10538bqO c10538bqO) {
        Intrinsics.checkNotNullParameter(c10540bqQ, "");
        Intrinsics.checkNotNullParameter(c10538bqO, "");
        this.OLrzqt = c10540bqQ;
        this.AEQbTJ = c10538bqO;
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<? extends AbstractC12782ctV> list, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super ResponseData<java.util.List<WalletTotalAssetModel>>> continuation) {
        return this.OLrzqt.KWHzl(list, coroutineDispatcher, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.util.List<WalletTotalAssetModel> list, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        C10538bqO c10538bqO = this.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C10543bqT.copydefault((WalletTotalAssetModel) it.next()));
        }
        return c10538bqO.copydefault(arrayList, coroutineDispatcher, continuation);
    }
}
