package com.okinc.im.imui.conversation.message.provider.base;

import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuCopyAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuInfoAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuRecallAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuReplyAction;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33733nDv;
import o.C35254nrp;
import o.C35334ntP;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class TextMessageBindHelper$getLongClickOptions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<MenuActionBase>>, Object> {
    final /* synthetic */ Function0<OKConversation> $conversationProvider;
    final /* synthetic */ Function0<Boolean> $isAdmin;
    final /* synthetic */ C35254nrp $message;
    int I$0;
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextMessageBindHelper$getLongClickOptions$2(C35254nrp c35254nrp, Function0<OKConversation> function0, Function0<Boolean> function02, Continuation<? super TextMessageBindHelper$getLongClickOptions$2> continuation) {
        super(2, continuation);
        this.$message = c35254nrp;
        this.$conversationProvider = function0;
        this.$isAdmin = function02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextMessageBindHelper$getLongClickOptions$2(this.$message, this.$conversationProvider, this.$isAdmin, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<MenuActionBase>> continuation) {
        return ((TextMessageBindHelper$getLongClickOptions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        OKMessage oKMessage;
        boolean z;
        int i;
        boolean z2;
        String extra;
        OKConversation oKConversationInvoke;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            OKMessage oKMessageOLrzqt = this.$message.OLrzqt();
            OKMessageContent content = oKMessageOLrzqt.getContent();
            Function0<OKConversation> function0 = this.$conversationProvider;
            GroupTagType groupType = (function0 == null || (oKConversationInvoke = function0.invoke()) == null) ? null : oKConversationInvoke.getGroupType();
            OKTextMessage oKTextMessage = content instanceof OKTextMessage ? (OKTextMessage) content : null;
            boolean z3 = (oKTextMessage == null || (extra = oKTextMessage.getExtra()) == null || !C35334ntP.AEQbTJ(extra)) ? false : true;
            int i3 = this.$message.KWHzl() == 0 ? 1 : 0;
            C33733nDv.StateListAnimator stateListAnimator = new C33733nDv.StateListAnimator(oKMessageOLrzqt, content, groupType, z3, i3, this.$isAdmin.invoke().booleanValue());
            C33733nDv c33733nDv = C33733nDv.copydefault;
            boolean zKWHzl = c33733nDv.KWHzl(stateListAnimator);
            boolean zAEQbTJ = c33733nDv.AEQbTJ(stateListAnimator);
            this.L$0 = oKMessageOLrzqt;
            this.I$0 = i3;
            this.Z$0 = zKWHzl;
            this.Z$1 = zAEQbTJ;
            this.label = 1;
            Object objAEQbTJ = c33733nDv.AEQbTJ(stateListAnimator, (Continuation<? super Boolean>) this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            oKMessage = oKMessageOLrzqt;
            obj = objAEQbTJ;
            z = zAEQbTJ;
            i = i3;
            z2 = zKWHzl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$1;
            z2 = this.Z$0;
            i = this.I$0;
            oKMessage = (OKMessage) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(new MenuCopyAction());
        }
        if (z) {
            arrayList.add(new MenuReplyAction());
        }
        if (zBooleanValue) {
            arrayList.add(new MenuRecallAction());
        }
        if (i != 0 && oKMessage.getMessageDirection() == OKMessage.MessageDirection.SEND) {
            arrayList.add(new MenuInfoAction());
        }
        return arrayList;
    }
}
