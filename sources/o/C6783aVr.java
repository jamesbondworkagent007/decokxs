package o;

import com.okinc.base.thread.TPM;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6783aVr {
    public static /* synthetic */ AbstractC58260yxt observeOnIo$default(AbstractC58260yxt abstractC58260yxt, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return copydefault(abstractC58260yxt, application, str, priority);
    }

    public static final <T> AbstractC58260yxt<T> copydefault(@NotNull AbstractC58260yxt<T> abstractC58260yxt, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58260yxt<T> abstractC58260yxtOLrzqt = abstractC58260yxt.OLrzqt(TPM.AEQbTJ.copydefault(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static /* synthetic */ AbstractC58260yxt subscribeOnIo$default(AbstractC58260yxt abstractC58260yxt, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return KWHzl(abstractC58260yxt, application, str, priority);
    }

    public static final <T> AbstractC58260yxt<T> KWHzl(@NotNull AbstractC58260yxt<T> abstractC58260yxt, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58260yxt<T> abstractC58260yxtKWHzl = abstractC58260yxt.KWHzl(TPM.AEQbTJ.copydefault(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtKWHzl, "");
        return abstractC58260yxtKWHzl;
    }

    public static /* synthetic */ AbstractC58260yxt observeOnCpu$default(AbstractC58260yxt abstractC58260yxt, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return EZpvd(abstractC58260yxt, application, str, priority);
    }

    public static final <T> AbstractC58260yxt<T> EZpvd(@NotNull AbstractC58260yxt<T> abstractC58260yxt, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58260yxt<T> abstractC58260yxtOLrzqt = abstractC58260yxt.OLrzqt(TPM.AEQbTJ.OLrzqt(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static /* synthetic */ AbstractC58260yxt subscribeOnCpu$default(AbstractC58260yxt abstractC58260yxt, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return AEQbTJ(abstractC58260yxt, application, str, priority);
    }

    public static final <T> AbstractC58260yxt<T> AEQbTJ(@NotNull AbstractC58260yxt<T> abstractC58260yxt, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58260yxt<T> abstractC58260yxtKWHzl = abstractC58260yxt.KWHzl(TPM.AEQbTJ.OLrzqt(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtKWHzl, "");
        return abstractC58260yxtKWHzl;
    }

    public static /* synthetic */ AbstractC58247yxg observeOnIo$default(AbstractC58247yxg abstractC58247yxg, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return KWHzl(abstractC58247yxg, application, str, priority);
    }

    public static final <T> AbstractC58247yxg<T> KWHzl(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58247yxg<T> abstractC58247yxgObserveOn = abstractC58247yxg.observeOn(TPM.AEQbTJ.copydefault(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        return abstractC58247yxgObserveOn;
    }

    public static /* synthetic */ AbstractC58247yxg subscribeOnIo$default(AbstractC58247yxg abstractC58247yxg, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return OLrzqt(abstractC58247yxg, application, str, priority);
    }

    public static final <T> AbstractC58247yxg<T> OLrzqt(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58247yxg<T> abstractC58247yxgSubscribeOn = abstractC58247yxg.subscribeOn(TPM.AEQbTJ.copydefault(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgSubscribeOn, "");
        return abstractC58247yxgSubscribeOn;
    }

    public static /* synthetic */ AbstractC58247yxg observeOnCpu$default(AbstractC58247yxg abstractC58247yxg, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return EZpvd(abstractC58247yxg, application, str, priority);
    }

    public static final <T> AbstractC58247yxg<T> EZpvd(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58247yxg<T> abstractC58247yxgObserveOn = abstractC58247yxg.observeOn(TPM.AEQbTJ.OLrzqt(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        return abstractC58247yxgObserveOn;
    }

    public static /* synthetic */ AbstractC58247yxg subscribeOnCpu$default(AbstractC58247yxg abstractC58247yxg, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return copydefault(abstractC58247yxg, application, str, priority);
    }

    public static final <T> AbstractC58247yxg<T> copydefault(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58247yxg<T> abstractC58247yxgSubscribeOn = abstractC58247yxg.subscribeOn(TPM.AEQbTJ.OLrzqt(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgSubscribeOn, "");
        return abstractC58247yxgSubscribeOn;
    }

    public static /* synthetic */ AbstractC58177ywP observeOnIo$default(AbstractC58177ywP abstractC58177ywP, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return copydefault(abstractC58177ywP, application, str, priority);
    }

    public static final AbstractC58177ywP copydefault(@NotNull AbstractC58177ywP abstractC58177ywP, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58177ywP, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58177ywP abstractC58177ywPCopydefault = abstractC58177ywP.copydefault(TPM.AEQbTJ.copydefault(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58177ywPCopydefault, "");
        return abstractC58177ywPCopydefault;
    }

    public static /* synthetic */ AbstractC58177ywP subscribeOnIo$default(AbstractC58177ywP abstractC58177ywP, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return AEQbTJ(abstractC58177ywP, application, str, priority);
    }

    public static final AbstractC58177ywP AEQbTJ(@NotNull AbstractC58177ywP abstractC58177ywP, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58177ywP, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58177ywP abstractC58177ywPAEQbTJ = abstractC58177ywP.AEQbTJ(TPM.AEQbTJ.copydefault(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58177ywPAEQbTJ, "");
        return abstractC58177ywPAEQbTJ;
    }

    public static /* synthetic */ AbstractC58177ywP observeOnCpu$default(AbstractC58177ywP abstractC58177ywP, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return EZpvd(abstractC58177ywP, application, str, priority);
    }

    public static final AbstractC58177ywP EZpvd(@NotNull AbstractC58177ywP abstractC58177ywP, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58177ywP, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58177ywP abstractC58177ywPCopydefault = abstractC58177ywP.copydefault(TPM.AEQbTJ.OLrzqt(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58177ywPCopydefault, "");
        return abstractC58177ywPCopydefault;
    }

    public static /* synthetic */ AbstractC58177ywP subscribeOnCpu$default(AbstractC58177ywP abstractC58177ywP, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return KWHzl(abstractC58177ywP, application, str, priority);
    }

    public static final AbstractC58177ywP KWHzl(@NotNull AbstractC58177ywP abstractC58177ywP, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58177ywP, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58177ywP abstractC58177ywPAEQbTJ = abstractC58177ywP.AEQbTJ(TPM.AEQbTJ.OLrzqt(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58177ywPAEQbTJ, "");
        return abstractC58177ywPAEQbTJ;
    }

    public static /* synthetic */ AbstractC58185ywX observeOnIo$default(AbstractC58185ywX abstractC58185ywX, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return AEQbTJ(abstractC58185ywX, application, str, priority);
    }

    public static final <T> AbstractC58185ywX<T> AEQbTJ(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(TPM.AEQbTJ.copydefault(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static /* synthetic */ AbstractC58185ywX subscribeOnIo$default(AbstractC58185ywX abstractC58185ywX, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return KWHzl(abstractC58185ywX, application, str, priority);
    }

    public static final <T> AbstractC58185ywX<T> KWHzl(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58185ywX<T> abstractC58185ywXCopydefault = abstractC58185ywX.copydefault(TPM.AEQbTJ.copydefault(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static /* synthetic */ AbstractC58185ywX observeOnCpu$default(AbstractC58185ywX abstractC58185ywX, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return OLrzqt(abstractC58185ywX, application, str, priority);
    }

    public static final <T> AbstractC58185ywX<T> OLrzqt(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(TPM.AEQbTJ.OLrzqt(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static /* synthetic */ AbstractC58185ywX subscribeOnCpu$default(AbstractC58185ywX abstractC58185ywX, TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return copydefault(abstractC58185ywX, application, str, priority);
    }

    public static final <T> AbstractC58185ywX<T> copydefault(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        AbstractC58185ywX<T> abstractC58185ywXCopydefault = abstractC58185ywX.copydefault(TPM.AEQbTJ.OLrzqt(application, priority, str));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static /* synthetic */ CoroutineDispatcher ioDispatcher$default(TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return OLrzqt(application, str, priority);
    }

    public static final CoroutineDispatcher OLrzqt(@NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        return ExecutorsKt.from(TPM.AEQbTJ.AEQbTJ(application, priority, str));
    }

    public static /* synthetic */ CoroutineDispatcher cpuDispatcher$default(TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return AEQbTJ(application, str, priority);
    }

    public static final CoroutineDispatcher AEQbTJ(@NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        return ExecutorsKt.from(TPM.AEQbTJ.KWHzl(application, priority, str));
    }

    public static /* synthetic */ CoroutineDispatcher singleDispatcher$default(TPM.Application application, java.lang.String str, TPM.Priority priority, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return EZpvd(application, str, priority);
    }

    public static final CoroutineDispatcher EZpvd(@NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        return ExecutorsKt.from(TPM.AEQbTJ.EZpvd(application, priority, str));
    }

    public static /* synthetic */ Job launchIo$default(CoroutineScope coroutineScope, TPM.Application application, java.lang.String str, TPM.Priority priority, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return EZpvd(coroutineScope, application, str, priority, function2);
    }

    public static final Job EZpvd(@NotNull CoroutineScope coroutineScope, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, OLrzqt(application, str, priority), null, function2, 2, null);
    }

    public static /* synthetic */ Job launchCpu$default(CoroutineScope coroutineScope, TPM.Application application, java.lang.String str, TPM.Priority priority, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return copydefault(coroutineScope, application, str, priority, function2);
    }

    public static final Job copydefault(@NotNull CoroutineScope coroutineScope, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, AEQbTJ(application, str, priority), null, function2, 2, null);
    }

    public static /* synthetic */ Deferred asyncIo$default(CoroutineScope coroutineScope, TPM.Application application, java.lang.String str, TPM.Priority priority, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return KWHzl(coroutineScope, application, str, priority, function2);
    }

    public static final <T> Deferred<T> KWHzl(@NotNull CoroutineScope coroutineScope, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, OLrzqt(application, str, priority), null, function2, 2, null);
    }

    public static /* synthetic */ Deferred asyncCpu$default(CoroutineScope coroutineScope, TPM.Application application, java.lang.String str, TPM.Priority priority, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            priority = TPM.Priority.NORMAL;
        }
        return AEQbTJ(coroutineScope, application, str, priority, function2);
    }

    public static final <T> Deferred<T> AEQbTJ(@NotNull CoroutineScope coroutineScope, @NotNull TPM.Application application, @NotNull java.lang.String str, @NotNull TPM.Priority priority, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return BuildersKt__Builders_commonKt.async$default(coroutineScope, AEQbTJ(application, str, priority), null, function2, 2, null);
    }
}
