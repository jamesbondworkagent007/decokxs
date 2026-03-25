package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC22824hme;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVW {
    public static final kVW EZpvd = new kVW();

    private kVW() {
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull TransactionType transactionType, @NotNull TokenBase tokenBase, DexMultiTokenInfoBean dexMultiTokenInfoBean, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        if (C31172lox.KWHzl(i, C31172lox.Companion.KWHzl())) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = DexMultiTokenInfoBean.Companion.OLrzqt(tokenBase);
            if (transactionType == TransactionType.Buy) {
                if (dexMultiTokenInfoBean != null) {
                    InterfaceC22824hme.ActionBar.setCurrentFromCoin$default(C22380heK.OLrzqt.copydefault(str).OLrzqt(true), dexMultiTokenInfoBean, false, 2, null);
                }
                C22380heK c22380heK = C22380heK.OLrzqt;
                InterfaceC22824hme.ActionBar.setCurrentToCoin$default(c22380heK.copydefault(str).OLrzqt(true), dexMultiTokenInfoBeanOLrzqt, false, 2, null);
                c22380heK.copydefault(str).fJNWhG().AhwBna().EZpvd(3, dexMultiTokenInfoBean, dexMultiTokenInfoBeanOLrzqt);
                return;
            }
            if (dexMultiTokenInfoBean != null) {
                InterfaceC22824hme.ActionBar.setCurrentToCoin$default(C22380heK.OLrzqt.copydefault(str).OLrzqt(true), dexMultiTokenInfoBean, false, 2, null);
            }
            C22380heK c22380heK2 = C22380heK.OLrzqt;
            InterfaceC22824hme.ActionBar.setCurrentFromCoin$default(c22380heK2.copydefault(str).OLrzqt(true), dexMultiTokenInfoBeanOLrzqt, false, 2, null);
            c22380heK2.copydefault(str).fJNWhG().AhwBna().EZpvd(3, dexMultiTokenInfoBeanOLrzqt, dexMultiTokenInfoBean);
        }
    }
}
