package com.okinc.uilab.shape.helper;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class ShapeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ShapeType[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final ShapeType RECTANGLE = new ShapeType("RECTANGLE", 0, 0);
    public static final ShapeType OVAL = new ShapeType("OVAL", 1, 1);
    public static final ShapeType LINE = new ShapeType("LINE", 2, 2);
    public static final ShapeType RING = new ShapeType("RING", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ShapeType[] $values() {
        return new ShapeType[]{RECTANGLE, OVAL, LINE, RING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ShapeType fromValue(int i) {
        return Companion.OLrzqt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ShapeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ShapeType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ShapeType[] shapeTypeArr$values = $values();
        $VALUES = shapeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(shapeTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.shape.helper.ShapeType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final ShapeType OLrzqt(int i) {
            ShapeType shapeType;
            ShapeType[] shapeTypeArrValues = ShapeType.values();
            int length = shapeTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    shapeType = null;
                    break;
                }
                shapeType = shapeTypeArrValues[i2];
                if (shapeType.getValue() == i) {
                    break;
                }
                i2++;
            }
            return shapeType == null ? ShapeType.RECTANGLE : shapeType;
        }
    }

    public static ShapeType valueOf(String str) {
        return (ShapeType) Enum.valueOf(ShapeType.class, str);
    }

    public static ShapeType[] values() {
        return (ShapeType[]) $VALUES.clone();
    }
}
