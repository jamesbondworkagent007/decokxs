package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import com.okinc.okex.lite.home.bean.DescriptionTemplateStyle;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class DescriptionTemplateStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DescriptionTemplateStyle[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerializedName("NORMAL_TEXT")
    @SerialName("NORMAL_TEXT")
    public static final DescriptionTemplateStyle NORMAL_TEXT = new DescriptionTemplateStyle("NORMAL_TEXT", 0);

    @SerializedName("BOLD_TEXT")
    @SerialName("BOLD_TEXT")
    public static final DescriptionTemplateStyle BOLD_TEXT = new DescriptionTemplateStyle("BOLD_TEXT", 1);

    @SerializedName("LINK")
    @SerialName("LINK")
    public static final DescriptionTemplateStyle LINK = new DescriptionTemplateStyle("LINK", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DescriptionTemplateStyle[] $values() {
        return new DescriptionTemplateStyle[]{NORMAL_TEXT, BOLD_TEXT, LINK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DescriptionTemplateStyle> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.DescriptionTemplateStyle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) DescriptionTemplateStyle.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<DescriptionTemplateStyle> serializer() {
            return AEQbTJ();
        }
    }

    private DescriptionTemplateStyle(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okex.lite.home.bean.DescriptionTemplateStyle", values(), new String[]{"NORMAL_TEXT", "BOLD_TEXT", "LINK"}, new Annotation[][]{null, null, null}, null);
    }

    static {
        DescriptionTemplateStyle[] descriptionTemplateStyleArr$values = $values();
        $VALUES = descriptionTemplateStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(descriptionTemplateStyleArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.svN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DescriptionTemplateStyle._init_$_anonymous_();
            }
        });
    }

    public static DescriptionTemplateStyle valueOf(String str) {
        return (DescriptionTemplateStyle) Enum.valueOf(DescriptionTemplateStyle.class, str);
    }

    public static DescriptionTemplateStyle[] values() {
        return (DescriptionTemplateStyle[]) $VALUES.clone();
    }
}
