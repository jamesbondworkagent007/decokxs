package o;

import com.okinc.account.api.model.login.LoginRoute;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45272smf implements InterfaceC45302snI {
    public final InterfaceC47278tmy AEQbTJ;

    @yCM
    public C45272smf(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.AEQbTJ = interfaceC47278tmy;
    }

    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonCampaignHandler: invoke", null, 2, null);
        if (this.AEQbTJ.values()) {
            context.startActivity(ActivityC44774sdK.Companion.KWHzl(context));
        } else {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT == null) {
                return Unit.INSTANCE;
            }
            if (obj instanceof LoginRoute) {
                interfaceC8104awT.OLrzqt(context, (LoginRoute) obj);
            } else {
                InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
