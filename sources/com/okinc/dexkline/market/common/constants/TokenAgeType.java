package com.okinc.dexkline.market.common.constants;

import com.okinc.dexkline.market.common.constants.TokenAgeType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C35964oKf;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class TokenAgeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenAgeType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("0")
    public static final TokenAgeType DEFAULT = new TokenAgeType("DEFAULT", 0, 0);

    @SerialName("1")
    public static final TokenAgeType MINUTE = new TokenAgeType("MINUTE", 1, 1);

    @SerialName("2")
    public static final TokenAgeType HOUR = new TokenAgeType("HOUR", 2, 2);

    @SerialName("3")
    public static final TokenAgeType DAY = new TokenAgeType("DAY", 3, 3);

    @SerialName("4")
    public static final TokenAgeType MONTH = new TokenAgeType("MONTH", 4, 4);

    @SerialName("5")
    public static final TokenAgeType YEAR = new TokenAgeType("YEAR", 5, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenAgeType[] $values() {
        return new TokenAgeType[]{DEFAULT, MINUTE, HOUR, DAY, MONTH, YEAR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenAgeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TokenAgeType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TokenAgeType[] tokenAgeTypeArr$values = $values();
        $VALUES = tokenAgeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenAgeTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mVd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TokenAgeType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {

        /* JADX INFO: loaded from: classes15.dex */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TokenAgeType.values().length];
                try {
                    iArr[TokenAgeType.YEAR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TokenAgeType.MONTH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TokenAgeType.DAY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TokenAgeType.HOUR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TokenAgeType.MINUTE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TokenAgeType.DEFAULT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.common.constants.TokenAgeType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) TokenAgeType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TokenAgeType> serializer() {
            return AEQbTJ();
        }

        public final int EZpvd(@NotNull TokenAgeType tokenAgeType) {
            Intrinsics.checkNotNullParameter(tokenAgeType, "");
            switch (TaskDescription.AEQbTJ[tokenAgeType.ordinal()]) {
                case 1:
                    return C35964oKf.Fragment.QVAiDq;
                case 2:
                    return C35964oKf.Fragment.DTwDnp;
                case 3:
                    return C35964oKf.Fragment.QKVWgx;
                case 4:
                    return C35964oKf.Fragment.ORxRYg;
                case 5:
                    return C35964oKf.Fragment.QOLQEE;
                case 6:
                    return C35964oKf.Fragment.OcIXYQ;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.dexkline.market.common.constants.TokenAgeType", values(), new String[]{"0", "1", "2", "3", "4", "5"}, new Annotation[][]{null, null, null, null, null, null}, null);
    }

    public static TokenAgeType valueOf(String str) {
        return (TokenAgeType) Enum.valueOf(TokenAgeType.class, str);
    }

    public static TokenAgeType[] values() {
        return (TokenAgeType[]) $VALUES.clone();
    }
}
