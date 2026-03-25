package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitItem;
import com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitsResponse;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33064mpR;
import o.C33069mpW;
import o.C33129mqd;
import o.C38307pTy;
import o.C53418wlC;
import o.C54012wwN;
import o.C55249xgQ;
import o.C55688xof;
import o.C56033xvF;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.pTB;
import o.uSJ;
import o.vNB;
import o.wOQ;
import o.wUM;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfitsFragment$initListener$3 extends SuspendLambda implements Function2<vNB<? extends ArbitrageStakingProfitsResponse>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C54012wwN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitsFragment$initListener$3(C54012wwN c54012wwN, Continuation<? super ProfitsFragment$initListener$3> continuation) {
        super(2, continuation);
        this.this$0 = c54012wwN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfitsFragment$initListener$3 profitsFragment$initListener$3 = new ProfitsFragment$initListener$3(this.this$0, continuation);
        profitsFragment$initListener$3.L$0 = obj;
        return profitsFragment$initListener$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends ArbitrageStakingProfitsResponse> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<ArbitrageStakingProfitsResponse>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<ArbitrageStakingProfitsResponse> vnb, Continuation<? super Unit> continuation) {
        return ((ProfitsFragment$initListener$3) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            int i = 8;
            if (vnb instanceof vNB.TaskDescription) {
                ArbitrageStakingProfitsResponse arbitrageStakingProfitsResponse = (ArbitrageStakingProfitsResponse) ((vNB.TaskDescription) vnb).AEQbTJ();
                ArbitrageStakingProfitItem arbitrageStakingProfitItemKWHzl = arbitrageStakingProfitsResponse.KWHzl();
                List<ArbitrageStakingProfitItem> listOLrzqt = arbitrageStakingProfitsResponse.OLrzqt();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                for (ArbitrageStakingProfitItem arbitrageStakingProfitItem : listOLrzqt) {
                    arrayList.add(new wOQ(arbitrageStakingProfitItem.copydefault(), arbitrageStakingProfitItem.KWHzl(), 6, arbitrageStakingProfitItem.OLrzqt()));
                }
                List<ArbitrageStakingProfitItem> listOLrzqt2 = arbitrageStakingProfitsResponse.OLrzqt();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
                for (ArbitrageStakingProfitItem arbitrageStakingProfitItem2 : listOLrzqt2) {
                    arrayList2.add(new wOQ(arbitrageStakingProfitItem2.copydefault(), arbitrageStakingProfitItem2.AEQbTJ(), 3, "USDT"));
                }
                uSJ usj = this.this$0.gEmmrt;
                if (usj != null) {
                    C54012wwN c54012wwN = this.this$0;
                    if (arbitrageStakingProfitItemKWHzl == null || c54012wwN.AuCTel().isHistory()) {
                        LinearLayoutCompat linearLayoutCompat = usj.valueOf;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                        linearLayoutCompat.setVisibility(8);
                        wUM wum = usj.djBIcL;
                        Intrinsics.checkNotNullExpressionValue(wum, "");
                        wum.setVisibility(8);
                    } else {
                        wUM wum2 = usj.djBIcL;
                        wum2.setTargetTimestamp(C33129mqd.valueOf(arbitrageStakingProfitItemKWHzl.copydefault()));
                        wum2.EZpvd();
                        Intrinsics.copydefault(wum2);
                    }
                    RecyclerView recyclerView = usj.AuCTelauCTel;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                    recyclerView.setVisibility(arbitrageStakingProfitsResponse.OLrzqt().isEmpty() ^ true ? 0 : 8);
                    TextView textView = usj.AubY;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(arbitrageStakingProfitsResponse.AEQbTJ() ? 0 : 8);
                    View view = usj.uzCIH;
                    Intrinsics.checkNotNullExpressionValue(view, "");
                    LinearLayoutCompat linearLayoutCompat2 = usj.valueOf;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
                    if (linearLayoutCompat2.getVisibility() != 0) {
                        wUM wum3 = usj.djBIcL;
                        Intrinsics.checkNotNullExpressionValue(wum3, "");
                        if (wum3.getVisibility() != 0) {
                            RecyclerView recyclerView2 = usj.AuCTelauCTel;
                            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                            if (recyclerView2.getVisibility() != 0) {
                                TextView textView2 = usj.AubY;
                                Intrinsics.checkNotNullExpressionValue(textView2, "");
                                if (textView2.getVisibility() == 0) {
                                }
                                view.setVisibility(i);
                                C55249xgQ c55249xgQ = usj.wlaJM;
                                Application application = new Application(usj, arbitrageStakingProfitItemKWHzl, c54012wwN, arrayList, arrayList2);
                                c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) application);
                                c54012wwN.getFieldNames = application;
                                c55249xgQ.selectTab(c54012wwN.isConnected);
                            }
                        }
                    } else {
                        i = 0;
                        view.setVisibility(i);
                        C55249xgQ c55249xgQ2 = usj.wlaJM;
                        Application application2 = new Application(usj, arbitrageStakingProfitItemKWHzl, c54012wwN, arrayList, arrayList2);
                        c55249xgQ2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) application2);
                        c54012wwN.getFieldNames = application2;
                        c55249xgQ2.selectTab(c54012wwN.isConnected);
                    }
                }
            } else if (vnb instanceof vNB.StateListAnimator) {
                uSJ usj2 = this.this$0.gEmmrt;
                if (usj2 != null) {
                    LinearLayoutCompat linearLayoutCompat3 = usj2.AxsJAY;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
                    linearLayoutCompat3.setVisibility(8);
                    LinearLayoutCompat linearLayoutCompat4 = usj2.iwGUEr;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
                    linearLayoutCompat4.setVisibility(8);
                }
            } else if (!(vnb instanceof vNB.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class Application implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ ArbitrageStakingProfitItem AEQbTJ;
        public final /* synthetic */ uSJ EZpvd;
        public final /* synthetic */ List<wOQ> KWHzl;
        public final /* synthetic */ List<wOQ> OLrzqt;
        public final /* synthetic */ C54012wwN copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application(uSJ usj, ArbitrageStakingProfitItem arbitrageStakingProfitItem, C54012wwN c54012wwN, List<wOQ> list, List<wOQ> list2) {
            this.EZpvd = usj;
            this.AEQbTJ = arbitrageStakingProfitItem;
            this.copydefault = c54012wwN;
            this.KWHzl = list;
            this.OLrzqt = list2;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onTabSelected(TabLayout.Tab tab) {
            ProfitDetailResponse quote;
            SmartArbitrageVo smartArbitrage;
            ProfitDetailResponse autoStakingProfit;
            ProfitDetailResponse quote2;
            SmartArbitrageVo smartArbitrage2;
            if (tab != null) {
                boolean z = tab.getId() == 1;
                int i = z ? 6 : 3;
                uSJ usj = this.EZpvd;
                LinearLayoutCompat linearLayoutCompat = usj.getFieldNames;
                C54012wwN c54012wwN = this.copydefault;
                Intrinsics.copydefault(linearLayoutCompat);
                linearLayoutCompat.setVisibility(c54012wwN.AkhnZx() ? 0 : 8);
                if (z) {
                    quote = c54012wwN.AuCTel().getStakingProfit();
                } else {
                    ProfitDetailResponse stakingProfit = c54012wwN.AuCTel().getStakingProfit();
                    quote = stakingProfit != null ? stakingProfit.getQuote() : null;
                }
                usj.zsXlph.setText(C33069mpW.copydefault(C55688xof.Application.ITrustedWebActivityService, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", C53418wlC.KWHzl(quote != null ? quote.getCcy() : null)))));
                TextView textView = usj.zLjUOn;
                BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(quote != null ? quote.getTotal() : null);
                C38307pTy.Application application = C38307pTy.Companion;
                C38307pTy c38307pTyAEQbTJ = application.AEQbTJ(i);
                DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
                textView.setText(pTB.formatICUNumber$default(bigDecimalEZpvd, null, c38307pTyAEQbTJ, displaySign, null, 9, null));
                textView.setTextColor(C56033xvF.OLrzqt((Object) (quote != null ? quote.getTotal() : null)));
                uSJ usj2 = this.EZpvd;
                LinearLayoutCompat linearLayoutCompat2 = usj2.fJNWhG;
                C54012wwN c54012wwN2 = this.copydefault;
                Intrinsics.copydefault(linearLayoutCompat2);
                linearLayoutCompat2.setVisibility(c54012wwN2.values() ? 0 : 8);
                if (z) {
                    BotVo bot = c54012wwN2.AuCTel().getBot();
                    quote2 = (bot == null || (smartArbitrage2 = bot.getSmartArbitrage()) == null) ? null : smartArbitrage2.getAutoStakingProfit();
                } else {
                    BotVo bot2 = c54012wwN2.AuCTel().getBot();
                    if (bot2 != null && (smartArbitrage = bot2.getSmartArbitrage()) != null && (autoStakingProfit = smartArbitrage.getAutoStakingProfit()) != null) {
                        quote2 = autoStakingProfit.getQuote();
                    }
                }
                TextView textView2 = usj2.hDKMBd;
                textView2.setGravity(c54012wwN2.AkhnZx() ? 8388611 : 8388613);
                int i2 = C55688xof.Application.ITrustedWebActivityService;
                String ccy = quote2 != null ? quote2.getCcy() : null;
                String strFIwbmz = z ? c54012wwN2.fIwbmz() : c54012wwN2.uzCIH();
                if (ccy == null || ccy.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) ccy)) {
                    ccy = strFIwbmz;
                }
                textView2.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy))));
                TextView textView3 = usj2.getNewProxyInstance;
                textView3.setGravity(c54012wwN2.AkhnZx() ? 8388611 : 8388613);
                textView3.setText(pTB.formatICUNumber$default(C33129mqd.EZpvd(quote2 != null ? quote2.getTotal() : null), null, application.AEQbTJ(i), displaySign, null, 9, null));
                textView3.setTextColor(C56033xvF.OLrzqt((Object) (quote2 != null ? quote2.getTotal() : null)));
                ArbitrageStakingProfitItem arbitrageStakingProfitItem = this.AEQbTJ;
                if (arbitrageStakingProfitItem != null) {
                    String strKWHzl = z ? arbitrageStakingProfitItem.KWHzl() : arbitrageStakingProfitItem.AEQbTJ();
                    TextView textView4 = this.EZpvd.fetchVPNInfo;
                    textView4.setText(pTB.formatICUNumber$default(C33129mqd.EZpvd(strKWHzl), null, application.AEQbTJ(i), displaySign, null, 9, null));
                    textView4.setTextColor(C56033xvF.OLrzqt((Object) strKWHzl));
                }
                C33064mpR.OLrzqt(this.copydefault.fetchVPNInfo(), z ? this.KWHzl : this.OLrzqt);
            }
        }
    }
}
