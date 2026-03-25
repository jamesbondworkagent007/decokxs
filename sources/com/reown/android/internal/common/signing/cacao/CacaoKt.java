package com.reown.android.internal.common.signing.cacao;

import com.fasterxml.jackson.core.JsonPointer;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.internal.common.signing.signature.Signature;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C59449zhJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class CacaoKt {
    public static final String RECAPS_STATEMENT = "I further authorize the stated URI to perform the following actions on my behalf";

    public static final /* synthetic */ Signature toSignature(Cacao.Signature signature) {
        Intrinsics.checkNotNullParameter(signature, "");
        return Signature.Companion.fromString(signature.getS());
    }

    public static /* synthetic */ String toCAIP222Message$default(Cacao.Payload payload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Ethereum";
        }
        return toCAIP222Message(payload, str);
    }

    public static final String toCAIP222Message(@NotNull Cacao.Payload payload, @NotNull String str) throws Exception {
        Intrinsics.checkNotNullParameter(payload, "");
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = payload.getDomain() + " wants you to sign in with your " + str + " account:\n" + new Issuer(payload.getIss()).getAddress() + "\n\n";
        String statement = payload.getStatement();
        Object obj = null;
        if (statement != null && StringsKt__StringsKt.contains$default((CharSequence) statement, (CharSequence) RECAPS_STATEMENT, false, 2, (Object) null)) {
            str2 = ((Object) str2) + payload.getStatement() + "\n";
        } else {
            if (payload.getStatement() != null) {
                str2 = ((Object) str2) + payload.getStatement();
            }
            List<String> resources = payload.getResources();
            if (resources != null) {
                Iterator<T> it = resources.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (C59449zhJ.startsWith$default((String) next, Cacao.Payload.RECAPS_PREFIX, false, 2, null)) {
                        obj = next;
                        break;
                    }
                }
                obj = (String) obj;
            }
            if (obj != null) {
                String str3 = ((Object) str2) + (payload.getStatement() != null ? " " : "");
                str2 = ((Object) str3) + "I further authorize the stated URI to perform the following actions on my behalf: " + getActionsString(payload.getResources()) + ".\n";
            } else if (payload.getStatement() != null) {
                str2 = ((Object) str2) + "\n";
            }
        }
        String str4 = ((Object) str2) + "\nURI: " + payload.getAud() + "\nVersion: " + payload.getVersion() + "\nChain ID: " + new Issuer(payload.getIss()).getChainIdReference() + "\nNonce: " + payload.getNonce() + "\nIssued At: " + payload.getIat();
        if (payload.getExp() != null) {
            str4 = ((Object) str4) + "\nExpiration Time: " + payload.getExp();
        }
        if (payload.getNbf() != null) {
            str4 = ((Object) str4) + "\nNot Before: " + payload.getNbf();
        }
        if (payload.getRequestId() != null) {
            str4 = ((Object) str4) + "\nRequest ID: " + payload.getRequestId();
        }
        if (payload.getResources() != null) {
            str4 = ((Object) str4) + "\nResources:";
            Iterator<T> it2 = payload.getResources().iterator();
            while (it2.hasNext()) {
                str4 = ((Object) str4) + "\n- " + ((String) it2.next());
            }
        }
        return str4;
    }

    public static final String getStatement(@NotNull Pair<String, ? extends List<String>> pair) throws Exception {
        String str;
        String str2;
        Object next;
        Intrinsics.checkNotNullParameter(pair, "");
        String strComponent1 = pair.component1();
        List<String> listComponent2 = pair.component2();
        if (strComponent1 != null) {
            str = "" + strComponent1;
        } else {
            str = "";
        }
        if (listComponent2 != null) {
            Iterator<T> it = listComponent2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C59449zhJ.startsWith$default((String) next, Cacao.Payload.RECAPS_PREFIX, false, 2, null)) {
                    break;
                }
            }
            str2 = (String) next;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str = (str + (strComponent1 != null ? " " : "")) + "I further authorize the stated URI to perform the following actions on my behalf: " + getActionsString(listComponent2) + JwtUtilsKt.JWT_DELIMITER;
        }
        if (Intrinsics.EZpvd((Object) str, (Object) "")) {
            return null;
        }
        return str;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.reown.android.internal.common.signing.cacao.UtilsKt.decodeReCaps(java.util.List):java.lang.String */
    public static final String getActionsString(List<String> list) throws Exception {
        String strSubstringBefore$default;
        Map reCaps = UtilsKt.parseReCaps(UtilsKt.decodeReCaps(list));
        if (reCaps.isEmpty()) {
            throw new Exception("Decoded ReCaps map is empty");
        }
        int i = 1;
        String str = "";
        for (Map.Entry entry : reCaps.entrySet()) {
            String str2 = (String) entry.getKey();
            Map map = (Map) entry.getValue();
            String str3 = (String) CollectionsKt___CollectionsKt.RcXXUw(map.keySet());
            if (str3 == null || (strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(str3, JsonPointer.SEPARATOR, (String) null, 2, (Object) null)) == null) {
                strSubstringBefore$default = "";
            }
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.AxsJAYaxsJAY(map.keySet()), ", ", null, null, 0, null, new Function1<String, CharSequence>() { // from class: com.reown.android.internal.common.signing.cacao.CacaoKt$getActionsString$1$itemsFormatted$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(@NotNull String str4) {
                    Intrinsics.checkNotNullParameter(str4, "");
                    return "'" + StringsKt__StringsKt.substringAfter$default(str4, JsonPointer.SEPARATOR, (String) null, 2, (Object) null) + "'";
                }
            }, 30, null);
            str = ((Object) str) + (i == reCaps.size() ? "(" + i + ") '" + strSubstringBefore$default + "': " + strJoinToString$default + " for '" + str2 + "'" : "(" + i + ") '" + strSubstringBefore$default + "': " + strJoinToString$default + " for '" + str2 + "'. ");
            i++;
        }
        return str;
    }
}
