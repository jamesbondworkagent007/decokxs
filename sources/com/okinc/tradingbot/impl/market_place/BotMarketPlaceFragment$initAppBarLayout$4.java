package com.okinc.tradingbot.impl.market_place;

import android.widget.LinearLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C51055vfm;
import o.C51404vmQ;
import o.C51612vqM;
import o.C51623vqX;
import o.C55298xhM;
import o.C55697xoo;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class BotMarketPlaceFragment$initAppBarLayout$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $shouldShowGlobalToolbar;
    int label;
    final /* synthetic */ C51055vfm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotMarketPlaceFragment$initAppBarLayout$4(C51055vfm c51055vfm, boolean z, Continuation<? super BotMarketPlaceFragment$initAppBarLayout$4> continuation) {
        super(2, continuation);
        this.this$0 = c51055vfm;
        this.$shouldShowGlobalToolbar = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotMarketPlaceFragment$initAppBarLayout$4(this.this$0, this.$shouldShowGlobalToolbar, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotMarketPlaceFragment$initAppBarLayout$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$initAppBarLayout$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $shouldShowGlobalToolbar;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ C51055vfm this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C51055vfm c51055vfm, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c51055vfm;
            this.$shouldShowGlobalToolbar = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$shouldShowGlobalToolbar, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.Z$0;
                LinearLayout linearLayout = C51055vfm.fARcdN(this.this$0).gEmmrt;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                boolean z2 = this.$shouldShowGlobalToolbar;
                C51055vfm c51055vfm = this.this$0;
                TransitionSet transitionSet = new TransitionSet();
                int iDp2px$default = 0;
                transitionSet.setOrdering(0);
                Fade fade = new Fade();
                fade.setDuration(230L);
                transitionSet.addTransition(fade);
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(230L);
                transitionSet.addTransition(changeBounds);
                TransitionManager.beginDelayedTransition(linearLayout, transitionSet);
                boolean z3 = z2 && !(z && c51055vfm.fARcdN());
                C51623vqX c51623vqX = C51055vfm.fARcdN(c51055vfm).fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(c51623vqX, "");
                c51623vqX.setVisibility(z3 ? 0 : 8);
                C51612vqM c51612vqM = C51055vfm.fARcdN(c51055vfm).fIwbmz;
                Intrinsics.checkNotNullExpressionValue(c51612vqM, "");
                if (!z3 && C55697xoo.OLrzqt.isConnected()) {
                    iDp2px$default = C55298xhM.dp2px$default(12.0f, null, 1, null);
                }
                c51612vqM.setPaddingRelative(c51612vqM.getPaddingStart(), iDp2px$default, c51612vqM.getPaddingEnd(), c51612vqM.getPaddingBottom());
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
            Flow<Boolean> flowCopydefault = C51404vmQ.Companion.copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$shouldShowGlobalToolbar, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowCopydefault, anonymousClass1, this) == objCopydefault) {
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
