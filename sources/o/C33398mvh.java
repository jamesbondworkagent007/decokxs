package o;

import com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33398mvh implements InterfaceC7380aij {
    @Override // o.InterfaceC7380aij
    public java.util.Set<java.lang.String> KWHzl() {
        return yEE.AhwBna("lite/main/home", "lite/main/market", "lite/main/portfolio");
    }

    @Override // o.InterfaceC7380aij
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull InterfaceC7379aii interfaceC7379aii) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC7379aii, "");
        int iHashCode = str.hashCode();
        if (iHashCode == -1104235151) {
            if (str.equals("lite/main/market")) {
                ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).AEQbTJ(context, LiteNavigationTabEnum.LITE_MARKET);
            }
        } else if (iHashCode == 535027540) {
            if (str.equals("lite/main/home")) {
                ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).AEQbTJ(context, LiteNavigationTabEnum.LITE_HOME);
            }
        } else if (iHashCode == 940792819 && str.equals("lite/main/portfolio")) {
            ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).AEQbTJ(context, LiteNavigationTabEnum.LITE_PORTFOLIO);
        }
    }
}
