package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C59990ztS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59990ztS<T> extends AbstractC59982ztK<T> {
    public T EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59982ztK
    public boolean OLrzqt(C59985ztN c59985ztN) {
        return this.EZpvd != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59990ztS(@NotNull C59978ztG<T> c59978ztG) {
        super(c59978ztG);
        Intrinsics.checkNotNullParameter(c59978ztG, "");
    }

    public final T EZpvd() {
        T t = this.EZpvd;
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException("Single instance created couldn't return value".toString());
    }

    @Override // o.AbstractC59982ztK
    public void copydefault(C60060zuj c60060zuj) {
        Function1<T, Unit> function1EZpvd = OLrzqt().KWHzl().EZpvd();
        if (function1EZpvd != null) {
            function1EZpvd.invoke(this.EZpvd);
        }
        this.EZpvd = null;
    }

    @Override // o.AbstractC59982ztK
    public T KWHzl(@NotNull C59985ztN c59985ztN) {
        Intrinsics.checkNotNullParameter(c59985ztN, "");
        if (this.EZpvd == null) {
            return (T) super.KWHzl(c59985ztN);
        }
        return EZpvd();
    }

    @Override // o.AbstractC59982ztK
    public T AEQbTJ(@NotNull final C59985ztN c59985ztN) {
        Intrinsics.checkNotNullParameter(c59985ztN, "");
        C60071zuu.OLrzqt.copydefault(this, new Function0<Unit>(this) { // from class: org.koin.core.instance.SingleInstanceFactory$get$1
            final /* synthetic */ C59990ztS<T> this$0;

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
                if (this.this$0.OLrzqt(c59985ztN)) {
                    return;
                }
                C59990ztS<T> c59990ztS = this.this$0;
                c59990ztS.EZpvd = c59990ztS.KWHzl(c59985ztN);
            }
        });
        return EZpvd();
    }
}
