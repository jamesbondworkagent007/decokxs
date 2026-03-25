package com.okinc.business.invest_biz.data.bean;

import com.google.android.gms.stats.CodePackage;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
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
public final class InvestUserRewardsAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InvestUserRewardsAction[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final InvestUserRewardsAction COMMON = new InvestUserRewardsAction(CodePackage.COMMON, 0);

    @SerialName("0")
    public static final InvestUserRewardsAction STOKT = new InvestUserRewardsAction("STOKT", 1);

    @SerialName("1")
    public static final InvestUserRewardsAction LSD = new InvestUserRewardsAction(InvestCustomRedirectData.LOCATION_LSD, 2);

    @SerialName("2")
    public static final InvestUserRewardsAction MERKL_BONUS = new InvestUserRewardsAction("MERKL_BONUS", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InvestUserRewardsAction[] $values() {
        return new InvestUserRewardsAction[]{COMMON, STOKT, LSD, MERKL_BONUS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InvestUserRewardsAction> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) InvestUserRewardsAction.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InvestUserRewardsAction> serializer() {
            return KWHzl();
        }
    }

    private InvestUserRewardsAction(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction", values(), new String[]{null, "0", "1", "2"}, new Annotation[][]{null, null, null, null}, null);
    }

    static {
        InvestUserRewardsAction[] investUserRewardsActionArr$values = $values();
        $VALUES = investUserRewardsActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(investUserRewardsActionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestUserRewardsAction._init_$_anonymous_();
            }
        });
    }

    public static InvestUserRewardsAction valueOf(String str) {
        return (InvestUserRewardsAction) Enum.valueOf(InvestUserRewardsAction.class, str);
    }

    public static InvestUserRewardsAction[] values() {
        return (InvestUserRewardsAction[]) $VALUES.clone();
    }
}
