package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mfh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32550mfh {
    public static final C32550mfh OLrzqt = new C32550mfh();
    public static final java.util.Map<java.lang.String, kotlinx.coroutines.channels.Channel<java.lang.Boolean>> EZpvd = new LinkedHashMap();
    public static final int AEQbTJ = 8;

    private C32550mfh() {
    }

    public final kotlinx.coroutines.channels.Channel<java.lang.Boolean> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        kotlinx.coroutines.channels.Channel<java.lang.Boolean> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        EZpvd.put(str, channelChannel$default);
        return channelChannel$default;
    }

    public final kotlinx.coroutines.channels.Channel<java.lang.Boolean> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd.get(str);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd.remove(str);
    }
}
