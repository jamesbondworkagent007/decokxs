package com.okinc.business.defi.wallet.icloud.viewmodel;

import com.okinc.business.defi.biz.drivers.bean.HDWalletBackupAddressBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C18396fhc;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class CloudBackupNetworkListViewModel$getItemDataList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<HDWalletBackupAddressBean> $cloudBackupAddressList;
    final /* synthetic */ ArrayList<Object> $dataList;
    int label;
    final /* synthetic */ C18396fhc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudBackupNetworkListViewModel$getItemDataList$1(List<HDWalletBackupAddressBean> list, ArrayList<Object> arrayList, C18396fhc c18396fhc, Continuation<? super CloudBackupNetworkListViewModel$getItemDataList$1> continuation) {
        super(2, continuation);
        this.$cloudBackupAddressList = list;
        this.$dataList = arrayList;
        this.this$0 = c18396fhc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CloudBackupNetworkListViewModel$getItemDataList$1(this.$cloudBackupAddressList, this.$dataList, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CloudBackupNetworkListViewModel$getItemDataList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                List<HDWalletBackupAddressBean> list = this.$cloudBackupAddressList;
                ArrayList<Object> arrayList = this.$dataList;
                C18396fhc c18396fhc = this.this$0;
                Result.Application application = Result.Companion;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                CloudBackupNetworkListViewModel$getItemDataList$1$1$1 cloudBackupNetworkListViewModel$getItemDataList$1$1$1 = new CloudBackupNetworkListViewModel$getItemDataList$1$1$1(list, arrayList, c18396fhc, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, cloudBackupNetworkListViewModel$getItemDataList$1$1$1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C18396fhc c18396fhc2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(c18396fhc2.AEQbTJ, "error message :" + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
