package o;

import com.okinc.business.invest_biz.ui.claim.Web3RewardsClaimManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iPF {
    public static final iPF OLrzqt = new iPF();

    private iPF() {
    }

    public static final Web3RewardsClaimManager copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            iNV inv = (iNV) C58114yvF.OLrzqt(applicationContext, iNV.class);
            Web3RewardsClaimManager web3RewardsClaimManager = new Web3RewardsClaimManager();
            web3RewardsClaimManager.copydefault(inv.QVAiDq());
            return web3RewardsClaimManager;
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException("Failed to create Web3RewardsClaimManager. Make sure the application is properly configured with Hilt.", e);
        }
    }

    public static final boolean OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            android.content.Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            C58114yvF.OLrzqt(applicationContext, iNV.class);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
