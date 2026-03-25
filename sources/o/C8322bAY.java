package o;

import com.okinc.core.util.SPUtils;
import com.okinc.wallet.api.bean.AddressType;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bAY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8322bAY {
    public static final C8322bAY KWHzl = new C8322bAY();

    private C8322bAY() {
    }

    public static /* synthetic */ java.lang.String getAddressFormat$default(C8322bAY c8322bAY, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c8322bAY.OLrzqt(i, z);
    }

    public final java.lang.String OLrzqt(int i, boolean z) {
        if (i == AddressType.Legacy.getValue()) {
            if (z) {
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDCKfqP);
            }
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.reset);
        }
        if (i == AddressType.P2SHType.getValue() || i == AddressType.P2SHCommonType.getValue()) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.DQzvGNdrmXxu);
        }
        if (i == AddressType.BCHPubKeyAddr.getValue() || i == AddressType.Bech32Type.getValue()) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.zLAIeZ);
        }
        return i == AddressType.P2TRType.getValue() ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.onEvent) : i == AddressType.LedgerLegacy.getValue() ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDIADVb) : i == AddressType.LedgerLive.getValue() ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKDDUqPf) : "";
    }

    public static /* synthetic */ java.util.List getAddressTypeList$default(C8322bAY c8322bAY, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c8322bAY.AEQbTJ(j, z);
    }

    public final java.util.List<java.lang.Integer> AEQbTJ(long j, boolean z) {
        if (j == 2) {
            return yDY.gEmmrt(java.lang.Integer.valueOf(AddressType.Legacy.getValue()), java.lang.Integer.valueOf(AddressType.P2SHType.getValue()), java.lang.Integer.valueOf(AddressType.P2SHCommonType.getValue()), java.lang.Integer.valueOf(AddressType.Bech32Type.getValue()));
        }
        if (j == 0) {
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(java.lang.Integer.valueOf(AddressType.Legacy.getValue()), java.lang.Integer.valueOf(AddressType.P2SHType.getValue()), java.lang.Integer.valueOf(AddressType.P2SHCommonType.getValue()), java.lang.Integer.valueOf(AddressType.Bech32Type.getValue()));
            if (!z) {
                return arrayListCopydefault;
            }
            arrayListCopydefault.add(0, java.lang.Integer.valueOf(AddressType.P2TRType.getValue()));
            return arrayListCopydefault;
        }
        if (j == 145) {
            return yDY.gEmmrt(java.lang.Integer.valueOf(AddressType.Legacy.getValue()), java.lang.Integer.valueOf(AddressType.BCHPubKeyAddr.getValue()));
        }
        if (j == 70000047 || j == 70000038 || j == 70000061) {
            java.util.ArrayList arrayListCopydefault2 = yDY.copydefault(java.lang.Integer.valueOf(AddressType.Legacy.getValue()), java.lang.Integer.valueOf(AddressType.P2SHCommonType.getValue()), java.lang.Integer.valueOf(AddressType.Bech32Type.getValue()));
            if (!z) {
                return arrayListCopydefault2;
            }
            arrayListCopydefault2.add(0, java.lang.Integer.valueOf(AddressType.P2TRType.getValue()));
            return arrayListCopydefault2;
        }
        return C56402yEa.EZpvd(java.lang.Integer.valueOf(AddressType.Legacy.getValue()));
    }

    public final java.util.List<java.lang.Integer> OLrzqt() {
        return yDY.gEmmrt(java.lang.Integer.valueOf(AddressType.P2TRType.getValue()), java.lang.Integer.valueOf(AddressType.Legacy.getValue()), java.lang.Integer.valueOf(AddressType.P2SHCommonType.getValue()), java.lang.Integer.valueOf(AddressType.Bech32Type.getValue()));
    }

    public static /* synthetic */ int getAddressTypeSize$default(C8322bAY c8322bAY, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c8322bAY.OLrzqt(j, z);
    }

    public final int OLrzqt(long j, boolean z) {
        if (j == 2 || j == 0) {
            return AEQbTJ(j, z).size() - 1;
        }
        return AEQbTJ(j, z).size();
    }

    public final int KWHzl(long j, boolean z) {
        if (j == 0 || j == 70000061) {
            return (z ? AddressType.P2TRType : AddressType.P2SHCommonType).getValue();
        }
        if (j == 145) {
            return AddressType.BCHPubKeyAddr.getValue();
        }
        if (j == 2) {
            return AddressType.P2SHCommonType.getValue();
        }
        if (j == 70000047 || j == 70000038) {
            return AddressType.P2TRType.getValue();
        }
        return AddressType.Legacy.getValue();
    }

    public final java.lang.Integer OLrzqt(long j) {
        if (j == 0) {
            return java.lang.Integer.valueOf(AddressType.P2SHCommonType.getValue());
        }
        if (j == 2) {
            return java.lang.Integer.valueOf(AddressType.P2SHCommonType.getValue());
        }
        return null;
    }

    public final int KWHzl(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (j == 0 || j == 70000061) {
            if (C59449zhJ.startsWith$default(str, "bc1p", false, 2, null)) {
                return AddressType.P2TRType.getValue();
            }
            if (C59449zhJ.startsWith$default(str, "bc1", false, 2, null)) {
                return AddressType.Bech32Type.getValue();
            }
            if (C59449zhJ.startsWith$default(str, "3", false, 2, null)) {
                return AddressType.P2SHCommonType.getValue();
            }
            return AddressType.Legacy.getValue();
        }
        if (j == 2) {
            if (C59449zhJ.startsWith$default(str, "ltc", false, 2, null)) {
                return AddressType.Bech32Type.getValue();
            }
            if (C59449zhJ.startsWith$default(str, "M", false, 2, null)) {
                return AddressType.P2SHType.getValue();
            }
            return AddressType.Legacy.getValue();
        }
        if (j == 145) {
            if (C59449zhJ.startsWith$default(str, "q", false, 2, null) || C59449zhJ.startsWith$default(str, "bitcoincash:q", false, 2, null)) {
                return AddressType.BCHPubKeyAddr.getValue();
            }
            if (C59449zhJ.startsWith$default(str, "1", false, 2, null)) {
                return AddressType.Legacy.getValue();
            }
            return AddressType.P2SHType.getValue();
        }
        if (j == 70000047 || j == 70000038) {
            if (C59449zhJ.startsWith$default(str, "tp1p", false, 2, null)) {
                return AddressType.P2TRType.getValue();
            }
            if (C59449zhJ.startsWith$default(str, "tp1q", false, 2, null)) {
                return AddressType.Bech32Type.getValue();
            }
            if (C59449zhJ.startsWith$default(str, "2", false, 2, null)) {
                return AddressType.P2SHCommonType.getValue();
            }
            return AddressType.Legacy.getValue();
        }
        return AddressType.Legacy.getValue();
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return SPUtils.getBoolean(str, false, "wallet_seg_wit_info_requested");
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put(str, java.lang.Boolean.TRUE, "wallet_seg_wit_info_requested");
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !KWHzl(str);
    }

    public final boolean KWHzl(java.lang.String str) {
        return SPUtils.getBoolean(str, false, "wallet_seg_address_info_complete");
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put(str, java.lang.Boolean.TRUE, "wallet_seg_address_info_complete");
    }
}
