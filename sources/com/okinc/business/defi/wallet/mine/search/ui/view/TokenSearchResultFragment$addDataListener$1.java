package com.okinc.business.defi.wallet.mine.search.ui.view;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C13754dXa;
import o.C17180ext;
import o.C18998fsw;
import o.C19012ftJ;
import o.C33054mpH;
import o.C52761wXj;
import o.C54989xbV;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class TokenSearchResultFragment$addDataListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19012ftJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenSearchResultFragment$addDataListener$1(C19012ftJ c19012ftJ, Continuation<? super TokenSearchResultFragment$addDataListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c19012ftJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenSearchResultFragment$addDataListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenSearchResultFragment$addDataListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.TokenSearchResultFragment$addDataListener$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C18998fsw, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C19012ftJ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C19012ftJ c19012ftJ, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c19012ftJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C18998fsw c18998fsw, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c18998fsw, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C54989xbV c54989xbV;
            ImageView imageViewAEQbTJ;
            C54989xbV c54989xbV2;
            TextView textViewEZpvd;
            C54989xbV c54989xbV3;
            ImageView imageViewAEQbTJ2;
            C54989xbV c54989xbV4;
            TextView textViewEZpvd2;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C18998fsw c18998fsw = (C18998fsw) this.L$0;
                this.this$0.AYXKKw = c18998fsw.KWHzl();
                if (c18998fsw.KWHzl() == Long.MIN_VALUE) {
                    C17180ext c17180ext = this.this$0.djBIcL;
                    if (c17180ext != null && (c54989xbV4 = c17180ext.EZpvd) != null && (textViewEZpvd2 = c54989xbV4.EZpvd()) != null) {
                        textViewEZpvd2.setText(this.this$0.requireContext().getString(C13754dXa.FragmentManager.setSupportActionBar));
                    }
                    C17180ext c17180ext2 = this.this$0.djBIcL;
                    if (c17180ext2 != null && (c54989xbV3 = c17180ext2.EZpvd) != null && (imageViewAEQbTJ2 = c54989xbV3.AEQbTJ()) != null) {
                        imageViewAEQbTJ2.setImageResource(C52761wXj.TaskDescription.createSocket);
                    }
                } else {
                    C17180ext c17180ext3 = this.this$0.djBIcL;
                    if (c17180ext3 != null && (c54989xbV2 = c17180ext3.EZpvd) != null && (textViewEZpvd = c54989xbV2.EZpvd()) != null) {
                        textViewEZpvd.setText(c18998fsw.AEQbTJ());
                    }
                    C17180ext c17180ext4 = this.this$0.djBIcL;
                    if (c17180ext4 != null && (c54989xbV = c17180ext4.EZpvd) != null && (imageViewAEQbTJ = c54989xbV.AEQbTJ()) != null) {
                        C33054mpH.loadRoundImage$default(imageViewAEQbTJ, c18998fsw.OLrzqt(), 0, 2, null);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<C18998fsw> sharedFlowCopydefault = this.this$0.isConnected().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowCopydefault, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
