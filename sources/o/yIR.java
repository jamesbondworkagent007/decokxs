package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class yIR extends yIN {
    public final TaskDescription EZpvd = new TaskDescription();

    public static final class TaskDescription extends java.lang.ThreadLocal<java.util.Random> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.util.Random initialValue() {
            return new java.util.Random();
        }
    }

    @Override // o.yIN
    public java.util.Random getImpl() {
        java.util.Random random = this.EZpvd.get();
        Intrinsics.checkNotNullExpressionValue(random, "");
        return random;
    }
}
