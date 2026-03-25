package com.okinc.dexkline.market.features.coindetail.domain;

import com.okinc.dexkline.market.data.model.CompactTagData;
import com.okinc.dexkline.market.features.coindetail.domain.models.SniperHolder;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
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
import o.C34541ndy;
import o.C56391yDq;
import o.C56442yFn;
import o.mWB;
import o.mXB;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.coindetail.domain.MapSniperUseCase$map-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class MapSniperUseCase$mapgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends mXB>>, Object> {
    final /* synthetic */ SniperHolder $from$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ mWB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapSniperUseCase$mapgIAlus$$inlined$dexRunCatching$1(Continuation continuation, SniperHolder sniperHolder, mWB mwb) {
        super(2, continuation);
        this.$from$inlined = sniperHolder;
        this.this$0 = mwb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapSniperUseCase$mapgIAlus$$inlined$dexRunCatching$1(continuation, this.$from$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends mXB>> continuation) {
        return ((MapSniperUseCase$mapgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[Catch: all -> 0x0090, CancellationException -> 0x00a7, TryCatch #2 {CancellationException -> 0x00a7, all -> 0x0090, blocks: (B:6:0x0013, B:17:0x0064, B:20:0x006b, B:12:0x003b, B:14:0x0041, B:23:0x0073, B:22:0x006f, B:11:0x0028), top: B:31:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: all -> 0x0090, CancellationException -> 0x00a7, TryCatch #2 {CancellationException -> 0x00a7, all -> 0x0090, blocks: (B:6:0x0013, B:17:0x0064, B:20:0x006b, B:12:0x003b, B:14:0x0041, B:23:0x0073, B:22:0x006f, B:11:0x0028), top: B:31:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[Catch: all -> 0x0090, CancellationException -> 0x00a7, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00a7, all -> 0x0090, blocks: (B:6:0x0013, B:17:0x0064, B:20:0x006b, B:12:0x003b, B:14:0x0041, B:23:0x0073, B:22:0x006f, B:11:0x0028), top: B:31:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0061 -> B:17:0x0064). Please report as a decompilation issue!!! */
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
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            List<CompactTagData> newTagList = this.$from$inlined.getNewTagList();
            arrayList = new ArrayList();
            it = newTagList.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            arrayList = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objKWHzl = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objKWHzl)) {
                objKWHzl = null;
            }
            TagWrapper tagWrapper = (TagWrapper) objKWHzl;
            if (tagWrapper != null) {
                arrayList.add(tagWrapper);
            }
            if (it.hasNext()) {
                CompactTagData compactTagData = (CompactTagData) it.next();
                C34541ndy c34541ndy = this.this$0.AEQbTJ;
                this.L$0 = arrayList;
                this.L$1 = it;
                this.label = 1;
                objKWHzl = c34541ndy.KWHzl(compactTagData, (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 16) != 0 ? null : null, (30 & 32) != 0 ? null : null, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objKWHzl)) {
                }
                TagWrapper tagWrapper2 = (TagWrapper) objKWHzl;
                if (tagWrapper2 != null) {
                }
                if (it.hasNext()) {
                    objM7377constructorimpl = Result.m7377constructorimpl(new mXB(this.$from$inlined.getHoldStatus(), this.$from$inlined.getHolderAddress(), null, (List) arrayList, 4, null));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
    }
}
