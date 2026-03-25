package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.okex.lite.home.bean.Style;
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
/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class Style {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Style[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerializedName("0")
    @SerialName("0")
    public static final Style NEUTRAL = new Style("NEUTRAL", 0);

    @SerializedName("1")
    @SerialName("1")
    public static final Style FAILED = new Style(CardSyncResponse.FAILED, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Style[] $values() {
        return new Style[]{NEUTRAL, FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Style> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.Style.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) Style.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Style> serializer() {
            return copydefault();
        }
    }

    private Style(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okex.lite.home.bean.Style", values(), new String[]{"0", "1"}, new Annotation[][]{null, null}, null);
    }

    static {
        Style[] styleArr$values = $values();
        $VALUES = styleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(styleArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.svV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return Style._init_$_anonymous_();
            }
        });
    }

    public static Style valueOf(String str) {
        return (Style) Enum.valueOf(Style.class, str);
    }

    public static Style[] values() {
        return (Style[]) $VALUES.clone();
    }
}
