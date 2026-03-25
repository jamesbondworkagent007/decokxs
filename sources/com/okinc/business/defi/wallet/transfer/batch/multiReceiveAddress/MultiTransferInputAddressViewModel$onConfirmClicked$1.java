package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressWithMemo;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ErrorMessage;
import com.okinc.wallet.widget.input.address.WalletAddressInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import o.C10854bwM;
import o.C13754dXa;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class MultiTransferInputAddressViewModel$onConfirmClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MultiTransferInputAddressViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTransferInputAddressViewModel$onConfirmClicked$1(MultiTransferInputAddressViewModel multiTransferInputAddressViewModel, Continuation<? super MultiTransferInputAddressViewModel$onConfirmClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTransferInputAddressViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTransferInputAddressViewModel$onConfirmClicked$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MultiTransferInputAddressViewModel$onConfirmClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [942=4] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        WalletAddressInput walletAddressInputAYXKKw;
        WalletAddressInput walletAddressInput;
        MultiTransferSignData multiTransferSignDataFetchVPNInfo;
        MultiTransferSignData multiTransferSignDataFetchVPNInfo2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MultiTransferSignData multiTransferSignDataFetchVPNInfo3 = this.this$0.fetchVPNInfo();
                if (multiTransferSignDataFetchVPNInfo3 != null) {
                    C10854bwM c10854bwMKWHzl = this.this$0.OLrzqt.KWHzl(multiTransferSignDataFetchVPNInfo3.getCoinId());
                    boolean zDGOPHZ = c10854bwMKWHzl != null ? c10854bwMKWHzl.DGOPHZ() : true;
                    walletAddressInputAYXKKw = this.this$0.AYXKKw();
                    if (walletAddressInputAYXKKw instanceof WalletAddressInput.OnlyOneAddress) {
                        WalletAddressInput.OnlyOneAddress onlyOneAddress = (WalletAddressInput.OnlyOneAddress) walletAddressInputAYXKKw;
                        String string = StringsKt__StringsKt.hDKMBd((CharSequence) onlyOneAddress.copydefault()).toString();
                        if (!this.this$0.OLrzqt(string)) {
                            this.this$0.EZpvd(new ErrorMessage(C13754dXa.FragmentManager.ReportDrawnKt, null, 2, null));
                        } else if (this.this$0.valueOf().size() != 1 && (multiTransferSignDataFetchVPNInfo2 = this.this$0.fetchVPNInfo()) != null && multiTransferSignDataFetchVPNInfo2.getTransferType() == 3) {
                            Channel channel = this.this$0.fARcdN;
                            MultiTransferInputAddressViewModel.ActionBar.Activity activity = new MultiTransferInputAddressViewModel.ActionBar.Activity(this.this$0.valueOf().size());
                            this.label = 1;
                            if (channel.send(activity, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else if (this.this$0.djBIcL) {
                            Channel channel2 = this.this$0.getNewProxyInstance;
                            ArrayList arrayList = new ArrayList();
                            if (onlyOneAddress.djBIcL()) {
                                arrayList.add(new AddressWithMemo(onlyOneAddress.copydefault(), onlyOneAddress.KWHzl(), false, 0));
                            }
                            Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList, C56402yEa.EZpvd(string));
                            this.label = 2;
                            if (channel2.send(pairOLrzqt, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else if (zDGOPHZ) {
                            this.this$0.EZpvd((List<String>) C56402yEa.EZpvd(string), false);
                        } else {
                            Channel channel3 = this.this$0.fARcdN;
                            MultiTransferInputAddressViewModel.ActionBar.StateListAnimator stateListAnimator = new MultiTransferInputAddressViewModel.ActionBar.StateListAnimator(string);
                            this.label = 3;
                            if (channel3.send(stateListAnimator, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else {
                        if (!(walletAddressInputAYXKKw instanceof WalletAddressInput.MultiAddress)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        WalletAddressInput.MultiAddress multiAddress = (WalletAddressInput.MultiAddress) walletAddressInputAYXKKw;
                        List<WalletAddressInput.Address> listAEQbTJ = multiAddress.AEQbTJ();
                        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                        Iterator<T> it = listAEQbTJ.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((WalletAddressInput.Address) it.next()).AEQbTJ());
                        }
                        List<WalletAddressInput.Address> listAEQbTJ2 = multiAddress.AEQbTJ();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : listAEQbTJ2) {
                            if (!((WalletAddressInput.Address) obj2).OLrzqt()) {
                                arrayList3.add(obj2);
                            }
                        }
                        if (C33129mqd.valueOf(C56443yFo.AEQbTJ(arrayList3.size()), C56443yFo.AEQbTJ(0))) {
                            if (this.this$0.valueOf().size() != arrayList2.size() && (multiTransferSignDataFetchVPNInfo = this.this$0.fetchVPNInfo()) != null && multiTransferSignDataFetchVPNInfo.getTransferType() == 3) {
                                Channel channel4 = this.this$0.fARcdN;
                                MultiTransferInputAddressViewModel.ActionBar.Activity activity2 = new MultiTransferInputAddressViewModel.ActionBar.Activity(this.this$0.valueOf().size());
                                this.L$0 = walletAddressInputAYXKKw;
                                this.label = 4;
                                if (channel4.send(activity2, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else if (this.this$0.djBIcL) {
                                Channel channel5 = this.this$0.getNewProxyInstance;
                                ArrayList arrayList4 = new ArrayList();
                                int i = 0;
                                for (Object obj3 : multiAddress.AEQbTJ()) {
                                    if (i < 0) {
                                        yDY.AYXKKw();
                                    }
                                    WalletAddressInput.Address address = (WalletAddressInput.Address) obj3;
                                    if (address.djBIcL()) {
                                        arrayList4.add(new AddressWithMemo(address.AEQbTJ(), address.EZpvd(), false, i));
                                    }
                                    i++;
                                }
                                Pair pairOLrzqt2 = C56390yDp.OLrzqt(arrayList4, arrayList2);
                                this.L$0 = walletAddressInputAYXKKw;
                                this.label = 5;
                                if (channel5.send(pairOLrzqt2, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else if (zDGOPHZ) {
                                this.this$0.EZpvd((List<String>) arrayList2, true);
                            } else {
                                Channel channel6 = this.this$0.fARcdN;
                                MultiTransferInputAddressViewModel.ActionBar.C0325ActionBar c0325ActionBar = new MultiTransferInputAddressViewModel.ActionBar.C0325ActionBar(arrayList2);
                                this.L$0 = walletAddressInputAYXKKw;
                                this.label = 6;
                                if (channel6.send(c0325ActionBar, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            walletAddressInput = walletAddressInputAYXKKw;
                            walletAddressInputAYXKKw = walletAddressInput;
                        }
                        MultiTransferInputAddressViewModel multiTransferInputAddressViewModel = this.this$0;
                        multiTransferInputAddressViewModel.copydefault(WalletAddressInput.MultiAddress.copy$default((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw, null, -1, multiTransferInputAddressViewModel.uzCIH.copydefault(), 1, null));
                    }
                }
                return Unit.INSTANCE;
            case 1:
            case 2:
            case 3:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 4:
            case 5:
            case 6:
                walletAddressInput = (WalletAddressInput) this.L$0;
                C56391yDq.AEQbTJ(obj);
                walletAddressInputAYXKKw = walletAddressInput;
                MultiTransferInputAddressViewModel multiTransferInputAddressViewModel2 = this.this$0;
                multiTransferInputAddressViewModel2.copydefault(WalletAddressInput.MultiAddress.copy$default((WalletAddressInput.MultiAddress) walletAddressInputAYXKKw, null, -1, multiTransferInputAddressViewModel2.uzCIH.copydefault(), 1, null));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
