package o;

import com.okinc.business.defi.api.bean.DexFeature;
import com.okinc.business.dexui.api.extensionimpl.ScannerUIExtensionImpl$isDeepLinkLimited$1;
import kotlin.coroutines.Continuation;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23281hvK extends AbstractC43215rlA implements InterfaceC9779bby {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9779bby
    public int KWHzl() {
        return C23274hvD.Fragment.DcMfJKdMCrTj;
    }

    private final boolean AEQbTJ() {
        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
        return interfaceC25414iwK != null && interfaceC25414iwK.AhwBna();
    }

    @Override // o.InterfaceC9779bby
    public androidx.fragment.app.Fragment copydefault() {
        return C21841hOh.Companion.OLrzqt();
    }

    @Override // o.InterfaceC9779bby
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C22416heu.EZpvd(DexFeature.MARKET) || AEQbTJ());
    }

    @Override // o.InterfaceC9779bby
    public java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C22416heu.copydefault(context, DexFeature.MARKET) || AEQbTJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ScannerUIExtensionImpl$isDeepLinkLimited$1 scannerUIExtensionImpl$isDeepLinkLimited$1;
        if (continuation instanceof ScannerUIExtensionImpl$isDeepLinkLimited$1) {
            scannerUIExtensionImpl$isDeepLinkLimited$1 = (ScannerUIExtensionImpl$isDeepLinkLimited$1) continuation;
            int i = scannerUIExtensionImpl$isDeepLinkLimited$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scannerUIExtensionImpl$isDeepLinkLimited$1.label = i - Integer.MIN_VALUE;
            } else {
                scannerUIExtensionImpl$isDeepLinkLimited$1 = new ScannerUIExtensionImpl$isDeepLinkLimited$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = scannerUIExtensionImpl$isDeepLinkLimited$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = scannerUIExtensionImpl$isDeepLinkLimited$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            scannerUIExtensionImpl$isDeepLinkLimited$1.label = 1;
            objAEQbTJ = AEQbTJ(scannerUIExtensionImpl$isDeepLinkLimited$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        if (!((java.lang.Boolean) objAEQbTJ).booleanValue() && !C22416heu.OLrzqt()) {
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }
}
