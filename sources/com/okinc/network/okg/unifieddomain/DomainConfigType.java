package com.okinc.network.okg.unifieddomain;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class DomainConfigType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DomainConfigType[] $VALUES;
    public static final StateListAnimator Companion;
    private final String fallbackDomain;
    private final String fallbackHeaderName;
    private final String typeName;
    public static final DomainConfigType CDN = new DomainConfigType("CDN", 0, "MOBILE_CDN", "https://static.coinall.ltd", "x-cdn");
    public static final DomainConfigType OSS = new DomainConfigType("OSS", 1, "MOBILE_OSS", "https://okg-pub-hk.oss-cn-hongkong.aliyuncs.com", null);

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DomainConfigType.values().length];
            try {
                iArr[DomainConfigType.CDN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DomainConfigType.OSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DomainConfigType[] $values() {
        return new DomainConfigType[]{CDN, OSS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DomainConfigType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFallbackDomain() {
        return this.fallbackDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFallbackHeaderName() {
        return this.fallbackHeaderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeName() {
        return this.typeName;
    }

    private DomainConfigType(String str, int i, String str2, String str3, String str4) {
        this.typeName = str2;
        this.fallbackDomain = str3;
        this.fallbackHeaderName = str4;
    }

    static {
        DomainConfigType[] domainConfigTypeArr$values = $values();
        $VALUES = domainConfigTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(domainConfigTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.unifieddomain.DomainConfigType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final DomainConfigType KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            for (DomainConfigType domainConfigType : DomainConfigType.values()) {
                if (Intrinsics.EZpvd((Object) domainConfigType.getTypeName(), (Object) str)) {
                    return domainConfigType;
                }
            }
            return null;
        }
    }

    public final DomainType toDomainType() {
        int i = ActionBar.copydefault[ordinal()];
        if (i == 1) {
            return DomainType.CDN;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return DomainType.OSS;
    }

    public static DomainConfigType valueOf(String str) {
        return (DomainConfigType) Enum.valueOf(DomainConfigType.class, str);
    }

    public static DomainConfigType[] values() {
        return (DomainConfigType[]) $VALUES.clone();
    }
}
