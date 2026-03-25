package com.okinc.social_trade_api.data;

import com.okinc.social_trade_api.data.BannerDisplayPlace;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
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
public final class BannerDisplayPlace {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BannerDisplayPlace[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String code;
    public static final BannerDisplayPlace NMP = new BannerDisplayPlace("NMP", 0, "nmp");
    public static final BannerDisplayPlace BOT = new BannerDisplayPlace("BOT", 1, "bot");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BannerDisplayPlace[] $values() {
        return new BannerDisplayPlace[]{NMP, BOT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BannerDisplayPlace> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.BannerDisplayPlace.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) BannerDisplayPlace.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<BannerDisplayPlace> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.social_trade_api.data.BannerDisplayPlace", values());
    }

    private BannerDisplayPlace(String str, int i, String str2) {
        this.code = str2;
    }

    static {
        BannerDisplayPlace[] bannerDisplayPlaceArr$values = $values();
        $VALUES = bannerDisplayPlaceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bannerDisplayPlaceArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.umM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BannerDisplayPlace._init_$_anonymous_();
            }
        });
    }

    public static BannerDisplayPlace valueOf(String str) {
        return (BannerDisplayPlace) Enum.valueOf(BannerDisplayPlace.class, str);
    }

    public static BannerDisplayPlace[] values() {
        return (BannerDisplayPlace[]) $VALUES.clone();
    }
}
