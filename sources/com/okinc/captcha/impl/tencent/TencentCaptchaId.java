package com.okinc.captcha.impl.tencent;

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
public final class TencentCaptchaId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TencentCaptchaId[] $VALUES;
    public static final Activity Companion;
    private final String captchaId;
    public static final TencentCaptchaId COMMON = new TencentCaptchaId(CodePackage.COMMON, 0, "189924090");
    public static final TencentCaptchaId HIGH_RISK = new TencentCaptchaId("HIGH_RISK", 1, "189968422");
    public static final TencentCaptchaId REGISTER = new TencentCaptchaId("REGISTER", 2, "189975292");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TencentCaptchaId[] $values() {
        return new TencentCaptchaId[]{COMMON, HIGH_RISK, REGISTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TencentCaptchaId> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCaptchaId() {
        return this.captchaId;
    }

    private TencentCaptchaId(String str, int i, String str2) {
        this.captchaId = str2;
    }

    static {
        TencentCaptchaId[] tencentCaptchaIdArr$values = $values();
        $VALUES = tencentCaptchaIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tencentCaptchaIdArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {

        /* JADX INFO: loaded from: classes18.dex */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] KWHzl;

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
                KWHzl = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.captcha.impl.tencent.TencentCaptchaId.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TencentCaptchaId EZpvd(@NotNull CaptchaScene captchaScene) {
            Intrinsics.checkNotNullParameter(captchaScene, "");
            int i = StateListAnimator.KWHzl[captchaScene.ordinal()];
            if (i == 1) {
                return TencentCaptchaId.COMMON;
            }
            if (i == 2) {
                return TencentCaptchaId.HIGH_RISK;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return TencentCaptchaId.REGISTER;
        }
    }

    public static TencentCaptchaId valueOf(String str) {
        return (TencentCaptchaId) Enum.valueOf(TencentCaptchaId.class, str);
    }

    public static TencentCaptchaId[] values() {
        return (TencentCaptchaId[]) $VALUES.clone();
    }
}
