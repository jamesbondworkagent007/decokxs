package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mqh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33133mqh {
    public static final void AEQbTJ(@NotNull android.widget.TextView textView, boolean z) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.getPaint().setFakeBoldText(z);
    }

    /* JADX INFO: renamed from: o.mqh$Application */
    public static final class Application extends C33607mze {
        public final /* synthetic */ Function1<java.lang.CharSequence, Unit> EZpvd;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super java.lang.CharSequence, Unit> function1) {
            this.EZpvd = function1;
        }

        @Override // o.C33607mze, android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            this.EZpvd.invoke(charSequence);
        }
    }

    public static final android.text.TextWatcher copydefault(@NotNull final android.widget.TextView textView, @NotNull final LifecycleOwner lifecycleOwner, @NotNull Function1<? super java.lang.CharSequence, Unit> function1) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Application application = new Application(function1);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.core.ktx.TextViewExtKt$observeTextChanged$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                Intrinsics.checkNotNullParameter(event, "");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    textView.removeTextChangedListener(application);
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }
        });
        textView.addTextChangedListener(application);
        return application;
    }
}
