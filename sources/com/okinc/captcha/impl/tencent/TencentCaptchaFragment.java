package com.okinc.captcha.impl.tencent;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.captcha.impl.tencent.TencentCaptchaFragment;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32995moB;
import o.C52761wXj;
import o.C56390yDp;
import o.lWD;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class TencentCaptchaFragment extends C32995moB {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static Function1<? super String, Unit> KWHzl = new Function1() { // from class: o.lWc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return TencentCaptchaFragment.gEmmrt((java.lang.String) obj);
        }
    };
    public static Function1<? super String, Unit> AEQbTJ = new Function1() { // from class: o.lWg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return TencentCaptchaFragment.AYXKKw((java.lang.String) obj);
        }
    };
    public static Function0<Unit> OLrzqt = new Function0() { // from class: o.lWf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TencentCaptchaFragment.AYXKKw();
        }
    };
    public static Function0<Unit> copydefault = new Function0() { // from class: o.lWj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TencentCaptchaFragment.gEmmrt();
        }
    };

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws JSONException {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fFgQHt);
        frameLayout.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        try {
            WebView webViewOLrzqt = lWD.OLrzqt(this);
            webViewOLrzqt.addJavascriptInterface(new Callback(new WeakReference(this)), "jsBridge");
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("EXTRA_CAPTCHA_ID") : null;
            if (string == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Bundle arguments2 = getArguments();
            String string2 = arguments2 != null ? arguments2.getString("EXTRA_USER_LANGUAGE") : null;
            if (string2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Bundle arguments3 = getArguments();
            Boolean boolValueOf = arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("EXTRA_IS_DARK_MODE", false)) : null;
            if (boolValueOf == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            webViewOLrzqt.loadUrl("file:///android_asset/tencent_captcha.html?userLanguage=" + string2 + "&captchaId=" + string + "&isDarkMode=" + boolValueOf.booleanValue());
            frameLayout.addView(webViewOLrzqt);
            return frameLayout;
        } catch (Exception e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", -13099);
            jSONObject.put("errorMessage", e.getMessage());
            Function1<? super String, Unit> function1 = AEQbTJ;
            String string3 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "");
            function1.invoke(string3);
            dismissAllowingStateLoss();
            return null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawableResource(C52761wXj.Activity.aBDePw);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    public static final class Callback {
        public final WeakReference<C32995moB> AEQbTJ;

        public Callback(@NotNull WeakReference<C32995moB> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "");
            this.AEQbTJ = weakReference;
        }

        @JavascriptInterface
        public final void onLoadFinished() {
            AEQbTJ(new Function1() { // from class: o.lWp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TencentCaptchaFragment.Callback.EZpvd((C32995moB) obj);
                }
            });
        }

        public static final Unit EZpvd(C32995moB c32995moB) {
            Intrinsics.checkNotNullParameter(c32995moB, "");
            TencentCaptchaFragment.Companion.KWHzl().invoke();
            return Unit.INSTANCE;
        }

        @JavascriptInterface
        public final void onSuccess(@NotNull final String str) {
            Intrinsics.checkNotNullParameter(str, "");
            AEQbTJ(new Function1() { // from class: o.lWk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TencentCaptchaFragment.Callback.AEQbTJ(str, (C32995moB) obj);
                }
            });
        }

        public static final Unit AEQbTJ(String str, C32995moB c32995moB) {
            Intrinsics.checkNotNullParameter(c32995moB, "");
            TencentCaptchaFragment.Companion.OLrzqt().invoke(str);
            c32995moB.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }

        @JavascriptInterface
        public final void onError(@NotNull final String str) {
            Intrinsics.checkNotNullParameter(str, "");
            AEQbTJ(new Function1() { // from class: o.lWl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TencentCaptchaFragment.Callback.copydefault(str, (C32995moB) obj);
                }
            });
        }

        public static final Unit copydefault(String str, C32995moB c32995moB) {
            Intrinsics.checkNotNullParameter(c32995moB, "");
            TencentCaptchaFragment.Companion.copydefault().invoke(str);
            c32995moB.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }

        @JavascriptInterface
        public final void onCancel() {
            AEQbTJ(new Function1() { // from class: o.lWm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TencentCaptchaFragment.Callback.OLrzqt((C32995moB) obj);
                }
            });
        }

        public static final Unit OLrzqt(C32995moB c32995moB) {
            Intrinsics.checkNotNullParameter(c32995moB, "");
            TencentCaptchaFragment.Companion.AEQbTJ().invoke();
            c32995moB.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Function1<? super C32995moB, Unit> function1) {
            C32995moB c32995moB = this.AEQbTJ.get();
            if (c32995moB == null || c32995moB.isDetached()) {
                return;
            }
            function1.invoke(c32995moB);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        OLrzqt.invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        KWHzl = new Function1() { // from class: o.lWh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TencentCaptchaFragment.AEQbTJ((java.lang.String) obj);
            }
        };
        AEQbTJ = new Function1() { // from class: o.lWi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TencentCaptchaFragment.djBIcL((java.lang.String) obj);
            }
        };
        OLrzqt = new Function0() { // from class: o.lWo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TencentCaptchaFragment.DbNXlk();
            }
        };
        copydefault = new Function0() { // from class: o.lWn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TencentCaptchaFragment.AkhnZx();
            }
        };
    }

    public static final Unit AEQbTJ(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit djBIcL(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DbNXlk() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AkhnZx() {
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.captcha.impl.tencent.TencentCaptchaFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final Function1<String, Unit> OLrzqt() {
            return TencentCaptchaFragment.KWHzl;
        }

        public final void copydefault(@NotNull Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            TencentCaptchaFragment.KWHzl = function1;
        }

        public final void OLrzqt(@NotNull Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            TencentCaptchaFragment.AEQbTJ = function1;
        }

        public final Function1<String, Unit> copydefault() {
            return TencentCaptchaFragment.AEQbTJ;
        }

        public final Function0<Unit> AEQbTJ() {
            return TencentCaptchaFragment.OLrzqt;
        }

        public final void EZpvd(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            TencentCaptchaFragment.OLrzqt = function0;
        }

        public final Function0<Unit> KWHzl() {
            return TencentCaptchaFragment.copydefault;
        }

        public final void copydefault(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            TencentCaptchaFragment.copydefault = function0;
        }

        public final void OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @NotNull String str2, boolean z, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super String, Unit> function12, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            TaskDescription taskDescription = TencentCaptchaFragment.Companion;
            taskDescription.copydefault(function1);
            taskDescription.OLrzqt(function12);
            taskDescription.EZpvd(function0);
            taskDescription.copydefault(function02);
            TencentCaptchaFragment tencentCaptchaFragment = new TencentCaptchaFragment();
            tencentCaptchaFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("EXTRA_CAPTCHA_ID", str), C56390yDp.OLrzqt("EXTRA_USER_LANGUAGE", str2), C56390yDp.OLrzqt("EXTRA_IS_DARK_MODE", Boolean.valueOf(z))));
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            tencentCaptchaFragment.show(supportFragmentManager, (String) null);
        }
    }

    public static final Unit gEmmrt(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt() {
        return Unit.INSTANCE;
    }
}
