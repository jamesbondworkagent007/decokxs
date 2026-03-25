package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle;
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
/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class DialogStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DialogStyle[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;

    @SerialName("bottom")
    public static final DialogStyle BOTTOM = new DialogStyle(InvestPopUpData.POSITION_BOTTOM, 0);

    @SerialName(TtmlNode.CENTER)
    public static final DialogStyle CENTER = new DialogStyle("CENTER", 1);
    public static final Companion Companion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DialogStyle[] $values() {
        return new DialogStyle[]{BOTTOM, CENTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DialogStyle> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) DialogStyle.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<DialogStyle> serializer() {
            return copydefault();
        }
    }

    private DialogStyle(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle", values(), new String[]{"bottom", TtmlNode.CENTER}, new Annotation[][]{null, null}, null);
    }

    static {
        DialogStyle[] dialogStyleArr$values = $values();
        $VALUES = dialogStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dialogStyleArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ruZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DialogStyle._init_$_anonymous_();
            }
        });
    }

    public static DialogStyle valueOf(String str) {
        return (DialogStyle) Enum.valueOf(DialogStyle.class, str);
    }

    public static DialogStyle[] values() {
        return (DialogStyle[]) $VALUES.clone();
    }
}
