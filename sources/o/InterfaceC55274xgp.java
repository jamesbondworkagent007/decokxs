package o;

import android.widget.PopupWindow;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC55274xgp {
    public static final TaskDescription Companion = TaskDescription.KWHzl;

    void AEQbTJ(@NotNull Function2<? super java.lang.CharSequence, ? super MutableLiveData<java.util.List<C55276xgr>>, Unit> function2, Function1<? super C55276xgr, Unit> function1, LifecycleOwner lifecycleOwner);

    void EZpvd(@NotNull Function1<? super C55230xfy, Unit> function1, @NotNull Function2<? super java.lang.CharSequence, ? super MutableLiveData<java.util.List<C55276xgr>>, Unit> function2, Function1<? super C55276xgr, Unit> function12, LifecycleOwner lifecycleOwner);

    android.widget.PopupWindow OLrzqt(android.view.View view, PopupWindow.OnDismissListener onDismissListener);

    void setMultipleColumnData(java.util.List<C55276xgr> list, Function1<? super C55276xgr, ? extends java.util.List<C55276xgr>> function1, Function2<? super C55276xgr, ? super C55276xgr, ? extends java.util.List<C55276xgr>> function2, yHO<? super C55276xgr, ? super C55276xgr, ? super C55276xgr, Unit> yho);

    void setMultipleOneColumnData(@NotNull java.util.List<C55276xgr> list, Function1<? super java.util.List<C55276xgr>, Unit> function1);

    void setSingleOneColumnData(@NotNull java.util.List<C55276xgr> list, yHO<? super C55276xgr, ? super C55276xgr, ? super C55276xgr, Unit> yho);

    /* JADX INFO: renamed from: o.xgp$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC55274xgp EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new C55198xfS(context, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: o.xgp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xgp */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setSingleOneColumnData$default(InterfaceC55274xgp interfaceC55274xgp, java.util.List list, yHO yho, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSingleOneColumnData");
            }
            if ((i & 2) != 0) {
                yho = null;
            }
            interfaceC55274xgp.setSingleOneColumnData(list, yho);
        }

        public static void EZpvd(@NotNull InterfaceC55274xgp interfaceC55274xgp, @NotNull java.util.List<C55276xgr> list, yHO<? super C55276xgr, ? super C55276xgr, ? super C55276xgr, Unit> yho) {
            Intrinsics.checkNotNullParameter(list, "");
            interfaceC55274xgp.setMultipleColumnData(list, null, null, yho);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xgp */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setMultipleOneColumnData$default(InterfaceC55274xgp interfaceC55274xgp, java.util.List list, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMultipleOneColumnData");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            interfaceC55274xgp.setMultipleOneColumnData(list, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xgp */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setMultipleColumnData$default(InterfaceC55274xgp interfaceC55274xgp, java.util.List list, Function1 function1, Function2 function2, yHO yho, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMultipleColumnData");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            if ((i & 4) != 0) {
                function2 = null;
            }
            if ((i & 8) != 0) {
                yho = null;
            }
            interfaceC55274xgp.setMultipleColumnData(list, function1, function2, yho);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xgp */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showSearch$default(InterfaceC55274xgp interfaceC55274xgp, Function2 function2, Function1 function1, LifecycleOwner lifecycleOwner, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSearch");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            if ((i & 4) != 0) {
                lifecycleOwner = null;
            }
            interfaceC55274xgp.AEQbTJ(function2, function1, lifecycleOwner);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xgp */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showSearch$default(InterfaceC55274xgp interfaceC55274xgp, Function1 function1, Function2 function2, Function1 function12, LifecycleOwner lifecycleOwner, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSearch");
            }
            if ((i & 4) != 0) {
                function12 = null;
            }
            if ((i & 8) != 0) {
                lifecycleOwner = null;
            }
            interfaceC55274xgp.EZpvd(function1, function2, function12, lifecycleOwner);
        }

        public static /* synthetic */ android.widget.PopupWindow showOnDropDown$default(InterfaceC55274xgp interfaceC55274xgp, android.view.View view, PopupWindow.OnDismissListener onDismissListener, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showOnDropDown");
            }
            if ((i & 1) != 0) {
                view = null;
            }
            if ((i & 2) != 0) {
                onDismissListener = null;
            }
            return interfaceC55274xgp.OLrzqt(view, onDismissListener);
        }
    }
}
