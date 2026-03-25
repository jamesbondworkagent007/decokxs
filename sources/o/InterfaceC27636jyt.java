package o;

import com.okinc.business.market.data.model.MarketConfigData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC27636jyt {
    boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<java.lang.String>> continuation);

    java.lang.Object copydefault(boolean z, @NotNull Continuation<? super MarketConfigData> continuation);

    void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z);
}
