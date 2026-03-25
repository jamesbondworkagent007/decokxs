package o;

import com.okinc.okimcore.feature.cache.base.BaseIdLruCache$get$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sFJ<V> {
    public final int EZpvd = 100;
    public final ActionBar copydefault = new ActionBar(EZpvd());

    public abstract int AEQbTJ();

    public abstract java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super V> continuation);

    public static final class ActionBar extends android.util.LruCache<java.lang.String, V> {
        public ActionBar(int i) {
            super(i);
        }
    }

    public final int EZpvd() {
        int iAEQbTJ = AEQbTJ();
        return iAEQbTJ <= 0 ? this.EZpvd : iAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: o.sFJ */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: o.sFJ */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: o.sFJ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super V> continuation) throws java.lang.Throwable {
        BaseIdLruCache$get$1 baseIdLruCache$get$1;
        sFJ sfj;
        if (continuation instanceof BaseIdLruCache$get$1) {
            baseIdLruCache$get$1 = (BaseIdLruCache$get$1) continuation;
            int i = baseIdLruCache$get$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseIdLruCache$get$1.label = i - Integer.MIN_VALUE;
            } else {
                baseIdLruCache$get$1 = new BaseIdLruCache$get$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = baseIdLruCache$get$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseIdLruCache$get$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            objAEQbTJ = this.copydefault.get(str);
            if (objAEQbTJ == null) {
                baseIdLruCache$get$1.L$0 = this;
                baseIdLruCache$get$1.L$1 = str;
                baseIdLruCache$get$1.label = 1;
                objAEQbTJ = AEQbTJ(str, baseIdLruCache$get$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                sfj = this;
            }
            return objAEQbTJ;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (java.lang.String) baseIdLruCache$get$1.L$1;
        sFJ sfj2 = (sFJ) baseIdLruCache$get$1.L$0;
        C56391yDq.AEQbTJ(objAEQbTJ);
        sfj = sfj2;
        if (objAEQbTJ != null) {
            sfj.EZpvd(str, objAEQbTJ);
        }
        return objAEQbTJ;
    }

    public final void EZpvd(@NotNull java.lang.String str, V v) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.put(str, v);
    }

    public final void n_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.remove(str);
    }

    public final void KWHzl() {
        this.copydefault.evictAll();
    }
}
