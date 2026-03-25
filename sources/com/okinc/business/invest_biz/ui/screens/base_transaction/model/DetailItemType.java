package com.okinc.business.invest_biz.ui.screens.base_transaction.model;

import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
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
public final class DetailItemType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DetailItemType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final DetailItemType DEFAULT = new DetailItemType("DEFAULT", 0);
    public static final DetailItemType DAILY_YIELD = new DetailItemType("DAILY_YIELD", 1);
    public static final DetailItemType COLLATERAL_RATIO = new DetailItemType("COLLATERAL_RATIO", 2);
    public static final DetailItemType TRANSACTION_PATH = new DetailItemType("TRANSACTION_PATH", 3);
    public static final DetailItemType NETWORK_SLIPPAGE = new DetailItemType("NETWORK_SLIPPAGE", 4);
    public static final DetailItemType TRANSACTION_LOSS = new DetailItemType("TRANSACTION_LOSS", 5);
    public static final DetailItemType REMAINING_REPAYMENT = new DetailItemType("REMAINING_REPAYMENT", 6);
    public static final DetailItemType RECEIVE_TOKEN = new DetailItemType("RECEIVE_TOKEN", 7);
    public static final DetailItemType EST_RECEIVE = new DetailItemType("EST_RECEIVE", 8);
    public static final DetailItemType NETWORK_FEE = new DetailItemType("NETWORK_FEE", 9);
    public static final DetailItemType FIXED_APY = new DetailItemType("FIXED_APY", 10);
    public static final DetailItemType MATURITY = new DetailItemType("MATURITY", 11);
    public static final DetailItemType EXCHANGE_RATE = new DetailItemType("EXCHANGE_RATE", 12);
    public static final DetailItemType PAY_WITH = new DetailItemType("PAY_WITH", 13);
    public static final DetailItemType VALIDATOR = new DetailItemType("VALIDATOR", 14);
    public static final DetailItemType FINALITY_PROVIDER = new DetailItemType("FINALITY_PROVIDER", 15);
    public static final DetailItemType EST_UNBOND_TIME = new DetailItemType("EST_UNBOND_TIME", 16);
    public static final DetailItemType SETTLEMENT = new DetailItemType("SETTLEMENT", 17);
    public static final DetailItemType EXT_INFO = new DetailItemType("EXT_INFO", 18);
    public static final DetailItemType EST_POINTS_EARN = new DetailItemType("EST_POINTS_EARN", 19);
    public static final DetailItemType SUPPLY_COLLATERAL = new DetailItemType("SUPPLY_COLLATERAL", 20);
    public static final DetailItemType BORROW_FEE = new DetailItemType("BORROW_FEE", 21);
    public static final DetailItemType REPAY_BORROWED = new DetailItemType("REPAY_BORROWED", 22);
    public static final DetailItemType HEALTH_FACTOR = new DetailItemType("HEALTH_FACTOR", 23);
    public static final DetailItemType BORROW_RECEIVE_TOKEN = new DetailItemType("BORROW_RECEIVE_TOKEN", 24);
    public static final DetailItemType V3_PRICE_RANGE = new DetailItemType("V3_PRICE_RANGE", 25);
    public static final DetailItemType V3_UNCLAIM_FEE = new DetailItemType("V3_UNCLAIM_FEE", 26);
    public static final DetailItemType V3_CURRENT_PRICE = new DetailItemType("V3_CURRENT_PRICE", 27);
    public static final DetailItemType V3_SWAP_SLIPPAGE = new DetailItemType("V3_SWAP_SLIPPAGE", 28);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DetailItemType[] $values() {
        return new DetailItemType[]{DEFAULT, DAILY_YIELD, COLLATERAL_RATIO, TRANSACTION_PATH, NETWORK_SLIPPAGE, TRANSACTION_LOSS, REMAINING_REPAYMENT, RECEIVE_TOKEN, EST_RECEIVE, NETWORK_FEE, FIXED_APY, MATURITY, EXCHANGE_RATE, PAY_WITH, VALIDATOR, FINALITY_PROVIDER, EST_UNBOND_TIME, SETTLEMENT, EXT_INFO, EST_POINTS_EARN, SUPPLY_COLLATERAL, BORROW_FEE, REPAY_BORROWED, HEALTH_FACTOR, BORROW_RECEIVE_TOKEN, V3_PRICE_RANGE, V3_UNCLAIM_FEE, V3_CURRENT_PRICE, V3_SWAP_SLIPPAGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DetailItemType> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) DetailItemType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<DetailItemType> serializer() {
            return AEQbTJ();
        }
    }

    private DetailItemType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType", values());
    }

    static {
        DetailItemType[] detailItemTypeArr$values = $values();
        $VALUES = detailItemTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(detailItemTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iXr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DetailItemType._init_$_anonymous_();
            }
        });
    }

    public static DetailItemType valueOf(String str) {
        return (DetailItemType) Enum.valueOf(DetailItemType.class, str);
    }

    public static DetailItemType[] values() {
        return (DetailItemType[]) $VALUES.clone();
    }
}
