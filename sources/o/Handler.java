package o;

import aws.sdk.kotlin.runtime.auth.credentials.ExecuteCommandJVMKt$executeCommand$2;
import aws.smithy.kotlin.runtime.util.OsFamily;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Handler {

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OsFamily.values().length];
            try {
                iArr[OsFamily.Windows.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    public static final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull HL hl, long j, long j2, @NotNull InterfaceC5168Hi interfaceC5168Hi, @NotNull Continuation<? super kotlin.Pair<java.lang.Integer, java.lang.String>> continuation) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (Application.OLrzqt[hl.EZpvd().KWHzl().ordinal()] == 1) {
            arrayList.add("cmd.exe");
            arrayList.add("/C");
        } else {
            arrayList.add("sh");
            arrayList.add("-c");
        }
        arrayList.add(str);
        return BuildersKt.withContext(Dispatchers.getIO(), new ExecuteCommandJVMKt$executeCommand$2(arrayList, j2, j, null), continuation);
    }
}
