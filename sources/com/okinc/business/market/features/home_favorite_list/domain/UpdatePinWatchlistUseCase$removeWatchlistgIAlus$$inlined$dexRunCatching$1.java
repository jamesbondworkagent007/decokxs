package com.okinc.business.market.features.home_favorite_list.domain;

import com.okinc.business.dexlogic.bean.CollectionTokenParam;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28416kaP;
import o.C28422kaV;
import o.C28424kaX;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.home_favorite_list.domain.UpdatePinWatchlistUseCase$removeWatchlist-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class UpdatePinWatchlistUseCase$removeWatchlistgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ List $tokens$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C28416kaP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePinWatchlistUseCase$removeWatchlistgIAlus$$inlined$dexRunCatching$1(Continuation continuation, C28416kaP c28416kaP, List list) {
        super(2, continuation);
        this.this$0 = c28416kaP;
        this.$tokens$inlined = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdatePinWatchlistUseCase$removeWatchlistgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$tokens$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return ((UpdatePinWatchlistUseCase$removeWatchlistgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: all -> 0x0116, CancellationException -> 0x012d, LOOP:0: B:33:0x0095->B:35:0x009b, LOOP_END, TryCatch #2 {CancellationException -> 0x012d, all -> 0x0116, blocks: (B:7:0x0013, B:39:0x00f5, B:43:0x0107, B:45:0x0111, B:12:0x002a, B:32:0x0082, B:33:0x0095, B:35:0x009b, B:36:0x00e0, B:15:0x0035, B:28:0x006b, B:18:0x003e, B:20:0x004c, B:22:0x0052, B:25:0x005a, B:44:0x010c), top: B:53:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        InterfaceC9738bbJ interfaceC9738bbJValueOf;
        Boolean boolKWHzl;
        Object objAEQbTJ;
        Object objCopydefault;
        InterfaceC9738bbJ interfaceC9738bbJ;
        String str;
        Object objEZpvd;
        Object objCopydefault2 = C56442yFn.copydefault();
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
            interfaceC9738bbJValueOf = this.this$0.AEQbTJ.valueOf();
            if (interfaceC9738bbJValueOf != null && !interfaceC9738bbJValueOf.zsXlph() && !interfaceC9738bbJValueOf.QfsBiF()) {
                kKG kkg = this.this$0.AEQbTJ;
                this.L$0 = interfaceC9738bbJValueOf;
                this.label = 1;
                objAEQbTJ = kkg.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            boolKWHzl = C56443yFo.KWHzl(false);
            objM7377constructorimpl = Result.m7377constructorimpl(boolKWHzl);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj;
                boolKWHzl = C56443yFo.KWHzl(((Number) ((AbstractC43419rot) objEZpvd).AEQbTJ()).intValue() == 1);
                objM7377constructorimpl = Result.m7377constructorimpl(boolKWHzl);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            str = (String) this.L$1;
            InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) this.L$0;
            C56391yDq.AEQbTJ(obj);
            interfaceC9738bbJ = interfaceC9738bbJ2;
            objCopydefault = obj;
            String str2 = (String) objCopydefault;
            List<C28422kaV> list = this.$tokens$inlined;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (C28422kaV c28422kaV : list) {
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new CollectionTokenParam(c28422kaV.EZpvd(), c28422kaV.AkhnZx(), this.this$0.AEQbTJ.EZpvd(interfaceC9738bbJ, c28422kaV.EZpvd()), (Integer) null, str, str2, (String) null, (String) null, c28422kaV.AuCTel(), 192, (DefaultConstructorMarker) null));
                arrayList = arrayList2;
                interfaceC9738bbJ = interfaceC9738bbJ;
            }
            C28424kaX c28424kaX = this.this$0.copydefault;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            objEZpvd = c28424kaX.EZpvd(arrayList, this);
            if (objEZpvd == objCopydefault2) {
                return objCopydefault2;
            }
            boolKWHzl = C56443yFo.KWHzl(((Number) ((AbstractC43419rot) objEZpvd).AEQbTJ()).intValue() == 1);
            objM7377constructorimpl = Result.m7377constructorimpl(boolKWHzl);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        interfaceC9738bbJValueOf = (InterfaceC9738bbJ) this.L$0;
        C56391yDq.AEQbTJ(obj);
        objAEQbTJ = obj;
        String str3 = (String) objAEQbTJ;
        kKG kkg2 = this.this$0.AEQbTJ;
        this.L$0 = interfaceC9738bbJValueOf;
        this.L$1 = str3;
        this.label = 2;
        objCopydefault = kkg2.copydefault(this);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        interfaceC9738bbJ = interfaceC9738bbJValueOf;
        str = str3;
        String str22 = (String) objCopydefault;
        List<C28422kaV> list2 = this.$tokens$inlined;
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
        while (r19.hasNext()) {
        }
        C28424kaX c28424kaX2 = this.this$0.copydefault;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        objEZpvd = c28424kaX2.EZpvd(arrayList3, this);
        if (objEZpvd == objCopydefault2) {
        }
        boolKWHzl = C56443yFo.KWHzl(((Number) ((AbstractC43419rot) objEZpvd).AEQbTJ()).intValue() == 1);
        objM7377constructorimpl = Result.m7377constructorimpl(boolKWHzl);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
