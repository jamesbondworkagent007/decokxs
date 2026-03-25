package com.okinc.business.market.features.analysis.futures.root.widget;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class GradientColorSpan extends CharacterStyle {
    public final int[] AEQbTJ;
    public final String EZpvd;
    public final Orientation KWHzl;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.LEFT_TO_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.TOP_TO_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Orientation.LEFT_TOP_TO_RIGHT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Orientation.RIGHT_TOP_TO_LEFT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 int[])
  (r2v0 java.lang.String)
  (wrap:com.okinc.business.market.features.analysis.futures.root.widget.GradientColorSpan$Orientation:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.analysis.futures.root.widget.GradientColorSpan$Orientation:0x0004: SGET  A[WRAPPED] (LINE:14) com.okinc.business.market.features.analysis.futures.root.widget.GradientColorSpan.Orientation.LEFT_TO_RIGHT com.okinc.business.market.features.analysis.futures.root.widget.GradientColorSpan$Orientation) : (r3v0 com.okinc.business.market.features.analysis.futures.root.widget.GradientColorSpan$Orientation))
 A[MD:(int[], java.lang.String, com.okinc.business.market.features.analysis.futures.root.widget.GradientColorSpan$Orientation):void (m)] (LINE:11) call: com.okinc.business.market.features.analysis.futures.root.widget.GradientColorSpan.<init>(int[], java.lang.String, com.okinc.business.market.features.analysis.futures.root.widget.GradientColorSpan$Orientation):void type: THIS */
    public /* synthetic */ GradientColorSpan(int[] iArr, String str, Orientation orientation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, str, (i & 4) != 0 ? Orientation.LEFT_TO_RIGHT : orientation);
    }

    public GradientColorSpan(@NotNull int[] iArr, @NotNull String str, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(orientation, "");
        this.AEQbTJ = iArr;
        this.EZpvd = str;
        this.KWHzl = orientation;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Orientation {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Orientation[] $VALUES;
        public static final Orientation LEFT_TO_RIGHT = new Orientation("LEFT_TO_RIGHT", 0);
        public static final Orientation TOP_TO_BOTTOM = new Orientation("TOP_TO_BOTTOM", 1);
        public static final Orientation LEFT_TOP_TO_RIGHT_BOTTOM = new Orientation("LEFT_TOP_TO_RIGHT_BOTTOM", 2);
        public static final Orientation RIGHT_TOP_TO_LEFT_BOTTOM = new Orientation("RIGHT_TOP_TO_LEFT_BOTTOM", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Orientation[] $values() {
            return new Orientation[]{LEFT_TO_RIGHT, TOP_TO_BOTTOM, LEFT_TOP_TO_RIGHT_BOTTOM, RIGHT_TOP_TO_LEFT_BOTTOM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Orientation> getEntries() {
            return $ENTRIES;
        }

        private Orientation(String str, int i) {
        }

        static {
            Orientation[] orientationArr$values = $values();
            $VALUES = orientationArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(orientationArr$values);
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        LinearGradient linearGradient;
        Intrinsics.checkNotNullParameter(textPaint, "");
        float fMeasureText = textPaint.measureText(this.EZpvd);
        float fDescent = textPaint.descent() - textPaint.ascent();
        int i = ActionBar.AEQbTJ[this.KWHzl.ordinal()];
        if (i == 1) {
            linearGradient = new LinearGradient(0.0f, 0.0f, fMeasureText, 0.0f, this.AEQbTJ, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i == 2) {
            linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, fDescent, this.AEQbTJ, (float[]) null, Shader.TileMode.CLAMP);
        } else if (i == 3) {
            linearGradient = new LinearGradient(0.0f, 0.0f, fMeasureText, fDescent, this.AEQbTJ, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            linearGradient = new LinearGradient(fMeasureText, 0.0f, 0.0f, fDescent, this.AEQbTJ, (float[]) null, Shader.TileMode.CLAMP);
        }
        textPaint.setShader(linearGradient);
    }
}
