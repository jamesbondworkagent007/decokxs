package com.okinc.business.defi.wallet.mine.addressbook.detail;

import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC11252cHi;
import o.InterfaceC18734fnw;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletAddressBookDetailViewModel$checkAddressFieldState$2 extends SuspendLambda implements Function2<FlowCollector<? super WalletAddressBookDetailViewModel.AddressInputFieldState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WalletAddressBookDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBookDetailViewModel$checkAddressFieldState$2(String str, WalletAddressBookDetailViewModel walletAddressBookDetailViewModel, Continuation<? super WalletAddressBookDetailViewModel$checkAddressFieldState$2> continuation) {
        super(2, continuation);
        this.$address = str;
        this.this$0 = walletAddressBookDetailViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletAddressBookDetailViewModel$checkAddressFieldState$2 walletAddressBookDetailViewModel$checkAddressFieldState$2 = new WalletAddressBookDetailViewModel$checkAddressFieldState$2(this.$address, this.this$0, continuation);
        walletAddressBookDetailViewModel$checkAddressFieldState$2.L$0 = obj;
        return walletAddressBookDetailViewModel$checkAddressFieldState$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super WalletAddressBookDetailViewModel.AddressInputFieldState> flowCollector, Continuation<? super Unit> continuation) {
        return ((WalletAddressBookDetailViewModel$checkAddressFieldState$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [120=4] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        AbstractC43419rot abstractC43419rot;
        Object value;
        Object value2;
        AbstractC43419rot abstractC43419rot2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                flowCollector = (FlowCollector) this.L$0;
                if (this.$address.length() == 0) {
                    WalletAddressBookDetailViewModel.AddressInputFieldState.Activity activity = new WalletAddressBookDetailViewModel.AddressInputFieldState.Activity(WalletAddressBookDetailViewModel.AddressInputFieldState.AddressInputFieldError.EMPTY_ADDRESS);
                    this.label = 1;
                    if (flowCollector.emit(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (Intrinsics.EZpvd((Object) this.this$0.isConnected, (Object) this.$address) && (this.this$0.isConnected != null)) {
                    WalletAddressBookDetailViewModel walletAddressBookDetailViewModel = this.this$0;
                    String str = this.$address;
                    WalletAddressBookDetailViewModel$checkAddressFieldState$2$existingAddressChainsResult$1 walletAddressBookDetailViewModel$checkAddressFieldState$2$existingAddressChainsResult$1 = new WalletAddressBookDetailViewModel$checkAddressFieldState$2$existingAddressChainsResult$1(flowCollector, null);
                    this.L$0 = flowCollector;
                    this.label = 2;
                    obj = walletAddressBookDetailViewModel.OLrzqt(str, walletAddressBookDetailViewModel$checkAddressFieldState$2$existingAddressChainsResult$1, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    FlowCollector flowCollector2 = flowCollector;
                    abstractC43419rot = (AbstractC43419rot) obj;
                    if (!abstractC43419rot.OLrzqt()) {
                        WalletAddressBookDetailViewModel.AddressInputFieldState.ActionBar actionBar = WalletAddressBookDetailViewModel.AddressInputFieldState.ActionBar.copydefault;
                        this.L$0 = null;
                        this.label = 3;
                        if (flowCollector2.emit(actionBar, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    Intrinsics.copydefault(abstractC43419rot, "");
                    AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) abstractC43419rot;
                    MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, (List) stateListAnimator.KWHzl()));
                    WalletAddressBookDetailViewModel.AddressInputFieldState.StateListAnimator stateListAnimator2 = WalletAddressBookDetailViewModel.AddressInputFieldState.StateListAnimator.OLrzqt;
                    this.L$0 = null;
                    this.label = 4;
                    if (flowCollector2.emit(stateListAnimator2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                InterfaceC11252cHi interfaceC11252cHi = this.this$0.AhwBna;
                String str2 = this.$address;
                this.L$0 = flowCollector;
                this.label = 5;
                obj = interfaceC11252cHi.copydefault(str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                if (((AddressBookEntity) obj) == null) {
                    WalletAddressBookDetailViewModel.AddressInputFieldState.Activity activity2 = new WalletAddressBookDetailViewModel.AddressInputFieldState.Activity(WalletAddressBookDetailViewModel.AddressInputFieldState.AddressInputFieldError.DUPLICATE_ADDRESS);
                    this.L$0 = null;
                    this.label = 6;
                    if (flowCollector.emit(activity2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                MutableStateFlow mutableStateFlow2 = this.this$0.KWHzl;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, yDY.AhwBna()));
                InterfaceC18734fnw interfaceC18734fnw = this.this$0.fetchVPNInfo;
                String str3 = this.$address;
                WalletAddressBookDetailViewModel$checkAddressFieldState$2$supportedChainsResult$1 walletAddressBookDetailViewModel$checkAddressFieldState$2$supportedChainsResult$1 = new WalletAddressBookDetailViewModel$checkAddressFieldState$2$supportedChainsResult$1(flowCollector, null);
                this.L$0 = flowCollector;
                this.label = 7;
                obj = InterfaceC18734fnw.TaskDescription.invoke$default(interfaceC18734fnw, str3, walletAddressBookDetailViewModel$checkAddressFieldState$2$supportedChainsResult$1, 0L, this, 4, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                FlowCollector flowCollector3 = flowCollector;
                abstractC43419rot2 = (AbstractC43419rot) obj;
                if (!abstractC43419rot2.OLrzqt()) {
                    WalletAddressBookDetailViewModel.AddressInputFieldState.ActionBar actionBar2 = WalletAddressBookDetailViewModel.AddressInputFieldState.ActionBar.copydefault;
                    this.L$0 = null;
                    this.label = 8;
                    if (flowCollector3.emit(actionBar2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                Intrinsics.copydefault(abstractC43419rot2, "");
                AbstractC43419rot.StateListAnimator stateListAnimator3 = (AbstractC43419rot.StateListAnimator) abstractC43419rot2;
                MutableStateFlow mutableStateFlow3 = this.this$0.KWHzl;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, (List) stateListAnimator3.KWHzl()));
                if (((List) stateListAnimator3.KWHzl()).isEmpty()) {
                    WalletAddressBookDetailViewModel.AddressInputFieldState.Activity activity3 = new WalletAddressBookDetailViewModel.AddressInputFieldState.Activity(WalletAddressBookDetailViewModel.AddressInputFieldState.AddressInputFieldError.WRONG_ADDRESS);
                    this.L$0 = null;
                    this.label = 9;
                    if (flowCollector3.emit(activity3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                WalletAddressBookDetailViewModel.AddressInputFieldState.StateListAnimator stateListAnimator4 = WalletAddressBookDetailViewModel.AddressInputFieldState.StateListAnimator.OLrzqt;
                this.L$0 = null;
                this.label = 10;
                if (flowCollector3.emit(stateListAnimator4, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 2:
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                FlowCollector flowCollector22 = flowCollector;
                abstractC43419rot = (AbstractC43419rot) obj;
                if (!abstractC43419rot.OLrzqt()) {
                }
                break;
            case 3:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 5:
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (((AddressBookEntity) obj) == null) {
                }
                break;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 7:
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                FlowCollector flowCollector32 = flowCollector;
                abstractC43419rot2 = (AbstractC43419rot) obj;
                if (!abstractC43419rot2.OLrzqt()) {
                }
                break;
            case 8:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 9:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 10:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
