package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel;
import com.okinc.business.defi.wallet.home.bean.AddressAliasResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetInfoViewModel$loadAddressProfileInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    int label;
    final /* synthetic */ AddressProfileAssetInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileAssetInfoViewModel$loadAddressProfileInfo$1(AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel, String str, Continuation<? super AddressProfileAssetInfoViewModel$loadAddressProfileInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = addressProfileAssetInfoViewModel;
        this.$address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileAssetInfoViewModel$loadAddressProfileInfo$1(this.this$0, this.$address, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileAssetInfoViewModel$loadAddressProfileInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0 A[EDGE_INSN: B:55:0x00c0->B:45:0x00c0 BREAK  A[LOOP:0: B:40:0x00ac->B:57:?], SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel = this.this$0;
            this.label = 1;
            obj = addressProfileAssetInfoViewModel.AEQbTJ((Continuation<? super List<AddressAliasResponse>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel2 = this.this$0;
                    this.label = 3;
                    obj = addressProfileAssetInfoViewModel2.KWHzl((Continuation<? super List<String>>) this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    String str = this.$address;
                    it = ((Iterable) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                    if (((String) obj2) == null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                String str2 = this.$address;
                it = ((Iterable) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.EZpvd(next, (Object) str2)) {
                        obj2 = next;
                        break;
                    }
                }
                if (((String) obj2) == null) {
                    this.this$0.AhwBna = false;
                    MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
                    AddressProfileAssetInfoViewModel.FollowUiState.ActionBar actionBar = new AddressProfileAssetInfoViewModel.FollowUiState.ActionBar(false);
                    this.label = 4;
                    if (mutableSharedFlow.emit(actionBar, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    this.this$0.AhwBna = true;
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
                    AddressProfileAssetInfoViewModel.FollowUiState.ActionBar actionBar2 = new AddressProfileAssetInfoViewModel.FollowUiState.ActionBar(true);
                    this.label = 5;
                    if (mutableSharedFlow2.emit(actionBar2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str3 = this.$address;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : (Iterable) obj) {
            if (Intrinsics.EZpvd((Object) ((AddressAliasResponse) obj3).KWHzl(), (Object) str3)) {
                arrayList.add(obj3);
            }
        }
        AddressAliasResponse addressAliasResponse = (AddressAliasResponse) CollectionsKt___CollectionsKt.AkhnZx(arrayList, 0);
        this.this$0.AYXKKw = addressAliasResponse != null ? addressAliasResponse.EZpvd() : null;
        MutableSharedFlow mutableSharedFlow3 = this.this$0.KWHzl;
        AddressProfileAssetInfoViewModel.AliasUIState.Application application = new AddressProfileAssetInfoViewModel.AliasUIState.Application(addressAliasResponse != null ? addressAliasResponse.EZpvd() : null);
        this.label = 2;
        if (mutableSharedFlow3.emit(application, this) == objCopydefault) {
            return objCopydefault;
        }
        AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel22 = this.this$0;
        this.label = 3;
        obj = addressProfileAssetInfoViewModel22.KWHzl((Continuation<? super List<String>>) this);
        if (obj == objCopydefault) {
        }
        String str22 = this.$address;
        it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        if (((String) obj2) == null) {
        }
        return Unit.INSTANCE;
    }
}
