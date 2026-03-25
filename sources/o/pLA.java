package o;

import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.lifecycle.impl.deeplink.core.H5ToDeeplinkMapperImpl$getDeepLink$1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pLA implements InterfaceC38091pLx {
    public final pLH AEQbTJ;
    public final java.lang.String EZpvd;
    public final InterfaceC38117pMw KWHzl;

    @yCM
    public pLA(@NotNull InterfaceC38117pMw interfaceC38117pMw, @NotNull pLH plh) {
        Intrinsics.checkNotNullParameter(interfaceC38117pMw, "");
        Intrinsics.checkNotNullParameter(plh, "");
        this.KWHzl = interfaceC38117pMw;
        this.AEQbTJ = plh;
        this.EZpvd = "UrlProcessorImpl";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[Catch: Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:12:0x0032, B:26:0x006f, B:28:0x0073, B:29:0x0079), top: B:37:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #1 {Exception -> 0x0036, blocks: (B:12:0x0032, B:26:0x006f, B:28:0x0073, B:29:0x0079), top: B:37:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC38091pLx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        H5ToDeeplinkMapperImpl$getDeepLink$1 h5ToDeeplinkMapperImpl$getDeepLink$1;
        pLA pla;
        java.net.URI uri;
        C38092pLy c38092pLy;
        if (continuation instanceof H5ToDeeplinkMapperImpl$getDeepLink$1) {
            h5ToDeeplinkMapperImpl$getDeepLink$1 = (H5ToDeeplinkMapperImpl$getDeepLink$1) continuation;
            int i = h5ToDeeplinkMapperImpl$getDeepLink$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h5ToDeeplinkMapperImpl$getDeepLink$1.label = i - Integer.MIN_VALUE;
            } else {
                h5ToDeeplinkMapperImpl$getDeepLink$1 = new H5ToDeeplinkMapperImpl$getDeepLink$1(this, continuation);
            }
        }
        java.lang.Object obj = h5ToDeeplinkMapperImpl$getDeepLink$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = h5ToDeeplinkMapperImpl$getDeepLink$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri = (java.net.URI) h5ToDeeplinkMapperImpl$getDeepLink$1.L$2;
            pla = (pLA) h5ToDeeplinkMapperImpl$getDeepLink$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                c38092pLy = (C38092pLy) obj;
                if (c38092pLy != null) {
                    java.lang.String str2 = pla.EZpvd;
                    Objects.toString(uri);
                    return null;
                }
                return pla.AEQbTJ(uri, c38092pLy);
            } catch (java.lang.Exception e) {
                e = e;
                java.lang.String str3 = pla.EZpvd;
                e.getMessage();
                return null;
            }
        }
        C56391yDq.AEQbTJ(obj);
        try {
            if (!this.AEQbTJ.copydefault(str)) {
                return null;
            }
            java.net.URI uri2 = new java.net.URI(str);
            InterfaceC38117pMw interfaceC38117pMw = this.KWHzl;
            java.lang.String path = uri2.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "");
            h5ToDeeplinkMapperImpl$getDeepLink$1.L$0 = this;
            h5ToDeeplinkMapperImpl$getDeepLink$1.L$1 = str;
            h5ToDeeplinkMapperImpl$getDeepLink$1.L$2 = uri2;
            h5ToDeeplinkMapperImpl$getDeepLink$1.label = 1;
            java.lang.Object objCopydefault2 = interfaceC38117pMw.copydefault(path, h5ToDeeplinkMapperImpl$getDeepLink$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            pla = this;
            obj = objCopydefault2;
            uri = uri2;
            c38092pLy = (C38092pLy) obj;
            if (c38092pLy != null) {
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            pla = this;
            java.lang.String str32 = pla.EZpvd;
            e.getMessage();
            return null;
        }
    }

    @Override // o.InterfaceC38091pLx
    public java.lang.String AEQbTJ(@NotNull java.net.URI uri, @NotNull C38092pLy c38092pLy) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(c38092pLy, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) c38092pLy.KWHzl(), new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() > 1) {
            java.lang.String query = uri.getQuery();
            Intrinsics.checkNotNullExpressionValue(query, "");
            if (query.length() > 0) {
                java.lang.String query2 = uri.getQuery();
                Intrinsics.checkNotNullExpressionValue(query2, "");
                copydefault(query2, (java.lang.String) listSplit$default.get(1), linkedHashMap);
            }
        }
        if (c38092pLy.KWHzl().length() > 0) {
            java.lang.String path = uri.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "");
            AEQbTJ(path, c38092pLy, linkedHashMap);
        }
        if (linkedHashMap.isEmpty()) {
            return c38092pLy.OLrzqt() + (C33129mqd.OLrzqt((java.lang.CharSequence) uri.getQuery()) ? "?" + uri.getQuery() : "");
        }
        java.lang.String strOLrzqt = c38092pLy.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        for (Map.Entry<java.lang.String, java.lang.String> entry : linkedHashMap.entrySet()) {
            arrayList.add(((java.lang.Object) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((java.lang.Object) entry.getValue()));
        }
        return strOLrzqt + "?" + CollectionsKt___CollectionsKt.joinToString$default(arrayList, ContainerUtils.FIELD_DELIMITER, null, null, 0, null, null, 62, null) + (C33129mqd.OLrzqt((java.lang.CharSequence) uri.getQuery()) ? ContainerUtils.FIELD_DELIMITER + uri.getQuery() : "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: java.util.Map<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSplit$default) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (java.lang.Object) null);
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.lang.String) listSplit$default2.get(0), (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(KWHzl((java.lang.String) listSplit$default2.get(1))));
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        java.util.List listSplit$default3 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listSplit$default3) {
            if (((java.lang.String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList2, 10)), 16));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            java.util.List listSplit$default4 = StringsKt__StringsKt.split$default((java.lang.CharSequence) it2.next(), new java.lang.String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (java.lang.Object) null);
            kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt((java.lang.String) listSplit$default4.get(0), (java.lang.String) listSplit$default4.get(1));
            linkedHashMap2.put(pairOLrzqt2.getFirst(), pairOLrzqt2.getSecond());
        }
        for (java.lang.String str3 : CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) linkedHashMap2.keySet(), (java.lang.Iterable) linkedHashMap.keySet())) {
            if (linkedHashMap.get(str3) != null && linkedHashMap2.get(str3) != null) {
                map.put(linkedHashMap.getOrDefault(str3, ""), linkedHashMap2.getOrDefault(str3, ""));
            }
        }
    }

    public final void AEQbTJ(java.lang.String str, C38092pLy c38092pLy, java.util.Map<java.lang.String, java.lang.String> map) {
        if (KWHzl(c38092pLy.KWHzl()).isEmpty()) {
            return;
        }
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(StringsKt__StringsKt.split$default((java.lang.CharSequence) c38092pLy.KWHzl(), new java.lang.String[]{"?"}, false, 0, 6, (java.lang.Object) null));
        java.lang.String strSubstring = str2.substring(StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str2, "{", 0, false, 6, (java.lang.Object) null), (str2.length() - (str2.length() - StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) str2, "}", 0, false, 6, (java.lang.Object) null))) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.Object objAubY = CollectionsKt___CollectionsKt.AubY(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{c38092pLy.EZpvd()}, false, 0, 6, (java.lang.Object) null));
        Regex regex = new Regex("\\{([^}]+)\\}");
        java.util.List<java.lang.String> listKWHzl = KWHzl(strSubstring);
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) regex.replace(strSubstring, " "), new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSplit$default) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) obj)) {
                arrayList.add(obj);
            }
        }
        int i = 0;
        for (java.lang.Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) objAubY, new java.lang.String[]{(java.lang.String) obj2}, false, 0, 6, (java.lang.Object) null);
            java.lang.String str3 = (java.lang.String) listSplit$default2.get(0);
            java.lang.String str4 = (java.lang.String) listSplit$default2.get(1);
            if (i == arrayList.size() - 1) {
                map.put(listKWHzl.get(i), str3);
                map.put(listKWHzl.get(i2), str4);
            } else {
                map.put(listKWHzl.get(i), str3);
                objAubY = str4;
            }
            i = i2;
        }
    }

    public final java.util.List<java.lang.String> KWHzl(java.lang.String str) {
        return C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(Regex.findAll$default(new Regex("\\{([^}]+)\\}"), str, 0, 2, null), new Function1() { // from class: o.pLw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pLA.EZpvd((MatchResult) obj);
            }
        }));
    }

    public static final java.lang.String EZpvd(MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "");
        return matchResult.OLrzqt().get(1);
    }
}
