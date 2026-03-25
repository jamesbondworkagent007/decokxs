package com.okinc.business.defi.wallet.icloud.viewmodel;

import com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean;
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
import kotlinx.coroutines.channels.Channel;
import o.C18399fhf;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class ICloudeViewModel$generateCloudBackupData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountName;
    final /* synthetic */ List<HDWalletCloudBackupBean> $cloudBackupList;
    final /* synthetic */ ArrayList<Object> $dataList;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C18399fhf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICloudeViewModel$generateCloudBackupData$1(C18399fhf c18399fhf, String str, List<HDWalletCloudBackupBean> list, ArrayList<Object> arrayList, Continuation<? super ICloudeViewModel$generateCloudBackupData$1> continuation) {
        super(2, continuation);
        this.this$0 = c18399fhf;
        this.$accountName = str;
        this.$cloudBackupList = list;
        this.$dataList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ICloudeViewModel$generateCloudBackupData$1(this.this$0, this.$accountName, this.$cloudBackupList, this.$dataList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ICloudeViewModel$generateCloudBackupData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C18399fhf c18399fhf;
        Throwable th;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th2) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C18399fhf c18399fhf2 = this.this$0;
            String str = this.$accountName;
            List<HDWalletCloudBackupBean> list = this.$cloudBackupList;
            ArrayList<Object> arrayList = this.$dataList;
            Result.Application application2 = Result.Companion;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            ICloudeViewModel$generateCloudBackupData$1$1$1 iCloudeViewModel$generateCloudBackupData$1$1$1 = new ICloudeViewModel$generateCloudBackupData$1$1$1(c18399fhf2, str, list, arrayList, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, iCloudeViewModel$generateCloudBackupData$1$1$1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) this.L$2;
                c18399fhf = (C18399fhf) this.L$1;
                C56391yDq.AEQbTJ(obj);
                pUU.copydefault(c18399fhf.valueOf, "error message :" + th.getMessage());
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        c18399fhf = this.this$0;
        ArrayList<Object> arrayList2 = this.$dataList;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            Channel channel = c18399fhf.EZpvd;
            this.L$0 = objM7377constructorimpl;
            this.L$1 = c18399fhf;
            this.L$2 = thM7380exceptionOrNullimpl;
            this.label = 2;
            if (channel.send(arrayList2, this) == objCopydefault) {
                return objCopydefault;
            }
            th = thM7380exceptionOrNullimpl;
            pUU.copydefault(c18399fhf.valueOf, "error message :" + th.getMessage());
        }
        return Unit.INSTANCE;
    }
}
