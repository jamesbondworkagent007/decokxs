package o;

import com.okinc.okuser.data.User;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kKA {
    public static final kKA EZpvd = new kKA();

    private kKA() {
    }

    public static /* synthetic */ boolean isLogin$default(kKA kka, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        }
        return kka.OLrzqt(context);
    }

    public final boolean OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC47230tmC) C58113yvE.copydefault(context.getApplicationContext(), InterfaceC47230tmC.class)).fmB().values();
    }

    public static /* synthetic */ java.lang.String getLoginName$default(kKA kka, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        }
        return kka.copydefault(context);
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context) {
        java.lang.String loginName;
        Intrinsics.checkNotNullParameter(context, "");
        User userOLrzqt = ((InterfaceC47230tmC) C58113yvE.copydefault(context.getApplicationContext(), InterfaceC47230tmC.class)).fmB().OLrzqt();
        return (userOLrzqt == null || (loginName = userOLrzqt.getLoginName()) == null) ? "" : loginName;
    }

    public static /* synthetic */ boolean isUserInDemoTrading$default(kKA kka, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        }
        return kka.AEQbTJ(context);
    }

    public final boolean AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC47230tmC) C58113yvE.copydefault(context.getApplicationContext(), InterfaceC47230tmC.class)).fmB().fJNWhG();
    }
}
