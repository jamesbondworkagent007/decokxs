package o;

import com.okinc.wallet.core.wallet.KeystoneAddressInfo;
import com.okinc.wallet.core.wallet.KeystonePubKeyInfo;
import com.okinc.wallet.hardware.api.keystone.KeystoneAccount;
import com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType;
import com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount;
import com.okinc.wallet.hardware.api.keystone.KeystoneSignAccountInfo;
import com.okinc.wallet.hardware.api.keystone.ParseKeystoneAccountsResp;
import com.okinc.wallet.hardware.api.keystone.ParseKeystoneSignResp;
import com.okinc.wallet.hardware.api.keystone.RSV;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xZX {
    public static final xZX OLrzqt = new xZX();
    public static final java.util.List<java.lang.Long> AEQbTJ = yDY.gEmmrt(0L, 1L, 195L, 2L, 5L, 145L);
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Long> AEQbTJ() {
        return AEQbTJ;
    }

    private xZX() {
    }

    public final boolean EZpvd(long j) {
        return AEQbTJ.contains(java.lang.Long.valueOf(j));
    }

    public final boolean copydefault(@NotNull C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        if (c10854bwM.AuCTel()) {
            return c10854bwM.QkdxfA() || c10854bwM.AxsJAYaxsJAY() || c10854bwM.ffGIBT() || c10854bwM.DLWbHP() || c10854bwM.run() || c10854bwM.flVtFt() || c10854bwM.OqFWZa();
        }
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        if (c10854bwMKWHzl == null) {
            return false;
        }
        return copydefault(c10854bwMKWHzl);
    }

    public final ParseKeystoneAccountsResp copydefault(@NotNull java.lang.String str) {
        KeystoneMultiAccount multiAccount;
        java.util.List<KeystoneAccount> accounts;
        KeystoneMultiAccount multiAccount2;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC57029yah interfaceC57029yah = (InterfaceC57029yah) C43251rlk.OLrzqt(InterfaceC57029yah.class);
        java.util.ArrayList arrayList = null;
        ParseKeystoneAccountsResp parseKeystoneAccountsRespOLrzqt = interfaceC57029yah != null ? interfaceC57029yah.OLrzqt(str) : null;
        if (C33129mqd.KWHzl((java.util.Collection) ((parseKeystoneAccountsRespOLrzqt == null || (multiAccount2 = parseKeystoneAccountsRespOLrzqt.getMultiAccount()) == null) ? null : multiAccount2.getAccounts())) && parseKeystoneAccountsRespOLrzqt != null && (multiAccount = parseKeystoneAccountsRespOLrzqt.getMultiAccount()) != null) {
            KeystoneMultiAccount multiAccount3 = parseKeystoneAccountsRespOLrzqt.getMultiAccount();
            if (multiAccount3 != null && (accounts = multiAccount3.getAccounts()) != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : accounts) {
                    if (OLrzqt.EZpvd(((KeystoneAccount) obj).getChainId())) {
                        arrayList.add(obj);
                    }
                }
            }
            multiAccount.setAccounts(arrayList);
        }
        return parseKeystoneAccountsRespOLrzqt;
    }

    public final AbstractC58260yxt<java.lang.Boolean> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C12766ctF.copydefault.copydefault(str, str2);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (listSplit$default.size() >= 6) {
            return "";
        }
        int size = listSplit$default.size();
        if (size <= i) {
            while (true) {
                if (size > listSplit$default.size()) {
                    sb.append("/");
                }
                if (size == i) {
                    sb.append(java.lang.String.valueOf(i2));
                } else {
                    sb.append("0");
                }
                if (size == i) {
                    break;
                }
                size++;
            }
        }
        java.lang.String string = sb.toString();
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.String.valueOf(((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null).get(3)).charAt(0));
    }

    public final void OLrzqt(@NotNull java.util.ArrayList<KeystonePubKeyInfo> arrayList, int i, @NotNull KeystoneAccount keystoneAccount) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(keystoneAccount, "");
        for (int i2 = 0; i2 < i; i2++) {
            long chainId = keystoneAccount.getChainId();
            arrayList.add(new KeystonePubKeyInfo(java.lang.Long.valueOf(chainId), keystoneAccount.getPublicKey(), keystoneAccount.getExtendedPublicKey(), keystoneAccount.getPath(), OLrzqt(keystoneAccount.getPath(), 5, i2), null, java.lang.String.valueOf(i2)));
        }
    }

    public final void copydefault(@NotNull java.util.ArrayList<KeystonePubKeyInfo> arrayList, @NotNull KeystoneAccount keystoneAccount) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(keystoneAccount, "");
        java.lang.String strKWHzl = KWHzl(keystoneAccount.getPath());
        if (java.lang.Integer.parseInt(strKWHzl) > 0) {
            long chainId = keystoneAccount.getChainId();
            arrayList.add(new KeystonePubKeyInfo(java.lang.Long.valueOf(chainId), keystoneAccount.getPublicKey(), keystoneAccount.getExtendedPublicKey(), keystoneAccount.getPath(), null, "ledger_live", strKWHzl));
        }
    }

    public final void EZpvd(@NotNull java.util.ArrayList<KeystonePubKeyInfo> arrayList, int i, @NotNull KeystoneAccount keystoneAccount) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(keystoneAccount, "");
        for (int i2 = 0; i2 < i; i2++) {
            long chainId = keystoneAccount.getChainId();
            arrayList.add(new KeystonePubKeyInfo(java.lang.Long.valueOf(chainId), keystoneAccount.getPublicKey(), keystoneAccount.getExtendedPublicKey(), keystoneAccount.getPath(), OLrzqt(keystoneAccount.getPath(), 4, i2), "ledger_legacy", java.lang.String.valueOf(i2)));
        }
    }

    public final void AEQbTJ(@NotNull java.util.ArrayList<KeystonePubKeyInfo> arrayList, int i, @NotNull KeystoneAccount keystoneAccount) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(keystoneAccount, "");
        copydefault(arrayList, i, keystoneAccount);
    }

    public final void KWHzl(@NotNull java.util.ArrayList<KeystonePubKeyInfo> arrayList, int i, @NotNull KeystoneAccount keystoneAccount) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(keystoneAccount, "");
        if (keystoneAccount.isLedgerLivePath()) {
            copydefault(arrayList, keystoneAccount);
        } else {
            EZpvd(arrayList, i, keystoneAccount);
            AEQbTJ(arrayList, i, keystoneAccount);
        }
    }

    public final void copydefault(java.util.ArrayList<KeystonePubKeyInfo> arrayList, int i, KeystoneAccount keystoneAccount) {
        for (int i2 = 0; i2 < i; i2++) {
            long chainId = keystoneAccount.getChainId();
            arrayList.add(new KeystonePubKeyInfo(java.lang.Long.valueOf(chainId), keystoneAccount.getPublicKey(), keystoneAccount.getExtendedPublicKey(), keystoneAccount.getPath(), OLrzqt(keystoneAccount.getPath(), 5, i2), "standard", java.lang.String.valueOf(i2)));
        }
    }

    public final java.util.List<KeystonePubKeyInfo> EZpvd(@NotNull java.util.List<KeystoneAccount> list) {
        Intrinsics.checkNotNullParameter(list, "");
        int iKWHzl = KWHzl(list);
        java.util.ArrayList<KeystonePubKeyInfo> arrayList = new java.util.ArrayList<>();
        for (KeystoneAccount keystoneAccount : list) {
            long chainId = keystoneAccount.getChainId();
            if (chainId == 0) {
                OLrzqt.OLrzqt(arrayList, iKWHzl, keystoneAccount);
            } else if (chainId == 1) {
                OLrzqt.KWHzl(arrayList, iKWHzl, keystoneAccount);
            } else if (chainId == 195 || chainId == 2 || chainId == 5 || chainId == 145) {
                OLrzqt.copydefault(arrayList, iKWHzl, keystoneAccount);
            }
        }
        return arrayList;
    }

    public final SortedMap<java.lang.Integer, java.util.List<KeystoneAddressInfo>> copydefault(@NotNull java.util.List<KeystonePubKeyInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<KeystoneAddressInfo> listCopydefault = C54908xZu.AEQbTJ.copydefault(list);
        if (listCopydefault == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : listCopydefault) {
            java.lang.Integer index = ((KeystoneAddressInfo) obj).getIndex();
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(index != null ? index.intValue() : 0);
            java.lang.Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        return C56423yEv.gEmmrt(linkedHashMap);
    }

    public final ParseKeystoneSignResp copydefault(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC57029yah interfaceC57029yah = (InterfaceC57029yah) C43251rlk.OLrzqt(InterfaceC57029yah.class);
        if (interfaceC57029yah != null) {
            return interfaceC57029yah.EZpvd(j, str);
        }
        return null;
    }

    public final RSV EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC57029yah interfaceC57029yah = (InterfaceC57029yah) C43251rlk.OLrzqt(InterfaceC57029yah.class);
        if (interfaceC57029yah != null) {
            return interfaceC57029yah.EZpvd(str);
        }
        return null;
    }

    public final AbstractC58185ywX<java.lang.String> EZpvd(@NotNull KeystoneSignAccountInfo keystoneSignAccountInfo, @NotNull KeystoneEvmSignType keystoneEvmSignType, @NotNull java.lang.String str) {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(keystoneSignAccountInfo, "");
        Intrinsics.checkNotNullParameter(keystoneEvmSignType, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC57029yah interfaceC57029yah = (InterfaceC57029yah) C43251rlk.OLrzqt(InterfaceC57029yah.class);
        if (interfaceC57029yah != null && (abstractC58185ywXKWHzl = interfaceC57029yah.KWHzl(keystoneSignAccountInfo, keystoneEvmSignType, str)) != null) {
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl("");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public final AbstractC58185ywX<java.lang.String> OLrzqt(@NotNull java.lang.String str) {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC57029yah interfaceC57029yah = (InterfaceC57029yah) C43251rlk.OLrzqt(InterfaceC57029yah.class);
        if (interfaceC57029yah != null && (abstractC58185ywXCopydefault = interfaceC57029yah.copydefault(str)) != null) {
            return abstractC58185ywXCopydefault;
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl("");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final AbstractC58185ywX<java.lang.String> EZpvd(@NotNull KeystoneSignAccountInfo keystoneSignAccountInfo, @NotNull java.lang.String str) {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXCopydefault;
        Intrinsics.checkNotNullParameter(keystoneSignAccountInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC57029yah interfaceC57029yah = (InterfaceC57029yah) C43251rlk.OLrzqt(InterfaceC57029yah.class);
        if (interfaceC57029yah != null && (abstractC58185ywXCopydefault = interfaceC57029yah.copydefault(keystoneSignAccountInfo, str)) != null) {
            return abstractC58185ywXCopydefault;
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl("");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final int KWHzl(@NotNull java.util.List<KeystoneAccount> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((KeystoneAccount) obj).isLedgerLivePath()) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }
}
