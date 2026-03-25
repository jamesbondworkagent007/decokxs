package o;

import com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account.OKXWeb3DependencyException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44754scr extends AbstractC43215rlA implements InterfaceC8110awZ {
    public final java.lang.String AEQbTJ = C44754scr.class.getSimpleName();

    @Override // o.InterfaceC8110awZ
    public void EZpvd(@NotNull android.app.Activity activity, java.lang.String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String str2 = this.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str2));
    }
}
