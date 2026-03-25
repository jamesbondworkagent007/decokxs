package o;

import com.okinc.tradecore.main.mvp.home.EventTrade;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49498upg {
    java.lang.Object AEQbTJ(@NotNull EventTrade eventTrade, @NotNull java.lang.Object... objArr);

    void onEvent(@NotNull EventTrade eventTrade);

    /* JADX INFO: renamed from: o.upg$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object onEventWithCallback$default(InterfaceC49498upg interfaceC49498upg, EventTrade eventTrade, java.lang.Object[] objArr, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEventWithCallback");
            }
            if ((i & 2) != 0) {
                objArr = new java.lang.String[]{""};
            }
            return interfaceC49498upg.AEQbTJ(eventTrade, objArr);
        }
    }
}
