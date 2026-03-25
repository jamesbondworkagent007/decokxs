package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C59989ztR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C59989ztR<T> extends AbstractC59982ztK<T> {
    public java.util.HashMap<java.lang.String, T> KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59989ztR(@NotNull C59978ztG<T> c59978ztG) {
        super(c59978ztG);
        Intrinsics.checkNotNullParameter(c59978ztG, "");
        this.KWHzl = new java.util.HashMap<>();
    }

    @Override // o.AbstractC59982ztK
    public boolean OLrzqt(C59985ztN c59985ztN) {
        C60060zuj c60060zujOLrzqt;
        return this.KWHzl.get((c59985ztN == null || (c60060zujOLrzqt = c59985ztN.OLrzqt()) == null) ? null : c60060zujOLrzqt.AEQbTJ()) != null;
    }

    @Override // o.AbstractC59982ztK
    public void copydefault(C60060zuj c60060zuj) {
        if (c60060zuj != null) {
            Function1<T, Unit> function1EZpvd = OLrzqt().KWHzl().EZpvd();
            if (function1EZpvd != null) {
                function1EZpvd.invoke(this.KWHzl.get(c60060zuj.AEQbTJ()));
            }
            this.KWHzl.remove(c60060zuj.AEQbTJ());
        }
    }

    @Override // o.AbstractC59982ztK
    public T KWHzl(@NotNull C59985ztN c59985ztN) {
        Intrinsics.checkNotNullParameter(c59985ztN, "");
        if (this.KWHzl.get(c59985ztN.OLrzqt().AEQbTJ()) == null) {
            return (T) super.KWHzl(c59985ztN);
        }
        T t = this.KWHzl.get(c59985ztN.OLrzqt().AEQbTJ());
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException(("Scoped instance not found for " + c59985ztN.OLrzqt().AEQbTJ() + " in " + OLrzqt()).toString());
    }

    @Override // o.AbstractC59982ztK
    public T AEQbTJ(@NotNull final C59985ztN c59985ztN) {
        Intrinsics.checkNotNullParameter(c59985ztN, "");
        if (!Intrinsics.EZpvd(c59985ztN.OLrzqt().copydefault(), OLrzqt().copydefault())) {
            throw new java.lang.IllegalStateException(("Wrong Scope: trying to open instance for " + c59985ztN.OLrzqt().AEQbTJ() + " in " + OLrzqt()).toString());
        }
        C60071zuu.OLrzqt.copydefault(this, new Function0<Unit>(this) { // from class: org.koin.core.instance.ScopedInstanceFactory$get$1
            final /* synthetic */ C59989ztR<T> this$0;

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
                this.this$0.KWHzl.put(c59985ztN.OLrzqt().AEQbTJ(), this.this$0.KWHzl(c59985ztN));
            }
        });
        T t = this.KWHzl.get(c59985ztN.OLrzqt().AEQbTJ());
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException(("Scoped instance not found for " + c59985ztN.OLrzqt().AEQbTJ() + " in " + OLrzqt()).toString());
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        this.KWHzl.put(str, obj);
    }
}
