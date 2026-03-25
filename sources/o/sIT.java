package o;

import com.okinc.okimcore.feature.download.InHouseFileDownloadManger$downloadFile$2;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sIT {
    public static final sIT AEQbTJ = new sIT();

    private sIT() {
    }

    public final java.lang.Object copydefault(@NotNull OKMessage oKMessage, @NotNull android.content.Context context, @NotNull Continuation<? super Flow<? extends sIS>> continuation) {
        return FlowKt.flowOn(FlowKt.flow(new InHouseFileDownloadManger$downloadFile$2(oKMessage, context, null)), sDN.copydefault.copydefault());
    }
}
