package com.okinc.dexkline.market.features.tag.domain;

import com.okinc.dexkline.market.data.model.TagMetaData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34537ndu;
import o.C34542ndz;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.tag.domain.GetTagMetaUseCase$getTagMeta-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class GetTagMetaUseCase$getTagMeta0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TagMeta>>, Object> {
    final /* synthetic */ String $key$inlined;
    final /* synthetic */ boolean $refreshCache$inlined;
    int label;
    final /* synthetic */ C34542ndz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTagMetaUseCase$getTagMeta0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C34542ndz c34542ndz, boolean z, String str) {
        super(2, continuation);
        this.this$0 = c34542ndz;
        this.$refreshCache$inlined = z;
        this.$key$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetTagMetaUseCase$getTagMeta0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$refreshCache$inlined, this.$key$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TagMeta>> continuation) {
        return ((GetTagMetaUseCase$getTagMeta0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: all -> 0x00b1, CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, all -> 0x00b1, blocks: (B:7:0x0011, B:35:0x008b, B:39:0x0096, B:41:0x00a0, B:43:0x00ac, B:38:0x0092, B:11:0x0024, B:32:0x0076, B:12:0x002d, B:18:0x004b, B:22:0x0056, B:24:0x005e, B:27:0x0063, B:29:0x0067, B:21:0x0052, B:15:0x003a), top: B:51:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[Catch: all -> 0x00b1, CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, all -> 0x00b1, blocks: (B:7:0x0011, B:35:0x008b, B:39:0x0096, B:41:0x00a0, B:43:0x00ac, B:38:0x0092, B:11:0x0024, B:32:0x0076, B:12:0x002d, B:18:0x004b, B:22:0x0056, B:24:0x005e, B:27:0x0063, B:29:0x0067, B:21:0x0052, B:15:0x003a), top: B:51:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        Object objKWHzl;
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
            C34537ndu c34537ndu = this.this$0.OLrzqt;
            this.label = 1;
            objAEQbTJ = c34537ndu.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
                        objKWHzl = yDY.AhwBna();
                    }
                    TagMetaData tagMetaData = (TagMetaData) CollectionsKt___CollectionsKt.firstOrNull((List) objKWHzl);
                    TagMeta tagMetaOLrzqt = tagMetaData != null ? this.this$0.copydefault.OLrzqt(tagMetaData) : null;
                    objM7377constructorimpl = Result.m7377constructorimpl(tagMetaOLrzqt);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                C34537ndu c34537ndu2 = this.this$0.OLrzqt;
                List<String> listEZpvd = C56402yEa.EZpvd(this.$key$inlined);
                this.label = 3;
                objKWHzl = c34537ndu2.KWHzl(listEZpvd, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
                }
                TagMetaData tagMetaData2 = (TagMetaData) CollectionsKt___CollectionsKt.firstOrNull((List) objKWHzl);
                if (tagMetaData2 != null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(tagMetaOLrzqt);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            objAEQbTJ = C56443yFo.KWHzl(true);
        }
        if (((Boolean) objAEQbTJ).booleanValue() && !this.$refreshCache$inlined) {
            objM7377constructorimpl = Result.m7377constructorimpl(tagMetaOLrzqt);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        if (this.$refreshCache$inlined) {
            C34537ndu c34537ndu3 = this.this$0.OLrzqt;
            this.label = 2;
            if (c34537ndu3.OLrzqt(this) == objCopydefault) {
                return objCopydefault;
            }
        }
        C34537ndu c34537ndu22 = this.this$0.OLrzqt;
        List<String> listEZpvd2 = C56402yEa.EZpvd(this.$key$inlined);
        this.label = 3;
        objKWHzl = c34537ndu22.KWHzl(listEZpvd2, this);
        if (objKWHzl == objCopydefault) {
        }
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
        }
        TagMetaData tagMetaData22 = (TagMetaData) CollectionsKt___CollectionsKt.firstOrNull((List) objKWHzl);
        if (tagMetaData22 != null) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(tagMetaOLrzqt);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
