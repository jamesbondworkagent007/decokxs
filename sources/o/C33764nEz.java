package o;

import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.conversationlist.ConversationJumper$startIMChatWithInit$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC36599odx;
import o.ActivityC36573odX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33764nEz {
    public static final C33764nEz OLrzqt = new C33764nEz();

    /* JADX INFO: renamed from: o.nEz$Activity */
    public interface Activity {
        C33761nEw DLWbHP();
    }

    private C33764nEz() {
    }

    public final C33761nEw OLrzqt(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return ((Activity) C58114yvF.OLrzqt(applicationContext, Activity.class)).DLWbHP();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oGV.processDeeplink$default(o.oGV, android.content.Context, java.lang.String, java.util.Map, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public final void copydefault(OKConversation oKConversation, @NotNull android.content.Context context, OKMessage oKMessage, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("ConversationJumper", "start operateIMJump, conversation:" + oKConversation + ", message:" + oKMessage + ", searchKey:" + str + ", origin:" + str2 + ", relationId:" + str3 + ", prefilledInputMsg:" + str4);
        if (C44170sFx.OLrzqt(oKConversation)) {
            pUU.KWHzl("ConversationJumper", "start operateIMJump: is vip chat, start process deeplink, deeplinkService: " + C43251rlk.OLrzqt((java.lang.Class<InterfaceC43216rlB>) InterfaceC43294rma.class));
            oGV.processDeeplink$default(oGV.EZpvd, context, "okx://app/customer/service", C56423yEv.EZpvd(C56390yDp.OLrzqt("from", "cg_app_notification")), null, new Function1() { // from class: o.nEA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C33764nEz.KWHzl((AbstractC43238rlX) obj);
                }
            }, 8, null);
            return;
        }
        OLrzqt(context, oKConversation, oKMessage, str, str2, str3, str4, str5);
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull android.content.Context context, OKConversation oKConversation, OKMessage oKMessage, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(context, "");
        context.startActivity(ActivityC36573odX.Companion.EZpvd(context, new ActivityC36573odX.ActionBar(oKConversation != null ? oKConversation.getTargetId() : null, oKMessage, str, str2 != null ? C35182nqW.KWHzl(str2) : null, str3, null, str4, str5, str2, 32, null)));
    }

    public static /* synthetic */ void startIMChat$default(C33764nEz c33764nEz, android.content.Context context, java.lang.String str, ChatOrigin chatOrigin, OKMessage oKMessage, java.lang.String str2, java.lang.String str3, IMPageType iMPageType, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        c33764nEz.copydefault(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : chatOrigin, (i & 8) != 0 ? null : oKMessage, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : iMPageType, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
    }

    public final void copydefault(@NotNull android.content.Context context, java.lang.String str, ChatOrigin chatOrigin, OKMessage oKMessage, java.lang.String str2, java.lang.String str3, IMPageType iMPageType, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(context, "");
        context.startActivity(OLrzqt(context, str, chatOrigin, oKMessage, str2, str3, iMPageType, str4, str5));
    }

    public final android.content.Intent OLrzqt(@NotNull android.content.Context context, java.lang.String str, ChatOrigin chatOrigin, OKMessage oKMessage, java.lang.String str2, java.lang.String str3, IMPageType iMPageType, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(context, "");
        return ActivityC36573odX.Companion.KWHzl(context, str, oKMessage, str2, chatOrigin, str3, iMPageType, str4, str5);
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull OKConversation oKConversation, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        android.content.Intent intentAEQbTJ = ActivityC37536ovg.Companion.AEQbTJ(context, oKConversation.getTargetId());
        intentAEQbTJ.addFlags(67108864);
        context.startActivity(intentAEQbTJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull android.content.Context context, java.lang.String str, ChatOrigin chatOrigin, java.lang.String str2, java.lang.String str3, OKConversation oKConversation, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ConversationJumper$startIMChatWithInit$1 conversationJumper$startIMChatWithInit$1;
        ChatOrigin chatOrigin2;
        java.lang.String str4;
        java.lang.String str5;
        C33764nEz c33764nEz;
        android.content.Context context2;
        if (continuation instanceof ConversationJumper$startIMChatWithInit$1) {
            conversationJumper$startIMChatWithInit$1 = (ConversationJumper$startIMChatWithInit$1) continuation;
            int i = conversationJumper$startIMChatWithInit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationJumper$startIMChatWithInit$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationJumper$startIMChatWithInit$1 = new ConversationJumper$startIMChatWithInit$1(this, continuation);
            }
        }
        ConversationJumper$startIMChatWithInit$1 conversationJumper$startIMChatWithInit$12 = conversationJumper$startIMChatWithInit$1;
        java.lang.Object obj = conversationJumper$startIMChatWithInit$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationJumper$startIMChatWithInit$12.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C33761nEw c33761nEwOLrzqt = OLrzqt(context);
            java.lang.String targetId = oKConversation != null ? oKConversation.getTargetId() : null;
            conversationJumper$startIMChatWithInit$12.L$0 = this;
            conversationJumper$startIMChatWithInit$12.L$1 = context;
            conversationJumper$startIMChatWithInit$12.L$2 = chatOrigin;
            conversationJumper$startIMChatWithInit$12.L$3 = str2;
            conversationJumper$startIMChatWithInit$12.L$4 = str3;
            conversationJumper$startIMChatWithInit$12.label = 1;
            java.lang.Object objKWHzl = c33761nEwOLrzqt.KWHzl(targetId, str, chatOrigin, str2, conversationJumper$startIMChatWithInit$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            chatOrigin2 = chatOrigin;
            str4 = str2;
            str5 = str3;
            c33764nEz = this;
            context2 = context;
            obj = objKWHzl;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str6 = (java.lang.String) conversationJumper$startIMChatWithInit$12.L$4;
            java.lang.String str7 = (java.lang.String) conversationJumper$startIMChatWithInit$12.L$3;
            ChatOrigin chatOrigin3 = (ChatOrigin) conversationJumper$startIMChatWithInit$12.L$2;
            android.content.Context context3 = (android.content.Context) conversationJumper$startIMChatWithInit$12.L$1;
            C33764nEz c33764nEz2 = (C33764nEz) conversationJumper$startIMChatWithInit$12.L$0;
            C56391yDq.AEQbTJ(obj);
            str5 = str6;
            str4 = str7;
            chatOrigin2 = chatOrigin3;
            context2 = context3;
            c33764nEz = c33764nEz2;
        }
        AbstractC36599odx abstractC36599odx = (AbstractC36599odx) obj;
        if (abstractC36599odx instanceof AbstractC36599odx.Application) {
            startIMChat$default(c33764nEz, context2, ((AbstractC36599odx.Application) abstractC36599odx).EZpvd().getTargetId(), chatOrigin2, null, null, null, null, str5, str4, 120, null);
        } else {
            if (!(abstractC36599odx instanceof AbstractC36599odx.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC36599odx.Activity activity = (AbstractC36599odx.Activity) abstractC36599odx;
            C55326xho.toastWithFailedIcon$default(activity.KWHzl(), 0, 1, (java.lang.Object) null);
            pUU.copydefault("ConversationJumper", "Failed to initialize conversation: " + activity.KWHzl());
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }
}
