package com.okinc.okex.center.bean.enums;

import com.okinc.okex.center.bean.enums.CommonServiceType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44817seA;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Serializable(with = C44817seA.class)
public final class CommonServiceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CommonServiceType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;
    public static final CommonServiceType WEBVIEW = new CommonServiceType("WEBVIEW", 0, 0);
    public static final CommonServiceType NATIVE = new CommonServiceType("NATIVE", 1, 1);
    public static final CommonServiceType DEEPLINK = new CommonServiceType("DEEPLINK", 2, 2);
    public static final CommonServiceType UNKNOWN = new CommonServiceType("UNKNOWN", 3, -1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CommonServiceType[] $values() {
        return new CommonServiceType[]{WEBVIEW, NATIVE, DEEPLINK, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CommonServiceType> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.enums.CommonServiceType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) CommonServiceType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<CommonServiceType> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44817seA();
    }

    private CommonServiceType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        CommonServiceType[] commonServiceTypeArr$values = $values();
        $VALUES = commonServiceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(commonServiceTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sey
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CommonServiceType._init_$_anonymous_();
            }
        });
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.value);
    }

    public static CommonServiceType valueOf(String str) {
        return (CommonServiceType) Enum.valueOf(CommonServiceType.class, str);
    }

    public static CommonServiceType[] values() {
        return (CommonServiceType[]) $VALUES.clone();
    }
}
