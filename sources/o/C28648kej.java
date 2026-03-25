package o;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherBottomSheetParams;
import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheetParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType;
import com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2;
import com.okinc.business.market.features.meme.ui.views.ToolButton;
import com.okinc.business.market.features.meme.ui.views.ToolDialogParams;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C28893kjP;
import o.C52761wXj;
import o.gKO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28648kej {
    public static final void copydefault(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C28663key c28663keyEZpvd = C28663key.Companion.EZpvd(new ApedTogetherBottomSheetParams(str2, str));
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c28663keyEZpvd.show(childFragmentManager);
    }

    public static final void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, @NotNull MemeUiModel memeUiModel, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        gKO.StateListAnimator.openMemeQuickTransaction$default(gko, childFragmentManager, str, new TokenBase(memeUiModel.KWHzl(), memeUiModel.AuCTel(), memeUiModel.iwGUEr(), null, null, memeUiModel.getNewProxyInstance(), memeUiModel.getFieldNames(), memeUiModel.AxsJAY() ? 1 : 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -232, null), TransactionType.Buy.getType(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }

    public static /* synthetic */ void openMemeTokenDetailBottomSheet$default(androidx.fragment.app.Fragment fragment, MemeUiModel memeUiModel, java.lang.String str, TokenDetailTabType tokenDetailTabType, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            tokenDetailTabType = TokenDetailTabType.TOKEN;
        }
        EZpvd(fragment, memeUiModel, str, tokenDetailTabType);
    }

    public static final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull MemeUiModel memeUiModel, @NotNull java.lang.String str, @NotNull TokenDetailTabType tokenDetailTabType) {
        java.lang.Object obj;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenDetailTabType, "");
        java.util.List<CompactTagData> listCopydefault = memeUiModel.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next2 = it.next();
            if (C59449zhJ.startsWith$default(((CompactTagData) next2).copydefault(), "dexScreener_", false, 2, null)) {
                arrayList.add(next2);
            }
        }
        java.util.Iterator<T> it2 = memeUiModel.copydefault().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            CompactTagData compactTagData = (CompactTagData) next;
            if (Intrinsics.EZpvd((java.lang.Object) compactTagData.copydefault(), (java.lang.Object) "live_open") || Intrinsics.EZpvd((java.lang.Object) compactTagData.copydefault(), (java.lang.Object) "live_closed")) {
                break;
            }
        }
        CompactTagData compactTagData2 = (CompactTagData) next;
        TokenDetailTabData[] tokenDetailTabDataArr = new TokenDetailTabData[4];
        java.lang.String strHDKMBd = memeUiModel.hDKMBd();
        if (strHDKMBd.length() == 0) {
            strHDKMBd = memeUiModel.iwGUEr();
        }
        tokenDetailTabDataArr[0] = new TokenDetailTabData.TokenTab(strHDKMBd, memeUiModel.fARcdN(), false, memeUiModel.fJNWhG(), 4, null);
        tokenDetailTabDataArr[1] = new TokenDetailTabData.SocialTab(false, memeUiModel.uzCIH(), memeUiModel.fJNWhG(), arrayList, compactTagData2);
        tokenDetailTabDataArr[2] = new TokenDetailTabData.DataTab(memeUiModel.fIwbmz().gEmmrt(), memeUiModel.fIwbmz().AYXKKw(), memeUiModel.fIwbmz().djBIcL(), memeUiModel.fIwbmz().EZpvd(), memeUiModel.fIwbmz().valueOf(), memeUiModel.fARcdN(), memeUiModel.fIwbmz().OLrzqt(), memeUiModel.fIwbmz().KWHzl());
        java.util.Iterator<T> it3 = memeUiModel.AhwBna().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            java.lang.Object next3 = it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) next3).OLrzqt(), (java.lang.Object) "dev")) {
                obj = next3;
                break;
            }
        }
        tokenDetailTabDataArr[3] = new TokenDetailTabData.DevTokenTab((TagWrapper) obj, memeUiModel.fIwbmz().EZpvd(), memeUiModel.fIwbmz().valueOf(), memeUiModel.fARcdN());
        C28832kiH c28832kiHOLrzqt = C28832kiH.Companion.OLrzqt(new TokenDetailBottomSheetParams(new TokenDetailCommonParams(memeUiModel.KWHzl(), memeUiModel.getNewProxyInstance(), memeUiModel.AuCTel(), memeUiModel.getFieldNames(), memeUiModel.iwGUEr(), true, true, memeUiModel.gEmmrt(), str, memeUiModel.AxsJAY()), yDY.gEmmrt(tokenDetailTabDataArr), tokenDetailTabType));
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c28832kiHOLrzqt.show(childFragmentManager);
    }

    public static final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull kotlin.Pair<java.lang.Integer, java.lang.Integer> pair, @NotNull MemeUiModel memeUiModel, final int i, @NotNull final MemeActivityViewModelV2 memeActivityViewModelV2, @NotNull final C28908kje c28908kje, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(memeActivityViewModelV2, "");
        Intrinsics.checkNotNullParameter(c28908kje, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.content.Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        C28893kjP.ActionBar actionBar = C28893kjP.Companion;
        int i2 = C52761wXj.TaskDescription.invokespecialgBtXYZ;
        int iCopydefault = C25382ivf.copydefault(C52761wXj.Activity.zblBkD, context);
        java.lang.String string = context.getString(C23274hvD.Fragment.getActiveNotifications);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C28893kjP c28893kjPKWHzl = actionBar.KWHzl(pair, new ToolDialogParams(C56402yEa.EZpvd(new ToolButton(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(iCopydefault), string, null, memeUiModel, 8, null))));
        c28893kjPKWHzl.AEQbTJ(new Function1() { // from class: o.kem
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28648kej.KWHzl(memeActivityViewModelV2, c28908kje, i, function0, (ToolButton) obj);
            }
        });
        Intrinsics.copydefault(childFragmentManager);
        c28893kjPKWHzl.show(childFragmentManager, C28893kjP.class.getName());
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(android.os.SystemClock.uptimeMillis(), android.os.SystemClock.uptimeMillis(), 3, pair.getFirst().intValue(), pair.getSecond().intValue(), 0);
        android.view.View view = fragment.getView();
        if (view != null) {
            view.dispatchTouchEvent(motionEventObtain);
        }
    }

    public static final Unit KWHzl(MemeActivityViewModelV2 memeActivityViewModelV2, final C28908kje c28908kje, final int i, final Function0 function0, final ToolButton toolButton) {
        Intrinsics.checkNotNullParameter(toolButton, "");
        android.os.Parcelable parcelableEZpvd = toolButton.EZpvd();
        Intrinsics.copydefault(parcelableEZpvd, "");
        memeActivityViewModelV2.AEQbTJ((MemeUiModel) parcelableEZpvd, new Function0() { // from class: o.kei
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28648kej.KWHzl(c28908kje, toolButton, i, function0);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C28908kje c28908kje, ToolButton toolButton, int i, Function0 function0) {
        c28908kje.EZpvd((MemeUiModel) toolButton.EZpvd(), i);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        android.content.Context context = fragment.getContext();
        if (context == null) {
            android.view.View view = fragment.getView();
            context = view != null ? view.getContext() : null;
            if (context == null) {
                return;
            }
        }
        java.lang.String string = context.getString(C23274hvD.Fragment.ICustomTabsServiceStubProxy);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C28879kjB.copydefault(context, string);
    }

    public static final void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        java.util.List<androidx.fragment.app.Fragment> fragments = fragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : fragments) {
            if (obj instanceof wXX) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((wXX) it.next()).dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: o.kej$Activity */
    public static final class Activity extends RecyclerView.OnScrollListener {
        public final /* synthetic */ Function0<Unit> AEQbTJ;
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ Function0<Unit> KWHzl;
        public final /* synthetic */ Function0<java.lang.Boolean> OLrzqt;
        public final /* synthetic */ Function0<Unit> copydefault;
        public final /* synthetic */ Function0<java.lang.Boolean> valueOf;

        public Activity(Function0<java.lang.Boolean> function0, Function0<Unit> function02, Function0<java.lang.Boolean> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06) {
            this.OLrzqt = function0;
            this.EZpvd = function02;
            this.valueOf = function03;
            this.copydefault = function04;
            this.KWHzl = function05;
            this.AEQbTJ = function06;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            if (this.OLrzqt.invoke().booleanValue()) {
                return;
            }
            if (iFindFirstVisibleItemPosition == 0) {
                this.EZpvd.invoke();
            } else if (this.valueOf.invoke().booleanValue()) {
                this.copydefault.invoke();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Function0<Unit> function0;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1 && (function0 = this.KWHzl) != null) {
                function0.invoke();
            }
            Function0<Unit> function02 = this.AEQbTJ;
            if (function02 != null) {
                function02.invoke();
            }
        }
    }

    public static final RecyclerView.OnScrollListener AEQbTJ(@NotNull Function0<java.lang.Boolean> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<java.lang.Boolean> function04, Function0<Unit> function05, Function0<Unit> function06) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        return new Activity(function0, function02, function04, function03, function05, function06);
    }

    public static final void KWHzl(@NotNull RecyclerView recyclerView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            int childCount = recyclerView.getChildCount();
            if (childCount < 0) {
                return;
            }
            int i = 0;
            while (true) {
                android.view.View childAt = recyclerView.getChildAt(i);
                C28848kiX c28848kiX = childAt instanceof C28848kiX ? (C28848kiX) childAt : null;
                if (c28848kiX != null && !Intrinsics.EZpvd(c28848kiX.getTag(), (java.lang.Object) str)) {
                    c28848kiX.EZpvd(true);
                }
                if (i == childCount) {
                    return;
                } else {
                    i++;
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, @NotNull MemeUiModel memeUiModel, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            C25352ivB.openMarketDetailPage$default(activity, str, new TokenBase(memeUiModel.KWHzl(), memeUiModel.AuCTel(), memeUiModel.iwGUEr(), "", "", memeUiModel.getNewProxyInstance(), memeUiModel.getFieldNames(), memeUiModel.AxsJAY() ? 1 : 0, 0, 0, 0, null, "default_trade", null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -4352, null), str2, null, new int[0], 8, null);
        }
    }
}
