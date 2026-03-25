package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.ArbInvestDetailsBean;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.EstimatedClosePnlVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.SmartArbitrageModificationReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C54221xAj;
import o.C54224xAm;
import o.C54507xKz;
import o.C56111xwe;
import o.C56390yDp;
import o.InterfaceC54501xKt;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotGridOpenPositionConditionPresenter extends AbsPresenter {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt;
    public final C56111xwe<Pair<ArbInvestDetailsBean, Boolean>> AEQbTJ;
    public final C54221xAj EZpvd;
    public final C56111xwe<StrategyResponse> KWHzl;
    public final C54224xAm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = C56111xwe.AEQbTJ;
        OLrzqt = i | C54224xAm.copydefault | i | C54221xAj.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54224xAm AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54221xAj KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<StrategyResponse> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<Pair<ArbInvestDetailsBean, Boolean>> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGridOpenPositionConditionPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C54221xAj();
        this.AEQbTJ = new C56111xwe<>();
        this.copydefault = new C54224xAm();
        this.KWHzl = new C56111xwe<>();
    }

    public final void KWHzl(String str, String str2, PlaceOrderCondition placeOrderCondition) {
        SmartArbitrageModificationReq smartArbitrageModificationReq = new SmartArbitrageModificationReq((String) null, (String) null, (PlaceOrderCondition) null, 7, (DefaultConstructorMarker) null);
        smartArbitrageModificationReq.setAlgoId(str);
        smartArbitrageModificationReq.setConditionType(str2);
        smartArbitrageModificationReq.setCondition(placeOrderCondition);
        C54224xAm c54224xAm = this.copydefault;
        c54224xAm.copydefault(smartArbitrageModificationReq);
        c54224xAm.OLrzqt(this.KWHzl, new C54507xKz());
        xKK.Activity.execute$default(c54224xAm, 0L, 1, null);
    }

    public static /* synthetic */ boolean isValidSpreadRatio$default(BotGridOpenPositionConditionPresenter botGridOpenPositionConditionPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return botGridOpenPositionConditionPresenter.EZpvd(str);
    }

    public final boolean EZpvd(String str) {
        return str == null || str.length() == 0 || (C33129mqd.copydefault(str, "-10") && C33129mqd.valueOf(str, "10"));
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str7, "");
        if (str.length() == 0 || str2.length() == 0 || str6 == null || str6.length() == 0 || !EZpvd(str4)) {
            return;
        }
        C54221xAj c54221xAj = this.EZpvd;
        c54221xAj.copydefault(str);
        c54221xAj.EZpvd(str2);
        c54221xAj.gEmmrt(str3);
        c54221xAj.AEQbTJ((str4 == null || str4.length() == 0) ? null : C33129mqd.divS$default(str4, 100, null, null, null, 14, null));
        c54221xAj.OLrzqt(str5);
        c54221xAj.KWHzl(str6);
        c54221xAj.OLrzqt(this.AEQbTJ, new StateListAnimator(z, str3, str7));
        c54221xAj.OLrzqt(300L);
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends ArbInvestDetailsBean>, Pair<? extends ArbInvestDetailsBean, ? extends Boolean>> {
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ String KWHzl;
        public final /* synthetic */ String OLrzqt;

        public StateListAnimator(boolean z, String str, String str2) {
            this.EZpvd = z;
            this.OLrzqt = str;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Pair<ArbInvestDetailsBean, Boolean> KWHzl(List<ArbInvestDetailsBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArbInvestDetailsBean arbInvestDetailsBean = (ArbInvestDetailsBean) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (arbInvestDetailsBean == null) {
                arbInvestDetailsBean = new ArbInvestDetailsBean((List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArbInvestDetailsBeanStakingType4UI) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArbitrageTotalPnlInfo) null, false, (String) null, (String) null, (EstimatedStakingVo) null, (String) null, (String) null, (String) null, (List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, 67108863, (DefaultConstructorMarker) null);
            }
            String str = this.OLrzqt;
            String str2 = this.KWHzl;
            arbInvestDetailsBean.setTotalAmt(str);
            arbInvestDetailsBean.setUnit(str2);
            return C56390yDp.OLrzqt(arbInvestDetailsBean, Boolean.valueOf(this.EZpvd));
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.EZpvd);
        arrayList.add(this.copydefault);
        return arrayList;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.BotGridOpenPositionConditionPresenter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
