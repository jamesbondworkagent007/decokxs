package o;

import com.okinc.im.usecase.banner.GetSystemAnnouncementBannerUseCase$execute$2;
import com.okinc.okimcore.model.other.AnnouncementBanner;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35745oCc {
    public final sGF AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C35745oCc(@NotNull sGF sgf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = sgf;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super AnnouncementBanner> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new GetSystemAnnouncementBannerUseCase$execute$2(this, null), continuation);
    }
}
