package com.okinc.find_ui.widgetprovider.p2p.utils;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.okinc.unify_find.net.BizFindApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import o.C35124npR;
import o.C43417ror;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class P2PWidgetUpdateUtilsKt$updateP2PWidget$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int[] $appWidgetIds;
    final /* synthetic */ AppWidgetManager $appWidgetManager;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isPairChanged;
    final /* synthetic */ CompletableJob $job;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PWidgetUpdateUtilsKt$updateP2PWidget$1(int[] iArr, Context context, AppWidgetManager appWidgetManager, boolean z, CompletableJob completableJob, Continuation<? super P2PWidgetUpdateUtilsKt$updateP2PWidget$1> continuation) {
        super(2, continuation);
        this.$appWidgetIds = iArr;
        this.$context = context;
        this.$appWidgetManager = appWidgetManager;
        this.$isPairChanged = z;
        this.$job = completableJob;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PWidgetUpdateUtilsKt$updateP2PWidget$1(this.$appWidgetIds, this.$context, this.$appWidgetManager, this.$isPairChanged, this.$job, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((P2PWidgetUpdateUtilsKt$updateP2PWidget$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:6:0x0013, B:21:0x0034, B:11:0x0022, B:13:0x0026, B:17:0x002d, B:19:0x0030), top: B:29:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0056 -> B:24:0x0059). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        int length;
        int[] iArr;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (Throwable th) {
            pUU.AEQbTJ("CryptoWidgetProvider", "updateP2PWidget failed", th);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            int[] iArr2 = this.$appWidgetIds;
            if (iArr2 != null) {
                i = 0;
                if (!(iArr2.length == 0)) {
                    length = iArr2.length;
                    iArr = iArr2;
                    if (i < length) {
                    }
                }
            }
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
            BizFindApiService bizFindApiService = (BizFindApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizFindApiService.class));
            boolean z = this.$isPairChanged;
            this.L$0 = iArr;
            this.I$0 = i;
            this.I$1 = length;
            this.label = 1;
            if (C35124npR.KWHzl(context, i3, appWidgetManager, bizFindApiService, z, this) == objCopydefault) {
                return objCopydefault;
            }
            i++;
            if (i < length) {
            }
        }
        this.$job.complete();
        return Unit.INSTANCE;
    }
}
