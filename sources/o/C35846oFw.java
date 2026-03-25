package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.im.OKStickerMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35846oFw {
    @yCM
    public C35846oFw() {
    }

    public final OKStickerMessage OLrzqt(@NotNull SendMessageRequestParam.Sticker sticker) {
        Intrinsics.checkNotNullParameter(sticker, "");
        return OKStickerMessage.CREATOR.obtain(sticker.copydefault(), sticker.EZpvd());
    }
}
