package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetInfoViewModel$callUpdateAddressAlias$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $collectAddress;
    final /* synthetic */ Context $context;
    final /* synthetic */ FragmentManager $fragmentManager;
    Object L$0;
    int label;
    final /* synthetic */ AddressProfileAssetInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileAssetInfoViewModel$callUpdateAddressAlias$1(AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel, String str, Context context, FragmentManager fragmentManager, Continuation<? super AddressProfileAssetInfoViewModel$callUpdateAddressAlias$1> continuation) {
        super(2, continuation);
        this.this$0 = addressProfileAssetInfoViewModel;
        this.$collectAddress = str;
        this.$context = context;
        this.$fragmentManager = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileAssetInfoViewModel$callUpdateAddressAlias$1(this.this$0, this.$collectAddress, this.$context, this.$fragmentManager, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileAssetInfoViewModel$callUpdateAddressAlias$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (Intrinsics.EZpvd((Object) this.this$0.AYXKKw, (Object) this.$collectAddress) || (str = this.this$0.AYXKKw) == null || str.length() == 0) {
                str = "";
            }
            addressProfileAssetInfoViewModel = this.this$0;
            Context context = this.$context;
            FragmentManager fragmentManager = this.$fragmentManager;
            String str2 = this.$collectAddress;
            this.L$0 = addressProfileAssetInfoViewModel;
            this.label = 1;
            obj = addressProfileAssetInfoViewModel.KWHzl(context, fragmentManager, str2, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault(this.$collectAddress);
                return Unit.INSTANCE;
            }
            addressProfileAssetInfoViewModel = (AddressProfileAssetInfoViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        addressProfileAssetInfoViewModel.AYXKKw = (String) obj;
        MutableSharedFlow mutableSharedFlow = this.this$0.KWHzl;
        AddressProfileAssetInfoViewModel.AliasUIState.StateListAnimator stateListAnimator = new AddressProfileAssetInfoViewModel.AliasUIState.StateListAnimator(this.this$0.AYXKKw);
        this.L$0 = null;
        this.label = 2;
        if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
            return objCopydefault;
        }
        this.this$0.copydefault(this.$collectAddress);
        return Unit.INSTANCE;
    }
}
