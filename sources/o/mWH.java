package o;

import com.okinc.dexkline.market.data.model.history.NativeTokenPriceData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mWH {
    public static final mWC copydefault(@NotNull NativeTokenPriceData nativeTokenPriceData) {
        Intrinsics.checkNotNullParameter(nativeTokenPriceData, "");
        float fDjBIcL = C33129mqd.djBIcL(nativeTokenPriceData.getPrice());
        java.lang.String tokenSymbol = nativeTokenPriceData.getTokenSymbol();
        return new mWC(fDjBIcL, tokenSymbol != null ? tokenSymbol : "");
    }
}
