package o;

import com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsBottomSheet;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.wqs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53725wqs {
    public static void EZpvd(PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet, CoroutineDispatcher coroutineDispatcher) {
        planetOngoingBotsBottomSheet.defaultDispatcher = coroutineDispatcher;
    }

    public static void copydefault(PlanetOngoingBotsBottomSheet planetOngoingBotsBottomSheet, C53664wpk c53664wpk) {
        planetOngoingBotsBottomSheet.getOngoingBotsUseCase = c53664wpk;
    }
}
