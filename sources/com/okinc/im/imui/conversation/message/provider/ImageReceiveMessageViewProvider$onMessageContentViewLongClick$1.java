package com.okinc.im.imui.conversation.message.provider;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuRecallAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuReplyAction;
import com.okinc.im.menu.MenuActionBase;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC44111sDt;
import o.C33129mqd;
import o.C35254nrp;
import o.C43251rlk;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.nBD;
import o.sDN;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class ImageReceiveMessageViewProvider$onMessageContentViewLongClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C35254nrp $item;
    final /* synthetic */ ViewBinding $parentView;
    int label;
    final /* synthetic */ nBD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageReceiveMessageViewProvider$onMessageContentViewLongClick$1(C35254nrp c35254nrp, nBD nbd, ViewBinding viewBinding, Continuation<? super ImageReceiveMessageViewProvider$onMessageContentViewLongClick$1> continuation) {
        super(2, continuation);
        this.$item = c35254nrp;
        this.this$0 = nbd;
        this.$parentView = viewBinding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageReceiveMessageViewProvider$onMessageContentViewLongClick$1(this.$item, this.this$0, this.$parentView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ImageReceiveMessageViewProvider$onMessageContentViewLongClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.conversation.message.provider.ImageReceiveMessageViewProvider$onMessageContentViewLongClick$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C35254nrp $item;
        final /* synthetic */ ViewBinding $parentView;
        int label;
        final /* synthetic */ nBD this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C35254nrp c35254nrp, nBD nbd, ViewBinding viewBinding, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$item = c35254nrp;
            this.this$0 = nbd;
            this.$parentView = viewBinding;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$item, this.this$0, this.$parentView, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU != null && interfaceC35180nqU.djBIcL()) {
                    ArrayList arrayList = new ArrayList();
                    if (C44157sFk.EZpvd(this.$item.OLrzqt())) {
                        arrayList.add(new MenuReplyAction());
                    }
                    if (this.this$0.copydefault(this.$item.OLrzqt())) {
                        arrayList.add(new MenuRecallAction());
                    }
                    if (C33129mqd.KWHzl((Collection) arrayList)) {
                        MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
                        C04041 c04041 = new C04041(this.$parentView, this.this$0, arrayList, this.$item, null);
                        this.label = 1;
                        if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, c04041, this) == objCopydefault) {
                            return objCopydefault;
                        }
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

        /* JADX INFO: renamed from: com.okinc.im.imui.conversation.message.provider.ImageReceiveMessageViewProvider$onMessageContentViewLongClick$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ C35254nrp $item;
            final /* synthetic */ ArrayList<MenuActionBase> $items;
            final /* synthetic */ ViewBinding $parentView;
            int label;
            final /* synthetic */ nBD this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04041(ViewBinding viewBinding, nBD nbd, ArrayList<MenuActionBase> arrayList, C35254nrp c35254nrp, Continuation<? super C04041> continuation) {
                super(2, continuation);
                this.$parentView = viewBinding;
                this.this$0 = nbd;
                this.$items = arrayList;
                this.$item = c35254nrp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04041(this.$parentView, this.this$0, this.$items, this.$item, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                LinearLayoutCompat linearLayoutCompat;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ViewBinding viewBinding = this.$parentView;
                    AbstractC44111sDt abstractC44111sDt = viewBinding instanceof AbstractC44111sDt ? (AbstractC44111sDt) viewBinding : null;
                    if (abstractC44111sDt != null && (linearLayoutCompat = abstractC44111sDt.AhwBna) != null) {
                        nBD nbd = this.this$0;
                        ArrayList<MenuActionBase> arrayList = this.$items;
                        C35254nrp c35254nrp = this.$item;
                        yHO yhoAuCTel = nbd.AuCTel();
                        if (yhoAuCTel != null) {
                            yhoAuCTel.invoke(linearLayoutCompat, arrayList, c35254nrp);
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$item, this.this$0, this.$parentView, null);
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcherCopydefault, anonymousClass1, this) == objCopydefault) {
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
