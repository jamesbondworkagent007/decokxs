package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.biz.net.bean.AddressAllAssetResponse;
import com.okinc.business.defi.biz.net.bean.AddressAllAssetToken;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eWW;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetViewModel$loadMoreAssetInformation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Long> $chainIndexes;
    final /* synthetic */ Ref.IntRef $nextPage;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AddressProfileAssetViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileAssetViewModel$loadMoreAssetInformation$1(AddressProfileAssetViewModel addressProfileAssetViewModel, List<Long> list, Ref.IntRef intRef, Continuation<? super AddressProfileAssetViewModel$loadMoreAssetInformation$1> continuation) {
        super(2, continuation);
        this.this$0 = addressProfileAssetViewModel;
        this.$chainIndexes = list;
        this.$nextPage = intRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileAssetViewModel$loadMoreAssetInformation$1(this.this$0, this.$chainIndexes, this.$nextPage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileAssetViewModel$loadMoreAssetInformation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r7v11, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r7v9, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objEZpvd;
        AbstractC43419rot abstractC43419rot;
        AddressProfileAssetViewModel addressProfileAssetViewModel;
        List<AddressTokenAsset> listAhwBna;
        AbstractC43419rot abstractC43419rot2;
        MutableSharedFlow<Boolean> mutableSharedFlowValues;
        Boolean boolKWHzl;
        AddressProfileAssetViewModel addressProfileAssetViewModel2;
        MutableSharedFlow<Boolean> mutableSharedFlowAhwBna;
        Boolean boolKWHzl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            eWW eww = this.this$0.djBIcL;
            String str = this.this$0.valueOf;
            List<Long> list = this.$chainIndexes;
            int i3 = this.$nextPage.element;
            int i4 = this.this$0.fJNWhG;
            this.label = 1;
            i = 1;
            objEZpvd = eww.EZpvd(str, list, false, false, i3, i4, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    abstractC43419rot = (AbstractC43419rot) this.L$2;
                    addressProfileAssetViewModel = (AddressProfileAssetViewModel) this.L$1;
                    abstractC43419rot2 = (AbstractC43419rot) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    i = 1;
                    mutableSharedFlowValues = addressProfileAssetViewModel.values();
                    boolKWHzl = C56443yFo.KWHzl(addressProfileAssetViewModel.AYXKKw() >= addressProfileAssetViewModel.wlaJM ? i : 0);
                    this.L$0 = abstractC43419rot2;
                    this.L$1 = abstractC43419rot;
                    this.L$2 = null;
                    this.label = 3;
                    if (mutableSharedFlowValues.emit(boolKWHzl, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC43419rot = abstractC43419rot2;
                    addressProfileAssetViewModel2 = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    abstractC43419rot = (AbstractC43419rot) this.L$1;
                    addressProfileAssetViewModel2 = (AddressProfileAssetViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlowAhwBna = addressProfileAssetViewModel2.AhwBna();
                    boolKWHzl2 = C56443yFo.KWHzl(false);
                    this.L$0 = abstractC43419rot;
                    this.L$1 = null;
                    this.label = 5;
                    if (mutableSharedFlowAhwBna.emit(boolKWHzl2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                addressProfileAssetViewModel2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    MutableSharedFlow<List<AddressTokenAsset>> mutableSharedFlowFetchVPNInfo = addressProfileAssetViewModel2.fetchVPNInfo();
                    List<AddressTokenAsset> listAhwBna2 = yDY.AhwBna();
                    this.L$0 = addressProfileAssetViewModel2;
                    this.L$1 = abstractC43419rot;
                    this.label = 4;
                    if (mutableSharedFlowFetchVPNInfo.emit(listAhwBna2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlowAhwBna = addressProfileAssetViewModel2.AhwBna();
                    boolKWHzl2 = C56443yFo.KWHzl(false);
                    this.L$0 = abstractC43419rot;
                    this.L$1 = null;
                    this.label = 5;
                    if (mutableSharedFlowAhwBna.emit(boolKWHzl2, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
            i = 1;
        }
        abstractC43419rot = (AbstractC43419rot) objEZpvd;
        addressProfileAssetViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            AddressAllAssetResponse addressAllAssetResponse = (AddressAllAssetResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            AddressAllAssetToken tokens = addressAllAssetResponse.getTokens();
            int total = tokens != null ? tokens.getTotal() : i;
            AddressAllAssetToken tokens2 = addressAllAssetResponse.getTokens();
            int pageSize = tokens2 != null ? tokens2.getPageSize() : i;
            addressProfileAssetViewModel.wlaJM = total / pageSize;
            if (total % pageSize > 0) {
                addressProfileAssetViewModel.wlaJM++;
            }
            AddressAllAssetToken tokens3 = addressAllAssetResponse.getTokens();
            addressProfileAssetViewModel.copydefault(tokens3 != null ? tokens3.getCurrentPage() : i);
            MutableSharedFlow<List<AddressTokenAsset>> mutableSharedFlowFetchVPNInfo2 = addressProfileAssetViewModel.fetchVPNInfo();
            AddressAllAssetToken tokens4 = addressAllAssetResponse.getTokens();
            if (tokens4 == null || (listAhwBna = tokens4.getTokenlist()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            this.L$0 = abstractC43419rot;
            this.L$1 = addressProfileAssetViewModel;
            this.L$2 = abstractC43419rot;
            this.label = 2;
            if (mutableSharedFlowFetchVPNInfo2.emit(listAhwBna, this) == objCopydefault) {
                return objCopydefault;
            }
            abstractC43419rot2 = abstractC43419rot;
            mutableSharedFlowValues = addressProfileAssetViewModel.values();
            boolKWHzl = C56443yFo.KWHzl(addressProfileAssetViewModel.AYXKKw() >= addressProfileAssetViewModel.wlaJM ? i : 0);
            this.L$0 = abstractC43419rot2;
            this.L$1 = abstractC43419rot;
            this.L$2 = null;
            this.label = 3;
            if (mutableSharedFlowValues.emit(boolKWHzl, this) != objCopydefault) {
            }
        }
        addressProfileAssetViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
