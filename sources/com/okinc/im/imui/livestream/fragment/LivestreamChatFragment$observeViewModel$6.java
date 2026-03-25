package com.okinc.im.imui.livestream.fragment;

import android.view.View;
import com.okinc.im.imui.livestream.model.SnackBarEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C35399nuc;
import o.C36536ocn;
import o.C55284xgz;
import o.C56391yDq;
import o.C56442yFn;
import o.nJT;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamChatFragment$observeViewModel$6 extends SuspendLambda implements yHO<CoroutineScope, SnackBarEvent, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36536ocn this$0;

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SnackBarEvent.values().length];
            try {
                iArr[SnackBarEvent.TooFrequent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackBarEvent.NetworkError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackBarEvent.ExceedCharacter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SnackBarEvent.BeingMuted.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SnackBarEvent.StreamEnded.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatFragment$observeViewModel$6(C36536ocn c36536ocn, Continuation<? super LivestreamChatFragment$observeViewModel$6> continuation) {
        super(3, continuation);
        this.this$0 = c36536ocn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, SnackBarEvent snackBarEvent, Continuation<? super Unit> continuation) {
        LivestreamChatFragment$observeViewModel$6 livestreamChatFragment$observeViewModel$6 = new LivestreamChatFragment$observeViewModel$6(this.this$0, continuation);
        livestreamChatFragment$observeViewModel$6.L$0 = snackBarEvent;
        return livestreamChatFragment$observeViewModel$6.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            SnackBarEvent snackBarEvent = (SnackBarEvent) this.L$0;
            nJT njtCopydefault = this.this$0.copydefault();
            if (njtCopydefault != null) {
                C36536ocn c36536ocn = this.this$0;
                int i2 = TaskDescription.EZpvd[snackBarEvent.ordinal()];
                if (i2 == 1) {
                    i = C35399nuc.LoaderManager.requestPostMessageChannelWithExtras;
                } else if (i2 == 2) {
                    i = C35399nuc.LoaderManager.warmup;
                } else if (i2 == 3) {
                    i = C35399nuc.LoaderManager.receiveFile;
                } else if (i2 == 4) {
                    i = C35399nuc.LoaderManager.validateRelationship;
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C35399nuc.LoaderManager.ICustomTabsServiceStub;
                }
                String string = c36536ocn.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "");
                C55284xgz.Activity activity = C55284xgz.Companion;
                View root = njtCopydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                C55284xgz c55284xgzKWHzl = activity.KWHzl(root, string);
                if (c55284xgzKWHzl != null) {
                    c55284xgzKWHzl.isConnected(0);
                    c55284xgzKWHzl.djBIcL(0);
                    c55284xgzKWHzl.hDKMBd();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
