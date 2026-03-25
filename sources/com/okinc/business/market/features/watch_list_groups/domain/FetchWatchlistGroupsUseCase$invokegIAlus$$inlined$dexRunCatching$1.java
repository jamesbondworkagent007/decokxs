package com.okinc.business.market.features.watch_list_groups.domain;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27764kCm;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC27771kCt;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.watch_list_groups.domain.FetchWatchlistGroupsUseCase$invoke-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class FetchWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends CommonGroupData>>>, Object> {
    final /* synthetic */ String $walletAddress$inlined;
    Object L$0;
    int label;
    final /* synthetic */ C27764kCm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1(Continuation continuation, C27764kCm c27764kCm, String str) {
        super(2, continuation);
        this.this$0 = c27764kCm;
        this.$walletAddress$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$walletAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends CommonGroupData>>> continuation) {
        return ((FetchWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[Catch: all -> 0x009d, CancellationException -> 0x00b4, LOOP:0: B:21:0x007e->B:23:0x0084, LOOP_END, TryCatch #2 {CancellationException -> 0x00b4, all -> 0x009d, blocks: (B:6:0x000e, B:20:0x005c, B:21:0x007e, B:23:0x0084, B:24:0x0098, B:11:0x0024, B:17:0x0044, B:14:0x002b), top: B:32:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        InterfaceC27771kCt interfaceC27771kCt;
        Object objAEQbTJ;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            interfaceC27771kCt = this.this$0.OLrzqt;
            kKG kkg = this.this$0.gEmmrt;
            this.L$0 = interfaceC27771kCt;
            this.label = 1;
            obj = kkg.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objAEQbTJ);
                this.this$0.EZpvd.copydefault(this.$walletAddress$inlined, (List) objAEQbTJ);
                Iterable iterable = (Iterable) objAEQbTJ;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.this$0.copydefault.EZpvd((CommonGroupData) it.next()));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            interfaceC27771kCt = (InterfaceC27771kCt) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String strCopydefault = this.this$0.gEmmrt.copydefault();
        this.L$0 = null;
        this.label = 2;
        objAEQbTJ = interfaceC27771kCt.AEQbTJ((String) obj, strCopydefault, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        this.this$0.EZpvd.copydefault(this.$walletAddress$inlined, (List) objAEQbTJ);
        Iterable iterable2 = (Iterable) objAEQbTJ;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(arrayList2);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
