package com.okinc.ok_kyc_core.presentation.views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC42074rFj;
import o.AbstractC43887rxk;
import o.C42250rLx;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.rGL;
import o.rQO;

/* JADX INFO: loaded from: classes23.dex */
public final class CtaCardView$observe$1$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CtaCardAppModel $appModel;
    final /* synthetic */ GroupDynamic $dynamic;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Ref.ObjectRef<Map<String, String>> $queryMap;
    final /* synthetic */ AbstractC42074rFj $vm;
    int label;
    final /* synthetic */ C42250rLx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CtaCardView$observe$1$3$1$1(CtaCardAppModel ctaCardAppModel, C42250rLx c42250rLx, AbstractC42074rFj abstractC42074rFj, GroupDynamic groupDynamic, Ref.ObjectRef<Map<String, String>> objectRef, LifecycleOwner lifecycleOwner, Continuation<? super CtaCardView$observe$1$3$1$1> continuation) {
        super(2, continuation);
        this.$appModel = ctaCardAppModel;
        this.this$0 = c42250rLx;
        this.$vm = abstractC42074rFj;
        this.$dynamic = groupDynamic;
        this.$queryMap = objectRef;
        this.$lifecycleOwner = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CtaCardView$observe$1$3$1$1(this.$appModel, this.this$0, this.$vm, this.$dynamic, this.$queryMap, this.$lifecycleOwner, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CtaCardView$observe$1$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            CtaCardView$observe$1$3$1$1$contentList$1 ctaCardView$observe$1$3$1$1$contentList$1 = new CtaCardView$observe$1$3$1$1$contentList$1(this.$vm, this.$dynamic, this.$queryMap, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, ctaCardView$observe$1$3$1$1$contentList$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        }
        List<? extends UIComponentAppModel> list = (List) obj;
        if (list != null) {
            this.$appModel.setContentList(list);
            rQO rqo = this.this$0.copydefault;
            if (rqo != null) {
                C42250rLx c42250rLx = this.this$0;
                CtaCardAppModel ctaCardAppModel = this.$appModel;
                AbstractC42074rFj abstractC42074rFj = this.$vm;
                LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
                AbstractC43887rxk abstractC43887rxk = c42250rLx.OLrzqt;
                if (abstractC43887rxk != null && (linearLayout4 = abstractC43887rxk.KWHzl) != null) {
                    linearLayout4.removeAllViews();
                }
                if (!ctaCardAppModel.getContentList().isEmpty()) {
                    AbstractC43887rxk abstractC43887rxk2 = c42250rLx.OLrzqt;
                    if (abstractC43887rxk2 != null && (linearLayout3 = abstractC43887rxk2.EZpvd) != null) {
                        linearLayout3.setVisibility(0);
                    }
                    rGL.setUpFormWithAppModel$default((rGL) abstractC42074rFj, ctaCardAppModel.getContentList(), null, 2, null);
                    ((UIComponentAppModel) CollectionsKt___CollectionsKt.AubY(ctaCardAppModel.getContentList())).setBottomMargin(C56443yFo.OLrzqt(0.0f));
                    Context context = c42250rLx.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    for (View view : rqo.EZpvd(context, ctaCardAppModel.getContentList(), abstractC42074rFj, lifecycleOwner, ViewStatus.Card)) {
                        AbstractC43887rxk abstractC43887rxk3 = c42250rLx.OLrzqt;
                        if (abstractC43887rxk3 != null && (linearLayout2 = abstractC43887rxk3.KWHzl) != null) {
                            linearLayout2.addView(view);
                        }
                    }
                } else {
                    AbstractC43887rxk abstractC43887rxk4 = c42250rLx.OLrzqt;
                    if (abstractC43887rxk4 != null && (linearLayout = abstractC43887rxk4.EZpvd) != null) {
                        linearLayout.setVisibility(8);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
