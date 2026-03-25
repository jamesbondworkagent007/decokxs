package com.okinc.captcha.impl.geetest;

import com.google.android.gms.stats.CodePackage;
import com.okinc.captcha.impl.data.CaptchaScene;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class GeetestCaptchaId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GeetestCaptchaId[] $VALUES;
    public static final Application Companion;
    private final String captchaId;
    public static final GeetestCaptchaId COMMON = new GeetestCaptchaId(CodePackage.COMMON, 0, "87047495862eb6a564bbb4fb14612377");
    public static final GeetestCaptchaId HIGH_RISK = new GeetestCaptchaId("HIGH_RISK", 1, "6ba6b71b4f3958a1c69ad839ba47836b");
    public static final GeetestCaptchaId REGISTER = new GeetestCaptchaId("REGISTER", 2, "1fc4e5777781abd485a9c55255d1ea94");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GeetestCaptchaId[] $values() {
        return new GeetestCaptchaId[]{COMMON, HIGH_RISK, REGISTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GeetestCaptchaId> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCaptchaId() {
        return this.captchaId;
    }

    private GeetestCaptchaId(String str, int i, String str2) {
        this.captchaId = str2;
    }

    static {
        GeetestCaptchaId[] geetestCaptchaIdArr$values = $values();
        $VALUES = geetestCaptchaIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(geetestCaptchaIdArr$values);
        Companion = new Application(null);
    }

    public static final class Application {

        /* JADX INFO: renamed from: com.okinc.captcha.impl.geetest.GeetestCaptchaId$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public final /* synthetic */ class C0389Application {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[CaptchaScene.values().length];
                try {
                    iArr[CaptchaScene.COMMON.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CaptchaScene.HIGH_RISK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CaptchaScene.REGISTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.captcha.impl.geetest.GeetestCaptchaId.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final GeetestCaptchaId AEQbTJ(@NotNull CaptchaScene captchaScene) {
            Intrinsics.checkNotNullParameter(captchaScene, "");
            int i = C0389Application.copydefault[captchaScene.ordinal()];
            if (i == 1) {
                return GeetestCaptchaId.COMMON;
            }
            if (i == 2) {
                return GeetestCaptchaId.HIGH_RISK;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return GeetestCaptchaId.REGISTER;
        }
    }

    public static GeetestCaptchaId valueOf(String str) {
        return (GeetestCaptchaId) Enum.valueOf(GeetestCaptchaId.class, str);
    }

    public static GeetestCaptchaId[] values() {
        return (GeetestCaptchaId[]) $VALUES.clone();
    }
}
