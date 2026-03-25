package o;

import com.okinc.im.imui.conversationlist.provider.ConversationListFilterChipsType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nGI {
    public final int AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final ConversationListFilterChipsType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ nGI copy$default(nGI ngi, ConversationListFilterChipsType conversationListFilterChipsType, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            conversationListFilterChipsType = ngi.copydefault;
        }
        if ((i4 & 2) != 0) {
            i = ngi.KWHzl;
        }
        if ((i4 & 4) != 0) {
            i2 = ngi.AEQbTJ;
        }
        if ((i4 & 8) != 0) {
            i3 = ngi.EZpvd;
        }
        return ngi.AEQbTJ(conversationListFilterChipsType, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final nGI AEQbTJ(@NotNull ConversationListFilterChipsType conversationListFilterChipsType, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(conversationListFilterChipsType, "");
        return new nGI(conversationListFilterChipsType, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConversationListFilterChipsType KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nGI)) {
            return false;
        }
        nGI ngi = (nGI) obj;
        return this.copydefault == ngi.copydefault && this.KWHzl == ngi.KWHzl && this.AEQbTJ == ngi.AEQbTJ && this.EZpvd == ngi.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConversationListFilterChips(selectedType=" + this.copydefault + ", unreadConversationCount=" + this.KWHzl + ", flaggedConversationCount=" + this.AEQbTJ + ", flaggedWithUnreadCount=" + this.EZpvd + ")";
    }

    public nGI(@NotNull ConversationListFilterChipsType conversationListFilterChipsType, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(conversationListFilterChipsType, "");
        this.copydefault = conversationListFilterChipsType;
        this.KWHzl = i;
        this.AEQbTJ = i2;
        this.EZpvd = i3;
    }
}
