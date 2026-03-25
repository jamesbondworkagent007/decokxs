package com.okinc.business.defi.biz.constant;

import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12782ctV;
import o.C10856bwO;
import o.C11600cUg;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class WalletType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WalletType[] $VALUES;
    public static final Application Companion;
    public static final WalletType HDWallet = new WalletType("HDWallet", 0);
    public static final WalletType KeyWallet = new WalletType("KeyWallet", 1);
    public static final WalletType ConnectWallet = new WalletType("ConnectWallet", 2);
    public static final WalletType TrackingWallet = new WalletType("TrackingWallet", 3);
    public static final WalletType DemoWallet = new WalletType("DemoWallet", 4);
    public static final WalletType HardwareWallet = new WalletType("HardwareWallet", 5);
    public static final WalletType MPCWallet = new WalletType("MPCWallet", 6);
    public static final WalletType AAWallet = new WalletType("AAWallet", 7);
    public static final WalletType TonWallet = new WalletType("TonWallet", 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WalletType[] $values() {
        return new WalletType[]{HDWallet, KeyWallet, ConnectWallet, TrackingWallet, DemoWallet, HardwareWallet, MPCWallet, AAWallet, TonWallet};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WalletType> getEntries() {
        return $ENTRIES;
    }

    private WalletType(String str, int i) {
    }

    static {
        WalletType[] walletTypeArr$values = $values();
        $VALUES = walletTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(walletTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.constant.WalletType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final WalletType KWHzl(int i) {
            switch (i) {
                case 0:
                    return WalletType.HDWallet;
                case 1:
                    return WalletType.KeyWallet;
                case 2:
                    return WalletType.ConnectWallet;
                case 3:
                    return WalletType.TrackingWallet;
                case 4:
                    return WalletType.DemoWallet;
                case 5:
                    return WalletType.HardwareWallet;
                case 6:
                    return WalletType.MPCWallet;
                case 7:
                    return WalletType.AAWallet;
                case 8:
                    return WalletType.TonWallet;
                default:
                    C10856bwO.copydefault("WalletType", 0, "walletType is error");
                    throw new OKWException("", null);
            }
        }

        public final int OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            if (abstractC12782ctV.ORxRYg()) {
                return 5;
            }
            if (abstractC12782ctV.getFieldNames()) {
                return 8;
            }
            if (abstractC12782ctV.DXXBbs()) {
                return 1;
            }
            if (abstractC12782ctV.UeEOUB() || abstractC12782ctV.QfsBiF()) {
                return 3;
            }
            if (abstractC12782ctV.sSMYrx()) {
                return 4;
            }
            if (abstractC12782ctV.AwvSrB()) {
                return 6;
            }
            if (abstractC12782ctV.zsXlph()) {
                return 7;
            }
            if (abstractC12782ctV.AxsJAY()) {
                return 9;
            }
            return abstractC12782ctV.zuBGHE() ? 10 : 2;
        }

        public final int EZpvd(@NotNull WalletEntity walletEntity, Integer num) {
            Intrinsics.checkNotNullParameter(walletEntity, "");
            if (walletEntity.getType() == WalletType.MPCWallet.ordinal()) {
                return 5;
            }
            if (walletEntity.getType() == WalletType.AAWallet.ordinal()) {
                return 8;
            }
            if (C11600cUg.KWHzl(walletEntity.getFromCreate())) {
                return 1;
            }
            if (walletEntity.getType() == WalletType.ConnectWallet.ordinal() || walletEntity.getType() == WalletType.TrackingWallet.ordinal()) {
                return 3;
            }
            if (walletEntity.getType() == WalletType.HardwareWallet.ordinal()) {
                int iOrdinal = HardwareType.LedgerNanoX.ordinal();
                if (num == null || num.intValue() != iOrdinal) {
                    int iOrdinal2 = HardwareType.LedgerFlex.ordinal();
                    if (num == null || num.intValue() != iOrdinal2) {
                        int iOrdinal3 = HardwareType.Keystone.ordinal();
                        if (num != null && num.intValue() == iOrdinal3) {
                            return 9;
                        }
                        return (num != null && num.intValue() == HardwareType.OneKey.ordinal()) ? 10 : 0;
                    }
                }
                return 4;
            }
            if (walletEntity.getType() == WalletType.KeyWallet.ordinal()) {
                return 6;
            }
            return walletEntity.getType() == WalletType.DemoWallet.ordinal() ? 7 : 2;
        }

        public final int EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            return abstractC12782ctV.getFieldNames() ? abstractC12782ctV.DarRvM().ordinal() : abstractC12782ctV.QwvEab().ordinal();
        }

        public final int AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            return abstractC12782ctV.getFieldNames() ? 1 : 0;
        }

        public final int KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            if (abstractC12782ctV.AubY() && abstractC12782ctV.QbewEr()) {
                return abstractC12782ctV.DTwDnp() ? 1 : 2;
            }
            return 0;
        }
    }

    public static /* synthetic */ int getServerWalletType$default(WalletType walletType, boolean z, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getServerWalletType");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            num = -1;
        }
        return walletType.getServerWalletType(z, num);
    }

    public final int getServerWalletType(boolean z, Integer num) {
        if (z) {
            return 1;
        }
        int iOrdinal = ordinal();
        if (iOrdinal == MPCWallet.ordinal()) {
            return 5;
        }
        if (iOrdinal == AAWallet.ordinal()) {
            return 8;
        }
        if (iOrdinal == KeyWallet.ordinal()) {
            return 6;
        }
        if (iOrdinal == DemoWallet.ordinal()) {
            return 7;
        }
        if (iOrdinal != HardwareWallet.ordinal()) {
            return 2;
        }
        int iOrdinal2 = HardwareType.LedgerNanoX.ordinal();
        if (num == null || num.intValue() != iOrdinal2) {
            int iOrdinal3 = HardwareType.LedgerFlex.ordinal();
            if (num == null || num.intValue() != iOrdinal3) {
                int iOrdinal4 = HardwareType.Keystone.ordinal();
                if (num != null && num.intValue() == iOrdinal4) {
                    return 9;
                }
                return (num != null && num.intValue() == HardwareType.OneKey.ordinal()) ? 10 : 0;
            }
        }
        return 4;
    }

    public static WalletType valueOf(String str) {
        return (WalletType) Enum.valueOf(WalletType.class, str);
    }

    public static WalletType[] values() {
        return (WalletType[]) $VALUES.clone();
    }
}
