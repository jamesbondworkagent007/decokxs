package o;

import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.scan.EnCodeResult;
import com.okinc.business.defi.biz.core.scan.EosOpenInfo;
import com.okinc.business.defi.biz.core.scan.ScanTransactionManager$parseAppLink$1;
import com.okinc.business.defi.biz.core.scan.ScanTransactionManager$parseScanCode$1;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C16058eck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bAz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8349bAz {
    public static final C8349bAz OLrzqt = new C8349bAz();

    private C8349bAz() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super EnCodeResult> continuation) throws java.lang.Throwable {
        ScanTransactionManager$parseScanCode$1 scanTransactionManager$parseScanCode$1;
        C8349bAz c8349bAz;
        if (continuation instanceof ScanTransactionManager$parseScanCode$1) {
            scanTransactionManager$parseScanCode$1 = (ScanTransactionManager$parseScanCode$1) continuation;
            int i = scanTransactionManager$parseScanCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scanTransactionManager$parseScanCode$1.label = i - Integer.MIN_VALUE;
            } else {
                scanTransactionManager$parseScanCode$1 = new ScanTransactionManager$parseScanCode$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = scanTransactionManager$parseScanCode$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = scanTransactionManager$parseScanCode$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            EnCodeResult enCodeResultValueOf = valueOf(str);
            if (enCodeResultValueOf.getParsed()) {
                return enCodeResultValueOf;
            }
            EnCodeResult enCodeResultAhwBna = AhwBna(str);
            if (enCodeResultAhwBna.getParsed()) {
                return enCodeResultAhwBna;
            }
            EnCodeResult enCodeResultAYXKKw = AYXKKw(str);
            if (enCodeResultAYXKKw.getParsed()) {
                return enCodeResultAYXKKw;
            }
            EnCodeResult enCodeResultEZpvd = EZpvd(str);
            if (enCodeResultEZpvd.getParsed()) {
                return enCodeResultEZpvd;
            }
            EnCodeResult enCodeResultOLrzqt = OLrzqt(str);
            if (enCodeResultOLrzqt.getParsed()) {
                return enCodeResultOLrzqt;
            }
            scanTransactionManager$parseScanCode$1.L$0 = this;
            scanTransactionManager$parseScanCode$1.L$1 = str;
            scanTransactionManager$parseScanCode$1.label = 1;
            objCopydefault = copydefault(str, scanTransactionManager$parseScanCode$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c8349bAz = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) scanTransactionManager$parseScanCode$1.L$1;
            c8349bAz = (C8349bAz) scanTransactionManager$parseScanCode$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        EnCodeResult enCodeResult = (EnCodeResult) objCopydefault;
        if (enCodeResult.getParsed()) {
            return enCodeResult;
        }
        EnCodeResult enCodeResultDjBIcL = c8349bAz.djBIcL(str);
        if (enCodeResultDjBIcL.getParsed()) {
            return enCodeResultDjBIcL;
        }
        EnCodeResult enCodeResultAEQbTJ = c8349bAz.AEQbTJ(str);
        if (enCodeResultAEQbTJ.getParsed()) {
            return enCodeResultAEQbTJ;
        }
        EnCodeResult enCodeResultCopydefault = c8349bAz.copydefault(str);
        return enCodeResultCopydefault.getParsed() ? enCodeResultCopydefault : new EnCodeResult(false, false, "Unknown Scan info", 0, null, 16, null);
    }

    public final EnCodeResult valueOf(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.startsWith$default(lowerCase, "okx_metax", false, 2, null)) {
            return new EnCodeResult(true, true, null, 4, str, 4, null);
        }
        return new EnCodeResult(false, false, null, 0, null, 30, null);
    }

    public final EnCodeResult AhwBna(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.startsWith$default(lowerCase, "wc", false, 2, null)) {
            return new EnCodeResult(true, true, null, 3, str, 4, null);
        }
        return new EnCodeResult(false, false, null, 0, null, 30, null);
    }

    public final EnCodeResult AYXKKw(java.lang.String str) {
        if (C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null).AEQbTJ(str)) {
            return new EnCodeResult(true, true, null, 11, str, 4, null);
        }
        return new EnCodeResult(false, false, null, 0, null, 30, null);
    }

    public final EnCodeResult copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.startsWith$default(lowerCase, "http", false, 2, null)) {
            return new EnCodeResult(false, false, null, 0, null, 30, null);
        }
        TransactionInfo transactionInfoGEmmrt = gEmmrt(str);
        if (transactionInfoGEmmrt.getAddress().length() == 0 && transactionInfoGEmmrt.getContractAddress().length() == 0) {
            return new EnCodeResult(false, false, null, 0, null, 30, null);
        }
        return new EnCodeResult(true, false, "", 1, transactionInfoGEmmrt);
    }

    public final EnCodeResult AEQbTJ(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (!C59449zhJ.startsWith$default(lowerCase, "okx_mpc:", false, 2, null)) {
            return new EnCodeResult(false, false, null, 0, null, 30, null);
        }
        return new EnCodeResult(true, false, str, 8, new C18853fqJ().KWHzl(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d5  */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TransactionInfo gEmmrt(@NotNull java.lang.String str) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        boolean zContains$default;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        boolean z;
        ?? r20;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.util.HashMap map;
        java.util.Iterator it;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object obj13;
        java.lang.Object objGEmmrt;
        java.lang.String strAEQbTJ;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String strOLrzqt;
        java.lang.String str6;
        java.lang.String strOLrzqt2;
        java.lang.String str7;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Set setAhwBna = yEE.AhwBna("ronin", "kaspa");
        int iAhwBna = 0;
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "@", false, 2, (java.lang.Object) null)) {
            zContains$default = StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "/", false, 2, (java.lang.Object) null);
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"@"}, false, 0, 6, (java.lang.Object) null);
            java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) listSplit$default.get(0), new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
            if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(listSplit$default2.size()), (java.lang.Object) 2)) {
                java.lang.String lowerCase = ((java.lang.String) listSplit$default2.get(0)).toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (setAhwBna.contains(lowerCase)) {
                    obj = (java.lang.String) listSplit$default.get(0);
                    obj2 = "";
                    if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listSplit$default.size()), 1)) {
                        java.lang.Object obj14 = "";
                        java.lang.Object obj15 = obj14;
                        obj8 = obj15;
                        obj10 = obj14;
                        obj9 = obj15;
                    } else {
                        java.util.List listSplit$default3 = StringsKt__StringsKt.split$default((java.lang.CharSequence) listSplit$default.get(1), new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null);
                        java.lang.CharSequence charSequence = (java.lang.CharSequence) StringsKt__StringsKt.split$default((java.lang.CharSequence) listSplit$default3.get(0), new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null).get(0);
                        if (charSequence.length() == 0) {
                            charSequence = MultiTransferSignData.DEFAULT_INTERVAL;
                        }
                        java.lang.String str8 = (java.lang.String) charSequence;
                        boolean zEZpvd = C9700baY.EZpvd(str8);
                        java.lang.String strOLrzqt3 = str8;
                        if (zEZpvd) {
                            strOLrzqt3 = C33491mxU.OLrzqt(str8);
                        }
                        z = strOLrzqt3.length() == 0;
                        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(strOLrzqt3));
                        if (c10854bwMCopydefault != null) {
                            java.lang.String strSSMYrx = c10854bwMCopydefault.sSMYrx();
                            java.lang.String str9 = strSSMYrx;
                            if (strSSMYrx == null) {
                                str9 = "";
                            }
                            r20 = C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listSplit$default3.size()), 1) ? (java.lang.String) listSplit$default3.get(1) : "";
                            obj12 = strOLrzqt3;
                            obj11 = str9;
                        }
                    }
                } else {
                    obj2 = listSplit$default2.get(0);
                    obj = (java.lang.String) listSplit$default2.get(1);
                    if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listSplit$default.size()), 1)) {
                    }
                }
            } else if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listSplit$default2.size()), 0)) {
                obj = (java.lang.String) listSplit$default2.get(0);
                obj2 = "";
                if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listSplit$default.size()), 1)) {
                }
            } else {
                obj = "";
                obj2 = obj;
                if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listSplit$default.size()), 1)) {
                }
            }
            java.util.List listSplit$default4 = StringsKt__StringsKt.split$default((java.lang.CharSequence) r20, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null);
            map = new java.util.HashMap();
            it = listSplit$default4.iterator();
            while (it.hasNext()) {
                java.util.List listSplit$default5 = StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new char[]{'='}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default5.size() == 2) {
                    map.put(listSplit$default5.get(0), listSplit$default5.get(1));
                }
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) map.get("token")) ? !C33129mqd.OLrzqt((java.lang.CharSequence) map.get("contractAddress")) ? !C33129mqd.OLrzqt((java.lang.CharSequence) map.get(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)) || (str2 = (java.lang.String) map.get(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)) == null : (str2 = (java.lang.String) map.get("contractAddress")) == null : (str2 = (java.lang.String) map.get("token")) == null) {
            }
            if (zContains$default) {
                str3 = str2;
            } else {
                str3 = (java.lang.String) obj;
                obj = str2;
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) map.get("network")) || !z) {
                obj13 = obj11;
                objGEmmrt = obj12;
            } else {
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(map.get("network"));
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(strGEmmrt);
                obj13 = strGEmmrt;
                objGEmmrt = C33129mqd.gEmmrt(c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.fetchVPNInfo()) : null);
            }
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) map.get("decimal"))) {
                java.lang.String str10 = (java.lang.String) map.get("decimal");
                if (str10 != null) {
                    iAhwBna = C33129mqd.AhwBna(str10);
                }
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                try {
                    try {
                        C10854bwM c10854bwM = (C10854bwM) CollectionsKt___CollectionsKt.firstOrNull(KWHzl(new TransactionInfo("", "", "", str3, "", "", obj13, null, null, null, FaceDetector.NUM_BOXES, null)));
                        iAhwBna = C33129mqd.AhwBna(c10854bwM != null ? java.lang.Integer.valueOf(c10854bwM.valueOf()) : null);
                    } catch (java.lang.Exception unused) {
                    }
                } catch (java.lang.Exception unused2) {
                }
            } else {
                C10854bwM c10854bwMCopydefault2 = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(objGEmmrt));
                iAhwBna = C33129mqd.AhwBna(c10854bwMCopydefault2 != null ? java.lang.Integer.valueOf(c10854bwMCopydefault2.valueOf()) : null);
            }
            if (!C33129mqd.valueOf(java.lang.Integer.valueOf(iAhwBna), 0) || (!C33129mqd.OLrzqt((java.lang.CharSequence) map.get(OtcExtraKeys.AMOUNT)) ? !C33129mqd.OLrzqt((java.lang.CharSequence) map.get("value")) ? !C33129mqd.OLrzqt((java.lang.CharSequence) map.get("uint256")) || (str5 = (java.lang.String) map.get("uint256")) == null || (strOLrzqt = C33129mqd.OLrzqt((java.lang.Object) str5)) == null || (strAEQbTJ = C54870xYj.AEQbTJ(strOLrzqt, iAhwBna)) == null : (str6 = (java.lang.String) map.get("value")) == null || (strOLrzqt2 = C33129mqd.OLrzqt((java.lang.Object) str6)) == null || (strAEQbTJ = C54870xYj.AEQbTJ(strOLrzqt2, iAhwBna)) == null : (str7 = (java.lang.String) map.get(OtcExtraKeys.AMOUNT)) == null || (strAEQbTJ = C33129mqd.OLrzqt((java.lang.Object) str7)) == null)) {
                strAEQbTJ = "0.0";
            }
            java.lang.String str11 = strAEQbTJ;
            java.lang.String str12 = (java.lang.String) map.get("currency");
            java.lang.String str13 = str12 != null ? "" : str12;
            str4 = (java.lang.String) map.get("valuation");
            if (str4 == null) {
                str4 = "0.00";
            }
            java.lang.String str14 = str4;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) map.get(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)) && !Intrinsics.EZpvd(obj, map.get(WalletSearchRequest.SEARCH_SOURCE_ADDRESS))) {
                obj = str;
            }
            return new TransactionInfo(str, (java.lang.String) obj2, (java.lang.String) obj, str3, str11, "", obj13, str13, str14, null, 512, null);
        }
        java.util.List listSplit$default6 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null);
        if (!listSplit$default6.isEmpty()) {
            java.util.List listSplit$default7 = StringsKt__StringsKt.split$default((java.lang.CharSequence) listSplit$default6.get(0), new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listSplit$default7.size()), 1)) {
                java.lang.String lowerCase2 = ((java.lang.String) listSplit$default7.get(0)).toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (setAhwBna.contains(lowerCase2)) {
                    obj = listSplit$default6.get(0);
                } else {
                    obj2 = listSplit$default7.get(0);
                    C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl((java.lang.String) listSplit$default7.get(0));
                    java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(c10854bwMKWHzl2 != null ? java.lang.Long.valueOf(c10854bwMKWHzl2.fetchVPNInfo()) : null);
                    java.lang.String str15 = C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt2) ? (java.lang.String) listSplit$default7.get(0) : "";
                    obj = listSplit$default7.get(1);
                    obj6 = str15;
                    obj7 = strGEmmrt2;
                    if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listSplit$default6.size()), 1)) {
                        obj3 = "";
                        obj5 = obj7;
                        obj4 = obj6;
                    } else {
                        obj3 = (java.lang.String) listSplit$default6.get(1);
                        obj5 = obj7;
                        obj4 = obj6;
                    }
                }
            } else {
                obj = listSplit$default7.get(0);
            }
            obj2 = "";
            java.lang.Object obj16 = obj2;
            obj6 = obj16;
            obj7 = obj16;
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(listSplit$default6.size()), 1)) {
            }
        } else {
            obj = "";
            obj2 = obj;
            java.lang.Object obj17 = obj2;
            java.lang.Object obj18 = obj17;
            obj3 = obj18;
            obj5 = obj17;
            obj4 = obj18;
        }
        zContains$default = false;
        obj10 = obj5;
        obj9 = obj4;
        obj8 = obj3;
        z = true;
        obj12 = obj10;
        obj11 = obj9;
        r20 = obj8;
        java.util.List listSplit$default42 = StringsKt__StringsKt.split$default((java.lang.CharSequence) r20, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null);
        map = new java.util.HashMap();
        it = listSplit$default42.iterator();
        while (it.hasNext()) {
        }
        str2 = C33129mqd.OLrzqt((java.lang.CharSequence) map.get("token")) ? "" : "";
        if (zContains$default) {
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) map.get("network"))) {
            obj13 = obj11;
            objGEmmrt = obj12;
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) map.get("decimal"))) {
        }
        if (!C33129mqd.valueOf(java.lang.Integer.valueOf(iAhwBna), 0)) {
            strAEQbTJ = "0.0";
        }
        java.lang.String str112 = strAEQbTJ;
        java.lang.String str122 = (java.lang.String) map.get("currency");
        if (str122 != null) {
        }
        str4 = (java.lang.String) map.get("valuation");
        if (str4 == null) {
        }
        java.lang.String str142 = str4;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) map.get(WalletSearchRequest.SEARCH_SOURCE_ADDRESS))) {
            obj = str;
        }
        return new TransactionInfo(str, (java.lang.String) obj2, (java.lang.String) obj, str3, str112, "", obj13, str13, str142, null, 512, null);
    }

    public final EnCodeResult EZpvd(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        if (C59449zhJ.startsWith$default(str, "new_eos_account", false, 2, null)) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() == 4) {
                java.lang.String str5 = (java.lang.String) listSplit$default.get(1);
                java.lang.String str6 = (java.lang.String) listSplit$default.get(2);
                str4 = (java.lang.String) listSplit$default.get(3);
                str3 = str6;
                str2 = str5;
            } else {
                str4 = "";
                str2 = str4;
                str3 = str2;
            }
        } else if (C59449zhJ.startsWith$default(str, "eos:new_eos_a-?", false, 2, null)) {
            java.util.HashMap<java.lang.String, java.lang.String> mapKWHzl = KWHzl((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null).get(1));
            str2 = mapKWHzl.get("accountName");
            if (str2 == null) {
                str2 = "";
            }
            str3 = mapKWHzl.get("ownerKey");
            if (str3 == null) {
                str3 = "";
            }
            str4 = mapKWHzl.get("activeKey");
            if (str4 == null) {
                str4 = "";
            }
        } else {
            return new EnCodeResult(false, false, null, 0, null, 30, null);
        }
        boolean z = C33129mqd.OLrzqt((java.lang.CharSequence) str2) && C33129mqd.OLrzqt((java.lang.CharSequence) str3) && C33129mqd.OLrzqt((java.lang.CharSequence) str4);
        return new EnCodeResult(true, z, z ? "" : "scanner.decodeError", 2, new EosOpenInfo(str2, str3, str4));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.HashMap<java.lang.String, java.lang.String> KWHzl(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null);
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        java.util.Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default2.size() == 2) {
                map.put(listSplit$default2.get(0), listSplit$default2.get(1));
            }
        }
        return map;
    }

    public final EnCodeResult djBIcL(java.lang.String str) {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (!C59449zhJ.startsWith$default(lowerCase, "http:", false, 2, null)) {
            java.lang.String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (!C59449zhJ.startsWith$default(lowerCase2, "https:", false, 2, null)) {
                return new EnCodeResult(false, false, null, 0, null, 30, null);
            }
        }
        return new EnCodeResult(true, true, null, 5, str, 4, null);
    }

    public final EnCodeResult OLrzqt(java.lang.String str) {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (!C59449zhJ.startsWith$default(lowerCase, "okx:", false, 2, null)) {
            java.lang.String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (!C59449zhJ.startsWith$default(lowerCase2, "okex:", false, 2, null)) {
                return new EnCodeResult(false, false, null, 0, null, 30, null);
            }
        }
        return new EnCodeResult(true, true, null, 6, str, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, Continuation<? super EnCodeResult> continuation) throws java.lang.Throwable {
        ScanTransactionManager$parseAppLink$1 scanTransactionManager$parseAppLink$1;
        if (continuation instanceof ScanTransactionManager$parseAppLink$1) {
            scanTransactionManager$parseAppLink$1 = (ScanTransactionManager$parseAppLink$1) continuation;
            int i = scanTransactionManager$parseAppLink$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scanTransactionManager$parseAppLink$1.label = i - Integer.MIN_VALUE;
            } else {
                scanTransactionManager$parseAppLink$1 = new ScanTransactionManager$parseAppLink$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = scanTransactionManager$parseAppLink$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = scanTransactionManager$parseAppLink$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            scanTransactionManager$parseAppLink$1.L$0 = str;
            scanTransactionManager$parseAppLink$1.label = 1;
            objOLrzqt = interfaceC43294rma.OLrzqt(str, scanTransactionManager$parseAppLink$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) scanTransactionManager$parseAppLink$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        boolean zBooleanValue = ((java.lang.Boolean) objOLrzqt).booleanValue();
        return new EnCodeResult(zBooleanValue, zBooleanValue, null, 7, str, 4, null);
    }

    public final java.util.List<C10854bwM> KWHzl(@NotNull TransactionInfo transactionInfo) {
        Intrinsics.checkNotNullParameter(transactionInfo, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String network = transactionInfo.getNetwork();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) transactionInfo.getContractAddress())) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) network)) {
                for (C10854bwM c10854bwM : C10954byG.EZpvd.valueOf().copydefault(transactionInfo.getContractAddress())) {
                    if (c10854bwM.EZpvd(network)) {
                        arrayList.add(c10854bwM);
                    }
                }
            } else {
                java.util.List<CustomChainCoinMeta> listAEQbTJ = C10598brV.AEQbTJ.AEQbTJ(transactionInfo.getContractAddress());
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                java.util.Iterator<T> it = listAEQbTJ.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CustomChainCoinMeta) it.next()).AEQbTJ());
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.addAll(arrayList2);
                }
                arrayList.addAll(C10954byG.EZpvd.valueOf().copydefault(transactionInfo.getContractAddress()));
            }
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) network)) {
            arrayList.addAll(C10954byG.EZpvd.valueOf().OLrzqt(network));
        } else {
            arrayList.addAll(C13847daM.Companion.OLrzqt(transactionInfo.getAddress()));
        }
        return arrayList;
    }
}
