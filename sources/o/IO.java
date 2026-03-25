package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.IM;
import o.IO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class IO<E> implements java.util.Collection<E>, yIC {
    public final java.util.Collection<E> EZpvd;
    public final java.lang.Object KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return C56511yIb.AEQbTJ(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) C56511yIb.EZpvd(this, tArr);
    }

    @Override // java.util.Collection
    public final int size() {
        return copydefault();
    }

    public IO(java.lang.Object obj, @NotNull java.util.Collection<E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.EZpvd = collection;
        this.KWHzl = obj == null ? this : obj;
    }

    public int copydefault() {
        java.lang.Integer numInvoke;
        java.lang.Object obj = this.KWHzl;
        Function0<java.lang.Integer> function0 = new Function0<java.lang.Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$size$1
            final /* synthetic */ IO<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.EZpvd.size());
            }
        };
        synchronized (obj) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    @Override // java.util.Collection
    public boolean contains(final java.lang.Object obj) {
        java.lang.Boolean boolInvoke;
        java.lang.Object obj2 = this.KWHzl;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$contains$1
            final /* synthetic */ IO<E> this$0;

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
                return Boolean.valueOf(this.this$0.EZpvd.contains(obj));
            }
        };
        synchronized (obj2) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull final java.util.Collection<? extends java.lang.Object> collection) {
        java.lang.Boolean boolInvoke;
        Intrinsics.checkNotNullParameter(collection, "");
        java.lang.Object obj = this.KWHzl;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$containsAll$1
            final /* synthetic */ IO<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends E> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.EZpvd.containsAll(collection));
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        java.lang.Boolean boolInvoke;
        java.lang.Object obj = this.KWHzl;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$isEmpty$1
            final /* synthetic */ IO<E> this$0;

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
                return Boolean.valueOf(this.this$0.EZpvd.isEmpty());
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean add(final E e) {
        java.lang.Boolean boolInvoke;
        java.lang.Object obj = this.KWHzl;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$add$1
            final /* synthetic */ IO<E> this$0;

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
                return Boolean.valueOf(this.this$0.EZpvd.add(e));
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean addAll(@NotNull final java.util.Collection<? extends E> collection) {
        java.lang.Boolean boolInvoke;
        Intrinsics.checkNotNullParameter(collection, "");
        java.lang.Object obj = this.KWHzl;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$addAll$1
            final /* synthetic */ IO<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends E> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.EZpvd.addAll(collection));
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public void clear() {
        java.lang.Object obj = this.KWHzl;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$clear$1
            final /* synthetic */ IO<E> this$0;

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
                this.this$0.EZpvd.clear();
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        IM<E> imInvoke;
        java.lang.Object obj = this.KWHzl;
        Function0<IM<E>> function0 = new Function0<IM<E>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$iterator$1
            final /* synthetic */ IO<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final IM<E> invoke() {
                return new IM<>(this.this$0.EZpvd(), this.this$0.EZpvd.iterator());
            }
        };
        synchronized (obj) {
            imInvoke = function0.invoke();
        }
        return imInvoke;
    }

    @Override // java.util.Collection
    public boolean remove(final java.lang.Object obj) {
        java.lang.Boolean boolInvoke;
        java.lang.Object obj2 = this.KWHzl;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$remove$1
            final /* synthetic */ IO<E> this$0;

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
                return Boolean.valueOf(this.this$0.EZpvd.remove(obj));
            }
        };
        synchronized (obj2) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean removeAll(@NotNull final java.util.Collection<? extends java.lang.Object> collection) {
        java.lang.Boolean boolInvoke;
        Intrinsics.checkNotNullParameter(collection, "");
        java.lang.Object obj = this.KWHzl;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$removeAll$1
            final /* synthetic */ IO<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends E> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.EZpvd.removeAll(collection));
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean retainAll(@NotNull final java.util.Collection<? extends java.lang.Object> collection) {
        java.lang.Boolean boolInvoke;
        Intrinsics.checkNotNullParameter(collection, "");
        java.lang.Object obj = this.KWHzl;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$retainAll$1
            final /* synthetic */ IO<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends E> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.EZpvd.retainAll(collection));
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }
}
