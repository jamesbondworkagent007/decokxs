package com.okinc.ok_kyc_core.presentation.views.costomUIView;

import com.okinc.ok_kyc_core.presentation.views.costomUIView.ChinaAddressType;
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
/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ChinaAddressType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChinaAddressType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final ChinaAddressType province = new ChinaAddressType("province", 0);
    public static final ChinaAddressType city = new ChinaAddressType("city", 1);
    public static final ChinaAddressType district = new ChinaAddressType("district", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChinaAddressType[] $values() {
        return new ChinaAddressType[]{province, city, district};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChinaAddressType> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.presentation.views.costomUIView.ChinaAddressType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) ChinaAddressType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ChinaAddressType> serializer() {
            return copydefault();
        }
    }

    private ChinaAddressType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.ok_kyc_core.presentation.views.costomUIView.ChinaAddressType", values());
    }

    static {
        ChinaAddressType[] chinaAddressTypeArr$values = $values();
        $VALUES = chinaAddressTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chinaAddressTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rRF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChinaAddressType._init_$_anonymous_();
            }
        });
    }

    public static ChinaAddressType valueOf(String str) {
        return (ChinaAddressType) Enum.valueOf(ChinaAddressType.class, str);
    }

    public static ChinaAddressType[] values() {
        return (ChinaAddressType[]) $VALUES.clone();
    }
}
