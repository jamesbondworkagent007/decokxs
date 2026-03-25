package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import com.okinc.okex.lite.home.bean.AnchorVersion;
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
public final class AnchorVersion {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AnchorVersion[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;

    @SerializedName("anchorDataV1")
    @SerialName("anchorDataV1")
    public static final AnchorVersion ANCHOR_DATA_V1 = new AnchorVersion("ANCHOR_DATA_V1", 0);

    @SerializedName("anchorDataV2")
    @SerialName("anchorDataV2")
    public static final AnchorVersion ANCHOR_DATA_V2 = new AnchorVersion("ANCHOR_DATA_V2", 1);
    public static final Companion Companion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AnchorVersion[] $values() {
        return new AnchorVersion[]{ANCHOR_DATA_V1, ANCHOR_DATA_V2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AnchorVersion> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.AnchorVersion.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) AnchorVersion.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AnchorVersion> serializer() {
            return copydefault();
        }
    }

    private AnchorVersion(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okex.lite.home.bean.AnchorVersion", values(), new String[]{"anchorDataV1", "anchorDataV2"}, new Annotation[][]{null, null}, null);
    }

    static {
        AnchorVersion[] anchorVersionArr$values = $values();
        $VALUES = anchorVersionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(anchorVersionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.svQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AnchorVersion._init_$_anonymous_();
            }
        });
    }

    public static AnchorVersion valueOf(String str) {
        return (AnchorVersion) Enum.valueOf(AnchorVersion.class, str);
    }

    public static AnchorVersion[] values() {
        return (AnchorVersion[]) $VALUES.clone();
    }
}
