package o;

import com.okinc.market.search.features.navigation.category.data.NavCategoryChoosePo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qJg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40098qJg {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qJi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40098qJg.OLrzqt();
        }
    });

    @yCM
    public C40098qJg() {
    }

    public final InterfaceC40096qJe EZpvd() {
        return (InterfaceC40096qJe) this.EZpvd.getValue();
    }

    public static final InterfaceC40096qJe OLrzqt() {
        return (InterfaceC40096qJe) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC40096qJe.class));
    }

    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<NavCategoryChoosePo>> continuation) {
        return EZpvd().KWHzl(str, continuation);
    }
}
