package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import com.okinc.okex.lite.home.bean.StepStyle;
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
public final class StepStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StepStyle[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerializedName("0")
    @SerialName("0")
    public static final StepStyle NEXT = new StepStyle("NEXT", 0);

    @SerializedName("1")
    @SerialName("1")
    public static final StepStyle UPCOMING = new StepStyle("UPCOMING", 1);

    @SerializedName("2")
    @SerialName("2")
    public static final StepStyle DONE = new StepStyle("DONE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StepStyle[] $values() {
        return new StepStyle[]{NEXT, UPCOMING, DONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StepStyle> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.StepStyle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) StepStyle.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<StepStyle> serializer() {
            return EZpvd();
        }
    }

    private StepStyle(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okex.lite.home.bean.StepStyle", values(), new String[]{"0", "1", "2"}, new Annotation[][]{null, null, null}, null);
    }

    static {
        StepStyle[] stepStyleArr$values = $values();
        $VALUES = stepStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(stepStyleArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.svT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StepStyle._init_$_anonymous_();
            }
        });
    }

    public static StepStyle valueOf(String str) {
        return (StepStyle) Enum.valueOf(StepStyle.class, str);
    }

    public static StepStyle[] values() {
        return (StepStyle[]) $VALUES.clone();
    }
}
