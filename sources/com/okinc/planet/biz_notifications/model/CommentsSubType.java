package com.okinc.planet.biz_notifications.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class CommentsSubType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CommentsSubType[] $VALUES;
    public static final TaskDescription Companion;
    public static final CommentsSubType Reply_Comments = new CommentsSubType("Reply_Comments", 0, 1);
    public static final CommentsSubType Reply_Post = new CommentsSubType("Reply_Post", 1, 2);
    private final int subType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CommentsSubType[] $values() {
        return new CommentsSubType[]{Reply_Comments, Reply_Post};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CommentsSubType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubType() {
        return this.subType;
    }

    private CommentsSubType(String str, int i, int i2) {
        this.subType = i2;
    }

    static {
        CommentsSubType[] commentsSubTypeArr$values = $values();
        $VALUES = commentsSubTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(commentsSubTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_notifications.model.CommentsSubType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final CommentsSubType copydefault(int i) {
            for (CommentsSubType commentsSubType : CommentsSubType.values()) {
                if (commentsSubType.getSubType() == i) {
                    return commentsSubType;
                }
            }
            return null;
        }
    }

    public static CommentsSubType valueOf(String str) {
        return (CommentsSubType) Enum.valueOf(CommentsSubType.class, str);
    }

    public static CommentsSubType[] values() {
        return (CommentsSubType[]) $VALUES.clone();
    }
}
