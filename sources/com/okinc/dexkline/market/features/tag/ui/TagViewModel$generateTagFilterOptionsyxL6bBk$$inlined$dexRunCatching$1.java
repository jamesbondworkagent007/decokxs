package com.okinc.dexkline.market.features.tag.ui;

import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34498ndH;
import o.C34640nfs;
import o.C52761wXj;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.tag.ui.TagViewModel$generateTagFilterOptions-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class TagViewModel$generateTagFilterOptionsyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C34640nfs>>>, Object> {
    final /* synthetic */ C34640nfs $allTagsOption$inlined;
    final /* synthetic */ boolean $isNightMode$inlined;
    final /* synthetic */ List $keys$inlined;
    final /* synthetic */ String $selectedKey$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TagViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagViewModel$generateTagFilterOptionsyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, C34640nfs c34640nfs, TagViewModel tagViewModel, List list, String str, boolean z) {
        super(2, continuation);
        this.$allTagsOption$inlined = c34640nfs;
        this.this$0 = tagViewModel;
        this.$keys$inlined = list;
        this.$selectedKey$inlined = str;
        this.$isNightMode$inlined = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TagViewModel$generateTagFilterOptionsyxL6bBk$$inlined$dexRunCatching$1(continuation, this.$allTagsOption$inlined, this.this$0, this.$keys$inlined, this.$selectedKey$inlined, this.$isNightMode$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C34640nfs>>> continuation) {
        return ((TagViewModel$generateTagFilterOptionsyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        List list;
        Object objAhwBna;
        List list2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                List listOLrzqt = C56402yEa.OLrzqt();
                C34640nfs c34640nfs = this.$allTagsOption$inlined;
                if (c34640nfs != null) {
                    C56443yFo.KWHzl(listOLrzqt.add(c34640nfs));
                }
                TagViewModel tagViewModel = this.this$0;
                List list3 = this.$keys$inlined;
                this.L$0 = listOLrzqt;
                this.L$1 = listOLrzqt;
                this.label = 1;
                Object objEZpvd = tagViewModel.EZpvd((List<String>) list3, (Continuation<? super Result<? extends List<TagMeta>>>) this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                list = listOLrzqt;
                objAhwBna = objEZpvd;
                list2 = list;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$1;
                list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAhwBna = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7380exceptionOrNullimpl(objAhwBna) != null) {
                objAhwBna = yDY.AhwBna();
            }
            List<TagMeta> list4 = (List) objAhwBna;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list4, 10));
            for (TagMeta tagMeta : list4) {
                arrayList.add(new C34640nfs(tagMeta.DbNXlk(), null, C34498ndH.OLrzqt.OLrzqt(tagMeta, this.$isNightMode$inlined), C56443yFo.AEQbTJ(C52761wXj.TaskDescription.sElUiK), Intrinsics.EZpvd((Object) tagMeta.values(), (Object) this.$selectedKey$inlined), tagMeta.values(), 2, null));
            }
            list.addAll(arrayList);
            objM7377constructorimpl = Result.m7377constructorimpl(C56402yEa.fARcdN(list2));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
