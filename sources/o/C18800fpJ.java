package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18800fpJ extends AbstractC52779wYa {
    public Function0<Unit> OLrzqt;

    @Override // o.AbstractC52779wYa, o.wXX
    public float getHeightScale() {
        return 0.0f;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52779wYa
    public void OLrzqt(@NotNull C54956xap c54956xap) {
        Intrinsics.checkNotNullParameter(c54956xap, "");
        c54956xap.getRoot().getRootView().setBackgroundColor(ContextCompat.getColor(c54956xap.getRoot().getContext(), C52761wXj.Activity.djBIcL));
        ViewGroup.LayoutParams layoutParams = c54956xap.OLrzqt.getLayoutParams();
        layoutParams.width = C55298xhM.dp2px$default(168.0f, null, 1, null);
        layoutParams.height = C55298xhM.dp2px$default(168.0f, null, 1, null);
        c54956xap.OLrzqt.setLayoutParams(layoutParams);
        AppCompatImageView appCompatImageView = c54956xap.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14677dpv.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.ICloudBackUp);
        AppCompatImageView appCompatImageView2 = c54956xap.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        ViewGroup.LayoutParams layoutParams2 = appCompatImageView2.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            android.content.Context context = getContext();
            if (context != null) {
                marginLayoutParams.topMargin = C55298xhM.copydefault(42.0f, context);
            }
            appCompatImageView2.setLayoutParams(marginLayoutParams);
            c54956xap.valueOf.setText(getString(C13754dXa.FragmentManager.postOrRun));
            c54956xap.valueOf.setGravity(1);
            c54956xap.valueOf.setTextSize(28.0f);
            AppCompatTextView appCompatTextView = c54956xap.valueOf;
            android.content.Context context2 = getContext();
            if (context2 == null) {
                return;
            }
            appCompatTextView.setTextColor(ContextCompat.getColor(context2, C52761wXj.Activity.fdOvFl));
            c54956xap.KWHzl.setText(getString(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplApi216));
            c54956xap.KWHzl.setTextSize(14.0f);
            AppCompatTextView appCompatTextView2 = c54956xap.KWHzl;
            android.content.Context context3 = getContext();
            if (context3 == null) {
                return;
            }
            appCompatTextView2.setTextColor(ContextCompat.getColor(context3, C52761wXj.Activity.QwvEab));
            ViewGroup.LayoutParams layoutParams3 = c54956xap.KWHzl.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int iDp2px$default = C55298xhM.dp2px$default(24.0f, null, 1, null);
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = iDp2px$default;
            }
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = iDp2px$default;
            }
            c54956xap.KWHzl.setLayoutParams(marginLayoutParams2);
            AppCompatTextView appCompatTextView3 = c54956xap.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            OLrzqt(appCompatTextView3);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(getString(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplApi213));
        wyf.setOnClickListener(new Application(wyf, 1000L, this));
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
        show(fragmentManager);
    }

    public final void OLrzqt(final AppCompatTextView appCompatTextView) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBase2);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBase3);
        java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.forceCloseConnection, C56424yEw.gEmmrt(C56390yDp.OLrzqt("seedphrase", strAYXKKw), C56390yDp.OLrzqt("privatekey", strAYXKKw2)));
        final int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAYXKKw, 0, false, 6, (java.lang.Object) null);
        final int length = iIndexOf$default + strAYXKKw.length();
        final int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAYXKKw2, 0, false, 6, (java.lang.Object) null);
        final int length2 = iIndexOf$default2 + strAYXKKw2.length();
        appCompatTextView.setOnTouchListener(new ViewOnTouchListenerC14463dlt(appCompatTextView, new Function1() { // from class: o.fpL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18800fpJ.EZpvd(iIndexOf$default, length, this, appCompatTextView, iIndexOf$default2, length2, ((java.lang.Integer) obj).intValue());
            }
        }));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strCopydefault);
        if (iIndexOf$default >= 0) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), iIndexOf$default, length, 33);
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), iIndexOf$default, length, 33);
        }
        if (iIndexOf$default2 >= 0) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), iIndexOf$default2, length2, 33);
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), iIndexOf$default2, length2, 33);
        }
        appCompatTextView.setText(spannableStringBuilder);
        appCompatTextView.setTextSize(14.0f);
    }

    public static final Unit EZpvd(int i, int i2, C18800fpJ c18800fpJ, AppCompatTextView appCompatTextView, int i3, int i4, int i5) {
        if (i <= i5 && i5 <= i2) {
            C32866mlf.onEvent$default("app_web3_wallet_backup_seedphraseinfo_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            java.lang.String string = c18800fpJ.getString(C13754dXa.FragmentManager.invokeSuspend);
            Intrinsics.checkNotNullExpressionValue(string, "");
            android.content.Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c18800fpJ.AEQbTJ(string, context);
        } else if (i3 <= i5 && i5 <= i4) {
            C32866mlf.onEvent$default("app_web3_wallet_backup_privatekeyinfo_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            java.lang.String string2 = c18800fpJ.getString(C13754dXa.FragmentManager.DXd);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            android.content.Context context2 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c18800fpJ.AEQbTJ(string2, context2);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str, android.content.Context context) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    /* JADX INFO: renamed from: o.fpJ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C18800fpJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C18800fpJ c18800fpJ) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c18800fpJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0 function0 = this.copydefault.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
