package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.okex.common.util.ContextHelper$checkUsableLifecycleOwner$1;
import com.okinc.okex.common.util.ContextHelper$checkUsableLifecycleOwner$2;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45357soK {
    public static final C45357soK KWHzl = new C45357soK();

    private C45357soK() {
    }

    public final android.app.Activity KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        return KWHzl();
    }

    public final android.app.Activity KWHzl() {
        java.lang.Object objPrevious;
        java.util.List<WeakReference<android.app.Activity>> listKWHzl = C32979mnm.EZpvd.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            android.app.Activity activity = (android.app.Activity) ((WeakReference) it.next()).get();
            if (activity != null) {
                arrayList.add(activity);
            }
        }
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            android.app.Activity activity2 = (android.app.Activity) objPrevious;
            if (!activity2.isFinishing() && !activity2.isDestroyed()) {
                break;
            }
        }
        return (android.app.Activity) objPrevious;
    }

    public final boolean AEQbTJ(android.content.Context context) {
        boolean z = !(context instanceof InterfaceC32628mhF) && (context instanceof LifecycleOwner);
        if (!(context instanceof android.app.Activity)) {
            return z;
        }
        if (z) {
            android.app.Activity activity = (android.app.Activity) context;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                return true;
            }
        }
        return false;
    }

    public final android.app.Activity copydefault() {
        WeakReference<android.app.Activity> weakReferencePrevious;
        java.util.List<WeakReference<android.app.Activity>> listKWHzl = C32979mnm.EZpvd.KWHzl();
        java.util.ListIterator<WeakReference<android.app.Activity>> listIterator = listKWHzl.listIterator(listKWHzl.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                weakReferencePrevious = null;
                break;
            }
            weakReferencePrevious = listIterator.previous();
            android.app.Activity activity = weakReferencePrevious.get();
            if (activity != null && KWHzl.AEQbTJ(activity)) {
                break;
            }
        }
        WeakReference<android.app.Activity> weakReference = weakReferencePrevious;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull Function2<? super android.content.Context, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        android.content.Context contextCopydefault = AEQbTJ(context) ? context : copydefault();
        if (contextCopydefault instanceof LifecycleOwner) {
            C44760scx.log$default("ContextHelper => checkUsableLifecycleOwner: using lifecycleOwner", null, 2, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) contextCopydefault), null, null, new ContextHelper$checkUsableLifecycleOwner$1(function2, contextCopydefault, null), 3, null);
        } else {
            C44760scx.log$default("ContextHelper => checkUsableLifecycleOwner: using GlobalScope", null, 2, null);
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new ContextHelper$checkUsableLifecycleOwner$2(function2, context, null), 3, null);
        }
    }
}
