package com.okinc.okex.uploadlog.bean.enums;

import com.okinc.okex.uploadlog.bean.enums.FormValueType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44067sCc;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44067sCc.class)
public final class FormValueType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FormValueType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;
    public static final FormValueType Date = new FormValueType("Date", 0, "DATE");
    public static final FormValueType Dropdown = new FormValueType("Dropdown", 1, "DROPDOWN");
    public static final FormValueType MultiLine = new FormValueType("MultiLine", 2, "MULTI_LINE");
    public static final FormValueType Attachment = new FormValueType("Attachment", 3, "ATTACHMENT");
    public static final FormValueType Checkbox = new FormValueType("Checkbox", 4, "CHECKBOX");
    public static final FormValueType Hidden = new FormValueType("Hidden", 5, "_HIDDEN_");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FormValueType[] $values() {
        return new FormValueType[]{Date, Dropdown, MultiLine, Attachment, Checkbox, Hidden};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FormValueType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.enums.FormValueType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) FormValueType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<FormValueType> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44067sCc();
    }

    private FormValueType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        FormValueType[] formValueTypeArr$values = $values();
        $VALUES = formValueTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(formValueTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sCe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FormValueType._init_$_anonymous_();
            }
        });
    }

    public static FormValueType valueOf(String str) {
        return (FormValueType) Enum.valueOf(FormValueType.class, str);
    }

    public static FormValueType[] values() {
        return (FormValueType[]) $VALUES.clone();
    }
}
