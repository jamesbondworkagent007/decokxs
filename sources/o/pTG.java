package o;

import com.okinc.localization2.LocalizeEventReport;
import com.okinc.localization2.bean.GroupLanguages;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pTG {
    public static final pTG OLrzqt = new pTG();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.pTC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pTG.EZpvd();
        }
    });
    public static final int copydefault = 8;

    private pTG() {
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) KWHzl.getValue();
    }

    public static final java.lang.String EZpvd() {
        return C54809xWc.KWHzl("md5");
    }

    public final boolean AEQbTJ(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        if (file.isFile()) {
            java.lang.String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            if (C59449zhJ.valueOf(absolutePath, ".json", true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean KWHzl(@NotNull java.io.File file) {
        java.io.File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(file, "");
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return false;
        }
        for (java.io.File file2 : fileArrListFiles) {
            pTG ptg = OLrzqt;
            Intrinsics.copydefault(file2);
            if (ptg.AEQbTJ(file2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            java.lang.String[] list = context.getAssets().list(str);
            if (list != null) {
                return yDV.valueOf(list, str2);
            }
            return false;
        } catch (java.lang.Exception e) {
            pUU.OLrzqt("LangPackUtils", "assetsContainsFile", e);
            return false;
        }
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String strKWHzl = KWHzl(context);
        java.lang.String strValueOf = C34703nhO.valueOf(context);
        java.lang.String str = java.io.File.separator;
        return strKWHzl + strValueOf + str + "temp" + str;
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context, @NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(languageUnit, "");
        java.lang.String strKWHzl = KWHzl(context);
        java.lang.String str = java.io.File.separator;
        return strKWHzl + "all_version" + str + languageUnit.getMarket() + str + languageUnit.getLanguageCode() + str;
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strKWHzl = KWHzl(context);
        java.lang.String str2 = java.io.File.separator;
        return strKWHzl + "all_version" + str2 + "startup" + str2 + str + str2;
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return KWHzl(context) + "download" + java.io.File.separator;
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull LanguageUnit languageUnit, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(languageUnit, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.io.File file = new java.io.File(OLrzqt(context, languageUnit));
            if (C33056mpJ.AEQbTJ(file)) {
                yFI.writeText$default(file, str, null, 2, null);
            }
        } catch (java.lang.Exception e) {
            pUU.OLrzqt("LangPackUtils", "writeLangPackMD5", e);
        }
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context, @NotNull LanguageUnit languageUnit) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(languageUnit, "");
        return C38301pTs.OLrzqt.EZpvd(OLrzqt(context, languageUnit));
    }

    public final java.lang.String KWHzl(android.content.Context context) {
        java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
        java.lang.String str = java.io.File.separator;
        return absolutePath + str + "language" + str;
    }

    public final java.lang.String OLrzqt(android.content.Context context, LanguageUnit languageUnit) {
        return AEQbTJ(context, languageUnit) + OLrzqt();
    }

    public static final class Activity implements InterfaceC33145mqt {
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ CancellableContinuation<Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(java.lang.String str, CancellableContinuation<? super Unit> cancellableContinuation) {
            this.KWHzl = str;
            this.copydefault = cancellableContinuation;
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(long j, long j2) {
            pUU.EZpvd("LangPackUtils", "downloadResources, onProgress progress = " + j + ", total = " + j2);
        }

        @Override // o.InterfaceC33145mqt
        public void EZpvd(int i, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.copydefault("LangPackUtils", "downloadResources, onError errorCode = " + i + ", desc = " + str);
            LocalizeEventReport.INSTANCE.reportLanguagePackDownloadResult(java.lang.String.valueOf(i), str, this.KWHzl);
            CancellableContinuation<Unit> cancellableContinuation = this.copydefault;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.io.IOException("onError errorCode = " + i + ", desc = " + str))));
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("LangPackUtils", "downloadResources, onSuccess result = " + str);
            LocalizeEventReport.INSTANCE.reportLanguagePackDownloadResult("", "", this.KWHzl);
            CancellableContinuation<Unit> cancellableContinuation = this.copydefault;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
        }
    }

    public static final class TaskDescription implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ C33143mqr KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(C33143mqr c33143mqr) {
            this.KWHzl = c33143mqr;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.Throwable th) {
            this.KWHzl.copydefault();
        }
    }

    public static final class ActionBar implements InterfaceC54816xWj {
        public final /* synthetic */ Function0<Unit> AEQbTJ;
        public final /* synthetic */ Continuation<Unit> copydefault;

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function0<Unit> function0, Continuation<? super Unit> continuation) {
            this.AEQbTJ = function0;
            this.copydefault = continuation;
        }

        @Override // o.InterfaceC54816xWj
        public void EZpvd() {
            C54819xWm.KWHzl().KWHzl(this);
            this.AEQbTJ.invoke();
            Continuation<Unit> continuation = this.copydefault;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
        }
    }

    public final java.lang.Object EZpvd(@NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        C54819xWm.KWHzl().AEQbTJ(new ActionBar(function0, c56434yFf));
        java.lang.Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String strEZpvd;
        C43386roM c43386roM = C43386roM.EZpvd;
        return (!c43386roM.OLrzqt() || (strEZpvd = c43386roM.EZpvd()) == null) ? "" : strEZpvd;
    }

    public final boolean gEmmrt() {
        int iAEQbTJ = C48787ucK.AEQbTJ.AEQbTJ("ignore_startup_keys_load.is_open", 1);
        pUU.KWHzl("LangPackUtils", "loadLocalStartUpLanguagePack, ignore_startup_keys_load.is_open is " + iAEQbTJ);
        return iAEQbTJ == 1;
    }

    public final java.lang.String copydefault() {
        C33081mpi c33081mpi = C33081mpi.OLrzqt;
        if (c33081mpi.AEQbTJ() == null) {
            return "global";
        }
        java.lang.String strAEQbTJ = c33081mpi.AEQbTJ();
        Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
        return strAEQbTJ;
    }

    public final java.util.Locale AEQbTJ(java.lang.String str) {
        java.util.Locale locale = java.util.Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        return locale;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.util.List<pTW> copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        java.lang.Boolean booleanOrNull;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (!EZpvd(context, str, "languages_embedded.json")) {
                pUU.KWHzl("LangPackUtils", "getEmbeddedLangList, no languages_embedded.json exist for " + str + ". return");
                return yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.io.InputStream inputStreamOpen = context.getAssets().open(str + java.io.File.separator + "languages_embedded.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                java.lang.String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                yFA.copydefault(bufferedReader, null);
                for (JsonElement jsonElement : JsonElementKt.getJsonArray(oJV.AEQbTJ.DbNXlk().parseToJsonElement(strAEQbTJ))) {
                    JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "iso_code");
                    java.lang.String content = jsonElement2 != null ? JsonElementKt.getJsonPrimitive(jsonElement2).getContent() : null;
                    JsonElement jsonElement3 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "real_code");
                    java.lang.String content2 = jsonElement3 != null ? JsonElementKt.getJsonPrimitive(jsonElement3).getContent() : null;
                    JsonElement jsonElement4 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "display_name");
                    java.lang.String content3 = jsonElement4 != null ? JsonElementKt.getJsonPrimitive(jsonElement4).getContent() : null;
                    JsonElement jsonElement5 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "cefi_display_name");
                    java.lang.String content4 = jsonElement5 != null ? JsonElementKt.getJsonPrimitive(jsonElement5).getContent() : null;
                    JsonElement jsonElement6 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "hide_in_cefi_mode");
                    boolean zBooleanValue = (jsonElement6 == null || (booleanOrNull = JsonElementKt.getBooleanOrNull(JsonElementKt.getJsonPrimitive(jsonElement6))) == null) ? false : booleanOrNull.booleanValue();
                    if (content != null && content2 != null && content3 != null) {
                        arrayList.add(new pTW(content, content2, content3, content4, zBooleanValue));
                    }
                }
                pUU.KWHzl("LangPackUtils", "getEmbeddedLangList, finished. size:" + arrayList.size());
                return arrayList;
            } finally {
            }
        } catch (java.lang.Exception e) {
            pUU.OLrzqt("LangPackUtils", "getEmbeddedLangList, error.", e);
            return yDY.AhwBna();
        }
    }

    public final void AEQbTJ(@NotNull java.io.File file, @NotNull java.io.File file2) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        for (java.io.File file3 : yFJ.AYXKKw(file)) {
            if (file3.isFile()) {
                yFL.copyTo$default(file3, new java.io.File(file2, file3.getName()), true, 0, 4, null);
                file3.delete();
            }
        }
    }

    public final java.util.List<Triple<LanguageUnit, java.lang.Long, java.lang.Long>> AEQbTJ(@NotNull GroupLanguages groupLanguages, @NotNull pTE pte) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(groupLanguages, "");
        Intrinsics.checkNotNullParameter(pte, "");
        java.util.ArrayList<LanguageUnit> arrayList = new java.util.ArrayList();
        LanguageUnit marketCurrent = groupLanguages.getMarketCurrent();
        if (marketCurrent != null) {
            arrayList.add(marketCurrent);
        }
        LanguageUnit marketDefault = groupLanguages.getMarketDefault();
        if (marketDefault != null) {
            arrayList.add(marketDefault);
        }
        LanguageUnit globalCurrent = groupLanguages.getGlobalCurrent();
        if (globalCurrent != null) {
            arrayList.add(globalCurrent);
        }
        LanguageUnit globalDefault = groupLanguages.getGlobalDefault();
        if (globalDefault != null) {
            arrayList.add(globalDefault);
        }
        if (arrayList.isEmpty()) {
            return yDY.AhwBna();
        }
        try {
            Result.Application application = Result.Companion;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (LanguageUnit languageUnit : arrayList) {
                if (pte.copydefault(languageUnit, false)) {
                    arrayList2.add(new Triple(languageUnit, java.lang.Long.valueOf(pte.AEQbTJ(languageUnit)), java.lang.Long.valueOf(pte.KWHzl(languageUnit))));
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList2);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.util.List<Triple<LanguageUnit, java.lang.Long, java.lang.Long>> list = (java.util.List) objM7377constructorimpl;
        return list == null ? yDY.AhwBna() : list;
    }

    public final void OLrzqt(@NotNull java.util.List<Triple<LanguageUnit, java.lang.Long, java.lang.Long>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            pUU.KWHzl("LangPackUtils", "verifyKeysCount, ignore empty list.");
            return;
        }
        for (Triple<LanguageUnit, java.lang.Long, java.lang.Long> triple : list) {
            LanguageUnit languageUnitComponent1 = triple.component1();
            long jLongValue = triple.component2().longValue();
            long jLongValue2 = triple.component3().longValue();
            pUU.KWHzl("LangPackUtils", "verifyKeysCount, unit:" + languageUnitComponent1 + ", expectedCount:" + jLongValue + ", mmkvCount:" + jLongValue2);
            if (jLongValue > 0 && jLongValue2 > 0 && jLongValue2 < jLongValue) {
                pUU.valueOf("LangPackUtils", "verifyKeysCount, report bad case");
                LocalizeEventReport.INSTANCE.reportLanguagePackGenerateError(languageUnitComponent1, jLongValue, jLongValue2);
            }
        }
    }

    public final java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        C33143mqr c33143mqr = new C33143mqr(context, str, str2, null, new Activity(str, cancellableContinuationImpl));
        c33143mqr.EZpvd();
        cancellableContinuationImpl.invokeOnCancellation(new TaskDescription(c33143mqr));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result == C56442yFn.copydefault() ? result : Unit.INSTANCE;
    }
}
