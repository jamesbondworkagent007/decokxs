package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.defi.wallet.mine.checkversion.ui.WalletTermsUpdateBottomSheet$onFeedbackCreated$1$4$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18813fpW extends AbstractC52779wYa {
    public static final Activity Companion = new Activity(null);

    @Override // o.AbstractC52779wYa, o.wXX
    public float getHeightScale() {
        return 0.0f;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    /* JADX INFO: renamed from: o.fpW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fpW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C18813fpW copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C18813fpW c18813fpW = new C18813fpW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("arg_new_terms_version", str);
            c18813fpW.setArguments(bundle);
            return c18813fpW;
        }
    }

    public final java.lang.String OLrzqt() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("arg_new_terms_version") : null;
        return string == null ? "" : string;
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
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(false);
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(0);
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), 0, constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        C13912dbY.copydefault.copydefault(OLrzqt());
        C32866mlf.onEvent$default("Web3HomePage_Popup_TermsUpdate_View", (TrackChannel[]) null, new Function1() { // from class: o.fqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18813fpW.copydefault(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(C18813fpW c18813fpW, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terms_version", c18813fpW.OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC52779wYa
    public void OLrzqt(@NotNull C54956xap c54956xap) {
        Intrinsics.checkNotNullParameter(c54956xap, "");
        ViewGroup.LayoutParams layoutParams = c54956xap.OLrzqt.getLayoutParams();
        layoutParams.width = C55298xhM.dp2px$default(40.0f, null, 1, null);
        layoutParams.height = C55298xhM.dp2px$default(40.0f, null, 1, null);
        c54956xap.OLrzqt.setLayoutParams(layoutParams);
        c54956xap.OLrzqt.setImageResource(C13754dXa.Activity.DCJXGO);
        AppCompatImageView appCompatImageView = c54956xap.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            android.content.Context context = getContext();
            if (context != null) {
                marginLayoutParams.topMargin = C55298xhM.copydefault(52.0f, context);
            }
            appCompatImageView.setLayoutParams(marginLayoutParams);
            c54956xap.valueOf.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getButton));
            c54956xap.valueOf.setGravity(1);
            c54956xap.valueOf.setTextSize(20.0f);
            c54956xap.valueOf.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.svhCHd));
            AppCompatTextView appCompatTextView = c54956xap.valueOf;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
            if (layoutParams3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                android.content.Context context2 = getContext();
                if (context2 != null) {
                    marginLayoutParams2.topMargin = C55298xhM.copydefault(12.0f, context2);
                }
                appCompatTextView.setLayoutParams(marginLayoutParams2);
                AppCompatTextView appCompatTextView2 = c54956xap.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                EZpvd(appCompatTextView2, C13754dXa.FragmentManager.getIconAttributeResId, "tos", C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaCompanionExternalSyntheticApiModelOutline0), new Function0() { // from class: o.fpV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C18813fpW.OLrzqt(this.EZpvd);
                    }
                });
                AppCompatTextView appCompatTextView3 = c54956xap.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
                EZpvd(appCompatTextView3, C13754dXa.FragmentManager.installContent, "faq", C33070mpX.AYXKKw(C13754dXa.FragmentManager.getListView), new Function0() { // from class: o.fpY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C18813fpW.copydefault(this.KWHzl);
                    }
                });
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final Unit OLrzqt(C18813fpW c18813fpW) {
        c18813fpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.PickVisualMediaRequest));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C18813fpW c18813fpW) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c18813fpW), null, null, new WalletTermsUpdateBottomSheet$onFeedbackCreated$1$4$1(c18813fpW, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.widget.TextView textView, int i, java.lang.String str, java.lang.String str2, final Function0<Unit> function0) {
        textView.setTextSize(14.0f);
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.v));
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(str, str2)));
        final int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fcfzuX);
        textView.setText(C33061mpO.setupSpanStyles$default(strCopydefault, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.fqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18813fpW.OLrzqt(iCopydefault, (java.util.List) obj);
            }
        }, 14, null));
        textView.setOnTouchListener(new ViewOnTouchListenerC14460dlq(textView, strCopydefault, str2, new Function0() { // from class: o.fqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18813fpW.KWHzl(function0);
            }
        }));
    }

    public static final Unit OLrzqt(int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fpW$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C18813fpW OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C18813fpW c18813fpW) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c18813fpW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    public static final Unit KWHzl(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPaddingRelative(wyf.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), wyf.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.fZBcTu));
        wyf.setPrimaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendEvent));
        wyf.setOnClickListener(new ActionBar(wyf, 1000L, this));
    }

    private final void OLrzqt(java.lang.String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
            dismissAllowingStateLoss();
        }
    }
}
