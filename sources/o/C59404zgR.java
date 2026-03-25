package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59404zgR {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.zgR$TaskDescription */
    public static final class TaskDescription<T> implements Sequence<T> {
        public final /* synthetic */ Function2 KWHzl;

        public TaskDescription(Function2 function2) {
            this.KWHzl = function2;
        }

        @Override // kotlin.sequences.Sequence
        public java.util.Iterator<T> iterator() {
            return C59404zgR.copydefault(this.KWHzl);
        }
    }

    public static <T> Sequence<T> EZpvd(@NotNull Function2<? super AbstractC59400zgN<? super T>, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return new TaskDescription(function2);
    }

    public static <T> java.util.Iterator<T> copydefault(@NotNull Function2<? super AbstractC59400zgN<? super T>, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        C59401zgO c59401zgO = new C59401zgO();
        c59401zgO.copydefault(C56441yFm.KWHzl(function2, c59401zgO, c59401zgO));
        return c59401zgO;
    }
}
