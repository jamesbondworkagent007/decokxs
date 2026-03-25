package com.okinc.captcha.impl.recaptcha;

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
import com.google.android.exoplayer2.C;
import com.okinc.captcha.impl.recaptcha.RecaptchaFragment;
import com.okinc.captcha.impl.tencent.TencentCaptchaFragment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C32995moB;
import o.C52761wXj;
import o.C56390yDp;
import o.C59449zhJ;
import o.lWD;
import o.yFA;
import o.yFK;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class RecaptchaFragment extends C32995moB {
    public static final Application Companion = new Application(null);
    public static Function1<? super String, Unit> OLrzqt = new Function1() { // from class: o.lVK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return RecaptchaFragment.EZpvd((java.lang.String) obj);
        }
    };
    public static Function0<Unit> AEQbTJ = new Function0() { // from class: o.lVL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return RecaptchaFragment.values();
        }
    };
    public static Function0<Unit> EZpvd = new Function0() { // from class: o.lVM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return RecaptchaFragment.fetchVPNInfo();
        }
    };
    public static Function0<Unit> KWHzl = new Function0() { // from class: o.lVO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return RecaptchaFragment.DbNXlk();
        }
    };

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fFgQHt);
        frameLayout.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        try {
            WebView webViewOLrzqt = lWD.OLrzqt(this);
            webViewOLrzqt.addJavascriptInterface(new Callback(new WeakReference(this)), "jsBridge");
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("EXTRA_SITE_KEY") : null;
            if (string == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Bundle arguments2 = getArguments();
            String string2 = arguments2 != null ? arguments2.getString("EXTRA_ACTION") : null;
            if (string2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Bundle arguments3 = getArguments();
            Boolean boolValueOf = arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("EXTRA_IS_VISUAL", false)) : null;
            if (boolValueOf == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            boolean zBooleanValue = boolValueOf.booleanValue();
            Bundle arguments4 = getArguments();
            Boolean boolValueOf2 = arguments4 != null ? Boolean.valueOf(arguments4.getBoolean("EXTRA_IS_DARK_MODE", false)) : null;
            if (boolValueOf2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String str = boolValueOf2.booleanValue() ? "dark" : "light";
            String str2 = !zBooleanValue ? string : "explicit";
            InputStream inputStreamOpen = requireContext().getAssets().open("recaptcha.html");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                yFA.copydefault(bufferedReader, null);
                webViewOLrzqt.loadDataWithBaseURL("https://www.okx.com?siteKey=" + string + "&theme=" + str + "&isVisual=" + zBooleanValue + "&action=" + string2, C59449zhJ.replace$default(strAEQbTJ, "__RENDER__", str2, false, 4, (Object) null), "text/html", C.UTF8_NAME, null);
                frameLayout.addView(webViewOLrzqt);
                return frameLayout;
            } finally {
            }
        } catch (Exception e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", -13099);
            jSONObject.put("errorMessage", e.getMessage());
            Function1<String, Unit> function1Copydefault = TencentCaptchaFragment.Companion.copydefault();
            String string3 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "");
            function1Copydefault.invoke(string3);
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
            KWHzl(new Function1() { // from class: o.lVS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return RecaptchaFragment.Callback.AhwBna((C32995moB) obj);
                }
            });
        }

        public static final Unit AhwBna(C32995moB c32995moB) {
            Intrinsics.checkNotNullParameter(c32995moB, "");
            RecaptchaFragment.Companion.KWHzl().invoke();
            return Unit.INSTANCE;
        }

        @JavascriptInterface
        public final void onSuccess(@NotNull final String str) {
            Intrinsics.checkNotNullParameter(str, "");
            KWHzl(new Function1() { // from class: o.lVR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return RecaptchaFragment.Callback.EZpvd(str, (C32995moB) obj);
                }
            });
        }

        public static final Unit EZpvd(String str, C32995moB c32995moB) {
            Intrinsics.checkNotNullParameter(c32995moB, "");
            RecaptchaFragment.Companion.copydefault().invoke(str);
            c32995moB.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }

        @JavascriptInterface
        public final void onError() {
            KWHzl(new Function1() { // from class: o.lVZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return RecaptchaFragment.Callback.EZpvd((C32995moB) obj);
                }
            });
        }

        public static final Unit EZpvd(C32995moB c32995moB) {
            Intrinsics.checkNotNullParameter(c32995moB, "");
            RecaptchaFragment.Companion.EZpvd().invoke();
            c32995moB.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }

        @JavascriptInterface
        public final void onExpire() {
            KWHzl(new Function1() { // from class: o.lVT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return RecaptchaFragment.Callback.OLrzqt((C32995moB) obj);
                }
            });
        }

        public static final Unit OLrzqt(C32995moB c32995moB) {
            Intrinsics.checkNotNullParameter(c32995moB, "");
            RecaptchaFragment.Companion.OLrzqt().invoke();
            c32995moB.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }

        public final void KWHzl(Function1<? super C32995moB, Unit> function1) {
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
        EZpvd.invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        OLrzqt = new Function1() { // from class: o.lVP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecaptchaFragment.KWHzl((java.lang.String) obj);
            }
        };
        AEQbTJ = new Function0() { // from class: o.lVN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecaptchaFragment.ejfBZ();
            }
        };
        EZpvd = new Function0() { // from class: o.lVU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecaptchaFragment.isConnected();
            }
        };
        KWHzl = new Function0() { // from class: o.lVQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecaptchaFragment.AkhnZx();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ejfBZ() {
        return Unit.INSTANCE;
    }

    public static final Unit isConnected() {
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx() {
        return Unit.INSTANCE;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.captcha.impl.recaptcha.RecaptchaFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final Function1<String, Unit> copydefault() {
            return RecaptchaFragment.OLrzqt;
        }

        public final void copydefault(@NotNull Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            RecaptchaFragment.OLrzqt = function1;
        }

        public final Function0<Unit> EZpvd() {
            return RecaptchaFragment.AEQbTJ;
        }

        public final void OLrzqt(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            RecaptchaFragment.AEQbTJ = function0;
        }

        public final Function0<Unit> OLrzqt() {
            return RecaptchaFragment.EZpvd;
        }

        public final void copydefault(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            RecaptchaFragment.EZpvd = function0;
        }

        public final void AEQbTJ(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            RecaptchaFragment.KWHzl = function0;
        }

        public final Function0<Unit> KWHzl() {
            return RecaptchaFragment.KWHzl;
        }

        public final void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull String str, boolean z, @NotNull String str2, boolean z2, @NotNull Function1<? super String, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function03, "");
            Application application = RecaptchaFragment.Companion;
            application.copydefault(function1);
            application.OLrzqt(function0);
            application.copydefault(function02);
            application.AEQbTJ(function03);
            RecaptchaFragment recaptchaFragment = new RecaptchaFragment();
            recaptchaFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("EXTRA_SITE_KEY", str2), C56390yDp.OLrzqt("EXTRA_ACTION", str), C56390yDp.OLrzqt("EXTRA_IS_DARK_MODE", Boolean.valueOf(z2)), C56390yDp.OLrzqt("EXTRA_IS_VISUAL", Boolean.valueOf(z))));
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            recaptchaFragment.show(supportFragmentManager, (String) null);
        }
    }

    public static final Unit EZpvd(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit values() {
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo() {
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk() {
        return Unit.INSTANCE;
    }
}
