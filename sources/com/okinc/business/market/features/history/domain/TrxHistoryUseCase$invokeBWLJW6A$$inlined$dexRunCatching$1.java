package com.okinc.business.market.features.history.domain;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.history.domain.model.HistoryChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C26249jXl;
import o.C26250jXm;
import o.C26252jXo;
import o.C26277jYm;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.history.domain.TrxHistoryUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class TrxHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ boolean $isMainHistory$inlined;
    final /* synthetic */ String $lastItemId$inlined;
    final /* synthetic */ TokenFilter $tokenFilter$inlined;
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ C26249jXl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrxHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, String str, C26249jXl c26249jXl, TokenFilter tokenFilter, boolean z) {
        super(2, continuation);
        this.$lastItemId$inlined = str;
        this.this$0 = c26249jXl;
        this.$tokenFilter$inlined = tokenFilter;
        this.$isMainHistory$inlined = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrxHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.$lastItemId$inlined, this.this$0, this.$tokenFilter$inlined, this.$isMainHistory$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return ((TrxHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:46:0x00da) to fix multi-entry loop: BACK_EDGE: B:46:0x00da -> B:52:0x00f5 */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f5, code lost:
    
        r13 = (o.C26277jYm) r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[Catch: all -> 0x0151, CancellationException -> 0x0168, TryCatch #2 {CancellationException -> 0x0168, all -> 0x0151, blocks: (B:10:0x001a, B:70:0x0148, B:15:0x0029, B:18:0x003a, B:51:0x00f3, B:53:0x00f7, B:35:0x00a9, B:37:0x00af, B:39:0x00b9, B:43:0x00d3, B:46:0x00da, B:47:0x00dd, B:55:0x00fc, B:57:0x0100, B:60:0x0115, B:62:0x0123, B:65:0x012b, B:66:0x0132, B:21:0x004b, B:24:0x0058, B:34:0x0088, B:27:0x0065, B:31:0x0073), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[Catch: all -> 0x0151, CancellationException -> 0x0168, TryCatch #2 {CancellationException -> 0x0168, all -> 0x0151, blocks: (B:10:0x001a, B:70:0x0148, B:15:0x0029, B:18:0x003a, B:51:0x00f3, B:53:0x00f7, B:35:0x00a9, B:37:0x00af, B:39:0x00b9, B:43:0x00d3, B:46:0x00da, B:47:0x00dd, B:55:0x00fc, B:57:0x0100, B:60:0x0115, B:62:0x0123, B:65:0x012b, B:66:0x0132, B:21:0x004b, B:24:0x0058, B:34:0x0088, B:27:0x0065, B:31:0x0073), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7 A[Catch: all -> 0x0151, CancellationException -> 0x0168, TryCatch #2 {CancellationException -> 0x0168, all -> 0x0151, blocks: (B:10:0x001a, B:70:0x0148, B:15:0x0029, B:18:0x003a, B:51:0x00f3, B:53:0x00f7, B:35:0x00a9, B:37:0x00af, B:39:0x00b9, B:43:0x00d3, B:46:0x00da, B:47:0x00dd, B:55:0x00fc, B:57:0x0100, B:60:0x0115, B:62:0x0123, B:65:0x012b, B:66:0x0132, B:21:0x004b, B:24:0x0058, B:34:0x0088, B:27:0x0065, B:31:0x0073), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc A[Catch: all -> 0x0151, CancellationException -> 0x0168, TryCatch #2 {CancellationException -> 0x0168, all -> 0x0151, blocks: (B:10:0x001a, B:70:0x0148, B:15:0x0029, B:18:0x003a, B:51:0x00f3, B:53:0x00f7, B:35:0x00a9, B:37:0x00af, B:39:0x00b9, B:43:0x00d3, B:46:0x00da, B:47:0x00dd, B:55:0x00fc, B:57:0x0100, B:60:0x0115, B:62:0x0123, B:65:0x012b, B:66:0x0132, B:21:0x004b, B:24:0x0058, B:34:0x0088, B:27:0x0065, B:31:0x0073), top: B:78:0x000c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f0 -> B:51:0x00f3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        int i;
        Object objOLrzqt;
        boolean zBooleanValue;
        Collection arrayList;
        Iterator it;
        int i2;
        Object objM7386unboximpl;
        boolean z;
        C26277jYm c26277jYm;
        boolean z2;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            i = this.$lastItemId$inlined.length() == 0 ? 1 : 0;
            C26252jXo c26252jXo = this.this$0.copydefault;
            String str = this.$lastItemId$inlined;
            TokenFilter tokenFilter = this.$tokenFilter$inlined;
            this.I$0 = i;
            this.label = 1;
            objOLrzqt = c26252jXo.OLrzqt(str, tokenFilter, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else if (i3 == 1) {
            i = this.I$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        } else if (i3 == 2) {
            z = this.Z$0;
            i2 = this.I$0;
            it = (Iterator) this.L$1;
            arrayList = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            if (!Result.m7383isFailureimpl(objM7386unboximpl)) {
            }
            if (c26277jYm != null) {
            }
            zBooleanValue = z;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 3) {
                if (i3 == 4) {
                    z2 = this.Z$0;
                    C56391yDq.AEQbTJ(obj);
                } else {
                    if (i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = this.Z$0;
                    C56391yDq.AEQbTJ(obj);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z2));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            z = this.Z$0;
            i2 = this.I$0;
            it = (Iterator) this.L$1;
            arrayList = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            c26277jYm = (C26277jYm) obj;
            if (c26277jYm != null) {
                arrayList.add(c26277jYm);
            }
            zBooleanValue = z;
            if (it.hasNext()) {
                HistoryChange historyChange = (HistoryChange) it.next();
                if (this.$isMainHistory$inlined) {
                    C26250jXm c26250jXm = this.this$0.valueOf;
                    this.L$0 = arrayList;
                    this.L$1 = it;
                    this.I$0 = i2;
                    this.Z$0 = zBooleanValue;
                    this.label = 2;
                    Object objKWHzl = c26250jXm.KWHzl(historyChange, this);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    z = zBooleanValue;
                    objM7386unboximpl = objKWHzl;
                    c26277jYm = !Result.m7383isFailureimpl(objM7386unboximpl) ? (C26277jYm) null : (C26277jYm) null;
                    if (c26277jYm != null) {
                    }
                    zBooleanValue = z;
                    if (it.hasNext()) {
                        List list = (List) arrayList;
                        if (i2 != 0) {
                            MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.Z$0 = zBooleanValue;
                            this.label = 4;
                            if (mutableStateFlow.emit(list, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            List<C26277jYm> value = this.this$0.AEQbTJ().getValue();
                            List listFJNWhG = value != null ? CollectionsKt___CollectionsKt.fJNWhG((Collection) value) : null;
                            if (listFJNWhG != null) {
                                C56443yFo.KWHzl(listFJNWhG.addAll(list));
                            }
                            MutableStateFlow mutableStateFlow2 = this.this$0.AEQbTJ;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.Z$0 = zBooleanValue;
                            this.label = 5;
                            if (mutableStateFlow2.emit(listFJNWhG, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        z2 = zBooleanValue;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z2));
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                } else {
                    C26249jXl c26249jXl = this.this$0;
                    this.L$0 = arrayList;
                    this.L$1 = it;
                    this.I$0 = i2;
                    this.Z$0 = zBooleanValue;
                    this.label = 3;
                    Object objOLrzqt2 = c26249jXl.OLrzqt(historyChange, this);
                    if (objOLrzqt2 == objCopydefault) {
                        return objCopydefault;
                    }
                    z = zBooleanValue;
                    obj = objOLrzqt2;
                    c26277jYm = (C26277jYm) obj;
                    if (c26277jYm != null) {
                    }
                    zBooleanValue = z;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        Pair pair = (Pair) objOLrzqt;
        List list2 = (List) pair.component1();
        zBooleanValue = ((Boolean) pair.component2()).booleanValue();
        arrayList = new ArrayList();
        it = list2.iterator();
        i2 = i;
        if (it.hasNext()) {
        }
    }
}
