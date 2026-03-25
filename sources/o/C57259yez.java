package o;

import com.okinc.wallet.core.javascript.WalletJsBridge;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57259yez {
    public static final C57259yez copydefault = new C57259yez();

    private C57259yez() {
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strKWHzl = WalletJsBridge.AEQbTJ.KWHzl();
        if (strKWHzl == null) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue("");
                return;
            }
            return;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            str3 = "\n                " + str + "();\n                ";
        } else {
            str3 = "\n                " + str + "(" + str2 + ");\n                ";
        }
        AEQbTJ(strKWHzl, str3, valueCallback);
    }

    public final void OLrzqt(@NotNull java.lang.String str, java.lang.String str2, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(str, "");
        WalletJsBridge walletJsBridge = WalletJsBridge.AEQbTJ;
        java.lang.String strKWHzl = walletJsBridge.KWHzl();
        if (strKWHzl == null) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue("");
                return;
            }
            return;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            str3 = "\n                " + str + "();\n                ";
        } else {
            str3 = "\n                " + str + "(" + str2 + ");\n                ";
        }
        walletJsBridge.AhwBna(C43246rlf.OLrzqt.valueOf(), strKWHzl, str3, valueCallback);
    }

    public final void copydefault(@NotNull java.lang.String str, java.lang.String str2, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = WalletJsBridge.AEQbTJ.OLrzqt();
        if (strOLrzqt == null) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue("");
                return;
            }
            return;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            str3 = "\n                " + str + "();\n                ";
        } else {
            str3 = "\n                " + str + "(" + str2 + ");\n                ";
        }
        AEQbTJ(strOLrzqt, str3, valueCallback);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        WalletJsBridge.AEQbTJ.KWHzl(C43246rlf.OLrzqt.valueOf(), str, str2, valueCallback);
    }
}
