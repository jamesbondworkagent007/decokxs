package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.remote.GroupScenarioType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.sQC;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = sQC.class)
public final class GroupScenarioType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupScenarioType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final GroupScenarioType Default = new GroupScenarioType("Default", 0, 1);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupScenarioType[] $values() {
        return new GroupScenarioType[]{Default};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupScenarioType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupScenarioType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) GroupScenarioType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<GroupScenarioType> serializer() {
            return OLrzqt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new sQC();
    }

    private GroupScenarioType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        GroupScenarioType[] groupScenarioTypeArr$values = $values();
        $VALUES = groupScenarioTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupScenarioTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sQF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GroupScenarioType._init_$_anonymous_();
            }
        });
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.value);
    }

    public static GroupScenarioType valueOf(String str) {
        return (GroupScenarioType) Enum.valueOf(GroupScenarioType.class, str);
    }

    public static GroupScenarioType[] values() {
        return (GroupScenarioType[]) $VALUES.clone();
    }
}
