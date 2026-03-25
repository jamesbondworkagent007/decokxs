package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.IM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class IM<E> implements java.util.Iterator<E>, yIB {
    public final java.lang.Object OLrzqt;
    public final java.util.Iterator<E> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Iterator<? extends E> */
    /* JADX WARN: Multi-variable type inference failed */
    public IM(@NotNull java.lang.Object obj, @NotNull java.util.Iterator<? extends E> it) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(it, "");
        this.OLrzqt = obj;
        this.copydefault = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        java.lang.Boolean boolInvoke;
        java.lang.Object obj = this.OLrzqt;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableIterator$hasNext$1
            final /* synthetic */ IM<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.copydefault.hasNext());
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Iterator
    public E next() {
        E eInvoke;
        java.lang.Object obj = this.OLrzqt;
        Function0<E> function0 = new Function0<E>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableIterator$next$1
            final /* synthetic */ IM<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final E invoke() {
                return (E) this.this$0.copydefault.next();
            }
        };
        synchronized (obj) {
            eInvoke = function0.invoke();
        }
        return eInvoke;
    }

    @Override // java.util.Iterator
    public void remove() {
        java.lang.Object obj = this.OLrzqt;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableIterator$remove$1
            final /* synthetic */ IM<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.copydefault.remove();
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }
}
