package o;

import com.okinc.okimcore.feature.conversation.listener.RefreshEvent;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sGH {
    void AEQbTJ(@NotNull OKConversation oKConversation);

    void AEQbTJ(@NotNull OKConversationType oKConversationType, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3);

    void AEQbTJ(boolean z);

    void KWHzl(@NotNull RefreshEvent refreshEvent, @NotNull OKConversation oKConversation);

    public static final class Application {
        public static /* synthetic */ void refreshConversation$default(sGH sgh, RefreshEvent refreshEvent, OKConversation oKConversation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshConversation");
            }
            if ((i & 1) != 0) {
                refreshEvent = RefreshEvent.EVENT_UNKNOWN;
            }
            sgh.KWHzl(refreshEvent, oKConversation);
        }

        public static /* synthetic */ void refreshConversationList$default(sGH sgh, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshConversationList");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            sgh.AEQbTJ(z);
        }
    }
}
