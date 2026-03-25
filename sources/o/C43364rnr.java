package o;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43351rne;
import okhttp3.Dispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43364rnr implements InterfaceC43351rne {
    public final AbstractC58253yxm AEQbTJ;
    public final ThreadPoolExecutor KWHzl;
    public final Dispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public ThreadPoolExecutor AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public java.lang.String EZpvd() {
        return "OKNet-Ws";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public Dispatcher KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public AbstractC58253yxm OLrzqt() {
        return this.AEQbTJ;
    }

    public C43364rnr() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 300L, java.util.concurrent.TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC43352rnf(EZpvd()));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        OLrzqt(threadPoolExecutor);
        this.KWHzl = threadPoolExecutor;
        Dispatcher dispatcher = new Dispatcher(AEQbTJ());
        dispatcher.setMaxRequests(64);
        dispatcher.setMaxRequestsPerHost(20);
        this.OLrzqt = dispatcher;
        AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl(AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
        this.AEQbTJ = abstractC58253yxmKWHzl;
    }

    public void OLrzqt(@NotNull ThreadPoolExecutor threadPoolExecutor) {
        InterfaceC43351rne.ActionBar.EZpvd(this, threadPoolExecutor);
    }
}
