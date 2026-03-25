package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C33606mzd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33606mzd {

    /* JADX INFO: renamed from: o.mzd$Application */
    public static final class Application extends C33607mze {
        public final /* synthetic */ Function1<java.lang.CharSequence, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super java.lang.CharSequence, Unit> function1) {
            this.copydefault = function1;
        }

        @Override // o.C33607mze, android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            this.copydefault.invoke(charSequence);
        }
    }

    public static final android.text.TextWatcher AEQbTJ(@NotNull android.widget.EditText editText, @NotNull Function1<? super java.lang.CharSequence, Unit> function1) {
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(function1);
        editText.addTextChangedListener(application);
        return application;
    }

    /* JADX INFO: renamed from: o.mzd$ActionBar */
    public static final class ActionBar extends C33607mze {
        public final /* synthetic */ Function1<java.lang.CharSequence, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function1<? super java.lang.CharSequence, Unit> function1) {
            this.KWHzl = function1;
        }

        @Override // o.C33607mze, android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            this.KWHzl.invoke(charSequence);
        }
    }

    public static final android.text.TextWatcher copydefault(@NotNull final android.widget.EditText editText, @NotNull final LifecycleOwner lifecycleOwner, @NotNull Function1<? super java.lang.CharSequence, Unit> function1) {
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final ActionBar actionBar = new ActionBar(function1);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.core.widget.WidgetExtKt$observeTextChanged$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                Intrinsics.checkNotNullParameter(event, "");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C33606mzd.OLrzqt(editText, actionBar);
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }
        });
        editText.addTextChangedListener(actionBar);
        return actionBar;
    }

    public static final void OLrzqt(@NotNull android.widget.EditText editText, @NotNull android.text.TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(textWatcher, "");
        editText.removeTextChangedListener(textWatcher);
    }

    /* JADX INFO: renamed from: o.mzd$TaskDescription */
    public static final class TaskDescription extends C33607mze {
        public final /* synthetic */ Function1<java.lang.CharSequence, Unit> OLrzqt;

        @Override // o.C33607mze, android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            this.OLrzqt.invoke(charSequence);
        }
    }
}
