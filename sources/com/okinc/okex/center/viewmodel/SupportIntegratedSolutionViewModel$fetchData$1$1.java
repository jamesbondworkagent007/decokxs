package com.okinc.okex.center.viewmodel;

import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.center.bean.IntegratedSolutionPageData;
import com.okinc.okex.center.bean.MiniSupportResponse;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC45235slv;
import o.C32989mnw;
import o.C45217sld;
import o.C45352soF;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportIntegratedSolutionViewModel$fetchData$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C45217sld this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportIntegratedSolutionViewModel$fetchData$1$1(C45217sld c45217sld, String str, Continuation<? super SupportIntegratedSolutionViewModel$fetchData$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c45217sld;
        this.$id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportIntegratedSolutionViewModel$fetchData$1$1 supportIntegratedSolutionViewModel$fetchData$1$1 = new SupportIntegratedSolutionViewModel$fetchData$1$1(this.this$0, this.$id, continuation);
        supportIntegratedSolutionViewModel$fetchData$1$1.L$0 = obj;
        return supportIntegratedSolutionViewModel$fetchData$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportIntegratedSolutionViewModel$fetchData$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        MiniSupportResponse miniSupportResponse;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.AYXKKw.setValue(AbstractC45235slv.ActionBar.copydefault);
                C45217sld c45217sld = this.this$0;
                String str = this.$id;
                Result.Application application = Result.Companion;
                C45352soF c45352soF = c45217sld.uzCIH;
                TransactionType transactionTypeCopydefault = c45217sld.copydefault();
                IntegratedSolutionPageType integratedSolutionPageType = c45217sld.AuCTel;
                this.label = 1;
                objEZpvd = c45352soF.EZpvd(integratedSolutionPageType, transactionTypeCopydefault, str, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objEZpvd);
            objM7377constructorimpl = Result.m7377constructorimpl((IntegratedSolutionPageData) objEZpvd);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C45217sld c45217sld2 = this.this$0;
        String str2 = this.$id;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            IntegratedSolutionPageData integratedSolutionPageData = (IntegratedSolutionPageData) objM7377constructorimpl;
            c45217sld2.AYXKKw.setValue(new AbstractC45235slv.Application(null, 1, null));
            c45217sld2.AEQbTJ.setValue(integratedSolutionPageData);
            c45217sld2.AkhnZx.clear();
            c45217sld2.AkhnZx.addAll(integratedSolutionPageData.getRelatedArticles());
            c45217sld2.OLrzqt((List<SupportFaqArticle>) CollectionsKt___CollectionsKt.AhwBna((Iterable) c45217sld2.AkhnZx, 6));
            AnnouncementPopupDisplayModel popupAnnouncement = integratedSolutionPageData.getPopupAnnouncement();
            if (popupAnnouncement != null) {
                c45217sld2.djBIcL.setValue(popupAnnouncement);
            }
            if (c45217sld2.iwGUEr() && (miniSupportResponse = integratedSolutionPageData.getMiniSupportResponse()) != null) {
                c45217sld2.AEQbTJ(miniSupportResponse);
                c45217sld2.valueOf.setValue(miniSupportResponse.getTitle());
                c45217sld2.gEmmrt.setValue(miniSupportResponse.getDescription());
                c45217sld2.KWHzl.setValue(new C32989mnw(C56390yDp.OLrzqt(str2, miniSupportResponse.getDataTrackingKey())));
            }
        }
        C45217sld c45217sld3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            c45217sld3.AYXKKw.setValue(AbstractC45235slv.StateListAnimator.copydefault);
        }
        return Unit.INSTANCE;
    }
}
