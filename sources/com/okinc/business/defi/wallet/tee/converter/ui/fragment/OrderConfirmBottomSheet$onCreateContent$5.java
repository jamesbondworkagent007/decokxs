package com.okinc.business.defi.wallet.tee.converter.ui.fragment;

import android.widget.TextView;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.OKServerException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC43419rot;
import o.C10854bwM;
import o.C13754dXa;
import o.C17030evB;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C52794wYp;
import o.C54870xYj;
import o.C54880xYt;
import o.C56391yDq;
import o.C56442yFn;
import o.fUF;
import o.wYF;

/* JADX INFO: loaded from: classes18.dex */
public final class OrderConfirmBottomSheet$onCreateContent$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C17030evB $binding;
    int label;
    final /* synthetic */ fUF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmBottomSheet$onCreateContent$5(fUF fuf, C17030evB c17030evB, Continuation<? super OrderConfirmBottomSheet$onCreateContent$5> continuation) {
        super(2, continuation);
        this.this$0 = fuf;
        this.$binding = c17030evB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderConfirmBottomSheet$onCreateContent$5(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrderConfirmBottomSheet$onCreateContent$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$onCreateContent$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C17030evB $binding;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fUF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fUF fuf, C17030evB c17030evB, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fuf;
            this.$binding = c17030evB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$binding, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException> abstractC43419rot, Continuation<? super Unit> continuation) {
            return invoke2((AbstractC43419rot<SmallAssetQuoteData, OKServerException>) abstractC43419rot, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AbstractC43419rot<SmallAssetQuoteData, OKServerException> abstractC43419rot, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC43419rot, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C52794wYp c52794wYpCopydefault;
            C52794wYp c52794wYpCopydefault2;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC43419rot abstractC43419rot = (AbstractC43419rot) this.L$0;
                C10854bwM c10854bwMDjBIcL = this.this$0.gEmmrt().djBIcL();
                if (c10854bwMDjBIcL == null) {
                    return Unit.INSTANCE;
                }
                SmallAssetQuoteData smallAssetQuoteData = abstractC43419rot != null ? (SmallAssetQuoteData) abstractC43419rot.copydefault() : null;
                if (smallAssetQuoteData == null || smallAssetQuoteData.getQuotes().isEmpty()) {
                    this.$binding.isConnected.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setPlaybackToRemote));
                    this.$binding.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
                    wYF wyf = this.this$0.KWHzl;
                    if (wyf != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                        c52794wYpCopydefault.setEnabled(false);
                    }
                    this.$binding.valueOf.setEnabled(false);
                    this.$binding.AYXKKw.setEnabled(false);
                }
                if (smallAssetQuoteData == null) {
                    return Unit.INSTANCE;
                }
                if (!smallAssetQuoteData.getQuotes().isEmpty()) {
                    this.$binding.isConnected.setText(C54870xYj.OLrzqt(smallAssetQuoteData.getTotalExpectedAmountOut(), (249 & 1) != 0 ? 0 : 0, c10854bwMDjBIcL.AkhnZx(), c10854bwMDjBIcL.fJNWhG(), (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null) + " (" + C54880xYt.formatValuation$default(C33129mqd.EZpvd(smallAssetQuoteData.getTotalExpectedAmountOutUsd()), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null) + ")");
                    this.$binding.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                    wYF wyf2 = this.this$0.KWHzl;
                    if (wyf2 != null && (c52794wYpCopydefault2 = wyf2.copydefault()) != null) {
                        c52794wYpCopydefault2.setEnabled(true);
                    }
                    this.$binding.valueOf.setEnabled(true);
                    this.$binding.AYXKKw.setEnabled(true);
                }
                TextView textView = this.$binding.AEQbTJ;
                String strOLrzqt = C54870xYj.OLrzqt(smallAssetQuoteData.getTotalMinAmountOut(), (249 & 1) != 0 ? 0 : 0, c10854bwMDjBIcL.AkhnZx(), c10854bwMDjBIcL.fJNWhG(), (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(smallAssetQuoteData.getEstimateMinAmountOutNativeTokenUsd());
                CurrencyDisplayStyle currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX;
                textView.setText(strOLrzqt + " (" + C54880xYt.formatValuation$default(bigDecimalEZpvd, 0, 0, null, currencyDisplayStyle, null, null, false, 119, null) + ")");
                this.$binding.KWHzl.setText(C54870xYj.OLrzqt(smallAssetQuoteData.getEstimateNetworkFeeNativeAmt(), (249 & 1) != 0 ? 0 : 0, c10854bwMDjBIcL.AkhnZx(), c10854bwMDjBIcL.fJNWhG(), (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null) + " (" + C54880xYt.formatValuation$default(C33129mqd.EZpvd(smallAssetQuoteData.getEstimatedGasFeeUsd()), 0, 0, null, currencyDisplayStyle, null, null, false, 119, null) + ")");
                this.$binding.djBIcL.setText(this.this$0.copydefault(smallAssetQuoteData.getOriginalServiceFeeRate(), smallAssetQuoteData.getDiscountedServiceFeeRate(), false, true));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<AbstractC43419rot<SmallAssetQuoteData, OKServerException>> stateFlowValues = this.this$0.gEmmrt().values();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$binding, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowValues, anonymousClass1, this) == objCopydefault) {
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
}
