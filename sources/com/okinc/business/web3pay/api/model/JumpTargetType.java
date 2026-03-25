package com.okinc.business.web3pay.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class JumpTargetType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ JumpTargetType[] $VALUES;
    public static final ActionBar Companion;
    private final int value;
    public static final JumpTargetType PayContactsPage = new JumpTargetType("PayContactsPage", 0, 1);
    public static final JumpTargetType PayTransferPage = new JumpTargetType("PayTransferPage", 1, 2);
    public static final JumpTargetType PaySelectCoinPage = new JumpTargetType("PaySelectCoinPage", 2, 3);
    public static final JumpTargetType PayOnChainDepositPage = new JumpTargetType("PayOnChainDepositPage", 3, 4);
    public static final JumpTargetType PayTransactionDetailPage = new JumpTargetType("PayTransactionDetailPage", 4, 5);
    public static final JumpTargetType PayReceiveBottomSheetPage = new JumpTargetType("PayReceiveBottomSheetPage", 5, 6);
    public static final JumpTargetType ActivatePayAccount = new JumpTargetType("ActivatePayAccount", 6, 7);
    public static final JumpTargetType OffshoreHandlePayFlow = new JumpTargetType("OffshoreHandlePayFlow", 7, 8);
    public static final JumpTargetType OffshoreAddFunds = new JumpTargetType("OffshoreAddFunds", 8, 9);
    public static final JumpTargetType OffshoreConvertToPay = new JumpTargetType("OffshoreConvertToPay", 9, 10);
    public static final JumpTargetType OffshorePayTab = new JumpTargetType("OffshorePayTab", 10, 11);
    public static final JumpTargetType GuideWithdraw = new JumpTargetType("GuideWithdraw", 11, 12);
    public static final JumpTargetType SimplePayCardPage = new JumpTargetType("SimplePayCardPage", 12, 13);
    public static final JumpTargetType RewardsHome = new JumpTargetType("RewardsHome", 13, 14);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ JumpTargetType[] $values() {
        return new JumpTargetType[]{PayContactsPage, PayTransferPage, PaySelectCoinPage, PayOnChainDepositPage, PayTransactionDetailPage, PayReceiveBottomSheetPage, ActivatePayAccount, OffshoreHandlePayFlow, OffshoreAddFunds, OffshoreConvertToPay, OffshorePayTab, GuideWithdraw, SimplePayCardPage, RewardsHome};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<JumpTargetType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private JumpTargetType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        JumpTargetType[] jumpTargetTypeArr$values = $values();
        $VALUES = jumpTargetTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(jumpTargetTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.JumpTargetType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static JumpTargetType valueOf(String str) {
        return (JumpTargetType) Enum.valueOf(JumpTargetType.class, str);
    }

    public static JumpTargetType[] values() {
        return (JumpTargetType[]) $VALUES.clone();
    }
}
