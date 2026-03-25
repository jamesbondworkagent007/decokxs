package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.IN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IN<E> extends IM<E> implements java.util.ListIterator<E>, yID {
    public final java.util.ListIterator<E> AEQbTJ;
    public final java.lang.Object EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IN(@NotNull java.lang.Object obj, @NotNull java.util.ListIterator<E> listIterator) {
        super(obj, listIterator);
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(listIterator, "");
        this.EZpvd = obj;
        this.AEQbTJ = listIterator;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        java.lang.Boolean boolInvoke;
        java.lang.Object obj = this.EZpvd;
        Function0<java.lang.Boolean> function0 = new Function0<java.lang.Boolean>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$hasPrevious$1
            final /* synthetic */ IN<E> this$0;

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
                return Boolean.valueOf(this.this$0.AEQbTJ.hasPrevious());
            }
        };
        synchronized (obj) {
            boolInvoke = function0.invoke();
        }
        return boolInvoke.booleanValue();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        java.lang.Integer numInvoke;
        java.lang.Object obj = this.EZpvd;
        Function0<java.lang.Integer> function0 = new Function0<java.lang.Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$nextIndex$1
            final /* synthetic */ IN<E> this$0;

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
                return Integer.valueOf(this.this$0.AEQbTJ.nextIndex());
            }
        };
        synchronized (obj) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    @Override // java.util.ListIterator
    public E previous() {
        E eInvoke;
        java.lang.Object obj = this.EZpvd;
        Function0<E> function0 = new Function0<E>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$previous$1
            final /* synthetic */ IN<E> this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final E invoke() {
                return (E) this.this$0.AEQbTJ.previous();
            }
        };
        synchronized (obj) {
            eInvoke = function0.invoke();
        }
        return eInvoke;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        java.lang.Integer numInvoke;
        java.lang.Object obj = this.EZpvd;
        Function0<java.lang.Integer> function0 = new Function0<java.lang.Integer>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$previousIndex$1
            final /* synthetic */ IN<E> this$0;

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
                return Integer.valueOf(this.this$0.AEQbTJ.previousIndex());
            }
        };
        synchronized (obj) {
            numInvoke = function0.invoke();
        }
        return numInvoke.intValue();
    }

    @Override // java.util.ListIterator
    public void add(final E e) {
        java.lang.Object obj = this.EZpvd;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$add$1
            final /* synthetic */ IN<E> this$0;

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
                this.this$0.AEQbTJ.add(e);
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }

    @Override // java.util.ListIterator
    public void set(final E e) {
        java.lang.Object obj = this.EZpvd;
        Function0<Unit> function0 = new Function0<Unit>(this) { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$set$1
            final /* synthetic */ IN<E> this$0;

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
                this.this$0.AEQbTJ.set(e);
            }
        };
        synchronized (obj) {
            function0.invoke();
        }
    }
}
