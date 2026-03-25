package o;

import com.okinc.localization.internal.repository.LanguagesListRepository;
import com.okinc.localization2.LPUpdateTime;
import com.okinc.localization2.LocalizeEventReport;
import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.localization2.bean.FallBackType;
import com.okinc.localization2.bean.GroupLanguages;
import com.okinc.localization2.bean.LPDownloadResult;
import com.okinc.localization2.bean.LPLoadResult;
import com.okinc.localization2.bean.LangChangeConfig;
import com.okinc.localization2.bean.LanguageListConfig;
import com.okinc.localization2.bean.LanguagePackConfig;
import com.okinc.localization2.bean.LanguagePackType;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.LanguageUpdateResult;
import com.okinc.localization2.bean.server.AppLink;
import com.okinc.localization2.bean.server.AppLinkLang;
import com.okinc.localization2.repo.LanguagePackRepo$downloadAndUnzipStep$1;
import com.okinc.localization2.repo.LanguagePackRepo$downloadWithNeedLatest$2;
import com.okinc.localization2.repo.LanguagePackRepo$loadLangPack$2;
import com.okinc.localization2.repo.LanguagePackRepo$loadStep$1;
import com.okinc.localization2.repo.LanguagePackRepo$requestLangPackGroupInfo$1;
import com.okinc.localization2.repo.LanguagePackRepo$tryDynamic$1;
import com.okinc.localization2.repo.LanguagePackRepo$unzipInternal$2;
import com.okinc.localization2.repo.LanguagePackRepo$unzipLangPack$2;
import com.okinc.localization2.repo.LanguagePackRepo$unzipStep$1;
import com.okinc.localization2.repo.LanguagePackRepo$updateAndLoadLangPack$1;
import com.okinc.localization2.repo.LanguagePackRepo$updateAndLoadLangPack$result$1;
import com.okinc.localization2.repo.LanguagePackRepo$updateLangPack$1;
import com.okinc.localization2.repo.LanguagePackRepo$updateLangPackInternal$2;
import com.okinc.network.okg.response.ResponseData;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.pSG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pUd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38313pUd {
    public final CoroutineDispatcher AEQbTJ;
    public final pSI AYXKKw;
    public AtomicBoolean AhwBna;
    public final C38319pUj AkhnZx;
    public final C38311pUb DbNXlk;
    public final android.content.Context KWHzl;
    public final AtomicInteger OLrzqt;
    public final CoroutineDispatcher djBIcL;
    public final pSI ejfBZ;
    public final pSI fIwbmz;
    public final pTE fetchVPNInfo;
    public final pSI gEmmrt;
    public final LanguagesListRepository isConnected;
    public final java.util.Map<java.lang.String, Mutex> valueOf;
    public final pTX values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public static final java.util.List<java.lang.String> EZpvd = yDY.gEmmrt("=0 {}", "=1 {}", "=2 {}", "few {}", "many {}", "other {}");

    /* JADX INFO: renamed from: o.pUd$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LanguagePackConfig.values().length];
            try {
                iArr[LanguagePackConfig.CACHE_OR_EMBEDDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LanguagePackConfig.NEED_LATEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[LanguagePackConfig.CACHE_OR_LATEST_OR_EMBEDDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[LanguageListConfig.values().length];
            try {
                iArr2[LanguageListConfig.NO_CHECK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pSI EZpvd() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pSI KWHzl() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pSI OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pSI copydefault() {
        return this.gEmmrt;
    }

    public C38313pUd(@NotNull android.content.Context context, @NotNull pSI psi, @NotNull pSI psi2, @NotNull pSI psi3, @NotNull pSI psi4, @NotNull C38311pUb c38311pUb, @NotNull LanguagesListRepository languagesListRepository, @NotNull pTX ptx, @NotNull pTE pte, @NotNull C38319pUj c38319pUj, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(psi, "");
        Intrinsics.checkNotNullParameter(psi2, "");
        Intrinsics.checkNotNullParameter(psi3, "");
        Intrinsics.checkNotNullParameter(psi4, "");
        Intrinsics.checkNotNullParameter(c38311pUb, "");
        Intrinsics.checkNotNullParameter(languagesListRepository, "");
        Intrinsics.checkNotNullParameter(ptx, "");
        Intrinsics.checkNotNullParameter(pte, "");
        Intrinsics.checkNotNullParameter(c38319pUj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        this.KWHzl = context;
        this.ejfBZ = psi;
        this.fIwbmz = psi2;
        this.AYXKKw = psi3;
        this.gEmmrt = psi4;
        this.DbNXlk = c38311pUb;
        this.isConnected = languagesListRepository;
        this.values = ptx;
        this.fetchVPNInfo = pte;
        this.AkhnZx = c38319pUj;
        this.djBIcL = coroutineDispatcher;
        this.AEQbTJ = coroutineDispatcher2;
        this.OLrzqt = new AtomicInteger(1);
        this.valueOf = new LinkedHashMap(64);
        this.AhwBna = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull LanguageUnit languageUnit, @NotNull LangChangeConfig langChangeConfig, @NotNull Continuation<? super LanguageUpdateResult> continuation) {
        LanguagePackRepo$updateAndLoadLangPack$1 languagePackRepo$updateAndLoadLangPack$1;
        C38313pUd c38313pUd;
        if (continuation instanceof LanguagePackRepo$updateAndLoadLangPack$1) {
            languagePackRepo$updateAndLoadLangPack$1 = (LanguagePackRepo$updateAndLoadLangPack$1) continuation;
            int i = languagePackRepo$updateAndLoadLangPack$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagePackRepo$updateAndLoadLangPack$1.label = i - Integer.MIN_VALUE;
            } else {
                languagePackRepo$updateAndLoadLangPack$1 = new LanguagePackRepo$updateAndLoadLangPack$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = languagePackRepo$updateAndLoadLangPack$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = languagePackRepo$updateAndLoadLangPack$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (!C43308rmo.KWHzl(this.KWHzl)) {
                return new LanguageUpdateResult.ActionBar("updateAndLoadLangPack, not in UI process.");
            }
            CoroutineDispatcher coroutineDispatcher = this.djBIcL;
            LanguagePackRepo$updateAndLoadLangPack$result$1 languagePackRepo$updateAndLoadLangPack$result$1 = new LanguagePackRepo$updateAndLoadLangPack$result$1(this, languageUnit, langChangeConfig, null);
            languagePackRepo$updateAndLoadLangPack$1.L$0 = this;
            languagePackRepo$updateAndLoadLangPack$1.L$1 = langChangeConfig;
            languagePackRepo$updateAndLoadLangPack$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, languagePackRepo$updateAndLoadLangPack$result$1, languagePackRepo$updateAndLoadLangPack$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c38313pUd = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            langChangeConfig = (LangChangeConfig) languagePackRepo$updateAndLoadLangPack$1.L$1;
            c38313pUd = (C38313pUd) languagePackRepo$updateAndLoadLangPack$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        LanguageUpdateResult languageUpdateResult = (LanguageUpdateResult) objWithContext;
        if (langChangeConfig.getLangPackConfig() != LanguagePackConfig.CACHE_OR_EMBEDDED && !(languageUpdateResult instanceof LanguageUpdateResult.ActionBar)) {
            LPUpdateTime.INSTANCE.updateSuccessTime();
        }
        c38313pUd.values.KWHzl();
        return languageUpdateResult;
    }

    public final void AhwBna() {
        this.ejfBZ.EZpvd();
        this.fIwbmz.EZpvd();
        this.AYXKKw.EZpvd();
        this.gEmmrt.EZpvd();
    }

    public final boolean KWHzl(LPDownloadResult lPDownloadResult, LanguagePackConfig languagePackConfig) {
        if (languagePackConfig == LanguagePackConfig.CACHE_OR_LATEST_OR_EMBEDDED || languagePackConfig == LanguagePackConfig.CACHE_OR_EMBEDDED) {
            return false;
        }
        return lPDownloadResult instanceof LPDownloadResult.ActionBar;
    }

    public final LanguageUpdateResult EZpvd(LPLoadResult lPLoadResult) {
        if (lPLoadResult instanceof LPLoadResult.Application) {
            return new LanguageUpdateResult.ActionBar(((LPLoadResult.Application) lPLoadResult).EZpvd());
        }
        if (lPLoadResult instanceof LPLoadResult.Activity) {
            return LanguageUpdateResult.TaskDescription.OLrzqt;
        }
        if (lPLoadResult instanceof LPLoadResult.TaskDescription) {
            return LanguageUpdateResult.Application.KWHzl;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(LanguageUnit languageUnit, LanguagePackConfig languagePackConfig, LanguagePackType languagePackType, Continuation<? super LPDownloadResult> continuation) throws java.lang.Throwable {
        LanguagePackRepo$downloadAndUnzipStep$1 languagePackRepo$downloadAndUnzipStep$1;
        C38313pUd c38313pUd;
        if (continuation instanceof LanguagePackRepo$downloadAndUnzipStep$1) {
            languagePackRepo$downloadAndUnzipStep$1 = (LanguagePackRepo$downloadAndUnzipStep$1) continuation;
            int i = languagePackRepo$downloadAndUnzipStep$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagePackRepo$downloadAndUnzipStep$1.label = i - Integer.MIN_VALUE;
            } else {
                languagePackRepo$downloadAndUnzipStep$1 = new LanguagePackRepo$downloadAndUnzipStep$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = languagePackRepo$downloadAndUnzipStep$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = languagePackRepo$downloadAndUnzipStep$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            int i3 = Activity.AEQbTJ[languagePackConfig.ordinal()];
            if (i3 == 1) {
                return new LPDownloadResult.Activity(languageUnit);
            }
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.values.OLrzqt(languageUnit)) {
                    pUU.KWHzl("LanguagePackRepo", "downloadAndUnzipStep, allHasDynamicPacks true");
                    return new LPDownloadResult.Activity(languageUnit);
                }
                pUU.KWHzl("LanguagePackRepo", "downloadAndUnzipStep, allHasDynamicPacks false. change to NEED_LATEST");
                LanguagePackConfig languagePackConfig2 = LanguagePackConfig.NEED_LATEST;
                languagePackRepo$downloadAndUnzipStep$1.label = 3;
                objKWHzl = copydefault(languageUnit, languagePackConfig2, languagePackType, languagePackRepo$downloadAndUnzipStep$1);
                return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
            }
            languagePackRepo$downloadAndUnzipStep$1.L$0 = this;
            languagePackRepo$downloadAndUnzipStep$1.L$1 = languageUnit;
            languagePackRepo$downloadAndUnzipStep$1.label = 1;
            objKWHzl = KWHzl(languageUnit, languagePackRepo$downloadAndUnzipStep$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c38313pUd = this;
            languagePackRepo$downloadAndUnzipStep$1.L$0 = null;
            languagePackRepo$downloadAndUnzipStep$1.L$1 = null;
            languagePackRepo$downloadAndUnzipStep$1.label = 2;
            objKWHzl = c38313pUd.OLrzqt(languageUnit, (java.util.List<? extends LPDownloadResult>) objKWHzl, languagePackRepo$downloadAndUnzipStep$1);
            if (objKWHzl == objCopydefault) {
            }
        } else if (i2 == 1) {
            languageUnit = (LanguageUnit) languagePackRepo$downloadAndUnzipStep$1.L$1;
            c38313pUd = (C38313pUd) languagePackRepo$downloadAndUnzipStep$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            languagePackRepo$downloadAndUnzipStep$1.L$0 = null;
            languagePackRepo$downloadAndUnzipStep$1.L$1 = null;
            languagePackRepo$downloadAndUnzipStep$1.label = 2;
            objKWHzl = c38313pUd.OLrzqt(languageUnit, (java.util.List<? extends LPDownloadResult>) objKWHzl, languagePackRepo$downloadAndUnzipStep$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    C56391yDq.AEQbTJ(objKWHzl);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return (LPDownloadResult) objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(LanguageUnit languageUnit, LPDownloadResult lPDownloadResult, LanguagePackConfig languagePackConfig, LanguagePackType languagePackType, java.lang.String str, Continuation<? super LPLoadResult> continuation) throws java.lang.Throwable {
        LanguagePackRepo$loadStep$1 languagePackRepo$loadStep$1;
        C38313pUd c38313pUd;
        if (continuation instanceof LanguagePackRepo$loadStep$1) {
            languagePackRepo$loadStep$1 = (LanguagePackRepo$loadStep$1) continuation;
            int i = languagePackRepo$loadStep$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagePackRepo$loadStep$1.label = i - Integer.MIN_VALUE;
            } else {
                languagePackRepo$loadStep$1 = new LanguagePackRepo$loadStep$1(this, continuation);
            }
        }
        LanguagePackRepo$loadStep$1 languagePackRepo$loadStep$12 = languagePackRepo$loadStep$1;
        java.lang.Object objAEQbTJ = languagePackRepo$loadStep$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = languagePackRepo$loadStep$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            languagePackRepo$loadStep$12.L$0 = this;
            languagePackRepo$loadStep$12.L$1 = languageUnit;
            languagePackRepo$loadStep$12.L$2 = str;
            languagePackRepo$loadStep$12.label = 1;
            objAEQbTJ = AEQbTJ(languageUnit, lPDownloadResult, languagePackConfig, languagePackType, languagePackRepo$loadStep$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c38313pUd = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) languagePackRepo$loadStep$12.L$2;
            languageUnit = (LanguageUnit) languagePackRepo$loadStep$12.L$1;
            c38313pUd = (C38313pUd) languagePackRepo$loadStep$12.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.util.List<kotlin.Pair> list = (java.util.List) objAEQbTJ;
        pUU.KWHzl("LanguagePackRepo", "loadStep, step1 finished. loadedResults:" + list + " ");
        for (kotlin.Pair pair : list) {
            if (pair.getFirst() instanceof LPLoadResult.Application) {
                pUU.KWHzl("LanguagePackRepo", "loadStep, updateLangPack failed for load step.");
                return pair.getFirst();
            }
        }
        for (kotlin.Pair pair2 : list) {
            pSI psi = (pSI) pair2.getSecond();
            if ((pair2.getFirst() instanceof LPLoadResult.TaskDescription) && psi != null) {
                psi.AEQbTJ();
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            pSI psi2 = (pSI) ((kotlin.Pair) it.next()).getSecond();
            if (psi2 != null) {
                arrayList.add(psi2);
            }
        }
        java.util.List listGEmmrt = yDY.gEmmrt(c38313pUd.ejfBZ, c38313pUd.fIwbmz, c38313pUd.AYXKKw, c38313pUd.gEmmrt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : listGEmmrt) {
            if (!arrayList.contains((pSI) obj)) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((pSI) it2.next()).copydefault();
        }
        AppLocaleInfo appLocaleInfoDjBIcL = c38313pUd.DbNXlk.djBIcL();
        LanguageUnit languageUnit2 = new LanguageUnit(appLocaleInfoDjBIcL.getMarket(), appLocaleInfoDjBIcL.getLanguageCode());
        java.lang.String strCopydefault = c38313pUd.AkhnZx.copydefault();
        if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) str) || !Intrinsics.EZpvd(languageUnit2, languageUnit)) {
            pUU.KWHzl("LanguagePackRepo", "loadStep, finished. snapshot or unit changed. before:" + str + ". after:" + strCopydefault + ". currentUnit:" + languageUnit2 + ", newUnit:" + languageUnit);
            return new LPLoadResult.TaskDescription(languageUnit, FallBackType.DynamicLanguagePack);
        }
        pUU.KWHzl("LanguagePackRepo", "loadStep, finished. snapshot is same");
        return new LPLoadResult.Activity(languageUnit, FallBackType.DynamicLanguagePack);
    }

    public final java.lang.Object AEQbTJ(LanguageUnit languageUnit, LPDownloadResult lPDownloadResult, LanguagePackConfig languagePackConfig, LanguagePackType languagePackType, Continuation<? super java.util.List<? extends kotlin.Pair<? extends LPLoadResult, ? extends pSI>>> continuation) {
        return CoroutineScopeKt.coroutineScope(new LanguagePackRepo$loadLangPack$2(this, languageUnit, languagePackConfig, lPDownloadResult, languagePackType, null), continuation);
    }

    public final java.util.List<kotlin.Pair<LanguageUnit, pSI>> KWHzl(GroupLanguages groupLanguages) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        LanguageUnit marketCurrent = groupLanguages.getMarketCurrent();
        if (marketCurrent != null) {
            arrayList.add(C56390yDp.OLrzqt(marketCurrent, this.ejfBZ));
        }
        LanguageUnit marketDefault = groupLanguages.getMarketDefault();
        if (marketDefault != null) {
            arrayList.add(C56390yDp.OLrzqt(marketDefault, this.fIwbmz));
        }
        LanguageUnit globalCurrent = groupLanguages.getGlobalCurrent();
        if (globalCurrent != null) {
            arrayList.add(C56390yDp.OLrzqt(globalCurrent, this.AYXKKw));
        }
        LanguageUnit globalDefault = groupLanguages.getGlobalDefault();
        if (globalDefault != null) {
            arrayList.add(C56390yDp.OLrzqt(globalDefault, this.gEmmrt));
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x01b3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0030 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:14:0x0054, B:48:0x0174, B:50:0x017c, B:55:0x01a9, B:51:0x0185, B:19:0x0082, B:44:0x0154), top: B:63:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0185 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #1 {all -> 0x008c, blocks: (B:14:0x0054, B:48:0x0174, B:50:0x017c, B:55:0x01a9, B:51:0x0185, B:19:0x0082, B:44:0x0154), top: B:63:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [o.pUd] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, o.pUd] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, o.pUd] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.okinc.localization2.bean.LanguagePackType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.okinc.localization2.bean.LanguagePackType] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(LanguageUnit languageUnit, pSI psi, boolean z, LanguagePackType languagePackType, Continuation<? super kotlin.Pair<? extends LPLoadResult, ? extends pSI>> continuation) throws java.lang.Throwable {
        LanguagePackRepo$tryDynamic$1 languagePackRepo$tryDynamic$1;
        ?? r2;
        java.lang.String strKWHzl;
        ?? r15;
        ?? r11;
        java.lang.String str;
        pSI psi2;
        LanguageUnit languageUnit2;
        boolean z2;
        FallBackType fallBackType;
        java.lang.Object activity;
        ?? r9;
        pSI psi3;
        LanguageUnit languageUnit3;
        ?? r13;
        FallBackType fallBackType2;
        java.lang.String str2;
        ?? r3;
        java.lang.Object objOLrzqt;
        java.lang.String str3;
        AppLocaleInfo appLocaleInfo;
        pSI psi4;
        LanguageUnit languageUnit4;
        ?? r32;
        ?? r33 = languagePackType;
        if (continuation instanceof LanguagePackRepo$tryDynamic$1) {
            languagePackRepo$tryDynamic$1 = (LanguagePackRepo$tryDynamic$1) continuation;
            int i = languagePackRepo$tryDynamic$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagePackRepo$tryDynamic$1.label = i - Integer.MIN_VALUE;
            } else {
                languagePackRepo$tryDynamic$1 = new LanguagePackRepo$tryDynamic$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = languagePackRepo$tryDynamic$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = languagePackRepo$tryDynamic$1.label;
        try {
        } catch (java.lang.Throwable th) {
            th = th;
            r2 = r33;
        }
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                if (!this.fetchVPNInfo.copydefault(languageUnit, languagePackType.isStartup())) {
                    pUU.KWHzl("LanguagePackRepo", "tryDynamic, don't have LangPackFile.");
                    return C56390yDp.OLrzqt(new LPLoadResult.Application(languageUnit, "tryDynamic, don't have LangPackFile."), psi);
                }
                pTG ptg = pTG.OLrzqt;
                strKWHzl = KWHzl(languageUnit, ptg.copydefault(this.KWHzl, languageUnit), r33);
                java.lang.String strAEQbTJ = AEQbTJ(languageUnit, r33);
                java.lang.String strAEQbTJ2 = ptg.AEQbTJ(this.KWHzl, languageUnit);
                java.util.Map<java.lang.String, Mutex> map = this.valueOf;
                Mutex mutexMutex$default = map.get(strAEQbTJ2);
                if (mutexMutex$default == null) {
                    mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
                    map.put(strAEQbTJ2, mutexMutex$default);
                }
                Mutex mutex = mutexMutex$default;
                languagePackRepo$tryDynamic$1.L$0 = this;
                languagePackRepo$tryDynamic$1.L$1 = languageUnit;
                languagePackRepo$tryDynamic$1.L$2 = psi;
                languagePackRepo$tryDynamic$1.L$3 = r33;
                languagePackRepo$tryDynamic$1.L$4 = strKWHzl;
                languagePackRepo$tryDynamic$1.L$5 = strAEQbTJ;
                languagePackRepo$tryDynamic$1.L$6 = mutex;
                languagePackRepo$tryDynamic$1.Z$0 = z;
                languagePackRepo$tryDynamic$1.label = 1;
                if (mutex.lock(null, languagePackRepo$tryDynamic$1) == objCopydefault) {
                    return objCopydefault;
                }
                r15 = this;
                r11 = r33;
                str = strAEQbTJ;
                psi2 = psi;
                r2 = mutex;
                languageUnit2 = languageUnit;
                z2 = z;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        appLocaleInfo = (AppLocaleInfo) languagePackRepo$tryDynamic$1.L$6;
                        fallBackType2 = (FallBackType) languagePackRepo$tryDynamic$1.L$5;
                        Mutex mutex2 = (Mutex) languagePackRepo$tryDynamic$1.L$4;
                        str3 = (java.lang.String) languagePackRepo$tryDynamic$1.L$3;
                        strKWHzl = (java.lang.String) languagePackRepo$tryDynamic$1.L$2;
                        psi4 = (pSI) languagePackRepo$tryDynamic$1.L$1;
                        languageUnit4 = (LanguageUnit) languagePackRepo$tryDynamic$1.L$0;
                        C56391yDq.AEQbTJ(objKWHzl);
                        r32 = mutex2;
                        if (!((java.lang.Boolean) objKWHzl).booleanValue()) {
                            psi4.KWHzl(strKWHzl, str3, appLocaleInfo);
                            activity = new LPLoadResult.TaskDescription(languageUnit4, fallBackType2);
                        } else {
                            activity = new LPLoadResult.Application(languageUnit4, "loadLangPack failed");
                        }
                        psi2 = psi4;
                        r33 = r32;
                        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(activity, psi2);
                        r33.unlock(null);
                        return pairOLrzqt;
                    }
                    FallBackType fallBackType3 = (FallBackType) languagePackRepo$tryDynamic$1.L$7;
                    Mutex mutex3 = (Mutex) languagePackRepo$tryDynamic$1.L$6;
                    java.lang.String str4 = (java.lang.String) languagePackRepo$tryDynamic$1.L$5;
                    strKWHzl = (java.lang.String) languagePackRepo$tryDynamic$1.L$4;
                    LanguagePackType languagePackType2 = (LanguagePackType) languagePackRepo$tryDynamic$1.L$3;
                    psi3 = (pSI) languagePackRepo$tryDynamic$1.L$2;
                    languageUnit3 = (LanguageUnit) languagePackRepo$tryDynamic$1.L$1;
                    C38313pUd c38313pUd = (C38313pUd) languagePackRepo$tryDynamic$1.L$0;
                    C56391yDq.AEQbTJ(objKWHzl);
                    fallBackType2 = fallBackType3;
                    str2 = str4;
                    r3 = mutex3;
                    r9 = languagePackType2;
                    r13 = c38313pUd;
                    AppLocaleInfo appLocaleInfo2 = (AppLocaleInfo) objKWHzl;
                    languagePackRepo$tryDynamic$1.L$0 = languageUnit3;
                    languagePackRepo$tryDynamic$1.L$1 = psi3;
                    languagePackRepo$tryDynamic$1.L$2 = strKWHzl;
                    languagePackRepo$tryDynamic$1.L$3 = str2;
                    languagePackRepo$tryDynamic$1.L$4 = r3;
                    languagePackRepo$tryDynamic$1.L$5 = fallBackType2;
                    languagePackRepo$tryDynamic$1.L$6 = appLocaleInfo2;
                    languagePackRepo$tryDynamic$1.L$7 = null;
                    languagePackRepo$tryDynamic$1.label = 3;
                    objOLrzqt = r13.OLrzqt(psi3, languageUnit3, r9, languagePackRepo$tryDynamic$1);
                    if (objOLrzqt != objCopydefault) {
                        return objCopydefault;
                    }
                    str3 = str2;
                    appLocaleInfo = appLocaleInfo2;
                    objKWHzl = objOLrzqt;
                    psi4 = psi3;
                    languageUnit4 = languageUnit3;
                    r32 = r3;
                    if (!((java.lang.Boolean) objKWHzl).booleanValue()) {
                    }
                    psi2 = psi4;
                    r33 = r32;
                    kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(activity, psi2);
                    r33.unlock(null);
                    return pairOLrzqt2;
                }
                z2 = languagePackRepo$tryDynamic$1.Z$0;
                Mutex mutex4 = (Mutex) languagePackRepo$tryDynamic$1.L$6;
                str = (java.lang.String) languagePackRepo$tryDynamic$1.L$5;
                strKWHzl = (java.lang.String) languagePackRepo$tryDynamic$1.L$4;
                LanguagePackType languagePackType3 = (LanguagePackType) languagePackRepo$tryDynamic$1.L$3;
                psi2 = (pSI) languagePackRepo$tryDynamic$1.L$2;
                languageUnit2 = (LanguageUnit) languagePackRepo$tryDynamic$1.L$1;
                C38313pUd c38313pUd2 = (C38313pUd) languagePackRepo$tryDynamic$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                r2 = mutex4;
                r11 = languagePackType3;
                r15 = c38313pUd2;
            }
            if (z2) {
                fallBackType = FallBackType.NONE;
            } else {
                fallBackType = FallBackType.DynamicLanguagePack;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) psi2.OLrzqt(), (java.lang.Object) strKWHzl)) {
                LanguagesListRepository languagesListRepository = r15.isConnected;
                languagePackRepo$tryDynamic$1.L$0 = r15;
                languagePackRepo$tryDynamic$1.L$1 = languageUnit2;
                languagePackRepo$tryDynamic$1.L$2 = psi2;
                languagePackRepo$tryDynamic$1.L$3 = r11;
                languagePackRepo$tryDynamic$1.L$4 = strKWHzl;
                languagePackRepo$tryDynamic$1.L$5 = str;
                languagePackRepo$tryDynamic$1.L$6 = r2;
                languagePackRepo$tryDynamic$1.L$7 = fallBackType;
                languagePackRepo$tryDynamic$1.label = 2;
                objKWHzl = languagesListRepository.KWHzl(languageUnit2, languagePackRepo$tryDynamic$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                r9 = r11;
                psi3 = psi2;
                languageUnit3 = languageUnit2;
                r13 = r15;
                ?? r16 = r2;
                fallBackType2 = fallBackType;
                str2 = str;
                r3 = r16;
                AppLocaleInfo appLocaleInfo22 = (AppLocaleInfo) objKWHzl;
                languagePackRepo$tryDynamic$1.L$0 = languageUnit3;
                languagePackRepo$tryDynamic$1.L$1 = psi3;
                languagePackRepo$tryDynamic$1.L$2 = strKWHzl;
                languagePackRepo$tryDynamic$1.L$3 = str2;
                languagePackRepo$tryDynamic$1.L$4 = r3;
                languagePackRepo$tryDynamic$1.L$5 = fallBackType2;
                languagePackRepo$tryDynamic$1.L$6 = appLocaleInfo22;
                languagePackRepo$tryDynamic$1.L$7 = null;
                languagePackRepo$tryDynamic$1.label = 3;
                objOLrzqt = r13.OLrzqt(psi3, languageUnit3, r9, languagePackRepo$tryDynamic$1);
                if (objOLrzqt != objCopydefault) {
                }
            } else {
                pUU.KWHzl("LanguagePackRepo", "getContentVersion is latest. skip loading langPack for " + languageUnit2);
                activity = new LPLoadResult.Activity(languageUnit2, fallBackType);
                r33 = r2;
                kotlin.Pair pairOLrzqt22 = C56390yDp.OLrzqt(activity, psi2);
                r33.unlock(null);
                return pairOLrzqt22;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            r2.unlock(null);
            throw th;
        }
    }

    public final java.lang.Object AEQbTJ(LanguageUnit languageUnit, LanguagePackConfig languagePackConfig, Continuation<? super LPLoadResult> continuation) {
        pUU.KWHzl("LanguagePackRepo", "tryEmbedded, start. mainLanguage:" + languageUnit);
        if (languagePackConfig != LanguagePackConfig.CACHE_OR_LATEST_OR_EMBEDDED && languagePackConfig != LanguagePackConfig.CACHE_OR_EMBEDDED) {
            return new LPLoadResult.Application(languageUnit, "tryEmbedded failed. not allowed to use embedded for " + languageUnit + JwtUtilsKt.JWT_DELIMITER);
        }
        if (!this.values.KWHzl(languageUnit)) {
            return new LPLoadResult.Application(languageUnit, "tryEmbedded failed. No embedded langPack for " + languageUnit);
        }
        this.AkhnZx.AEQbTJ(true, languageUnit);
        LPLoadResult.TaskDescription taskDescription = new LPLoadResult.TaskDescription(languageUnit, FallBackType.EmbeddedLanguagePack);
        pUU.KWHzl("LanguagePackRepo", "tryEmbedded, finished. result:" + taskDescription);
        return taskDescription;
    }

    public final java.lang.Object OLrzqt(pSI psi, LanguageUnit languageUnit, LanguagePackType languagePackType, Continuation<? super java.lang.Boolean> continuation) {
        return this.fetchVPNInfo.copydefault(psi, languageUnit, languagePackType, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(LanguageUnit languageUnit, java.util.List<? extends LPDownloadResult> list, Continuation<? super LPDownloadResult> continuation) throws java.lang.Throwable {
        LanguagePackRepo$unzipStep$1 languagePackRepo$unzipStep$1;
        if (continuation instanceof LanguagePackRepo$unzipStep$1) {
            languagePackRepo$unzipStep$1 = (LanguagePackRepo$unzipStep$1) continuation;
            int i = languagePackRepo$unzipStep$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagePackRepo$unzipStep$1.label = i - Integer.MIN_VALUE;
            } else {
                languagePackRepo$unzipStep$1 = new LanguagePackRepo$unzipStep$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = languagePackRepo$unzipStep$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = languagePackRepo$unzipStep$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            languagePackRepo$unzipStep$1.L$0 = languageUnit;
            languagePackRepo$unzipStep$1.label = 1;
            objCopydefault = copydefault(list, languagePackRepo$unzipStep$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            languageUnit = (LanguageUnit) languagePackRepo$unzipStep$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.List list2 = (java.util.List) objCopydefault;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((LPDownloadResult) it.next()) instanceof LPDownloadResult.ActionBar) {
                    pUU.KWHzl("LanguagePackRepo", "downloadWithNeedLatest, failed.");
                    return new LPDownloadResult.ActionBar(languageUnit, "downloadWithNeedLatest, failed.");
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            if (obj instanceof LPDownloadResult.TaskDescription) {
                arrayList.add(obj);
            }
        }
        new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            LPDownloadResult.TaskDescription taskDescription = (LPDownloadResult.TaskDescription) it2.next();
            return new LPDownloadResult.TaskDescription(languageUnit, taskDescription.KWHzl(), taskDescription.EZpvd());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            if (obj2 instanceof LPDownloadResult.StateListAnimator) {
                arrayList2.add(obj2);
            }
        }
        new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        java.util.Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            return new LPDownloadResult.StateListAnimator(languageUnit, ((LPDownloadResult.StateListAnimator) it3.next()).OLrzqt());
        }
        return new LPDownloadResult.ActionBar(languageUnit, "unknown type");
    }

    public final java.lang.Object copydefault(java.util.List<? extends LPDownloadResult> list, Continuation<? super java.util.List<? extends LPDownloadResult>> continuation) {
        return CoroutineScopeKt.coroutineScope(new LanguagePackRepo$unzipInternal$2(list, this, null), continuation);
    }

    public final java.lang.Object copydefault(java.io.File file, LanguageUnit languageUnit, java.lang.String str, Continuation<? super LPDownloadResult> continuation) {
        return BuildersKt.withContext(this.djBIcL, new LanguagePackRepo$unzipLangPack$2(file, languageUnit, this, str, null), continuation);
    }

    public final boolean EZpvd(java.io.File file, java.util.List<java.lang.String> list, java.lang.String str) {
        if (list == null || list.isEmpty()) {
            pUU.copydefault("LanguagePackRepo", "isValidZipFile, failed. Zip file contains no files");
            return false;
        }
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (C59449zhJ.valueOf((java.lang.String) it.next(), ".json", true)) {
                    for (java.lang.String str2 : list) {
                        if (C59449zhJ.valueOf(str2, ".json", true)) {
                            try {
                                oJV.AEQbTJ.DbNXlk().parseToJsonElement(yFI.readText$default(new java.io.File(file, str2), null, 1, null));
                            } catch (java.lang.Exception e) {
                                pUU.copydefault("LanguagePackRepo", "isValidZipFile, failed. parse json file failed. md5:" + str);
                                LocalizeEventReport.INSTANCE.reportLanguagePackInvalid(e.toString(), str);
                                return false;
                            }
                        } else {
                            pUU.valueOf("LanguagePackRepo", "isValidZipFile, ignore non-json file:" + str2 + ". md5:" + str);
                        }
                    }
                    return true;
                }
            }
        }
        pUU.copydefault("LanguagePackRepo", "isValidZipFile, failed. Zip file contains no json files");
        return false;
    }

    public final void AEQbTJ(java.lang.String str, final java.util.List<java.lang.String> list) {
        try {
            if (list.isEmpty()) {
                return;
            }
            for (java.io.File file : C59467zhb.DbNXlk(yFJ.AYXKKw(new java.io.File(str)), new Function1() { // from class: o.pUf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C38313pUd.AEQbTJ(list, (java.io.File) obj));
                }
            })) {
                file.delete();
                pUU.KWHzl("LanguagePackRepo", "cleanZipDir, delete file: " + file.getAbsolutePath());
            }
        } catch (java.lang.Throwable th) {
            pUU.OLrzqt("LanguagePackRepo", th);
        }
    }

    public static final boolean AEQbTJ(java.util.List list, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        if (file.exists() && file.isFile()) {
            java.lang.String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            if (C59449zhJ.valueOf(absolutePath, ".json", true) && !list.contains(file.getName())) {
                return true;
            }
        }
        return false;
    }

    public final void KWHzl(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            pUU.KWHzl("LanguagePackRepo", "Delete: " + str);
            yFL.AkhnZx(file);
        }
    }

    public final LanguageUnit AEQbTJ(java.lang.String str, AppLinkLang appLinkLang) {
        if (appLinkLang == null) {
            return null;
        }
        return new LanguageUnit(str, appLinkLang.getIsoCode());
    }

    public final java.lang.Object KWHzl(LanguageUnit languageUnit, Continuation<? super java.util.List<? extends LPDownloadResult>> continuation) {
        return CoroutineScopeKt.coroutineScope(new LanguagePackRepo$downloadWithNeedLatest$2(this, languageUnit, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(kotlin.Pair<java.lang.String, AppLinkLang> pair, Continuation<? super LPDownloadResult> continuation) throws java.lang.Throwable {
        LanguagePackRepo$updateLangPack$1 languagePackRepo$updateLangPack$1;
        if (continuation instanceof LanguagePackRepo$updateLangPack$1) {
            languagePackRepo$updateLangPack$1 = (LanguagePackRepo$updateLangPack$1) continuation;
            int i = languagePackRepo$updateLangPack$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagePackRepo$updateLangPack$1.label = i - Integer.MIN_VALUE;
            } else {
                languagePackRepo$updateLangPack$1 = new LanguagePackRepo$updateLangPack$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = languagePackRepo$updateLangPack$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = languagePackRepo$updateLangPack$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            pUU.KWHzl("LanguagePackRepo", "updateLangPack, start: " + pair);
            java.lang.String strEZpvd = pTG.OLrzqt.EZpvd(this.KWHzl);
            java.lang.String first = pair.getFirst();
            java.lang.String str = strEZpvd + ((java.lang.Object) first) + "_" + pair.getSecond().getIsoCode() + "_" + this.OLrzqt.getAndIncrement() + ".zip";
            languagePackRepo$updateLangPack$1.L$0 = pair;
            languagePackRepo$updateLangPack$1.label = 1;
            objAEQbTJ = AEQbTJ(pair, str, languagePackRepo$updateLangPack$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pair = (kotlin.Pair) languagePackRepo$updateLangPack$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        LPDownloadResult lPDownloadResult = (LPDownloadResult) objAEQbTJ;
        pUU.KWHzl("LanguagePackRepo", "updateLangPack, finished. " + pair + " : " + lPDownloadResult);
        return lPDownloadResult;
    }

    public final java.lang.Object AEQbTJ(kotlin.Pair<java.lang.String, AppLinkLang> pair, java.lang.String str, Continuation<? super LPDownloadResult> continuation) {
        AppLinkLang second = pair.getSecond();
        LanguageUnit languageUnit = new LanguageUnit(pair.getFirst(), second.getIsoCode());
        java.lang.String strCopydefault = pTG.OLrzqt.copydefault(this.KWHzl, languageUnit);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault) && C59449zhJ.gEmmrt(second.getMd5(), strCopydefault, true)) {
            return new LPDownloadResult.StateListAnimator(languageUnit, strCopydefault);
        }
        pUU.KWHzl("LanguagePackRepo", "updateLangPack, start download language pack for:" + languageUnit);
        return BuildersKt.withContext(this.djBIcL, new LanguagePackRepo$updateLangPackInternal$2(this, second, str, languageUnit, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(LanguageUnit languageUnit, Continuation<? super AppLink> continuation) throws java.lang.Throwable {
        LanguagePackRepo$requestLangPackGroupInfo$1 languagePackRepo$requestLangPackGroupInfo$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof LanguagePackRepo$requestLangPackGroupInfo$1) {
            languagePackRepo$requestLangPackGroupInfo$1 = (LanguagePackRepo$requestLangPackGroupInfo$1) continuation;
            int i = languagePackRepo$requestLangPackGroupInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languagePackRepo$requestLangPackGroupInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                languagePackRepo$requestLangPackGroupInfo$1 = new LanguagePackRepo$requestLangPackGroupInfo$1(this, continuation);
            }
        }
        LanguagePackRepo$requestLangPackGroupInfo$1 languagePackRepo$requestLangPackGroupInfo$12 = languagePackRepo$requestLangPackGroupInfo$1;
        java.lang.Object appLinkV3$default = languagePackRepo$requestLangPackGroupInfo$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = languagePackRepo$requestLangPackGroupInfo$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(appLinkV3$default);
                if (!C43453rpa.AEQbTJ.KWHzl(this.KWHzl)) {
                    return null;
                }
                Result.Application application = Result.Companion;
                pSG psgAEQbTJ = pSM.AEQbTJ();
                java.lang.String strAEQbTJ = pTG.OLrzqt.AEQbTJ();
                java.lang.String market = languageUnit.getMarket();
                java.lang.String languageCode = languageUnit.getLanguageCode();
                languagePackRepo$requestLangPackGroupInfo$12.label = 1;
                appLinkV3$default = pSG.Application.getAppLinkV3$default(psgAEQbTJ, null, strAEQbTJ, market, languageCode, languagePackRepo$requestLangPackGroupInfo$12, 1, null);
                if (appLinkV3$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(appLinkV3$default);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) appLinkV3$default);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("LanguagePackRepo", "requestLangPackGroupInfo", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        ResponseData responseData = (ResponseData) objM7377constructorimpl;
        pUU.KWHzl("LanguagePackRepo", "requestLangPackGroupInfo, appLinkResult:" + responseData);
        if (responseData == null || responseData.getCode() != 0 || responseData.getData() == null) {
            return null;
        }
        return responseData.getData();
    }

    public final boolean EZpvd(java.lang.String str, LanguageListConfig languageListConfig) {
        if (Activity.EZpvd[languageListConfig.ordinal()] == 1) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void OLrzqt(java.lang.String str, java.util.List<? extends java.lang.Object> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str + ", logJobResult.");
        for (java.lang.Object obj : list) {
            if (obj instanceof LPDownloadResult) {
                sb.append(((LPDownloadResult) obj).getUnit() + ":" + obj + ". ");
            } else if (obj instanceof LPLoadResult) {
                sb.append(((LPLoadResult) obj).getUnit() + ":" + obj + ". ");
            }
        }
        pUU.copydefault("LanguagePackRepo", sb);
    }

    public final java.lang.String KWHzl(LanguageUnit languageUnit, java.lang.String str, LanguagePackType languagePackType) {
        return languageUnit.getMarket() + ":" + languageUnit.getLanguageCode() + ":" + str + ":" + languagePackType;
    }

    public final java.lang.String AEQbTJ(LanguageUnit languageUnit, LanguagePackType languagePackType) {
        return languageUnit.getMarket() + ":" + languageUnit.getLanguageCode() + ":" + languagePackType;
    }

    public final void AEQbTJ(boolean z) {
        this.AhwBna.set(z);
    }

    /* JADX INFO: renamed from: o.pUd$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pUd.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.util.List<java.lang.String> copydefault() {
            return C38313pUd.EZpvd;
        }
    }

    public final void KWHzl(java.util.List<kotlin.Pair<java.lang.String, AppLinkLang>> list) {
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            java.io.File file = new java.io.File(pTG.OLrzqt.AEQbTJ(this.KWHzl, new LanguageUnit((java.lang.String) pair.getFirst(), ((AppLinkLang) pair.getSecond()).getIsoCode())));
            if (!file.exists()) {
                file.mkdir();
            }
        }
    }
}
