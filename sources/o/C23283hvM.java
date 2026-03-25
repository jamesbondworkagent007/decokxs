package o;

import com.okinc.business.defi.api.bean.DexFeature;
import com.okinc.business.dexui.api.extensionimpl.TrackerUIExtensionImpl$isDeepLinkLimited$1;
import kotlin.coroutines.Continuation;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23283hvM extends AbstractC43215rlA implements InterfaceC9777bbw {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9777bbw
    public int copydefault() {
        return C23274hvD.Fragment.onPostMessage;
    }

    @Override // o.InterfaceC9777bbw
    public androidx.fragment.app.Fragment KWHzl() {
        return C25677jCg.Companion.copydefault("app_web3", false);
    }

    @Override // o.InterfaceC9777bbw
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C22416heu.EZpvd(DexFeature.MARKET));
    }

    @Override // o.InterfaceC9777bbw
    public java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C22416heu.copydefault(context, DexFeature.MARKET));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        TrackerUIExtensionImpl$isDeepLinkLimited$1 trackerUIExtensionImpl$isDeepLinkLimited$1;
        if (continuation instanceof TrackerUIExtensionImpl$isDeepLinkLimited$1) {
            trackerUIExtensionImpl$isDeepLinkLimited$1 = (TrackerUIExtensionImpl$isDeepLinkLimited$1) continuation;
            int i = trackerUIExtensionImpl$isDeepLinkLimited$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerUIExtensionImpl$isDeepLinkLimited$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerUIExtensionImpl$isDeepLinkLimited$1 = new TrackerUIExtensionImpl$isDeepLinkLimited$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = trackerUIExtensionImpl$isDeepLinkLimited$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerUIExtensionImpl$isDeepLinkLimited$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            trackerUIExtensionImpl$isDeepLinkLimited$1.label = 1;
            objEZpvd = EZpvd(trackerUIExtensionImpl$isDeepLinkLimited$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        if (!((java.lang.Boolean) objEZpvd).booleanValue() && !C22416heu.OLrzqt()) {
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }
}
