package o;

import com.okinc.okuser.data.User;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33460mwq {
    public static final java.lang.String copydefault(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        java.lang.String uid;
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        User userOLrzqt = interfaceC47278tmy.OLrzqt();
        return (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) ? "user_logged_out" : uid;
    }
}
