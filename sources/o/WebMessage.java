package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.UrlInterceptRegistry;
import o.WebChromeClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class WebMessage implements InterfaceC4949Bx {
    public final UrlInterceptRegistry.TaskDescription AEQbTJ;

    public WebMessage(@NotNull UrlInterceptRegistry.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.AEQbTJ = taskDescription;
    }

    @Override // o.InterfaceC4949Bx
    public java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        WebChromeClient.ActionBar actionBar = WebChromeClient.copydefault;
        WebChromeClient.Application application = new WebChromeClient.Application();
        application.AEQbTJ((java.lang.String) C58108yv.OLrzqt(bp.OLrzqt(), C57578yl.EZpvd.copydefault()));
        return this.AEQbTJ.EZpvd().OLrzqt(application.KWHzl(), continuation);
    }
}
