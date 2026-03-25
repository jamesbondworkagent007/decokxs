package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.C8195ayE;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class TransactionBizType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionBizType[] $VALUES;
    public static final StateListAnimator Companion;
    private final int labelStringId;
    private final int typeId;
    public static final TransactionBizType BUY = new TransactionBizType("BUY", 0, 1, C8195ayE.ActionBar.AEQbTJ);
    public static final TransactionBizType SELL = new TransactionBizType("SELL", 1, 2, C8195ayE.ActionBar.AkhnZx);
    public static final TransactionBizType RECEIVE = new TransactionBizType("RECEIVE", 2, 3, C8195ayE.ActionBar.valueOf);
    public static final TransactionBizType SEND = new TransactionBizType("SEND", 3, 4, C8195ayE.ActionBar.AhwBna);
    public static final TransactionBizType EARN = new TransactionBizType("EARN", 4, 5, C8195ayE.ActionBar.djBIcL);
    public static final TransactionBizType FIAT_DEPOSIT = new TransactionBizType("FIAT_DEPOSIT", 5, 9, C8195ayE.ActionBar.EZpvd);
    public static final TransactionBizType FIAT_WITHDRAW = new TransactionBizType("FIAT_WITHDRAW", 6, 10, C8195ayE.ActionBar.KWHzl);
    public static final TransactionBizType CONVERT = new TransactionBizType("CONVERT", 7, 6, C8195ayE.ActionBar.copydefault);
    public static final TransactionBizType AIRDROP = new TransactionBizType("AIRDROP", 8, 7, C8195ayE.ActionBar.OLrzqt);
    public static final TransactionBizType PROFIT_SHARE = new TransactionBizType("PROFIT_SHARE", 9, 11, C8195ayE.ActionBar.AYXKKw);
    public static final TransactionBizType SMART_ACCOUNT_TRANSFER = new TransactionBizType("SMART_ACCOUNT_TRANSFER", 10, 12, C8195ayE.ActionBar.isConnected);
    public static final TransactionBizType CRYPTO_GIFT = new TransactionBizType("CRYPTO_GIFT", 11, 13, C8195ayE.ActionBar.gEmmrt);
    public static final TransactionBizType REWARDS = new TransactionBizType("REWARDS", 12, 14, C8195ayE.ActionBar.values);
    public static final TransactionBizType USDG_REWARD = new TransactionBizType("USDG_REWARD", 13, 15, C8195ayE.ActionBar.DbNXlk);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionBizType[] $values() {
        return new TransactionBizType[]{BUY, SELL, RECEIVE, SEND, EARN, FIAT_DEPOSIT, FIAT_WITHDRAW, CONVERT, AIRDROP, PROFIT_SHARE, SMART_ACCOUNT_TRANSFER, CRYPTO_GIFT, REWARDS, USDG_REWARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionBizType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLabelStringId() {
        return this.labelStringId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTypeId() {
        return this.typeId;
    }

    private TransactionBizType(String str, @StringRes int i, int i2, int i3) {
        this.typeId = i2;
        this.labelStringId = i3;
    }

    static {
        TransactionBizType[] transactionBizTypeArr$values = $values();
        $VALUES = transactionBizTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionBizTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.TransactionBizType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static TransactionBizType valueOf(String str) {
        return (TransactionBizType) Enum.valueOf(TransactionBizType.class, str);
    }

    public static TransactionBizType[] values() {
        return (TransactionBizType[]) $VALUES.clone();
    }
}
