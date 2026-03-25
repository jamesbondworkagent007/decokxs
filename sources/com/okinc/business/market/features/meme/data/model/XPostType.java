package com.okinc.business.market.features.meme.data.model;

import com.bytedance.applog.log.LogUtils;
import com.okinc.business.market.features.meme.data.model.XPostType;
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
/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class XPostType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ XPostType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;

    @SerialName("1")
    public static final XPostType PROFILE = new XPostType(LogUtils.EVENT_TYPE_PROFILE, 0, "1");

    @SerialName("2")
    public static final XPostType POST = new XPostType("POST", 1, "2");

    @SerialName("3")
    public static final XPostType COMMUNITY = new XPostType("COMMUNITY", 2, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ XPostType[] $values() {
        return new XPostType[]{PROFILE, POST, COMMUNITY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<XPostType> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.XPostType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) XPostType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<XPostType> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.features.meme.data.model.XPostType", values(), new String[]{"1", "2", "3"}, new Annotation[][]{null, null, null}, null);
    }

    private XPostType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        XPostType[] xPostTypeArr$values = $values();
        $VALUES = xPostTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(xPostTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.keI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return XPostType._init_$_anonymous_();
            }
        });
    }

    public static XPostType valueOf(String str) {
        return (XPostType) Enum.valueOf(XPostType.class, str);
    }

    public static XPostType[] values() {
        return (XPostType[]) $VALUES.clone();
    }
}
