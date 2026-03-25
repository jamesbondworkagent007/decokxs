package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.usecase.broadcastmessage.BroadcastMessagesUseCase$execute$1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35762oCt {
    public final C35768oCz AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final AtomicInteger KWHzl;
    public final C35760oCr copydefault;

    @yCM
    public C35762oCt(@NotNull C35768oCz c35768oCz, @NotNull C35760oCr c35760oCr, @NotNull CoroutineDispatcher coroutineDispatcher, @yCL(AEQbTJ = "IMBroadcastMessageIdGenerator") @NotNull AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(c35768oCz, "");
        Intrinsics.checkNotNullParameter(c35760oCr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(atomicInteger, "");
        this.AEQbTJ = c35768oCz;
        this.copydefault = c35760oCr;
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = atomicInteger;
    }

    public final Flow<java.util.List<AbstractC35761oCs>> KWHzl(long j, @NotNull java.util.List<? extends SendMessageRequestParam> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return FlowKt.flowOn(FlowKt.channelFlow(new BroadcastMessagesUseCase$execute$1(list, this, j, null)), this.EZpvd);
    }
}
