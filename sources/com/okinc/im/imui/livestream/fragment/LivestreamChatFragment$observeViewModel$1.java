package com.okinc.im.imui.livestream.fragment;

import android.widget.FrameLayout;
import com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$observeViewModel$1;
import com.okinc.im.imui.livestream.model.UXBehavior;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33546myW;
import o.C36498ocB;
import o.C36499ocC;
import o.C36531oci;
import o.C36536ocn;
import o.C56391yDq;
import o.C56442yFn;
import o.nJT;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamChatFragment$observeViewModel$1 extends SuspendLambda implements yHO<CoroutineScope, C36499ocC, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36536ocn this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UXBehavior.values().length];
            try {
                iArr[UXBehavior.Init.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UXBehavior.NoOperation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UXBehavior.ReceiveOtherMessage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatFragment$observeViewModel$1(C36536ocn c36536ocn, Continuation<? super LivestreamChatFragment$observeViewModel$1> continuation) {
        super(3, continuation);
        this.this$0 = c36536ocn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, C36499ocC c36499ocC, Continuation<? super Unit> continuation) {
        LivestreamChatFragment$observeViewModel$1 livestreamChatFragment$observeViewModel$1 = new LivestreamChatFragment$observeViewModel$1(this.this$0, continuation);
        livestreamChatFragment$observeViewModel$1.L$0 = c36499ocC;
        return livestreamChatFragment$observeViewModel$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FrameLayout frameLayout;
        C33546myW c33546myW;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final C36499ocC c36499ocC = (C36499ocC) this.L$0;
            nJT njtCopydefault = this.this$0.copydefault();
            if (njtCopydefault != null && (c33546myW = njtCopydefault.valueOf) != null) {
                Long lCopydefault = c36499ocC.copydefault();
                c33546myW.djBIcL((lCopydefault != null ? lCopydefault.longValue() : 1L) > 1);
            }
            nJT njtCopydefault2 = this.this$0.copydefault();
            final boolean z = (njtCopydefault2 == null || (frameLayout = njtCopydefault2.copydefault) == null || frameLayout.getVisibility() != 0) ? false : true;
            final boolean z2 = this.this$0.OLrzqt;
            if (z2) {
                this.this$0.OLrzqt = false;
            }
            C36531oci c36531oci = this.this$0.EZpvd;
            if (c36531oci == null) {
                Intrinsics.gEmmrt("");
                c36531oci = null;
            }
            List<C36498ocB> listEZpvd = c36499ocC.EZpvd();
            final C36536ocn c36536ocn = this.this$0;
            c36531oci.submitList(listEZpvd, new Runnable() { // from class: o.ocv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    LivestreamChatFragment$observeViewModel$1.invokeSuspend$lambda$0(z2, c36536ocn, c36499ocC, z);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(boolean z, C36536ocn c36536ocn, C36499ocC c36499ocC, boolean z2) {
        if (z) {
            c36536ocn.AYXKKw();
            return;
        }
        int i = ActionBar.KWHzl[c36499ocC.AEQbTJ().ordinal()];
        if (i == 1) {
            c36536ocn.AYXKKw();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                return;
            }
            c36536ocn.AYXKKw();
        }
    }
}
