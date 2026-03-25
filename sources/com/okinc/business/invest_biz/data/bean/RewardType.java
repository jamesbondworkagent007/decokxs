package com.okinc.business.invest_biz.data.bean;

import com.google.android.gms.stats.CodePackage;
import com.okinc.business.invest_biz.data.bean.RewardType;
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
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class RewardType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RewardType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("1")
    public static final RewardType COMMON = new RewardType(CodePackage.COMMON, 0);

    @SerialName("2")
    public static final RewardType AVAILABLE_REWARD = new RewardType("AVAILABLE_REWARD", 1);

    @SerialName("3")
    public static final RewardType AIRDROP = new RewardType("AIRDROP", 2);

    @SerialName("4")
    public static final RewardType OKX_BONUS = new RewardType("OKX_BONUS", 3);

    @SerialName("5")
    public static final RewardType MERKL_BONUS = new RewardType("MERKL_BONUS", 4);

    @SerialName("7")
    public static final RewardType MARKET = new RewardType("MARKET", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RewardType[] $values() {
        return new RewardType[]{COMMON, AVAILABLE_REWARD, AIRDROP, OKX_BONUS, MERKL_BONUS, MARKET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RewardType> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.RewardType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) RewardType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RewardType> serializer() {
            return copydefault();
        }
    }

    private RewardType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.bean.RewardType", values(), new String[]{"1", "2", "3", "4", "5", "7"}, new Annotation[][]{null, null, null, null, null, null}, null);
    }

    static {
        RewardType[] rewardTypeArr$values = $values();
        $VALUES = rewardTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(rewardTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iym
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RewardType._init_$_anonymous_();
            }
        });
    }

    public static RewardType valueOf(String str) {
        return (RewardType) Enum.valueOf(RewardType.class, str);
    }

    public static RewardType[] values() {
        return (RewardType[]) $VALUES.clone();
    }
}
