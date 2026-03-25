package o;

import aws.smithy.kotlin.runtime.io.SdkSourceJVMKt$readToByteArray$2;
import aws.smithy.kotlin.runtime.io.SdkSourceJVMKt$toSdkByteReadChannel$job$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5062Dg {
    public static final java.lang.Object KWHzl(@NotNull InterfaceC5060De interfaceC5060De, @NotNull Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SdkSourceJVMKt$readToByteArray$2(interfaceC5060De, null), continuation);
    }

    public static /* synthetic */ CS toSdkByteReadChannel$default(InterfaceC5060De interfaceC5060De, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = null;
        }
        return AEQbTJ(interfaceC5060De, coroutineScope);
    }

    public static final CS AEQbTJ(@NotNull InterfaceC5060De interfaceC5060De, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(interfaceC5060De, "");
        C5067Dl c5067Dl = new C5067Dl(null, 1, 0 == true ? 1 : 0);
        if (coroutineScope == null) {
            coroutineScope = GlobalScope.INSTANCE;
        }
        c5067Dl.copydefault(BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO().plus(new CoroutineName("sdk-source-reader")), null, new SdkSourceJVMKt$toSdkByteReadChannel$job$1(c5067Dl, interfaceC5060De, null), 2, null));
        return c5067Dl;
    }
}
