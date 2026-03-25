package o;

import com.okinc.tradingbot.impl.planet.dto.BotCopyType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.wpx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53677wpx extends C50965veB<BotCopyType> {
    public static final C53677wpx copydefault = new C53677wpx();

    private C53677wpx() {
        super(BotCopyType.Companion.serializer(), new Function0() { // from class: o.wpv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53677wpx.EZpvd();
            }
        });
    }

    public static final BotCopyType EZpvd() {
        return BotCopyType.NotSpecified;
    }
}
