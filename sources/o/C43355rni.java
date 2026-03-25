package o;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43351rne;
import okhttp3.Dispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43355rni implements InterfaceC43351rne {
    public final AbstractC58253yxm AEQbTJ;
    public final ThreadPoolExecutor EZpvd;
    public final Dispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public ThreadPoolExecutor AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public java.lang.String EZpvd() {
        return "OKNet-DOH";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public Dispatcher KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public AbstractC58253yxm OLrzqt() {
        return this.AEQbTJ;
    }

    public C43355rni() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(12, 48, 120L, java.util.concurrent.TimeUnit.SECONDS, new LinkedBlockingQueue(8), new ThreadFactoryC43352rnf(EZpvd()), new ThreadPoolExecutor.DiscardOldestPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        AEQbTJ(threadPoolExecutor);
        this.EZpvd = threadPoolExecutor;
        Dispatcher dispatcher = new Dispatcher(AEQbTJ());
        dispatcher.setMaxRequests(64);
        dispatcher.setMaxRequestsPerHost(20);
        this.KWHzl = dispatcher;
        AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl(AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
        this.AEQbTJ = abstractC58253yxmKWHzl;
    }

    public void AEQbTJ(@NotNull ThreadPoolExecutor threadPoolExecutor) {
        InterfaceC43351rne.ActionBar.EZpvd(this, threadPoolExecutor);
    }
}
