package com.okinc.business.invest_biz.data.contants;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.business.invest_biz.data.contants.InvestAction;
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
public final class InvestAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InvestAction[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName(MultiTransferSignData.DEFAULT_INTERVAL)
    public static final InvestAction Unknown = new InvestAction("Unknown", 0, -1);

    @SerialName("0")
    public static final InvestAction Subscription = new InvestAction("Subscription", 1, 0);

    @SerialName("1")
    public static final InvestAction Redeem = new InvestAction("Redeem", 2, 1);

    @SerialName("2")
    public static final InvestAction Claim = new InvestAction("Claim", 3, 2);

    @SerialName("3")
    public static final InvestAction SubscriptionApprove = new InvestAction("SubscriptionApprove", 4, 3);

    @SerialName("4")
    public static final InvestAction RedeemApprove = new InvestAction("RedeemApprove", 5, 4);

    @SerialName("5")
    public static final InvestAction ClaimApprove = new InvestAction("ClaimApprove", 6, 5);

    @SerialName(OrderDetailListItem.SLIP_OUT)
    public static final InvestAction Bonus = new InvestAction("Bonus", 7, 6);

    @SerialName("7")
    public static final InvestAction Deploy = new InvestAction("Deploy", 8, 7);

    @SerialName("8")
    public static final InvestAction StartFarming = new InvestAction("StartFarming", 9, 8);

    @SerialName("9")
    public static final InvestAction EndFarming = new InvestAction("EndFarming", 10, 9);

    @SerialName("10")
    public static final InvestAction Mint = new InvestAction("Mint", 11, 10);

    @SerialName("11")
    public static final InvestAction Repay = new InvestAction("Repay", 12, 11);

    @SerialName("12")
    public static final InvestAction MintApprove = new InvestAction("MintApprove", 13, 12);

    @SerialName("13")
    public static final InvestAction RepayApprove = new InvestAction("RepayApprove", 14, 13);

    @SerialName("15")
    public static final InvestAction BabylonUnbond = new InvestAction("BabylonUnbond", 15, 15);

    @SerialName("16")
    public static final InvestAction MerklBonus = new InvestAction("MerklBonus", 16, 16);

    @SerialName("17")
    public static final InvestAction Borrow = new InvestAction("Borrow", 17, 17);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InvestAction[] $values() {
        return new InvestAction[]{Unknown, Subscription, Redeem, Claim, SubscriptionApprove, RedeemApprove, ClaimApprove, Bonus, Deploy, StartFarming, EndFarming, Mint, Repay, MintApprove, RepayApprove, BabylonUnbond, MerklBonus, Borrow};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InvestAction> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private InvestAction(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        InvestAction[] investActionArr$values = $values();
        $VALUES = investActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(investActionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestAction._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.contants.InvestAction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) InvestAction.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InvestAction> serializer() {
            return AEQbTJ();
        }

        public final InvestAction copydefault(int i) {
            InvestAction investAction;
            InvestAction[] investActionArrValues = InvestAction.values();
            int length = investActionArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    investAction = null;
                    break;
                }
                investAction = investActionArrValues[i2];
                if (investAction.getValue() == i) {
                    break;
                }
                i2++;
            }
            return investAction == null ? InvestAction.Unknown : investAction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.contants.InvestAction", values(), new String[]{MultiTransferSignData.DEFAULT_INTERVAL, "0", "1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "7", "8", "9", "10", "11", "12", "13", "15", "16", "17"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
    }

    public static InvestAction valueOf(String str) {
        return (InvestAction) Enum.valueOf(InvestAction.class, str);
    }

    public static InvestAction[] values() {
        return (InvestAction[]) $VALUES.clone();
    }
}
