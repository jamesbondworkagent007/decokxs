package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eyr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17231eyr extends AbstractC52785wYg {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public Function0<Unit> EZpvd;
    public Function0<Unit> copydefault;

    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return false;
    }

    /* JADX INFO: renamed from: o.eyr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eyr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, WalletType walletType, boolean z, @NotNull Function0<Unit> function0, Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C17235eyv c17235eyv = new C17235eyv(C15538eMa.OLrzqt.EZpvd(context), z);
            KWHzl(c17235eyv.AEQbTJ(walletType), c17235eyv.EZpvd(walletType), c17235eyv.KWHzl(walletType), c17235eyv.copydefault(walletType), c17235eyv.OLrzqt(walletType), function0, function02).show(fragmentManager);
        }

        public final C17231eyr KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, @NotNull Function0<Unit> function0, Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C17231eyr c17231eyr = new C17231eyr();
            c17231eyr.EZpvd = function0;
            c17231eyr.copydefault = function02;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", str);
            if (str2 != null) {
                bundle.putString("description", str2);
            }
            if (str3 != null) {
                bundle.putString("positive_button_text", str3);
            }
            if (str4 != null) {
                bundle.putString("negative_button_text", str4);
            }
            bundle.putBoolean("hide_negative_button", z);
            c17231eyr.setArguments(bundle);
            return c17231eyr;
        }
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        Intrinsics.checkNotNullParameter(c54954xan, "");
        AppCompatImageView appCompatImageView = c54954xan.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14677dpv.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.DeleteWalletConfirm);
        ViewGroup.LayoutParams layoutParams = c54954xan.KWHzl.getLayoutParams();
        layoutParams.width = C55298xhM.dp2px$default(168.0f, null, 1, null);
        layoutParams.height = C55298xhM.dp2px$default(168.0f, null, 1, null);
        c54954xan.KWHzl.setLayoutParams(layoutParams);
        c54954xan.getRoot().getRootView().setBackgroundColor(ContextCompat.getColor(c54954xan.OLrzqt.getContext(), C52761wXj.Activity.djBIcL));
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            c54954xan.AEQbTJ.setText(arguments.getString("title"));
            java.lang.String string = arguments.getString("description");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                c54954xan.OLrzqt.setText(string);
                c54954xan.OLrzqt.setGravity(17);
                c54954xan.OLrzqt.setBreakStrategy(0);
            } else {
                AppCompatTextView appCompatTextView = c54954xan.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                appCompatTextView.setVisibility(8);
            }
        }
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        wyf.setOKDSSize(52);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(262);
        }
        android.content.Context context = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(24, context);
        android.content.Context context2 = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt2 = C55298xhM.OLrzqt(12, context2);
        android.content.Context context3 = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iOLrzqt3 = C55298xhM.OLrzqt(24, context3);
        android.content.Context context4 = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        wyf.setPaddingRelative(iOLrzqt, iOLrzqt2, iOLrzqt3, C55298xhM.OLrzqt(20, context4));
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.eyt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C17231eyr.EZpvd(this.OLrzqt, view);
                }
            });
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.lang.String string = arguments.getString("positive_button_text");
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                string = C33070mpX.AYXKKw(C13754dXa.FragmentManager.zzJhsT);
            }
            wyf.setPrimaryText(string);
            boolean z = arguments.getBoolean("hide_negative_button");
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(z ^ true ? 0 : 8);
            }
            if (z) {
                return;
            }
            C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setVisibility(0);
            }
            java.lang.String string2 = arguments.getString("negative_button_text");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) string2)) {
                wyf.setSecondaryText(string2);
            }
            C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ3 != null) {
                c52794wYpAEQbTJ3.setOnClickListener(new View.OnClickListener() { // from class: o.eys
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C17231eyr.OLrzqt(this.OLrzqt, view);
                    }
                });
            }
        }
    }

    public static final void EZpvd(C17231eyr c17231eyr, android.view.View view) {
        c17231eyr.dismissAllowingStateLoss();
        Function0<Unit> function0 = c17231eyr.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void OLrzqt(C17231eyr c17231eyr, android.view.View view) {
        c17231eyr.dismissAllowingStateLoss();
        Function0<Unit> function0 = c17231eyr.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
