package o;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.ok_kyc_core.data.lca.LcaObfuscateData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rTL {
    public static final rTL OLrzqt = new rTL();
    public static final java.security.SecureRandom copydefault = java.security.SecureRandom.getInstance("SHA1PRNG");
    public static final java.util.List<java.lang.Integer> KWHzl = yDY.gEmmrt(4, 5, 7, 9, 12);
    public static final int EZpvd = 8;

    private rTL() {
    }

    public final java.lang.String EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            return "signature";
        }
        try {
            C6887aXp c6887aXp = C6887aXp.copydefault;
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return c6887aXp.EZpvd(bytes);
        } catch (java.lang.Exception e) {
            pUU.copydefault("LcaSecureUtils", "Failed to sign data: " + e.getMessage());
            return "";
        }
    }

    public static final class Application {
        public final java.util.List<java.lang.Integer> AEQbTJ;
        public final java.util.List<byte[]> EZpvd;
        public final java.util.List<java.lang.Integer> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rTL$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.EZpvd;
            }
            if ((i & 2) != 0) {
                list2 = application.AEQbTJ;
            }
            if ((i & 4) != 0) {
                list3 = application.KWHzl;
            }
            return application.copydefault(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Integer> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<byte[]> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Integer> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.util.List<byte[]> list, @NotNull java.util.List<java.lang.Integer> list2, @NotNull java.util.List<java.lang.Integer> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            return new Application(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ObfuscatedResult(chunks=" + this.EZpvd + ", order=" + this.AEQbTJ + ", noisePositions=" + this.KWHzl + ")";
        }

        public Application(@NotNull java.util.List<byte[]> list, @NotNull java.util.List<java.lang.Integer> list2, @NotNull java.util.List<java.lang.Integer> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.EZpvd = list;
            this.AEQbTJ = list2;
            this.KWHzl = list3;
        }
    }

    public final <T> LcaObfuscateData OLrzqt(@NotNull T t) {
        java.lang.String strJoinToString$default = "";
        Intrinsics.checkNotNullParameter(t, "");
        try {
            java.lang.String json = new Gson().toJson(t);
            try {
                if (json != null && json.length() != 0) {
                    int iAEQbTJ = AEQbTJ();
                    Application applicationOLrzqt = OLrzqt(json, iAEQbTJ);
                    java.lang.String strJoinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(applicationOLrzqt.KWHzl(), ",", null, null, 0, null, new Function1() { // from class: o.rTK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rTL.EZpvd((byte[]) obj);
                        }
                    }, 30, null);
                    if (!applicationOLrzqt.AEQbTJ().isEmpty()) {
                        strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(applicationOLrzqt.AEQbTJ(), ",", null, null, 0, null, null, 62, null);
                    }
                    return new LcaObfuscateData(strJoinToString$default2, java.lang.Integer.valueOf(iAEQbTJ), strJoinToString$default, CollectionsKt___CollectionsKt.joinToString$default(applicationOLrzqt.OLrzqt(), ",", null, null, 0, null, null, 62, null));
                }
                pUU.valueOf("LcaSecureUtils", "Failed to convert data to JSON");
                return null;
            } catch (java.lang.Exception e) {
                e = e;
                pUU.AEQbTJ("LcaSecureUtils", "Obfuscation failed", e);
                return null;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    public static final java.lang.CharSequence EZpvd(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(bArr, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }

    public final <T> T EZpvd(@NotNull LcaObfuscateData lcaObfuscateData, @NotNull java.lang.Class<T> cls) {
        java.util.List listSplit$default;
        java.util.List listSplit$default2;
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(lcaObfuscateData, "");
        Intrinsics.checkNotNullParameter(cls, "");
        try {
            if (!OLrzqt(lcaObfuscateData)) {
                pUU.valueOf("LcaSecureUtils", "Invalid obfuscated data");
                return null;
            }
            java.lang.String c = lcaObfuscateData.getC();
            if (c == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) c, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
            java.util.Iterator<T> it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(android.util.Base64.decode((java.lang.String) it.next(), 0));
            }
            java.lang.String o2 = lcaObfuscateData.getO();
            if (o2 == null || (listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) o2, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null) {
                return null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default2, 10));
            java.util.Iterator<T> it2 = listSplit$default2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it2.next())));
            }
            java.lang.String n = lcaObfuscateData.getN();
            if (n == null || n.length() == 0) {
                listAhwBna = yDY.AhwBna();
            } else {
                java.util.List listSplit$default3 = StringsKt__StringsKt.split$default((java.lang.CharSequence) lcaObfuscateData.getN(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default3, 10));
                java.util.Iterator<T> it3 = listSplit$default3.iterator();
                while (it3.hasNext()) {
                    listAhwBna.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it3.next())));
                }
            }
            try {
                java.lang.String strOLrzqt = OLrzqt(new Application(arrayList, arrayList2, listAhwBna));
                try {
                    return (T) new Gson().fromJson(strOLrzqt, (java.lang.Class) cls);
                } catch (JsonSyntaxException e) {
                    pUU.AEQbTJ("LcaSecureUtils", "Failed to parse JSON: " + strOLrzqt, e);
                    return null;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                pUU.AEQbTJ("LcaSecureUtils", "Deobfuscation failed", e);
                return null;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return;
        }
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            java.lang.String strEncodeToString = android.util.Base64.encodeToString(bytes, 2);
            android.content.SharedPreferences sharedPreferences = C43246rlf.OLrzqt.valueOf().getSharedPreferences("lca_secure_prefs", 0);
            Intrinsics.copydefault(sharedPreferences);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editorEdit, "");
            editorEdit.clear();
            editorEdit.apply();
            sharedPreferences.edit().putString(RemoteMessageConst.DEVICE_TOKEN, strEncodeToString).apply();
        } catch (java.lang.Exception e) {
            pUU.copydefault("LcaSecureUtils", "Failed to store device token securely: " + e.getMessage());
        }
    }

    public final java.lang.String EZpvd() {
        try {
            java.lang.String string = C43246rlf.OLrzqt.valueOf().getSharedPreferences("lca_secure_prefs", 0).getString(RemoteMessageConst.DEVICE_TOKEN, null);
            if (string != null) {
                byte[] bArrDecode = android.util.Base64.decode(string, 2);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
                return new java.lang.String(bArrDecode, Charsets.UTF_8);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("LcaSecureUtils", "Failed to retrieve device token: " + e.getMessage());
        }
        return MultiTransferSignData.DEFAULT_INTERVAL;
    }

    public final void OLrzqt() {
        try {
            android.content.SharedPreferences sharedPreferences = C43246rlf.OLrzqt.valueOf().getSharedPreferences("lca_secure_prefs", 0);
            Intrinsics.copydefault(sharedPreferences);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editorEdit, "");
            editorEdit.clear();
            editorEdit.apply();
        } catch (java.lang.Exception e) {
            pUU.copydefault("LcaSecureUtils", "Failed to clear device token: " + e.getMessage());
        }
    }

    public final int AEQbTJ() {
        java.security.SecureRandom secureRandom = copydefault;
        java.util.List<java.lang.Integer> list = KWHzl;
        return list.get(secureRandom.nextInt(list.size())).intValue();
    }

    public final Application OLrzqt(java.lang.String str, int i) {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i2 = 0;
        while (i2 < bytes.length) {
            int i3 = i2 + i;
            arrayList.add(yDT.AEQbTJ(bytes, i2, java.lang.Math.min(i3, bytes.length)));
            arrayList2.add(java.lang.Integer.valueOf(arrayList2.size()));
            i2 = i3;
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2);
        for (int size = listFJNWhG.size() - 1; size > 0; size--) {
            int iNextInt = copydefault.nextInt(size + 1);
            int iIntValue = ((java.lang.Number) listFJNWhG.get(size)).intValue();
            listFJNWhG.set(size, listFJNWhG.get(iNextInt));
            listFJNWhG.set(iNextInt, java.lang.Integer.valueOf(iIntValue));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listFJNWhG, 10));
        java.util.Iterator it = listFJNWhG.iterator();
        while (it.hasNext()) {
            arrayList3.add((byte[]) arrayList.get(((java.lang.Number) it.next()).intValue()));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add((byte[]) it2.next());
            java.security.SecureRandom secureRandom = copydefault;
            if (secureRandom.nextBoolean()) {
                byte[] bArr = new byte[i];
                secureRandom.nextBytes(bArr);
                arrayList4.add(bArr);
                arrayList5.add(java.lang.Integer.valueOf(arrayList4.size() - 1));
            }
        }
        if (arrayList5.isEmpty()) {
            byte[] bArr2 = new byte[i];
            copydefault.nextBytes(bArr2);
            arrayList4.add(bArr2);
            arrayList5.add(java.lang.Integer.valueOf(arrayList4.size() - 1));
        }
        return new Application(arrayList4, listFJNWhG, arrayList5);
    }

    public final java.lang.String OLrzqt(Application application) {
        java.util.List<byte[]> listKWHzl = application.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : listKWHzl) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            if (!application.AEQbTJ().contains(java.lang.Integer.valueOf(i2))) {
                arrayList.add(obj);
            }
            i2++;
        }
        int size = application.OLrzqt().size();
        byte[][] bArr = new byte[size][];
        for (int i3 = 0; i3 < size; i3++) {
            bArr[i3] = null;
        }
        for (java.lang.Object obj2 : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            byte[] bArr2 = (byte[]) obj2;
            if (i < application.OLrzqt().size()) {
                bArr[application.OLrzqt().get(i).intValue()] = bArr2;
            }
            i++;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(yDV.getFieldNames(bArr), "", null, null, 0, null, new Function1() { // from class: o.rTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return rTL.OLrzqt((byte[]) obj3);
            }
        }, 30, null);
    }

    public static final java.lang.CharSequence OLrzqt(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new java.lang.String(bArr, Charsets.UTF_8);
    }

    public final boolean OLrzqt(LcaObfuscateData lcaObfuscateData) {
        java.lang.String o2;
        java.util.List listAhwBna;
        try {
            java.lang.String c = lcaObfuscateData.getC();
            if (c != null && c.length() != 0 && (o2 = lcaObfuscateData.getO()) != null && o2.length() != 0 && lcaObfuscateData.getChunkSize() != null) {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) lcaObfuscateData.getC(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) lcaObfuscateData.getO(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                java.lang.String n = lcaObfuscateData.getN();
                if (n == null || n.length() == 0) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    listAhwBna = StringsKt__StringsKt.split$default((java.lang.CharSequence) lcaObfuscateData.getN(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                }
                if (!(!listSplit$default.isEmpty()) || !(!listSplit$default2.isEmpty())) {
                    return false;
                }
                if (!(listSplit$default instanceof java.util.Collection) || !listSplit$default.isEmpty()) {
                    java.util.Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        if (((java.lang.String) it.next()).length() <= 0) {
                            return false;
                        }
                    }
                }
                if (!(listSplit$default2 instanceof java.util.Collection) || !listSplit$default2.isEmpty()) {
                    java.util.Iterator it2 = listSplit$default2.iterator();
                    while (it2.hasNext()) {
                        if (StringsKt__StringNumberConversionsKt.toIntOrNull((java.lang.String) it2.next()) == null) {
                            return false;
                        }
                    }
                }
                if (!listAhwBna.isEmpty() && !listAhwBna.isEmpty()) {
                    java.util.Iterator it3 = listAhwBna.iterator();
                    while (it3.hasNext()) {
                        if (StringsKt__StringNumberConversionsKt.toIntOrNull((java.lang.String) it3.next()) == null) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("LcaSecureUtils", "Validation failed", e);
            return false;
        }
    }
}
