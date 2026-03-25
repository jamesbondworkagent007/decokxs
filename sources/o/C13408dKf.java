package o;

import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.deeplink.DefiWalletReferralLinkHandler$bindReferralCode$1;
import com.okinc.wallet.api.bean.Web3BusinessLine;
import com.okinc.wallet.api.bean.Web3ReferralCodeSource;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.C17668fNw;
import o.C17670fNy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dKf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13408dKf implements InterfaceC43236rlV {
    @Override // o.InterfaceC43236rlV
    public void KWHzl(@NotNull android.content.Context context, @NotNull InterfaceC43232rlR interfaceC43232rlR, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43232rlR, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("ref");
        java.lang.String string = obj != null ? obj.toString() : null;
        java.lang.String strAEQbTJ = interfaceC43232rlR.AEQbTJ();
        if (string == null) {
            ReferralManager.StateListAnimator stateListAnimator = ReferralManager.Companion;
            java.lang.String strValues = ReferralManager.StateListAnimator.getInstance$default(stateListAnimator, null, 1, null).values(strAEQbTJ);
            string = strValues == null ? ReferralManager.StateListAnimator.getInstance$default(stateListAnimator, null, 1, null).fetchVPNInfo() : strValues;
        }
        if (string == null || string.length() == 0) {
            OLrzqt("");
        } else {
            C17668fNw.Activity.getInstance$default(C17668fNw.Companion, null, 1, null).KWHzl(string, strAEQbTJ, Web3ReferralCodeSource.URL, Web3BusinessLine.DEX_REFERRAL);
            OLrzqt(string);
        }
    }

    public final void OLrzqt(java.lang.String str) {
        C17670fNy.TaskDescription.getInstance$default(C17670fNy.Companion, null, 1, null).OLrzqt(true);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new DefiWalletReferralLinkHandler$bindReferralCode$1(str, null), 2, null);
    }
}
