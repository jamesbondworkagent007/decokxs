package com.okinc.uilab.shape.helper;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ShapeGradientType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ShapeGradientType[] $VALUES;
    public static final ActionBar Companion;
    public static final ShapeGradientType LINEAR = new ShapeGradientType("LINEAR", 0, 0);
    public static final ShapeGradientType RADIAL = new ShapeGradientType("RADIAL", 1, 1);
    public static final ShapeGradientType SWEEP = new ShapeGradientType("SWEEP", 2, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ShapeGradientType[] $values() {
        return new ShapeGradientType[]{LINEAR, RADIAL, SWEEP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ShapeGradientType fromValue(int i) {
        return Companion.AEQbTJ(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ShapeGradientType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ShapeGradientType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ShapeGradientType[] shapeGradientTypeArr$values = $values();
        $VALUES = shapeGradientTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(shapeGradientTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.shape.helper.ShapeGradientType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ShapeGradientType AEQbTJ(int i) {
            ShapeGradientType shapeGradientType;
            ShapeGradientType[] shapeGradientTypeArrValues = ShapeGradientType.values();
            int length = shapeGradientTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    shapeGradientType = null;
                    break;
                }
                shapeGradientType = shapeGradientTypeArrValues[i2];
                if (shapeGradientType.getValue() == i) {
                    break;
                }
                i2++;
            }
            return shapeGradientType == null ? ShapeGradientType.LINEAR : shapeGradientType;
        }
    }

    public static ShapeGradientType valueOf(String str) {
        return (ShapeGradientType) Enum.valueOf(ShapeGradientType.class, str);
    }

    public static ShapeGradientType[] values() {
        return (ShapeGradientType[]) $VALUES.clone();
    }
}
