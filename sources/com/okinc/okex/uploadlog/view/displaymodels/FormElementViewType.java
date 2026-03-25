package com.okinc.okex.uploadlog.view.displaymodels;

import com.okinc.okex.uploadlog.bean.enums.FormValueType;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56403yEb;
import o.C56423yEv;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class FormElementViewType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FormElementViewType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static final Map<FormValueType, FormElementViewType> lookupMap;
    private final FormValueType apiValueType;
    public static final FormElementViewType Date = new FormElementViewType("Date", 0, FormValueType.Date);
    public static final FormElementViewType Dropdown = new FormElementViewType("Dropdown", 1, FormValueType.Dropdown);
    public static final FormElementViewType MultiLine = new FormElementViewType("MultiLine", 2, FormValueType.MultiLine);
    public static final FormElementViewType Attachment = new FormElementViewType("Attachment", 3, FormValueType.Attachment);
    public static final FormElementViewType Checkbox = new FormElementViewType("Checkbox", 4, FormValueType.Checkbox);
    public static final FormElementViewType Hidden = new FormElementViewType("Hidden", 5, FormValueType.Hidden);
    public static final FormElementViewType AttachedFile = new FormElementViewType("AttachedFile", 6, null, 1, null);
    public static final FormElementViewType SubmitBtn = new FormElementViewType("SubmitBtn", 7, null, 1, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FormElementViewType[] $values() {
        return new FormElementViewType[]{Date, Dropdown, MultiLine, Attachment, Checkbox, Hidden, AttachedFile, SubmitBtn};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FormElementViewType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormValueType getApiValueType() {
        return this.apiValueType;
    }

    private FormElementViewType(String str, int i, FormValueType formValueType) {
        this.apiValueType = formValueType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (wrap:com.okinc.okex.uploadlog.bean.enums.FormValueType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.uploadlog.bean.enums.FormValueType) : (r3v0 com.okinc.okex.uploadlog.bean.enums.FormValueType))
 A[MD:(java.lang.String, int, com.okinc.okex.uploadlog.bean.enums.FormValueType):void (m)] (LINE:7) call: com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType.<init>(java.lang.String, int, com.okinc.okex.uploadlog.bean.enums.FormValueType):void type: THIS */
    public /* synthetic */ FormElementViewType(String str, int i, FormValueType formValueType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? null : formValueType);
    }

    static {
        FormElementViewType[] formElementViewTypeArr$values = $values();
        $VALUES = formElementViewTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(formElementViewTypeArr$values);
        Companion = new Companion(null);
        FormElementViewType[] formElementViewTypeArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (FormElementViewType formElementViewType : formElementViewTypeArrValues) {
            if (formElementViewType.apiValueType != null) {
                arrayList.add(formElementViewType);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(((FormElementViewType) obj).apiValueType, obj);
        }
        lookupMap = linkedHashMap;
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FormElementViewType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) FormElementViewType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<FormElementViewType> serializer() {
            return OLrzqt();
        }

        public final FormElementViewType KWHzl(@NotNull FormValueType formValueType) {
            Intrinsics.checkNotNullParameter(formValueType, "");
            FormElementViewType formElementViewType = (FormElementViewType) FormElementViewType.lookupMap.get(formValueType);
            return formElementViewType == null ? FormElementViewType.Hidden : formElementViewType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType", values());
    }

    public static FormElementViewType valueOf(String str) {
        return (FormElementViewType) Enum.valueOf(FormElementViewType.class, str);
    }

    public static FormElementViewType[] values() {
        return (FormElementViewType[]) $VALUES.clone();
    }
}
