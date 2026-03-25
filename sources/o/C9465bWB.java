package o;

import com.google.gson.GsonBuilder;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.SolanaContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMultiContractSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.solana.GenerateRawTransactionBean;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: o.bWB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9465bWB extends C9475bWL {
    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> s_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new kotlin.Pair(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C9475bWL, o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new kotlin.Pair(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.TreeMap] */
    @Override // o.C9475bWL, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new TreeMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap<java.lang.Integer, java.lang.String> linkedHashMap2 = new LinkedHashMap<>();
        java.util.HashMap map = new java.util.HashMap();
        int i = 0;
        for (java.lang.Object obj : ((SolanaMultiContractSignData) QVsKAR()).getArray()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            SolanaContractSignData solanaContractSignData = (SolanaContractSignData) obj;
            java.lang.String url = solanaContractSignData.getUrl();
            if (url != null && url.length() != 0) {
                linkedHashMap.put(java.lang.Integer.valueOf(i), solanaContractSignData);
            } else if (solanaContractSignData.getEncodeStr() != null) {
                java.lang.String encodeStr = solanaContractSignData.getEncodeStr();
                if (encodeStr == null) {
                    encodeStr = "";
                }
                java.lang.String encodeTransactionStr = solanaContractSignData.getEncodeTransactionStr();
                if (encodeTransactionStr == null) {
                    encodeTransactionStr = "";
                }
                map.put(java.lang.Integer.valueOf(i), C56390yDp.OLrzqt(encodeStr, encodeTransactionStr));
            } else {
                java.lang.String data = solanaContractSignData.getData();
                if (data == null) {
                    data = "";
                }
                linkedHashMap2.put(java.lang.Integer.valueOf(i), data);
            }
            i++;
        }
        AbstractC58260yxt<Unit> abstractC58260yxtKWHzl = KWHzl((TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>>) objectRef.element, linkedHashMap2);
        final Function1 function1 = new Function1() { // from class: o.bWC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C9465bWB.EZpvd(objectRef, this, str, (Unit) obj2);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.bWD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C9465bWB.AhwBna(function1, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bWE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C9465bWB.KWHzl(this.OLrzqt, (Triple) obj2);
            }
        };
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.bWI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C9465bWB.AYXKKw(function12, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC58261yxu AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu EZpvd(final Ref.ObjectRef objectRef, final C9465bWB c9465bWB, final java.lang.String str, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Collection<kotlin.Pair> collectionValues = ((TreeMap) objectRef.element).values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        for (kotlin.Pair pair : collectionValues) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bWF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) throws JSONException {
                C9465bWB.AEQbTJ(this.OLrzqt, str, arrayList, objectRef, arrayList2, interfaceC58257yxq);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bWG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9465bWB.copydefault(this.EZpvd, objectRef, (kotlin.Pair) obj);
            }
        };
        return abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bWH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9465bWB.gEmmrt(function1, obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(final C9465bWB c9465bWB, java.lang.String str, java.util.ArrayList arrayList, Ref.ObjectRef objectRef, java.util.ArrayList arrayList2, final InterfaceC58257yxq interfaceC58257yxq) throws JSONException {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        C9658bZj c9658bZjRcXXUw = c9465bWB.RcXXUw();
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(arrayList);
        Intrinsics.checkNotNullExpressionValue(json, "");
        final JSONArray jSONArray = new JSONArray(c9658bZjRcXXUw.EZpvd(str, json));
        int i = 0;
        if (jSONArray.length() == 0) {
            C10856bwO.copydefault("OKWSolanaSignMultiContract", 0, "go sign error");
            interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(new JSONArray(), new JSONArray()));
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Set setKeySet = ((TreeMap) objectRef.element).keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        for (java.lang.Object obj : setKeySet) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.Integer num = (java.lang.Integer) obj;
            java.util.List<SolanaContractSignData> array = ((SolanaMultiContractSignData) c9465bWB.QVsKAR()).getArray();
            Intrinsics.copydefault(num);
            SolanaContractSignData solanaContractSignData = array.get(num.intValue());
            java.lang.Object obj2 = arrayList2.get(i);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            java.lang.String str2 = (java.lang.String) obj2;
            java.lang.String string = jSONArray.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String from = solanaContractSignData.getFrom();
            java.lang.String str3 = from == null ? "" : from;
            java.lang.String bizType = solanaContractSignData.getBizType();
            java.lang.String str4 = bizType == null ? "" : bizType;
            java.util.List<java.lang.String> bizId = solanaContractSignData.getBizId();
            if (bizId == null) {
                bizId = yDY.AhwBna();
            }
            arrayList3.add(new GenerateRawTransactionBean(str2, string, str3, str4, bizId));
            i++;
        }
        c9465bWB.RcXXUw().copydefault(arrayList3, new Function1() { // from class: o.bWJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C9465bWB.copydefault(this.EZpvd, interfaceC58257yxq, jSONArray, (java.lang.String) obj3);
            }
        });
    }

    public static final Unit copydefault(C9465bWB c9465bWB, InterfaceC58257yxq interfaceC58257yxq, JSONArray jSONArray, java.lang.String str) throws java.lang.Throwable {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(new JSONArray(str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(objM7377constructorimpl, jSONArray));
        } else {
            C10856bwO.copydefault("SolMultiSignHandler", 0, "JS sign error");
            interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(new JSONArray(), new JSONArray()));
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu copydefault(C9465bWB c9465bWB, Ref.ObjectRef objectRef, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((JSONArray) pair.getFirst()).length() == 0) {
            return AbstractC58260yxt.copydefault(new Triple(-5005, new JSONArray(), new JSONArray()));
        }
        JSONArray jSONArray = (JSONArray) pair.getFirst();
        JSONArray jSONArray2 = (JSONArray) pair.getSecond();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        java.util.Iterator<java.lang.Integer> it = yDY.valueOf((java.util.Collection<?>) ((SolanaMultiContractSignData) c9465bWB.QVsKAR()).getArray()).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((TreeMap) objectRef.element).containsKey(java.lang.Integer.valueOf(((AbstractC56415yEn) it).nextInt()))) {
                jSONArray3.put(jSONArray.getString(i));
                jSONArray4.put(jSONArray2.getString(i));
                i++;
            } else {
                jSONArray3.put("");
                jSONArray4.put("");
            }
        }
        return AbstractC58260yxt.copydefault(new Triple(-5001, jSONArray3, jSONArray4));
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C9465bWB c9465bWB, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        return c9465bWB.copydefault((Triple<java.lang.Integer, ? extends JSONArray, ? extends JSONArray>) triple);
    }

    public final AbstractC58260yxt<Unit> KWHzl(@NotNull final TreeMap<java.lang.Integer, kotlin.Pair<java.lang.String, java.lang.String>> treeMap, @NotNull final LinkedHashMap<java.lang.Integer, java.lang.String> linkedHashMap) {
        Intrinsics.checkNotNullParameter(treeMap, "");
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        if (!linkedHashMap.isEmpty()) {
            AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.bWO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58259yxs
                public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                    C9465bWB.copydefault(this.copydefault, treeMap, linkedHashMap, interfaceC58257yxq);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
            return abstractC58260yxtOLrzqt;
        }
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final void copydefault(C9465bWB c9465bWB, TreeMap treeMap, LinkedHashMap linkedHashMap, InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        c9465bWB.RcXXUw().OLrzqt(interfaceC58257yxq, "", treeMap, "", linkedHashMap, null, false, false);
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AxsJAYsNCnLh() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new kotlin.Pair(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }
}
