package com.okinc.find_ui.widgetprovider.feed;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43417ror;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC35114npH;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class TwoNewsWidget$fetchAndUpdateNews$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int[] $appWidgetIds;
    final /* synthetic */ AppWidgetManager $appWidgetManager;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ TwoNewsWidget this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoNewsWidget$fetchAndUpdateNews$1(TwoNewsWidget twoNewsWidget, Context context, AppWidgetManager appWidgetManager, int[] iArr, Continuation<? super TwoNewsWidget$fetchAndUpdateNews$1> continuation) {
        super(2, continuation);
        this.this$0 = twoNewsWidget;
        this.$context = context;
        this.$appWidgetManager = appWidgetManager;
        this.$appWidgetIds = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwoNewsWidget$fetchAndUpdateNews$1(this.this$0, this.$context, this.$appWidgetManager, this.$appWidgetIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TwoNewsWidget$fetchAndUpdateNews$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<NewsItem> contentDataList;
        List listAhwBna;
        List<NewsItem> contentDataList2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35114npH interfaceC35114npH = (InterfaceC35114npH) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC35114npH.class));
            this.label = 1;
            obj = InterfaceC35114npH.StateListAnimator.getNews$default(interfaceC35114npH, null, 0, this, 3, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        ResponseData responseData = (ResponseData) obj;
        NewsResponse newsResponse = (NewsResponse) responseData.getData();
        if (newsResponse != null && (contentDataList = newsResponse.getContentDataList()) != null && (!contentDataList.isEmpty())) {
            TwoNewsWidget twoNewsWidget = this.this$0;
            Context context = this.$context;
            AppWidgetManager appWidgetManager = this.$appWidgetManager;
            int[] iArr = this.$appWidgetIds;
            NewsResponse newsResponse2 = (NewsResponse) responseData.getData();
            if (newsResponse2 == null || (contentDataList2 = newsResponse2.getContentDataList()) == null || (listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) contentDataList2, 2)) == null) {
                listAhwBna = yDY.AhwBna();
            }
            this.label = 2;
            if (twoNewsWidget.AEQbTJ(context, appWidgetManager, iArr, listAhwBna, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
