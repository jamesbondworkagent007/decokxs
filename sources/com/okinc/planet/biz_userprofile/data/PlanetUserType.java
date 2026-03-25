package com.okinc.planet.biz_userprofile.data;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.planet.biz_userprofile.data.PlanetUserType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetUserType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetUserType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;

    @SerialName("1")
    public static final PlanetUserType OKUser = new PlanetUserType("OKUser", 0, "1");

    @SerialName("2")
    public static final PlanetUserType TwitterUser = new PlanetUserType("TwitterUser", 1, "2");

    @SerialName("3")
    public static final PlanetUserType NewsUser = new PlanetUserType("NewsUser", 2, "3");

    @SerialName("4")
    public static final PlanetUserType TwitterAndNewsUser = new PlanetUserType("TwitterAndNewsUser", 3, "4");

    @SerialName("5")
    public static final PlanetUserType OKAndTwitterUser = new PlanetUserType("OKAndTwitterUser", 4, "5");

    @SerialName(OrderDetailListItem.SLIP_OUT)
    public static final PlanetUserType OKAndTwitterUserCompat = new PlanetUserType("OKAndTwitterUserCompat", 5, OrderDetailListItem.SLIP_OUT);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetUserType[] $values() {
        return new PlanetUserType[]{OKUser, TwitterUser, NewsUser, TwitterAndNewsUser, OKAndTwitterUser, OKAndTwitterUserCompat};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetUserType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PlanetUserType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PlanetUserType[] planetUserTypeArr$values = $values();
        $VALUES = planetUserTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetUserTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tLe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PlanetUserType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetUserType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) PlanetUserType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PlanetUserType> serializer() {
            return KWHzl();
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [35=6] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final PlanetUserType EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        return PlanetUserType.OKUser;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return PlanetUserType.TwitterUser;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return PlanetUserType.NewsUser;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        return PlanetUserType.TwitterAndNewsUser;
                    }
                    break;
                case 53:
                    if (str.equals("5")) {
                        return PlanetUserType.OKAndTwitterUser;
                    }
                    break;
                case 54:
                    if (str.equals(OrderDetailListItem.SLIP_OUT)) {
                        return PlanetUserType.OKAndTwitterUserCompat;
                    }
                    break;
            }
            return PlanetUserType.OKUser;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.planet.biz_userprofile.data.PlanetUserType", values(), new String[]{"1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT}, new Annotation[][]{null, null, null, null, null, null}, null);
    }

    public static PlanetUserType valueOf(String str) {
        return (PlanetUserType) Enum.valueOf(PlanetUserType.class, str);
    }

    public static PlanetUserType[] values() {
        return (PlanetUserType[]) $VALUES.clone();
    }
}
