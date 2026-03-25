package com.okinc.tradingbot.impl.strategy.guide.view;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractGridPresenter;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import com.okinc.unify_trade.biz.VoucherStatus;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C33129mqd;
import o.C52468wMn;
import o.C52534wOz;
import o.C55251xgS;
import o.C55980xuF;
import o.C56111xwe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.xMR;

/* JADX INFO: loaded from: classes19.dex */
public final class BotGuideLossInsuranceView$countDownTimer$1$1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C52468wMn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideLossInsuranceView$countDownTimer$1$1(C52468wMn c52468wMn, Continuation<? super BotGuideLossInsuranceView$countDownTimer$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c52468wMn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotGuideLossInsuranceView$countDownTimer$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((BotGuideLossInsuranceView$countDownTimer$1$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.OLrzqt == null) {
                return Unit.INSTANCE;
            }
            LossInsuranceDisplayData lossInsuranceDisplayData = this.this$0.OLrzqt;
            Intrinsics.copydefault(lossInsuranceDisplayData);
            Pair pairCopydefault = this.this$0.copydefault(C33129mqd.valueOf(C33129mqd.subS$default(C33129mqd.mulS$default(lossInsuranceDisplayData.getVoucherExpireTime(), C56443yFo.AEQbTJ(1000), null, null, null, 14, null), C56443yFo.KWHzl(System.currentTimeMillis()), null, null, null, 14, null)));
            boolean zBooleanValue = ((Boolean) pairCopydefault.component1()).booleanValue();
            C55980xuF c55980xuF = (C55980xuF) pairCopydefault.component2();
            pUU.EZpvd("BotGuideLossInsuranceView", "countDownTimer: " + c55980xuF);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(zBooleanValue, this.this$0, c55980xuF, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.guide.view.BotGuideLossInsuranceView$countDownTimer$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $available;
        final /* synthetic */ C55980xuF $timeBean;
        int label;
        final /* synthetic */ C52468wMn this$0;

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.guide.view.BotGuideLossInsuranceView$countDownTimer$1$1$1$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TacticsVoucherType.values().length];
                try {
                    iArr[TacticsVoucherType.AIRDROP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, C52468wMn c52468wMn, C55980xuF c55980xuF, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$available = z;
            this.this$0 = c52468wMn;
            this.$timeBean = c55980xuF;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$available, this.this$0, this.$timeBean, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String code;
            C56111xwe<LossInsuranceDisplayData> c56111xweHDKMBd;
            C56111xwe<LossInsuranceDisplayData> c56111xweHDKMBd2;
            LossInsuranceDisplayData value;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                LossInsuranceDisplayData lossInsuranceDisplayDataCopy = null;
                if (!this.$available || this.this$0.OLrzqt == null) {
                    Job job = this.this$0.KWHzl;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    LinearLayout linearLayout = this.this$0.copydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                    linearLayout.setVisibility(8);
                    AppCompatTextView appCompatTextView = this.this$0.copydefault.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                    appCompatTextView.setVisibility(0);
                    LossInsuranceDisplayData lossInsuranceDisplayData = this.this$0.OLrzqt;
                    TacticsVoucherType voucherType = lossInsuranceDisplayData != null ? lossInsuranceDisplayData.getVoucherType() : null;
                    if (voucherType != null && TaskDescription.EZpvd[voucherType.ordinal()] == 1) {
                        code = VoucherStatus.AirdropVoucherStatus.EXPIRED.getCode();
                    } else {
                        code = VoucherStatus.LossInsuranceVoucherStatus.EXPIRED.getCode();
                    }
                    String str = code;
                    BotGuideContractGridPresenter botGuideContractGridPresenterOLrzqt = this.this$0.OLrzqt();
                    if (botGuideContractGridPresenterOLrzqt != null && (c56111xweHDKMBd = botGuideContractGridPresenterOLrzqt.hDKMBd()) != null) {
                        BotGuideContractGridPresenter botGuideContractGridPresenterOLrzqt2 = this.this$0.OLrzqt();
                        if (botGuideContractGridPresenterOLrzqt2 != null && (c56111xweHDKMBd2 = botGuideContractGridPresenterOLrzqt2.hDKMBd()) != null && (value = c56111xweHDKMBd2.getValue()) != null) {
                            lossInsuranceDisplayDataCopy = value.copy((8189 & 1) != 0 ? value.amount : null, (8189 & 2) != 0 ? value.status : str, (8189 & 4) != 0 ? value.eligible : null, (8189 & 8) != 0 ? value.botType : null, (8189 & 16) != 0 ? value.instIds : null, (8189 & 32) != 0 ? value.isShowExplainDialog : false, (8189 & 64) != 0 ? value.realTimestamp : null, (8189 & 128) != 0 ? value.voucherExpireTime : null, (8189 & 256) != 0 ? value.pTime : null, (8189 & 512) != 0 ? value.voucherCcy : null, (8189 & 1024) != 0 ? value.voucherId : null, (8189 & 2048) != 0 ? value.shouldReloadParams : false, (8189 & 4096) != 0 ? value.voucherType : null);
                        }
                        c56111xweHDKMBd.setValue(lossInsuranceDisplayDataCopy);
                    }
                } else {
                    LinearLayout linearLayout2 = this.this$0.copydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                    linearLayout2.setVisibility(0);
                    AppCompatTextView appCompatTextView2 = this.this$0.copydefault.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                    appCompatTextView2.setVisibility(8);
                    C55980xuF c55980xuF = this.$timeBean;
                    if (c55980xuF != null) {
                        C52468wMn c52468wMn = this.this$0;
                        C52534wOz c52534wOz = C52534wOz.KWHzl;
                        C55251xgS c55251xgS = c52468wMn.copydefault.copydefault;
                        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                        xMR xmr = xMR.copydefault;
                        LossInsuranceDisplayData lossInsuranceDisplayData2 = c52468wMn.OLrzqt;
                        Intrinsics.copydefault(lossInsuranceDisplayData2);
                        String amount = lossInsuranceDisplayData2.getAmount();
                        if (amount == null) {
                            amount = "--";
                        }
                        String strCopydefault = xmr.copydefault(amount);
                        LossInsuranceDisplayData lossInsuranceDisplayData3 = c52468wMn.OLrzqt;
                        Intrinsics.copydefault(lossInsuranceDisplayData3);
                        String voucherCcy = lossInsuranceDisplayData3.getVoucherCcy();
                        if (voucherCcy == null) {
                            voucherCcy = "USDT";
                        }
                        c52534wOz.EZpvd(c55251xgS, new TacticsListLabelVoucherData(strCopydefault + " " + voucherCcy, false, 0, 0, 0, null, 62, null));
                        if (Intrinsics.EZpvd((Object) c55980xuF.KWHzl(), (Object) "00")) {
                            LinearLayout linearLayout3 = c52468wMn.copydefault.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                            linearLayout3.setVisibility(0);
                        } else {
                            LinearLayout linearLayout4 = c52468wMn.copydefault.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                            linearLayout4.setVisibility(8);
                            Job job2 = c52468wMn.KWHzl;
                            if (job2 != null) {
                                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                            }
                        }
                        c52468wMn.copydefault.gEmmrt.setText(c55980xuF.EZpvd());
                        c52468wMn.copydefault.djBIcL.setText(c55980xuF.OLrzqt());
                        c52468wMn.copydefault.AYXKKw.setText(c55980xuF.AEQbTJ());
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
