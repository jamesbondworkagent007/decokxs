package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenTabFragment$observeViewModel$1;
import java.util.Collection;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC28871kiu;
import o.C25386ivj;
import o.C28841kiQ;
import o.C31256lqb;
import o.C33129mqd;
import o.C55173xeu;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.hBU;
import o.rVN;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenTabFragment$observeViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C28841kiQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenTabFragment$observeViewModel$1(C28841kiQ c28841kiQ, Continuation<? super TokenTabFragment$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c28841kiQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenTabFragment$observeViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenTabFragment$observeViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<AbstractC28871kiu> stateFlowKWHzl = this.this$0.AkhnZx().KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (stateFlowKWHzl.collect(anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenTabFragment$observeViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ C28841kiQ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(C28841kiQ c28841kiQ) {
            this.copydefault = c28841kiQ;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC28871kiu abstractC28871kiu, Continuation<? super Unit> continuation) {
            hBU hbuOLrzqt = C28841kiQ.OLrzqt(this.copydefault);
            if (hbuOLrzqt != null) {
                final C28841kiQ c28841kiQ = this.copydefault;
                if ((abstractC28871kiu instanceof AbstractC28871kiu.StateListAnimator) || (abstractC28871kiu instanceof AbstractC28871kiu.Application)) {
                    TextView textView = hbuOLrzqt.AkhnZx;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(8);
                    C55173xeu c55173xeu = hbuOLrzqt.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                    c55173xeu.setVisibility(8);
                    RecyclerView recyclerView = hbuOLrzqt.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                    recyclerView.setVisibility(8);
                } else {
                    if (!(abstractC28871kiu instanceof AbstractC28871kiu.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC28871kiu.ActionBar actionBar = (AbstractC28871kiu.ActionBar) abstractC28871kiu;
                    String strKWHzl = C31256lqb.KWHzl(actionBar.OLrzqt(), (Function0<String>) new Function0() { // from class: o.kiU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return TokenTabFragment$observeViewModel$1.AnonymousClass1.EZpvd(c28841kiQ);
                        }
                    });
                    ImageView imageView = hbuOLrzqt.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    C25386ivj.loadSquareImage$default(imageView, strKWHzl, C55298xhM.dpInt$default(12, (Context) null, 1, (Object) null), null, 4, null);
                    boolean zKWHzl = C33129mqd.KWHzl((Collection) actionBar.KWHzl());
                    TextView textView2 = hbuOLrzqt.AkhnZx;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(zKWHzl ? 0 : 8);
                    RecyclerView recyclerView2 = hbuOLrzqt.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                    recyclerView2.setVisibility(zKWHzl ? 0 : 8);
                    c28841kiQ.isConnected().submitList(actionBar.KWHzl());
                    C55173xeu c55173xeu2 = hbuOLrzqt.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                    c55173xeu2.setVisibility(8);
                    rVN.reportFullyDrawn$default((Fragment) c28841kiQ, true, (String) null, 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }

        public static final String EZpvd(final C28841kiQ c28841kiQ) {
            return C31256lqb.KWHzl(c28841kiQ.DbNXlk().copydefault(), (Function0<String>) new Function0() { // from class: o.kiW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return TokenTabFragment$observeViewModel$1.AnonymousClass1.OLrzqt(c28841kiQ);
                }
            });
        }

        public static final String OLrzqt(C28841kiQ c28841kiQ) {
            return c28841kiQ.values().AhwBna();
        }
    }
}
