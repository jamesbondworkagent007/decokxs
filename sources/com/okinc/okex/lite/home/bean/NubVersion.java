package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import com.okinc.okex.lite.home.bean.NubVersion;
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
public final class NubVersion {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NubVersion[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerializedName("nubDataV1")
    @SerialName("nubDataV1")
    public static final NubVersion NUB_DATA_V1 = new NubVersion("NUB_DATA_V1", 0);

    @SerializedName("nubDataV2")
    @SerialName("nubDataV2")
    public static final NubVersion NUB_DATA_V2 = new NubVersion("NUB_DATA_V2", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NubVersion[] $values() {
        return new NubVersion[]{NUB_DATA_V1, NUB_DATA_V2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NubVersion> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NubVersion.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) NubVersion.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<NubVersion> serializer() {
            return OLrzqt();
        }
    }

    private NubVersion(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okex.lite.home.bean.NubVersion", values(), new String[]{"nubDataV1", "nubDataV2"}, new Annotation[][]{null, null}, null);
    }

    static {
        NubVersion[] nubVersionArr$values = $values();
        $VALUES = nubVersionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(nubVersionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.svP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return NubVersion._init_$_anonymous_();
            }
        });
    }

    public static NubVersion valueOf(String str) {
        return (NubVersion) Enum.valueOf(NubVersion.class, str);
    }

    public static NubVersion[] values() {
        return (NubVersion[]) $VALUES.clone();
    }
}
