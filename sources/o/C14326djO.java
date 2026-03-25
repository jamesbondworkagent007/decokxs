package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.just.agentweb.DefaultWebClient;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C14326djO;
import o.C52761wXj;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.djO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14326djO extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public Function0<Unit> AEQbTJ;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.9f;
    }

    /* JADX INFO: renamed from: o.djO$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.djO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.djO$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C14326djO newInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function0 = null;
            }
            return actionBar.KWHzl(str, str2, str3, function0);
        }

        public final C14326djO KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C14326djO c14326djO = new C14326djO();
            c14326djO.AEQbTJ = function0;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(FirebaseAnalytics.Param.LEVEL, str);
            bundle.putString("url", str2);
            bundle.putString("rule", str3);
            c14326djO.setArguments(bundle);
            return c14326djO;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.djR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C14326djO.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(C14326djO c14326djO) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c14326djO, true, (java.lang.String) null, 2, (java.lang.Object) null);
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String string;
        java.lang.String str;
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.LayoutInflater.from(getContext()).inflate(C13754dXa.TaskDescription.dvImUD, (android.view.ViewGroup) constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(FirebaseAnalytics.Param.LEVEL)) == null) {
            string = "";
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            java.lang.String string2 = arguments2.getString("url");
            str = string2;
            if (string2 == null) {
                str = "";
            }
        }
        C14496dmZ.OLrzqt.OLrzqt(str);
        android.widget.TextView textView = (android.widget.TextView) constraintLayout.findViewById(C13754dXa.ActionBar.GGlJim);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C59449zhJ.replace$default(C59449zhJ.replace$default(str, DefaultWebClient.HTTPS_SCHEME, "", false, 4, (java.lang.Object) null), DefaultWebClient.HTTP_SCHEME, "", false, 4, (java.lang.Object) null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Object obj = str;
        if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
            obj = objM7377constructorimpl;
        }
        java.lang.String str2 = (java.lang.String) obj;
        if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) VerifyDAppDomainUrlResponse.LEVEL_EXTREMELY_HIGH)) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.containsKey);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strAYXKKw);
            spannableStringBuilder.setSpan(new Activity(), 0, strAYXKKw.length(), 33);
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            textView.setText(C33069mpW.copydefault(contextRequireContext, C13754dXa.FragmentManager.getBundle, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("link", new android.text.SpannableStringBuilder(str2)), C56390yDp.OLrzqt("case", spannableStringBuilder))));
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            return;
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(this, C13754dXa.FragmentManager.getBitmap, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(RequestParameters.SUBRESOURCE_WEBSITE, str2)));
        android.text.SpannableString spannableString = new android.text.SpannableString(strCopydefault);
        spannableString.setSpan(new android.text.style.TextAppearanceSpan(getContext(), C13754dXa.LoaderManager.fARcdN), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, str2, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, str2, 0, false, 6, (java.lang.Object) null) + str2.length(), 17);
        textView.setText(spannableString);
    }

    /* JADX INFO: renamed from: o.djO$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public Activity() {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setColor(ContextCompat.getColor(C14326djO.this.requireContext(), C52761wXj.Activity.DeEinT));
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            FragmentActivity activity = C14326djO.this.getActivity();
            if (activity != null) {
                InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, C33070mpX.AYXKKw(C13754dXa.FragmentManager.hBpjJd), null, new Function1() { // from class: o.djV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14326djO.Activity.OLrzqt((AbstractC43238rlX) obj);
                    }
                }, 4, null);
            }
            C14326djO.this.dismiss();
        }

        public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
            return Unit.INSTANCE;
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
            c52794wYpCopydefault.setOKDSType(260);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) VerifyDAppDomainUrlResponse.LEVEL_EXTREMELY_HIGH)) {
            C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setText(C13754dXa.FragmentManager.fromMediaMetadata);
            }
            C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setOnClickListener(new View.OnClickListener() { // from class: o.djQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C14326djO.EZpvd(this.EZpvd, view);
                    }
                });
                return;
            }
            return;
        }
        wyf.setType(7);
        C52794wYp c52794wYpCopydefault4 = wyf.copydefault();
        if (c52794wYpCopydefault4 != null) {
            c52794wYpCopydefault4.setText(C13754dXa.FragmentManager.getLong);
        }
        C52794wYp c52794wYpCopydefault5 = wyf.copydefault();
        if (c52794wYpCopydefault5 != null) {
            c52794wYpCopydefault5.setOnClickListener(new View.OnClickListener() { // from class: o.djS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C14326djO.KWHzl(this.OLrzqt, view);
                }
            });
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setText(C13754dXa.FragmentManager.fromMediaMetadata);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.djP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C14326djO.AhwBna(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void EZpvd(C14326djO c14326djO, android.view.View view) {
        c14326djO.dismissAllowingStateLoss();
        Function0<Unit> function0 = c14326djO.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void KWHzl(C14326djO c14326djO, android.view.View view) {
        c14326djO.dismissAllowingStateLoss();
        Function0<Unit> function0 = c14326djO.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void AhwBna(C14326djO c14326djO, android.view.View view) {
        c14326djO.dismissAllowingStateLoss();
    }
}
