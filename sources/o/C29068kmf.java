package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.widget.tag.TagEventSource;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29068kmf extends ConstraintLayout {
    public final InterfaceC56387yDm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29068kmf(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:25) call: o.kmf.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C29068kmf(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29068kmf(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.kme
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29068kmf.OLrzqt(context, this);
            }
        });
    }

    private final hFC KWHzl() {
        return (hFC) this.KWHzl.getValue();
    }

    public static final hFC OLrzqt(android.content.Context context, C29068kmf c29068kmf) {
        return hFC.AEQbTJ(android.view.LayoutInflater.from(context), c29068kmf);
    }

    public final void copydefault(@NotNull final C29064kmb c29064kmb, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(c29064kmb, "");
        hFC hfcKWHzl = KWHzl();
        C21983hTo c21983hTo = hfcKWHzl.OLrzqt;
        C21983hTo.loadLargeImage$default(c21983hTo, c29064kmb.DbNXlk(), null, 2, null);
        C21983hTo.loadSmallImage$default(c21983hTo, c29064kmb.OLrzqt(), null, 2, null);
        c21983hTo.setOnClickListener(new StateListAnimator(c21983hTo, 1000L, c21983hTo, c29064kmb));
        hfcKWHzl.djBIcL.setText(c29064kmb.fetchVPNInfo());
        hfcKWHzl.gEmmrt.setText(c29064kmb.isConnected());
        KWHzl(c29064kmb.valueOf());
        LinearLayoutCompat linearLayoutCompat = hfcKWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(c29064kmb.AYXKKw().length() > 0 ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = hfcKWHzl.valueOf;
        linearLayoutCompat2.setOnClickListener(new Application(linearLayoutCompat2, 1000L, this, c29064kmb));
        hfcKWHzl.DbNXlk.setText(c29064kmb.AYXKKw());
        android.widget.ImageView imageView = hfcKWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C25386ivj.loadCircleImage$default(imageView, c29064kmb.copydefault(), false, 2, null);
        kNE kne = hfcKWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(kne, "");
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.util.List<TagWrapper> listGEmmrt = c29064kmb.gEmmrt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listGEmmrt) {
            TagWrapper tagWrapper = (TagWrapper) obj;
            if (Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "duringEvent") || Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "launchpool")) {
                arrayList.add(obj);
            }
        }
        kNA.KWHzl(kne, context, arrayList, TagEventSource.TOKEN_DETAIL, new Function0() { // from class: o.kmd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29068kmf.AEQbTJ(c29064kmb, str);
            }
        });
    }

    public static final Unit AEQbTJ(C29064kmb c29064kmb, java.lang.String str) {
        C21847hOn.trackDexMarketTokenPageClick$default(c29064kmb.AhwBna(), c29064kmb.fetchVPNInfo(), c29064kmb.EZpvd(), c29064kmb.KWHzl(), CoinDetailTabType.INFO, "app_web3", null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, c29064kmb.values(), 1966016, null);
        return Unit.INSTANCE;
    }

    private final void KWHzl(java.lang.String str) {
        java.lang.String simpleDateTime$default;
        if (str.length() == 0) {
            KWHzl().EZpvd.setVisibility(8);
            return;
        }
        long jValueOf = C33129mqd.valueOf(str);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        C55251xgS c55251xgS = KWHzl().EZpvd;
        if (jCurrentTimeMillis - jValueOf < CalendarModelKt.MillisecondsIn24Hours) {
            simpleDateTime$default = OLrzqt(str);
        } else {
            simpleDateTime$default = pTA.formatSimpleDateTime$default(new Date(jValueOf), null, 1, null);
        }
        c55251xgS.setText(simpleDateTime$default);
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return C28924kju.OLrzqt.AEQbTJ(str, java.lang.System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: o.kmf$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C29068kmf EZpvd;
        public final /* synthetic */ C29064kmb KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C29068kmf c29068kmf, C29064kmb c29064kmb) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c29068kmf;
            this.KWHzl = c29064kmb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C25352ivB.KWHzl(this.EZpvd.getContext(), this.KWHzl.AEQbTJ());
            }
        }
    }

    /* JADX INFO: renamed from: o.kmf$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C29064kmb EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C21983hTo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C21983hTo c21983hTo, C29064kmb c29064kmb) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c21983hTo;
            this.EZpvd = c29064kmb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C25352ivB.openTokenLogoImageView$default(context, this.EZpvd.djBIcL(), false, 2, null);
            }
        }
    }
}
