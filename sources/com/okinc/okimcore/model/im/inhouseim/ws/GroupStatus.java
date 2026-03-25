package com.okinc.okimcore.model.im.inhouseim.ws;

import com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C33129mqd;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.sPB;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = sPB.class)
public final class GroupStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int apiValue;
    public static final GroupStatus UNKNOWN = new GroupStatus("UNKNOWN", 0, -1);
    public static final GroupStatus NORMAL = new GroupStatus("NORMAL", 1, 0);
    public static final GroupStatus DISMISS = new GroupStatus("DISMISS", 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupStatus[] $values() {
        return new GroupStatus[]{UNKNOWN, NORMAL, DISMISS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiValue() {
        return this.apiValue;
    }

    private GroupStatus(String str, int i, int i2) {
        this.apiValue = i2;
    }

    static {
        GroupStatus[] groupStatusArr$values = $values();
        $VALUES = groupStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sPC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GroupStatus._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) GroupStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<GroupStatus> serializer() {
            return OLrzqt();
        }

        public final GroupStatus OLrzqt(@NotNull Object obj) {
            GroupStatus groupStatus;
            Intrinsics.checkNotNullParameter(obj, "");
            GroupStatus[] groupStatusArrValues = GroupStatus.values();
            int length = groupStatusArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    groupStatus = null;
                    break;
                }
                groupStatus = groupStatusArrValues[i];
                if (groupStatus.getApiValue() == C33129mqd.AhwBna(obj)) {
                    break;
                }
                i++;
            }
            return groupStatus == null ? GroupStatus.UNKNOWN : groupStatus;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new sPB();
    }

    public static GroupStatus valueOf(String str) {
        return (GroupStatus) Enum.valueOf(GroupStatus.class, str);
    }

    public static GroupStatus[] values() {
        return (GroupStatus[]) $VALUES.clone();
    }
}
