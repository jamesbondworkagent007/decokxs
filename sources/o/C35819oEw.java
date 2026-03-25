package o;

import com.okinc.im.bean.SearchResultData;
import com.okinc.im.usecase.message.SearchContactAndMessageUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C35819oEw {
    public final sKO EZpvd;

    @yCM
    public C35819oEw(@NotNull sKO sko) {
        Intrinsics.checkNotNullParameter(sko, "");
        this.EZpvd = sko;
    }

    public static /* synthetic */ java.lang.Object execute$default(C35819oEw c35819oEw, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c35819oEw.EZpvd(str, z, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super java.util.List<? extends SearchResultData>> continuation) {
        return CoroutineScopeKt.coroutineScope(new SearchContactAndMessageUseCase$execute$2(this, str, z, null), continuation);
    }
}
