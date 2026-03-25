package com.okinc.business.market.features.home_favorite_list.domain;

import com.okinc.business.market.data.model.HomeFavoriteTokenData;
import java.util.ArrayList;
import java.util.Collection;
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
import o.C28410kaJ;
import o.C28413kaM;
import o.C28422kaV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27771kCt;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.home_favorite_list.domain.GetFavoriteListUseCase$getFavoriteList-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetFavoriteListUseCase$getFavoriteList0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C28422kaV>>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ int $groupId$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C28410kaJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFavoriteListUseCase$getFavoriteList0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C28410kaJ c28410kaJ, int i, String str) {
        super(2, continuation);
        this.this$0 = c28410kaJ;
        this.$groupId$inlined = i;
        this.$chainId$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetFavoriteListUseCase$getFavoriteList0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$groupId$inlined, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C28422kaV>>> continuation) {
        return ((GetFavoriteListUseCase$getFavoriteList0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[Catch: all -> 0x00bb, CancellationException -> 0x00d2, TryCatch #2 {CancellationException -> 0x00d2, all -> 0x00bb, blocks: (B:8:0x001a, B:30:0x00a5, B:33:0x00ac, B:25:0x0086, B:27:0x008c, B:36:0x00b4, B:35:0x00b0, B:12:0x002d, B:24:0x0073, B:15:0x0035, B:21:0x0056, B:18:0x003d), top: B:44:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0 A[Catch: all -> 0x00bb, CancellationException -> 0x00d2, TryCatch #2 {CancellationException -> 0x00d2, all -> 0x00bb, blocks: (B:8:0x001a, B:30:0x00a5, B:33:0x00ac, B:25:0x0086, B:27:0x008c, B:36:0x00b4, B:35:0x00b0, B:12:0x002d, B:24:0x0073, B:15:0x0035, B:21:0x0056, B:18:0x003d), top: B:44:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[Catch: all -> 0x00bb, CancellationException -> 0x00d2, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00d2, all -> 0x00bb, blocks: (B:8:0x001a, B:30:0x00a5, B:33:0x00ac, B:25:0x0086, B:27:0x008c, B:36:0x00b4, B:35:0x00b0, B:12:0x002d, B:24:0x0073, B:15:0x0035, B:21:0x0056, B:18:0x003d), top: B:44:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:30:0x00a5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        InterfaceC27771kCt interfaceC27771kCt;
        Collection arrayList;
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
            interfaceC27771kCt = this.this$0.copydefault;
            kKG kkg = this.this$0.EZpvd;
            this.L$0 = interfaceC27771kCt;
            this.label = 1;
            obj = kkg.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            interfaceC27771kCt = (InterfaceC27771kCt) this.L$0;
            C56391yDq.AEQbTJ(obj);
        } else if (i == 2) {
            C56391yDq.AEQbTJ(obj);
            Iterable iterable = (Iterable) ((AbstractC43419rot) obj).AEQbTJ();
            arrayList = new ArrayList();
            it = iterable.iterator();
            if (!it.hasNext()) {
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            arrayList = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objAEQbTJ = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objAEQbTJ)) {
                objAEQbTJ = null;
            }
            C28422kaV c28422kaV = (C28422kaV) objAEQbTJ;
            if (c28422kaV != null) {
                arrayList.add(c28422kaV);
            }
            if (!it.hasNext()) {
                HomeFavoriteTokenData homeFavoriteTokenData = (HomeFavoriteTokenData) it.next();
                C28413kaM c28413kaM = this.this$0.OLrzqt;
                this.L$0 = arrayList;
                this.L$1 = it;
                this.label = 3;
                objAEQbTJ = c28413kaM.AEQbTJ(homeFavoriteTokenData, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                }
                C28422kaV c28422kaV2 = (C28422kaV) objAEQbTJ;
                if (c28422kaV2 != null) {
                }
                if (!it.hasNext()) {
                    objM7377constructorimpl = Result.m7377constructorimpl((List) arrayList);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
        InterfaceC27771kCt interfaceC27771kCt2 = interfaceC27771kCt;
        String strCopydefault = this.this$0.EZpvd.copydefault();
        int i2 = this.$groupId$inlined;
        String str = this.$chainId$inlined;
        this.L$0 = null;
        this.label = 2;
        obj = interfaceC27771kCt2.EZpvd((String) obj, strCopydefault, i2, str, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        Iterable iterable2 = (Iterable) ((AbstractC43419rot) obj).AEQbTJ();
        arrayList = new ArrayList();
        it = iterable2.iterator();
        if (!it.hasNext()) {
        }
    }
}
