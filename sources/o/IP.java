package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.IN;
import o.IP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IP<E> extends IO<E> implements java.util.List<E>, yIE {
    public final java.util.List<E> AEQbTJ;

    @Override // java.util.List
    public final E remove(int i) {
        return OLrzqt(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IP(java.lang.Object obj, @NotNull java.util.List<E> list) {
        super(obj, list);
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    public IP() {
        this(null, new java.util.ArrayList());
    }

    @Override // java.util.List
    public E get(final int i) {
        E eInvoke;
        java.lang.Object objEZpvd = EZpvd();
        Function0<E> function0 = new Function0<E>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList$get$1
            final /* synthetic */ IP<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final E invoke() {
                return (E) this.this$0.AEQbTJ.get(i);
            }
        };
        synchronized (objEZpvd) {
            eInvoke = function0.invoke();
        }
        return eInvoke;
    }

    @Override // java.util.List
    public int indexOf(final java.lang.Object obj) {
        java.lang.Integer numInvoke;
        java.lang.Object objEZpvd = EZpvd();
        Function0<java.lang.Integer> function0 = new Function0<java.lang.Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList$indexOf$1
            final /* synthetic */ IP<E> this$0;

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
                return Integer.valueOf(this.this$0.AEQbTJ.indexOf(obj));
            }
        };
        synchronized (objEZpvd) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    @Override // java.util.List
    public int lastIndexOf(final java.lang.Object obj) {
        java.lang.Integer numInvoke;
        java.lang.Object objEZpvd = EZpvd();
        Function0<java.lang.Integer> function0 = new Function0<java.lang.Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList$lastIndexOf$1
            final /* synthetic */ IP<E> this$0;

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
                return Integer.valueOf(this.this$0.AEQbTJ.lastIndexOf(obj));
            }
        };
        synchronized (objEZpvd) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    @Override // java.util.List
    public void add(final int i, final E e) {
        java.lang.Object objEZpvd = EZpvd();
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList$add$1
            final /* synthetic */ IP<E> this$0;

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
                this.this$0.AEQbTJ.add(i, e);
            }
        };
        synchronized (objEZpvd) {
            function0.invoke();
        }
    }

    @Override // java.util.List
    public boolean addAll(final int i, @NotNull final java.util.Collection<? extends E> collection) {
        java.lang.Boolean boolInvoke;
        Intrinsics.checkNotNullParameter(collection, "");
        java.lang.Object objEZpvd = EZpvd();
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList$addAll$1
            final /* synthetic */ IP<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends E> */
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
                return Boolean.valueOf(this.this$0.AEQbTJ.addAll(i, collection));
            }
        };
        synchronized (objEZpvd) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator() {
        IN<E> inInvoke;
        java.lang.Object objEZpvd = EZpvd();
        Function0<IN<E>> function0 = new Function0<IN<E>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList$listIterator$1
            final /* synthetic */ IP<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final IN<E> invoke() {
                IP<E> ip = this.this$0;
                return new IN<>(ip, ip.AEQbTJ.listIterator());
            }
        };
        synchronized (objEZpvd) {
            inInvoke = function0.invoke();
        }
        return inInvoke;
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(final int i) {
        IN<E> inInvoke;
        java.lang.Object objEZpvd = EZpvd();
        Function0<IN<E>> function0 = new Function0<IN<E>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList$listIterator$2
            final /* synthetic */ IP<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final IN<E> invoke() {
                IP<E> ip = this.this$0;
                return new IN<>(ip, ip.AEQbTJ.listIterator(i));
            }
        };
        synchronized (objEZpvd) {
            inInvoke = function0.invoke();
        }
        return inInvoke;
    }

    public E OLrzqt(final int i) {
        E eInvoke;
        java.lang.Object objEZpvd = EZpvd();
        Function0<E> function0 = new Function0<E>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList$removeAt$1
            final /* synthetic */ IP<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final E invoke() {
                return (E) this.this$0.AEQbTJ.remove(i);
            }
        };
        synchronized (objEZpvd) {
            eInvoke = function0.invoke();
        }
        return eInvoke;
    }

    @Override // java.util.List
    public E set(final int i, final E e) {
        E eInvoke;
        java.lang.Object objEZpvd = EZpvd();
        Function0<E> function0 = new Function0<E>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList$set$1
            final /* synthetic */ IP<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final E invoke() {
                return (E) this.this$0.AEQbTJ.set(i, e);
            }
        };
        synchronized (objEZpvd) {
            eInvoke = function0.invoke();
        }
        return eInvoke;
    }

    @Override // java.util.List
    public java.util.List<E> subList(final int i, final int i2) {
        IP<E> ipInvoke;
        java.lang.Object objEZpvd = EZpvd();
        Function0<IP<E>> function0 = new Function0<IP<E>>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableList$subList$1
            final /* synthetic */ IP<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final IP<E> invoke() {
                IP<E> ip = this.this$0;
                return new IP<>(ip, ip.AEQbTJ.subList(i, i2));
            }
        };
        synchronized (objEZpvd) {
            ipInvoke = function0.invoke();
        }
        return ipInvoke;
    }
}
