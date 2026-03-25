package o;

import com.okinc.tradingbot.impl.planet.dto.BotDirection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.wpu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53674wpu extends C50967veD<BotDirection> {
    public static final C53674wpu KWHzl = new C53674wpu();

    private C53674wpu() {
        super(BotDirection.Companion.serializer(), new Function0() { // from class: o.wpy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53674wpu.EZpvd();
            }
        });
    }

    public static final BotDirection EZpvd() {
        return BotDirection.Neutral;
    }
}
