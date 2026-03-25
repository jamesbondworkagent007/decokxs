package com.okinc.okimcore.model.room.inhouseim;

import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMMessageWithReactions {
    public static final int $stable = 8;
    private final InHouseIMMessageEntity imMessageEntity;
    private final List<ReactionDisplay> reactionDisplay;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InHouseIMMessageWithReactions copy$default(InHouseIMMessageWithReactions inHouseIMMessageWithReactions, InHouseIMMessageEntity inHouseIMMessageEntity, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            inHouseIMMessageEntity = inHouseIMMessageWithReactions.imMessageEntity;
        }
        if ((i & 2) != 0) {
            list = inHouseIMMessageWithReactions.reactionDisplay;
        }
        return inHouseIMMessageWithReactions.copy(inHouseIMMessageEntity, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageEntity component1() {
        return this.imMessageEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionDisplay> component2() {
        return this.reactionDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageWithReactions copy(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, @NotNull List<ReactionDisplay> list) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new InHouseIMMessageWithReactions(inHouseIMMessageEntity, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMMessageWithReactions)) {
            return false;
        }
        InHouseIMMessageWithReactions inHouseIMMessageWithReactions = (InHouseIMMessageWithReactions) obj;
        return Intrinsics.EZpvd(this.imMessageEntity, inHouseIMMessageWithReactions.imMessageEntity) && Intrinsics.EZpvd(this.reactionDisplay, inHouseIMMessageWithReactions.reactionDisplay);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageEntity getImMessageEntity() {
        return this.imMessageEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionDisplay> getReactionDisplay() {
        return this.reactionDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.imMessageEntity.hashCode() * 31) + this.reactionDisplay.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMMessageWithReactions(imMessageEntity=" + this.imMessageEntity + ", reactionDisplay=" + this.reactionDisplay + ")";
    }

    public InHouseIMMessageWithReactions(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, @NotNull List<ReactionDisplay> list) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.imMessageEntity = inHouseIMMessageEntity;
        this.reactionDisplay = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r2v0 java.util.List))
 A[MD:(com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity, java.util.List<com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay>):void (m)] (LINE:8) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions.<init>(com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity, java.util.List):void type: THIS */
    public /* synthetic */ InHouseIMMessageWithReactions(InHouseIMMessageEntity inHouseIMMessageEntity, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inHouseIMMessageEntity, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
