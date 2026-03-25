package o;

import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xKK extends InterfaceC54502xKu {
    LiveData<java.lang.Exception> AhwBna();

    LiveData<java.lang.Boolean> AkhnZx();

    void OLrzqt(long j);

    java.lang.String bB_();

    java.util.Map<java.lang.String, java.lang.String> valueOf();

    boolean values();

    public static final class Activity {
        public static /* synthetic */ void execute$default(xKK xkk, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
            }
            if ((i & 1) != 0) {
                j = 0;
            }
            xkk.OLrzqt(j);
        }

        public static java.util.Map<java.lang.String, java.lang.String> copydefault(@NotNull xKK xkk) {
            try {
                java.lang.reflect.Field[] declaredFields = xkk.getClass().getDeclaredFields();
                java.util.HashMap map = new java.util.HashMap();
                Intrinsics.copydefault(declaredFields);
                for (java.lang.reflect.Field field : declaredFields) {
                    field.setAccessible(true);
                    map.put(field.getName(), C33129mqd.gEmmrt(field.get(xkk)));
                }
                return map;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return new java.util.HashMap();
            }
        }

        public static java.lang.String EZpvd(@NotNull xKK xkk) {
            java.lang.String name = xkk.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            return name;
        }
    }
}
