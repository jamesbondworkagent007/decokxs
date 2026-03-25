package com.okinc.okimcore.feature.notification.model;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ConversationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConversationType[] $VALUES;
    public static final ActionBar Companion;
    private final String type;
    public static final ConversationType INDIVIDUAL = new ConversationType("INDIVIDUAL", 0, "individual");
    public static final ConversationType GROUP = new ConversationType("GROUP", 1, "group");
    public static final ConversationType VIP = new ConversationType("VIP", 2, "vip");
    public static final ConversationType UNKNOWN = new ConversationType("UNKNOWN", 3, "unknown");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConversationType[] $values() {
        return new ConversationType[]{INDIVIDUAL, GROUP, VIP, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConversationType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private ConversationType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        ConversationType[] conversationTypeArr$values = $values();
        $VALUES = conversationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(conversationTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.feature.notification.model.ConversationType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ConversationType OLrzqt(@NotNull String str) {
            ConversationType next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<ConversationType> it = ConversationType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getType(), (Object) str)) {
                    break;
                }
            }
            ConversationType conversationType = next;
            return conversationType == null ? ConversationType.UNKNOWN : conversationType;
        }
    }

    public static ConversationType valueOf(String str) {
        return (ConversationType) Enum.valueOf(ConversationType.class, str);
    }

    public static ConversationType[] values() {
        return (ConversationType[]) $VALUES.clone();
    }
}
