package com.okinc.business.market.features.watch_list_groups.domain.token;

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
import o.AbstractC43419rot;
import o.C27767kCp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC27771kCt;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.watch_list_groups.domain.token.GetGroupsWithTokenStatusUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetGroupsWithTokenStatusUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends CommonGroupData>>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C27767kCp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGroupsWithTokenStatusUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C27767kCp c27767kCp, String str, String str2) {
        super(2, continuation);
        this.this$0 = c27767kCp;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetGroupsWithTokenStatusUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends CommonGroupData>>> continuation) {
        return ((GetGroupsWithTokenStatusUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a A[Catch: all -> 0x00b3, CancellationException -> 0x00ca, LOOP:0: B:24:0x0094->B:26:0x009a, LOOP_END, TryCatch #2 {CancellationException -> 0x00ca, all -> 0x00b3, blocks: (B:7:0x0012, B:23:0x0071, B:24:0x0094, B:26:0x009a, B:27:0x00ae, B:12:0x0026, B:19:0x0059, B:15:0x0030), top: B:35:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        InterfaceC27771kCt interfaceC27771kCt;
        String str2;
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
            String strCopydefault = this.this$0.EZpvd.copydefault();
            InterfaceC27771kCt interfaceC27771kCt2 = this.this$0.KWHzl;
            kKG kkg = this.this$0.EZpvd;
            this.L$0 = strCopydefault;
            this.L$1 = interfaceC27771kCt2;
            this.label = 1;
            Object objAEQbTJ = kkg.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            str = strCopydefault;
            obj = objAEQbTJ;
            interfaceC27771kCt = interfaceC27771kCt2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Object objAEQbTJ2 = ((AbstractC43419rot) obj).AEQbTJ();
                this.this$0.OLrzqt.copydefault(str2, (List) objAEQbTJ2);
                Iterable iterable = (Iterable) objAEQbTJ2;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.this$0.copydefault.EZpvd((CommonGroupData) it.next()));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            InterfaceC27771kCt interfaceC27771kCt3 = (InterfaceC27771kCt) this.L$1;
            String str3 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            interfaceC27771kCt = interfaceC27771kCt3;
            str = str3;
        }
        String str4 = this.$chainId$inlined;
        String str5 = this.$tokenContractAddress$inlined;
        this.L$0 = str;
        this.L$1 = null;
        this.label = 2;
        obj = interfaceC27771kCt.KWHzl((String) obj, str, str4, str5, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        str2 = str;
        Object objAEQbTJ22 = ((AbstractC43419rot) obj).AEQbTJ();
        this.this$0.OLrzqt.copydefault(str2, (List) objAEQbTJ22);
        Iterable iterable2 = (Iterable) objAEQbTJ22;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(arrayList2);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
