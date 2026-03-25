package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.just.agentweb.DefaultWebClient;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.dapp.bean.DappChains;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14891dtx extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public Function0<Unit> KWHzl;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.9f;
    }

    /* JADX INFO: renamed from: o.dtx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dtx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.dtx$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C14891dtx newInstance$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                str4 = "";
            }
            java.lang.String str5 = str4;
            if ((i & 32) != 0) {
                function0 = null;
            }
            return activity.OLrzqt(str, str2, str3, z, str5, function0);
        }

        public final C14891dtx OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, java.lang.String str4, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C14891dtx c14891dtx = new C14891dtx();
            c14891dtx.KWHzl = function0;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(FirebaseAnalytics.Param.LEVEL, str);
            bundle.putString("url", str2);
            bundle.putString("rule", str3);
            bundle.putBoolean("showThirdTips", z);
            bundle.putString("source", str4);
            c14891dtx.setArguments(bundle);
            return c14891dtx;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String str;
        int i;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.LayoutInflater.from(getContext()).inflate(dLX.Fragment.AEQbTJ, (android.view.ViewGroup) constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        java.lang.String str2 = (arguments == null || (string4 = arguments.getString(FirebaseAnalytics.Param.LEVEL)) == null) ? "" : string4;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String str3 = (arguments2 == null || (string3 = arguments2.getString("url")) == null) ? "" : string3;
        android.os.Bundle arguments3 = getArguments();
        java.lang.String str4 = (arguments3 == null || (string2 = arguments3.getString("rule")) == null) ? "" : string2;
        android.os.Bundle arguments4 = getArguments();
        java.lang.String str5 = (arguments4 == null || (string = arguments4.getString("source")) == null) ? "" : string;
        C14742drG c14742drG = C14742drG.KWHzl;
        c14742drG.EZpvd(str3);
        c14742drG.copydefault();
        android.widget.TextView textView = (android.widget.TextView) constraintLayout.findViewById(dLX.Application.QfsBiF);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C59449zhJ.replace$default(C59449zhJ.replace$default(str3, DefaultWebClient.HTTPS_SCHEME, "", false, 4, (java.lang.Object) null), DefaultWebClient.HTTP_SCHEME, "", false, 4, (java.lang.Object) null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Object obj = str3;
        if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
            obj = objM7377constructorimpl;
        }
        java.lang.String str6 = (java.lang.String) obj;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) VerifyDAppDomainUrlResponse.LEVEL_EXTREMELY_HIGH)) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.DGOPHZDGOPHZ);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strAYXKKw);
            spannableStringBuilder.setSpan(new StateListAnimator(str5), 0, strAYXKKw.length(), 33);
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            textView.setText(C33069mpW.copydefault(contextRequireContext, dLX.Dialog.DGgnkA, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("link", new android.text.SpannableStringBuilder(str6)), C56390yDp.OLrzqt("case", spannableStringBuilder))));
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            str = str4;
            i = 0;
        } else {
            java.lang.String strCopydefault = C33069mpW.copydefault(this, dLX.Dialog.hCLrkq, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(RequestParameters.SUBRESOURCE_WEBSITE, str6)));
            android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
            str = str4;
            i = 0;
            spannableString.setSpan(new android.text.style.TextAppearanceSpan(getContext(), dLX.FragmentManager.copydefault), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, str6, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, str6, 0, false, 6, (java.lang.Object) null) + str6.length(), 17);
            textView.setText(spannableString);
        }
        android.widget.TextView textView2 = (android.widget.TextView) constraintLayout.findViewById(dLX.Application.RJOkX);
        android.os.Bundle arguments5 = getArguments();
        if (arguments5 != null && arguments5.getBoolean("showThirdTips") && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) VerifyDAppDomainUrlResponse.LEVEL_EXTREMELY_HIGH)) {
            textView2.setVisibility(i);
            textView2.setText(C33069mpW.copydefault(this, dLX.Dialog.RlQdEF, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("dappname", str6))));
        } else {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = (android.widget.TextView) constraintLayout.findViewById(dLX.Application.ejfBZ);
        if (C59449zhJ.gEmmrt(str, "blockaid", true)) {
            textView3.setVisibility(i);
        } else {
            textView3.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o.dtx$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.lang.String OLrzqt;

        public StateListAnimator(java.lang.String str) {
            this.OLrzqt = str;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setColor(ContextCompat.getColor(C14891dtx.this.requireContext(), C52761wXj.Activity.DeEinT));
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            FragmentActivity activity = C14891dtx.this.getActivity();
            if (activity != null) {
                java.lang.String str = this.OLrzqt;
                C14923duc c14923duc = C14923duc.EZpvd;
                c14923duc.AEQbTJ(activity, new PlatformItem(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, C33070mpX.AYXKKw(dLX.Dialog.getFieldNames), (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16127, (DefaultConstructorMarker) null), (20992 & 4) != 0 ? null : null, (20992 & 8) != 0 ? null : null, (Function0<Unit>) ((20992 & 16) != 0 ? null : null), (20992 & 32) != 0 ? false : false, (java.util.List<DappChains>) ((20992 & 64) != 0 ? c14923duc.isConnected() : null), (20992 & 128) != 0, (20992 & 256) != 0 ? false : false, (Function1<? super PlatformItem, Unit>) ((20992 & 512) != 0 ? null : null), (20992 & 1024) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : null, (20992 & 2048) != 0 ? "" : str, (Function1<? super androidx.fragment.app.Fragment, Unit>) ((20992 & 4096) != 0 ? null : null), (20992 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (20992 & 16384) != 0 ? null : null, (20992 & 32768) != 0 ? null : null);
            }
            C14891dtx.this.dismiss();
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString(FirebaseAnalytics.Param.LEVEL)) != null) {
            str = string;
        }
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(258);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) VerifyDAppDomainUrlResponse.LEVEL_EXTREMELY_HIGH)) {
            C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setText(dLX.Dialog.DBxZfM);
            }
            C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setOnClickListener(new View.OnClickListener() { // from class: o.dtw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C14891dtx.copydefault(this.copydefault, view);
                    }
                });
                return;
            }
            return;
        }
        wyf.setType(7);
        C52794wYp c52794wYpCopydefault4 = wyf.copydefault();
        if (c52794wYpCopydefault4 != null) {
            c52794wYpCopydefault4.setText(dLX.Dialog.DGUQLI);
        }
        C52794wYp c52794wYpCopydefault5 = wyf.copydefault();
        if (c52794wYpCopydefault5 != null) {
            c52794wYpCopydefault5.setOnClickListener(new View.OnClickListener() { // from class: o.dtu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C14891dtx.KWHzl(this.OLrzqt, view);
                }
            });
        }
        wyf.setSecondaryText(getString(dLX.Dialog.DNMMPQ));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.dty
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C14891dtx.valueOf(this.KWHzl, view);
                }
            });
        }
    }

    public static final void copydefault(C14891dtx c14891dtx, android.view.View view) {
        c14891dtx.dismissAllowingStateLoss();
        Function0<Unit> function0 = c14891dtx.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void KWHzl(C14891dtx c14891dtx, android.view.View view) {
        c14891dtx.dismissAllowingStateLoss();
        Function0<Unit> function0 = c14891dtx.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void valueOf(C14891dtx c14891dtx, android.view.View view) {
        c14891dtx.dismissAllowingStateLoss();
    }
}
