package o;

import io.reactivex.exceptions.CompositeException;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC58026ytX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58056yuA {
    public final java.util.Map<Application, InterfaceC58026ytX<java.lang.Object>> EZpvd;
    public final java.util.List<InterfaceC58026ytX.TaskDescription> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.ytX$TaskDescription> */
    /* JADX WARN: Multi-variable type inference failed */
    public C58056yuA(@NotNull java.util.List<? extends InterfaceC58026ytX.TaskDescription> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.EZpvd = new LinkedHashMap();
    }

    public final InterfaceC58026ytX<java.lang.Object> AEQbTJ(@NotNull java.lang.reflect.Type type, @NotNull java.lang.annotation.Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Application application = new Application(type, annotationArr);
        if (this.EZpvd.containsKey(application)) {
            InterfaceC58026ytX<java.lang.Object> interfaceC58026ytX = this.EZpvd.get(application);
            Intrinsics.copydefault(interfaceC58026ytX);
            return interfaceC58026ytX;
        }
        InterfaceC58026ytX<java.lang.Object> interfaceC58026ytXEZpvd = EZpvd(type, annotationArr);
        this.EZpvd.put(application, interfaceC58026ytXEZpvd);
        return interfaceC58026ytXEZpvd;
    }

    public final InterfaceC58026ytX<java.lang.Object> EZpvd(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<InterfaceC58026ytX.TaskDescription> it = this.copydefault.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC58026ytX<?> interfaceC58026ytXEZpvd = it.next().EZpvd(type, annotationArr);
                Intrinsics.copydefault(interfaceC58026ytXEZpvd, "");
                return interfaceC58026ytXEZpvd;
            } catch (java.lang.Throwable th) {
                arrayList.add(th);
            }
        }
        java.lang.Throwable[] thArr = (java.lang.Throwable[]) arrayList.toArray(new java.lang.Throwable[0]);
        throw new java.lang.IllegalStateException("Cannot resolve message adapter for type: " + type + ", annotations: " + annotationArr + '.', new CompositeException((java.lang.Throwable[]) java.util.Arrays.copyOf(thArr, thArr.length)));
    }

    /* JADX INFO: renamed from: o.yuA$Application */
    public static final class Application {
        public final java.lang.reflect.Type AEQbTJ;
        public final java.lang.annotation.Annotation[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                type = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                annotationArr = application.OLrzqt;
            }
            return application.OLrzqt(type, annotationArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.lang.reflect.Type type, @NotNull java.lang.annotation.Annotation[] annotationArr) {
            Intrinsics.checkNotNullParameter(type, "");
            Intrinsics.checkNotNullParameter(annotationArr, "");
            return new Application(type, annotationArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MessageAdapterKey(type=" + this.AEQbTJ + ", annotations=" + java.util.Arrays.toString(this.OLrzqt) + ')';
        }

        public Application(@NotNull java.lang.reflect.Type type, @NotNull java.lang.annotation.Annotation[] annotationArr) {
            Intrinsics.checkNotNullParameter(type, "");
            Intrinsics.checkNotNullParameter(annotationArr, "");
            this.AEQbTJ = type;
            this.OLrzqt = annotationArr;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.EZpvd(Application.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.copydefault(obj, "");
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && java.util.Arrays.equals(this.OLrzqt, application.OLrzqt);
        }

        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + java.util.Arrays.hashCode(this.OLrzqt);
        }
    }
}
