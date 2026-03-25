package com.okinc.cruilib.view.listitem.simple;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.cruilib.model.listitem.OKCRListItem;
import com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem;
import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import com.okinc.cruilib.view.listitem.simple.OKCRSwipeableTokenItemTemplate;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC31874mHc;
import o.C31899mIa;
import o.C31901mIc;
import o.C31909mIk;
import o.C31912mIn;
import o.C31932mJg;
import o.C33054mpH;
import o.C43312rms;
import o.C52761wXj;
import o.C55296xhK;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.mHV;
import o.mIP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCRSwipeableTokenItemTemplate extends mIP<OKCRTokenListItem.TokenListItem, AbstractC31874mHc> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final Function1<OKCRTokenListItem.TokenListItem, Unit> AEQbTJ;
    public final Function1<OKCRTokenListItem.TokenListItem, Unit> AYXKKw;
    public final Function1<OKCRTokenListItem.TokenListItem, Unit> AhwBna;
    public final Function1<OKCRTokenListItem.TokenListItem, Unit> OLrzqt;
    public final C31912mIn copydefault;
    public final Function1<OKCRTokenListItem.TokenListItem, Unit> djBIcL;
    public final SwipeMode fetchVPNInfo;
    public final Function1<OKCRTokenListItem.TokenListItem, Unit> gEmmrt;
    public final Function1<OKCRTokenListItem.TokenListItem, Unit> valueOf;

    @Override // o.mIP
    public /* bridge */ /* synthetic */ void KWHzl(OKCRListItem oKCRListItem, C43312rms c43312rms) {
        KWHzl((OKCRTokenListItem.TokenListItem) oKCRListItem, (C43312rms<AbstractC31874mHc>) c43312rms);
    }

    public void KWHzl(@NotNull final OKCRTokenListItem.TokenListItem tokenListItem, @NotNull C43312rms<AbstractC31874mHc> c43312rms) {
        Intrinsics.checkNotNullParameter(tokenListItem, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        AbstractC31874mHc abstractC31874mHc = (AbstractC31874mHc) c43312rms.OLrzqt();
        boolean z = true;
        boolean z2 = this.fetchVPNInfo != SwipeMode.NOT_SWIPEABLE;
        abstractC31874mHc.gEmmrt.setLockDrag(!z2);
        if (z2) {
            this.copydefault.copydefault(abstractC31874mHc.gEmmrt, tokenListItem.getTokenId());
            abstractC31874mHc.gEmmrt.setSwipeListener(new StateListAnimator(c43312rms, this, tokenListItem, abstractC31874mHc));
            LinearLayout linearLayout = abstractC31874mHc.KWHzl;
            linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, c43312rms, this, tokenListItem));
        }
        abstractC31874mHc.OLrzqt.getBackground().setAlpha(0);
        ImageView imageView = abstractC31874mHc.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.AEQbTJ(imageView, tokenListItem.getTokenImageUrl(), C52761wXj.TaskDescription.aHXSQp);
        if (!tokenListItem.isBuidl() && !tokenListItem.isStablecoin()) {
            z = false;
        }
        abstractC31874mHc.DbNXlk.setText(z ? tokenListItem.getTokenFullName() : tokenListItem.getTokenName());
        abstractC31874mHc.isConnected.setText(z ? tokenListItem.getTokenName() : tokenListItem.getTokenFullName());
        abstractC31874mHc.AkhnZx.setText(tokenListItem.getPrice());
        if (tokenListItem.isStablecoin()) {
            abstractC31874mHc.fetchVPNInfo.setVisibility(4);
        } else {
            abstractC31874mHc.fetchVPNInfo.setVisibility(0);
            abstractC31874mHc.fetchVPNInfo.setText(tokenListItem.getPercentage());
            TextView textView = abstractC31874mHc.fetchVPNInfo;
            OKCRTrend trend = tokenListItem.getTrend();
            Context context = abstractC31874mHc.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setTextColor(C31932mJg.EZpvd(trend, context));
        }
        abstractC31874mHc.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.mJp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                OKCRSwipeableTokenItemTemplate.copydefault(this.EZpvd, tokenListItem, view);
            }
        });
    }

    public static final class StateListAnimator implements C31909mIk.TaskDescription {
        public final /* synthetic */ AbstractC31874mHc AEQbTJ;
        public final /* synthetic */ OKCRSwipeableTokenItemTemplate EZpvd;
        public final /* synthetic */ OKCRTokenListItem.TokenListItem OLrzqt;
        public final /* synthetic */ C43312rms<AbstractC31874mHc> copydefault;

        public StateListAnimator(C43312rms<AbstractC31874mHc> c43312rms, OKCRSwipeableTokenItemTemplate oKCRSwipeableTokenItemTemplate, OKCRTokenListItem.TokenListItem tokenListItem, AbstractC31874mHc abstractC31874mHc) {
            this.copydefault = c43312rms;
            this.EZpvd = oKCRSwipeableTokenItemTemplate;
            this.OLrzqt = tokenListItem;
            this.AEQbTJ = abstractC31874mHc;
        }

        @Override // o.C31909mIk.TaskDescription
        public void KWHzl(C31909mIk c31909mIk) {
            mHV mhvEZpvd;
            Intrinsics.checkNotNullParameter(c31909mIk, "");
            C43312rms<AbstractC31874mHc> c43312rms = this.copydefault;
            C31901mIc c31901mIc = c43312rms instanceof C31901mIc ? (C31901mIc) c43312rms : null;
            if (c31901mIc != null && (mhvEZpvd = c31901mIc.EZpvd()) != null) {
                mhvEZpvd.EZpvd(true);
            }
            this.EZpvd.AEQbTJ.invoke(this.OLrzqt);
        }

        @Override // o.C31909mIk.TaskDescription
        public void OLrzqt(C31909mIk c31909mIk) {
            mHV mhvEZpvd;
            C43312rms<AbstractC31874mHc> c43312rms = this.copydefault;
            C31901mIc c31901mIc = c43312rms instanceof C31901mIc ? (C31901mIc) c43312rms : null;
            if (c31901mIc != null && (mhvEZpvd = c31901mIc.EZpvd()) != null) {
                mhvEZpvd.EZpvd(false);
            }
            this.EZpvd.gEmmrt.invoke(this.OLrzqt);
            this.EZpvd.OLrzqt.invoke(this.OLrzqt);
            final AbstractC31874mHc abstractC31874mHc = this.AEQbTJ;
            abstractC31874mHc.gEmmrt.postDelayed(new Runnable() { // from class: o.mJm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    OKCRSwipeableTokenItemTemplate.StateListAnimator.copydefault(abstractC31874mHc);
                }
            }, 250L);
        }

        public static final void copydefault(AbstractC31874mHc abstractC31874mHc) {
            abstractC31874mHc.gEmmrt.OLrzqt(true);
        }

        @Override // o.C31909mIk.TaskDescription
        public void copydefault(C31909mIk c31909mIk) {
            mHV mhvEZpvd;
            Intrinsics.checkNotNullParameter(c31909mIk, "");
            C43312rms<AbstractC31874mHc> c43312rms = this.copydefault;
            C31901mIc c31901mIc = c43312rms instanceof C31901mIc ? (C31901mIc) c43312rms : null;
            if (c31901mIc != null && (mhvEZpvd = c31901mIc.EZpvd()) != null) {
                mhvEZpvd.EZpvd(false);
            }
            this.EZpvd.AYXKKw.invoke(this.OLrzqt);
        }

        @Override // o.C31909mIk.TaskDescription
        public void copydefault(C31909mIk c31909mIk, float f) {
            mHV mhvEZpvd;
            Intrinsics.checkNotNullParameter(c31909mIk, "");
            C43312rms<AbstractC31874mHc> c43312rms = this.copydefault;
            C31901mIc c31901mIc = c43312rms instanceof C31901mIc ? (C31901mIc) c43312rms : null;
            if (c31901mIc != null && (mhvEZpvd = c31901mIc.EZpvd()) != null) {
                mhvEZpvd.EZpvd(false);
            }
            this.EZpvd.djBIcL.invoke(this.OLrzqt);
        }
    }

    public static final void copydefault(OKCRSwipeableTokenItemTemplate oKCRSwipeableTokenItemTemplate, OKCRTokenListItem.TokenListItem tokenListItem, View view) {
        oKCRSwipeableTokenItemTemplate.valueOf.invoke(tokenListItem);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31874mHc> c43312rms, @NotNull OKCRTokenListItem.TokenListItem tokenListItem, @NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(tokenListItem, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(c43312rms, tokenListItem, list);
            Unit unit = Unit.INSTANCE;
            return;
        }
        Object objAuCTelauCTel = CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        Object obj = null;
        Bundle bundle = objAuCTelauCTel instanceof Bundle ? (Bundle) objAuCTelauCTel : null;
        if (bundle != null) {
            String string = bundle.getString("description_diff");
            if (string != null) {
                ((AbstractC31874mHc) c43312rms.OLrzqt()).DbNXlk.setText(string);
            }
            String string2 = bundle.getString("price_diff");
            if (string2 != null) {
                ((AbstractC31874mHc) c43312rms.OLrzqt()).AkhnZx.setText(string2);
            }
            if (tokenListItem.isStablecoin()) {
                ((AbstractC31874mHc) c43312rms.OLrzqt()).fetchVPNInfo.setVisibility(4);
                obj = Unit.INSTANCE;
            } else {
                ((AbstractC31874mHc) c43312rms.OLrzqt()).fetchVPNInfo.setVisibility(0);
                String string3 = bundle.getString("percentage_diff");
                if (string3 != null) {
                    ((AbstractC31874mHc) c43312rms.OLrzqt()).fetchVPNInfo.setText(string3);
                }
                String string4 = bundle.getString("trend_diff");
                if (string4 != null) {
                    OKCRTrend oKCRTrendValueOf = OKCRTrend.valueOf(string4);
                    AbstractC31874mHc abstractC31874mHc = (AbstractC31874mHc) c43312rms.OLrzqt();
                    TextView textView = abstractC31874mHc.fetchVPNInfo;
                    Context context = abstractC31874mHc.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    textView.setTextColor(C31932mJg.EZpvd(oKCRTrendValueOf, context));
                    obj = abstractC31874mHc;
                }
            }
            if (obj != null) {
                return;
            }
        }
        super.onBindViewHolder(c43312rms, tokenListItem, list);
        Unit unit2 = Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/databinding/ViewDataBinding;)Lo/mHV; */
    @Override // o.mIP, o.AbstractC31910mIl
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public mHV KWHzl(@NotNull AbstractC31874mHc abstractC31874mHc) {
        Intrinsics.checkNotNullParameter(abstractC31874mHc, "");
        ConstraintLayout constraintLayout = abstractC31874mHc.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return C31899mIa.applyTouchFeedback$default((View) constraintLayout, abstractC31874mHc.valueOf, false, 0, 6, (Object) null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ OKCRSwipeableTokenItemTemplate AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ OKCRTokenListItem.TokenListItem KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ C43312rms copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, C43312rms c43312rms, OKCRSwipeableTokenItemTemplate oKCRSwipeableTokenItemTemplate, OKCRTokenListItem.TokenListItem tokenListItem) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c43312rms;
            this.AEQbTJ = oKCRSwipeableTokenItemTemplate;
            this.KWHzl = tokenListItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ((AbstractC31874mHc) this.copydefault.OLrzqt()).gEmmrt.OLrzqt(true);
                this.AEQbTJ.AhwBna.invoke(this.KWHzl);
                this.AEQbTJ.OLrzqt.invoke(this.KWHzl);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SwipeMode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SwipeMode[] $VALUES;
        public static final SwipeMode NOT_SWIPEABLE = new SwipeMode("NOT_SWIPEABLE", 0);
        public static final SwipeMode SWIPEABLE = new SwipeMode("SWIPEABLE", 1);
        public static final SwipeMode FULLY_SWIPEABLE = new SwipeMode("FULLY_SWIPEABLE", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SwipeMode[] $values() {
            return new SwipeMode[]{NOT_SWIPEABLE, SWIPEABLE, FULLY_SWIPEABLE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SwipeMode> getEntries() {
            return $ENTRIES;
        }

        private SwipeMode(String str, int i) {
        }

        static {
            SwipeMode[] swipeModeArr$values = $values();
            $VALUES = swipeModeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(swipeModeArr$values);
        }

        public static SwipeMode valueOf(String str) {
            return (SwipeMode) Enum.valueOf(SwipeMode.class, str);
        }

        public static SwipeMode[] values() {
            return (SwipeMode[]) $VALUES.clone();
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.view.listitem.simple.OKCRSwipeableTokenItemTemplate.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
