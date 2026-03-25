package com.okinc.social_trade_api.data;

import com.okinc.social_trade_api.data.BannerLayoutType;
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
public final class BannerLayoutType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BannerLayoutType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("1")
    public static final BannerLayoutType Normal = new BannerLayoutType("Normal", 0);

    @SerialName("2")
    public static final BannerLayoutType Large = new BannerLayoutType("Large", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BannerLayoutType[] $values() {
        return new BannerLayoutType[]{Normal, Large};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BannerLayoutType> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.BannerLayoutType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) BannerLayoutType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BannerLayoutType> serializer() {
            return copydefault();
        }
    }

    private BannerLayoutType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.social_trade_api.data.BannerLayoutType", values(), new String[]{"1", "2"}, new Annotation[][]{null, null}, null);
    }

    static {
        BannerLayoutType[] bannerLayoutTypeArr$values = $values();
        $VALUES = bannerLayoutTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bannerLayoutTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.umQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BannerLayoutType._init_$_anonymous_();
            }
        });
    }

    public static BannerLayoutType valueOf(String str) {
        return (BannerLayoutType) Enum.valueOf(BannerLayoutType.class, str);
    }

    public static BannerLayoutType[] values() {
        return (BannerLayoutType[]) $VALUES.clone();
    }
}
