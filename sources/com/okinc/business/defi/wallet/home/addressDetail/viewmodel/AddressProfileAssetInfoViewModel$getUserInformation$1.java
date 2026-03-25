package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel;
import com.okinc.business.defi.wallet.home.bean.UserAdressInfo;
import com.okinc.business.defi.wallet.home.bean.WalletAddressTagListInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.CompactTagData;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C18913frQ;
import o.C18959fsJ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetInfoViewModel$getUserInformation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Long> $chainIndexList;
    final /* synthetic */ String $collectAddress;
    final /* synthetic */ Set<Long> $supportPnlChainSet;
    Object L$0;
    int label;
    final /* synthetic */ AddressProfileAssetInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileAssetInfoViewModel$getUserInformation$1(AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel, String str, List<Long> list, Set<Long> set, Continuation<? super AddressProfileAssetInfoViewModel$getUserInformation$1> continuation) {
        super(2, continuation);
        this.this$0 = addressProfileAssetInfoViewModel;
        this.$collectAddress = str;
        this.$chainIndexList = list;
        this.$supportPnlChainSet = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileAssetInfoViewModel$getUserInformation$1(this.this$0, this.$collectAddress, this.$chainIndexList, this.$supportPnlChainSet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileAssetInfoViewModel$getUserInformation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        UserAdressInfo userAdressInfo;
        WalletAddressTagListInfo walletAddressTagListInfo;
        List list;
        List<CompactTagData> listOLrzqt;
        MutableSharedFlow mutableSharedFlow;
        AddressProfileAssetInfoViewModel.AddressTagUIState.StateListAnimator stateListAnimator;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel = this.this$0;
            String str = this.$collectAddress;
            List<Long> list2 = this.$chainIndexList;
            this.label = 1;
            obj = addressProfileAssetInfoViewModel.OLrzqt(str, (List<Long>) list2, (Continuation<? super UserAdressInfo>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    userAdressInfo = (UserAdressInfo) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    list = (List) obj;
                    mutableSharedFlow = this.this$0.copydefault;
                    stateListAnimator = new AddressProfileAssetInfoViewModel.AddressTagUIState.StateListAnimator(userAdressInfo == null ? userAdressInfo.copydefault() : null, userAdressInfo != null ? userAdressInfo.KWHzl() : null, list);
                    this.L$0 = userAdressInfo;
                    this.label = 4;
                    if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                userAdressInfo = (UserAdressInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                walletAddressTagListInfo = (WalletAddressTagListInfo) obj;
                if (walletAddressTagListInfo != null || (listOLrzqt = walletAddressTagListInfo.OLrzqt()) == null) {
                    list = null;
                    mutableSharedFlow = this.this$0.copydefault;
                    stateListAnimator = new AddressProfileAssetInfoViewModel.AddressTagUIState.StateListAnimator(userAdressInfo == null ? userAdressInfo.copydefault() : null, userAdressInfo != null ? userAdressInfo.KWHzl() : null, list);
                    this.L$0 = userAdressInfo;
                    this.label = 4;
                    if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel2 = this.this$0;
                C18959fsJ c18959fsJ = C18959fsJ.OLrzqt;
                C18913frQ c18913frQ = addressProfileAssetInfoViewModel2.gEmmrt;
                this.L$0 = userAdressInfo;
                this.label = 3;
                obj = c18959fsJ.OLrzqt(listOLrzqt, c18913frQ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                list = (List) obj;
                mutableSharedFlow = this.this$0.copydefault;
                stateListAnimator = new AddressProfileAssetInfoViewModel.AddressTagUIState.StateListAnimator(userAdressInfo == null ? userAdressInfo.copydefault() : null, userAdressInfo != null ? userAdressInfo.KWHzl() : null, list);
                this.L$0 = userAdressInfo;
                this.label = 4;
                if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        UserAdressInfo userAdressInfo2 = (UserAdressInfo) obj;
        List<Long> list3 = this.$chainIndexList;
        Set<Long> set = this.$supportPnlChainSet;
        Iterator<T> it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (set.contains(C56443yFo.KWHzl(((Number) next).longValue()))) {
                break;
            }
        }
        Long l = (Long) next;
        if (l == null) {
            l = (Long) CollectionsKt___CollectionsKt.firstOrNull(this.$chainIndexList);
        }
        AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModel3 = this.this$0;
        String str2 = this.$collectAddress;
        this.L$0 = userAdressInfo2;
        this.label = 2;
        Object objAEQbTJ = addressProfileAssetInfoViewModel3.AEQbTJ(str2, l, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        userAdressInfo = userAdressInfo2;
        obj = objAEQbTJ;
        walletAddressTagListInfo = (WalletAddressTagListInfo) obj;
        if (walletAddressTagListInfo != null) {
        }
        list = null;
        mutableSharedFlow = this.this$0.copydefault;
        stateListAnimator = new AddressProfileAssetInfoViewModel.AddressTagUIState.StateListAnimator(userAdressInfo == null ? userAdressInfo.copydefault() : null, userAdressInfo != null ? userAdressInfo.KWHzl() : null, list);
        this.L$0 = userAdressInfo;
        this.label = 4;
        if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
