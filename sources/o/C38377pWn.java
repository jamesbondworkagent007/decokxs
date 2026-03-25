package o;

import com.okinc.market.alert.data.MarketUserAlert;
import com.okinc.market.alert.datasource.UserAlertLocalDataSource$checkUserAlert$2;
import com.okinc.market.alert.datasource.UserAlertLocalDataSource$checkUserDexAlert$2;
import com.okinc.market.alert.datasource.UserAlertLocalDataSource$deleteUserAlert$2;
import com.okinc.market.alert.datasource.UserAlertLocalDataSource$insertUserAlert$2;
import com.okinc.market.alert.datasource.UserAlertLocalDataSource$removeUserAlertItem$2;
import com.okinc.market.alert.datasource.UserAlertLocalDataSource$replaceAlerts$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pWn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38377pWn implements InterfaceC38379pWp {
    public final InterfaceC38367pWd copydefault;

    public C38377pWn(@NotNull InterfaceC38367pWd interfaceC38367pWd) {
        Intrinsics.checkNotNullParameter(interfaceC38367pWd, "");
        this.copydefault = interfaceC38367pWd;
    }

    @Override // o.InterfaceC38379pWp
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new UserAlertLocalDataSource$checkUserAlert$2(this, str, str2, str3, null), continuation);
    }

    @Override // o.InterfaceC38379pWp
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new UserAlertLocalDataSource$checkUserDexAlert$2(this, str, str2, str3, null), continuation);
    }

    @Override // o.InterfaceC38379pWp
    public java.lang.Object copydefault(@NotNull java.util.List<MarketUserAlert> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new UserAlertLocalDataSource$deleteUserAlert$2(this, list, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC38379pWp
    public java.lang.Object AEQbTJ(@NotNull MarketUserAlert marketUserAlert, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new UserAlertLocalDataSource$removeUserAlertItem$2(this, marketUserAlert, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC38379pWp
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<MarketUserAlert> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new UserAlertLocalDataSource$replaceAlerts$2(this, str, list, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.InterfaceC38379pWp
    public java.lang.Object KWHzl(@NotNull MarketUserAlert marketUserAlert, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new UserAlertLocalDataSource$insertUserAlert$2(this, marketUserAlert, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
