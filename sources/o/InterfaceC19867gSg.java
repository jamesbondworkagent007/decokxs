package o;

import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC19867gSg {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super TokenFilter> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull BuySettings buySettings, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super SellSettings> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super BuySettings> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull SellSettings sellSettings, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull TokenFilter tokenFilter, @NotNull Continuation<? super Unit> continuation);
}
