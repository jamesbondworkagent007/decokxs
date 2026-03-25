package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.tag.domain.TagMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC28861kik;
import o.C28857kig;
import o.C29715kyq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialMediaTabViewModel$fetchDexScreenerTags$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<CompactTagData> $tags;
    int label;
    final /* synthetic */ SocialMediaTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialMediaTabViewModel$fetchDexScreenerTags$1(SocialMediaTabViewModel socialMediaTabViewModel, List<CompactTagData> list, Continuation<? super SocialMediaTabViewModel$fetchDexScreenerTags$1> continuation) {
        super(2, continuation);
        this.this$0 = socialMediaTabViewModel;
        this.$tags = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SocialMediaTabViewModel$fetchDexScreenerTags$1(this.this$0, this.$tags, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SocialMediaTabViewModel$fetchDexScreenerTags$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt.setValue(AbstractC28861kik.TaskDescription.OLrzqt);
            List<CompactTagData> list = this.$tags;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CompactTagData) it.next()).copydefault());
            }
            C29715kyq c29715kyq = this.this$0.AYXKKw;
            this.label = 1;
            objCopydefault = c29715kyq.copydefault((List<String>) arrayList, true, (Continuation<? super Result<? extends List<TagMeta>>>) this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        SocialMediaTabViewModel socialMediaTabViewModel = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
            socialMediaTabViewModel.OLrzqt.setValue(AbstractC28861kik.TaskDescription.OLrzqt);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (TagMeta tagMeta : (List) objCopydefault) {
                String strFetchVPNInfo = tagMeta.fetchVPNInfo();
                String strDbNXlk = tagMeta.DbNXlk();
                String strAYXKKw = tagMeta.AYXKKw();
                String strKWHzl = tagMeta.KWHzl();
                if (strKWHzl.length() == 0) {
                    strKWHzl = tagMeta.EZpvd();
                }
                String str = strKWHzl;
                String strAhwBna = tagMeta.AhwBna();
                arrayList2.add(new C28857kig(strFetchVPNInfo, strDbNXlk, strAYXKKw, str, strAhwBna.length() == 0 ? tagMeta.OLrzqt() : strAhwBna));
            }
            if (!arrayList2.isEmpty()) {
                socialMediaTabViewModel.OLrzqt.setValue(new AbstractC28861kik.Activity(arrayList2));
            } else {
                socialMediaTabViewModel.OLrzqt.setValue(AbstractC28861kik.TaskDescription.OLrzqt);
            }
        }
        return Unit.INSTANCE;
    }
}
