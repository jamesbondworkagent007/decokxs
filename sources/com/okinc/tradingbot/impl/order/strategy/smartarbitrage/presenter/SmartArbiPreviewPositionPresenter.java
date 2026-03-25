package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.EstimatedClosePnlVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54223xAl;
import o.C56111xwe;
import o.C56390yDp;
import o.C56402yEa;
import o.InterfaceC54501xKt;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbiPreviewPositionPresenter extends BaseBotOrderPresenter {
    public static final int OLrzqt = C56111xwe.AEQbTJ | C54223xAl.OLrzqt;
    public final C54223xAl EZpvd;
    public final C56111xwe<Pair<ArbitrageInfoResponse, Boolean>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54223xAl OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<Pair<ArbitrageInfoResponse, Boolean>> copydefault() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbiPreviewPositionPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C54223xAl();
        this.copydefault = new C56111xwe<>();
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, String str3, String str4, String str5, Float f, SubArbitrageType4Remote subArbitrageType4Remote) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0 || str5 == null || str5.length() == 0) {
            this.copydefault.postValue(C56390yDp.OLrzqt(new ArbitrageInfoResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArbitrageTotalPnlInfo) null, (String) null, (List) null, (String) null, (String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (String) null, (String) null, (String) null, (List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, (String) null, (String) null, false, 16777215, (DefaultConstructorMarker) null), Boolean.TRUE));
            return;
        }
        C54223xAl c54223xAl = this.EZpvd;
        c54223xAl.AEQbTJ(str);
        c54223xAl.gEmmrt(str2.length() == 0 ? "10000" : str2);
        c54223xAl.KWHzl("simpleFundingFee");
        c54223xAl.EZpvd((str3 == null || str3.length() == 0) ? null : str3);
        c54223xAl.OLrzqt(str4);
        c54223xAl.copydefault(str5);
        c54223xAl.OLrzqt(f);
        c54223xAl.djBIcL("1");
        c54223xAl.KWHzl(subArbitrageType4Remote);
        c54223xAl.OLrzqt(this.copydefault, new StateListAnimator());
        c54223xAl.OLrzqt(0L);
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends ArbitrageInfoResponse>, Pair<? extends ArbitrageInfoResponse, ? extends Boolean>> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Pair<ArbitrageInfoResponse, Boolean> KWHzl(List<ArbitrageInfoResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArbitrageInfoResponse arbitrageInfoResponse = (ArbitrageInfoResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (arbitrageInfoResponse == null) {
                arbitrageInfoResponse = new ArbitrageInfoResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArbitrageTotalPnlInfo) null, (String) null, (List) null, (String) null, (String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (String) null, (String) null, (String) null, (List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, (String) null, (String) null, false, 16777215, (DefaultConstructorMarker) null);
            }
            return C56390yDp.OLrzqt(arbitrageInfoResponse, Boolean.TRUE);
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.EZpvd);
    }
}
