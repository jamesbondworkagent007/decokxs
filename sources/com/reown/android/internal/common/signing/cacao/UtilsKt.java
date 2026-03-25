package com.reown.android.internal.common.signing.cacao;

import android.util.Base64;
import com.amplifyframework.core.model.ModelIdentifier;
import com.fasterxml.jackson.core.JsonPointer;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.sign.engine.use_case.calls.GetNamespacesFromReCaps;
import com.reown.utils.UtilFunctionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56529yIt;
import o.C59449zhJ;
import o.yDY;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class UtilsKt {
    public static final /* synthetic */ String guaranteeNoHexPrefix(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.KWHzl(str, (CharSequence) UtilFunctionsKt.getHexPrefix(C56529yIt.KWHzl));
    }

    public static final /* synthetic */ Map parseReCaps(String str) throws JSONException {
        if (str == null || str.length() == 0) {
            return C56424yEw.isConnected(C56424yEw.KWHzl());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(str).getJSONObject(Cacao.Payload.ATT_KEY);
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator<String> itKeys2 = jSONObject2.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys2, "keys(...)");
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                JSONArray jSONArray = jSONObject2.getJSONArray(next2);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    Iterator<String> itKeys3 = jSONObject3.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys3, "keys(...)");
                    while (itKeys3.hasNext()) {
                        JSONObject jSONObject4 = jSONObject;
                        JSONArray jSONArray2 = jSONObject3.getJSONArray(itKeys3.next());
                        Iterator<String> it = itKeys;
                        int length2 = jSONArray2.length();
                        JSONObject jSONObject5 = jSONObject2;
                        int i2 = 0;
                        while (i2 < length2) {
                            int i3 = length2;
                            String string = jSONArray2.getString(i2);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            arrayList.add(string);
                            i2++;
                            length2 = i3;
                        }
                        itKeys = it;
                        jSONObject = jSONObject4;
                        jSONObject2 = jSONObject5;
                    }
                }
                Intrinsics.copydefault((Object) next2);
                linkedHashMap2.put(next2, arrayList);
            }
            Intrinsics.copydefault((Object) next);
            linkedHashMap.put(next, linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap3.put(entry.getKey(), C56424yEw.isConnected((Map) entry.getValue()));
        }
        return C56424yEw.isConnected(linkedHashMap3);
    }

    public static final /* synthetic */ String decodeReCaps(List list) {
        String str;
        if (list != null) {
            try {
                str = (String) CollectionsKt___CollectionsKt.AubY(list);
            } catch (Exception unused) {
                return null;
            }
        } else {
            str = null;
        }
        if (str == null || !C59449zhJ.startsWith$default(str, Cacao.Payload.RECAPS_PREFIX, false, 2, null)) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(StringsKt__StringsKt.KWHzl(str, (CharSequence) Cacao.Payload.RECAPS_PREFIX), 2);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        return new String(bArrDecode, Charsets.UTF_8);
    }

    public static final /* synthetic */ List getMethods(List list) {
        Set setKeySet;
        List listAxsJAYaxsJAY;
        Map map = (Map) parseReCaps(decodeReCaps(list)).get(GetNamespacesFromReCaps.EIP155);
        if (map == null || (setKeySet = map.keySet()) == null || (listAxsJAYaxsJAY = CollectionsKt___CollectionsKt.AxsJAYaxsJAY(setKeySet)) == null) {
            return yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAxsJAYaxsJAY, 10));
        Iterator it = listAxsJAYaxsJAY.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.substringAfter$default((String) it.next(), JsonPointer.SEPARATOR, (String) null, 2, (Object) null));
        }
        return arrayList;
    }

    public static final /* synthetic */ List getChains(List list) {
        Collection collectionValues;
        List listQOLQEE;
        List listQbewEr;
        Map map = (Map) parseReCaps(decodeReCaps(list)).get(GetNamespacesFromReCaps.EIP155);
        return (map == null || (collectionValues = map.values()) == null || (listQOLQEE = C56403yEb.QOLQEE(collectionValues)) == null || (listQbewEr = CollectionsKt___CollectionsKt.QbewEr(listQOLQEE)) == null) ? yDY.AhwBna() : listQbewEr;
    }

    public static final /* synthetic */ String mergeReCaps(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(jSONObject2, "");
        JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
        Iterator<String> itKeys = jSONObject2.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject3.has(next)) {
                jSONObject3.put(next, jSONObject2.get(next));
            } else {
                Object obj = jSONObject3.get(next);
                Object obj2 = jSONObject2.get(next);
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    jSONObject3.put(next, mergeReCaps((JSONObject) obj, (JSONObject) obj2));
                } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    jSONObject3.put(next, concatenateJsonArrays((JSONArray) obj, (JSONArray) obj2));
                } else {
                    jSONObject3.put(next, obj2);
                }
            }
        }
        String string = jSONObject3.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(string, "\\\"", ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, false, 4, (Object) null), "\"{", "{", false, 4, (Object) null), "}\"", "}", false, 4, (Object) null);
    }

    public static final JSONArray concatenateJsonArrays(JSONArray jSONArray, JSONArray jSONArray2) {
        JSONArray jSONArray3 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            jSONArray3.put(jSONArray.get(i));
        }
        int length2 = jSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            jSONArray3.put(jSONArray2.get(i2));
        }
        return jSONArray3;
    }
}
