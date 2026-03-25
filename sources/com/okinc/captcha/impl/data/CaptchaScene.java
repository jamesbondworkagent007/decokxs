package com.okinc.captcha.impl.data;

import com.google.android.gms.stats.CodePackage;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class CaptchaScene {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CaptchaScene[] $VALUES;
    public static final Application Companion;
    private final String key;
    public static final CaptchaScene COMMON = new CaptchaScene(CodePackage.COMMON, 0, "okex_common");
    public static final CaptchaScene HIGH_RISK = new CaptchaScene("HIGH_RISK", 1, "okex_highrisk");
    public static final CaptchaScene REGISTER = new CaptchaScene("REGISTER", 2, "okex_register");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CaptchaScene[] $values() {
        return new CaptchaScene[]{COMMON, HIGH_RISK, REGISTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CaptchaScene> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    private CaptchaScene(String str, int i, String str2) {
        this.key = str2;
    }

    static {
        CaptchaScene[] captchaSceneArr$values = $values();
        $VALUES = captchaSceneArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(captchaSceneArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.captcha.impl.data.CaptchaScene.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final CaptchaScene KWHzl(@NotNull String str) {
            CaptchaScene next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<CaptchaScene> it = CaptchaScene.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getKey(), (Object) str)) {
                    break;
                }
            }
            return next;
        }
    }

    public static CaptchaScene valueOf(String str) {
        return (CaptchaScene) Enum.valueOf(CaptchaScene.class, str);
    }

    public static CaptchaScene[] values() {
        return (CaptchaScene[]) $VALUES.clone();
    }
}
