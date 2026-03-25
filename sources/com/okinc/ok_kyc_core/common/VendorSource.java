package com.okinc.ok_kyc_core.common;

import com.okinc.ok_kyc_core.common.VendorSource;
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
/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class VendorSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VendorSource[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;
    public static final VendorSource UNKNOWN = new VendorSource("UNKNOWN", 0, "default");
    public static final VendorSource EID = new VendorSource("EID", 1, "eid");
    public static final VendorSource URL_VENDOR = new VendorSource("URL_VENDOR", 2, "url_vendor");
    public static final VendorSource FACE_VERIFICATION = new VendorSource("FACE_VERIFICATION", 3, "face_verification");
    public static final VendorSource CHINA_ID = new VendorSource("CHINA_ID", 4, "china_id");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VendorSource[] $values() {
        return new VendorSource[]{UNKNOWN, EID, URL_VENDOR, FACE_VERIFICATION, CHINA_ID};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VendorSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.common.VendorSource.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) VendorSource.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<VendorSource> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.ok_kyc_core.common.VendorSource", values());
    }

    private VendorSource(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        VendorSource[] vendorSourceArr$values = $values();
        $VALUES = vendorSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(vendorSourceArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ruE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return VendorSource._init_$_anonymous_();
            }
        });
    }

    public static VendorSource valueOf(String str) {
        return (VendorSource) Enum.valueOf(VendorSource.class, str);
    }

    public static VendorSource[] values() {
        return (VendorSource[]) $VALUES.clone();
    }
}
