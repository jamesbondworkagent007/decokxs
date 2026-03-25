package com.okinc.business.defi.wallet.transfer.receive;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$showAlertBannerInfo$1;
import com.okinc.uilab.banner.OKAlertBanner;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16646enp;
import o.C13754dXa;
import o.C21050gsT;
import o.C21053gsW;
import o.C33069mpW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.ViewOnClickListenerC20995grR;

/* JADX INFO: loaded from: classes5.dex */
public final class ReceiveCoinQrCodeFragment$showAlertBannerInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ViewOnClickListenerC20995grR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveCoinQrCodeFragment$showAlertBannerInfo$1(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, Continuation<? super ReceiveCoinQrCodeFragment$showAlertBannerInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC20995grR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReceiveCoinQrCodeFragment$showAlertBannerInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReceiveCoinQrCodeFragment$showAlertBannerInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$showAlertBannerInfo$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C21050gsT, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ViewOnClickListenerC20995grR this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = viewOnClickListenerC20995grR;
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
        public final Object invoke(C21050gsT c21050gsT, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c21050gsT, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C21050gsT c21050gsT = (C21050gsT) this.L$0;
                if (c21050gsT != null) {
                    AbstractC16646enp abstractC16646enp = this.this$0.AuCTelauCTel;
                    AbstractC16646enp abstractC16646enp2 = null;
                    if (abstractC16646enp == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16646enp = null;
                    }
                    OKAlertBanner oKAlertBanner = abstractC16646enp.hDKMBd;
                    Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
                    oKAlertBanner.setVisibility(c21050gsT.EZpvd() ? 0 : 8);
                    if (c21050gsT.EZpvd()) {
                        String strCopydefault = C33069mpW.copydefault(this.this$0, C13754dXa.FragmentManager.toInclusive, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C56443yFo.AEQbTJ(c21050gsT.AEQbTJ()))));
                        AbstractC16646enp abstractC16646enp3 = this.this$0.AuCTelauCTel;
                        if (abstractC16646enp3 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16646enp2 = abstractC16646enp3;
                        }
                        OKAlertBanner oKAlertBanner2 = abstractC16646enp2.hDKMBd;
                        final ViewOnClickListenerC20995grR viewOnClickListenerC20995grR = this.this$0;
                        oKAlertBanner2.setMessage(strCopydefault);
                        oKAlertBanner2.setOnClickListener(new View.OnClickListener() { // from class: o.gsz
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                ReceiveCoinQrCodeFragment$showAlertBannerInfo$1.AnonymousClass1.invokeSuspend$lambda$1$lambda$0(viewOnClickListenerC20995grR, view);
                            }
                        });
                    }
                    this.this$0.fIwbmz();
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1$lambda$0(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, View view) {
            C21053gsW c21053gsWKWHzl = C21053gsW.Companion.KWHzl(viewOnClickListenerC20995grR.RJOkX);
            FragmentManager childFragmentManager = viewOnClickListenerC20995grR.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C21053gsW.show$default(c21053gsWKWHzl, childFragmentManager, "SmartWalletChainInfoBottomSheet", null, 4, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<C21050gsT> stateFlowAEQbTJ = this.this$0.AkhnZx().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
