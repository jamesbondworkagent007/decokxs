package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC60170zxg {
    public static final TaskDescription Companion = TaskDescription.$$INSTANCE;

    void destroy();

    /* JADX INFO: renamed from: o.zxg$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription $$INSTANCE = new TaskDescription();

        private TaskDescription() {
        }

        public final void copydefault(@NotNull java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            for (java.lang.Object obj : objArr) {
                if (obj instanceof InterfaceC60170zxg) {
                    ((InterfaceC60170zxg) obj).destroy();
                } else if (obj instanceof java.util.ArrayList) {
                    int size = ((java.util.Collection) obj).size();
                    for (int i = 0; i < size; i++) {
                        java.lang.Object obj2 = ((java.util.ArrayList) obj).get(i);
                        if (obj2 instanceof InterfaceC60170zxg) {
                            ((InterfaceC60170zxg) obj2).destroy();
                        }
                    }
                } else if (obj instanceof java.util.Map) {
                    for (java.lang.Object obj3 : ((java.util.Map) obj).values()) {
                        if (obj3 instanceof InterfaceC60170zxg) {
                            ((InterfaceC60170zxg) obj3).destroy();
                        }
                    }
                } else if (obj instanceof java.lang.Iterable) {
                    for (java.lang.Object obj4 : (java.lang.Iterable) obj) {
                        if (obj4 instanceof InterfaceC60170zxg) {
                            ((InterfaceC60170zxg) obj4).destroy();
                        }
                    }
                }
            }
        }
    }
}
