package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class WebBackForwardList implements WebMessagePort {
    public final WebResourceResponse AEQbTJ;
    public final java.util.Map<java.lang.String, java.util.List<InterfaceC52616wS>> KWHzl;
    public final java.util.List<InterfaceC52616wS> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebBackForwardList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public WebBackForwardList(WebResourceResponse webResourceResponse) {
        this.AEQbTJ = webResourceResponse;
        this.KWHzl = C56424yEw.KWHzl();
        this.copydefault = C56402yEa.EZpvd(C3020Ae.sigV4$default(false, null, null, null, null, 31, null));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.WebResourceResponse:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.WebResourceResponse) : (r1v0 o.WebResourceResponse))
 A[MD:(o.WebResourceResponse):void (m)] (LINE:9) call: o.WebBackForwardList.<init>(o.WebResourceResponse):void type: THIS */
    public /* synthetic */ WebBackForwardList(WebResourceResponse webResourceResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : webResourceResponse);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC52724wW
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull WebChromeClient webChromeClient, @NotNull Continuation<? super java.util.List<? extends InterfaceC52616wS>> continuation) {
        java.util.List<InterfaceC52616wS> list = this.KWHzl.get(webChromeClient.copydefault());
        if (list == null) {
            list = this.copydefault;
        }
        return list;
    }
}
