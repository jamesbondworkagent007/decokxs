package com.okinc.business.invest_biz.data.contants;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.business.invest_biz.data.contants.ProductType;
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
public final class ProductType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProductType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("0")
    public static final ProductType Unknown = new ProductType("Unknown", 0, 0);

    @SerialName("1")
    public static final ProductType Save = new ProductType("Save", 1, 1);

    @SerialName("2")
    public static final ProductType Pool = new ProductType("Pool", 2, 2);

    @SerialName("3")
    public static final ProductType Farm = new ProductType("Farm", 3, 3);

    @SerialName("4")
    public static final ProductType Vault = new ProductType("Vault", 4, 4);

    @SerialName("5")
    public static final ProductType Stake = new ProductType("Stake", 5, 5);

    @SerialName(OrderDetailListItem.SLIP_OUT)
    public static final ProductType Borrow = new ProductType("Borrow", 6, 6);

    @SerialName("7")
    public static final ProductType Pos = new ProductType("Pos", 7, 7);

    @SerialName("8")
    public static final ProductType Locked = new ProductType("Locked", 8, 8);

    @SerialName("9")
    public static final ProductType Deposit = new ProductType("Deposit", 9, 9);

    @SerialName("10")
    public static final ProductType Vesting = new ProductType("Vesting", 10, 10);

    @SerialName("11")
    public static final ProductType LeveragedFarming = new ProductType("LeveragedFarming", 11, 11);

    @SerialName("12")
    public static final ProductType Investment = new ProductType("Investment", 12, 12);

    @SerialName("13")
    public static final ProductType Governance = new ProductType("Governance", 13, 13);

    @SerialName("14")
    public static final ProductType Reward = new ProductType("Reward", 14, 14);

    @SerialName("15")
    public static final ProductType NftStake = new ProductType("NftStake", 15, 15);

    @SerialName("16")
    public static final ProductType NftLend = new ProductType("NftLend", 16, 16);

    @SerialName("17")
    public static final ProductType NftBorrow = new ProductType("NftBorrow", 17, 17);

    @SerialName("18")
    public static final ProductType Perpetual = new ProductType("Perpetual", 18, 18);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProductType[] $values() {
        return new ProductType[]{Unknown, Save, Pool, Farm, Vault, Stake, Borrow, Pos, Locked, Deposit, Vesting, LeveragedFarming, Investment, Governance, Reward, NftStake, NftLend, NftBorrow, Perpetual};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProductType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.contants.ProductType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) ProductType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ProductType> serializer() {
            return OLrzqt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.contants.ProductType", values(), new String[]{"0", "1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
    }

    private ProductType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ProductType[] productTypeArr$values = $values();
        $VALUES = productTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(productTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ProductType._init_$_anonymous_();
            }
        });
    }

    public static ProductType valueOf(String str) {
        return (ProductType) Enum.valueOf(ProductType.class, str);
    }

    public static ProductType[] values() {
        return (ProductType[]) $VALUES.clone();
    }
}
