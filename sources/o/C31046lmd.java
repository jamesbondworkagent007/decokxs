package o;

import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexui.main.swap.trade.status.widget.MemeErrorNoticeView;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lmd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31046lmd {
    public static final void OLrzqt(@NotNull final android.content.Context context, MemeErrorNoticeView memeErrorNoticeView, @NotNull TransactionType transactionType, @NotNull PreCheckBean preCheckBean, @NotNull DefiChainInfo defiChainInfo, V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.Throwable th, @NotNull SlippageMode slippageMode, java.lang.String str, java.lang.String str2, java.lang.String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, @NotNull InterfaceC19780gPa interfaceC19780gPa, @NotNull gOT got, final gOP gop, boolean z4) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(preCheckBean, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(interfaceC19780gPa, "");
        Intrinsics.checkNotNullParameter(got, "");
        final ReminderListConfig reminderListConfigOLrzqt = C30950lkn.KWHzl.OLrzqt(transactionType, preCheckBean, defiChainInfo, v6BaseQuoteResponse, th, slippageMode, str, str2, str3, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, i, i2, i3, z, z2, z3, interfaceC19780gPa, got, z4);
        new C31051lmi().AEQbTJ(reminderListConfigOLrzqt, memeErrorNoticeView, gop, (!reminderListConfigOLrzqt.getHasMoreReminders() || reminderListConfigOLrzqt.getHasBlockingTier()) ? null : new Function0() { // from class: o.lmk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31046lmd.AEQbTJ(context, reminderListConfigOLrzqt, gop);
            }
        });
    }

    public static final Unit AEQbTJ(android.content.Context context, ReminderListConfig reminderListConfig, gOP gop) {
        gPQ.show$default(gPQ.OLrzqt, context, reminderListConfig.getAllReminderConfigs(), gop, null, 8, null);
        return Unit.INSTANCE;
    }
}
