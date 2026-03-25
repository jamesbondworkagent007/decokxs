package com.okinc.business.market.features.history.domain;

import com.okinc.business.market.features.history.domain.model.HistoryChange;
import com.okinc.business.market.features.tag.domain.CompactTag;
import com.okinc.business.market.features.tag.domain.TagWrapper;
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
import o.C26250jXm;
import o.C26277jYm;
import o.C29712kyn;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.history.domain.MapHistoryUseCase$invoke-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MapHistoryUseCase$invokegIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C26277jYm>>, Object> {
    final /* synthetic */ HistoryChange $from$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C26250jXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapHistoryUseCase$invokegIAlus$$inlined$dexRunCatching$1(Continuation continuation, HistoryChange historyChange, C26250jXm c26250jXm) {
        super(2, continuation);
        this.$from$inlined = historyChange;
        this.this$0 = c26250jXm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapHistoryUseCase$invokegIAlus$$inlined$dexRunCatching$1(continuation, this.$from$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C26277jYm>> continuation) {
        return ((MapHistoryUseCase$invokegIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x00c2, CancellationException -> 0x00d9, TryCatch #2 {CancellationException -> 0x00d9, all -> 0x00c2, blocks: (B:6:0x0015, B:17:0x005c, B:20:0x0063, B:12:0x003d, B:14:0x0043, B:23:0x006b, B:22:0x0067, B:11:0x002c), top: B:31:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[Catch: all -> 0x00c2, CancellationException -> 0x00d9, TryCatch #2 {CancellationException -> 0x00d9, all -> 0x00c2, blocks: (B:6:0x0015, B:17:0x005c, B:20:0x0063, B:12:0x003d, B:14:0x0043, B:23:0x006b, B:22:0x0067, B:11:0x002c), top: B:31:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[Catch: all -> 0x00c2, CancellationException -> 0x00d9, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00d9, all -> 0x00c2, blocks: (B:6:0x0015, B:17:0x005c, B:20:0x0063, B:12:0x003d, B:14:0x0043, B:23:0x006b, B:22:0x0067, B:11:0x002c), top: B:31:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0059 -> B:17:0x005c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
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
            List<CompactTag> listAEQbTJ = this.$from$inlined.AEQbTJ();
            arrayList = new ArrayList();
            it = listAEQbTJ.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            arrayList = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objAEQbTJ = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objAEQbTJ)) {
                objAEQbTJ = null;
            }
            TagWrapper tagWrapper = (TagWrapper) objAEQbTJ;
            if (tagWrapper != null) {
                arrayList.add(tagWrapper);
            }
            if (it.hasNext()) {
                CompactTag compactTag = (CompactTag) it.next();
                C29712kyn c29712kyn = this.this$0.AEQbTJ;
                this.L$0 = arrayList;
                this.L$1 = it;
                this.label = 1;
                objAEQbTJ = c29712kyn.AEQbTJ(compactTag, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                }
                TagWrapper tagWrapper2 = (TagWrapper) objAEQbTJ;
                if (tagWrapper2 != null) {
                }
                if (it.hasNext()) {
                    String strKWHzl = this.$from$inlined.KWHzl();
                    String strAhwBna = this.$from$inlined.AhwBna();
                    String strCopydefault = this.$from$inlined.copydefault();
                    String strIsConnected = this.$from$inlined.isConnected();
                    objM7377constructorimpl = Result.m7377constructorimpl(new C26277jYm(strKWHzl, strAhwBna, strCopydefault, this.$from$inlined.gEmmrt(), this.$from$inlined.AYXKKw(), this.$from$inlined.fetchVPNInfo(), this.$from$inlined.OLrzqt(), this.$from$inlined.EZpvd(), this.$from$inlined.valueOf(), this.$from$inlined.djBIcL(), strIsConnected, false, (List) arrayList, 2048, null));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
    }
}
