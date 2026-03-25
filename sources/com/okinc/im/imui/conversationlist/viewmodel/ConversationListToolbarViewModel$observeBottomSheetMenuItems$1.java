package com.okinc.im.imui.conversationlist.viewmodel;

import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeAddContactMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeChatSettingsMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeChatVipPerformanceItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeMarkAllAsReadMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeMyQRScannerMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeNewChatMenuItemPerformer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sSI;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class ConversationListToolbarViewModel$observeBottomSheetMenuItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConversationListToolbarViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListToolbarViewModel$observeBottomSheetMenuItems$1(ConversationListToolbarViewModel conversationListToolbarViewModel, Continuation<? super ConversationListToolbarViewModel$observeBottomSheetMenuItems$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListToolbarViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationListToolbarViewModel$observeBottomSheetMenuItems$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListToolbarViewModel$observeBottomSheetMenuItems$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.conversationlist.viewmodel.ConversationListToolbarViewModel$observeBottomSheetMenuItems$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConversationListToolbarViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationListToolbarViewModel conversationListToolbarViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = conversationListToolbarViewModel;
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
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List listValueOf;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Boolean bool = (Boolean) this.L$0;
                boolean zEZpvd = Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true));
                if (sSI.copydefault.copydefault()) {
                    listValueOf = yDY.valueOf(new HomeChatVipPerformanceItemPerformer(), new HomeChatSettingsMenuItemPerformer());
                } else {
                    IMenuItemPerformer[] iMenuItemPerformerArr = new IMenuItemPerformer[5];
                    iMenuItemPerformerArr[0] = new HomeMyQRScannerMenuItemPerformer(false, 1, null);
                    iMenuItemPerformerArr[1] = new HomeNewChatMenuItemPerformer(false, 1, null);
                    iMenuItemPerformerArr[2] = zEZpvd ? new HomeAddContactMenuItemPerformer(false, 1, null) : null;
                    iMenuItemPerformerArr[3] = new HomeChatSettingsMenuItemPerformer();
                    iMenuItemPerformerArr[4] = new HomeMarkAllAsReadMenuItemPerformer();
                    listValueOf = yDY.valueOf(iMenuItemPerformerArr);
                }
                pUU.KWHzl("ConversationListToolbarViewModel", "observeMenuItems: " + bool);
                this.this$0.copydefault.setValue(listValueOf);
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
            StateFlow<Boolean> stateFlowGEmmrt = this.this$0.gEmmrt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowGEmmrt, anonymousClass1, this) == objCopydefault) {
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
