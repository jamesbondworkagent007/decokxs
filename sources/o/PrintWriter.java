package o;

import java.lang.reflect.Field;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56424yEw;
import o.HL;
import o.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class PrintWriter {
    public static final InterfaceC56387yDm<java.util.Map<java.lang.String, java.lang.String>> KWHzl = C56392yDr.copydefault(new Function0<java.util.Map<java.lang.String, java.lang.String>>() { // from class: aws.sdk.kotlin.runtime.http.AwsUserAgentMetadataJvmKt$jvmMetadataExtras$1
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final Map<String, String> invoke() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
            Map<String, String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("javaVersion", PrintWriter.getSystemProperty$default("java.version", null, 2, null)), C56390yDp.OLrzqt("jvmName", PrintWriter.getSystemProperty$default("java.vm.name", null, 2, null)), C56390yDp.OLrzqt("jvmVersion", PrintWriter.getSystemProperty$default("java.vm.version", null, 2, null)));
            if (HL.OLrzqt.copydefault().AEQbTJ()) {
                Class<?> cls = Class.forName("android.os.Build$VERSION");
                Field declaredField = cls.getDeclaredField("SDK_INT");
                Field declaredField2 = cls.getDeclaredField("RELEASE");
                mapDjBIcL.put("androidApiVersion", String.valueOf(declaredField.getInt(null)));
                Object obj = declaredField2.get(null);
                Intrinsics.copydefault(obj, "");
                mapDjBIcL.put("androidRelease", (String) obj);
            }
            return mapDjBIcL;
        }
    });

    public static final Serializable EZpvd() {
        return new Serializable(null, KWHzl.getValue(), 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ java.lang.String getSystemProperty$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "unknown";
        }
        return KWHzl(str, str2);
    }

    public static final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.System.getProperty(str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Object obj = str2;
        if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
            obj = objM7377constructorimpl;
        }
        return (java.lang.String) obj;
    }
}
