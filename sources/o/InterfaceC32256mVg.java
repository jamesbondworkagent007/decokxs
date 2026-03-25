package o;

import com.okinc.dexkline.market.data.model.MarketConfigData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mVg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC32256mVg {
    java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super MarketConfigData> continuation);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<java.lang.String>> continuation);
}
