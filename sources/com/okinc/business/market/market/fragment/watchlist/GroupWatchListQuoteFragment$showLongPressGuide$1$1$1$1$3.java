package com.okinc.business.market.market.fragment.watchlist;

import android.view.View;
import android.widget.LinearLayout;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListQuoteFragment$showLongPressGuide$1$1$1$1$3;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C27931kIq;
import o.C52812wZg;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.qZH;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListQuoteFragment$showLongPressGuide$1$1$1$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LinearLayout $mockLongPressView;
    final /* synthetic */ C52812wZg $tmpCoachMark;
    final /* synthetic */ View $visibleItem;
    int label;
    final /* synthetic */ C27931kIq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListQuoteFragment$showLongPressGuide$1$1$1$1$3(View view, LinearLayout linearLayout, C27931kIq c27931kIq, C52812wZg c52812wZg, Continuation<? super GroupWatchListQuoteFragment$showLongPressGuide$1$1$1$1$3> continuation) {
        super(2, continuation);
        this.$visibleItem = view;
        this.$mockLongPressView = linearLayout;
        this.this$0 = c27931kIq;
        this.$tmpCoachMark = c52812wZg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupWatchListQuoteFragment$showLongPressGuide$1$1$1$1$3(this.$visibleItem, this.$mockLongPressView, this.this$0, this.$tmpCoachMark, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupWatchListQuoteFragment$showLongPressGuide$1$1$1$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(this.$visibleItem);
        C27931kIq c27931kIq = this.this$0;
        final LinearLayout linearLayout = this.$mockLongPressView;
        stateListAnimator.EZpvd(1);
        stateListAnimator.copydefault(c27931kIq.OLrzqt);
        stateListAnimator.AEQbTJ(0);
        stateListAnimator.KWHzl(c27931kIq.OLrzqt);
        stateListAnimator.OLrzqt(0);
        stateListAnimator.AEQbTJ(c27931kIq.AEQbTJ);
        stateListAnimator.AEQbTJ(c27931kIq.getString(qZH.PendingIntent.ExKek));
        stateListAnimator.OLrzqt(c27931kIq.getString(qZH.PendingIntent.DcMfJKsuEgdN));
        stateListAnimator.copydefault(new Function0() { // from class: o.kIx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(GroupWatchListQuoteFragment$showLongPressGuide$1$1$1$1$3.invokeSuspend$lambda$1$lambda$0(linearLayout));
            }
        });
        LinearLayout linearLayout2 = this.$mockLongPressView;
        View childAt = linearLayout2.getChildAt(linearLayout2.getChildCount() - 1);
        Intrinsics.checkNotNullExpressionValue(childAt, "");
        C52812wZg.StateListAnimator stateListAnimator2 = new C52812wZg.StateListAnimator(childAt);
        C27931kIq c27931kIq2 = this.this$0;
        final LinearLayout linearLayout3 = this.$mockLongPressView;
        stateListAnimator2.EZpvd(1);
        stateListAnimator2.copydefault(0);
        stateListAnimator2.AEQbTJ(0);
        stateListAnimator2.KWHzl(0);
        stateListAnimator2.OLrzqt(0);
        stateListAnimator2.AEQbTJ(c27931kIq2.AEQbTJ);
        stateListAnimator2.AEQbTJ(c27931kIq2.getString(qZH.PendingIntent.iUnTnt));
        stateListAnimator2.OLrzqt(c27931kIq2.getString(qZH.PendingIntent.DfrfUJ));
        stateListAnimator2.copydefault(new Function0() { // from class: o.kID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(GroupWatchListQuoteFragment$showLongPressGuide$1$1$1$1$3.invokeSuspend$lambda$4$lambda$3(linearLayout3));
            }
        });
        this.this$0.AYXKKw = false;
        final C27931kIq c27931kIq3 = this.this$0;
        C52812wZg c52812wZg = this.$tmpCoachMark;
        final LinearLayout linearLayout4 = this.$mockLongPressView;
        c52812wZg.EZpvd(yDY.AhwBna(stateListAnimator, stateListAnimator2));
        c52812wZg.OLrzqt(3);
        c52812wZg.fARcdN();
        c52812wZg.KWHzl();
        c52812wZg.EZpvd(yDY.AhwBna(stateListAnimator, stateListAnimator2));
        c52812wZg.OLrzqt(3);
        c52812wZg.KWHzl(new Function0() { // from class: o.kIE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GroupWatchListQuoteFragment$showLongPressGuide$1$1$1$1$3.invokeSuspend$lambda$6$lambda$5(linearLayout4, c27931kIq3);
            }
        });
        c52812wZg.fARcdN();
        c27931kIq3.gEmmrt = c52812wZg;
        SPUtils.put("market.group.watchlist.long.press.showed", C56443yFo.KWHzl(true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1$lambda$0(LinearLayout linearLayout) {
        linearLayout.setVisibility(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$4$lambda$3(LinearLayout linearLayout) {
        linearLayout.setVisibility(8);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6$lambda$5(LinearLayout linearLayout, C27931kIq c27931kIq) {
        linearLayout.setVisibility(8);
        c27931kIq.AYXKKw = true;
        return Unit.INSTANCE;
    }
}
