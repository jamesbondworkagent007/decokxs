package o;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.trade.arch.ui.IArchUiKt$launchWhenLifecycleStateSafety$1;
import com.okinc.trade.arch.ui.IArchUiKt$launchWhenLifecycleStateSafety$2;
import com.okinc.trade.arch.ui.IArchUiKt$launchWhenLifecycleStateSafety$3;
import com.okinc.trade.arch.ui.IArchUiKt$launchWhenLifecycleStateSafety$4;
import com.okinc.trade.arch.ui.IArchUiKt$repeatOnLifecycleSafety$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: o.unF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49365unF {

    /* JADX INFO: renamed from: o.unF$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    public static /* synthetic */ Job repeatOnLifecycleSafety$default(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            state = Lifecycle.State.RESUMED;
        }
        return AEQbTJ(lifecycleOwner, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) function2);
    }

    public static final Job AEQbTJ(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        LifecycleOwner viewLifecycleOwner;
        androidx.fragment.app.Fragment fragment = lifecycleOwner instanceof androidx.fragment.app.Fragment ? (androidx.fragment.app.Fragment) lifecycleOwner : null;
        if (fragment != null && (viewLifecycleOwner = fragment.getViewLifecycleOwner()) != null) {
            lifecycleOwner = viewLifecycleOwner;
        }
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new IArchUiKt$repeatOnLifecycleSafety$1(lifecycleOwner, state, function2, null), 3, null);
    }

    public static /* synthetic */ Job launchWhenLifecycleStateSafety$default(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            state = Lifecycle.State.RESUMED;
        }
        return KWHzl(lifecycleOwner, state, function2);
    }

    public static final Job KWHzl(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        LifecycleOwner viewLifecycleOwner;
        androidx.fragment.app.Fragment fragment = lifecycleOwner instanceof androidx.fragment.app.Fragment ? (androidx.fragment.app.Fragment) lifecycleOwner : null;
        if (fragment != null && (viewLifecycleOwner = fragment.getViewLifecycleOwner()) != null) {
            lifecycleOwner = viewLifecycleOwner;
        }
        int i = ActionBar.KWHzl[state.ordinal()];
        if (i == 1) {
            return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new IArchUiKt$launchWhenLifecycleStateSafety$1(lifecycleOwner, function2, null), 3, null);
        }
        if (i != 2) {
            return (i == 3 || i == 4) ? BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new IArchUiKt$launchWhenLifecycleStateSafety$3(lifecycleOwner, function2, null), 3, null) : BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new IArchUiKt$launchWhenLifecycleStateSafety$4(lifecycleOwner, function2, null), 3, null);
        }
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new IArchUiKt$launchWhenLifecycleStateSafety$2(lifecycleOwner, function2, null), 3, null);
    }

    public static /* synthetic */ Flow flowWithLifecycleSafety$default(Flow flow, Lifecycle.State state, LifecycleOwner lifecycleOwner, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            state = Lifecycle.State.RESUMED;
        }
        return copydefault(flow, state, lifecycleOwner);
    }

    public static final <T> Flow<T> copydefault(Flow<? extends T> flow, Lifecycle.State state, LifecycleOwner lifecycleOwner) {
        LifecycleOwner viewLifecycleOwner;
        androidx.fragment.app.Fragment fragment = lifecycleOwner instanceof androidx.fragment.app.Fragment ? (androidx.fragment.app.Fragment) lifecycleOwner : null;
        if (fragment != null && (viewLifecycleOwner = fragment.getViewLifecycleOwner()) != null) {
            lifecycleOwner = viewLifecycleOwner;
        }
        return FlowExtKt.flowWithLifecycle(flow, lifecycleOwner.getLifecycle(), state);
    }
}
