package o;

import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.dGQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dJw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13398dJw implements dGQ.StateListAnimator {
    public final WeakReference<C13241dEa> AEQbTJ;

    public static final void copydefault(java.lang.String str) {
    }

    public C13398dJw(@NotNull WeakReference<C13241dEa> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.AEQbTJ = weakReference;
    }

    @Override // o.dGQ.StateListAnimator
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Long l) {
        WeakReference<FragmentActivity> weakReferenceFetchVPNInfo;
        C13241dEa c13241dEa;
        WeakReference<dES> weakReferenceAKErDB;
        dES des;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C13241dEa c13241dEa2 = this.AEQbTJ.get();
        if (c13241dEa2 != null && (weakReferenceAKErDB = c13241dEa2.aKErDB()) != null && (des = weakReferenceAKErDB.get()) != null) {
            des.AEQbTJ(0);
            des.QVAiDq();
        }
        C13241dEa c13241dEa3 = this.AEQbTJ.get();
        if (c13241dEa3 == null || (weakReferenceFetchVPNInfo = c13241dEa3.fetchVPNInfo()) == null || weakReferenceFetchVPNInfo.get() == null || (c13241dEa = this.AEQbTJ.get()) == null) {
            return;
        }
        c13241dEa.evaluateJavascript("window.okxwallet.sendError(" + str + ",\"" + str2 + "\")", null);
    }

    @Override // o.dGQ.StateListAnimator
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C13241dEa c13241dEa = this.AEQbTJ.get();
        if (c13241dEa != null) {
            c13241dEa.setDappType(0);
            c13241dEa.setMAction(str3);
            c13241dEa.setWeb3JsIdSign(str);
            if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "requestAccounts")) {
                c13241dEa.setAddress(str2);
                c13241dEa.setEvmAddress(c13241dEa.AEQbTJ());
                c13241dEa.evaluateJavascript("window.okxwallet.setAddress(\"" + (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2) ^ true ? str2 : "") + "\")", null);
                c13241dEa.evaluateJavascript("window.tronWeb.isTronMode = false;", null);
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c13241dEa.dNCPSb())) {
                    java.lang.String strDNCPSb = c13241dEa.dNCPSb();
                    if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2))) {
                        str2 = "";
                    }
                    c13241dEa.evaluateJavascript("window.okxwallet.sendResponse(" + strDNCPSb + ", [\"" + str2 + "\"])", new android.webkit.ValueCallback() { // from class: o.dJv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(java.lang.Object obj) {
                            C13398dJw.copydefault((java.lang.String) obj);
                        }
                    });
                }
            }
        }
    }

    @Override // o.dGQ.StateListAnimator
    public void copydefault(long j, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z) {
        WeakReference<dES> weakReferenceAKErDB;
        dES des;
        Intrinsics.checkNotNullParameter(str, "");
        C13241dEa c13241dEa = this.AEQbTJ.get();
        if (c13241dEa != null) {
            c13241dEa.setSelectedChain(java.lang.Long.valueOf(j));
            c13241dEa.setDappType(0);
            c13241dEa.setCurrentWallet(interfaceC9738bbJ);
            c13241dEa.setAddress(str);
            c13241dEa.setEvmAddress(str);
            C13241dEa c13241dEa2 = this.AEQbTJ.get();
            if (c13241dEa2 == null || (weakReferenceAKErDB = c13241dEa2.aKErDB()) == null || (des = weakReferenceAKErDB.get()) == null) {
                return;
            }
            des.AEQbTJ(java.lang.Long.valueOf(j), str, interfaceC9738bbJ, z);
        }
    }
}
