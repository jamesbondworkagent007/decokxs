package o;

import kotlin.jvm.functions.Function0;
import uniffi.RustBuffer;
import uniffi.account.uniffiCallbackInterfaceOkxPasskeyUpgradeCallback;

/* JADX INFO: renamed from: o.Amv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C3492Amv implements Function0 {
    public static int KWHzl;
    public static int copydefault;
    public final /* synthetic */ RustBuffer.ByValue AEQbTJ;
    public final /* synthetic */ InterfaceC58915zUd OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C3492Amv(InterfaceC58915zUd interfaceC58915zUd, RustBuffer.ByValue byValue) {
        this.OLrzqt = interfaceC58915zUd;
        this.AEQbTJ = byValue;
    }

    /* JADX DEBUG: Class process forced to load method for inline: uniffi.account.uniffiCallbackInterfaceOkxPasskeyUpgradeCallback.onFailure.$r8$lambda$ywkWvrAjamH3DRVH3iOP13Qi4Y8(o.zUd, uniffi.RustBuffer$ByValue):kotlin.Unit */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        return uniffiCallbackInterfaceOkxPasskeyUpgradeCallback.onFailure.callback$lambda$0(this.OLrzqt, this.AEQbTJ);
    }

    public static int AEQbTJ() {
        int i = KWHzl;
        int i2 = i % 5676703;
        KWHzl = i + 1;
        if (i2 != 0) {
            return copydefault;
        }
        int iNextInt = new java.util.Random().nextInt(1292762473);
        copydefault = iNextInt;
        return iNextInt;
    }
}
