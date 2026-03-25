package o;

import com.okinc.business.defi.api.bean.DexFeature;
import com.okinc.business.dexui.api.extensionimpl.DexMarketExtensionImpl$isDeepLinkLimited$1;
import com.okinc.business.dexui.main.market.MarketParams;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23279hvI extends AbstractC43215rlA implements InterfaceC9771bbq {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9771bbq
    public int copydefault() {
        return C23274hvD.Fragment.DGUQLIekVPG;
    }

    @Override // o.InterfaceC9771bbq
    public androidx.fragment.app.Fragment AEQbTJ() {
        return C21841hOh.Companion.EZpvd(new MarketParams("app_web3", null, null, 6, null));
    }

    @Override // o.InterfaceC9771bbq
    public java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C22416heu.EZpvd(DexFeature.MARKET));
    }

    @Override // o.InterfaceC9771bbq
    public java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C22416heu.copydefault(context, DexFeature.MARKET));
    }

    @Override // o.InterfaceC9771bbq
    public boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Set<java.lang.String> setCopydefault = gKZ.EZpvd.copydefault();
        if (!(setCopydefault instanceof java.util.Collection) || !setCopydefault.isEmpty()) {
            java.util.Iterator<T> it = setCopydefault.iterator();
            while (it.hasNext()) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) it.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC9771bbq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        DexMarketExtensionImpl$isDeepLinkLimited$1 dexMarketExtensionImpl$isDeepLinkLimited$1;
        if (continuation instanceof DexMarketExtensionImpl$isDeepLinkLimited$1) {
            dexMarketExtensionImpl$isDeepLinkLimited$1 = (DexMarketExtensionImpl$isDeepLinkLimited$1) continuation;
            int i = dexMarketExtensionImpl$isDeepLinkLimited$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexMarketExtensionImpl$isDeepLinkLimited$1.label = i - Integer.MIN_VALUE;
            } else {
                dexMarketExtensionImpl$isDeepLinkLimited$1 = new DexMarketExtensionImpl$isDeepLinkLimited$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = dexMarketExtensionImpl$isDeepLinkLimited$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = dexMarketExtensionImpl$isDeepLinkLimited$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            dexMarketExtensionImpl$isDeepLinkLimited$1.label = 1;
            objCopydefault = copydefault(dexMarketExtensionImpl$isDeepLinkLimited$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        if (!((java.lang.Boolean) objCopydefault).booleanValue() && !C22416heu.OLrzqt()) {
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }
}
