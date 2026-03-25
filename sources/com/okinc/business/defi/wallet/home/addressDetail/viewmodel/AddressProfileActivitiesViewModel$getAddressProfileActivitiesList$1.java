package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import com.okinc.business.defi.wallet.home.bean.WalletAddressActivityDetails;
import com.okinc.business.defi.wallet.home.bean.WalletAddressActivityInfo;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.eWY;
import o.eYN;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileActivitiesViewModel$getAddressProfileActivitiesList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ Boolean $desc;
    final /* synthetic */ String $globalIndex;
    final /* synthetic */ boolean $loadMore;
    final /* synthetic */ Integer $pageSize;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $walletAddress;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    final /* synthetic */ AddressProfileActivitiesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressProfileActivitiesViewModel$getAddressProfileActivitiesList$1(AddressProfileActivitiesViewModel addressProfileActivitiesViewModel, String str, String str2, String str3, Integer num, String str4, Boolean bool, boolean z, Continuation<? super AddressProfileActivitiesViewModel$getAddressProfileActivitiesList$1> continuation) {
        super(2, continuation);
        this.this$0 = addressProfileActivitiesViewModel;
        this.$walletAddress = str;
        this.$chainId = str2;
        this.$tokenContractAddress = str3;
        this.$pageSize = num;
        this.$globalIndex = str4;
        this.$desc = bool;
        this.$loadMore = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressProfileActivitiesViewModel$getAddressProfileActivitiesList$1(this.this$0, this.$walletAddress, this.$chainId, this.$tokenContractAddress, this.$pageSize, this.$globalIndex, this.$desc, this.$loadMore, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressProfileActivitiesViewModel$getAddressProfileActivitiesList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb A[Catch: all -> 0x016a, CancellationException -> 0x0191, TryCatch #2 {CancellationException -> 0x0191, all -> 0x016a, blocks: (B:8:0x0024, B:47:0x0110, B:49:0x011e, B:50:0x012d, B:52:0x0133, B:54:0x0142, B:55:0x014c, B:57:0x0152, B:58:0x0161, B:13:0x0047, B:39:0x00e1, B:41:0x00eb, B:43:0x00f1, B:16:0x0052, B:23:0x009d, B:25:0x00a3, B:27:0x00a8, B:29:0x00ae, B:31:0x00b6, B:33:0x00bc, B:19:0x0073), top: B:69:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e A[Catch: all -> 0x016a, CancellationException -> 0x0191, TryCatch #2 {CancellationException -> 0x0191, all -> 0x016a, blocks: (B:8:0x0024, B:47:0x0110, B:49:0x011e, B:50:0x012d, B:52:0x0133, B:54:0x0142, B:55:0x014c, B:57:0x0152, B:58:0x0161, B:13:0x0047, B:39:0x00e1, B:41:0x00eb, B:43:0x00f1, B:16:0x0052, B:23:0x009d, B:25:0x00a3, B:27:0x00a8, B:29:0x00ae, B:31:0x00b6, B:33:0x00bc, B:19:0x0073), top: B:69:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152 A[Catch: all -> 0x016a, CancellationException -> 0x0191, TryCatch #2 {CancellationException -> 0x0191, all -> 0x016a, blocks: (B:8:0x0024, B:47:0x0110, B:49:0x011e, B:50:0x012d, B:52:0x0133, B:54:0x0142, B:55:0x014c, B:57:0x0152, B:58:0x0161, B:13:0x0047, B:39:0x00e1, B:41:0x00eb, B:43:0x00f1, B:16:0x0052, B:23:0x009d, B:25:0x00a3, B:27:0x00a8, B:29:0x00ae, B:31:0x00b6, B:33:0x00bc, B:19:0x0073), top: B:69:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7386unboximpl;
        AddressProfileActivitiesViewModel addressProfileActivitiesViewModel;
        boolean z;
        WalletAddressActivityInfo walletAddressActivityInfo;
        WalletAddressActivityInfo walletAddressActivityInfo2;
        Object obj2;
        WalletAddressActivityDetails walletAddressActivityDetails;
        String strEZpvd;
        Object obj3;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        boolean z2;
        WalletAddressActivityInfo walletAddressActivityInfo3;
        Object obj4;
        AddressProfileActivitiesViewModel addressProfileActivitiesViewModel2;
        List<WalletAddressActivityDetails> listAEQbTJ;
        ArrayList arrayList;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AddressProfileActivitiesViewModel addressProfileActivitiesViewModel3 = this.this$0;
            String str = this.$walletAddress;
            String str2 = this.$chainId;
            String str3 = this.$tokenContractAddress;
            Integer num = this.$pageSize;
            String str4 = this.$globalIndex;
            Boolean bool = this.$desc;
            boolean z3 = this.$loadMore;
            Result.Application application2 = Result.Companion;
            eWY ewy = addressProfileActivitiesViewModel3.copydefault;
            eYN.Application application3 = eYN.Companion;
            String strOLrzqt = application3.OLrzqt();
            boolean zEZpvd = application3.EZpvd();
            this.L$0 = addressProfileActivitiesViewModel3;
            this.Z$0 = z3;
            this.label = 1;
            Object objEZpvd = ewy.EZpvd(str, str2, str3, strOLrzqt, num, str4, bool, zEZpvd, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objEZpvd;
            addressProfileActivitiesViewModel = addressProfileActivitiesViewModel3;
            z = z3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = this.Z$0;
                    walletAddressActivityInfo3 = (WalletAddressActivityInfo) this.L$4;
                    obj4 = this.L$1;
                    addressProfileActivitiesViewModel2 = (AddressProfileActivitiesViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    MutableStateFlow mutableStateFlow = addressProfileActivitiesViewModel2.OLrzqt;
                    Boolean boolKWHzl2 = C56443yFo.KWHzl(z2);
                    listAEQbTJ = walletAddressActivityInfo3.AEQbTJ();
                    if (listAEQbTJ == null) {
                        arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                        Iterator<T> it = listAEQbTJ.iterator();
                        while (it.hasNext()) {
                            arrayList.add(addressProfileActivitiesViewModel2.copydefault((WalletAddressActivityDetails) it.next()));
                        }
                    } else {
                        arrayList = null;
                    }
                    mutableStateFlow.setValue(C56390yDp.OLrzqt(boolKWHzl2, arrayList));
                    z = z2;
                    objM7386unboximpl = obj4;
                    addressProfileActivitiesViewModel = addressProfileActivitiesViewModel2;
                    if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
                        addressProfileActivitiesViewModel.OLrzqt.setValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(z), null));
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(objM7386unboximpl));
                    AddressProfileActivitiesViewModel addressProfileActivitiesViewModel4 = this.this$0;
                    boolean z4 = this.$loadMore;
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                        addressProfileActivitiesViewModel4.OLrzqt.setValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(z4), null));
                    }
                    return Unit.INSTANCE;
                }
                z = this.Z$0;
                walletAddressActivityInfo = (WalletAddressActivityInfo) this.L$4;
                walletAddressActivityInfo2 = (WalletAddressActivityInfo) this.L$3;
                objM7386unboximpl = this.L$2;
                obj3 = this.L$1;
                addressProfileActivitiesViewModel = (AddressProfileActivitiesViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Object obj5 = obj3;
                obj2 = objM7386unboximpl;
                objM7386unboximpl = obj5;
                mutableSharedFlow = addressProfileActivitiesViewModel.AEQbTJ;
                Boolean boolEZpvd = walletAddressActivityInfo.EZpvd();
                boolKWHzl = C56443yFo.KWHzl(boolEZpvd != null ? boolEZpvd.booleanValue() : false);
                this.L$0 = addressProfileActivitiesViewModel;
                this.L$1 = objM7386unboximpl;
                this.L$2 = obj2;
                this.L$3 = walletAddressActivityInfo2;
                this.L$4 = walletAddressActivityInfo;
                this.L$5 = null;
                this.Z$0 = z;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                z2 = z;
                walletAddressActivityInfo3 = walletAddressActivityInfo;
                obj4 = objM7386unboximpl;
                addressProfileActivitiesViewModel2 = addressProfileActivitiesViewModel;
                MutableStateFlow mutableStateFlow2 = addressProfileActivitiesViewModel2.OLrzqt;
                Boolean boolKWHzl22 = C56443yFo.KWHzl(z2);
                listAEQbTJ = walletAddressActivityInfo3.AEQbTJ();
                if (listAEQbTJ == null) {
                }
                mutableStateFlow2.setValue(C56390yDp.OLrzqt(boolKWHzl22, arrayList));
                z = z2;
                objM7386unboximpl = obj4;
                addressProfileActivitiesViewModel = addressProfileActivitiesViewModel2;
                if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(objM7386unboximpl));
                AddressProfileActivitiesViewModel addressProfileActivitiesViewModel42 = this.this$0;
                boolean z42 = this.$loadMore;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                }
                return Unit.INSTANCE;
            }
            z = this.Z$0;
            AddressProfileActivitiesViewModel addressProfileActivitiesViewModel5 = (AddressProfileActivitiesViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            addressProfileActivitiesViewModel = addressProfileActivitiesViewModel5;
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM7386unboximpl) && (walletAddressActivityInfo = (WalletAddressActivityInfo) objM7386unboximpl) != null) {
            List<WalletAddressActivityDetails> listAEQbTJ2 = walletAddressActivityInfo.AEQbTJ();
            if (listAEQbTJ2 == null || (walletAddressActivityDetails = (WalletAddressActivityDetails) CollectionsKt___CollectionsKt.wlaJM(listAEQbTJ2)) == null || (strEZpvd = walletAddressActivityDetails.EZpvd()) == null) {
                walletAddressActivityInfo2 = walletAddressActivityInfo;
                obj2 = objM7386unboximpl;
                mutableSharedFlow = addressProfileActivitiesViewModel.AEQbTJ;
                Boolean boolEZpvd2 = walletAddressActivityInfo.EZpvd();
                boolKWHzl = C56443yFo.KWHzl(boolEZpvd2 != null ? boolEZpvd2.booleanValue() : false);
                this.L$0 = addressProfileActivitiesViewModel;
                this.L$1 = objM7386unboximpl;
                this.L$2 = obj2;
                this.L$3 = walletAddressActivityInfo2;
                this.L$4 = walletAddressActivityInfo;
                this.L$5 = null;
                this.Z$0 = z;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
            } else {
                MutableSharedFlow mutableSharedFlow2 = addressProfileActivitiesViewModel.EZpvd;
                this.L$0 = addressProfileActivitiesViewModel;
                this.L$1 = objM7386unboximpl;
                this.L$2 = objM7386unboximpl;
                this.L$3 = walletAddressActivityInfo;
                this.L$4 = walletAddressActivityInfo;
                this.L$5 = strEZpvd;
                this.Z$0 = z;
                this.label = 2;
                if (mutableSharedFlow2.emit(strEZpvd, this) == objCopydefault) {
                    return objCopydefault;
                }
                walletAddressActivityInfo2 = walletAddressActivityInfo;
                obj3 = objM7386unboximpl;
                Object obj52 = obj3;
                obj2 = objM7386unboximpl;
                objM7386unboximpl = obj52;
                mutableSharedFlow = addressProfileActivitiesViewModel.AEQbTJ;
                Boolean boolEZpvd22 = walletAddressActivityInfo.EZpvd();
                boolKWHzl = C56443yFo.KWHzl(boolEZpvd22 != null ? boolEZpvd22.booleanValue() : false);
                this.L$0 = addressProfileActivitiesViewModel;
                this.L$1 = objM7386unboximpl;
                this.L$2 = obj2;
                this.L$3 = walletAddressActivityInfo2;
                this.L$4 = walletAddressActivityInfo;
                this.L$5 = null;
                this.Z$0 = z;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
            }
        }
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(objM7386unboximpl));
        AddressProfileActivitiesViewModel addressProfileActivitiesViewModel422 = this.this$0;
        boolean z422 = this.$loadMore;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
        }
        return Unit.INSTANCE;
    }
}
