package com.okinc.okimcore.model.im.inhouseim.ws;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.sPS;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = sPS.class)
public final class InHouseIMPlatformType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InHouseIMPlatformType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int apiValue;
    public static final InHouseIMPlatformType Unknown = new InHouseIMPlatformType("Unknown", 0, 0);
    public static final InHouseIMPlatformType iOS = new InHouseIMPlatformType("iOS", 1, 1);
    public static final InHouseIMPlatformType Android = new InHouseIMPlatformType("Android", 2, 2);
    public static final InHouseIMPlatformType Web = new InHouseIMPlatformType("Web", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InHouseIMPlatformType[] $values() {
        return new InHouseIMPlatformType[]{Unknown, iOS, Android, Web};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InHouseIMPlatformType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiValue() {
        return this.apiValue;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) InHouseIMPlatformType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InHouseIMPlatformType> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new sPS();
    }

    private InHouseIMPlatformType(String str, int i, int i2) {
        this.apiValue = i2;
    }

    static {
        InHouseIMPlatformType[] inHouseIMPlatformTypeArr$values = $values();
        $VALUES = inHouseIMPlatformTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inHouseIMPlatformTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sPU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InHouseIMPlatformType._init_$_anonymous_();
            }
        });
    }

    public static InHouseIMPlatformType valueOf(String str) {
        return (InHouseIMPlatformType) Enum.valueOf(InHouseIMPlatformType.class, str);
    }

    public static InHouseIMPlatformType[] values() {
        return (InHouseIMPlatformType[]) $VALUES.clone();
    }
}
