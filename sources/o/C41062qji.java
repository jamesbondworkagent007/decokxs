package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.trending_categories.data.po.TrendingCategoriesPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41062qji {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qjh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C41062qji.KWHzl();
        }
    });

    @yCM
    public C41062qji() {
    }

    public final InterfaceC41060qjg EZpvd() {
        return (InterfaceC41060qjg) this.EZpvd.getValue();
    }

    public static final InterfaceC41060qjg KWHzl() {
        return (InterfaceC41060qjg) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC41060qjg.class));
    }

    public java.lang.Object EZpvd(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super ResponseData<java.util.List<TrendingCategoriesPo>>> continuation) {
        return EZpvd().EZpvd(num, str, str2, str3, continuation);
    }
}
