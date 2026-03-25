package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.lottie.LottieListener;
import com.bumptech.glide.Glide;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.unify_trade.bot.data.BotGuideItem;
import com.okinc.unify_trade.bot.data.BotGuideLinkItem;
import com.okinc.unify_trade.bot.presenter.EmptyPresenter;
import com.okinc.web.WebActivity;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wJF extends AbstractC54505xKx<AbstractC50779vab, EmptyPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final C43316rmw copydefault = new C43316rmw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.HJWChPOKBmQNaCIdOM;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wJF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final wJF AEQbTJ(@NotNull BotGuideData botGuideData) {
            Intrinsics.checkNotNullParameter(botGuideData, "");
            wJF wjf = new wJF();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", botGuideData);
            wjf.setArguments(bundle);
            return wjf;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.copydefault.register(java.lang.String.class, new wJL());
        gGvvIC().copydefault.setLayoutManager(new LinearLayoutManager(getContext()));
        gGvvIC().copydefault.setAdapter(this.copydefault);
        android.os.Bundle arguments = getArguments();
        AEQbTJ(arguments != null ? (BotGuideData) arguments.getParcelable("data") : null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(BotGuideData botGuideData) {
        java.lang.String picUrl;
        java.util.List<?> listEZpvd;
        BotGuideLinkItem guideLink;
        java.util.List<BotGuideItem> guideItemList;
        java.lang.String link = null;
        gGvvIC().EZpvd.setText(botGuideData != null ? botGuideData.getGuideTitle() : null);
        if (C33492mxV.OLrzqt()) {
            picUrl = botGuideData != null ? botGuideData.getPicNightUrl() : null;
        } else if (botGuideData != null) {
            picUrl = botGuideData.getPicUrl();
        }
        if (picUrl != null && C59449zhJ.endsWith$default(picUrl, ".lottie", false, 2, null)) {
            OLrzqt(picUrl);
        } else {
            KWHzl(picUrl);
        }
        C43316rmw c43316rmw = this.copydefault;
        if (botGuideData == null || (guideItemList = botGuideData.getGuideItemList()) == null) {
            listEZpvd = C56402yEa.EZpvd("");
        } else {
            listEZpvd = new java.util.ArrayList<>(C56403yEb.AYXKKw(guideItemList, 10));
            java.util.Iterator<T> it = guideItemList.iterator();
            while (it.hasNext()) {
                listEZpvd.add(((BotGuideItem) it.next()).getText());
            }
        }
        c43316rmw.setItems(listEZpvd);
        this.copydefault.notifyDataSetChanged();
        LinearLayoutCompat linearLayoutCompat = gGvvIC().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility((!C33129mqd.OLrzqt((java.lang.CharSequence) (botGuideData != null ? botGuideData.getVideoUrl() : null)) || copydefault(botGuideData)) ? 8 : 0);
        LinearLayoutCompat linearLayoutCompat2 = gGvvIC().gEmmrt;
        linearLayoutCompat2.setOnClickListener(new ActionBar(linearLayoutCompat2, 1000L, this, botGuideData));
        wYE wye = gGvvIC().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(wye, "");
        if (botGuideData != null && (guideLink = botGuideData.getGuideLink()) != null) {
            link = guideLink.getLink();
        }
        wye.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) link) ? 0 : 8);
        wYE wye2 = gGvvIC().OLrzqt;
        wye2.setOnClickListener(new TaskDescription(wye2, 1000L, this, botGuideData));
    }

    public final boolean copydefault(BotGuideData botGuideData) {
        if (C48291uMa.Companion.AEQbTJ().OLrzqt()) {
            if (Intrinsics.EZpvd((java.lang.Object) (botGuideData != null ? botGuideData.getBotType() : null), (java.lang.Object) "contract_dca")) {
                return true;
            }
        }
        return false;
    }

    public final void OLrzqt(java.lang.String str) {
        final AbstractC50779vab abstractC50779vabGGvvIC = gGvvIC();
        android.widget.ImageView imageView = abstractC50779vabGGvvIC.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        C55353xiO c55353xiO = abstractC50779vabGGvvIC.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55353xiO, "");
        c55353xiO.setVisibility(0);
        abstractC50779vabGGvvIC.KWHzl.setFailureListener(new LottieListener() { // from class: o.wJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                wJF.OLrzqt(abstractC50779vabGGvvIC, (java.lang.Throwable) obj);
            }
        });
        abstractC50779vabGGvvIC.KWHzl.setAnimationFromUrl(str);
        abstractC50779vabGGvvIC.KWHzl.playAnimation();
    }

    public static final void OLrzqt(AbstractC50779vab abstractC50779vab, java.lang.Throwable th) {
        C55353xiO c55353xiO = abstractC50779vab.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55353xiO, "");
        c55353xiO.setVisibility(8);
        android.widget.ImageView imageView = abstractC50779vab.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
    }

    public final void KWHzl(java.lang.String str) {
        AbstractC50779vab abstractC50779vabGGvvIC = gGvvIC();
        C55353xiO c55353xiO = abstractC50779vabGGvvIC.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55353xiO, "");
        c55353xiO.setVisibility(8);
        android.widget.ImageView imageView = abstractC50779vabGGvvIC.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        Glide.EZpvd(this).EZpvd(str).fetchVPNInfo().EZpvd(abstractC50779vabGGvvIC.AEQbTJ);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ wJF AEQbTJ;
        public final /* synthetic */ BotGuideData EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, wJF wjf, BotGuideData botGuideData) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = wjf;
            this.EZpvd = botGuideData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String videoUrl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                FragmentActivity activity = this.AEQbTJ.getActivity();
                if (activity != null) {
                    C43056riA c43056riA = C43056riA.AEQbTJ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    BotGuideData botGuideData = this.EZpvd;
                    if (botGuideData == null || (videoUrl = botGuideData.getVideoUrl()) == null) {
                        videoUrl = "";
                    }
                    linkedHashMap.put("url", videoUrl);
                    linkedHashMap.put("theme", "dark");
                    Unit unit = Unit.INSTANCE;
                    c43056riA.copydefault(activity, "okluatradingeco", "/video", C56424yEw.values(linkedHashMap));
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ BotGuideData EZpvd;
        public final /* synthetic */ wJF KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, wJF wjf, BotGuideData botGuideData) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = wjf;
            this.EZpvd = botGuideData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            BotGuideLinkItem guideLink;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                FragmentActivity activity = this.KWHzl.getActivity();
                if (activity != null) {
                    WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                    kotlin.Pair[] pairArr = new kotlin.Pair[1];
                    BotGuideData botGuideData = this.EZpvd;
                    pairArr[0] = C56390yDp.OLrzqt("url", (botGuideData == null || (guideLink = botGuideData.getGuideLink()) == null) ? null : guideLink.getLink());
                    WebActivity.TaskDescription.openPage$default(taskDescription, activity, BundleKt.bundleOf(pairArr), null, 4, null);
                }
            }
        }
    }
}
