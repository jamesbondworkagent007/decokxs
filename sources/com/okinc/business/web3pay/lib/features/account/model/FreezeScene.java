package com.okinc.business.web3pay.lib.features.account.model;

import com.okinc.business.web3pay.lib.features.account.model.FreezeScene;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import o.C56444yFp;
import o.C59467zhb;
import o.InterfaceC56445yFq;
import o.yDY;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class FreezeScene {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FreezeScene[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final FreezeScene CREATE_SMART_ACCOUNT = new FreezeScene("CREATE_SMART_ACCOUNT", 0, 1);
    public static final FreezeScene TOP_UP = new FreezeScene("TOP_UP", 1, 2);
    public static final FreezeScene TRANSFER = new FreezeScene("TRANSFER", 2, 3);
    public static final FreezeScene CLAIM = new FreezeScene("CLAIM", 3, 4);
    public static final FreezeScene PAY = new FreezeScene("PAY", 4, 5);
    public static final FreezeScene ON_CHAIN = new FreezeScene("ON_CHAIN", 5, 6);
    public static final FreezeScene RED_PACKET = new FreezeScene("RED_PACKET", 6, 7);
    public static final FreezeScene CONVERT = new FreezeScene("CONVERT", 7, 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FreezeScene[] $values() {
        return new FreezeScene[]{CREATE_SMART_ACCOUNT, TOP_UP, TRANSFER, CLAIM, PAY, ON_CHAIN, RED_PACKET, CONVERT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FreezeScene> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private FreezeScene(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        FreezeScene[] freezeSceneArr$values = $values();
        $VALUES = freezeSceneArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(freezeSceneArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.account.model.FreezeScene.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final List<FreezeScene> OLrzqt(List<Integer> list) {
            Sequence sequenceQVAiDq;
            Sequence sequenceFetchVPNInfo;
            Sequence sequenceWlaJM;
            List<FreezeScene> listZuBGHE;
            final FreezeScene[] freezeSceneArrValues = FreezeScene.values();
            return (list == null || (sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(list)) == null || (sequenceFetchVPNInfo = C59467zhb.fetchVPNInfo(sequenceQVAiDq, new Function1() { // from class: o.lqy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return FreezeScene.StateListAnimator.KWHzl(freezeSceneArrValues, ((java.lang.Integer) obj).intValue());
                }
            })) == null || (sequenceWlaJM = C59467zhb.wlaJM(sequenceFetchVPNInfo)) == null || (listZuBGHE = C59467zhb.zuBGHE(sequenceWlaJM)) == null) ? yDY.AhwBna() : listZuBGHE;
        }

        public static final FreezeScene KWHzl(FreezeScene[] freezeSceneArr, int i) {
            for (FreezeScene freezeScene : freezeSceneArr) {
                if (freezeScene.getValue() == i) {
                    return freezeScene;
                }
            }
            return null;
        }
    }

    public static FreezeScene valueOf(String str) {
        return (FreezeScene) Enum.valueOf(FreezeScene.class, str);
    }

    public static FreezeScene[] values() {
        return (FreezeScene[]) $VALUES.clone();
    }
}
