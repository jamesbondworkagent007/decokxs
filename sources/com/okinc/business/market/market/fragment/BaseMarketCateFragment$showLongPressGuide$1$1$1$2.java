package com.okinc.business.market.market.fragment;

import android.view.View;
import android.widget.LinearLayout;
import com.okinc.business.market.market.fragment.BaseMarketCateFragment$showLongPressGuide$1$1$1$2;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC27870kGj;
import o.C52812wZg;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.qZH;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseMarketCateFragment$showLongPressGuide$1$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LinearLayout $mockLongPressView;
    final /* synthetic */ View $visibleItem;
    int label;
    final /* synthetic */ AbstractC27870kGj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketCateFragment$showLongPressGuide$1$1$1$2(View view, LinearLayout linearLayout, AbstractC27870kGj abstractC27870kGj, Continuation<? super BaseMarketCateFragment$showLongPressGuide$1$1$1$2> continuation) {
        super(2, continuation);
        this.$visibleItem = view;
        this.$mockLongPressView = linearLayout;
        this.this$0 = abstractC27870kGj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseMarketCateFragment$showLongPressGuide$1$1$1$2(this.$visibleItem, this.$mockLongPressView, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseMarketCateFragment$showLongPressGuide$1$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(50L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        int iDp2px$default = 0 - C55298xhM.dp2px$default(18.0f, null, 1, null);
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(this.$visibleItem);
        AbstractC27870kGj abstractC27870kGj = this.this$0;
        final LinearLayout linearLayout = this.$mockLongPressView;
        stateListAnimator.EZpvd(1);
        stateListAnimator.copydefault(iDp2px$default);
        stateListAnimator.AEQbTJ(0);
        stateListAnimator.KWHzl(iDp2px$default);
        stateListAnimator.OLrzqt(0);
        stateListAnimator.AEQbTJ(abstractC27870kGj.AEQbTJ);
        stateListAnimator.AEQbTJ(abstractC27870kGj.getString(qZH.PendingIntent.ExKek));
        stateListAnimator.OLrzqt(abstractC27870kGj.getString(qZH.PendingIntent.DcMfJKsuEgdN));
        stateListAnimator.copydefault(new Function0() { // from class: o.kGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(BaseMarketCateFragment$showLongPressGuide$1$1$1$2.invokeSuspend$lambda$1$lambda$0(linearLayout));
            }
        });
        C52812wZg.StateListAnimator stateListAnimator2 = new C52812wZg.StateListAnimator(this.$mockLongPressView);
        AbstractC27870kGj abstractC27870kGj2 = this.this$0;
        final LinearLayout linearLayout2 = this.$mockLongPressView;
        stateListAnimator2.EZpvd(1);
        stateListAnimator2.copydefault(abstractC27870kGj2.copydefault * 2);
        stateListAnimator2.AEQbTJ(abstractC27870kGj2.copydefault);
        stateListAnimator2.KWHzl(abstractC27870kGj2.copydefault * 2);
        stateListAnimator2.OLrzqt(abstractC27870kGj2.copydefault);
        stateListAnimator2.AEQbTJ(abstractC27870kGj2.AEQbTJ);
        stateListAnimator2.AEQbTJ(abstractC27870kGj2.getString(qZH.PendingIntent.DlmWDR));
        stateListAnimator2.OLrzqt(abstractC27870kGj2.getString(qZH.PendingIntent.DcMfJKfwDlxl));
        stateListAnimator2.copydefault(new Function0() { // from class: o.kGs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(BaseMarketCateFragment$showLongPressGuide$1$1$1$2.invokeSuspend$lambda$3$lambda$2(linearLayout2));
            }
        });
        C52812wZg c52812wZg = this.this$0.EZpvd;
        if (c52812wZg != null) {
            final AbstractC27870kGj abstractC27870kGj3 = this.this$0;
            final LinearLayout linearLayout3 = this.$mockLongPressView;
            c52812wZg.EZpvd(yDY.AhwBna(stateListAnimator, stateListAnimator2));
            c52812wZg.OLrzqt(3);
            c52812wZg.KWHzl(new Function0() { // from class: o.kGq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return BaseMarketCateFragment$showLongPressGuide$1$1$1$2.invokeSuspend$lambda$5$lambda$4(linearLayout3, abstractC27870kGj3);
                }
            });
            abstractC27870kGj3.AhwBna = true;
            c52812wZg.fARcdN();
        }
        SPUtils.put("market_long_press_showed", C56443yFo.KWHzl(true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1$lambda$0(LinearLayout linearLayout) {
        linearLayout.setVisibility(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$3$lambda$2(LinearLayout linearLayout) {
        linearLayout.setVisibility(8);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5$lambda$4(LinearLayout linearLayout, AbstractC27870kGj abstractC27870kGj) {
        linearLayout.setVisibility(8);
        abstractC27870kGj.AhwBna = false;
        return Unit.INSTANCE;
    }
}
