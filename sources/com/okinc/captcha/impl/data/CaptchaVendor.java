package com.okinc.captcha.impl.data;

import com.okinc.captcha.impl.data.CaptchaVendor;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class CaptchaVendor {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CaptchaVendor[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;

    @SerialName("GEETEST")
    public static final CaptchaVendor GEETEST = new CaptchaVendor("GEETEST", 0, "GEETEST");

    @SerialName("TCAPTCHA")
    public static final CaptchaVendor TCAPTCHA = new CaptchaVendor("TCAPTCHA", 1, "TCAPTCHA");

    @SerialName("RECAPTCHA")
    public static final CaptchaVendor RECAPTCHA = new CaptchaVendor("RECAPTCHA", 2, "RECAPTCHA");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CaptchaVendor[] $values() {
        return new CaptchaVendor[]{GEETEST, TCAPTCHA, RECAPTCHA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CaptchaVendor> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private CaptchaVendor(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        CaptchaVendor[] captchaVendorArr$values = $values();
        $VALUES = captchaVendorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(captchaVendorArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.lVr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CaptchaVendor._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.captcha.impl.data.CaptchaVendor.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) CaptchaVendor.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<CaptchaVendor> serializer() {
            return OLrzqt();
        }

        public final CaptchaVendor KWHzl(@NotNull String str) {
            CaptchaVendor next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<CaptchaVendor> it = CaptchaVendor.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.toString(), (Object) str)) {
                    break;
                }
            }
            return next;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.captcha.impl.data.CaptchaVendor", values(), new String[]{"GEETEST", "TCAPTCHA", "RECAPTCHA"}, new Annotation[][]{null, null, null}, null);
    }

    public static CaptchaVendor valueOf(String str) {
        return (CaptchaVendor) Enum.valueOf(CaptchaVendor.class, str);
    }

    public static CaptchaVendor[] values() {
        return (CaptchaVendor[]) $VALUES.clone();
    }
}
