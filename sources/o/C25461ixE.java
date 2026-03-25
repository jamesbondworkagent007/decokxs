package o;

import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25461ixE implements InterfaceC25462ixF {
    @Override // o.InterfaceC25462ixF
    public void copydefault(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) throws java.io.UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.containsKey("openUrl")) {
            java.lang.String string = bundle.getString("openUrl");
            java.lang.String strDecode = URLDecoder.decode(string != null ? string : "", "utf-8");
            C27508jwX c27508jwX = C27508jwX.AEQbTJ;
            Intrinsics.copydefault((java.lang.Object) strDecode);
            C27508jwX.openUrl$default(c27508jwX, activity, strDecode, false, 2, null);
        }
    }
}
