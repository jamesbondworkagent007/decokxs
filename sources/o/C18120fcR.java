package o;

import android.graphics.Outline;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fcR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18120fcR extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fcQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18120fcR.AEQbTJ();
        }
    });
    public C16925etC EZpvd;

    public final C16925etC KWHzl() {
        C16925etC c16925etC = this.EZpvd;
        Intrinsics.copydefault(c16925etC);
        return c16925etC;
    }

    private final C43316rmw EZpvd() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AEQbTJ() {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(DefiOnboardingTile.TokenGroupTile.TokenInfo.class, new C18123fcU());
        return c43316rmw;
    }

    public final DefiOnboardingTile.TokenGroupTile.TokenInfo[] OLrzqt() {
        android.os.Bundle arguments = getArguments();
        android.os.Parcelable[] parcelableArray = arguments != null ? arguments.getParcelableArray("key.tokens") : null;
        DefiOnboardingTile.TokenGroupTile.TokenInfo[] tokenInfoArr = parcelableArray instanceof DefiOnboardingTile.TokenGroupTile.TokenInfo[] ? (DefiOnboardingTile.TokenGroupTile.TokenInfo[]) parcelableArray : null;
        return tokenInfoArr == null ? new DefiOnboardingTile.TokenGroupTile.TokenInfo[0] : tokenInfoArr;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl().KWHzl.setLayoutManager(new GridLayoutManager(getContext(), 4));
        KWHzl().KWHzl.setAdapter(EZpvd());
        C43316rmw c43316rmwEZpvd = EZpvd();
        c43316rmwEZpvd.setItems(yDV.AwvSrB(OLrzqt()));
        c43316rmwEZpvd.notifyDataSetChanged();
        android.widget.TextView textView = KWHzl().OLrzqt;
        java.lang.String string = requireContext().getString(C13754dXa.FragmentManager.IResultReceiver2_Parcel);
        Intrinsics.checkNotNullExpressionValue(string, "");
        textView.setText(C33069mpW.OLrzqt(string, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(OLrzqt().length)))));
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setOutlineProvider(new Activity());
        wxq.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: o.fcR$Activity */
    public static final class Activity extends android.view.ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16925etC c16925etCAEQbTJ = C16925etC.AEQbTJ(getCustomLayoutInflater(), constraintLayout, false);
        this.EZpvd = c16925etCAEQbTJ;
        Intrinsics.copydefault(c16925etCAEQbTJ);
        constraintLayout.addView(c16925etCAEQbTJ.getRoot(), new ConstraintLayout.LayoutParams(-1, -1));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.EZpvd = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.fcR$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fcR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C18120fcR EZpvd(@NotNull java.util.List<DefiOnboardingTile.TokenGroupTile.TokenInfo> list, @androidx.annotation.StringRes int i) {
            Intrinsics.checkNotNullParameter(list, "");
            return AEQbTJ(list);
        }

        public final C18120fcR AEQbTJ(@NotNull java.util.List<DefiOnboardingTile.TokenGroupTile.TokenInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C18120fcR c18120fcR = new C18120fcR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArray("key.tokens", (android.os.Parcelable[]) list.toArray(new DefiOnboardingTile.TokenGroupTile.TokenInfo[0]));
            c18120fcR.setArguments(bundle);
            return c18120fcR;
        }
    }
}
