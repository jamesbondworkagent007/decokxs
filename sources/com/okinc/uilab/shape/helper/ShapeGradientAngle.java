package com.okinc.uilab.shape.helper;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ShapeGradientAngle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ShapeGradientAngle[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final ShapeGradientAngle LEFT_RIGHT = new ShapeGradientAngle("LEFT_RIGHT", 0, 0);
    public static final ShapeGradientAngle BL_TR = new ShapeGradientAngle("BL_TR", 1, 45);
    public static final ShapeGradientAngle BOTTOM_TOP = new ShapeGradientAngle("BOTTOM_TOP", 2, 90);
    public static final ShapeGradientAngle BR_TL = new ShapeGradientAngle("BR_TL", 3, 135);
    public static final ShapeGradientAngle RIGHT_LEFT = new ShapeGradientAngle("RIGHT_LEFT", 4, 180);
    public static final ShapeGradientAngle TR_BL = new ShapeGradientAngle("TR_BL", 5, 225);
    public static final ShapeGradientAngle TOP_BOTTOM = new ShapeGradientAngle("TOP_BOTTOM", 6, SubsamplingScaleImageView.ORIENTATION_270);
    public static final ShapeGradientAngle TL_BR = new ShapeGradientAngle("TL_BR", 7, 315);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ShapeGradientAngle[] $values() {
        return new ShapeGradientAngle[]{LEFT_RIGHT, BL_TR, BOTTOM_TOP, BR_TL, RIGHT_LEFT, TR_BL, TOP_BOTTOM, TL_BR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ShapeGradientAngle fromValue(int i) {
        return Companion.KWHzl(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ShapeGradientAngle> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ShapeGradientAngle(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ShapeGradientAngle[] shapeGradientAngleArr$values = $values();
        $VALUES = shapeGradientAngleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(shapeGradientAngleArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.shape.helper.ShapeGradientAngle.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final ShapeGradientAngle KWHzl(int i) {
            ShapeGradientAngle shapeGradientAngle;
            ShapeGradientAngle[] shapeGradientAngleArrValues = ShapeGradientAngle.values();
            int length = shapeGradientAngleArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    shapeGradientAngle = null;
                    break;
                }
                shapeGradientAngle = shapeGradientAngleArrValues[i2];
                if (shapeGradientAngle.getValue() == i) {
                    break;
                }
                i2++;
            }
            return shapeGradientAngle == null ? ShapeGradientAngle.LEFT_RIGHT : shapeGradientAngle;
        }
    }

    public static ShapeGradientAngle valueOf(String str) {
        return (ShapeGradientAngle) Enum.valueOf(ShapeGradientAngle.class, str);
    }

    public static ShapeGradientAngle[] values() {
        return (ShapeGradientAngle[]) $VALUES.clone();
    }
}
