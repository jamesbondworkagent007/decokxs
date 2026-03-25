package o;

import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sem, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44855sem {

    /* JADX INFO: renamed from: o.sem$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SelfServiceScenario.values().length];
            try {
                iArr[SelfServiceScenario.MY_TICKETS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    public static final SelfServiceDisplayModel OLrzqt(@NotNull SelfServiceToolBean selfServiceToolBean) {
        java.lang.CharSequence description;
        java.lang.Boolean boolAEQbTJ;
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        SelfServiceScenario scenario = selfServiceToolBean.getScenario();
        int[] iArr = TaskDescription.copydefault;
        boolean zBooleanValue = (iArr[scenario.ordinal()] != 1 || (boolAEQbTJ = C45361soO.AEQbTJ(selfServiceToolBean.getExtra(), "requireAttention")) == null) ? false : boolAEQbTJ.booleanValue();
        if (iArr[selfServiceToolBean.getScenario().ordinal()] == 1) {
            java.lang.Integer numKWHzl = C45361soO.KWHzl(selfServiceToolBean.getExtra(), "openTickets");
            description = AEQbTJ(numKWHzl != null ? numKWHzl.intValue() : 0);
        } else {
            description = selfServiceToolBean.getDescription();
        }
        return new SelfServiceDisplayModel(selfServiceToolBean, selfServiceToolBean.getTitle(), description, zBooleanValue, C33492mxV.OLrzqt() ? selfServiceToolBean.getIconDark() : selfServiceToolBean.getIconBright());
    }

    public static final java.lang.CharSequence AEQbTJ(int i) {
        java.lang.String strValueOf;
        C44760scx.log$default("formatUnreadTicketString: openTickets: " + i, null, 2, null);
        if (i == 0) {
            return C33070mpX.AYXKKw(C47315tni.PendingIntent.gasjUx);
        }
        if (i == 1) {
            strValueOf = C33070mpX.AYXKKw(C47315tni.PendingIntent.flVtFt);
        } else {
            strValueOf = java.lang.String.valueOf(i);
        }
        java.lang.String strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C47315tni.StateListAnimator.OLrzqt, i, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, strValueOf)));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strEZpvd, strValueOf, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            return strEZpvd;
        }
        int length = strValueOf.length();
        android.text.SpannableString spannableString = new android.text.SpannableString(strEZpvd);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iCPUKe)), iIndexOf$default, length + iIndexOf$default, 33);
        return spannableString;
    }

    public static final ChatBotRequest copydefault(@NotNull final SelfServiceToolBean selfServiceToolBean) {
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        return C6805aWM.OLrzqt(new Function1() { // from class: o.sen
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44855sem.AEQbTJ(selfServiceToolBean, (ChatBotRequest) obj);
            }
        });
    }

    public static final Unit AEQbTJ(SelfServiceToolBean selfServiceToolBean, ChatBotRequest chatBotRequest) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        chatBotRequest.setFormSource(3);
        chatBotRequest.setGreetingAda(selfServiceToolBean.getAdaGreeting());
        chatBotRequest.setGreetings(selfServiceToolBean.getXbotGreeting());
        chatBotRequest.setContextualBot(selfServiceToolBean.getContextualBot());
        chatBotRequest.setOkaChatbotMessage(selfServiceToolBean.getOkAssistantGreeting());
        chatBotRequest.setOkaFrom("cg_" + selfServiceToolBean.getSlug());
        return Unit.INSTANCE;
    }
}
