package o;

import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.nostr.NostrEncryptEvent;
import com.okinc.wallet.core.sign.nostr.NostrMessageEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54894xZg {
    public static final C54894xZg OLrzqt = new C54894xZg();

    private C54894xZg() {
    }

    public final java.lang.String copydefault(@NotNull SignParams signParams, @NotNull NostrMessageEvent nostrMessageEvent) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(nostrMessageEvent, "");
        return xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("signEvent", signParams, nostrMessageEvent));
    }

    public final java.lang.String KWHzl(@NotNull SignParams signParams, @NotNull NostrEncryptEvent nostrEncryptEvent) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(nostrEncryptEvent, "");
        return xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("encryptEvent", signParams, nostrEncryptEvent));
    }

    public final java.lang.String EZpvd(@NotNull SignParams signParams, @NotNull NostrEncryptEvent nostrEncryptEvent) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(nostrEncryptEvent, "");
        return xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("decryptEvent", signParams, nostrEncryptEvent));
    }
}
