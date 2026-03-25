package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.model.wallet.MpcEncryptData;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.byQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10964byQ {
    public static final MpcWalletEncodeInfo copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MpcWalletDecodeInfo mpcWalletDecodeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        java.util.HashMap map = new java.util.HashMap();
        map.put("ed25519Share2", mpcWalletDecodeInfo.getEd25519Share2());
        map.put("ed25519Share3", mpcWalletDecodeInfo.getEd25519Share3());
        map.put("ecdsaShare2", mpcWalletDecodeInfo.getEcdsaShare2());
        map.put("ecdsaShare3", mpcWalletDecodeInfo.getEcdsaShare3());
        map.put("ecdsaP2", mpcWalletDecodeInfo.getEcdsaP2());
        map.put("ecdsaP3", mpcWalletDecodeInfo.getEcdsaP3());
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(map);
        MpcWalletEncodeInfo mpcWalletEncodeInfo = new MpcWalletEncodeInfo(null, null, null, null, 0, null, null, null, null, null, null, null, null, 0, 0L, 0, 65535, null);
        mpcWalletEncodeInfo.setRootWalletId(mpcWalletDecodeInfo.getRootWalletId());
        mpcWalletEncodeInfo.setCopiedEscapeList(mpcWalletDecodeInfo.getCopiedEscapeList());
        mpcWalletEncodeInfo.setMpcId(mpcWalletDecodeInfo.getMpcId());
        mpcWalletEncodeInfo.setUid(mpcWalletDecodeInfo.getUid());
        mpcWalletEncodeInfo.setStatus(mpcWalletDecodeInfo.getStatus());
        mpcWalletEncodeInfo.setAccountName(mpcWalletDecodeInfo.getAccountName());
        mpcWalletEncodeInfo.setDisplayAccountName(mpcWalletDecodeInfo.getDisplayAccountName());
        mpcWalletEncodeInfo.setVersion(mpcWalletDecodeInfo.getVersion());
        Intrinsics.copydefault((java.lang.Object) json);
        mpcWalletEncodeInfo.setEncryptShareKey(EZpvd(str, str2, json));
        mpcWalletEncodeInfo.setEcdsaPubkey(mpcWalletDecodeInfo.getEcdsaPubkey());
        mpcWalletEncodeInfo.setEcdsaChainCode(mpcWalletDecodeInfo.getEcdsaChainCode());
        mpcWalletEncodeInfo.setEd25519Pubkey(mpcWalletDecodeInfo.getEd25519Pubkey());
        mpcWalletEncodeInfo.setEd25519ChainCode(mpcWalletDecodeInfo.getEd25519ChainCode());
        mpcWalletEncodeInfo.setEscape(mpcWalletDecodeInfo.isEscape());
        mpcWalletEncodeInfo.setMpcCreateAt(mpcWalletDecodeInfo.getMpcCreateAt());
        mpcWalletEncodeInfo.setCreateType(mpcWalletDecodeInfo.getCreateType());
        return mpcWalletEncodeInfo;
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return xXX.EZpvd.AEQbTJ(str, str2, str3, false);
    }

    public static final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return xXW.OLrzqt.AEQbTJ(str, str2, str3, false);
    }

    public static final MpcWalletDecodeInfo OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MpcWalletEncodeInfo mpcWalletEncodeInfo) {
        java.lang.String ed25519Share2;
        java.lang.String ed25519Share3;
        java.lang.String ecdsaShare2;
        java.lang.String ecdsaShare3;
        java.lang.String ecdsaP2;
        java.lang.String ecdsaP3;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mpcWalletEncodeInfo, "");
        MpcEncryptData mpcEncryptData = (MpcEncryptData) C33490mxT.EZpvd(OLrzqt(str, str2, mpcWalletEncodeInfo.getEncryptShareKey()), MpcEncryptData.class);
        MpcWalletDecodeInfo mpcWalletDecodeInfo = new MpcWalletDecodeInfo(null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0L, 0, 2097151, null);
        mpcWalletDecodeInfo.setRootWalletId(mpcWalletEncodeInfo.getRootWalletId());
        mpcWalletDecodeInfo.setCopiedEscapeList(mpcWalletEncodeInfo.getCopiedEscapeList());
        mpcWalletDecodeInfo.setMpcId(mpcWalletEncodeInfo.getMpcId());
        mpcWalletDecodeInfo.setUid(mpcWalletEncodeInfo.getUid());
        mpcWalletDecodeInfo.setStatus(mpcWalletEncodeInfo.getStatus());
        mpcWalletDecodeInfo.setVersion(mpcWalletEncodeInfo.getVersion());
        mpcWalletDecodeInfo.setAccountName(mpcWalletEncodeInfo.getAccountName());
        mpcWalletDecodeInfo.setDisplayAccountName(mpcWalletEncodeInfo.getDisplayAccountName());
        if (mpcEncryptData == null || (ed25519Share2 = mpcEncryptData.getEd25519Share2()) == null) {
            ed25519Share2 = "";
        }
        mpcWalletDecodeInfo.setEd25519Share2(ed25519Share2);
        if (mpcEncryptData == null || (ed25519Share3 = mpcEncryptData.getEd25519Share3()) == null) {
            ed25519Share3 = "";
        }
        mpcWalletDecodeInfo.setEd25519Share3(ed25519Share3);
        if (mpcEncryptData == null || (ecdsaShare2 = mpcEncryptData.getEcdsaShare2()) == null) {
            ecdsaShare2 = "";
        }
        mpcWalletDecodeInfo.setEcdsaShare2(ecdsaShare2);
        if (mpcEncryptData == null || (ecdsaShare3 = mpcEncryptData.getEcdsaShare3()) == null) {
            ecdsaShare3 = "";
        }
        mpcWalletDecodeInfo.setEcdsaShare3(ecdsaShare3);
        if (mpcEncryptData == null || (ecdsaP2 = mpcEncryptData.getEcdsaP2()) == null) {
            ecdsaP2 = "";
        }
        mpcWalletDecodeInfo.setEcdsaP2(ecdsaP2);
        if (mpcEncryptData != null && (ecdsaP3 = mpcEncryptData.getEcdsaP3()) != null) {
            str3 = ecdsaP3;
        }
        mpcWalletDecodeInfo.setEcdsaP3(str3);
        mpcWalletDecodeInfo.setEcdsaPubkey(mpcWalletEncodeInfo.getEcdsaPubkey());
        mpcWalletDecodeInfo.setEcdsaChainCode(mpcWalletEncodeInfo.getEcdsaChainCode());
        mpcWalletDecodeInfo.setEd25519Pubkey(mpcWalletEncodeInfo.getEd25519Pubkey());
        mpcWalletDecodeInfo.setEd25519ChainCode(mpcWalletEncodeInfo.getEd25519ChainCode());
        mpcWalletDecodeInfo.setEscape(mpcWalletEncodeInfo.isEscape());
        mpcWalletDecodeInfo.setMpcCreateAt(mpcWalletEncodeInfo.getMpcCreateAt());
        mpcWalletDecodeInfo.setCreateType(mpcWalletEncodeInfo.getCreateType());
        return mpcWalletDecodeInfo;
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        JsonObject jsonObjectOLrzqt;
        JsonObject jsonObjectOLrzqt2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0 || str2.length() == 0 || (jsonObjectOLrzqt = C33490mxT.OLrzqt(str)) == null || (jsonObjectOLrzqt2 = C33490mxT.OLrzqt(str2)) == null) {
            return null;
        }
        return new Gson().toJson((JsonElement) copydefault(jsonObjectOLrzqt, jsonObjectOLrzqt2));
    }

    public static final JsonObject copydefault(@NotNull JsonObject jsonObject, @NotNull JsonObject jsonObject2) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(jsonObject2, "");
        JsonObject jsonObject3 = new JsonObject();
        for (Map.Entry<java.lang.String, JsonElement> entry : jsonObject.entrySet()) {
            Intrinsics.copydefault(entry);
            jsonObject3.add(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<java.lang.String, JsonElement> entry2 : jsonObject2.entrySet()) {
            Intrinsics.copydefault(entry2);
            jsonObject3.add(entry2.getKey(), entry2.getValue());
        }
        return jsonObject3;
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        JsonObject jsonObjectOLrzqt;
        JsonElement jsonElement;
        java.lang.String asString;
        JsonElement jsonElement2;
        java.lang.String asString2;
        JsonObject jsonObjectOLrzqt2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || (jsonObjectOLrzqt = C33490mxT.OLrzqt(str)) == null || (jsonElement = jsonObjectOLrzqt.get("ecdsaShare2")) == null || (asString = jsonElement.getAsString()) == null || (jsonElement2 = jsonObjectOLrzqt.get("ed25519Share2")) == null || (asString2 = jsonElement2.getAsString()) == null || (jsonObjectOLrzqt2 = C33490mxT.OLrzqt(xYQ.KWHzl.AEQbTJ(asString, asString2))) == null) {
            return null;
        }
        return new Gson().toJson((JsonElement) copydefault(jsonObjectOLrzqt, jsonObjectOLrzqt2));
    }

    public static final MpcWalletDecodeInfo OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z) {
        JsonObject jsonObjectOLrzqt;
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (str.length() == 0 || (jsonObjectOLrzqt = C33490mxT.OLrzqt(str)) == null) {
            return null;
        }
        if (!AEQbTJ(jsonObjectOLrzqt, yDY.gEmmrt("ecdsaShare2", "ed25519Share2", "ecdsaP2", "ecdsaPublicKey", "ecdsaChainCode", "ed25519PublicKey", "ed25519ChainCode"))) {
            pUU.KWHzl("MPCShareInfo", "Missing parameters");
            return null;
        }
        java.lang.String asString = jsonObjectOLrzqt.get("ecdsaShare2").getAsString();
        java.lang.String asString2 = jsonObjectOLrzqt.get("ed25519Share2").getAsString();
        java.lang.String asString3 = jsonObjectOLrzqt.get("ecdsaP2").getAsString();
        java.lang.String asString4 = jsonObjectOLrzqt.get("ecdsaPublicKey").getAsString();
        java.lang.String asString5 = jsonObjectOLrzqt.get("ecdsaChainCode").getAsString();
        java.lang.String asString6 = jsonObjectOLrzqt.get("ed25519PublicKey").getAsString();
        java.lang.String asString7 = jsonObjectOLrzqt.get("ed25519ChainCode").getAsString();
        JsonElement jsonElement = jsonObjectOLrzqt.get("ecdsaShare3");
        java.lang.String asString8 = jsonElement != null ? jsonElement.getAsString() : null;
        JsonElement jsonElement2 = jsonObjectOLrzqt.get("ed25519Share3");
        java.lang.String asString9 = jsonElement2 != null ? jsonElement2.getAsString() : null;
        JsonElement jsonElement3 = jsonObjectOLrzqt.get("ecdsaP3");
        java.lang.String asString10 = jsonElement3 != null ? jsonElement3.getAsString() : null;
        java.util.List<java.lang.String> listGEmmrt = yDY.gEmmrt(asString8, asString9, asString10);
        if ((listGEmmrt instanceof java.util.Collection) && listGEmmrt.isEmpty()) {
            z2 = false;
        } else {
            for (java.lang.String str6 : listGEmmrt) {
                if (str6 == null || str6.length() == 0) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (z && z2) {
            return null;
        }
        int value = (z ? MpcShare2Status.SHARE2_INVALID : MpcShare2Status.SHARE2_VALID).getValue();
        if (!z) {
            asString10 = null;
        }
        java.lang.String str7 = asString10 == null ? "" : asString10;
        if (!z) {
            asString8 = null;
        }
        java.lang.String str8 = asString8 == null ? "" : asString8;
        java.lang.String str9 = z ? asString9 : null;
        java.lang.String str10 = str9 != null ? str9 : "";
        Intrinsics.copydefault((java.lang.Object) asString3);
        Intrinsics.copydefault((java.lang.Object) asString);
        Intrinsics.copydefault((java.lang.Object) asString2);
        Intrinsics.copydefault((java.lang.Object) asString4);
        Intrinsics.copydefault((java.lang.Object) asString5);
        Intrinsics.copydefault((java.lang.Object) asString6);
        Intrinsics.copydefault((java.lang.Object) asString7);
        return new MpcWalletDecodeInfo(null, null, str2, str3, value, null, str4, str5, asString2, str10, asString, str8, asString3, str7, asString4, asString5, asString6, asString7, 0, java.lang.System.currentTimeMillis(), 0, 1310755, null);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        JsonElement jsonElement;
        java.lang.String asString;
        Intrinsics.checkNotNullParameter(str, "");
        JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(str);
        return (jsonObjectOLrzqt == null || (jsonElement = jsonObjectOLrzqt.get("ChainCode")) == null || (asString = jsonElement.getAsString()) == null) ? "" : asString;
    }

    public static final boolean AEQbTJ(JsonObject jsonObject, java.util.List<java.lang.String> list) {
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!jsonObject.has((java.lang.String) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
