package com.okinc.im.imui.conversation.message.provider;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.StickerReceiveMessageViewProvider$onMessageContentViewLongClick$1;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuAddCustomStickerAction;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKStickerMessage;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC44111sDt;
import o.C33733nDv;
import o.C35254nrp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44487sRq;
import o.nCI;
import o.sDN;
import o.sDZ;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class StickerReceiveMessageViewProvider$onMessageContentViewLongClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKStickerMessage $content;
    final /* synthetic */ C35254nrp $item;
    final /* synthetic */ ViewBinding $parentView;
    Object L$0;
    int label;
    final /* synthetic */ nCI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerReceiveMessageViewProvider$onMessageContentViewLongClick$1(C35254nrp c35254nrp, nCI nci, OKStickerMessage oKStickerMessage, ViewBinding viewBinding, Continuation<? super StickerReceiveMessageViewProvider$onMessageContentViewLongClick$1> continuation) {
        super(2, continuation);
        this.$item = c35254nrp;
        this.this$0 = nci;
        this.$content = oKStickerMessage;
        this.$parentView = viewBinding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StickerReceiveMessageViewProvider$onMessageContentViewLongClick$1(this.$item, this.this$0, this.$content, this.$parentView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StickerReceiveMessageViewProvider$onMessageContentViewLongClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C33733nDv c33733nDv = C33733nDv.copydefault;
            final C35254nrp c35254nrp = this.$item;
            final nCI nci = this.this$0;
            Function0<Boolean> function0 = new Function0() { // from class: o.nCM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(StickerReceiveMessageViewProvider$onMessageContentViewLongClick$1.invokeSuspend$lambda$0(nci, c35254nrp));
                }
            };
            Function0<OKConversation> function0FetchVPNInfo = this.this$0.fetchVPNInfo();
            this.label = 1;
            obj = c33733nDv.OLrzqt(c35254nrp, function0, function0FetchVPNInfo, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                arrayList = (ArrayList) this.L$0;
                C56391yDq.AEQbTJ(obj);
                arrayList2 = arrayList;
                if (((Boolean) obj).booleanValue()) {
                    arrayList2.add(0, new MenuAddCustomStickerAction());
                }
                if (!arrayList2.isEmpty()) {
                    MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$parentView, this.this$0, arrayList2, this.$item, null);
                    this.L$0 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        arrayList = (ArrayList) obj;
        InterfaceC44487sRq newProxyInstance = sDZ.AEQbTJ.getNewProxyInstance();
        String stickerId = this.$content.getStickerId();
        if (stickerId == null) {
            stickerId = "";
        }
        this.L$0 = arrayList;
        this.label = 2;
        obj = newProxyInstance.KWHzl(stickerId, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        arrayList2 = arrayList;
        if (((Boolean) obj).booleanValue()) {
        }
        if (!arrayList2.isEmpty()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(nCI nci, C35254nrp c35254nrp) {
        return nci.copydefault(c35254nrp.OLrzqt());
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.conversation.message.provider.StickerReceiveMessageViewProvider$onMessageContentViewLongClick$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C35254nrp $item;
        final /* synthetic */ ArrayList<MenuActionBase> $items;
        final /* synthetic */ ViewBinding $parentView;
        int label;
        final /* synthetic */ nCI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewBinding viewBinding, nCI nci, ArrayList<MenuActionBase> arrayList, C35254nrp c35254nrp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$parentView = viewBinding;
            this.this$0 = nci;
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
                    nCI nci = this.this$0;
                    ArrayList<MenuActionBase> arrayList = this.$items;
                    C35254nrp c35254nrp = this.$item;
                    yHO yhoAuCTel = nci.AuCTel();
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
