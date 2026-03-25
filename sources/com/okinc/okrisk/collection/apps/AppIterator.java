package com.okinc.okrisk.collection.apps;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import o.C47054tim;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AppIterator {
    private static int currentIndex;
    private static PackageManager packageManager;
    private static int totalCount;
    public static final AppIterator INSTANCE = new AppIterator();
    private static List<? extends PackageInfo> packageInfoList = yDY.AhwBna();
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int getCurrentIndex() {
        return currentIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int getTotal() {
        return totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void reset() {
        currentIndex = 0;
    }

    private AppIterator() {
    }

    public static final int init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        PackageManager packageManager2 = context.getPackageManager();
        packageManager = packageManager2;
        if (packageManager2 == null) {
            return 0;
        }
        Intrinsics.copydefault(packageManager2);
        List<PackageInfo> installedPackages = packageManager2.getInstalledPackages(4292);
        packageInfoList = installedPackages;
        currentIndex = 0;
        int size = installedPackages.size();
        totalCount = size;
        return size;
    }

    public static final boolean hasNext() {
        return currentIndex < packageInfoList.size();
    }

    public static final String getNext() {
        if (!hasNext() || packageManager == null) {
            return "";
        }
        try {
            List<? extends PackageInfo> list = packageInfoList;
            int i = currentIndex;
            currentIndex = i + 1;
            return (String) BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(list.get(i), null), 1, null);
        } catch (Exception e) {
            currentIndex++;
            return "{\"error\":\"" + INSTANCE.escape(e.getMessage()) + "\"}";
        }
    }

    /* JADX INFO: renamed from: com.okinc.okrisk.collection.apps.AppIterator$getNext$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ PackageInfo $packageInfo;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PackageInfo packageInfo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$packageInfo = packageInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$packageInfo, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AppsCollectionUtils appsCollectionUtils = AppsCollectionUtils.INSTANCE;
                PackageManager packageManager = AppIterator.packageManager;
                Intrinsics.copydefault(packageManager);
                PackageInfo packageInfo = this.$packageInfo;
                this.label = 1;
                obj = appsCollectionUtils.buildAppInfo(packageManager, packageInfo, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return ((C47054tim) obj).KWHzl();
        }
    }

    public static final void release() {
        packageInfoList = yDY.AhwBna();
        packageManager = null;
        currentIndex = 0;
        totalCount = 0;
    }

    private final String escape(String str) {
        return str == null ? "" : C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(str, "\\", "\\\\", false, 4, (Object) null), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "\\\"", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null), "\t", "\\t", false, 4, (Object) null);
    }
}
