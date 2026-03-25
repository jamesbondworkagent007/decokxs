package com.okinc.localization2.repo;

import com.okinc.localization2.bean.LPDownloadResult;
import com.okinc.localization2.bean.LanguageUnit;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C38313pUd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.pTE;
import o.pTG;
import o.pTL;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagePackRepo$unzipInternal$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LPDownloadResult>, Object> {
    final /* synthetic */ LPDownloadResult $it;
    Object L$0;
    int label;
    final /* synthetic */ C38313pUd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagePackRepo$unzipInternal$2$job$1(LPDownloadResult lPDownloadResult, C38313pUd c38313pUd, Continuation<? super LanguagePackRepo$unzipInternal$2$job$1> continuation) {
        super(2, continuation);
        this.$it = lPDownloadResult;
        this.this$0 = c38313pUd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LanguagePackRepo$unzipInternal$2$job$1(this.$it, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LPDownloadResult> continuation) {
        return ((LanguagePackRepo$unzipInternal$2$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        LPDownloadResult lPDownloadResult;
        File file;
        LPDownloadResult lPDownloadResult2;
        Exception e;
        pTE pte;
        LanguageUnit unit;
        LPDownloadResult lPDownloadResult3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lPDownloadResult = this.$it;
            if (lPDownloadResult instanceof LPDownloadResult.StateListAnimator) {
                if (!this.this$0.fetchVPNInfo.copydefault(this.$it.getUnit(), false) || !this.this$0.fetchVPNInfo.copydefault(this.$it.getUnit(), true)) {
                    File file2 = new File(pTG.OLrzqt.AEQbTJ(this.this$0.KWHzl, this.$it.getUnit()));
                    try {
                        pte = this.this$0.fetchVPNInfo;
                        unit = this.$it.getUnit();
                        this.L$0 = lPDownloadResult;
                        this.label = 1;
                    } catch (Exception e2) {
                        lPDownloadResult2 = lPDownloadResult;
                        e = e2;
                        pUU.OLrzqt("LanguagePackRepo", "unzipInternal, onAfterUnzip error.md5:" + ((LPDownloadResult.StateListAnimator) lPDownloadResult2).OLrzqt(), e);
                    }
                    if (pte.KWHzl(file2, unit, "unzip latest", this) == objCopydefault) {
                        return objCopydefault;
                    }
                    lPDownloadResult2 = lPDownloadResult;
                    lPDownloadResult = lPDownloadResult2;
                }
            } else {
                if (lPDownloadResult instanceof LPDownloadResult.TaskDescription) {
                    LPDownloadResult.TaskDescription taskDescription = (LPDownloadResult.TaskDescription) lPDownloadResult;
                    Pair pairOLrzqt = C56390yDp.OLrzqt(taskDescription.KWHzl(), taskDescription.EZpvd());
                    File file3 = (File) pairOLrzqt.component1();
                    String str = (String) pairOLrzqt.component2();
                    C38313pUd c38313pUd = this.this$0;
                    LanguageUnit unit2 = this.$it.getUnit();
                    this.L$0 = file3;
                    this.label = 2;
                    obj = c38313pUd.copydefault(file3, unit2, str, (Continuation<? super LPDownloadResult>) this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    file = file3;
                    lPDownloadResult3 = (LPDownloadResult) obj;
                    if (!(lPDownloadResult3 instanceof LPDownloadResult.StateListAnimator)) {
                        C38313pUd c38313pUd2 = this.this$0;
                        String canonicalPath = file.getCanonicalPath();
                        Intrinsics.checkNotNullExpressionValue(canonicalPath, "");
                        c38313pUd2.KWHzl(canonicalPath);
                    }
                    return lPDownloadResult3;
                }
                if (lPDownloadResult instanceof LPDownloadResult.ActionBar) {
                    return lPDownloadResult;
                }
                if (!(lPDownloadResult instanceof LPDownloadResult.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                return (LPDownloadResult.ActionBar) pTL.copydefault(new UnsupportedOperationException("downloadResult is LPDownloadResult.Unchecked"), new LPDownloadResult.ActionBar(this.$it.getUnit(), "unzipInternal, unsupported LPDownloadResult. Unchecked"));
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = (File) this.L$0;
                C56391yDq.AEQbTJ(obj);
                lPDownloadResult3 = (LPDownloadResult) obj;
                if (!(lPDownloadResult3 instanceof LPDownloadResult.StateListAnimator) || (lPDownloadResult3 instanceof LPDownloadResult.TaskDescription)) {
                    C38313pUd c38313pUd22 = this.this$0;
                    String canonicalPath2 = file.getCanonicalPath();
                    Intrinsics.checkNotNullExpressionValue(canonicalPath2, "");
                    c38313pUd22.KWHzl(canonicalPath2);
                }
                return lPDownloadResult3;
            }
            lPDownloadResult2 = (LPDownloadResult) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Exception e3) {
                e = e3;
                pUU.OLrzqt("LanguagePackRepo", "unzipInternal, onAfterUnzip error.md5:" + ((LPDownloadResult.StateListAnimator) lPDownloadResult2).OLrzqt(), e);
            }
            lPDownloadResult = lPDownloadResult2;
        }
        return new LPDownloadResult.StateListAnimator(this.$it.getUnit(), ((LPDownloadResult.StateListAnimator) lPDownloadResult).OLrzqt());
    }
}
