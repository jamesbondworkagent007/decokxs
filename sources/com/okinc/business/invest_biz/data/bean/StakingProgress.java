package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.bean.StakingProgress;
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
public final class StakingProgress {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StakingProgress[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("0")
    public static final StakingProgress NO_STAKING = new StakingProgress("NO_STAKING", 0);

    @SerialName("1")
    public static final StakingProgress STAKING_IN_PROGRESS = new StakingProgress("STAKING_IN_PROGRESS", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StakingProgress[] $values() {
        return new StakingProgress[]{NO_STAKING, STAKING_IN_PROGRESS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StakingProgress> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.StakingProgress.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) StakingProgress.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<StakingProgress> serializer() {
            return copydefault();
        }
    }

    private StakingProgress(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.bean.StakingProgress", values(), new String[]{"0", "1"}, new Annotation[][]{null, null}, null);
    }

    static {
        StakingProgress[] stakingProgressArr$values = $values();
        $VALUES = stakingProgressArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(stakingProgressArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return StakingProgress._init_$_anonymous_();
            }
        });
    }

    public static StakingProgress valueOf(String str) {
        return (StakingProgress) Enum.valueOf(StakingProgress.class, str);
    }

    public static StakingProgress[] values() {
        return (StakingProgress[]) $VALUES.clone();
    }
}
