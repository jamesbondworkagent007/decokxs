package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57441yiV extends androidx.fragment.app.Fragment {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public Function0<Unit> AkhnZx;
    public Function0<Unit> KWHzl;
    public Function0<Unit> copydefault;
    public AbstractC57412yht values;
    public java.lang.CharSequence valueOf = "";
    public java.lang.CharSequence gEmmrt = "";
    public java.lang.CharSequence AYXKKw = "";
    public java.lang.String djBIcL = "";
    public java.lang.String AhwBna = "";
    public boolean EZpvd = true;
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.yiV$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yiV.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C57441yiV AEQbTJ(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, Function0<Unit> function03) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            C57441yiV c57441yiV = new C57441yiV();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("risk_title", charSequence);
            bundle.putCharSequence("risk_sub_title", charSequence2);
            bundle.putString("risk_primary_button_content", str);
            bundle.putString("risk_secondary_button_content", str2);
            bundle.putCharSequence("risk_sub_title_clickable_text", charSequence3);
            bundle.putBoolean("is_first_page", z);
            bundle.putString("report_title", str3);
            c57441yiV.setArguments(bundle);
            c57441yiV.copydefault = function0;
            c57441yiV.KWHzl = function02;
            c57441yiV.AkhnZx = function03;
            return c57441yiV;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC57412yht abstractC57412yhtCopydefault = AbstractC57412yht.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC57412yhtCopydefault, "");
        this.values = abstractC57412yhtCopydefault;
        return abstractC57412yhtCopydefault.getRoot();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x015c  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        java.lang.String string;
        java.lang.String string2;
        java.lang.CharSequence charSequence3;
        java.lang.String string3;
        int i;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, getViewLifecycleOwner(), false, new Function1() { // from class: o.yiW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C57441yiV.AEQbTJ(this.copydefault, (OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (charSequence = arguments.getCharSequence("risk_title")) == null) {
            charSequence = "";
        }
        this.valueOf = charSequence;
        if (arguments == null || (charSequence2 = arguments.getCharSequence("risk_sub_title")) == null) {
            charSequence2 = "";
        }
        this.gEmmrt = charSequence2;
        if (arguments == null || (string = arguments.getString("risk_primary_button_content")) == null) {
            string = "";
        }
        this.djBIcL = string;
        if (arguments == null || (string2 = arguments.getString("risk_secondary_button_content")) == null) {
            string2 = "";
        }
        this.AhwBna = string2;
        this.EZpvd = arguments != null ? arguments.getBoolean("is_first_page") : true;
        if (arguments == null || (charSequence3 = arguments.getCharSequence("risk_sub_title_clickable_text")) == null) {
            charSequence3 = "";
        }
        this.AYXKKw = charSequence3;
        if (arguments == null || (string3 = arguments.getString("report_title")) == null) {
            string3 = "";
        }
        this.AEQbTJ = string3;
        AbstractC57412yht abstractC57412yht = this.values;
        if (abstractC57412yht != null && (textView4 = abstractC57412yht.valueOf) != null) {
            textView4.setText(this.valueOf);
        }
        AbstractC57412yht abstractC57412yht2 = this.values;
        if (abstractC57412yht2 != null && (textView3 = abstractC57412yht2.AhwBna) != null) {
            textView3.setText(this.gEmmrt);
            textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            textView3.setClickable(true);
        }
        AbstractC57412yht abstractC57412yht3 = this.values;
        if (abstractC57412yht3 != null && (textView2 = abstractC57412yht3.djBIcL) != null) {
            if (this.AYXKKw.length() > 0) {
                textView2.setVisibility(0);
                textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                textView2.setText(this.AYXKKw);
                textView2.setClickable(true);
            } else {
                textView2.setVisibility(8);
            }
        }
        AbstractC57412yht abstractC57412yht4 = this.values;
        if (abstractC57412yht4 != null && (textView = abstractC57412yht4.AYXKKw) != null) {
            if (this.EZpvd && this.AEQbTJ.length() > 0) {
                textView.setVisibility(0);
                textView.setText(this.AEQbTJ);
                textView.setOnClickListener(new Application(textView, 1000L, this));
            } else {
                textView.setVisibility(8);
            }
        }
        if (!this.EZpvd) {
            AbstractC57412yht abstractC57412yht5 = this.values;
            if (abstractC57412yht5 != null) {
                abstractC57412yht5.copydefault.setVisibility(0);
                abstractC57412yht5.AEQbTJ.setVisibility(8);
                C57468yiw c57468yiw = abstractC57412yht5.copydefault;
                c57468yiw.setPrimaryButtonText(this.djBIcL);
                c57468yiw.setSecondaryButtonText(this.AhwBna);
                c57468yiw.setPrimaryButtonCallBack(new Function0() { // from class: o.yjb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C57441yiV.OLrzqt(this.KWHzl);
                    }
                });
                c57468yiw.setSecondaryButtonCallBack(new Function0() { // from class: o.yjd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C57441yiV.EZpvd(this.OLrzqt);
                    }
                });
                return;
            }
            return;
        }
        AbstractC57412yht abstractC57412yht6 = this.values;
        if (abstractC57412yht6 != null) {
            abstractC57412yht6.copydefault.setVisibility(8);
            abstractC57412yht6.AEQbTJ.setVisibility(0);
            abstractC57412yht6.KWHzl.setText(this.djBIcL);
            abstractC57412yht6.EZpvd.setText(this.AhwBna);
            C52794wYp c52794wYp = abstractC57412yht6.KWHzl;
            java.lang.CharSequence text = c52794wYp.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            c52794wYp.setVisibility(text.length() > 0 ? 0 : 8);
            C52794wYp c52794wYp2 = abstractC57412yht6.EZpvd;
            java.lang.CharSequence text2 = c52794wYp2.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "");
            c52794wYp2.setVisibility(text2.length() > 0 ? 0 : 8);
            android.view.View view2 = abstractC57412yht6.OLrzqt;
            C52794wYp c52794wYp3 = abstractC57412yht6.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
            if (c52794wYp3.getVisibility() == 0) {
                C52794wYp c52794wYp4 = abstractC57412yht6.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c52794wYp4, "");
                i = c52794wYp4.getVisibility() != 0 ? 8 : 0;
            }
            view2.setVisibility(i);
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC57412yht6.KWHzl);
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.yiX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C57441yiV.EZpvd(this.AEQbTJ, obj);
                }
            });
            C8003auW.copydefault(abstractC57412yht6.EZpvd).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.yja
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C57441yiV.AEQbTJ(this.AEQbTJ, obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(C57441yiV c57441yiV, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        FragmentActivity activity = c57441yiV.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C57441yiV c57441yiV, java.lang.Object obj) {
        Function0<Unit> function0 = c57441yiV.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void AEQbTJ(C57441yiV c57441yiV, java.lang.Object obj) {
        Function0<Unit> function0 = c57441yiV.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final Unit OLrzqt(C57441yiV c57441yiV) {
        Function0<Unit> function0 = c57441yiV.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C57441yiV c57441yiV) {
        Function0<Unit> function0 = c57441yiV.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.yiV$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C57441yiV AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C57441yiV c57441yiV) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c57441yiV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.AEQbTJ.AkhnZx;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
