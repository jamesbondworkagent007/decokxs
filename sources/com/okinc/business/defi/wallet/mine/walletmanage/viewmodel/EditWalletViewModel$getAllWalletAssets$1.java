package com.okinc.business.defi.wallet.mine.walletmanage.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C15274eCg;
import o.C17410fEh;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.fDL;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class EditWalletViewModel$getAllWalletAssets$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C17410fEh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditWalletViewModel$getAllWalletAssets$1(C17410fEh c17410fEh, Continuation<? super EditWalletViewModel$getAllWalletAssets$1> continuation) {
        super(2, continuation);
        this.this$0 = c17410fEh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EditWalletViewModel$getAllWalletAssets$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EditWalletViewModel$getAllWalletAssets$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        C17410fEh c17410fEh;
        List list;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C17410fEh c17410fEh2 = this.this$0;
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<List<AbstractC12784ctX>> abstractC58260yxtEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).EZpvd(true, true);
            this.L$0 = c17410fEh2;
            this.label = 1;
            Object objAwait = RxAwaitKt.await(abstractC58260yxtEZpvd, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            c17410fEh = c17410fEh2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$1;
                c17410fEh = (C17410fEh) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    obj2 = objM7386unboximpl;
                }
                MutableLiveData<List<fDL<Object>>> mutableLiveDataEZpvd = c17410fEh.EZpvd();
                Intrinsics.copydefault(list);
                mutableLiveDataEZpvd.setValue(CollectionsKt___CollectionsKt.fJNWhG((Collection) c17410fEh.KWHzl((List<? extends AbstractC12784ctX>) list, (Map<String, ? extends EIP7702WalletStatus>) obj2)));
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                C17410fEh c17410fEh3 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    c17410fEh3.EZpvd().setValue(new ArrayList());
                    pUU.copydefault(c17410fEh3.copydefault, "getAllWalletAssets error message :" + thM7380exceptionOrNullimpl.getMessage());
                }
                return Unit.INSTANCE;
            }
            c17410fEh = (C17410fEh) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        List list2 = (List) obj;
        if (!list2.isEmpty()) {
            C15274eCg c15274eCg = c17410fEh.EZpvd;
            ArrayList arrayList = new ArrayList();
            Intrinsics.copydefault(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                List<AbstractC12782ctV> listKWHzl = ((AbstractC12784ctX) it.next()).KWHzl();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                Iterator<T> it2 = listKWHzl.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((AbstractC12782ctV) it2.next()).DbNXlk());
                }
                arrayList.addAll(arrayList2);
            }
            this.L$0 = c17410fEh;
            this.L$1 = list2;
            this.label = 2;
            Object objKWHzl = c15274eCg.KWHzl(arrayList, false, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            list = list2;
            objM7386unboximpl = objKWHzl;
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            }
            MutableLiveData<List<fDL<Object>>> mutableLiveDataEZpvd2 = c17410fEh.EZpvd();
            Intrinsics.copydefault(list);
            mutableLiveDataEZpvd2.setValue(CollectionsKt___CollectionsKt.fJNWhG((Collection) c17410fEh.KWHzl((List<? extends AbstractC12784ctX>) list, (Map<String, ? extends EIP7702WalletStatus>) obj2)));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            C17410fEh c17410fEh32 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        c17410fEh.EZpvd().setValue(new ArrayList());
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        C17410fEh c17410fEh322 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
