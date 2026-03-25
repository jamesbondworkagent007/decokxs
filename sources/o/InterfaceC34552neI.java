package o;

import com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.neI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC34552neI {
    void setCallback(@NotNull InterfaceC34548neE interfaceC34548neE);

    void setData(@NotNull java.util.List<PriceRangeFilter> list, PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter);

    void setSelectionDismissCallback(@NotNull Function0<Unit> function0);
}
