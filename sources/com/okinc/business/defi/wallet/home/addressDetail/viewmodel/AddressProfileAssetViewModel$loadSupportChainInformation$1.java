package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C10854bwM;
import o.C56391yDq;
import o.C56442yFn;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetViewModel$loadSupportChainInformation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    int label;
    final /* synthetic */ AddressProfileAssetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileAssetViewModel$loadSupportChainInformation$1(AddressProfileAssetViewModel addressProfileAssetViewModel, String str, Continuation<? super AddressProfileAssetViewModel$loadSupportChainInformation$1> continuation) {
        super(2, continuation);
        this.this$0 = addressProfileAssetViewModel;
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileAssetViewModel$loadSupportChainInformation$1(this.this$0, this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileAssetViewModel$loadSupportChainInformation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<C10854bwM> listEZpvd = this.this$0.gEmmrt.EZpvd(this.$address);
            ArrayList arrayList = new ArrayList();
            for (C10854bwM c10854bwM : listEZpvd) {
                if (c10854bwM.fetchVPNInfo() >= 0) {
                    arrayList.add(new ProfileAssetChooseNetworkDialogFragment.NetworkData(c10854bwM.AYXKKw(), c10854bwM.djBIcL(), c10854bwM.fJNWhG(), "0", c10854bwM.fetchVPNInfo(), c10854bwM.ORxRYg(), c10854bwM.hBpjJd(), false, (String) null, MLKEMEngine.KyberPolyBytes, (DefaultConstructorMarker) null));
                }
            }
            MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
            this.label = 1;
            if (mutableSharedFlow.emit(arrayList, this) == objCopydefault) {
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
