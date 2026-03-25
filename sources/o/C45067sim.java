package o;

import com.okinc.okex.center.bean.ContactInfoBean;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sim, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45067sim {
    public static final ChatbotEntryDisplayModel AEQbTJ(@NotNull ContactInfoBean contactInfoBean) {
        java.lang.String chatbotIconBright;
        Intrinsics.checkNotNullParameter(contactInfoBean, "");
        if (C33492mxV.OLrzqt()) {
            chatbotIconBright = contactInfoBean.getChatbotIconDark();
        } else {
            chatbotIconBright = contactInfoBean.getChatbotIconBright();
        }
        java.lang.Boolean chatbotEnabled = contactInfoBean.getChatbotEnabled();
        boolean zBooleanValue = chatbotEnabled != null ? chatbotEnabled.booleanValue() : true;
        java.lang.String chatWithUsTitle = contactInfoBean.getChatWithUsTitle();
        java.lang.String str = chatWithUsTitle == null ? "" : chatWithUsTitle;
        java.lang.String str2 = chatbotIconBright == null ? "" : chatbotIconBright;
        java.lang.String okAssistantGreeting = contactInfoBean.getOkAssistantGreeting();
        java.lang.String str3 = okAssistantGreeting == null ? "" : okAssistantGreeting;
        java.lang.String xbotGreeting = contactInfoBean.getXbotGreeting();
        java.lang.String str4 = xbotGreeting == null ? "" : xbotGreeting;
        java.lang.String adaGreeting = contactInfoBean.getAdaGreeting();
        java.lang.String str5 = adaGreeting == null ? "" : adaGreeting;
        java.lang.String contextualBot = contactInfoBean.getContextualBot();
        return new ChatbotEntryDisplayModel(zBooleanValue, str, str2, str3, str4, str5, contextualBot == null ? "" : contextualBot);
    }
}
