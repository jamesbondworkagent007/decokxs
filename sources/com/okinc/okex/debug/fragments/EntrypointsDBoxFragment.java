package com.okinc.okex.debug.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.okapm.okqpl.util.QPLConstants;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.debug.adapter.EntrypointListAdapter;
import com.okinc.okex.debug.fragments.EntrypointsDBoxFragment;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC45420spU;
import o.AbstractC47366tog;
import o.ActivityC45850szP;
import o.C43251rlk;
import o.C44962sgn;
import o.C45300snG;
import o.C47315tni;
import o.C55001xbh;
import o.C55008xbo;
import o.C56390yDp;
import o.C6807aWO;
import o.InterfaceC6804aWL;
import o.ViewOnClickListenerC54939xaY;
import o.rVN;
import o.sAV;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class EntrypointsDBoxFragment extends AbstractC45420spU {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final String AEQbTJ = "Entrypoints";
    public final int KWHzl = C47315tni.ActionBar.zsXlph;
    public AbstractC47366tog OLrzqt;

    @yCM
    public C45300snG csRegistry;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC45451spz
    public String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Possible override for method o.spU.KWHzl()V */
    public final C45300snG KWHzl() {
        C45300snG c45300snG = this.csRegistry;
        if (c45300snG != null) {
            return c45300snG;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.debug.fragments.EntrypointsDBoxFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final EntrypointsDBoxFragment OLrzqt() {
            return new EntrypointsDBoxFragment();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47366tog abstractC47366togOLrzqt = AbstractC47366tog.OLrzqt(layoutInflater, viewGroup, false);
        this.OLrzqt = abstractC47366togOLrzqt;
        if (abstractC47366togOLrzqt == null) {
            Intrinsics.gEmmrt("");
            abstractC47366togOLrzqt = null;
        }
        View root = abstractC47366togOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        EntrypointListAdapter entrypointListAdapter = new EntrypointListAdapter();
        AbstractC47366tog abstractC47366tog = this.OLrzqt;
        if (abstractC47366tog == null) {
            Intrinsics.gEmmrt("");
            abstractC47366tog = null;
        }
        abstractC47366tog.KWHzl.setAdapter(entrypointListAdapter);
        entrypointListAdapter.AEQbTJ(AEQbTJ());
        view.post(new Runnable() { // from class: o.spS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                EntrypointsDBoxFragment.OLrzqt(this.copydefault);
            }
        });
    }

    public static final void OLrzqt(EntrypointsDBoxFragment entrypointsDBoxFragment) {
        rVN.reportFullyDrawn$default((Fragment) entrypointsDBoxFragment, true, (String) null, 2, (Object) null);
    }

    public final List<EntrypointListAdapter.StateListAnimator> AEQbTJ() {
        Context context = getContext();
        List<EntrypointListAdapter.StateListAnimator> listDjBIcL = context != null ? CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.djBIcL((Collection) KWHzl(context), (Iterable) AEQbTJ(context)), (Iterable) OLrzqt(context)) : null;
        return listDjBIcL == null ? yDY.AhwBna() : listDjBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [75=4] */
    public final List<EntrypointListAdapter.StateListAnimator> KWHzl(final Context context) {
        return yDY.gEmmrt(new EntrypointListAdapter.StateListAnimator.ActionBar("Landing Pages"), new EntrypointListAdapter.StateListAnimator.Activity("Help Center v2", new Function0() { // from class: o.spK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return EntrypointsDBoxFragment.AEQbTJ(context, this);
            }
        }), new EntrypointListAdapter.StateListAnimator.Activity("Mini Support v2", new Function0() { // from class: o.spT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return EntrypointsDBoxFragment.KWHzl(context, this);
            }
        }), new EntrypointListAdapter.StateListAnimator.Activity("Support Announcements", new Function0() { // from class: o.spP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return EntrypointsDBoxFragment.djBIcL(context, this);
            }
        }));
    }

    public static final Unit AEQbTJ(Context context, EntrypointsDBoxFragment entrypointsDBoxFragment) {
        entrypointsDBoxFragment.startActivity(((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class)).EZpvd(context, new C6807aWO(null, null, null, QPLConstants.ENV_DEBUG, null, null, 48, null)));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Context context, EntrypointsDBoxFragment entrypointsDBoxFragment) {
        entrypointsDBoxFragment.startActivity(C44962sgn.KWHzl.KWHzl(context, (26 & 2) != 0 ? null : null, (26 & 4) != 0 ? null : null, (26 & 8) != 0 ? null : null, (26 & 16) != 0 ? null : "1", IntegratedSolutionPageType.MiniSupport));
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(Context context, EntrypointsDBoxFragment entrypointsDBoxFragment) {
        entrypointsDBoxFragment.startActivity(sAV.Companion.EZpvd(context, QPLConstants.ENV_DEBUG));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [107=4] */
    public final List<EntrypointListAdapter.StateListAnimator> AEQbTJ(final Context context) {
        return yDY.gEmmrt(new EntrypointListAdapter.StateListAnimator.ActionBar("Feedback"), new EntrypointListAdapter.StateListAnimator.Activity("Error Log Upload", new Function0() { // from class: o.spF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return EntrypointsDBoxFragment.EZpvd(this.OLrzqt, context);
            }
        }), new EntrypointListAdapter.StateListAnimator.Activity("Feedback & Bug Bounty", new Function0() { // from class: o.spO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return EntrypointsDBoxFragment.copydefault(this.copydefault, context);
            }
        }), new EntrypointListAdapter.StateListAnimator.Activity("Security Report", new Function0() { // from class: o.spM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return EntrypointsDBoxFragment.AYXKKw(this.KWHzl, context);
            }
        }));
    }

    public static final Unit EZpvd(EntrypointsDBoxFragment entrypointsDBoxFragment, Context context) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(entrypointsDBoxFragment), null, null, new EntrypointsDBoxFragment$buildFeedbackEntryPoints$1$1(entrypointsDBoxFragment, context, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EntrypointsDBoxFragment entrypointsDBoxFragment, Context context) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(entrypointsDBoxFragment), null, null, new EntrypointsDBoxFragment$buildFeedbackEntryPoints$2$1(entrypointsDBoxFragment, context, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EntrypointsDBoxFragment entrypointsDBoxFragment, Context context) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(entrypointsDBoxFragment), null, null, new EntrypointsDBoxFragment$buildFeedbackEntryPoints$3$1(entrypointsDBoxFragment, context, null), 3, null);
        return Unit.INSTANCE;
    }

    public final List<EntrypointListAdapter.StateListAnimator> OLrzqt(final Context context) {
        return yDY.gEmmrt(new EntrypointListAdapter.StateListAnimator.ActionBar("WebView"), new EntrypointListAdapter.StateListAnimator.Activity("WebView with Article Search", new Function0() { // from class: o.spH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return EntrypointsDBoxFragment.copydefault(context);
            }
        }));
    }

    public static final Unit copydefault(final Context context) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        final C55008xbo c55008xbo = new C55008xbo(context, null, 0, 6, null);
        c55008xbo.setText("https://www.okx.com/help/okx-nft-faqs");
        viewOnClickListenerC54939xaY.setTitle("Enter URL");
        viewOnClickListenerC54939xaY.EZpvd(c55008xbo);
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) "Open", new View.OnClickListener() { // from class: o.spN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                EntrypointsDBoxFragment.KWHzl(c55008xbo, context, view);
            }
        });
        viewOnClickListenerC54939xaY.EZpvd("Cancel", new View.OnClickListener() { // from class: o.spL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                EntrypointsDBoxFragment.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.szP.ActionBar.openPage$default(o.szP$ActionBar, android.content.Context, android.os.Bundle, java.lang.Integer, int, java.lang.Object):void */
    public static final void KWHzl(C55008xbo c55008xbo, Context context, View view) {
        Pair[] pairArr = new Pair[1];
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        pairArr[0] = C56390yDp.OLrzqt("url", String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null));
        ActivityC45850szP.ActionBar.openPage$default(ActivityC45850szP.Companion, context, BundleKt.bundleOf(pairArr), null, 4, null);
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
