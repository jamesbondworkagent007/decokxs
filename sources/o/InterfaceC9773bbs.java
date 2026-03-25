package o;

import com.okinc.wallet.api.bean.WalletScanInformationBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9773bbs extends InterfaceC43295rmb {
    public static final Application Companion = Application.copydefault;

    androidx.fragment.app.Fragment AEQbTJ(java.lang.String str);

    void AEQbTJ(@NotNull android.content.Context context);

    void EZpvd();

    boolean EZpvd(@NotNull java.lang.String str);

    int KWHzl();

    void KWHzl(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle);

    void KWHzl(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map);

    void KWHzl(@NotNull java.lang.String str);

    java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation);

    void OLrzqt(@NotNull android.content.Context context, long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull yHS<? super java.lang.Boolean, ? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, Unit> yhs);

    void OLrzqt(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z);

    void copydefault(@NotNull WalletScanInformationBean walletScanInformationBean);

    /* JADX INFO: renamed from: o.bbs$Application */
    public static final class Application {
        public static final /* synthetic */ Application copydefault = new Application();

        private Application() {
        }
    }
}
