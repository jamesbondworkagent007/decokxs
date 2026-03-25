package com.okinc.im.imui.conversation.message.provider;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuAddCustomStickerAction;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC44111sDt;
import o.C35254nrp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44487sRq;
import o.nBX;
import o.sDN;
import o.sDZ;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class ReferenceReceiveMessageViewProvider$longClickForMessageSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKReferenceMessage $content;
    final /* synthetic */ C35254nrp $item;
    final /* synthetic */ ArrayList<MenuActionBase> $items;
    final /* synthetic */ ViewBinding $parentView;
    int label;
    final /* synthetic */ nBX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceReceiveMessageViewProvider$longClickForMessageSuccess$1(OKReferenceMessage oKReferenceMessage, ArrayList<MenuActionBase> arrayList, ViewBinding viewBinding, nBX nbx, C35254nrp c35254nrp, Continuation<? super ReferenceReceiveMessageViewProvider$longClickForMessageSuccess$1> continuation) {
        super(2, continuation);
        this.$content = oKReferenceMessage;
        this.$items = arrayList;
        this.$parentView = viewBinding;
        this.this$0 = nbx;
        this.$item = c35254nrp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferenceReceiveMessageViewProvider$longClickForMessageSuccess$1(this.$content, this.$items, this.$parentView, this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferenceReceiveMessageViewProvider$longClickForMessageSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$parentView, this.this$0, this.$items, this.$item, null);
            this.label = 2;
            if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.conversation.message.provider.ReferenceReceiveMessageViewProvider$longClickForMessageSuccess$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C35254nrp $item;
        final /* synthetic */ ArrayList<MenuActionBase> $items;
        final /* synthetic */ ViewBinding $parentView;
        int label;
        final /* synthetic */ nBX this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewBinding viewBinding, nBX nbx, ArrayList<MenuActionBase> arrayList, C35254nrp c35254nrp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$parentView = viewBinding;
            this.this$0 = nbx;
            this.$items = arrayList;
            this.$item = c35254nrp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$parentView, this.this$0, this.$items, this.$item, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    nBX nbx = this.this$0;
                    ArrayList<MenuActionBase> arrayList = this.$items;
                    C35254nrp c35254nrp = this.$item;
                    yHO yhoAuCTel = nbx.AuCTel();
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
