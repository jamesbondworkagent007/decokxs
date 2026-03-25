package o;

import com.okinc.business.defi.dapp.webview.DappTabData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface dES {
    void AEQbTJ(int i);

    void AEQbTJ(java.lang.Long l, @NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, boolean z);

    void AEQbTJ(java.lang.Long l, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, Unit> function2);

    void AkhnZx();

    void AuCTelauCTel();

    C13241dEa EZpvd(boolean z);

    void QVAiDq();

    void dismissLoading();

    void showLoading();

    void showLoadingAtOnce();

    DappTabData uzCIH();

    java.lang.String zLjUOn();

    void zuBGHE();

    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dES */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void selectWallet$default(dES des, java.lang.Long l, Function2 function2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectWallet");
            }
            if ((i & 2) != 0) {
                function2 = null;
            }
            des.AEQbTJ(l, function2);
        }

        public static /* synthetic */ C13241dEa openEmptyTab$default(dES des, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEmptyTab");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return des.EZpvd(z);
        }
    }
}
