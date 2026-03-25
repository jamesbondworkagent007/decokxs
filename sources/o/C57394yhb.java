package o;

import com.okinc.okuser.data.Token;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yhb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57394yhb {
    public final C57330ygQ AEQbTJ;
    public final android.os.Handler OLrzqt;
    public volatile java.lang.String copydefault;

    public C57394yhb(@NotNull C57330ygQ c57330ygQ, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c57330ygQ, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = c57330ygQ;
        this.copydefault = str;
        this.OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final void EZpvd(java.lang.String str) {
        if (str == null || !C59449zhJ.AYXKKw(str, "http", true)) {
            return;
        }
        this.copydefault = str;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getToken() {
        Token tokenAhwBna;
        if (!C57354ygo.OLrzqt(this.copydefault) || (tokenAhwBna = C43292rmY.OLrzqt.AwvSrB().AhwBna()) == null) {
            return null;
        }
        return tokenAhwBna.getValue();
    }

    @android.webkit.JavascriptInterface
    public final void jsBridge(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C57354ygo.OLrzqt(this.copydefault)) {
            this.OLrzqt.post(new java.lang.Runnable() { // from class: o.yhc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57394yhb.AEQbTJ(this.copydefault, str);
                }
            });
        }
    }

    public static final void AEQbTJ(C57394yhb c57394yhb, java.lang.String str) {
        C35962oKd.copydefault(c57394yhb.AEQbTJ, str);
    }
}
