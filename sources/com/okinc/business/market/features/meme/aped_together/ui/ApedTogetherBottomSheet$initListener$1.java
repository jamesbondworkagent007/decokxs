package com.okinc.business.market.features.meme.aped_together.ui;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherBottomSheet$initListener$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C23397hxU;
import o.C25390ivn;
import o.C28663key;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28618keF;

/* JADX INFO: loaded from: classes7.dex */
public final class ApedTogetherBottomSheet$initListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C28663key this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApedTogetherBottomSheet$initListener$1(C28663key c28663key, Continuation<? super ApedTogetherBottomSheet$initListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c28663key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ApedTogetherBottomSheet$initListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ApedTogetherBottomSheet$initListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherBottomSheet$initListener$1$5, reason: invalid class name */
    public static final class AnonymousClass5<T> implements FlowCollector {
        public final /* synthetic */ C28663key OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(C28663key c28663key) {
            this.OLrzqt = c28663key;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return copydefault((InterfaceC28618keF) obj, (Continuation<? super Unit>) continuation);
        }

        public final Object copydefault(InterfaceC28618keF interfaceC28618keF, Continuation<? super Unit> continuation) {
            C23397hxU c23397hxUKWHzl = this.OLrzqt.KWHzl();
            final C28663key c28663key = this.OLrzqt;
            RecyclerView recyclerView = c23397hxUKWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            boolean z = interfaceC28618keF instanceof InterfaceC28618keF.ActionBar;
            int i = 0;
            recyclerView.setVisibility(z ? 0 : 8);
            LinearLayoutCompat linearLayoutCompat = c23397hxUKWHzl.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(z ? 0 : 8);
            TextView textView = c23397hxUKWHzl.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(z ? 0 : 8);
            TextView textView2 = c23397hxUKWHzl.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(z ? 0 : 8);
            C55113xdn c55113xdn = c23397hxUKWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            boolean z2 = interfaceC28618keF instanceof InterfaceC28618keF.TaskDescription;
            c55113xdn.setVisibility(z2 ? 0 : 8);
            C55173xeu c55173xeu = c23397hxUKWHzl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            boolean z3 = interfaceC28618keF instanceof InterfaceC28618keF.StateListAnimator;
            if (!z3 && !(interfaceC28618keF instanceof InterfaceC28618keF.Application)) {
                i = 8;
            }
            c55173xeu.setVisibility(i);
            if (!z2) {
                if (z3) {
                    C55173xeu c55173xeu2 = c23397hxUKWHzl.EZpvd;
                    String string = c23397hxUKWHzl.getRoot().getContext().getString(C23274hvD.Fragment.EZpvd);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    c55173xeu2.setRetry(string);
                    c23397hxUKWHzl.EZpvd.setRetryClickListener(new View.OnClickListener() { // from class: o.kez
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            ApedTogetherBottomSheet$initListener$1.AnonymousClass5.EZpvd(c28663key, view);
                        }
                    });
                    c23397hxUKWHzl.EZpvd.setEmptyTypeImage(8);
                } else if (z) {
                    c28663key.EZpvd().submitList(((InterfaceC28618keF.ActionBar) interfaceC28618keF).EZpvd());
                } else {
                    if (!Intrinsics.EZpvd(interfaceC28618keF, InterfaceC28618keF.Application.KWHzl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c23397hxUKWHzl.EZpvd.setRetry("");
                    C55173xeu c55173xeu3 = c23397hxUKWHzl.EZpvd;
                    String string2 = c23397hxUKWHzl.getRoot().getContext().getString(C23274hvD.Fragment.isConnected);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    c55173xeu3.setSubTitle((CharSequence) string2);
                    c23397hxUKWHzl.EZpvd.setEmptyTypeImage(6);
                }
            }
            return Unit.INSTANCE;
        }

        public static final void EZpvd(C28663key c28663key, View view) {
            c28663key.OLrzqt().KWHzl(c28663key.AEQbTJ().AEQbTJ(), c28663key.AEQbTJ().OLrzqt());
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C28663key c28663key = this.this$0;
            C25390ivn.collectOnViewLifecycle$default(c28663key, c28663key.OLrzqt().AEQbTJ(), null, new AnonymousClass5(this.this$0), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
