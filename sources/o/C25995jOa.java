package o;

import com.okinc.business.market.data.model.history.NativeTokenPriceData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jOa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25995jOa {
    public static final jNY copydefault(@NotNull NativeTokenPriceData nativeTokenPriceData) {
        Intrinsics.checkNotNullParameter(nativeTokenPriceData, "");
        float fDjBIcL = C33129mqd.djBIcL(nativeTokenPriceData.getPrice());
        java.lang.String tokenSymbol = nativeTokenPriceData.getTokenSymbol();
        return new jNY(fDjBIcL, tokenSymbol != null ? tokenSymbol : "");
    }
}
