package com.okinc.core.util.qrcode.decode;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ScanType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ScanType[] $VALUES;
    public static final ScanType APP_LOGIN;
    private static final List<ScanType> CEFI;
    public static final ScanType CEFI_PASSKEY;
    private static final List<ScanType> CEFI_PAY;
    public static final ScanType CE_DEFI_DEX_TRADE;
    public static final Parcelable.Creator<ScanType> CREATOR;
    public static final Activity Companion;
    public static final ScanType DEEPLINK;
    public static final ScanType DEFI_WALLET_ADDRESS;
    public static final ScanType IM;
    public static final ScanType P2P;
    public static final ScanType RED_PACKET;
    public static final ScanType TRADING_BOT;
    public static final ScanType WALLET_ADDRESS;
    public static final ScanType WALLET_HOME;
    public static final ScanType WALLET_IMPORT;
    public static final ScanType WEB3_PAY_CONTACTS;
    public static final ScanType WEB3_PAY_OFFSHORE_HOME;
    public static final ScanType WEB3_PAY_ONCHAIN_ADDRESS;
    public static final ScanType WEB3_PAY_ONSHORE_HOME;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ScanType[] $values() {
        return new ScanType[]{CEFI_PASSKEY, APP_LOGIN, IM, RED_PACKET, WALLET_ADDRESS, P2P, TRADING_BOT, DEEPLINK, WALLET_IMPORT, WALLET_HOME, DEFI_WALLET_ADDRESS, WEB3_PAY_ONSHORE_HOME, WEB3_PAY_OFFSHORE_HOME, WEB3_PAY_CONTACTS, WEB3_PAY_ONCHAIN_ADDRESS, CE_DEFI_DEX_TRADE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ScanType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private ScanType(String str, int i) {
    }

    static {
        ScanType scanType = new ScanType("CEFI_PASSKEY", 0);
        CEFI_PASSKEY = scanType;
        ScanType scanType2 = new ScanType("APP_LOGIN", 1);
        APP_LOGIN = scanType2;
        ScanType scanType3 = new ScanType(OtcExtraKeys.IM, 2);
        IM = scanType3;
        ScanType scanType4 = new ScanType("RED_PACKET", 3);
        RED_PACKET = scanType4;
        ScanType scanType5 = new ScanType("WALLET_ADDRESS", 4);
        WALLET_ADDRESS = scanType5;
        ScanType scanType6 = new ScanType(CustomMessageData.SERVICE_NAME_P2P, 5);
        P2P = scanType6;
        ScanType scanType7 = new ScanType("TRADING_BOT", 6);
        TRADING_BOT = scanType7;
        ScanType scanType8 = new ScanType("DEEPLINK", 7);
        DEEPLINK = scanType8;
        WALLET_IMPORT = new ScanType("WALLET_IMPORT", 8);
        WALLET_HOME = new ScanType("WALLET_HOME", 9);
        DEFI_WALLET_ADDRESS = new ScanType("DEFI_WALLET_ADDRESS", 10);
        WEB3_PAY_ONSHORE_HOME = new ScanType("WEB3_PAY_ONSHORE_HOME", 11);
        ScanType scanType9 = new ScanType("WEB3_PAY_OFFSHORE_HOME", 12);
        WEB3_PAY_OFFSHORE_HOME = scanType9;
        WEB3_PAY_CONTACTS = new ScanType("WEB3_PAY_CONTACTS", 13);
        WEB3_PAY_ONCHAIN_ADDRESS = new ScanType("WEB3_PAY_ONCHAIN_ADDRESS", 14);
        ScanType scanType10 = new ScanType("CE_DEFI_DEX_TRADE", 15);
        CE_DEFI_DEX_TRADE = scanType10;
        ScanType[] scanTypeArr$values = $values();
        $VALUES = scanTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(scanTypeArr$values);
        Companion = new Activity(null);
        CREATOR = new Parcelable.Creator<ScanType>() { // from class: com.okinc.core.util.qrcode.decode.ScanType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScanType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ScanType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScanType[] newArray(int i) {
                return new ScanType[i];
            }
        };
        CEFI = yDY.gEmmrt(scanType, scanType2, scanType3, scanType4, scanType5, scanType10, scanType9, scanType6, scanType7, scanType8);
        CEFI_PAY = yDY.gEmmrt(scanType9, scanType, scanType2, scanType3, scanType4, scanType6, scanType7, scanType8);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.util.qrcode.decode.ScanType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final List<ScanType> KWHzl() {
            return ScanType.CEFI;
        }

        public final List<ScanType> copydefault() {
            return ScanType.CEFI_PAY;
        }
    }

    public static ScanType valueOf(String str) {
        return (ScanType) Enum.valueOf(ScanType.class, str);
    }

    public static ScanType[] values() {
        return (ScanType[]) $VALUES.clone();
    }
}
