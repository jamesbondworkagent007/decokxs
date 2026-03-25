package com.okinc.localization.internal.repository;

import android.content.Context;
import com.okinc.localization.bean.LanguageItem;
import com.okinc.localization.internal.repository.LanguagesListRepository;
import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.server.AppLanguage;
import com.okinc.localization2.bean.server.AppLanguageFallback;
import com.okinc.localization2.bean.server.AppLanguageLanguageItem;
import com.okinc.network.okg.response.ResponseData;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.C32979mnm;
import o.C33056mpJ;
import o.C34703nhO;
import o.C38311pUb;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56442yFn;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.oJV;
import o.pSG;
import o.pSM;
import o.pTG;
import o.pTW;
import o.pUU;
import o.yCM;
import o.yCR;
import o.yFA;
import o.yFL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class LanguagesListRepository {
    public final CoroutineDispatcher KWHzl;
    public final Map<String, List<LanguageItem>> OLrzqt;
    public final Context copydefault;
    public final C38311pUb djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static final InterfaceC56387yDm<File> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.pSJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LanguagesListRepository.EZpvd();
        }
    });

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.CACHE_AND_EMBEDDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    @yCM
    public LanguagesListRepository(@NotNull Context context, @NotNull C38311pUb c38311pUb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c38311pUb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = context;
        this.djBIcL = c38311pUb;
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = new LinkedHashMap();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LoadType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LoadType[] $VALUES;
        public static final LoadType CACHE_AND_EMBEDDED = new LoadType("CACHE_AND_EMBEDDED", 0);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LoadType[] $values() {
            return new LoadType[]{CACHE_AND_EMBEDDED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LoadType> getEntries() {
            return $ENTRIES;
        }

        private LoadType(String str, int i) {
        }

        static {
            LoadType[] loadTypeArr$values = $values();
            $VALUES = loadTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(loadTypeArr$values);
        }

        public static LoadType valueOf(String str) {
            return (LoadType) Enum.valueOf(LoadType.class, str);
        }

        public static LoadType[] values() {
            return (LoadType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull LoadType loadType, String str, @NotNull Continuation<? super List<LanguageItem>> continuation) throws Throwable {
        LanguagesListRepository$getLanguagesWithType$1 languagesListRepository$getLanguagesWithType$1;
        LanguagesListRepository languagesListRepository;
        if (continuation instanceof LanguagesListRepository$getLanguagesWithType$1) {
            languagesListRepository$getLanguagesWithType$1 = (LanguagesListRepository$getLanguagesWithType$1) continuation;
            int i = languagesListRepository$getLanguagesWithType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagesListRepository$getLanguagesWithType$1.label = i - Integer.MIN_VALUE;
            } else {
                languagesListRepository$getLanguagesWithType$1 = new LanguagesListRepository$getLanguagesWithType$1(this, continuation);
            }
        }
        Object objEZpvd = languagesListRepository$getLanguagesWithType$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = languagesListRepository$getLanguagesWithType$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (Application.AEQbTJ[loadType.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            languagesListRepository$getLanguagesWithType$1.L$0 = this;
            languagesListRepository$getLanguagesWithType$1.L$1 = str;
            languagesListRepository$getLanguagesWithType$1.label = 1;
            objEZpvd = EZpvd(str, languagesListRepository$getLanguagesWithType$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            languagesListRepository = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) languagesListRepository$getLanguagesWithType$1.L$1;
            languagesListRepository = (LanguagesListRepository) languagesListRepository$getLanguagesWithType$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        List list = (List) objEZpvd;
        return list == null ? languagesListRepository.EZpvd(str) : list;
    }

    public final List<LanguageItem> EZpvd(String str) {
        pUU.KWHzl("LanguagesListRepository", "getLanguagesFromEmbedded, start. market:" + str);
        if (str == null) {
            str = copydefault();
        }
        if (this.OLrzqt.containsKey(str)) {
            return this.OLrzqt.get(str);
        }
        List<pTW> listCopydefault = pTG.OLrzqt.copydefault(this.copydefault, str);
        if (listCopydefault.isEmpty()) {
            this.OLrzqt.put(str, null);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (pTW ptw : listCopydefault) {
            Locale localeForLanguageTag = Locale.forLanguageTag(ptw.EZpvd());
            Intrinsics.copydefault(localeForLanguageTag);
            String languageTag = localeForLanguageTag.toLanguageTag();
            Intrinsics.checkNotNullExpressionValue(languageTag, "");
            arrayList.add(new LanguageItem(localeForLanguageTag, languageTag, ptw.copydefault(), ptw.KWHzl(), ptw.OLrzqt(), str));
        }
        this.OLrzqt.put(str, arrayList);
        return arrayList;
    }

    public final String copydefault() {
        return this.djBIcL.djBIcL().getMarket();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(String str, @NotNull Continuation<? super List<LanguageItem>> continuation) throws Throwable {
        LanguagesListRepository$getLanguagesFromCache$1 languagesListRepository$getLanguagesFromCache$1;
        LanguagesListRepository languagesListRepository;
        if (continuation instanceof LanguagesListRepository$getLanguagesFromCache$1) {
            languagesListRepository$getLanguagesFromCache$1 = (LanguagesListRepository$getLanguagesFromCache$1) continuation;
            int i = languagesListRepository$getLanguagesFromCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagesListRepository$getLanguagesFromCache$1.label = i - Integer.MIN_VALUE;
            } else {
                languagesListRepository$getLanguagesFromCache$1 = new LanguagesListRepository$getLanguagesFromCache$1(this, continuation);
            }
        }
        Object objCopydefault = languagesListRepository$getLanguagesFromCache$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = languagesListRepository$getLanguagesFromCache$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            pUU.KWHzl("LanguagesListRepository", "getLanguagesFromCache, start. market:" + str);
            languagesListRepository$getLanguagesFromCache$1.L$0 = this;
            languagesListRepository$getLanguagesFromCache$1.label = 1;
            objCopydefault = copydefault(str, languagesListRepository$getLanguagesFromCache$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            languagesListRepository = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            languagesListRepository = (LanguagesListRepository) languagesListRepository$getLanguagesFromCache$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        AppLanguage appLanguage = (AppLanguage) objCopydefault;
        if (appLanguage == null) {
            return null;
        }
        return languagesListRepository.copydefault(appLanguage);
    }

    public final Object copydefault(String str, @NotNull Continuation<? super AppLanguage> continuation) {
        return BuildersKt.withContext(this.KWHzl, new LanguagesListRepository$getCachedAppLanguage$2(this, str, null), continuation);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pSG.Application.getLanguageListV3$default(o.pSG, com.okinc.network.okg.cor.SubdomainStrategy, java.lang.String, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(String str, @NotNull Continuation<? super List<LanguageItem>> continuation) throws Throwable {
        LanguagesListRepository$getLanguagesFromServer$1 languagesListRepository$getLanguagesFromServer$1;
        Object objM7377constructorimpl;
        LanguagesListRepository languagesListRepository;
        ResponseData responseData;
        if (continuation instanceof LanguagesListRepository$getLanguagesFromServer$1) {
            languagesListRepository$getLanguagesFromServer$1 = (LanguagesListRepository$getLanguagesFromServer$1) continuation;
            int i = languagesListRepository$getLanguagesFromServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagesListRepository$getLanguagesFromServer$1.label = i - Integer.MIN_VALUE;
            } else {
                languagesListRepository$getLanguagesFromServer$1 = new LanguagesListRepository$getLanguagesFromServer$1(this, continuation);
            }
        }
        LanguagesListRepository$getLanguagesFromServer$1 languagesListRepository$getLanguagesFromServer$12 = languagesListRepository$getLanguagesFromServer$1;
        Object languageListV3$default = languagesListRepository$getLanguagesFromServer$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = languagesListRepository$getLanguagesFromServer$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(languageListV3$default);
                pUU.KWHzl("LanguagesListRepository", "getLanguagesFromServer, start. market:" + str);
                Result.Application application = Result.Companion;
                pSG psgAEQbTJ = pSM.AEQbTJ();
                if (str == null) {
                    str = copydefault();
                }
                languagesListRepository$getLanguagesFromServer$12.L$0 = this;
                languagesListRepository$getLanguagesFromServer$12.label = 1;
                languageListV3$default = pSG.Application.getLanguageListV3$default(psgAEQbTJ, null, str, languagesListRepository$getLanguagesFromServer$12, 1, null);
                if (languageListV3$default == objCopydefault) {
                    return objCopydefault;
                }
                languagesListRepository = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                languagesListRepository = (LanguagesListRepository) languagesListRepository$getLanguagesFromServer$12.L$0;
                C56391yDq.AEQbTJ(languageListV3$default);
            }
            responseData = (ResponseData) languageListV3$default;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            AppLanguage appLanguage = (AppLanguage) responseData.getData();
            List<AppLanguageLanguageItem> languageList = appLanguage != null ? appLanguage.getLanguageList() : null;
            if (languageList != null && !languageList.isEmpty()) {
                BuildersKt__Builders_commonKt.launch$default(oJV.AEQbTJ.gEmmrt(), languagesListRepository.KWHzl, null, new LanguagesListRepository$getLanguagesFromServer$serverList$1$1(languagesListRepository, responseData, null), 2, null);
                objM7377constructorimpl = Result.m7377constructorimpl(languagesListRepository.copydefault((AppLanguage) responseData.getData()));
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("LanguagesListRepository", "getLanguagesFromServer, onFailure", thM7380exceptionOrNullimpl);
                }
                return (List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            }
        }
        return null;
    }

    public final void AEQbTJ() {
        File[] fileArrListFiles;
        File fileEZpvd = Companion.EZpvd();
        if (!fileEZpvd.exists() || (fileArrListFiles = fileEZpvd.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!Intrinsics.EZpvd((Object) file.getName(), (Object) C34703nhO.valueOf(this.copydefault)) && !Intrinsics.EZpvd((Object) file.getName(), (Object) "all_version")) {
                Intrinsics.copydefault(file);
                yFL.AkhnZx(file);
                pUU.KWHzl("LanguagesListRepository", "removeUnusedDirs, " + file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull LanguageUnit languageUnit, @NotNull Continuation<? super AppLocaleInfo> continuation) throws Throwable {
        LanguagesListRepository$wrapLocale$1 languagesListRepository$wrapLocale$1;
        String displayName;
        if (continuation instanceof LanguagesListRepository$wrapLocale$1) {
            languagesListRepository$wrapLocale$1 = (LanguagesListRepository$wrapLocale$1) continuation;
            int i = languagesListRepository$wrapLocale$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagesListRepository$wrapLocale$1.label = i - Integer.MIN_VALUE;
            } else {
                languagesListRepository$wrapLocale$1 = new LanguagesListRepository$wrapLocale$1(this, continuation);
            }
        }
        Object objOLrzqt = languagesListRepository$wrapLocale$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = languagesListRepository$wrapLocale$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            languagesListRepository$wrapLocale$1.L$0 = languageUnit;
            languagesListRepository$wrapLocale$1.label = 1;
            objOLrzqt = OLrzqt(languageUnit, languagesListRepository$wrapLocale$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            languageUnit = (LanguageUnit) languagesListRepository$wrapLocale$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        LanguageItem languageItem = (LanguageItem) objOLrzqt;
        Locale localeForLanguageTag = Locale.forLanguageTag(languageUnit.getLanguageCode());
        Intrinsics.checkNotNullExpressionValue(localeForLanguageTag, "");
        return new AppLocaleInfo(localeForLanguageTag, languageUnit.getLanguageCode(), (languageItem == null || (displayName = languageItem.getDisplayName()) == null) ? "" : displayName, languageItem != null ? languageItem.getCefiDisplayName() : null, languageUnit.getMarket());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(LanguageUnit languageUnit, Continuation<? super LanguageItem> continuation) throws Throwable {
        LanguagesListRepository$getLanguageItemForLocale$1 languagesListRepository$getLanguageItemForLocale$1;
        if (continuation instanceof LanguagesListRepository$getLanguageItemForLocale$1) {
            languagesListRepository$getLanguageItemForLocale$1 = (LanguagesListRepository$getLanguageItemForLocale$1) continuation;
            int i = languagesListRepository$getLanguageItemForLocale$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagesListRepository$getLanguageItemForLocale$1.label = i - Integer.MIN_VALUE;
            } else {
                languagesListRepository$getLanguageItemForLocale$1 = new LanguagesListRepository$getLanguageItemForLocale$1(this, continuation);
            }
        }
        Object objAEQbTJ = languagesListRepository$getLanguageItemForLocale$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = languagesListRepository$getLanguageItemForLocale$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            LoadType loadType = LoadType.CACHE_AND_EMBEDDED;
            String market = languageUnit.getMarket();
            languagesListRepository$getLanguageItemForLocale$1.L$0 = languageUnit;
            languagesListRepository$getLanguageItemForLocale$1.label = 1;
            objAEQbTJ = AEQbTJ(loadType, market, languagesListRepository$getLanguageItemForLocale$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            languageUnit = (LanguageUnit) languagesListRepository$getLanguageItemForLocale$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        List<LanguageItem> list = (List) objAEQbTJ;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (LanguageItem languageItem : list) {
            if (Intrinsics.EZpvd((Object) languageItem.getLocale().toLanguageTag(), (Object) languageUnit.getLanguageCode())) {
                return languageItem;
            }
        }
        return null;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void EZpvd(AppLanguage appLanguage) {
        if (appLanguage == null) {
            pUU.valueOf("LanguagesListRepository", "saveLanguagesList, expected null input.");
            return;
        }
        File fileEZpvd = EZpvd(this.copydefault, appLanguage.getMarket());
        if (C33056mpJ.AEQbTJ(fileEZpvd)) {
            Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileEZpvd), Charsets.UTF_8);
            BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
            try {
                Json jsonDbNXlk = oJV.AEQbTJ.DbNXlk();
                jsonDbNXlk.getSerializersModule();
                bufferedWriter.write(jsonDbNXlk.encodeToString(AppLanguage.Companion.serializer(), appLanguage));
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(bufferedWriter, null);
                pUU.KWHzl("LanguagesListRepository", "saveLanguagesList, success. dataSize:" + appLanguage.getLanguageList().size() + " for " + appLanguage.getMarket());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    yFA.copydefault(bufferedWriter, th);
                    throw th2;
                }
            }
        }
    }

    public final List<LanguageItem> copydefault(AppLanguage appLanguage) {
        if (appLanguage == null || appLanguage.getLanguageList().isEmpty()) {
            return null;
        }
        List<AppLanguageLanguageItem> languageList = appLanguage.getLanguageList();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(languageList, 10));
        for (AppLanguageLanguageItem appLanguageLanguageItem : languageList) {
            Locale localeForLanguageTag = Locale.forLanguageTag(appLanguageLanguageItem.getIsoCode());
            Intrinsics.copydefault(localeForLanguageTag);
            String languageTag = localeForLanguageTag.toLanguageTag();
            Intrinsics.checkNotNullExpressionValue(languageTag, "");
            arrayList.add(new LanguageItem(localeForLanguageTag, languageTag, appLanguageLanguageItem.getLocalizationName(), appLanguageLanguageItem.getCefiLocalizationName(), appLanguageLanguageItem.getHideInCefiMode(), appLanguage.getMarket()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AppLanguage KWHzl(@NotNull String str) {
        Object objM7377constructorimpl;
        AppLanguage appLanguage;
        JsonPrimitive jsonPrimitive;
        Boolean booleanOrNull;
        JsonPrimitive jsonPrimitive2;
        JsonPrimitive jsonPrimitive3;
        JsonPrimitive jsonPrimitive4;
        JsonPrimitive jsonPrimitive5;
        JsonObject jsonObject;
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive6;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            JsonObject jsonObject2 = JsonElementKt.getJsonObject(oJV.AEQbTJ.DbNXlk().parseToJsonElement(str));
            JsonElement jsonElement2 = (JsonElement) jsonObject2.get((Object) AppLanguage.KEY_FALLBACK);
            String content = (jsonElement2 == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement2)) == null || (jsonElement = (JsonElement) jsonObject.get((Object) AppLanguageFallback.KEY_DEFAULT_FALLBACK)) == null || (jsonPrimitive6 = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive6.getContent();
            JsonElement jsonElement3 = (JsonElement) jsonObject2.get((Object) "market");
            String content2 = (jsonElement3 == null || (jsonPrimitive5 = JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : jsonPrimitive5.getContent();
            JsonElement jsonElement4 = (JsonElement) jsonObject2.get((Object) AppLanguage.KEY_LANGUAGE_LIST);
            JsonArray jsonArray = jsonElement4 != null ? JsonElementKt.getJsonArray(jsonElement4) : null;
            if (jsonArray == null || jsonArray.isEmpty()) {
                appLanguage = null;
                objM7377constructorimpl = Result.m7377constructorimpl(appLanguage);
            } else {
                ArrayList arrayList = new ArrayList();
                for (JsonElement jsonElement5 : jsonArray) {
                    JsonElement jsonElement6 = (JsonElement) JsonElementKt.getJsonObject(jsonElement5).get((Object) AppLanguageLanguageItem.KEY_ISO_CODE);
                    String content3 = (jsonElement6 == null || (jsonPrimitive4 = JsonElementKt.getJsonPrimitive(jsonElement6)) == null) ? null : jsonPrimitive4.getContent();
                    JsonElement jsonElement7 = (JsonElement) JsonElementKt.getJsonObject(jsonElement5).get((Object) AppLanguageLanguageItem.KEY_LOCALIZATION_NAME);
                    String content4 = (jsonElement7 == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement7)) == null) ? null : jsonPrimitive3.getContent();
                    JsonElement jsonElement8 = (JsonElement) JsonElementKt.getJsonObject(jsonElement5).get((Object) AppLanguageLanguageItem.KEY_CEFI_LOCALIZATION_NAME);
                    String contentOrNull = (jsonElement8 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement8)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive2);
                    JsonElement jsonElement9 = (JsonElement) JsonElementKt.getJsonObject(jsonElement5).get((Object) AppLanguageLanguageItem.KEY_HIDE_IN_CEFI_MODE);
                    boolean zBooleanValue = (jsonElement9 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement9)) == null || (booleanOrNull = JsonElementKt.getBooleanOrNull(jsonPrimitive)) == null) ? false : booleanOrNull.booleanValue();
                    if (content3 != null && content4 != null) {
                        arrayList.add(new AppLanguageLanguageItem(content3, content4, contentOrNull, zBooleanValue));
                    }
                }
                if (content != null && content2 != null) {
                    appLanguage = new AppLanguage(new AppLanguageFallback(content), arrayList, content2);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(appLanguage);
            }
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (AppLanguage) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final File EZpvd(Context context, String str) {
        File filesDir = context.getFilesDir();
        String str2 = File.separator;
        return new File(filesDir, "language" + str2 + C34703nhO.valueOf(context) + str2 + str + str2 + "app_languages");
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization.internal.repository.LanguagesListRepository.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final File EZpvd() {
            return (File) LanguagesListRepository.AEQbTJ.getValue();
        }
    }

    public static final File EZpvd() {
        return new File(C32979mnm.EZpvd.OLrzqt().getFilesDir(), "language");
    }
}
