package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.oKA;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qjB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41029qjB extends AbstractC40510qYn<C41120qkn, C42632raA> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final java.lang.String OLrzqt;

    public C41029qjB(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX INFO: renamed from: o.qjB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qjB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42632raA AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42632raA c42632raAOLrzqt = C42632raA.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42632raAOLrzqt, "");
        return c42632raAOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42632raA c42632raA, int i, @NotNull final C41120qkn c41120qkn) {
        Intrinsics.checkNotNullParameter(c42632raA, "");
        Intrinsics.checkNotNullParameter(c41120qkn, "");
        C41431qqg.AEQbTJ(c42632raA.copydefault, true, (Function1<? super android.widget.TextView, Unit>) new Function1() { // from class: o.qjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41029qjB.copydefault(c41120qkn, (android.widget.TextView) obj);
            }
        });
        AppCompatImageView appCompatImageView = c42632raA.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C57659ymb.EZpvd(appCompatImageView, c41120qkn.EZpvd(), qZH.Activity.AhwBna);
        C41431qqg.AEQbTJ(c42632raA.KWHzl, c41120qkn.AkhnZx(), (Function1<? super C55071xcy, Unit>) new Function1() { // from class: o.qjJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41029qjB.AEQbTJ(c41120qkn, (C55071xcy) obj);
            }
        });
        C41817qxv.setData$default(c42632raA.AEQbTJ, new kotlin.Pair(c41120qkn.KWHzl(), ""), c41120qkn.djBIcL(), c41120qkn.valueOf(), c41120qkn.AhwBna(), false, 16, null);
        c42632raA.AEQbTJ.setPriceLayoutVisible(c41120qkn.values(), c41120qkn.isConnected());
        C40499qYc root = c42632raA.getRoot();
        root.setOnClickListener(new Application(root, 1000L, c41120qkn, c42632raA, this));
    }

    public static final Unit copydefault(C41120qkn c41120qkn, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setTypeface(textView.getTypeface(), C33129mqd.gEmmrt(java.lang.Integer.valueOf(c41120qkn.AEQbTJ()), 3) ? 1 : 0);
        textView.setTextColor(C33070mpX.copydefault(c41120qkn.AEQbTJ() <= 3 ? C52761wXj.Activity.HJWChPQdUnVm : C32113mPz.ActionBar.iwGUEr));
        textView.setTextSize(2, c41120qkn.AEQbTJ() <= 10 ? 14.0f : c41120qkn.AEQbTJ() < 100 ? 12.0f : 10.0f);
        textView.setText(java.lang.String.valueOf(c41120qkn.AEQbTJ()));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C41120qkn c41120qkn, C55071xcy c55071xcy) {
        Intrinsics.checkNotNullParameter(c55071xcy, "");
        c55071xcy.setText(c41120qkn.OLrzqt());
        c55071xcy.setStyleWithTheme(c41120qkn.copydefault());
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.lang.String str, final C41120qkn c41120qkn) {
        C32866mlf.onEvent$default("Trending_CategoryDetails_Item_Click", (TrackChannel[]) null, new Function1() { // from class: o.qjF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41029qjB.copydefault(str, c41120qkn, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, C41120qkn c41120qkn, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "category_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "module_clicked", OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, false, 4, null);
        EventParamsList.put$default(eventParamsList, "item_position", C33129mqd.gEmmrt(java.lang.Integer.valueOf(c41120qkn.AEQbTJ())), false, 4, null);
        EventParamsList.put$default(eventParamsList, FirebaseAnalytics.Param.ITEM_NAME, c41120qkn.KWHzl(), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qjB$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C41120qkn EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C41029qjB OLrzqt;
        public final /* synthetic */ C42632raA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C41120qkn c41120qkn, C42632raA c42632raA, C41029qjB c41029qjB) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c41120qkn;
            this.copydefault = c42632raA;
            this.OLrzqt = c41029qjB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                MarketCoinInfo marketCoinInfo = new MarketCoinInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
                marketCoinInfo.setInstrumentId(this.EZpvd.AYXKKw());
                marketCoinInfo.setInstrumentType(this.EZpvd.gEmmrt());
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context context = this.copydefault.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, null, null, null, null, "Market_Overview_Category_Crypto", null, null, 1788, null);
                }
                C41029qjB c41029qjB = this.OLrzqt;
                c41029qjB.copydefault(c41029qjB.OLrzqt, this.EZpvd);
            }
        }
    }
}
