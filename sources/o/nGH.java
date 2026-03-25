package o;

import com.okinc.im.imui.conversationlist.model.ConversationListSectionHeaderType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nGH {
    public final ConversationListSectionHeaderType AEQbTJ;
    public final int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ nGH copy$default(nGH ngh, ConversationListSectionHeaderType conversationListSectionHeaderType, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            conversationListSectionHeaderType = ngh.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            i = ngh.KWHzl;
        }
        return ngh.KWHzl(conversationListSectionHeaderType, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final nGH KWHzl(@NotNull ConversationListSectionHeaderType conversationListSectionHeaderType, int i) {
        Intrinsics.checkNotNullParameter(conversationListSectionHeaderType, "");
        return new nGH(conversationListSectionHeaderType, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConversationListSectionHeaderType OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nGH)) {
            return false;
        }
        nGH ngh = (nGH) obj;
        return this.AEQbTJ == ngh.AEQbTJ && this.KWHzl == ngh.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConversationListSectionHeader(sectionType=" + this.AEQbTJ + ", itemCount=" + this.KWHzl + ")";
    }

    public nGH(@NotNull ConversationListSectionHeaderType conversationListSectionHeaderType, int i) {
        Intrinsics.checkNotNullParameter(conversationListSectionHeaderType, "");
        this.AEQbTJ = conversationListSectionHeaderType;
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.im.imui.conversationlist.model.ConversationListSectionHeaderType)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(com.okinc.im.imui.conversationlist.model.ConversationListSectionHeaderType, int):void (m)] (LINE:3) call: o.nGH.<init>(com.okinc.im.imui.conversationlist.model.ConversationListSectionHeaderType, int):void type: THIS */
    public /* synthetic */ nGH(ConversationListSectionHeaderType conversationListSectionHeaderType, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationListSectionHeaderType, (i2 & 2) != 0 ? 0 : i);
    }
}
