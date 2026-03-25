package o;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;

/* JADX INFO: renamed from: o.xvE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56032xvE {
    public static final C43280rmM AEQbTJ = new TaskDescription();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C43280rmM KWHzl() {
        return AEQbTJ;
    }

    /* JADX INFO: renamed from: o.xvE$TaskDescription */
    public static final class TaskDescription extends C43280rmM {
        public TaskDescription() {
            super(null, 1, null);
        }

        @Override // o.C43280rmM, o.C43395roV
        public java.util.List<Converter.Factory> proceedConvertFactories(java.util.List<? extends Converter.Factory> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new C56031xvD());
            arrayList.addAll(list);
            return arrayList;
        }
    }
}
