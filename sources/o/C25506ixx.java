package o;

import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54828xWv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25506ixx implements InterfaceC25462ixF {
    @Override // o.InterfaceC25462ixF
    public void copydefault(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.containsKey("openUrl")) {
            java.lang.String string = bundle.getString("openUrl");
            InterfaceC54828xWv.ActionBar.enterDAppWebView$default((InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC23916iOb.class), activity, URLDecoder.decode(string != null ? string : "", "utf-8"), null, null, null, null, null, "defi", 96, null);
        }
    }
}
