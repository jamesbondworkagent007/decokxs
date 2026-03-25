package com.okinc.share.api;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class RedirectBehavior {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RedirectBehavior[] $VALUES;
    public static final Application Companion;
    public static final RedirectBehavior DEFAULT_ALLOW_DEEPLINK = new RedirectBehavior("DEFAULT_ALLOW_DEEPLINK", 0, 1);
    public static final RedirectBehavior DIRECT_GOTO_BIZ_PAGE = new RedirectBehavior("DIRECT_GOTO_BIZ_PAGE", 1, 2);
    private final int behavior;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RedirectBehavior[] $values() {
        return new RedirectBehavior[]{DEFAULT_ALLOW_DEEPLINK, DIRECT_GOTO_BIZ_PAGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RedirectBehavior> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBehavior() {
        return this.behavior;
    }

    private RedirectBehavior(String str, int i, int i2) {
        this.behavior = i2;
    }

    static {
        RedirectBehavior[] redirectBehaviorArr$values = $values();
        $VALUES = redirectBehaviorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(redirectBehaviorArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.api.RedirectBehavior.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final RedirectBehavior OLrzqt(int i) {
            RedirectBehavior redirectBehavior = RedirectBehavior.DEFAULT_ALLOW_DEEPLINK;
            if (i == redirectBehavior.getBehavior()) {
                return redirectBehavior;
            }
            RedirectBehavior redirectBehavior2 = RedirectBehavior.DIRECT_GOTO_BIZ_PAGE;
            if (i == redirectBehavior2.getBehavior()) {
                return redirectBehavior2;
            }
            return null;
        }
    }

    public static RedirectBehavior valueOf(String str) {
        return (RedirectBehavior) Enum.valueOf(RedirectBehavior.class, str);
    }

    public static RedirectBehavior[] values() {
        return (RedirectBehavior[]) $VALUES.clone();
    }
}
