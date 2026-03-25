package com.okinc.im.imui.conversation.message.provider;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuAddCustomStickerAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuCopyAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuInfoAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuRecallAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuReplyAction;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
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
import o.AbstractC44112sDu;
import o.C33129mqd;
import o.C33690nCf;
import o.C35254nrp;
import o.C35802oEf;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44487sRq;
import o.sDN;
import o.sDZ;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class ReferenceSendMessageViewProvider$longClickForMessageSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKReferenceMessage $content;
    final /* synthetic */ C35254nrp $item;
    final /* synthetic */ ViewBinding $parentView;
    Object L$0;
    int label;
    final /* synthetic */ C33690nCf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceSendMessageViewProvider$longClickForMessageSuccess$1(OKReferenceMessage oKReferenceMessage, C35254nrp c35254nrp, C33690nCf c33690nCf, ViewBinding viewBinding, Continuation<? super ReferenceSendMessageViewProvider$longClickForMessageSuccess$1> continuation) {
        super(2, continuation);
        this.$content = oKReferenceMessage;
        this.$item = c35254nrp;
        this.this$0 = c33690nCf;
        this.$parentView = viewBinding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferenceSendMessageViewProvider$longClickForMessageSuccess$1(this.$content, this.$item, this.this$0, this.$parentView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferenceSendMessageViewProvider$longClickForMessageSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            arrayList = new ArrayList();
            if (this.$content.getOriginalOKMessageContent() instanceof OKTextMessage) {
                arrayList.add(new MenuCopyAction());
            }
            if (C44157sFk.EZpvd(this.$item.OLrzqt())) {
                arrayList.add(new MenuReplyAction());
            }
            C35802oEf c35802oEfGEmmrt = this.this$0.gEmmrt();
            OKMessage oKMessageOLrzqt = this.$item.OLrzqt();
            this.L$0 = arrayList;
            this.label = 1;
            obj = c35802oEfGEmmrt.KWHzl(oKMessageOLrzqt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            arrayList = (ArrayList) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            arrayList.add(new MenuRecallAction());
        }
        if (this.this$0.getFieldNames()) {
            arrayList.add(new MenuInfoAction());
        }
        if (this.$content.getOriginalOKMessageContent() instanceof OKStickerMessage) {
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$content, arrayList, this.$parentView, this.this$0, this.$item, null);
            this.L$0 = null;
            this.label = 2;
            if (BuildersKt.withContext(coroutineDispatcherCopydefault, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(arrayList, this.$parentView, this.this$0, this.$item, null);
            this.L$0 = null;
            this.label = 3;
            if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.conversation.message.provider.ReferenceSendMessageViewProvider$longClickForMessageSuccess$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OKReferenceMessage $content;
        final /* synthetic */ C35254nrp $item;
        final /* synthetic */ ArrayList<MenuActionBase> $items;
        final /* synthetic */ ViewBinding $parentView;
        int label;
        final /* synthetic */ C33690nCf this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OKReferenceMessage oKReferenceMessage, ArrayList<MenuActionBase> arrayList, ViewBinding viewBinding, C33690nCf c33690nCf, C35254nrp c35254nrp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$content = oKReferenceMessage;
            this.$items = arrayList;
            this.$parentView = viewBinding;
            this.this$0 = c33690nCf;
            this.$item = c35254nrp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$content, this.$items, this.$parentView, this.this$0, this.$item, continuation);
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
                OKMessageContent originalOKMessageContent = this.$content.getOriginalOKMessageContent();
                OKStickerMessage oKStickerMessage = originalOKMessageContent instanceof OKStickerMessage ? (OKStickerMessage) originalOKMessageContent : null;
                InterfaceC44487sRq newProxyInstance = sDZ.AEQbTJ.getNewProxyInstance();
                String stickerId = oKStickerMessage != null ? oKStickerMessage.getStickerId() : null;
                if (stickerId == null) {
                    stickerId = "";
                }
                this.label = 1;
                obj = newProxyInstance.KWHzl(stickerId, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.$items.add(0, new MenuAddCustomStickerAction());
            }
            if (!this.$items.isEmpty()) {
                MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
                C04061 c04061 = new C04061(this.$parentView, this.this$0, this.$items, this.$item, null);
                this.label = 2;
                if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, c04061, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.conversation.message.provider.ReferenceSendMessageViewProvider$longClickForMessageSuccess$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ C35254nrp $item;
            final /* synthetic */ ArrayList<MenuActionBase> $items;
            final /* synthetic */ ViewBinding $parentView;
            int label;
            final /* synthetic */ C33690nCf this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04061(ViewBinding viewBinding, C33690nCf c33690nCf, ArrayList<MenuActionBase> arrayList, C35254nrp c35254nrp, Continuation<? super C04061> continuation) {
                super(2, continuation);
                this.$parentView = viewBinding;
                this.this$0 = c33690nCf;
                this.$items = arrayList;
                this.$item = c35254nrp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04061(this.$parentView, this.this$0, this.$items, this.$item, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                LinearLayoutCompat linearLayoutCompat;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ViewBinding viewBinding = this.$parentView;
                    AbstractC44112sDu abstractC44112sDu = viewBinding instanceof AbstractC44112sDu ? (AbstractC44112sDu) viewBinding : null;
                    if (abstractC44112sDu != null && (linearLayoutCompat = abstractC44112sDu.AhwBna) != null) {
                        C33690nCf c33690nCf = this.this$0;
                        ArrayList<MenuActionBase> arrayList = this.$items;
                        C35254nrp c35254nrp = this.$item;
                        yHO yhoAuCTel = c33690nCf.AuCTel();
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

    /* JADX INFO: renamed from: com.okinc.im.imui.conversation.message.provider.ReferenceSendMessageViewProvider$longClickForMessageSuccess$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C35254nrp $item;
        final /* synthetic */ ArrayList<MenuActionBase> $items;
        final /* synthetic */ ViewBinding $parentView;
        int label;
        final /* synthetic */ C33690nCf this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ArrayList<MenuActionBase> arrayList, ViewBinding viewBinding, C33690nCf c33690nCf, C35254nrp c35254nrp, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$items = arrayList;
            this.$parentView = viewBinding;
            this.this$0 = c33690nCf;
            this.$item = c35254nrp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$items, this.$parentView, this.this$0, this.$item, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LinearLayoutCompat linearLayoutCompat;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (C33129mqd.KWHzl((Collection) this.$items)) {
                    ViewBinding viewBinding = this.$parentView;
                    AbstractC44112sDu abstractC44112sDu = viewBinding instanceof AbstractC44112sDu ? (AbstractC44112sDu) viewBinding : null;
                    if (abstractC44112sDu != null && (linearLayoutCompat = abstractC44112sDu.AhwBna) != null) {
                        C33690nCf c33690nCf = this.this$0;
                        ArrayList<MenuActionBase> arrayList = this.$items;
                        C35254nrp c35254nrp = this.$item;
                        yHO yhoAuCTel = c33690nCf.AuCTel();
                        if (yhoAuCTel != null) {
                            yhoAuCTel.invoke(linearLayoutCompat, arrayList, c35254nrp);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
