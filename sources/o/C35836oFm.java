package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35836oFm {
    @yCM
    public C35836oFm() {
    }

    public final OKHQVoiceMessage OLrzqt(@NotNull SendMessageRequestParam.Voice voice) {
        Intrinsics.checkNotNullParameter(voice, "");
        return OKHQVoiceMessage.CREATOR.obtain(voice.AEQbTJ(), voice.OLrzqt());
    }
}
