package com.okinc.im.imui.app;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C35343ntY;
import o.C43251rlk;
import o.C52761wXj;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class ChatHomeBottomNavItem$observeIMUnreadCountFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NavigationBarView $navigationBarView;
    int label;
    final /* synthetic */ C35343ntY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHomeBottomNavItem$observeIMUnreadCountFlow$1(NavigationBarView navigationBarView, C35343ntY c35343ntY, Continuation<? super ChatHomeBottomNavItem$observeIMUnreadCountFlow$1> continuation) {
        super(2, continuation);
        this.$navigationBarView = navigationBarView;
        this.this$0 = c35343ntY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHomeBottomNavItem$observeIMUnreadCountFlow$1(this.$navigationBarView, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatHomeBottomNavItem$observeIMUnreadCountFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Flow totalUnReadCountFlow$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null && (totalUnReadCountFlow$default = InterfaceC35180nqU.ActionBar.getTotalUnReadCountFlow$default(interfaceC35180nqU, null, 1, null)) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$navigationBarView, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(totalUnReadCountFlow$default, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.app.ChatHomeBottomNavItem$observeIMUnreadCountFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavigationBarView $navigationBarView;
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ C35343ntY this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NavigationBarView navigationBarView, C35343ntY c35343ntY, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$navigationBarView = navigationBarView;
            this.this$0 = c35343ntY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$navigationBarView, this.this$0, continuation);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                int i = this.I$0;
                pUU.EZpvd("ChatHomeBottomNavItem", "unread count: " + i);
                if (i > 0) {
                    BadgeDrawable orCreateBadge = this.$navigationBarView.getOrCreateBadge(this.this$0.AEQbTJ());
                    NavigationBarView navigationBarView = this.$navigationBarView;
                    orCreateBadge.setBackgroundColor(ContextCompat.getColor(navigationBarView.getContext(), C52761wXj.Activity.DQzvGN));
                    orCreateBadge.setBadgeTextColor(ContextCompat.getColor(navigationBarView.getContext(), C52761wXj.Activity.UCQKYV));
                    orCreateBadge.setHorizontalOffset(C55298xhM.dpInt$default(3.0f, (Context) null, 1, (Object) null));
                    orCreateBadge.setVerticalOffset(C55298xhM.dpInt$default(3.0f, (Context) null, 1, (Object) null));
                    orCreateBadge.setMaxCharacterCount(3);
                    orCreateBadge.setVisible(true);
                    orCreateBadge.setNumber(i);
                } else {
                    this.$navigationBarView.removeBadge(this.this$0.AEQbTJ());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
