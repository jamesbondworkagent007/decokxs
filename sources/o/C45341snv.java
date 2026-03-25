package o;

import androidx.core.os.BundleKt;
import com.okinc.account.api.model.login.LoginRoute;
import com.okinc.okex.center.bean.enums.LoginRouteCode;
import com.okinc.okex.common.navigator.CommonServiceKey;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45341snv implements InterfaceC45302snI {
    public final C45300snG KWHzl;
    public final InterfaceC47278tmy OLrzqt;

    @yCM
    public C45341snv(@NotNull C45300snG c45300snG, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(c45300snG, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.KWHzl = c45300snG;
        this.OLrzqt = interfaceC47278tmy;
    }

    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonTicketHistoryHandler: invoke", null, 2, null);
        if (this.OLrzqt.values()) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C47315tni.PendingIntent.values))), null, 4, null);
            return Unit.INSTANCE;
        }
        java.lang.Object objCopydefault = this.KWHzl.copydefault(CommonServiceKey.OpenLogin, context, new LoginRoute(null, null, null, null, null, null, null, null, C56443yFo.AEQbTJ(LoginRouteCode.REQUEST_LOGIN_AND_TO_TICKET_DETAIL.getValue()), false, false, 1791, null), continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }
}
