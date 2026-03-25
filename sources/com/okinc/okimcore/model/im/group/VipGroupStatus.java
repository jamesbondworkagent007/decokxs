package com.okinc.okimcore.model.im.group;

import com.okinc.okimcore.model.im.group.VipGroupStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class VipGroupStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VipGroupStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final VipGroupStatus ACTIVE = new VipGroupStatus("ACTIVE", 0);
    public static final VipGroupStatus EXPIRED = new VipGroupStatus("EXPIRED", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VipGroupStatus[] $values() {
        return new VipGroupStatus[]{ACTIVE, EXPIRED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VipGroupStatus> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.VipGroupStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) VipGroupStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<VipGroupStatus> serializer() {
            return KWHzl();
        }
    }

    private VipGroupStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.group.VipGroupStatus", values());
    }

    static {
        VipGroupStatus[] vipGroupStatusArr$values = $values();
        $VALUES = vipGroupStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(vipGroupStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sOY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return VipGroupStatus._init_$_anonymous_();
            }
        });
    }

    public static VipGroupStatus valueOf(String str) {
        return (VipGroupStatus) Enum.valueOf(VipGroupStatus.class, str);
    }

    public static VipGroupStatus[] values() {
        return (VipGroupStatus[]) $VALUES.clone();
    }
}
