package com.okinc.business.defi.wallet.home.addressDetail;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel;
import com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC16600emw;
import o.C19251fxk;
import o.C33054mpH;
import o.C33129mqd;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.eVR;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletProfileAssetDetailFragment$initListener$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProfileAssetDetailFragment$initListener$4(eVR evr, Continuation<? super DefiWalletProfileAssetDetailFragment$initListener$4> continuation) {
        super(2, continuation);
        this.this$0 = evr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletProfileAssetDetailFragment$initListener$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletProfileAssetDetailFragment$initListener$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AddressProfileAssetInfoViewModel.AddressTagUIState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ eVR this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eVR evr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = evr;
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
        public final Object invoke(AddressProfileAssetInfoViewModel.AddressTagUIState addressTagUIState, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(addressTagUIState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC16600emw abstractC16600emw;
            C19251fxk c19251fxk;
            AppCompatImageView appCompatImageView;
            AppCompatImageView appCompatImageView2;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AddressProfileAssetInfoViewModel.AddressTagUIState addressTagUIState = (AddressProfileAssetInfoViewModel.AddressTagUIState) this.L$0;
                if (!(addressTagUIState instanceof AddressProfileAssetInfoViewModel.AddressTagUIState.StateListAnimator)) {
                    throw new NoWhenBranchMatchedException();
                }
                AddressProfileAssetInfoViewModel.AddressTagUIState.StateListAnimator stateListAnimator = (AddressProfileAssetInfoViewModel.AddressTagUIState.StateListAnimator) addressTagUIState;
                if (C33129mqd.OLrzqt((CharSequence) stateListAnimator.AEQbTJ())) {
                    eVR evr = this.this$0;
                    String strAEQbTJ = stateListAnimator.AEQbTJ();
                    if (strAEQbTJ == null) {
                        strAEQbTJ = "";
                    }
                    evr.DTwDnp = strAEQbTJ;
                    AbstractC16600emw abstractC16600emw2 = this.this$0.fetchVPNInfo;
                    if (abstractC16600emw2 != null && (appCompatImageView2 = abstractC16600emw2.zuBGHE) != null) {
                        C55296xhK.EZpvd((View) appCompatImageView2, 8.0f);
                    }
                    AbstractC16600emw abstractC16600emw3 = this.this$0.fetchVPNInfo;
                    if (abstractC16600emw3 != null && (appCompatImageView = abstractC16600emw3.zuBGHE) != null) {
                        C33054mpH.AEQbTJ(appCompatImageView, stateListAnimator.AEQbTJ());
                    }
                }
                if (C33129mqd.OLrzqt((CharSequence) stateListAnimator.EZpvd()) && stateListAnimator.EZpvd() != null) {
                    this.this$0.OcIXYQ = stateListAnimator.EZpvd();
                    eVR evr2 = this.this$0;
                    evr2.EZpvd(evr2.valueOf);
                }
                if (stateListAnimator.OLrzqt() != null && (!r0.isEmpty()) && (abstractC16600emw = this.this$0.fetchVPNInfo) != null && (c19251fxk = abstractC16600emw.AxsJAY) != null) {
                    this.this$0.KWHzl((List<TagWrapper>) stateListAnimator.OLrzqt(), c19251fxk);
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
            SharedFlow<AddressProfileAssetInfoViewModel.AddressTagUIState> sharedFlowEZpvd = this.this$0.valueOf().EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowEZpvd, anonymousClass1, this) == objCopydefault) {
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
