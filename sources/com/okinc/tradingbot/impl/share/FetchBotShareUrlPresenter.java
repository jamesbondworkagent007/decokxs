package com.okinc.tradingbot.impl.share;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.exoplayer2.C;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.planet.dto.BotCopyType;
import com.okinc.tradingbot.impl.share.FetchBotShareUrlPresenter;
import com.okinc.unify_trade.biz.BotShareResult;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C53661wph;
import o.C56071xvr;
import o.C56206xyT;
import o.C56273xzh;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class FetchBotShareUrlPresenter extends AbsPresenter {
    public static final int AEQbTJ = C56273xzh.copydefault | C56206xyT.copydefault;
    public final C56206xyT KWHzl;
    public final C56273xzh copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchBotShareUrlPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new C56206xyT();
        this.copydefault = new C56273xzh();
    }

    public final void copydefault(@NotNull final TacticsData tacticsData, @NotNull final Function2<? super String, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (C56071xvr.gEmmrt.ejfBZ()) {
            C56206xyT c56206xyT = this.KWHzl;
            c56206xyT.KWHzl(tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getOrderType(), tacticsData.getAlgoId());
            c56206xyT.KWHzl(new Function1() { // from class: o.wrp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return FetchBotShareUrlPresenter.AEQbTJ(function2, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(c56206xyT, 0L, 1, null);
            return;
        }
        C56273xzh c56273xzh = this.copydefault;
        c56273xzh.KWHzl(new Function1() { // from class: o.wrn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FetchBotShareUrlPresenter.OLrzqt(this.copydefault, tacticsData, function2, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56273xzh, 0L, 1, null);
    }

    public final String KWHzl(String str, TacticsData tacticsData) throws UnsupportedEncodingException {
        return str + URLEncoder.encode(generateDeeplink$default(this, tacticsData, false, 2, null), C.UTF8_NAME);
    }

    public static /* synthetic */ String generateDeeplink$default(FetchBotShareUrlPresenter fetchBotShareUrlPresenter, TacticsData tacticsData, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fetchBotShareUrlPresenter.KWHzl(tacticsData, z);
    }

    public final String KWHzl(TacticsData tacticsData, boolean z) {
        return C53661wph.Companion.copydefault().AEQbTJ(new C53661wph.ActionBar(BotCopyType.Companion.EZpvd(tacticsData.getCopyType()), tacticsData.getInstType(), tacticsData.getInstId(), tacticsData.getOrderType(), tacticsData.getAlgoId(), tacticsData.getSourceAlgoId(), z, true, null, null, false, 1792, null));
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.copydefault, this.KWHzl);
    }

    public static final Unit AEQbTJ(Function2 function2, ResponseData responseData) {
        BotShareResult botShareResult;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            List list = (List) responseData.getData();
            String url = (list == null || (botShareResult = (BotShareResult) CollectionsKt___CollectionsKt.AuCTelauCTel(list)) == null) ? null : botShareResult.getUrl();
            if (url == null) {
                url = "";
            }
            function2.invoke(url, "");
        } else {
            function2.invoke("", "");
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(FetchBotShareUrlPresenter fetchBotShareUrlPresenter, TacticsData tacticsData, Function2 function2, ResponseData responseData) {
        BotShareResult botShareResult;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            List list = (List) responseData.getData();
            function2.invoke(fetchBotShareUrlPresenter.KWHzl((list == null || (botShareResult = (BotShareResult) CollectionsKt___CollectionsKt.AuCTelauCTel(list)) == null) ? null : botShareResult.getUrl(), tacticsData), fetchBotShareUrlPresenter.KWHzl(tacticsData, true));
        } else {
            function2.invoke("", "");
        }
        return Unit.INSTANCE;
    }
}
