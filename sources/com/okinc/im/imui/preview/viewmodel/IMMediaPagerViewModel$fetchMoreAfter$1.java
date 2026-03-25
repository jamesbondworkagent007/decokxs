package com.okinc.im.imui.preview.viewmodel;

import com.okinc.okimcore.model.im.OKGetMessageDirection;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import o.C35804oEh;
import o.C37233opv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class IMMediaPagerViewModel$fetchMoreAfter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ IMMediaPagerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMMediaPagerViewModel$fetchMoreAfter$1(IMMediaPagerViewModel iMMediaPagerViewModel, Continuation<? super IMMediaPagerViewModel$fetchMoreAfter$1> continuation) {
        super(2, continuation);
        this.this$0 = iMMediaPagerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMMediaPagerViewModel$fetchMoreAfter$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMMediaPagerViewModel$fetchMoreAfter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:28:0x00bb, B:30:0x00c2, B:31:0x00d7, B:33:0x00de, B:34:0x00eb), top: B:47:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:28:0x00bb, B:30:0x00c2, B:31:0x00d7, B:33:0x00de, B:34:0x00eb), top: B:47:0x00bb }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        IMMediaPagerViewModel iMMediaPagerViewModel;
        Mutex mutex2;
        List list;
        IMMediaPagerViewModel iMMediaPagerViewModel2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!this.this$0.valueOf() && this.this$0.copydefault()) {
                    mutex = this.this$0.fetchVPNInfo;
                    iMMediaPagerViewModel = this.this$0;
                    this.L$0 = mutex;
                    this.L$1 = iMMediaPagerViewModel;
                    this.label = 1;
                    if (mutex.lock(null, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iMMediaPagerViewModel2 = (IMMediaPagerViewModel) this.L$2;
                        mutex2 = (Mutex) this.L$1;
                        list = (List) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        try {
                            if (!list.isEmpty()) {
                                iMMediaPagerViewModel2.EZpvd.setValue(CollectionsKt___CollectionsKt.djBIcL((Collection) iMMediaPagerViewModel2.EZpvd.getValue(), (Iterable) list));
                            }
                            if (list.size() < 10) {
                                iMMediaPagerViewModel2.isConnected.set("KEY_HAS_MORE_AFTER", C56443yFo.KWHzl(false));
                            }
                            iMMediaPagerViewModel2.isConnected.set("KEY_IS_LOADING_AFTER", C56443yFo.KWHzl(false));
                            return Unit.INSTANCE;
                        } finally {
                        }
                    }
                    C56391yDq.AEQbTJ(obj);
                    List list2 = (List) obj;
                    mutex2 = this.this$0.fetchVPNInfo;
                    IMMediaPagerViewModel iMMediaPagerViewModel3 = this.this$0;
                    this.L$0 = list2;
                    this.L$1 = mutex2;
                    this.L$2 = iMMediaPagerViewModel3;
                    this.label = 3;
                    if (mutex2.lock(null, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    list = list2;
                    iMMediaPagerViewModel2 = iMMediaPagerViewModel3;
                    if (!list.isEmpty()) {
                    }
                    if (list.size() < 10) {
                    }
                    iMMediaPagerViewModel2.isConnected.set("KEY_IS_LOADING_AFTER", C56443yFo.KWHzl(false));
                    return Unit.INSTANCE;
                }
                iMMediaPagerViewModel = (IMMediaPagerViewModel) this.L$1;
                mutex = (Mutex) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            iMMediaPagerViewModel.isConnected.set("KEY_IS_LOADING_AFTER", C56443yFo.KWHzl(true));
            OKMessage oKMessageKWHzl = ((C37233opv) CollectionsKt___CollectionsKt.AubY((List) iMMediaPagerViewModel.EZpvd.getValue())).KWHzl();
            mutex.unlock(null);
            C35804oEh c35804oEh = this.this$0.djBIcL;
            OKGetMessageDirection oKGetMessageDirection = OKGetMessageDirection.BEHIND;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = c35804oEh.copydefault(oKMessageKWHzl, 10, oKGetMessageDirection, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            List list22 = (List) obj;
            mutex2 = this.this$0.fetchVPNInfo;
            IMMediaPagerViewModel iMMediaPagerViewModel32 = this.this$0;
            this.L$0 = list22;
            this.L$1 = mutex2;
            this.L$2 = iMMediaPagerViewModel32;
            this.label = 3;
            if (mutex2.lock(null, this) != objCopydefault) {
            }
        } finally {
        }
    }
}
