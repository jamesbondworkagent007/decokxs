package o;

import com.okinc.okex.lite.hero.util.download.InHouseFileDownloadManger$downloadFile$2;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45714svK {
    public static final C45714svK OLrzqt = new C45714svK();

    private C45714svK() {
    }

    public final java.lang.Object KWHzl(@NotNull C45709svE c45709svE, @NotNull android.content.Context context, @NotNull Continuation<? super Flow<? extends svM>> continuation) {
        return FlowKt.flowOn(FlowKt.flow(new InHouseFileDownloadManger$downloadFile$2(c45709svE, context, null)), Dispatchers.getIO());
    }
}
