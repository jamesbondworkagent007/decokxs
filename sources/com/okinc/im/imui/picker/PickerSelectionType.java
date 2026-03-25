package com.okinc.im.imui.picker;

import com.okinc.im.imui.picker.PickerSelectionType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class PickerSelectionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PickerSelectionType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final PickerSelectionType PHOTO = new PickerSelectionType("PHOTO", 0);
    public static final PickerSelectionType VIDEO = new PickerSelectionType("VIDEO", 1);
    public static final PickerSelectionType ALL = new PickerSelectionType("ALL", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PickerSelectionType[] $values() {
        return new PickerSelectionType[]{PHOTO, VIDEO, ALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PickerSelectionType> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.picker.PickerSelectionType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) PickerSelectionType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PickerSelectionType> serializer() {
            return KWHzl();
        }
    }

    private PickerSelectionType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.im.imui.picker.PickerSelectionType", values());
    }

    static {
        PickerSelectionType[] pickerSelectionTypeArr$values = $values();
        $VALUES = pickerSelectionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pickerSelectionTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ooW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PickerSelectionType._init_$_anonymous_();
            }
        });
    }

    public static PickerSelectionType valueOf(String str) {
        return (PickerSelectionType) Enum.valueOf(PickerSelectionType.class, str);
    }

    public static PickerSelectionType[] values() {
        return (PickerSelectionType[]) $VALUES.clone();
    }
}
