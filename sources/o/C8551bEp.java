package o;

import com.okinc.business.defi.biz.constant.KYSAssetType;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.net.bean.AmountDetail;
import com.okinc.business.defi.biz.net.bean.Asset;
import com.okinc.business.defi.biz.net.bean.AssetsDiff;
import com.okinc.business.defi.biz.net.bean.AssetsDiffInfo;
import com.okinc.business.defi.biz.net.bean.BlackTagItemRes;
import com.okinc.business.defi.biz.net.bean.BlackTagRes;
import com.okinc.business.defi.biz.net.bean.ExposureInfo;
import com.okinc.business.defi.biz.net.bean.Exposures;
import com.okinc.business.defi.biz.net.bean.Intention;
import com.okinc.business.defi.biz.net.bean.IntentionContract;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import com.okinc.business.defi.biz.net.bean.Spender;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bEp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8551bEp {
    public final OKWBaseTransaction<?> EZpvd;

    public C8551bEp(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        this.EZpvd = oKWBaseTransaction;
    }

    /* JADX WARN: Removed duplicated region for block: B:291:0x0753  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final KYSPreTxCheckInfo AEQbTJ(@NotNull TxToastCheckRes txToastCheckRes) {
        java.lang.String strEncodeToString;
        java.util.List<Intention> contract;
        java.util.List<BlackTagItemRes> approveAddress;
        java.util.List<BlackTagItemRes> to;
        Spender spender;
        java.util.Collection<Spender> collectionValues;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(txToastCheckRes, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Map<java.lang.String, java.util.List<AssetsDiff>> assetsDiffs = txToastCheckRes.getAssetsDiffs();
        if (assetsDiffs != null) {
            for (Map.Entry<java.lang.String, java.util.List<AssetsDiff>> entry : assetsDiffs.entrySet()) {
                java.lang.String key = entry.getKey();
                java.util.List<AssetsDiff> value = entry.getValue();
                if (C59449zhJ.OLrzqt((java.lang.CharSequence) key, (java.lang.CharSequence) this.EZpvd.htlTjW(), true)) {
                    arrayList.addAll(value);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            Asset asset = ((AssetsDiff) obj).getAsset();
            if (asset != null) {
                java.lang.Integer assetType = asset.getAssetType();
                int value2 = KYSAssetType.NATIVE_TYPE.getValue();
                if (assetType != null && assetType.intValue() == value2) {
                    arrayList3.add(obj);
                }
            }
        }
        java.util.ArrayList<AssetsDiff> arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList3) {
            java.lang.String diff = ((AssetsDiff) obj2).getDiff();
            if (diff != null && C59449zhJ.startsWith$default(diff, "-", false, 2, null)) {
                arrayList4.add(obj2);
            }
        }
        java.util.List<AssetsDiffInfo> arrayList5 = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayList4, 10));
        for (AssetsDiff assetsDiff : arrayList4) {
            Asset asset2 = assetsDiff.getAsset();
            java.lang.String diff2 = assetsDiff.getDiff();
            java.lang.String diffUsdValue = assetsDiff.getDiffUsdValue();
            java.util.List<AmountDetail> out = assetsDiff.getOut();
            arrayList5.add(new AssetsDiffInfo(asset2, diff2, diffUsdValue, out != null ? (AmountDetail) CollectionsKt___CollectionsKt.firstOrNull(out) : null));
        }
        arrayList2.addAll(copydefault(arrayList5, KYSAssetType.NATIVE_TYPE.getValue()));
        java.util.List listGEmmrt = yDY.gEmmrt(java.lang.Integer.valueOf(KYSAssetType.TOKEN_TYPE.getValue()), java.lang.Integer.valueOf(KYSAssetType.OTHER_TYPE.getValue()));
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            Asset asset3 = ((AssetsDiff) obj3).getAsset();
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), asset3 != null ? asset3.getAssetType() : null)) {
                arrayList6.add(obj3);
            }
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        for (AssetsDiff assetsDiff2 : CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) arrayList, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList6)), (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList3))) {
            java.util.List<AmountDetail> in = assetsDiff2.getIn();
            if (in != null) {
                for (AmountDetail amountDetail : in) {
                    Asset asset4 = assetsDiff2.getAsset();
                    java.lang.String tokenNum = amountDetail.getTokenNum();
                    arrayList7.add(new AssetsDiffInfo(asset4, tokenNum == null ? "0" : tokenNum, (java.lang.String) null, amountDetail, 4, (DefaultConstructorMarker) null));
                }
                Unit unit2 = Unit.INSTANCE;
            }
            java.util.List<AmountDetail> out2 = assetsDiff2.getOut();
            if (out2 != null) {
                for (AmountDetail amountDetail2 : out2) {
                    Asset asset5 = assetsDiff2.getAsset();
                    java.lang.String tokenNum2 = amountDetail2.getTokenNum();
                    if (tokenNum2 == null) {
                        tokenNum2 = "0";
                    }
                    arrayList7.add(new AssetsDiffInfo(asset5, "-" + tokenNum2, (java.lang.String) null, amountDetail2, 4, (DefaultConstructorMarker) null));
                }
                Unit unit3 = Unit.INSTANCE;
            }
        }
        java.util.ArrayList<AssetsDiff> arrayList8 = new java.util.ArrayList();
        for (java.lang.Object obj4 : arrayList6) {
            java.lang.String diff3 = ((AssetsDiff) obj4).getDiff();
            if (diff3 != null && C59449zhJ.startsWith$default(diff3, "-", false, 2, null)) {
                arrayList8.add(obj4);
            }
        }
        java.util.List<AssetsDiffInfo> arrayList9 = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayList8, 10));
        for (AssetsDiff assetsDiff3 : arrayList8) {
            Asset asset6 = assetsDiff3.getAsset();
            java.lang.String diff4 = assetsDiff3.getDiff();
            java.lang.String diffUsdValue2 = assetsDiff3.getDiffUsdValue();
            java.util.List<AmountDetail> out3 = assetsDiff3.getOut();
            arrayList9.add(new AssetsDiffInfo(asset6, diff4, diffUsdValue2, out3 != null ? (AmountDetail) CollectionsKt___CollectionsKt.firstOrNull(out3) : null));
        }
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.util.Iterator it = arrayList7.iterator();
        while (it.hasNext()) {
            java.lang.Object next2 = it.next();
            java.lang.String diff5 = ((AssetsDiffInfo) next2).getDiff();
            java.util.Iterator it2 = it;
            if (diff5 != null && C59449zhJ.startsWith$default(diff5, "-", false, 2, null)) {
                arrayList10.add(next2);
            }
            it = it2;
        }
        arrayList2.addAll(copydefault(arrayList9, KYSAssetType.TOKEN_TYPE.getValue()));
        arrayList2.addAll(copydefault(arrayList9, KYSAssetType.OTHER_TYPE.getValue()));
        arrayList2.addAll(copydefault(arrayList10, KYSAssetType.NFT_TYPE.getValue()));
        java.util.List<AssetsDiff> listGEmmrt2 = CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) arrayList6, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList8));
        java.util.List<AssetsDiffInfo> arrayList11 = new java.util.ArrayList<>(C56403yEb.AYXKKw(listGEmmrt2, 10));
        for (AssetsDiff assetsDiff4 : listGEmmrt2) {
            Asset asset7 = assetsDiff4.getAsset();
            java.lang.String diff6 = assetsDiff4.getDiff();
            java.lang.String diffUsdValue3 = assetsDiff4.getDiffUsdValue();
            java.util.List<AmountDetail> in2 = assetsDiff4.getIn();
            arrayList11.add(new AssetsDiffInfo(asset7, diff6, diffUsdValue3, in2 != null ? (AmountDetail) CollectionsKt___CollectionsKt.firstOrNull(in2) : null));
        }
        java.util.List<AssetsDiff> listGEmmrt3 = CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) arrayList3, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList4));
        java.util.List<AssetsDiffInfo> arrayList12 = new java.util.ArrayList<>(C56403yEb.AYXKKw(listGEmmrt3, 10));
        for (AssetsDiff assetsDiff5 : listGEmmrt3) {
            Asset asset8 = assetsDiff5.getAsset();
            java.lang.String diff7 = assetsDiff5.getDiff();
            java.lang.String diffUsdValue4 = assetsDiff5.getDiffUsdValue();
            java.util.List<AmountDetail> in3 = assetsDiff5.getIn();
            arrayList12.add(new AssetsDiffInfo(asset8, diff7, diffUsdValue4, in3 != null ? (AmountDetail) CollectionsKt___CollectionsKt.firstOrNull(in3) : null));
        }
        arrayList2.addAll(copydefault(arrayList12, KYSAssetType.NATIVE_TYPE.getValue()));
        arrayList2.addAll(copydefault(arrayList11, KYSAssetType.TOKEN_TYPE.getValue()));
        arrayList2.addAll(copydefault(arrayList11, KYSAssetType.OTHER_TYPE.getValue()));
        arrayList2.addAll(copydefault(CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) arrayList7, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList10)), KYSAssetType.NFT_TYPE.getValue()));
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        java.util.Map<java.lang.String, java.util.List<Exposures>> exposures = txToastCheckRes.getExposures();
        if (exposures != null) {
            for (Map.Entry<java.lang.String, java.util.List<Exposures>> entry2 : exposures.entrySet()) {
                java.lang.String key2 = entry2.getKey();
                java.util.List<Exposures> value3 = entry2.getValue();
                if (C59449zhJ.OLrzqt((java.lang.CharSequence) key2, (java.lang.CharSequence) this.EZpvd.htlTjW(), true)) {
                    arrayList13.addAll(value3);
                }
            }
            Unit unit4 = Unit.INSTANCE;
        }
        java.util.ArrayList<Exposures> arrayList14 = new java.util.ArrayList();
        for (java.lang.Object obj5 : arrayList13) {
            java.util.Map<java.lang.String, Spender> spenders = ((Exposures) obj5).getSpenders();
            if (spenders == null || (collectionValues = spenders.values()) == null) {
                spender = null;
            } else {
                java.util.Iterator<T> it3 = collectionValues.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    java.lang.String approvalRaw = ((Spender) next).getApprovalRaw();
                    if (approvalRaw != null && C59449zhJ.startsWith$default(approvalRaw, "-", false, 2, null)) {
                        break;
                    }
                }
                spender = (Spender) next;
            }
            if (spender != null) {
                arrayList14.add(obj5);
            }
        }
        java.util.ArrayList arrayList15 = new java.util.ArrayList();
        java.util.List<ExposureInfo> arrayList16 = new java.util.ArrayList<>();
        java.util.List<ExposureInfo> arrayList17 = new java.util.ArrayList<>();
        java.util.List<ExposureInfo> arrayList18 = new java.util.ArrayList<>();
        java.util.List<ExposureInfo> arrayList19 = new java.util.ArrayList<>();
        for (Exposures exposures2 : arrayList14) {
            Asset asset9 = exposures2.getAsset();
            java.lang.Integer assetType2 = asset9 != null ? asset9.getAssetType() : null;
            int value4 = KYSAssetType.NATIVE_TYPE.getValue();
            if (assetType2 != null && assetType2.intValue() == value4) {
                arrayList16.addAll(copydefault(exposures2));
            } else {
                int value5 = KYSAssetType.TOKEN_TYPE.getValue();
                if (assetType2 != null && assetType2.intValue() == value5) {
                    arrayList17.addAll(copydefault(exposures2));
                } else {
                    int value6 = KYSAssetType.OTHER_TYPE.getValue();
                    if (assetType2 != null && assetType2.intValue() == value6) {
                        arrayList19.addAll(copydefault(exposures2));
                    } else {
                        int value7 = KYSAssetType.NFT_TYPE.getValue();
                        if (assetType2 != null && assetType2.intValue() == value7) {
                            arrayList18.addAll(copydefault(exposures2));
                        }
                    }
                }
            }
        }
        arrayList15.addAll(EZpvd(arrayList16));
        arrayList15.addAll(EZpvd(arrayList17));
        arrayList15.addAll(EZpvd(arrayList19));
        arrayList15.addAll(EZpvd(arrayList18));
        java.util.List<Exposures> listGEmmrt4 = CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) arrayList13, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList14));
        java.util.List<ExposureInfo> arrayList20 = new java.util.ArrayList<>();
        java.util.List<ExposureInfo> arrayList21 = new java.util.ArrayList<>();
        java.util.List<ExposureInfo> arrayList22 = new java.util.ArrayList<>();
        java.util.List<ExposureInfo> arrayList23 = new java.util.ArrayList<>();
        for (Exposures exposures3 : listGEmmrt4) {
            Asset asset10 = exposures3.getAsset();
            java.lang.Integer assetType3 = asset10 != null ? asset10.getAssetType() : null;
            int value8 = KYSAssetType.NATIVE_TYPE.getValue();
            if (assetType3 != null && assetType3.intValue() == value8) {
                arrayList20.addAll(copydefault(exposures3));
            } else {
                int value9 = KYSAssetType.TOKEN_TYPE.getValue();
                if (assetType3 != null && assetType3.intValue() == value9) {
                    arrayList21.addAll(copydefault(exposures3));
                } else {
                    int value10 = KYSAssetType.OTHER_TYPE.getValue();
                    if (assetType3 != null && assetType3.intValue() == value10) {
                        arrayList23.addAll(copydefault(exposures3));
                    } else {
                        int value11 = KYSAssetType.NFT_TYPE.getValue();
                        if (assetType3 != null && assetType3.intValue() == value11) {
                            arrayList22.addAll(copydefault(exposures3));
                        }
                    }
                }
            }
        }
        arrayList15.addAll(EZpvd(arrayList20));
        arrayList15.addAll(EZpvd(arrayList21));
        arrayList15.addAll(EZpvd(arrayList23));
        arrayList15.addAll(EZpvd(arrayList22));
        java.util.ArrayList arrayList24 = new java.util.ArrayList();
        java.util.ArrayList arrayList25 = new java.util.ArrayList();
        BlackTagRes blackTag = txToastCheckRes.getBlackTag();
        if (blackTag != null && (to = blackTag.getTo()) != null) {
            java.util.ArrayList<BlackTagItemRes> arrayList26 = new java.util.ArrayList();
            for (java.lang.Object obj6 : to) {
                BlackTagItemRes blackTagItemRes = (BlackTagItemRes) obj6;
                java.lang.Boolean boolIsBlack = blackTagItemRes.isBlack();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (Intrinsics.EZpvd(boolIsBlack, bool) || Intrinsics.EZpvd(blackTagItemRes.isSimilar(), bool)) {
                    arrayList26.add(obj6);
                }
            }
            for (BlackTagItemRes blackTagItemRes2 : arrayList26) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) blackTagItemRes2.getAddress())) {
                    java.lang.Boolean boolIsBlack2 = blackTagItemRes2.isBlack();
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    if (Intrinsics.EZpvd(boolIsBlack2, bool2)) {
                        if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList24), blackTagItemRes2.getAddress())) {
                            java.lang.String address = blackTagItemRes2.getAddress();
                            Intrinsics.copydefault((java.lang.Object) address);
                            arrayList24.add(address);
                        }
                    } else if (Intrinsics.EZpvd(blackTagItemRes2.isSimilar(), bool2) && !CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList25), blackTagItemRes2.getAddress())) {
                        java.lang.String address2 = blackTagItemRes2.getAddress();
                        Intrinsics.copydefault((java.lang.Object) address2);
                        arrayList25.add(address2);
                    }
                }
            }
            Unit unit5 = Unit.INSTANCE;
        }
        BlackTagRes blackTag2 = txToastCheckRes.getBlackTag();
        if (blackTag2 != null && (approveAddress = blackTag2.getApproveAddress()) != null) {
            java.util.ArrayList<BlackTagItemRes> arrayList27 = new java.util.ArrayList();
            for (java.lang.Object obj7 : approveAddress) {
                BlackTagItemRes blackTagItemRes3 = (BlackTagItemRes) obj7;
                java.lang.Boolean boolIsBlack3 = blackTagItemRes3.isBlack();
                java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                if (Intrinsics.EZpvd(boolIsBlack3, bool3) || Intrinsics.EZpvd(blackTagItemRes3.isSimilar(), bool3)) {
                    arrayList27.add(obj7);
                }
            }
            for (BlackTagItemRes blackTagItemRes4 : arrayList27) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) blackTagItemRes4.getAddress())) {
                    java.lang.Boolean boolIsBlack4 = blackTagItemRes4.isBlack();
                    java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
                    if (Intrinsics.EZpvd(boolIsBlack4, bool4)) {
                        if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList24), blackTagItemRes4.getAddress())) {
                            java.lang.String address3 = blackTagItemRes4.getAddress();
                            Intrinsics.copydefault((java.lang.Object) address3);
                            arrayList24.add(address3);
                        }
                    } else if (Intrinsics.EZpvd(blackTagItemRes4.isSimilar(), bool4) && !CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList25), blackTagItemRes4.getAddress())) {
                        java.lang.String address4 = blackTagItemRes4.getAddress();
                        Intrinsics.copydefault((java.lang.Object) address4);
                        arrayList25.add(address4);
                    }
                }
            }
            Unit unit6 = Unit.INSTANCE;
        }
        IntentionContract intention = txToastCheckRes.getIntention();
        Intention intention2 = (intention == null || (contract = intention.getContract()) == null) ? null : (Intention) CollectionsKt___CollectionsKt.firstOrNull(contract);
        java.lang.String methodName = intention2 != null ? intention2.getMethodName() : null;
        if (intention2 != null) {
            if (methodName == null || methodName.length() == 0) {
                strEncodeToString = null;
            } else {
                Json jsonJson$default = JsonKt.Json$default(null, new Function1() { // from class: o.bEn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj8) {
                        return C8551bEp.AEQbTJ((JsonBuilder) obj8);
                    }
                }, 1, null);
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.openPanel);
                jsonJson$default.getSerializersModule();
                JsonElement.Companion companion = JsonElement.Companion;
                java.util.Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt(strAYXKKw, jsonJson$default.decodeFromString(companion.serializer(), methodName)));
                JsonElement methodParameter = intention2.getMethodParameter();
                if (methodParameter != null) {
                    mapDjBIcL.put(C33070mpX.AYXKKw(C13754dXa.FragmentManager.performPanelShortcut), methodParameter);
                    Unit unit7 = Unit.INSTANCE;
                }
                strEncodeToString = jsonJson$default.encodeToString(BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl), companion.serializer()), mapDjBIcL);
            }
            intention2.setFormatMethodNameAndParameter(strEncodeToString);
            Unit unit8 = Unit.INSTANCE;
        }
        java.util.ArrayList arrayList28 = new java.util.ArrayList();
        for (java.lang.Object obj8 : arrayList2) {
            AssetsDiffInfo assetsDiffInfo = (AssetsDiffInfo) obj8;
            Asset asset11 = assetsDiffInfo.getAsset();
            if (asset11 != null) {
                java.lang.Integer assetType4 = asset11.getAssetType();
                int value12 = KYSAssetType.NFT_TYPE.getValue();
                if (assetType4 == null || assetType4.intValue() != value12) {
                    if (C33129mqd.AhwBna(AEQbTJ(assetsDiffInfo.getDiff()), "0")) {
                    }
                }
                arrayList28.add(obj8);
            }
        }
        return new KYSPreTxCheckInfo(arrayList28, arrayList15, arrayList24, arrayList25, txToastCheckRes.getStrategy(), txToastCheckRes.getCauseRiskItem(), txToastCheckRes.getSolanaPayFee(), intention2, txToastCheckRes.getBlackAddressWarning(), txToastCheckRes.getAuthQuantityInfo());
    }

    /* JADX INFO: renamed from: o.bEp$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C8551bEp.this.AEQbTJ(((AssetsDiffInfo) t2).getDiff()), C8551bEp.this.AEQbTJ(((AssetsDiffInfo) t).getDiff()));
        }
    }

    /* JADX INFO: renamed from: o.bEp$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(T t, T t2) {
            BigDecimal bigDecimalEZpvd;
            java.lang.String strOLrzqt;
            java.lang.String strOLrzqt2;
            Spender spenderValue = ((ExposureInfo) t2).getSpenderValue();
            BigDecimal bigDecimalEZpvd2 = null;
            java.lang.String approvalRaw = spenderValue != null ? spenderValue.getApprovalRaw() : null;
            if (approvalRaw != null && C59449zhJ.startsWith$default(approvalRaw, "-", false, 2, null)) {
                if (approvalRaw != null) {
                    approvalRaw = approvalRaw.substring(1);
                    Intrinsics.checkNotNullExpressionValue(approvalRaw, "");
                } else {
                    approvalRaw = null;
                }
            }
            if (approvalRaw == null || !C9700baY.EZpvd(approvalRaw)) {
                bigDecimalEZpvd = approvalRaw != null ? C33129mqd.EZpvd(approvalRaw) : null;
            } else if (approvalRaw != null && (strOLrzqt2 = C33491mxU.OLrzqt(approvalRaw)) != null) {
                bigDecimalEZpvd = C33129mqd.EZpvd(strOLrzqt2);
            }
            Spender spenderValue2 = ((ExposureInfo) t).getSpenderValue();
            java.lang.String approvalRaw2 = spenderValue2 != null ? spenderValue2.getApprovalRaw() : null;
            if (approvalRaw2 != null && C59449zhJ.startsWith$default(approvalRaw2, "-", false, 2, null)) {
                if (approvalRaw2 != null) {
                    approvalRaw2 = approvalRaw2.substring(1);
                    Intrinsics.checkNotNullExpressionValue(approvalRaw2, "");
                } else {
                    approvalRaw2 = null;
                }
            }
            if (approvalRaw2 == null || !C9700baY.EZpvd(approvalRaw2)) {
                if (approvalRaw2 != null) {
                    bigDecimalEZpvd2 = C33129mqd.EZpvd(approvalRaw2);
                }
            } else if (approvalRaw2 != null && (strOLrzqt = C33491mxU.OLrzqt(approvalRaw2)) != null) {
                bigDecimalEZpvd2 = C33129mqd.EZpvd(strOLrzqt);
            }
            return yET.KWHzl(bigDecimalEZpvd, bigDecimalEZpvd2);
        }
    }

    public static final Unit AEQbTJ(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setPrettyPrint(true);
        return Unit.INSTANCE;
    }

    public final java.util.List<ExposureInfo> copydefault(Exposures exposures) {
        java.util.Map<java.lang.String, Spender> spenders = exposures.getSpenders();
        if (spenders == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(spenders.size());
        for (Map.Entry<java.lang.String, Spender> entry : spenders.entrySet()) {
            arrayList.add(new ExposureInfo(exposures.getAsset(), entry.getKey(), entry.getValue(), exposures.getExpiration()));
        }
        return arrayList;
    }

    public final BigDecimal AEQbTJ(java.lang.String str) {
        if (str != null && C59449zhJ.startsWith$default(str, "-", false, 2, null)) {
            str = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        if (str != null && C9700baY.EZpvd(str)) {
            return C33129mqd.EZpvd(C33491mxU.OLrzqt(str));
        }
        return C33129mqd.EZpvd(str);
    }

    public final java.util.List<ExposureInfo> EZpvd(java.util.List<ExposureInfo> list) {
        return CollectionsKt___CollectionsKt.EZpvd(list, new Application());
    }

    public final java.util.List<AssetsDiffInfo> copydefault(java.util.List<AssetsDiffInfo> list, int i) {
        java.lang.Integer assetType;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            Asset asset = ((AssetsDiffInfo) obj).getAsset();
            if (((asset == null || (assetType = asset.getAssetType()) == null) ? KYSAssetType.TOKEN_TYPE.getValue() : assetType.intValue()) == i) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.EZpvd(arrayList, new ActionBar());
    }
}
