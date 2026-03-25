package com.reown.sign.common.validator;

import com.huawei.hms.framework.common.ContainerUtils;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.android.internal.common.model.SymmetricKey;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.foundation.common.model.Topic;
import com.reown.sign.common.exceptions.MessagesKt;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import o.C56390yDp;
import o.C56403yEb;
import o.C56406yEe;
import o.C56423yEv;
import o.C56424yEw;
import o.C56427yEz;
import o.C56548yJl;
import o.C59449zhJ;
import o.C59467zhb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignValidator {
    public static final SignValidator INSTANCE = new SignValidator();

    public final /* synthetic */ void validateProposalNamespaces$sign_release(Map<String, ? extends Namespace> map, Function1<? super ValidationError, Unit> function1) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!areNamespacesKeysProperlyFormatted(map)) {
            function1.invoke(ValidationError.UnsupportedNamespaceKey.INSTANCE);
            return;
        }
        if (!areChainsDefined(map)) {
            function1.invoke(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_UNDEFINED_MISSING_MESSAGE));
            return;
        }
        if (!areChainsNotEmpty(map)) {
            function1.invoke(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE));
        } else if (!areChainIdsValid(map)) {
            function1.invoke(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE));
        } else {
            if (areChainsInMatchingNamespace(map)) {
                return;
            }
            function1.invoke(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE));
        }
    }

    public final /* synthetic */ void validateSessionNamespace$sign_release(Map<String, Namespace.Session> map, Map<String, Namespace.Proposal> map2, Function1<? super ValidationError, Unit> function1) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (map.isEmpty()) {
            function1.invoke(ValidationError.EmptyNamespaces.INSTANCE);
            return;
        }
        if (!areNamespacesKeysProperlyFormatted(map)) {
            function1.invoke(ValidationError.UnsupportedNamespaceKey.INSTANCE);
            return;
        }
        if (!areChainsNotEmpty(map)) {
            function1.invoke(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE));
            return;
        }
        if (!areChainIdsValid(map)) {
            function1.invoke(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE));
            return;
        }
        if (!areChainsInMatchingNamespace(map)) {
            function1.invoke(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE));
            return;
        }
        if (!areAccountIdsValid(map)) {
            function1.invoke(new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_CAIP_10_MESSAGE));
            return;
        }
        if (!areAccountsInMatchingNamespaceAndChains(map)) {
            function1.invoke(new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_WRONG_NAMESPACE_MESSAGE));
            return;
        }
        if (!areAllNamespacesApproved(map.keySet(), map2.keySet())) {
            function1.invoke(ValidationError.UserRejected.INSTANCE);
        } else if (!areAllMethodsApproved(allMethodsWithChains(map), allMethodsWithChains(map2))) {
            function1.invoke(ValidationError.UserRejectedMethods.INSTANCE);
        } else {
            if (areAllEventsApproved(allEventsWithChains(map), allEventsWithChains(map2))) {
                return;
            }
            function1.invoke(ValidationError.UserRejectedEvents.INSTANCE);
        }
    }

    public final /* synthetic */ void validateProperties$sign_release(Map<String, String> map, Function1<? super ValidationError, Unit> function1) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (map.isEmpty()) {
            function1.invoke(ValidationError.InvalidSessionProperties.INSTANCE);
        }
    }

    public final boolean areAllNamespacesApproved(Set<String> set, Set<String> set2) {
        return set.containsAll(set2);
    }

    public final /* synthetic */ void validateChainIdWithMethodAuthorisation$sign_release(String str, String str2, Map<String, Namespace.Session> map, Function1<? super ValidationError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Map mapAllMethodsWithChains = allMethodsWithChains(map);
        if (mapAllMethodsWithChains.get(str2) != null) {
            Object obj = mapAllMethodsWithChains.get(str2);
            Intrinsics.copydefault(obj);
            if (((List) obj).contains(str)) {
                return;
            }
        }
        function1.invoke(ValidationError.UnauthorizedMethod.INSTANCE);
    }

    public final /* synthetic */ void validateChainIdWithEventAuthorisation$sign_release(String str, String str2, Map<String, Namespace.Session> map, Function1<? super ValidationError, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Map mapAllEventsWithChains = allEventsWithChains(map);
        if (mapAllEventsWithChains.get(str2) != null) {
            Object obj = mapAllEventsWithChains.get(str2);
            Intrinsics.copydefault(obj);
            if (((List) obj).contains(str)) {
                return;
            }
        }
        function1.invoke(ValidationError.UnauthorizedEvent.INSTANCE);
    }

    public final /* synthetic */ void validateSessionRequest$sign_release(EngineDO.Request request, Function1<? super ValidationError, Unit> function1) {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (request.getParams().length() == 0 || request.getMethod().length() == 0 || request.getChainId().length() == 0 || request.getTopic().length() == 0 || !CoreValidator.INSTANCE.isChainIdCAIP2Compliant(request.getChainId())) {
            function1.invoke(ValidationError.InvalidSessionRequest.INSTANCE);
        }
    }

    public final /* synthetic */ void validateEvent$sign_release(EngineDO.Event event, Function1<? super ValidationError, Unit> function1) {
        Intrinsics.checkNotNullParameter(event, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (event.getData().length() == 0 || event.getName().length() == 0 || event.getChainId().length() == 0 || !CoreValidator.INSTANCE.isChainIdCAIP2Compliant(event.getChainId())) {
            function1.invoke(ValidationError.InvalidEvent.INSTANCE);
        }
    }

    public final /* synthetic */ void validateSessionExtend$sign_release(long j, long j2, Function1<? super ValidationError, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        long weekInSeconds = Time.getWeekInSeconds();
        if (j <= j2 || j - j2 > weekInSeconds) {
            function1.invoke(ValidationError.InvalidExtendRequest.INSTANCE);
        }
    }

    public final /* synthetic */ EngineDO.WalletConnectUri validateWCUri$sign_release(String str) {
        Unit unit;
        Unit unit2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!C59449zhJ.startsWith$default(str, "wc:", false, 2, null)) {
            return null;
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "wc://", false, 2, (Object) null)) {
            str = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "wc:/", false, 2, (Object) null) ? C59449zhJ.replace$default(str, "wc:/", "wc://", false, 4, (Object) null) : C59449zhJ.replace$default(str, "wc:", "wc://", false, 4, (Object) null);
        }
        try {
            URI uri = new URI(str);
            String userInfo = uri.getUserInfo();
            Intrinsics.checkNotNullExpressionValue(userInfo, "");
            if (userInfo.length() == 0) {
                return null;
            }
            String query = uri.getQuery();
            Intrinsics.checkNotNullExpressionValue(query, "");
            List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) query, new String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listSplit$default, 10)), 16));
            for (String str2 : listSplit$default) {
                Pair pairOLrzqt = C56390yDp.OLrzqt(StringsKt__StringsKt.substringBefore$default(str2, ContainerUtils.KEY_VALUE_DELIMITER, (String) null, 2, (Object) null), StringsKt__StringsKt.substringAfter$default(str2, ContainerUtils.KEY_VALUE_DELIMITER, (String) null, 2, (Object) null));
                linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
            }
            String str3 = (String) linkedHashMap.get("relay-protocol");
            if (str3 != null) {
                unit = Unit.INSTANCE;
            } else {
                str3 = "";
                unit = null;
            }
            if (unit == null || str3.length() == 0) {
                return null;
            }
            String str4 = (String) linkedHashMap.get("relay-data");
            String str5 = (String) linkedHashMap.get("symKey");
            if (str5 != null) {
                unit2 = Unit.INSTANCE;
            } else {
                str5 = "";
                unit2 = null;
            }
            if (unit2 == null || str5.length() == 0) {
                return null;
            }
            String userInfo2 = uri.getUserInfo();
            Intrinsics.checkNotNullExpressionValue(userInfo2, "");
            return new EngineDO.WalletConnectUri(new Topic(userInfo2), SymmetricKey.m7239constructorimpl(str5), new RelayProtocolOptions(str3, str4), null, 8, null);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [407=4, 193=4] */
    public final Map<String, List<String>> allMethodsWithChains(Map<String, ? extends Namespace> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, ? extends Namespace> entry : map.entrySet()) {
            String key = entry.getKey();
            Namespace value = entry.getValue();
            if (CoreValidator.INSTANCE.isNamespaceRegexCompliant(key) && value.getChains() != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Namespace namespace = (Namespace) ((Map.Entry) it.next()).getValue();
            List<String> methods = namespace.getMethods();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(methods, 10));
            for (String str : methods) {
                Object arrayList3 = linkedHashMap.get(str);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(str, arrayList3);
                }
                List<String> chains = namespace.getChains();
                Intrinsics.copydefault(chains);
                arrayList2.add(Boolean.valueOf(((List) arrayList3).addAll(chains)));
            }
            C56406yEe.KWHzl(arrayList, arrayList2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry<String, ? extends Namespace> entry2 : map.entrySet()) {
            String key2 = entry2.getKey();
            Namespace value2 = entry2.getValue();
            if (CoreValidator.INSTANCE.isChainIdCAIP2Compliant(key2) && value2.getChains() == null) {
                linkedHashMap4.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
            String str2 = (String) entry3.getKey();
            List<String> methods2 = ((Namespace) entry3.getValue()).getMethods();
            ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(methods2, 10));
            for (String str3 : methods2) {
                Object arrayList6 = linkedHashMap3.get(str3);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap3.put(str3, arrayList6);
                }
                arrayList5.add(Boolean.valueOf(((List) arrayList6).add(str2)));
            }
            C56406yEe.KWHzl(arrayList4, arrayList5);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry<String, ? extends Namespace> entry4 : map.entrySet()) {
            String key3 = entry4.getKey();
            Namespace value3 = entry4.getValue();
            if ((value3 instanceof Namespace.Session) && CoreValidator.INSTANCE.isNamespaceRegexCompliant(key3) && value3.getChains() == null) {
                linkedHashMap5.put(entry4.getKey(), entry4.getValue());
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it2 = linkedHashMap5.entrySet().iterator();
        while (it2.hasNext()) {
            Namespace namespace2 = (Namespace) ((Map.Entry) it2.next()).getValue();
            Intrinsics.copydefault(namespace2, "");
            Namespace.Session session = (Namespace.Session) namespace2;
            List<String> methods3 = session.getMethods();
            ArrayList arrayList8 = new ArrayList(C56403yEb.AYXKKw(methods3, 10));
            for (String str4 : methods3) {
                List<String> accounts = session.getAccounts();
                ArrayList arrayList9 = new ArrayList(C56403yEb.AYXKKw(accounts, 10));
                Iterator<T> it3 = accounts.iterator();
                while (it3.hasNext()) {
                    arrayList9.add(INSTANCE.getChainFromAccount$sign_release((String) it3.next()));
                }
                arrayList8.add(C56390yDp.OLrzqt(str4, arrayList9));
            }
            C56406yEe.KWHzl(arrayList7, arrayList8);
        }
        Sequence<Map.Entry> sequenceAuCTelauCTel = C59467zhb.AuCTelauCTel(C59467zhb.EZpvd(C59467zhb.EZpvd(C56427yEz.DbNXlk(linkedHashMap), C56427yEz.DbNXlk(linkedHashMap3)), C56427yEz.DbNXlk(C56424yEw.copydefault(arrayList7))));
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        for (Map.Entry entry5 : sequenceAuCTelauCTel) {
            String str5 = (String) entry5.getKey();
            Object arrayList10 = linkedHashMap6.get(str5);
            if (arrayList10 == null) {
                arrayList10 = new ArrayList();
                linkedHashMap6.put(str5, arrayList10);
            }
            ((List) arrayList10).add((List) entry5.getValue());
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap6.size()));
        for (Map.Entry entry6 : linkedHashMap6.entrySet()) {
            linkedHashMap7.put(entry6.getKey(), C56403yEb.QOLQEE((List) entry6.getValue()));
        }
        return linkedHashMap7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [494=4, 240=4] */
    public final Map<String, List<String>> allEventsWithChains(Map<String, ? extends Namespace> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, ? extends Namespace> entry : map.entrySet()) {
            String key = entry.getKey();
            Namespace value = entry.getValue();
            if (CoreValidator.INSTANCE.isNamespaceRegexCompliant(key) && value.getChains() != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Namespace namespace = (Namespace) ((Map.Entry) it.next()).getValue();
            List<String> events = namespace.getEvents();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(events, 10));
            for (String str : events) {
                Object arrayList3 = linkedHashMap.get(str);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(str, arrayList3);
                }
                List<String> chains = namespace.getChains();
                Intrinsics.copydefault(chains);
                arrayList2.add(Boolean.valueOf(((List) arrayList3).addAll(chains)));
            }
            C56406yEe.KWHzl(arrayList, arrayList2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry<String, ? extends Namespace> entry2 : map.entrySet()) {
            String key2 = entry2.getKey();
            Namespace value2 = entry2.getValue();
            if (CoreValidator.INSTANCE.isChainIdCAIP2Compliant(key2) && value2.getChains() == null) {
                linkedHashMap4.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
            String str2 = (String) entry3.getKey();
            List<String> events2 = ((Namespace) entry3.getValue()).getEvents();
            ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(events2, 10));
            for (String str3 : events2) {
                Object arrayList6 = linkedHashMap3.get(str3);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap3.put(str3, arrayList6);
                }
                arrayList5.add(Boolean.valueOf(((List) arrayList6).add(str2)));
            }
            C56406yEe.KWHzl(arrayList4, arrayList5);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry<String, ? extends Namespace> entry4 : map.entrySet()) {
            String key3 = entry4.getKey();
            Namespace value3 = entry4.getValue();
            if ((value3 instanceof Namespace.Session) && CoreValidator.INSTANCE.isNamespaceRegexCompliant(key3) && value3.getChains() == null) {
                linkedHashMap5.put(entry4.getKey(), entry4.getValue());
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it2 = linkedHashMap5.entrySet().iterator();
        while (it2.hasNext()) {
            Namespace namespace2 = (Namespace) ((Map.Entry) it2.next()).getValue();
            Intrinsics.copydefault(namespace2, "");
            Namespace.Session session = (Namespace.Session) namespace2;
            List<String> events3 = session.getEvents();
            ArrayList arrayList8 = new ArrayList(C56403yEb.AYXKKw(events3, 10));
            for (String str4 : events3) {
                List<String> accounts = session.getAccounts();
                ArrayList arrayList9 = new ArrayList(C56403yEb.AYXKKw(accounts, 10));
                Iterator<T> it3 = accounts.iterator();
                while (it3.hasNext()) {
                    arrayList9.add(INSTANCE.getChainFromAccount$sign_release((String) it3.next()));
                }
                arrayList8.add(C56390yDp.OLrzqt(str4, arrayList9));
            }
            C56406yEe.KWHzl(arrayList7, arrayList8);
        }
        Sequence<Map.Entry> sequenceAuCTelauCTel = C59467zhb.AuCTelauCTel(C59467zhb.EZpvd(C59467zhb.EZpvd(C56427yEz.DbNXlk(linkedHashMap), C56427yEz.DbNXlk(linkedHashMap3)), C56427yEz.DbNXlk(C56424yEw.copydefault(arrayList7))));
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        for (Map.Entry entry5 : sequenceAuCTelauCTel) {
            String str5 = (String) entry5.getKey();
            Object arrayList10 = linkedHashMap6.get(str5);
            if (arrayList10 == null) {
                arrayList10 = new ArrayList();
                linkedHashMap6.put(str5, arrayList10);
            }
            ((List) arrayList10).add((List) entry5.getValue());
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap6.size()));
        for (Map.Entry entry6 : linkedHashMap6.entrySet()) {
            linkedHashMap7.put(entry6.getKey(), C56403yEb.QOLQEE((List) entry6.getValue()));
        }
        return linkedHashMap7;
    }

    public final boolean areChainIdsValid(Map<String, ? extends Namespace> map) {
        Map<String, Namespace> validNamespaces = getValidNamespaces(map);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, Namespace>> it = validNamespaces.entrySet().iterator();
        while (it.hasNext()) {
            List<String> chains = it.next().getValue().getChains();
            Intrinsics.copydefault(chains);
            C56406yEe.KWHzl(arrayList, chains);
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!CoreValidator.INSTANCE.isChainIdCAIP2Compliant((String) it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean areChainsInMatchingNamespace(Map<String, ? extends Namespace> map) {
        Map<String, Namespace> validNamespaces = getValidNamespaces(map);
        if (validNamespaces.isEmpty()) {
            return true;
        }
        for (Map.Entry<String, Namespace> entry : validNamespaces.entrySet()) {
            String key = entry.getKey();
            List<String> chains = entry.getValue().getChains();
            Intrinsics.copydefault(chains);
            if (!(chains instanceof Collection) || !chains.isEmpty()) {
                Iterator<T> it = chains.iterator();
                while (it.hasNext()) {
                    if (!StringsKt__StringsKt.AhwBna((CharSequence) it.next(), (CharSequence) key, true)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final /* synthetic */ String getChainFromAccount$sign_release(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
        if (listSplit$default.isEmpty() || listSplit$default.size() != 3) {
            return str;
        }
        return ((String) listSplit$default.get(0)) + ":" + ((String) listSplit$default.get(1));
    }

    public final /* synthetic */ String getNamespaceKeyFromChainId$sign_release(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
        return (listSplit$default.isEmpty() || listSplit$default.size() != 2) ? str : (String) listSplit$default.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void validateSupportedNamespace$sign_release(Map<String, Namespace.Session> map, Map<String, Namespace.Proposal> map2, Function1<? super ValidationError, Unit> function1) {
        ValidationError userRejectedChains;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (map.isEmpty()) {
            userRejectedChains = ValidationError.EmptyNamespaces.INSTANCE;
        } else if (!areNamespacesKeysProperlyFormatted(map)) {
            userRejectedChains = ValidationError.UnsupportedNamespaceKey.INSTANCE;
        } else if (!areChainsNotEmpty(map)) {
            userRejectedChains = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE);
        } else if (!areChainIdsValid(map)) {
            userRejectedChains = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE);
        } else if (!areChainsInMatchingNamespace(map)) {
            userRejectedChains = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE);
        } else if (!areAccountIdsValid(map)) {
            userRejectedChains = new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_CAIP_10_MESSAGE);
        } else if (!areAccountsInMatchingNamespaceAndChains(map)) {
            userRejectedChains = new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_WRONG_NAMESPACE_MESSAGE);
        } else if (!areAllNamespacesApproved(map.keySet(), map2.keySet())) {
            userRejectedChains = ValidationError.UserRejected.INSTANCE;
        } else {
            if (areAllMethodsApproved(allMethodsWithChains(map), allMethodsWithChains(map2))) {
                if (!areAllEventsApproved(allEventsWithChains(map), allEventsWithChains(map2))) {
                    userRejectedChains = ValidationError.UserRejectedEvents.INSTANCE;
                }
                if (areAllChainsApproved$sign_release(map, map2)) {
                    function1.invoke(new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_WRONG_NAMESPACE_MESSAGE));
                    return;
                }
                return;
            }
            userRejectedChains = ValidationError.UserRejectedMethods.INSTANCE;
        }
        function1.invoke(userRejectedChains);
        if (areAllChainsApproved$sign_release(map, map2)) {
        }
    }

    public final boolean areAllMethodsApproved(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2) {
        for (Map.Entry<String, ? extends List<String>> entry : map2.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            List<String> list = map.get(key);
            if (list == null || !list.containsAll(value)) {
                return false;
            }
        }
        return true;
    }

    public final boolean areAllEventsApproved(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2) {
        for (Map.Entry<String, ? extends List<String>> entry : map2.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            List<String> list = map.get(key);
            if (list == null || !list.containsAll(value)) {
                return false;
            }
        }
        return true;
    }

    public final boolean areAllChainsApproved$sign_release(@NotNull Map<String, Namespace.Session> map, @NotNull Map<String, Namespace.Proposal> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Namespace.Proposal> entry : map2.entrySet()) {
            String key = entry.getKey();
            Namespace.Proposal value = entry.getValue();
            if (!CoreValidator.INSTANCE.isChainIdCAIP2Compliant(key) && value.getChains() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Namespace.Proposal proposal = (Namespace.Proposal) entry2.getValue();
            Namespace.Session session = map.get(str);
            List<String> accounts = session != null ? session.getAccounts() : null;
            Intrinsics.copydefault(accounts);
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(accounts, 10));
            Iterator<T> it = accounts.iterator();
            while (it.hasNext()) {
                arrayList.add(INSTANCE.getChainFromAccount$sign_release((String) it.next()));
            }
            List<String> chains = proposal.getChains();
            Intrinsics.copydefault(chains);
            if (!arrayList.containsAll(chains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean areNamespacesKeysProperlyFormatted(Map<String, ? extends Namespace> map) {
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, ? extends Namespace>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                CoreValidator coreValidator = CoreValidator.INSTANCE;
                if (!coreValidator.isNamespaceRegexCompliant(key) && !coreValidator.isChainIdCAIP2Compliant(key)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean isNamespaceKeyRegexCompliant(@NotNull Map<String, ? extends Namespace> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, ? extends Namespace>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!CoreValidator.INSTANCE.isNamespaceRegexCompliant(it.next().getKey())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean areAccountIdsValid(Map<String, Namespace.Session> map) {
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, Namespace.Session>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                List<String> accounts = it.next().getValue().getAccounts();
                if (!(accounts instanceof Collection) || !accounts.isEmpty()) {
                    Iterator<T> it2 = accounts.iterator();
                    while (it2.hasNext()) {
                        if (!CoreValidator.INSTANCE.isAccountIdCAIP10Compliant((String) it2.next())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean areAccountsInMatchingNamespaceAndChains(Map<String, Namespace.Session> map) {
        if (!map.isEmpty()) {
            for (Map.Entry<String, Namespace.Session> entry : map.entrySet()) {
                String key = entry.getKey();
                Namespace.Session value = entry.getValue();
                if (CoreValidator.INSTANCE.isNamespaceRegexCompliant(key) && value.getChains() != null) {
                    List<String> accounts = value.getAccounts();
                    if (!(accounts instanceof Collection) || !accounts.isEmpty()) {
                        for (String str : accounts) {
                            if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) key, false, 2, (Object) null)) {
                                return false;
                            }
                            List<String> chains = value.getChains();
                            Intrinsics.copydefault(chains);
                            if (!chains.contains(INSTANCE.getChainFromAccount$sign_release(str))) {
                                return false;
                            }
                        }
                    }
                } else {
                    List<String> accounts2 = value.getAccounts();
                    if (!(accounts2 instanceof Collection) || !accounts2.isEmpty()) {
                        Iterator<T> it = accounts2.iterator();
                        while (it.hasNext()) {
                            if (!StringsKt__StringsKt.contains$default((CharSequence) it.next(), (CharSequence) key, false, 2, (Object) null)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean areChainsDefined(Map<String, ? extends Namespace> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Namespace> entry : map.entrySet()) {
            String key = entry.getKey();
            Namespace value = entry.getValue();
            if (CoreValidator.INSTANCE.isNamespaceRegexCompliant(key) && value.getChains() == null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.isEmpty();
    }

    public final boolean areChainsNotEmpty(Map<String, ? extends Namespace> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Namespace> entry : map.entrySet()) {
            String key = entry.getKey();
            Namespace value = entry.getValue();
            if (CoreValidator.INSTANCE.isNamespaceRegexCompliant(key) && value.getChains() != null) {
                List<String> chains = value.getChains();
                Intrinsics.copydefault(chains);
                if (chains.isEmpty()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return linkedHashMap.isEmpty();
    }

    public final Map<String, Namespace> getValidNamespaces(Map<String, ? extends Namespace> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Namespace> entry : map.entrySet()) {
            Namespace value = entry.getValue();
            if (value.getChains() != null) {
                Intrinsics.copydefault(value.getChains());
                if (!r2.isEmpty()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }
}
