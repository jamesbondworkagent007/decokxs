package o;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43351rne;
import okhttp3.Dispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43356rnj implements InterfaceC43351rne {
    public final ThreadPoolExecutor AEQbTJ;
    public final Dispatcher OLrzqt;
    public final AbstractC58253yxm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public ThreadPoolExecutor AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public java.lang.String EZpvd() {
        return "OKNet-Other";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public Dispatcher KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43351rne
    public AbstractC58253yxm OLrzqt() {
        return this.copydefault;
    }

    public C43356rnj() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC43352rnf(EZpvd()));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        OLrzqt(threadPoolExecutor);
        this.AEQbTJ = threadPoolExecutor;
        Dispatcher dispatcher = new Dispatcher(AEQbTJ());
        dispatcher.setMaxRequests(64);
        dispatcher.setMaxRequestsPerHost(25);
        this.OLrzqt = dispatcher;
        AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl(AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
        this.copydefault = abstractC58253yxmKWHzl;
    }

    public void OLrzqt(@NotNull ThreadPoolExecutor threadPoolExecutor) {
        InterfaceC43351rne.ActionBar.EZpvd(this, threadPoolExecutor);
    }
}
