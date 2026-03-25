package com.okinc.social_trade_api.data;

import com.okinc.social_trade_api.data.BannerLinkType;
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
/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class BannerLinkType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BannerLinkType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String code;

    @SerialName("1")
    public static final BannerLinkType Internal = new BannerLinkType("Internal", 0, "1");

    @SerialName("2")
    public static final BannerLinkType External = new BannerLinkType("External", 1, "2");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BannerLinkType[] $values() {
        return new BannerLinkType[]{Internal, External};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BannerLinkType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.BannerLinkType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) BannerLinkType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BannerLinkType> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.social_trade_api.data.BannerLinkType", values(), new String[]{"1", "2"}, new Annotation[][]{null, null}, null);
    }

    private BannerLinkType(String str, int i, String str2) {
        this.code = str2;
    }

    static {
        BannerLinkType[] bannerLinkTypeArr$values = $values();
        $VALUES = bannerLinkTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bannerLinkTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.umR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BannerLinkType._init_$_anonymous_();
            }
        });
    }

    public static BannerLinkType valueOf(String str) {
        return (BannerLinkType) Enum.valueOf(BannerLinkType.class, str);
    }

    public static BannerLinkType[] values() {
        return (BannerLinkType[]) $VALUES.clone();
    }
}
