package o;

import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.deeplink.DefiWalletReferralSubInviterLinkHandler$bindReferralSubInviter$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dKe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13407dKe implements InterfaceC43236rlV {
    @Override // o.InterfaceC43236rlV
    public void KWHzl(@NotNull android.content.Context context, @NotNull InterfaceC43232rlR interfaceC43232rlR, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String strGEmmrt = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).gEmmrt(interfaceC43232rlR.AEQbTJ(), "affiliates");
        if (strGEmmrt == null || strGEmmrt.length() == 0) {
            return;
        }
        EZpvd(strGEmmrt);
    }

    public final void EZpvd(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new DefiWalletReferralSubInviterLinkHandler$bindReferralSubInviter$1(str, null), 2, null);
    }
}
