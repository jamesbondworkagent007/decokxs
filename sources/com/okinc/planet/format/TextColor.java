package com.okinc.planet.format;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.ColorRes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C33512mxp;
import o.C43246rlf;
import o.C54819xWm;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class TextColor {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TextColor[] $VALUES;
    public static final TaskDescription Companion;
    public static final TextColor Up = new TextColor("Up", 0);
    public static final TextColor Down = new TextColor("Down", 1);
    public static final TextColor Normal = new TextColor("Normal", 2);

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TextColor.values().length];
            try {
                iArr[TextColor.Up.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextColor.Down.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextColor.Normal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TextColor[] $values() {
        return new TextColor[]{Up, Down, Normal};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TextColor> getEntries() {
        return $ENTRIES;
    }

    private TextColor(String str, int i) {
    }

    static {
        TextColor[] textColorArr$values = $values();
        $VALUES = textColorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(textColorArr$values);
        Companion = new TaskDescription(null);
    }

    private final Context getContext() {
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        return activityAEQbTJ != null ? activityAEQbTJ : C43246rlf.OLrzqt.valueOf();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.format.TextColor.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final TextColor AEQbTJ(@NotNull Number number) {
            Intrinsics.checkNotNullParameter(number, "");
            return C33129mqd.gEmmrt(number, 0) ? TextColor.Down : C33129mqd.AEQbTJ(number, 0) ? TextColor.Up : TextColor.Normal;
        }
    }

    public final int color(@ColorRes int i) {
        int i2 = ActionBar.copydefault[ordinal()];
        if (i2 == 1) {
            return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, getContext(), 0.0f, 2, null);
        }
        if (i2 == 2) {
            return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, getContext(), 0.0f, 2, null);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C33070mpX.OLrzqt(i, getContext());
    }

    public static TextColor valueOf(String str) {
        return (TextColor) Enum.valueOf(TextColor.class, str);
    }

    public static TextColor[] values() {
        return (TextColor[]) $VALUES.clone();
    }
}
