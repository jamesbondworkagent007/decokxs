package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentKt;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.market.features.position.ui.PositionDetailsParam;
import com.okinc.unify_trade.biz.BotWebHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gRm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19846gRm extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.gRl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19846gRm.copydefault(this.KWHzl);
        }
    });

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    private final PositionDetailsParam KWHzl() {
        return (PositionDetailsParam) this.AEQbTJ.getValue();
    }

    public static final PositionDetailsParam copydefault(C19846gRm c19846gRm) {
        android.os.Bundle arguments = c19846gRm.getArguments();
        if (arguments != null) {
            return (PositionDetailsParam) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.position_details", PositionDetailsParam.class));
        }
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.valueOf().setPaddingRelative(C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(4.0f, null, 1, null));
        android.content.Context context = getContext();
        java.lang.String string = context != null ? context.getString(C23274hvD.Fragment.DQYQgr) : null;
        wxq.setTitle(string != null ? string : "");
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        if (constraintLayout.getId() == -1) {
            constraintLayout.setId(android.view.View.generateViewId());
        }
        getChildFragmentManager().beginTransaction().replace(constraintLayout.getId(), C29101knL.Companion.copydefault(KWHzl()), "tag.position_header_fragment").commitAllowingStateLoss();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSSize(52);
            c52794wYpCopydefault.setText(c52794wYpCopydefault.getContext().getString(C23274hvD.Fragment.rememberLauncherForActivityResult));
            C25352ivB.setOnDoubleCheckClickListener$default(c52794wYpCopydefault, 0L, new Function1() { // from class: o.gRp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19846gRm.copydefault(this.OLrzqt, (android.view.View) obj);
                }
            }, 1, null);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
            c52794wYpAEQbTJ.setOKDSSize(52);
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c52794wYpAEQbTJ.getContext(), C52761wXj.TaskDescription.zEkrwr);
            if (drawable != null) {
                DrawableCompat.setTintList(drawable, c52794wYpAEQbTJ.getTextColors());
                android.content.Context context = c52794wYpAEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iOLrzqt = C55298xhM.OLrzqt(16, context);
                android.content.Context context2 = c52794wYpAEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context2));
            } else {
                drawable = null;
            }
            android.content.Context context3 = c52794wYpAEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c52794wYpAEQbTJ.setCompoundDrawablePadding(C55298xhM.OLrzqt(8, context3));
            c52794wYpAEQbTJ.setCompoundDrawablesRelative(drawable, null, null, null);
            c52794wYpAEQbTJ.setText(c52794wYpAEQbTJ.getContext().getString(C23274hvD.Fragment.onSaveInstanceState));
            C25352ivB.setOnDoubleCheckClickListener$default(c52794wYpAEQbTJ, 0L, new Function1() { // from class: o.gRt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19846gRm.EZpvd(this.KWHzl, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit copydefault(C19846gRm c19846gRm, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(BotWebHook.KEY_ACTION, ExtJson.BRC20TYPE_TRADE);
        Unit unit = Unit.INSTANCE;
        FragmentKt.setFragmentResult(c19846gRm, "position_header_request", bundle);
        c19846gRm.dismissAllowingStateLoss();
        return unit;
    }

    public static final Unit EZpvd(C19846gRm c19846gRm, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(BotWebHook.KEY_ACTION, "share");
        Unit unit = Unit.INSTANCE;
        FragmentKt.setFragmentResult(c19846gRm, "position_header_request", bundle);
        c19846gRm.dismissAllowingStateLoss();
        return unit;
    }

    /* JADX INFO: renamed from: o.gRm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gRm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C19846gRm OLrzqt(@NotNull PositionDetailsParam positionDetailsParam) {
            Intrinsics.checkNotNullParameter(positionDetailsParam, "");
            C19846gRm c19846gRm = new C19846gRm();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.position_details", positionDetailsParam);
            c19846gRm.setArguments(bundle);
            return c19846gRm;
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull PositionDetailsParam positionDetailsParam) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(positionDetailsParam, "");
            OLrzqt(positionDetailsParam).show(fragmentManager, "PositionHeaderBottomSheet");
        }
    }
}
