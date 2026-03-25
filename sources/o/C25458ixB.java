package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25458ixB implements InterfaceC25462ixF {
    @Override // o.InterfaceC25462ixF
    public void copydefault(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.containsKey("investmentId")) {
            long j = bundle.getInt("investmentId");
            java.lang.String string = bundle.getString("source");
            if (string == null) {
                string = "Deeplink";
            }
            C27508jwX.startInvestDetailActivity$default(C27508jwX.AEQbTJ, activity, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(bundle.getInt("investmentCategory", 0)), string, null, false, 24, null);
        }
    }
}
