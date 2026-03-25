package com.okinc.business.defi.wallet.home.usdgActivity.ui.viewmodel;

import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterBean;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.SupportChainAddressBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC18226feR;
import o.AbstractC58260yxt;
import o.C18176fdU;
import o.C18179fdX;
import o.C18235fea;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletUsdgActivityViewModel$activateAddresses$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletUsdgActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUsdgActivityViewModel$activateAddresses$1(WalletUsdgActivityViewModel walletUsdgActivityViewModel, Continuation<? super WalletUsdgActivityViewModel$activateAddresses$1> continuation) {
        super(2, continuation);
        this.this$0 = walletUsdgActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletUsdgActivityViewModel$activateAddresses$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletUsdgActivityViewModel$activateAddresses$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[Catch: all -> 0x01a8, CancellationException -> 0x01de, TryCatch #2 {CancellationException -> 0x01de, all -> 0x01a8, blocks: (B:8:0x001b, B:63:0x019f, B:11:0x0026, B:58:0x0179, B:60:0x017f, B:14:0x002f, B:52:0x0134, B:54:0x013a, B:17:0x0043, B:37:0x00a4, B:38:0x00aa, B:40:0x00ba, B:41:0x00d2, B:42:0x00eb, B:44:0x00f1, B:45:0x010c, B:47:0x011c, B:49:0x0123, B:20:0x004b, B:27:0x0065, B:29:0x006d, B:31:0x0070, B:33:0x0087, B:23:0x0054), top: B:76:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: all -> 0x01a8, CancellationException -> 0x01de, TryCatch #2 {CancellationException -> 0x01de, all -> 0x01a8, blocks: (B:8:0x001b, B:63:0x019f, B:11:0x0026, B:58:0x0179, B:60:0x017f, B:14:0x002f, B:52:0x0134, B:54:0x013a, B:17:0x0043, B:37:0x00a4, B:38:0x00aa, B:40:0x00ba, B:41:0x00d2, B:42:0x00eb, B:44:0x00f1, B:45:0x010c, B:47:0x011c, B:49:0x0123, B:20:0x004b, B:27:0x0065, B:29:0x006d, B:31:0x0070, B:33:0x0087, B:23:0x0054), top: B:76:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba A[Catch: all -> 0x01a8, CancellationException -> 0x01de, TryCatch #2 {CancellationException -> 0x01de, all -> 0x01a8, blocks: (B:8:0x001b, B:63:0x019f, B:11:0x0026, B:58:0x0179, B:60:0x017f, B:14:0x002f, B:52:0x0134, B:54:0x013a, B:17:0x0043, B:37:0x00a4, B:38:0x00aa, B:40:0x00ba, B:41:0x00d2, B:42:0x00eb, B:44:0x00f1, B:45:0x010c, B:47:0x011c, B:49:0x0123, B:20:0x004b, B:27:0x0065, B:29:0x006d, B:31:0x0070, B:33:0x0087, B:23:0x0054), top: B:76:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1 A[Catch: all -> 0x01a8, CancellationException -> 0x01de, LOOP:0: B:42:0x00eb->B:44:0x00f1, LOOP_END, TryCatch #2 {CancellationException -> 0x01de, all -> 0x01a8, blocks: (B:8:0x001b, B:63:0x019f, B:11:0x0026, B:58:0x0179, B:60:0x017f, B:14:0x002f, B:52:0x0134, B:54:0x013a, B:17:0x0043, B:37:0x00a4, B:38:0x00aa, B:40:0x00ba, B:41:0x00d2, B:42:0x00eb, B:44:0x00f1, B:45:0x010c, B:47:0x011c, B:49:0x0123, B:20:0x004b, B:27:0x0065, B:29:0x006d, B:31:0x0070, B:33:0x0087, B:23:0x0054), top: B:76:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c A[Catch: all -> 0x01a8, CancellationException -> 0x01de, TryCatch #2 {CancellationException -> 0x01de, all -> 0x01a8, blocks: (B:8:0x001b, B:63:0x019f, B:11:0x0026, B:58:0x0179, B:60:0x017f, B:14:0x002f, B:52:0x0134, B:54:0x013a, B:17:0x0043, B:37:0x00a4, B:38:0x00aa, B:40:0x00ba, B:41:0x00d2, B:42:0x00eb, B:44:0x00f1, B:45:0x010c, B:47:0x011c, B:49:0x0123, B:20:0x004b, B:27:0x0065, B:29:0x006d, B:31:0x0070, B:33:0x0087, B:23:0x0054), top: B:76:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a A[Catch: all -> 0x01a8, CancellationException -> 0x01de, TryCatch #2 {CancellationException -> 0x01de, all -> 0x01a8, blocks: (B:8:0x001b, B:63:0x019f, B:11:0x0026, B:58:0x0179, B:60:0x017f, B:14:0x002f, B:52:0x0134, B:54:0x013a, B:17:0x0043, B:37:0x00a4, B:38:0x00aa, B:40:0x00ba, B:41:0x00d2, B:42:0x00eb, B:44:0x00f1, B:45:0x010c, B:47:0x011c, B:49:0x0123, B:20:0x004b, B:27:0x0065, B:29:0x006d, B:31:0x0070, B:33:0x0087, B:23:0x0054), top: B:76:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f A[Catch: all -> 0x01a8, CancellationException -> 0x01de, TryCatch #2 {CancellationException -> 0x01de, all -> 0x01a8, blocks: (B:8:0x001b, B:63:0x019f, B:11:0x0026, B:58:0x0179, B:60:0x017f, B:14:0x002f, B:52:0x0134, B:54:0x013a, B:17:0x0043, B:37:0x00a4, B:38:0x00aa, B:40:0x00ba, B:41:0x00d2, B:42:0x00eb, B:44:0x00f1, B:45:0x010c, B:47:0x011c, B:49:0x0123, B:20:0x004b, B:27:0x0065, B:29:0x006d, B:31:0x0070, B:33:0x0087, B:23:0x0054), top: B:76:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel2;
        Object objEZpvd;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel3;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl2;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                WalletUsdgActivityViewModel walletUsdgActivityViewModel4 = this.this$0;
                Result.Application application2 = Result.Companion;
                this.L$0 = walletUsdgActivityViewModel4;
                this.label = 1;
                Object objCopydefault2 = walletUsdgActivityViewModel4.copydefault((Continuation<? super Boolean>) this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                walletUsdgActivityViewModel = walletUsdgActivityViewModel4;
                obj = objCopydefault2;
                if (!((Boolean) obj).booleanValue()) {
                    walletUsdgActivityViewModel.OLrzqt((AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(walletUsdgActivityViewModel.AuCTelauCTel.copydefault()));
                    if (walletUsdgActivityViewModel.valueOf() == null) {
                        pUU.copydefault("WalletUsdgActivityViewModel", "activateAddresses,mainWallet is null");
                        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = walletUsdgActivityViewModel.AuCTelauCTel.copydefault(false);
                        this.L$0 = walletUsdgActivityViewModel;
                        this.L$1 = walletUsdgActivityViewModel;
                        this.label = 2;
                        obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        walletUsdgActivityViewModel2 = walletUsdgActivityViewModel;
                        walletUsdgActivityViewModel.OLrzqt((AbstractC12782ctV) obj);
                        walletUsdgActivityViewModel = walletUsdgActivityViewModel2;
                    }
                    if (walletUsdgActivityViewModel.AhwBna().getValue().isEmpty()) {
                        pUU.copydefault("WalletUsdgActivityViewModel", "activateAddresses,supportChainAddressList is null");
                        walletUsdgActivityViewModel.AhwBna.setValue(walletUsdgActivityViewModel.copydefault(walletUsdgActivityViewModel.valueOf(), (List<Long>) walletUsdgActivityViewModel.AkhnZx()));
                    }
                    List<SupportChainAddressBean> value = walletUsdgActivityViewModel.AhwBna().getValue();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
                    for (SupportChainAddressBean supportChainAddressBean : value) {
                        arrayList.add(new AddressRegisterBean(supportChainAddressBean.getWalletAddress(), supportChainAddressBean.getGeneralChainId(), supportChainAddressBean.getTokenAddress()));
                    }
                    C18235fea c18235fea = walletUsdgActivityViewModel.AuCTel;
                    String strIsConnected = walletUsdgActivityViewModel.isConnected();
                    Long lAYXKKw = walletUsdgActivityViewModel.AYXKKw();
                    C18179fdX c18179fdX = new C18179fdX(strIsConnected, lAYXKKw == null ? lAYXKKw.longValue() : -1L, arrayList);
                    this.L$0 = walletUsdgActivityViewModel;
                    this.L$1 = null;
                    this.label = 3;
                    objEZpvd = c18235fea.EZpvd(c18179fdX, this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    walletUsdgActivityViewModel3 = walletUsdgActivityViewModel;
                    if (Result.m7384isSuccessimpl(objEZpvd)) {
                        C18176fdU c18176fdU = (C18176fdU) objEZpvd;
                        pUU.copydefault("WalletUsdgActivityViewModel", "activateAddresses,isRegisterSuccess:" + c18176fdU.copydefault().getStatus());
                        MutableSharedFlow mutableSharedFlow = walletUsdgActivityViewModel3.gEmmrt;
                        AbstractC18226feR.TaskDescription taskDescription = new AbstractC18226feR.TaskDescription(c18176fdU.copydefault(), c18176fdU.OLrzqt());
                        this.L$0 = walletUsdgActivityViewModel3;
                        this.L$1 = objEZpvd;
                        this.label = 4;
                        if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    obj2 = objEZpvd;
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl2 != null) {
                        pUU.AEQbTJ("WalletUsdgActivityViewModel", "activateAddresses1", thM7380exceptionOrNullimpl2);
                        MutableSharedFlow mutableSharedFlow2 = walletUsdgActivityViewModel3.gEmmrt;
                        AbstractC18226feR.Activity activity = new AbstractC18226feR.Activity(thM7380exceptionOrNullimpl2.getMessage());
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 5;
                        if (mutableSharedFlow2.emit(activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(obj2));
                    WalletUsdgActivityViewModel walletUsdgActivityViewModel5 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("WalletUsdgActivityViewModel", "activateAddresses2", thM7380exceptionOrNullimpl);
                        MutableSharedFlow mutableSharedFlow3 = walletUsdgActivityViewModel5.gEmmrt;
                        AbstractC18226feR.Activity activity2 = new AbstractC18226feR.Activity(thM7380exceptionOrNullimpl.getMessage());
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.label = 6;
                        if (mutableSharedFlow3.emit(activity2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 1:
                walletUsdgActivityViewModel = (WalletUsdgActivityViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
                break;
            case 2:
                walletUsdgActivityViewModel = (WalletUsdgActivityViewModel) this.L$1;
                walletUsdgActivityViewModel2 = (WalletUsdgActivityViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                walletUsdgActivityViewModel.OLrzqt((AbstractC12782ctV) obj);
                walletUsdgActivityViewModel = walletUsdgActivityViewModel2;
                if (walletUsdgActivityViewModel.AhwBna().getValue().isEmpty()) {
                }
                List<SupportChainAddressBean> value2 = walletUsdgActivityViewModel.AhwBna().getValue();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(value2, 10));
                while (r12.hasNext()) {
                }
                C18235fea c18235fea2 = walletUsdgActivityViewModel.AuCTel;
                String strIsConnected2 = walletUsdgActivityViewModel.isConnected();
                Long lAYXKKw2 = walletUsdgActivityViewModel.AYXKKw();
                C18179fdX c18179fdX2 = new C18179fdX(strIsConnected2, lAYXKKw2 == null ? lAYXKKw2.longValue() : -1L, arrayList2);
                this.L$0 = walletUsdgActivityViewModel;
                this.L$1 = null;
                this.label = 3;
                objEZpvd = c18235fea2.EZpvd(c18179fdX2, this);
                if (objEZpvd == objCopydefault) {
                }
                walletUsdgActivityViewModel3 = walletUsdgActivityViewModel;
                if (Result.m7384isSuccessimpl(objEZpvd)) {
                }
                obj2 = objEZpvd;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(obj2));
                WalletUsdgActivityViewModel walletUsdgActivityViewModel52 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 3:
                walletUsdgActivityViewModel = (WalletUsdgActivityViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                walletUsdgActivityViewModel3 = walletUsdgActivityViewModel;
                if (Result.m7384isSuccessimpl(objEZpvd)) {
                }
                obj2 = objEZpvd;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(obj2));
                WalletUsdgActivityViewModel walletUsdgActivityViewModel522 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
                obj2 = this.L$1;
                walletUsdgActivityViewModel3 = (WalletUsdgActivityViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(obj2));
                WalletUsdgActivityViewModel walletUsdgActivityViewModel5222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 5:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(obj2));
                WalletUsdgActivityViewModel walletUsdgActivityViewModel52222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
