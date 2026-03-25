package o;

import com.okinc.unify_trade.biz.FavouriteDexCoin;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC40391qUc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class qWD implements InterfaceC40391qUc<FavouriteDexCoin> {
    public static final int KWHzl = 8;
    public final MutableStateFlow<java.lang.Long> AEQbTJ = StateFlowKt.MutableStateFlow(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    public volatile SoftReference<java.util.Map<java.lang.String, FavouriteDexCoin>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40391qUc
    public SoftReference<java.util.Map<java.lang.String, FavouriteDexCoin>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.lang.Long> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40391qUc
    public void OLrzqt(SoftReference<java.util.Map<java.lang.String, FavouriteDexCoin>> softReference) {
        this.copydefault = softReference;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public FavouriteDexCoin OLrzqt(@NotNull java.lang.String str) {
        return (FavouriteDexCoin) InterfaceC40391qUc.ActionBar.copydefault(this, str);
    }

    @yCM
    public qWD() {
    }

    public final FavouriteDexCoin copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (FavouriteDexCoin) OLrzqt(str);
    }

    public void EZpvd(@NotNull java.util.Map<java.lang.String, FavouriteDexCoin> map) {
        Intrinsics.checkNotNullParameter(map, "");
        InterfaceC40391qUc.ActionBar.OLrzqt(this, map);
        this.AEQbTJ.setValue(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void EZpvd(@NotNull FavouriteDexCoin favouriteDexCoin) {
        Intrinsics.checkNotNullParameter(favouriteDexCoin, "");
        synchronized (this) {
            java.lang.String str = favouriteDexCoin.getChainId() + favouriteDexCoin.getTokenContractAddress();
            SoftReference<java.util.Map<java.lang.String, FavouriteDexCoin>> softReferenceEZpvd = EZpvd();
            java.util.Map<java.lang.String, FavouriteDexCoin> map = softReferenceEZpvd != null ? softReferenceEZpvd.get() : null;
            if (map == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                concurrentHashMap.put(str, favouriteDexCoin);
                OLrzqt(new SoftReference<>(concurrentHashMap));
            } else {
                map.put(str, favouriteDexCoin);
            }
            this.AEQbTJ.setValue(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            pUU.EZpvd("DexCoinsCache", "putSingleDexCoin: added " + str + " to cache");
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void copydefault() {
        SoftReference<java.util.Map<java.lang.String, FavouriteDexCoin>> softReferenceEZpvd = EZpvd();
        if (softReferenceEZpvd != null) {
            softReferenceEZpvd.clear();
        }
        OLrzqt((SoftReference<java.util.Map<java.lang.String, FavouriteDexCoin>>) null);
    }
}
