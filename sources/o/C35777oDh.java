package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C35777oDh {
    public final android.content.Context KWHzl;

    @yCM
    public C35777oDh(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
    }

    public final java.lang.Object OLrzqt(@NotNull OKMessage oKMessage, @NotNull Continuation<? super Flow<? extends sIS>> continuation) {
        return sIT.AEQbTJ.copydefault(oKMessage, this.KWHzl, continuation);
    }
}
