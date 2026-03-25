package o;

import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionInitialReq;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionProtocolsReq;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23643iDz {
    java.lang.Object AEQbTJ(@NotNull InvestSubscriptionProtocolsReq investSubscriptionProtocolsReq, @NotNull Continuation<? super Result<InvestSubscriptionProtocolModel>> continuation);

    java.lang.Object OLrzqt(@NotNull InvestSubscriptionReceiveReq investSubscriptionReceiveReq, @NotNull Continuation<? super Result<InvestSubscriptionReceiveInfo>> continuation);

    java.lang.Object copydefault(@NotNull InvestSubscriptionInitialReq investSubscriptionInitialReq, @NotNull Continuation<? super Result<InvestSubscriptionInfo>> continuation);
}
