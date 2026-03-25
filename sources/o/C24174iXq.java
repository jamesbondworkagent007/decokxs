package o;

import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC24173iXp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iXq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24174iXq {
    public static final C24177iXt OLrzqt(@NotNull InterfaceC24173iXp interfaceC24173iXp) {
        Intrinsics.checkNotNullParameter(interfaceC24173iXp, "");
        if (interfaceC24173iXp instanceof InterfaceC24173iXp.ActionBar) {
            return ((InterfaceC24173iXp.ActionBar) interfaceC24173iXp).KWHzl();
        }
        if (interfaceC24173iXp instanceof InterfaceC24173iXp.Activity) {
            return ((InterfaceC24173iXp.Activity) interfaceC24173iXp).EZpvd();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TransactionStep KWHzl(@NotNull InterfaceC24173iXp interfaceC24173iXp) {
        Intrinsics.checkNotNullParameter(interfaceC24173iXp, "");
        InterfaceC24173iXp.Activity activity = interfaceC24173iXp instanceof InterfaceC24173iXp.Activity ? (InterfaceC24173iXp.Activity) interfaceC24173iXp : null;
        if (activity != null) {
            return activity.KWHzl();
        }
        return null;
    }
}
