package o;

import androidx.core.os.BundleKt;
import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.ActivityC45850szP;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45329snj implements InterfaceC45302snI {
    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonOpenProductDocsHandler: invoke", null, 2, null);
        C45363soQ.onSessionIdEvent$default("SupportCenter_Btm_ProductDoc_Click", false, null, 3, null);
        ActivityC45850szP.ActionBar.openPage$default(ActivityC45850szP.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C47315tni.PendingIntent.QXDzTk)), C56390yDp.OLrzqt("scenario", SelfServiceScenario.PRODUCT_DOCUMENT.getValue())), null, 4, null);
        return Unit.INSTANCE;
    }
}
