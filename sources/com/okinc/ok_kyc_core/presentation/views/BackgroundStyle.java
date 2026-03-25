package com.okinc.ok_kyc_core.presentation.views;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class BackgroundStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BackgroundStyle[] $VALUES;
    public static final ActionBar Companion;
    private final String style;
    public static final BackgroundStyle DEFAULT = new BackgroundStyle("DEFAULT", 0, "default");
    public static final BackgroundStyle CARD = new BackgroundStyle("CARD", 1, "card");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BackgroundStyle[] $values() {
        return new BackgroundStyle[]{DEFAULT, CARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BackgroundStyle> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStyle() {
        return this.style;
    }

    private BackgroundStyle(String str, int i, String str2) {
        this.style = str2;
    }

    static {
        BackgroundStyle[] backgroundStyleArr$values = $values();
        $VALUES = backgroundStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(backgroundStyleArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.presentation.views.BackgroundStyle.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final BackgroundStyle KWHzl(String str) {
            BackgroundStyle next;
            Iterator<BackgroundStyle> it = BackgroundStyle.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getStyle(), (Object) str)) {
                    break;
                }
            }
            BackgroundStyle backgroundStyle = next;
            return backgroundStyle == null ? BackgroundStyle.DEFAULT : backgroundStyle;
        }
    }

    public static BackgroundStyle valueOf(String str) {
        return (BackgroundStyle) Enum.valueOf(BackgroundStyle.class, str);
    }

    public static BackgroundStyle[] values() {
        return (BackgroundStyle[]) $VALUES.clone();
    }
}
