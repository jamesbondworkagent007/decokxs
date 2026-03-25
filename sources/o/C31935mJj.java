package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.cruilib.model.listitem.OKCRListItem;
import com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem;
import com.okinc.cruilib.view.listitem.simple.OKCRFeatureCardTemplate$startCarousel$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.C52761wXj;
import o.mDC;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mJj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31935mJj extends mIP<OKCRTokenListItem.FeatureCardItem, AbstractC31862mGr> {
    public final Function1<OKCRTokenListItem.FeatureCardItem, Unit> OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = mDC.ActionBar.dvKsVJ;

    public static final int copydefault(int i, int i2) {
        return (i - 1) - i2;
    }

    @Override // o.mIP
    public /* synthetic */ void KWHzl(OKCRListItem oKCRListItem, C43312rms c43312rms) {
        copydefault((OKCRTokenListItem.FeatureCardItem) oKCRListItem, (C43312rms<AbstractC31862mGr>) c43312rms);
    }

    public void copydefault(@NotNull final OKCRTokenListItem.FeatureCardItem featureCardItem, @NotNull C43312rms<AbstractC31862mGr> c43312rms) {
        java.lang.String strDjBIcL;
        Intrinsics.checkNotNullParameter(featureCardItem, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        AbstractC31862mGr abstractC31862mGr = (AbstractC31862mGr) c43312rms.OLrzqt();
        RecyclerView recyclerView = abstractC31862mGr.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        OLrzqt(recyclerView);
        if (C33492mxV.OLrzqt()) {
            strDjBIcL = featureCardItem.EZpvd();
        } else {
            strDjBIcL = featureCardItem.djBIcL();
        }
        android.widget.ImageView imageView = abstractC31862mGr.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, strDjBIcL, (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        abstractC31862mGr.AYXKKw.setText(featureCardItem.AhwBna());
        abstractC31862mGr.djBIcL.setText(featureCardItem.KWHzl());
        abstractC31862mGr.EZpvd.setText(featureCardItem.OLrzqt());
        abstractC31862mGr.AEQbTJ.setText(featureCardItem.AEQbTJ());
        abstractC31862mGr.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.mJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C31935mJj.copydefault(this.OLrzqt, featureCardItem, view);
            }
        });
        RecyclerView recyclerView2 = abstractC31862mGr.gEmmrt;
        int i = AEQbTJ;
        java.lang.Object tag = recyclerView2.getTag(i);
        C31929mJd c31929mJd = tag instanceof C31929mJd ? (C31929mJd) tag : null;
        if (c31929mJd == null) {
            c31929mJd = new C31929mJd(null, null, false, 7, null);
            abstractC31862mGr.gEmmrt.setTag(i, c31929mJd);
        }
        if (!featureCardItem.AYXKKw().isEmpty()) {
            RecyclerView recyclerView3 = abstractC31862mGr.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
            copydefault(recyclerView3, featureCardItem.AYXKKw(), c31929mJd);
            return;
        }
        abstractC31862mGr.gEmmrt.setVisibility(8);
        Job jobKWHzl = c31929mJd.KWHzl();
        if (jobKWHzl != null) {
            Job.DefaultImpls.cancel$default(jobKWHzl, (CancellationException) null, 1, (java.lang.Object) null);
        }
        c31929mJd.EZpvd(null);
        RecyclerView recyclerView4 = abstractC31862mGr.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
        OLrzqt(recyclerView4);
    }

    public static final void copydefault(C31935mJj c31935mJj, OKCRTokenListItem.FeatureCardItem featureCardItem, android.view.View view) {
        c31935mJj.OLrzqt.invoke(featureCardItem);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:14:0x002d */
    public final void OLrzqt(RecyclerView recyclerView) {
        java.lang.Object tag = recyclerView.getTag(mDC.ActionBar.dxcTrN);
        java.lang.Runnable runnable = tag instanceof java.lang.Runnable ? (java.lang.Runnable) tag : null;
        if (runnable != null) {
            recyclerView.removeCallbacks(runnable);
            recyclerView.setTag(mDC.ActionBar.dxcTrN, null);
        }
        android.view.ViewParent parent = recyclerView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            }
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if ((childAt instanceof android.widget.ImageView) && Intrinsics.EZpvd(((android.widget.ImageView) childAt).getTag(mDC.ActionBar.fFgQHt), java.lang.Boolean.TRUE)) {
                viewGroup.removeViewAt(childCount);
            }
        }
    }

    public final void copydefault(RecyclerView recyclerView, java.util.List<java.lang.String> list, C31929mJd c31929mJd) {
        C43316rmw c43316rmw;
        Job jobKWHzl = c31929mJd.KWHzl();
        if (jobKWHzl != null) {
            Job.DefaultImpls.cancel$default(jobKWHzl, (CancellationException) null, 1, (java.lang.Object) null);
        }
        OLrzqt(recyclerView);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new mHO((java.lang.String) it.next()));
        }
        c31929mJd.OLrzqt(arrayList);
        int size = arrayList.size();
        recyclerView.setVisibility(0);
        if (recyclerView.getAdapter() == null) {
            c43316rmw = new C43316rmw();
            c43316rmw.register(mHO.class, new C31936mJk());
            recyclerView.setAdapter(c43316rmw);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.setChildDrawingOrderCallback(new RecyclerView.ChildDrawingOrderCallback() { // from class: o.mJl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
                public final int onGetChildDrawingOrder(int i, int i2) {
                    return C31935mJj.copydefault(i, i2);
                }
            });
        } else {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Intrinsics.copydefault(adapter, "");
            c43316rmw = (C43316rmw) adapter;
        }
        c43316rmw.AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, C56548yJl.valueOf(3, arrayList.size()))));
        OLrzqt(recyclerView, arrayList);
        if (size > 3) {
            OLrzqt(recyclerView, c31929mJd);
        }
    }

    public final void OLrzqt(RecyclerView recyclerView, C31929mJd c31929mJd) {
        c31929mJd.EZpvd(BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new OKCRFeatureCardTemplate$startCarousel$1(c31929mJd, this, recyclerView, null), 3, null));
    }

    public final void copydefault(final RecyclerView recyclerView, final C31929mJd c31929mJd, mHO mho) {
        float right;
        if (c31929mJd.copydefault()) {
            return;
        }
        c31929mJd.copydefault(true);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        final C43316rmw c43316rmw = adapter instanceof C43316rmw ? (C43316rmw) adapter : null;
        if (c43316rmw == null) {
            return;
        }
        java.util.List<?> items = c43316rmw.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        final java.util.List<?> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) items);
        listFJNWhG.add(mho);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        android.view.View viewFindViewByPosition = linearLayoutManager.findViewByPosition(0);
        if (viewFindViewByPosition == null) {
            listFJNWhG.remove(0);
            c43316rmw.AhwBna(listFJNWhG);
            c31929mJd.copydefault(false);
            return;
        }
        float width = viewFindViewByPosition.getWidth();
        viewFindViewByPosition.animate().translationX(-width).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(400L).start();
        final android.widget.ImageView imageView = new android.widget.ImageView(recyclerView.getContext());
        imageView.setLayoutParams(viewFindViewByPosition.getLayoutParams());
        imageView.setScaleX(0.0f);
        imageView.setScaleY(0.0f);
        imageView.setAlpha(0.0f);
        imageView.setTag(mDC.ActionBar.fFgQHt, java.lang.Boolean.TRUE);
        C33054mpH.EZpvd(imageView, mho.OLrzqt(), C52761wXj.TaskDescription.aHXSQp);
        android.view.ViewParent parent = recyclerView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            c31929mJd.copydefault(false);
            return;
        }
        viewGroup.addView(imageView, viewGroup.indexOfChild(recyclerView));
        float width2 = recyclerView.getWidth();
        imageView.setTranslationX(width2);
        imageView.animate().translationX(width2 - width).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(400L).start();
        int childCount = recyclerView.getChildCount();
        for (int i = 1; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            if (childAt != null && childAt.getWidth() != 0 && childAt.getLeft() != 0) {
                float left = childAt.getLeft();
                if (i > 1) {
                    android.view.View childAt2 = recyclerView.getChildAt(i - 1);
                    if (childAt2 != null && childAt2.getWidth() != 0 && childAt2.getRight() != 0) {
                        right = childAt2.getRight() - childAt.getLeft();
                    }
                } else {
                    right = recyclerView.getResources().getDisplayMetrics().density * 4.0f;
                }
                childAt.animate().translationX(((left - width) + right) - left).setDuration(350L).start();
            }
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.mJh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31935mJj.copydefault(recyclerView, imageView, listFJNWhG, c43316rmw, c31929mJd);
            }
        };
        recyclerView.setTag(mDC.ActionBar.dxcTrN, runnable);
        recyclerView.postDelayed(runnable, 400L);
    }

    public static final void copydefault(RecyclerView recyclerView, android.widget.ImageView imageView, java.util.List list, C43316rmw c43316rmw, C31929mJd c31929mJd) {
        android.view.ViewParent parent = recyclerView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(imageView);
        }
        java.util.List<?> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        listFJNWhG.remove(0);
        c43316rmw.AhwBna(listFJNWhG);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            childAt.setTranslationX(0.0f);
            childAt.setScaleX(1.0f);
            childAt.setScaleY(1.0f);
            childAt.setAlpha(1.0f);
            childAt.animate().cancel();
        }
        c31929mJd.copydefault(false);
        recyclerView.setTag(mDC.ActionBar.dxcTrN, null);
    }

    /* JADX INFO: renamed from: o.mJj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mJj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void OLrzqt(RecyclerView recyclerView, java.util.List<mHO> list) {
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Glide.AEQbTJ(recyclerView.getContext()).EZpvd(((mHO) it.next()).OLrzqt()).EZpvd();
        }
    }
}
