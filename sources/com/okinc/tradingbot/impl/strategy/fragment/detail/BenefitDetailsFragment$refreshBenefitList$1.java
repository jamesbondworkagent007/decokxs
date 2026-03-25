package com.okinc.tradingbot.impl.strategy.fragment.detail;

import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import com.okinc.tradingbot.impl.strategy.fragment.detail.BenefitDetailsFragment$refreshBenefitList$1;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C33064mpR;
import o.C33070mpX;
import o.C33129mqd;
import o.C52585wQw;
import o.C52761wXj;
import o.C54121wyQ;
import o.C55258xgZ;
import o.C55296xhK;
import o.C55312xha;
import o.C55320xhi;
import o.C55688xof;
import o.C55804xqp;
import o.C55887xsS;
import o.C56033xvF;
import o.C56068xvo;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class BenefitDetailsFragment$refreshBenefitList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C54121wyQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitDetailsFragment$refreshBenefitList$1(C54121wyQ c54121wyQ, Continuation<? super BenefitDetailsFragment$refreshBenefitList$1> continuation) {
        super(2, continuation);
        this.this$0 = c54121wyQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BenefitDetailsFragment$refreshBenefitList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BenefitDetailsFragment$refreshBenefitList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C54121wyQ AYXKKw;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ String KWHzl;
        public final /* synthetic */ C55258xgZ OLrzqt;
        public final /* synthetic */ Ref.ObjectRef copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, C55258xgZ c55258xgZ, Ref.ObjectRef objectRef, C54121wyQ c54121wyQ, String str) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c55258xgZ;
            this.copydefault = objectRef;
            this.AYXKKw = c54121wyQ;
            this.KWHzl = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r7v15, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r7v22, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String strAYXKKw;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C55312xha c55312xhaValueOf = this.OLrzqt.valueOf();
                if (c55312xhaValueOf == null || !c55312xhaValueOf.AEQbTJ()) {
                    return;
                }
                String orderType = ((BenefitDetails) this.copydefault.element).getOrderType();
                if (Intrinsics.EZpvd((Object) orderType, (Object) "smart_arbitrage")) {
                    this.AYXKKw.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.areNotificationsEnabled), C33070mpX.AYXKKw(C55688xof.Application.getCurrent));
                    return;
                }
                if (Intrinsics.EZpvd((Object) orderType, (Object) "contract_grid")) {
                    if (C33129mqd.OLrzqt((CharSequence) ((BenefitDetails) this.copydefault.element).getSourceCcy())) {
                        strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.newInstance);
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaDescriptionCompatApi23);
                    }
                    this.AYXKKw.AEQbTJ(strAYXKKw, C33070mpX.AYXKKw(C55688xof.Application.getCurrent));
                    return;
                }
                if (C33129mqd.OLrzqt((CharSequence) ((BenefitDetails) this.copydefault.element).getSourceCcy())) {
                    this.AYXKKw.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.newInstance), C33070mpX.AYXKKw(C55688xof.Application.getCurrent));
                } else {
                    this.AYXKKw.copydefault(this.KWHzl);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C55804xqp<StrategyDetailsResponse> c55804xqp;
        final C54121wyQ c54121wyQ;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        final String sourceCcy;
        String priceUnit;
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C55804xqp<StrategyDetailsResponse> value = this.this$0.valueOf().getNewProxyInstance().getValue();
            if (value != null) {
                C54121wyQ c54121wyQ2 = this.this$0;
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                BenefitDetailsFragment$refreshBenefitList$1$1$1 benefitDetailsFragment$refreshBenefitList$1$1$1 = new BenefitDetailsFragment$refreshBenefitList$1$1$1(objectRef4, c54121wyQ2, value, objectRef3, null);
                this.L$0 = c54121wyQ2;
                this.L$1 = value;
                this.L$2 = objectRef3;
                this.L$3 = objectRef4;
                this.label = 1;
                if (BuildersKt.withContext(io2, benefitDetailsFragment$refreshBenefitList$1$1$1, this) == objCopydefault) {
                    return objCopydefault;
                }
                c55804xqp = value;
                c54121wyQ = c54121wyQ2;
                objectRef = objectRef3;
                objectRef2 = objectRef4;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = (Ref.ObjectRef) this.L$3;
        objectRef = (Ref.ObjectRef) this.L$2;
        c55804xqp = (C55804xqp) this.L$1;
        c54121wyQ = (C54121wyQ) this.L$0;
        C56391yDq.AEQbTJ(obj);
        c54121wyQ.copydefault((List<StrategyProfitResponse>) ((BenefitDetails) objectRef2.element).getProfitList());
        String orderType = ((BenefitDetails) objectRef2.element).getOrderType();
        int iHashCode = orderType.hashCode();
        if (iHashCode == -1216369070) {
            if (!orderType.equals("smart_portfolio")) {
                sourceCcy = ((BenefitDetails) objectRef2.element).getSourceCcy();
                priceUnit = ((BenefitDetails) objectRef2.element).getPriceUnit();
                if (sourceCcy != null) {
                    sourceCcy = priceUnit;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (iHashCode != -512749997) {
                if (iHashCode == 1165749981 && orderType.equals("recurring")) {
                    sourceCcy = ((BenefitDetails) objectRef2.element).getPriceUnit();
                }
            } else if (orderType.equals("contract_grid")) {
                sourceCcy = C56033xvF.valueOf(((BenefitDetails) objectRef2.element).getInstId(), ((BenefitDetails) objectRef2.element).getInstType(), ((BenefitDetails) objectRef2.element).getPnlCcy());
            }
            sourceCcy = ((BenefitDetails) objectRef2.element).getSourceCcy();
            priceUnit = ((BenefitDetails) objectRef2.element).getPriceUnit();
            if (sourceCcy != null || sourceCcy.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) sourceCcy)) {
                sourceCcy = priceUnit;
            }
        }
        if (sourceCcy.length() == 0) {
            sourceCcy = ((BenefitDetails) objectRef2.element).getInvestmentCcy();
        }
        String str = (String) c54121wyQ.valueOf().KWHzl(new Function1() { // from class: o.wzi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return BenefitDetailsFragment$refreshBenefitList$1.invokeSuspend$lambda$6$lambda$1(sourceCcy, c54121wyQ, (C55887xsS) obj2);
            }
        });
        String str2 = "(" + str + ")";
        C55258xgZ c55258xgZ = c54121wyQ.gGvvIC().valueOf;
        C55312xha c55312xhaValueOf = c55258xgZ.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setText(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " " + str2);
        }
        C55312xha c55312xhaValueOf2 = c55258xgZ.valueOf();
        if (c55312xhaValueOf2 != null) {
            c55312xhaValueOf2.setShowUnderline(yDY.gEmmrt("grid", "contract_grid", "smart_arbitrage", "smart_portfolio").contains(((BenefitDetails) objectRef2.element).getOrderType()));
        }
        C55312xha c55312xhaValueOf3 = c55258xgZ.valueOf();
        if (c55312xhaValueOf3 != null && (c55320xhiKWHzl = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl.setUnderlineColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, c55258xgZ, objectRef2, c54121wyQ, str));
        c54121wyQ.copydefault = ((BenefitDetails) objectRef2.element).getTotalPnl();
        c54121wyQ.gGvvIC().AYXKKw.setText(((BenefitDetails) objectRef2.element).getTotalPnl());
        c54121wyQ.gGvvIC().EZpvd.setText(C56068xvo.copydefault.copydefault(((BenefitDetails) objectRef2.element).getPnlRatio(), true));
        c54121wyQ.gGvvIC().EZpvd.setTextColor(C56033xvF.OLrzqt((Object) ((BenefitDetails) objectRef2.element).getPnlRatio()));
        c54121wyQ.gGvvIC().AhwBna.setData(new ArrayList(), ((BenefitDetails) objectRef2.element).getLatestProfit(), ((BenefitDetails) objectRef2.element).getTotalPnl(), ((BenefitDetails) objectRef2.element).getPnlRatio());
        TextView textView = c54121wyQ.gGvvIC().EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.AhwBna(((BenefitDetails) objectRef2.element).getPnlRatio(), C56443yFo.AEQbTJ(0)) ? 0 : 8);
        c54121wyQ.gGvvIC().AhwBna.KWHzl(c54121wyQ.dxcTrN().KWHzl().getInstId(), c54121wyQ.dxcTrN().KWHzl().getInstType(), str2, c54121wyQ.dxcTrN().KWHzl().getOrderType());
        C33064mpR.OLrzqt(c54121wyQ.isConnected(), (List<? extends Object>) objectRef.element);
        TacticsVoucherInfo voucherInfo = c55804xqp.copydefault().getVoucherInfo();
        if (voucherInfo != null && voucherInfo.getVoucherType() == TacticsVoucherType.INTEREST_RATE) {
            C52585wQw c52585wQw = c54121wyQ.gGvvIC().djBIcL;
            Intrinsics.copydefault(c52585wQw);
            c52585wQw.setVisibility(0);
            c52585wQw.setRewardsData(voucherInfo, ((BenefitDetails) objectRef2.element).getInstId(), ((BenefitDetails) objectRef2.element).getInstType(), sourceCcy);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$6$lambda$1(String str, C54121wyQ c54121wyQ, C55887xsS c55887xsS) {
        return (str == null || str.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) str)) ? c55887xsS.copydefault(c54121wyQ.dxcTrN().KWHzl().getOrderType()) : str;
    }
}
