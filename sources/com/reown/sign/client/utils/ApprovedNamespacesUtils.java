package com.reown.sign.client.utils;

import android.util.Base64;
import com.fasterxml.jackson.core.JsonPointer;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.internal.common.signing.cacao.CacaoKt;
import com.reown.android.internal.common.signing.cacao.CacaoType;
import com.reown.android.internal.common.signing.cacao.UtilsKt;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.sign.client.Sign;
import com.reown.sign.client.mapper.ClientMapperKt;
import com.reown.sign.common.exceptions.MessagesKt;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.engine.use_case.calls.GetNamespacesFromReCaps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.C56402yEa;
import o.C56403yEb;
import o.C56406yEe;
import o.C56424yEw;
import o.C59449zhJ;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ApprovedNamespacesUtils {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [31=6, 32=5, 33=11] */
    public static final Map<String, Sign.Model.Namespace.Session> generateApprovedNamespaces(@NotNull Sign.Model.SessionProposal sessionProposal, @NotNull Map<String, Sign.Model.Namespace.Session> map) throws Exception {
        List<String> listAhwBna;
        List listAhwBna2;
        List listAhwBna3;
        List<String> accounts;
        List listDjBIcL;
        List listQbewEr;
        List<String> events;
        List listDjBIcL2;
        List listQbewEr2;
        List<String> methods;
        List listDjBIcL3;
        List listQbewEr3;
        List<String> chains;
        List listDjBIcL4;
        List listQbewEr4;
        Collection collectionAhwBna;
        List<String> accounts2;
        List<String> events2;
        List<String> methods2;
        List<String> chains2;
        List<String> listAhwBna4;
        List listAhwBna5;
        List listAhwBna6;
        Iterator<Map.Entry<String, Namespace.Proposal>> it;
        Collection collectionAhwBna2;
        List<String> accounts3;
        List<String> events3;
        List<String> methods3;
        List<String> chains3;
        Intrinsics.checkNotNullParameter(sessionProposal, "");
        Intrinsics.checkNotNullParameter(map, "");
        Map<String, Namespace.Session> sessionNamespacesVO = ClientMapperKt.toSessionNamespacesVO(map);
        Map<String, Namespace.Proposal> mapNormalizeNamespaces = normalizeNamespaces(ClientMapperKt.toProposalNamespacesVO(sessionProposal.getRequiredNamespaces()));
        Map<String, Namespace.Proposal> mapNormalizeNamespaces2 = normalizeNamespaces(ClientMapperKt.toProposalNamespacesVO(sessionProposal.getOptionalNamespaces()));
        SignValidator signValidator = SignValidator.INSTANCE;
        if (!signValidator.areNamespacesKeysProperlyFormatted(mapNormalizeNamespaces)) {
            throw new Exception(ValidationError.UnsupportedNamespaceKey.INSTANCE.getMessage());
        }
        if (!signValidator.areChainsDefined(mapNormalizeNamespaces)) {
            throw new Exception(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_UNDEFINED_MISSING_MESSAGE).getMessage());
        }
        if (!signValidator.areChainsNotEmpty(mapNormalizeNamespaces)) {
            throw new Exception(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE).getMessage());
        }
        if (!signValidator.areChainIdsValid(mapNormalizeNamespaces)) {
            throw new Exception(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE).getMessage());
        }
        if (!signValidator.areChainsInMatchingNamespace(mapNormalizeNamespaces)) {
            throw new Exception(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE).getMessage());
        }
        if (!signValidator.areNamespacesKeysProperlyFormatted(mapNormalizeNamespaces2)) {
            throw new Exception(ValidationError.UnsupportedNamespaceKey.INSTANCE.getMessage());
        }
        if (!signValidator.areChainsDefined(mapNormalizeNamespaces2)) {
            throw new Exception(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_UNDEFINED_MISSING_MESSAGE).getMessage());
        }
        if (!signValidator.areChainsNotEmpty(mapNormalizeNamespaces2)) {
            throw new Exception(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE).getMessage());
        }
        if (!signValidator.areChainIdsValid(mapNormalizeNamespaces2)) {
            throw new Exception(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE).getMessage());
        }
        if (!signValidator.areChainsInMatchingNamespace(mapNormalizeNamespaces2)) {
            throw new Exception(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE).getMessage());
        }
        if (sessionNamespacesVO.isEmpty()) {
            throw new Exception(ValidationError.EmptyNamespaces.INSTANCE.getMessage());
        }
        if (!signValidator.areNamespacesKeysProperlyFormatted(sessionNamespacesVO)) {
            throw new Exception(ValidationError.UnsupportedNamespaceKey.INSTANCE.getMessage());
        }
        if (!signValidator.areChainsNotEmpty(sessionNamespacesVO)) {
            throw new Exception(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE).getMessage());
        }
        if (!signValidator.areChainIdsValid(sessionNamespacesVO)) {
            throw new Exception(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE).getMessage());
        }
        if (!signValidator.areChainsInMatchingNamespace(sessionNamespacesVO)) {
            throw new Exception(new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE).getMessage());
        }
        if (!signValidator.areAccountIdsValid(sessionNamespacesVO)) {
            throw new Exception(new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_CAIP_10_MESSAGE).getMessage());
        }
        if (!signValidator.areAccountsInMatchingNamespaceAndChains(sessionNamespacesVO)) {
            throw new Exception(new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_WRONG_NAMESPACE_MESSAGE).getMessage());
        }
        if (!signValidator.areAllNamespacesApproved(sessionNamespacesVO.keySet(), mapNormalizeNamespaces.keySet())) {
            throw new Exception(ValidationError.UserRejected.INSTANCE.getMessage());
        }
        if (!signValidator.areAllMethodsApproved(signValidator.allMethodsWithChains(sessionNamespacesVO), signValidator.allMethodsWithChains(mapNormalizeNamespaces))) {
            throw new Exception(ValidationError.UserRejectedMethods.INSTANCE.getMessage());
        }
        if (!signValidator.areAllEventsApproved(signValidator.allEventsWithChains(sessionNamespacesVO), signValidator.allEventsWithChains(mapNormalizeNamespaces))) {
            throw new Exception(ValidationError.UserRejectedEvents.INSTANCE.getMessage());
        }
        if (!signValidator.areAllChainsApproved$sign_release(sessionNamespacesVO, mapNormalizeNamespaces)) {
            throw new Exception(new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_WRONG_NAMESPACE_MESSAGE).getMessage());
        }
        if (sessionProposal.getRequiredNamespaces().isEmpty() && sessionProposal.getOptionalNamespaces().isEmpty()) {
            return ClientMapperKt.toCore(sessionNamespacesVO);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Namespace.Proposal>> it2 = mapNormalizeNamespaces.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, Namespace.Proposal> next = it2.next();
            String key = next.getKey();
            Namespace.Proposal value = next.getValue();
            Namespace.Session session = sessionNamespacesVO.get(key);
            if (session == null || (chains3 = session.getChains()) == null) {
                listAhwBna4 = yDY.AhwBna();
            } else {
                listAhwBna4 = new ArrayList();
                for (Object obj : chains3) {
                    List<String> chains4 = value.getChains();
                    Intrinsics.copydefault(chains4);
                    if (chains4.contains((String) obj)) {
                        listAhwBna4.add(obj);
                    }
                }
            }
            Sign.Model.Namespace.Session session2 = map.get(key);
            if (session2 == null || (methods3 = session2.getMethods()) == null) {
                listAhwBna5 = yDY.AhwBna();
            } else {
                listAhwBna5 = new ArrayList();
                for (Object obj2 : methods3) {
                    if (value.getMethods().contains((String) obj2)) {
                        listAhwBna5.add(obj2);
                    }
                }
            }
            Sign.Model.Namespace.Session session3 = map.get(key);
            if (session3 == null || (events3 = session3.getEvents()) == null) {
                listAhwBna6 = yDY.AhwBna();
            } else {
                listAhwBna6 = new ArrayList();
                for (Object obj3 : events3) {
                    if (value.getEvents().contains((String) obj3)) {
                        listAhwBna6.add(obj3);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String str : listAhwBna4) {
                Sign.Model.Namespace.Session session4 = map.get(key);
                if (session4 == null || (accounts3 = session4.getAccounts()) == null) {
                    it = it2;
                    collectionAhwBna2 = yDY.AhwBna();
                } else {
                    collectionAhwBna2 = new ArrayList();
                    for (Object obj4 : accounts3) {
                        Iterator<Map.Entry<String, Namespace.Proposal>> it3 = it2;
                        if (Intrinsics.EZpvd((Object) SignValidator.INSTANCE.getChainFromAccount$sign_release((String) obj4), (Object) str)) {
                            collectionAhwBna2.add(obj4);
                        }
                        it2 = it3;
                    }
                    it = it2;
                }
                C56406yEe.KWHzl(arrayList, collectionAhwBna2);
                it2 = it;
            }
            linkedHashMap.put(key, new Namespace.Session(listAhwBna4, arrayList, listAhwBna5, listAhwBna6));
            it2 = it2;
        }
        for (Map.Entry<String, Namespace.Proposal> entry : mapNormalizeNamespaces2.entrySet()) {
            String key2 = entry.getKey();
            Namespace.Proposal value2 = entry.getValue();
            if (map.containsKey(key2)) {
                Namespace.Session session5 = sessionNamespacesVO.get(key2);
                if (session5 == null || (chains2 = session5.getChains()) == null) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    listAhwBna = new ArrayList();
                    for (Object obj5 : chains2) {
                        List<String> chains5 = value2.getChains();
                        Intrinsics.copydefault(chains5);
                        if (chains5.contains((String) obj5)) {
                            listAhwBna.add(obj5);
                        }
                    }
                }
                Sign.Model.Namespace.Session session6 = map.get(key2);
                if (session6 == null || (methods2 = session6.getMethods()) == null) {
                    listAhwBna2 = yDY.AhwBna();
                } else {
                    listAhwBna2 = new ArrayList();
                    for (Object obj6 : methods2) {
                        if (value2.getMethods().contains((String) obj6)) {
                            listAhwBna2.add(obj6);
                        }
                    }
                }
                Sign.Model.Namespace.Session session7 = map.get(key2);
                if (session7 == null || (events2 = session7.getEvents()) == null) {
                    listAhwBna3 = yDY.AhwBna();
                } else {
                    listAhwBna3 = new ArrayList();
                    for (Object obj7 : events2) {
                        if (value2.getEvents().contains((String) obj7)) {
                            listAhwBna3.add(obj7);
                        }
                    }
                }
                List arrayList2 = new ArrayList();
                for (String str2 : listAhwBna) {
                    Sign.Model.Namespace.Session session8 = map.get(key2);
                    if (session8 == null || (accounts2 = session8.getAccounts()) == null) {
                        collectionAhwBna = yDY.AhwBna();
                    } else {
                        collectionAhwBna = new ArrayList();
                        for (Object obj8 : accounts2) {
                            if (Intrinsics.EZpvd((Object) SignValidator.INSTANCE.getChainFromAccount$sign_release((String) obj8), (Object) str2)) {
                                collectionAhwBna.add(obj8);
                            }
                        }
                    }
                    C56406yEe.KWHzl(arrayList2, collectionAhwBna);
                }
                Namespace.Session session9 = (Namespace.Session) linkedHashMap.get(key2);
                if (session9 != null && (chains = session9.getChains()) != null && (listDjBIcL4 = CollectionsKt___CollectionsKt.djBIcL((Collection) chains, (Iterable) listAhwBna)) != null && (listQbewEr4 = CollectionsKt___CollectionsKt.QbewEr(listDjBIcL4)) != null) {
                    listAhwBna = listQbewEr4;
                }
                Namespace.Session session10 = (Namespace.Session) linkedHashMap.get(key2);
                if (session10 != null && (methods = session10.getMethods()) != null && (listDjBIcL3 = CollectionsKt___CollectionsKt.djBIcL((Collection) methods, (Iterable) listAhwBna2)) != null && (listQbewEr3 = CollectionsKt___CollectionsKt.QbewEr(listDjBIcL3)) != null) {
                    listAhwBna2 = listQbewEr3;
                }
                Namespace.Session session11 = (Namespace.Session) linkedHashMap.get(key2);
                if (session11 != null && (events = session11.getEvents()) != null && (listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((Collection) events, (Iterable) listAhwBna3)) != null && (listQbewEr2 = CollectionsKt___CollectionsKt.QbewEr(listDjBIcL2)) != null) {
                    listAhwBna3 = listQbewEr2;
                }
                Namespace.Session session12 = (Namespace.Session) linkedHashMap.get(key2);
                if (session12 != null && (accounts = session12.getAccounts()) != null && (listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) accounts, (Iterable) arrayList2)) != null && (listQbewEr = CollectionsKt___CollectionsKt.QbewEr(listDjBIcL)) != null) {
                    arrayList2 = listQbewEr;
                }
                linkedHashMap.put(key2, new Namespace.Session(listAhwBna, arrayList2, listAhwBna2, listAhwBna3));
            }
        }
        return ClientMapperKt.toCore(linkedHashMap);
    }

    public static final Map<String, Namespace.Proposal> normalizeNamespaces(@NotNull Map<String, Namespace.Proposal> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (SignValidator.INSTANCE.isNamespaceKeyRegexCompliant(map)) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Namespace.Proposal> entry : map.entrySet()) {
            String key = entry.getKey();
            Namespace.Proposal value = entry.getValue();
            String strNormalizeKey = normalizeKey(key);
            linkedHashMap.put(strNormalizeKey, new Namespace.Proposal(CollectionsKt___CollectionsKt.djBIcL((Collection) getMethods(linkedHashMap, strNormalizeKey), (Iterable) value.getMethods()), CollectionsKt___CollectionsKt.djBIcL((Collection) getChains(linkedHashMap, strNormalizeKey), (Iterable) getNamespaceChains(key, value)), CollectionsKt___CollectionsKt.djBIcL((Collection) getEvents(linkedHashMap, strNormalizeKey), (Iterable) value.getEvents())));
        }
        return C56424yEw.values(linkedHashMap);
    }

    public static final List<String> getNamespaceChains(String str, Namespace namespace) {
        if (CoreValidator.INSTANCE.isChainIdCAIP2Compliant(str)) {
            return C56402yEa.EZpvd(str);
        }
        List<String> chains = namespace.getChains();
        Intrinsics.copydefault(chains);
        return chains;
    }

    public static final String normalizeKey(String str) {
        return CoreValidator.INSTANCE.isChainIdCAIP2Compliant(str) ? SignValidator.INSTANCE.getNamespaceKeyFromChainId$sign_release(str) : str;
    }

    public static final List<String> getChains(Map<String, Namespace.Proposal> map, String str) {
        List<String> chains;
        Namespace.Proposal proposal = map.get(str);
        return (proposal == null || (chains = proposal.getChains()) == null) ? yDY.AhwBna() : chains;
    }

    public static final List<String> getMethods(Map<String, Namespace.Proposal> map, String str) {
        List<String> methods;
        Namespace.Proposal proposal = map.get(str);
        return (proposal == null || (methods = proposal.getMethods()) == null) ? yDY.AhwBna() : methods;
    }

    public static final List<String> getEvents(Map<String, Namespace.Proposal> map, String str) {
        List<String> events;
        Namespace.Proposal proposal = map.get(str);
        return (proposal == null || (events = proposal.getEvents()) == null) ? yDY.AhwBna() : events;
    }

    public static final Sign.Model.Cacao generateAuthObject(@NotNull Sign.Model.PayloadParams payloadParams, @NotNull String str, @NotNull Sign.Model.Cacao.Signature signature) {
        Intrinsics.checkNotNullParameter(payloadParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(signature, "");
        return new Sign.Model.Cacao(new Sign.Model.Cacao.Header(CacaoType.CAIP222.getHeader()), ClientMapperKt.toCacaoPayload(payloadParams, str), signature);
    }

    public static final Sign.Model.PayloadParams generateAuthPayloadParams(@NotNull Sign.Model.PayloadParams payloadParams, @NotNull List<String> list, @NotNull List<String> list2) throws Exception {
        Intrinsics.checkNotNullParameter(payloadParams, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        String strDecodeReCaps = UtilsKt.decodeReCaps(payloadParams.getResources());
        if (strDecodeReCaps == null || strDecodeReCaps.length() == 0 || !StringsKt__StringsKt.contains$default((CharSequence) strDecodeReCaps, (CharSequence) GetNamespacesFromReCaps.EIP155, false, 2, (Object) null)) {
            return payloadParams;
        }
        Map map = (Map) UtilsKt.parseReCaps(strDecodeReCaps).get(GetNamespacesFromReCaps.EIP155);
        Intrinsics.copydefault(map);
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.substringAfter$default((String) it.next(), JsonPointer.SEPARATOR, (String) null, 2, (Object) null));
        }
        List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.AhwBna((Iterable) payloadParams.getChains(), (Iterable) CollectionsKt___CollectionsKt.OqFWZa(list))));
        List listQbewEr2 = CollectionsKt___CollectionsKt.QbewEr(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList, (Iterable) CollectionsKt___CollectionsKt.OqFWZa(list2))));
        if (listQbewEr.isEmpty()) {
            throw new Exception("Unsupported chains");
        }
        if (listQbewEr2.isEmpty()) {
            throw new Exception("Unsupported methods");
        }
        if (!listQbewEr.isEmpty()) {
            Iterator it2 = listQbewEr.iterator();
            while (it2.hasNext()) {
                if (!CoreValidator.INSTANCE.isChainIdCAIP2Compliant((String) it2.next())) {
                    throw new Exception("Chains are not CAIP-2 compliant");
                }
            }
        }
        if (!listQbewEr.isEmpty()) {
            Iterator it3 = listQbewEr.iterator();
            while (it3.hasNext()) {
                if (!Intrinsics.EZpvd((Object) SignValidator.INSTANCE.getNamespaceKeyFromChainId$sign_release((String) it3.next()), (Object) GetNamespacesFromReCaps.EIP155)) {
                    throw new Exception("Only eip155(EVM) is supported");
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it4 = listQbewEr.iterator();
        while (it4.hasNext()) {
            jSONArray.put((String) it4.next());
        }
        Iterator it5 = listQbewEr2.iterator();
        while (it5.hasNext()) {
            jSONObject.put("request/" + ((String) it5.next()), new JSONArray().put(0, new JSONObject().put("chains", jSONArray)));
        }
        JSONObject jSONObject2 = new JSONObject(strDecodeReCaps);
        jSONObject2.getJSONObject(Cacao.Payload.ATT_KEY).put(GetNamespacesFromReCaps.EIP155, jSONObject);
        String string = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        byte[] bytes = C59449zhJ.replace$default(string, "\\/", "/", false, 4, (Object) null).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String str = Cacao.Payload.RECAPS_PREFIX + Base64.encodeToString(bytes, 3);
        if (payloadParams.getResources() == null) {
            payloadParams.setResources(C56402yEa.EZpvd(str));
        } else {
            List<String> resources = payloadParams.getResources();
            Intrinsics.copydefault(resources);
            payloadParams.setResources(CollectionsKt___CollectionsKt.copydefault((Collection<? extends String>) CollectionsKt___CollectionsKt.AYXKKw((List) resources, 1), str));
        }
        return new Sign.Model.PayloadParams(listQbewEr, payloadParams.getDomain(), payloadParams.getNonce(), payloadParams.getAud(), payloadParams.getType(), payloadParams.getNbf(), payloadParams.getExp(), payloadParams.getIat(), getStatement(payloadParams), payloadParams.getRequestId(), payloadParams.getResources());
    }

    public static final String getStatement(Sign.Model.PayloadParams payloadParams) {
        String statement = payloadParams.getStatement();
        if (statement != null && StringsKt__StringsKt.contains$default((CharSequence) statement, (CharSequence) CacaoKt.RECAPS_STATEMENT, false, 2, (Object) null)) {
            return payloadParams.getStatement();
        }
        return CacaoKt.getStatement(new Pair(payloadParams.getStatement(), payloadParams.getResources()));
    }
}
