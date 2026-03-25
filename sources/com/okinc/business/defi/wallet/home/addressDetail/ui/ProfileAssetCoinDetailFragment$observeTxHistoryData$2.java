package com.okinc.business.defi.wallet.home.addressDetail.ui;

import com.okinc.business.defi.biz.net.bean.AddressCoinBalanceDetail;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC16580emc;
import o.C10854bwM;
import o.C10948byA;
import o.C10954byG;
import o.C15878eYq;
import o.C19394gAt;
import o.C54870xYj;
import o.C54880xYt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class ProfileAssetCoinDetailFragment$observeTxHistoryData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15878eYq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetCoinDetailFragment$observeTxHistoryData$2(C15878eYq c15878eYq, Continuation<? super ProfileAssetCoinDetailFragment$observeTxHistoryData$2> continuation) {
        super(2, continuation);
        this.this$0 = c15878eYq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileAssetCoinDetailFragment$observeTxHistoryData$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileAssetCoinDetailFragment$observeTxHistoryData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$observeTxHistoryData$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AddressTokenAsset, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15878eYq this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15878eYq c15878eYq, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15878eYq;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AddressTokenAsset addressTokenAsset, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(addressTokenAsset, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<AddressCoinBalanceDetail> coinBalanceDetails;
            AddressCoinBalanceDetail addressCoinBalanceDetail;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AddressTokenAsset addressTokenAsset = (AddressTokenAsset) this.L$0;
                if (addressTokenAsset != null && (coinBalanceDetails = addressTokenAsset.getCoinBalanceDetails()) != null && (addressCoinBalanceDetail = (AddressCoinBalanceDetail) CollectionsKt___CollectionsKt.firstOrNull(coinBalanceDetails)) != null) {
                    C15878eYq c15878eYq = this.this$0;
                    C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
                    String address = addressCoinBalanceDetail.getAddress();
                    if (address == null) {
                        address = "";
                    }
                    C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(address, addressCoinBalanceDetail.getChainIndex());
                    AbstractC16580emc abstractC16580emc = c15878eYq.values;
                    AbstractC16580emc abstractC16580emc2 = null;
                    if (abstractC16580emc == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16580emc = null;
                    }
                    C19394gAt.setCoinCount$default(abstractC16580emc.OLrzqt, C54870xYj.OLrzqt(addressCoinBalanceDetail.getCoinAmount(), (249 & 1) != 0 ? 0 : 0, c10854bwMEZpvd != null ? c10854bwMEZpvd.AkhnZx() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null), null, 2, null);
                    AbstractC16580emc abstractC16580emc3 = c15878eYq.values;
                    if (abstractC16580emc3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16580emc2 = abstractC16580emc3;
                    }
                    abstractC16580emc2.OLrzqt.setValuation(C54880xYt.formatValuationFromAsset$default(addressCoinBalanceDetail.getCurrencyAmount(), null, false, 0, false, 15, null));
                }
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
            MutableSharedFlow<AddressTokenAsset> mutableSharedFlowAEQbTJ = this.this$0.OLrzqt().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableSharedFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
