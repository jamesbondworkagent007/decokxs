package com.okinc.kline.ui.unlock.ui;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C36100oPg;
import o.C39704pxP;
import o.C39706pxR;
import o.C39713pxY;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.rVN;

/* JADX INFO: loaded from: classes23.dex */
public final class VestingInfoFragment$initView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C39704pxP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VestingInfoFragment$initView$1(C39704pxP c39704pxP, Continuation<? super VestingInfoFragment$initView$1> continuation) {
        super(2, continuation);
        this.this$0 = c39704pxP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VestingInfoFragment$initView$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VestingInfoFragment$initView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.VestingInfoFragment$initView$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C39706pxR>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C39704pxP this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C39704pxP c39704pxP, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c39704pxP;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C39706pxR> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<C39706pxR>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<C39706pxR> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TextView textView;
            TextView textView2;
            TextView textView3;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    C39706pxR c39706pxR = (C39706pxR) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault();
                    C36100oPg c36100oPgCopydefault = this.this$0.copydefault();
                    if (c36100oPgCopydefault != null && (textView3 = c36100oPgCopydefault.OLrzqt) != null) {
                        textView3.setText(c39706pxR.KWHzl());
                    }
                    C36100oPg c36100oPgCopydefault2 = this.this$0.copydefault();
                    if (c36100oPgCopydefault2 != null && (textView2 = c36100oPgCopydefault2.KWHzl) != null) {
                        textView2.setText(c39706pxR.copydefault());
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else {
                    C36100oPg c36100oPgCopydefault3 = this.this$0.copydefault();
                    if (c36100oPgCopydefault3 != null && (textView = c36100oPgCopydefault3.OLrzqt) != null) {
                        textView.setText("");
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C39704pxP c39704pxP = this.this$0;
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(c39704pxP, c39704pxP.EZpvd(), new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.VestingInfoFragment$initView$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C39713pxY) obj2).EZpvd();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C39713pxY) obj2).KWHzl((InterfaceC49371unL) obj3);
                }
            }, null, new AnonymousClass2(this.this$0, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
