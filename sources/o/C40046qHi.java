package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.market.search.features.main.result.ui.SubPage;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qHi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40046qHi implements qHP {
    public SubPage KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qHP
    public void copydefault(SubPage subPage) {
        this.KWHzl = subPage;
    }

    @Override // o.qHP
    public java.lang.String KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
        android.content.Intent intent;
        Intrinsics.checkNotNullParameter(fragment, "");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return intent.getStringExtra("from");
    }

    @Override // o.qHP
    public boolean EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        android.content.Intent intent;
        Intrinsics.checkNotNullParameter(fragment, "");
        FragmentActivity activity = fragment.getActivity();
        return (activity == null || (intent = activity.getIntent()) == null || !intent.hasExtra("trading_social_trader")) ? false : true;
    }

    @Override // o.qHP
    public boolean AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return OLrzqt(fragment) == SubPage.CONTENT || Intrinsics.EZpvd((java.lang.Object) KWHzl(fragment), (java.lang.Object) "planet_feed") || OLrzqt(fragment) == SubPage.IM_CHAT || Intrinsics.EZpvd((java.lang.Object) KWHzl(fragment), (java.lang.Object) "planet_chat");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [52=10] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r2.equals("spot") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r2.equals("margin") == false) goto L55;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.qHP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SubPage OLrzqt(@NotNull androidx.fragment.app.Fragment fragment) {
        android.content.Intent intent;
        Intrinsics.checkNotNullParameter(fragment, "");
        FragmentActivity activity = fragment.getActivity();
        java.lang.String stringExtra = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra("tab");
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -1690185748:
                    if (stringExtra.equals("copyTrading")) {
                        return SubPage.TRADER;
                    }
                    break;
                case -1432035158:
                    if (stringExtra.equals("simpleEarn")) {
                        return SubPage.EARN;
                    }
                    break;
                case -1263170109:
                    if (stringExtra.equals("future")) {
                        return SubPage.FUTURES;
                    }
                    break;
                case -1249474914:
                    if (stringExtra.equals("options")) {
                        return SubPage.OPTIONS;
                    }
                    break;
                case -1081309778:
                    break;
                case 96673:
                    if (stringExtra.equals("all")) {
                        return SubPage.ALL;
                    }
                    break;
                case 3052376:
                    if (stringExtra.equals("chat")) {
                        return SubPage.IM_CHAT;
                    }
                    break;
                case 3138974:
                    if (stringExtra.equals("feed")) {
                        return SubPage.CONTENT;
                    }
                    break;
                case 3537154:
                    break;
                case 1222392888:
                    if (stringExtra.equals("web3Dex")) {
                        return SubPage.DEFI_WEB3;
                    }
                    break;
                case 2003607782:
                    if (stringExtra.equals("tradingBot")) {
                        return SubPage.BOTS;
                    }
                    break;
            }
            return SubPage.SPOT;
        }
        return this.KWHzl;
    }

    @Override // o.qHP
    public java.lang.String copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        android.content.Intent intent;
        java.lang.String stringExtra;
        Intrinsics.checkNotNullParameter(fragment, "");
        FragmentActivity activity = fragment.getActivity();
        return (activity == null || (intent = activity.getIntent()) == null || (stringExtra = intent.getStringExtra(JwtUtilsKt.DID_METHOD_KEY)) == null) ? "" : stringExtra;
    }
}
