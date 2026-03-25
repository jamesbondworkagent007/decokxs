package o;

import com.okinc.business.invest_biz.data.bean.response.NetworkTotal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDR {
    @yCM
    public iDR() {
    }

    public final C23665iEu copydefault(@NotNull NetworkTotal networkTotal) {
        Intrinsics.checkNotNullParameter(networkTotal, "");
        return new C23665iEu(networkTotal.EZpvd(), networkTotal.AEQbTJ(), networkTotal.OLrzqt(), networkTotal.copydefault());
    }
}
