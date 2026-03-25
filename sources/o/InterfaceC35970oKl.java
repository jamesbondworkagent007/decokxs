package o;

import com.okinc.kline.ui.view.model.MarketTypeSelect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oKl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35970oKl {
    android.view.View OLrzqt();

    void setIsProfit(boolean z);

    void setIsShowEnvelopeIndicator(boolean z);

    void setIsShowSRIndicator(boolean z);

    void setIsShowSTIndicator(boolean z);

    void setIsShowVWAPIndicator(boolean z);

    void setMainIndicatorSelect();

    void setOnItemSelectListener(@NotNull Function1<? super MarketTypeSelect, Unit> function1);

    void setSideIndicator(@NotNull java.lang.String str);

    void setSideIndicators(@NotNull java.util.List<java.lang.String> list);
}
