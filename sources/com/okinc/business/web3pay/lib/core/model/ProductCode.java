package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ProductCode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProductCode[] $VALUES;
    public static final ActionBar Companion;
    private final String value;
    public static final ProductCode IM_PAID_GROUP = new ProductCode("IM_PAID_GROUP", 0, "IM_PAID_GROUP");
    public static final ProductCode EXTERNAL_QR_CODE = new ProductCode("EXTERNAL_QR_CODE", 1, "EXTERNAL_QR_CODE");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProductCode[] $values() {
        return new ProductCode[]{IM_PAID_GROUP, EXTERNAL_QR_CODE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProductCode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private ProductCode(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ProductCode[] productCodeArr$values = $values();
        $VALUES = productCodeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(productCodeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.ProductCode.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ProductCode AEQbTJ(String str) {
            if (str != null) {
                try {
                    return ProductCode.valueOf(str);
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public static ProductCode valueOf(String str) {
        return (ProductCode) Enum.valueOf(ProductCode.class, str);
    }

    public static ProductCode[] values() {
        return (ProductCode[]) $VALUES.clone();
    }
}
