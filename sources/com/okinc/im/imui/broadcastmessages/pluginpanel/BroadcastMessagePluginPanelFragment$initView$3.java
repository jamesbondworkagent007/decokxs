package com.okinc.im.imui.broadcastmessages.pluginpanel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33890nJq;
import o.C35441nvS;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35288nsW;
import o.nOO;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessagePluginPanelFragment$initView$3 extends SuspendLambda implements Function2<List<? extends InterfaceC35288nsW>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35441nvS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagePluginPanelFragment$initView$3(C35441nvS c35441nvS, Continuation<? super BroadcastMessagePluginPanelFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c35441nvS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastMessagePluginPanelFragment$initView$3 broadcastMessagePluginPanelFragment$initView$3 = new BroadcastMessagePluginPanelFragment$initView$3(this.this$0, continuation);
        broadcastMessagePluginPanelFragment$initView$3.L$0 = obj;
        return broadcastMessagePluginPanelFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends InterfaceC35288nsW> list, Continuation<? super Unit> continuation) {
        return ((BroadcastMessagePluginPanelFragment$initView$3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            C33890nJq c33890nJq = this.this$0.EZpvd;
            if (c33890nJq != null) {
                final C35441nvS c35441nvS = this.this$0;
                LinearLayout root = c33890nJq.getRoot();
                if (!(root instanceof ViewGroup)) {
                    root = null;
                }
                if (root != null) {
                    root.removeAllViews();
                }
                Context contextRequireContext = c35441nvS.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                int iCopydefault = C55298xhM.copydefault(32.0f, contextRequireContext);
                Context contextRequireContext2 = c35441nvS.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                int iCopydefault2 = C55298xhM.copydefault(56.0f, contextRequireContext2);
                int i = 0;
                for (Object obj2 : list) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    final InterfaceC35288nsW interfaceC35288nsW = (InterfaceC35288nsW) obj2;
                    nOO nooKWHzl = nOO.KWHzl(LayoutInflater.from(c35441nvS.requireContext()), null, false);
                    Intrinsics.checkNotNullExpressionValue(nooKWHzl, "");
                    nooKWHzl.AEQbTJ.setText(interfaceC35288nsW.KWHzl());
                    ImageView imageView = nooKWHzl.copydefault;
                    Context contextRequireContext3 = c35441nvS.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                    imageView.setImageDrawable(interfaceC35288nsW.EZpvd(contextRequireContext3));
                    nooKWHzl.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.nvR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            interfaceC35288nsW.copydefault(c35441nvS);
                        }
                    });
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iCopydefault2, -2);
                    if (i != 0) {
                        layoutParams.setMarginStart(iCopydefault);
                    }
                    LinearLayout root2 = c33890nJq.getRoot();
                    if (!(root2 instanceof LinearLayout)) {
                        root2 = null;
                    }
                    if (root2 != null) {
                        root2.addView(nooKWHzl.getRoot(), layoutParams);
                    }
                    i++;
                }
            }
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
