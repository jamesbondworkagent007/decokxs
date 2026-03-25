package com.okinc.localization2.repo;

import com.okinc.localization2.bean.LPDownloadResult;
import com.okinc.localization2.bean.LanguageUnit;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.C33550mya;
import o.C38313pUd;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.pTE;
import o.pTG;
import o.pUU;
import o.yFL;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackRepo$unzipLangPack$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LPDownloadResult>, Object> {
    final /* synthetic */ LanguageUnit $languageUnit;
    final /* synthetic */ String $respMD5;
    final /* synthetic */ File $zipFile;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C38313pUd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagePackRepo$unzipLangPack$2(File file, LanguageUnit languageUnit, C38313pUd c38313pUd, String str, Continuation<? super LanguagePackRepo$unzipLangPack$2> continuation) {
        super(2, continuation);
        this.$zipFile = file;
        this.$languageUnit = languageUnit;
        this.this$0 = c38313pUd;
        this.$respMD5 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LanguagePackRepo$unzipLangPack$2(this.$zipFile, this.$languageUnit, this.this$0, this.$respMD5, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LPDownloadResult> continuation) {
        return ((LanguagePackRepo$unzipLangPack$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        File file;
        C38313pUd c38313pUd;
        LanguageUnit languageUnit;
        File file2;
        String str;
        String str2;
        File file3;
        C38313pUd c38313pUd2;
        Mutex mutex2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String name = this.$zipFile.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                if (!C59449zhJ.valueOf(name, ".zip", true)) {
                    String str3 = "unzipLangPack," + this.$zipFile + " is not a zip file";
                    pUU.copydefault("LanguagePackRepo", str3);
                    return new LPDownloadResult.ActionBar(this.$languageUnit, str3);
                }
                pTG ptg = pTG.OLrzqt;
                File file4 = new File(ptg.AEQbTJ(this.this$0.KWHzl, this.$languageUnit));
                if (!file4.exists()) {
                    file4.mkdir();
                }
                if (!C59449zhJ.gEmmrt(ptg.copydefault(this.this$0.KWHzl, this.$languageUnit), this.$respMD5, true)) {
                    Map map = this.this$0.valueOf;
                    String canonicalPath = file4.getCanonicalPath();
                    Object objMutex$default = map.get(canonicalPath);
                    if (objMutex$default == null) {
                        objMutex$default = MutexKt.Mutex$default(false, 1, null);
                        map.put(canonicalPath, objMutex$default);
                    }
                    mutex = (Mutex) objMutex$default;
                    C38313pUd c38313pUd3 = this.this$0;
                    LanguageUnit languageUnit2 = this.$languageUnit;
                    String str4 = this.$respMD5;
                    file = this.$zipFile;
                    this.L$0 = file4;
                    this.L$1 = mutex;
                    this.L$2 = c38313pUd3;
                    this.L$3 = languageUnit2;
                    this.L$4 = str4;
                    this.L$5 = file;
                    this.label = 1;
                    if (mutex.lock(null, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    c38313pUd = c38313pUd3;
                    languageUnit = languageUnit2;
                    file2 = file4;
                    str = str4;
                } else {
                    pUU.KWHzl("LanguagePackRepo", "unzipLangPack, language pack is latest for:" + this.$languageUnit);
                    return new LPDownloadResult.StateListAnimator(this.$languageUnit, this.$respMD5);
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.L$4;
                    languageUnit = (LanguageUnit) this.L$3;
                    c38313pUd2 = (C38313pUd) this.L$2;
                    mutex2 = (Mutex) this.L$1;
                    file3 = (File) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        pTG.OLrzqt.KWHzl(c38313pUd2.KWHzl, languageUnit, str2);
                        LPDownloadResult.TaskDescription taskDescription = new LPDownloadResult.TaskDescription(languageUnit, file3, str2);
                        mutex2.unlock(null);
                        return taskDescription;
                    } catch (Throwable th) {
                        th = th;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                File file5 = (File) this.L$5;
                str = (String) this.L$4;
                LanguageUnit languageUnit3 = (LanguageUnit) this.L$3;
                c38313pUd = (C38313pUd) this.L$2;
                mutex = (Mutex) this.L$1;
                File file6 = (File) this.L$0;
                C56391yDq.AEQbTJ(obj);
                file = file5;
                languageUnit = languageUnit3;
                file2 = file6;
            }
            pTG ptg2 = pTG.OLrzqt;
            if (C59449zhJ.gEmmrt(ptg2.copydefault(c38313pUd.KWHzl, languageUnit), str, true)) {
                pUU.KWHzl("LanguagePackRepo", "unzipLangPack, language pack is latest for:" + languageUnit);
                LPDownloadResult.StateListAnimator stateListAnimator = new LPDownloadResult.StateListAnimator(languageUnit, str);
                mutex.unlock(null);
                return stateListAnimator;
            }
            pUU.KWHzl("LanguagePackRepo", "unzipLangPack, start unzip language pack for:" + languageUnit);
            File file7 = new File(ptg2.AEQbTJ(c38313pUd.KWHzl), languageUnit.getLanguageCode() + UUID.randomUUID());
            List<String> listOLrzqt = C33550mya.OLrzqt(file7.getCanonicalPath(), file.getCanonicalPath());
            pUU.KWHzl("LanguagePackRepo", "unzipLangPack, " + languageUnit + " extractFileList:" + listOLrzqt);
            if (!c38313pUd.EZpvd(file7, listOLrzqt, str)) {
                String str5 = "unzipLangPack, failed. invalid zip file. md5:" + str;
                pUU.copydefault("LanguagePackRepo", str5);
                yFL.AkhnZx(file7);
                LPDownloadResult.ActionBar actionBar = new LPDownloadResult.ActionBar(languageUnit, str5);
                mutex.unlock(null);
                return actionBar;
            }
            ptg2.AEQbTJ(file7, file2);
            yFL.AkhnZx(file7);
            String canonicalPath2 = file2.getCanonicalPath();
            Intrinsics.checkNotNullExpressionValue(canonicalPath2, "");
            Intrinsics.copydefault(listOLrzqt);
            c38313pUd.AEQbTJ(canonicalPath2, (List<String>) listOLrzqt);
            pTE pte = c38313pUd.fetchVPNInfo;
            this.L$0 = file2;
            this.L$1 = mutex;
            this.L$2 = c38313pUd;
            this.L$3 = languageUnit;
            this.L$4 = str;
            this.L$5 = null;
            this.label = 2;
            if (pte.KWHzl(file2, languageUnit, "unzip success", this) == objCopydefault) {
                return objCopydefault;
            }
            str2 = str;
            file3 = file2;
            c38313pUd2 = c38313pUd;
            mutex2 = mutex;
            pTG.OLrzqt.KWHzl(c38313pUd2.KWHzl, languageUnit, str2);
            LPDownloadResult.TaskDescription taskDescription2 = new LPDownloadResult.TaskDescription(languageUnit, file3, str2);
            mutex2.unlock(null);
            return taskDescription2;
        } catch (Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
    }
}
