package o;

import com.okinc.okimcore.model.im.inhouseim.UserTagType;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionUserDetail;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sMG {
    public final sIM copydefault = new sIM();

    public final java.util.List<ReactionUserDetail> OLrzqt(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            java.lang.String strEZpvd = EZpvd(str);
            Json.Default r1 = Json.Default;
            r1.getSerializersModule();
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) r1.decodeFromString(new ArrayListSerializer(ReactionUserDetail.Companion.serializer()), strEZpvd));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("ReactionTypeConverters", "Failed to parse userUids: " + str, thM7380exceptionOrNullimpl);
        }
        java.util.List listAhwBna = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = listAhwBna;
        }
        return (java.util.List) objM7377constructorimpl;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return new Regex("\"userTagType\":\\[\"([^\"]*?)\"\\]").replace(new Regex("\"userTagType\":\"([^\"]*?)\"").replace(str, new Function1() { // from class: o.sME
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sMG.AEQbTJ(this.copydefault, (MatchResult) obj);
            }
        }), new Function1() { // from class: o.sMJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sMG.KWHzl(this.EZpvd, (MatchResult) obj);
            }
        });
    }

    public static final java.lang.CharSequence AEQbTJ(sMG smg, MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "");
        return smg.KWHzl(matchResult.OLrzqt().get(1));
    }

    public static final java.lang.CharSequence KWHzl(sMG smg, MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "");
        return smg.KWHzl(matchResult.OLrzqt().get(1));
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        java.util.Collection collectionAhwBna;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL) || str.length() == 0) {
            return "\"userTagType\":null";
        }
        java.util.List<UserTagType> listAEQbTJ = this.copydefault.AEQbTJ(str);
        if (listAEQbTJ == null) {
            collectionAhwBna = yDY.AhwBna();
        } else {
            collectionAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                collectionAhwBna.add(java.lang.Integer.valueOf(((UserTagType) it.next()).getApiValue()));
            }
        }
        return "\"userTagType\":" + CollectionsKt___CollectionsKt.joinToString$default(collectionAhwBna, ",", "[", "]", 0, null, null, 56, null);
    }

    public final java.util.List<ReactionDisplay> AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            Json.Default r0 = Json.Default;
            r0.getSerializersModule();
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) r0.decodeFromString(new ArrayListSerializer(ReactionDisplay.Companion.serializer()), str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("ReactionTypeConverters", "Failed to parse reactionDisplay: " + str, thM7380exceptionOrNullimpl);
        }
        java.util.List listAhwBna = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = listAhwBna;
        }
        return (java.util.List) objM7377constructorimpl;
    }
}
