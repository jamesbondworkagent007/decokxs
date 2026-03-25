package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
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
public final class ButtonStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ButtonStyle[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("primary")
    public static final ButtonStyle Primary = new ButtonStyle("Primary", 0);

    @SerialName("secondary")
    public static final ButtonStyle Secondary = new ButtonStyle("Secondary", 1);

    @SerialName("tertiary")
    public static final ButtonStyle Tertiary = new ButtonStyle("Tertiary", 2);

    @SerialName("text")
    public static final ButtonStyle Text = new ButtonStyle("Text", 3);

    @SerialName(TtmlNode.TAG_IMAGE)
    public static final ButtonStyle Image = new ButtonStyle(UDImageInfo.LUA_CLASS_NAME, 4);

    @SerialName("neutral")
    public static final ButtonStyle Neutral = new ButtonStyle("Neutral", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ButtonStyle[] $values() {
        return new ButtonStyle[]{Primary, Secondary, Tertiary, Text, Image, Neutral};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ButtonStyle> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) ButtonStyle.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ButtonStyle> serializer() {
            return EZpvd();
        }
    }

    private ButtonStyle(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle", values(), new String[]{"primary", "secondary", "tertiary", "text", TtmlNode.TAG_IMAGE, "neutral"}, new Annotation[][]{null, null, null, null, null, null}, null);
    }

    static {
        ButtonStyle[] buttonStyleArr$values = $values();
        $VALUES = buttonStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buttonStyleArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ruT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ButtonStyle._init_$_anonymous_();
            }
        });
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) $VALUES.clone();
    }
}
