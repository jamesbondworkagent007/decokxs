package com.okinc.okex.campaign.bean;

import com.okinc.okex.campaign.bean.RedirectType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44765sdB;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Serializable(with = C44765sdB.class)
public final class RedirectType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RedirectType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final RedirectType TASK = new RedirectType("TASK", 0);
    public static final RedirectType LEADERBOARD = new RedirectType("LEADERBOARD", 1);
    public static final RedirectType REWARD_RULES = new RedirectType("REWARD_RULES", 2);
    public static final RedirectType CAMPAIGN_TC = new RedirectType("CAMPAIGN_TC", 3);
    public static final RedirectType UNKNOWN = new RedirectType("UNKNOWN", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RedirectType[] $values() {
        return new RedirectType[]{TASK, LEADERBOARD, REWARD_RULES, CAMPAIGN_TC, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RedirectType> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.campaign.bean.RedirectType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) RedirectType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RedirectType> serializer() {
            return copydefault();
        }
    }

    private RedirectType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44765sdB();
    }

    static {
        RedirectType[] redirectTypeArr$values = $values();
        $VALUES = redirectTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(redirectTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sdD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RedirectType._init_$_anonymous_();
            }
        });
    }

    public static RedirectType valueOf(String str) {
        return (RedirectType) Enum.valueOf(RedirectType.class, str);
    }

    public static RedirectType[] values() {
        return (RedirectType[]) $VALUES.clone();
    }
}
