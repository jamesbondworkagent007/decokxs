package o;

import com.okinc.localization.internal.repository.LanguagesListRepository;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.server.AppLanguage;
import com.okinc.localization2.bean.server.AppLanguageFallback;
import com.okinc.localization2.repo.LanguageFallbackRepo$getDefaultFallbackFromLangListCache$1;
import com.okinc.localization2.repo.LanguageFallbackRepo$getFallbackLocaleForSelectLanguage$1;
import com.okinc.localization2.repo.LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1;
import com.okinc.localization2.repo.LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$locale$1;
import com.okinc.localization2.repo.LanguageFallbackRepo$getFallbackLocaleInternal$2;
import com.okinc.localization2.repo.LanguageFallbackRepo$getLocaleWithFallback$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pUe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C38314pUe {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public static java.lang.String KWHzl = "lang_fallback.json";
    public LanguageUnit AEQbTJ;
    public final CoroutineDispatcher AhwBna;
    public final java.util.Map<java.lang.String, LanguageUnit> OLrzqt;
    public java.lang.String copydefault;
    public final C38311pUb djBIcL;
    public final LanguagesListRepository valueOf;

    @yCM
    public C38314pUe(@NotNull C38311pUb c38311pUb, @NotNull LanguagesListRepository languagesListRepository, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c38311pUb, "");
        Intrinsics.checkNotNullParameter(languagesListRepository, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.djBIcL = c38311pUb;
        this.valueOf = languagesListRepository;
        this.AhwBna = coroutineDispatcher;
        this.OLrzqt = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.Locale locale, java.lang.String str, @NotNull Continuation<? super LanguageUnit> continuation) {
        LanguageFallbackRepo$getLocaleWithFallback$1 languageFallbackRepo$getLocaleWithFallback$1;
        C38314pUe c38314pUe;
        java.lang.String str2;
        if (continuation instanceof LanguageFallbackRepo$getLocaleWithFallback$1) {
            languageFallbackRepo$getLocaleWithFallback$1 = (LanguageFallbackRepo$getLocaleWithFallback$1) continuation;
            int i = languageFallbackRepo$getLocaleWithFallback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageFallbackRepo$getLocaleWithFallback$1.label = i - Integer.MIN_VALUE;
            } else {
                languageFallbackRepo$getLocaleWithFallback$1 = new LanguageFallbackRepo$getLocaleWithFallback$1(this, continuation);
            }
        }
        java.lang.Object obj = languageFallbackRepo$getLocaleWithFallback$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = languageFallbackRepo$getLocaleWithFallback$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("LanguageFallbackRepo", "getLocaleWithFallback, start.checkLocale:" + locale);
            java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(C38303pTu.AYXKKw(locale));
            if (str == null) {
                str = this.djBIcL.djBIcL().getMarket();
            }
            Intrinsics.copydefault(localeForLanguageTag);
            java.lang.String strEZpvd = EZpvd(str, localeForLanguageTag);
            LanguageUnit languageUnit = this.OLrzqt.get(strEZpvd);
            if (languageUnit != null) {
                return languageUnit;
            }
            languageFallbackRepo$getLocaleWithFallback$1.L$0 = this;
            languageFallbackRepo$getLocaleWithFallback$1.L$1 = strEZpvd;
            languageFallbackRepo$getLocaleWithFallback$1.label = 1;
            java.lang.Object objEZpvd = EZpvd(str, localeForLanguageTag, languageFallbackRepo$getLocaleWithFallback$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c38314pUe = this;
            obj = objEZpvd;
            str2 = strEZpvd;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) languageFallbackRepo$getLocaleWithFallback$1.L$1;
            c38314pUe = (C38314pUe) languageFallbackRepo$getLocaleWithFallback$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        LanguageUnit languageUnit2 = (LanguageUnit) obj;
        c38314pUe.OLrzqt.put(str2, languageUnit2);
        return languageUnit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super LanguageUnit> continuation) throws java.lang.Throwable {
        LanguageFallbackRepo$getFallbackLocaleForSelectLanguage$1 languageFallbackRepo$getFallbackLocaleForSelectLanguage$1;
        C38314pUe c38314pUe;
        if (continuation instanceof LanguageFallbackRepo$getFallbackLocaleForSelectLanguage$1) {
            languageFallbackRepo$getFallbackLocaleForSelectLanguage$1 = (LanguageFallbackRepo$getFallbackLocaleForSelectLanguage$1) continuation;
            int i = languageFallbackRepo$getFallbackLocaleForSelectLanguage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageFallbackRepo$getFallbackLocaleForSelectLanguage$1.label = i - Integer.MIN_VALUE;
            } else {
                languageFallbackRepo$getFallbackLocaleForSelectLanguage$1 = new LanguageFallbackRepo$getFallbackLocaleForSelectLanguage$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = languageFallbackRepo$getFallbackLocaleForSelectLanguage$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = languageFallbackRepo$getFallbackLocaleForSelectLanguage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            LanguageUnit languageUnit = this.AEQbTJ;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.copydefault) && languageUnit != null) {
                return languageUnit;
            }
            languageFallbackRepo$getFallbackLocaleForSelectLanguage$1.L$0 = this;
            languageFallbackRepo$getFallbackLocaleForSelectLanguage$1.L$1 = str;
            languageFallbackRepo$getFallbackLocaleForSelectLanguage$1.label = 1;
            objCopydefault = copydefault(str, languageFallbackRepo$getFallbackLocaleForSelectLanguage$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c38314pUe = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) languageFallbackRepo$getFallbackLocaleForSelectLanguage$1.L$1;
            c38314pUe = (C38314pUe) languageFallbackRepo$getFallbackLocaleForSelectLanguage$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        LanguageUnit languageUnit2 = (LanguageUnit) objCopydefault;
        c38314pUe.AEQbTJ = languageUnit2;
        c38314pUe.copydefault = str;
        return languageUnit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, Continuation<? super LanguageUnit> continuation) throws java.lang.Throwable {
        LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1 languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1;
        if (continuation instanceof LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1) {
            languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1 = (LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1) continuation;
            int i = languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1 = new LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AhwBna;
            LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$locale$1 languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$locale$1 = new LanguageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$locale$1(this, str, null);
            languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1.L$0 = str;
            languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$locale$1, languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) languageFallbackRepo$getFallbackLocaleForSelectLanguageInternal$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.util.Locale locale = (java.util.Locale) objWithContext;
        pUU.KWHzl("LanguageFallbackRepo", "getFallbackLocaleForSelectLanguageInternal, result:" + locale);
        java.lang.String languageTag = locale.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "");
        return new LanguageUnit(str, languageTag);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, Continuation<? super java.util.Locale> continuation) throws java.lang.Throwable {
        LanguageFallbackRepo$getDefaultFallbackFromLangListCache$1 languageFallbackRepo$getDefaultFallbackFromLangListCache$1;
        if (continuation instanceof LanguageFallbackRepo$getDefaultFallbackFromLangListCache$1) {
            languageFallbackRepo$getDefaultFallbackFromLangListCache$1 = (LanguageFallbackRepo$getDefaultFallbackFromLangListCache$1) continuation;
            int i = languageFallbackRepo$getDefaultFallbackFromLangListCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageFallbackRepo$getDefaultFallbackFromLangListCache$1.label = i - Integer.MIN_VALUE;
            } else {
                languageFallbackRepo$getDefaultFallbackFromLangListCache$1 = new LanguageFallbackRepo$getDefaultFallbackFromLangListCache$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = languageFallbackRepo$getDefaultFallbackFromLangListCache$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = languageFallbackRepo$getDefaultFallbackFromLangListCache$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            LanguagesListRepository languagesListRepository = this.valueOf;
            languageFallbackRepo$getDefaultFallbackFromLangListCache$1.label = 1;
            objCopydefault = languagesListRepository.copydefault(str, languageFallbackRepo$getDefaultFallbackFromLangListCache$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        AppLanguage appLanguage = (AppLanguage) objCopydefault;
        if (appLanguage == null) {
            return null;
        }
        return java.util.Locale.forLanguageTag(appLanguage.getFallback().getDefaultFallback());
    }

    public final java.util.Locale OLrzqt(java.lang.String str) {
        java.util.Locale localeAEQbTJ = pTG.OLrzqt.AEQbTJ(str);
        try {
            if (!OLrzqt()) {
                return localeAEQbTJ;
            }
            java.lang.String strEZpvd = C33486mxP.EZpvd(C43246rlf.OLrzqt.valueOf(), EZpvd(str));
            Json jsonDbNXlk = oJV.AEQbTJ.DbNXlk();
            Intrinsics.copydefault((java.lang.Object) strEZpvd);
            JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(jsonDbNXlk.parseToJsonElement(strEZpvd)).get((java.lang.Object) AppLanguageFallback.KEY_DEFAULT_FALLBACK);
            if (jsonElement == null) {
                return localeAEQbTJ;
            }
            java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(JsonElementKt.getJsonPrimitive(jsonElement).getContent());
            if (localeForLanguageTag.getLanguage().length() <= 0 || localeForLanguageTag.getCountry().length() <= 0) {
                return localeAEQbTJ;
            }
            Intrinsics.copydefault(localeForLanguageTag);
            return localeForLanguageTag;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("LanguageFallbackRepo", "readDefaultFromFallbackFile", e);
            return localeAEQbTJ;
        }
    }

    public final java.lang.Object EZpvd(java.lang.String str, java.util.Locale locale, Continuation<? super LanguageUnit> continuation) {
        return BuildersKt.withContext(this.AhwBna, new LanguageFallbackRepo$getFallbackLocaleInternal$2(this, locale, str, null), continuation);
    }

    public final boolean OLrzqt() {
        try {
            return pTG.OLrzqt.EZpvd(C43246rlf.OLrzqt.valueOf(), this.djBIcL.djBIcL().getMarket(), KWHzl);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("LanguageFallbackRepo", "containsFallbackFile", e);
            return false;
        }
    }

    public final java.lang.String OLrzqt(@NotNull java.util.Locale locale, java.util.Set<? extends Map.Entry<java.lang.String, ? extends JsonElement>> set) {
        Intrinsics.checkNotNullParameter(locale, "");
        if (set == null || set.isEmpty()) {
            return null;
        }
        java.lang.String lowerCase = C38303pTu.AYXKKw(locale).toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.util.Iterator<? extends Map.Entry<java.lang.String, ? extends JsonElement>> it = set.iterator();
        while (it.hasNext()) {
            java.lang.String strEZpvd = EZpvd(it.next(), lowerCase);
            if (strEZpvd != null) {
                return strEZpvd;
            }
        }
        return null;
    }

    public final java.lang.String AEQbTJ(@NotNull java.util.Locale locale, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (map.isEmpty()) {
            return null;
        }
        return map.get(locale.getLanguage());
    }

    public final java.util.Map<java.lang.String, java.lang.String> KWHzl(JsonArray jsonArray, java.util.Set<? extends Map.Entry<java.lang.String, ? extends JsonElement>> set) {
        if (jsonArray == null || jsonArray.isEmpty() || set == null || set.isEmpty()) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, ? extends JsonElement> entry : set) {
            java.util.Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                java.lang.String content = JsonElementKt.getJsonPrimitive(it.next()).getContent();
                if (C59449zhJ.startsWith$default(entry.getKey(), content + "-", false, 2, null)) {
                    linkedHashMap.put(content, entry.getKey());
                }
            }
        }
        return linkedHashMap;
    }

    public final java.lang.String EZpvd(Map.Entry<java.lang.String, ? extends JsonElement> entry, java.lang.String str) {
        java.util.Iterator<JsonElement> it = JsonElementKt.getJsonArray(entry.getValue()).iterator();
        while (it.hasNext()) {
            if (C59449zhJ.gEmmrt(str, JsonElementKt.getJsonPrimitive(it.next()).getContent(), true)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return str + java.io.File.separator + KWHzl;
    }

    public final java.lang.String EZpvd(java.lang.String str, java.util.Locale locale) {
        java.lang.String lowerCase = C38303pTu.AYXKKw(locale).toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return str + ":" + lowerCase;
    }

    /* JADX INFO: renamed from: o.pUe$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pUe.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
