package o;

import com.okinc.okimcore.model.im.ConversationSyncStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sNJ {
    public final java.lang.Long AEQbTJ;
    public final ConversationSyncStatus copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ sNJ copy$default(sNJ snj, java.lang.Long l, ConversationSyncStatus conversationSyncStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = snj.AEQbTJ;
        }
        if ((i & 2) != 0) {
            conversationSyncStatus = snj.copydefault;
        }
        return snj.OLrzqt(l, conversationSyncStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sNJ OLrzqt(java.lang.Long l, @NotNull ConversationSyncStatus conversationSyncStatus) {
        Intrinsics.checkNotNullParameter(conversationSyncStatus, "");
        return new sNJ(l, conversationSyncStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConversationSyncStatus copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sNJ)) {
            return false;
        }
        sNJ snj = (sNJ) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, snj.AEQbTJ) && this.copydefault == snj.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.AEQbTJ;
        return ((l == null ? 0 : l.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConversationSyncTracker(elapsedTimeInMillis=" + this.AEQbTJ + ", status=" + this.copydefault + ")";
    }

    public sNJ(java.lang.Long l, @NotNull ConversationSyncStatus conversationSyncStatus) {
        Intrinsics.checkNotNullParameter(conversationSyncStatus, "");
        this.AEQbTJ = l;
        this.copydefault = conversationSyncStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r1v0 java.lang.Long))
  (r2v0 com.okinc.okimcore.model.im.ConversationSyncStatus)
 A[MD:(java.lang.Long, com.okinc.okimcore.model.im.ConversationSyncStatus):void (m)] (LINE:3) call: o.sNJ.<init>(java.lang.Long, com.okinc.okimcore.model.im.ConversationSyncStatus):void type: THIS */
    public /* synthetic */ sNJ(java.lang.Long l, ConversationSyncStatus conversationSyncStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, conversationSyncStatus);
    }
}
