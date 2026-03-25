package com.okinc.find_ui.widgetprovider.util;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.okinc.unify_find.net.BizFindApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import o.C35131npY;
import o.C35191nqf;
import o.C43417ror;
import o.C43453rpa;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class DoubleWidgetUpdateUtilsKt$updateDoubleWidget$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int[] $appWidgetIds;
    final /* synthetic */ AppWidgetManager $appWidgetManager;
    final /* synthetic */ Context $context;
    final /* synthetic */ CompletableJob $job;
    final /* synthetic */ C35191nqf $onceCache;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleWidgetUpdateUtilsKt$updateDoubleWidget$1(int[] iArr, Context context, AppWidgetManager appWidgetManager, C35191nqf c35191nqf, CompletableJob completableJob, Continuation<? super DoubleWidgetUpdateUtilsKt$updateDoubleWidget$1> continuation) {
        super(2, continuation);
        this.$appWidgetIds = iArr;
        this.$context = context;
        this.$appWidgetManager = appWidgetManager;
        this.$onceCache = c35191nqf;
        this.$job = completableJob;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DoubleWidgetUpdateUtilsKt$updateDoubleWidget$1(this.$appWidgetIds, this.$context, this.$appWidgetManager, this.$onceCache, this.$job, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DoubleWidgetUpdateUtilsKt$updateDoubleWidget$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #0 {all -> 0x006c, blocks: (B:6:0x0015, B:23:0x0045, B:11:0x0024, B:13:0x0028, B:17:0x002f, B:19:0x0032, B:21:0x003c), top: B:31:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0067 -> B:26:0x006a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int[] iArr;
        int i;
        int length;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (Throwable th) {
            pUU.AEQbTJ("CryptoWidgetProvider", "onUpdate", th);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            int[] iArr2 = this.$appWidgetIds;
            if (iArr2 != null) {
                if ((!(iArr2.length == 0)) && C43453rpa.AEQbTJ.KWHzl(this.$context)) {
                    int[] iArr3 = this.$appWidgetIds;
                    iArr = iArr3;
                    i = 0;
                    length = iArr3.length;
                    if (i < length) {
                    }
                }
            }
            pUU.EZpvd("CryptoWidgetProvider", "update job () finished");
            this.$job.complete();
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        length = this.I$1;
        i = this.I$0;
        iArr = (int[]) this.L$0;
        C56391yDq.AEQbTJ(obj);
        i++;
        if (i < length) {
            int i3 = iArr[i];
            Context context = this.$context;
            AppWidgetManager appWidgetManager = this.$appWidgetManager;
            C35191nqf c35191nqf = this.$onceCache;
            BizFindApiService bizFindApiService = (BizFindApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizFindApiService.class));
            this.L$0 = iArr;
            this.I$0 = i;
            this.I$1 = length;
            this.label = 1;
            if (C35131npY.EZpvd(context, i3, appWidgetManager, c35191nqf, bizFindApiService, this) == objCopydefault) {
                return objCopydefault;
            }
            i++;
            if (i < length) {
            }
        }
        pUU.EZpvd("CryptoWidgetProvider", "update job () finished");
        this.$job.complete();
        return Unit.INSTANCE;
    }
}
