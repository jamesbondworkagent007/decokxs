package com.okinc.okpaymentapi.data.remote.model.management;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ChannelPlatformCode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChannelPlatformCode[] $VALUES;
    public static final StateListAnimator Companion;
    private final String code;
    private final int value;
    public static final ChannelPlatformCode SIMPLEX = new ChannelPlatformCode("SIMPLEX", 0, 0, "0");
    public static final ChannelPlatformCode KOINAL = new ChannelPlatformCode("KOINAL", 1, 1, "1");
    public static final ChannelPlatformCode PAXFUL = new ChannelPlatformCode("PAXFUL", 2, 2, "2");
    public static final ChannelPlatformCode BANXA = new ChannelPlatformCode("BANXA", 3, 3, "3");
    public static final ChannelPlatformCode MOONPAY = new ChannelPlatformCode("MOONPAY", 4, 4, "4");
    public static final ChannelPlatformCode XANPOOL = new ChannelPlatformCode("XANPOOL", 5, 5, "5");
    public static final ChannelPlatformCode INDACOIN = new ChannelPlatformCode("INDACOIN", 6, 6, OrderDetailListItem.SLIP_OUT);
    public static final ChannelPlatformCode MERCURYO = new ChannelPlatformCode("MERCURYO", 7, 7, "7");
    public static final ChannelPlatformCode COINIFY = new ChannelPlatformCode("COINIFY", 8, 8, "8");
    public static final ChannelPlatformCode OKCOIN = new ChannelPlatformCode("OKCOIN", 9, 9, "9");
    public static final ChannelPlatformCode LATAMEX = new ChannelPlatformCode("LATAMEX", 10, 11, "11");
    public static final ChannelPlatformCode ADVCASH = new ChannelPlatformCode("ADVCASH", 11, 12, "12");
    public static final ChannelPlatformCode MENAPAY = new ChannelPlatformCode("MENAPAY", 12, 13, "13");
    public static final ChannelPlatformCode CUBOPAY = new ChannelPlatformCode("CUBOPAY", 13, 14, "14");
    public static final ChannelPlatformCode UTORG = new ChannelPlatformCode("UTORG", 14, 15, "15");
    public static final ChannelPlatformCode ITEZ = new ChannelPlatformCode("ITEZ", 15, 18, "18");
    public static final ChannelPlatformCode FIAHUB = new ChannelPlatformCode("FIAHUB", 16, 19, "19");
    public static final ChannelPlatformCode BITBNS = new ChannelPlatformCode("BITBNS", 17, 20, "20");
    public static final ChannelPlatformCode GEOPAY = new ChannelPlatformCode("GEOPAY", 18, 21, "21");
    public static final ChannelPlatformCode BUYUCOIN = new ChannelPlatformCode("BUYUCOIN", 19, 22, "22");
    public static final ChannelPlatformCode FRAXEUM = new ChannelPlatformCode("FRAXEUM", 20, 23, "23");
    public static final ChannelPlatformCode CARDPAYMENT = new ChannelPlatformCode("CARDPAYMENT", 21, 25, "25");
    public static final ChannelPlatformCode FOXBIT = new ChannelPlatformCode("FOXBIT", 22, 26, "26");
    public static final ChannelPlatformCode PAYMOUNT = new ChannelPlatformCode("PAYMOUNT", 23, 27, "27");
    public static final ChannelPlatformCode ALCHEMYPAY = new ChannelPlatformCode("ALCHEMYPAY", 24, 28, "28");
    public static final ChannelPlatformCode USDC = new ChannelPlatformCode("USDC", 25, 31, "31");
    public static final ChannelPlatformCode BALANCE = new ChannelPlatformCode("BALANCE", 26, 1000, "1000");
    public static final ChannelPlatformCode ACH = new ChannelPlatformCode("ACH", 27, 1001, "1001");
    public static final ChannelPlatformCode WIRE = new ChannelPlatformCode("WIRE", 28, 1002, "1002");
    public static final ChannelPlatformCode CARD = new ChannelPlatformCode("CARD", 29, 1003, "1003");
    public static final ChannelPlatformCode SEPA = new ChannelPlatformCode("SEPA", 30, 1004, "1004");
    public static final ChannelPlatformCode FPS = new ChannelPlatformCode("FPS", 31, 1005, "1005");
    public static final ChannelPlatformCode BRAZIL = new ChannelPlatformCode("BRAZIL", 32, 1006, "1006");
    public static final ChannelPlatformCode TURKEY_WITHDRAW_BANKS = new ChannelPlatformCode("TURKEY_WITHDRAW_BANKS", 33, 1007, "1007");
    public static final ChannelPlatformCode TURKEY_DEPOSIT_HAVALE_BANKS = new ChannelPlatformCode("TURKEY_DEPOSIT_HAVALE_BANKS", 34, 1008, "1008");
    public static final ChannelPlatformCode TURKEY_DEPOSIT_OTHER_BANKS = new ChannelPlatformCode("TURKEY_DEPOSIT_OTHER_BANKS", 35, PointerIconCompat.TYPE_VERTICAL_TEXT, "1009");
    public static final ChannelPlatformCode IDEAL = new ChannelPlatformCode("IDEAL", 36, PointerIconCompat.TYPE_ALIAS, "1010");
    public static final ChannelPlatformCode AUSTRALIA = new ChannelPlatformCode("AUSTRALIA", 37, 1011, "1011");
    public static final ChannelPlatformCode UAE = new ChannelPlatformCode("UAE", 38, 1012, "1012");
    public static final ChannelPlatformCode BAHAMAS_SEPA = new ChannelPlatformCode("BAHAMAS_SEPA", 39, 1014, "1014");
    public static final ChannelPlatformCode BAHAMAS_WIRE = new ChannelPlatformCode("BAHAMAS_WIRE", 40, 1015, "1015");
    public static final ChannelPlatformCode US_WIRE = new ChannelPlatformCode("US_WIRE", 41, 1016, "1016");
    public static final ChannelPlatformCode BANCONTACT = new ChannelPlatformCode("BANCONTACT", 42, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, "1017");
    public static final ChannelPlatformCode ACH_BUY = new ChannelPlatformCode("ACH_BUY", 43, PointerIconCompat.TYPE_GRABBING, "1021");
    public static final ChannelPlatformCode SG_PAYNOW = new ChannelPlatformCode("SG_PAYNOW", 44, 1018, "1018");
    public static final ChannelPlatformCode SG_FAST = new ChannelPlatformCode("SG_FAST", 45, PointerIconCompat.TYPE_ZOOM_OUT, "1019");
    public static final ChannelPlatformCode BUY_IDEAL = new ChannelPlatformCode("BUY_IDEAL", 46, PointerIconCompat.TYPE_GRAB, "1020");
    public static final ChannelPlatformCode SG_WIRE = new ChannelPlatformCode("SG_WIRE", 47, 1022, "1022");
    public static final ChannelPlatformCode EEA_WIRE = new ChannelPlatformCode("EEA_WIRE", 48, 1023, "1023");
    public static final ChannelPlatformCode SG_MEPS = new ChannelPlatformCode("SG_MEPS", 49, InputDeviceCompat.SOURCE_GAMEPAD, "1025");
    public static final ChannelPlatformCode UAE_WIRE = new ChannelPlatformCode("UAE_WIRE", 50, 1026, "1026");
    public static final ChannelPlatformCode DEPOSIT_PAYPAL = new ChannelPlatformCode("DEPOSIT_PAYPAL", 51, 1027, "1027");
    public static final ChannelPlatformCode BUY_PAYPAL = new ChannelPlatformCode("BUY_PAYPAL", 52, MTPushConstants.Message.CODE_MESSAGE_OPENED, "1028");
    public static final ChannelPlatformCode LEAN = new ChannelPlatformCode("LEAN", 53, 1029, "1029");
    public static final ChannelPlatformCode BLIK_BUY = new ChannelPlatformCode("BLIK_BUY", 54, 1033, "1033");
    public static final ChannelPlatformCode GOOGLE_PAY = new ChannelPlatformCode("GOOGLE_PAY", 55, 1032, "1032");
    public static final ChannelPlatformCode PIX_BUY = new ChannelPlatformCode("PIX_BUY", 56, 1034, "1034");
    public static final ChannelPlatformCode APPLE_PAY = new ChannelPlatformCode("APPLE_PAY", 57, 1031, "1031");
    public static final ChannelPlatformCode CARD_DEPOSIT = new ChannelPlatformCode("CARD_DEPOSIT", 58, 1035, "1035");
    public static final ChannelPlatformCode GETIVY = new ChannelPlatformCode("GETIVY", 59, 1036, "1036");
    public static final ChannelPlatformCode GETIVY_BUY = new ChannelPlatformCode("GETIVY_BUY", 60, 1037, "1037");
    public static final ChannelPlatformCode GRAB_PAY = new ChannelPlatformCode("GRAB_PAY", 61, MTPushConstants.Message.CODE_MESSAGE_DELETED, "1038");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChannelPlatformCode[] $values() {
        return new ChannelPlatformCode[]{SIMPLEX, KOINAL, PAXFUL, BANXA, MOONPAY, XANPOOL, INDACOIN, MERCURYO, COINIFY, OKCOIN, LATAMEX, ADVCASH, MENAPAY, CUBOPAY, UTORG, ITEZ, FIAHUB, BITBNS, GEOPAY, BUYUCOIN, FRAXEUM, CARDPAYMENT, FOXBIT, PAYMOUNT, ALCHEMYPAY, USDC, BALANCE, ACH, WIRE, CARD, SEPA, FPS, BRAZIL, TURKEY_WITHDRAW_BANKS, TURKEY_DEPOSIT_HAVALE_BANKS, TURKEY_DEPOSIT_OTHER_BANKS, IDEAL, AUSTRALIA, UAE, BAHAMAS_SEPA, BAHAMAS_WIRE, US_WIRE, BANCONTACT, ACH_BUY, SG_PAYNOW, SG_FAST, BUY_IDEAL, SG_WIRE, EEA_WIRE, SG_MEPS, UAE_WIRE, DEPOSIT_PAYPAL, BUY_PAYPAL, LEAN, BLIK_BUY, GOOGLE_PAY, PIX_BUY, APPLE_PAY, CARD_DEPOSIT, GETIVY, GETIVY_BUY, GRAB_PAY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChannelPlatformCode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ChannelPlatformCode(String str, int i, int i2, String str2) {
        this.value = i2;
        this.code = str2;
    }

    static {
        ChannelPlatformCode[] channelPlatformCodeArr$values = $values();
        $VALUES = channelPlatformCodeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(channelPlatformCodeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static ChannelPlatformCode valueOf(String str) {
        return (ChannelPlatformCode) Enum.valueOf(ChannelPlatformCode.class, str);
    }

    public static ChannelPlatformCode[] values() {
        return (ChannelPlatformCode[]) $VALUES.clone();
    }
}
