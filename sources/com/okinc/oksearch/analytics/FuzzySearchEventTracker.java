package com.okinc.oksearch.analytics;

import androidx.camera.video.AudioStats;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.C32866mlf;
import o.C33129mqd;
import o.C47222tlv;
import o.C56403yEb;
import o.C56444yFp;
import o.InterfaceC47221tlu;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class FuzzySearchEventTracker {
    public static Job KWHzl;
    public static final FuzzySearchEventTracker EZpvd = new FuzzySearchEventTracker();
    public static final Function1<EventParamsList, Unit> AEQbTJ = new Function1() { // from class: o.tlF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return FuzzySearchEventTracker.AEQbTJ((EventParamsList) obj);
        }
    };
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final <T extends InterfaceC47221tlu> void OLrzqt(@NotNull String str, CharSequence charSequence, @NotNull List<? extends T> list, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        trackFuzzySearchStart$default(this, str, charSequence, list, str2, str3, null, 32, null);
    }

    private FuzzySearchEventTracker() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SearchType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SearchType[] $VALUES;
        public static final SearchType SEARCH_MATCHER_PRIMARY = new SearchType("SEARCH_MATCHER_PRIMARY", 0, "Primary");
        public static final SearchType SEARCH_MATCHER_SECONDARY = new SearchType("SEARCH_MATCHER_SECONDARY", 1, "Secondary");
        private final String searchType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SearchType[] $values() {
            return new SearchType[]{SEARCH_MATCHER_PRIMARY, SEARCH_MATCHER_SECONDARY};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SearchType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSearchType() {
            return this.searchType;
        }

        private SearchType(String str, int i, String str2) {
            this.searchType = str2;
        }

        static {
            SearchType[] searchTypeArr$values = $values();
            $VALUES = searchTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(searchTypeArr$values);
        }

        public static SearchType valueOf(String str) {
            return (SearchType) Enum.valueOf(SearchType.class, str);
        }

        public static SearchType[] values() {
            return (SearchType[]) $VALUES.clone();
        }
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "search_timestamp", getTimeStamp$default(EZpvd, null, 1, null), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(Job job) {
        Job job2 = KWHzl;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        KWHzl = job;
    }

    public static /* synthetic */ void trackFuzzySearchStart$default(FuzzySearchEventTracker fuzzySearchEventTracker, String str, CharSequence charSequence, List list, String str2, String str3, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = "";
        }
        String str4 = str3;
        if ((i & 32) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        }
        fuzzySearchEventTracker.copydefault(str, charSequence, list, str2, str4, coroutineScope);
    }

    public final <T extends InterfaceC47221tlu> void copydefault(@NotNull String str, CharSequence charSequence, @NotNull List<? extends T> list, @NotNull String str2, @NotNull String str3, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        AEQbTJ(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FuzzySearchEventTracker$trackFuzzySearchStart$1(list, str, charSequence, str2, str3, null), 3, null));
    }

    public final void KWHzl(@NotNull final String str, final CharSequence charSequence, @NotNull final String str2, @NotNull final String str3, @NotNull String str4, @NotNull String str5, @NotNull final String str6) {
        final String strValueOf;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String strValueOf2 = str4;
        Intrinsics.checkNotNullParameter(strValueOf2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        String strValueOf3 = String.valueOf(charSequence);
        Locale locale = Locale.ROOT;
        String lowerCase = strValueOf3.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (!C33129mqd.OLrzqt((CharSequence) str4) || C33129mqd.AhwBna(str4) == 0) {
            C47222tlv c47222tlv = C47222tlv.KWHzl;
            String lowerCase2 = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            strValueOf2 = String.valueOf(c47222tlv.OLrzqt(lowerCase, lowerCase2));
        }
        final String str7 = strValueOf2;
        if (!C33129mqd.OLrzqt((CharSequence) str5) || C33129mqd.AhwBna(str5) == 0) {
            C47222tlv c47222tlv2 = C47222tlv.KWHzl;
            String lowerCase3 = str3.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            strValueOf = String.valueOf(c47222tlv2.OLrzqt(lowerCase, lowerCase3));
        } else {
            strValueOf = str5;
        }
        C32866mlf.onEvent$default("Search_Search_FuzzySearchResult_Click", (TrackChannel[]) null, new Function1() { // from class: o.tlE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FuzzySearchEventTracker.KWHzl(str, charSequence, str2, str3, str7, strValueOf, str6, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit KWHzl(String str, CharSequence charSequence, String str2, String str3, String str4, String str5, String str6, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AEQbTJ.invoke(eventParamsList);
        EventParamsList.put$default(eventParamsList, "identifier", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, Web3SecurityTrackEvent.VALUE_INPUT, String.valueOf(charSequence), false, 4, null);
        EventParamsList.put$default(eventParamsList, "primary", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "secondary", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "primarysimilarity", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "secondarysimilarity", str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER, str6, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final String str, final CharSequence charSequence, @NotNull final String str2, @NotNull final String str3, @NotNull String str4, @NotNull String str5, @NotNull final String str6, @NotNull final String str7, final String str8) {
        String lowerCase;
        final String strValueOf;
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String strValueOf2 = str4;
        Intrinsics.checkNotNullParameter(strValueOf2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        if (charSequence == null || (string = charSequence.toString()) == null || (string2 = StringsKt__StringsKt.hDKMBd((CharSequence) string).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        if (!C33129mqd.OLrzqt((CharSequence) str4) || C33129mqd.AhwBna(str4) == 0) {
            C47222tlv c47222tlv = C47222tlv.KWHzl;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            strValueOf2 = String.valueOf(c47222tlv.OLrzqt(lowerCase, lowerCase2));
        }
        final String str9 = strValueOf2;
        if (!C33129mqd.OLrzqt((CharSequence) str5) || C33129mqd.AhwBna(str5) == 0) {
            C47222tlv c47222tlv2 = C47222tlv.KWHzl;
            String lowerCase3 = str3.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            strValueOf = String.valueOf(c47222tlv2.OLrzqt(lowerCase, lowerCase3));
        } else {
            strValueOf = str5;
        }
        C32866mlf.onEvent$default("Search_Search_FuzzySearchResult_Click", (TrackChannel[]) null, new Function1() { // from class: o.tlI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return FuzzySearchEventTracker.copydefault(str, charSequence, str2, str3, str9, strValueOf, str6, str7, str8, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit copydefault(String str, CharSequence charSequence, String str2, String str3, String str4, String str5, String str6, String str7, String str8, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AEQbTJ.invoke(eventParamsList);
        EventParamsList.put$default(eventParamsList, "identifier", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, Web3SecurityTrackEvent.VALUE_INPUT, String.valueOf(charSequence), false, 4, null);
        EventParamsList.put$default(eventParamsList, "primary", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "secondary", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "primarysimilarity", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "secondarysimilarity", str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER, str6, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_type", str7, false, 4, null);
        if (str8 != null) {
            EventParamsList.put$default(eventParamsList, "flow", str8, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String getTimeStamp$default(FuzzySearchEventTracker fuzzySearchEventTracker, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "dd/MM/yyyy HH:mm:ss.SSS";
        }
        return fuzzySearchEventTracker.KWHzl(str);
    }

    public final String KWHzl(String str) {
        Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(String.valueOf(System.currentTimeMillis()));
        if (fieldNames == null) {
            return "Invalid input";
        }
        String str2 = new SimpleDateFormat(str, Locale.getDefault()).format(new Date(fieldNames.longValue()));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends InterfaceC47221tlu> Pair<String, String> OLrzqt(List<? extends T> list, SearchType searchType) {
        int length;
        int size = list.size();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC47221tlu interfaceC47221tlu = (InterfaceC47221tlu) it.next();
            if (searchType == SearchType.SEARCH_MATCHER_PRIMARY) {
                String primary = interfaceC47221tlu.getPrimary();
                length = primary != null ? primary.length() : 0;
            } else {
                String secondary = interfaceC47221tlu.getSecondary();
                if (secondary != null) {
                    length = secondary.length();
                }
            }
            arrayList.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList.iterator();
        double dPow = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dIntValue = 0.0d;
        while (it2.hasNext()) {
            dIntValue += (double) ((Number) it2.next()).intValue();
        }
        double d = size;
        double d2 = dIntValue / d;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            dPow += Math.pow(((double) ((Number) it3.next()).intValue()) - d2, 2);
        }
        return new Pair<>(String.valueOf(d2), String.valueOf(dPow / d));
    }
}
