package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.net.bean.CheckBatchChainResp;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressWithMemo;
import com.okinc.wallet.widget.input.address.WalletAddressInput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import o.AbstractC43419rot;
import o.C10854bwM;
import o.C10948byA;
import o.C13934dbu;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class MultiTransferInputAddressViewModel$batchCheckTonExchangeAddress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $addresses;
    final /* synthetic */ boolean $isMultiInput;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ MultiTransferInputAddressViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTransferInputAddressViewModel$batchCheckTonExchangeAddress$1(MultiTransferInputAddressViewModel multiTransferInputAddressViewModel, List<String> list, boolean z, Continuation<? super MultiTransferInputAddressViewModel$batchCheckTonExchangeAddress$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTransferInputAddressViewModel;
        this.$addresses = list;
        this.$isMultiInput = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTransferInputAddressViewModel$batchCheckTonExchangeAddress$1(this.this$0, this.$addresses, this.$isMultiInput, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MultiTransferInputAddressViewModel$batchCheckTonExchangeAddress$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1127=4] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0245  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C10854bwM c10854bwMKWHzl;
        AbstractC43419rot abstractC43419rot;
        MultiTransferInputAddressViewModel multiTransferInputAddressViewModel;
        boolean z;
        List<String> list;
        CheckBatchChainResp checkBatchChainResp;
        ArrayList<String> arrayList;
        Map<String, Boolean> checkResult;
        Collection collectionAhwBna;
        ArrayList arrayList2;
        List<WalletAddressInput.Address> listAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                Channel channel = this.this$0.fetchVPNInfo;
                MultiTransferInputAddressViewModel.Companion.LoadingStatus loadingStatus = MultiTransferInputAddressViewModel.Companion.LoadingStatus.LOADING;
                this.label = 1;
                if (channel.send(loadingStatus, this) == objCopydefault) {
                    return objCopydefault;
                }
                C10948byA c10948byA = this.this$0.OLrzqt;
                MultiTransferSignData multiTransferSignDataFetchVPNInfo = this.this$0.fetchVPNInfo();
                c10854bwMKWHzl = c10948byA.KWHzl(multiTransferSignDataFetchVPNInfo == null ? multiTransferSignDataFetchVPNInfo.getCoinId() : -1L);
                if (c10854bwMKWHzl != null) {
                    return Unit.INSTANCE;
                }
                C13934dbu c13934dbu = new C13934dbu();
                long jFetchVPNInfo = c10854bwMKWHzl.fetchVPNInfo();
                List<String> list2 = this.$addresses;
                this.label = 2;
                obj = c13934dbu.copydefault(jFetchVPNInfo, 1, list2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot = (AbstractC43419rot) obj;
                multiTransferInputAddressViewModel = this.this$0;
                z = this.$isMultiInput;
                list = this.$addresses;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    checkBatchChainResp = (CheckBatchChainResp) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    Channel channel2 = multiTransferInputAddressViewModel.fetchVPNInfo;
                    MultiTransferInputAddressViewModel.Companion.LoadingStatus loadingStatus2 = MultiTransferInputAddressViewModel.Companion.LoadingStatus.SUCCESS;
                    this.L$0 = multiTransferInputAddressViewModel;
                    this.L$1 = list;
                    this.L$2 = abstractC43419rot;
                    this.L$3 = checkBatchChainResp;
                    this.Z$0 = z;
                    this.label = 3;
                    if (channel2.send(loadingStatus2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    arrayList = new ArrayList();
                    checkResult = checkBatchChainResp.getCheckResult();
                    if (checkResult == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, Boolean> entry : checkResult.entrySet()) {
                            if (entry.getValue().booleanValue()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        collectionAhwBna = new ArrayList(linkedHashMap.size());
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            collectionAhwBna.add((String) ((Map.Entry) it.next()).getKey());
                        }
                    } else {
                        collectionAhwBna = yDY.AhwBna();
                    }
                    arrayList.addAll(collectionAhwBna);
                    if (!C33129mqd.AEQbTJ(C56443yFo.AEQbTJ(arrayList.size()), C56443yFo.AEQbTJ(0))) {
                        multiTransferInputAddressViewModel.djBIcL = true;
                        if (z) {
                            arrayList2 = new ArrayList();
                            for (String str : arrayList) {
                                WalletAddressInput walletAddressInputAYXKKw = multiTransferInputAddressViewModel.AYXKKw();
                                WalletAddressInput.MultiAddress multiAddress = walletAddressInputAYXKKw instanceof WalletAddressInput.MultiAddress ? (WalletAddressInput.MultiAddress) walletAddressInputAYXKKw : null;
                                if (multiAddress != null && (listAEQbTJ = multiAddress.AEQbTJ()) != null) {
                                    int i = 0;
                                    for (Object obj2 : listAEQbTJ) {
                                        if (i < 0) {
                                            yDY.AYXKKw();
                                        }
                                        WalletAddressInput.Address address = (WalletAddressInput.Address) obj2;
                                        if (Intrinsics.EZpvd((Object) address.AEQbTJ(), (Object) str)) {
                                            address.AEQbTJ(true);
                                            arrayList2.add(new AddressWithMemo(address.AEQbTJ(), "", false, i));
                                        }
                                        i++;
                                    }
                                }
                            }
                        } else {
                            arrayList2 = new ArrayList();
                            for (String str2 : arrayList) {
                                WalletAddressInput walletAddressInputAYXKKw2 = multiTransferInputAddressViewModel.AYXKKw();
                                WalletAddressInput.OnlyOneAddress onlyOneAddress = walletAddressInputAYXKKw2 instanceof WalletAddressInput.OnlyOneAddress ? (WalletAddressInput.OnlyOneAddress) walletAddressInputAYXKKw2 : null;
                                if (Intrinsics.EZpvd((Object) (onlyOneAddress != null ? onlyOneAddress.copydefault() : null), (Object) str2)) {
                                    WalletAddressInput walletAddressInputAYXKKw3 = multiTransferInputAddressViewModel.AYXKKw();
                                    WalletAddressInput.OnlyOneAddress onlyOneAddress2 = walletAddressInputAYXKKw3 instanceof WalletAddressInput.OnlyOneAddress ? (WalletAddressInput.OnlyOneAddress) walletAddressInputAYXKKw3 : null;
                                    if (onlyOneAddress2 != null) {
                                        onlyOneAddress2.copydefault(true);
                                    }
                                    arrayList2.add(new AddressWithMemo(str2, "", false, 0));
                                }
                            }
                        }
                        Channel channel3 = multiTransferInputAddressViewModel.getNewProxyInstance;
                        Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList2, list);
                        this.L$0 = abstractC43419rot;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 4;
                        if (channel3.send(pairOLrzqt, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (z) {
                        Channel channel4 = multiTransferInputAddressViewModel.fARcdN;
                        MultiTransferInputAddressViewModel.ActionBar.C0325ActionBar c0325ActionBar = new MultiTransferInputAddressViewModel.ActionBar.C0325ActionBar(list);
                        this.L$0 = abstractC43419rot;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 5;
                        if (channel4.send(c0325ActionBar, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        Channel channel5 = multiTransferInputAddressViewModel.fARcdN;
                        MultiTransferInputAddressViewModel.ActionBar.StateListAnimator stateListAnimator = new MultiTransferInputAddressViewModel.ActionBar.StateListAnimator((String) CollectionsKt___CollectionsKt.AuCTelauCTel(list));
                        this.L$0 = abstractC43419rot;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 6;
                        if (channel5.send(stateListAnimator, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                MultiTransferInputAddressViewModel multiTransferInputAddressViewModel2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    Channel channel6 = multiTransferInputAddressViewModel2.fetchVPNInfo;
                    MultiTransferInputAddressViewModel.Companion.LoadingStatus loadingStatus3 = MultiTransferInputAddressViewModel.Companion.LoadingStatus.FAILED;
                    this.L$0 = abstractC43419rot;
                    this.label = 7;
                    if (channel6.send(loadingStatus3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C10948byA c10948byA2 = this.this$0.OLrzqt;
                MultiTransferSignData multiTransferSignDataFetchVPNInfo2 = this.this$0.fetchVPNInfo();
                c10854bwMKWHzl = c10948byA2.KWHzl(multiTransferSignDataFetchVPNInfo2 == null ? multiTransferSignDataFetchVPNInfo2.getCoinId() : -1L);
                if (c10854bwMKWHzl != null) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                multiTransferInputAddressViewModel = this.this$0;
                z = this.$isMultiInput;
                list = this.$addresses;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                }
                MultiTransferInputAddressViewModel multiTransferInputAddressViewModel22 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            case 3:
                boolean z2 = this.Z$0;
                checkBatchChainResp = (CheckBatchChainResp) this.L$3;
                AbstractC43419rot abstractC43419rot2 = (AbstractC43419rot) this.L$2;
                list = (List) this.L$1;
                multiTransferInputAddressViewModel = (MultiTransferInputAddressViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                z = z2;
                abstractC43419rot = abstractC43419rot2;
                arrayList = new ArrayList();
                checkResult = checkBatchChainResp.getCheckResult();
                if (checkResult == null) {
                }
                arrayList.addAll(collectionAhwBna);
                if (!C33129mqd.AEQbTJ(C56443yFo.AEQbTJ(arrayList.size()), C56443yFo.AEQbTJ(0))) {
                }
                MultiTransferInputAddressViewModel multiTransferInputAddressViewModel222 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
            case 6:
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                MultiTransferInputAddressViewModel multiTransferInputAddressViewModel2222 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
